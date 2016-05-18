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
package fr.lip6.move.pnml.symmetricnet.hlcorestructure;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.terms.Declarations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration#getStructure <em>Structure</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration#getContainerDeclarationPetriNet <em>Container Declaration Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration#getContainerDeclarationPage <em>Container Declaration Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage#getDeclaration()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='declaration' kind='son'"
 * @generated
 */
public interface Declaration extends HLCoreAnnotation {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.terms.Declarations#getContainerDeclaration <em>Container Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(Declarations)
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage#getDeclaration_Structure()
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Declarations#getContainerDeclaration
	 * @model opposite="containerDeclaration" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='structure' kind='follow'"
	 * @generated
	 */
	Declarations getStructure();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Declarations value);

	/**
	 * Returns the value of the '<em><b>Container Declaration Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Declaration Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Declaration Petri Net</em>' container reference.
	 * @see #setContainerDeclarationPetriNet(PetriNet)
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage#getDeclaration_ContainerDeclarationPetriNet()
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet#getDeclaration
	 * @model opposite="declaration" transient="false"
	 * @generated
	 */
	PetriNet getContainerDeclarationPetriNet();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration#getContainerDeclarationPetriNet <em>Container Declaration Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Declaration Petri Net</em>' container reference.
	 * @see #getContainerDeclarationPetriNet()
	 * @generated
	 */
	void setContainerDeclarationPetriNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Container Declaration Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Declaration Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Declaration Page</em>' container reference.
	 * @see #setContainerDeclarationPage(Page)
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage#getDeclaration_ContainerDeclarationPage()
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page#getDeclaration
	 * @model opposite="declaration" transient="false"
	 * @generated
	 */
	Page getContainerDeclarationPage();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration#getContainerDeclarationPage <em>Container Declaration Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Declaration Page</em>' container reference.
	 * @see #getContainerDeclarationPage()
	 * @generated
	 */
	void setContainerDeclarationPage(Page value);

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
} // Declaration
