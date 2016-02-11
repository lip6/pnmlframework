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
package fr.lip6.move.pnml.hlpn.finiteIntRanges.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl;
import fr.lip6.move.pnml.hlpn.booleans.BooleansPackage;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansPackageImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumerationsPackage;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl;
import fr.lip6.move.pnml.hlpn.dots.DotsPackage;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsPackageImpl;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumerationsPackage;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsPackageImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeOperator;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesFactory;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.util.FiniteIntRangesValidator;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl;
import fr.lip6.move.pnml.hlpn.integers.IntegersPackage;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersPackageImpl;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl;
import fr.lip6.move.pnml.hlpn.multisets.MultisetsPackage;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsPackageImpl;
import fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsPackageImpl;
import fr.lip6.move.pnml.hlpn.strings.StringsPackage;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsPackageImpl;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiniteIntRangesPackageImpl extends EPackageImpl implements FiniteIntRangesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteIntRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteIntRangeConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteIntRangeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanOrEqualEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FiniteIntRangesPackageImpl() {
		super(eNS_URI, FiniteIntRangesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FiniteIntRangesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FiniteIntRangesPackage init() {
		if (isInited)
			return (FiniteIntRangesPackage) EPackage.Registry.INSTANCE.getEPackage(FiniteIntRangesPackage.eNS_URI);

		// Obtain or create and register package
		FiniteIntRangesPackageImpl theFiniteIntRangesPackage = (FiniteIntRangesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FiniteIntRangesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new FiniteIntRangesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArbitrarydeclarationsPackageImpl theArbitrarydeclarationsPackage = (ArbitrarydeclarationsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ArbitrarydeclarationsPackage.eNS_URI) instanceof ArbitrarydeclarationsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ArbitrarydeclarationsPackage.eNS_URI) : ArbitrarydeclarationsPackage.eINSTANCE);
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);
		CyclicEnumerationsPackageImpl theCyclicEnumerationsPackage = (CyclicEnumerationsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CyclicEnumerationsPackage.eNS_URI) instanceof CyclicEnumerationsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CyclicEnumerationsPackage.eNS_URI) : CyclicEnumerationsPackage.eINSTANCE);
		DotsPackageImpl theDotsPackage = (DotsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		FiniteEnumerationsPackageImpl theFiniteEnumerationsPackage = (FiniteEnumerationsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiniteEnumerationsPackage.eNS_URI) instanceof FiniteEnumerationsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FiniteEnumerationsPackage.eNS_URI) : FiniteEnumerationsPackage.eINSTANCE);
		HlcorestructurePackageImpl theHlcorestructurePackage = (HlcorestructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI) instanceof HlcorestructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI) : HlcorestructurePackage.eINSTANCE);
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);
		ListsPackageImpl theListsPackage = (ListsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ListsPackage.eNS_URI) instanceof ListsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ListsPackage.eNS_URI) : ListsPackage.eINSTANCE);
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MultisetsPackage.eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(MultisetsPackage.eNS_URI) : MultisetsPackage.eINSTANCE);
		PartitionsPackageImpl thePartitionsPackage = (PartitionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) instanceof PartitionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) : PartitionsPackage.eINSTANCE);
		StringsPackageImpl theStringsPackage = (StringsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StringsPackage.eNS_URI) instanceof StringsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StringsPackage.eNS_URI) : StringsPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theFiniteIntRangesPackage.createPackageContents();
		theArbitrarydeclarationsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theCyclicEnumerationsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theFiniteEnumerationsPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theIntegersPackage.createPackageContents();
		theListsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		thePartitionsPackage.createPackageContents();
		theStringsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theFiniteIntRangesPackage.initializePackageContents();
		theArbitrarydeclarationsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theCyclicEnumerationsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theFiniteEnumerationsPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();
		theListsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		thePartitionsPackage.initializePackageContents();
		theStringsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theFiniteIntRangesPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return FiniteIntRangesValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theFiniteIntRangesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FiniteIntRangesPackage.eNS_URI, theFiniteIntRangesPackage);
		return theFiniteIntRangesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiniteIntRange() {
		return finiteIntRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiniteIntRange_Start() {
		return (EAttribute) finiteIntRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiniteIntRange_End() {
		return (EAttribute) finiteIntRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFiniteIntRange_ContainerFiniteIntRangeConstant() {
		return (EReference) finiteIntRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiniteIntRangeConstant() {
		return finiteIntRangeConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiniteIntRangeConstant_Value() {
		return (EAttribute) finiteIntRangeConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFiniteIntRangeConstant_Range() {
		return (EReference) finiteIntRangeConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiniteIntRangeOperator() {
		return finiteIntRangeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessThanOrEqual() {
		return lessThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreaterThanOrEqual() {
		return greaterThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FiniteIntRangesFactory getFiniteIntRangesFactory() {
		return (FiniteIntRangesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		finiteIntRangeEClass = createEClass(FINITE_INT_RANGE);
		createEAttribute(finiteIntRangeEClass, FINITE_INT_RANGE__START);
		createEAttribute(finiteIntRangeEClass, FINITE_INT_RANGE__END);
		createEReference(finiteIntRangeEClass, FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT);

		finiteIntRangeConstantEClass = createEClass(FINITE_INT_RANGE_CONSTANT);
		createEAttribute(finiteIntRangeConstantEClass, FINITE_INT_RANGE_CONSTANT__VALUE);
		createEReference(finiteIntRangeConstantEClass, FINITE_INT_RANGE_CONSTANT__RANGE);

		lessThanEClass = createEClass(LESS_THAN);

		finiteIntRangeOperatorEClass = createEClass(FINITE_INT_RANGE_OPERATOR);

		greaterThanEClass = createEClass(GREATER_THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TermsPackage theTermsPackage = (TermsPackage) EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		finiteIntRangeEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		finiteIntRangeConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConstant());
		lessThanEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		finiteIntRangeOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		greaterThanEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(finiteIntRangeEClass, FiniteIntRange.class, "FiniteIntRange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteIntRange_Start(), ecorePackage.getELongObject(), "start", null, 1, 1,
				FiniteIntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFiniteIntRange_End(), ecorePackage.getELongObject(), "end", null, 1, 1, FiniteIntRange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFiniteIntRange_ContainerFiniteIntRangeConstant(), this.getFiniteIntRangeConstant(),
				this.getFiniteIntRangeConstant_Range(), "containerFiniteIntRangeConstant", null, 0, 1,
				FiniteIntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finiteIntRangeConstantEClass, FiniteIntRangeConstant.class, "FiniteIntRangeConstant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteIntRangeConstant_Value(), ecorePackage.getELongObject(), "value", null, 1, 1,
				FiniteIntRangeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFiniteIntRangeConstant_Range(), this.getFiniteIntRange(),
				this.getFiniteIntRange_ContainerFiniteIntRangeConstant(), "range", null, 1, 1,
				FiniteIntRangeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finiteIntRangeOperatorEClass, FiniteIntRangeOperator.class, "FiniteIntRangeOperator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.pnml.org/models/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.pnml.org/models/ToPNML
		createToPNMLAnnotations();
		// http://www.pnml.org/models/HLAPI
		createHLAPIAnnotations();
		// http://www.pnml.org/models/methods/SORT
		createSORTAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.pnml.org/models/OCL";
		addAnnotation(finiteIntRangeEClass, source, new String[] { "range",
				"- \u221e\u00a0< self.start <=  self.end < \u221e" });
		addAnnotation(finiteIntRangeConstantEClass, source, new String[] { "InputRange",
				"self.input->size() = 0 and self.range.start <= self.value <= self.range.end" });
		addAnnotation(
				finiteIntRangeOperatorEClass,
				source,
				new String[] {
						"InputOutputTypes",
						"self.input->size() = 2 and self.input->forAll{c | c.oclIsTypeOf(FiniteIntRange)} and self.output.oclIsTypeOf(booleans::Bool)" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(finiteIntRangeEClass, source, new String[] { "constraints", "range" });
		addAnnotation(finiteIntRangeConstantEClass, source, new String[] { "constraints", "InputRange" });
		addAnnotation(finiteIntRangeOperatorEClass, source, new String[] { "constraints", "InputOutputTypes" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(finiteIntRangeEClass, source, new String[] { "tag", "finiteintrange", "kind", "son" });
		addAnnotation(getFiniteIntRange_Start(), source, new String[] { "tag", "start", "kind", "attribute" });
		addAnnotation(getFiniteIntRange_End(), source, new String[] { "tag", "end", "kind", "attribute" });
		addAnnotation(finiteIntRangeConstantEClass, source, new String[] { "tag", "finiteintrangeconstant", "kind",
				"son" });
		addAnnotation(getFiniteIntRangeConstant_Value(), source, new String[] { "tag", "value", "kind", "attribute" });
		addAnnotation(getFiniteIntRangeConstant_Range(), source, new String[] { "kind", "follow" });
		addAnnotation(lessThanEClass, source, new String[] { "tag", "lessthan", "kind", "son" });
		addAnnotation(greaterThanEClass, source, new String[] { "tag", "greaterthan", "kind", "son" });
		addAnnotation(lessThanOrEqualEClass, source, new String[] { "tag", "lessthanorequal", "kind", "son" });
		addAnnotation(greaterThanOrEqualEClass, source, new String[] { "tag", "greaterthanorequal", "kind", "son" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(finiteIntRangeEClass, source, new String[] {});
		addAnnotation(finiteIntRangeConstantEClass, source, new String[] {});
		addAnnotation(lessThanEClass, source, new String[] {});
		addAnnotation(greaterThanEClass, source, new String[] {});
		addAnnotation(lessThanOrEqualEClass, source, new String[] {});
		addAnnotation(greaterThanOrEqualEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/methods/SORT</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSORTAnnotations() {
		String source = "http://www.pnml.org/models/methods/SORT";
		addAnnotation(
				finiteIntRangeEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\tif (\"FiniteIntRange\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tFiniteIntRange myFIR = (FiniteIntRange) this;\n\t\t\t\t\tFiniteIntRange thatFIR = (FiniteIntRange) sort;\n\t\t\t\t\tisEqual = (myFIR.getStart() == thatFIR.getStart()\n\t\t\t\t\t    && myFIR.getEnd() == thatFIR.getEnd());  \t\t\t\t\t\t\n\t\t\t\t\t\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\n * Returns true if this sort and argument sort are actually \n * semantically the same sort, even in two different objects.\n * Ex: two FiniteEnumerations or two Integers.\n * @return true if so. \n * @param sort the sort to which we compare this one. \n */" });
	}

} //FiniteIntRangesPackageImpl
