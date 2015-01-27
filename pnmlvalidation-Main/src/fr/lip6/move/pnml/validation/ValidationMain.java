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
package fr.lip6.move.pnml.validation;

import java.io.IOException;
import java.util.List;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;
import fr.lip6.move.pnml.validation.exceptions.ExitException;
import fr.lip6.move.pnml.validation.exceptions.InternalException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileTypeException;
import fr.lip6.move.pnml.validation.exceptions.ValidationException;
import fr.lip6.move.pnml.validation.impl.CheckPnmlFileImpl;
import fr.lip6.move.pnml.validation.impl.PnmlNormalizerImpl;
import fr.lip6.move.pnml.validation.stats.CLOptions;
import fr.lip6.move.pnml.validation.stats.HTTPStatusCodes;
import fr.lip6.move.pnml.validation.stats.MessageUtility;

/**
 * Entry point for validation service.
 * 
 * @author lom
 */
public class ValidationMain {
	/**
	 * No standalone, help and server exec modes at the same time.
	 */
	private static final String NOT_AHS = "Help, standalone and server execution modes are exclusive options.";
	/**
	 * No standalone and server exec modes at the same time.
	 */
	private static final String NOT_AS = "Standalone and server execution modes are exclusive options.";
	/**
	 * No help and standalone at the same time.
	 */
	private static final String NOT_HA = "Help, and standalone execution mode are exclusive options.";
	/**
	 * No help and server at the same time.
	 */
	private static final String NOT_SH = "Help, and server execution mode are exclusive options.";
	/**
	 * Files to validate are needed.
	 */
	private static final String NO_ARG = "You must specify the paths to the files to validate."
			+ " Standalone execution mode (default).";
	/**
	 * No help and check normalization option at the same time.
	 */
	private static final String NOT_HCN = "Help, and check normalization are exclusive options.";
	/**
	 * Usage.
	 */
	private static final String USAGE = "java -jar myprogram.jar [options...] [pnmlFile1 pnmlFile2 ...]";
	/**
	 * Parser printing space width.
	 */
	private static final int PARSER_WIDTH = 80;
	/**
	 * Logger
	 */
	private static final Logger JOURNAL = LogMaster
			.getLogger(ValidationMain.class.getCanonicalName());
	
	/**
	 * The command-line parser.
	 */
	private static CmdLineParser parser;
	/**
	 * Command-line options.
	 */
	private static CLOptions cloptions;

	/**
	 * Hidden constructor.
	 */
	protected ValidationMain() {
		super();
	}

	/**
	 * @param args
	 *            arguments
	 * @throws ExitException
	 *             exits with trouble
	 */
	public static void main(String[] args) throws ExitException {
		try {
			long startTime = System.nanoTime();
			parseArgs(args);
			long endTime = System.nanoTime();
			JOURNAL.info("PNML check took " + (endTime - startTime) / 1.0e9
					+ " seconds.");
		} catch (IOException e1) {
			printHelp(e1.getCause().getMessage());
			// e1.printStackTrace();
		}
		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		loggerContext.stop();
	}

	/**
	 * Parses command-line arguments.
	 * 
	 * @param args
	 *            the command-line arguments
	 * @throws IOException
	 *             some IO problem
	 * @throws ExitException
	 *             exits with trouble
	 */
	private static void parseArgs(String[] args) throws IOException,
			ExitException {
		cloptions = new CLOptions();
		parser = new CmdLineParser(cloptions);

		try {
			parser.parseArgument(args);
			checkArgs(cloptions);

			if (cloptions.isStandAlone()) {
				if (cloptions.getArguments().isEmpty()) {
					throw new IOException(NO_ARG, new Throwable(NO_ARG));
				} else {
					JOURNAL.info("invoked standalone execution mode");
					standalone(cloptions.getArguments());
					return;
				}
			}

			if (cloptions.isServer()) {
				JOURNAL.info("invoked server execution mode");
				final String[] arguments = {
						cloptions.getTmpDir().getCanonicalPath(),
						String.valueOf(cloptions.getPort()),
						String.valueOf(cloptions.getTimeout()), 
						String.valueOf(cloptions.isCheckNormalization()),};
				ConcurrentValidationMain.main(arguments);

			}
		} catch (CmdLineException cle) {
			// printHelp(parser, cle.getMessage());
			throw new IOException(cle);
		}
	}

	/**
	 * Performs basic checks on the arguments, to figure out what the user
	 * wants.
	 * 
	 * @param cloptions
	 *            options class
	 * @throws IOException
	 *             input/output exception
	 */
	private static void checkArgs(CLOptions cloptions) throws IOException {
		// these 3 options are exclusive one of the other
		if (cloptions.isStandAlone() && cloptions.isServer()
				&& cloptions.isHelp()) {
			throw new IOException(NOT_AHS, new Throwable(NOT_AHS));
		}

		if (cloptions.isStandAlone() && cloptions.isServer()) {
			throw new IOException(NOT_AS, new Throwable(NOT_AS));
		}

		if (cloptions.isHelp() && cloptions.isStandAlone()) {
			throw new IOException(NOT_HA, new Throwable(NOT_HA));
		}

		if (cloptions.isServer() && cloptions.isHelp()) {
			throw new IOException(NOT_SH, new Throwable(NOT_SH));
		}
		
		if (cloptions.isHelp() && cloptions.isCheckNormalization()) {
			throw new IOException(NOT_HCN, new Throwable(NOT_HCN));
		}
		// Now check help
		checkHelp(cloptions);
	}

	/**
	 * Checks if the user has only asked for help.
	 * 
	 * @param cloptions
	 *            options class
	 * @throws IOException
	 *             input/output exception
	 */
	private static void checkHelp(CLOptions cloptions) throws IOException {
		if (cloptions.isHelp()) {
			printHelp("Here is the help:");
			return;
		}
	}

	/**
	 * Prints help to the user.
	 * 
	 * @param mesg
	 *            an ad hoc message.
	 */
	private static void printHelp(String mesg) {
		//parser.setUsageWidth(PARSER_WIDTH);
		System.err.println(mesg);
		System.err.println(USAGE);
		parser.printUsage(System.err);
		System.err.println();
	}

	/**
	 * Executes the standalone strategy.
	 * 
	 * @param files
	 *            the list of PNML files to validate.
	 */
	private static void standalone(List<String> files) {
		try {
			final CheckPnmlFile cpf = new CheckPnmlFileImpl();
			for (String filepath : files) {
				JOURNAL.info("importing file " + filepath);
				final String msg = cpf.checkPnmlFile(filepath);
				System.out.println(msg);
				if (cloptions.isCheckNormalization()) {
					final PnmlNormalizer pnz = new PnmlNormalizerImpl(cpf);
					System.out.println(pnz.reportParallelArcs(cpf));
				}
			}

		} catch (ValidationException e) {
			System.out.println(MessageUtility.buildMessage(
					HTTPStatusCodes.BAD_REQUEST,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			//e.printStackTrace();
		} catch (InvalidFileException e) {
			System.out.println(MessageUtility.buildMessage(
					HTTPStatusCodes.UNSUPPORTED,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			//e.printStackTrace();
		} catch (InvalidFileTypeException e) {
			System.out.println(MessageUtility.buildMessage(
					HTTPStatusCodes.UNSUPPORTED,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			//e.printStackTrace();
		} catch (InternalException e) {
			System.out.println(MessageUtility.buildMessage(
					HTTPStatusCodes.INTERNAL_SERROR,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			//e.printStackTrace();
		}
	}
}
