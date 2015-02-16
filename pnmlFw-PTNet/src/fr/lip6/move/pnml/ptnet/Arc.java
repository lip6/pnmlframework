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
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Arc#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Arc#getArcgraphics <em>Arcgraphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Arc#getInscription <em>Inscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getArc()
 * @model annotation="http://www.pnml.org/models/OCL samePageSourceTarget='self.source.containerPage = self.target.containerPage' differentSourceTarget='(self.source.oclIsKindOf(PlaceNode) and self.target.oclIsKindOf(TransitionNode)) or (self.source.oclIsKindOf(TransitionNode) and self.target.oclIsKindOf(PlaceNode))'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='samePageSourceTarget differentSourceTarget'"
 *        annotation="http://www.pnml.org/models/ToPNML tag='arc' kind='son'"
 * @generated
 */
public interface Arc extends PnObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Node#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getArc_Source()
	 * @see fr.lip6.move.pnml.ptnet.Node#getOutArcs
	 * @model opposite="OutArcs" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='idref' tag='source'"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Node#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getArc_Target()
	 * @see fr.lip6.move.pnml.ptnet.Node#getInArcs
	 * @model opposite="InArcs" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='idref' tag='target'"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Arcgraphics</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.ArcGraphics#getContainerArc <em>Container Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcgraphics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcgraphics</em>' containment reference.
	 * @see #setArcgraphics(ArcGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getArc_Arcgraphics()
	 * @see fr.lip6.move.pnml.ptnet.ArcGraphics#getContainerArc
	 * @model opposite="containerArc" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	ArcGraphics getArcgraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Arc#getArcgraphics <em>Arcgraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcgraphics</em>' containment reference.
	 * @see #getArcgraphics()
	 * @generated
	 */
	void setArcgraphics(ArcGraphics value);

	/**
	 * Returns the value of the '<em><b>Inscription</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PTArcAnnotation#getContainerArc <em>Container Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscription</em>' containment reference.
	 * @see #setInscription(PTArcAnnotation)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getArc_Inscription()
	 * @see fr.lip6.move.pnml.ptnet.PTArcAnnotation#getContainerArc
	 * @model opposite="containerArc" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	PTArcAnnotation getInscription();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Arc#getInscription <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscription</em>' containment reference.
	 * @see #getInscription()
	 * @generated
	 */
	void setInscription(PTArcAnnotation value);

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
} // Arc
