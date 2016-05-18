/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.nupn.helper;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.util.NupnResourceFactoryImpl;

public final class NUPNWriter {
	
	private static final String PNML_NS_URI = "http://www.pnml.org/version-2009/grammar/pnml";

	/**
	 * Returns the textual representation of a NUPN <toolspecific> model in XML.
	 * @param nupnModel the NUPN model to serialize
	 * @return the textual representation of its XML <toolspecific> construct.
	 * @throws IOException
	 */
	public static StringBuffer exportNupnXMLAsText(EObject nupnModel) throws IOException {
		NupnResourceFactoryImpl npnrf = new NupnResourceFactoryImpl();
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, npnrf);
		// register your NupnPackage to the resource set so it has a reference
		// to Nupn.ecore
		NupnPackage ePackage = NupnPackage.eINSTANCE;
		resSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		Resource resource = npnrf.createResource(URI.createFileURI(PNML_NS_URI));
		XMLResource nupnRes = (XMLResource)resource;
		nupnRes.getContents().add(nupnModel);
		StringWriter sw = new StringWriter();
		nupnRes.save(sw, nupnRes.getDefaultSaveOptions());
		return sw.getBuffer();
	}

	/**
	 * Saves a NUPN toolspecific model in a file.
	 * @param nupnModel the NUPN model to serialize
	 * @param destFile the destination file
	 * @throws IOException
	 */
	public static void saveNupn(EObject nupnModel, File destFile) throws IOException {
		NupnResourceFactoryImpl npnrf = new NupnResourceFactoryImpl();
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, npnrf);
		// register your NupnPackage to the resource set so it has a reference
		// to Nupn.ecore
		NupnPackage ePackage = NupnPackage.eINSTANCE;
		resSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		Resource resource = npnrf.createResource(URI.createFileURI(destFile.getPath()));
		resource.getContents().add(nupnModel);
		resource.save(((XMLResource) resource).getDefaultSaveOptions());
	}
}
