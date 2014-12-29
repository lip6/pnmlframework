/**
 *  Copyright 2009-2015 Universite Paris Ouest and Sorbonne Universites,
 * 							Univ. Paris 06 - CNRS UMR
 * 							7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    L.M. Hillah - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import fr.lip6.move.pnml.validation.exceptions.InternalException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileTypeException;
import fr.lip6.move.pnml.validation.exceptions.ValidationException;
import fr.lip6.move.pnml.validation.stats.HTTPStatusCodes;
import fr.lip6.move.pnml.validation.stats.MessageUtility;

/**
 * Thread execution mode.
 * @author lom
 */
public class ConcurrentCheckPnmlFileImpl extends CheckPnmlFileImpl implements Callable<String> {

	/**
	 * PNML file extension.
	 */
	private static final String PNML_EXT = ".pnml";
	/**
	 * Temp file prefix.
	 */
	private static final String TMP_FILE_PREFIX = "tempPnmlFile";
	/**
	 * Thread type.
	 */
	private static final String THREAD_TYPE = "Validation thread ";
	/**
	 * Working directory.
	 */
	private final File workingDir;
	/**
	 * Logs queue.
	 */
	private BlockingQueue<LogRecord> logs;

	/**
	 * Client socket.
	 */
	private Socket myClient;
	/**
	 * Thread ID.
	 */
	private String myID;

	/**
	 * Default.
	 * @throws ValidationException some problem encountered during the
	 *             transformation.
	 */
	public ConcurrentCheckPnmlFileImpl() throws ValidationException {
		super();
		this.workingDir = new File("pnmlvalidatorthread" + String.valueOf(Thread.currentThread().getId()));
		if (!this.workingDir.exists()) {
			this.workingDir.mkdir();
		}
	}

	/**
	 * Thread version.
	 * @param clientSocket the client socket
	 * @param tmpDir the temp directory
	 * @param theLogs the logs queue
	 * @throws ValidationException some problem encountered during the
	 *             validation.
	 */
	public ConcurrentCheckPnmlFileImpl(Socket clientSocket, File tmpDir, BlockingQueue<LogRecord> theLogs) throws ValidationException {
		super();
		this.myClient = clientSocket;
		this.workingDir = tmpDir;
		this.logs = theLogs;
		try {
			this.logs.put(new LogRecord(Level.INFO, "Thread " + String.valueOf(Thread.currentThread().getId()) + ": " + "Accepted client: "
					+ this.myClient.getInetAddress()));
		} catch (InterruptedException ie) {
			System.err.println("Thread " + String.valueOf(Thread.currentThread().getId()) + " got interrupted while sending" + "initialisation log to Logger.");
			ie.printStackTrace();
		}
	}

	/**
	 * The callable main method.
	 * @return the validation message.
	 * @throws Exception some exception
	 */
	public final String call() throws Exception {
		this.myID = String.valueOf(Thread.currentThread().getId());
		String result = this.myID;
		final Scanner in = new Scanner(this.myClient.getInputStream());
		final PrintWriter out = new PrintWriter(this.myClient.getOutputStream(), true); // autoflush
		final String tmpFileName = TMP_FILE_PREFIX + "Thread" + this.myID + PNML_EXT;
		final File tmpFile = new File(this.workingDir, tmpFileName);
		tmpFile.createNewFile();
		this.logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": created temp file for validation: " + tmpFile.getCanonicalPath()));
		try {
			// BufferedInputStream bis = new
			// BufferedInputStream(this.myClient.getInputStream());
			final StringBuffer clientContents = new StringBuffer(MessageUtility.MSG_MEDIUMSIZE);
			String inputLine;
			while (in.hasNextLine()) {
				inputLine = in.nextLine();
				clientContents.append(inputLine + MessageUtility.NL);
			}
			final PrintWriter tmpFilepw = new PrintWriter(new FileOutputStream(tmpFile), true);
			tmpFilepw.println(clientContents.toString());
			tmpFilepw.close();
			this.logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": Checking file..."));
			result = this.checkPnmlFile(tmpFile.getCanonicalPath());
			// System.err.println(result);
			// Thread.sleep(3000);
			out.println(result);
			out.close();
			in.close();
			// this.myClient.shutdownOutput();
			this.logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": Result sent."));

		} catch (ValidationException ve) {
			handleException(out, HTTPStatusCodes.BAD_REQUEST, ve, "", Level.SEVERE);
		} catch (InvalidFileException ife) {
			handleException(out, HTTPStatusCodes.UNSUPPORTED, ife, "", Level.SEVERE);
		} catch (InvalidFileTypeException ifte) {
			handleException(out, HTTPStatusCodes.UNSUPPORTED, ifte, "", Level.SEVERE);
		} catch (InterruptedException ie) {
			handleException(out, HTTPStatusCodes.RTIMEOUT, ie, "I got interrupted: ", Level.SEVERE);
		} catch (InternalException ie) {
			handleException(out, HTTPStatusCodes.INTERNAL_SERROR, ie, "Internal problem: ", Level.SEVERE);
		} catch (Exception e) {
			handleException(out, HTTPStatusCodes.INTERNAL_SERROR, e, "Unexpected error: ", Level.SEVERE);
		} finally {
			// out.close();
			// in.close();
			this.dispose();
			this.myClient.close();
			this.logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": client " + this.myClient.getInetAddress() + " socket closed."));
			tmpFile.delete();
			this.logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": temp file deleted."));
		}
		return result;
	}

	/**
	 * Handles exceptions encountered during this thead main loop.
	 * @param out Printwriter on socket
	 * @param code HTTP Status code
	 * @param e the exception
	 * @param logMessage some log message
	 * @param logLevel log error level
	 */
	private void handleException(PrintWriter out, HTTPStatusCodes code, Exception e, String logMessage, Level logLevel) {
		try {
			out.println(MessageUtility.buildMessage(code, MessageUtility.getExceptionMessage(e)));
			this.logs.put(new LogRecord(logLevel, THREAD_TYPE + this.myID + ": " + logMessage
					+ MessageUtility.buildMessage(code, MessageUtility.getExceptionMessage(e))));
			e.printStackTrace();
		} catch (InterruptedException e1) {
			// Exception due to log writing
			e1.printStackTrace();
		}
	}
}
