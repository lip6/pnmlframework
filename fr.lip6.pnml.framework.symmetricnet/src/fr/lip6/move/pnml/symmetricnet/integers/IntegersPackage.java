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
package fr.lip6.move.pnml.symmetricnet.integers;

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
 * @see fr.lip6.move.pnml.symmetricnet.integers.IntegersFactory
 * @model kind="package"
 * @generated
 */
public interface IntegersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///symmetricnet.integers.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "integers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegersPackage eINSTANCE = fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.HLPNNumberImpl <em>HLPN Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.HLPNNumberImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getHLPNNumber()
	 * @generated
	 */
	int HLPN_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__MULTI = TermsPackage.BUILT_IN_SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_NAMED_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_VARIABLE_DECL = TermsPackage.BUILT_IN_SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_PRODUCT_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_TYPE = TermsPackage.BUILT_IN_SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_ALL = TermsPackage.BUILT_IN_SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_EMPTY = TermsPackage.BUILT_IN_SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_PARTITION = TermsPackage.BUILT_IN_SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container Number Constant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HLPN Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPN_NUMBER_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.NaturalImpl <em>Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.NaturalImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getNatural()
	 * @generated
	 */
	int NATURAL = 1;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__MULTI = HLPN_NUMBER__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_NAMED_SORT = HLPN_NUMBER__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_VARIABLE_DECL = HLPN_NUMBER__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_PRODUCT_SORT = HLPN_NUMBER__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_TYPE = HLPN_NUMBER__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_ALL = HLPN_NUMBER__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_EMPTY = HLPN_NUMBER__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_PARTITION = HLPN_NUMBER__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container Number Constant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__CONTAINER_NUMBER_CONSTANT = HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT;

	/**
	 * The number of structural features of the '<em>Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_FEATURE_COUNT = HLPN_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.PositiveImpl <em>Positive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.PositiveImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 2;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__MULTI = HLPN_NUMBER__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_NAMED_SORT = HLPN_NUMBER__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_VARIABLE_DECL = HLPN_NUMBER__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_PRODUCT_SORT = HLPN_NUMBER__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_TYPE = HLPN_NUMBER__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_ALL = HLPN_NUMBER__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_EMPTY = HLPN_NUMBER__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_PARTITION = HLPN_NUMBER__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container Number Constant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__CONTAINER_NUMBER_CONSTANT = HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT;

	/**
	 * The number of structural features of the '<em>Positive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FEATURE_COUNT = HLPN_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.HLIntegerImpl <em>HL Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.HLIntegerImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getHLInteger()
	 * @generated
	 */
	int HL_INTEGER = 3;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__MULTI = HLPN_NUMBER__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_NAMED_SORT = HLPN_NUMBER__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_VARIABLE_DECL = HLPN_NUMBER__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_PRODUCT_SORT = HLPN_NUMBER__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_TYPE = HLPN_NUMBER__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_ALL = HLPN_NUMBER__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_EMPTY = HLPN_NUMBER__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_PARTITION = HLPN_NUMBER__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container Number Constant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER__CONTAINER_NUMBER_CONSTANT = HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT;

	/**
	 * The number of structural features of the '<em>HL Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_INTEGER_FEATURE_COUNT = HLPN_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.NumberConstantImpl <em>Number Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.NumberConstantImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getNumberConstant()
	 * @generated
	 */
	int NUMBER_CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__SORT = TermsPackage.BUILT_IN_CONSTANT__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__CONTAINER_CONDITION = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_CONSTANT__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONSTANT__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__OUTPUT = TermsPackage.BUILT_IN_CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__INPUT = TermsPackage.BUILT_IN_CONSTANT__INPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__TYPE = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__VALUE = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegerOperatorImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getIntegerOperator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__SORT = TermsPackage.BUILT_IN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__CONTAINER_CONDITION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__OUTPUT = TermsPackage.BUILT_IN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__INPUT = TermsPackage.BUILT_IN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.AdditionImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 6;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.SubtractionImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getSubtraction()
	 * @generated
	 */
	int SUBTRACTION = 7;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.MultiplicationImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 8;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.DivisionImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 9;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.ModuloImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 10;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 11;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanOrEqualImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 12;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 13;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanOrEqualImpl
	 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 14;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_OPERATOR = INTEGER_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_NAMED_OPERATOR = INTEGER_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_HL_MARKING = INTEGER_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_CONDITION = INTEGER_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_HL_ANNOTATION = INTEGER_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__CONTAINER_PARTITION_ELEMENT = INTEGER_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber <em>HLPN Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLPN Number</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber
	 * @generated
	 */
	EClass getHLPNNumber();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber#getContainerNumberConstant <em>Container Number Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Number Constant</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber#getContainerNumberConstant()
	 * @see #getHLPNNumber()
	 * @generated
	 */
	EReference getHLPNNumber_ContainerNumberConstant();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Natural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Natural
	 * @generated
	 */
	EClass getNatural();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Positive
	 * @generated
	 */
	EClass getPositive();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.HLInteger <em>HL Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HL Integer</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.HLInteger
	 * @generated
	 */
	EClass getHLInteger();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.NumberConstant <em>Number Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Constant</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.NumberConstant
	 * @generated
	 */
	EClass getNumberConstant();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.symmetricnet.integers.NumberConstant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.NumberConstant#getType()
	 * @see #getNumberConstant()
	 * @generated
	 */
	EReference getNumberConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.symmetricnet.integers.NumberConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.NumberConstant#getValue()
	 * @see #getNumberConstant()
	 * @generated
	 */
	EAttribute getNumberConstant_Value();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Operator</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.IntegerOperator
	 * @generated
	 */
	EClass getIntegerOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Subtraction
	 * @generated
	 */
	EClass getSubtraction();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.integers.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.integers.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntegersFactory getIntegersFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.HLPNNumberImpl <em>HLPN Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.HLPNNumberImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getHLPNNumber()
		 * @generated
		 */
		EClass HLPN_NUMBER = eINSTANCE.getHLPNNumber();

		/**
		 * The meta object literal for the '<em><b>Container Number Constant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT = eINSTANCE.getHLPNNumber_ContainerNumberConstant();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.NaturalImpl <em>Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.NaturalImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getNatural()
		 * @generated
		 */
		EClass NATURAL = eINSTANCE.getNatural();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.PositiveImpl <em>Positive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.PositiveImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getPositive()
		 * @generated
		 */
		EClass POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.HLIntegerImpl <em>HL Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.HLIntegerImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getHLInteger()
		 * @generated
		 */
		EClass HL_INTEGER = eINSTANCE.getHLInteger();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.NumberConstantImpl <em>Number Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.NumberConstantImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getNumberConstant()
		 * @generated
		 */
		EClass NUMBER_CONSTANT = eINSTANCE.getNumberConstant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_CONSTANT__TYPE = eINSTANCE.getNumberConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTANT__VALUE = eINSTANCE.getNumberConstant_Value();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegerOperatorImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getIntegerOperator()
		 * @generated
		 */
		EClass INTEGER_OPERATOR = eINSTANCE.getIntegerOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.AdditionImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.SubtractionImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getSubtraction()
		 * @generated
		 */
		EClass SUBTRACTION = eINSTANCE.getSubtraction();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.MultiplicationImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.DivisionImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.ModuloImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanOrEqualImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanOrEqualImpl
		 * @see fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

	}

} //IntegersPackage
