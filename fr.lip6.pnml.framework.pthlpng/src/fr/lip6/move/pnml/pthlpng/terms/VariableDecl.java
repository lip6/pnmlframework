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
package fr.lip6.move.pnml.pthlpng.terms;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Variable
 * Decl</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getSort
 * <em>Sort</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getContainerNamedOperator
 * <em>Container Named Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getVariableDecl()
 * @model annotation="http://www.pnml.org/models/HLAPI"
 *        annotation="http://www.pnml.org/models/ToPNML tag='variabledecl'
 *        kind='son'"
 * @generated
 */
public interface VariableDecl extends TermsDeclaration {
	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference. It is
	 * bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerVariableDecl
	 * <em>Container Variable Decl</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(Sort)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getVariableDecl_Sort()
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerVariableDecl
	 * @model opposite="containerVariableDecl" containment="true" required="true"
	 *        ordered="false" annotation="http://www.pnml.org/models/ToPNML
	 *        kind='follow'"
	 * @generated
	 */
	Sort getSort();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getSort <em>Sort</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(Sort value);

	/**
	 * Returns the value of the '<em><b>Container Named Operator</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getParameters
	 * <em>Parameters</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Named Operator</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Named Operator</em>' container
	 *         reference.
	 * @see #setContainerNamedOperator(NamedOperator)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getVariableDecl_ContainerNamedOperator()
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	NamedOperator getContainerNamedOperator();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getContainerNamedOperator
	 * <em>Container Named Operator</em>}' container reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Named Operator</em>'
	 *              container reference.
	 * @see #getContainerNamedOperator()
	 * @generated
	 */
	void setContainerNamedOperator(NamedOperator value);

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	@Override
	public void fromPNML(OMElement subRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	@Override
	public void toPNML(FileChannel fc);

	@Override
	public boolean validateOCL(DiagnosticChain diagnostics);
} // VariableDecl
