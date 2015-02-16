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

import java.net.URI;
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
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Fill#getColor <em>Color</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Fill#getGradientcolor <em>Gradientcolor</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Fill#getGradientrotation <em>Gradientrotation</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Fill#getImage <em>Image</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Fill#getContainerNodeGraphics <em>Container Node Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Fill#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='fill' kind='son'"
 * @generated
 */
public interface Fill extends EObject {
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
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill_Color()
	 * @model default="black" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='color' kind='attribute'"
	 * @generated
	 */
	CSS2Color getColor();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Fill#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(CSS2Color value);

	/**
	 * Returns the value of the '<em><b>Gradientcolor</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.CSS2Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradientcolor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradientcolor</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @see #setGradientcolor(CSS2Color)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill_Gradientcolor()
	 * @model default="black" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='gradient-color' kind='attribute'"
	 * @generated
	 */
	CSS2Color getGradientcolor();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Fill#getGradientcolor <em>Gradientcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradientcolor</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @see #getGradientcolor()
	 * @generated
	 */
	void setGradientcolor(CSS2Color value);

	/**
	 * Returns the value of the '<em><b>Gradientrotation</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.Gradient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradientrotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradientrotation</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.Gradient
	 * @see #setGradientrotation(Gradient)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill_Gradientrotation()
	 * @model ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='gradient-rotation' kind='attribute'"
	 * @generated
	 */
	Gradient getGradientrotation();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Fill#getGradientrotation <em>Gradientrotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradientrotation</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.Gradient
	 * @see #getGradientrotation()
	 * @generated
	 */
	void setGradientrotation(Gradient value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(URI)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill_Image()
	 * @model dataType="fr.lip6.move.pnml.ptnet.URI" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='image' kind='attribute'"
	 * @generated
	 */
	URI getImage();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Fill#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(URI value);

	/**
	 * Returns the value of the '<em><b>Container Node Graphics</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Node Graphics</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Node Graphics</em>' container reference.
	 * @see #setContainerNodeGraphics(NodeGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill_ContainerNodeGraphics()
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getFill
	 * @model opposite="fill" transient="false" ordered="false"
	 * @generated
	 */
	NodeGraphics getContainerNodeGraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Fill#getContainerNodeGraphics <em>Container Node Graphics</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Node Graphics</em>' container reference.
	 * @see #getContainerNodeGraphics()
	 * @generated
	 */
	void setContainerNodeGraphics(NodeGraphics value);

	/**
	 * Returns the value of the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Annotation Graphics</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Annotation Graphics</em>' container reference.
	 * @see #setContainerAnnotationGraphics(AnnotationGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFill_ContainerAnnotationGraphics()
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFill
	 * @model opposite="fill" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationGraphics getContainerAnnotationGraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Fill#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Annotation Graphics</em>' container reference.
	 * @see #getContainerAnnotationGraphics()
	 * @generated
	 */
	void setContainerAnnotationGraphics(AnnotationGraphics value);

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
} // Fill
