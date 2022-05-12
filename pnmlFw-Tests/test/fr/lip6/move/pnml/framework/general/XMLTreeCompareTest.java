package fr.lip6.move.pnml.framework.general;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMMetaFactory;
import org.apache.axiom.om.OMText;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XMLTreeCompareTest {

    OMFactory omf;

    @BeforeMethod(groups = { "XMLTreeCompare" })
    protected void setUp() throws Exception {
    	OMMetaFactory fac = OMAbstractFactory.getMetaFactory();
        omf =  fac.getOMFactory();
    }

    @AfterMethod
    protected void tearDown() throws Exception {
    }

    // @Test(groups = { "XMLTreeCompare" })
    // public void testAttributsOK() {
    // OMElement a = new OMElementImpl("balise", null, omf);
    // a.addAttribute("toto", "value", null);
    // a.addAttribute("toti", "value", null);
    // a.addAttribute("tota", "value", null);
    // a.addAttribute("totu", "value", null);
    //
    // OMElement b = a.cloneOMElement();
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compareAttributes(a, b) : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testAttributsfail() {
    // OMElement a = new OMElementImpl("balise", null, omf);
    // a.addAttribute("toto", "value", null);
    // a.addAttribute("toti", "value", null);
    // a.addAttribute("tota", "value", null);
    // a.addAttribute("totu", "value", null);
    //
    // OMElement b = a.cloneOMElement();
    // b.addAttribute("toto2", "value", null);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compareAttributes(a, b) == false : "not the expected
    // results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testAttributsfail2() {
    // OMElement a = new OMElementImpl("balise", null, omf);
    // a.addAttribute("toto", "value", null);
    // a.addAttribute("toti", "value", null);
    // a.addAttribute("tota", "value", null);
    // a.addAttribute("totu", "value", null);
    //
    // OMElement b = a.cloneOMElement();
    // b.addAttribute("toto", "value2", null);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compareAttributes(a, b) == false : "not the expected
    // results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNode() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    // OMText sonTExt = omf.createOMText("un texte");
    //
    // a.addChild(sonID);
    // a.addChild(sonnonID);
    // a.addChild(sonTExt);
    //
    // OMElement b = a.cloneOMElement();
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNodenotsameorder() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement b = a.cloneOMElement();
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    // OMText sonTExt = omf.createOMText("un texte");
    //
    // a.addChild(sonID);
    // a.addChild(sonnonID);
    // a.addChild(sonTExt);
    //
    // OMElement sonID2 = omf.createOMElement("sonID", null);
    // sonID2.addAttribute("id", "monid", null);
    // sonID2.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID2 = omf.createOMElement("sonnonID", null);
    // sonnonID2.addAttribute("att", "vallatt", null);
    // OMText sonTExt2 = omf.createOMText("un texte");
    //
    // b.addChild(sonID2);
    // b.addChild(sonnonID2);
    // b.addChild(sonTExt2);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNodeMoreIdson() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    // OMText sonTExt = omf.createOMText("un texte");
    //
    // a.addChild(sonID);
    // a.addChild(sonnonID);
    // a.addChild(sonTExt);
    //
    // OMElement b = a.cloneOMElement();
    // OMElement newidson = omf.createOMElement("newson", null);
    // newidson.addAttribute("id", "value", null);
    //
    // b.addChild(newidson);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) == false : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNodeMoreTextSon() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    // OMText sonTExt = omf.createOMText("un texte");
    //
    // a.addChild(sonID);
    // a.addChild(sonnonID);
    // a.addChild(sonTExt);
    //
    // OMElement b = a.cloneOMElement();
    // OMText newtestson = omf.createOMText("autre texte");
    // b.addChild(newtestson);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) == false : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNodeTextVariation() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    //
    // a.addChild(sonID);
    // a.addChild(sonnonID);
    //
    // OMElement b = a.cloneOMElement();
    // OMText sonTExt = omf.createOMText("un texte");
    // OMText newtestson = omf.createOMText("\nun texte \n");
    // b.addChild(newtestson);
    // a.addChild(sonTExt);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNodeTextVariation2() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    //
    // a.addChild(sonID);
    // a.addChild(sonnonID);
    //
    // OMElement b = a.cloneOMElement();
    // OMText sonTExt = omf.createOMText("un texte");
    // OMText newtestson = omf.createOMText("\n\t\n un texte \n");
    // b.addChild(newtestson);
    // a.addChild(sonTExt);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) : "not the expected results";
    // }
    //
    // @Test(groups = { "XMLTreeCompare" })
    // public void testNodeSameIdnotSamecontent() {
    //
    // OMElement a = omf.createOMElement("balise", null);
    // a.addAttribute("toto", "value", null);
    //
    // OMElement sonnonID = omf.createOMElement("sonnonID", null);
    // sonnonID.addAttribute("att", "vallatt", null);
    // OMText sonTExt = omf.createOMText("un texte");
    //
    // a.addChild(sonnonID);
    // a.addChild(sonTExt);
    //
    // OMElement b = a.cloneOMElement();
    //
    // OMElement sonID = omf.createOMElement("sonID", null);
    // sonID.addAttribute("id", "monid", null);
    // sonID.addAttribute("att", "vallatt", null);
    //
    // OMElement sonID2 = omf.createOMElement("sonID", null);
    // sonID2.addAttribute("id", "monid", null);
    // sonID2.addAttribute("att", "vallatt", null);
    // sonID2.addChild(omf.createOMElement("voidchild", null));
    //
    // a.addChild(sonID);
    // b.addChild(sonID2);
    //
    // XMLTreeCompare xmlt = new XMLTreeCompare();
    // assert xmlt.compare(a, b) == false : "not the expected results";
    // }

    /** Hashtest* */

    @Test(groups = { "Hash" })
    public void testHash() {

        OMElement a = omf.createOMElement("balise", null);
        a.addAttribute("toto", "value", null);

        OMElement sonID = omf.createOMElement("sonID", null);
        sonID.addAttribute("id", "monid", null);
        sonID.addAttribute("att", "vallatt", null);

        OMElement sonnonID = omf.createOMElement("sonnonID", null);
        sonnonID.addAttribute("att", "vallatt", null);
        OMText sonTExt = omf.createOMText("un texte");

        a.addChild(sonID);
        a.addChild(sonnonID);
        a.addChild(sonTExt);

        OMElement b = a.cloneOMElement();

        XMLTreeCompare xmlt = new XMLTreeCompare();
        assert xmlt.hashTree(a) == xmlt.hashTree(b) : "not the expected results";
    }

    @Test(groups = { "Hash" })
    public void testHashOrder() {

        OMElement a = omf.createOMElement("balise", null);
        a.addAttribute("toto", "value", null);

        OMElement sonID = omf.createOMElement("sonID", null);
        sonID.addAttribute("id", "monid", null);
        sonID.addAttribute("att", "vallatt", null);

        OMElement sonnonID = omf.createOMElement("sonnonID", null);
        sonnonID.addAttribute("att", "vallatt", null);
        OMText sonTExt = omf.createOMText("un texte");

        a.addChild(sonID);
        a.addChild(sonnonID);
        a.addChild(sonTExt);

        OMElement b = omf.createOMElement("balise", null);
        b.addAttribute("toto", "value", null);

        OMElement sonID2 = omf.createOMElement("sonID", null);
        sonID2.addAttribute("id", "monid", null);
        sonID2.addAttribute("att", "vallatt", null);

        OMElement sonnonID2 = omf.createOMElement("sonnonID", null);
        sonnonID2.addAttribute("att", "vallatt", null);
        OMText sonTExt2 = omf.createOMText("un texte\n\n\n");
        OMText voidtext = omf.createOMText("\n\n\n\t");

        b.addChild(sonnonID2);
        b.addChild(voidtext);
        b.addChild(sonID2);
        b.addChild(sonTExt2);

        XMLTreeCompare xmlt = new XMLTreeCompare();
        System.out.println(a);
        System.out.println(b);
        assert xmlt.hashTree(a) == xmlt.hashTree(b) : "not the expected results";
    }

    @Test(groups = { "Hash" })
    public void testHash2() {

        OMElement a = omf.createOMElement("balise", null);
        a.addAttribute("toto", "value", null);

        OMElement sonID = omf.createOMElement("sonID", null);
        sonID.addAttribute("id", "monid", null);
        sonID.addAttribute("att", "vallatt", null);

        OMElement sonnonID = omf.createOMElement("sonnonID", null);
        sonnonID.addAttribute("att", "vallatt", null);
        OMText sonTExt = omf.createOMText("un texte");

        a.addChild(sonID);
        a.addChild(sonnonID);
        a.addChild(sonTExt);

        OMElement b = a.cloneOMElement();
        b.addAttribute("void", "something", null);

        XMLTreeCompare xmlt = new XMLTreeCompare();
        assert xmlt.hashTree(a) != xmlt.hashTree(b) : "not the expected results";
    }

    @Test(groups = { "Hash" })
    public void testHashPerverseAttname() {

        OMElement a = omf.createOMElement("balise", null);
        a.addAttribute("a", "bc", null);
        a.addAttribute("de", "f", null);

        OMElement b = omf.createOMElement("balise", null);
        b.addAttribute("a", "bcd", null);
        b.addAttribute("e", "f", null);

        XMLTreeCompare xmlt = new XMLTreeCompare();
        assert xmlt.hashTree(a) != xmlt.hashTree(b) : "not the expected results";
    }

}
