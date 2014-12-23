package fr.lip6.move.pnml.framework.apigen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.apache.commons.logging.Log;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.pnml.codegen.templates.model.HLAPI;
import org.eclipse.emf.pnml.codegen.templates.model.HLAPIEnum;
import org.eclipse.emf.pnml.codegen.templates.model.HLAPITests;
import org.eclipse.emf.pnml.codegen.templates.model.Tools;
import org.eclipse.emf.pnml.codegen.templates.model.ToolsTest;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;

/**
 *
 * @author Guillaume Giffo
 *
 */
public class GenerateHLAPI {

    /**
     *
     */
    public static final String HLAPI_ANNOTATION = "HLAPI";
    /**
     *
     */
    public static final String HLAPI_NS_URI = "http://www.pnml.org/models/HLAPI";
    /**
     * If changed here, must be changed in templates files too.
     */
    private static final String HLAPI_CLASSES_EXT = "HLAPI";
    /**
     * If changed here, must be changed in templates files too.
     */
    private static final String HLAPI_TEST_CLASSES_EXT = "HLAPITest";
    /**
     *
     */
    private String outputfolder;
    /**
     *
     */
    private String testoutputfolder;
    /**
     *
     */
    private Log log; // NOPMD by ggiffo on 7/4/08 11:02 AM
    /**
     *
     */
    private String tooling;

    /**
     * Call the generator for each package in GenModel.
     *
     * @param genmod
     *            the root GenModel to check.
     * @param outputPath
     *            the path to the folder where files will be wrote.
     * @param testPath
     *            the path to the folder where tests files will be wrote.
     * @param isTooling
     *            true if tool building is active
     */
    public final void generate(GenModel genmod, String outputPath,
            String testPath, String isTooling) {

        log = LogMaster.giveLogger("HLAPI");
        log
                .info("---------------------------------------------------------------------------------");
        log.info("Begining High-Level API generation");
        setOutputfolder(outputPath);
        setTestoutputfolder(testPath);
        setTooling(isTooling);
        log.info("All files will be generated in " + getOutputfolder());
        final EList<GenPackage> paks = genmod.getGenPackages();
        log.info("There are " + paks.size() + " Packages to process");

        for (GenPackage genPackage2 : paks) {
            final GenPackage genPackage = (GenPackage) genPackage2;
            generate(genPackage);
        }

        if (tooling != null && !tooling.trim().equals("")) {
            log.info("generating tools");
            produceToolsFor(genmod);
            if (getTestoutputfolder() != null
                    && !getTestoutputfolder().trim().equals("")) {
                log.info("generating tests tools");
                produceToolTestCodeFor(genmod);
            }
        }
        log.info("End of Hight-Level API generation");
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		loggerContext.stop();
    }

    /**
     * Look for annotated classes in the package, and call the code producer for
     * it.
     *
     * @param genpak
     *            The package to check
     */
    public final void generate(final GenPackage genpak) {

        log.info("Processing Package " + genpak.getNSURI());
        final List<GenClass> gcl = genpak.getOrderedGenClasses();
        final List<GenEnum> gen = genpak.getGenEnums();

        log.info("The package contains " + gcl.size() + " Classes and "
                + gen.size() + " enums objects");
        int count = 0;
        for (GenClass genClass2 : gcl) {
            final GenClass genClass = (GenClass) genClass2;
            // Give the Ecore Classifier (and trough this the access to ecore
            // annotations...)
            final EClassifier classifier = genClass.getEcoreClassifier();
            // we are only interested in Classes with HLAPI annotation
            final EAnnotation ean = classifier.getEAnnotation(HLAPI_NS_URI);
            if (ean == null) {
                continue;
            } else {
                // if get there so this class has the HLAPI annotation.
                // begin High level API class code generation.
                produceCodeFor(genClass);
                if (getTestoutputfolder() != null
                        && !getTestoutputfolder().trim().equals("")
                        && !genClass.isAbstract()) {
                    produceTestCodeFor(genClass);
                }
                count++;
            }
        }
        log.info(count + " classes generated for this package");

        log.info("now generating enums");
        count = 0;
        for (GenEnum genEnum2 : gen) {
            final GenEnum genEnum = (GenEnum) genEnum2;

            // Give the Ecore Classifier (and trough this the access to ecore
            // annotations...)
            final EClassifier classifier = genEnum.getEcoreClassifier();
            // we are only interested in Classes with HLAPI annotation
            final EAnnotation ean = classifier.getEAnnotation(HLAPI_NS_URI);
            if (ean == null) {
                continue;
            } else {
                // if get there so this class has the HLAPI annotation.
                // begin High level API class code generation.
                produceCodeFor(genEnum);
                count++;
            }
        }
        log.info(count + " enum classes generated for this package");

    }

    /**
     * this class produce the HLAPI class for the given genClass.
     *
     * @param gCl
     *            the genclass from which produce code.
     */
    public final void produceCodeFor(final GenClass gCl) {
        final HLAPI hlapi = new HLAPI();
        final String code = hlapi.generate(gCl);
        log.info("Generating " + gCl.getName() + " HLAPI class code");
        // Be careful the folder tree must exists
        final String path;
        path = gCl.getGenPackage().getInterfacePackageName().replace(".", "/")
                + "/hlapi";

        // creates folder tree
        if (new File(getOutputfolder() + "/" + path).mkdirs()) {
            log.info("packages folders created");
        }

        final File myfile = new File(getOutputfolder() + "/" + path + "/"
                + gCl.getInterfaceName() + HLAPI_CLASSES_EXT + ".java");
        try {
            final Writer output = new BufferedWriter(new FileWriter(myfile));
            output.write(code);
            output.close();
        } catch (IOException e) {
            log
                    .error(
                            "The java file cannot be write, have you check if the folder tree exists?",
                            e);
        }

    }

    /**
     * this class produce the HLAPI class for the given genClass.
     *
     * @param gCl
     *            the genclass from which produce code.
     */
    public final void produceTestCodeFor(final GenClass gCl) {
        final HLAPITests hlapi = new HLAPITests();
        final String code = hlapi.generate(gCl);
        log.info("Generating " + gCl.getName() + " HLAPI Test class code");
        // Be careful the folder tree must exists
        final String path;
        path = gCl.getGenPackage().getInterfacePackageName().replace(".", "/")
                + "/hlapi";

        // creates folder tree
        if (new File(getTestoutputfolder() + "/" + path).mkdirs()) {
            log.info("packages folders created");
        }

        final File myfile = new File(getTestoutputfolder() + "/" + path + "/"
                + gCl.getInterfaceName() + HLAPI_TEST_CLASSES_EXT + ".java");
        try {
            final Writer output = new BufferedWriter(new FileWriter(myfile));
            output.write(code);
            output.close();
        } catch (IOException e) {
            log
                    .error(
                            "The java file cannot be write, have you check if the folder tree exists?",
                            e);
        }
    }

    /**
     *
     * @param gCl
     *            the Genenum to process
     */
    public final void produceCodeFor(final GenEnum gCl) {
        final HLAPIEnum hlapiEnum = new HLAPIEnum();
        final String code = hlapiEnum.generate(gCl);
        log.info("Generating " + gCl.getName() + " HLAPI enum class code");

        // Be careful the folder tree must exists
        final String path;
        path = gCl.getGenPackage().getInterfacePackageName().replace(".", "/")
                + "/hlapi";

        if (new File(getOutputfolder() + "/" + path).mkdirs()) {
            log.info("packages folders created");
        }

        final File myfile;
        myfile = new File(getOutputfolder() + "/" + path + "/" + gCl.getName()
                + HLAPI_CLASSES_EXT + ".java");

        try {
            final Writer output = new BufferedWriter(new FileWriter(myfile));
            output.write(code);
            output.close();
        } catch (IOException e) {
            log
                    .error(
                            "The java file cannot be write, have you check if the folder tree exists?",
                            e);
        }

    }

    /**
     *
     * @param gmd
     *            the genPackage
     */
    public final void produceToolsFor(final GenModel gmd) {
        final Tools tl = new Tools();
        final String code = tl.generate(tooling);

        // Be careful the folder tree must exists
        final String path;
        path = tooling.replace(".", "/") + "/tools";
        if (new File(getOutputfolder() + "/" + path).mkdirs()) {
            log.info("packages folders created");
        }

        final File myfile;
        myfile = new File(getOutputfolder() + "/" + path + "/" + "Tools.java");

        try {
            final Writer output = new BufferedWriter(new FileWriter(myfile));
            output.write(code);
            output.close();
        } catch (IOException e) {
            log
                    .error(
                            "The java file cannot be write, have you check if the folder tree exists?",
                            e);
        }
    }

    /**
     *
     * @param gmd .
     */
    public final void produceToolTestCodeFor(final GenModel gmd) {
        final ToolsTest hlapi = new ToolsTest();
        final String code = hlapi.generate(tooling);
        // Be careful the folder tree must exists
        final String path;
        path = tooling.replace(".", "/") + "/tools";

        // creates folder tree
        if (new File(getTestoutputfolder() + "/" + path).mkdirs()) {
            log.info("packages folders created");
        }

        final File myfile = new File(getTestoutputfolder() + "/" + path + "/"
                + "ToolsTest.java");
        try {
            final Writer output = new BufferedWriter(new FileWriter(myfile));
            output.write(code);
            output.close();
        } catch (IOException e) {
            log
                    .error(
                            "The java file cannot be write, have you check if the folder tree exists?",
                            e);
        }
    }

    /**
     * @return the outputfolder
     */
    private String getOutputfolder() {
        return outputfolder;
    }

    /**
     * @param outputFolder
     *            the outputfolder to set
     */
    private void setOutputfolder(String outputFolder) {
        this.outputfolder = outputFolder;
    }

    /**
     * @return the testoutputfolder
     */
    private String getTestoutputfolder() {
        return testoutputfolder;
    }

    /**
     * @param mytestoutputfolder
     *            the testoutputfolder to set
     */
    private void setTestoutputfolder(String mytestoutputfolder) {
        this.testoutputfolder = mytestoutputfolder;
    }

    /**
     * @return the tooling
     */
    public final String isTooling() {
        return tooling;
    }

    /**
     * @param theTooling
     *            the tooling to set
     */
    public final void setTooling(String theTooling) {
        this.tooling = theTooling;
    }
}
