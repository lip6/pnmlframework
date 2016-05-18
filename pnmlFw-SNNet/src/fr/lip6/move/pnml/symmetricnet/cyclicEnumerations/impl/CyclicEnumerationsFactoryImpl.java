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
package fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsFactory;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsPackage;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CyclicEnumerationsFactoryImpl extends EFactoryImpl implements CyclicEnumerationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CyclicEnumerationsFactory init() {
		try {
			CyclicEnumerationsFactory theCyclicEnumerationsFactory = (CyclicEnumerationsFactory) EPackage.Registry.INSTANCE
					.getEFactory(CyclicEnumerationsPackage.eNS_URI);
			if (theCyclicEnumerationsFactory != null) {
				return theCyclicEnumerationsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CyclicEnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicEnumerationsFactoryImpl() {
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
		case CyclicEnumerationsPackage.CYCLIC_ENUMERATION:
			return createCyclicEnumeration();
		case CyclicEnumerationsPackage.SUCCESSOR:
			return createSuccessor();
		case CyclicEnumerationsPackage.PREDECESSOR:
			return createPredecessor();
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
	public CyclicEnumeration createCyclicEnumeration() {
		CyclicEnumerationImpl cyclicEnumeration = new CyclicEnumerationImpl();
		return cyclicEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Successor createSuccessor() {
		SuccessorImpl successor = new SuccessorImpl();
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predecessor createPredecessor() {
		PredecessorImpl predecessor = new PredecessorImpl();
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CyclicEnumerationsPackage getCyclicEnumerationsPackage() {
		return (CyclicEnumerationsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CyclicEnumerationsPackage getPackage() {
		return CyclicEnumerationsPackage.eINSTANCE;
	}

} //CyclicEnumerationsFactoryImpl
