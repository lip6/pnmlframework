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
package fr.lip6.move.pnml.framework.utils;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;

public class FakeHLAPIRootClass implements HLAPIRootClass {

    public void fromPNML(OMElement subRoot, IdRefLinker idr)
            throws InnerBuildException {
    }

    public Object getContainedItem() {
        return null;
    }

    public String toPNML() {
        return null;
    }

    public boolean validateOCL(DiagnosticChain diagnostics) {
        return false;
    }

	@Override
	public void toPNML(FileChannel fc) {
		
	}

}
