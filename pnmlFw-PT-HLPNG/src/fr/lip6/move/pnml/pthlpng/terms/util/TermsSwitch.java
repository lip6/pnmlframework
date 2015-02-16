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
package fr.lip6.move.pnml.pthlpng.terms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage
 * @generated
 */
public class TermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsSwitch() {
		if (modelPackage == null) {
			modelPackage = TermsPackage.eINSTANCE;
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
		case TermsPackage.DECLARATIONS: {
			Declarations declarations = (Declarations) theEObject;
			T result = caseDeclarations(declarations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.TERMS_DECLARATION: {
			TermsDeclaration termsDeclaration = (TermsDeclaration) theEObject;
			T result = caseTermsDeclaration(termsDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.SORT: {
			Sort sort = (Sort) theEObject;
			T result = caseSort(sort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.MULTISET_SORT: {
			MultisetSort multisetSort = (MultisetSort) theEObject;
			T result = caseMultisetSort(multisetSort);
			if (result == null)
				result = caseSort(multisetSort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.TERM: {
			Term term = (Term) theEObject;
			T result = caseTerm(term);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.OPERATOR: {
			Operator operator = (Operator) theEObject;
			T result = caseOperator(operator);
			if (result == null)
				result = caseTerm(operator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.VARIABLE_DECL: {
			VariableDecl variableDecl = (VariableDecl) theEObject;
			T result = caseVariableDecl(variableDecl);
			if (result == null)
				result = caseTermsDeclaration(variableDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseTerm(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.BUILT_IN_SORT: {
			BuiltInSort builtInSort = (BuiltInSort) theEObject;
			T result = caseBuiltInSort(builtInSort);
			if (result == null)
				result = caseSort(builtInSort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.PRODUCT_SORT: {
			ProductSort productSort = (ProductSort) theEObject;
			T result = caseProductSort(productSort);
			if (result == null)
				result = caseSort(productSort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.BUILT_IN_CONSTANT: {
			BuiltInConstant builtInConstant = (BuiltInConstant) theEObject;
			T result = caseBuiltInConstant(builtInConstant);
			if (result == null)
				result = caseOperator(builtInConstant);
			if (result == null)
				result = caseTerm(builtInConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.MULTISET_OPERATOR: {
			MultisetOperator multisetOperator = (MultisetOperator) theEObject;
			T result = caseMultisetOperator(multisetOperator);
			if (result == null)
				result = caseOperator(multisetOperator);
			if (result == null)
				result = caseTerm(multisetOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.TUPLE: {
			Tuple tuple = (Tuple) theEObject;
			T result = caseTuple(tuple);
			if (result == null)
				result = caseOperator(tuple);
			if (result == null)
				result = caseTerm(tuple);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.SORT_DECL: {
			SortDecl sortDecl = (SortDecl) theEObject;
			T result = caseSortDecl(sortDecl);
			if (result == null)
				result = caseTermsDeclaration(sortDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.BUILT_IN_OPERATOR: {
			BuiltInOperator builtInOperator = (BuiltInOperator) theEObject;
			T result = caseBuiltInOperator(builtInOperator);
			if (result == null)
				result = caseOperator(builtInOperator);
			if (result == null)
				result = caseTerm(builtInOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.NAMED_SORT: {
			NamedSort namedSort = (NamedSort) theEObject;
			T result = caseNamedSort(namedSort);
			if (result == null)
				result = caseSortDecl(namedSort);
			if (result == null)
				result = caseTermsDeclaration(namedSort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.USER_SORT: {
			UserSort userSort = (UserSort) theEObject;
			T result = caseUserSort(userSort);
			if (result == null)
				result = caseSort(userSort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.OPERATOR_DECL: {
			OperatorDecl operatorDecl = (OperatorDecl) theEObject;
			T result = caseOperatorDecl(operatorDecl);
			if (result == null)
				result = caseTermsDeclaration(operatorDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.NAMED_OPERATOR: {
			NamedOperator namedOperator = (NamedOperator) theEObject;
			T result = caseNamedOperator(namedOperator);
			if (result == null)
				result = caseOperatorDecl(namedOperator);
			if (result == null)
				result = caseTermsDeclaration(namedOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.USER_OPERATOR: {
			UserOperator userOperator = (UserOperator) theEObject;
			T result = caseUserOperator(userOperator);
			if (result == null)
				result = caseOperator(userOperator);
			if (result == null)
				result = caseTerm(userOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarations(Declarations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermsDeclaration(TermsDeclaration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Multiset Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiset Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultisetSort(MultisetSort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDecl(VariableDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Product Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSort(ProductSort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Multiset Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiset Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultisetOperator(MultisetOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuple(Tuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortDecl(SortDecl object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedSort(NamedSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserSort(UserSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorDecl(OperatorDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedOperator(NamedOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserOperator(UserOperator object) {
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

} //TermsSwitch
