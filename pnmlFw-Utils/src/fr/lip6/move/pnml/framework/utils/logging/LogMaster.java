/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
/**
 *
 */
package fr.lip6.move.pnml.framework.utils.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This utility class is used for logging access and config.
 * <p>
 * Logging level is set to <strong>info</strong> by default in embedded <strong>logback.xml</strong> You can
 * change that by using the following command-line property to Java:
 * <code>java -Dlogback.configurationFile=/path/to/config.xml ...</code.
 * <p>
 *
 * @author Guillaume Giffo
 * @author lom
 *
 */
public final class LogMaster {
	/**
	 * The logger class. SLF4JLog
	 */
	private static String logger = "org.apache.commons.logging.impl.SimpleLog";
	// "org.apache.commons.logging.impl.SimpleLog";
	/**
	 * the level of logging.
	 */
	private static String level = "info";

	static {
		// set the logger class
		System.setProperty("org.apache.commons.logging.Log", logger);
		System.setProperty("org.apache.commons.logging.simplelog.defaultlog", level);
		System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "false");
		System.setProperty("org.apache.commons.logging.simplelog.showlogname", "true");
		System.setProperty("org.apache.commons.logging.simplelog.showShortLogname", "true");
		System.setProperty("org.slf4j.simpleLogger.levelInBrackets", "true");

		System.setProperty("org.apache.commons.logging.simplelog.dateTimeFormat", "yyyy/MM/dd HH:mm:ss");
	}

	/**
	 * The singleton instance.
	 */
	private static LogMaster instance;

	/**
	 * Set all default values for logger, using user set ones if any.
	 */
	private LogMaster() {

	}

	/**
	 * Set the logging level for future logger, Be careful this destroys the
	 * singleton.
	 *
	 * @param myLevel
	 *            debug, error...
	 * @return the old level
	 * @deprecated
	 */
	public static String setLevel(String myLevel) {
		final String old = level;
		level = myLevel;
		System.setProperty("org.apache.commons.logging.simplelog.defaultlog", level);
		instance = null; // NOPMD by ggiffo on 7/21/08 5:00 PM
		return old;
	}

	/**
	 * Set the logging classes for future logger, Be careful this destroys the
	 * singleton. May be used before any log instanciation.
	 *
	 * @param mylogger
	 *            the class to logger
	 * @return the old logger
	 * @deprecated
	 */
	public static String setlogger(String mylogger) {
		final String old = logger;
		logger = mylogger;
		instance = null; // NOPMD by ggiffo on 7/21/08 5:00 PM
		return old;
	}

	/**
	 * Gives a logger.
	 *
	 * @param name
	 *            The logger name identification
	 * @return a Logger
	 * @see org.apache.commons.logging.Log
	 * @deprecated @see {{@link #getLogger(String)}
	 */
	public static synchronized Log giveLogger(String name) { // NOPMD by
		// ggiffo on
		// 7/21/08 5:00
		// PM
		if (instance == null) {
			instance = new LogMaster();
		}
		return LogFactory.getFactory().getInstance(name);
	}

	/**
	 * <p>Provides a logger. Logging level is set to <strong>info</strong> by default.</p>
	 * <p><code>TRACE lt DEBUG lt INFO lt WARN lt ERROR</code></p>
	 *
	 * @param name
	 *            The logger name identification
	 * @return a Logger
	 * @see org.slf4j.Logger
	 */
	public static synchronized Logger getLogger(String name) {
		return LoggerFactory.getLogger(name);
	}
}
