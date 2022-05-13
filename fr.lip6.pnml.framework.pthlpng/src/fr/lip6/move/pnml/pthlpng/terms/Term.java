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
package fr.lip6.move.pnml.pthlpng.terms;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Term</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getSort <em>Sort</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerOperator
 * <em>Container Operator</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerNamedOperator
 * <em>Container Named Operator</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLMarking
 * <em>Container HL Marking</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerCondition
 * <em>Container Condition</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLAnnotation
 * <em>Container HL Annotation</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerPartitionElement
 * <em>Container Partition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm()
 * @model abstract="true" annotation="http://www.pnml.org/models/HLAPI"
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sort</em>' reference.
	 * @see #setSort(Sort)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_Sort()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	Sort getSort();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getSort
	 * <em>Sort</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Sort</em>' reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(Sort value);

	/**
	 * Returns the value of the '<em><b>Container Operator</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Operator#getSubterm
	 * <em>Subterm</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Operator</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Operator</em>' container reference.
	 * @see #setContainerOperator(Operator)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_ContainerOperator()
	 * @see fr.lip6.move.pnml.pthlpng.terms.Operator#getSubterm
	 * @model opposite="subterm" transient="false"
	 * @generated
	 */
	Operator getContainerOperator();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerOperator
	 * <em>Container Operator</em>}' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Operator</em>' container
	 *              reference.
	 * @see #getContainerOperator()
	 * @generated
	 */
	void setContainerOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Container Named Operator</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Named Operator</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Named Operator</em>' container
	 *         reference.
	 * @see #setContainerNamedOperator(NamedOperator)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_ContainerNamedOperator()
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getDef
	 * @model opposite="def" transient="false"
	 * @generated
	 */
	NamedOperator getContainerNamedOperator();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerNamedOperator
	 * <em>Container Named Operator</em>}' container reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Named Operator</em>'
	 *              container reference.
	 * @see #getContainerNamedOperator()
	 * @generated
	 */
	void setContainerNamedOperator(NamedOperator value);

	/**
	 * Returns the value of the '<em><b>Container HL Marking</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking#getStructure
	 * <em>Structure</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container HL Marking</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container HL Marking</em>' container reference.
	 * @see #setContainerHLMarking(HLMarking)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_ContainerHLMarking()
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking#getStructure
	 * @model opposite="structure" transient="false"
	 * @generated
	 */
	HLMarking getContainerHLMarking();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLMarking
	 * <em>Container HL Marking</em>}' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container HL Marking</em>' container
	 *              reference.
	 * @see #getContainerHLMarking()
	 * @generated
	 */
	void setContainerHLMarking(HLMarking value);

	/**
	 * Returns the value of the '<em><b>Container Condition</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition#getStructure
	 * <em>Structure</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Condition</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Condition</em>' container reference.
	 * @see #setContainerCondition(Condition)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_ContainerCondition()
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition#getStructure
	 * @model opposite="structure" transient="false"
	 * @generated
	 */
	Condition getContainerCondition();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerCondition
	 * <em>Container Condition</em>}' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Condition</em>' container
	 *              reference.
	 * @see #getContainerCondition()
	 * @generated
	 */
	void setContainerCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Container HL Annotation</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation#getStructure
	 * <em>Structure</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container HL Annotation</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container HL Annotation</em>' container
	 *         reference.
	 * @see #setContainerHLAnnotation(HLAnnotation)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_ContainerHLAnnotation()
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation#getStructure
	 * @model opposite="structure" transient="false"
	 * @generated
	 */
	HLAnnotation getContainerHLAnnotation();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLAnnotation
	 * <em>Container HL Annotation</em>}' container reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container HL Annotation</em>'
	 *              container reference.
	 * @see #getContainerHLAnnotation()
	 * @generated
	 */
	void setContainerHLAnnotation(HLAnnotation value);

	/**
	 * Returns the value of the '<em><b>Container Partition Element</b></em>'
	 * container reference. It is bidirectional and its opposite is
	 * '{@link fr.lip6.move.pnml.pthlpng.partitions.PartitionElement#getPartitionelementconstants
	 * <em>Partitionelementconstants</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Partition Element</em>' container
	 * reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Partition Element</em>' container
	 *         reference.
	 * @see #setContainerPartitionElement(PartitionElement)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getTerm_ContainerPartitionElement()
	 * @see fr.lip6.move.pnml.pthlpng.partitions.PartitionElement#getPartitionelementconstants
	 * @model opposite="partitionelementconstants" transient="false"
	 * @generated
	 */
	PartitionElement getContainerPartitionElement();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerPartitionElement
	 * <em>Container Partition Element</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Container Partition Element</em>'
	 *              container reference.
	 * @see #getContainerPartitionElement()
	 * @generated
	 */
	void setContainerPartitionElement(PartitionElement value);

	public abstract String toPNML();

	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException;

	public abstract void toPNML(FileChannel fc);

	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // Term
