/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.hlpn.integers;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.terms.BuiltInSort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLPN Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.integers.HLPNNumber#getContainerNumberConstant <em>Container Number Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.hlpn.integers.IntegersPackage#getHLPNNumber()
 * @model abstract="true"
 *        annotation="http://www.pnml.org/models/methods/SORT signature='boolean equalSorts(Sort sort)' body='boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t    //by default they are the same sort, unless they have been named.\n\t\t  \tisEqual = true;\n\t\t  \tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\t// we test them if they have been explicitly named.\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t}// otherwise, keep the default.\n\t\t}\n\t\treturn isEqual;' documentation='/**\n * Returns true if this sort and argument sort are actually \n * semantically the same sort, even in two different objects.\n * Ex: two FiniteEnumerations or two Integers.\n * @return true if so. \n * @param sort the sort to which we compare this one. \n \052/'"
 * @generated
 */
public interface HLPNNumber extends BuiltInSort {
	/**
	 * Returns the value of the '<em><b>Container Number Constant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.integers.NumberConstant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Number Constant</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Number Constant</em>' container reference.
	 * @see #setContainerNumberConstant(NumberConstant)
	 * @see fr.lip6.move.pnml.hlpn.integers.IntegersPackage#getHLPNNumber_ContainerNumberConstant()
	 * @see fr.lip6.move.pnml.hlpn.integers.NumberConstant#getType
	 * @model opposite="type" transient="false"
	 * @generated
	 */
	NumberConstant getContainerNumberConstant();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.hlpn.integers.HLPNNumber#getContainerNumberConstant <em>Container Number Constant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Number Constant</em>' container reference.
	 * @see #getContainerNumberConstant()
	 * @generated
	 */
	void setContainerNumberConstant(NumberConstant value);

	@Override
	public abstract String toPNML();

	@Override
	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	@Override
	public abstract void toPNML(FileChannel fc);

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // HLPNNumber
