/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
public class Oracle {

    // public static final String fpath = "XMLtestRepo";
    private static final String complespace = "/Oracle";
    public static String fullpath = "";
    PnmlImport pi;

    @BeforeTest(groups = { "Oracle" })
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
    @BeforeMethod(groups = { "Oracle" })
    protected void setUp() throws Exception {
        pi = new PnmlImport();
        ModelRepository.getInstance().createDocumentWorkspace("void");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterMethod(groups = { "Oracle" })
    protected void tearDown() throws Exception {
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
                { complespace + "/itsc-complet-1.45-PT.pnml" },
                { complespace + "/philo.pnml" },
                { complespace + "/wopeddemo-loanapp.pnml" },
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

    @Test(groups = { "Oracle" }, dataProvider = "givefiles")
    public void testImportFile(String path) throws IOException,
            BadFileFormatException, UnhandledNetType,
            ValidationFailedException, InnerBuildException,
            OCLValidationFailed, OtherException, AssociatedPluginNotFound,
            InvalidIDException, VoidRepositoryException {
        pi.importFile(fullpath + path);
        assert pi != null : "a problem occured when importing the file "
                + fullpath;
    }

}
