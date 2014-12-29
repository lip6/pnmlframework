/**
 *  Copyright 2009 Universite Paris Ouest and Sorbonne Universites,
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

/**
 * This utility class is used for logging access and config.
 *
 * @author Guillaume Giffo
 *
 */
public final class LogMaster {
	 /**
     * The logger class.
     */
    private static String logger = "org.apache.commons.logging.impl.SLF4JLog";
    //"org.apache.commons.logging.impl.SimpleLog";
    /**
     * the level of logging.
     */
    private static String level = "info";

    
	static {
		 // set the logger class
        System.setProperty("org.apache.commons.logging.Log", logger);
        System.setProperty("org.apache.commons.logging.simplelog.defaultlog",
                level);
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime",
                "false");
        System.setProperty("org.apache.commons.logging.simplelog.showlogname",
                "true");
        System
                .setProperty(
                        "org.apache.commons.logging.simplelog.showShortLogname",
                        "true");
        System
        .setProperty(
                "org.slf4j.simpleLogger.levelInBrackets",
                "true");

        System.setProperty(
                "org.apache.commons.logging.simplelog.dateTimeFormat",
                "yyyy/MM/dd HH:mm:ss");
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
     * Set the logging level for future logger, Be careful this destroy the
     * singleton.
     *
     * @param myLevel
     *            debug, error...
     * @return the old level
     */
    public static String setLevel(String myLevel) {
        final String old = level;
        level = myLevel;
        instance = null; // NOPMD by ggiffo on 7/21/08 5:00 PM
        return old;
    }

    /**
     * Set the logging classes for future logger, Be careful this destroy the
     * singleton. May be used before any log instanciation.
     *
     * @param mylogger
     *            the class to logger
     * @return the old logger
     */
    public static String setlogger(String mylogger) {
        final String old = logger;
        logger = mylogger;
        instance = null; // NOPMD by ggiffo on 7/21/08 5:00 PM
        return old;
    }

    /**
     * Give a logger.
     *
     * @param name
     *            The logger name identification
     * @return a Logger
     * @see org.apache.commons.logging.Log
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

}
