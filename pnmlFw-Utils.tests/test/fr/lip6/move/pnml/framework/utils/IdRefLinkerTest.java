/**
 *  Copyright 2009 Universite Paris Ouest Nanterre & Sorbonne Universites, Univ. Paris 06 - CNRS UMR 7606 (LIP6/MoVe)
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
package fr.lip6.move.pnml.framework.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author ggiffo
 * 
 */
public class IdRefLinkerTest {

    IdRefLinker tobj;

    /**
     * @throws java.lang.Exception
     */
    @BeforeMethod(groups = { "idRefLinker" })
    public void setUp() throws Exception {
        tobj = new IdRefLinker();
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterMethod
    public void tearDown() throws Exception {
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.IdRefLinker#IdRefLinker()}.
     */
    @Test(groups = { "idRefLinker" })
    public void testIdRefLinker() {
        assert tobj.idRefElementsSize() == 0 : "Contruction failed (idref)";
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.IdRefLinker#addIdRef(java.lang.Object, java.lang.String[])}.
     */
    @Test(groups = { "idRefLinker" })
    public void testAddIdRef() {
        tobj.addIdRef(new Object(), new String[] { "" });
        assert tobj.idRefElementsSize() == 1;
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.IdRefLinker#linkAll()}.
     */
    @Test(groups = { "idRefLinker" }, enabled = false)
    public void testLinkAll() {
        // TODO
        assert false : "NYI";
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.IdRefLinker#reset()}.
     */
    @Test(dependsOnMethods = { "testAddIdRef" }, groups = { "idRefLinker" })
    public void testReset() {
        tobj.addIdRef(new Object(), new String[] { "" });
        tobj.reset();
        assert tobj.idRefElementsSize() == 0 : "Not yet implemented";
    }

    /**
     * Test method for
     * {@link fr.lip6.move.pnml.framework.utils.IdRefLinker#toString()}.
     */
    @Test(groups = { "idRefLinker" })
    public void testToString() {
        assert !tobj.toString().equals("") : "output failed";
    }

}
