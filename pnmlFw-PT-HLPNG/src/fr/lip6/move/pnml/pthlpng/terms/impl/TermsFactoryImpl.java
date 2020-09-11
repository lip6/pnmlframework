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
package fr.lip6.move.pnml.pthlpng.terms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.pthlpng.terms.Declarations;
import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.TermsFactory;
import fr.lip6.move.pnml.pthlpng.terms.TermsPackage;
import fr.lip6.move.pnml.pthlpng.terms.Tuple;
import fr.lip6.move.pnml.pthlpng.terms.UserOperator;
import fr.lip6.move.pnml.pthlpng.terms.UserSort;
import fr.lip6.move.pnml.pthlpng.terms.Variable;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class TermsFactoryImpl extends EFactoryImpl implements TermsFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static TermsFactory init() {
		try {
			TermsFactory theTermsFactory = (TermsFactory) EPackage.Registry.INSTANCE.getEFactory(TermsPackage.eNS_URI);
			if (theTermsFactory != null) {
				return theTermsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public TermsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TermsPackage.DECLARATIONS:
			return createDeclarations();
		case TermsPackage.MULTISET_SORT:
			return createMultisetSort();
		case TermsPackage.VARIABLE_DECL:
			return createVariableDecl();
		case TermsPackage.VARIABLE:
			return createVariable();
		case TermsPackage.PRODUCT_SORT:
			return createProductSort();
		case TermsPackage.TUPLE:
			return createTuple();
		case TermsPackage.NAMED_SORT:
			return createNamedSort();
		case TermsPackage.USER_SORT:
			return createUserSort();
		case TermsPackage.NAMED_OPERATOR:
			return createNamedOperator();
		case TermsPackage.USER_OPERATOR:
			return createUserOperator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Declarations createDeclarations() {
		DeclarationsImpl declarations = new DeclarationsImpl();
		return declarations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public MultisetSort createMultisetSort() {
		MultisetSortImpl multisetSort = new MultisetSortImpl();
		return multisetSort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public VariableDecl createVariableDecl() {
		VariableDeclImpl variableDecl = new VariableDeclImpl();
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ProductSort createProductSort() {
		ProductSortImpl productSort = new ProductSortImpl();
		return productSort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Tuple createTuple() {
		TupleImpl tuple = new TupleImpl();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NamedSort createNamedSort() {
		NamedSortImpl namedSort = new NamedSortImpl();
		return namedSort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public UserSort createUserSort() {
		UserSortImpl userSort = new UserSortImpl();
		return userSort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NamedOperator createNamedOperator() {
		NamedOperatorImpl namedOperator = new NamedOperatorImpl();
		return namedOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public UserOperator createUserOperator() {
		UserOperatorImpl userOperator = new UserOperatorImpl();
		return userOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TermsPackage getTermsPackage() {
		return (TermsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TermsPackage getPackage() {
		return TermsPackage.eINSTANCE;
	}

} // TermsFactoryImpl
