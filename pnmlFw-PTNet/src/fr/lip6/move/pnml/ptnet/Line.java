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
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getColor <em>Color</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getShape <em>Shape</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getContainerNodeGraphics <em>Container Node Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getContainerArcGraphics <em>Container Arc Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Line#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='line' kind='son'"
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.CSS2Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @see #setColor(CSS2Color)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_Color()
	 * @model default="black" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='color' kind='attribute'"
	 * @generated
	 */
	CSS2Color getColor();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(CSS2Color value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"line"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.LineShape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.LineShape
	 * @see #setShape(LineShape)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_Shape()
	 * @model default="line" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='shape' kind='attribute'"
	 * @generated
	 */
	LineShape getShape();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.LineShape
	 * @see #getShape()
	 * @generated
	 */
	void setShape(LineShape value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_Width()
	 * @model ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='width' kind='attribute'"
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Container Node Graphics</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Node Graphics</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Node Graphics</em>' container reference.
	 * @see #setContainerNodeGraphics(NodeGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_ContainerNodeGraphics()
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getLine
	 * @model opposite="line" transient="false" ordered="false"
	 * @generated
	 */
	NodeGraphics getContainerNodeGraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getContainerNodeGraphics <em>Container Node Graphics</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Node Graphics</em>' container reference.
	 * @see #getContainerNodeGraphics()
	 * @generated
	 */
	void setContainerNodeGraphics(NodeGraphics value);

	/**
	 * Returns the value of the '<em><b>Container Arc Graphics</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.ArcGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Arc Graphics</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Arc Graphics</em>' container reference.
	 * @see #setContainerArcGraphics(ArcGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_ContainerArcGraphics()
	 * @see fr.lip6.move.pnml.ptnet.ArcGraphics#getLine
	 * @model opposite="line" transient="false" ordered="false"
	 * @generated
	 */
	ArcGraphics getContainerArcGraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getContainerArcGraphics <em>Container Arc Graphics</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Arc Graphics</em>' container reference.
	 * @see #getContainerArcGraphics()
	 * @generated
	 */
	void setContainerArcGraphics(ArcGraphics value);

	/**
	 * Returns the value of the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Annotation Graphics</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Annotation Graphics</em>' container reference.
	 * @see #setContainerAnnotationGraphics(AnnotationGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_ContainerAnnotationGraphics()
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getLine
	 * @model opposite="line" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationGraphics getContainerAnnotationGraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Annotation Graphics</em>' container reference.
	 * @see #getContainerAnnotationGraphics()
	 * @generated
	 */
	void setContainerAnnotationGraphics(AnnotationGraphics value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.LineStyle
	 * @see #setStyle(LineStyle)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getLine_Style()
	 * @model annotation="http://www.pnml.org/models/ToPNML tag='style' kind='attribute'"
	 * @generated
	 */
	LineStyle getStyle();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Line#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.LineStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(LineStyle value);

	/**
	 * Return the string containing the pnml output
	 */
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	public void fromPNML(OMElement subRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	public void toPNML(FileChannel fc);

	public boolean validateOCL(DiagnosticChain diagnostics);
} // Line
