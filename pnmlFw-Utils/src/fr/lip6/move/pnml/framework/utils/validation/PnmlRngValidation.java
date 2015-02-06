/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.framework.utils.validation;

import java.io.IOException;

import org.slf4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.thaiopensource.validate.ValidationDriver;

import fr.lip6.move.pnml.framework.utils.exception.ValidationProcessException;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;

/**
 * This class is used to validate a file through RNG grammar.
 *
 * @author Guillaume Giffo
 *
 */
public class PnmlRngValidation {

    /**
     * the logger.
     */
    private final Logger log;

    /**
     * Default constructor.
     */
    public PnmlRngValidation() {
        log = LogMaster.getLogger("PNML validation");
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
        InputSource schematIs = null;
        schematIs = ValidationDriver.uriOrFileInputSource(schemafile);
        boolean loadedShema;
        try {
            loadedShema = valdrive.loadSchema(schematIs);
        } catch (SAXException e1) {
            log.error("The rng grammar file is not valid : "
                    + e1.getLocalizedMessage());
            throw new ValidationProcessException(e1);
        } catch (IOException e1) {
            log.error("The rng grammar file can't be accessed : "
                    + e1.getLocalizedMessage());
            throw new ValidationProcessException(e1);
        }

        try {
            isValid = valdrive.validate(pnmldocStream);
        } catch (SAXException e) {
            log.error("The file to validate is not valid :"
                    + e.getLocalizedMessage());
        } catch (IOException e) {
            log.error("The file to validate cannot be correctly loaded :"
                    + e.getLocalizedMessage());
        }

        return isValid && loadedShema;

    }

}
