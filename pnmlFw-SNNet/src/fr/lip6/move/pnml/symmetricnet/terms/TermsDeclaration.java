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
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration#getId <em>Id</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration#getContainerDeclarations <em>Container Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getTermsDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface TermsDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getTermsDeclaration_Id()
	 * @model id="true" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='id' kind='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getTermsDeclaration_Name()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='name' kind='attribute'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container Declarations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.terms.Declarations#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Declarations</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Declarations</em>' container reference.
	 * @see #setContainerDeclarations(Declarations)
	 * @see fr.lip6.move.pnml.symmetricnet.terms.TermsPackage#getTermsDeclaration_ContainerDeclarations()
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Declarations#getDeclaration
	 * @model opposite="declaration" transient="false"
	 * @generated
	 */
	Declarations getContainerDeclarations();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration#getContainerDeclarations <em>Container Declarations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Declarations</em>' container reference.
	 * @see #getContainerDeclarations()
	 * @generated
	 */
	void setContainerDeclarations(Declarations value);

	public abstract String toPNML();

	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	public abstract void toPNML(FileChannel fc);

	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // TermsDeclaration
