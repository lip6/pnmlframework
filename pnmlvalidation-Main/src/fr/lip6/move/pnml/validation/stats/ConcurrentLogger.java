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
package fr.lip6.move.pnml.validation.stats;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Logger class.
 * @author lom
 */
public class ConcurrentLogger implements Runnable {
	/**
	 * log file name prefix.
	 */
	private static final String LOG_FILE = "validation";

	/**
	 * How many log files in rotation ?
	 */
	private static final int LOG_ROTATION_COUNT = 10;
	/**
	 * size limit of each log file before rotating.
	 */
	private static final int LOG_LIMIT = 1024 * 1024 * 1024;
	/**
	 * log file full path, set at initialisation.
	 */
	private static String logFileFullPath;
	/**
	 * logger namespace.
	 */
	private static final Logger LOGGER = Logger.getLogger("fr.lip6.pnml.validation");

	/**
	 * the log records queue.
	 */
	private static BlockingQueue<LogRecord> logs;
	/**
	 * log file handler.
	 */
	private Handler handler;
	/**
	 * this thread ID.
	 */
	private String myID;

	/**
	 * Constructor.
	 * @param logDir the logs directory
	 * @param logRecordsQueue the logs queues where to pick log to write down.
	 */
	public ConcurrentLogger(String logDir, BlockingQueue<LogRecord> logRecordsQueue) {

		if (logFileFullPath == null) {
			logFileFullPath = logDir + File.separator + LOG_FILE;
		}
		if (logs == null) {
			logs = logRecordsQueue;
		}
		try {
			LOGGER.setLevel(Level.FINE);

			this.handler = new FileHandler(logFileFullPath + "%u%g.log", LOG_LIMIT, LOG_ROTATION_COUNT);
			Logger.getLogger("fr.lip6.pnml.validation").addHandler(handler);

		} catch (SecurityException e) {
			LOGGER.log(Level.SEVERE, "Cannot create log file handler: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Cannot create log file handler: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * The thread main loop.
	 */
	public final void run() {
		LogRecord lr = null;
		this.myID = String.valueOf(Thread.currentThread().getId());
		LOGGER.log(Level.INFO, "Logger thread " + this.myID + ": started.");
		try {
			while (!Thread.currentThread().isInterrupted()) {
				lr = logs.take(); // blocking
				LOGGER.log(lr);
			}
		} catch (InterruptedException ie) {
			LOGGER.log(Level.SEVERE, "Logger thread got interrupted: " + ie.getMessage());
			return;
		}
	}
}
