/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.OCLValidationFailed;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.UnhandledNetType;
import fr.lip6.move.pnml.framework.utils.exception.ValidationFailedException;
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
import fr.lip6.move.pnml.validation.util.impl.PNMLValidationUtilsImpl;

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
	private static final String NOT_HCNMZ = "Help, and check normalization issues (or direct normalization) are exclusive options.";
	/**
	 * No check normalization issues, and normalizing options at the same time.
	 */
	private static final String NOT_CNMZ = "Check normalization issues, and direct normalization are exclusive options.";
	/**
	 * No help and remove graphical info at the same time.
	 */
	private static final String NOT_HRMG = "Help, and removal of graphical information are exclusive options.";
	/**
	 * Usage.
	 */
	private static final String USAGE = "java -jar myprogram.jar [options...] [pnmlFile1 pnmlFile2 ...]";

	private static final String PNML_EXT = ".pnml";
	/**
	 * Logger
	 */
	private static final Logger JOURNAL = LogMaster.getLogger(ValidationMain.class.getCanonicalName());
	/**
	 * Version of this tool.
	 */
	private static final String VERSION = "1.1.0";

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
			JOURNAL.info("Checked by PNML DoC " + VERSION);
			JOURNAL.info("The PNML checking took " + (endTime - startTime) / 1.0e9 + " seconds.");
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
	private static void parseArgs(String[] args) throws IOException, ExitException {
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
				final String[] arguments = { cloptions.getTmpDir().getCanonicalPath(),
						String.valueOf(cloptions.getPort()), String.valueOf(cloptions.getTimeout()),
						String.valueOf(cloptions.isCheckNormalization()), };
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
		if (cloptions.isStandAlone() && cloptions.isServer() && cloptions.isHelp()) {
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

		if (cloptions.isHelp() && (cloptions.isCheckNormalization() || cloptions.isNormalize())) {
			throw new IOException(NOT_HCNMZ, new Throwable(NOT_HCNMZ));
		}
		if (cloptions.isCheckNormalization() && cloptions.isNormalize()) {
			throw new IOException(NOT_CNMZ, new Throwable(NOT_CNMZ));
		}
		
		if (cloptions.isHelp() && cloptions.isRemoveGraphInfo()) {
			throw new IOException(NOT_HRMG, new Throwable(NOT_HRMG));
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
		// parser.setUsageWidth(PARSER_WIDTH);
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
			HLAPIRootClass modifiedDoc = null;
			boolean modifiedOtherThanNormalization = false;
			for (String filepath : files) {
				JOURNAL.info("importing file " + filepath);
				final String msg = cpf.checkPnmlFile(filepath);
				System.out.println(msg);
				if (cloptions.isNormalize()) {
					final PnmlNormalizer pnz = new PnmlNormalizerImpl(cpf);
					modifiedDoc = pnz.mergeParallelArcs(cpf);
				} else if (cloptions.isCheckNormalization()) {
					final PnmlNormalizer pnz = new PnmlNormalizerImpl(cpf);
					System.out.println(pnz.reportParallelArcs(cpf));
				}
				if (cloptions.isRemoveGraphInfo()) {
					final PNMLValidationUtils pvu = new PNMLValidationUtilsImpl(cpf);
					modifiedDoc = pvu.removeGraphics(cpf);
					modifiedOtherThanNormalization = true;
				}
				try {
					if (cloptions.isNormalize()) {
						exportNormalizedDoc(modifiedDoc, filepath);
					} else if (modifiedOtherThanNormalization) {
						exportModifiedDoc(modifiedDoc, filepath);
					}
				} catch (UnhandledNetType | OCLValidationFailed | IOException | ValidationFailedException
						| BadFileFormatException | OtherException e) {
					JOURNAL.error(e.getMessage());
					e.printStackTrace();
				}
			}
		} catch (ValidationException e) {
			System.out.println(MessageUtility.buildMessage(HTTPStatusCodes.BAD_REQUEST,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			// e.printStackTrace();
		} catch (InvalidFileException e) {
			System.out.println(MessageUtility.buildMessage(HTTPStatusCodes.UNSUPPORTED,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			// e.printStackTrace();
		} catch (InvalidFileTypeException e) {
			System.out.println(MessageUtility.buildMessage(HTTPStatusCodes.UNSUPPORTED,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			// e.printStackTrace();
		} catch (InternalException e) {
			System.out.println(MessageUtility.buildMessage(HTTPStatusCodes.INTERNAL_SERROR,
					MessageUtility.getExceptionMessage(e)));
			JOURNAL.error(e.getMessage());
			// e.printStackTrace();
		}
	}

	/**
	 * Export modified PNML doc (in any way other than normalization-related
	 * tasks, e.g. removing graphical information).
	 * 
	 * @param modifiedDoc
	 *            the PNML doc resulting from the modification operation
	 * @param filepath
	 *            the path to the file of the original PNML doc
	 * @throws UnhandledNetType
	 *             PN type not supported
	 * @throws OCLValidationFailed
	 *             OCL validation failed
	 * @throws IOException
	 *             Input/Output failure
	 * @throws ValidationFailedException
	 *             something went wrong during the validation process (apart
	 *             from OCL stuff)
	 * @throws BadFileFormatException
	 *             the PNML file does not have the expected format
	 * @throws OtherException
	 *             Any other problem.
	 */
	private static void exportModifiedDoc(HLAPIRootClass modifiedDoc, String filepath) throws UnhandledNetType,
			OCLValidationFailed, IOException, ValidationFailedException, BadFileFormatException, OtherException {
		String newfilepath = filepath.substring(0, filepath.lastIndexOf(PNML_EXT)) + "-modified" + PNML_EXT;
		final PnmlExport pex = new PnmlExport();
		pex.exportObject(modifiedDoc, newfilepath);
	}

	/**
	 * <p>
	 * Exports the normalized PNML Document into a new PNML file, with
	 * <strong>-normalized</strong> appended to its original name.
	 * </p>
	 * 
	 * @param mergedDoc
	 *            the PNML doc resulting from the normalization operation
	 * @param filepath
	 *            the path to the file of the original PNML doc
	 * @throws UnhandledNetType
	 *             PN type not supported
	 * @throws OCLValidationFailed
	 *             OCL validation failed
	 * @throws IOException
	 *             Input/Output failure
	 * @throws ValidationFailedException
	 *             something went wrong during the validation process (apart
	 *             from OCL stuff)
	 * @throws BadFileFormatException
	 *             the PNML file does not have the expected format
	 * @throws OtherException
	 *             Any other problem.
	 */
	private static void exportNormalizedDoc(HLAPIRootClass normalizedDoc, String filepath) throws UnhandledNetType,
			OCLValidationFailed, IOException, ValidationFailedException, BadFileFormatException, OtherException {
		String newfilepath = filepath.substring(0, filepath.lastIndexOf(PNML_EXT)) + "-normalized" + PNML_EXT;
		final PnmlExport pex = new PnmlExport();
		pex.exportObject(normalizedDoc, newfilepath);
	}
}
