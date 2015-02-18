package fr.lip6.nupn.helper;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.lip6.nupn.NUPNToolspecificType;
import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.util.NupnResourceFactoryImpl;

/**
 * <p>This class provides useful methods to parse NUPN <toolspecific> sections in PNML, and
 * conveniently use them in memory as Ecore models (with their custom API).</p> 
 * <p>It can also load this NUPN toolinfo model from XML files that only contain the <toolspecifi> section.</p> 
 * <p>This class is not thread-safe.</p>
 * 
 * @author lom
 *
 */
public final class NUPNReader {

	
	private static final String PNML_NS_URI = "http://www.pnml.org/version-2009/grammar/pnml";
	/**
	 * Returns the root model object of a NUPN <toolspecific> section in PNML.
	 * All you need is to  cast it to the right EObject based on your model.
	 * <p>The section must begin with the <toolspecific> element as handed over by PNML Framework.<p>
	 * @param nupnXmlToolInfo the NUPN toolspecific section in PNML, as a String
	 * (returned by PNML Framework's ToolInfo#getFormattedXMLBuffer().toString()).
	 * @return the root model object of the NUPN <toolspecific> section in PNML, as an EMF EObject.
	 * @throws IOException
	 * @see {@link #loadToolInfoAsToolspecificType(String)}
	 */
	public static EObject loaNUPNToolInfo(String nupnXmlToolInfo) throws IOException { 
	    return extractNUPNToolInfo(nupnXmlToolInfo);
	}
	
	/**
	 * Returns the root model object of a NUPN <toolspecific> section in PNML, as a {@link ToolspecificType} type.
	 * <p>The section must begin with the <toolspecific> element as handed over by PNML Framework.<p>
	 * @param nupnXmlToolInfo the NUPN toolspecific section in PNML, as a String
	 * (returned by PNML Framework's ToolInfo#getFormattedXMLBuffer().toString()).
	 * @return the root model object of the NUPN <toolspecific> section in PNML, in its expected type 
	 * {@link ToolspecificType}
	 * @throws IOException
	 * @see {@link #loaNUPNToolInfo(String)}
	 */
	public static NUPNToolspecificType loadNUPNToolInfoAsToolspecificType(String nupnXmlToolInfo) throws IOException {
		 return (NUPNToolspecificType)extractNUPNToolInfo(nupnXmlToolInfo);
	}
	
	/**
	 * Returns the root model object and there you have it, all you need is to 
	 * cast it to the right EObject based on your model, in this case  {@link ToolspecificType}.
	 * @param nupnXmlToolInfoFile
	 * @return the NUPN toolspecific model according to the API exposed by this library.
	 * @throws IOException
	 */
	public static EObject loadNUPNToolInfoFromFile(File nupnXmlToolInfoFile) throws IOException {
	    ResourceSet resourceSet = new ResourceSetImpl();
	    NupnResourceFactoryImpl npnrf = new NupnResourceFactoryImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
	    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
	     npnrf);
	    NupnPackage ePackage = NupnPackage.eINSTANCE;
	    resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
	    // create resource using PNML namespace URI
	    Resource resource = npnrf.createResource(URI.createURI(nupnXmlToolInfoFile.getPath()));
	    resource.load(((XMLResource)resource).getDefaultLoadOptions());
	    return resource.getContents().get(0);
	}
	
	private static EObject extractNUPNToolInfo(String nupnXmlToolInfo) throws IOException {
		// create a ResourceSet
	    ResourceSet resourceSet = new ResourceSetImpl();
	    // register NupnResourceFactoryIml
	    NupnResourceFactoryImpl npnrf = new NupnResourceFactoryImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
	    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
	     npnrf);
	     // register your NupnPackage to the resource set so it has a reference to Nupn.ecore
	    NupnPackage ePackage = NupnPackage.eINSTANCE;
	    resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
	    // create resource using PNML namespace URI
	    Resource resource = npnrf.createResource(URI.createURI(PNML_NS_URI));
	    resource.load(new URIConverter.ReadableInputStream(nupnXmlToolInfo), null);
	    // return the root model object and there you have it, all you need is to
	    // cast it to the right EObject based on your model 
	    return resource.getContents().get(0);
	}
}
