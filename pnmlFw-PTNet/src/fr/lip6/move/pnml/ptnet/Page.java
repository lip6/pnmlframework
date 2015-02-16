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
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Page#getObjects <em>Objects</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Page#getContainerPetriNet <em>Container Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Page#getNodegraphics <em>Nodegraphics</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPage()
 * @model annotation="http://www.pnml.org/models/ToPNML kind='son' tag='page'"
 * @generated
 */
public interface Page extends PnObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.ptnet.PnObject}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PnObject#getContainerPage <em>Container Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPage_Objects()
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getContainerPage
	 * @model opposite="containerPage" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	List<PnObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Container Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PetriNet#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Petri Net</em>' container reference.
	 * @see #setContainerPetriNet(PetriNet)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPage_ContainerPetriNet()
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getPages
	 * @model opposite="pages" transient="false" ordered="false"
	 * @generated
	 */
	PetriNet getContainerPetriNet();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Page#getContainerPetriNet <em>Container Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Petri Net</em>' container reference.
	 * @see #getContainerPetriNet()
	 * @generated
	 */
	void setContainerPetriNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Nodegraphics</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerPage <em>Container Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodegraphics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodegraphics</em>' containment reference.
	 * @see #setNodegraphics(NodeGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPage_Nodegraphics()
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerPage
	 * @model opposite="containerPage" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	NodeGraphics getNodegraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Page#getNodegraphics <em>Nodegraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodegraphics</em>' containment reference.
	 * @see #getNodegraphics()
	 * @generated
	 */
	void setNodegraphics(NodeGraphics value);

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
} // Page
