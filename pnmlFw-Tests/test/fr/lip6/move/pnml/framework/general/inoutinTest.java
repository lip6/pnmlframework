/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
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
 * @author ggiffo
 *
 */
public class inoutinTest {

    private static final String complespace = "/Oracle";
    private static String fullpath = "";
    PnmlExport pex;
    PnmlImport pi;
    ModelRepository mrep;

    @BeforeTest(groups = { "inoutinout" })
    protected void giveinfo() {
        fullpath = new File("").getAbsolutePath().split("/trunk")[0]
                + "/trunk/Tests/XMLTestFilesRepository";
        System.out.println("full path to xmlrepository " + fullpath);
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeMethod(groups = { "inoutinout" })
    public void setUp() throws Exception {
        //ModelRepository.reset();
        pex = new PnmlExport();
        pi = new PnmlImport();
        mrep = ModelRepository.getInstance();
        mrep.createDocumentWorkspace("void");
    }

    /**
     * ExportObjectOCLFail
     *
     * @throws java.lang.Exception
     */
    @AfterMethod(groups = { "inoutinout" })
    public void tearDown() throws Exception {
        ModelRepository.getInstance().destroyCurrentWorkspace();
    }

    @DataProvider(name = "givefiles")
    public Object[][] createData1() {
        return new Object[][] { { complespace + "/full_coremodel.xml" },
                { complespace + "/full_hlpn.xml" },
                { complespace + "/full_ptnet.xml" },
                { complespace + "/full_sn.xml" },
                { complespace + "/normal.xml" },
                { complespace + "/Token-ring.pnml" },
                { complespace + "/vendingmachines.pnml" },
                { complespace + "/wopeddemo-loanapp.pnml" },
                { complespace + "/philo.pnml" },
                { complespace + "/itsc-complet-1.45-PT.pnml" },
                { complespace + "/fichier_norme.xml" },
                { complespace + "/test_fichier_norme_HLPN.xml" },
                { complespace + "/ClientServer.pnml" },
                { complespace + "/NA.pnml.xml" },
                { complespace + "/Store.pnml.xml" },
                { complespace + "/Client-Server-WoPeD.pnml" },
                { complespace + "/NB.pnml.xml" },
                { complespace + "/Producer.pnml.xml" },
                { complespace + "/samplePTnet.pnml" },
                { complespace + "/wopeddemo.pnml" },
                { complespace + "/sampleSNPrio.pnml" },
                { complespace + "/SharedMemory.pnml" } };
    }

    /**
     * @throws InvalidIDException
     * @throws AssociatedPluginNotFound
     * @throws OtherException
     * @throws OCLValidationFailed
     * @throws InnerBuildException
     * @throws ValidationFailedException
     * @throws UnhandledNetType
     * @throws BadFileFormatException
     * @throws IOException
     * @throws VoidRepositoryException
     * @throws InvalidIDException
     * @throws ValidationFailedException
     * @throws IOException
     * @throws OCLValidationFailed
     * @throws UnhandledNetType
     * @throws InvalidIDException
     * @throws FactoryConfigurationError
     * @throws XMLStreamException
     * @throws VoidRepositoryException
     * @throws VoidRepositoryException
     *
     */
    @Test(groups = { "inoutinout" }, dataProvider = "givefiles")
    public void testImportExport(String fileToTestPath) throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, XMLStreamException, FactoryConfigurationError,
            VoidRepositoryException {

        String filepath = fullpath + fileToTestPath;

        HLAPIClass doc = pi.importFile(filepath);
        assert pi != null : "a problem occured when importing the file "
                + filepath;

        pex.exportObject(doc, fullpath + "/inouttest.xml");

        Integer file1 = countChildren(getfile(filepath));
        Integer file2 = countChildren(getfile(fullpath + "/inouttest.xml"));

        XMLTreeCompare xmltc = new XMLTreeCompare();

        System.out.println(">> nodes for orginal file:" + file1
                + ", node for imported then exported file:" + file2
                + " original file is:" + fileToTestPath);

        int hasor = xmltc.hashTree(getfile(filepath));
        int hashfin = xmltc.hashTree(getfile(fullpath + "/inouttest.xml"));

        System.out.println(">> XMLTree HashCode for orginal file:" + hasor
                + ", node for imported then exported file:" + hashfin
                + " original file is:" + fileToTestPath);

        assert file1.equals(file2) : "[Small compare] missing data in import/export for "
                + fileToTestPath;
        assert hasor == hashfin : "[Hash compare] trees hashes are different";
        new File(fullpath + "/inouttest.xml").delete();
    }

    /**
     *
     * @param path
     * @return
     * @throws XMLStreamException
     * @throws FactoryConfigurationError
     * @throws IOException
     */
    private OMElement getfile(String path) throws XMLStreamException,
            FactoryConfigurationError, IOException {

        final File imported = new File(path);
        FileReader fr = new FileReader(imported);
        XMLStreamReader parser = null;
        parser = XMLInputFactory.newInstance().createXMLStreamReader(fr);
        return new StAXOMBuilder(parser).getDocumentElement();
    }

    @SuppressWarnings("unchecked")
    private int countChildren(OMElement document) {
        int children = 0;
        for (Iterator<OMElement> iterator = document.getChildElements(); iterator
                .hasNext();) {
            OMElement type = (OMElement) iterator.next();
            children++;
            children += countChildren(type);
        }
        return children;
    }

}
