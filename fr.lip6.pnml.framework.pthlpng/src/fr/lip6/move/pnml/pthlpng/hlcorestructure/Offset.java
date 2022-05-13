/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
package fr.lip6.move.pnml.pthlpng.hlcorestructure;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Offset</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.Offset#getContainerAnnotationGraphics
 * <em>Container Annotation Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructurePackage#getOffset()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='offset' kind='son'"
 *        annotation="http://www.pnml.org/models/HLAPI"
 * @generated
 */
public interface Offset extends Coordinate {
	/**
	 * Returns the value of the '<em><b>Container Annotation Graphics</b></em>'
	 * container reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics#getOffset
	 * <em>Offset</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Annotation Graphics</em>' container
	 * reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Annotation Graphics</em>' container
	 *         reference.
	 * @see #setContainerAnnotationGraphics(AnnotationGraphics)
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructurePackage#getOffset_ContainerAnnotationGraphics()
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics#getOffset
	 * @model opposite="offset" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationGraphics getContainerAnnotationGraphics();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.Offset#getContainerAnnotationGraphics
	 * <em>Container Annotation Graphics</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Annotation Graphics</em>'
	 *              container reference.
	 * @see #getContainerAnnotationGraphics()
	 * @generated
	 */
	void setContainerAnnotationGraphics(AnnotationGraphics value);

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	@Override
	public void fromPNML(OMElement subRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	@Override
	public void toPNML(FileChannel fc);

	@Override
	public boolean validateOCL(DiagnosticChain diagnostics);
} // Offset
