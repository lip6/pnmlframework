/**
 *  Copyright 2009 Universite Paris Ouest and Sorbonne Universites,
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
package fr.lip6.move.pnml.framework.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

public class ModelRepositoryTest {

    @BeforeMethod(groups = { "modelRepository" })
    public void setUp() throws Exception {
    	 ModelRepository themr = ModelRepository.getInstance();
    	 themr.reset();
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test(groups = { "modelRepository" })
    public void testGetInstance() {
        ModelRepository mr = ModelRepository.getInstance();
        ModelRepository mr2 = ModelRepository.getInstance();
        assert !mr.equals(mr2) : "Singleton Failure";
    }

    @Test(groups = { "modelRepository" })
    public void testOpenModelString() throws InvalidIDException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        themr.createDocumentWorkspace(test);
        assert themr.getRegisteredModelsId().size() == 1 : "Model not correctly registered";
    }

    @Test(groups = { "modelRepository" }, expectedExceptions = { InvalidIDException.class })
    public void testOpenModelString2() throws InvalidIDException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        themr.createDocumentWorkspace(test);
        themr.createDocumentWorkspace(test);
        assert false : "exception not thrown";
    }

    @Test(groups = { "modelRepository" })
    public void testOpenModelStringHLAPIRootClass() throws InvalidIDException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        HLAPIRootClass hlrc = new FakeHLAPIRootClass();
        themr.createDocumentWorkspace(test, hlrc);
        assert themr.getRegisteredModelsId().size() == 1 : "Model not correctly registered";
        assert themr.getCurrentDocWSId().equals(test) : "Current model not correctly set";

    }

    @Test(groups = { "modelRepository" })
    public void testCloseModel() throws InvalidIDException,
            VoidRepositoryException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        themr.createDocumentWorkspace(test);
        assert themr.getRegisteredModelsId().size() == 1 : "Model not correctly registered";
        themr.destroyCurrentWorkspace();
        assert themr.getRegisteredModelsId().size() == 0 : "Model not correctly closed";
        assert themr.getCurrentDocWSId() == null : "Current model not correctly unset";
    }

    @Test(groups = { "modelRepository" }, expectedExceptions = { VoidRepositoryException.class })
    public void testCloseModel3() throws InvalidIDException,
            VoidRepositoryException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        themr.createDocumentWorkspace(test);
        themr.destroyCurrentWorkspace();
        themr.destroyCurrentWorkspace();
        assert false : "exception not thrown";
    }

    @Test(groups = { "modelRepository" }, expectedExceptions = { InvalidIDException.class })
    public void testGetIdRepository() throws InvalidIDException,
            VoidRepositoryException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        themr.createDocumentWorkspace(test);
        String get = themr.getCurrentIdRepository().checkId("toto", null);
        assert get.equals("toto");
        assert themr.getCurrentIdRepository() != null : "fail";
        themr.getCurrentIdRepository().checkId("toto", null);
    }

    @Test(groups = { "modelRepository" }, expectedExceptions = { VoidRepositoryException.class })
    public void testGetIdRepository3() throws InvalidIDException,
            VoidRepositoryException {
        ModelRepository themr = ModelRepository.getInstance();
        themr.getCurrentIdRepository();
        assert false : "exception not thrown";
    }

    @Test(groups = { "modelRepository" })
    public void testGetHLAPIRootClass() throws InvalidIDException,
            VoidRepositoryException {
        String test = "test";
        ModelRepository themr = ModelRepository.getInstance();
        HLAPIRootClass hlrc = new FakeHLAPIRootClass();
        themr.createDocumentWorkspace(test, hlrc);
        assert themr.getCurrentHLAPIRootClass().equals(hlrc) : "not equals";
    }

    @Test(groups = { "modelRepository" }, expectedExceptions = { VoidRepositoryException.class })
    public void testGetHLAPIRootClass3() throws InvalidIDException,
            VoidRepositoryException {
        ModelRepository themr = ModelRepository.getInstance();
        HLAPIRootClass hlrc = new FakeHLAPIRootClass();
        themr.getCurrentHLAPIRootClass().equals(hlrc);
        assert false : "exception not thrown";
    }

    @Test(groups = { "modelRepository" })
    public void testsetgetcurrentPrettyPrintStatus() throws InvalidIDException,
            VoidRepositoryException {
        ModelRepository themr = ModelRepository.getInstance();
        themr.createDocumentWorkspace("toto");
        assert !themr.isPrettyPrintActive() : "default value not false";
        themr.setPrettyPrintStatus(true);
        assert themr.isPrettyPrintActive() : "value not updated";
    }

}
