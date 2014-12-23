/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.NameHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.NodeHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PNTypeHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI;

/**
 * Model type used in this class in PNML Core Model.
 * @author ggiffo
 * 
 */
public class IdRepositoryIntegrationTest {

    PnmlExport pex;
    ModelRepository mrep;

    /**
     * @throws java.lang.Exception
     */
    @BeforeTest(groups = { "idrepintegration" })
    public void setUpall() throws Exception {
    	 // ModelRepository.reset();
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeMethod(groups = { "idrepintegration" })
    public void setUp() throws Exception {
        pex = new PnmlExport();
       // ModelRepository.reset();
        mrep = ModelRepository.getInstance();
        mrep.createDocumentWorkspace("void");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterMethod(groups = { "idrepintegration" })
    public void tearDown() throws Exception {
    	mrep.reset();
    }

    /**
     * 
     */
    @Test(groups = { "idrepintegration" }, expectedExceptions = { InvalidIDException.class })
    public void testIdFail() throws InvalidIDException, VoidRepositoryException {

        PetriNetDocHLAPI doc = new PetriNetDocHLAPI();
        PetriNetHLAPI net = new PetriNetHLAPI("net0", PNTypeHLAPI.COREMODEL,
                new NameHLAPI("hello"), doc);
        PageHLAPI page = new PageHLAPI("toppage", new NameHLAPI("myname"),
                null, net);

        PlaceHLAPI p1 = new PlaceHLAPI("place1", page);
        PlaceHLAPI p2 = new PlaceHLAPI("place2", page);

        TransitionHLAPI t1 = new TransitionHLAPI("transistion1");

        new ArcHLAPI("a1", p1, t1, page);
        new ArcHLAPI("a1", t1, p2, page);

    }

    /**
     * @throws VoidRepositoryException
     * 
     */
    @Test(groups = { "idrepintegration" })
    public void testIdFind() throws InvalidIDException, VoidRepositoryException {

        IdRepository idrep = mrep.getCurrentIdRepository();

        PetriNetDocHLAPI doc = new PetriNetDocHLAPI();
        PetriNetHLAPI net = new PetriNetHLAPI("net0", PNTypeHLAPI.COREMODEL,
                new NameHLAPI("hello"), doc);
        PageHLAPI page = new PageHLAPI("toppage", new NameHLAPI("myname"),
                null, net);

        PlaceHLAPI p1 = new PlaceHLAPI("place1", page);
        PlaceHLAPI p2 = new PlaceHLAPI("place2", page);

        TransitionHLAPI t1 = new TransitionHLAPI("transistion1");

        assert idrep.getObject("place1").equals(p1) : "get failure";
        assert idrep.getObject("place1").equals(p1) : "get failure (bis)";
        assert idrep.getObject("place2").equals(p2) : "get failure";
        assert idrep.getObject("transistion1").equals(t1) : "get failure";

        ArcHLAPI a1 = new ArcHLAPI("a1", (NodeHLAPI) idrep.getObject("place1"),
                (NodeHLAPI) idrep.getObject("transistion1"), page);
        assert a1.getSource().equals(p1.getContainedItem()) : "error in arc creation : source";
        assert a1.getTarget().equals(t1.getContainedItem()) : "error in arc creation : target";

    }

}
