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
package fr.lip6.move.pnml.framework.general; // NOPMD by ggiffo on 6/27/08

// 4:47 PM

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Random;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMXMLBuilderFactory;
import org.apache.axiom.om.OMXMLParserWrapper;
import org.xml.sax.InputSource;

import com.thaiopensource.validate.ValidationDriver;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
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

/**
 * This class is used to import a PNML file.
 *
 * @author ggiffo
 *
 */
public class PnmlImport extends AbstractPnmlImportExport { // NOPMD by ggiffo
    // on
    // 6/27/08 4:47 PM

    private static final String DOT = ".";
	/**
     * If the plugin is not found, try to use "secondary" plugin?
     */
    private boolean fallbackmode;

    /**
     *
     * @param fileString
     *            the path to the optional file defining custom Petri net types
     * @throws FileNotFoundException
     *             if the file does not exists.
     */
    public PnmlImport(String fileString) throws FileNotFoundException {
        super("import", fileString);
    }

    /**
     *
     */
    public PnmlImport() {
        super("import", null);
    }

    /**
     *
     * @param use
     *            the new value
     * @return the old value
     */
    public final boolean setFallUse(boolean use) {
        final boolean old = isFallUse();
        fallbackmode = use;
        return old;
    }

    /**
     *
     * @return the state of fallback use
     */
    public final boolean isFallUse() {
        return fallbackmode;
    }

    /**
     * Imports the file in the given namespace pnml types, or in the file one if
     * forcedNamespace is null.
     *
     * @param path
     *            the imported file path.
     * @param forcedNameSpace
     *            The namespace of the import of pnml type.
     * @return a PetriNetDocHLAPI object.
     * @throws IOException
     *             if a problem occur with file.
     * @throws BadFileFormatException
     *             if the file is not formated as expected for a pnml file.
     * @throws UnhandledNetType
     *             if the net type is unknown.
     * @throws ValidationFailedException
     *             if the validation fail.
     * @throws InnerBuildException
     *             if an exception is raised while building objects.
     * @throws OCLValidationFailed
     *             if the ocl rules are not followed.
     * @throws AssociatedPluginNotFound
     *             if the net type has no associated plug-in on the classpath.
     *             If fallback mode is on is thrown if fallback plugin is not
     *             found.
     * @throws OtherException
     *             if another problem occur.
     * @throws InvalidIDException
     *             if a problem occur with an id in the imported document.
     * @throws VoidRepositoryException
     *             if the repository is void
     */
    public final HLAPIClass importFile(String path, String forcedNameSpace)// NOPMD by ggiffo on
            // 6/27/08 4:48 PM

            throws IOException, BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {

        // check pnml file type
        final OMElement document = getDocument(path);
        final String namespace;

        // check PNML file type
        namespace = (forcedNameSpace == null) ? getDocumentType(document)
                .getAttributeValue() : forcedNameSpace;

        if (forcedNameSpace != null) {
            this.disableGrammarValidation();
        }

        PNMLFileType pnmltype = null;

        // first look in custom type if any.
        if (newTypeFilePath != null) {
            pnmltype = new ImportCustomPNMLFileType(newTypeFilePath)
                    .getByNamespace(namespace);
        }

        // if not find in custom, look in official types
        if (pnmltype == null) {
            pnmltype = OfficialPNMLFileType.getByNamespace(namespace);
        }

        // if not error
        if (pnmltype == null) {
            if (log.isErrorEnabled()) {
                log.error("the net type " + namespace + " is unknown");
            }
            throw new UnhandledNetType("the net type " + namespace
                    + " is unknown");
        }

        // heart of import.
        HLAPIRootClass retour;
        try {
            retour = doWork(pnmltype.getClassName(), document, ValidationDriver
                    .uriOrFileInputSource(path), pnmltype.getRngUrl(), false);
        } catch (AssociatedPluginNotFound apnf) {
            // fallback section
            if (fallbackmode && pnmltype.getFallBackClassName() != null) {
                log.warn("The plugin as not been found, trying fallback with "
                        + pnmltype.getFallBackClassName());
                retour = doWork(pnmltype.getFallBackClassName(), document,
                        null, null, true);
            } else {
                final StringBuilder mess = new StringBuilder(apnf.getMessage());
                mess
                        .append(" and fallback plugin can't be use (not set or fallback disabled)");
                throw new AssociatedPluginNotFound(mess.toString(), apnf);
            }
        }
        return retour;
    }

    /**
     * Imports the given file with is default importer, or fallback one if
     * defined.
     *
     * @param path
     *            the imported file path.
     * @return a PetriNetDocHLAPI object.
     * @throws IOException
     *             if a problem occur with file.
     * @throws BadFileFormatException
     *             if the file is not formated as expected for a pnml file.
     * @throws UnhandledNetType
     *             if the net type is unknown.
     * @throws ValidationFailedException
     *             if the validation fail.
     * @throws InnerBuildException
     *             if an exception is raised while building objects.
     * @throws OCLValidationFailed
     *             if the ocl rules are not followed.
     * @throws AssociatedPluginNotFound
     *             if the net type has no associated plug-in on the classpath.
     *             If fallback mode is on is thrown if fallback plugin is not
     *             found.
     * @throws OtherException
     *             if another problem occur.
     * @throws InvalidIDException
     *             if a problem occur with an id in the imported document.
     * @throws VoidRepositoryException
     *             if the model repository is void
     */
    public final HLAPIClass importFile(String path) throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        return importFile(path, null);
    }

    /**
     *
     * @param className
     *            the name of the class of the returned object.
     * @param document
     *            the xml tree to import
     * @param pnmldocStream
     *            another form of the xml stream.
     * @param schemafile
     *            the url to the rng file, for validation.
     * @param usingFallBack
     *            give information about use or not off fallback mode
     * @return the HLAPICLass corresponding to the object.
     * @throws ValidationFailedException
     *             if the file is not valid
     * @throws InnerBuildException
     *             if a problem occur while building an object.
     * @throws OCLValidationFailed
     *             if one or more OCL constraint do not conform.
     * @throws OtherException
     *             another exception.
     * @throws AssociatedPluginNotFound
     *             if the associated plug-in cannot be found
     * @throws InvalidIDException
     *             if a problem occur with an id in the imported document.
     * @throws VoidRepositoryException
     *             if the id repository is void
     */
    @SuppressWarnings("unchecked")
    private HLAPIRootClass doWork(String className, OMElement document, // NOPMD
            // by
            // ggiffo on
            // 6/27/08
            // 4:48 PM
            InputSource pnmldocStream, String schemafile, Boolean usingFallBack)
            throws ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {

        // instantiating a new object
        Constructor<HLAPIClass> construct;
        HLAPIRootClass newPetriNetDoc;
        try {
            final Class<HLAPIClass> test = (Class<HLAPIClass>) Class
                    .forName(className);
            construct = test.getConstructor(new Class[] {});
            newPetriNetDoc = (HLAPIRootClass) construct
                    .newInstance(new Object[] {});
        } catch (ClassNotFoundException e) {
            throw new AssociatedPluginNotFound(
                    "The plugin associated to this net type (" + className
                            + ") can't be found", e);
        } catch (IllegalArgumentException e) {
            throw new OtherException(e);
        } catch (InstantiationException e) {
            throw new OtherException(e);
        } catch (IllegalAccessException e) {
            throw new OtherException(e);
        } catch (InvocationTargetException e) {
            throw new OtherException(e);
        } catch (SecurityException e) {
            throw new OtherException(e);
        } catch (NoSuchMethodException e) {
            throw new OtherException(e);
        }

        // if not in fallback mode, check for Validity of imported file
        if (usingFallBack) {
            if (log.isWarnEnabled()) {
                log.warn("Using fallBack plugin, rng conformance not checked");
            }
        } else {
            rngGrammarValidation(schemafile, pnmldocStream);
        }
        final Random r = new Random(new Date().getTime());
		final String wksId = newPetriNetDoc.getClass().getCanonicalName() + DOT
				+ r.nextLong();
       ModelRepository.getInstance().createDocumentWorkspace(wksId, newPetriNetDoc);
        // building objects.
        final IdRefLinker idr = new IdRefLinker();
        try {
            newPetriNetDoc.fromPNML(document, idr);
            document.close(false);
            idr.linkAll();
        } catch (InnerBuildException e) {
            log.error("An error occur in object internal building", e);
            throw new InnerBuildException(
                    "A problem occur during objects creation", e);
        } catch (VoidRepositoryException e) {
            log.error("An error occur in idref processing", e);
            throw new InnerBuildException(
                    "A problem occur during idref solving : " + e.getMessage(),
                    e);
        }

        // checking OCL constraints
        oclChecking(newPetriNetDoc);
        //ModelRepository.getInstance().setCurrentHLAPIRootClass(newPetriNetDoc);
        return newPetriNetDoc;
    }

    /**
     * Gets an xml file and returns an object which is pnml tree.
     *
     * @param path
     *            the path to the file to import
     * @return the xml tree
     * @throws FileNotFoundException
     *             if the file is not found
     * @throws BadFileFormatException
     *             if the file is not well formated
     * @throws OtherException
     *             if another kind of problem occur.
     */
    private OMElement getDocument(String path) throws FileNotFoundException,
            BadFileFormatException, OtherException {
        final File imported = new File(path);
        if (!imported.isFile() || !imported.exists()) {
            throw new FileNotFoundException(path + " is not an existing file");
        }

        /*XMLStreamReader parser;
        try {
            parser = XMLInputFactory.newInstance().createXMLStreamReader(
                    new FileReader(imported));
        } catch (XMLStreamException e) {
            log.error("this file is not a well formated PNML file", e);
            throw new BadFileFormatException(
                    "this file is not a well formated PNML file", e);
        } catch (FactoryConfigurationError e) {
            throw new OtherException(e);
        }

        final OMElement document = new StAXOMBuilder(parser)
                .getDocumentElement();*/
        
        OMElement document = null;
        try { 
        	InputStream in = new BufferedInputStream(new FileInputStream(path));
        	//create the builder
        	OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder(in);
        	//get the root element
        	document = builder.getDocumentElement();
        } catch (FileNotFoundException e) {
           throw e;
        }
        return document;
    }

    /**
     * Checks if an XMl tree is compliant with pnml root definition and returns
     * the string of pnml net type.
     *
     * @param document
     *            the xml tree
     * @return the pnml type
     * @throws BadFileFormatException
     *             if the tree is not well formated
     */
    private OMAttribute getDocumentType(OMElement document)
            throws BadFileFormatException {
        if (!(document.getLocalName().equals("pnml") && document
                .getFirstElement().getLocalName().equals("net"))) {
            log
                    .error("this file is not a well formated PNML file, <pnml> or <net> are missing");
            throw new BadFileFormatException(
                    "this file is not a well formated PNML file");
        }
        final OMAttribute doctype = document.getFirstElement().getAttribute(
                new QName("type"));
        if (doctype == null) {
            log.error("the type of this PNML file is not given");
            throw new BadFileFormatException(
                    "the type of this PNML file is not given");
        }
        return doctype;
    }

}
