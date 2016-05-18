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
package fr.lip6.move.pnml.hlpn.lists.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import fr.lip6.move.pnml.hlpn.lists.Append;
import fr.lip6.move.pnml.hlpn.lists.Concatenation;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.Length;
import fr.lip6.move.pnml.hlpn.lists.ListOperator;
import fr.lip6.move.pnml.hlpn.lists.ListsFactory;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.MemberAtIndex;
import fr.lip6.move.pnml.hlpn.lists.Sublist;
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
public class ListsPackageImpl extends EPackageImpl implements ListsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlpnListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberAtIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sublistEClass = null;

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
	 * @see fr.lip6.move.pnml.hlpn.lists.ListsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ListsPackageImpl() {
		super(eNS_URI, ListsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ListsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ListsPackage init() {
		if (isInited)
			return (ListsPackage) EPackage.Registry.INSTANCE.getEPackage(ListsPackage.eNS_URI);

		// Obtain or create and register package
		ListsPackageImpl theListsPackage = (ListsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ListsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ListsPackageImpl());

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
		theListsPackage.createPackageContents();
		theArbitrarydeclarationsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theCyclicEnumerationsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theFiniteEnumerationsPackage.createPackageContents();
		theFiniteIntRangesPackage.createPackageContents();
		theHlcorestructurePackage.createPackageContents();
		theIntegersPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		thePartitionsPackage.createPackageContents();
		theStringsPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theListsPackage.initializePackageContents();
		theArbitrarydeclarationsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theCyclicEnumerationsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theFiniteEnumerationsPackage.initializePackageContents();
		theFiniteIntRangesPackage.initializePackageContents();
		theHlcorestructurePackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		thePartitionsPackage.initializePackageContents();
		theStringsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theListsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ListsPackage.eNS_URI, theListsPackage);
		return theListsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLPNList() {
		return hlpnListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHLPNList_Basis() {
		return (EReference) hlpnListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyList() {
		return emptyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmptyList_Refsort() {
		return (EReference) emptyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOperator() {
		return listOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppend() {
		return appendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenation() {
		return concatenationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakeList() {
		return makeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMakeList_Refsort() {
		return (EReference) makeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberAtIndex() {
		return memberAtIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberAtIndex_Index() {
		return (EAttribute) memberAtIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSublist() {
		return sublistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSublist_Start() {
		return (EAttribute) sublistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSublist_Length() {
		return (EAttribute) sublistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListsFactory getListsFactory() {
		return (ListsFactory) getEFactoryInstance();
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
		hlpnListEClass = createEClass(HLPN_LIST);
		createEReference(hlpnListEClass, HLPN_LIST__BASIS);

		emptyListEClass = createEClass(EMPTY_LIST);
		createEReference(emptyListEClass, EMPTY_LIST__REFSORT);

		listOperatorEClass = createEClass(LIST_OPERATOR);

		appendEClass = createEClass(APPEND);

		concatenationEClass = createEClass(CONCATENATION);

		lengthEClass = createEClass(LENGTH);

		makeListEClass = createEClass(MAKE_LIST);
		createEReference(makeListEClass, MAKE_LIST__REFSORT);

		memberAtIndexEClass = createEClass(MEMBER_AT_INDEX);
		createEAttribute(memberAtIndexEClass, MEMBER_AT_INDEX__INDEX);

		sublistEClass = createEClass(SUBLIST);
		createEAttribute(sublistEClass, SUBLIST__START);
		createEAttribute(sublistEClass, SUBLIST__LENGTH);
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
		hlpnListEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		emptyListEClass.getESuperTypes().add(theTermsPackage.getBuiltInConstant());
		listOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		appendEClass.getESuperTypes().add(this.getListOperator());
		concatenationEClass.getESuperTypes().add(this.getListOperator());
		lengthEClass.getESuperTypes().add(this.getListOperator());
		makeListEClass.getESuperTypes().add(this.getListOperator());
		memberAtIndexEClass.getESuperTypes().add(this.getListOperator());
		sublistEClass.getESuperTypes().add(this.getListOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(hlpnListEClass, HLPNList.class, "HLPNList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLPNList_Basis(), theTermsPackage.getSort(), theTermsPackage.getSort_ContainerList(),
				"basis", null, 1, 1, HLPNList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyListEClass, EmptyList.class, "EmptyList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmptyList_Refsort(), theTermsPackage.getSort(), theTermsPackage.getSort_ContainerEmptyList(),
				"refsort", null, 1, 1, EmptyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOperatorEClass, ListOperator.class, "ListOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(appendEClass, Append.class, "Append", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concatenationEClass, Concatenation.class, "Concatenation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(makeListEClass, MakeList.class, "MakeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMakeList_Refsort(), theTermsPackage.getSort(), theTermsPackage.getSort_ContainerMakeList(),
				"refsort", null, 1, 1, MakeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberAtIndexEClass, MemberAtIndex.class, "MemberAtIndex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberAtIndex_Index(), ecorePackage.getEIntegerObject(), "index", null, 1, 1,
				MemberAtIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sublistEClass, Sublist.class, "Sublist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSublist_Start(), ecorePackage.getEIntegerObject(), "start", null, 1, 1, Sublist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSublist_Length(), ecorePackage.getEIntegerObject(), "length", null, 1, 1, Sublist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.pnml.org/models/ToPNML
		createToPNMLAnnotations();
		// http://www.pnml.org/models/HLAPI
		createHLAPIAnnotations();
		// http://www.pnml.org/models/methods/SORT
		createSORTAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(hlpnListEClass, source, new String[] { "tag", "list", "kind", "son" });
		addAnnotation(getHLPNList_Basis(), source, new String[] { "kind", "follow" });
		addAnnotation(emptyListEClass, source, new String[] { "tag", "emptylist", "kind", "son" });
		addAnnotation(getEmptyList_Refsort(), source, new String[] { "kind", "follow" });
		addAnnotation(appendEClass, source, new String[] { "tag", "listappend", "kind", "son" });
		addAnnotation(concatenationEClass, source, new String[] { "tag", "listconcatenation", "kind", "son" });
		addAnnotation(lengthEClass, source, new String[] { "tag", "listlength", "kind", "son" });
		addAnnotation(makeListEClass, source, new String[] { "tag", "makelist", "kind", "son" });
		addAnnotation(getMakeList_Refsort(), source, new String[] { "kind", "follow" });
		addAnnotation(memberAtIndexEClass, source, new String[] { "tag", "memberatindex", "kind", "son" });
		addAnnotation(getMemberAtIndex_Index(), source, new String[] { "tag", "index", "kind", "attribute" });
		addAnnotation(sublistEClass, source, new String[] { "tag", "sublist", "kind", "son" });
		addAnnotation(getSublist_Start(), source, new String[] { "tag", "start", "kind", "attribute" });
		addAnnotation(getSublist_Length(), source, new String[] { "tag", "length", "kind", "attribute" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(hlpnListEClass, source, new String[] {});
		addAnnotation(emptyListEClass, source, new String[] {});
		addAnnotation(appendEClass, source, new String[] {});
		addAnnotation(concatenationEClass, source, new String[] {});
		addAnnotation(lengthEClass, source, new String[] {});
		addAnnotation(makeListEClass, source, new String[] {});
		addAnnotation(memberAtIndexEClass, source, new String[] {});
		addAnnotation(sublistEClass, source, new String[] {});
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
				hlpnListEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\t//further sub-classes must override this method.\n\t\t\t\tif (\"HLPNList\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tHLPNList myList = (HLPNList) this;\n\t\t\t\t\tHLPNList thatList = (HLPNList) sort;\n\t\t\t\t\tif (myList.getBasis() instanceof UserSort\n\t\t\t\t\t    && thatList.getBasis() instanceof UserSort) { \n\t\t\t\t\t\tisEqual =  ((UserSort) myList.getBasis()).getDeclaration().getName()\n\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t((UserSort) thatList.getBasis()).getDeclaration()\n\t\t\t\t\t\t\t\t\t\t\t.getName());\n\t\t\t\t    }\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r */" });
	}

} //ListsPackageImpl
