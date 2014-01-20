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
  protected final String TEXT_20 = NL + "\tprivate ";
  protected final String TEXT_21 = " item";
  protected final String TEXT_22 = ";" + NL + "\t\t";
  protected final String TEXT_23 = NL + "\t";
  protected final String TEXT_24 = NL + "\tprivate ";
  protected final String TEXT_25 = "HLAPI item";
  protected final String TEXT_26 = ";" + NL + "\t";
  protected final String TEXT_27 = NL + NL + NL + "\t@AfterTest(groups = { \"";
  protected final String TEXT_28 = "HLAPI\", \"hlapi\" })" + NL + "\tpublic void After() {" + NL + "\t    System.out.println(\"done for \"+\"";
  protected final String TEXT_29 = "HLAPI(";
  protected final String TEXT_30 = ")\");" + NL + "\t}" + NL + "" + NL + "" + NL + "\t@BeforeMethod(groups = { \"";
  protected final String TEXT_31 = "HLAPI\", \"hlapi\" })" + NL + "\tpublic void setup() throws Exception{" + NL + "\t//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace(\"void\");" + NL + "\tModelRepository mr = ModelRepository.getInstance();" + NL + "\tmr.createDocumentWorkspace(\"void\");" + NL + "\t";
  protected final String TEXT_32 = NL + "\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\t\t";
  protected final String TEXT_34 = NL + "\t\t\titem";
  protected final String TEXT_35 = " = new ";
  protected final String TEXT_36 = ".";
  protected final String TEXT_37 = "HLAPI(" + NL + "\t\t\t\tnew ";
  protected final String TEXT_38 = "().create";
  protected final String TEXT_39 = "()" + NL + "\t\t\t);" + NL + "\t\t\t\t";
  protected final String TEXT_40 = NL + "\t\t\t";
  protected final String TEXT_41 = NL + "\t\t\t//";
  protected final String TEXT_42 = NL + "\t\t\titem";
  protected final String TEXT_43 = " = new ";
  protected final String TEXT_44 = "HLAPI(new ";
  protected final String TEXT_45 = "().create";
  protected final String TEXT_46 = "());" + NL + "\t\t\t";
  protected final String TEXT_47 = NL + "\t\t";
  protected final String TEXT_48 = NL + "\t\titem";
  protected final String TEXT_49 = " = ";
  protected final String TEXT_50 = "HLAPI.get(0);" + NL + "\t\t";
  protected final String TEXT_51 = NL + "\t\t\titem";
  protected final String TEXT_52 = " = new ";
  protected final String TEXT_53 = "(\"unid\");" + NL + "\t\t\t";
  protected final String TEXT_54 = NL + "\t\t\titem";
  protected final String TEXT_55 = " = new ";
  protected final String TEXT_56 = "(\"0\");" + NL + "\t\t\t";
  protected final String TEXT_57 = NL + NL + "\t";
  protected final String TEXT_58 = NL + "\t\t";
  protected final String TEXT_59 = NL + "\t\t\t";
  protected final String TEXT_60 = NL + "\t\t\t";
  protected final String TEXT_61 = NL + "\t\titem";
  protected final String TEXT_62 = " = new ";
  protected final String TEXT_63 = ".hlapi.";
  protected final String TEXT_64 = "HLAPI(" + NL + "\t\t   new ";
  protected final String TEXT_65 = "().create";
  protected final String TEXT_66 = "()" + NL + "\t\t);" + NL + "\t\t\t";
  protected final String TEXT_67 = NL + "\t\t";
  protected final String TEXT_68 = NL + "\t\titem";
  protected final String TEXT_69 = " = new ";
  protected final String TEXT_70 = "HLAPI(new ";
  protected final String TEXT_71 = "().create";
  protected final String TEXT_72 = "());" + NL + "\t\t";
  protected final String TEXT_73 = NL + "\t";
  protected final String TEXT_74 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values" + NL + "\t * excepted container." + NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_75 = "HLAPI\"}, dependsOnMethods={\"";
  protected final String TEXT_76 = "HLAPI_LLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_77 = "HLAPI_1()";
  protected final String TEXT_78 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_79 = "{//BEGIN CONSTRUCTOR BODY" + NL + "   @SuppressWarnings(\"unused\")" + NL + "\t";
  protected final String TEXT_80 = "HLAPI totest = new ";
  protected final String TEXT_81 = "HLAPI(";
  protected final String TEXT_82 = "\t,\t";
  protected final String TEXT_83 = NL + "\t\titem";
  protected final String TEXT_84 = NL + "\t";
  protected final String TEXT_85 = ");" + NL + "\t";
  protected final String TEXT_86 = NL + "\t";
  protected final String TEXT_87 = NL + "\t";
  protected final String TEXT_88 = NL + "\tassert totest.";
  protected final String TEXT_89 = "().equals(item";
  protected final String TEXT_90 = ".getContainedItem());" + NL + "\t";
  protected final String TEXT_91 = NL + "\tassert totest.";
  protected final String TEXT_92 = "().equals(item";
  protected final String TEXT_93 = ");" + NL + "\t";
  protected final String TEXT_94 = NL + "\t";
  protected final String TEXT_95 = NL + "\t}" + NL;
  protected final String TEXT_96 = NL + "\t/**" + NL + "\t * this constructor allows you to set all 'settable' values, including container if any." + NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_97 = "HLAPI\"}, dependsOnMethods={\"";
  protected final String TEXT_98 = "HLAPI_LLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_99 = "HLAPI_2_";
  protected final String TEXT_100 = "()";
  protected final String TEXT_101 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_102 = "{//BEGIN CONSTRUCTOR BODY" + NL + "" + NL + "\t";
  protected final String TEXT_103 = "HLAPI totest = new ";
  protected final String TEXT_104 = "HLAPI(";
  protected final String TEXT_105 = "\t,\t";
  protected final String TEXT_106 = NL + "\t\titem";
  protected final String TEXT_107 = NL + "\t";
  protected final String TEXT_108 = ",\t";
  protected final String TEXT_109 = NL + "\t\titem";
  protected final String TEXT_110 = NL + "\t);" + NL + "\t";
  protected final String TEXT_111 = NL + "\t";
  protected final String TEXT_112 = NL + "\t\t";
  protected final String TEXT_113 = NL + "\t\t\tassert totest.";
  protected final String TEXT_114 = "().equals(item";
  protected final String TEXT_115 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_116 = NL + "\t\t\tassert totest.";
  protected final String TEXT_117 = "().equals(item";
  protected final String TEXT_118 = ");" + NL + "\t\t";
  protected final String TEXT_119 = NL + "\t";
  protected final String TEXT_120 = NL + "\tassert totest.";
  protected final String TEXT_121 = "().equals(item";
  protected final String TEXT_122 = ".getContainedItem());" + NL + "\t}";
  protected final String TEXT_123 = NL + NL + "\t/**" + NL + "    * This constructor give access to required stuff only (not container if any)" + NL + "    */";
  protected final String TEXT_124 = NL + "   @Test(groups = { \"hlapi\", \"";
  protected final String TEXT_125 = "HLAPI\"}, dependsOnMethods={\"";
  protected final String TEXT_126 = "HLAPI_LLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_127 = "HLAPI_3()";
  protected final String TEXT_128 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_129 = "{//BEGIN CONSTRUCTOR BODY" + NL + "" + NL + "\t";
  protected final String TEXT_130 = "HLAPI totest = new ";
  protected final String TEXT_131 = "HLAPI(";
  protected final String TEXT_132 = "\t,\t";
  protected final String TEXT_133 = NL + "\t\titem";
  protected final String TEXT_134 = NL + "\t";
  protected final String TEXT_135 = ");" + NL + "" + NL + "\t";
  protected final String TEXT_136 = NL + "\t";
  protected final String TEXT_137 = NL + "\t\t";
  protected final String TEXT_138 = NL + "\t\t\tassert totest.";
  protected final String TEXT_139 = "().equals(item";
  protected final String TEXT_140 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_141 = NL + "\t\t\tassert totest.";
  protected final String TEXT_142 = "().equals(item";
  protected final String TEXT_143 = ");" + NL + "\t\t";
  protected final String TEXT_144 = NL + "\t";
  protected final String TEXT_145 = NL + "\t}";
  protected final String TEXT_146 = NL;
  protected final String TEXT_147 = NL + "\t/**" + NL + "    * This constructor give access to required stuff only (and container)" + NL + "    */" + NL + "   @Test(groups = { \"hlapi\", \"";
  protected final String TEXT_148 = "HLAPI\"}, dependsOnMethods={\"";
  protected final String TEXT_149 = "HLAPI_LLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_150 = "HLAPI_4_";
  protected final String TEXT_151 = "()";
  protected final String TEXT_152 = " throws InvalidIDException ,VoidRepositoryException   ";
  protected final String TEXT_153 = "{//BEGIN CONSTRUCTOR BODY" + NL + "" + NL + "\t";
  protected final String TEXT_154 = "HLAPI totest = new ";
  protected final String TEXT_155 = "HLAPI(";
  protected final String TEXT_156 = "\t,\t";
  protected final String TEXT_157 = NL + "\t\titem";
  protected final String TEXT_158 = NL + "\t";
  protected final String TEXT_159 = ",\t";
  protected final String TEXT_160 = NL + "\t  item";
  protected final String TEXT_161 = NL + "\t);" + NL + "" + NL + "\t";
  protected final String TEXT_162 = NL + "\t";
  protected final String TEXT_163 = NL + "\t\t";
  protected final String TEXT_164 = NL + "\t\t\tassert totest.";
  protected final String TEXT_165 = "().equals(item";
  protected final String TEXT_166 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_167 = NL + "\t\t\tassert totest.";
  protected final String TEXT_168 = "().equals(item";
  protected final String TEXT_169 = ");" + NL + "\t\t";
  protected final String TEXT_170 = NL + "\t";
  protected final String TEXT_171 = NL + "\tassert totest.";
  protected final String TEXT_172 = "().equals(item";
  protected final String TEXT_173 = ".getContainedItem());" + NL + "\t}";
  protected final String TEXT_174 = NL;
  protected final String TEXT_175 = NL + "\t/**" + NL + "\t * This constructor creates a clone of the given object." + NL + "\t * Be carefull, this clone do not inherits of contrainers or unsettable features.";
  protected final String TEXT_176 = NL + "\t *" + NL + "\t * <strong>Warning : this cloning constructor override the constructor who set ";
  protected final String TEXT_177 = "HLAPI container. If you want to set this container please use the container setter.</strong>";
  protected final String TEXT_178 = NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_179 = "HLAPI\"}, dependsOnMethods={\"";
  protected final String TEXT_180 = "HLAPI_LLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_181 = "HLAPI_clone() throws Exception{" + NL + "\t";
  protected final String TEXT_182 = "HLAPI old = new ";
  protected final String TEXT_183 = "HLAPI(new ";
  protected final String TEXT_184 = "().create";
  protected final String TEXT_185 = "());" + NL + "\t";
  protected final String TEXT_186 = NL + "\t\t";
  protected final String TEXT_187 = NL + "\t\t\told.set";
  protected final String TEXT_188 = "(item";
  protected final String TEXT_189 = ".getContainedItem());" + NL + "\t\t";
  protected final String TEXT_190 = NL + "\t\t\told.set";
  protected final String TEXT_191 = "(item";
  protected final String TEXT_192 = ");" + NL + "\t\t";
  protected final String TEXT_193 = NL + "\t";
  protected final String TEXT_194 = NL + NL + "\t";
  protected final String TEXT_195 = "HLAPI totest = new ";
  protected final String TEXT_196 = "HLAPI(old);" + NL + "\t";
  protected final String TEXT_197 = NL + " \t\tassert totest.";
  protected final String TEXT_198 = "().equals(old.";
  protected final String TEXT_199 = "());" + NL + "\t";
  protected final String TEXT_200 = NL + "\t}";
  protected final String TEXT_201 = NL + NL + "\t/**" + NL + "\t * This constructor encapsulate a low level API object in HLAPI." + NL + "\t */" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_202 = "HLAPI\"})" + NL + "\tpublic void ";
  protected final String TEXT_203 = "HLAPI_LLAPI(){" + NL + "\t   ";
  protected final String TEXT_204 = " llapi = new ";
  protected final String TEXT_205 = "().create";
  protected final String TEXT_206 = "();" + NL + "\t   ";
  protected final String TEXT_207 = " hlapi = new ";
  protected final String TEXT_208 = "HLAPI(llapi);" + NL + "\t\tassert hlapi.getContainedItem().equals(llapi);" + NL + "\t}" + NL + "" + NL + "\t//getters giving HLAPI object";
  protected final String TEXT_209 = NL + "\t";
  protected final String TEXT_210 = NL + NL + "\t";
  protected final String TEXT_211 = NL + "\t\t";
  protected final String TEXT_212 = NL + "\t\t/**" + NL + "\t\t * This accessor automatically encapsulate an element of the current object." + NL + "\t\t * WARNING : this creates a new object in memory." + NL + "\t\t * @return : null if the element is null" + NL + "\t\t */" + NL + "\t\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_213 = "HLAPI\"})" + NL + "\t\tpublic void ";
  protected final String TEXT_214 = "HLAPITest(){" + NL + "\t\t\t";
  protected final String TEXT_215 = "HLAPI elem = new ";
  protected final String TEXT_216 = "HLAPI(new ";
  protected final String TEXT_217 = "().create";
  protected final String TEXT_218 = "());" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_219 = NL + "\t\t\t\telem.set";
  protected final String TEXT_220 = "HLAPI(new ";
  protected final String TEXT_221 = ".";
  protected final String TEXT_222 = "HLAPI(new ";
  protected final String TEXT_223 = "().create";
  protected final String TEXT_224 = "()));" + NL + "\t\t\t\t";
  protected final String TEXT_225 = "HLAPI totest_";
  protected final String TEXT_226 = "_";
  protected final String TEXT_227 = " = elem.";
  protected final String TEXT_228 = "HLAPI();" + NL + "\t\t\t\tassert totest_";
  protected final String TEXT_229 = "_";
  protected final String TEXT_230 = ".getContainedItem().equals(elem.";
  protected final String TEXT_231 = "());" + NL + "\t\t\t";
  protected final String TEXT_232 = NL + "\t\t\t\telem.set";
  protected final String TEXT_233 = "HLAPI(item";
  protected final String TEXT_234 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_235 = "HLAPI totest = elem.";
  protected final String TEXT_236 = "HLAPI();" + NL + "\t\t\t\tassert totest.getContainedItem().equals(elem.";
  protected final String TEXT_237 = "());" + NL + "\t\t\t";
  protected final String TEXT_238 = NL + "\t\t}" + NL + "\t";
  protected final String TEXT_239 = NL + "\t\t/**" + NL + "\t\t * This test add a random number of desired objet in the list or of one of each existing subtypes." + NL + "\t\t * then test how many objet are retuned and if any exist inthe original list." + NL + "\t\t */" + NL + "\t\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_240 = "HLAPI\"})" + NL + "\t\tpublic void ";
  protected final String TEXT_241 = "HLAPITest(){" + NL + "\t\t\t";
  protected final String TEXT_242 = " llapi = new ";
  protected final String TEXT_243 = "().create";
  protected final String TEXT_244 = "();" + NL + "\t\t\tint howmany;" + NL + "\t\t\t";
  protected final String TEXT_245 = NL + "\t\t\tllapi.";
  protected final String TEXT_246 = "().add(" + NL + "\t\t\t   new ";
  protected final String TEXT_247 = "().create";
  protected final String TEXT_248 = "()" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_249 = NL + "\t\t\thowmany = ";
  protected final String TEXT_250 = ";" + NL + "\t\t\t";
  protected final String TEXT_251 = NL + "\t\t\thowmany = (int)(Math.random()*10);" + NL + "\t\t\tfor(int i =0; i<howmany;i++)" + NL + "\t\t\tllapi.";
  protected final String TEXT_252 = "().add(new ";
  protected final String TEXT_253 = "().create";
  protected final String TEXT_254 = "());" + NL + "\t\t\t";
  protected final String TEXT_255 = NL + NL + "\t\t\t";
  protected final String TEXT_256 = "HLAPI elem = new ";
  protected final String TEXT_257 = "HLAPI(llapi);" + NL + "\t\t\tList<";
  protected final String TEXT_258 = "HLAPI> totest = elem.";
  protected final String TEXT_259 = "HLAPI();" + NL + "" + NL + "\t\t\tassert totest.size() == howmany;" + NL + "" + NL + "\t\t\tfor (";
  protected final String TEXT_260 = "HLAPI unit : totest) {" + NL + "             assert llapi.";
  protected final String TEXT_261 = "().contains(unit.getContainedItem()) : \"missing element\";" + NL + "         }" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_262 = NL + NL + "\t//Special getter for list of generics object, return only one object type." + NL + "\t";
  protected final String TEXT_263 = NL + "\t\t";
  protected final String TEXT_264 = NL + "\t\t";
  protected final String TEXT_265 = NL + "\t\t/**" + NL + "\t\t * This test add a random number (1..10) of wanting output objets" + NL + "\t\t * Then add one of all possible objet in the list." + NL + "\t\t * It test the number of wanted objet returned by the methods, and if any object really exist in the original list." + NL + "\t\t */" + NL + "\t\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_266 = "HLAPI\"})" + NL + "\t\tpublic void ";
  protected final String TEXT_267 = "_";
  protected final String TEXT_268 = "HLAPITest(){" + NL + "\t\t\t";
  protected final String TEXT_269 = " llapi = new ";
  protected final String TEXT_270 = "().create";
  protected final String TEXT_271 = "();" + NL + "\t\t\tint howmany;" + NL + "" + NL + "\t\t\thowmany = (int)(Math.random()*10);" + NL + "\t\t\tfor(int i =0; i<howmany;i++)" + NL + "\t\t\tllapi.";
  protected final String TEXT_272 = "().add(new ";
  protected final String TEXT_273 = "().create";
  protected final String TEXT_274 = "());" + NL + "\t\t\t";
  protected final String TEXT_275 = NL + "\t\t\tllapi.";
  protected final String TEXT_276 = "().add(" + NL + "\t\t\t   new ";
  protected final String TEXT_277 = "().create";
  protected final String TEXT_278 = "()" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_279 = NL + "\t\t\thowmany += ";
  protected final String TEXT_280 = ";" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_281 = "HLAPI elem = new ";
  protected final String TEXT_282 = "HLAPI(llapi);" + NL + "\t\t\tList<";
  protected final String TEXT_283 = ".";
  protected final String TEXT_284 = "HLAPI> totest = elem.";
  protected final String TEXT_285 = "_";
  protected final String TEXT_286 = "HLAPI();" + NL + "" + NL + "\t\t\tassert totest.size() == howmany + 1 - ";
  protected final String TEXT_287 = ";" + NL + "" + NL + "\t\t\tfor (";
  protected final String TEXT_288 = "HLAPI unit : totest) {" + NL + "             assert llapi.";
  protected final String TEXT_289 = "().contains(unit.getContainedItem()) : \"missing element\";" + NL + "         }" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_290 = NL + "\t";
  protected final String TEXT_291 = NL + "\t";
  protected final String TEXT_292 = NL + NL + "\t//setters/remover for lists." + NL + "\t";
  protected final String TEXT_293 = NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_294 = "HLAPI\"})" + NL + "\tpublic void add";
  protected final String TEXT_295 = "HLAPITest(){" + NL + "\t\t";
  protected final String TEXT_296 = "HLAPI elem = new ";
  protected final String TEXT_297 = "HLAPI(new ";
  protected final String TEXT_298 = "().create";
  protected final String TEXT_299 = "());" + NL + "\t\tint howmany = (int)(Math.random()*10);" + NL + "\t\tfor(int i =0; i<howmany;i++)" + NL + "\t\t\t";
  protected final String TEXT_300 = NL + "\t\t\telem.add";
  protected final String TEXT_301 = "HLAPI(" + NL + "\t\t\t\tnew ";
  protected final String TEXT_302 = "HLAPI(" + NL + "\t\t\t\t\tnew ";
  protected final String TEXT_303 = "().create";
  protected final String TEXT_304 = "()" + NL + "\t\t\t\t)" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_305 = NL + "\t\t\telem.add";
  protected final String TEXT_306 = "HLAPI(new ";
  protected final String TEXT_307 = "HLAPI(new ";
  protected final String TEXT_308 = "().create";
  protected final String TEXT_309 = "()));" + NL + "\t\t\t";
  protected final String TEXT_310 = NL + NL + "\t\tassert elem.getContainedItem().";
  protected final String TEXT_311 = "().size() == howmany;" + NL + "\t}" + NL + "" + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_312 = "HLAPI\"})" + NL + "\tpublic void remove";
  protected final String TEXT_313 = "Test(){" + NL + "\t\t";
  protected final String TEXT_314 = "HLAPI elem = new ";
  protected final String TEXT_315 = "HLAPI(new ";
  protected final String TEXT_316 = "().create";
  protected final String TEXT_317 = "());" + NL + "\t\tint howmany = (int)(Math.random()*10);" + NL + "\t\tint howdiff = (int)(Math.random()*10);" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_318 = NL + "\t\t\t";
  protected final String TEXT_319 = "HLAPI sav;" + NL + "\t\t\t";
  protected final String TEXT_320 = NL + "\t\t\t";
  protected final String TEXT_321 = "HLAPI sav;";
  protected final String TEXT_322 = NL + NL + "\t\tfor(int i =0; i<(howmany);i++)" + NL + "\t\t\t";
  protected final String TEXT_323 = NL + "\t\t\telem.add";
  protected final String TEXT_324 = "HLAPI(" + NL + "\t\t\t\tnew ";
  protected final String TEXT_325 = "HLAPI(" + NL + "\t\t\t\t  new ";
  protected final String TEXT_326 = "().create";
  protected final String TEXT_327 = "()" + NL + "\t\t\t\t)" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_328 = NL + "\t\t\telem.add";
  protected final String TEXT_329 = "HLAPI(new ";
  protected final String TEXT_330 = "HLAPI(new ";
  protected final String TEXT_331 = "().create";
  protected final String TEXT_332 = "()));" + NL + "\t\t\t";
  protected final String TEXT_333 = NL + NL + NL + "\t\t";
  protected final String TEXT_334 = NL + "\t\tsav =" + NL + "\t\t\tnew ";
  protected final String TEXT_335 = "HLAPI(" + NL + "\t\t\t  new ";
  protected final String TEXT_336 = "().create";
  protected final String TEXT_337 = "()" + NL + "\t\t\t);" + NL + "\t\t";
  protected final String TEXT_338 = NL + "\t\tsav = new ";
  protected final String TEXT_339 = "HLAPI(new ";
  protected final String TEXT_340 = "().create";
  protected final String TEXT_341 = "());" + NL + "\t\t";
  protected final String TEXT_342 = NL + NL + "\t\telem.add";
  protected final String TEXT_343 = "HLAPI(sav);" + NL + "\t\tassert elem.getContainedItem().";
  protected final String TEXT_344 = "().size() == howmany+1;" + NL + "" + NL + "\t\tfor(int i =0; i<(howdiff);i++)" + NL + "\t\t\t";
  protected final String TEXT_345 = NL + "\t\t\telem.add";
  protected final String TEXT_346 = "HLAPI(" + NL + "\t\t\t\tnew ";
  protected final String TEXT_347 = "HLAPI(" + NL + "\t\t\t\t  new ";
  protected final String TEXT_348 = "().create";
  protected final String TEXT_349 = "()" + NL + "\t\t\t\t)" + NL + "\t\t\t);" + NL + "\t\t\t";
  protected final String TEXT_350 = NL + "\t\t\telem.add";
  protected final String TEXT_351 = "HLAPI(new ";
  protected final String TEXT_352 = "HLAPI(new ";
  protected final String TEXT_353 = "().create";
  protected final String TEXT_354 = "()));" + NL + "\t\t\t";
  protected final String TEXT_355 = NL + NL + NL + "\t\telem.remove";
  protected final String TEXT_356 = "HLAPI(sav);" + NL + "" + NL + "\t\tassert elem.getContainedItem().";
  protected final String TEXT_357 = "().size() == howmany+howdiff;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_358 = NL + NL + "\t@Test(groups = { \"hlapi\", \"";
  protected final String TEXT_359 = "HLAPI\"})" + NL + "\tpublic void equalsTest(){" + NL + "\t\t";
  protected final String TEXT_360 = " a = new ";
  protected final String TEXT_361 = "().create";
  protected final String TEXT_362 = "();" + NL + "\t\t";
  protected final String TEXT_363 = " b = new ";
  protected final String TEXT_364 = "().create";
  protected final String TEXT_365 = "();" + NL + "\t\t";
  protected final String TEXT_366 = "HLAPI aprime = new ";
  protected final String TEXT_367 = "HLAPI(a);" + NL + "\t\t";
  protected final String TEXT_368 = "HLAPI asecond = new ";
  protected final String TEXT_369 = "HLAPI(a);" + NL + "\t\t";
  protected final String TEXT_370 = "HLAPI bprime = new ";
  protected final String TEXT_371 = "HLAPI(b);" + NL + "" + NL + "\t\tassert aprime.equals(asecond);" + NL + "\t\tassert !aprime.equals(bprime);" + NL + "\t}" + NL + "" + NL + "\t//cloning method" + NL + "\t//public ";
  protected final String TEXT_372 = "HLAPI clone(){" + NL + "\t//\treturn new ";
  protected final String TEXT_373 = "HLAPI(this);" + NL + "\t//}" + NL + "" + NL + "\t//PNML" + NL + "\t";
  protected final String TEXT_374 = NL + "\t/**" + NL + "\t * return the PNML xml tree for this object." + NL + "\t */" + NL + "\t//public String toPNML(){" + NL + "\t\t//return item.toPNML();" + NL + "\t//}" + NL + "" + NL + "\t/**" + NL + "\t * creates an object from the xml nodes.(symetric work of toPNML)" + NL + "\t */" + NL + "\t//public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{" + NL + "\t\t//item.fromPNML(subRoot,idr);" + NL + "\t//}" + NL + "\t";
  protected final String TEXT_375 = NL + "}";
  protected final String TEXT_376 = NL + "//public interface ";
  protected final String TEXT_377 = "HLAPI extends HLAPIClass{}" + NL + "public interface ";
  protected final String TEXT_378 = "HLAPITest extends HLAPIClass{" + NL + "" + NL + "}";
  protected final String TEXT_379 = NL;

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
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_22);
    }
	}
    stringBuffer.append(TEXT_23);
    for (GenFeature genFeature : myContainers) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genClass.getGenPackage().getNSName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_31);
    for (GenFeature genFeature : mySetters) {
		if(genFeature.isReferenceType()){
    stringBuffer.append(TEXT_32);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_33);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_39);
    break;
				}
    stringBuffer.append(TEXT_40);
    }else{
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    }else if(genFeature.isEnumType()){
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_50);
    }else{//simple types
			if(genFeature.getImportedType(genClass).equals("String")){
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_53);
    }else{
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_56);
    }
		}
	}
    stringBuffer.append(TEXT_57);
    for (GenFeature genFeature : myContainers) {
    stringBuffer.append(TEXT_58);
    if(genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_59);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_60);
    for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(sony.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_66);
     break;
			}
    stringBuffer.append(TEXT_67);
    }else{
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_72);
    }
    stringBuffer.append(TEXT_73);
    }
    stringBuffer.append(TEXT_74);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_77);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(TEXT_79);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_81);
    	first = true;
	for (GenFeature genFeature : mySetters) {
	if (!first) { 
    stringBuffer.append(TEXT_82);
    } else {first = false;}
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_85);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_86);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_87);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_90);
    }else{
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_94);
    }
    stringBuffer.append(TEXT_95);
    for (GenFeature mycont : myContainers) {
    if(!mycont.getEcoreFeature().getEType().getName().equals(genClass.getInterfaceName())||mySetters.size()!=0){
    stringBuffer.append(TEXT_96);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_100);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_104);
    	first = true;
	for (GenFeature genFeature : mySetters) {
		if (!first) { 
    stringBuffer.append(TEXT_105);
    } else {first = false;}
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_107);
    }
    
		if (!first) { 
    stringBuffer.append(TEXT_108);
    } else {first = false;}
    stringBuffer.append(TEXT_109);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_110);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_111);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_112);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_115);
    }else{
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_118);
    }
    stringBuffer.append(TEXT_119);
    }
    stringBuffer.append(TEXT_120);
    stringBuffer.append(mycont.getGetAccessor());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_122);
    }else{clonedupWarn=true;}//end if
    }//end for
    stringBuffer.append(TEXT_123);
    if(myRequiredLight.size()!=0&&!myRequiredLight.equals(mySetters)){
    stringBuffer.append(TEXT_124);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_127);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_129);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_131);
    	first = true;
	for (GenFeature genFeature : myRequiredLight) {
	if (!first) { 
    stringBuffer.append(TEXT_132);
    } else {first = false;}
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_134);
    }
    stringBuffer.append(TEXT_135);
    for (GenFeature genFeature : myRequiredLight) {
    stringBuffer.append(TEXT_136);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_137);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_140);
    }else{
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_145);
    }
    stringBuffer.append(TEXT_146);
    for (GenFeature mycont : myContainers) {
    if(myContainers.size()!=0&&!mySetters.equals(myRequiredLight)){
    stringBuffer.append(TEXT_147);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_148);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_151);
    if(theId.size()!=0){
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_155);
    	first = true;
	for (GenFeature genFeature : myRequiredLight) {
	if (!first) { 
    stringBuffer.append(TEXT_156);
    } else {first = false;}
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_158);
    }
    
		if (!first) { 
    stringBuffer.append(TEXT_159);
    } else {first = false;}
    stringBuffer.append(TEXT_160);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_161);
    for (GenFeature genFeature : myRequiredLight) {
    stringBuffer.append(TEXT_162);
    if(genFeature.isReferenceType()||genFeature.isEnumType()){
    stringBuffer.append(TEXT_163);
    if(genFeature.getTypeGenClass()==null||genClass.getChildrenClasses(genFeature).isEmpty()) continue;
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_166);
    }else{
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_169);
    }
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    stringBuffer.append(mycont.getGetAccessor());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(mycont.getName());
    stringBuffer.append(TEXT_173);
    }
    }
    stringBuffer.append(TEXT_174);
    if(false){//Censored code, don't work as expected
    stringBuffer.append(TEXT_175);
    if(clonedupWarn){
    stringBuffer.append(TEXT_176);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_177);
    }
    stringBuffer.append(TEXT_178);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_179);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_180);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_181);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_185);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_186);
    if(genFeature.isEnumType()){
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_189);
    }else{
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_195);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_196);
    for (GenFeature genFeature : mySetters) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_199);
    	 }
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_202);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_203);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append( Helpers.hlapiFullClassName(genClass));
    stringBuffer.append(TEXT_207);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_208);
    for (GenFeature genFeature : myGetters) {
    stringBuffer.append(TEXT_209);
    if(genFeature.getTypeGenClass()==null) continue;
    stringBuffer.append(TEXT_210);
    if(!genFeature.isListType()){
    stringBuffer.append(TEXT_211);
    if(genClass.getChildrenClasses(genFeature).size()==0) continue;
    stringBuffer.append(TEXT_212);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_214);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_215);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_218);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(sony.getGenPackage().getNSName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(sony.getGenPackage().getNSName());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_231);
    }
			}else{
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_238);
    }else{
    stringBuffer.append(TEXT_239);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_241);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_244);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			int total=0;
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_248);
    ;total++;}
    stringBuffer.append(TEXT_249);
    stringBuffer.append(total);
    stringBuffer.append(TEXT_250);
    }else{
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_254);
    }
    stringBuffer.append(TEXT_255);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_256);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_261);
    }
    }//end for
    stringBuffer.append(TEXT_262);
    for (GenFeature genFeature : myGetters) {
	if(genFeature.getTypeGenClass()==null) continue;
	if(genFeature.isListType() && genFeature.getTypeGenClass().isAbstract()
		  && genClass.getChildrenClasses(genFeature).size()!=0){
    stringBuffer.append(TEXT_263);
     for (GenClass sony : genClass.getChildrenClasses(genFeature)) { 
    stringBuffer.append(TEXT_264);
     String addname = "";
			if(genModel.getAllGenPackagesWithClassifiers().size()!=1) {addname = sony.getGenPackage().getNSName() + "_";}
    stringBuffer.append(TEXT_265);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append( genClass.getImportedInterfaceName() );
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_274);
    int total=0;
			for (GenClass sony2 : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(sony2.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(sony2.getName());
    stringBuffer.append(TEXT_278);
    ;total++;}
    stringBuffer.append(TEXT_279);
    stringBuffer.append(total);
    stringBuffer.append(TEXT_280);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_281);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_282);
    stringBuffer.append(Helpers.hlapiPackage(sony));
    stringBuffer.append(TEXT_283);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(addname);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(total);
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_289);
    }//for
    stringBuffer.append(TEXT_290);
    }//if
    stringBuffer.append(TEXT_291);
    }//for
    stringBuffer.append(TEXT_292);
    for (GenFeature genFeature : myLists) {
    stringBuffer.append(TEXT_293);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_295);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_296);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_299);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_304);
     break;}
			}else{
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_309);
    }
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_311);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_314);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_317);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_319);
     break;}
			}else{
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_322);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_327);
     break;}
			}else{
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_333);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
		for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_334);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_337);
     break;}
		}else{
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_341);
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_344);
    if(genFeature.getTypeGenClass()!=null && genFeature.getTypeGenClass().isAbstract()) {
			for (GenClass sony : genClass.getChildrenClasses(genFeature)) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(sony.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(sony.getName());
    stringBuffer.append(TEXT_349);
     break;}
			}else{
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getTypeGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_354);
    }
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getIsName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genClass.getGenPackage().getImportedFactoryClassName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_366);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_367);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_368);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_369);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_370);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_371);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_372);
    stringBuffer.append( genClass.getInterfaceName() );
    stringBuffer.append(TEXT_373);
    EClassifier classifier = genClass.getEcoreClassifier();
	EAnnotation ean = classifier.getEAnnotation(ToPNMLNsURI);
	if(ean!=null){
    stringBuffer.append(TEXT_374);
    }
    stringBuffer.append(TEXT_375);
    }else{
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_378);
    }
    stringBuffer.append(TEXT_379);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
