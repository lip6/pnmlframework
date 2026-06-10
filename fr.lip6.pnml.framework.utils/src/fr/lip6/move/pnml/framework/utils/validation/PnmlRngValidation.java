/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
package fr.lip6.move.pnml.framework.utils.validation;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.thaiopensource.validate.ValidationDriver;

import fr.lip6.move.pnml.framework.utils.exception.ValidationProcessException;

/**
 * This class is used to validate a file through RNG grammar.
 *
 * @author Guillaume Giffo
 *
 */
public class PnmlRngValidation {

    private static final String PNML_GRAMMAR_HTTP_PREFIX = "http://www.pnml.org/version-2009/grammar/";
    private static final String PNML_GRAMMAR_HTTPS_PREFIX = "https://www.pnml.org/version-2009/grammar/";
    private static final String LOCAL_GRAMMAR_RESOURCE_DIR = "/fr/lip6/move/pnml/framework/utils/validation/grammar/version-2009/grammar/";
        private static final String[] LOCAL_GRAMMAR_FILES = {
            "anyElement.rng", "arbitrarydeclarations.rng", "booleans.rng", "conventions.rng",
            "cyclicenumerations.rng", "dots.rng", "finiteenumerations.rng", "finiteintranges.rng",
            "highlevelnet.pntd", "hlcorestructure.rng", "integers.rng", "lists.rng", "multisets.rng",
            "partitions.rng", "pnmlcoremodel.rng", "pnmlextensions.rng", "pt-hlpng.pntd", "ptnet.pntd",
            "strings.rng", "symmetricnet.pntd", "terms.rng" };

        private static Path extractedGrammarDir;

    /**
     * the logger.
     */
    private static final Logger log = Logger.getLogger("fr.lip6.pnml.framework.validation");;

    /**
     * Default constructor.
     */
    public PnmlRngValidation() {
    }

    /**
     * Checks if a given pnml file is valid with a given grammar file.
     *
     * @param schemafile
     *            the path to schema file.
     * @param pnmldoc
     *            the path to doc.
     * @return true if valid
     * @throws ValidationProcessException
     *             if an error occur while reading the grammar
     */
    public final boolean validatePnmlDoc(String schemafile, String pnmldoc)
            throws ValidationProcessException {

        InputSource pnmldocStream = null;
        pnmldocStream = ValidationDriver.fileInputSource(pnmldoc);

        return validatePnmlDoc(schemafile, pnmldocStream);

    }

    /**
     * Checks if a given pnml file is valid with a given grammar file.
     *
     * @param schemafile
     *            the url to schema
     * @param pnmldocStream
     *            a stream corresponding to the file
     * @return true if valid
     * @throws ValidationProcessException
     *             if an error occur while reading the grammar
     */
    public final boolean validatePnmlDoc(String schemafile,
            InputSource pnmldocStream) throws ValidationProcessException {

        boolean isValid = false;

        final ValidationDriver valdrive = new ValidationDriver();
        InputSource schematIs = ValidationDriver.uriOrFileInputSource(resolveSchemaLocation(schemafile));
        boolean loadedShema;
        try {
            loadedShema = valdrive.loadSchema(schematIs);
        } catch (SAXException e1) {
            log.severe("The rng grammar file is not valid : "
                    + e1.getLocalizedMessage());
            throw new ValidationProcessException(e1);
        } catch (IOException e1) {
            log.severe("The rng grammar file can't be accessed : "
                    + e1.getLocalizedMessage());
            throw new ValidationProcessException(e1);
        }

        try {
            isValid = valdrive.validate(pnmldocStream);
        } catch (SAXException e) {
            log.severe("The file to validate is not valid :"
                    + e.getLocalizedMessage());
        } catch (IOException e) {
            log.severe("The file to validate cannot be correctly loaded :"
                    + e.getLocalizedMessage());
        }

        return isValid && loadedShema;

    }

    private String resolveSchemaLocation(String schemafile) {
        if (schemafile == null) {
            return null;
        }

        if (schemafile.startsWith(PNML_GRAMMAR_HTTP_PREFIX)
                || schemafile.startsWith(PNML_GRAMMAR_HTTPS_PREFIX)) {
            final int slash = schemafile.lastIndexOf('/');
            final String schemaName = slash >= 0 ? schemafile.substring(slash + 1) : schemafile;
            final Path extractedSchema = extractLocalSchema(schemaName);
            if (extractedSchema != null) {
                return extractedSchema.toAbsolutePath().toString();
            }
            log.warning("Local schema resource not found for " + schemafile + ", fallback to remote HTTPS location.");
            return schemafile.replace(PNML_GRAMMAR_HTTP_PREFIX, PNML_GRAMMAR_HTTPS_PREFIX);
        }
        return schemafile;
    }

    private synchronized Path extractLocalSchema(String schemaName) {
        try {
            if (extractedGrammarDir == null) {
                extractedGrammarDir = Files.createTempDirectory("pnml-grammar-");
                extractedGrammarDir.toFile().deleteOnExit();
                for (String fileName : LOCAL_GRAMMAR_FILES) {
                    final URL resource = getClass().getResource(LOCAL_GRAMMAR_RESOURCE_DIR + fileName);
                    if (resource == null) {
                        continue;
                    }
                    try (InputStream in = resource.openStream()) {
                        final Path out = extractedGrammarDir.resolve(fileName);
                        Files.copy(in, out, StandardCopyOption.REPLACE_EXISTING);
                        out.toFile().deleteOnExit();
                    }
                }
            }
            final Path candidate = extractedGrammarDir.resolve(schemaName);
            return Files.exists(candidate) ? candidate : null;
        } catch (IOException e) {
            log.warning("Unable to extract local grammar resources: " + e.getMessage());
            return null;
        }
    }

}
