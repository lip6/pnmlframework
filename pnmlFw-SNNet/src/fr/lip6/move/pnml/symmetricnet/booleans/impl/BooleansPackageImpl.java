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
package fr.lip6.move.pnml.symmetricnet.booleans.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.lip6.move.pnml.symmetricnet.booleans.And;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanOperator;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleansFactory;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleansPackage;
import fr.lip6.move.pnml.symmetricnet.booleans.Equality;
import fr.lip6.move.pnml.symmetricnet.booleans.Imply;
import fr.lip6.move.pnml.symmetricnet.booleans.Inequality;
import fr.lip6.move.pnml.symmetricnet.booleans.Not;
import fr.lip6.move.pnml.symmetricnet.booleans.Or;
import fr.lip6.move.pnml.symmetricnet.booleans.util.BooleansValidator;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsPackage;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsPackageImpl;
import fr.lip6.move.pnml.symmetricnet.dots.DotsPackage;
import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsPackageImpl;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumerationsPackage;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsPackageImpl;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesPackageImpl;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructurePackageImpl;
import fr.lip6.move.pnml.symmetricnet.integers.IntegersPackage;
import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersPackageImpl;
import fr.lip6.move.pnml.symmetricnet.multisets.MultisetsPackage;
import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsPackageImpl;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsPackage;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsPackageImpl;
import fr.lip6.move.pnml.symmetricnet.terms.TermsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleansPackageImpl extends EPackageImpl implements BooleansPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inequalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

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
	 * @see fr.lip6.move.pnml.symmetricnet.booleans.BooleansPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BooleansPackageImpl() {
		super(eNS_URI, BooleansFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BooleansPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BooleansPackage init() {
		if (isInited)
			return (BooleansPackage) EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI);

		// Obtain or create and register package
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new BooleansPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CyclicEnumerationsPackageImpl theCyclicEnumerationsPackage = (CyclicEnumerationsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CyclicEnumerationsPackage.eNS_URI) instanceof CyclicEnumerationsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CyclicEnumerationsPackage.eNS_URI) : CyclicEnumerationsPackage.eINSTANCE);
		DotsPackageImpl theDotsPackage = (DotsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		FiniteEnumerationsPackageImpl theFiniteEnumerationsPackage = (FiniteEnumerationsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiniteEnumerationsPackage.eNS_URI) instanceof FiniteEnumerationsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FiniteEnumerationsPackage.eNS_URI) : FiniteEnumerationsPackage.eINSTANCE);
		FiniteIntRangesPackageImpl theFiniteIntRangesPackage = (FiniteIntRangesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiniteIntRangesPackage.eNS_URI) instanceof FiniteIntRangesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FiniteIntRangesPackage.eNS_URI) : FiniteIntRangesPackage.eINSTANCE);
		HlcorestructurePackageImpl theHlcorestructurePackage = (HlcorestructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI) instanceof HlcorestructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI) : HlcorestructurePackage.eINSTANCE);
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);
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
		theBooleansPackage.createPackageContents();
		theCyclicEnumerationsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theFiniteEnumerationsPackage.createPackageContents();
		theFiniteIntRangesPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theIntegersPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		thePartitionsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theBooleansPackage.initializePackageContents();
		theCyclicEnumerationsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theFiniteEnumerationsPackage.initializePackageContents();
		theFiniteIntRangesPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		thePartitionsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theBooleansPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return BooleansValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theBooleansPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BooleansPackage.eNS_URI, theBooleansPackage);
		return theBooleansPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquality() {
		return equalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInequality() {
		return inequalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstant() {
		return booleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstant_Value() {
		return (EAttribute) booleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperator() {
		return booleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImply() {
		return implyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBool() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleansFactory getBooleansFactory() {
		return (BooleansFactory) getEFactoryInstance();
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
		equalityEClass = createEClass(EQUALITY);

		inequalityEClass = createEClass(INEQUALITY);

		booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
		createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VALUE);

		orEClass = createEClass(OR);

		booleanOperatorEClass = createEClass(BOOLEAN_OPERATOR);

		andEClass = createEClass(AND);

		implyEClass = createEClass(IMPLY);

		notEClass = createEClass(NOT);

		boolEClass = createEClass(BOOL);
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
		equalityEClass.getESuperTypes().add(theTermsPackage.getOperator());
		inequalityEClass.getESuperTypes().add(theTermsPackage.getOperator());
		booleanConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConstant());
		orEClass.getESuperTypes().add(this.getBooleanOperator());
		booleanOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		andEClass.getESuperTypes().add(this.getBooleanOperator());
		implyEClass.getESuperTypes().add(this.getBooleanOperator());
		notEClass.getESuperTypes().add(this.getBooleanOperator());
		boolEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());

		// Initialize classes and features; add operations and parameters
		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inequalityEClass, Inequality.class, "Inequality", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstant_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1,
				BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOperatorEClass, BooleanOperator.class, "BooleanOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implyEClass, Imply.class, "Imply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(
				equalityEClass,
				source,
				new String[] {
						"inputOutputTypes",
						"self.input.size() >= 2 and self.input->forAll{c, d | c.oclIsTypeOf(d) or d.oclIsTypeOf(c)} and self.output.oclIsKindOf(Bool)" });
		addAnnotation(
				inequalityEClass,
				source,
				new String[] {
						"inputOutputTypes",
						"self.input.size() = 2 and self.input->forAll{c, d | c.oclIsTypeOf(d) or d.oclIsTypeOf(c)} and self.output.oclIsKindOf(Bool)" });
		addAnnotation(orEClass, source, new String[] { "InputSize", "self.input.size() = 2" });
		addAnnotation(booleanOperatorEClass, source, new String[] { "inputOutputTypes",
				"self.output.oclIsKindOf(Bool) and  self.input->forAll{c | c.oclIsKindOf(Bool)}" });
		addAnnotation(andEClass, source, new String[] { "InputSize", "self.input.size() = 2" });
		addAnnotation(implyEClass, source, new String[] { "InputSize", "self.input.size() = 2" });
		addAnnotation(notEClass, source, new String[] { "InputSize", "self.input.size() = 1" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(equalityEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(inequalityEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(orEClass, source, new String[] { "constraints", "InputSize" });
		addAnnotation(booleanOperatorEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(andEClass, source, new String[] { "constraints", "InputSize" });
		addAnnotation(implyEClass, source, new String[] { "constraints", "InputSize" });
		addAnnotation(notEClass, source, new String[] { "constraints", "InputSize" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(equalityEClass, source, new String[] { "tag", "equality", "kind", "son" });
		addAnnotation(inequalityEClass, source, new String[] { "tag", "inequality", "kind", "son" });
		addAnnotation(booleanConstantEClass, source, new String[] { "tag", "booleanconstantt", "kind", "son" });
		addAnnotation(getBooleanConstant_Value(), source, new String[] { "tag", "value", "kind", "attribute" });
		addAnnotation(orEClass, source, new String[] { "tag", "or", "kind", "son" });
		addAnnotation(andEClass, source, new String[] { "tag", "and", "kind", "son" });
		addAnnotation(implyEClass, source, new String[] { "tag", "imply", "kind", "son" });
		addAnnotation(notEClass, source, new String[] { "tag", "not", "kind", "son" });
		addAnnotation(boolEClass, source, new String[] { "bool", "not", "kind", "son" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(equalityEClass, source, new String[] {});
		addAnnotation(inequalityEClass, source, new String[] {});
		addAnnotation(booleanConstantEClass, source, new String[] {});
		addAnnotation(orEClass, source, new String[] {});
		addAnnotation(andEClass, source, new String[] {});
		addAnnotation(implyEClass, source, new String[] {});
		addAnnotation(notEClass, source, new String[] {});
		addAnnotation(boolEClass, source, new String[] {});
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
				boolEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t    //by default they are the same sort, unless they have been named.\n\t\t  \tisEqual = true;\n\t\t  \tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\t// we test them if they have been explicitly named.\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t}// otherwise, keep the default.\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r * @throws NullPointerException if according to the model, some\r * required reference attributes have not been set.\r */" });
	}

} //BooleansPackageImpl
