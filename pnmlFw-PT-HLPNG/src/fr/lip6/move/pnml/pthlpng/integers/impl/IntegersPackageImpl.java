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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
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
package fr.lip6.move.pnml.pthlpng.integers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.lip6.move.pnml.pthlpng.booleans.BooleansPackage;
import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansPackageImpl;
import fr.lip6.move.pnml.pthlpng.dots.DotsPackage;
import fr.lip6.move.pnml.pthlpng.dots.impl.DotsPackageImpl;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructurePackageImpl;
import fr.lip6.move.pnml.pthlpng.integers.Addition;
import fr.lip6.move.pnml.pthlpng.integers.Division;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThan;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual;
import fr.lip6.move.pnml.pthlpng.integers.HLInteger;
import fr.lip6.move.pnml.pthlpng.integers.HLPNNumber;
import fr.lip6.move.pnml.pthlpng.integers.IntegerOperator;
import fr.lip6.move.pnml.pthlpng.integers.IntegersFactory;
import fr.lip6.move.pnml.pthlpng.integers.IntegersPackage;
import fr.lip6.move.pnml.pthlpng.integers.LessThan;
import fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual;
import fr.lip6.move.pnml.pthlpng.integers.Modulo;
import fr.lip6.move.pnml.pthlpng.integers.Multiplication;
import fr.lip6.move.pnml.pthlpng.integers.Natural;
import fr.lip6.move.pnml.pthlpng.integers.NumberConstant;
import fr.lip6.move.pnml.pthlpng.integers.Positive;
import fr.lip6.move.pnml.pthlpng.integers.Subtraction;
import fr.lip6.move.pnml.pthlpng.integers.util.IntegersValidator;
import fr.lip6.move.pnml.pthlpng.multisets.MultisetsPackage;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsPackageImpl;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionsPackage;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsPackageImpl;
import fr.lip6.move.pnml.pthlpng.terms.TermsPackage;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegersPackageImpl extends EPackageImpl implements IntegersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlpnNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

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
	private EClass greaterThanOrEqualEClass = null;

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
	private EClass lessThanOrEqualEClass = null;

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
	 * @see fr.lip6.move.pnml.pthlpng.integers.IntegersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegersPackageImpl() {
		super(eNS_URI, IntegersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntegersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntegersPackage init() {
		if (isInited)
			return (IntegersPackage) EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI);

		// Obtain or create and register package
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new IntegersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);
		DotsPackageImpl theDotsPackage = (DotsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		HlcorestructurePackageImpl theHlcorestructurePackage = (HlcorestructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI) instanceof HlcorestructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI) : HlcorestructurePackage.eINSTANCE);
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MultisetsPackage.eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(MultisetsPackage.eNS_URI) : MultisetsPackage.eINSTANCE);
		PartitionsPackageImpl thePartitionsPackage = (PartitionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) instanceof PartitionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) : PartitionsPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegersPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		thePartitionsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theIntegersPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		thePartitionsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theIntegersPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return IntegersValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theIntegersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntegersPackage.eNS_URI, theIntegersPackage);
		return theIntegersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLPNNumber() {
		return hlpnNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLPNNumber_ContainerNumberConstant() {
		return (EReference) hlpnNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNatural() {
		return naturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositive() {
		return positiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLInteger() {
		return hlIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberConstant() {
		return numberConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberConstant_Type() {
		return (EReference) numberConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberConstant_Value() {
		return (EAttribute) numberConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerOperator() {
		return integerOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtraction() {
		return subtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModulo() {
		return moduloEClass;
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
	public EClass getGreaterThanOrEqual() {
		return greaterThanOrEqualEClass;
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
	public EClass getLessThanOrEqual() {
		return lessThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegersFactory getIntegersFactory() {
		return (IntegersFactory) getEFactoryInstance();
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
		hlpnNumberEClass = createEClass(HLPN_NUMBER);
		createEReference(hlpnNumberEClass, HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT);

		naturalEClass = createEClass(NATURAL);

		positiveEClass = createEClass(POSITIVE);

		hlIntegerEClass = createEClass(HL_INTEGER);

		numberConstantEClass = createEClass(NUMBER_CONSTANT);
		createEReference(numberConstantEClass, NUMBER_CONSTANT__TYPE);
		createEAttribute(numberConstantEClass, NUMBER_CONSTANT__VALUE);

		integerOperatorEClass = createEClass(INTEGER_OPERATOR);

		additionEClass = createEClass(ADDITION);

		subtractionEClass = createEClass(SUBTRACTION);

		multiplicationEClass = createEClass(MULTIPLICATION);

		divisionEClass = createEClass(DIVISION);

		moduloEClass = createEClass(MODULO);

		greaterThanEClass = createEClass(GREATER_THAN);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);

		lessThanEClass = createEClass(LESS_THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);
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
		hlpnNumberEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		naturalEClass.getESuperTypes().add(this.getHLPNNumber());
		positiveEClass.getESuperTypes().add(this.getHLPNNumber());
		hlIntegerEClass.getESuperTypes().add(this.getHLPNNumber());
		numberConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConstant());
		integerOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		additionEClass.getESuperTypes().add(this.getIntegerOperator());
		subtractionEClass.getESuperTypes().add(this.getIntegerOperator());
		multiplicationEClass.getESuperTypes().add(this.getIntegerOperator());
		divisionEClass.getESuperTypes().add(this.getIntegerOperator());
		moduloEClass.getESuperTypes().add(this.getIntegerOperator());
		greaterThanEClass.getESuperTypes().add(this.getIntegerOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getIntegerOperator());
		lessThanEClass.getESuperTypes().add(this.getIntegerOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getIntegerOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(hlpnNumberEClass, HLPNNumber.class, "HLPNNumber", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLPNNumber_ContainerNumberConstant(), this.getNumberConstant(),
				this.getNumberConstant_Type(), "containerNumberConstant", null, 0, 1, HLPNNumber.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(naturalEClass, Natural.class, "Natural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hlIntegerEClass, HLInteger.class, "HLInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberConstantEClass, NumberConstant.class, "NumberConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberConstant_Type(), this.getHLPNNumber(), this.getHLPNNumber_ContainerNumberConstant(),
				"type", null, 1, 1, NumberConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberConstant_Value(), ecorePackage.getELongObject(), "value", null, 1, 1,
				NumberConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(integerOperatorEClass, IntegerOperator.class, "IntegerOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.pnml.org/models/HLAPI
		createHLAPIAnnotations();
		// http://www.pnml.org/models/methods/SORT
		createSORTAnnotations();
		// http://www.pnml.org/models/ToPNML
		createToPNMLAnnotations();
		// http://www.pnml.org/models/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(hlpnNumberEClass, source, new String[] {});
		addAnnotation(naturalEClass, source, new String[] {});
		addAnnotation(positiveEClass, source, new String[] {});
		addAnnotation(hlIntegerEClass, source, new String[] {});
		addAnnotation(numberConstantEClass, source, new String[] {});
		addAnnotation(additionEClass, source, new String[] {});
		addAnnotation(subtractionEClass, source, new String[] {});
		addAnnotation(multiplicationEClass, source, new String[] {});
		addAnnotation(divisionEClass, source, new String[] {});
		addAnnotation(moduloEClass, source, new String[] {});
		addAnnotation(greaterThanEClass, source, new String[] {});
		addAnnotation(greaterThanOrEqualEClass, source, new String[] {});
		addAnnotation(lessThanEClass, source, new String[] {});
		addAnnotation(lessThanOrEqualEClass, source, new String[] {});
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
				hlpnNumberEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t    //by default they are the same sort, unless they have been named.\n\t\t  \tisEqual = true;\n\t\t  \tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\t// we test them if they have been explicitly named.\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t}// otherwise, keep the default.\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\n * Returns true if this sort and argument sort are actually \n * semantically the same sort, even in two different objects.\n * Ex: two FiniteEnumerations or two Integers.\n * @return true if so. \n * @param sort the sort to which we compare this one. \n */" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(naturalEClass, source, new String[] { "tag", "natural", "kind", "son" });
		addAnnotation(positiveEClass, source, new String[] { "tag", "positive", "kind", "son" });
		addAnnotation(hlIntegerEClass, source, new String[] { "tag", "integer", "kind", "son" });
		addAnnotation(numberConstantEClass, source, new String[] { "tag", "numberconstant", "kind", "son" });
		addAnnotation(getNumberConstant_Type(), source, new String[] { "kind", "follow" });
		addAnnotation(getNumberConstant_Value(), source, new String[] { "tag", "value", "kind", "attribute" });
		addAnnotation(additionEClass, source, new String[] { "tag", "addition", "kind", "son" });
		addAnnotation(subtractionEClass, source, new String[] { "tag", "subtraction", "kind", "son" });
		addAnnotation(multiplicationEClass, source, new String[] { "tag", "mult", "kind", "son" });
		addAnnotation(divisionEClass, source, new String[] { "tag", "div", "kind", "son" });
		addAnnotation(moduloEClass, source, new String[] { "tag", "mod", "kind", "son" });
		addAnnotation(greaterThanEClass, source, new String[] { "tag", "gt", "kind", "son" });
		addAnnotation(greaterThanOrEqualEClass, source, new String[] { "tag", "geq", "kind", "son" });
		addAnnotation(lessThanEClass, source, new String[] { "tag", "lt", "kind", "son" });
		addAnnotation(lessThanOrEqualEClass, source, new String[] { "tag", "leq", "kind", "son" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.pnml.org/models/OCL";
		addAnnotation(
				numberConstantEClass,
				source,
				new String[] {
						"typeType",
						"self.input->size() = 0 and self.type.oclIsTypeOf(Natural) implies self.value >= 0 and self.type.oclIsTypeOf(Positive) implies self.value > 0" });
		addAnnotation(integerOperatorEClass, source, new String[] { "inputType",
				"self.input->size() = 2 and self.input->forAll{c | c.oclIsKindOf(Number)}" });
		addAnnotation(additionEClass, source, new String[] { "outputType", "self.output.oclIsKindOf(Number)" });
		addAnnotation(subtractionEClass, source, new String[] { "outputType", "self.output.oclIsKindOf(Number)" });
		addAnnotation(multiplicationEClass, source, new String[] { "outputType", "self.output.oclIsKindOf(Number)" });
		addAnnotation(divisionEClass, source, new String[] { "outputType", "self.output.oclIsKindOf(Number)" });
		addAnnotation(moduloEClass, source, new String[] { "outputType", "self.output.oclIsKindOf(Number)" });
		addAnnotation(greaterThanEClass, source,
				new String[] { "outputType", "self.output.oclIsTypeOf(booleans::Bool)" });
		addAnnotation(greaterThanOrEqualEClass, source, new String[] { "outputType",
				"self.output.oclIsTypeOf(booleans::Bool)" });
		addAnnotation(lessThanEClass, source, new String[] { "outputType", "self.output.oclIsTypeOf(booleans::Bool)" });
		addAnnotation(lessThanOrEqualEClass, source, new String[] { "outputType",
				"self.output.oclIsTypeOf(booleans::Bool)" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(numberConstantEClass, source, new String[] { "constraints", "typeType" });
		addAnnotation(integerOperatorEClass, source, new String[] { "constraints", "inputType" });
		addAnnotation(additionEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(subtractionEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(multiplicationEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(divisionEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(moduloEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(greaterThanEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(greaterThanOrEqualEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(lessThanEClass, source, new String[] { "constraints", "outputType" });
		addAnnotation(lessThanOrEqualEClass, source, new String[] { "constraints", "outputType" });
	}

} //IntegersPackageImpl
