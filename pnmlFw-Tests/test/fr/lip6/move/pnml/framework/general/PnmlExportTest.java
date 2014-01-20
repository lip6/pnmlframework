/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OCLValidationFailed;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.UnhandledNetType;
import fr.lip6.move.pnml.framework.utils.exception.ValidationFailedException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.NameHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PNTypeHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI;

/**
 * @author ggiffo
 * 
 */
public class PnmlExportTest {

    public static String fullpath = "";
    PnmlExport pex;
    ModelRepository mrep;

    @BeforeTest(groups = { "generalexport" })
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
    @BeforeMethod(groups = { "generalexport" })
    public void setUp() throws Exception {
        pex = new PnmlExport();
        //ModelRepository.reset();
        mrep = ModelRepository.getInstance();
        mrep.createDocumentWorkspace("void");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterMethod(groups = { "generalexport" })
    public void tearDown() throws Exception {
        ModelRepository.getInstance().destroyCurrentWorkspace();
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.general.PnmlExport#exportObject(fr.lip6.move.pnml.framework.hlapi.HLAPIClass, java.lang.String)}.
     * 
     * @throws VoidRepositoryException
     */
    @Test(groups = { "generalexport" })
    public void testExportObjectOK() throws InvalidIDException,
            VoidRepositoryException {

        PetriNetDocHLAPI doc = new PetriNetDocHLAPI();
        PetriNetHLAPI net = new PetriNetHLAPI("net0", PNTypeHLAPI.COREMODEL,
                new NameHLAPI("hello"), doc);
        PageHLAPI page = new PageHLAPI("toppage", new NameHLAPI("myname"),
                null, net);
        PageHLAPI subpage = new PageHLAPI("subpage", new NameHLAPI("toto"),
                null, page);

        PlaceHLAPI p1 = new PlaceHLAPI("place1");
        PlaceHLAPI p2 = new PlaceHLAPI("place2");
        PlaceHLAPI p3 = new PlaceHLAPI("place3");

        TransitionHLAPI t1 = new TransitionHLAPI("transistion1");
        TransitionHLAPI t2 = new TransitionHLAPI("transistion2");

        RefPlaceHLAPI r1 = new RefPlaceHLAPI("reftop3", p3);

        new ArcHLAPI("a1", p1, t1, page);
        new ArcHLAPI("a2", t1, r1, page);
        new ArcHLAPI("a3", p3, t2, subpage);
        new ArcHLAPI("a4", t2, p2, subpage);

        p1.setContainerPageHLAPI(page);
        t1.setContainerPageHLAPI(page);
        r1.setContainerPageHLAPI(page);

        p3.setContainerPageHLAPI(subpage);
        p2.setContainerPageHLAPI(subpage);
        t2.setContainerPageHLAPI(subpage);

        try {
            pex.exportObject(doc, fullpath + "/exporttest.xml");
        } catch (Exception e) {
            e.printStackTrace();
            assert false : "an exception was raised";
        }

        new File(fullpath + "/exporttest.xml").delete();
    }

    /**
     * if the type is not handled
     * 
     * @throws ValidationFailedException
     * @throws IOException
     * @throws OCLValidationFailed
     * @throws UnhandledNetType
     * @throws OtherException
     * @throws BadFileFormatException
     */
    @Test(groups = { "generalexport" }, expectedExceptions = { UnhandledNetType.class })
    public void testExportObjectUnHandledType() throws UnhandledNetType,
            OCLValidationFailed, IOException, ValidationFailedException,
            BadFileFormatException, OtherException {

        fr.lip6.move.pnml.faketype.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.faketype.hlapi.PetriNetDocHLAPI();

        pex.exportObject(doc, fullpath + "/exporttest.xml");

        new File(fullpath + "/exporttest.xml").delete();
    }

    /**
     * if the given object is not an PetriNetDocHLAPI
     * 
     * @throws ValidationFailedException
     * @throws IOException
     * @throws OCLValidationFailed
     * @throws UnhandledNetType
     * @throws InvalidIDException
     * @throws VoidRepositoryException
     * @throws OtherException
     * @throws BadFileFormatException
     */
    @Test(groups = { "generalexport" }, expectedExceptions = { UnhandledNetType.class })
    public void testExportObjectUnHandledObject() throws UnhandledNetType,
            OCLValidationFailed, IOException, ValidationFailedException,
            InvalidIDException, VoidRepositoryException,
            BadFileFormatException, OtherException {

        PetriNetHLAPI doc = new PetriNetHLAPI("num28", PNTypeHLAPI.COREMODEL);

        pex.exportObject(doc, fullpath + "/exporttest.xml");

        new File(fullpath + "/exporttest.xml").delete();
    }

    /**
     * if the output file is not on an accessible place (or doesn't exists).
     * 
     * @throws ValidationFailedException
     * @throws IOException
     * @throws OCLValidationFailed
     * @throws UnhandledNetType
     * @throws InvalidIDException
     * @throws VoidRepositoryException
     * @throws OtherException
     * @throws BadFileFormatException
     */
    @Test(groups = { "generalexport" }, expectedExceptions = { IOException.class })
    public void testExportBadway() throws UnhandledNetType,
            OCLValidationFailed, IOException, ValidationFailedException,
            InvalidIDException, VoidRepositoryException,
            BadFileFormatException, OtherException {

        PetriNetDocHLAPI doc = new PetriNetDocHLAPI();
        PetriNetHLAPI net = new PetriNetHLAPI("net0", PNTypeHLAPI.COREMODEL,
                new NameHLAPI("hello"), doc);
        PageHLAPI page = new PageHLAPI("toppage", new NameHLAPI("myname"),
                null, net);
        PageHLAPI subpage = new PageHLAPI("subpage", new NameHLAPI("toto"),
                null, page);

        PlaceHLAPI p1 = new PlaceHLAPI("place1");
        PlaceHLAPI p2 = new PlaceHLAPI("place2");
        PlaceHLAPI p3 = new PlaceHLAPI("place3");

        TransitionHLAPI t1 = new TransitionHLAPI("transistion1");
        TransitionHLAPI t2 = new TransitionHLAPI("transistion2");

        RefPlaceHLAPI r1 = new RefPlaceHLAPI("reftop3", p3);

        new ArcHLAPI("a1", p1, t1, page);
        new ArcHLAPI("a2", t1, r1, page);
        new ArcHLAPI("a3", p3, t2, subpage);
        new ArcHLAPI("a4", t2, p2, subpage);

        p1.setContainerPageHLAPI(page);
        t1.setContainerPageHLAPI(page);
        r1.setContainerPageHLAPI(page);

        p3.setContainerPageHLAPI(subpage);
        p2.setContainerPageHLAPI(subpage);
        t2.setContainerPageHLAPI(subpage);

        pex.exportObject(doc, "/exporttest.xml");

    }

    /**
     * Check OCL failure.
     * 
     * @throws ValidationFailedException
     * @throws IOException
     * @throws OCLValidationFailed
     * @throws UnhandledNetType
     * @throws InvalidIDException
     * @throws VoidRepositoryException
     * @throws OtherException
     * @throws BadFileFormatException
     * 
     */
    @Test(groups = { "generalexport" }, expectedExceptions = { OCLValidationFailed.class })
    public void testExportObjectOCLFail() throws UnhandledNetType,
            OCLValidationFailed, IOException, ValidationFailedException,
            InvalidIDException, VoidRepositoryException,
            BadFileFormatException, OtherException {

        PetriNetDocHLAPI doc = new PetriNetDocHLAPI();
        PetriNetHLAPI net = new PetriNetHLAPI("net0", PNTypeHLAPI.COREMODEL,
                new NameHLAPI("hello"), doc);
        PageHLAPI page = new PageHLAPI("toppage", new NameHLAPI("myname"),
                null, net);
        PageHLAPI subpage = new PageHLAPI("subpage", new NameHLAPI("toto"),
                null, page);

        PlaceHLAPI p1 = new PlaceHLAPI("place1");
        PlaceHLAPI p2 = new PlaceHLAPI("place2");
        PlaceHLAPI p3 = new PlaceHLAPI("place3");

        TransitionHLAPI t1 = new TransitionHLAPI("transistion1");
        TransitionHLAPI t2 = new TransitionHLAPI("transistion2");

        RefPlaceHLAPI r1 = new RefPlaceHLAPI("reftop3", p3);

        new ArcHLAPI("a1", p1, t2, page);
        new ArcHLAPI("a2", t1, r1, page);
        new ArcHLAPI("a3", p3, t2, subpage);
        new ArcHLAPI("a4", t2, p2, subpage);

        p1.setContainerPageHLAPI(page);
        t1.setContainerPageHLAPI(page);
        r1.setContainerPageHLAPI(page);

        p3.setContainerPageHLAPI(subpage);
        p2.setContainerPageHLAPI(subpage);
        t2.setContainerPageHLAPI(subpage);

        pex.exportObject(doc, fullpath + "/exporttest.xml");

        new File(fullpath + "/exporttest.xml").delete();
    }

    /**
     * Check if pretty printing use doesn't produce errors
     * 
     * Test method for
     * {@link fr.lip6.move.pnml.framework.general.PnmlExport#exportObject(fr.lip6.move.pnml.framework.hlapi.HLAPIClass, java.lang.String)}.
     * 
     * @throws VoidRepositoryException
     */
    @Test(groups = { "generalexport" })
    public void testExportObjectPrettyPrint() throws InvalidIDException,
            VoidRepositoryException {

        PetriNetDocHLAPI doc = new PetriNetDocHLAPI();
        PetriNetHLAPI net = new PetriNetHLAPI("net0", PNTypeHLAPI.COREMODEL,
                new NameHLAPI("hello"), doc);
        PageHLAPI page = new PageHLAPI("toppage", new NameHLAPI("myname"),
                null, net);
        PageHLAPI subpage = new PageHLAPI("subpage", new NameHLAPI("toto"),
                null, page);

        PlaceHLAPI p1 = new PlaceHLAPI("place1");
        PlaceHLAPI p2 = new PlaceHLAPI("place2");
        PlaceHLAPI p3 = new PlaceHLAPI("place3");

        TransitionHLAPI t1 = new TransitionHLAPI("transistion1");
        TransitionHLAPI t2 = new TransitionHLAPI("transistion2");

        RefPlaceHLAPI r1 = new RefPlaceHLAPI("reftop3", p3);

        new ArcHLAPI("a1", p1, t1, page);
        new ArcHLAPI("a2", t1, r1, page);
        new ArcHLAPI("a3", p3, t2, subpage);
        new ArcHLAPI("a4", t2, p2, subpage);

        p1.setContainerPageHLAPI(page);
        t1.setContainerPageHLAPI(page);
        r1.setContainerPageHLAPI(page);

        p3.setContainerPageHLAPI(subpage);
        p2.setContainerPageHLAPI(subpage);
        t2.setContainerPageHLAPI(subpage);

        try {
            pex.exportObject(doc, fullpath + "/exporttest.xml");
            pex.exportObject(doc, fullpath + "/exporttest2.xml", true);
        } catch (Exception e) {
            e.printStackTrace();
            assert false : "an exception was raised";
        }

        assert ModelRepository.getInstance().isPrettyPrintActive() : "an error occur";

        new File(fullpath + "/exporttest.xml").delete();
        new File(fullpath + "/exporttest2.xml").delete();
    }

}
