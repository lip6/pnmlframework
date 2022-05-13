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

import org.eclipse.emf.ecore.EAttribute;
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
 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesFactory
 * @model kind="package"
 * @generated
 */
public interface FiniteIntRangesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finiteIntRanges";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///symmetricnet.finiteIntRanges.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "finiteIntRanges";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiniteIntRangesPackage eINSTANCE = fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl <em>Finite Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getFiniteIntRange()
	 * @generated
	 */
	int FINITE_INT_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__MULTI = TermsPackage.BUILT_IN_SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_NAMED_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_VARIABLE_DECL = TermsPackage.BUILT_IN_SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_PRODUCT_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_TYPE = TermsPackage.BUILT_IN_SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_ALL = TermsPackage.BUILT_IN_SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_EMPTY = TermsPackage.BUILT_IN_SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_PARTITION = TermsPackage.BUILT_IN_SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__START = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__END = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Finite Int Range Constant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeConstantImpl <em>Finite Int Range Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeConstantImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getFiniteIntRangeConstant()
	 * @generated
	 */
	int FINITE_INT_RANGE_CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__SORT = TermsPackage.BUILT_IN_CONSTANT__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__CONTAINER_CONDITION = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONSTANT__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__OUTPUT = TermsPackage.BUILT_IN_CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__INPUT = TermsPackage.BUILT_IN_CONSTANT__INPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__VALUE = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT__RANGE = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Finite Int Range Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeOperatorImpl <em>Finite Int Range Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeOperatorImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getFiniteIntRangeOperator()
	 * @generated
	 */
	int FINITE_INT_RANGE_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__SORT = TermsPackage.BUILT_IN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__CONTAINER_CONDITION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__OUTPUT = TermsPackage.BUILT_IN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__INPUT = TermsPackage.BUILT_IN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Finite Int Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 2;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SORT = FINITE_INT_RANGE_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_NAMED_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_HL_MARKING = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_CONDITION = FINITE_INT_RANGE_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_HL_ANNOTATION = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_PARTITION_ELEMENT = FINITE_INT_RANGE_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__OUTPUT = FINITE_INT_RANGE_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__INPUT = FINITE_INT_RANGE_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SORT = FINITE_INT_RANGE_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_NAMED_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_HL_MARKING = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_CONDITION = FINITE_INT_RANGE_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_HL_ANNOTATION = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_PARTITION_ELEMENT = FINITE_INT_RANGE_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__OUTPUT = FINITE_INT_RANGE_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__INPUT = FINITE_INT_RANGE_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanOrEqualImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 5;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SORT = FINITE_INT_RANGE_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_NAMED_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_HL_MARKING = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_CONDITION = FINITE_INT_RANGE_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_HL_ANNOTATION = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_PARTITION_ELEMENT = FINITE_INT_RANGE_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__OUTPUT = FINITE_INT_RANGE_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__INPUT = FINITE_INT_RANGE_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanOrEqualImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 6;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SORT = FINITE_INT_RANGE_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_NAMED_OPERATOR = FINITE_INT_RANGE_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_HL_MARKING = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_CONDITION = FINITE_INT_RANGE_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_HL_ANNOTATION = FINITE_INT_RANGE_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_PARTITION_ELEMENT = FINITE_INT_RANGE_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__OUTPUT = FINITE_INT_RANGE_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__INPUT = FINITE_INT_RANGE_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange <em>Finite Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Int Range</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange
	 * @generated
	 */
	EClass getFiniteIntRange();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getStart()
	 * @see #getFiniteIntRange()
	 * @generated
	 */
	EAttribute getFiniteIntRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getEnd()
	 * @see #getFiniteIntRange()
	 * @generated
	 */
	EAttribute getFiniteIntRange_End();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getContainerFiniteIntRangeConstant <em>Container Finite Int Range Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Finite Int Range Constant</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange#getContainerFiniteIntRangeConstant()
	 * @see #getFiniteIntRange()
	 * @generated
	 */
	EReference getFiniteIntRange_ContainerFiniteIntRangeConstant();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant <em>Finite Int Range Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Int Range Constant</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant
	 * @generated
	 */
	EClass getFiniteIntRangeConstant();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getValue()
	 * @see #getFiniteIntRangeConstant()
	 * @generated
	 */
	EAttribute getFiniteIntRangeConstant_Value();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant#getRange()
	 * @see #getFiniteIntRangeConstant()
	 * @generated
	 */
	EReference getFiniteIntRangeConstant_Range();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeOperator <em>Finite Int Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Int Range Operator</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeOperator
	 * @generated
	 */
	EClass getFiniteIntRangeOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiniteIntRangesFactory getFiniteIntRangesFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl <em>Finite Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getFiniteIntRange()
		 * @generated
		 */
		EClass FINITE_INT_RANGE = eINSTANCE.getFiniteIntRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_INT_RANGE__START = eINSTANCE.getFiniteIntRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_INT_RANGE__END = eINSTANCE.getFiniteIntRange_End();

		/**
		 * The meta object literal for the '<em><b>Container Finite Int Range Constant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT = eINSTANCE
				.getFiniteIntRange_ContainerFiniteIntRangeConstant();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeConstantImpl <em>Finite Int Range Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeConstantImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getFiniteIntRangeConstant()
		 * @generated
		 */
		EClass FINITE_INT_RANGE_CONSTANT = eINSTANCE.getFiniteIntRangeConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_INT_RANGE_CONSTANT__VALUE = eINSTANCE.getFiniteIntRangeConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_INT_RANGE_CONSTANT__RANGE = eINSTANCE.getFiniteIntRangeConstant_Range();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeOperatorImpl <em>Finite Int Range Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeOperatorImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getFiniteIntRangeOperator()
		 * @generated
		 */
		EClass FINITE_INT_RANGE_OPERATOR = eINSTANCE.getFiniteIntRangeOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanOrEqualImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanOrEqualImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

	}

} //FiniteIntRangesPackage
