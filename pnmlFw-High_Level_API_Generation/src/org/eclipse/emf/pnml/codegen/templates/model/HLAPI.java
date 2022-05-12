package org.eclipse.emf.pnml.codegen.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.ecore.*;
import fr.lip6.move.pnml.framework.apigen.Helpers;

public class HLAPI
{
  protected static String nl;
  public static synchronized HLAPI create(String lineSeparator)
  {
    nl = lineSeparator;
    HLAPI result = new HLAPI();
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
  protected final String TEXT_12 = NL + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "import java.nio.ByteBuffer;" + NL + "import java.nio.channels.FileChannel;" + NL + "import java.nio.charset.Charset;" + NL + "import org.apache.axiom.om.*;" + NL + "import fr.lip6.move.pnml.framework.utils.IdRefLinker;" + NL + "import org.eclipse.emf.common.util.DiagnosticChain;" + NL + "import ";
  protected final String TEXT_13 = ".*;" + NL + "import ";
  protected final String TEXT_14 = ".*;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;" + NL + "import fr.lip6.move.pnml.framework.utils.exception.OtherException;" + NL + "import fr.lip6.move.pnml.framework.utils.IdRepository;" + NL + "import fr.lip6.move.pnml.framework.utils.ModelRepository;" + NL;
  protected final String TEXT_15 = NL + NL + "public class ";
  protected final String TEXT_16 = "HLAPI implements ";
  protected final String TEXT_17 = "HLAPIRootClass";
  protected final String TEXT_18 = "HLAPIClass";
  protected final String TEXT_19 = ",";
  protected final String TEXT_20 = "HLAPI";
  protected final String TEXT_21 = "{" + NL + "" + NL + "\t/**" + NL + "\t * The contained LLAPI element." + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_22 = " item;" + NL + "" + NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values" + NL + "\t * excepted container." + NL + "\t */" + NL + "\t";
  protected final String TEXT_23 = NL + "\t";
  protected final String TEXT_24 = "public ";
  protected final String TEXT_25 = "HLAPI(";
  protected final String TEXT_26 = NL + "\t\t";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = "HLAPI ";
  protected final String TEXT_29 = ")";
  protected final String TEXT_30 = " throws InvalidIDException ,VoidRepositoryException ";
  protected final String TEXT_31 = "{//BEGIN CONSTRUCTOR BODY" + NL + "\t\t";
  protected final String TEXT_32 = " fact = ";
  protected final String TEXT_33 = ".eINSTANCE;" + NL + "\t\tsynchronized(fact){item = fact.create";
  protected final String TEXT_34 = "();}" + NL + "\t";
  protected final String TEXT_35 = NL + " \t\t";
  protected final String TEXT_36 = NL + " \t\tif(";
  protected final String TEXT_37 = "!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_38 = "((";
  protected final String TEXT_39 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_40 = NL + "\t\t\tif(";
  protected final String TEXT_41 = "!=null){" + NL + "\t\t\t";
  protected final String TEXT_42 = NL + "\t\t\t\titem.set";
  protected final String TEXT_43 = "(ModelRepository.getInstance().getCurrentIdRepository().checkId(";
  protected final String TEXT_44 = ", this));" + NL + "\t\t\t";
  protected final String TEXT_45 = "(";
  protected final String TEXT_46 = ");" + NL + "\t\t\t";
  protected final String TEXT_47 = "}" + NL + "\t\t";
  protected final String TEXT_48 = NL + "\t}" + NL;
  protected final String TEXT_49 = NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values, including container if any." + NL + "\t */" + NL + "\t";
  protected final String TEXT_50 = NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "    * This constructor give access to required stuff only (not container if any)" + NL + "    */";
  protected final String TEXT_52 = NL + "\t/**" + NL + "    * This constructor give access to required stuff only (and container)" + NL + "    */";
  protected final String TEXT_53 = NL + "\t}" + NL + "\t";
  protected final String TEXT_54 = NL + NL + "\t/**" + NL + "\t * This constructor encapsulate a low level API object in HLAPI." + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_55 = " lowLevelAPI){" + NL + "\t\titem = lowLevelAPI;" + NL + "\t}" + NL + "" + NL + "\t// access to low level API" + NL + "\t/**" + NL + "\t * Return encapsulated object" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_56 = " getContainedItem(){" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\t//getters giving LLAPI object" + NL + "\t";
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * Return the encapsulate Low Level API object." + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_58 = "(){" + NL + "\t\treturn item.";
  protected final String TEXT_59 = "();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_60 = NL + NL + "\t//getters giving HLAPI object" + NL + "\t";
  protected final String TEXT_61 = NL + "\t\t/**" + NL + "\t\t * This accessor automatically encapsulate an element of the current object." + NL + "\t\t * WARNING : this creates a new object in memory." + NL + "\t\t * @return : null if the element is null" + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_62 = NL + "\t\tpublic ";
  protected final String TEXT_63 = "HLAPI(){" + NL + "\t\t\tif(item.";
  protected final String TEXT_64 = "() == null) return null;" + NL + "\t\t\t";
  protected final String TEXT_65 = " object = item.";
  protected final String TEXT_66 = "();" + NL + "\t\t\t";
  protected final String TEXT_67 = NL + "\t\t\tif(object.getClass().equals(";
  protected final String TEXT_68 = ".";
  protected final String TEXT_69 = ".class)){" + NL + "\t\t\t\treturn new ";
  protected final String TEXT_70 = ".hlapi.";
  protected final String TEXT_71 = "HLAPI((";
  protected final String TEXT_72 = ")object);" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_73 = NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_74 = "() == null) return null;" + NL + "\t\t\treturn new ";
  protected final String TEXT_75 = "HLAPI(item.";
  protected final String TEXT_76 = "());" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_77 = NL + "\t\t/**" + NL + "\t\t * This accessor automatically encapsulate all elements of the selected sublist." + NL + "\t\t * WARNING : this can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_78 = NL + "\t\t\t";
  protected final String TEXT_79 = NL + "\t\tpublic java.util.List<";
  protected final String TEXT_80 = "HLAPI> ";
  protected final String TEXT_81 = "HLAPI(){" + NL + "\t\t\tjava.util.List<";
  protected final String TEXT_82 = "HLAPI> retour = new ArrayList<";
  protected final String TEXT_83 = "HLAPI>();" + NL + "\t\t\tfor (";
  protected final String TEXT_84 = " elemnt : ";
  protected final String TEXT_85 = "()) {" + NL + "\t\t\t\t";
  protected final String TEXT_86 = NL + "\t\t\t\tif(elemnt.getClass().equals(";
  protected final String TEXT_87 = ".class)){" + NL + "\t\t\t\t\tretour.add(new ";
  protected final String TEXT_88 = "HLAPI(" + NL + "\t\t\t\t\t\t(";
  protected final String TEXT_89 = ")elemnt" + NL + "\t\t\t\t\t\t));" + NL + "\t\t\t\t\tcontinue;" + NL + "\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_90 = NL + "\t\t\t}" + NL + "\t\t\treturn retour;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_91 = "()) {" + NL + "\t\t\t\tretour.add(new ";
  protected final String TEXT_92 = "HLAPI(elemnt));" + NL + "\t\t\t}" + NL + "\t\t\treturn retour;" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_93 = NL + NL + "\t//Special getter for list of generics object, return only one object type." + NL + "\t";
  protected final String TEXT_94 = NL + "\t\t/**" + NL + "\t\t * This accessor return a list of encapsulated subelement, only of ";
  protected final String TEXT_95 = "HLAPI kind." + NL + "\t\t * WARNING : this method can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\tpublic java.util.List<";
  protected final String TEXT_96 = "_";
  protected final String TEXT_97 = "()) {" + NL + "\t\t\t\tif(elemnt.getClass().equals(";
  protected final String TEXT_98 = ")elemnt" + NL + "\t\t\t\t\t\t));" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn retour;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_99 = NL + NL + "\t//setters (including container setter if aviable)" + NL + "\t";
  protected final String TEXT_100 = NL + "\t/**" + NL + "\t * set ";
  protected final String TEXT_101 = NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_102 = "HLAPI(" + NL + "\t";
  protected final String TEXT_103 = "HLAPI elem";
  protected final String TEXT_104 = " elem";
  protected final String TEXT_105 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_106 = "{" + NL + "\t";
  protected final String TEXT_107 = NL + " \t\tif(elem!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_108 = ")elem.getContainedItem());" + NL + "\t";
  protected final String TEXT_109 = NL + "\t\tif(elem!=null){" + NL + "\t\t";
  protected final String TEXT_110 = NL + "\t\t\ttry{" + NL + "\t\t\titem.set";
  protected final String TEXT_111 = "(ModelRepository.getInstance().getCurrentIdRepository().changeId(this, elem));" + NL + "\t\t\t}catch (OtherException e){" + NL + "\t\t\tModelRepository.getInstance().getCurrentIdRepository().checkId(elem, this);" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_112 = NL + "\t\t\titem.set";
  protected final String TEXT_113 = "(elem);" + NL + "\t\t";
  protected final String TEXT_114 = "}" + NL + "\t";
  protected final String TEXT_115 = NL + NL + "\t//setters/remover for lists." + NL + "\t";
  protected final String TEXT_116 = NL + "\t//Thread-safe insertion of objects in a Page" + NL + "\tpublic synchronized void add";
  protected final String TEXT_117 = "HLAPI unit){" + NL + "\t";
  protected final String TEXT_118 = NL + "\tpublic void add";
  protected final String TEXT_119 = NL + "\t\titem.";
  protected final String TEXT_120 = "().add((";
  protected final String TEXT_121 = ")unit.getContainedItem());" + NL + "\t}" + NL + "" + NL + "\tpublic void remove";
  protected final String TEXT_122 = "HLAPI unit){" + NL + "\t\titem.";
  protected final String TEXT_123 = "().remove((";
  protected final String TEXT_124 = ")unit.getContainedItem());" + NL + "\t}" + NL + "\t";
  protected final String TEXT_125 = NL + NL + "\t//equals method" + NL + "\tpublic boolean equals(";
  protected final String TEXT_126 = "HLAPI item){" + NL + "\t\treturn item.getContainedItem().equals(getContainedItem());" + NL + "\t}" + NL + "" + NL + "\t//PNML" + NL + "\t";
  protected final String TEXT_127 = NL + "\t/**" + NL + "\t * Returns the PNML xml tree for this object." + NL + "\t */" + NL + "\tpublic String toPNML(){" + NL + "\t\treturn item.toPNML();" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Writes the PNML XML tree of this object into file channel." + NL + "\t */" + NL + "\tpublic void toPNML(FileChannel fc){" + NL + "\t\t item.toPNML(fc);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * creates an object from the xml nodes.(symetric work of toPNML)" + NL + "\t */" + NL + "\tpublic void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{" + NL + "\t\titem.fromPNML(subRoot,idr);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_128 = NL + NL + "\tpublic boolean validateOCL(DiagnosticChain diagnostics){" + NL + "\t\treturn item.validateOCL(diagnostics);" + NL + "\t}" + NL + "" + NL + "}";
  protected final String TEXT_129 = NL + "public interface ";
  protected final String TEXT_130 = "HLAPI extends ";
  protected final String TEXT_131 = "{" + NL + "" + NL + "\t//getters giving LLAPI object" + NL + "\t";
  protected final String TEXT_132 = NL + "\t/**" + NL + "\t *" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_133 = "();" + NL + "\t";
  protected final String TEXT_134 = NL + "\t\t/**" + NL + "\t\t * This accessor automaticaly encapsulate an element of the current object." + NL + "\t\t * WARNING : this creates a new object in memory." + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_135 = "HLAPI();" + NL + "\t\t";
  protected final String TEXT_136 = NL + "\t\t/**" + NL + "\t\t * This accessor automaticaly encapsulate all elements of the selected sublist." + NL + "\t\t * WARNING : this can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_137 = " throws InvalidIDException ,VoidRepositoryException";
  protected final String TEXT_138 = ";" + NL + "\t";
  protected final String TEXT_139 = NL + NL + "\t";
  protected final String TEXT_140 = NL + NL + NL + "\t//setters/remover for lists." + NL + "\t";
  protected final String TEXT_141 = "HLAPI unit);" + NL + "\tpublic void remove";
  protected final String TEXT_142 = "HLAPI unit);" + NL + "\t";
  protected final String TEXT_143 = NL + NL + "\t//equals method" + NL + "\tpublic boolean equals(Object item);" + NL + "" + NL + "}";

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
    final List<GenFeature> myRequiredLight = new ArrayList<GenFeature>();//required without containers
    final List<GenFeature> myLists = new ArrayList<GenFeature>();
    final List<GenFeature> allgenf = genClass.getAllGenFeatures();
    final List<GenFeature> theId = new ArrayList<GenFeature>();
    final String HLAPINsURI = "http://www.pnml.org/models/HLAPI";
    List<GenFeature> featureList;
    for (GenFeature genFeature : allgenf) {
	//we need to know what feature is a container what is settable, what is an id...

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
    final List<GenClass> implem = genClass.getExtendedGenClasses();
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
    if(genClass.getInterfaceName().equals("PetriNetDoc")){
    stringBuffer.append(TEXT_17);
    }else{
    stringBuffer.append(TEXT_18);
    }
    for (Iterator<GenClass> iterator = implem.iterator(); iterator.hasNext();) {
GenClass genFeature2 = (GenClass) iterator.next();
if(genFeature2.getEcoreClassifier().getEAnnotation(HLAPINsURI)!=null&&(genFeature2.isInterface()||genFeature2.isAbstract())){
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genFeature2.getName());
    stringBuffer.append(TEXT_20);
    }}
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_22);
    featureList=mySetters;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_29);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_34);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_35);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_39);
    }else{
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_44);
    }else{
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_48);
    for (GenFeature mycont : myContainers) {
    if(!mycont.getEcoreFeature().getEType().getName().equals(genClass.getInterfaceName())||mySetters.size()!=0){
	java.util.List<GenFeature> copymySetters = new ArrayList<GenFeature>();
	copymySetters.addAll(mySetters);
	copymySetters.add(mycont);

    stringBuffer.append(TEXT_49);
    featureList=copymySetters;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_29);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_34);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_35);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_39);
    }else{
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_44);
    }else{
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_48);
    }//end if
    }//end for
    stringBuffer.append(TEXT_50);
    if(myRequiredLight.size()!=0&&!myRequiredLight.equals(mySetters)){
    stringBuffer.append(TEXT_51);
    featureList=myRequiredLight;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_29);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_34);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_35);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_39);
    }else{
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_44);
    }else{
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_50);
    for (GenFeature mycont : myContainers) {
    stringBuffer.append(TEXT_23);
    if(myContainers.size()!=0&&!mySetters.equals(myRequiredLight)){
		List<GenFeature> copymyRequiredLight = new ArrayList<GenFeature>();
		copymyRequiredLight.addAll(myRequiredLight);
		copymyRequiredLight.add(mycont);
	
    stringBuffer.append(TEXT_52);
    featureList=copymyRequiredLight;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_29);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_34);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_35);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_39);
    }else{
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_44);
    }else{
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_53);
    }
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_56);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    }//end for
    stringBuffer.append(TEXT_60);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_23);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_23);
    if(!genFeature.isListType()){
    stringBuffer.append(TEXT_61);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_26);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_66);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_67);
    stringBuffer.append(sony.getGenPackage().getBasePackage());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getGenPackage().getNSName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getGenPackage().getClassPackageSuffix());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getClassName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_72);
    }//for
    stringBuffer.append(TEXT_73);
    }else{
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_76);
    }//isAbstract
    stringBuffer.append(TEXT_23);
    }else{
    stringBuffer.append(TEXT_77);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_78);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_85);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(sony.getGenPackage().getClassPackageName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getClassName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_89);
    }//for
    stringBuffer.append(TEXT_90);
    }else{
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_92);
    }//isAbstract
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_23);
    }//end for
    stringBuffer.append(TEXT_93);
    for (GenFeature genFeature : myGetters) {
	if(genFeature.getTypeGenClass()==null) continue;
	if(genFeature.isListType() && genFeature.getTypeGenClass().isAbstract()
		  && genClass.getChildrenClasses(genFeature).size()!=0){
    stringBuffer.append(TEXT_26);
     for (GenClass sony : genClass.getChildrenClasses(genFeature)) { 
    stringBuffer.append(TEXT_26);
     String addname = "";
			if(genModel.getAllGenPackagesWithClassifiers().size()!=1) {addname = sony.getGenPackage().getNSName() + "_";}
    stringBuffer.append(TEXT_94);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(sony.getGenPackage().getClassPackageName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getClassName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_98);
    }//for
    stringBuffer.append(TEXT_23);
    }//if
    stringBuffer.append(TEXT_23);
    }//for
    stringBuffer.append(TEXT_99);
    final List<GenFeature> allSetters = new ArrayList<GenFeature>();
	allSetters.addAll(mySetters);
	allSetters.addAll(myContainers);
    stringBuffer.append(TEXT_23);
    for (GenFeature genFeature : allSetters) {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_102);
    if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_103);
    }else{
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_29);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_105);
    }
    stringBuffer.append(TEXT_106);
    EAnnotation ea = genFeature.getEcoreFeature().getEAnnotation(ToPNMLNsURI);
    stringBuffer.append(TEXT_23);
    if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_108);
     }else{//this element is one of a standard types (String etc...) 
    stringBuffer.append(TEXT_109);
    if(ea!=null
			&&	ea.getDetails().get("kind") != null
			&& ea.getDetails().get("kind").equals("id")){
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_111);
    }else{
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_113);
    }
    stringBuffer.append(TEXT_114);
     } 
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_115);
    for (GenFeature genFeature : myLists) {
    stringBuffer.append(TEXT_23);
    if ("Page".equalsIgnoreCase(genClass.getInterfaceName())){
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_117);
    } else {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_117);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_126);
    EClassifier classifier = genClass.getEcoreClassifier();
	EAnnotation ean = classifier.getEAnnotation(ToPNMLNsURI);
	if(ean!=null){
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    }else{
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_130);
    if(genClass.getInterfaceName().equals("PetriNetDoc")){
    stringBuffer.append(TEXT_17);
    }else{
    stringBuffer.append(TEXT_18);
    }
    for (Iterator<GenClass> iterator = implem.iterator(); iterator.hasNext();) {
GenClass genFeature2 = (GenClass) iterator.next();
if(genFeature2.getEcoreClassifier().getEAnnotation(HLAPINsURI)!=null&&(genFeature2.isInterface()||genFeature2.isAbstract())){
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genFeature2.getName());
    stringBuffer.append(TEXT_20);
    }}
    stringBuffer.append(TEXT_131);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_133);
    }//end for
    stringBuffer.append(TEXT_60);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_23);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_23);
    if(!genFeature.isListType()){
    stringBuffer.append(TEXT_134);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_26);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    }else{
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    }//isAbstract
    stringBuffer.append(TEXT_23);
    }else{
    stringBuffer.append(TEXT_136);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_26);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    }else{
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    }//isAbstract
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_23);
    }//end for
    stringBuffer.append(TEXT_99);
    final List<GenFeature> allSetters = new ArrayList<GenFeature>();
	allSetters.addAll(mySetters);
	allSetters.addAll(myContainers);
    stringBuffer.append(TEXT_23);
    for (GenFeature genFeature : allSetters) {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_25);
    if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_103);
    }else{
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_29);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_137);
    }
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    for (GenFeature genFeature : myGetters) {
	if(genFeature.getTypeGenClass()==null) continue;
	if(genFeature.isListType() && genFeature.getTypeGenClass().isAbstract()
		  && genClass.getChildrenClasses(genFeature).size()!=0){
    stringBuffer.append(TEXT_26);
     for (GenClass sony : genClass.getChildrenClasses(genFeature)) { 
    stringBuffer.append(TEXT_26);
     String addname = "";
			if(genModel.getAllGenPackagesWithClassifiers().size()!=1){ addname = sony.getGenPackage().getNSName() + "_"; }
    stringBuffer.append(TEXT_94);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_135);
    }//for
    stringBuffer.append(TEXT_23);
    }//if
    stringBuffer.append(TEXT_23);
    }//for
    stringBuffer.append(TEXT_140);
    for (GenFeature genFeature : myLists) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_143);
    }
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
