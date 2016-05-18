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
package fr.lip6.move.pnml.pthlpng.partitions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.pthlpng.partitions.GreaterThan;
import fr.lip6.move.pnml.pthlpng.partitions.LessThan;
import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionOperator;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionsPackage;
import fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.OperatorDecl;
import fr.lip6.move.pnml.pthlpng.terms.SortDecl;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.pthlpng.partitions.PartitionsPackage
 * @generated
 */
public class PartitionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartitionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PartitionsPackage.eINSTANCE;
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
	protected PartitionsSwitch<Adapter> modelSwitch = new PartitionsSwitch<Adapter>() {
		@Override
		public Adapter casePartition(Partition object) {
			return createPartitionAdapter();
		}

		@Override
		public Adapter casePartitionElement(PartitionElement object) {
			return createPartitionElementAdapter();
		}

		@Override
		public Adapter caseGreaterThan(GreaterThan object) {
			return createGreaterThanAdapter();
		}

		@Override
		public Adapter casePartitionElementOf(PartitionElementOf object) {
			return createPartitionElementOfAdapter();
		}

		@Override
		public Adapter casePartitionOperator(PartitionOperator object) {
			return createPartitionOperatorAdapter();
		}

		@Override
		public Adapter caseLessThan(LessThan object) {
			return createLessThanAdapter();
		}

		@Override
		public Adapter caseTermsDeclaration(TermsDeclaration object) {
			return createTermsDeclarationAdapter();
		}

		@Override
		public Adapter caseSortDecl(SortDecl object) {
			return createSortDeclAdapter();
		}

		@Override
		public Adapter caseOperatorDecl(OperatorDecl object) {
			return createOperatorDeclAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.partitions.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.partitions.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.partitions.PartitionElement <em>Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.partitions.PartitionElement
	 * @generated
	 */
	public Adapter createPartitionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.partitions.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.partitions.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf <em>Partition Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf
	 * @generated
	 */
	public Adapter createPartitionElementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.partitions.PartitionOperator <em>Partition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.partitions.PartitionOperator
	 * @generated
	 */
	public Adapter createPartitionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.partitions.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.partitions.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration
	 * @generated
	 */
	public Adapter createTermsDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.terms.SortDecl <em>Sort Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.terms.SortDecl
	 * @generated
	 */
	public Adapter createSortDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.terms.OperatorDecl <em>Operator Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.terms.OperatorDecl
	 * @generated
	 */
	public Adapter createOperatorDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.terms.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator <em>Built In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.pthlpng.terms.BuiltInOperator
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

} //PartitionsAdapterFactory
