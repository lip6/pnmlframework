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
/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.slf4j.Logger;
import org.xml.sax.InputSource;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.exception.OCLValidationFailed;
import fr.lip6.move.pnml.framework.utils.exception.ValidationFailedException;
import fr.lip6.move.pnml.framework.utils.exception.ValidationProcessException;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;
import fr.lip6.move.pnml.framework.utils.validation.PnmlRngValidation;

/**
 * This Abstract class contains common elements of import and export.
 *
 * @author Guillaume Giffo
 *
 */
public abstract class AbstractPnmlImportExport { // NOPMD by ggiffo on 8/1/08
    // 2:57 PM

    /**
     * Logging system.
     */
    protected final Logger log; // NOPMD by ggiffo on 8/1/08 2:58 PM

    /**
     * the extensions filetype file.
     */
    protected final String newTypeFilePath;

    /**
     * Is ocl checking on?
     */
    private boolean checkOcl = true;

    /**
     * Is XML file grammar validation on?
     */
    private boolean validateFile = true;

    /**
     * Generic constructor, sets the logging system.
     *
     * @param loggername
     *            the logger name
     * @param filePath
     *            the path to the custom plug in registration file
     */
    protected AbstractPnmlImportExport(String loggername, String filePath) {
        log = LogMaster.getLogger(loggername);
        newTypeFilePath = filePath;
    }

    /**
     * Calls ocl checking one the given object.
     *
     * @param rootclass
     *            the object to check
     * @throws OCLValidationFailed
     *             if an error occur while checking ocl.
     */
    protected final void oclChecking(HLAPIClass rootclass)
            throws OCLValidationFailed {
        if (checkOcl) {
            final DiagnosticChain diagnostics = new BasicDiagnostic();
            if (!rootclass.validateOCL(diagnostics)) {
                log.trace(diagnostics.toString());
                for (Diagnostic diag : ((BasicDiagnostic) diagnostics)
                        .getChildren()) {
                    log.error(diag.getMessage());
                }
                throw new OCLValidationFailed(((BasicDiagnostic) diagnostics)
                        .getException());
            }
        } else {
            if (log.isWarnEnabled()) {
                log.warn("OCL checking disabled");
            }
        }
    }

    /**
     * Validates the xml file to grammar.
     *
     * @param schemafile
     *            the url to rng file.
     * @param pnmldocStream
     *            the stream of document
     * @throws ValidationFailedException
     *             if the validation test failed
     */
    protected final void rngGrammarValidation(String schemafile,
            InputSource pnmldocStream) throws ValidationFailedException {
        if (validateFile && schemafile != null) {
            final PnmlRngValidation validator = new PnmlRngValidation();
            try {
                if (!validator.validatePnmlDoc(schemafile, pnmldocStream)) {
                    throw new ValidationFailedException(
                            "this document does not conform to the " + schemafile
                                    + " specifications");
                }
            } catch (ValidationProcessException e) {
                if (log.isErrorEnabled()) {
                    log
                            .error("Grammar file errors have been raised, the validation can't be done,"
                                    + " process will continue without Grammar validation");
                }
            }
        } else {
            if (log.isWarnEnabled()) {
                if (validateFile) {
                    log.warn("no XML grammar associated to this library");
                } else {
                    log.warn("XML validation disabled");
                }
            }
        }
    }

    /**
     * @return the checkOcl
     */
    public final boolean isCheckOclEnabled() {
        return checkOcl;
    }

    /**
     * Enables ocl checking (enabled by default).
     */
    public final void enableOclChecking() {
        this.checkOcl = true;
    }

    /**
     * Disables ocl checking (enabled by default).
     */
    public final void disableOclChecking() {
        this.checkOcl = false;
    }

    /**
     * @return the validateFile
     */
    public final boolean isGrammarValidationEnabled() {
        return validateFile;
    }

    /**
     * Enables Grammar Validation.
     */
    public final void enableGrammarValidation() {
        this.validateFile = true;
    }

    /**
     * Disables Grammar Validation.
     */
    public final void disableGrammarValidation() {
        this.validateFile = false;
    }

}
