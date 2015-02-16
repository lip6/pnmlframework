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

import java.math.BigDecimal;
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
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getAlign <em>Align</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getRotation <em>Rotation</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getSize <em>Size</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.Font#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='font' kind='son'"
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.FontAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.FontAlign
	 * @see #setAlign(FontAlign)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Align()
	 * @model default="left" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='align' kind='attribute'"
	 * @generated
	 */
	FontAlign getAlign();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.FontAlign
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(FontAlign value);

	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' attribute.
	 * The default value is <code>"underline"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.FontDecoration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.FontDecoration
	 * @see #setDecoration(FontDecoration)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Decoration()
	 * @model default="underline" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='decoration' kind='attribute'"
	 * @generated
	 */
	FontDecoration getDecoration();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getDecoration <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.FontDecoration
	 * @see #getDecoration()
	 * @generated
	 */
	void setDecoration(FontDecoration value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * The default value is <code>"verdana"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.CSS2FontFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontFamily
	 * @see #setFamily(CSS2FontFamily)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Family()
	 * @model default="verdana" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='family' kind='attribute'"
	 * @generated
	 */
	CSS2FontFamily getFamily();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontFamily
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(CSS2FontFamily value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(BigDecimal)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Rotation()
	 * @model ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='rotation' kind='attribute'"
	 * @generated
	 */
	BigDecimal getRotation();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"small"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.CSS2FontSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontSize
	 * @see #setSize(CSS2FontSize)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Size()
	 * @model default="small" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='size' kind='attribute'"
	 * @generated
	 */
	CSS2FontSize getSize();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontSize
	 * @see #getSize()
	 * @generated
	 */
	void setSize(CSS2FontSize value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.CSS2FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontStyle
	 * @see #setStyle(CSS2FontStyle)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Style()
	 * @model default="normal" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='style' kind='attribute'"
	 * @generated
	 */
	CSS2FontStyle getStyle();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(CSS2FontStyle value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.lip6.move.pnml.ptnet.CSS2FontWeight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontWeight
	 * @see #setWeight(CSS2FontWeight)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_Weight()
	 * @model ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='weight' kind='attribute'"
	 * @generated
	 */
	CSS2FontWeight getWeight();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontWeight
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(CSS2FontWeight value);

	/**
	 * Returns the value of the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Annotation Graphics</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Annotation Graphics</em>' container reference.
	 * @see #setContainerAnnotationGraphics(AnnotationGraphics)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getFont_ContainerAnnotationGraphics()
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFont
	 * @model opposite="font" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationGraphics getContainerAnnotationGraphics();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.Font#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}' container reference.
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
} // Font
