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
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Declarations</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Declarations#getDeclaration
 * <em>Declaration</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Declarations#getContainerDeclaration
 * <em>Container Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getDeclarations()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='declarations'
 *        kind='son'" annotation="http://www.pnml.org/models/HLAPI"
 * @generated
 */
public interface Declarations extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration}. It is bidirectional
	 * and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getContainerDeclarations
	 * <em>Container Declarations</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getDeclarations_Declaration()
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getContainerDeclarations
	 * @model opposite="containerDeclarations" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	List<TermsDeclaration> getDeclaration();

	/**
	 * Returns the value of the '<em><b>Container Declaration</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration#getStructure
	 * <em>Structure</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Declaration</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Declaration</em>' container
	 *         reference.
	 * @see #setContainerDeclaration(Declaration)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getDeclarations_ContainerDeclaration()
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration#getStructure
	 * @model opposite="structure" transient="false"
	 * @generated
	 */
	Declaration getContainerDeclaration();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Declarations#getContainerDeclaration
	 * <em>Container Declaration</em>}' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Declaration</em>' container
	 *              reference.
	 * @see #getContainerDeclaration()
	 * @generated
	 */
	void setContainerDeclaration(Declaration value);

	/**
	 * Return the string containing the pnml output
	 */
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	public void fromPNML(OMElement subRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	public void toPNML(FileChannel fc);

	public boolean validateOCL(DiagnosticChain diagnostics);
} // Declarations
