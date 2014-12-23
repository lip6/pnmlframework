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

import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;

public class IdRepositoryTest {
    IdRepository idr;

    @BeforeMethod(groups = { "bad_parameters", "good_parameters", "new_id",
            "other elements" })
    public void setUp() throws Exception {
        idr = new IdRepository();
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test(groups = { "bad_parameters" }, expectedExceptions = { InvalidIDException.class })
    public void testCheckId() throws InvalidIDException {
        idr.checkId("", null);
    }

    @Test(groups = { "bad_parameters" }, expectedExceptions = { InvalidIDException.class })
    public void testCheckId1() throws InvalidIDException {
        idr.checkId("1261153", null);
    }

    @Test(groups = { "bad_parameters" }, expectedExceptions = { InvalidIDException.class })
    public void testCheckId4() throws InvalidIDException {
        idr.checkId(null, null);
    }

    @Test(groups = { "good_parameters" })
    public void testCheckId3() throws InvalidIDException {
        idr.checkId("a1458623", null);
    }

    @Test(groups = { "id_exists" }, expectedExceptions = { InvalidIDException.class })
    public void testCheckId9() throws InvalidIDException {
        idr.checkId("1458623", null);
        idr.checkId("1458623", null);
    }

    @Test(groups = { "new_id" })
    public void testCheckId10() throws InvalidIDException {
        idr.checkId("a18987654615", null);
        idr.checkId("a18987654616", null);
        idr.checkId("a1898765461", null);
    }

    @Test(groups = { "multi_object" })
    public void testCheckId11() throws InvalidIDException {
        IdRepository idrep1;
        IdRepository idrep2;
        idrep1 = new IdRepository();
        idrep2 = new IdRepository();
        idrep1.checkId("a1999987654615", null);
        idrep2.checkId("a1999987654615", null);
    }

    @Test(groups = { "generatefreeID" })
    public void testgenerateFreeId() throws InvalidIDException {
        String returned = idr.generateFreeId("prefix", null);
        assert !returned.equals("") && returned != null;
    }

    @Test(groups = { "generatefreeID" }, expectedExceptions = { InvalidIDException.class })
    public void testgenerateFreeIdFail() throws InvalidIDException {
        idr.generateFreeId("1prefix", null);
        assert false : "exception not thrown";
    }

    @Test(groups = { "generatefreeID" }, expectedExceptions = { InvalidIDException.class })
    public void testgenerateFreeIdFail2() throws InvalidIDException {
        idr.generateFreeId("", null);
        assert false : "exception not thrown";
    }

    @Test(groups = { "generatefreeID" }, expectedExceptions = { InvalidIDException.class })
    public void testgenerateFreeIdFail3() throws InvalidIDException {
        idr.generateFreeId(null, null);
        assert false : "exception not thrown";
    }

    @Test(groups = { "getobjejct" }, expectedExceptions = { InvalidIDException.class })
    public void getObjectTest() throws InvalidIDException {
        Object o = new Object();
        idr.checkId("toto", o);
        assert o.equals(idr.getObject("void"));
    }

    @Test(groups = { "getobjejct" }, expectedExceptions = { InvalidIDException.class })
    public void getObjectTest2() throws InvalidIDException {
        Object o = new Object();
        idr.checkId("toto", o);
        idr.getObject("void");
    }

    @Test(groups = { "other elements" }, expectedExceptions = { InvalidIDException.class })
    public void removeTest() throws InvalidIDException {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        try {
            idr.checkId("id1", o1);
            idr.checkId("id2", o2);
            idr.checkId("id3", o3);
            idr.checkId("id4", o4);
        } catch (InvalidIDException e) {
            assert false;
        }
        try {
            assert idr.remove("id3").equals(o3);
        } catch (InvalidIDException e) {
            assert false;
        }
        idr.remove("titi");
    }

    @Test(groups = { "other elements" }, expectedExceptions = { InvalidIDException.class })
    public void changeIdTest() throws InvalidIDException {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        try {
            idr.checkId("id1", o1);
            idr.checkId("id2", o2);
            idr.checkId("id3", o3);
            idr.checkId("id4", o4);
            idr.changeId("id2", "id5");
        } catch (InvalidIDException e) {
            assert false;
        }
        assert idr.getObject("id5").equals(o2);
        idr.getObject("id2");
    }

    @Test(groups = { "other elements" }, expectedExceptions = { InvalidIDException.class })
    public void changeIdTest2() throws InvalidIDException, OtherException {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        try {
            idr.checkId("id1", o1);
            idr.checkId("id2", o2);
            idr.checkId("id3", o3);
            idr.checkId("id4", o4);
            idr.changeId(o2, "id5");
        } catch (InvalidIDException e) {
            assert false;
        }
        assert idr.getObject("id5").equals(o2);
        idr.getObject("id2");
    }

    @Test(groups = { "other elements" }, expectedExceptions = { OtherException.class })
    public void changeIdTest3() throws InvalidIDException, OtherException {
        Object o5 = new Object();
        idr.changeId(o5, "id5");
    }

    @Test(groups = { "other elements" }, expectedExceptions = { InvalidIDException.class })
    public void changeIdTest4() throws InvalidIDException, OtherException {
        idr.changeId("id1", "id5");
    }

    @Test(groups = { "other elements" })
    public void isCompliantTo() throws InvalidIDException {
        IdRepository idr2 = new IdRepository();

        idr.checkId("i1a", null);
        idr.checkId("i1b", null);
        idr.checkId("i1c", null);
        idr.checkId("i1d", null);
        idr.checkId("i1e", null);
        int idrsize = idr.getAllId().size();

        idr2.checkId("i2a", null);
        idr2.checkId("i2b", null);
        idr2.checkId("i2c", null);
        idr2.checkId("i2d", null);
        idr2.checkId("i2e", null);
        int idr2size = idr.getAllId().size();

        assert idr2.isCompatible(idr) : "failure";
        assert idr.isCompatible(idr2) : "failure";

        assert idrsize == idr.getAllId().size();
        assert idr2size == idr2.getAllId().size();
    }

    @Test(groups = { "other elements" })
    public void isCompliantTo2() throws InvalidIDException {
        IdRepository idr2 = new IdRepository();

        idr.checkId("i1a", null);
        idr.checkId("i1b", null);
        idr.checkId("i1c", null);
        idr.checkId("i1d", null);
        idr.checkId("i1e", null);
        idr.checkId("common", null);
        int idrsize = idr.getAllId().size();

        idr2.checkId("i2a", null);
        idr2.checkId("i2b", null);
        idr2.checkId("i2c", null);
        idr2.checkId("i2d", null);
        idr2.checkId("i2e", null);
        idr2.checkId("common", null);
        int idr2size = idr.getAllId().size();

        assert !idr2.isCompatible(idr) : "failure";
        assert !idr.isCompatible(idr2) : "failure";
        assert idrsize == idr.getAllId().size();
        assert idr2size == idr2.getAllId().size();
    }

    @Test(groups = { "other elements" })
    public void fusewith() throws InvalidIDException {
        IdRepository idr2 = new IdRepository();

        idr.checkId("i1a", null);
        idr.checkId("i1b", null);
        idr.checkId("i1c", null);
        idr.checkId("i1d", null);
        idr.checkId("i1e", null);
        int idrsize = idr.getAllId().size();

        idr2.checkId("i2a", null);
        idr2.checkId("i2b", null);
        idr2.checkId("i2c", null);
        idr2.checkId("i2d", null);
        idr2.checkId("i2e", null);
        int idr2size = idr.getAllId().size();

        assert idr.fuseWith(idr2) : "fuse failed";
        assert idr.getAllId().size() == idrsize + idr2size : "size failure";
        for (String word : idr2.getAllId()) {
            assert idr.getMap().containsValue(idr2.getObject(word));
        }
    }

}