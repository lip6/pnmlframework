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
 * A representation of the model object '<em><b>Annotation Graphics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFill <em>Fill</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getLine <em>Line</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFont <em>Font</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getContainerAnnotation <em>Container Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getAnnotationGraphics()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='graphics' kind='son'"
 * @generated
 */
public interface AnnotationGraphics extends Graphics {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Offset#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Offset)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getAnnotationGraphics_Offset()
	 * @see fr.lip6.move.pnml.ptnet.Offset#getContainerAnnotationGraphics
	 * @model opposite="containerAnnotationGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Offset getOffset();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Offset value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Fill#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Fill)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getAnnotationGraphics_Fill()
	 * @see fr.lip6.move.pnml.ptnet.Fill#getContainerAnnotationGraphics
	 * @model opposite="containerAnnotationGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Fill value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Line#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getAnnotationGraphics_Line()
	 * @see fr.lip6.move.pnml.ptnet.Line#getContainerAnnotationGraphics
	 * @model opposite="containerAnnotationGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Font#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getAnnotationGraphics_Font()
	 * @see fr.lip6.move.pnml.ptnet.Font#getContainerAnnotationGraphics
	 * @model opposite="containerAnnotationGraphics" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

	/**
	 * Returns the value of the '<em><b>Container Annotation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Annotation#getAnnotationgraphics <em>Annotationgraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Annotation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Annotation</em>' container reference.
	 * @see #setContainerAnnotation(Annotation)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getAnnotationGraphics_ContainerAnnotation()
	 * @see fr.lip6.move.pnml.ptnet.Annotation#getAnnotationgraphics
	 * @model opposite="annotationgraphics" transient="false"
	 * @generated
	 */
	Annotation getContainerAnnotation();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getContainerAnnotation <em>Container Annotation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Annotation</em>' container reference.
	 * @see #getContainerAnnotation()
	 * @generated
	 */
	void setContainerAnnotation(Annotation value);

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
} // AnnotationGraphics
