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
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations;

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
 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsFactory
 * @model kind="package"
 * @generated
 */
public interface ArbitrarydeclarationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arbitrarydeclarations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hlpn.arbitrarydeclarations.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arbitrarydeclarations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArbitrarydeclarationsPackage eINSTANCE = fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarySortImpl <em>Arbitrary Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarySortImpl
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitrarySort()
	 * @generated
	 */
	int ARBITRARY_SORT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT__ID = TermsPackage.SORT_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT__NAME = TermsPackage.SORT_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT__CONTAINER_DECLARATIONS = TermsPackage.SORT_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The number of structural features of the '<em>Arbitrary Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT_FEATURE_COUNT = TermsPackage.SORT_DECL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl <em>Arbitrary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitraryOperator()
	 * @generated
	 */
	int ARBITRARY_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__ID = TermsPackage.OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__NAME = TermsPackage.OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__CONTAINER_DECLARATIONS = TermsPackage.OPERATOR_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__INPUT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__OUTPUT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arbitrary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR_FEATURE_COUNT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.UnparsedImpl <em>Unparsed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.UnparsedImpl
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getUnparsed()
	 * @generated
	 */
	int UNPARSED = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__ID = TermsPackage.TERMS_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__NAME = TermsPackage.TERMS_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__CONTAINER_DECLARATIONS = TermsPackage.TERMS_DECLARATION__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Unparsed Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__UNPARSED_MODEL = TermsPackage.TERMS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unparsed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_FEATURE_COUNT = TermsPackage.TERMS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl <em>Any Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getAnySort()
	 * @generated
	 */
	int ANY_SORT = 3;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__MULTI = TermsPackage.SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_NAMED_SORT = TermsPackage.SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_VARIABLE_DECL = TermsPackage.SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_PRODUCT_SORT = TermsPackage.SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_TYPE = TermsPackage.SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_ALL = TermsPackage.SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_EMPTY = TermsPackage.SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_PARTITION = TermsPackage.SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Container List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_LIST = TermsPackage.SORT__CONTAINER_LIST;

	/**
	 * The feature id for the '<em><b>Container Empty List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_EMPTY_LIST = TermsPackage.SORT__CONTAINER_EMPTY_LIST;

	/**
	 * The feature id for the '<em><b>Container Make List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__CONTAINER_MAKE_LIST = TermsPackage.SORT__CONTAINER_MAKE_LIST;

	/**
	 * The feature id for the '<em><b>Any Sort Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT__ANY_SORT_MODEL = TermsPackage.SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SORT_FEATURE_COUNT = TermsPackage.SORT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort <em>Arbitrary Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Sort</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort
	 * @generated
	 */
	EClass getArbitrarySort();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator <em>Arbitrary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Operator</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator
	 * @generated
	 */
	EClass getArbitraryOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getInput()
	 * @see #getArbitraryOperator()
	 * @generated
	 */
	EReference getArbitraryOperator_Input();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getOutput()
	 * @see #getArbitraryOperator()
	 * @generated
	 */
	EReference getArbitraryOperator_Output();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed <em>Unparsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unparsed</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed
	 * @generated
	 */
	EClass getUnparsed();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed#getUnparsedModel <em>Unparsed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unparsed Model</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed#getUnparsedModel()
	 * @see #getUnparsed()
	 * @generated
	 */
	EReference getUnparsed_UnparsedModel();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort <em>Any Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Sort</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort
	 * @generated
	 */
	EClass getAnySort();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort#getAnySortModel <em>Any Sort Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Any Sort Model</em>'.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort#getAnySortModel()
	 * @see #getAnySort()
	 * @generated
	 */
	EReference getAnySort_AnySortModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArbitrarydeclarationsFactory getArbitrarydeclarationsFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarySortImpl <em>Arbitrary Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarySortImpl
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitrarySort()
		 * @generated
		 */
		EClass ARBITRARY_SORT = eINSTANCE.getArbitrarySort();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl <em>Arbitrary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitraryOperator()
		 * @generated
		 */
		EClass ARBITRARY_OPERATOR = eINSTANCE.getArbitraryOperator();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_OPERATOR__INPUT = eINSTANCE.getArbitraryOperator_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_OPERATOR__OUTPUT = eINSTANCE.getArbitraryOperator_Output();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.UnparsedImpl <em>Unparsed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.UnparsedImpl
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getUnparsed()
		 * @generated
		 */
		EClass UNPARSED = eINSTANCE.getUnparsed();

		/**
		 * The meta object literal for the '<em><b>Unparsed Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPARSED__UNPARSED_MODEL = eINSTANCE.getUnparsed_UnparsedModel();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl <em>Any Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl
		 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getAnySort()
		 * @generated
		 */
		EClass ANY_SORT = eINSTANCE.getAnySort();

		/**
		 * The meta object literal for the '<em><b>Any Sort Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_SORT__ANY_SORT_MODEL = eINSTANCE.getAnySort_AnySortModel();

	}

} //ArbitrarydeclarationsPackage
