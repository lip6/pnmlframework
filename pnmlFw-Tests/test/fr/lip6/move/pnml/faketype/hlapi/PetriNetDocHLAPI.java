//0
/**
 * (C) University Pierre & Marie Curie - UMR CNRS 7606 (LIP6/MoVe)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial API and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture and code generation refactoring
 *    Fabrice Kordon (LIP6) - Chief Information Officer
 *    Laure Petrucci (LIPN) - Expert, Theory Advisor
 *    Nicolas Treves (CNAM) - Expert, Technical Advisor
 *
 * $Id ggiffo, Mon Jun 23 14:33:11 CEST 2008$
 */
package fr.lip6.move.pnml.faketype.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;

public class PetriNetDocHLAPI implements HLAPIClass {

    public boolean validateOCL(DiagnosticChain diagnostics) {
        return false;
    }

    public void fromPNML(OMElement subRoot, IdRefLinker idr)
            throws InnerBuildException {

    }

    public Object getContainedItem() {
        return null;
    }

    public String toPNML() {
        return null;
    }

	@Override
	public void toPNML(FileChannel fc) {
		
	}

}