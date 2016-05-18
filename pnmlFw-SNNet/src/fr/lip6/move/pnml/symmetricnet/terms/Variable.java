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
package fr.lip6.move.pnml.symmetricnet.terms;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.Variable#getVariableDecl <em>Variable Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getVariable()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='variable' kind='son'"
 * @generated
 */
public interface Variable extends Term {
	/**
	 * Returns the value of the '<em><b>Variable Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Decl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Decl</em>' reference.
	 * @see #setVariableDecl(VariableDecl)
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getVariable_VariableDecl()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='refvariable' kind='idref'"
	 * @generated
	 */
	VariableDecl getVariableDecl();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.terms.Variable#getVariableDecl <em>Variable Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Decl</em>' reference.
	 * @see #getVariableDecl()
	 * @generated
	 */
	void setVariableDecl(VariableDecl value);

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
} // Variable
