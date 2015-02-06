/**
 *  Copyright 2009 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR
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
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;

public class ImportCustomPNMLFileTypeTest {

    private static String fullpath = "";

    @BeforeTest(groups = { "customPNMLfile" })
    protected void giveinfo() {
        fullpath = new File("").getAbsolutePath().split("/trunk")[0]
                + "/trunk/Tests/XMLTestFilesRepository";
        System.out.println("the root folder is "
                + new File("").getAbsolutePath());
        System.out.println("full path to xmlrepository " + fullpath);
    }

    @BeforeMethod(groups = { "customPNMLfile" })
    protected void setUp() throws Exception {

    }

    protected void tearDown() throws Exception {
    }

    @Test(groups = { "customPNMLfile" }, expectedExceptions = { IOException.class })
    public void testImportCustomPNMLFileTypeEX() throws IOException, BadFileFormatException, OtherException {
        new ImportCustomPNMLFileType(fullpath + "/nonfile.ftype.xml");

    }

    @Test(groups = { "customPNMLfile" })
    public void testImportCustomPNMLFileType() throws IOException, BadFileFormatException, OtherException {
        ImportCustomPNMLFileType impo = new ImportCustomPNMLFileType(fullpath
                + "/filetype.ftype.xml");
        assert impo != null;

    }

    @Test(groups = { "customPNMLfile" })
    public void testGetByNamespace() throws IOException, BadFileFormatException, OtherException {
        ImportCustomPNMLFileType impo = new ImportCustomPNMLFileType(fullpath
                + "/filetype.ftype.xml");
        CustomPNMLFileType retour = impo
                .getByNamespace("http://www.pnml.org/version-2009/grammar/pnmlcoremodel");
        assert retour.getClassName().equals(
                "fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI");
        assert retour.getNamespace().equals(
                "http://www.pnml.org/version-2009/grammar/pnmlcoremodel");
        assert retour.getRngUrl().equals(
                "http://www.pnml.org/version-2009/grammar/pnmlcoremodel.rng");
    }

    @Test(groups = { "customPNMLfile" })
    public void testGetByClassName() throws IOException, BadFileFormatException, OtherException {
        ImportCustomPNMLFileType impo = new ImportCustomPNMLFileType(fullpath
                + "/filetype.ftype.xml");
        CustomPNMLFileType retour = impo
                .getByClassName("fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI");
        assert retour.getClassName().equals(
                "fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI");
        assert retour.getNamespace().equals(
                "http://www.pnml.org/version-2009/grammar/pnmlcoremodel");
        assert retour.getRngUrl().equals(
                "http://www.pnml.org/version-2009/grammar/pnmlcoremodel.rng");
    }

}
