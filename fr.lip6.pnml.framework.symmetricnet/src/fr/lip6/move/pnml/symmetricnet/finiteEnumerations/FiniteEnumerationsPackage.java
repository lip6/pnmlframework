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
package fr.lip6.move.pnml.symmetricnet.finiteEnumerations;

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
 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumerationsFactory
 * @model kind="package"
 * @generated
 */
public interface FiniteEnumerationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finiteEnumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///symmetricnet.finiteEnumerations.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "finiteEnumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiniteEnumerationsPackage eINSTANCE = fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl <em>Finite Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsPackageImpl#getFiniteEnumeration()
	 * @generated
	 */
	int FINITE_ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__MULTI = TermsPackage.BUILT_IN_SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_NAMED_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_VARIABLE_DECL = TermsPackage.BUILT_IN_SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_PRODUCT_SORT = TermsPackage.BUILT_IN_SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_TYPE = TermsPackage.BUILT_IN_SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_ALL = TermsPackage.BUILT_IN_SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_EMPTY = TermsPackage.BUILT_IN_SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__CONTAINER_PARTITION = TermsPackage.BUILT_IN_SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__ELEMENTS = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finite Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FEConstantImpl <em>FE Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FEConstantImpl
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsPackageImpl#getFEConstant()
	 * @generated
	 */
	int FE_CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT__ID = TermsPackage.OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT__NAME = TermsPackage.OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT__CONTAINER_DECLARATIONS = TermsPackage.OPERATOR_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT__SORT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FE Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT_FEATURE_COUNT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration <em>Finite Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Enumeration</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration
	 * @generated
	 */
	EClass getFiniteEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration#getElements()
	 * @see #getFiniteEnumeration()
	 * @generated
	 */
	EReference getFiniteEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant <em>FE Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FE Constant</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant
	 * @generated
	 */
	EClass getFEConstant();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sort</em>'.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant#getSort()
	 * @see #getFEConstant()
	 * @generated
	 */
	EReference getFEConstant_Sort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiniteEnumerationsFactory getFiniteEnumerationsFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl <em>Finite Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsPackageImpl#getFiniteEnumeration()
		 * @generated
		 */
		EClass FINITE_ENUMERATION = eINSTANCE.getFiniteEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_ENUMERATION__ELEMENTS = eINSTANCE.getFiniteEnumeration_Elements();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FEConstantImpl <em>FE Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FEConstantImpl
		 * @see fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsPackageImpl#getFEConstant()
		 * @generated
		 */
		EClass FE_CONSTANT = eINSTANCE.getFEConstant();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FE_CONSTANT__SORT = eINSTANCE.getFEConstant_Sort();

	}

} //FiniteEnumerationsPackage
