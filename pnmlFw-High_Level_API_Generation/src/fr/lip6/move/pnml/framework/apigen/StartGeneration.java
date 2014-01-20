package fr.lip6.move.pnml.framework.apigen;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.util.ImportManager;

import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;

/**
 *
 * @author Guillaume Giffo
 *
 */
public final class StartGeneration {

    /**
     * utility class, constructors not allowed.
     */
    private StartGeneration() {
        throw new UnsupportedOperationException();
    }

    /**
     * @param args
     *            no args needed
     */
    public static void main(final String[] args) {

        if (args.length != 1) {
            LogFactory.getLog("main failure").error(
                    "give the config file please");
        }
        List<GenerationConfigUnit> pathSet = null;
        try {
            final ParseConfFile pcf = new ParseConfFile(args[0]);
            pathSet = pcf.getPathSet();
        } catch (IOException e) {
            LogFactory.getLog("main failure").error(e);
            return; // NOPMD by ggiffo on 7/4/08 11:04 AM
        } catch (BadFileFormatException e) {
            LogFactory.getLog("main failure").error(e);
            return;
        } catch (OtherException e) {
            LogFactory.getLog("main failure").error(e);
            return;
        }

        final GenerateHLAPI gen = new GenerateHLAPI();
        GenModel genmodel;
        for (GenerationConfigUnit unit : pathSet) {
            try {
                genmodel = LoadEcore.loadGenModel(unit.getGenmodelLocation());
            } catch (BadFileFormatException e) {
                LogFactory.getLog("main failure").error(e);
                return;
            }
            final ImportManager importManager = new ImportManager("");
            genmodel.setImportManager(importManager);
            gen.generate(genmodel, unit.getOutputFolder(), unit
                    .getTestFilesFolder(), unit.getTooling());
        }
    }

}
