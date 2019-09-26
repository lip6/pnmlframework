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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsFactory
 * @model kind="package"
 * @generated
 */
public interface TermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pthlpng.terms.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsPackage eINSTANCE = fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.DeclarationsImpl <em>Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.DeclarationsImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getDeclarations()
	 * @generated
	 */
	int DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS__DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Container Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS__CONTAINER_DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.TermsDeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsDeclarationImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getTermsDeclaration()
	 * @generated
	 */
	int TERMS_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_DECLARATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_DECLARATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_DECLARATION__CONTAINER_DECLARATIONS = 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.SortImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 2;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__MULTI = 0;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_NAMED_SORT = 1;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_VARIABLE_DECL = 2;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_PRODUCT_SORT = 3;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_ALL = 5;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_EMPTY = 6;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__CONTAINER_PARTITION = 7;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl <em>Multiset Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getMultisetSort()
	 * @generated
	 */
	int MULTISET_SORT = 3;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__MULTI = SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_NAMED_SORT = SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_VARIABLE_DECL = SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_PRODUCT_SORT = SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_TYPE = SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_ALL = SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_EMPTY = SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__CONTAINER_PARTITION = SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT__BASIS = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiset Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SORT = 0;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTAINER_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTAINER_NAMED_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTAINER_HL_MARKING = 3;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTAINER_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTAINER_HL_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTAINER_PARTITION_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.OperatorImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SORT = TERM__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CONTAINER_OPERATOR = TERM__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CONTAINER_NAMED_OPERATOR = TERM__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CONTAINER_HL_MARKING = TERM__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CONTAINER_CONDITION = TERM__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CONTAINER_HL_ANNOTATION = TERM__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CONTAINER_PARTITION_ELEMENT = TERM__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SUBTERM = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OUTPUT = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INPUT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.VariableDeclImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getVariableDecl()
	 * @generated
	 */
	int VARIABLE_DECL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__ID = TERMS_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__NAME = TERMS_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__CONTAINER_DECLARATIONS = TERMS_DECLARATION__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__SORT = TERMS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__CONTAINER_NAMED_OPERATOR = TERMS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_FEATURE_COUNT = TERMS_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SORT = TERM__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER_OPERATOR = TERM__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER_NAMED_OPERATOR = TERM__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER_HL_MARKING = TERM__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER_CONDITION = TERM__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER_HL_ANNOTATION = TERM__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER_PARTITION_ELEMENT = TERM__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Variable Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_DECL = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInSortImpl <em>Built In Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInSortImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getBuiltInSort()
	 * @generated
	 */
	int BUILT_IN_SORT = 8;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__MULTI = SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_NAMED_SORT = SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_VARIABLE_DECL = SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_PRODUCT_SORT = SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_TYPE = SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_ALL = SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_EMPTY = SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT__CONTAINER_PARTITION = SORT__CONTAINER_PARTITION;

	/**
	 * The number of structural features of the '<em>Built In Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl <em>Product Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getProductSort()
	 * @generated
	 */
	int PRODUCT_SORT = 9;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__MULTI = SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_NAMED_SORT = SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_VARIABLE_DECL = SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_PRODUCT_SORT = SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_TYPE = SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_ALL = SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_EMPTY = SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__CONTAINER_PARTITION = SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Element Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__ELEMENT_SORT = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInConstantImpl <em>Built In Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInConstantImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getBuiltInConstant()
	 * @generated
	 */
	int BUILT_IN_CONSTANT = 10;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__CONTAINER_OPERATOR = OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__CONTAINER_NAMED_OPERATOR = OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__CONTAINER_HL_MARKING = OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__CONTAINER_CONDITION = OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__CONTAINER_HL_ANNOTATION = OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__CONTAINER_PARTITION_ELEMENT = OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Built In Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONSTANT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.MultisetOperatorImpl <em>Multiset Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.MultisetOperatorImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getMultisetOperator()
	 * @generated
	 */
	int MULTISET_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__CONTAINER_OPERATOR = OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__CONTAINER_NAMED_OPERATOR = OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__CONTAINER_HL_MARKING = OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__CONTAINER_CONDITION = OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__CONTAINER_HL_ANNOTATION = OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__CONTAINER_PARTITION_ELEMENT = OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Multiset Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 12;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONTAINER_OPERATOR = OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONTAINER_NAMED_OPERATOR = OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONTAINER_HL_MARKING = OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONTAINER_CONDITION = OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONTAINER_HL_ANNOTATION = OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONTAINER_PARTITION_ELEMENT = OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.SortDeclImpl <em>Sort Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.SortDeclImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getSortDecl()
	 * @generated
	 */
	int SORT_DECL = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL__ID = TERMS_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL__NAME = TERMS_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL__CONTAINER_DECLARATIONS = TERMS_DECLARATION__CONTAINER_DECLARATIONS;

	/**
	 * The number of structural features of the '<em>Sort Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL_FEATURE_COUNT = TERMS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInOperatorImpl <em>Built In Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInOperatorImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getBuiltInOperator()
	 * @generated
	 */
	int BUILT_IN_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__CONTAINER_OPERATOR = OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__CONTAINER_NAMED_OPERATOR = OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__CONTAINER_HL_MARKING = OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__CONTAINER_CONDITION = OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__CONTAINER_HL_ANNOTATION = OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__CONTAINER_PARTITION_ELEMENT = OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Built In Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.NamedSortImpl <em>Named Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.NamedSortImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getNamedSort()
	 * @generated
	 */
	int NAMED_SORT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__ID = SORT_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__NAME = SORT_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__CONTAINER_DECLARATIONS = SORT_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Sortdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__SORTDEF = SORT_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT_FEATURE_COUNT = SORT_DECL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl <em>User Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getUserSort()
	 * @generated
	 */
	int USER_SORT = 16;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__MULTI = SORT__MULTI;

	/**
	 * The feature id for the '<em><b>Container Named Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_NAMED_SORT = SORT__CONTAINER_NAMED_SORT;

	/**
	 * The feature id for the '<em><b>Container Variable Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_VARIABLE_DECL = SORT__CONTAINER_VARIABLE_DECL;

	/**
	 * The feature id for the '<em><b>Container Product Sort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_PRODUCT_SORT = SORT__CONTAINER_PRODUCT_SORT;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_TYPE = SORT__CONTAINER_TYPE;

	/**
	 * The feature id for the '<em><b>Container All</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_ALL = SORT__CONTAINER_ALL;

	/**
	 * The feature id for the '<em><b>Container Empty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_EMPTY = SORT__CONTAINER_EMPTY;

	/**
	 * The feature id for the '<em><b>Container Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__CONTAINER_PARTITION = SORT__CONTAINER_PARTITION;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__DECLARATION = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.OperatorDeclImpl <em>Operator Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.OperatorDeclImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getOperatorDecl()
	 * @generated
	 */
	int OPERATOR_DECL = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL__ID = TERMS_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL__NAME = TERMS_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL__CONTAINER_DECLARATIONS = TERMS_DECLARATION__CONTAINER_DECLARATIONS;

	/**
	 * The number of structural features of the '<em>Operator Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL_FEATURE_COUNT = TERMS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.NamedOperatorImpl <em>Named Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.NamedOperatorImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getNamedOperator()
	 * @generated
	 */
	int NAMED_OPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__ID = OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__NAME = OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Container Declarations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__CONTAINER_DECLARATIONS = OPERATOR_DECL__CONTAINER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__DEF = OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__PARAMETERS = OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR_FEATURE_COUNT = OPERATOR_DECL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl <em>User Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl
	 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getUserOperator()
	 * @generated
	 */
	int USER_OPERATOR = 19;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Container Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__CONTAINER_OPERATOR = OPERATOR__CONTAINER_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container Named Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__CONTAINER_NAMED_OPERATOR = OPERATOR__CONTAINER_NAMED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Container HL Marking</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__CONTAINER_HL_MARKING = OPERATOR__CONTAINER_HL_MARKING;

	/**
	 * The feature id for the '<em><b>Container Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__CONTAINER_CONDITION = OPERATOR__CONTAINER_CONDITION;

	/**
	 * The feature id for the '<em><b>Container HL Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__CONTAINER_HL_ANNOTATION = OPERATOR__CONTAINER_HL_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Container Partition Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__CONTAINER_PARTITION_ELEMENT = OPERATOR__CONTAINER_PARTITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__INPUT = OPERATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__DECLARATION = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.Declarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarations</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Declarations
	 * @generated
	 */
	EClass getDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.pthlpng.terms.Declarations#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Declarations#getDeclaration()
	 * @see #getDeclarations()
	 * @generated
	 */
	EReference getDeclarations_Declaration();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Declarations#getContainerDeclaration <em>Container Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Declaration</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Declarations#getContainerDeclaration()
	 * @see #getDeclarations()
	 * @generated
	 */
	EReference getDeclarations_ContainerDeclaration();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration
	 * @generated
	 */
	EClass getTermsDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getId()
	 * @see #getTermsDeclaration()
	 * @generated
	 */
	EAttribute getTermsDeclaration_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getName()
	 * @see #getTermsDeclaration()
	 * @generated
	 */
	EAttribute getTermsDeclaration_Name();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getContainerDeclarations <em>Container Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Declarations</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration#getContainerDeclarations()
	 * @see #getTermsDeclaration()
	 * @generated
	 */
	EReference getTermsDeclaration_ContainerDeclarations();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Multi</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getMulti()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_Multi();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerNamedSort <em>Container Named Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Named Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerNamedSort()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerNamedSort();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerVariableDecl <em>Container Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Variable Decl</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerVariableDecl()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerVariableDecl();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerProductSort <em>Container Product Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Product Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerProductSort()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerProductSort();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Type</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerType()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerType();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerAll <em>Container All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container All</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerAll()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerAll();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerEmpty <em>Container Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Empty</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerEmpty()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerEmpty();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerPartition <em>Container Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Partition</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerPartition()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_ContainerPartition();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.MultisetSort <em>Multiset Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiset Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.MultisetSort
	 * @generated
	 */
	EClass getMultisetSort();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.pthlpng.terms.MultisetSort#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basis</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.MultisetSort#getBasis()
	 * @see #getMultisetSort()
	 * @generated
	 */
	EReference getMultisetSort_Basis();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getSort()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Sort();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerOperator <em>Container Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getContainerOperator()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ContainerOperator();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerNamedOperator <em>Container Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Named Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getContainerNamedOperator()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ContainerNamedOperator();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLMarking <em>Container HL Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container HL Marking</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLMarking()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ContainerHLMarking();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerCondition <em>Container Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Condition</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getContainerCondition()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ContainerCondition();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLAnnotation <em>Container HL Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container HL Annotation</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getContainerHLAnnotation()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ContainerHLAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.Term#getContainerPartitionElement <em>Container Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Partition Element</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term#getContainerPartitionElement()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ContainerPartitionElement();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.pthlpng.terms.Operator#getSubterm <em>Subterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subterm</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Operator#getSubterm()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Subterm();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.pthlpng.terms.Operator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Operator#getOutput()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Output();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.pthlpng.terms.Operator#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Operator#getInput()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Input();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.VariableDecl
	 * @generated
	 */
	EClass getVariableDecl();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getSort()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Sort();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getContainerNamedOperator <em>Container Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Named Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getContainerNamedOperator()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_ContainerNamedOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.pthlpng.terms.Variable#getVariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Decl</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Variable#getVariableDecl()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariableDecl();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.BuiltInSort <em>Built In Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.BuiltInSort
	 * @generated
	 */
	EClass getBuiltInSort();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.ProductSort <em>Product Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.ProductSort
	 * @generated
	 */
	EClass getProductSort();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.pthlpng.terms.ProductSort#getElementSort <em>Element Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.ProductSort#getElementSort()
	 * @see #getProductSort()
	 * @generated
	 */
	EReference getProductSort_ElementSort();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.BuiltInConstant <em>Built In Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Constant</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.BuiltInConstant
	 * @generated
	 */
	EClass getBuiltInConstant();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.MultisetOperator <em>Multiset Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiset Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.MultisetOperator
	 * @generated
	 */
	EClass getMultisetOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.SortDecl <em>Sort Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Decl</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.SortDecl
	 * @generated
	 */
	EClass getSortDecl();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator <em>Built In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator
	 * @generated
	 */
	EClass getBuiltInOperator();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.NamedSort <em>Named Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedSort
	 * @generated
	 */
	EClass getNamedSort();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.pthlpng.terms.NamedSort#getSortdef <em>Sortdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortdef</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedSort#getSortdef()
	 * @see #getNamedSort()
	 * @generated
	 */
	EReference getNamedSort_Sortdef();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.UserSort <em>User Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Sort</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.UserSort
	 * @generated
	 */
	EClass getUserSort();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.pthlpng.terms.UserSort#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.UserSort#getDeclaration()
	 * @see #getUserSort()
	 * @generated
	 */
	EReference getUserSort_Declaration();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.OperatorDecl <em>Operator Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Decl</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.OperatorDecl
	 * @generated
	 */
	EClass getOperatorDecl();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.NamedOperator <em>Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedOperator
	 * @generated
	 */
	EClass getNamedOperator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getDef()
	 * @see #getNamedOperator()
	 * @generated
	 */
	EReference getNamedOperator_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedOperator#getParameters()
	 * @see #getNamedOperator()
	 * @generated
	 */
	EReference getNamedOperator_Parameters();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.pthlpng.terms.UserOperator <em>User Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Operator</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.UserOperator
	 * @generated
	 */
	EClass getUserOperator();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.pthlpng.terms.UserOperator#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.pthlpng.terms.UserOperator#getDeclaration()
	 * @see #getUserOperator()
	 * @generated
	 */
	EReference getUserOperator_Declaration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TermsFactory getTermsFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.DeclarationsImpl <em>Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.DeclarationsImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getDeclarations()
		 * @generated
		 */
		EClass DECLARATIONS = eINSTANCE.getDeclarations();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIONS__DECLARATION = eINSTANCE.getDeclarations_Declaration();

		/**
		 * The meta object literal for the '<em><b>Container Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIONS__CONTAINER_DECLARATION = eINSTANCE.getDeclarations_ContainerDeclaration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.TermsDeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsDeclarationImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getTermsDeclaration()
		 * @generated
		 */
		EClass TERMS_DECLARATION = eINSTANCE.getTermsDeclaration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMS_DECLARATION__ID = eINSTANCE.getTermsDeclaration_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMS_DECLARATION__NAME = eINSTANCE.getTermsDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Container Declarations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMS_DECLARATION__CONTAINER_DECLARATIONS = eINSTANCE.getTermsDeclaration_ContainerDeclarations();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.SortImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__MULTI = eINSTANCE.getSort_Multi();

		/**
		 * The meta object literal for the '<em><b>Container Named Sort</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_NAMED_SORT = eINSTANCE.getSort_ContainerNamedSort();

		/**
		 * The meta object literal for the '<em><b>Container Variable Decl</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_VARIABLE_DECL = eINSTANCE.getSort_ContainerVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Container Product Sort</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_PRODUCT_SORT = eINSTANCE.getSort_ContainerProductSort();

		/**
		 * The meta object literal for the '<em><b>Container Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_TYPE = eINSTANCE.getSort_ContainerType();

		/**
		 * The meta object literal for the '<em><b>Container All</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_ALL = eINSTANCE.getSort_ContainerAll();

		/**
		 * The meta object literal for the '<em><b>Container Empty</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_EMPTY = eINSTANCE.getSort_ContainerEmpty();

		/**
		 * The meta object literal for the '<em><b>Container Partition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__CONTAINER_PARTITION = eINSTANCE.getSort_ContainerPartition();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl <em>Multiset Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getMultisetSort()
		 * @generated
		 */
		EClass MULTISET_SORT = eINSTANCE.getMultisetSort();

		/**
		 * The meta object literal for the '<em><b>Basis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTISET_SORT__BASIS = eINSTANCE.getMultisetSort_Basis();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__SORT = eINSTANCE.getTerm_Sort();

		/**
		 * The meta object literal for the '<em><b>Container Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTAINER_OPERATOR = eINSTANCE.getTerm_ContainerOperator();

		/**
		 * The meta object literal for the '<em><b>Container Named Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTAINER_NAMED_OPERATOR = eINSTANCE.getTerm_ContainerNamedOperator();

		/**
		 * The meta object literal for the '<em><b>Container HL Marking</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTAINER_HL_MARKING = eINSTANCE.getTerm_ContainerHLMarking();

		/**
		 * The meta object literal for the '<em><b>Container Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTAINER_CONDITION = eINSTANCE.getTerm_ContainerCondition();

		/**
		 * The meta object literal for the '<em><b>Container HL Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTAINER_HL_ANNOTATION = eINSTANCE.getTerm_ContainerHLAnnotation();

		/**
		 * The meta object literal for the '<em><b>Container Partition Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTAINER_PARTITION_ELEMENT = eINSTANCE.getTerm_ContainerPartitionElement();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.OperatorImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Subterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__SUBTERM = eINSTANCE.getOperator_Subterm();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OUTPUT = eINSTANCE.getOperator_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__INPUT = eINSTANCE.getOperator_Input();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.VariableDeclImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getVariableDecl()
		 * @generated
		 */
		EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__SORT = eINSTANCE.getVariableDecl_Sort();

		/**
		 * The meta object literal for the '<em><b>Container Named Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__CONTAINER_NAMED_OPERATOR = eINSTANCE.getVariableDecl_ContainerNamedOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Decl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLE_DECL = eINSTANCE.getVariable_VariableDecl();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInSortImpl <em>Built In Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInSortImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getBuiltInSort()
		 * @generated
		 */
		EClass BUILT_IN_SORT = eINSTANCE.getBuiltInSort();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl <em>Product Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getProductSort()
		 * @generated
		 */
		EClass PRODUCT_SORT = eINSTANCE.getProductSort();

		/**
		 * The meta object literal for the '<em><b>Element Sort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SORT__ELEMENT_SORT = eINSTANCE.getProductSort_ElementSort();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInConstantImpl <em>Built In Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInConstantImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getBuiltInConstant()
		 * @generated
		 */
		EClass BUILT_IN_CONSTANT = eINSTANCE.getBuiltInConstant();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.MultisetOperatorImpl <em>Multiset Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.MultisetOperatorImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getMultisetOperator()
		 * @generated
		 */
		EClass MULTISET_OPERATOR = eINSTANCE.getMultisetOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl <em>Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getTuple()
		 * @generated
		 */
		EClass TUPLE = eINSTANCE.getTuple();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.SortDeclImpl <em>Sort Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.SortDeclImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getSortDecl()
		 * @generated
		 */
		EClass SORT_DECL = eINSTANCE.getSortDecl();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInOperatorImpl <em>Built In Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.BuiltInOperatorImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getBuiltInOperator()
		 * @generated
		 */
		EClass BUILT_IN_OPERATOR = eINSTANCE.getBuiltInOperator();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.NamedSortImpl <em>Named Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.NamedSortImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getNamedSort()
		 * @generated
		 */
		EClass NAMED_SORT = eINSTANCE.getNamedSort();

		/**
		 * The meta object literal for the '<em><b>Sortdef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_SORT__SORTDEF = eINSTANCE.getNamedSort_Sortdef();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl <em>User Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getUserSort()
		 * @generated
		 */
		EClass USER_SORT = eINSTANCE.getUserSort();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SORT__DECLARATION = eINSTANCE.getUserSort_Declaration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.OperatorDeclImpl <em>Operator Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.OperatorDeclImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getOperatorDecl()
		 * @generated
		 */
		EClass OPERATOR_DECL = eINSTANCE.getOperatorDecl();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.NamedOperatorImpl <em>Named Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.NamedOperatorImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getNamedOperator()
		 * @generated
		 */
		EClass NAMED_OPERATOR = eINSTANCE.getNamedOperator();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_OPERATOR__DEF = eINSTANCE.getNamedOperator_Def();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_OPERATOR__PARAMETERS = eINSTANCE.getNamedOperator_Parameters();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl <em>User Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl
		 * @see fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl#getUserOperator()
		 * @generated
		 */
		EClass USER_OPERATOR = eINSTANCE.getUserOperator();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_OPERATOR__DECLARATION = eINSTANCE.getUserOperator_Declaration();

	}

} //TermsPackage
