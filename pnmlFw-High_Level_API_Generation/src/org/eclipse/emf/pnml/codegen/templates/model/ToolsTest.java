package org.eclipse.emf.pnml.codegen.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;

public class ToolsTest
{
  protected static String nl;
  public static synchronized ToolsTest create(String lineSeparator)
  {
    nl = lineSeparator;
    ToolsTest result = new ToolsTest();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "/**";
  protected final String TEXT_4 = NL + " * ";
  protected final String TEXT_5 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_6 = NL + " *" + NL + " * ";
  protected final String TEXT_7 = "Id ggiffo, ";
  protected final String TEXT_8 = NL + " */" + NL + "package ";
  protected final String TEXT_9 = ".tools;" + NL + "" + NL + "import ";
  protected final String TEXT_10 = ".hlapi.*;" + NL + "import ";
  protected final String TEXT_11 = ".tools.*;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.*;" + NL + "import fr.lip6.move.pnml.framework.utils.ModelRepository;" + NL + "import org.testng.annotations.*;" + NL + "" + NL + "public class ToolsTest {" + NL + "" + NL + "\tModelRepository mr;" + NL + "\t@BeforeMethod(groups = {\"hlapi\", \"tools\"})" + NL + "\tpublic void setup() throws Exception{" + NL + "\t\tmr = ModelRepository.getInstance();" + NL + "\t\tmr.createDocumentWorkspace(\"void\");" + NL + "\t}" + NL + "" + NL + "\t@Test(groups = { \"hlapi\", \"tools\" })" + NL + "    public void circularElementTest() throws InvalidIDException, VoidRepositoryException {" + NL + "        RefPlaceHLAPI r1 = new RefPlaceHLAPI(\"r1\", null);" + NL + "        RefPlaceHLAPI r2 = new RefPlaceHLAPI(\"r2\", null);" + NL + "        RefPlaceHLAPI r3 = new RefPlaceHLAPI(\"r3\", null);" + NL + "        PlaceHLAPI p1 = new PlaceHLAPI(\"p1\");" + NL + "" + NL + "        r1.setRefHLAPI(r2);" + NL + "        r2.setRefHLAPI(r3);" + NL + "        r3.setRefHLAPI(p1);" + NL + "        assert Tools.circularElement(r1) : \"error tool test\";" + NL + "    }" + NL + "" + NL + "    @Test(groups = { \"hlapi\", \"tools\" })" + NL + "    public void circularElementTest2() throws InvalidIDException, VoidRepositoryException {" + NL + "\t\t  RefPlaceHLAPI r1 = new RefPlaceHLAPI(\"r1\", null);" + NL + "        RefPlaceHLAPI r2 = new RefPlaceHLAPI(\"r2\", null);" + NL + "        RefPlaceHLAPI r3 = new RefPlaceHLAPI(\"r3\", null);" + NL + "" + NL + "        r1.setRefHLAPI(r2);" + NL + "        r2.setRefHLAPI(r3);" + NL + "        r3.setRefHLAPI(r1);" + NL + "        assert !Tools.circularElement(r1) : \"error tool test\";" + NL + "        assert !Tools.circularElement(r2) : \"error tool test\";" + NL + "        assert !Tools.circularElement(r3) : \"error tool test\";" + NL + "    }" + NL + "" + NL + "    @Test(groups = { \"hlapi\", \"tools\" })" + NL + "    public void circularElementTest_() throws InvalidIDException, VoidRepositoryException {" + NL + "        RefTransitionHLAPI r1 = new RefTransitionHLAPI(\"r1\", null);" + NL + "        RefTransitionHLAPI r2 = new RefTransitionHLAPI(\"r2\", null);" + NL + "        RefTransitionHLAPI r3 = new RefTransitionHLAPI(\"r3\", null);" + NL + "        TransitionHLAPI p1 = new TransitionHLAPI(\"p1\");" + NL + "" + NL + "        r1.setRefHLAPI(r2);" + NL + "        r2.setRefHLAPI(r3);" + NL + "        r3.setRefHLAPI(p1);" + NL + "        assert Tools.circularElement(r1) : \"error tool test\";" + NL + "    }" + NL + "" + NL + "    @Test(groups = { \"hlapi\", \"tools\" })" + NL + "    public void circularElementTest_2() throws InvalidIDException, VoidRepositoryException {" + NL + "\t\t  RefTransitionHLAPI r1 = new RefTransitionHLAPI(\"r1\", null);" + NL + "        RefTransitionHLAPI r2 = new RefTransitionHLAPI(\"r2\", null);" + NL + "        RefTransitionHLAPI r3 = new RefTransitionHLAPI(\"r3\", null);" + NL + "" + NL + "        r1.setRefHLAPI(r2);" + NL + "        r2.setRefHLAPI(r3);" + NL + "        r3.setRefHLAPI(r1);" + NL + "        assert !Tools.circularElement(r1) : \"error tool test\";" + NL + "        assert !Tools.circularElement(r2) : \"error tool test\";" + NL + "        assert !Tools.circularElement(r3) : \"error tool test\";" + NL + "    }" + NL + "" + NL + "    @Test(groups = { \"hlapi\", \"tools\" })" + NL + "    public void fusedocument() throws InvalidIDException," + NL + "        VoidRepositoryException, OtherException {" + NL + "        mr.createDocumentWorkspace(\"space1\");" + NL + "" + NL + "        PetriNetDocHLAPI pt1 = new PetriNetDocHLAPI();" + NL + "        new PetriNetHLAPI(\"pn10\", null, pt1);" + NL + "        new PetriNetHLAPI(\"pn11\", null, pt1);" + NL + "        mr.setCurrentHLAPIRootClass(pt1);" + NL + "" + NL + "        mr.createDocumentWorkspace(\"space2\");" + NL + "        PetriNetDocHLAPI pt2 = new PetriNetDocHLAPI();" + NL + "        new PetriNetHLAPI(\"pn20\", null, pt2);" + NL + "        new PetriNetHLAPI(\"pn21\", null, pt2);" + NL + "        mr.setCurrentHLAPIRootClass(pt2);" + NL + "" + NL + "        Tools.fuseDocuments(\"space1\", \"space2\");" + NL + "        assert pt1.getNets().size() == 4 : \"size failure\";" + NL + "        assert pt2.getNets().size() == 0 : \"size failure\";" + NL + "        assert mr.getCurrentDocWSId().equals(" + NL + "                \"space1\") : \"name close open failed\";" + NL + "        assert mr.size() == 2 : \"number failure\";" + NL + "" + NL + "    }" + NL + "" + NL + "    @Test(groups = { \"hlapi\", \"tools\" }, expectedExceptions = { OtherException.class })" + NL + "    public void fusedocument_noHLAPIRootClass() throws InvalidIDException," + NL + "        VoidRepositoryException, OtherException {" + NL + "        mr.createDocumentWorkspace(\"space1\");" + NL + "" + NL + "        PetriNetDocHLAPI pt1 = new PetriNetDocHLAPI();" + NL + "        new PetriNetHLAPI(\"pn10\", null, pt1);" + NL + "        new PetriNetHLAPI(\"pn11\", null, pt1);" + NL + "" + NL + "        mr.createDocumentWorkspace(\"space2\");" + NL + "        PetriNetDocHLAPI pt2 = new PetriNetDocHLAPI();" + NL + "        new PetriNetHLAPI(\"pn20\", null, pt2);" + NL + "        new PetriNetHLAPI(\"pn21\", null, pt2);" + NL + "" + NL + "        Tools.fuseDocuments(\"space1\", \"space2\");" + NL + "" + NL + "    }" + NL + "" + NL + "    @Test(groups = { \"hlapi\", \"tools\" }, expectedExceptions = { InvalidIDException.class })" + NL + "    public void fusedocument_duplicateId() throws InvalidIDException," + NL + "        VoidRepositoryException, OtherException {" + NL + "        mr.createDocumentWorkspace(\"space1\");" + NL + "" + NL + "        PetriNetDocHLAPI pt1 = new PetriNetDocHLAPI();" + NL + "        PetriNetHLAPI pn10 = new PetriNetHLAPI(\"pn10\", null, pt1);" + NL + "        new PetriNetHLAPI(\"pn11\", null, pt1);" + NL + "        new PageHLAPI(\"same\", pn10);" + NL + "        mr.setCurrentHLAPIRootClass(pt1);" + NL + "" + NL + "        mr.createDocumentWorkspace(\"space2\");" + NL + "        PetriNetDocHLAPI pt2 = new PetriNetDocHLAPI();" + NL + "        PetriNetHLAPI pn20 = new PetriNetHLAPI(\"pn20\", null, pt2);" + NL + "        new PetriNetHLAPI(\"pn21\", null, pt2);" + NL + "        new PageHLAPI(\"same\", pn20);" + NL + "        mr.setCurrentHLAPIRootClass(pt2);" + NL + "" + NL + "        Tools.fuseDocuments(\"space1\", \"space2\");" + NL + "" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    final String gm = (String)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_5);
    }}
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append("$");
    stringBuffer.append(TEXT_8);
    stringBuffer.append(gm);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(gm);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(gm);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
