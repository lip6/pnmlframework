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
package fr.lip6.move.pnml.pthlpng.booleans.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.pthlpng.booleans.And;
import fr.lip6.move.pnml.pthlpng.booleans.Bool;
import fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant;
import fr.lip6.move.pnml.pthlpng.booleans.BooleanOperator;
import fr.lip6.move.pnml.pthlpng.booleans.BooleansPackage;
import fr.lip6.move.pnml.pthlpng.booleans.Equality;
import fr.lip6.move.pnml.pthlpng.booleans.Imply;
import fr.lip6.move.pnml.pthlpng.booleans.Inequality;
import fr.lip6.move.pnml.pthlpng.booleans.Not;
import fr.lip6.move.pnml.pthlpng.booleans.Or;
import fr.lip6.move.pnml.pthlpng.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see fr.lip6.move.pnml.pthlpng.booleans.BooleansPackage
 * @generated
 */
public class BooleansValidator extends EObjectValidator {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final BooleansValidator INSTANCE = new BooleansValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource()
	 * source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode()
	 * codes} from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.pthlpng.booleans";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected TermsValidator termsValidator;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public BooleansValidator() {
		super();
		termsValidator = TermsValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return BooleansPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case BooleansPackage.EQUALITY:
			return validateEquality((Equality) value, diagnostics, context);
		case BooleansPackage.INEQUALITY:
			return validateInequality((Inequality) value, diagnostics, context);
		case BooleansPackage.BOOLEAN_CONSTANT:
			return validateBooleanConstant((BooleanConstant) value, diagnostics, context);
		case BooleansPackage.OR:
			return validateOr((Or) value, diagnostics, context);
		case BooleansPackage.BOOLEAN_OPERATOR:
			return validateBooleanOperator((BooleanOperator) value, diagnostics, context);
		case BooleansPackage.AND:
			return validateAnd((And) value, diagnostics, context);
		case BooleansPackage.IMPLY:
			return validateImply((Imply) value, diagnostics, context);
		case BooleansPackage.NOT:
			return validateNot((Not) value, diagnostics, context);
		case BooleansPackage.BOOL:
			return validateBool((Bool) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEquality(Equality equality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equality, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEquality_inputOutputTypes(equality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Equality</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEquality_inputOutputTypes(Equality equality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "inputOutputTypes", getObjectLabel(equality, context) },
								new Object[] { equality }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInequality(Inequality inequality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inequality, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(inequality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInequality_inputOutputTypes(inequality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Inequality</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInequality_inputOutputTypes(Inequality inequality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "inputOutputTypes", getObjectLabel(inequality, context) },
								new Object[] { inequality }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBooleanConstant(BooleanConstant booleanConstant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanConstant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(booleanConstant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(or, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_inputOutputTypes(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOr_InputSize(or, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSize constraint of '<em>Or</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOr_InputSize(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "InputSize", getObjectLabel(or, context) },
						new Object[] { or }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBooleanOperator(BooleanOperator booleanOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_inputOutputTypes(booleanOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBooleanOperator_inputOutputTypes(BooleanOperator booleanOperator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "inputOutputTypes", getObjectLabel(booleanOperator, context) },
								new Object[] { booleanOperator }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(and, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_inputOutputTypes(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAnd_InputSize(and, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSize constraint of '<em>And</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAnd_InputSize(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "InputSize", getObjectLabel(and, context) },
						new Object[] { and }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateImply(Imply imply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imply, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_inputOutputTypes(imply, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImply_InputSize(imply, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSize constraint of '<em>Imply</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateImply_InputSize(Imply imply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "InputSize", getObjectLabel(imply, context) }, new Object[] { imply }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(not, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_inputOutputTypes(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNot_InputSize(not, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSize constraint of '<em>Not</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNot_InputSize(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "InputSize", getObjectLabel(not, context) },
						new Object[] { not }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBool(Bool bool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bool, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this
		// validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // BooleansValidator
