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
package fr.lip6.move.pnml.ptnet;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Name#getText <em>Text</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePetriNet <em>Container Name Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePnObject <em>Container Name Pn Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getName_()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='name' kind='son'"
 * @generated
 */
public interface Name extends Annotation {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getName_Text()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='text' kind='son'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Name#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Container Name Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Name Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name Petri Net</em>' container reference.
	 * @see #setContainerNamePetriNet(PetriNet)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getName_ContainerNamePetriNet()
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getName
	 * @model opposite="name" transient="false"
	 * @generated
	 */
	PetriNet getContainerNamePetriNet();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePetriNet <em>Container Name Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name Petri Net</em>' container reference.
	 * @see #getContainerNamePetriNet()
	 * @generated
	 */
	void setContainerNamePetriNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Container Name Pn Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PnObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Name Pn Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name Pn Object</em>' container reference.
	 * @see #setContainerNamePnObject(PnObject)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getName_ContainerNamePnObject()
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getName
	 * @model opposite="name" transient="false"
	 * @generated
	 */
	PnObject getContainerNamePnObject();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePnObject <em>Container Name Pn Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name Pn Object</em>' container reference.
	 * @see #getContainerNamePnObject()
	 * @generated
	 */
	void setContainerNamePnObject(PnObject value);

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
} // Name
