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
package fr.lip6.move.pnml.symmetricnet.partitions.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.partitions.LessThan;
import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionOperator;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.partitions.PartitionsPackage
 * @generated
 */
public class PartitionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PartitionsValidator INSTANCE = new PartitionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.symmetricnet.partitions";

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
	public PartitionsValidator() {
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
		return PartitionsPackage.eINSTANCE;
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
		case PartitionsPackage.PARTITION:
			return validatePartition((Partition) value, diagnostics, context);
		case PartitionsPackage.PARTITION_ELEMENT:
			return validatePartitionElement((PartitionElement) value, diagnostics, context);
		case PartitionsPackage.GREATER_THAN:
			return validateGreaterThan((GreaterThan) value, diagnostics, context);
		case PartitionsPackage.PARTITION_ELEMENT_OF:
			return validatePartitionElementOf((PartitionElementOf) value, diagnostics, context);
		case PartitionsPackage.PARTITION_OPERATOR:
			return validatePartitionOperator((PartitionOperator) value, diagnostics, context);
		case PartitionsPackage.LESS_THAN:
			return validateLessThan((LessThan) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionElement(PartitionElement partitionElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partitionElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(partitionElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePartitionElement_constantsType(partitionElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the constantsType constraint of '<em>Partition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionElement_constantsType(PartitionElement partitionElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "constantsType", getObjectLabel(partitionElement, context) },
						new Object[] { partitionElement }, context));
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
			result &= validateGreaterThan_inputOutputTypes(greaterThan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_inputOutputTypes(GreaterThan greaterThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(greaterThan, context) },
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
	public boolean validatePartitionElementOf(PartitionElementOf partitionElementOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partitionElementOf, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(partitionElementOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePartitionElementOf_inputOutputTypes(partitionElementOf, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Partition Element Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionElementOf_inputOutputTypes(PartitionElementOf partitionElementOf,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(partitionElementOf, context) },
						new Object[] { partitionElementOf }, context));
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
	public boolean validatePartitionOperator(PartitionOperator partitionOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partitionOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(partitionOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(partitionOperator, diagnostics, context);
		return result;
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
			result &= validateLessThan_inputOutputTypes(lessThan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_inputOutputTypes(LessThan lessThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(lessThan, context) },
						new Object[] { lessThan }, context));
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

} //PartitionsValidator
