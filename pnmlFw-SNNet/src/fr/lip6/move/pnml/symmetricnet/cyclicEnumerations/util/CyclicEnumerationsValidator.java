/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumOperator;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsPackage;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsPackage
 * @generated
 */
public class CyclicEnumerationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CyclicEnumerationsValidator INSTANCE = new CyclicEnumerationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.symmetricnet.cyclicEnumerations";

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
	public CyclicEnumerationsValidator() {
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
		return CyclicEnumerationsPackage.eINSTANCE;
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
		case CyclicEnumerationsPackage.CYCLIC_ENUM_OPERATOR:
			return validateCyclicEnumOperator((CyclicEnumOperator) value, diagnostics, context);
		case CyclicEnumerationsPackage.CYCLIC_ENUMERATION:
			return validateCyclicEnumeration((CyclicEnumeration) value, diagnostics, context);
		case CyclicEnumerationsPackage.SUCCESSOR:
			return validateSuccessor((Successor) value, diagnostics, context);
		case CyclicEnumerationsPackage.PREDECESSOR:
			return validatePredecessor((Predecessor) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCyclicEnumOperator(CyclicEnumOperator cyclicEnumOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cyclicEnumOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(cyclicEnumOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCyclicEnumOperator_inputOutputTypes(cyclicEnumOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Cyclic Enum Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCyclicEnumOperator_inputOutputTypes(CyclicEnumOperator cyclicEnumOperator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(cyclicEnumOperator, context) },
						new Object[] { cyclicEnumOperator }, context));
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
	public boolean validateCyclicEnumeration(CyclicEnumeration cyclicEnumeration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cyclicEnumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuccessor(Successor successor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(successor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(successor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCyclicEnumOperator_inputOutputTypes(successor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredecessor(Predecessor predecessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(predecessor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(predecessor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCyclicEnumOperator_inputOutputTypes(predecessor, diagnostics, context);
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

} //CyclicEnumerationsValidator
