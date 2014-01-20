package fr.lip6.move.pnml.framework.general;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

public class DefaultTypesTests {

    @BeforeMethod(groups = { "TypesTests" })
    public void setUp() throws Exception {
        ModelRepository.getInstance().createDocumentWorkspace("void");
    }

    @AfterMethod(groups = { "TypesTests" })
    public void tearDown() throws Exception {
        ModelRepository.getInstance().destroyCurrentWorkspace();
    }

    @Test(groups = { "TypesTests" })
    public void testCoreModel() throws InvalidIDException,
            VoidRepositoryException {

        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI(
                "net0", null, null, doc);
        new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI("toppage", null,
                null, net);

        System.out.println(doc.getXmlns());
        assert net.getType() == fr.lip6.move.pnml.pnmlcoremodel.hlapi.PNTypeHLAPI.COREMODEL
                .getContainedItem() : "unmatching types (" + net.getType()
                + ")";
    }

    @Test(groups = { "TypesTests" })
    public void testPTNET() throws InvalidIDException, VoidRepositoryException {

        fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI(
                "net0", null, null, doc);
        new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI("toppage", null, null, net);

        System.out.println(doc.getXmlns());
        assert net.getType() == fr.lip6.move.pnml.ptnet.hlapi.PNTypeHLAPI.PTNET
                .getContainedItem() : "unmatching types (" + net.getType()
                + ")";
    }

    @Test(groups = { "TypesTests" })
    public void testSN() throws InvalidIDException, VoidRepositoryException {

        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetHLAPI(
                "net0", null, null, doc);
        new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PageHLAPI(
                "toppage", null, null, net);

        System.out.println(doc.getXmlns());
        assert net.getType() == fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PNTypeHLAPI.SYMNET
                .getContainedItem() : "unmatching types (" + net.getType()
                + ")";
    }

    @Test(groups = { "TypesTests" })
    public void testHLPN() throws InvalidIDException, VoidRepositoryException {

        fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetDocHLAPI doc = new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetDocHLAPI();
        fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetHLAPI net = new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetHLAPI(
                "net0", null, null, doc);
        new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI("toppage",
                null, null, net);

        System.out.println(doc.getXmlns());
        assert net.getType().equals(
                fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PNTypeHLAPI.HLPN
                        .getContainedItem()) : "unmatching types ("
                + net.getType() + ")";
    }

}
