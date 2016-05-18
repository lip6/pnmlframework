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
package fr.lip6.move.pnml.hlpn.lists.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.lip6.move.pnml.hlpn.lists.Append;
import fr.lip6.move.pnml.hlpn.lists.Concatenation;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.Length;
import fr.lip6.move.pnml.hlpn.lists.ListOperator;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.MemberAtIndex;
import fr.lip6.move.pnml.hlpn.lists.Sublist;
import fr.lip6.move.pnml.hlpn.terms.BuiltInConstant;
import fr.lip6.move.pnml.hlpn.terms.BuiltInOperator;
import fr.lip6.move.pnml.hlpn.terms.BuiltInSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.hlpn.lists.ListsPackage
 * @generated
 */
public class ListsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ListsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListsSwitch() {
		if (modelPackage == null) {
			modelPackage = ListsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ListsPackage.HLPN_LIST: {
			HLPNList hlpnList = (HLPNList) theEObject;
			T result = caseHLPNList(hlpnList);
			if (result == null)
				result = caseBuiltInSort(hlpnList);
			if (result == null)
				result = caseSort(hlpnList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.EMPTY_LIST: {
			EmptyList emptyList = (EmptyList) theEObject;
			T result = caseEmptyList(emptyList);
			if (result == null)
				result = caseBuiltInConstant(emptyList);
			if (result == null)
				result = caseOperator(emptyList);
			if (result == null)
				result = caseTerm(emptyList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.LIST_OPERATOR: {
			ListOperator listOperator = (ListOperator) theEObject;
			T result = caseListOperator(listOperator);
			if (result == null)
				result = caseBuiltInOperator(listOperator);
			if (result == null)
				result = caseOperator(listOperator);
			if (result == null)
				result = caseTerm(listOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.APPEND: {
			Append append = (Append) theEObject;
			T result = caseAppend(append);
			if (result == null)
				result = caseListOperator(append);
			if (result == null)
				result = caseBuiltInOperator(append);
			if (result == null)
				result = caseOperator(append);
			if (result == null)
				result = caseTerm(append);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.CONCATENATION: {
			Concatenation concatenation = (Concatenation) theEObject;
			T result = caseConcatenation(concatenation);
			if (result == null)
				result = caseListOperator(concatenation);
			if (result == null)
				result = caseBuiltInOperator(concatenation);
			if (result == null)
				result = caseOperator(concatenation);
			if (result == null)
				result = caseTerm(concatenation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.LENGTH: {
			Length length = (Length) theEObject;
			T result = caseLength(length);
			if (result == null)
				result = caseListOperator(length);
			if (result == null)
				result = caseBuiltInOperator(length);
			if (result == null)
				result = caseOperator(length);
			if (result == null)
				result = caseTerm(length);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.MAKE_LIST: {
			MakeList makeList = (MakeList) theEObject;
			T result = caseMakeList(makeList);
			if (result == null)
				result = caseListOperator(makeList);
			if (result == null)
				result = caseBuiltInOperator(makeList);
			if (result == null)
				result = caseOperator(makeList);
			if (result == null)
				result = caseTerm(makeList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.MEMBER_AT_INDEX: {
			MemberAtIndex memberAtIndex = (MemberAtIndex) theEObject;
			T result = caseMemberAtIndex(memberAtIndex);
			if (result == null)
				result = caseListOperator(memberAtIndex);
			if (result == null)
				result = caseBuiltInOperator(memberAtIndex);
			if (result == null)
				result = caseOperator(memberAtIndex);
			if (result == null)
				result = caseTerm(memberAtIndex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ListsPackage.SUBLIST: {
			Sublist sublist = (Sublist) theEObject;
			T result = caseSublist(sublist);
			if (result == null)
				result = caseListOperator(sublist);
			if (result == null)
				result = caseBuiltInOperator(sublist);
			if (result == null)
				result = caseOperator(sublist);
			if (result == null)
				result = caseTerm(sublist);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLPN List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLPN List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLPNList(HLPNList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyList(EmptyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOperator(ListOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Append</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Append</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppend(Append object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenation(Concatenation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakeList(MakeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member At Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member At Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberAtIndex(MemberAtIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sublist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sublist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSublist(Sublist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInSort(BuiltInSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInConstant(BuiltInConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInOperator(BuiltInOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ListsSwitch
