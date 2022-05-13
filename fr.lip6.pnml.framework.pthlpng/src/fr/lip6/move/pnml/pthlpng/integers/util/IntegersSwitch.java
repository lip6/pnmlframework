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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
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
package fr.lip6.move.pnml.pthlpng.integers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.lip6.move.pnml.pthlpng.integers.Addition;
import fr.lip6.move.pnml.pthlpng.integers.Division;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThan;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual;
import fr.lip6.move.pnml.pthlpng.integers.HLInteger;
import fr.lip6.move.pnml.pthlpng.integers.HLPNNumber;
import fr.lip6.move.pnml.pthlpng.integers.IntegerOperator;
import fr.lip6.move.pnml.pthlpng.integers.IntegersPackage;
import fr.lip6.move.pnml.pthlpng.integers.LessThan;
import fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual;
import fr.lip6.move.pnml.pthlpng.integers.Modulo;
import fr.lip6.move.pnml.pthlpng.integers.Multiplication;
import fr.lip6.move.pnml.pthlpng.integers.Natural;
import fr.lip6.move.pnml.pthlpng.integers.NumberConstant;
import fr.lip6.move.pnml.pthlpng.integers.Positive;
import fr.lip6.move.pnml.pthlpng.integers.Subtraction;
import fr.lip6.move.pnml.pthlpng.terms.BuiltInConstant;
import fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator;
import fr.lip6.move.pnml.pthlpng.terms.BuiltInSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see fr.lip6.move.pnml.pthlpng.integers.IntegersPackage
 * @generated
 */
public class IntegersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static IntegersPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public IntegersSwitch() {
		if (modelPackage == null) {
			modelPackage = IntegersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a
	 * non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case IntegersPackage.HLPN_NUMBER: {
			HLPNNumber hlpnNumber = (HLPNNumber) theEObject;
			T result = caseHLPNNumber(hlpnNumber);
			if (result == null)
				result = caseBuiltInSort(hlpnNumber);
			if (result == null)
				result = caseSort(hlpnNumber);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.NATURAL: {
			Natural natural = (Natural) theEObject;
			T result = caseNatural(natural);
			if (result == null)
				result = caseHLPNNumber(natural);
			if (result == null)
				result = caseBuiltInSort(natural);
			if (result == null)
				result = caseSort(natural);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.POSITIVE: {
			Positive positive = (Positive) theEObject;
			T result = casePositive(positive);
			if (result == null)
				result = caseHLPNNumber(positive);
			if (result == null)
				result = caseBuiltInSort(positive);
			if (result == null)
				result = caseSort(positive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.HL_INTEGER: {
			HLInteger hlInteger = (HLInteger) theEObject;
			T result = caseHLInteger(hlInteger);
			if (result == null)
				result = caseHLPNNumber(hlInteger);
			if (result == null)
				result = caseBuiltInSort(hlInteger);
			if (result == null)
				result = caseSort(hlInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.NUMBER_CONSTANT: {
			NumberConstant numberConstant = (NumberConstant) theEObject;
			T result = caseNumberConstant(numberConstant);
			if (result == null)
				result = caseBuiltInConstant(numberConstant);
			if (result == null)
				result = caseOperator(numberConstant);
			if (result == null)
				result = caseTerm(numberConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.INTEGER_OPERATOR: {
			IntegerOperator integerOperator = (IntegerOperator) theEObject;
			T result = caseIntegerOperator(integerOperator);
			if (result == null)
				result = caseBuiltInOperator(integerOperator);
			if (result == null)
				result = caseOperator(integerOperator);
			if (result == null)
				result = caseTerm(integerOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseIntegerOperator(addition);
			if (result == null)
				result = caseBuiltInOperator(addition);
			if (result == null)
				result = caseOperator(addition);
			if (result == null)
				result = caseTerm(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.SUBTRACTION: {
			Subtraction subtraction = (Subtraction) theEObject;
			T result = caseSubtraction(subtraction);
			if (result == null)
				result = caseIntegerOperator(subtraction);
			if (result == null)
				result = caseBuiltInOperator(subtraction);
			if (result == null)
				result = caseOperator(subtraction);
			if (result == null)
				result = caseTerm(subtraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseIntegerOperator(multiplication);
			if (result == null)
				result = caseBuiltInOperator(multiplication);
			if (result == null)
				result = caseOperator(multiplication);
			if (result == null)
				result = caseTerm(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseIntegerOperator(division);
			if (result == null)
				result = caseBuiltInOperator(division);
			if (result == null)
				result = caseOperator(division);
			if (result == null)
				result = caseTerm(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.MODULO: {
			Modulo modulo = (Modulo) theEObject;
			T result = caseModulo(modulo);
			if (result == null)
				result = caseIntegerOperator(modulo);
			if (result == null)
				result = caseBuiltInOperator(modulo);
			if (result == null)
				result = caseOperator(modulo);
			if (result == null)
				result = caseTerm(modulo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IntegersPackage.GREATER_THAN: {
			GreaterThan greaterThan = (GreaterThan) theEObject;
			T result = caseGreaterThan(greaterThan);
			if (result == null)
				result = caseIntegerOperator(greaterThan);
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
		case IntegersPackage.GREATER_THAN_OR_EQUAL: {
			GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual) theEObject;
			T result = caseGreaterThanOrEqual(greaterThanOrEqual);
			if (result == null)
				result = caseIntegerOperator(greaterThanOrEqual);
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
		case IntegersPackage.LESS_THAN: {
			LessThan lessThan = (LessThan) theEObject;
			T result = caseLessThan(lessThan);
			if (result == null)
				result = caseIntegerOperator(lessThan);
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
		case IntegersPackage.LESS_THAN_OR_EQUAL: {
			LessThanOrEqual lessThanOrEqual = (LessThanOrEqual) theEObject;
			T result = caseLessThanOrEqual(lessThanOrEqual);
			if (result == null)
				result = caseIntegerOperator(lessThanOrEqual);
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
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLPN
	 * Number</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLPN
	 *         Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLPNNumber(HLPNNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Natural</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatural(Natural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Positive</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Positive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositive(Positive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HL
	 * Integer</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HL
	 *         Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLInteger(HLInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number
	 * Constant</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number
	 *         Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberConstant(NumberConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer
	 * Operator</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer
	 *         Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerOperator(IntegerOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Addition</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Subtraction</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtraction(Subtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Multiplication</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Division</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Modulo</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater
	 * Than</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater
	 *         Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater
	 * Than Or Equal</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater
	 *         Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less
	 * Than</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less
	 *         Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less
	 * Than Or Equal</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less
	 *         Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqual(LessThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Sort</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In
	 * Sort</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In
	 *         Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInSort(BuiltInSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Term</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Operator</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In
	 * Constant</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In
	 *         Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInConstant(BuiltInConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In
	 * Operator</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In
	 *         Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInOperator(BuiltInOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last
	 * case anyway. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // IntegersSwitch
