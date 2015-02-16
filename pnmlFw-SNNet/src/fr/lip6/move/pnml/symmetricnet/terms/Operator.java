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
package fr.lip6.move.pnml.symmetricnet.terms;

import java.nio.channels.FileChannel;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.Operator#getSubterm <em>Subterm</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.Operator#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.Operator#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getOperator()
 * @model abstract="true"
 *        annotation="http://www.pnml.org/models/OCL sameOperatorNTermSort='self.sort = self.output'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameOperatorNTermSort'"
 * @generated
 */
public interface Operator extends Term {
	/**
	 * Returns the value of the '<em><b>Subterm</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.symmetricnet.terms.Term}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.terms.Term#getContainerOperator <em>Container Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subterm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subterm</em>' containment reference list.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getOperator_Subterm()
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Term#getContainerOperator
	 * @model opposite="containerOperator" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='subterm' kind='follow'"
	 * @generated
	 */
	List<Term> getSubterm();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Sort)
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getOperator_Output()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	Sort getOutput();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.terms.Operator#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Sort value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.symmetricnet.terms.Sort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getOperator_Input()
	 * @model derived="true"
	 * @generated
	 */
	List<Sort> getInput();

	@Override
	public abstract String toPNML();

	@Override
	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	@Override
	public abstract void toPNML(FileChannel fc);

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // Operator
