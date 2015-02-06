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
package fr.lip6.move.pnml.framework.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * This interface is for all HLAPI classes.
 * @author Guillaume Giffo
 *
 */
public interface HLAPIClass {

    /**
     *
     * @return the encapsulated object.
     */
    Object getContainedItem();

    /**
     * @return the string containing the PNML output.
     * @see #toPNML(FileChannel)
     */
    String toPNML();
    
    /**
     * Alternative (hopefully faster and more memory-efficient) way to 
     * write PNML contents into file. This the recommended way over {@link #toPNML()},
     * whenever possible.
     * 
     * @param fc the file channel into which to write the contents
     */
    void toPNML(FileChannel fc);

    /**
     *
     * Sets values to conform PNML document.
     *
     * @param subRoot
     *            the sub-tree to import.
     * @param idr
     *            an idreflinker to solve idref.
     * @exception InnerBuildException .
     * @exception InvalidIDException .
     * @exception VoidRepositoryException .
     */

    void fromPNML(OMElement subRoot, IdRefLinker idr)
            throws InnerBuildException, InvalidIDException,
            VoidRepositoryException;

    /**
     *
     * @param diagnostics
     *            for diagnostic informations.
     * @return true if there is no OCL violations
     */
    boolean validateOCL(DiagnosticChain diagnostics);
}
