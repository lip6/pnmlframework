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
package fr.lip6.move.pnml.symmetricnet.finiteIntRanges;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.terms.BuiltInSort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Int Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getStart <em>Start</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getEnd <em>End</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getContainerFiniteIntRangeConstant <em>Container Finite Int Range Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRange()
 * @model annotation="http://www.pnml.org/models/OCL range='- \u221e\240< self.start <=  self.end < \u221e'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='range'"
 *        annotation="http://www.pnml.org/models/ToPNML tag='finiteintrange' kind='son'"
 *        annotation="http://www.pnml.org/models/methods/SORT signature='boolean equalSorts(Sort sort)' body='boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\tif (\"FiniteIntRange\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tFiniteIntRange myFIR = (FiniteIntRange) this;\n\t\t\t\t\tFiniteIntRange thatFIR = (FiniteIntRange) sort;\n\t\t\t\t\tisEqual = (myFIR.getStart() == thatFIR.getStart()\n\t\t\t\t\t    && myFIR.getEnd() == thatFIR.getEnd());  \t\t\t\t\t\t\n\t\t\t\t\t\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn isEqual;' documentation='/**\n * Returns true if this sort and argument sort are actually \n * semantically the same sort, even in two different objects.\n * Ex: two FiniteEnumerations or two Integers.\n * @return true if so. \n * @param sort the sort to which we compare this one. \n \052/'"
 * @generated
 */
public interface FiniteIntRange extends BuiltInSort {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Long)
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRange_Start()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='start' kind='attribute'"
	 * @generated
	 */
	Long getStart();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Long)
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRange_End()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='end' kind='attribute'"
	 * @generated
	 */
	Long getEnd();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Long value);

	/**
	 * Returns the value of the '<em><b>Container Finite Int Range Constant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Finite Int Range Constant</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Finite Int Range Constant</em>' container reference.
	 * @see #setContainerFiniteIntRangeConstant(FiniteIntRangeConstant)
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage#getFiniteIntRange_ContainerFiniteIntRangeConstant()
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getRange
	 * @model opposite="range" transient="false"
	 * @generated
	 */
	FiniteIntRangeConstant getContainerFiniteIntRangeConstant();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getContainerFiniteIntRangeConstant <em>Container Finite Int Range Constant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Finite Int Range Constant</em>' container reference.
	 * @see #getContainerFiniteIntRangeConstant()
	 * @generated
	 */
	void setContainerFiniteIntRangeConstant(FiniteIntRangeConstant value);

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
} // FiniteIntRange
