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
  protected final String TEXT_29 = NL + "\t\t";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = " ";
  protected final String TEXT_32 = NL + "\t";
  protected final String TEXT_33 = ")";
  protected final String TEXT_34 = " throws InvalidIDException ,VoidRepositoryException ";
  protected final String TEXT_35 = "{//BEGIN CONSTRUCTOR BODY" + NL + "\t\t";
  protected final String TEXT_36 = " fact = ";
  protected final String TEXT_37 = ".eINSTANCE;" + NL + "\t\tsynchronized(fact){item = fact.create";
  protected final String TEXT_38 = "();}" + NL + "\t";
  protected final String TEXT_39 = NL + " \t\t";
  protected final String TEXT_40 = NL + " \t\tif(";
  protected final String TEXT_41 = "!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_42 = "((";
  protected final String TEXT_43 = ")";
  protected final String TEXT_44 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_45 = NL + "\t\t\tif(";
  protected final String TEXT_46 = "!=null){" + NL + "\t\t\t";
  protected final String TEXT_47 = NL + "\t\t\t\titem.set";
  protected final String TEXT_48 = "(ModelRepository.getInstance().getCurrentIdRepository().checkId(";
  protected final String TEXT_49 = ", this));" + NL + "\t\t\t";
  protected final String TEXT_50 = NL + "\t\t\t\titem.set";
  protected final String TEXT_51 = "(";
  protected final String TEXT_52 = ");" + NL + "\t\t\t";
  protected final String TEXT_53 = "}" + NL + "\t\t";
  protected final String TEXT_54 = NL + "\t";
  protected final String TEXT_55 = NL + "\t}" + NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values, including container if any." + NL + "\t */" + NL + "\t";
  protected final String TEXT_57 = NL + "\t";
  protected final String TEXT_58 = "public ";
  protected final String TEXT_59 = "HLAPI(";
  protected final String TEXT_60 = NL + "\t\t";
  protected final String TEXT_61 = " ";
  protected final String TEXT_62 = "HLAPI ";
  protected final String TEXT_63 = NL + "\t\t";
  protected final String TEXT_64 = " ";
  protected final String TEXT_65 = " ";
  protected final String TEXT_66 = NL + "\t";
  protected final String TEXT_67 = ")";
  protected final String TEXT_68 = " throws InvalidIDException ,VoidRepositoryException ";
  protected final String TEXT_69 = "{//BEGIN CONSTRUCTOR BODY" + NL + "\t\t";
  protected final String TEXT_70 = " fact = ";
  protected final String TEXT_71 = ".eINSTANCE;" + NL + "\t\tsynchronized(fact){item = fact.create";
  protected final String TEXT_72 = "();}" + NL + "\t";
  protected final String TEXT_73 = NL + " \t\t";
  protected final String TEXT_74 = NL + " \t\tif(";
  protected final String TEXT_75 = "!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_76 = "((";
  protected final String TEXT_77 = ")";
  protected final String TEXT_78 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_79 = NL + "\t\t\tif(";
  protected final String TEXT_80 = "!=null){" + NL + "\t\t\t";
  protected final String TEXT_81 = NL + "\t\t\t\titem.set";
  protected final String TEXT_82 = "(ModelRepository.getInstance().getCurrentIdRepository().checkId(";
  protected final String TEXT_83 = ", this));" + NL + "\t\t\t";
  protected final String TEXT_84 = NL + "\t\t\t\titem.set";
  protected final String TEXT_85 = "(";
  protected final String TEXT_86 = ");" + NL + "\t\t\t";
  protected final String TEXT_87 = "}" + NL + "\t\t";
  protected final String TEXT_88 = NL + "\t";
  protected final String TEXT_89 = NL + "\t}" + NL;
  protected final String TEXT_90 = NL;
  protected final String TEXT_91 = NL + "\t/**" + NL + "    * This constructor give access to required stuff only (not container if any)" + NL + "    */";
  protected final String TEXT_92 = NL + "\t";
  protected final String TEXT_93 = "public ";
  protected final String TEXT_94 = "HLAPI(";
  protected final String TEXT_95 = NL + "\t\t";
  protected final String TEXT_96 = " ";
  protected final String TEXT_97 = "HLAPI ";
  protected final String TEXT_98 = NL + "\t\t";
  protected final String TEXT_99 = " ";
  protected final String TEXT_100 = " ";
  protected final String TEXT_101 = NL + "\t";
  protected final String TEXT_102 = ")";
  protected final String TEXT_103 = " throws InvalidIDException ,VoidRepositoryException ";
  protected final String TEXT_104 = "{//BEGIN CONSTRUCTOR BODY" + NL + "\t\t";
  protected final String TEXT_105 = " fact = ";
  protected final String TEXT_106 = ".eINSTANCE;" + NL + "\t\tsynchronized(fact){item = fact.create";
  protected final String TEXT_107 = "();}" + NL + "\t";
  protected final String TEXT_108 = NL + " \t\t";
  protected final String TEXT_109 = NL + " \t\tif(";
  protected final String TEXT_110 = "!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_111 = "((";
  protected final String TEXT_112 = ")";
  protected final String TEXT_113 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_114 = NL + "\t\t\tif(";
  protected final String TEXT_115 = "!=null){" + NL + "\t\t\t";
  protected final String TEXT_116 = NL + "\t\t\t\titem.set";
  protected final String TEXT_117 = "(ModelRepository.getInstance().getCurrentIdRepository().checkId(";
  protected final String TEXT_118 = ", this));" + NL + "\t\t\t";
  protected final String TEXT_119 = NL + "\t\t\t\titem.set";
  protected final String TEXT_120 = "(";
  protected final String TEXT_121 = ");" + NL + "\t\t\t";
  protected final String TEXT_122 = "}" + NL + "\t\t";
  protected final String TEXT_123 = NL + "\t";
  protected final String TEXT_124 = NL + "\t}" + NL;
  protected final String TEXT_125 = NL;
  protected final String TEXT_126 = NL + "\t";
  protected final String TEXT_127 = NL + "\t/**" + NL + "    * This constructor give access to required stuff only (and container)" + NL + "    */";
  protected final String TEXT_128 = NL + "\t";
  protected final String TEXT_129 = "public ";
  protected final String TEXT_130 = "HLAPI(";
  protected final String TEXT_131 = NL + "\t\t";
  protected final String TEXT_132 = " ";
  protected final String TEXT_133 = "HLAPI ";
  protected final String TEXT_134 = NL + "\t\t";
  protected final String TEXT_135 = " ";
  protected final String TEXT_136 = " ";
  protected final String TEXT_137 = NL + "\t";
  protected final String TEXT_138 = ")";
  protected final String TEXT_139 = " throws InvalidIDException ,VoidRepositoryException ";
  protected final String TEXT_140 = "{//BEGIN CONSTRUCTOR BODY" + NL + "\t\t";
  protected final String TEXT_141 = " fact = ";
  protected final String TEXT_142 = ".eINSTANCE;" + NL + "\t\tsynchronized(fact){item = fact.create";
  protected final String TEXT_143 = "();}" + NL + "\t";
  protected final String TEXT_144 = NL + " \t\t";
  protected final String TEXT_145 = NL + " \t\tif(";
  protected final String TEXT_146 = "!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_147 = "((";
  protected final String TEXT_148 = ")";
  protected final String TEXT_149 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_150 = NL + "\t\t\tif(";
  protected final String TEXT_151 = "!=null){" + NL + "\t\t\t";
  protected final String TEXT_152 = NL + "\t\t\t\titem.set";
  protected final String TEXT_153 = "(ModelRepository.getInstance().getCurrentIdRepository().checkId(";
  protected final String TEXT_154 = ", this));" + NL + "\t\t\t";
  protected final String TEXT_155 = NL + "\t\t\t\titem.set";
  protected final String TEXT_156 = "(";
  protected final String TEXT_157 = ");" + NL + "\t\t\t";
  protected final String TEXT_158 = "}" + NL + "\t\t";
  protected final String TEXT_159 = NL + "\t";
  protected final String TEXT_160 = NL + "\t}" + NL + "\t";
  protected final String TEXT_161 = NL + NL + "\t/**" + NL + "\t * This constructor encapsulate a low level API object in HLAPI." + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_162 = "HLAPI(";
  protected final String TEXT_163 = " lowLevelAPI){" + NL + "\t\titem = lowLevelAPI;" + NL + "\t}" + NL + "" + NL + "\t// access to low level API" + NL + "\t/**" + NL + "\t * Return encapsulated object" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_164 = " getContainedItem(){" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\t//getters giving LLAPI object" + NL + "\t";
  protected final String TEXT_165 = NL + "\t/**" + NL + "\t * Return the encapsulate Low Level API object." + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_166 = " ";
  protected final String TEXT_167 = "(){" + NL + "\t\treturn item.";
  protected final String TEXT_168 = "();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_169 = NL + NL + "\t//getters giving HLAPI object" + NL + "\t";
  protected final String TEXT_170 = NL + "\t";
  protected final String TEXT_171 = NL + "\t";
  protected final String TEXT_172 = NL + "\t\t/**" + NL + "\t\t * This accessor automatically encapsulate an element of the current object." + NL + "\t\t * WARNING : this creates a new object in memory." + NL + "\t\t * @return : null if the element is null" + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_173 = NL + "\t\t";
  protected final String TEXT_174 = NL + "\t\tpublic ";
  protected final String TEXT_175 = "HLAPI ";
  protected final String TEXT_176 = "HLAPI(){" + NL + "\t\t\tif(item.";
  protected final String TEXT_177 = "() == null) return null;" + NL + "\t\t\t";
  protected final String TEXT_178 = " object = item.";
  protected final String TEXT_179 = "();" + NL + "\t\t\t";
  protected final String TEXT_180 = NL + "\t\t\tif(object.getClass().equals(";
  protected final String TEXT_181 = ".";
  protected final String TEXT_182 = ".";
  protected final String TEXT_183 = ".";
  protected final String TEXT_184 = ".class)){" + NL + "\t\t\t\treturn new ";
  protected final String TEXT_185 = ".hlapi.";
  protected final String TEXT_186 = "HLAPI((";
  protected final String TEXT_187 = ".";
  protected final String TEXT_188 = ")object);" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_189 = NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_190 = NL + "\t\tpublic ";
  protected final String TEXT_191 = "HLAPI ";
  protected final String TEXT_192 = "HLAPI(){" + NL + "\t\t\tif(item.";
  protected final String TEXT_193 = "() == null) return null;" + NL + "\t\t\treturn new ";
  protected final String TEXT_194 = "HLAPI(item.";
  protected final String TEXT_195 = "());" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_196 = NL + "\t";
  protected final String TEXT_197 = NL + "\t\t/**" + NL + "\t\t * This accessor automatically encapsulate all elements of the selected sublist." + NL + "\t\t * WARNING : this can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_198 = NL + "\t\t\t";
  protected final String TEXT_199 = NL + "\t\tpublic java.util.List<";
  protected final String TEXT_200 = "HLAPI> ";
  protected final String TEXT_201 = "HLAPI(){" + NL + "\t\t\tjava.util.List<";
  protected final String TEXT_202 = "HLAPI> retour = new ArrayList<";
  protected final String TEXT_203 = "HLAPI>();" + NL + "\t\t\tfor (";
  protected final String TEXT_204 = " elemnt : ";
  protected final String TEXT_205 = "()) {" + NL + "\t\t\t\t";
  protected final String TEXT_206 = NL + "\t\t\t\tif(elemnt.getClass().equals(";
  protected final String TEXT_207 = ".";
  protected final String TEXT_208 = ".class)){" + NL + "\t\t\t\t\tretour.add(new ";
  protected final String TEXT_209 = ".hlapi.";
  protected final String TEXT_210 = "HLAPI(" + NL + "\t\t\t\t\t\t(";
  protected final String TEXT_211 = ".";
  protected final String TEXT_212 = ")elemnt" + NL + "\t\t\t\t\t\t));" + NL + "\t\t\t\t\tcontinue;" + NL + "\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_213 = NL + "\t\t\t}" + NL + "\t\t\treturn retour;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_214 = NL + "\t\tpublic java.util.List<";
  protected final String TEXT_215 = "HLAPI> ";
  protected final String TEXT_216 = "HLAPI(){" + NL + "\t\t\tjava.util.List<";
  protected final String TEXT_217 = "HLAPI> retour = new ArrayList<";
  protected final String TEXT_218 = "HLAPI>();" + NL + "\t\t\tfor (";
  protected final String TEXT_219 = " elemnt : ";
  protected final String TEXT_220 = "()) {" + NL + "\t\t\t\tretour.add(new ";
  protected final String TEXT_221 = "HLAPI(elemnt));" + NL + "\t\t\t}" + NL + "\t\t\treturn retour;" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_222 = NL + "\t";
  protected final String TEXT_223 = NL + "\t";
  protected final String TEXT_224 = NL + NL + "\t//Special getter for list of generics object, return only one object type." + NL + "\t";
  protected final String TEXT_225 = NL + "\t\t";
  protected final String TEXT_226 = NL + "\t\t";
  protected final String TEXT_227 = NL + "\t\t/**" + NL + "\t\t * This accessor return a list of encapsulated subelement, only of ";
  protected final String TEXT_228 = "HLAPI kind." + NL + "\t\t * WARNING : this method can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\tpublic java.util.List<";
  protected final String TEXT_229 = ".";
  protected final String TEXT_230 = "HLAPI> ";
  protected final String TEXT_231 = "_";
  protected final String TEXT_232 = "HLAPI(){" + NL + "\t\t\tjava.util.List<";
  protected final String TEXT_233 = ".";
  protected final String TEXT_234 = "HLAPI> retour = new ArrayList<";
  protected final String TEXT_235 = ".";
  protected final String TEXT_236 = "HLAPI>();" + NL + "\t\t\tfor (";
  protected final String TEXT_237 = " elemnt : ";
  protected final String TEXT_238 = "()) {" + NL + "\t\t\t\tif(elemnt.getClass().equals(";
  protected final String TEXT_239 = ".";
  protected final String TEXT_240 = ".class)){" + NL + "\t\t\t\t\tretour.add(new ";
  protected final String TEXT_241 = ".";
  protected final String TEXT_242 = "HLAPI(" + NL + "\t\t\t\t\t\t(";
  protected final String TEXT_243 = ".";
  protected final String TEXT_244 = ")elemnt" + NL + "\t\t\t\t\t\t));" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn retour;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_245 = NL + "\t";
  protected final String TEXT_246 = NL + "\t";
  protected final String TEXT_247 = NL + NL + "\t//setters (including container setter if aviable)" + NL + "\t";
  protected final String TEXT_248 = NL + "\t";
  protected final String TEXT_249 = NL + "\t/**" + NL + "\t * set ";
  protected final String TEXT_250 = NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_251 = "HLAPI(" + NL + "\t";
  protected final String TEXT_252 = NL + "\t";
  protected final String TEXT_253 = "HLAPI elem";
  protected final String TEXT_254 = NL + "\t";
  protected final String TEXT_255 = " elem";
  protected final String TEXT_256 = ")";
  protected final String TEXT_257 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_258 = "{" + NL + "\t";
  protected final String TEXT_259 = NL + "\t";
  protected final String TEXT_260 = NL + " \t\tif(elem!=null)" + NL + "\t\t\titem.set";
  protected final String TEXT_261 = "((";
  protected final String TEXT_262 = ")elem.getContainedItem());" + NL + "\t";
  protected final String TEXT_263 = NL + "\t\tif(elem!=null){" + NL + "\t\t";
  protected final String TEXT_264 = NL + "\t\t\ttry{" + NL + "\t\t\titem.set";
  protected final String TEXT_265 = "(ModelRepository.getInstance().getCurrentIdRepository().changeId(this, elem));" + NL + "\t\t\t}catch (OtherException e){" + NL + "\t\t\tModelRepository.getInstance().getCurrentIdRepository().checkId(elem, this);" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_266 = NL + "\t\t\titem.set";
  protected final String TEXT_267 = "(elem);" + NL + "\t\t";
  protected final String TEXT_268 = "}" + NL + "\t";
  protected final String TEXT_269 = NL + "\t}" + NL + "\t";
  protected final String TEXT_270 = NL + NL + "\t//setters/remover for lists." + NL + "\t";
  protected final String TEXT_271 = NL + "\t";
  protected final String TEXT_272 = NL + "\t//Thread-safe insertion of objects in a Page" + NL + "\tpublic synchronized void add";
  protected final String TEXT_273 = "HLAPI(";
  protected final String TEXT_274 = "HLAPI unit){" + NL + "\t";
  protected final String TEXT_275 = NL + "\tpublic void add";
  protected final String TEXT_276 = "HLAPI(";
  protected final String TEXT_277 = "HLAPI unit){" + NL + "\t";
  protected final String TEXT_278 = NL + "\t\titem.";
  protected final String TEXT_279 = "().add((";
  protected final String TEXT_280 = ")unit.getContainedItem());" + NL + "\t}" + NL + "" + NL + "\tpublic void remove";
  protected final String TEXT_281 = "HLAPI(";
  protected final String TEXT_282 = "HLAPI unit){" + NL + "\t\titem.";
  protected final String TEXT_283 = "().remove((";
  protected final String TEXT_284 = ")unit.getContainedItem());" + NL + "\t}" + NL + "\t";
  protected final String TEXT_285 = NL + NL + "\t//equals method" + NL + "\tpublic boolean equals(";
  protected final String TEXT_286 = "HLAPI item){" + NL + "\t\treturn item.getContainedItem().equals(getContainedItem());" + NL + "\t}" + NL + "" + NL + "\t//PNML" + NL + "\t";
  protected final String TEXT_287 = NL + "\t/**" + NL + "\t * Returns the PNML xml tree for this object." + NL + "\t */" + NL + "\tpublic String toPNML(){" + NL + "\t\treturn item.toPNML();" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Writes the PNML XML tree of this object into file channel." + NL + "\t */" + NL + "\tpublic void toPNML(FileChannel fc){" + NL + "\t\t item.toPNML(fc);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * creates an object from the xml nodes.(symetric work of toPNML)" + NL + "\t */" + NL + "\tpublic void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{" + NL + "\t\titem.fromPNML(subRoot,idr);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_288 = NL + NL + "\tpublic boolean validateOCL(DiagnosticChain diagnostics){" + NL + "\t\treturn item.validateOCL(diagnostics);" + NL + "\t}" + NL + "" + NL + "}";
  protected final String TEXT_289 = NL + "public interface ";
  protected final String TEXT_290 = "HLAPI extends ";
  protected final String TEXT_291 = "HLAPIRootClass";
  protected final String TEXT_292 = "HLAPIClass";
  protected final String TEXT_293 = ",";
  protected final String TEXT_294 = "HLAPI";
  protected final String TEXT_295 = "{" + NL + "" + NL + "\t//getters giving LLAPI object" + NL + "\t";
  protected final String TEXT_296 = NL + "\t/**" + NL + "\t *" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_297 = " ";
  protected final String TEXT_298 = "();" + NL + "\t";
  protected final String TEXT_299 = NL + NL + "\t//getters giving HLAPI object" + NL + "\t";
  protected final String TEXT_300 = NL + "\t";
  protected final String TEXT_301 = NL + "\t";
  protected final String TEXT_302 = NL + "\t\t/**" + NL + "\t\t * This accessor automaticaly encapsulate an element of the current object." + NL + "\t\t * WARNING : this creates a new object in memory." + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_303 = NL + "\t\t";
  protected final String TEXT_304 = NL + "\t\tpublic ";
  protected final String TEXT_305 = "HLAPI ";
  protected final String TEXT_306 = "HLAPI();" + NL + "\t\t";
  protected final String TEXT_307 = NL + "\t\tpublic ";
  protected final String TEXT_308 = "HLAPI ";
  protected final String TEXT_309 = "HLAPI();" + NL + "\t\t";
  protected final String TEXT_310 = NL + "\t";
  protected final String TEXT_311 = NL + "\t\t/**" + NL + "\t\t * This accessor automaticaly encapsulate all elements of the selected sublist." + NL + "\t\t * WARNING : this can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_312 = NL + "\t\t";
  protected final String TEXT_313 = NL + "\t\tpublic java.util.List<";
  protected final String TEXT_314 = "HLAPI> ";
  protected final String TEXT_315 = "HLAPI();" + NL + "\t\t";
  protected final String TEXT_316 = NL + "\t\tpublic java.util.List<";
  protected final String TEXT_317 = "HLAPI> ";
  protected final String TEXT_318 = "HLAPI();" + NL + "\t\t";
  protected final String TEXT_319 = NL + "\t";
  protected final String TEXT_320 = NL + "\t";
  protected final String TEXT_321 = NL + NL + "\t//setters (including container setter if aviable)" + NL + "\t";
  protected final String TEXT_322 = NL + "\t";
  protected final String TEXT_323 = NL + "\t/**" + NL + "\t * set ";
  protected final String TEXT_324 = NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_325 = "HLAPI(";
  protected final String TEXT_326 = NL + "\t";
  protected final String TEXT_327 = "HLAPI elem";
  protected final String TEXT_328 = NL + "\t";
  protected final String TEXT_329 = " elem";
  protected final String TEXT_330 = ")";
  protected final String TEXT_331 = " throws InvalidIDException ,VoidRepositoryException";
  protected final String TEXT_332 = ";" + NL + "\t";
  protected final String TEXT_333 = NL + NL + "\t";
  protected final String TEXT_334 = NL + "\t\t";
  protected final String TEXT_335 = NL + "\t\t";
  protected final String TEXT_336 = NL + "\t\t/**" + NL + "\t\t * This accessor return a list of encapsulated subelement, only of ";
  protected final String TEXT_337 = "HLAPI kind." + NL + "\t\t * WARNING : this method can creates a lot of new object in memory." + NL + "\t\t */" + NL + "\t\tpublic java.util.List<";
  protected final String TEXT_338 = ".";
  protected final String TEXT_339 = "HLAPI> ";
  protected final String TEXT_340 = "_";
  protected final String TEXT_341 = "HLAPI();" + NL + "\t\t";
  protected final String TEXT_342 = NL + "\t";
  protected final String TEXT_343 = NL + "\t";
  protected final String TEXT_344 = NL + NL + NL + "\t//setters/remover for lists." + NL + "\t";
  protected final String TEXT_345 = NL + "\tpublic void add";
  protected final String TEXT_346 = "HLAPI(";
  protected final String TEXT_347 = "HLAPI unit);" + NL + "\tpublic void remove";
  protected final String TEXT_348 = "HLAPI(";
  protected final String TEXT_349 = "HLAPI unit);" + NL + "\t";
  protected final String TEXT_350 = NL + NL + "\t//equals method" + NL + "\tpublic boolean equals(Object item);" + NL + "" + NL + "}";

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
    stringBuffer.append(TEXT_29);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_38);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_39);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_44);
    }else{
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_46);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_49);
    }else{
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_52);
    }
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_55);
    for (GenFeature mycont : myContainers) {
    if(!mycont.getEcoreFeature().getEType().getName().equals(genClass.getInterfaceName())||mySetters.size()!=0){
	java.util.List<GenFeature> copymySetters = new ArrayList<GenFeature>();
	copymySetters.addAll(mySetters);
	copymySetters.add(mycont);

    stringBuffer.append(TEXT_56);
    featureList=copymySetters;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_57);
    stringBuffer.append(TEXT_58);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_59);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_60);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_63);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_66);
    }
    stringBuffer.append(TEXT_67);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_72);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_73);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_78);
    }else{
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_80);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_83);
    }else{
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    }
    stringBuffer.append(TEXT_88);
    }
    stringBuffer.append(TEXT_89);
    }//end if
    }//end for
    stringBuffer.append(TEXT_90);
    if(myRequiredLight.size()!=0&&!myRequiredLight.equals(mySetters)){
    stringBuffer.append(TEXT_91);
    featureList=myRequiredLight;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_92);
    stringBuffer.append(TEXT_93);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_94);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_95);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_98);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_103);
    }
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_107);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_108);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_113);
    }else{
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_115);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_118);
    }else{
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    }
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_125);
    for (GenFeature mycont : myContainers) {
    stringBuffer.append(TEXT_126);
    if(myContainers.size()!=0&&!mySetters.equals(myRequiredLight)){
		List<GenFeature> copymyRequiredLight = new ArrayList<GenFeature>();
		copymyRequiredLight.addAll(myRequiredLight);
		copymyRequiredLight.add(mycont);
	
    stringBuffer.append(TEXT_127);
    featureList=copymyRequiredLight;//this is used by the included file for building constructor
    stringBuffer.append(TEXT_128);
    stringBuffer.append(TEXT_129);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_130);
    
	Helpers.resetComma();
	for (GenFeature genFeature : featureList) {
	//We need to distinct model object from externals ones.
	if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_131);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getName());
    }else{
    stringBuffer.append(TEXT_134);
    stringBuffer.append(Helpers.putComma());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getName());
    }
    stringBuffer.append(TEXT_137);
    }
    stringBuffer.append(TEXT_138);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_139);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genClass.getGenPackage().getFactoryInterfaceName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genClass.getGenPackage().getFactoryClassName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_143);
    for (GenFeature genFeature : featureList) {
    stringBuffer.append(TEXT_144);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_149);
    }else{
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_151);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_154);
    }else{
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(TEXT_159);
    }
    stringBuffer.append(TEXT_160);
    }
    }
    stringBuffer.append(TEXT_161);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_163);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_164);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_168);
    }//end for
    stringBuffer.append(TEXT_169);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_170);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_171);
    if(!genFeature.isListType()){
    stringBuffer.append(TEXT_172);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_173);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_179);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(sony.getGenPackage().getBasePackage());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(sony.getGenPackage().getNSName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(sony.getGenPackage().getClassPackageSuffix());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(sony.getClassName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_188);
    }//for
    stringBuffer.append(TEXT_189);
    }else{
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_195);
    }//isAbstract
    stringBuffer.append(TEXT_196);
    }else{
    stringBuffer.append(TEXT_197);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_198);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_205);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(sony.getGenPackage().getClassPackageName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(sony.getClassName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_211);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_212);
    }//for
    stringBuffer.append(TEXT_213);
    }else{
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_221);
    }//isAbstract
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_223);
    }//end for
    stringBuffer.append(TEXT_224);
    for (GenFeature genFeature : myGetters) {
	if(genFeature.getTypeGenClass()==null) continue;
	if(genFeature.isListType() && genFeature.getTypeGenClass().isAbstract()
		  && genClass.getChildrenClasses(genFeature).size()!=0){
    stringBuffer.append(TEXT_225);
     for (GenClass sony : genClass.getChildrenClasses(genFeature)) { 
    stringBuffer.append(TEXT_226);
     String addname = "";
			if(genModel.getAllGenPackagesWithClassifiers().size()!=1) {addname = sony.getGenPackage().getNSName() + "_";}
    stringBuffer.append(TEXT_227);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_229);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_233);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(sony.getGenPackage().getClassPackageName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(sony.getClassName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_241);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_244);
    }//for
    stringBuffer.append(TEXT_245);
    }//if
    stringBuffer.append(TEXT_246);
    }//for
    stringBuffer.append(TEXT_247);
    final List<GenFeature> allSetters = new ArrayList<GenFeature>();
	allSetters.addAll(mySetters);
	allSetters.addAll(myContainers);
    stringBuffer.append(TEXT_248);
    for (GenFeature genFeature : allSetters) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_251);
    if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_253);
    }else{
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_256);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    EAnnotation ea = genFeature.getEcoreFeature().getEAnnotation(ToPNMLNsURI);
    stringBuffer.append(TEXT_259);
    if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_262);
     }else{//this element is one of a standard types (String etc...) 
    stringBuffer.append(TEXT_263);
    if(ea!=null
			&&	ea.getDetails().get("kind") != null
			&& ea.getDetails().get("kind").equals("id")){
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_265);
    }else{
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_267);
    }
    stringBuffer.append(TEXT_268);
     } 
    stringBuffer.append(TEXT_269);
    }
    stringBuffer.append(TEXT_270);
    for (GenFeature genFeature : myLists) {
    stringBuffer.append(TEXT_271);
    if ("Page".equalsIgnoreCase(genClass.getInterfaceName())){
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_274);
    } else {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_277);
    }
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_284);
    }
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_286);
    EClassifier classifier = genClass.getEcoreClassifier();
	EAnnotation ean = classifier.getEAnnotation(ToPNMLNsURI);
	if(ean!=null){
    stringBuffer.append(TEXT_287);
    }
    stringBuffer.append(TEXT_288);
    }else{
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_290);
    if(genClass.getInterfaceName().equals("PetriNetDoc")){
    stringBuffer.append(TEXT_291);
    }else{
    stringBuffer.append(TEXT_292);
    }
    for (Iterator<GenClass> iterator = implem.iterator(); iterator.hasNext();) {
GenClass genFeature2 = (GenClass) iterator.next();
if(genFeature2.getEcoreClassifier().getEAnnotation(HLAPINsURI)!=null&&(genFeature2.isInterface()||genFeature2.isAbstract())){
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature2.getName());
    stringBuffer.append(TEXT_294);
    }}
    stringBuffer.append(TEXT_295);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_298);
    }//end for
    stringBuffer.append(TEXT_299);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_300);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_301);
    if(!genFeature.isListType()){
    stringBuffer.append(TEXT_302);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_303);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_306);
    }else{
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_309);
    }//isAbstract
    stringBuffer.append(TEXT_310);
    }else{
    stringBuffer.append(TEXT_311);
    if(genFeature.getTypeGenClass().isAbstract()){
    stringBuffer.append(TEXT_312);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_315);
    }else{
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_318);
    }//isAbstract
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_320);
    }//end for
    stringBuffer.append(TEXT_321);
    final List<GenFeature> allSetters = new ArrayList<GenFeature>();
	allSetters.addAll(mySetters);
	allSetters.addAll(myContainers);
    stringBuffer.append(TEXT_322);
    for (GenFeature genFeature : allSetters) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_325);
    if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_327);
    }else{
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_329);
    }
    stringBuffer.append(TEXT_330);
    if(theId.contains(genFeature)){
    stringBuffer.append(TEXT_331);
    }
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_333);
    for (GenFeature genFeature : myGetters) {
	if(genFeature.getTypeGenClass()==null) continue;
	if(genFeature.isListType() && genFeature.getTypeGenClass().isAbstract()
		  && genClass.getChildrenClasses(genFeature).size()!=0){
    stringBuffer.append(TEXT_334);
     for (GenClass sony : genClass.getChildrenClasses(genFeature)) { 
    stringBuffer.append(TEXT_335);
     String addname = "";
			if(genModel.getAllGenPackagesWithClassifiers().size()!=1){ addname = sony.getGenPackage().getNSName() + "_"; }
    stringBuffer.append(TEXT_336);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_341);
    }//for
    stringBuffer.append(TEXT_342);
    }//if
    stringBuffer.append(TEXT_343);
    }//for
    stringBuffer.append(TEXT_344);
    for (GenFeature genFeature : myLists) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    }
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
