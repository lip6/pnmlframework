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
package fr.lip6.move.pnml.framework.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PrettyPrintDataTest {

    PrettyPrintData ppd;

    @BeforeMethod(groups = { "PrettyPrint" })
    protected void setUp() throws Exception {
        ppd = new PrettyPrintData();
    }

    @AfterMethod(groups = { "PrettyPrint" })
    protected void tearDown() throws Exception {
    }

    @Test(groups = { "PrettyPrint" })
    public void PrettyPrintDataConstructorTest() {
        assert ppd.getLineHeader().equals(PrettyPrintData.DEFAULTTAB);
        assert ppd.getCurrentLineHeader().equals("");
        assert ppd.getLevel() == 0;
    }

    @Test(groups = { "PrettyPrint" })
    public void increaseLineHeaderLevelTest() {
        ppd.increaseLineHeaderLevel();
        assert ppd.getLevel() == 1;
        assert ppd.getCurrentLineHeader().equals(PrettyPrintData.DEFAULTTAB);
        ppd.increaseLineHeaderLevel();
        assert ppd.getLevel() == 2;
        assert ppd.getCurrentLineHeader().equals(
                PrettyPrintData.DEFAULTTAB + PrettyPrintData.DEFAULTTAB);
    }

    @Test(groups = { "PrettyPrint" })
    public void decreaseLineHeaderLevelTest() {
        ppd.increaseLineHeaderLevel();
        ppd.increaseLineHeaderLevel();
        ppd.decreaseLineHeaderLevel();
        assert ppd.getLevel() == 1;
        assert ppd.getCurrentLineHeader().equals(PrettyPrintData.DEFAULTTAB);
        ppd.decreaseLineHeaderLevel();
        assert ppd.getLevel() == 0;
        assert ppd.getCurrentLineHeader().equals("");
    }
}
