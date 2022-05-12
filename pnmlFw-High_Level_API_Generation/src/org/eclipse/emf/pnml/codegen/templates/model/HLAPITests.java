package org.eclipse.emf.pnml.codegen.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.ecore.*;
import fr.lip6.move.pnml.framework.apigen.Helpers;

public class HLAPITests
{
  protected static String nl;
  public static synchronized HLAPITests create(String lineSeparator)
  {
    nl = lineSeparator;
    HLAPITests result = new HLAPITests();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_5 = NL + " *" + NL + " * ";
  protected final String TEXT_6 = "Id ggiffo, ";
  protected final String TEXT_7 = NL + " */" + NL + "package ";
  protected final String TEXT_8 = ".hlapi;" + NL;
  protected final String TEXT_9 = NL + NL + "import  fr.lip6.move.pnml.framework.hlapi.*;";
  protected final String TEXT_10 = NL + "import ";
  protected final String TEXT_11 = ".hlapi.*;";
  protected final String TEXT_12 = NL + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "import org.apache.axiom.om.*;" + NL + "import fr.lip6.move.pnml.framework.utils.IdRefLinker;" + NL + "import org.eclipse.emf.common.util.DiagnosticChain;" + NL + "import ";
  protected final String TEXT_13 = ".*;" + NL + "import ";
  protected final String TEXT_14 = ".*;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;" + NL + "import fr.lip6.move.pnml.framework.utils.IdRepository;" + NL + "import fr.lip6.move.pnml.framework.utils.ModelRepository;" + NL + "import org.testng.annotations.*;";
  protected final String TEXT_15 = NL + "public class ";
  protected final String TEXT_16 = "HLAPITest {" + NL + "" + NL + "\t";
  protected final String TEXT_17 = NL + "\tprivate ";
  protected final String TEXT_18 = "HLAPI item";
  protected final String TEXT_19 = ";" + NL + "\t\t";
  protected final String TEXT_20 = " item";
  protected final String TEXT_21 = NL + "\t";
  protected final String TEXT_22 = ";" + NL + "\t";
  protected final String TEXT_23 = NL + NL + NL + "\t@AfterTest(groups = { \"";
  protected final String TEXT_24 = "HLAPI\", \"hlapi\" })" + NL + "\tpublic void After() {" + NL + "\t    System.out.println(\"done for \"+\"";
  protected final String TEXT_25 = "HLAPI(";
  protected final String TEXT_26 = ")\");" + NL + "\t}" + NL + "" + NL + "" + NL + "\t@BeforeMethod(groups = { \"";
  protected final String TEXT_27 = "HLAPI\", \"hlapi\" })" + NL + "\tpublic void setup() throws Exception{" + NL + "\t//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace(\"void\");" + NL + "\tModelRepository mr = ModelRepository.getInstance();" + NL + "\tmr.createDocumentWorkspace(\"void\");" + NL + "\t";
  protected final String TEXT_28 = NL + "\t\t\t";
  protected final String TEXT_29 = NL + "\t\t\t\t";
  protected final String TEXT_30 = NL + "\t\t\titem";
  protected final String TEXT_31 = " = new ";
  protected final String TEXT_32 = ".";
  protected final String TEXT_33 = "HLAPI(" + NL + "\t\t\t\tnew ";
  protected final String TEXT_34 = "().create";
  protected final String TEXT_35 = "()" + NL + "\t\t\t);" + NL + "\t\t\t\t";
  protected final String TEXT_36 = NL + "\t\t\t//";
  protected final String TEXT_37 = "HLAPI(new ";
  protected final String TEXT_38 = "());" + NL + "\t\t\t";
  protected final String TEXT_39 = NL + "\t\t";
  protected final String TEXT_40 = NL + "\t\titem";
  protected final String TEXT_41 = " = ";
  protected final String TEXT_42 = "HLAPI.get(0);" + NL + "\t\t";
  protected final String TEXT_43 = "(\"unid\");" + NL + "\t\t\t";
  protected final String TEXT_44 = "(\"0\");" + NL + "\t\t\t";
  protected final String TEXT_45 = NL + NL + "\t";
  protected final String TEXT_46 = ".hlapi.";
  protected final String TEXT_47 = "HLAPI(" + NL + "\t\t   new ";
  protected final String TEXT_48 = "()" + NL + "\t\t);" + NL + "\t\t\t";
  protected final String TEXT_49 = "());" + NL + "\t\t";
  protected final String TEXT_50 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values" + NL + "\t * excepted container." + NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_51 = "HLAPI\"}, dependsOnMethods={\"";
  protected final String TEXT_52 = "HLAPI_LLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_53 = "HLAPI_1()";
  protected final String TEXT_54 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_55 = "{//BEGIN CONSTRUCTOR BODY" + NL + "   @SuppressWarnings(\"unused\")" + NL + "\t";
  protected final String TEXT_56 = "HLAPI totest = new ";
  protected final String TEXT_57 = "\t,\t";
  protected final String TEXT_58 = ");" + NL + "\t";
  protected final String TEXT_59 = NL + "\tassert totest.";
  protected final String TEXT_60 = "().equals(item";
  protected final String TEXT_61 = ".getContainedItem());" + NL + "\t";
  protected final String TEXT_62 = NL + "\t}" + NL;
  protected final String TEXT_63 = NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values, including container if any." + NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_64 = "HLAPI_2_";
  protected final String TEXT_65 = "()";
  protected final String TEXT_66 = "{//BEGIN CONSTRUCTOR BODY" + NL + "" + NL + "\t";
  protected final String TEXT_67 = ",\t";
  protected final String TEXT_68 = NL + "\t);" + NL + "\t";
  protected final String TEXT_69 = NL + "\t\t\tassert totest.";
  protected final String TEXT_70 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_71 = ");" + NL + "\t\t";
  protected final String TEXT_72 = ".getContainedItem());" + NL + "\t}";
  protected final String TEXT_73 = NL + NL + "\t/**" + NL + "    * This constructor give access to required stuff only (not container if any)" + NL + "    */";
  protected final String TEXT_74 = NL + "   @Test(groups = { \"hlapi\", \"";
  protected final String TEXT_75 = "HLAPI_3()";
  protected final String TEXT_76 = ");" + NL + "" + NL + "\t";
  protected final String TEXT_77 = NL + "\t}";
  protected final String TEXT_78 = NL;
  protected final String TEXT_79 = NL + "\t/**" + NL + "    * This constructor give access to required stuff only (and container)" + NL + "    */" + NL + "   @Test(groups = { \"hlapi\", \"";
  protected final String TEXT_80 = "HLAPI_4_";
  protected final String TEXT_81 = NL + "\t  item";
  protected final String TEXT_82 = NL + "\t);" + NL + "" + NL + "\t";
  protected final String TEXT_83 = NL + "\t/**" + NL + "\t * This constructor creates a clone of the given object." + NL + "\t * Be carefull, this clone do not inherits of contrainers or unsettable features.";
  protected final String TEXT_84 = NL + "\t *" + NL + "\t * <strong>Warning : this cloning constructor override the constructor who set ";
  protected final String TEXT_85 = "HLAPI container. If you want to set this container please use the container setter.</strong>";
  protected final String TEXT_86 = NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_87 = "HLAPI_clone() throws Exception{" + NL + "\t";
  protected final String TEXT_88 = "HLAPI old = new ";
  protected final String TEXT_89 = "());" + NL + "\t";
  protected final String TEXT_90 = NL + "\t\t\told.set";
  protected final String TEXT_91 = "(item";
  protected final String TEXT_92 = "HLAPI(old);" + NL + "\t";
  protected final String TEXT_93 = NL + " \t\tassert totest.";
  protected final String TEXT_94 = "().equals(old.";
  protected final String TEXT_95 = NL + NL + "\t/**" + NL + "\t * This constructor encapsulate a low level API object in HLAPI." + NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_96 = "HLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_97 = "HLAPI_LLAPI(){" + NL + "\t   ";
  protected final String TEXT_98 = " llapi = new ";
  protected final String TEXT_99 = "();" + NL + "\t   ";
  protected final String TEXT_100 = " hlapi = new ";
  protected final String TEXT_101 = "HLAPI(llapi);" + NL + "\t\tassert hlapi.getContainedItem().equals(llapi);" + NL + "\t}" + NL + "" + NL + "\t//getters giving HLAPI object";
  protected final String TEXT_102 = NL + "\t\t/**" + NL + "\t\t * This accessor automatically encapsulate an element of the current object." + NL + "\t\t * WARNING : this creates a new object in memory." + NL + "\t\t * @return : null if the element is null" + NL + "\t\t */" + NL + "\t\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_103 = "HLAPI\"})" + NL + "\t\tpublic void ";
  protected final String TEXT_104 = "HLAPITest(){" + NL + "\t\t\t";
  protected final String TEXT_105 = "HLAPI elem = new ";
  protected final String TEXT_106 = "());" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_107 = NL + "\t\t\t\telem.set";
  protected final String TEXT_108 = "()));" + NL + "\t\t\t\t";
  protected final String TEXT_109 = "HLAPI totest_";
  protected final String TEXT_110 = "_";
  protected final String TEXT_111 = " = elem.";
  protected final String TEXT_112 = "HLAPI();" + NL + "\t\t\t\tassert totest_";
  protected final String TEXT_113 = ".getContainedItem().equals(elem.";
  protected final String TEXT_114 = "HLAPI(item";
  protected final String TEXT_115 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_116 = "HLAPI totest = elem.";
  protected final String TEXT_117 = "HLAPI();" + NL + "\t\t\t\tassert totest.getContainedItem().equals(elem.";
  protected final String TEXT_118 = NL + "\t\t}" + NL + "\t";
  protected final String TEXT_119 = NL + "\t\t/**" + NL + "\t\t * This test add a random number of desired objet in the list or of one of each existing subtypes." + NL + "\t\t * then test how many objet are retuned and if any exist inthe original list." + NL + "\t\t */" + NL + "\t\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_120 = "();" + NL + "\t\t\tint howmany;" + NL + "\t\t\t";
  protected final String TEXT_121 = NL + "\t\t\tllapi.";
  protected final String TEXT_122 = "().add(" + NL + "\t\t\t   new ";
  protected final String TEXT_123 = "()" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_124 = NL + "\t\t\thowmany = ";
  protected final String TEXT_125 = ";" + NL + "\t\t\t";
  protected final String TEXT_126 = NL + "\t\t\thowmany = (int)(Math.random()*10);" + NL + "\t\t\tfor(int i =0; i<howmany;i++)" + NL + "\t\t\tllapi.";
  protected final String TEXT_127 = "().add(new ";
  protected final String TEXT_128 = NL + NL + "\t\t\t";
  protected final String TEXT_129 = "HLAPI(llapi);" + NL + "\t\t\tList<";
  protected final String TEXT_130 = "HLAPI> totest = elem.";
  protected final String TEXT_131 = "HLAPI();" + NL + "" + NL + "\t\t\tassert totest.size() == howmany;" + NL + "" + NL + "\t\t\tfor (";
  protected final String TEXT_132 = "HLAPI unit : totest) {" + NL + "             assert llapi.";
  protected final String TEXT_133 = "().contains(unit.getContainedItem()) : \"missing element\";" + NL + "         }" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_134 = NL + NL + "\t//Special getter for list of generics object, return only one object type." + NL + "\t";
  protected final String TEXT_135 = NL + "\t\t/**" + NL + "\t\t * This test add a random number (1..10) of wanting output objets" + NL + "\t\t * Then add one of all possible objet in the list." + NL + "\t\t * It test the number of wanted objet returned by the methods, and if any object really exist in the original list." + NL + "\t\t */" + NL + "\t\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_136 = "();" + NL + "\t\t\tint howmany;" + NL + "" + NL + "\t\t\thowmany = (int)(Math.random()*10);" + NL + "\t\t\tfor(int i =0; i<howmany;i++)" + NL + "\t\t\tllapi.";
  protected final String TEXT_137 = NL + "\t\t\thowmany += ";
  protected final String TEXT_138 = ";" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_139 = "HLAPI();" + NL + "" + NL + "\t\t\tassert totest.size() == howmany + 1 - ";
  protected final String TEXT_140 = ";" + NL + "" + NL + "\t\t\tfor (";
  protected final String TEXT_141 = "().contains(unit.getContainedItem()) : \"missing element\";" + NL + "         }" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_142 = NL + NL + "\t//setters/remover for lists." + NL + "\t";
  protected final String TEXT_143 = NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_144 = "HLAPI\"})" + NL + "\tpublic void add";
  protected final String TEXT_145 = "HLAPITest(){" + NL + "\t\t";
  protected final String TEXT_146 = "());" + NL + "\t\tint howmany = (int)(Math.random()*10);" + NL + "\t\tfor(int i =0; i<howmany;i++)" + NL + "\t\t\t";
  protected final String TEXT_147 = NL + "\t\t\telem.add";
  protected final String TEXT_148 = "HLAPI(" + NL + "\t\t\t\t\tnew ";
  protected final String TEXT_149 = "()" + NL + "\t\t\t\t)" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_150 = "()));" + NL + "\t\t\t";
  protected final String TEXT_151 = NL + NL + "\t\tassert elem.getContainedItem().";
  protected final String TEXT_152 = "().size() == howmany;" + NL + "\t}" + NL + "" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_153 = "HLAPI\"})" + NL + "\tpublic void remove";
  protected final String TEXT_154 = "Test(){" + NL + "\t\t";
  protected final String TEXT_155 = "());" + NL + "\t\tint howmany = (int)(Math.random()*10);" + NL + "\t\tint howdiff = (int)(Math.random()*10);" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_156 = "HLAPI sav;" + NL + "\t\t\t";
  protected final String TEXT_157 = "HLAPI sav;";
  protected final String TEXT_158 = NL + NL + "\t\tfor(int i =0; i<(howmany);i++)" + NL + "\t\t\t";
  protected final String TEXT_159 = "HLAPI(" + NL + "\t\t\t\t  new ";
  protected final String TEXT_160 = NL + NL + NL + "\t\t";
  protected final String TEXT_161 = NL + "\t\tsav =" + NL + "\t\t\tnew ";
  protected final String TEXT_162 = "HLAPI(" + NL + "\t\t\t  new ";
  protected final String TEXT_163 = "()" + NL + "\t\t\t);" + NL + "\t\t";
  protected final String TEXT_164 = NL + "\t\tsav = new ";
  protected final String TEXT_165 = NL + NL + "\t\telem.add";
  protected final String TEXT_166 = "HLAPI(sav);" + NL + "\t\tassert elem.getContainedItem().";
  protected final String TEXT_167 = "().size() == howmany+1;" + NL + "" + NL + "\t\tfor(int i =0; i<(howdiff);i++)" + NL + "\t\t\t";
  protected final String TEXT_168 = NL + NL + NL + "\t\telem.remove";
  protected final String TEXT_169 = "HLAPI(sav);" + NL + "" + NL + "\t\tassert elem.getContainedItem().";
  protected final String TEXT_170 = "().size() == howmany+howdiff;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_171 = NL + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_172 = "HLAPI\"})" + NL + "\tpublic void equalsTest(){" + NL + "\t\t";
  protected final String TEXT_173 = " a = new ";
  protected final String TEXT_174 = "();" + NL + "\t\t";
  protected final String TEXT_175 = " b = new ";
  protected final String TEXT_176 = "HLAPI aprime = new ";
  protected final String TEXT_177 = "HLAPI(a);" + NL + "\t\t";
  protected final String TEXT_178 = "HLAPI asecond = new ";
  protected final String TEXT_179 = "HLAPI bprime = new ";
  protected final String TEXT_180 = "HLAPI(b);" + NL + "" + NL + "\t\tassert aprime.equals(asecond);" + NL + "\t\tassert !aprime.equals(bprime);" + NL + "\t}" + NL + "" + NL + "\t//cloning method" + NL + "\t//public ";
  protected final String TEXT_181 = "HLAPI clone(){" + NL + "\t//\treturn new ";
  protected final String TEXT_182 = "HLAPI(this);" + NL + "\t//}" + NL + "" + NL + "\t//PNML" + NL + "\t";
  protected final String TEXT_183 = NL + "\t/**" + NL + "\t * return the PNML xml tree for this object." + NL + "\t */" + NL + "\t//public String toPNML(){" + NL + "\t\t//return item.toPNML();" + NL + "\t//}" + NL + "" + NL + "\t/**" + NL + "\t * creates an object from the xml nodes.(symetric work of toPNML)" + NL + "\t */" + NL + "\t//public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{" + NL + "\t\t//item.fromPNML(subRoot,idr);" + NL + "\t//}" + NL + "\t";
  protected final String TEXT_184 = NL + "}";
  protected final String TEXT_185 = NL + "//public interface ";
  protected final String TEXT_186 = "HLAPI extends HLAPIClass{}" + NL + "public interface ";
  protected final String TEXT_187 = "HLAPITest extends HLAPIClass{" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    final String ToPNMLNsURI = "http://www.pnml.org/models/ToPNML";
    final GenClass genClass = (GenClass)argument;
    final GenPackage genPackage = genClass.getGenPackage();
    final GenModel genModel=genPackage.getGenModel();
    final List<GenFeature> mySetters = new ArrayList<GenFeature>();//do not include container setter
    final List<GenFeature> myContainers = new ArrayList<GenFeature>();//tofix : always one element list
    final List<GenFeature> myGetters = new ArrayList<GenFeature>();
    final List<GenFeature> myRequired = new ArrayList<GenFeature>();
    final List<GenFeature> myRequiredLight = new ArrayList<GenFeature>();
    final List<GenFeature> myLists = new ArrayList<GenFeature>();
    final List<GenFeature> allgenf = genClass.getAllGenFeatures();
    final List<GenFeature> theId = new ArrayList<GenFeature>();
    boolean first = true;
    boolean clonedupWarn = false;
    for (GenFeature genFeature : allgenf) {
	if (genFeature.isSet()&&!genFeature.isContainer()) {
		mySetters.add(genFeature);//real setters
	}
	if (genFeature.isSet()&&genFeature.isContainer()) {
		myContainers.add(genFeature);//container setter
	}
	if (genFeature.isGet()) {
		myGetters.add(genFeature);//getter
	}
	if(genFeature.isSet()&&genFeature.getEcoreFeature().isRequired()){
		myRequired.add(genFeature);//required and settable
	}
	if(genFeature.isSet()&&genFeature.getEcoreFeature().isRequired()&&!genFeature.isContainer()){
		myRequiredLight.add(genFeature);//required and settable but not container
	}
	if(genFeature.isEffectiveContains() && genFeature.isListType()){
		myLists.add(genFeature);
	}

	EAnnotation ea = genFeature.getEcoreFeature().getEAnnotation(ToPNMLNsURI);
	if(ea!=null
			&&	ea.getDetails().get("kind") != null
			&& ea.getDetails().get("kind").equals("id")){
		theId.add(genFeature);
	}

}
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_6);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_8);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_9);
    for (GenPackage gp : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(gp.getInterfacePackageName());
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getGenPackage().getClassPackageName());
    stringBuffer.append(TEXT_14);
    if(!genClass.isAbstract()){
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_16);
    for (GenFeature genFeature : mySetters) {
      if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_19);
    }else{
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_19);
    }
	}
    stringBuffer.append(TEXT_21);
    for (GenFeature genFeature : myContainers) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass.getGenPackage().getNSName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_27);
    for (GenFeature genFeature : mySetters) {
		if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_28);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_29);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_35);
    break;
				}
    stringBuffer.append(TEXT_28);
    }else{
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    }else if(genFeature.isEnumType()){
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_42);
    }else{//simple types
			if(genFeature.getImportedType(genClass).equals("String")){
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_43);
    }else{
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_44);
    }
		}
	}
    stringBuffer.append(TEXT_45);
    for (GenFeature genFeature : myContainers) {
    stringBuffer.append(TEXT_39);
    if(genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_28);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_28);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_48);
     break;
			}
    stringBuffer.append(TEXT_39);
    }else{
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_50);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_53);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_55);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    	first = true;
	for (GenFeature genFeature : mySetters) {
	if (!first) { 
    stringBuffer.append(TEXT_57);
    } else {first = false;}
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_58);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_21);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_21);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_61);
    }else{
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_62);
    for (GenFeature mycont : myContainers) {
    if(!mycont.getEcoreFeature().getEType().getName().equals(genClass.getInterfaceName())||mySetters.size()!=0){
    stringBuffer.append(TEXT_63);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_65);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    	first = true;
	for (GenFeature genFeature : mySetters) {
		if (!first) { 
    stringBuffer.append(TEXT_57);
    } else {first = false;}
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_21);
    }
    
		if (!first) { 
    stringBuffer.append(TEXT_67);
    } else {first = false;}
    stringBuffer.append(TEXT_40);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_68);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_21);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_39);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_70);
    }else{
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_59);
    stringBuffer.append(mycont.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_72);
    }else{clonedupWarn=true;}//end if
    }//end for
    stringBuffer.append(TEXT_73);
    if(myRequiredLight.size()!=0&&!myRequiredLight.equals(mySetters)){
    stringBuffer.append(TEXT_74);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_75);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    	first = true;
	for (GenFeature genFeature : myRequiredLight) {
	if (!first) { 
    stringBuffer.append(TEXT_57);
    } else {first = false;}
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_76);
    for (GenFeature genFeature : myRequiredLight) {
    stringBuffer.append(TEXT_21);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_39);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_70);
    }else{
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_77);
    }
    stringBuffer.append(TEXT_78);
    for (GenFeature mycont : myContainers) {
    if(myContainers.size()!=0&&!mySetters.equals(myRequiredLight)){
    stringBuffer.append(TEXT_79);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_65);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    	first = true;
	for (GenFeature genFeature : myRequiredLight) {
	if (!first) { 
    stringBuffer.append(TEXT_57);
    } else {first = false;}
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_21);
    }
    
		if (!first) { 
    stringBuffer.append(TEXT_67);
    } else {first = false;}
    stringBuffer.append(TEXT_81);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_82);
    for (GenFeature genFeature : myRequiredLight) {
    stringBuffer.append(TEXT_21);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_39);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_70);
    }else{
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_59);
    stringBuffer.append(mycont.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_72);
    }
    }
    stringBuffer.append(TEXT_78);
    if(false){//Censored code, don't work as expected
    stringBuffer.append(TEXT_83);
    if(clonedupWarn){
    stringBuffer.append(TEXT_84);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_89);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_39);
    if(genFeature.isEnumType()){
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_70);
    }else{
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_92);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_89);
    	 }
    stringBuffer.append(TEXT_77);
    }
    stringBuffer.append(TEXT_95);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append( Helpers.hlapiFullClassName(genClass));
    stringBuffer.append(TEXT_100);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_101);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_21);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_45);
    if(!genFeature.isListType()){
    stringBuffer.append(TEXT_39);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_102);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_104);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_106);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(sony.getGenPackage().getNSName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(sony.getGenPackage().getNSName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_38);
    }
			}else{
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_118);
    }else{
    stringBuffer.append(TEXT_119);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_104);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_120);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			int total=0;
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_123);
    ;total++;}
    stringBuffer.append(TEXT_124);
    stringBuffer.append(total);
    stringBuffer.append(TEXT_125);
    }else{
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_133);
    }
    }//end for
    stringBuffer.append(TEXT_134);
    for (GenFeature genFeature : myGetters) {
	if(genFeature.getTypeGenClass()==null) continue;
	if(genFeature.isListType() && genFeature.getTypeGenClass().isAbstract()
		  && genClass.getChildrenClasses(genFeature).size()!=0){
    stringBuffer.append(TEXT_39);
     for (GenClass sony : genClass.getChildrenClasses(genFeature)) { 
    stringBuffer.append(TEXT_39);
     String addname = "";
			if(genModel.getAllGenPackagesWithClassifiers().size()!=1) {addname = sony.getGenPackage().getNSName() + "_";}
    stringBuffer.append(TEXT_135);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_38);
    int total=0;
			for (GenClass sony2 : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(sony2.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony2.getName());
    stringBuffer.append(TEXT_123);
    ;total++;}
    stringBuffer.append(TEXT_137);
    stringBuffer.append(total);
    stringBuffer.append(TEXT_138);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(total);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_141);
    }//for
    stringBuffer.append(TEXT_21);
    }//if
    stringBuffer.append(TEXT_21);
    }//for
    stringBuffer.append(TEXT_142);
    for (GenFeature genFeature : myLists) {
    stringBuffer.append(TEXT_143);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_146);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_149);
     break;}
			}else{
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_152);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_155);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_156);
     break;}
			}else{
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_149);
     break;}
			}else{
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_160);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
		for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_163);
     break;}
		}else{
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_167);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_149);
     break;}
			}else{
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_174);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_178);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_179);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_180);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_181);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_182);
    EClassifier classifier = genClass.getEcoreClassifier();
	EAnnotation ean = classifier.getEAnnotation(ToPNMLNsURI);
	if(ean!=null){
    stringBuffer.append(TEXT_183);
    }
    stringBuffer.append(TEXT_184);
    }else{
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_187);
    }
    stringBuffer.append(TEXT_78);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
