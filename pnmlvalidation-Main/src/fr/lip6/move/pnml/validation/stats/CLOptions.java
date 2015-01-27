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
import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

/**
 * Command line options I am expecting, so that I can implement a strategy
 * between the command-line execution mode and the server one.
 * @author lom
 */
public final class CLOptions {
	/**
	 * Default port.
	 */
	private static final int PORT = 10002;
	/**
	 * Default delay for tasks, in sec.
	 */
	private static final int DEFAULT_TIMEOUT = 20;
	/**
	 * Default temp folder.
	 */
	private static final String TMP_DIR_PATH = "pnmlvalidatortmp";

	/**
	 * Standalone execution mode.
	 */
	private boolean stal = true;
	/**
	 * Server execution mode.
	 */
	private boolean serv;
	/**
	 * Help option.
	 */
	private boolean help;
	/**
	 * Is standalone explicitly set by the user?
	 */
	private boolean stalSet;
	/**
	 * Is normalization issues checking asked for?
	 */
	private boolean cnSet = false;
	/**
	 * Is normalization asked for?
	 */
	private boolean nmzSet = false;
	/**
	 * User-defined delay for tasks.
	 */
	private int timeout = DEFAULT_TIMEOUT;

	/**
	 * Other arguments than options.
	 */
	@Argument
	private List<String> arguments = new ArrayList<String>();

	/**
	 * Temp folder option.
	 */
	@Option(name = "-tmp", aliases = { "--tmpdir" }, metaVar = "TMPDIR", required = false, usage = "Specify temporary directory, where the server will work.\n"
			+ "This directory will be created, if necessary and sufficient access rights to the file system.\n"
			+ "Logs will be located in its sub-folder logs.\nDefault temp directory is " + TMP_DIR_PATH)
	private File tmpD = new File(TMP_DIR_PATH);

	/**
	 * Port option.
	 */
	@Option(name = "-p", aliases = { "--port" }, metaVar = "PORT", required = false, usage = "The port where the server will listen "
			+ "for incoming connections (server execution mode).\nDefault port is " + PORT)
	private int port = PORT;

	/**
	 * Help option processing.
	 * @param h the help option.
	 */
	@Option(name = "-h", aliases = { "--help" }, usage = "Prints this help")
	private void setHelp(boolean h) {
		help = h;
		if (!stalSet) {
			stal = false;
		}
	}

	/**
	 * Is help solicited ?
	 * @return true if so.
	 */
	public final boolean isHelp() {
		return help;
	}

	/**
	 * Return temp dir location.
	 * @return temp dir location.
	 */
	public final File getTmpDir() {
		return tmpD;
	}

	/**
	 * Returns the port number.
	 * @return the port number
	 */
	public final int getPort() {
		return port;
	}

	/**
	 * Instantiates standalone execution mode.
	 * @param a the standalone exec mode set to a.
	 */
	@Option(name = "-a", aliases = { "--stand-alone" }, usage = "Instantiates the standalone execution mode (default)."
			+ "In this case, you must provide paths to files to validate.")
	private void setStal(boolean a) {
		stal = a;
		stalSet = true;
	}

	/**
	 * Is standalone execution mode solicited?
	 * @return true if so.
	 */
	public final boolean isStandAlone() {
		return stal;
	}

	/**
	 * Instantiates server execution mode.
	 * @param s the server exec mode is set to s.
	 */
	@Option(name = "-s", aliases = { "--server" }, usage = "Instantiates the server execution mode\n" + "Disables the stand alone execution mode.")
	private void disableStandAlone(boolean s) {
		stal = false;
		serv = s;
	}

	/**
	 * Is server execution mode solicited?
	 * @return true is so
	 */
	public final boolean isServer() {
		return serv;
	}

	/**
	 * Tasks delay set by the user (in sec). Default is 20 sec.
	 * @param t the delay
	 */
	@Option(name = "-t", aliases = { "--timeout" }, usage = "The delay (in sec) not to be exceeded, for each conversion task.\n" + "Default is "
			+ DEFAULT_TIMEOUT)
	private void setTimeout(int t) {
		timeout = t;
	}
	
	/**
	 * Check and report normalization issues.
	 */
	@Option(name = "-cn", aliases = { "--checknorm" }, required = false, usage = "Checks and report normalization issues.\n"
			+ "This option is run after a classic check of the PNML file. It is supported in standalone and server modes.")
	private void setCheckNormalization(boolean c) {
		cnSet = true;
	}
	
	/**
	 * Tells whether the user has requested to check for normalization issues.
	 * @return true is so, false otherwise
	 */
	public final boolean isCheckNormalization() {
		return cnSet;
	}
	
	/**
	 * Option to normalize the PNML Document.
	 */
	@Option(name = "-nmz", aliases = { "--normalize" }, required = false, usage = "Normalize the PNML Document (e.g. merge parallel arcs).\n"
			+ "This option is run after a classic check of the PNML file. It is supported in standalone mode only.\n"
			+ "This option is in mutual exclusion with the --checknorm option, since it reports the normalization issues it fixed.")
	private void setNormalize(boolean n) {
		nmzSet = true;
	}
	
	/**
	 * Tells whether the user has requested to normalize the PNML Document.
	 * @return true is so, false otherwise
	 */
	public final boolean isNormalize() {
		return nmzSet;
	}

	/**
	 * Returns the delay for the tasks.
	 * @return the delay
	 */
	public final int getTimeout() {
		return timeout;
	}

	/**
	 * List of arguments other that options.
	 * @return list of arguments.
	 */
	public final List<String> getArguments() {
		return arguments;
	}

}
