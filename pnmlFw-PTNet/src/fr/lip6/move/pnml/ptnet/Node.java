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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Node#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Node#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Node#getNodegraphics <em>Nodegraphics</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends PnObject {
	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.ptnet.Arc}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNode_InArcs()
	 * @see fr.lip6.move.pnml.ptnet.Arc#getTarget
	 * @model opposite="target" changeable="false" ordered="false"
	 * @generated
	 */
	List<Arc> getInArcs();

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.ptnet.Arc}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNode_OutArcs()
	 * @see fr.lip6.move.pnml.ptnet.Arc#getSource
	 * @model opposite="source" changeable="false" ordered="false"
	 * @generated
	 */
	List<Arc> getOutArcs();

	/**
	 * Returns the value of the '<em><b>Nodegraphics</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodegraphics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodegraphics</em>' containment reference.
	 * @see #setNodegraphics(NodeGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNode_Nodegraphics()
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerNode
	 * @model opposite="containerNode" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	NodeGraphics getNodegraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Node#getNodegraphics <em>Nodegraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodegraphics</em>' containment reference.
	 * @see #getNodegraphics()
	 * @generated
	 */
	void setNodegraphics(NodeGraphics value);

	@Override
	public abstract String toPNML();

	@Override
	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	@Override
	public abstract void toPNML(FileChannel fc);

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // Node
