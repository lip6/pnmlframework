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
package fr.lip6.move.pnml.pthlpng.terms.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.pthlpng.terms.BuiltInConstant;
import fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator;
import fr.lip6.move.pnml.pthlpng.terms.BuiltInSort;
import fr.lip6.move.pnml.pthlpng.terms.Declarations;
import fr.lip6.move.pnml.pthlpng.terms.MultisetOperator;
import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.OperatorDecl;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.SortDecl;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration;
import fr.lip6.move.pnml.pthlpng.terms.TermsPackage;
import fr.lip6.move.pnml.pthlpng.terms.Tuple;
import fr.lip6.move.pnml.pthlpng.terms.UserOperator;
import fr.lip6.move.pnml.pthlpng.terms.UserSort;
import fr.lip6.move.pnml.pthlpng.terms.Variable;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage
 * @generated
 */
public class TermsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TermsValidator INSTANCE = new TermsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.pthlpng.terms";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TermsPackage.eINSTANCE;
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
		case TermsPackage.DECLARATIONS:
			return validateDeclarations((Declarations) value, diagnostics, context);
		case TermsPackage.TERMS_DECLARATION:
			return validateTermsDeclaration((TermsDeclaration) value, diagnostics, context);
		case TermsPackage.SORT:
			return validateSort((Sort) value, diagnostics, context);
		case TermsPackage.MULTISET_SORT:
			return validateMultisetSort((MultisetSort) value, diagnostics, context);
		case TermsPackage.TERM:
			return validateTerm((Term) value, diagnostics, context);
		case TermsPackage.OPERATOR:
			return validateOperator((Operator) value, diagnostics, context);
		case TermsPackage.VARIABLE_DECL:
			return validateVariableDecl((VariableDecl) value, diagnostics, context);
		case TermsPackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case TermsPackage.BUILT_IN_SORT:
			return validateBuiltInSort((BuiltInSort) value, diagnostics, context);
		case TermsPackage.PRODUCT_SORT:
			return validateProductSort((ProductSort) value, diagnostics, context);
		case TermsPackage.BUILT_IN_CONSTANT:
			return validateBuiltInConstant((BuiltInConstant) value, diagnostics, context);
		case TermsPackage.MULTISET_OPERATOR:
			return validateMultisetOperator((MultisetOperator) value, diagnostics, context);
		case TermsPackage.TUPLE:
			return validateTuple((Tuple) value, diagnostics, context);
		case TermsPackage.SORT_DECL:
			return validateSortDecl((SortDecl) value, diagnostics, context);
		case TermsPackage.BUILT_IN_OPERATOR:
			return validateBuiltInOperator((BuiltInOperator) value, diagnostics, context);
		case TermsPackage.NAMED_SORT:
			return validateNamedSort((NamedSort) value, diagnostics, context);
		case TermsPackage.USER_SORT:
			return validateUserSort((UserSort) value, diagnostics, context);
		case TermsPackage.OPERATOR_DECL:
			return validateOperatorDecl((OperatorDecl) value, diagnostics, context);
		case TermsPackage.NAMED_OPERATOR:
			return validateNamedOperator((NamedOperator) value, diagnostics, context);
		case TermsPackage.USER_OPERATOR:
			return validateUserOperator((UserOperator) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclarations(Declarations declarations, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declarations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermsDeclaration(TermsDeclaration termsDeclaration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(termsDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSort(Sort sort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultisetSort(MultisetSort multisetSort, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multisetSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(term, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_sameOperatorNTermSort(operator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameOperatorNTermSort constraint of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator_sameOperatorNTermSort(Operator operator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "sameOperatorNTermSort", getObjectLabel(operator, context) },
						new Object[] { operator }, context));
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
	public boolean validateVariableDecl(VariableDecl variableDecl, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableDecl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInSort(BuiltInSort builtInSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builtInSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductSort(ProductSort productSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInConstant(BuiltInConstant builtInConstant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(builtInConstant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(builtInConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_sameOperatorNTermSort(builtInConstant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultisetOperator(MultisetOperator multisetOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multisetOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(multisetOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_sameOperatorNTermSort(multisetOperator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuple(Tuple tuple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tuple, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tuple, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_sameOperatorNTermSort(tuple, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortDecl(SortDecl sortDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortDecl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInOperator(BuiltInOperator builtInOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(builtInOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(builtInOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_sameOperatorNTermSort(builtInOperator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedSort(NamedSort namedSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedSort, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(namedSort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedSort_refSortNotMultiset(namedSort, diagnostics, context);
		return result;
	}

	/**
	 * Validates the refSortNotMultiset constraint of '<em>Named Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedSort_refSortNotMultiset(NamedSort namedSort, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "refSortNotMultiset", getObjectLabel(namedSort, context) },
						new Object[] { namedSort }, context));
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
	public boolean validateUserSort(UserSort userSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatorDecl(OperatorDecl operatorDecl, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatorDecl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedOperator(NamedOperator namedOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserOperator(UserOperator userOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(userOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_sameOperatorNTermSort(userOperator, diagnostics, context);
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

} //TermsValidator
