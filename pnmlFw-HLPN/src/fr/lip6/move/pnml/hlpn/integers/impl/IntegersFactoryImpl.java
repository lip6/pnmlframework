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
package fr.lip6.move.pnml.hlpn.integers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.hlpn.integers.Addition;
import fr.lip6.move.pnml.hlpn.integers.Division;
import fr.lip6.move.pnml.hlpn.integers.GreaterThan;
import fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.integers.HLInteger;
import fr.lip6.move.pnml.hlpn.integers.IntegersFactory;
import fr.lip6.move.pnml.hlpn.integers.IntegersPackage;
import fr.lip6.move.pnml.hlpn.integers.LessThan;
import fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual;
import fr.lip6.move.pnml.hlpn.integers.Modulo;
import fr.lip6.move.pnml.hlpn.integers.Multiplication;
import fr.lip6.move.pnml.hlpn.integers.Natural;
import fr.lip6.move.pnml.hlpn.integers.NumberConstant;
import fr.lip6.move.pnml.hlpn.integers.Positive;
import fr.lip6.move.pnml.hlpn.integers.Subtraction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegersFactoryImpl extends EFactoryImpl implements IntegersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegersFactory init() {
		try {
			IntegersFactory theIntegersFactory = (IntegersFactory) EPackage.Registry.INSTANCE
					.getEFactory(IntegersPackage.eNS_URI);
			if (theIntegersFactory != null) {
				return theIntegersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersFactoryImpl() {
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
		case IntegersPackage.NATURAL:
			return createNatural();
		case IntegersPackage.POSITIVE:
			return createPositive();
		case IntegersPackage.HL_INTEGER:
			return createHLInteger();
		case IntegersPackage.NUMBER_CONSTANT:
			return createNumberConstant();
		case IntegersPackage.ADDITION:
			return createAddition();
		case IntegersPackage.SUBTRACTION:
			return createSubtraction();
		case IntegersPackage.MULTIPLICATION:
			return createMultiplication();
		case IntegersPackage.DIVISION:
			return createDivision();
		case IntegersPackage.MODULO:
			return createModulo();
		case IntegersPackage.GREATER_THAN:
			return createGreaterThan();
		case IntegersPackage.GREATER_THAN_OR_EQUAL:
			return createGreaterThanOrEqual();
		case IntegersPackage.LESS_THAN:
			return createLessThan();
		case IntegersPackage.LESS_THAN_OR_EQUAL:
			return createLessThanOrEqual();
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
	public Natural createNatural() {
		NaturalImpl natural = new NaturalImpl();
		return natural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Positive createPositive() {
		PositiveImpl positive = new PositiveImpl();
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLInteger createHLInteger() {
		HLIntegerImpl hlInteger = new HLIntegerImpl();
		return hlInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberConstant createNumberConstant() {
		NumberConstantImpl numberConstant = new NumberConstantImpl();
		return numberConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
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
	public GreaterThanOrEqual createGreaterThanOrEqual() {
		GreaterThanOrEqualImpl greaterThanOrEqual = new GreaterThanOrEqualImpl();
		return greaterThanOrEqual;
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
	public LessThanOrEqual createLessThanOrEqual() {
		LessThanOrEqualImpl lessThanOrEqual = new LessThanOrEqualImpl();
		return lessThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegersPackage getIntegersPackage() {
		return (IntegersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntegersPackage getPackage() {
		return IntegersPackage.eINSTANCE;
	}

} //IntegersFactoryImpl
