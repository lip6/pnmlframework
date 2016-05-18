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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeOperator;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.terms.BuiltInConstant;
import fr.lip6.move.pnml.symmetricnet.terms.BuiltInOperator;
import fr.lip6.move.pnml.symmetricnet.terms.BuiltInSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage
 * @generated
 */
public class FiniteIntRangesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiniteIntRangesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteIntRangesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FiniteIntRangesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteIntRangesSwitch<Adapter> modelSwitch = new FiniteIntRangesSwitch<Adapter>() {
		@Override
		public Adapter caseFiniteIntRange(FiniteIntRange object) {
			return createFiniteIntRangeAdapter();
		}

		@Override
		public Adapter caseFiniteIntRangeConstant(FiniteIntRangeConstant object) {
			return createFiniteIntRangeConstantAdapter();
		}

		@Override
		public Adapter caseLessThan(LessThan object) {
			return createLessThanAdapter();
		}

		@Override
		public Adapter caseFiniteIntRangeOperator(FiniteIntRangeOperator object) {
			return createFiniteIntRangeOperatorAdapter();
		}

		@Override
		public Adapter caseGreaterThan(GreaterThan object) {
			return createGreaterThanAdapter();
		}

		@Override
		public Adapter caseLessThanOrEqual(LessThanOrEqual object) {
			return createLessThanOrEqualAdapter();
		}

		@Override
		public Adapter caseGreaterThanOrEqual(GreaterThanOrEqual object) {
			return createGreaterThanOrEqualAdapter();
		}

		@Override
		public Adapter caseSort(Sort object) {
			return createSortAdapter();
		}

		@Override
		public Adapter caseBuiltInSort(BuiltInSort object) {
			return createBuiltInSortAdapter();
		}

		@Override
		public Adapter caseTerm(Term object) {
			return createTermAdapter();
		}

		@Override
		public Adapter caseOperator(Operator object) {
			return createOperatorAdapter();
		}

		@Override
		public Adapter caseBuiltInConstant(BuiltInConstant object) {
			return createBuiltInConstantAdapter();
		}

		@Override
		public Adapter caseBuiltInOperator(BuiltInOperator object) {
			return createBuiltInOperatorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange <em>Finite Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange
	 * @generated
	 */
	public Adapter createFiniteIntRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant <em>Finite Int Range Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant
	 * @generated
	 */
	public Adapter createFiniteIntRangeConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeOperator <em>Finite Int Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeOperator
	 * @generated
	 */
	public Adapter createFiniteIntRangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual
	 * @generated
	 */
	public Adapter createLessThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual
	 * @generated
	 */
	public Adapter createGreaterThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.terms.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.terms.BuiltInSort <em>Built In Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.BuiltInSort
	 * @generated
	 */
	public Adapter createBuiltInSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.terms.BuiltInConstant <em>Built In Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.BuiltInConstant
	 * @generated
	 */
	public Adapter createBuiltInConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.terms.BuiltInOperator <em>Built In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.terms.BuiltInOperator
	 * @generated
	 */
	public Adapter createBuiltInOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FiniteIntRangesAdapterFactory
