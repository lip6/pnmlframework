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
 * <copyright>
 * </copyright>
 *
 * $Id ggiffo, Tue Dec 23 11:30:46 CET 2014$
 */
package fr.lip6.move.pnml.ptnet.tools;

import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PlaceNodeHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.TransitionNodeHLAPI;

public class Tools {
	 /**
     * Test if a refplace is member of a circular cycle.
     * @param rp the ref place to test
     * @return true if there is no circular cycle, false either
     */
    public static boolean circularElement(RefPlaceHLAPI rp) {

        PlaceNodeHLAPI test = rp.getRefHLAPI();

        while (test != null) {
            if (test.getClass().equals(PlaceHLAPI.class))
                return true;
            if (((RefPlaceHLAPI)test).equals(rp))
                return false;
            test = ((RefPlaceHLAPI) test).getRefHLAPI();
        }
        return false;
    }

    /**
     * Test if a refplace is member of a circular cycle.
     * @param rt the ref place to test
     * @return true if there is no circular cycle, false either
     */
    public static boolean circularElement(RefTransitionHLAPI rt) {

        TransitionNodeHLAPI test = rt.getRefHLAPI();

        while (test != null) {
            if (test.getClass().equals(TransitionHLAPI.class))
                return true;
            if (((RefTransitionHLAPI)test).equals(rt))
                return false;
            test = ((RefTransitionHLAPI) test).getRefHLAPI();
        }
        return false;
    }

    /**
     * Fuse documents of two given workspace in one. All net of second document
     * will now belong in first one.
     *
     * @param WsId1
     *            id of first Document Workspace
     * @param WsId2
     *            id of second Document Workspace
     * @throws InvalidIDException
     *             if an unexisting workspace is given or if duplicated id
     *             exists between the two workspaces
     * @throws VoidRepositoryException
     *             if Model repository has not been initializated.
     * @throws OtherException
     *             if a problem occure with classes
     */
    public static void fuseDocuments(String WsId1, String WsId2)
            throws InvalidIDException, VoidRepositoryException, OtherException {
        PetriNetDocHLAPI doc1;
        PetriNetDocHLAPI doc2;
        IdRepository idr1;
        IdRepository idr2;

        ModelRepository mr = ModelRepository.getInstance();
        mr.changeCurrentDocWorkspace(WsId1);
        if (mr.getCurrentHLAPIRootClass() !=null && mr.getCurrentHLAPIRootClass().getClass().equals(
                PetriNetDocHLAPI.class)) {
            doc1 = (PetriNetDocHLAPI) mr.getCurrentHLAPIRootClass();
            idr1 = mr.getCurrentIdRepository();
        } else {
            throw new OtherException(
                    "The HLAPIRootClass is not of the expected type");
        }

        mr.changeCurrentDocWorkspace(WsId2);
        if (mr.getCurrentHLAPIRootClass() !=null && mr.getCurrentHLAPIRootClass().getClass().equals(
                PetriNetDocHLAPI.class)) {
            doc2 = (PetriNetDocHLAPI) mr.getCurrentHLAPIRootClass();
            idr2 = mr.getCurrentIdRepository();
        } else {
            throw new OtherException(
                    "The HLAPIRootClass is not of the expected type");
        }

        mr.changeCurrentDocWorkspace(WsId1);
        if (!idr1.isCompatible(idr2))
            throw new InvalidIDException(
                    "Common ids exists between the two workspaces");

        for (PetriNetHLAPI net : doc2.getNetsHLAPI()) {
            doc1.addNetsHLAPI(net);
        }
        idr1.fuseWith(idr2);
        mr.changeCurrentDocWorkspace(WsId2);
        mr.destroyCurrentWorkspace();
        mr.changeCurrentDocWorkspace(WsId1);
    }
}