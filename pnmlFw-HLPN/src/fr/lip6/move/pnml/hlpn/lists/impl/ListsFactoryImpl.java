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
package fr.lip6.move.pnml.hlpn.lists.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.hlpn.lists.Append;
import fr.lip6.move.pnml.hlpn.lists.Concatenation;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.Length;
import fr.lip6.move.pnml.hlpn.lists.ListsFactory;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.MemberAtIndex;
import fr.lip6.move.pnml.hlpn.lists.Sublist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListsFactoryImpl extends EFactoryImpl implements ListsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListsFactory init() {
		try {
			ListsFactory theListsFactory = (ListsFactory) EPackage.Registry.INSTANCE.getEFactory(ListsPackage.eNS_URI);
			if (theListsFactory != null) {
				return theListsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ListsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListsFactoryImpl() {
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
		case ListsPackage.HLPN_LIST:
			return createHLPNList();
		case ListsPackage.EMPTY_LIST:
			return createEmptyList();
		case ListsPackage.APPEND:
			return createAppend();
		case ListsPackage.CONCATENATION:
			return createConcatenation();
		case ListsPackage.LENGTH:
			return createLength();
		case ListsPackage.MAKE_LIST:
			return createMakeList();
		case ListsPackage.MEMBER_AT_INDEX:
			return createMemberAtIndex();
		case ListsPackage.SUBLIST:
			return createSublist();
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
	public HLPNList createHLPNList() {
		HLPNListImpl hlpnList = new HLPNListImpl();
		return hlpnList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyList createEmptyList() {
		EmptyListImpl emptyList = new EmptyListImpl();
		return emptyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Append createAppend() {
		AppendImpl append = new AppendImpl();
		return append;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concatenation createConcatenation() {
		ConcatenationImpl concatenation = new ConcatenationImpl();
		return concatenation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MakeList createMakeList() {
		MakeListImpl makeList = new MakeListImpl();
		return makeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberAtIndex createMemberAtIndex() {
		MemberAtIndexImpl memberAtIndex = new MemberAtIndexImpl();
		return memberAtIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sublist createSublist() {
		SublistImpl sublist = new SublistImpl();
		return sublist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListsPackage getListsPackage() {
		return (ListsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ListsPackage getPackage() {
		return ListsPackage.eINSTANCE;
	}

} //ListsFactoryImpl
