package org.eclipse.emf.pnml.codegen.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class HLAPIEnum
{
  protected static String nl;
  public static synchronized HLAPIEnum create(String lineSeparator)
  {
    nl = lineSeparator;
    HLAPIEnum result = new HLAPIEnum();
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
  protected final String TEXT_9 = ".hlapi;" + NL + "import  ";
  protected final String TEXT_10 = ".*;" + NL + "public enum ";
  protected final String TEXT_11 = "HLAPI{";
  protected final String TEXT_12 = NL + "\t";
  protected final String TEXT_13 = "(\"";
  protected final String TEXT_14 = "\")";
  protected final String TEXT_15 = ",";
  protected final String TEXT_16 = ";";
  protected final String TEXT_17 = NL + NL + "\tprivate final ";
  protected final String TEXT_18 = " item;" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_19 = "HLAPI(String name) {" + NL + "\t\tthis.item = ";
  protected final String TEXT_20 = ".get(name);" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Return one HLAPI enum (used for tests)." + NL + "\t * @return one of the enum, null if the int is \"out of bounds\"" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_21 = "HLAPI get(int num) {" + NL + "\t";
  protected final String TEXT_22 = NL + "      if(num == ";
  protected final String TEXT_23 = "){" + NL + "         return ";
  protected final String TEXT_24 = ";" + NL + "      }" + NL + "\t";
  protected final String TEXT_25 = NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_26 = " getContainedItem() {" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    final GenEnum genEnum = (GenEnum)argument;
    final GenPackage genPackage = genEnum.getGenPackage();
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
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genEnum.getGenPackage().getInterfacePackageName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_11);
    	//This will generate all aviable enums couple NAME("literalvalue").
	List<GenEnumLiteral> lgel = genEnum.getGenEnumLiterals();
	for (Iterator<GenEnumLiteral> iterator = lgel.iterator(); iterator.hasNext();) {
        GenEnumLiteral genEnumLiteral = (GenEnumLiteral) iterator.next();
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genEnumLiteral.getLiteral());
    stringBuffer.append(TEXT_14);
     if(iterator.hasNext()){
    stringBuffer.append(TEXT_15);
    }else{
    stringBuffer.append(TEXT_16);
    } 
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_21);
    int i =0;
	for (Iterator<GenEnumLiteral> iterator = lgel.iterator(); iterator.hasNext();) {
        GenEnumLiteral genEnumLiteral = (GenEnumLiteral) iterator.next();
    stringBuffer.append(TEXT_22);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_24);
    i++;
	}
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_26);
    return stringBuffer.toString();
  }
}
