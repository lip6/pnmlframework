/**
 *  Copyright 2009 Universite Paris Ouest and Sorbonne Universites, Univ. Paris 06 - CNRS UMR
 * 							7606 (LIP6)
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
package fr.lip6.move.pnml.framework.utils.validation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.thaiopensource.validate.ValidationDriver;

import fr.lip6.move.pnml.framework.general.OfficialPNMLFileType;
import fr.lip6.move.pnml.framework.utils.exception.ValidationProcessException;

/**
 * @author ggiffo
 * 
 */
public class PnmlRngValidationTest {

    PnmlRngValidation rngval = new PnmlRngValidation();
    private static String fullpath = "";

    @BeforeTest(groups = { "rngvalidation" })
    protected void giveinfo() {
        fullpath = new File("").getAbsolutePath().split("/trunk")[0]
                + "/trunk/Tests/XMLTestFilesRepository";
        System.out.println("the root folder is "
                + new File("").getAbsolutePath());
        System.out.println("full path to xmlrepository " + fullpath);
    }

    @Test(groups = { "rngvalidation" })
    protected void accesValidation() throws MalformedURLException,
            SAXException, IOException {
        final ValidationDriver valdrive = new ValidationDriver();
        assert valdrive.loadSchema(ValidationDriver
                .uriOrFileInputSource(OfficialPNMLFileType.COREMODEL
                        .getRngUrl()));
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.validation.PnmlRngValidation#validatePnmlDoc(java.lang.String, java.lang.String)}.
     * 
     * @throws ValidationProcessException
     */
    @Test(groups = { "rngvalidation" }, dependsOnMethods = { "accesValidation" })
    public void testValidatePnmlDocStringString()
            throws ValidationProcessException {
        Boolean retour = rngval.validatePnmlDoc(
                "http://www.pnml.org/version-2009/grammar/pnmlcoremodel.rng",
                fullpath + "/normal.xml");
        assert retour : "The validation has failed";
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.validation.PnmlRngValidation#validatePnmlDoc(java.lang.String, java.lang.String)}.
     * 
     * @throws ValidationProcessException
     */
    @Test(groups = { "rngvalidation" }, dependsOnMethods = { "accesValidation" })
    public void testValidatePnmlDocStringString2()
            throws ValidationProcessException {
        Boolean retour = rngval.validatePnmlDoc(
                "http://www.pnml.org/version-2009/grammar/pnmlcoremodel.rng",
                fullpath + "/unexixtingfile.xml");
        assert !retour : "The validation must failed (the file doesn't exists)";
    }

}
