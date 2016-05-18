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
package fr.lip6.move.pnml.hlpn.finiteIntRanges.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeOperator;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual;
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
 * @see fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesPackage
 * @generated
 */
public class FiniteIntRangesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiniteIntRangesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteIntRangesSwitch() {
		if (modelPackage == null) {
			modelPackage = FiniteIntRangesPackage.eINSTANCE;
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
		case FiniteIntRangesPackage.FINITE_INT_RANGE: {
			FiniteIntRange finiteIntRange = (FiniteIntRange) theEObject;
			T result = caseFiniteIntRange(finiteIntRange);
			if (result == null)
				result = caseBuiltInSort(finiteIntRange);
			if (result == null)
				result = caseSort(finiteIntRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiniteIntRangesPackage.FINITE_INT_RANGE_CONSTANT: {
			FiniteIntRangeConstant finiteIntRangeConstant = (FiniteIntRangeConstant) theEObject;
			T result = caseFiniteIntRangeConstant(finiteIntRangeConstant);
			if (result == null)
				result = caseBuiltInConstant(finiteIntRangeConstant);
			if (result == null)
				result = caseOperator(finiteIntRangeConstant);
			if (result == null)
				result = caseTerm(finiteIntRangeConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiniteIntRangesPackage.LESS_THAN: {
			LessThan lessThan = (LessThan) theEObject;
			T result = caseLessThan(lessThan);
			if (result == null)
				result = caseFiniteIntRangeOperator(lessThan);
			if (result == null)
				result = caseBuiltInOperator(lessThan);
			if (result == null)
				result = caseOperator(lessThan);
			if (result == null)
				result = caseTerm(lessThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiniteIntRangesPackage.FINITE_INT_RANGE_OPERATOR: {
			FiniteIntRangeOperator finiteIntRangeOperator = (FiniteIntRangeOperator) theEObject;
			T result = caseFiniteIntRangeOperator(finiteIntRangeOperator);
			if (result == null)
				result = caseBuiltInOperator(finiteIntRangeOperator);
			if (result == null)
				result = caseOperator(finiteIntRangeOperator);
			if (result == null)
				result = caseTerm(finiteIntRangeOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiniteIntRangesPackage.GREATER_THAN: {
			GreaterThan greaterThan = (GreaterThan) theEObject;
			T result = caseGreaterThan(greaterThan);
			if (result == null)
				result = caseFiniteIntRangeOperator(greaterThan);
			if (result == null)
				result = caseBuiltInOperator(greaterThan);
			if (result == null)
				result = caseOperator(greaterThan);
			if (result == null)
				result = caseTerm(greaterThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiniteIntRangesPackage.LESS_THAN_OR_EQUAL: {
			LessThanOrEqual lessThanOrEqual = (LessThanOrEqual) theEObject;
			T result = caseLessThanOrEqual(lessThanOrEqual);
			if (result == null)
				result = caseFiniteIntRangeOperator(lessThanOrEqual);
			if (result == null)
				result = caseBuiltInOperator(lessThanOrEqual);
			if (result == null)
				result = caseOperator(lessThanOrEqual);
			if (result == null)
				result = caseTerm(lessThanOrEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiniteIntRangesPackage.GREATER_THAN_OR_EQUAL: {
			GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual) theEObject;
			T result = caseGreaterThanOrEqual(greaterThanOrEqual);
			if (result == null)
				result = caseFiniteIntRangeOperator(greaterThanOrEqual);
			if (result == null)
				result = caseBuiltInOperator(greaterThanOrEqual);
			if (result == null)
				result = caseOperator(greaterThanOrEqual);
			if (result == null)
				result = caseTerm(greaterThanOrEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Int Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiniteIntRange(FiniteIntRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Int Range Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Int Range Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiniteIntRangeConstant(FiniteIntRangeConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Int Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Int Range Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiniteIntRangeOperator(FiniteIntRangeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqual(LessThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
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

} //FiniteIntRangesSwitch
