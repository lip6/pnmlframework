/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.symmetricnet.finiteIntRanges;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.terms.BuiltInConstant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Int Range Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getValue <em>Value</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRangeConstant()
 * @model annotation="http://www.pnml.org/models/OCL InputRange='self.input->size() = 0 and self.range.start <= self.value <= self.range.end'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputRange'"
 *        annotation="http://www.pnml.org/models/ToPNML tag='finiteintrangeconstant' kind='son'"
 * @generated
 */
public interface FiniteIntRangeConstant extends BuiltInConstant {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRangeConstant_Value()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='value' kind='attribute'"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getContainerFiniteIntRangeConstant <em>Container Finite Int Range Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(FiniteIntRange)
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRangeConstant_Range()
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getContainerFiniteIntRangeConstant
	 * @model opposite="containerFiniteIntRangeConstant" containment="true" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	FiniteIntRange getRange();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(FiniteIntRange value);

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
} // FiniteIntRangeConstant
