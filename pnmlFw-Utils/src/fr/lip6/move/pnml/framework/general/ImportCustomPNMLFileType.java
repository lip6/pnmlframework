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
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.slf4j.Logger;

import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;

/**
 * This repository is designed to contain imported custom file types from an
 * external file.
 *
 * @author Guillaume Giffo
 *
 */
public class ImportCustomPNMLFileType implements PNMLFileRepository { // NOPMD
    // by
    // ggiffo
    // on
    // 7/11/08
    // 3:07
    // PM

    /**
     *
     */
    public static final int NBFIELD = 4;

    /**
     * The logger.
     */
    private final Logger log; // NOPMD by ggiffo on 6/27/08 4:46 PM

    /**
     * The array with all found officialPNMLfiles.
     */
    private final List<CustomPNMLFileType> oPNML;

    /**
     *
     * @param filePath
     *            the path to the custom types definitions.
     * @throws IOException
     *             if a problem occur while reading the file.
     * @throws OtherException
     *             if a problem occur with xml parse classes
     * @throws BadFileFormatException
     *             if the xml file is not well formated
     */
    public ImportCustomPNMLFileType(String filePath) throws IOException, // NOPMD
            // by
            // ggiffo
            // on
            // 7/11/08
            // 3:07
            // PM
            BadFileFormatException, OtherException {
        log = LogMaster.getLogger("customTypes");
        oPNML = new ArrayList<CustomPNMLFileType>();

        String typeName;
        String nameSpace;
        String rngURL;
        String rootClass;
        String fallbackclass;
        final QName namespaceQ = new QName("namespace");
        final QName rngurlQ = new QName("rngurl");
        final QName nametype = new QName("typename");

        final OMElement root = getDocument(filePath);
        @SuppressWarnings("rawtypes")
		final Iterator iter = root.getChildrenWithLocalName("pnmlcustomtype");

        while (iter.hasNext()) {
            final OMElement element = (OMElement) iter.next();
            rootClass = "";
            fallbackclass = "";
            nameSpace = element.getAttributeValue(namespaceQ);
            rngURL = element.getAttributeValue(rngurlQ);
            typeName = element.getAttributeValue(nametype);
            if (nameSpace == null || nameSpace.equals("")) {
                throw new BadFileFormatException("missing name space");
            }

            if (typeName == null || typeName.equals("")) {
                throw new BadFileFormatException("missing type name");
            }

            @SuppressWarnings("rawtypes")
			final Iterator iter2 = element.getChildElements();
            while (iter2.hasNext()) {
                final OMElement subelement = (OMElement) iter2.next();
                if (subelement.getLocalName().equals("rootclass")) {
                    rootClass = subelement.getText().trim();
                } else if (subelement.getLocalName().equals("fallbackclass")) {
                    fallbackclass = subelement.getText().trim();
                }
            }

            final CustomPNMLFileType cst = new CustomPNMLFileType(typeName, // NOPMD
                    // by
                    // ggiffo
                    // on
                    // 7/31/08
                    // 3:23
                    // PM
                    rootClass, nameSpace, rngURL, fallbackclass);
            oPNML.add(cst);
        }
    }

    /**
     *
     * @param namespace
     *            the namespace.
     * @return The item corresponding to the name space.
     */
    public final CustomPNMLFileType getByNamespace(String namespace) {
        CustomPNMLFileType retour = null;
        for (final Iterator<CustomPNMLFileType> iterator = oPNML.iterator(); iterator
                .hasNext();) {
            final CustomPNMLFileType type = (CustomPNMLFileType) iterator
                    .next();
            if (type.getNamespace().equals(namespace)) {
                retour = type;
                break;
            }
        }
        return retour;
    }

    /**
     *
     * @param classname
     *            the class name
     * @return The item corresponding to the class space.
     */
    public final CustomPNMLFileType getByClassName(String classname) {
        CustomPNMLFileType retour = null;
        for (final Iterator<CustomPNMLFileType> iterator = oPNML.iterator(); iterator
                .hasNext();) {
            final CustomPNMLFileType type = (CustomPNMLFileType) iterator
                    .next();
            if (type.getClassName().equals(classname)) {
                retour = type;
                break;
            }
        }
        return retour;

    }

    /**
     * Gets an xml file and returns an object which is XML tree.
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

        XMLStreamReader parser = null;
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
                .getDocumentElement();
        return document;
    }
}
