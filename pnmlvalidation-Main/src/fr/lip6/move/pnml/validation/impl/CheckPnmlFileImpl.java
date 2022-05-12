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
package fr.lip6.move.pnml.validation.impl;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


import fr.lip6.move.pnml.framework.general.PNType;
import fr.lip6.move.pnml.framework.general.PnmlImport;
import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.AssociatedPluginNotFound;
import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OCLValidationFailed;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.UnhandledNetType;
import fr.lip6.move.pnml.framework.utils.exception.ValidationFailedException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;
import fr.lip6.move.pnml.validation.CheckPnmlFile;
import fr.lip6.move.pnml.validation.ValidationMain;
import fr.lip6.move.pnml.validation.exceptions.InternalException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileTypeException;
import fr.lip6.move.pnml.validation.exceptions.ValidationException;
import fr.lip6.move.pnml.validation.stats.HTTPStatusCodes;
import fr.lip6.move.pnml.validation.stats.MessageUtility;
import fr.lip6.move.pnml.validation.stats.PnmlDocStatistics;
import fr.lip6.move.pnml.validation.stats.impl.CoreModelStats;
import fr.lip6.move.pnml.validation.stats.impl.HLPNStats;
import fr.lip6.move.pnml.validation.stats.impl.PTHLPNStats;
import fr.lip6.move.pnml.validation.stats.impl.PTStats;
import fr.lip6.move.pnml.validation.stats.impl.SNStats;

/**
 * Checks PNML file. Both standalone and server execution mode rely on this
 * class. Not final.
 * 
 * @author lom
 */
public class CheckPnmlFileImpl implements CheckPnmlFile {
	/**
	 * Message for model name.
	 */
	protected static final String MODEL_NAME = "Model name: ";
	/**
	 * Message for model type.
	 */
	protected static final String MODEL_TYPE = "Model type: ";
	/**
	 * Message for number of nets.
	 */
	protected static final String NUM_NETS = "Number of nets: ";
	/**
	 * Message for number of places.
	 */
	protected static final String NUM_PL = "Number of places: ";
	/**
	 * Message for number of transitions.
	 */
	protected static final String NUM_TR = "Number of transitions: ";
	/**
	 * Message for number of arcs.
	 */
	protected static final String NUM_ARC = "Number of arcs: ";
	/**
	 * Message for number of reference places.
	 */
	protected static final String NUM_REFPL = "Number of reference places: ";
	/**
	 * Message for number of transitions.
	 */
	protected static final String NUM_REFTR = "Number of reference transitions: ";
	/**
	 * Buffer size.
	 */
	protected static final int BUFFER_SIZE = 255;
	/**
	 * Message to send as result of this service.
	 */
	protected StringBuilder message;
	/**
	 * Petri net document root class.
	 */
	protected HLAPIRootClass imported;
	/**
	 * Petri net type.
	 */
	protected PNType myPnType;
	/**
	 * Stats.
	 */
	protected PnmlDocStatistics ptDocStat;
	/**
	 * Model repository.
	 */
	protected final ModelRepository modelRepo = ModelRepository.getInstance();
	private UUID id;

	/**
	 * Constructor. Inits a workspace in the PNML FW.
	 * 
	 * @throws ValidationException
	 *             something went wrong during init.
	 */
	public CheckPnmlFileImpl() throws ValidationException {
		try {
			this.id = UUID.randomUUID();
			initWorkspace();
		} catch (ValidationException e) {
			throw new ValidationException("Problem when setting up PNML Framework workspace :" + MessageUtility.NL
					+ e.getMessage());
		}
	}
	/**
	 * Constructor. Inits a parallel workspace behavior in the PNML FW.
	 * 
	 * @param paralleWS set to true if you want a parallel workspaces
	 * @throws ValidationException Any error occurring during the validation process
	 */
	public CheckPnmlFileImpl(boolean paralleWS) throws ValidationException {
		try {
			this.id = UUID.randomUUID();
			modelRepo.setParallelWorkspaces(true);
			initWorkspace();
		} catch (ValidationException e) {
			throw new ValidationException("Problem when setting up PNML Framework workspace :" + MessageUtility.NL
					+ e.getMessage());
		}
	}

	/**
	 * Checks a PNML document. Stats are computed after having loaded the PNML
	 * document. 
	 * <p>This methods initialises a PNML doc workspace in the PFW ModelRepository, if
	 * there is none currently open. So if you want it to destroy the current workspace before calling this method
	 * again, use the {@link #dispose()} method first.
	 * </p>
	 * 
	 * @throws InvalidFileException
	 *             document has formating errors.
	 * @throws InvalidFileTypeException
	 *             document is not of the correct type.
	 * @throws ValidationException
	 *             document is not valid
	 * @throws InternalException
	 *             some internal problem
	 * @param filePath
	 *            the path of the PNML document.
	 * @return the validation message.
	 */
	public final String checkPnmlFile(String filePath) throws InvalidFileException, InvalidFileTypeException,
			ValidationException, InternalException {
		initWorkspace();
		resetMessage();
		message = new StringBuilder(BUFFER_SIZE);
		try {

			final File pFile = new File(filePath);
			if (!pFile.exists()) {
				throw new InvalidFileException("File " + pFile.getName() + " does not exist.", new Throwable("File "
						+ pFile.getName() + " does not exist."));
			}
			// check if regular file or directory
			if (!pFile.isFile()) {
				throw new InvalidFileTypeException(pFile.getName() + " is not a regular file.", new Throwable(
						pFile.getName() + " is not a regular file."));
			}
			if (!pFile.canRead()) {
				throw new InvalidFileException("Cannot read file " + pFile.getName(), new Throwable("Cannot read file "
						+ pFile.getName()));
			}

			importPnmlFile(pFile);
			setUpStats();
			if (ptDocStat != null) {
				writeConformanceMessage();
				writeStatsMessage();
			} else {
				writeUnknowPNMessage();
			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			throw new InternalException("Null pointer exception", new Throwable(
					"Something went wrong. Please, re-submit."));
		} catch (SecurityException se) {
			throw new InternalException(se.getMessage(), new Throwable(
					"Access right problem while accessing the file system. Please, re-submit."));
		}
		return message.toString();
	}

	private void writeUnknowPNMessage() {
		message.append(HTTPStatusCodes.NOT_FOUND.getStatusCode() + MessageUtility.NL);
		message.append(MessageUtility.MSG
				+ "Your PNML Document contains Petri Net(s) unknown to the standard specifications."
				+ MessageUtility.NL);
		message.append(
				"None of P/T Net, Symmetric Net, High-level Petri Net or P/T in high-level notation could be determined.")
				.append(MessageUtility.NL);
		message.append(MODEL_NAME + getModelName() + MessageUtility.NL);
	}

	/**
	 * Writes stats message.
	 */
	private void writeStatsMessage() {
		// message.append("Statistics about your PNML document: \n");
		message.append(NUM_NETS + getNumOfNets() + MessageUtility.NL);
		message.append(NUM_PL + getNumOfPlaces() + MessageUtility.NL);
		message.append(NUM_TR + getNumOfTransitions() + MessageUtility.NL);
		message.append(NUM_ARC + getNumOfArcs() + MessageUtility.NL);
		message.append(NUM_REFPL + getNumOfRefPlaces() + MessageUtility.NL);
		message.append(NUM_REFTR + getNumOfRefTransitions() + MessageUtility.NL);
	}

	/**
	 * Writes conformance message in case the validation was ok.
	 */
	protected final void writeConformanceMessage() {
		message.append(HTTPStatusCodes.OK.getStatusCode() + MessageUtility.NL);
		message.append(MessageUtility.MSG + "Your PNML document conforms to the standard specifications."
				+ MessageUtility.NL);
		message.append(MODEL_NAME + getModelName() + MessageUtility.NL);
		message.append(MODEL_TYPE);
		if (myPnType == PNType.COREMODEL) {
			message.append("PNML Core Model");
		} else if (myPnType == PNType.PTNET) {
			message.append("Place/Transition Net.");
		} else if (myPnType == PNType.SYMNET) {
			message.append("Symmetric Net");
		} else if (myPnType == PNType.HLPN) {
			message.append("High-level Petri Net");
		} else if (myPnType == PNType.PTHLPN) {
			message.append("P/T Net in High-level notation");
		} else {
			message.append("Unknown Petri Net Type (not standardized)");
		}
		message.append(MessageUtility.NL);
	}

	/**
	 * Inits the PFW workspace in which the imported document will be hold.
	 * Uses the current thread Id as the workspace name.
	 * 
	 * @throws ValidationException
	 *             something went wrong during validation.
	 * @see #dispose()
	 */
	protected final void initWorkspace() throws ValidationException {
		try {
			String threadId = String.valueOf(Thread.currentThread().getId());
			if (!threadId.equals(modelRepo.getCurrentDocWSId())) {
				modelRepo.createDocumentWorkspace(threadId);
			}
		} catch (InvalidIDException e1) {
			e1.printStackTrace();
			throw new ValidationException(e1.getMessage());
		}
	}

	/**
	 * Imports PNML document using PNML Framework.
	 * 
	 * @param file
	 *            the PNML file
	 * @throws ValidationException
	 *             something went wrong during validation.
	 * @throws InvalidFileException
	 *             invalid file
	 * @throws InvalidFileTypeException
	 *             file type is wrong
	 */
	private void importPnmlFile(File file) throws ValidationException, InvalidFileException, InvalidFileTypeException {

		try {

			final PnmlImport pim = new PnmlImport();
			pim.setFallUse(false);
			pim.enableOclChecking();
			this.imported = (HLAPIRootClass) pim.importFile(file.getCanonicalPath());
			determineNetType();

		} catch (IOException ioe) {
			throw new InvalidFileException(ioe.getMessage(), ioe.getCause());
		} catch (BadFileFormatException bffe) {
			throw new InvalidFileTypeException(bffe.getMessage(), bffe.getCause());
		} catch (UnhandledNetType unte) {
			throw new ValidationException(unte.getMessage(), unte.getCause());
		} catch (ValidationFailedException vfe) {
			throw new ValidationException(vfe.getMessage(), vfe.getCause());
		} catch (InnerBuildException ibe) {
			throw new ValidationException(ibe.getMessage(), ibe.getCause());
		} catch (OCLValidationFailed oclve) {
			throw new ValidationException(oclve.getMessage(), oclve.getCause());
		} catch (OtherException oe) {
			throw new ValidationException(oe.getMessage(), oe.getCause());
		} catch (AssociatedPluginNotFound apnfe) {
			throw new ValidationException(apnfe.getMessage(), apnfe.getCause());
		} catch (InvalidIDException iie) {
			throw new ValidationException(iie.getMessage(), iie.getCause());
		} catch (VoidRepositoryException vre) {
			throw new ValidationException(vre.getMessage(), vre.getCause());
		} catch (Exception e) {
			ValidationMain.printStackTrace(e);
			throw new ValidationException(e.getMessage(), e.getCause());
		}

	}

	/**
	 * Determines the net type that was imported by PNML Framework. For
	 * PT-HLPNG, default is HLPN, until they are effectively supported.
	 */
	protected final void determineNetType() {

		if (this.imported.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI.class)) {
			myPnType = PNType.COREMODEL;
		} else if (this.imported.getClass().equals(fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI.class)) {
			myPnType = PNType.PTNET;
		} else if (this.imported.getClass().equals(
				fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI.class)) {
			myPnType = PNType.SYMNET;
		} else if (this.imported.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetDocHLAPI.class)) {
			myPnType = PNType.HLPN;
		} else if (this.imported.getClass().equals(
				fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetDocHLAPI.class)) {
			myPnType = PNType.PTHLPN;
		} else {
			myPnType = null;
		}

	}

	/**
	 * Returns number of arcs in the PNML document.
	 * 
	 * @return the number of arcs
	 */
	public final int getNumOfArcs() {
		int result = -1;
		if (ptDocStat != null) {
			result = ptDocStat.getNumOfArcs();
		}
		return result;
	}

	/**
	 * Returns number of nets in the PNML document.
	 * 
	 * @return the number of nets
	 */
	public final int getNumOfNets() {
		int result = -1;
		if (ptDocStat != null) {
			result = ptDocStat.getNumOfNets();
		}
		return result;
	}

	/**
	 * Returns number of places in the PNML document.
	 * 
	 * @return the number of places
	 */
	public final int getNumOfPlaces() {
		int result = -1;
		if (ptDocStat != null) {
			result = ptDocStat.getNumOfPlaces();
		}
		return result;
	}

	/**
	 * Returns the number of transitions.
	 * 
	 * @return the number of transitions.
	 */
	public final int getNumOfTransitions() {
		int result = -1;
		if (ptDocStat != null) {
			result = ptDocStat.getNumOfTransitions();
		}
		return result;
	}

	/**
	 * Returns number of ref places in the PNML document.
	 * 
	 * @return the number of ref places
	 */
	public final int getNumOfRefPlaces() {
		int result = -1;
		if (ptDocStat != null) {
			result = ptDocStat.getNumOfRefPlaces();
		}
		return result;
	}

	/**
	 * Returns the number of ref transitions.
	 * 
	 * @return the number of ref transitions
	 */
	public final int getNumOfRefTransitions() {
		int result = -1;
		if (ptDocStat != null) {
			result = ptDocStat.getNumOfRefTransitions();
		}
		return result;
	}

	/**
	 * Tells if the loaded PNML document is a Core Model document.
	 * 
	 * @return true if so
	 */
	public final boolean isCoreModelDocument() {
		return this.myPnType == PNType.COREMODEL;
	}

	/**
	 * Tells if the loaded PNML document is a HLPN document.
	 * 
	 * @return true if so
	 */
	public final boolean isHLPNDocument() {
		return this.myPnType == PNType.HLPN;
	}

	/**
	 * {@inheritDoc} Tells if the loaded PNML document is a HLPNG net document.
	 * Not yet supported.
	 * 
	 * @return true if so
	 */
	public final boolean isPTHLPNDocument() {
		return this.myPnType == PNType.PTHLPN;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return true if so
	 */
	public final boolean isPTNetDocument() {
		return this.myPnType == PNType.PTNET;
	}

	/**
	 * Tells if the loaded PNML document is a Symmetric net document.
	 * 
	 * @return true if it is a Symmetric net document.
	 */
	public final boolean isSymNetDocument() {
		return this.myPnType == PNType.SYMNET;
	}

	/**
	 * Resets the message buffer.
	 */
	protected final void resetMessage() {
		this.message = null;
	}

	/**
	 * Closes the PFW workspace in which this thread was working.
	 * 
	 * @throws ValidationException
	 *             something went wrong during validation
	 */
	public final void dispose() throws ValidationException {
		try {
			modelRepo.destroyCurrentWorkspace();
		} catch (VoidRepositoryException e) {
			throw new ValidationException(e.getMessage(), e.getCause());
		}
	}

	/**
	 * Returns the PetriNetDoc root class of this PNML document.
	 * 
	 * @return {@link HLAPIRootClass} the root class of this PNML document.
	 */
	public final HLAPIRootClass getPnmlDocHLAPIRootClass() {
		return this.imported;
	}

	/**
	 * Creates stats for this PNML document.
	 */
	public final void setUpStats() {
		if (this.imported != null && myPnType != null) {
			if (myPnType == PNType.PTNET) {
				ptDocStat = new PTStats(this);
			} else if (myPnType == PNType.COREMODEL) {
				ptDocStat = new CoreModelStats(this);
			} else if (myPnType == PNType.SYMNET) {
				ptDocStat = new SNStats(this);
			} else if (myPnType == PNType.HLPN) {
				ptDocStat = new HLPNStats(this);
			} else if (myPnType == PNType.PTHLPN) {
				ptDocStat = new PTHLPNStats(this);
			} else {
				// Unknown
				ptDocStat = null;
			}
		}

	}
	
	/**
	 * {@inheritDoc}
	 */
	public PnmlDocStatistics getStatsOnCurrentPnDoc() {
		return ptDocStat;
	}

	/**
	 * Loads PNML document root class from the checker thread. <strong>This
	 * method is not implemented in this class.</strong> Stats classes has this
	 * responsibility.
	 * <p>
	 * Use {@link #checkPnmlFile(String)} and
	 * {@link #getPnmlDocHLAPIRootClass()} instead.
	 * </p>
	 * 
	 * @param pnmlDoc
	 *            PNML document
	 * @param cpf
	 *            document checker
	 * @see PnmlDocStatistics
	 * 
	 */
	public final void loadPnmlDoc(HLAPIRootClass pnmlDoc, CheckPnmlFile cpf) {
		// Do nothing. Specific stats classes will implement this.
	}

	/**
	 * Returns the name of the first model in this PNML document. Uses Stat
	 * class to do so.
	 * 
	 * @return the name of the first model in the current PNML document.
	 */
	public final String getModelName() {
		return ptDocStat != null ? ptDocStat.getModelName() : "Unknown";
	}

	@Override
	public UUID getCheckerID() {
		return this.id;
	}

	@Override
	public PetriNetDoc getPnmlDocRootClassAsCoreModel() {
		if (isCoreModelDocument())
			return (fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc) this.imported;
		else
			return null;
	}

	@Override
	public fr.lip6.move.pnml.ptnet.PetriNetDoc getPnmlDocRootClassAsPTNet() {
		if (isPTNetDocument())
			return ((fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI) this.imported).getContainedItem();
		else
			return null;
	}

	@Override
	public fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc getPnmlDocRootClassAsSymNet() {
		if (isSymNetDocument())
			return ((fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI) this.imported).getContainedItem();
		else
			return null;
	}

	@Override
	public fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc getPnmlDocRootClassAsHLPN() {
		if (isHLPNDocument())
			return ((fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetDocHLAPI) this.imported).getContainedItem();
		else
			return null;
	}

	@Override
	public fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNetDoc getPnmlDocRootClassAsPTHLPNG() {
		if (isPTHLPNDocument())
			return ((fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetDocHLAPI) this.imported).getContainedItem();
		else
			return null;
	}
}
