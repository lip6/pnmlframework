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
package fr.lip6.move.pnml.hlpn.partitions.impl;

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
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesPackageImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl;
import fr.lip6.move.pnml.hlpn.integers.IntegersPackage;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersPackageImpl;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsPackageImpl;
import fr.lip6.move.pnml.hlpn.multisets.MultisetsPackage;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsPackageImpl;
import fr.lip6.move.pnml.hlpn.partitions.GreaterThan;
import fr.lip6.move.pnml.hlpn.partitions.LessThan;
import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf;
import fr.lip6.move.pnml.hlpn.partitions.PartitionOperator;
import fr.lip6.move.pnml.hlpn.partitions.PartitionsFactory;
import fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage;
import fr.lip6.move.pnml.hlpn.partitions.util.PartitionsValidator;
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
public class PartitionsPackageImpl extends EPackageImpl implements PartitionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionElementEClass = null;

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
	private EClass partitionElementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

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
	 * @see fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartitionsPackageImpl() {
		super(eNS_URI, PartitionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PartitionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartitionsPackage init() {
		if (isInited)
			return (PartitionsPackage) EPackage.Registry.INSTANCE.getEPackage(PartitionsPackage.eNS_URI);

		// Obtain or create and register package
		PartitionsPackageImpl thePartitionsPackage = (PartitionsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PartitionsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new PartitionsPackageImpl());

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
		FiniteIntRangesPackageImpl theFiniteIntRangesPackage = (FiniteIntRangesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiniteIntRangesPackage.eNS_URI) instanceof FiniteIntRangesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FiniteIntRangesPackage.eNS_URI) : FiniteIntRangesPackage.eINSTANCE);
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
		StringsPackageImpl theStringsPackage = (StringsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StringsPackage.eNS_URI) instanceof StringsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StringsPackage.eNS_URI) : StringsPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		thePartitionsPackage.createPackageContents();
		theArbitrarydeclarationsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theCyclicEnumerationsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theFiniteEnumerationsPackage.createPackageContents();
		theFiniteIntRangesPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theIntegersPackage.createPackageContents();
		theListsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		theStringsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		thePartitionsPackage.initializePackageContents();
		theArbitrarydeclarationsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theCyclicEnumerationsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theFiniteEnumerationsPackage.initializePackageContents();
		theFiniteIntRangesPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();
		theListsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		theStringsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(thePartitionsPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return PartitionsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		thePartitionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartitionsPackage.eNS_URI, thePartitionsPackage);
		return thePartitionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Def() {
		return (EReference) partitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Partitionelements() {
		return (EReference) partitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionElement() {
		return partitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionElement_Refpartition() {
		return (EReference) partitionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionElement_Partitionelementconstants() {
		return (EReference) partitionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionElementOf() {
		return partitionElementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionElementOf_Refpartition() {
		return (EReference) partitionElementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionOperator() {
		return partitionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionsFactory getPartitionsFactory() {
		return (PartitionsFactory) getEFactoryInstance();
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
		partitionEClass = createEClass(PARTITION);
		createEReference(partitionEClass, PARTITION__DEF);
		createEReference(partitionEClass, PARTITION__PARTITIONELEMENTS);

		partitionElementEClass = createEClass(PARTITION_ELEMENT);
		createEReference(partitionElementEClass, PARTITION_ELEMENT__REFPARTITION);
		createEReference(partitionElementEClass, PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS);

		greaterThanEClass = createEClass(GREATER_THAN);

		partitionElementOfEClass = createEClass(PARTITION_ELEMENT_OF);
		createEReference(partitionElementOfEClass, PARTITION_ELEMENT_OF__REFPARTITION);

		partitionOperatorEClass = createEClass(PARTITION_OPERATOR);

		lessThanEClass = createEClass(LESS_THAN);
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
		partitionEClass.getESuperTypes().add(theTermsPackage.getSortDecl());
		partitionElementEClass.getESuperTypes().add(theTermsPackage.getOperatorDecl());
		greaterThanEClass.getESuperTypes().add(this.getPartitionOperator());
		partitionElementOfEClass.getESuperTypes().add(this.getPartitionOperator());
		partitionOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		lessThanEClass.getESuperTypes().add(this.getPartitionOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartition_Def(), theTermsPackage.getSort(), theTermsPackage.getSort_ContainerPartition(),
				"def", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPartition_Partitionelements(), this.getPartitionElement(),
				this.getPartitionElement_Refpartition(), "partitionelements", null, 1, -1, Partition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionElementEClass, PartitionElement.class, "PartitionElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionElement_Refpartition(), this.getPartition(), this.getPartition_Partitionelements(),
				"refpartition", null, 0, 1, PartitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionElement_Partitionelementconstants(), theTermsPackage.getTerm(),
				theTermsPackage.getTerm_ContainerPartitionElement(), "partitionelementconstants", null, 1, -1,
				PartitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionElementOfEClass, PartitionElementOf.class, "PartitionElementOf", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionElementOf_Refpartition(), this.getPartition(), null, "refpartition", null, 1, 1,
				PartitionElementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionOperatorEClass, PartitionOperator.class, "PartitionOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.pnml.org/models/ToPNML
		createToPNMLAnnotations();
		// http://www.pnml.org/models/HLAPI
		createHLAPIAnnotations();
		// http://www.pnml.org/models/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(partitionEClass, source, new String[] { "tag", "partition", "kind", "son" });
		addAnnotation(getPartition_Def(), source, new String[] { "kind", "follow" });
		addAnnotation(getPartition_Partitionelements(), source, new String[] { "kind", "follow" });
		addAnnotation(partitionElementEClass, source, new String[] { "tag", "partitionelement", "kind", "son" });
		addAnnotation(getPartitionElement_Partitionelementconstants(), source, new String[] { "kind", "follow" });
		addAnnotation(greaterThanEClass, source, new String[] { "tag", "gtp", "kind", "son" });
		addAnnotation(partitionElementOfEClass, source, new String[] { "tag", "partitionelementof", "kind", "son" });
		addAnnotation(getPartitionElementOf_Refpartition(), source, new String[] { "tag", "refpartition", "kind",
				"idref" });
		addAnnotation(lessThanEClass, source, new String[] { "tag", "ltp", "kind", "son" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(partitionEClass, source, new String[] {});
		addAnnotation(partitionElementEClass, source, new String[] {});
		addAnnotation(greaterThanEClass, source, new String[] {});
		addAnnotation(partitionElementOfEClass, source, new String[] {});
		addAnnotation(lessThanEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.pnml.org/models/OCL";
		addAnnotation(partitionElementEClass, source, new String[] { "constantsType",
				"self.partitionelementconstants->forAll{p | p.sort = self.refpartition.def}" });
		addAnnotation(greaterThanEClass, source, new String[] { "inputOutputTypes",
				"self.output.oclIsTypeOf(booleans::Bool) and self.input->size() = 2" });
		addAnnotation(partitionElementOfEClass, source, new String[] { "inputOutputTypes", "self.input->size() = 1" });
		addAnnotation(lessThanEClass, source, new String[] { "inputOutputTypes",
				"self.output.oclIsTypeOf(booleans::Bool) and self.input->size() = 2" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(partitionElementEClass, source, new String[] { "constraints", "constantsType" });
		addAnnotation(greaterThanEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(partitionElementOfEClass, source, new String[] { "constraints", "inputOutputTypes" });
		addAnnotation(lessThanEClass, source, new String[] { "constraints", "inputOutputTypes" });
	}

} //PartitionsPackageImpl
