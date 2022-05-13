/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6/MoVe)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial models and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture 
 *    Guillaume Giffo (UPMC) - Code generation refactoring, High-level API
 */
package fr.lip6.move.pnml.symmetricnet.multisets;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetOperator;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.multisets.Empty#getRefsort <em>Refsort</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.multisets.MultisetsPackage#getEmpty()
 * @model annotation="http://www.pnml.org/models/OCL InputSize='self.input->size = 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSize'"
 *        annotation="http://www.pnml.org/models/ToPNML tag='empty' kind='son'"
 * @generated
 */
public interface Empty extends MultisetOperator {
	/**
	 * Returns the value of the '<em><b>Refsort</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.terms.Sort#getContainerEmpty <em>Container Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsort</em>' containment reference.
	 * @see #setRefsort(Sort)
	 * @see fr.lip6.move.pnml.symmetricnet.multisets.MultisetsPackage#getEmpty_Refsort()
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Sort#getContainerEmpty
	 * @model opposite="containerEmpty" containment="true" required="true"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Sort getRefsort();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.multisets.Empty#getRefsort <em>Refsort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsort</em>' containment reference.
	 * @see #getRefsort()
	 * @generated
	 */
	void setRefsort(Sort value);

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	@Override
	public void fromPNML(OMElement subRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	@Override
	public void toPNML(FileChannel fc);

	@Override
	public boolean validateOCL(DiagnosticChain diagnostics);
} // Empty
