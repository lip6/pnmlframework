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
package fr.lip6.move.pnml.symmetricnet.partitions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import fr.lip6.move.pnml.symmetricnet.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionsFactory
 * @model kind="package"
 * @generated
 */
public interface PartitionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partitions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///symmetricnet.partitions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partitions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartitionsPackage eINSTANCE = fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionImpl
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = TermsPackage.SORT_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = TermsPackage.SORT_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CONTAINER_DECLARATIONS = TermsPackage.SORT_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DEF = TermsPackage.SORT_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partitionelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITIONELEMENTS = TermsPackage.SORT_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = TermsPackage.SORT_DECL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl <em>Partition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartitionElement()
	 * @generated
	 */
	int PARTITION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__ID = TermsPackage.OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__NAME = TermsPackage.OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__CONTAINER_DECLARATIONS = TermsPackage.OPERATOR_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Refpartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__REFPARTITION = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partitionelementconstants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_FEATURE_COUNT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionOperatorImpl <em>Partition Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionOperatorImpl
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartitionOperator()
	 * @generated
	 */
	int PARTITION_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__SORT = TermsPackage.BUILT_IN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__CONTAINER_CONDITION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__OUTPUT = TermsPackage.BUILT_IN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__INPUT = TermsPackage.BUILT_IN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Partition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.GreaterThanImpl
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 2;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SORT = PARTITION_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_OPERATOR = PARTITION_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_NAMED_OPERATOR = PARTITION_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_HL_MARKING = PARTITION_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_CONDITION = PARTITION_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_HL_ANNOTATION = PARTITION_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_PARTITION_ELEMENT = PARTITION_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = PARTITION_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__OUTPUT = PARTITION_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__INPUT = PARTITION_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = PARTITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementOfImpl <em>Partition Element Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementOfImpl
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartitionElementOf()
	 * @generated
	 */
	int PARTITION_ELEMENT_OF = 3;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__SORT = PARTITION_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__CONTAINER_OPERATOR = PARTITION_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__CONTAINER_NAMED_OPERATOR = PARTITION_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__CONTAINER_HL_MARKING = PARTITION_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__CONTAINER_CONDITION = PARTITION_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__CONTAINER_HL_ANNOTATION = PARTITION_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__CONTAINER_PARTITION_ELEMENT = PARTITION_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__SUBTERM = PARTITION_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__OUTPUT = PARTITION_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__INPUT = PARTITION_OPERATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Refpartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__REFPARTITION = PARTITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partition Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF_FEATURE_COUNT = PARTITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.LessThanImpl
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 5;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SORT = PARTITION_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_OPERATOR = PARTITION_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_NAMED_OPERATOR = PARTITION_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_HL_MARKING = PARTITION_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_CONDITION = PARTITION_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_HL_ANNOTATION = PARTITION_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_PARTITION_ELEMENT = PARTITION_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = PARTITION_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__OUTPUT = PARTITION_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__INPUT = PARTITION_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = PARTITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.partitions.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.symmetricnet.partitions.Partition#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.Partition#getDef()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.symmetricnet.partitions.Partition#getPartitionelements <em>Partitionelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitionelements</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.Partition#getPartitionelements()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Partitionelements();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement <em>Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Element</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement
	 * @generated
	 */
	EClass getPartitionElement();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement#getRefpartition <em>Refpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Refpartition</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement#getRefpartition()
	 * @see #getPartitionElement()
	 * @generated
	 */
	EReference getPartitionElement_Refpartition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement#getPartitionelementconstants <em>Partitionelementconstants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitionelementconstants</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement#getPartitionelementconstants()
	 * @see #getPartitionElement()
	 * @generated
	 */
	EReference getPartitionElement_Partitionelementconstants();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf <em>Partition Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Element Of</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf
	 * @generated
	 */
	EClass getPartitionElementOf();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf#getRefpartition <em>Refpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refpartition</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf#getRefpartition()
	 * @see #getPartitionElementOf()
	 * @generated
	 */
	EReference getPartitionElementOf_Refpartition();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.partitions.PartitionOperator <em>Partition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Operator</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionOperator
	 * @generated
	 */
	EClass getPartitionOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.partitions.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.partitions.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartitionsFactory getPartitionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionImpl
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__DEF = eINSTANCE.getPartition_Def();

		/**
		 * The meta object literal for the '<em><b>Partitionelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTITIONELEMENTS = eINSTANCE.getPartition_Partitionelements();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl <em>Partition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartitionElement()
		 * @generated
		 */
		EClass PARTITION_ELEMENT = eINSTANCE.getPartitionElement();

		/**
		 * The meta object literal for the '<em><b>Refpartition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ELEMENT__REFPARTITION = eINSTANCE.getPartitionElement_Refpartition();

		/**
		 * The meta object literal for the '<em><b>Partitionelementconstants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS = eINSTANCE
				.getPartitionElement_Partitionelementconstants();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.GreaterThanImpl
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementOfImpl <em>Partition Element Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementOfImpl
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartitionElementOf()
		 * @generated
		 */
		EClass PARTITION_ELEMENT_OF = eINSTANCE.getPartitionElementOf();

		/**
		 * The meta object literal for the '<em><b>Refpartition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ELEMENT_OF__REFPARTITION = eINSTANCE.getPartitionElementOf_Refpartition();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionOperatorImpl <em>Partition Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionOperatorImpl
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getPartitionOperator()
		 * @generated
		 */
		EClass PARTITION_OPERATOR = eINSTANCE.getPartitionOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.LessThanImpl
		 * @see fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

	}

} //PartitionsPackage
