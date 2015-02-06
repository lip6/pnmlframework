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
package fr.lip6.move.pnml.framework.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.activation.MimetypesFileTypeMap;

import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.general.PNType;
import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.general.PnmlImport;
import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.exception.AssociatedPluginNotFound;
import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.ImportException;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InternalException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidFileException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidFileTypeException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.InvocationFailedException;
import fr.lip6.move.pnml.framework.utils.exception.OCLValidationFailed;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.UnhandledNetType;
import fr.lip6.move.pnml.framework.utils.exception.ValidationFailedException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * Set of static methods to import and export a PNML Document, create a
 * workspace and check the XML nature of a file.
 * 
 * @author lom
 * @see {@link PnmlExport}
 */
public final class PNMLUtils {

	private static final String TEXT_XML_PNML = "text/xml xml pnml XML PNML";
	private static final String PTHLPNG_PETRINETDOC_HLAPI = "fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetDocHLAPI";
	private static final String HLPN_PETRINETDOC_HLAPI = "fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetDocHLAPI";
	private static final String SYMMETRICNET_PETRINETDOC_HLAPI = "fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI";
	private static final String PTNET_PETRINETDOC_HLAPI = "fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI";
	private static final String PNMLCOREMODEL_PETRINETDOC_HLAPI = "fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI";
	private static final String DOT = ".";

	private PNMLUtils() {
		super();
	}

	/**
	 * Imports a PNML document using PNML Framework.
	 * A workspace is automatically created to hold the reference to
	 * the imported Petri Net Document. A unique id is generate for that
	 * workspace. If you want to retrieve it for later reference, use
	 * {@link ModelRepository#getCurrentDocWSId()}.
	 * 
	 * @param file
	 *            the PNML file
	 * @param fallback
	 *            shall the fallback mechanism of PNML Framework used? (i.e.
	 *            fall back to a compatible standardized type if the discovered
	 *            one is unknown, in a best effort strategy).
	 * @return the root class of the loaded Petri net Document, which must be an
	 *         instance of PetriNetDoc (whatever the Petri net type).
	 * @throws InvalidIDException
	 *             invalid id for the document workspace
	 * @throws ImportException
	 *             some errors occurred during the import process
	 */
	public static final HLAPIRootClass importPnmlDocument(File file,
			boolean fallback) throws ImportException, InvalidIDException {

		try {

			final PnmlImport pim = new PnmlImport();
			pim.setFallUse(fallback);
			HLAPIRootClass imported = (HLAPIRootClass) pim.importFile(file
					.getCanonicalPath());
			return imported;

		} catch (IOException ioe) {
			throw new InvalidIDException(ioe.getMessage(), ioe.getCause());
		} catch (BadFileFormatException bffe) {
			throw new InvalidIDException(bffe.getMessage(), bffe.getCause());
		} catch (UnhandledNetType unte) {
			throw new ImportException(unte.getMessage(), unte.getCause());
		} catch (ValidationFailedException vfe) {
			throw new ImportException(vfe.getMessage(), vfe.getCause());
		} catch (InnerBuildException ibe) {
			throw new ImportException(ibe.getMessage(), ibe.getCause());
		} catch (OCLValidationFailed oclve) {
			throw new ImportException(oclve.getMessage(), oclve.getCause());
		} catch (OtherException oe) {
			throw new ImportException(oe.getMessage(), oe.getCause());
		} catch (AssociatedPluginNotFound apnfe) {
			throw new ImportException(apnfe.getMessage(), apnfe.getCause());
		} catch (InvalidIDException iie) {
			throw new ImportException(iie.getMessage(), iie.getCause());
		} catch (VoidRepositoryException vre) {
			throw new ImportException(vre.getMessage(), vre.getCause());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ImportException(e.getMessage(), e.getCause());
		}

	}

	/**
	 * Determines the imported Petri Net Document type (a type of
	 * PetriNetDocHLAPI from one of the PN type libraries).
	 * 
	 * @param imported
	 *            the root class of the imported Petri Net Document
	 * @return the PNType of the imported Petri Net Document
	 */
	public static final PNType determinePNType(HLAPIRootClass imported) {
		PNType myPnType;
		if (PNMLCOREMODEL_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName())) {
			myPnType = PNType.COREMODEL;
		} else if (PTNET_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName())) {
			myPnType = PNType.PTNET;
		} else if (SYMMETRICNET_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName())) {
			myPnType = PNType.SYMNET;
		} else if (HLPN_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName())) {
			myPnType = PNType.HLPN;
		} else if (PTHLPNG_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName())) {
			myPnType = PNType.PTHLPN;
		} else {
			myPnType = null;
		}
		return myPnType;
	}

	/**
	 * Determine if the imported Petri Net Document type (a type of
	 * PetriNetDocHLAPI from one of the PN type libraries) is Core Model.
	 * 
	 * @param imported
	 *            the root class of the imported Petri Net Document
	 * @return true if it is a Core Model, false otherwise
	 */
	public static final boolean isCoreModelDocument(HLAPIRootClass imported) {
		return PNMLCOREMODEL_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName());
	}

	/**
	 * Determine if the imported Petri Net Document type (a type of
	 * PetriNetDocHLAPI from one of the PN type libraries) is Place/Transition
	 * Net.
	 * 
	 * @param imported
	 *            the root class of the imported Petri Net Document
	 * @return true if it is a P/T Net, false otherwise
	 */
	public static final boolean isPTNetDocument(HLAPIRootClass imported) {
		return PTNET_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName());
	}

	/**
	 * Determine if the imported Petri Net Document type (a type of
	 * PetriNetDocHLAPI from one of the PN type libraries) is P/T Net in
	 * high-level notation (P/T as HLPN Graph).
	 * 
	 * @param imported
	 *            the root class of the imported Petri Net Document
	 * @return true if it is a P/T in high-level notation, false otherwise
	 */
	public static final boolean isPTHLPNDocument(HLAPIRootClass imported) {
		return PTHLPNG_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName());
	}

	/**
	 * Determine if the imported Petri Net Document type (a type of
	 * PetriNetDocHLAPI from one of the PN type libraries) is High-level Petri
	 * Net.
	 * 
	 * @param imported
	 *            the root class of the imported Petri Net Document
	 * @return true if it is a High-level Petri Net, false otherwise
	 */
	public static final boolean isHLPNDocument(HLAPIRootClass imported) {
		return HLPN_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName());
	}

	/**
	 * Determine if the imported Petri Net Document type (a type of
	 * PetriNetDocHLAPI from one of the PN type libraries) is Symmetric Net.
	 * 
	 * @param imported
	 *            the root class of the imported Petri Net Document
	 * @return true if it is a Symmetric Net, false otherwise
	 */
	public static final boolean isSymNetDocument(HLAPIRootClass imported) {
		return SYMMETRICNET_PETRINETDOC_HLAPI
				.equalsIgnoreCase(imported.getClass().getCanonicalName());
	}

	/**
	 * Creates a PNML file and store in that file the contents from a
	 * PetriNetDocHLAPI object. The pretty printing is used accordingly to the
	 * {@link ModelRepository} pretty printing status (default is true).
	 * 
	 * <p>
	 * This is the recommended method to use to export your PetriNetDoc
	 * in a PNML file.
	 * </p>
	 * 
	 * @param object
	 * @param filepath
	 * @return the (generated) id of the workspace used to store your
	 *         PetriNetDoc in the {@link ModelRepository} (in memory) before the
	 *         export, so that you can continue using it for later reference in
	 *         your program. It you have imported the same Petri Net and modified
	 *         it in memory, you will get a different ID. So the originally imported 
	 *         ID will be different from this one.
	 * @throws UnhandledNetType
	 * @throws OCLValidationFailed
	 * @throws IOException
	 * @throws ValidationFailedException
	 * @throws BadFileFormatException
	 * @throws OtherException
	 * @throws InvalidIDException
	 * @see {@link #exportPetriNetDocToPNML(EObject, String)}
	 */
	public static final String exportPetriNetDocToPNML(HLAPIRootClass object,
			String filepath) throws UnhandledNetType, OCLValidationFailed,
			IOException, ValidationFailedException, BadFileFormatException,
			OtherException, InvalidIDException {
		ModelRepository mr = ModelRepository.getInstance();
		final Random r = new Random(new Date().getTime());
		final String wksId = object.getClass().getCanonicalName() + DOT
				+ r.nextLong();
		mr.createDocumentWorkspace(wksId, object);
		mr.setPrettyPrintStatus(true);
		PnmlExport pex = new PnmlExport();
		pex.exportObject((HLAPIClass) object, filepath);
		pex = null;
		return wksId;
	}

	/**
	 * Same as {@link #exportPetriNetDocToPNML(HLAPIRootClass, String)}, but
	 * this time with the PetriNetDoc type as an EMF's EObject (native).
	 * 
	 * @param object
	 * @param filepath
	 * @return the (generated) id of the workspace used to store your
	 *         PetriNetDoc in the {@link ModelRepository} (in memory) before the
	 *         export, so that you can continue using it for later reference in
	 *         your program.
	 * @throws UnhandledNetType
	 * @throws OCLValidationFailed
	 * @throws IOException
	 * @throws ValidationFailedException
	 * @throws BadFileFormatException
	 * @throws OtherException
	 * @throws InvalidIDException
	 * @throws InvocationFailedException
	 */
	public static final String exportPetriNetDocToPNML(EObject object,
			String filepath) throws UnhandledNetType, OCLValidationFailed,
			IOException, ValidationFailedException, BadFileFormatException,
			OtherException, InvalidIDException, InvocationFailedException {

		ModelRepository mr = ModelRepository.getInstance();
		final Random r = new Random(new Date().getTime());
		final String wksId = object.getClass().getCanonicalName() + DOT
				+ r.nextLong();
		mr.createDocumentWorkspace(wksId, object);
		mr.setPrettyPrintStatus(true);
		PnmlExport pex = new PnmlExport();
		pex.exportObject(object, filepath);
		pex = null;
		return wksId;
	}

	/**
	 * Creates a new model (PetriNetDoc) workspace in PNML Framework
	 * {@link ModelRepository}, with no PetriNetDoc associated (as
	 * {@link HLAPIRootClass}). This workspace becomes the current one, if
	 * <em>parallel</em> property is not set on the {@link ModelRepository}
	 * instance.
	 * 
	 * @return the provided workspace id, to indicate that it was successfully
	 *         created.
	 * @throws InvalidIDException
	 *             something went wrong during workspace creation.
	 */
	public static final String createDocumentWorkspace(String workspaceId)
			throws InvalidIDException {
		return ModelRepository.getInstance().createDocumentWorkspace(
				workspaceId);
	}

	/**
	 * Creates a new model (PetriNetDoc) workspace in PNML Framework
	 * {@link ModelRepository}, with a PetriNetDoc associated, as
	 * {@link HLAPIRootClass}.
	 * <p>
	 * This model (and its workspace) becomes the current active one in the
	 * model repository, if <em>parallel</em> property is not set on the
	 * {@link ModelRepository} instance.
	 * </p>
	 * 
	 * @param workspaceId
	 *            user-provided workspace id
	 * @param petriNetDoc
	 *            the root PetriNetDoc class, encapsulated in its corresponding
	 *            high-level PetriNetDocHLAPI class.
	 * @return the user-provided workspace id
	 * @throws InvalidIDException
	 */
	public static final String createDocumentWorkspace(String workspaceId,
			HLAPIRootClass petriNetDoc) throws InvalidIDException {

		return ModelRepository.getInstance().createDocumentWorkspace(
				workspaceId, petriNetDoc);
	}

	/**
	 * Same as {@link #createDocumentWorkspace(String, HLAPIRootClass)}, but
	 * this time with the root PetriNetDoc object typed as an EMF's EObject
	 * (native).
	 * 
	 * @param workspaceId
	 * @param petriNetDoc
	 * @throws InvalidIDException
	 */
	public static final void createDocumentWorkspace(String workspaceId,
			EObject petriNetDoc) throws InvalidIDException {
		ModelRepository.getInstance().createDocumentWorkspace(workspaceId,
				petriNetDoc);
	}

	/**
	 * <p>
	 * Checks the basic external expected characteristics of a PNML document
	 * (i.e. regular XML file). It does not return any boolean, because all
	 * kinds of handled errors will be output via the exceptions.
	 * </p>
	 * <p>
	 * If you program continues after this invocation, then it means that every
	 * check went fine.
	 * </p>
	 * 
	 * @throws InvalidFileException
	 *             document has formating errors or is not a regular file.
	 * @throws InvalidFileTypeException
	 *             document is not of the correct expected type (XML)
	 * @throws InternalException
	 *             some internal problem
	 * @param filePath
	 *            the path of the PNML document.
	 * @return the validation message.
	 */
	public static final void checkIsPnmlFile(File pFile)
			throws InvalidFileTypeException, InvalidFileException,
			InternalException {
		// boolean result = true;
		try {

			if (!pFile.exists()) {
				String message = "File " + pFile.getName() + " does not exist.";
				throw new InternalException(message, new Throwable(message));
			}
			// check if regular file or directory
			if (!pFile.isFile()) {
				String message = pFile.getName() + " is not a regular file.";
				throw new InvalidFileException(message, new Throwable(message));
			}
			if (!pFile.canRead()) {
				String message = "Cannot read file " + pFile.getName();
				throw new InternalException(message, new Throwable(message));
			}
			final MimetypesFileTypeMap ftm = new MimetypesFileTypeMap();
			ftm.addMimeTypes(TEXT_XML_PNML);
			final String contentType = ftm.getContentType(pFile);
			if (!contentType.contains("text/xml")) {
				String message = pFile.getName() + " is not an XML file: "
						+ contentType;
				throw new InvalidFileTypeException(message, new Throwable(
						message));
			}
		} catch (NullPointerException npe) {// FIXME: Bad practice! update!
			npe.printStackTrace();
			throw new InternalException("Null pointer exception",
					new Throwable("Something went wrong. Please, re-submit."));
		} catch (SecurityException se) {
			throw new InternalException(
					se.getMessage(),
					new Throwable(
							"Access right problem while accessing the file system. Please, re-submit."));
		}
		// return result;
	}
}
