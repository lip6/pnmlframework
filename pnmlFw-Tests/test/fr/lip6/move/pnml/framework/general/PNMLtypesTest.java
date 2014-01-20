/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * @author ggiffo
 * 
 */
public class PNMLtypesTest {

    // public static final String fpath = "XMLtestRepo";
    public static String fullpath = "";
    PnmlExport pex;
    ModelRepository mrep;
    
    @BeforeTest(groups = { "pnmltypetests" })
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
    @BeforeMethod(groups = { "pnmltypetests" })
    public void setUp() throws Exception {
        pex = new PnmlExport();
        //ModelRepository.reset();
       mrep =  ModelRepository.getInstance();
       mrep.createDocumentWorkspace("void");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterMethod(groups = { "pnmltypetests" })
    public void tearDown() throws Exception {
        ModelRepository.getInstance().destroyCurrentWorkspace();
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.general.PnmlExport#exportObject(fr.lip6.move.pnml.framework.hlapi.HLAPIClass, java.lang.String)}.
     * 
     * @throws VoidRepositoryException
     */
    @Test(groups = { "pnmltypetests" })
    public void testCoreOK() throws InvalidIDException, VoidRepositoryException {

        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI(
                "net0",
                fr.lip6.move.pnml.pnmlcoremodel.hlapi.PNTypeHLAPI.COREMODEL,
                new fr.lip6.move.pnml.pnmlcoremodel.hlapi.NameHLAPI("hello"),
                doc);
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI page = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI(
                "toppage", new fr.lip6.move.pnml.pnmlcoremodel.hlapi.NameHLAPI(
                        "myname"), null, net);
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI subpage = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI(
                "subpage", new fr.lip6.move.pnml.pnmlcoremodel.hlapi.NameHLAPI(
                        "toto"), null, page);

        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI p1 = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(
                "place1", page);
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI p2 = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(
                "place2", subpage);
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI p3 = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(
                "place3", subpage);

        fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI t1 = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI(
                "transistion1", page);
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI t2 = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI(
                "transistion2", subpage);

        fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI r1 = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI(
                "reftop3", p3, page);

        new fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI("a1", p1, t1, page);
        new fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI("a2", t1, r1, page);
        new fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI("a3", p3, t2,
                subpage);
        new fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI("a4", t2, p2,
                subpage);

        try {
            pex.exportObject(doc, fullpath + "/exporttest.xml");
        } catch (Exception e) {
            e.printStackTrace();
            assert false : "an exception was raised " + e.getMessage();
        }

        new File(fullpath + "/exporttest.xml").delete();
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.general.PnmlExport#exportObject(fr.lip6.move.pnml.framework.hlapi.HLAPIClass, java.lang.String)}.
     * 
     * @throws VoidRepositoryException
     */
    @Test(groups = { "pnmltypetests" })
    public void testPTNETOK() throws InvalidIDException,
            VoidRepositoryException {

        fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI(
                "net0", fr.lip6.move.pnml.ptnet.hlapi.PNTypeHLAPI.COREMODEL,
                new fr.lip6.move.pnml.ptnet.hlapi.NameHLAPI("hello"), doc);
        fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI page = new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(
                "toppage",
                new fr.lip6.move.pnml.ptnet.hlapi.NameHLAPI("myname"), null,
                net);
        fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI subpage = new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(
                "subpage", new fr.lip6.move.pnml.ptnet.hlapi.NameHLAPI("toto"),
                null, page);

        fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI p1 = new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
                "place1", page);
        fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI p2 = new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
                "place2", subpage);
        fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI p3 = new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
                "place3", subpage);

        fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI t1 = new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(
                "transistion1", page);
        fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI t2 = new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(
                "transistion2", subpage);

        fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI r1 = new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(
                "reftop3", p3, page);

        new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI("a1", p1, t1, page);
        new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI("a2", t1, r1, page);
        new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI("a3", p3, t2, subpage);
        new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI("a4", t2, p2, subpage);

        try {
            pex.exportObject(doc, fullpath + "/exporttest.xml");
        } catch (Exception e) {
            e.printStackTrace();
            assert false : "an exception was raised" + e.getMessage();
        }

        new File(fullpath + "/exporttest.xml").delete();
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.general.PnmlExport#exportObject(fr.lip6.move.pnml.framework.hlapi.HLAPIClass, java.lang.String)}.
     * 
     * @throws VoidRepositoryException
     */
    @Test(groups = { "pnmltypetests" })
    public void testSNOK() throws InvalidIDException, VoidRepositoryException {

        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetHLAPI(
                "net0",
                fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PNTypeHLAPI.COREMODEL,
                new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.NameHLAPI(
                        "hello"), doc);
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PageHLAPI page = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PageHLAPI(
                "toppage",
                new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.NameHLAPI(
                        "myname"), null, net);
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PageHLAPI subpage = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PageHLAPI(
                "subpage",
                new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.NameHLAPI(
                        "toto"), null, page);

        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI p1 = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI(
                "place1", page);
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI p2 = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI(
                "place2", subpage);
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI p3 = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI(
                "place3", subpage);

        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TransitionHLAPI t1 = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TransitionHLAPI(
                "transistion1", page);
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TransitionHLAPI t2 = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TransitionHLAPI(
                "transistion2", subpage);

        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.RefPlaceHLAPI r1 = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.RefPlaceHLAPI(
                "reftop3", p3, page);

        new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ArcHLAPI("a1",
                p1, t1, page);
        new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ArcHLAPI("a2",
                t1, r1, page);
        new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ArcHLAPI("a3",
                p3, t2, subpage);
        new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ArcHLAPI("a4",
                t2, p2, subpage);

        try {
            pex.exportObject(doc, fullpath + "/exporttest.xml");
        } catch (Exception e) {
            e.printStackTrace();
            assert false : "an exception was raised" + e.getMessage();
        }

        new File(fullpath + "/exporttest.xml").delete();
    }

}
