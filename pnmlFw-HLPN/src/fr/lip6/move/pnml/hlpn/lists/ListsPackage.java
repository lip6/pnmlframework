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
package fr.lip6.move.pnml.hlpn.lists;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import fr.lip6.move.pnml.hlpn.terms.TermsPackage;

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
 * @see fr.lip6.move.pnml.hlpn.lists.ListsFactory
 * @model kind="package"
 * @generated
 */
public interface ListsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lists";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hlpn.lists.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lists";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListsPackage eINSTANCE = fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl <em>HLPN List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getHLPNList()
	 * @generated
	 */
	int HLPN_LIST = 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__MULTI = TermsPackage.BUILT_IN_SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_NAMED_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_VARIABLE_DECL = TermsPackage.BUILT_IN_SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_PRODUCT_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_TYPE = TermsPackage.BUILT_IN_SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_ALL = TermsPackage.BUILT_IN_SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_EMPTY = TermsPackage.BUILT_IN_SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_PARTITION = TermsPackage.BUILT_IN_SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_LIST = TermsPackage.BUILT_IN_SORT__CONTAINER_LIST;

	/**
	 * The feature id for the '<em><b>Container Empty List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_EMPTY_LIST = TermsPackage.BUILT_IN_SORT__CONTAINER_EMPTY_LIST;

	/**
	 * The feature id for the '<em><b>Container Make List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__CONTAINER_MAKE_LIST = TermsPackage.BUILT_IN_SORT__CONTAINER_MAKE_LIST;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST__BASIS = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HLPN List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_LIST_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl <em>Empty List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getEmptyList()
	 * @generated
	 */
	int EMPTY_LIST = 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__SORT = TermsPackage.BUILT_IN_CONSTANT__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__CONTAINER_CONDITION = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__SUBTERM = TermsPackage.BUILT_IN_CONSTANT__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__OUTPUT = TermsPackage.BUILT_IN_CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__INPUT = TermsPackage.BUILT_IN_CONSTANT__INPUT;

	/**
	 * The feature id for the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__REFSORT = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST_FEATURE_COUNT = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.ListOperatorImpl <em>List Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListOperatorImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getListOperator()
	 * @generated
	 */
	int LIST_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__SORT = TermsPackage.BUILT_IN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__CONTAINER_CONDITION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__OUTPUT = TermsPackage.BUILT_IN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__INPUT = TermsPackage.BUILT_IN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>List Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl <em>Append</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getAppend()
	 * @generated
	 */
	int APPEND = 3;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__SORT = LIST_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__CONTAINER_OPERATOR = LIST_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__CONTAINER_NAMED_OPERATOR = LIST_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__CONTAINER_HL_MARKING = LIST_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__CONTAINER_CONDITION = LIST_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__CONTAINER_HL_ANNOTATION = LIST_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__CONTAINER_PARTITION_ELEMENT = LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__OUTPUT = LIST_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__INPUT = LIST_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Append</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl <em>Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getConcatenation()
	 * @generated
	 */
	int CONCATENATION = 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__SORT = LIST_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__CONTAINER_OPERATOR = LIST_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__CONTAINER_NAMED_OPERATOR = LIST_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__CONTAINER_HL_MARKING = LIST_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__CONTAINER_CONDITION = LIST_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__CONTAINER_HL_ANNOTATION = LIST_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__CONTAINER_PARTITION_ELEMENT = LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__OUTPUT = LIST_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__INPUT = LIST_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__SORT = LIST_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__CONTAINER_OPERATOR = LIST_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__CONTAINER_NAMED_OPERATOR = LIST_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__CONTAINER_HL_MARKING = LIST_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__CONTAINER_CONDITION = LIST_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__CONTAINER_HL_ANNOTATION = LIST_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__CONTAINER_PARTITION_ELEMENT = LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__OUTPUT = LIST_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__INPUT = LIST_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl <em>Make List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getMakeList()
	 * @generated
	 */
	int MAKE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__SORT = LIST_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__CONTAINER_OPERATOR = LIST_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__CONTAINER_NAMED_OPERATOR = LIST_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__CONTAINER_HL_MARKING = LIST_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__CONTAINER_CONDITION = LIST_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__CONTAINER_HL_ANNOTATION = LIST_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__CONTAINER_PARTITION_ELEMENT = LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__OUTPUT = LIST_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__INPUT = LIST_OPERATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__REFSORT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Make List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl <em>Member At Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getMemberAtIndex()
	 * @generated
	 */
	int MEMBER_AT_INDEX = 7;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__SORT = LIST_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__CONTAINER_OPERATOR = LIST_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__CONTAINER_NAMED_OPERATOR = LIST_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__CONTAINER_HL_MARKING = LIST_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__CONTAINER_CONDITION = LIST_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__CONTAINER_HL_ANNOTATION = LIST_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__CONTAINER_PARTITION_ELEMENT = LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__OUTPUT = LIST_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__INPUT = LIST_OPERATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__INDEX = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member At Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl <em>Sublist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl
	 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getSublist()
	 * @generated
	 */
	int SUBLIST = 8;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__SORT = LIST_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__CONTAINER_OPERATOR = LIST_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__CONTAINER_NAMED_OPERATOR = LIST_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__CONTAINER_HL_MARKING = LIST_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__CONTAINER_CONDITION = LIST_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__CONTAINER_HL_ANNOTATION = LIST_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__CONTAINER_PARTITION_ELEMENT = LIST_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__OUTPUT = LIST_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__INPUT = LIST_OPERATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__START = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__LENGTH = LIST_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sublist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.HLPNList <em>HLPN List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLPN List</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.HLPNList
	 * @generated
	 */
	EClass getHLPNList();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.lists.HLPNList#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basis</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.HLPNList#getBasis()
	 * @see #getHLPNList()
	 * @generated
	 */
	EReference getHLPNList_Basis();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.EmptyList <em>Empty List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty List</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.EmptyList
	 * @generated
	 */
	EClass getEmptyList();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.lists.EmptyList#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsort</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.EmptyList#getRefsort()
	 * @see #getEmptyList()
	 * @generated
	 */
	EReference getEmptyList_Refsort();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.ListOperator <em>List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Operator</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.ListOperator
	 * @generated
	 */
	EClass getListOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.Append <em>Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.Append
	 * @generated
	 */
	EClass getAppend();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.Concatenation <em>Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.Concatenation
	 * @generated
	 */
	EClass getConcatenation();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.MakeList <em>Make List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make List</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.MakeList
	 * @generated
	 */
	EClass getMakeList();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.lists.MakeList#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsort</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.MakeList#getRefsort()
	 * @see #getMakeList()
	 * @generated
	 */
	EReference getMakeList_Refsort();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.MemberAtIndex <em>Member At Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member At Index</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.MemberAtIndex
	 * @generated
	 */
	EClass getMemberAtIndex();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.lists.MemberAtIndex#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.MemberAtIndex#getIndex()
	 * @see #getMemberAtIndex()
	 * @generated
	 */
	EAttribute getMemberAtIndex_Index();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.lists.Sublist <em>Sublist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sublist</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.Sublist
	 * @generated
	 */
	EClass getSublist();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.lists.Sublist#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.Sublist#getStart()
	 * @see #getSublist()
	 * @generated
	 */
	EAttribute getSublist_Start();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.lists.Sublist#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see fr.lip6.move.pnml.hlpn.lists.Sublist#getLength()
	 * @see #getSublist()
	 * @generated
	 */
	EAttribute getSublist_Length();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListsFactory getListsFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl <em>HLPN List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getHLPNList()
		 * @generated
		 */
		EClass HLPN_LIST = eINSTANCE.getHLPNList();

		/**
		 * The meta object literal for the '<em><b>Basis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLPN_LIST__BASIS = eINSTANCE.getHLPNList_Basis();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl <em>Empty List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getEmptyList()
		 * @generated
		 */
		EClass EMPTY_LIST = eINSTANCE.getEmptyList();

		/**
		 * The meta object literal for the '<em><b>Refsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPTY_LIST__REFSORT = eINSTANCE.getEmptyList_Refsort();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.ListOperatorImpl <em>List Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListOperatorImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getListOperator()
		 * @generated
		 */
		EClass LIST_OPERATOR = eINSTANCE.getListOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl <em>Append</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getAppend()
		 * @generated
		 */
		EClass APPEND = eINSTANCE.getAppend();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl <em>Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getConcatenation()
		 * @generated
		 */
		EClass CONCATENATION = eINSTANCE.getConcatenation();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl <em>Make List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getMakeList()
		 * @generated
		 */
		EClass MAKE_LIST = eINSTANCE.getMakeList();

		/**
		 * The meta object literal for the '<em><b>Refsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_LIST__REFSORT = eINSTANCE.getMakeList_Refsort();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl <em>Member At Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getMemberAtIndex()
		 * @generated
		 */
		EClass MEMBER_AT_INDEX = eINSTANCE.getMemberAtIndex();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_AT_INDEX__INDEX = eINSTANCE.getMemberAtIndex_Index();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl <em>Sublist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl
		 * @see fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl#getSublist()
		 * @generated
		 */
		EClass SUBLIST = eINSTANCE.getSublist();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBLIST__START = eINSTANCE.getSublist_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBLIST__LENGTH = eINSTANCE.getSublist_Length();

	}

} //ListsPackage
