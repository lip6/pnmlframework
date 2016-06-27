package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class ManifestMF_
{
  protected static String nl;
  public static synchronized ManifestMF_ create(String lineSeparator)
  {
    nl = lineSeparator;
    ManifestMF_ result = new ManifestMF_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Manifest-Version: 1.0" + NL + "Bundle-ManifestVersion: 2" + NL + "Bundle-Name: ";
  protected final String TEXT_2 = NL + "Bundle-SymbolicName: ";
  protected final String TEXT_3 = ";singleton:=true" + NL + "Bundle-Version: 2.2.7" + NL + "Bundle-ClassPath: ";
  protected final String TEXT_4 = ".jar";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = NL + "Bundle-Activator: ";
  protected final String TEXT_7 = "$Implementation";
  protected final String TEXT_8 = NL + "Bundle-Vendor: Sorbonne Universités, UPMC Univ Paris 06, CNRS UMR 7606 (LIP6)" + NL + "Bundle-Localization: plugin";
  protected final String TEXT_9 = NL + "Bundle-RequiredExecutionEnvironment: J2SE-1.5";
  protected final String TEXT_10 = NL + "Bundle-RequiredExecutionEnvironment: JavaSE-1.6";
  protected final String TEXT_11 = NL + "Bundle-RequiredExecutionEnvironment: JavaSE-1.7";
  protected final String TEXT_12 = NL + "Export-Package: ";
  protected final String TEXT_13 = ",";
  protected final String TEXT_14 = NL + " ";
  protected final String TEXT_15 = NL + "Require-Bundle: ";
  protected final String TEXT_16 = ";visibility:=reexport";
  protected final String TEXT_17 = ",";
  protected final String TEXT_18 = NL + " ";
  protected final String TEXT_19 = ";visibility:=reexport";
  protected final String TEXT_20 = ",";
  protected final String TEXT_21 = NL + " fr.lip6.pnml.framework.utils," + NL + " fr.lip6.pnml.framework.3rdpartimports;bundle-version=\"2.2.7\"";
  protected final String TEXT_22 = NL + "Eclipse-LazyStart: true";
  protected final String TEXT_23 = NL + "Bundle-ActivationPolicy: lazy";
  protected final String TEXT_24 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2005-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */

    GenModel genModel = (GenModel)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(genModel.getModelPluginID());
    stringBuffer.append(TEXT_3);
    if (genModel.isRuntimeJar()) {
    stringBuffer.append(genModel.getModelPluginID());
    stringBuffer.append(TEXT_4);
    }else{
    stringBuffer.append(TEXT_5);
    }
    if (genModel.hasModelPluginClass()) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getQualifiedModelPluginClassName());
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    if (genModel.getComplianceLevel() == GenJDKLevel.JDK50_LITERAL) {
    stringBuffer.append(TEXT_9);
    } else if (genModel.getComplianceLevel() == GenJDKLevel.JDK60_LITERAL) {
    stringBuffer.append(TEXT_10);
    } else if (genModel.getComplianceLevel() == GenJDKLevel.JDK70_LITERAL) {
    stringBuffer.append(TEXT_11);
    }
    Iterator<String> packagesIterator = genModel.getModelQualifiedPackageNames().iterator(); if (packagesIterator.hasNext()) { String pack = packagesIterator.next();
    stringBuffer.append(TEXT_12);
    stringBuffer.append(pack);
    while(packagesIterator.hasNext()) { pack = packagesIterator.next();
    stringBuffer.append(TEXT_13);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(pack);
    }
    }
    Iterator<String> requiredPluginIterator = genModel.getModelRequiredPlugins().iterator(); if (requiredPluginIterator.hasNext()) { String pluginID = requiredPluginIterator.next();
    stringBuffer.append(TEXT_15);
    stringBuffer.append(pluginID);
    if (!pluginID.startsWith("org.eclipse.core.runtime")){
    stringBuffer.append(TEXT_16);
    } while(requiredPluginIterator.hasNext()) { pluginID = requiredPluginIterator.next();
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(pluginID);
    if (!pluginID.startsWith("org.eclipse.core.runtime")){
    stringBuffer.append(TEXT_19);
    }}
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    if (genModel.getRuntimeVersion() == GenRuntimeVersion.EMF22 || genModel.getRuntimeVersion() == GenRuntimeVersion.EMF23) {
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    return stringBuffer.toString();
  }
}
