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
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsFactory;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArbitrarydeclarationsFactoryImpl extends EFactoryImpl implements ArbitrarydeclarationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArbitrarydeclarationsFactory init() {
		try {
			ArbitrarydeclarationsFactory theArbitrarydeclarationsFactory = (ArbitrarydeclarationsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ArbitrarydeclarationsPackage.eNS_URI);
			if (theArbitrarydeclarationsFactory != null) {
				return theArbitrarydeclarationsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArbitrarydeclarationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrarydeclarationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArbitrarydeclarationsPackage.ARBITRARY_SORT:
			return createArbitrarySort();
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR:
			return createArbitraryOperator();
		case ArbitrarydeclarationsPackage.UNPARSED:
			return createUnparsed();
		case ArbitrarydeclarationsPackage.ANY_SORT:
			return createAnySort();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArbitrarySort createArbitrarySort() {
		ArbitrarySortImpl arbitrarySort = new ArbitrarySortImpl();
		return arbitrarySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArbitraryOperator createArbitraryOperator() {
		ArbitraryOperatorImpl arbitraryOperator = new ArbitraryOperatorImpl();
		return arbitraryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unparsed createUnparsed() {
		UnparsedImpl unparsed = new UnparsedImpl();
		return unparsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnySort createAnySort() {
		AnySortImpl anySort = new AnySortImpl();
		return anySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArbitrarydeclarationsPackage getArbitrarydeclarationsPackage() {
		return (ArbitrarydeclarationsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArbitrarydeclarationsPackage getPackage() {
		return ArbitrarydeclarationsPackage.eINSTANCE;
	}

} //ArbitrarydeclarationsFactoryImpl
