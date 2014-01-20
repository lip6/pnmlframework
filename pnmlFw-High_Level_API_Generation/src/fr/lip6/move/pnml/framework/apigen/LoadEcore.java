package fr.lip6.move.pnml.framework.apigen;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;

/**
 * 
 * @author Guillaume Giffo
 * 
 */
public final class LoadEcore {

    /**
     * utility class, constructors not allowed.
     */
    private LoadEcore() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param ePath
     *            the path to the ecore file
     * @return The Epackage from the ecore file
     * @throws BadFileFormatException
     *             if the file is not a ecore file
     */
    public static EPackage loadEcore(final String ePath)
            throws BadFileFormatException {

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",
                new XMIResourceFactoryImpl());

        final GenModelPackage modelgenInstance = GenModelPackage.eINSTANCE;
        modelgenInstance.toString();

        final ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getURIConverter().getURIMap().putAll(
                EcorePlugin.computePlatformURIMap(true));

        final URI ecoreURI = URI.createFileURI(ePath);
        final Resource ecoreResource = resourceSet.getResource(ecoreURI, true);

        if (!(ecoreResource.getContents().get(0) instanceof EPackage)) {
            throw new BadFileFormatException("File is not .ecore");
        }

        return (EPackage) ecoreResource.getContents().get(0);
    }

    /**
     * 
     * @param gmPath
     *            the path to genModel File
     * @return The genmodel from The genmodel file
     * @throws BadFileFormatException
     *             if the file is not a GenModel one.
     */
    public static GenModel loadGenModel(final String gmPath)
            throws BadFileFormatException {

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",
                new XMIResourceFactoryImpl());

        final GenModelPackage modelgenInstance = GenModelPackage.eINSTANCE;
        modelgenInstance.toString();

        final ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getURIConverter().getURIMap().putAll(
                EcorePlugin.computePlatformURIMap(true));

        final URI genModelURI = URI.createFileURI(gmPath);
        final Resource genModelResource = resourceSet.getResource(genModelURI,
                true);

        if (!(genModelResource.getContents().get(0) instanceof GenModel)) {
            throw new BadFileFormatException("File is not .GenModel");
        }
        final GenModel genModel = (GenModel) genModelResource.getContents()
                .get(0);
        return genModel;

    }

}
