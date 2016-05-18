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
package fr.lip6.move.pnml.hlpn.cyclicEnumerations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumerationsPackage;
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
 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumerationsFactory
 * @model kind="package"
 * @generated
 */
public interface CyclicEnumerationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cyclicEnumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hlpn.cyclicEnumerations.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cyclicEnumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CyclicEnumerationsPackage eINSTANCE = fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumOperatorImpl <em>Cyclic Enum Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumOperatorImpl
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getCyclicEnumOperator()
	 * @generated
	 */
	int CYCLIC_ENUM_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__SORT = TermsPackage.BUILT_IN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__CONTAINER_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__CONTAINER_NAMED_OPERATOR = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__CONTAINER_HL_MARKING = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__CONTAINER_CONDITION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__CONTAINER_HL_ANNOTATION = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__CONTAINER_PARTITION_ELEMENT = TermsPackage.BUILT_IN_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__OUTPUT = TermsPackage.BUILT_IN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__INPUT = TermsPackage.BUILT_IN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Cyclic Enum Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl <em>Cyclic Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getCyclicEnumeration()
	 * @generated
	 */
	int CYCLIC_ENUMERATION = 1;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__MULTI = FiniteEnumerationsPackage.FINITE_ENUMERATION__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_NAMED_SORT = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_VARIABLE_DECL = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_PRODUCT_SORT = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_TYPE = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_ALL = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_EMPTY = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_PARTITION = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_LIST = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_LIST;

	/**
	 * The feature id for the '<em><b>Container Empty List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_EMPTY_LIST = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_EMPTY_LIST;

	/**
	 * The feature id for the '<em><b>Container Make List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__CONTAINER_MAKE_LIST = FiniteEnumerationsPackage.FINITE_ENUMERATION__CONTAINER_MAKE_LIST;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__ELEMENTS = FiniteEnumerationsPackage.FINITE_ENUMERATION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Cyclic Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION_FEATURE_COUNT = FiniteEnumerationsPackage.FINITE_ENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl <em>Successor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getSuccessor()
	 * @generated
	 */
	int SUCCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__SORT = CYCLIC_ENUM_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__CONTAINER_OPERATOR = CYCLIC_ENUM_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__CONTAINER_NAMED_OPERATOR = CYCLIC_ENUM_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__CONTAINER_HL_MARKING = CYCLIC_ENUM_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__CONTAINER_CONDITION = CYCLIC_ENUM_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__CONTAINER_HL_ANNOTATION = CYCLIC_ENUM_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__CONTAINER_PARTITION_ELEMENT = CYCLIC_ENUM_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__SUBTERM = CYCLIC_ENUM_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__OUTPUT = CYCLIC_ENUM_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__INPUT = CYCLIC_ENUM_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Successor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR_FEATURE_COUNT = CYCLIC_ENUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl <em>Predecessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getPredecessor()
	 * @generated
	 */
	int PREDECESSOR = 3;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__SORT = CYCLIC_ENUM_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONTAINER_OPERATOR = CYCLIC_ENUM_OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONTAINER_NAMED_OPERATOR = CYCLIC_ENUM_OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONTAINER_HL_MARKING = CYCLIC_ENUM_OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONTAINER_CONDITION = CYCLIC_ENUM_OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONTAINER_HL_ANNOTATION = CYCLIC_ENUM_OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONTAINER_PARTITION_ELEMENT = CYCLIC_ENUM_OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__SUBTERM = CYCLIC_ENUM_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__OUTPUT = CYCLIC_ENUM_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__INPUT = CYCLIC_ENUM_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_FEATURE_COUNT = CYCLIC_ENUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumOperator <em>Cyclic Enum Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Enum Operator</em>'.
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumOperator
	 * @generated
	 */
	EClass getCyclicEnumOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration <em>Cyclic Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Enumeration</em>'.
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration
	 * @generated
	 */
	EClass getCyclicEnumeration();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Successor</em>'.
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor
	 * @generated
	 */
	EClass getSuccessor();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessor</em>'.
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor
	 * @generated
	 */
	EClass getPredecessor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CyclicEnumerationsFactory getCyclicEnumerationsFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumOperatorImpl <em>Cyclic Enum Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumOperatorImpl
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getCyclicEnumOperator()
		 * @generated
		 */
		EClass CYCLIC_ENUM_OPERATOR = eINSTANCE.getCyclicEnumOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl <em>Cyclic Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getCyclicEnumeration()
		 * @generated
		 */
		EClass CYCLIC_ENUMERATION = eINSTANCE.getCyclicEnumeration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl <em>Successor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getSuccessor()
		 * @generated
		 */
		EClass SUCCESSOR = eINSTANCE.getSuccessor();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl <em>Predecessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl
		 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl#getPredecessor()
		 * @generated
		 */
		EClass PREDECESSOR = eINSTANCE.getPredecessor();

	}

} //CyclicEnumerationsPackage
