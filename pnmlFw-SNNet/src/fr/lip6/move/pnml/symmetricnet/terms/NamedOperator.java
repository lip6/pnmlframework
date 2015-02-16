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
 * A representation of the model object '<em><b>Named Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.NamedOperator#getDef <em>Def</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.NamedOperator#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getNamedOperator()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='namedoperator' kind='son'"
 * @generated
 */
public interface NamedOperator extends OperatorDecl {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.terms.Term#getContainerNamedOperator <em>Container Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(Term)
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getNamedOperator_Def()
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Term#getContainerNamedOperator
	 * @model opposite="containerNamedOperator" containment="true" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='def' kind='follow'"
	 * @generated
	 */
	Term getDef();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.terms.NamedOperator#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(Term value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.symmetricnet.terms.VariableDecl}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.terms.VariableDecl#getContainerNamedOperator <em>Container Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getNamedOperator_Parameters()
	 * @see fr.lip6.move.pnml.symmetricnet.terms.VariableDecl#getContainerNamedOperator
	 * @model opposite="containerNamedOperator" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='parameter' kind='follow'"
	 * @generated
	 */
	List<VariableDecl> getParameters();

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
} // NamedOperator
