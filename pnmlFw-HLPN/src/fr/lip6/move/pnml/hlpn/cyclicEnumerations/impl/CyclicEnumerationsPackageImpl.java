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
package fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl;
import fr.lip6.move.pnml.hlpn.booleans.BooleansPackage;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansPackageImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumOperator;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumerationsFactory;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumerationsPackage;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.util.CyclicEnumerationsValidator;
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
public class CyclicEnumerationsPackageImpl extends EPackageImpl implements CyclicEnumerationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicEnumOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predecessorEClass = null;

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
	 * @see fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CyclicEnumerationsPackageImpl() {
		super(eNS_URI, CyclicEnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CyclicEnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CyclicEnumerationsPackage init() {
		if (isInited)
			return (CyclicEnumerationsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CyclicEnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		CyclicEnumerationsPackageImpl theCyclicEnumerationsPackage = (CyclicEnumerationsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CyclicEnumerationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new CyclicEnumerationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArbitrarydeclarationsPackageImpl theArbitrarydeclarationsPackage = (ArbitrarydeclarationsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ArbitrarydeclarationsPackage.eNS_URI) instanceof ArbitrarydeclarationsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ArbitrarydeclarationsPackage.eNS_URI) : ArbitrarydeclarationsPackage.eINSTANCE);
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);
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
		theCyclicEnumerationsPackage.createPackageContents();
		theArbitrarydeclarationsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theFiniteEnumerationsPackage.createPackageContents();
		theFiniteIntRangesPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theIntegersPackage.createPackageContents();
		theListsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		thePartitionsPackage.createPackageContents();
		theStringsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theCyclicEnumerationsPackage.initializePackageContents();
		theArbitrarydeclarationsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theFiniteEnumerationsPackage.initializePackageContents();
		theFiniteIntRangesPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();
		theListsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		thePartitionsPackage.initializePackageContents();
		theStringsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCyclicEnumerationsPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CyclicEnumerationsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCyclicEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CyclicEnumerationsPackage.eNS_URI, theCyclicEnumerationsPackage);
		return theCyclicEnumerationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicEnumOperator() {
		return cyclicEnumOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicEnumeration() {
		return cyclicEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccessor() {
		return successorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredecessor() {
		return predecessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicEnumerationsFactory getCyclicEnumerationsFactory() {
		return (CyclicEnumerationsFactory) getEFactoryInstance();
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
		cyclicEnumOperatorEClass = createEClass(CYCLIC_ENUM_OPERATOR);

		cyclicEnumerationEClass = createEClass(CYCLIC_ENUMERATION);

		successorEClass = createEClass(SUCCESSOR);

		predecessorEClass = createEClass(PREDECESSOR);
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
		FiniteEnumerationsPackage theFiniteEnumerationsPackage = (FiniteEnumerationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(FiniteEnumerationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cyclicEnumOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		cyclicEnumerationEClass.getESuperTypes().add(theFiniteEnumerationsPackage.getFiniteEnumeration());
		successorEClass.getESuperTypes().add(this.getCyclicEnumOperator());
		predecessorEClass.getESuperTypes().add(this.getCyclicEnumOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(cyclicEnumOperatorEClass, CyclicEnumOperator.class, "CyclicEnumOperator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cyclicEnumerationEClass, CyclicEnumeration.class, "CyclicEnumeration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(successorEClass, Successor.class, "Successor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(predecessorEClass, Predecessor.class, "Predecessor", !IS_ABSTRACT, !IS_INTERFACE,
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
				cyclicEnumOperatorEClass,
				source,
				new String[] { "inputOutputTypes",
						"self.input->size() = 1 and self.input.oclIsTypeOf(CyclicEnumeration) and self.output.oclIsTypeOf(CyclicEnumeration)" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(cyclicEnumOperatorEClass, source, new String[] { "constraints", "inputOutputTypes" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(cyclicEnumerationEClass, source, new String[] { "tag", "cyclicenumeration", "kind", "son" });
		addAnnotation(successorEClass, source, new String[] { "tag", "successor", "kind", "son" });
		addAnnotation(predecessorEClass, source, new String[] { "tag", "predecessor", "kind", "son" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(cyclicEnumerationEClass, source, new String[] {});
		addAnnotation(successorEClass, source, new String[] {});
		addAnnotation(predecessorEClass, source, new String[] {});
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
				cyclicEnumerationEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\tif (\"CyclicEnumeration\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tCyclicEnumeration myFE = (CyclicEnumeration) this;\n\t\t\t\t\tCyclicEnumeration thatFE = (CyclicEnumeration) sort;\n\t\t\t\t\tList<FEConstant> myConstants = myFE.getElements();\n\t\t\t\t\tList<FEConstant> thoseConstants = thatFE.getElements();\n\t\t\t\t\tint i = 0;\n\t\t\t\t\tint j = 0;\n\t\t\t\t\t\n\t\t\t\t\tfor (; i < myConstants.size() && j < thoseConstants.size(); i++, j++) {\n\t\t\t\t\t\tif (myConstants\n\t\t\t\t\t\t\t\t.get(i)\n\t\t\t\t\t\t\t\t.getName()\n\t\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t\tthoseConstants.get(j).getName())) {\n\t\t\t\t\t\t\tisEqual = true;\n\t\t\t\t\t\t} else {\n\t\t\t\t\t\t\tisEqual = false;\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r */" });
	}

} //CyclicEnumerationsPackageImpl
