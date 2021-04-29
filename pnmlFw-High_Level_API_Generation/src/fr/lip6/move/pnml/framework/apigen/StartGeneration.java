package fr.lip6.move.pnml.framework.apigen;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

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

    private static final Logger log = Logger.getLogger("fr.lip6.pnml.framework.gen");
    /**
     * @param args
     *            no args needed
     */
    public static void main(final String[] args) {

        if (args.length != 1) {
        	log.severe("give the config file please");
        }
        List<GenerationConfigUnit> pathSet = null;
        try {
            final ParseConfFile pcf = new ParseConfFile(args[0]);
            pathSet = pcf.getPathSet();
        } catch (IOException e) {
        	log.severe(e.getLocalizedMessage());
            return; // NOPMD by ggiffo on 7/4/08 11:04 AM
        } catch (BadFileFormatException e) {
            log.severe(e.getLocalizedMessage());
            return;
        } catch (OtherException e) {
        	log.severe(e.getLocalizedMessage());
            return;
        }

        final GenerateHLAPI gen = new GenerateHLAPI();
        GenModel genmodel;
        for (GenerationConfigUnit unit : pathSet) {
            try {
                genmodel = LoadEcore.loadGenModel(unit.getGenmodelLocation());
            } catch (BadFileFormatException e) {
            	log.severe(e.getLocalizedMessage());
                return;
            }
            final ImportManager importManager = new ImportManager("");
            genmodel.setImportManager(importManager);
            gen.generate(genmodel, unit.getOutputFolder(), unit
                    .getTestFilesFolder(), unit.getTooling());
        }
    }

}
