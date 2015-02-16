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
 * A representation of the model object '<em><b>Node Graphics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getPosition <em>Position</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getDimension <em>Dimension</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getFill <em>Fill</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getLine <em>Line</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerNode <em>Container Node</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerPage <em>Container Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='graphics' kind='son'"
 * @generated
 */
public interface NodeGraphics extends Graphics {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Position#getContainerPNodeGraphics <em>Container PNode Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics_Position()
	 * @see fr.lip6.move.pnml.ptnet.Position#getContainerPNodeGraphics
	 * @model opposite="containerPNodeGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Dimension#getContainerDNodeGraphics <em>Container DNode Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Dimension)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics_Dimension()
	 * @see fr.lip6.move.pnml.ptnet.Dimension#getContainerDNodeGraphics
	 * @model opposite="containerDNodeGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Fill#getContainerNodeGraphics <em>Container Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Fill)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics_Fill()
	 * @see fr.lip6.move.pnml.ptnet.Fill#getContainerNodeGraphics
	 * @model opposite="containerNodeGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Fill value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Line#getContainerNodeGraphics <em>Container Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics_Line()
	 * @see fr.lip6.move.pnml.ptnet.Line#getContainerNodeGraphics
	 * @model opposite="containerNodeGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Container Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Node#getNodegraphics <em>Nodegraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Node</em>' container reference.
	 * @see #setContainerNode(Node)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics_ContainerNode()
	 * @see fr.lip6.move.pnml.ptnet.Node#getNodegraphics
	 * @model opposite="nodegraphics" transient="false"
	 * @generated
	 */
	Node getContainerNode();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerNode <em>Container Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Node</em>' container reference.
	 * @see #getContainerNode()
	 * @generated
	 */
	void setContainerNode(Node value);

	/**
	 * Returns the value of the '<em><b>Container Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Page#getNodegraphics <em>Nodegraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Page</em>' container reference.
	 * @see #setContainerPage(Page)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getNodeGraphics_ContainerPage()
	 * @see fr.lip6.move.pnml.ptnet.Page#getNodegraphics
	 * @model opposite="nodegraphics" transient="false"
	 * @generated
	 */
	Page getContainerPage();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerPage <em>Container Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Page</em>' container reference.
	 * @see #getContainerPage()
	 * @generated
	 */
	void setContainerPage(Page value);

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
} // NodeGraphics
