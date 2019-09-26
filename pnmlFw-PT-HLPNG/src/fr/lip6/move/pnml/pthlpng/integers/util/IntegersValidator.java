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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
import fr.lip6.move.pnml.pthlpng.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.pthlpng.integers.IntegersPackage
 * @generated
 */
public class IntegersValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IntegersValidator INSTANCE = new IntegersValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.pthlpng.integers";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermsValidator termsValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersValidator() {
		super();
		termsValidator = TermsValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return IntegersPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case IntegersPackage.HLPN_NUMBER:
			return validateHLPNNumber((HLPNNumber) value, diagnostics, context);
		case IntegersPackage.NATURAL:
			return validateNatural((Natural) value, diagnostics, context);
		case IntegersPackage.POSITIVE:
			return validatePositive((Positive) value, diagnostics, context);
		case IntegersPackage.HL_INTEGER:
			return validateHLInteger((HLInteger) value, diagnostics, context);
		case IntegersPackage.NUMBER_CONSTANT:
			return validateNumberConstant((NumberConstant) value, diagnostics, context);
		case IntegersPackage.INTEGER_OPERATOR:
			return validateIntegerOperator((IntegerOperator) value, diagnostics, context);
		case IntegersPackage.ADDITION:
			return validateAddition((Addition) value, diagnostics, context);
		case IntegersPackage.SUBTRACTION:
			return validateSubtraction((Subtraction) value, diagnostics, context);
		case IntegersPackage.MULTIPLICATION:
			return validateMultiplication((Multiplication) value, diagnostics, context);
		case IntegersPackage.DIVISION:
			return validateDivision((Division) value, diagnostics, context);
		case IntegersPackage.MODULO:
			return validateModulo((Modulo) value, diagnostics, context);
		case IntegersPackage.GREATER_THAN:
			return validateGreaterThan((GreaterThan) value, diagnostics, context);
		case IntegersPackage.GREATER_THAN_OR_EQUAL:
			return validateGreaterThanOrEqual((GreaterThanOrEqual) value, diagnostics, context);
		case IntegersPackage.LESS_THAN:
			return validateLessThan((LessThan) value, diagnostics, context);
		case IntegersPackage.LESS_THAN_OR_EQUAL:
			return validateLessThanOrEqual((LessThanOrEqual) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHLPNNumber(HLPNNumber hlpnNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hlpnNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNatural(Natural natural, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(natural, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositive(Positive positive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHLInteger(HLInteger hlInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hlInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberConstant(NumberConstant numberConstant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberConstant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(numberConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNumberConstant_typeType(numberConstant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeType constraint of '<em>Number Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberConstant_typeType(NumberConstant numberConstant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "typeType", getObjectLabel(numberConstant, context) },
						new Object[] { numberConstant }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOperator(IntegerOperator integerOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(integerOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputType constraint of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOperator_inputType(IntegerOperator integerOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputType", getObjectLabel(integerOperator, context) },
						new Object[] { integerOperator }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddition(Addition addition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAddition_outputType(addition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddition_outputType(Addition addition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(addition, context) }, new Object[] { addition },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtraction(Subtraction subtraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subtraction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(subtraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubtraction_outputType(subtraction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtraction_outputType(Subtraction subtraction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(subtraction, context) },
						new Object[] { subtraction }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplication(Multiplication multiplication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiplication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(multiplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMultiplication_outputType(multiplication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplication_outputType(Multiplication multiplication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(multiplication, context) },
						new Object[] { multiplication }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivision(Division division, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(division, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(division, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDivision_outputType(division, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivision_outputType(Division division, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(division, context) }, new Object[] { division },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulo(Modulo modulo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modulo, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(modulo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModulo_outputType(modulo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulo_outputType(Modulo modulo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "outputType",
								getObjectLabel(modulo, context) }, new Object[] { modulo }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(greaterThan, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGreaterThan_outputType(greaterThan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_outputType(GreaterThan greaterThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(greaterThan, context) },
						new Object[] { greaterThan }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThanOrEqual(GreaterThanOrEqual greaterThanOrEqual, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(greaterThanOrEqual, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGreaterThanOrEqual_outputType(greaterThanOrEqual, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThanOrEqual_outputType(GreaterThanOrEqual greaterThanOrEqual,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(greaterThanOrEqual, context) },
						new Object[] { greaterThanOrEqual }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lessThan, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLessThan_outputType(lessThan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_outputType(LessThan lessThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(lessThan, context) }, new Object[] { lessThan },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThanOrEqual(LessThanOrEqual lessThanOrEqual, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lessThanOrEqual, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_inputType(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLessThanOrEqual_outputType(lessThanOrEqual, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputType constraint of '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThanOrEqual_outputType(LessThanOrEqual lessThanOrEqual, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "outputType", getObjectLabel(lessThanOrEqual, context) },
						new Object[] { lessThanOrEqual }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //IntegersValidator
