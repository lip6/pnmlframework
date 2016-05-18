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
package fr.lip6.move.pnml.pthlpng.multisets.impl;

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
import fr.lip6.move.pnml.pthlpng.integers.IntegersPackage;
import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersPackageImpl;
import fr.lip6.move.pnml.pthlpng.multisets.Add;
import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Cardinality;
import fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf;
import fr.lip6.move.pnml.pthlpng.multisets.Contains;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;
import fr.lip6.move.pnml.pthlpng.multisets.MultisetsFactory;
import fr.lip6.move.pnml.pthlpng.multisets.MultisetsPackage;
import fr.lip6.move.pnml.pthlpng.multisets.NumberOf;
import fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct;
import fr.lip6.move.pnml.pthlpng.multisets.Subtract;
import fr.lip6.move.pnml.pthlpng.multisets.util.MultisetsValidator;
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
public class MultisetsPackageImpl extends EPackageImpl implements MultisetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarProductEClass = null;

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
	 * @see fr.lip6.move.pnml.pthlpng.multisets.MultisetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MultisetsPackageImpl() {
		super(eNS_URI, MultisetsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MultisetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MultisetsPackage init() {
		if (isInited)
			return (MultisetsPackage) EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI);

		// Obtain or create and register package
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new MultisetsPackageImpl());

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
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);
		PartitionsPackageImpl thePartitionsPackage = (PartitionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) instanceof PartitionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) : PartitionsPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theMultisetsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theIntegersPackage.createPackageContents();
		thePartitionsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theMultisetsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();
		thePartitionsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMultisetsPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return MultisetsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMultisetsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MultisetsPackage.eNS_URI, theMultisetsPackage);
		return theMultisetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityOf() {
		return cardinalityOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAll() {
		return allEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAll_Refsort() {
		return (EReference) allEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmpty() {
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmpty_Refsort() {
		return (EReference) emptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOf() {
		return numberOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtract() {
		return subtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalarProduct() {
		return scalarProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultisetsFactory getMultisetsFactory() {
		return (MultisetsFactory) getEFactoryInstance();
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
		cardinalityEClass = createEClass(CARDINALITY);

		containsEClass = createEClass(CONTAINS);

		cardinalityOfEClass = createEClass(CARDINALITY_OF);

		addEClass = createEClass(ADD);

		allEClass = createEClass(ALL);
		createEReference(allEClass, ALL__REFSORT);

		emptyEClass = createEClass(EMPTY);
		createEReference(emptyEClass, EMPTY__REFSORT);

		numberOfEClass = createEClass(NUMBER_OF);

		subtractEClass = createEClass(SUBTRACT);

		scalarProductEClass = createEClass(SCALAR_PRODUCT);
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
		cardinalityEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		containsEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		cardinalityOfEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		addEClass.getESuperTypes().add(theTermsPackage.getMultisetOperator());
		allEClass.getESuperTypes().add(theTermsPackage.getMultisetOperator());
		emptyEClass.getESuperTypes().add(theTermsPackage.getMultisetOperator());
		numberOfEClass.getESuperTypes().add(theTermsPackage.getMultisetOperator());
		subtractEClass.getESuperTypes().add(theTermsPackage.getMultisetOperator());
		scalarProductEClass.getESuperTypes().add(theTermsPackage.getMultisetOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityOfEClass, CardinalityOf.class, "CardinalityOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allEClass, All.class, "All", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAll_Refsort(), theTermsPackage.getSort(), theTermsPackage.getSort_ContainerAll(), "refsort",
				null, 1, 1, All.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmpty_Refsort(), theTermsPackage.getSort(), theTermsPackage.getSort_ContainerEmpty(),
				"refsort", null, 1, 1, Empty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberOfEClass, NumberOf.class, "NumberOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractEClass, Subtract.class, "Subtract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalarProductEClass, ScalarProduct.class, "ScalarProduct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.pnml.org/models/OCL";
		addAnnotation(cardinalityEClass, source, new String[] { "inputOutputTypes",
				"self.output.oclIsTypeOf(integers::Natural) and self.input.oclIsKindOf(terms::MultisetSort)" });
		addAnnotation(
				containsEClass,
				source,
				new String[] {
						"inputOutputTypes",
						"self.output.oclIsTypeOf(booleans::Bool) and self.input->size() = 2 and self.input->forAll {c | c.oclIsKindOf(terms::MultisetSort)}" });
		addAnnotation(cardinalityOfEClass, source, new String[] { "inputOutputTypes",
				"self.output.oclIsTypeOf(integers::Natural) and self.input.size() = 2" });
		addAnnotation(addEClass, source, new String[] { "inputType",
				"self.input->size() >= 2 and self.input->forAll{c | c.oclIsKindOf(terms::MultisetSort)} " });
		addAnnotation(allEClass, source, new String[] { "inputOutputTypes", "self.input->size() = 0" });
		addAnnotation(emptyEClass, source, new String[] { "InputSize", "self.input->size = 0" });
		addAnnotation(
				numberOfEClass,
				source,
				new String[] {
						"inputOutputTypes",
						"self.input->size() = 2 and self.input->forAll{c, d | c.oclIsTypeOf(integers::Natural) and d.oclIsKindOf(terms::Sort)} and self.output.oclIsKindOf(terms::MultisetSort)" });
		addAnnotation(subtractEClass, source, new String[] { "inputType",
				"self.input->size() = 2 and self.input->forAll{c | c.oclIsKindOf(terms::MultisetSort)}" });
		addAnnotation(
				scalarProductEClass,
				source,
				new String[] {
						"inputOutputTypes",
						"self.output.oclIsKindOf(terms::MultisetSort) and self.input->forAll{c,d | c.oclIsKindOf(integers::Natural) and d.oclIsKindOf(terms::MultisetSort)}" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(cardinalityEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(containsEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(cardinalityOfEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(addEClass, source, new String[] { "constraints", "inputType" });
		addAnnotation(allEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(emptyEClass, source, new String[] { "constraints", "InputSize" });
		addAnnotation(numberOfEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(subtractEClass, source, new String[] { "constraints", "inputType" });
		addAnnotation(scalarProductEClass, source, new String[] { "constraints", "inputOutputTypes" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(cardinalityEClass, source, new String[] { "tag", "cardinality", "kind", "son" });
		addAnnotation(containsEClass, source, new String[] { "tag", "contains", "kind", "son" });
		addAnnotation(cardinalityOfEClass, source, new String[] { "tag", "cardinalityof", "kind", "son" });
		addAnnotation(addEClass, source, new String[] { "tag", "add", "kind", "son" });
		addAnnotation(allEClass, source, new String[] { "tag", "all", "kind", "son" });
		addAnnotation(getAll_Refsort(), source, new String[] { "kind", "follow" });
		addAnnotation(emptyEClass, source, new String[] { "tag", "empty", "kind", "son" });
		addAnnotation(getEmpty_Refsort(), source, new String[] { "kind", "follow" });
		addAnnotation(numberOfEClass, source, new String[] { "tag", "numberof", "kind", "son" });
		addAnnotation(subtractEClass, source, new String[] { "tag", "subtract", "kind", "son" });
		addAnnotation(scalarProductEClass, source, new String[] { "tag", "scalarproduct", "kind", "son" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(cardinalityEClass, source, new String[] {});
		addAnnotation(containsEClass, source, new String[] {});
		addAnnotation(cardinalityOfEClass, source, new String[] {});
		addAnnotation(addEClass, source, new String[] {});
		addAnnotation(allEClass, source, new String[] {});
		addAnnotation(emptyEClass, source, new String[] {});
		addAnnotation(numberOfEClass, source, new String[] {});
		addAnnotation(subtractEClass, source, new String[] {});
		addAnnotation(scalarProductEClass, source, new String[] {});
	}

} //MultisetsPackageImpl
