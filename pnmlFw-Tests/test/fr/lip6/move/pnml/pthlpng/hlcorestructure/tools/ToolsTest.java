
/**
 * <copyright>
 * </copyright>
 *
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.tools;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PageHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefPlaceHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefTransitionHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TransitionHLAPI;

public class ToolsTest {

	ModelRepository mr;
	@BeforeMethod(groups = {"hlapi", "tools"})
	public void setup() throws Exception{
		mr = ModelRepository.getInstance();
		mr.createDocumentWorkspace("void");
	}

	@Test(groups = { "hlapi", "tools" })
    public void circularElementTest() throws InvalidIDException, VoidRepositoryException {
        RefPlaceHLAPI r1 = new RefPlaceHLAPI("r1", null);
        RefPlaceHLAPI r2 = new RefPlaceHLAPI("r2", null);
        RefPlaceHLAPI r3 = new RefPlaceHLAPI("r3", null);
        PlaceHLAPI p1 = new PlaceHLAPI("p1");

        r1.setRefHLAPI(r2);
        r2.setRefHLAPI(r3);
        r3.setRefHLAPI(p1);
        assert Tools.circularElement(r1) : "error tool test";
    }

    @Test(groups = { "hlapi", "tools" })
    public void circularElementTest2() throws InvalidIDException, VoidRepositoryException {
		  RefPlaceHLAPI r1 = new RefPlaceHLAPI("r1", null);
        RefPlaceHLAPI r2 = new RefPlaceHLAPI("r2", null);
        RefPlaceHLAPI r3 = new RefPlaceHLAPI("r3", null);

        r1.setRefHLAPI(r2);
        r2.setRefHLAPI(r3);
        r3.setRefHLAPI(r1);
        assert !Tools.circularElement(r1) : "error tool test";
        assert !Tools.circularElement(r2) : "error tool test";
        assert !Tools.circularElement(r3) : "error tool test";
    }

    @Test(groups = { "hlapi", "tools" })
    public void circularElementTest_() throws InvalidIDException, VoidRepositoryException {
        RefTransitionHLAPI r1 = new RefTransitionHLAPI("r1", null);
        RefTransitionHLAPI r2 = new RefTransitionHLAPI("r2", null);
        RefTransitionHLAPI r3 = new RefTransitionHLAPI("r3", null);
        TransitionHLAPI p1 = new TransitionHLAPI("p1");

        r1.setRefHLAPI(r2);
        r2.setRefHLAPI(r3);
        r3.setRefHLAPI(p1);
        assert Tools.circularElement(r1) : "error tool test";
    }

    @Test(groups = { "hlapi", "tools" })
    public void circularElementTest_2() throws InvalidIDException, VoidRepositoryException {
		  RefTransitionHLAPI r1 = new RefTransitionHLAPI("r1", null);
        RefTransitionHLAPI r2 = new RefTransitionHLAPI("r2", null);
        RefTransitionHLAPI r3 = new RefTransitionHLAPI("r3", null);

        r1.setRefHLAPI(r2);
        r2.setRefHLAPI(r3);
        r3.setRefHLAPI(r1);
        assert !Tools.circularElement(r1) : "error tool test";
        assert !Tools.circularElement(r2) : "error tool test";
        assert !Tools.circularElement(r3) : "error tool test";
    }

    @Test(groups = { "hlapi", "tools" })
    public void fusedocument() throws InvalidIDException,
        VoidRepositoryException, OtherException {
        mr.createDocumentWorkspace("space1");

        PetriNetDocHLAPI pt1 = new PetriNetDocHLAPI();
        new PetriNetHLAPI("pn10", null, pt1);
        new PetriNetHLAPI("pn11", null, pt1);
        mr.setCurrentHLAPIRootClass(pt1);

        mr.createDocumentWorkspace("space2");
        PetriNetDocHLAPI pt2 = new PetriNetDocHLAPI();
        new PetriNetHLAPI("pn20", null, pt2);
        new PetriNetHLAPI("pn21", null, pt2);
        mr.setCurrentHLAPIRootClass(pt2);

        Tools.fuseDocuments("space1", "space2");
        assert pt1.getNets().size() == 4 : "size failure";
        assert pt2.getNets().size() == 0 : "size failure";
        assert mr.getCurrentDocWSId().equals(
                "space1") : "name close open failed";
        assert mr.size() == 2 : "number failure";

    }

    @Test(groups = { "hlapi", "tools" }, expectedExceptions = { OtherException.class })
    public void fusedocument_noHLAPIRootClass() throws InvalidIDException,
        VoidRepositoryException, OtherException {
        mr.createDocumentWorkspace("space1");

        PetriNetDocHLAPI pt1 = new PetriNetDocHLAPI();
        new PetriNetHLAPI("pn10", null, pt1);
        new PetriNetHLAPI("pn11", null, pt1);

        mr.createDocumentWorkspace("space2");
        PetriNetDocHLAPI pt2 = new PetriNetDocHLAPI();
        new PetriNetHLAPI("pn20", null, pt2);
        new PetriNetHLAPI("pn21", null, pt2);

        Tools.fuseDocuments("space1", "space2");

    }

    @Test(groups = { "hlapi", "tools" }, expectedExceptions = { InvalidIDException.class })
    public void fusedocument_duplicateId() throws InvalidIDException,
        VoidRepositoryException, OtherException {
        mr.createDocumentWorkspace("space1");

        PetriNetDocHLAPI pt1 = new PetriNetDocHLAPI();
        PetriNetHLAPI pn10 = new PetriNetHLAPI("pn10", null, pt1);
        new PetriNetHLAPI("pn11", null, pt1);
        new PageHLAPI("same", pn10);
        mr.setCurrentHLAPIRootClass(pt1);

        mr.createDocumentWorkspace("space2");
        PetriNetDocHLAPI pt2 = new PetriNetDocHLAPI();
        PetriNetHLAPI pn20 = new PetriNetHLAPI("pn20", null, pt2);
        new PetriNetHLAPI("pn21", null, pt2);
        new PageHLAPI("same", pn20);
        mr.setCurrentHLAPIRootClass(pt2);

        Tools.fuseDocuments("space1", "space2");

    }
}