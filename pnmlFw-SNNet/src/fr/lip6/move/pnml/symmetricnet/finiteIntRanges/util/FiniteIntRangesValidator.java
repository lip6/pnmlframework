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
package fr.lip6.move.pnml.symmetricnet.finiteIntRanges.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeOperator;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage
 * @generated
 */
public class FiniteIntRangesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FiniteIntRangesValidator INSTANCE = new FiniteIntRangesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.symmetricnet.finiteIntRanges";

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
	public FiniteIntRangesValidator() {
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
		return FiniteIntRangesPackage.eINSTANCE;
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
		case FiniteIntRangesPackage.FINITE_INT_RANGE:
			return validateFiniteIntRange((FiniteIntRange) value, diagnostics, context);
		case FiniteIntRangesPackage.FINITE_INT_RANGE_CONSTANT:
			return validateFiniteIntRangeConstant((FiniteIntRangeConstant) value, diagnostics, context);
		case FiniteIntRangesPackage.LESS_THAN:
			return validateLessThan((LessThan) value, diagnostics, context);
		case FiniteIntRangesPackage.FINITE_INT_RANGE_OPERATOR:
			return validateFiniteIntRangeOperator((FiniteIntRangeOperator) value, diagnostics, context);
		case FiniteIntRangesPackage.GREATER_THAN:
			return validateGreaterThan((GreaterThan) value, diagnostics, context);
		case FiniteIntRangesPackage.LESS_THAN_OR_EQUAL:
			return validateLessThanOrEqual((LessThanOrEqual) value, diagnostics, context);
		case FiniteIntRangesPackage.GREATER_THAN_OR_EQUAL:
			return validateGreaterThanOrEqual((GreaterThanOrEqual) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiniteIntRange(FiniteIntRange finiteIntRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finiteIntRange, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(finiteIntRange, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFiniteIntRange_range(finiteIntRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the range constraint of '<em>Finite Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiniteIntRange_range(FiniteIntRange finiteIntRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "range", getObjectLabel(finiteIntRange, context) },
						new Object[] { finiteIntRange }, context));
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
	public boolean validateFiniteIntRangeConstant(FiniteIntRangeConstant finiteIntRangeConstant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finiteIntRangeConstant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(finiteIntRangeConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(finiteIntRangeConstant, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateFiniteIntRangeConstant_InputRange(finiteIntRangeConstant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputRange constraint of '<em>Finite Int Range Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiniteIntRangeConstant_InputRange(FiniteIntRangeConstant finiteIntRangeConstant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "InputRange", getObjectLabel(finiteIntRangeConstant, context) },
						new Object[] { finiteIntRangeConstant }, context));
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
			result &= validateFiniteIntRangeOperator_InputOutputTypes(lessThan, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiniteIntRangeOperator(FiniteIntRangeOperator finiteIntRangeOperator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finiteIntRangeOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(finiteIntRangeOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(finiteIntRangeOperator, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateFiniteIntRangeOperator_InputOutputTypes(finiteIntRangeOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputOutputTypes constraint of '<em>Finite Int Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiniteIntRangeOperator_InputOutputTypes(FiniteIntRangeOperator finiteIntRangeOperator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "InputOutputTypes", getObjectLabel(finiteIntRangeOperator, context) },
						new Object[] { finiteIntRangeOperator }, context));
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
			result &= validateFiniteIntRangeOperator_InputOutputTypes(greaterThan, diagnostics, context);
		return result;
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
			result &= validateFiniteIntRangeOperator_InputOutputTypes(lessThanOrEqual, diagnostics, context);
		return result;
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
			result &= validateFiniteIntRangeOperator_InputOutputTypes(greaterThanOrEqual, diagnostics, context);
		return result;
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

} //FiniteIntRangesValidator
