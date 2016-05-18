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
package fr.lip6.move.pnml.symmetricnet.multisets.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.symmetricnet.multisets.Add;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Cardinality;
import fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf;
import fr.lip6.move.pnml.symmetricnet.multisets.Contains;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.MultisetsPackage;
import fr.lip6.move.pnml.symmetricnet.multisets.NumberOf;
import fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct;
import fr.lip6.move.pnml.symmetricnet.multisets.Subtract;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.multisets.MultisetsPackage
 * @generated
 */
public class MultisetsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MultisetsValidator INSTANCE = new MultisetsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.symmetricnet.multisets";

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
	public MultisetsValidator() {
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
		return MultisetsPackage.eINSTANCE;
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
		case MultisetsPackage.CARDINALITY:
			return validateCardinality((Cardinality) value, diagnostics, context);
		case MultisetsPackage.CONTAINS:
			return validateContains((Contains) value, diagnostics, context);
		case MultisetsPackage.CARDINALITY_OF:
			return validateCardinalityOf((CardinalityOf) value, diagnostics, context);
		case MultisetsPackage.ADD:
			return validateAdd((Add) value, diagnostics, context);
		case MultisetsPackage.ALL:
			return validateAll((All) value, diagnostics, context);
		case MultisetsPackage.EMPTY:
			return validateEmpty((Empty) value, diagnostics, context);
		case MultisetsPackage.NUMBER_OF:
			return validateNumberOf((NumberOf) value, diagnostics, context);
		case MultisetsPackage.SUBTRACT:
			return validateSubtract((Subtract) value, diagnostics, context);
		case MultisetsPackage.SCALAR_PRODUCT:
			return validateScalarProduct((ScalarProduct) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardinality, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(cardinality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCardinality_inputOutputTypes(cardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality_inputOutputTypes(Cardinality cardinality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(cardinality, context) },
						new Object[] { cardinality }, context));
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
	public boolean validateContains(Contains contains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contains, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(contains, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContains_inputOutputTypes(contains, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContains_inputOutputTypes(Contains contains, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(contains, context) },
						new Object[] { contains }, context));
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
	public boolean validateCardinalityOf(CardinalityOf cardinalityOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardinalityOf, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(cardinalityOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCardinalityOf_inputOutputTypes(cardinalityOf, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Cardinality Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityOf_inputOutputTypes(CardinalityOf cardinalityOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(cardinalityOf, context) },
						new Object[] { cardinalityOf }, context));
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
	public boolean validateAdd(Add add, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(add, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(add, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdd_inputType(add, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputType constraint of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdd_inputType(Add add, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "inputType", getObjectLabel(add, context) },
						new Object[] { add }, context));
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
	public boolean validateAll(All all, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(all, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(all, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAll_inputOutputTypes(all, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAll_inputOutputTypes(All all, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(all, context) }, new Object[] { all },
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
	public boolean validateEmpty(Empty empty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(empty, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(empty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmpty_InputSize(empty, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSize constraint of '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmpty_InputSize(Empty empty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "InputSize", getObjectLabel(empty, context) }, new Object[] { empty }, context));
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
	public boolean validateNumberOf(NumberOf numberOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberOf, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(numberOf, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNumberOf_inputOutputTypes(numberOf, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Number Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOf_inputOutputTypes(NumberOf numberOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(numberOf, context) },
						new Object[] { numberOf }, context));
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
	public boolean validateSubtract(Subtract subtract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subtract, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(subtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubtract_inputType(subtract, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputType constraint of '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtract_inputType(Subtract subtract, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputType", getObjectLabel(subtract, context) }, new Object[] { subtract },
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
	public boolean validateScalarProduct(ScalarProduct scalarProduct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scalarProduct, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= termsValidator.validateOperator_sameOperatorNTermSort(scalarProduct, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScalarProduct_inputOutputTypes(scalarProduct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputOutputTypes constraint of '<em>Scalar Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalarProduct_inputOutputTypes(ScalarProduct scalarProduct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "inputOutputTypes", getObjectLabel(scalarProduct, context) },
						new Object[] { scalarProduct }, context));
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

} //MultisetsValidator
