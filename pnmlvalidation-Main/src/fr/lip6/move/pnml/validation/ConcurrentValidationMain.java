/**
 *  Copyright 2009 Sorbonne Universités, Université Pierre & Marie Curie - CNRS UMR 7606 (LIP6/MoVe)
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Initial contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import fr.lip6.move.pnml.validation.exceptions.ExitException;
import fr.lip6.move.pnml.validation.exceptions.ValidationException;
import fr.lip6.move.pnml.validation.impl.ConcurrentCheckPnmlFileImpl;
import fr.lip6.move.pnml.validation.stats.ConcurrentCheckTimer;
import fr.lip6.move.pnml.validation.stats.ConcurrentLogger;

/**
 * Concurrent version of PNML document checker server. Accepts port number and
 * name of main temporary folder.
 * @author lom
 */
public class ConcurrentValidationMain {

	/**
	 * Temp directory path.
	 */
	private static final String TMP_DIR_PATH = "pnmlvalidatortmp";
	/**
	 * Logs directory name.
	 */
	private static final String LOG_DIR = "logs";
	/**
	 * Log directory path.
	 */
	private static final String LOG_DIR_PATH = TMP_DIR_PATH + File.separator + LOG_DIR;
	/**
	 * port number.
	 */
	private static int port;

	/**
	 * Hidden constructor.
	 */
	protected ConcurrentValidationMain() {
		super();
	}

	/**
	 * @param args the temp directory path and port number.
	 * @throws ExitException exits with trouble
	 */
	public static void main(String[] args) throws ExitException {

		final ExecutorService pool = Executors.newCachedThreadPool();
		ServerSocket serverSocket = null;

		// File tmpDir = new File(TMP_DIR_PATH);
		// File logDir = new File(LOG_DIR_PATH);
		final File tmpDir = new File(args[0]);
		final File logDir = new File(args[0] + File.separator + LOG_DIR);
		port = Integer.valueOf(args[1]);
		try {
			if (!tmpDir.exists()) {
				tmpDir.mkdir();
				System.err.println("Created server working folder: " + tmpDir.getCanonicalPath());
			}

			if (!logDir.exists()) {
				logDir.mkdir();
				System.err.println("Created server logs folder: " + logDir.getCanonicalPath());
			}
		} catch (IOException e) {
			System.err.println("Error while creating server working or logs folder: " + e.getMessage());
			throw new ExitException(ExitException.EXIT_CODE1);
		}

		try {
			// serverSocket = new ServerSocket(PORT);
			serverSocket = new ServerSocket(port);
			System.err.println("Started Pnml Validator server. Listening on port " + port);
		} catch (IOException e) {
			System.err.println("Could not listen on port " + port + ". Exit.");
			throw new ExitException(ExitException.EXIT_CODE2);
		}
		// Set up logger
		final BlockingQueue<LogRecord> logs = new LinkedBlockingQueue<LogRecord>();
		final ConcurrentLogger cl = new ConcurrentLogger(LOG_DIR_PATH, logs);
		final Thread clThread = new Thread(cl);
		clThread.start();

		// Set up timer
		final BlockingQueue<Future<String>> fileCheckers = new LinkedBlockingQueue<Future<String>>();
		final ConcurrentCheckTimer cct = new ConcurrentCheckTimer(fileCheckers, logs, Integer.valueOf(args[2]));
		final Thread cctThread = new Thread(cct);
		cctThread.start();

		// start accepting connections
		Socket clientSocket = null;
		while (true) {
			try {
				try {
					clientSocket = serverSocket.accept();
					// ConcurrentCheckPnmlFileImpl ccpf = new
					// ConcurrentCheckPnmlFileImpl(
					// clientSocket);
					final Future<String> result = pool.submit(new ConcurrentCheckPnmlFileImpl(clientSocket, tmpDir, logs));
					fileCheckers.put(result);
				} catch (IOException ioe) {
					logs.put(new LogRecord(Level.SEVERE, "Server: Accept failed on port" + port + ": " + ioe.getMessage()));
					// System.exit(-3);
					// ioe.printStackTrace();
				} catch (ValidationException ve) {
					logs.put(new LogRecord(Level.SEVERE, "Server: Validation exception: " + ve.getMessage()));
					// ve.printStackTrace();
				} catch (InterruptedException ie) {
					logs.put(new LogRecord(Level.SEVERE, "Server: got interrupted: " + ie.getMessage()));
					// ie.printStackTrace();
				}
			} catch (InterruptedException ie) {
				System.err.println("Server: error while logging an exception: " + ie.getMessage());
				System.err.println("Server: exiting");
				throw new ExitException(ExitException.EXIT_CODE4);
				// return;
			}
		}

	}
}
