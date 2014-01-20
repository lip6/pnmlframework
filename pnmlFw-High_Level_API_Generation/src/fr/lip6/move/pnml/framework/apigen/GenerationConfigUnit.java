package fr.lip6.move.pnml.framework.apigen;

/**
 *
 * @author Guillaume Giffo
 *
 */
public class GenerationConfigUnit {
    /**
     *
     */
    private String genmodelLocation;
    /**
     *
     */
    private String outputFolder;
    /**
     *
     */
    private String testFilesFolder;
    /**
     *
     */
    private String tooling;

    /**
     *
     * @param thegenmodelLocation
     *            the path to the genmodel.
     * @param theoutputFolder
     *            the path to the output folder.
     * @param thetestFilesFolder
     *            the path to the folder where tests files will be generated
     *            (optional)
     * @param thetooling
     *            do you want tool to be generated?
     */
    public GenerationConfigUnit(String thegenmodelLocation,
            String theoutputFolder, String thetestFilesFolder, String thetooling) {
        super();
        this.genmodelLocation = thegenmodelLocation;
        this.outputFolder = theoutputFolder;
        this.testFilesFolder = thetestFilesFolder;
        this.tooling = thetooling;
    }

    /**
     * @return the genmodelLocation
     */
    public final String getGenmodelLocation() {
        return genmodelLocation;
    }

    /**
     * @param thegenmodelLocation
     *            the genmodelLocation to set
     */
    public final void setGenmodelLocation(String thegenmodelLocation) {
        this.genmodelLocation = thegenmodelLocation;
    }

    /**
     * @return the outputFolder
     */
    public final String getOutputFolder() {
        return outputFolder;
    }

    /**
     * @param theoutputFolder
     *            the outputFolder to set
     */
    public final void setOutputFolder(String theoutputFolder) {
        this.outputFolder = theoutputFolder;
    }

    /**
     * @return the testFilesFolder
     */
    public final String getTestFilesFolder() {
        return testFilesFolder;
    }

    /**
     * @param thetestFilesFolder
     *            the testFilesFolder to set
     */
    public final void setTestFilesFolder(String thetestFilesFolder) {
        testFilesFolder = thetestFilesFolder;
    }

    /**
     * @return the tooling
     */
    public final String getTooling() {
        return tooling;
    }

    /**
     * @param thetooling
     *            the tooling to set
     */
    public final void setTooling(String thetooling) {
        this.tooling = thetooling;
    }
}
