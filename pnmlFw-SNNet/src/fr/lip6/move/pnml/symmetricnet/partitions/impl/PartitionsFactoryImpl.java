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
package fr.lip6.move.pnml.symmetricnet.partitions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.partitions.LessThan;
import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsFactory;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitionsFactoryImpl extends EFactoryImpl implements PartitionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartitionsFactory init() {
		try {
			PartitionsFactory thePartitionsFactory = (PartitionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(PartitionsPackage.eNS_URI);
			if (thePartitionsFactory != null) {
				return thePartitionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartitionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PartitionsPackage.PARTITION:
			return createPartition();
		case PartitionsPackage.PARTITION_ELEMENT:
			return createPartitionElement();
		case PartitionsPackage.GREATER_THAN:
			return createGreaterThan();
		case PartitionsPackage.PARTITION_ELEMENT_OF:
			return createPartitionElementOf();
		case PartitionsPackage.LESS_THAN:
			return createLessThan();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartitionElement createPartitionElement() {
		PartitionElementImpl partitionElement = new PartitionElementImpl();
		return partitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartitionElementOf createPartitionElementOf() {
		PartitionElementOfImpl partitionElementOf = new PartitionElementOfImpl();
		return partitionElementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartitionsPackage getPartitionsPackage() {
		return (PartitionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartitionsPackage getPackage() {
		return PartitionsPackage.eINSTANCE;
	}

} //PartitionsFactoryImpl
