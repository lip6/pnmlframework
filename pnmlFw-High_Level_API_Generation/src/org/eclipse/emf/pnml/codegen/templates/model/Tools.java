package org.eclipse.emf.pnml.codegen.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Tools
{
  protected static String nl;
  public static synchronized Tools create(String lineSeparator)
  {
    nl = lineSeparator;
    Tools result = new Tools();
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
  protected final String TEXT_10 = ".hlapi.*;" + NL + "import fr.lip6.move.pnml.framework.utils.*;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.*;" + NL + "" + NL + "public class Tools {" + NL + "\t /**" + NL + "     * Test if a refplace is member of a circular cycle." + NL + "     * @param rp the ref place to test" + NL + "     * @return true if there is no circular cycle, false either" + NL + "     */" + NL + "    public static boolean circularElement(RefPlaceHLAPI rp) {" + NL + "" + NL + "        PlaceNodeHLAPI test = rp.getRefHLAPI();" + NL + "" + NL + "        while (test != null) {" + NL + "            if (test.getClass().equals(PlaceHLAPI.class))" + NL + "                return true;" + NL + "            if (((RefPlaceHLAPI)test).equals(rp))" + NL + "                return false;" + NL + "            test = ((RefPlaceHLAPI) test).getRefHLAPI();" + NL + "        }" + NL + "        return false;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * Test if a refplace is member of a circular cycle." + NL + "     * @param rt the ref place to test" + NL + "     * @return true if there is no circular cycle, false either" + NL + "     */" + NL + "    public static boolean circularElement(RefTransitionHLAPI rt) {" + NL + "" + NL + "        TransitionNodeHLAPI test = rt.getRefHLAPI();" + NL + "" + NL + "        while (test != null) {" + NL + "            if (test.getClass().equals(TransitionHLAPI.class))" + NL + "                return true;" + NL + "            if (((RefTransitionHLAPI)test).equals(rt))" + NL + "                return false;" + NL + "            test = ((RefTransitionHLAPI) test).getRefHLAPI();" + NL + "        }" + NL + "        return false;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * Fuse documents of two given workspace in one. All net of second document" + NL + "     * will now belong in first one." + NL + "     *" + NL + "     * @param WsId1" + NL + "     *            id of first Document Workspace" + NL + "     * @param WsId2" + NL + "     *            id of second Document Workspace" + NL + "     * @throws InvalidIDException" + NL + "     *             if an unexisting workspace is given or if duplicated id" + NL + "     *             exists between the two workspaces" + NL + "     * @throws VoidRepositoryException" + NL + "     *             if Model repository has not been initializated." + NL + "     * @throws OtherException" + NL + "     *             if a problem occure with classes" + NL + "     */" + NL + "    public static void fuseDocuments(String WsId1, String WsId2)" + NL + "            throws InvalidIDException, VoidRepositoryException, OtherException {" + NL + "        PetriNetDocHLAPI doc1;" + NL + "        PetriNetDocHLAPI doc2;" + NL + "        IdRepository idr1;" + NL + "        IdRepository idr2;" + NL + "" + NL + "        ModelRepository mr = ModelRepository.getInstance();" + NL + "        mr.changeCurrentDocWorkspace(WsId1);" + NL + "        if (mr.getCurrentHLAPIRootClass() !=null && mr.getCurrentHLAPIRootClass().getClass().equals(" + NL + "                PetriNetDocHLAPI.class)) {" + NL + "            doc1 = (PetriNetDocHLAPI) mr.getCurrentHLAPIRootClass();" + NL + "            idr1 = mr.getCurrentIdRepository();" + NL + "        } else {" + NL + "            throw new OtherException(" + NL + "                    \"The HLAPIRootClass is not of the expected type\");" + NL + "        }" + NL + "" + NL + "        mr.changeCurrentDocWorkspace(WsId2);" + NL + "        if (mr.getCurrentHLAPIRootClass() !=null && mr.getCurrentHLAPIRootClass().getClass().equals(" + NL + "                PetriNetDocHLAPI.class)) {" + NL + "            doc2 = (PetriNetDocHLAPI) mr.getCurrentHLAPIRootClass();" + NL + "            idr2 = mr.getCurrentIdRepository();" + NL + "        } else {" + NL + "            throw new OtherException(" + NL + "                    \"The HLAPIRootClass is not of the expected type\");" + NL + "        }" + NL + "" + NL + "        mr.changeCurrentDocWorkspace(WsId1);" + NL + "        if (!idr1.isCompatible(idr2))" + NL + "            throw new InvalidIDException(" + NL + "                    \"Common ids exists between the two workspaces\");" + NL + "" + NL + "        for (PetriNetHLAPI net : doc2.getNetsHLAPI()) {" + NL + "            doc1.addNetsHLAPI(net);" + NL + "        }" + NL + "        idr1.fuseWith(idr2);" + NL + "        mr.changeCurrentDocWorkspace(WsId2);" + NL + "        mr.destroyCurrentWorkspace();" + NL + "        mr.changeCurrentDocWorkspace(WsId1);" + NL + "    }" + NL + "}";

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
    return stringBuffer.toString();
  }
}
