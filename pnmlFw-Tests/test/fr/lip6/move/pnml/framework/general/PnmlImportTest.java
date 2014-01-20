/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.thaiopensource.validate.ValidationDriver;

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
public class PnmlImportTest {

    // public static final String fpath = "XMLtestRepo";
    public static String fullpath = "";
    PnmlImport pi;
    ModelRepository mrep;
    
    @BeforeTest(groups = { "generalimport", "fallback" })
    protected void giveinfo() {
        fullpath = new File("").getAbsolutePath().split("/trunk")[0]
                + "/trunk/Tests/XMLTestFilesRepository";
        System.out.println("the root folder is "
                + new File("").getAbsolutePath());
        System.out.println("full path to xmlrepository " + fullpath);
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeMethod(groups = { "generalimport", "fallback" })
    protected void setUp() throws Exception {
        pi = new PnmlImport();
        //ModelRepository.reset();
        mrep = ModelRepository.getInstance();
        mrep.createDocumentWorkspace("void");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterMethod(groups = { "generalimport", "fallback" })
    protected void tearDown() throws Exception {
        ModelRepository.getInstance().destroyCurrentWorkspace();
    }

    @Test(groups = { "generalimport" })
    protected void accesValidation() throws MalformedURLException,
            SAXException, IOException {
        final ValidationDriver valdrive = new ValidationDriver();
        assert valdrive.loadSchema(ValidationDriver
                .uriOrFileInputSource(OfficialPNMLFileType.COREMODEL
                        .getRngUrl()));

    }

    @Test(groups = { "generalimport" })
    public void testImportFile() throws IOException, BadFileFormatException,
            UnhandledNetType, ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {

        HLAPIClass retour = pi.importFile(fullpath + "/normal.xml");
        assert retour != null : "normal import failed";
        assert ModelRepository.getInstance().getCurrentHLAPIRootClass() != null : "HLAPIRootClass set failed";
        assert ModelRepository.getInstance().getCurrentHLAPIRootClass().equals(
                retour) : "failure";
    }

    @Test(groups = { "generalimport" }, expectedExceptions = { IOException.class })
    public void testImportFileNotExistingFile() throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + "/unexistingfile.xml");
        assert false : "exception not thrown";
    }

    @Test(groups = { "generalimport" }, expectedExceptions = { BadFileFormatException.class })
    public void testImportFileBadFileFormat() throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + "/badfileformat.xml");
        assert false : "exception not thrown";
    }

    @Test(groups = { "generalimport" }, expectedExceptions = { UnhandledNetType.class })
    public void testImportFileUnhandledNetType() throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + "/unhandlednettype.xml");
        assert false : "exception not thrown";
    }

    @Test(groups = { "generalimport" }, expectedExceptions = { ValidationFailedException.class }, dependsOnMethods = { "accesValidation" })
    public void testImportFileValidationFailed() throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + "/validationfailed.xml");
        assert false : "exception not thrown";
    }

    @Test(groups = { "generalimport" }, expectedExceptions = { OCLValidationFailed.class })
    public void testImportFileOCLFailed() throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + "/OCLvalidationfailed.xml");
        assert false : "exception not thrown";
    }

    @Test(groups = { "fallback" }, expectedExceptions = { UnhandledNetType.class })
    public void testfallbackoff() throws IOException, BadFileFormatException,
            UnhandledNetType, ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + "/fallbacknettype.xml");
        assert false : "exception not thrown";
    }

    @Test(groups = { "fallback" })
    public void testfallbackon() throws IOException, BadFileFormatException,
            UnhandledNetType, ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        PnmlImport mypi = new PnmlImport(fullpath + "/filetype.ftype.xml");
        mypi.setFallUse(true);
        mypi.importFile(fullpath + "/fallbacknettype.xml");
        assert mypi != null : "mypi error";
    }

    @Test(groups = { "fallback" }, expectedExceptions = { AssociatedPluginNotFound.class })
    public void testfallbackonfail() throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        PnmlImport mypi = new PnmlImport(fullpath + "/filetype.ftype.xml");
        mypi.setFallUse(true);
        mypi.importFile(fullpath + "/unaviablefallbacknettype.xml");
        assert false : "exception not thrown";
    }

}
