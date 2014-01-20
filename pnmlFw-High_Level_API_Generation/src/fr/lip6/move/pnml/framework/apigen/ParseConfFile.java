package fr.lip6.move.pnml.framework.apigen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNode;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.commons.logging.Log;

import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;

/**
 *
 * @author Guillaume Giffo
 *
 */
public class ParseConfFile {

    /**
     * The config file.
     */
    private String confFile;

    /**
     * The logger.
     */
    private final Log log; // NOPMD by ggiffo on 7/4/08 11:03 AM

    /**
     *
     * @param myConfFilePath
     *            the path to the config file
     */
    public ParseConfFile(final String myConfFilePath) {
        log = LogMaster.giveLogger("file parse");
        confFile = myConfFilePath;
    }

    /**
     *
     * @return a list of couple file/source folders paths
     * @throws OtherException .
     * @throws BadFileFormatException .
     * @throws FileNotFoundException .
     */
    @SuppressWarnings("rawtypes")
	public final List<GenerationConfigUnit> getPathSet()
            throws FileNotFoundException, BadFileFormatException,
            OtherException {
        final List<GenerationConfigUnit> out = new ArrayList<GenerationConfigUnit>();

        String genModel;
        String outSrcFolder;
        String outTestFolder;
        String tooling;

        final OMElement root = getDocument(confFile);
        @SuppressWarnings("unused")
		final Iterator iter = root.getChildrenWithLocalName("generationset");
        OMElement element = root.getFirstElement();
      do {
            //final OMElement element = (OMElement) iter.next();
            genModel = "";
            outSrcFolder = "";
            outTestFolder = "";
            tooling = "";

            final Iterator iter2 = element.getChildElements();
            while (iter2.hasNext()) {
                final OMElement subelement = (OMElement) iter2.next();
                if (subelement.getLocalName().equals("genmodel")) {
                    genModel = subelement.getText().trim();
                } else if (subelement.getLocalName().equals("outsrcfolder")) {
                    outSrcFolder = subelement.getText().trim();
                } else if (subelement.getLocalName().equals("outtestfolder")) {
                    outTestFolder = subelement.getText().trim();
                } else if (subelement.getLocalName().equals("tooling")) {
                    tooling = subelement.getText().trim();
                }
            }
            final GenerationConfigUnit outloc = new GenerationConfigUnit(
                    genModel, outSrcFolder, outTestFolder, tooling);
            out.add(outloc);
            // Get next generationset element
            OMNode nextElem = element.getNextOMSibling();
            while(!(nextElem instanceof OMElement) && nextElem != null)
            	nextElem = nextElem.getNextOMSibling();
            if (nextElem != null)
            	element = (OMElement)nextElem ;
            else 
            	element = null;
      } while (element != null);

        return out;
    }

    /**
     * Get an xml file and return an object which is XML tree.
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
