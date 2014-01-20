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
public class CLOptions {
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
	 * Is standalone explicitly set by the user ?
	 */
	private boolean stalSet;
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
	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
	@Option(name = "-t", aliases = { "--timeout" }, usage = "The delay (in sec) not to be exceeded, for each conversion task.\n" + "Default is "
			+ DEFAULT_TIMEOUT)
	private void setTimeout(int t) {
		timeout = t;
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
