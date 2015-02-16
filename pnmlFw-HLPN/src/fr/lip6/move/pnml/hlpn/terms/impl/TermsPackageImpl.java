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
package fr.lip6.move.pnml.hlpn.terms.impl;

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
import fr.lip6.move.pnml.hlpn.terms.BuiltInConstant;
import fr.lip6.move.pnml.hlpn.terms.BuiltInOperator;
import fr.lip6.move.pnml.hlpn.terms.BuiltInSort;
import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetOperator;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.OperatorDecl;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.SortDecl;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsDeclaration;
import fr.lip6.move.pnml.hlpn.terms.TermsFactory;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.Tuple;
import fr.lip6.move.pnml.hlpn.terms.UserOperator;
import fr.lip6.move.pnml.hlpn.terms.UserSort;
import fr.lip6.move.pnml.hlpn.terms.Variable;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;
import fr.lip6.move.pnml.hlpn.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsPackageImpl extends EPackageImpl implements TermsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termsDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multisetSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multisetOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userOperatorEClass = null;

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
	 * @see fr.lip6.move.pnml.hlpn.terms.TermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermsPackageImpl() {
		super(eNS_URI, TermsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermsPackage init() {
		if (isInited)
			return (TermsPackage) EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Obtain or create and register package
		TermsPackageImpl theTermsPackage = (TermsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new TermsPackageImpl());

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
		PartitionsPackageImpl thePartitionsPackage = (PartitionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) instanceof PartitionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI) : PartitionsPackage.eINSTANCE);
		StringsPackageImpl theStringsPackage = (StringsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StringsPackage.eNS_URI) instanceof StringsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StringsPackage.eNS_URI) : StringsPackage.eINSTANCE);

		// Create package meta-data objects
		theTermsPackage.createPackageContents();
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
		thePartitionsPackage.createPackageContents();
		theStringsPackage.createPackageContents();

		// Initialize created meta-data
		theTermsPackage.initializePackageContents();
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
		thePartitionsPackage.initializePackageContents();
		theStringsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTermsPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return TermsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTermsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermsPackage.eNS_URI, theTermsPackage);
		return theTermsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarations() {
		return declarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarations_Declaration() {
		return (EReference) declarationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarations_ContainerDeclaration() {
		return (EReference) declarationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermsDeclaration() {
		return termsDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermsDeclaration_Id() {
		return (EAttribute) termsDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermsDeclaration_Name() {
		return (EAttribute) termsDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermsDeclaration_ContainerDeclarations() {
		return (EReference) termsDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_Multi() {
		return (EReference) sortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerNamedSort() {
		return (EReference) sortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerVariableDecl() {
		return (EReference) sortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerProductSort() {
		return (EReference) sortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerType() {
		return (EReference) sortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerAll() {
		return (EReference) sortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerEmpty() {
		return (EReference) sortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerPartition() {
		return (EReference) sortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerList() {
		return (EReference) sortEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerEmptyList() {
		return (EReference) sortEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_ContainerMakeList() {
		return (EReference) sortEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultisetSort() {
		return multisetSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultisetSort_Basis() {
		return (EReference) multisetSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Sort() {
		return (EReference) termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_ContainerOperator() {
		return (EReference) termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_ContainerNamedOperator() {
		return (EReference) termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_ContainerHLMarking() {
		return (EReference) termEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_ContainerCondition() {
		return (EReference) termEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_ContainerHLAnnotation() {
		return (EReference) termEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_ContainerPartitionElement() {
		return (EReference) termEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Subterm() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Output() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Input() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDecl() {
		return variableDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_Sort() {
		return (EReference) variableDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_ContainerNamedOperator() {
		return (EReference) variableDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_VariableDecl() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInSort() {
		return builtInSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSort() {
		return productSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSort_ElementSort() {
		return (EReference) productSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInConstant() {
		return builtInConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultisetOperator() {
		return multisetOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuple() {
		return tupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortDecl() {
		return sortDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInOperator() {
		return builtInOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedSort() {
		return namedSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedSort_Sortdef() {
		return (EReference) namedSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserSort() {
		return userSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSort_Declaration() {
		return (EReference) userSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorDecl() {
		return operatorDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedOperator() {
		return namedOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedOperator_Def() {
		return (EReference) namedOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedOperator_Parameters() {
		return (EReference) namedOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserOperator() {
		return userOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserOperator_Declaration() {
		return (EReference) userOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactory getTermsFactory() {
		return (TermsFactory) getEFactoryInstance();
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
		declarationsEClass = createEClass(DECLARATIONS);
		createEReference(declarationsEClass, DECLARATIONS__DECLARATION);
		createEReference(declarationsEClass, DECLARATIONS__CONTAINER_DECLARATION);

		termsDeclarationEClass = createEClass(TERMS_DECLARATION);
		createEAttribute(termsDeclarationEClass, TERMS_DECLARATION__ID);
		createEAttribute(termsDeclarationEClass, TERMS_DECLARATION__NAME);
		createEReference(termsDeclarationEClass, TERMS_DECLARATION__CONTAINER_DECLARATIONS);

		sortEClass = createEClass(SORT);
		createEReference(sortEClass, SORT__MULTI);
		createEReference(sortEClass, SORT__CONTAINER_NAMED_SORT);
		createEReference(sortEClass, SORT__CONTAINER_VARIABLE_DECL);
		createEReference(sortEClass, SORT__CONTAINER_PRODUCT_SORT);
		createEReference(sortEClass, SORT__CONTAINER_TYPE);
		createEReference(sortEClass, SORT__CONTAINER_ALL);
		createEReference(sortEClass, SORT__CONTAINER_EMPTY);
		createEReference(sortEClass, SORT__CONTAINER_PARTITION);
		createEReference(sortEClass, SORT__CONTAINER_LIST);
		createEReference(sortEClass, SORT__CONTAINER_EMPTY_LIST);
		createEReference(sortEClass, SORT__CONTAINER_MAKE_LIST);

		multisetSortEClass = createEClass(MULTISET_SORT);
		createEReference(multisetSortEClass, MULTISET_SORT__BASIS);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__SORT);
		createEReference(termEClass, TERM__CONTAINER_OPERATOR);
		createEReference(termEClass, TERM__CONTAINER_NAMED_OPERATOR);
		createEReference(termEClass, TERM__CONTAINER_HL_MARKING);
		createEReference(termEClass, TERM__CONTAINER_CONDITION);
		createEReference(termEClass, TERM__CONTAINER_HL_ANNOTATION);
		createEReference(termEClass, TERM__CONTAINER_PARTITION_ELEMENT);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__SUBTERM);
		createEReference(operatorEClass, OPERATOR__OUTPUT);
		createEReference(operatorEClass, OPERATOR__INPUT);

		variableDeclEClass = createEClass(VARIABLE_DECL);
		createEReference(variableDeclEClass, VARIABLE_DECL__SORT);
		createEReference(variableDeclEClass, VARIABLE_DECL__CONTAINER_NAMED_OPERATOR);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__VARIABLE_DECL);

		builtInSortEClass = createEClass(BUILT_IN_SORT);

		productSortEClass = createEClass(PRODUCT_SORT);
		createEReference(productSortEClass, PRODUCT_SORT__ELEMENT_SORT);

		builtInConstantEClass = createEClass(BUILT_IN_CONSTANT);

		multisetOperatorEClass = createEClass(MULTISET_OPERATOR);

		tupleEClass = createEClass(TUPLE);

		sortDeclEClass = createEClass(SORT_DECL);

		builtInOperatorEClass = createEClass(BUILT_IN_OPERATOR);

		namedSortEClass = createEClass(NAMED_SORT);
		createEReference(namedSortEClass, NAMED_SORT__SORTDEF);

		userSortEClass = createEClass(USER_SORT);
		createEReference(userSortEClass, USER_SORT__DECLARATION);

		operatorDeclEClass = createEClass(OPERATOR_DECL);

		namedOperatorEClass = createEClass(NAMED_OPERATOR);
		createEReference(namedOperatorEClass, NAMED_OPERATOR__DEF);
		createEReference(namedOperatorEClass, NAMED_OPERATOR__PARAMETERS);

		userOperatorEClass = createEClass(USER_OPERATOR);
		createEReference(userOperatorEClass, USER_OPERATOR__DECLARATION);
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
		HlcorestructurePackage theHlcorestructurePackage = (HlcorestructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(HlcorestructurePackage.eNS_URI);
		MultisetsPackage theMultisetsPackage = (MultisetsPackage) EPackage.Registry.INSTANCE
				.getEPackage(MultisetsPackage.eNS_URI);
		PartitionsPackage thePartitionsPackage = (PartitionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(PartitionsPackage.eNS_URI);
		ListsPackage theListsPackage = (ListsPackage) EPackage.Registry.INSTANCE.getEPackage(ListsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multisetSortEClass.getESuperTypes().add(this.getSort());
		operatorEClass.getESuperTypes().add(this.getTerm());
		variableDeclEClass.getESuperTypes().add(this.getTermsDeclaration());
		variableEClass.getESuperTypes().add(this.getTerm());
		builtInSortEClass.getESuperTypes().add(this.getSort());
		productSortEClass.getESuperTypes().add(this.getSort());
		builtInConstantEClass.getESuperTypes().add(this.getOperator());
		multisetOperatorEClass.getESuperTypes().add(this.getOperator());
		tupleEClass.getESuperTypes().add(this.getOperator());
		sortDeclEClass.getESuperTypes().add(this.getTermsDeclaration());
		builtInOperatorEClass.getESuperTypes().add(this.getOperator());
		namedSortEClass.getESuperTypes().add(this.getSortDecl());
		userSortEClass.getESuperTypes().add(this.getSort());
		operatorDeclEClass.getESuperTypes().add(this.getTermsDeclaration());
		namedOperatorEClass.getESuperTypes().add(this.getOperatorDecl());
		userOperatorEClass.getESuperTypes().add(this.getOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(declarationsEClass, Declarations.class, "Declarations", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclarations_Declaration(), this.getTermsDeclaration(),
				this.getTermsDeclaration_ContainerDeclarations(), "declaration", null, 0, -1, Declarations.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclarations_ContainerDeclaration(), theHlcorestructurePackage.getDeclaration(),
				theHlcorestructurePackage.getDeclaration_Structure(), "containerDeclaration", null, 0, 1,
				Declarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termsDeclarationEClass, TermsDeclaration.class, "TermsDeclaration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermsDeclaration_Id(), ecorePackage.getEString(), "id", null, 1, 1, TermsDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTermsDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TermsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getTermsDeclaration_ContainerDeclarations(), this.getDeclarations(),
				this.getDeclarations_Declaration(), "containerDeclarations", null, 0, 1, TermsDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortEClass, Sort.class, "Sort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSort_Multi(), this.getMultisetSort(), this.getMultisetSort_Basis(), "multi", null, 0, 1,
				Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSort_ContainerNamedSort(), this.getNamedSort(), this.getNamedSort_Sortdef(),
				"containerNamedSort", null, 0, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerVariableDecl(), this.getVariableDecl(), this.getVariableDecl_Sort(),
				"containerVariableDecl", null, 0, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerProductSort(), this.getProductSort(), this.getProductSort_ElementSort(),
				"containerProductSort", null, 0, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerType(), theHlcorestructurePackage.getType(),
				theHlcorestructurePackage.getType_Structure(), "containerType", null, 0, 1, Sort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerAll(), theMultisetsPackage.getAll(), theMultisetsPackage.getAll_Refsort(),
				"containerAll", null, 0, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerEmpty(), theMultisetsPackage.getEmpty(),
				theMultisetsPackage.getEmpty_Refsort(), "containerEmpty", null, 0, 1, Sort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerPartition(), thePartitionsPackage.getPartition(),
				thePartitionsPackage.getPartition_Def(), "containerPartition", null, 0, 1, Sort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getSort_ContainerList(), theListsPackage.getHLPNList(), theListsPackage.getHLPNList_Basis(),
				"containerList", null, 0, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerEmptyList(), theListsPackage.getEmptyList(),
				theListsPackage.getEmptyList_Refsort(), "containerEmptyList", null, 0, 1, Sort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSort_ContainerMakeList(), theListsPackage.getMakeList(),
				theListsPackage.getMakeList_Refsort(), "containerMakeList", null, 0, 1, Sort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(multisetSortEClass, MultisetSort.class, "MultisetSort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultisetSort_Basis(), this.getSort(), this.getSort_Multi(), "basis", null, 1, 1,
				MultisetSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Sort(), this.getSort(), null, "sort", null, 0, 1, Term.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTerm_ContainerOperator(), this.getOperator(), this.getOperator_Subterm(),
				"containerOperator", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_ContainerNamedOperator(), this.getNamedOperator(), this.getNamedOperator_Def(),
				"containerNamedOperator", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_ContainerHLMarking(), theHlcorestructurePackage.getHLMarking(),
				theHlcorestructurePackage.getHLMarking_Structure(), "containerHLMarking", null, 0, 1, Term.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_ContainerCondition(), theHlcorestructurePackage.getCondition(),
				theHlcorestructurePackage.getCondition_Structure(), "containerCondition", null, 0, 1, Term.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_ContainerHLAnnotation(), theHlcorestructurePackage.getHLAnnotation(),
				theHlcorestructurePackage.getHLAnnotation_Structure(), "containerHLAnnotation", null, 0, 1, Term.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_ContainerPartitionElement(), thePartitionsPackage.getPartitionElement(),
				thePartitionsPackage.getPartitionElement_Partitionelementconstants(), "containerPartitionElement",
				null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Subterm(), this.getTerm(), this.getTerm_ContainerOperator(), "subterm", null, 0, -1,
				Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_Output(), this.getSort(), null, "output", null, 0, 1, Operator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOperator_Input(), this.getSort(), null, "input", null, 0, -1, Operator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDecl_Sort(), this.getSort(), this.getSort_ContainerVariableDecl(), "sort", null, 1,
				1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariableDecl_ContainerNamedOperator(), this.getNamedOperator(),
				this.getNamedOperator_Parameters(), "containerNamedOperator", null, 0, 1, VariableDecl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_VariableDecl(), this.getVariableDecl(), null, "variableDecl", null, 1, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(builtInSortEClass, BuiltInSort.class, "BuiltInSort", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(productSortEClass, ProductSort.class, "ProductSort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSort_ElementSort(), this.getSort(), this.getSort_ContainerProductSort(),
				"elementSort", null, 0, -1, ProductSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInConstantEClass, BuiltInConstant.class, "BuiltInConstant", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multisetOperatorEClass, MultisetOperator.class, "MultisetOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleEClass, Tuple.class, "Tuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortDeclEClass, SortDecl.class, "SortDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInOperatorEClass, BuiltInOperator.class, "BuiltInOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedSortEClass, NamedSort.class, "NamedSort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedSort_Sortdef(), this.getSort(), this.getSort_ContainerNamedSort(), "sortdef", null, 1,
				1, NamedSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userSortEClass, UserSort.class, "UserSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSort_Declaration(), this.getSortDecl(), null, "declaration", null, 1, 1, UserSort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operatorDeclEClass, OperatorDecl.class, "OperatorDecl", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedOperatorEClass, NamedOperator.class, "NamedOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedOperator_Def(), this.getTerm(), this.getTerm_ContainerNamedOperator(), "def", null, 1,
				1, NamedOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedOperator_Parameters(), this.getVariableDecl(),
				this.getVariableDecl_ContainerNamedOperator(), "parameters", null, 0, -1, NamedOperator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userOperatorEClass, UserOperator.class, "UserOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserOperator_Declaration(), this.getOperatorDecl(), null, "declaration", null, 1, 1,
				UserOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.pnml.org/models/ToPNML
		createToPNMLAnnotations();
		// http://www.pnml.org/models/HLAPI
		createHLAPIAnnotations();
		// http://www.pnml.org/models/methods/SORT
		createSORTAnnotations();
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
		addAnnotation(declarationsEClass, source, new String[] { "tag", "declarations", "kind", "son" });
		addAnnotation(getDeclarations_Declaration(), source, new String[] { "kind", "follow" });
		addAnnotation(getTermsDeclaration_Id(), source, new String[] { "tag", "id", "kind", "id" });
		addAnnotation(getTermsDeclaration_Name(), source, new String[] { "tag", "name", "kind", "attribute" });
		addAnnotation(multisetSortEClass, source, new String[] { "tag", "multisetsort", "kind", "son" });
		addAnnotation(getMultisetSort_Basis(), source, new String[] { "kind", "follow" });
		addAnnotation(getOperator_Subterm(), source, new String[] { "tag", "subterm", "kind", "follow" });
		addAnnotation(variableDeclEClass, source, new String[] { "tag", "variabledecl", "kind", "son" });
		addAnnotation(getVariableDecl_Sort(), source, new String[] { "kind", "follow" });
		addAnnotation(variableEClass, source, new String[] { "tag", "variable", "kind", "son" });
		addAnnotation(getVariable_VariableDecl(), source, new String[] { "tag", "refvariable", "kind", "idref" });
		addAnnotation(productSortEClass, source, new String[] { "tag", "productsort", "kind", "son" });
		addAnnotation(getProductSort_ElementSort(), source, new String[] { "kind", "follow" });
		addAnnotation(tupleEClass, source, new String[] { "tag", "tuple", "kind", "son" });
		addAnnotation(namedSortEClass, source, new String[] { "tag", "namedsort", "kind", "son" });
		addAnnotation(getNamedSort_Sortdef(), source, new String[] { "kind", "follow" });
		addAnnotation(userSortEClass, source, new String[] { "tag", "usersort", "kind", "son" });
		addAnnotation(getUserSort_Declaration(), source, new String[] { "tag", "declaration", "kind", "idref" });
		addAnnotation(namedOperatorEClass, source, new String[] { "tag", "namedoperator", "kind", "son" });
		addAnnotation(getNamedOperator_Def(), source, new String[] { "tag", "def", "kind", "follow" });
		addAnnotation(getNamedOperator_Parameters(), source, new String[] { "tag", "parameter", "kind", "follow" });
		addAnnotation(userOperatorEClass, source, new String[] { "tag", "useroperator", "kind", "son" });
		addAnnotation(getUserOperator_Declaration(), source, new String[] { "tag", "declaration", "kind", "idref" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(declarationsEClass, source, new String[] {});
		addAnnotation(termsDeclarationEClass, source, new String[] {});
		addAnnotation(sortEClass, source, new String[] {});
		addAnnotation(multisetSortEClass, source, new String[] {});
		addAnnotation(termEClass, source, new String[] {});
		addAnnotation(operatorEClass, source, new String[] {});
		addAnnotation(variableDeclEClass, source, new String[] {});
		addAnnotation(variableEClass, source, new String[] {});
		addAnnotation(productSortEClass, source, new String[] {});
		addAnnotation(tupleEClass, source, new String[] {});
		addAnnotation(sortDeclEClass, source, new String[] {});
		addAnnotation(namedSortEClass, source, new String[] {});
		addAnnotation(userSortEClass, source, new String[] {});
		addAnnotation(operatorDeclEClass, source, new String[] {});
		addAnnotation(namedOperatorEClass, source, new String[] {});
		addAnnotation(userOperatorEClass, source, new String[] {});
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
				sortEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"",
						"documentation",
						"/**\n  * Returns true if this sort and argument sort are actually semantically the\n  * same sort, even in two different objects. \n  * <p>Ex: two FiniteEnumerations F1 = {1,4,6} and F2 = {1,4,6} or\n  * two Integers I1 and I2.</p> \n  * <p><strong>Note</strong> : the implementation available for\n  * MultisetSort is not complete. In particular, we just test equality\n  * of the references or of the enclosing NamedSorts (if any). \n  * You should consider overriding it in that case.\n  * \n  * @return true if so.\n  * @param sort\n  *            the sort to which we compare this one.\n  */" });
		addAnnotation(
				multisetSortEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t  \tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\t// we test them if they have been explicitly named.\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t throw new UnsupportedOperationException(\"Cannot determine if these two multisets are equal.\"\n\t\t\t + \"You should override this method.\");\n\t\t\t}\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * Note : there is no implementation available for MultisetSort yet.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r */" });
		addAnnotation(
				productSortEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\t// Someone may one day inherit from ProductSort, so we should\n\t\t\t\t// strictly check for ProductSort only. Further sub-classes must \n\t\t\t\t//override this method.\n\t\t\t\tif (\"ProductSort\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tProductSort mySort = (ProductSort) this;\n\t\t\t\t\tProductSort thatSort = (ProductSort) sort;\n\t\t\t\t\tList<Sort> myElements = mySort.getElementSort();\n\t\t\t\t\tList<Sort> thoseElements = thatSort.getElementSort();\n\t\t\t\t\tint i = 0;\n\t\t\t\t\tint j = 0;\n\t\t\t\t\tfor (; i < myElements.size() && j < thoseElements.size(); i++, j++) {\n\t\t\t\t\t\tif (myElements\n\t\t\t\t\t\t\t\t.get(i)\n\t\t\t\t\t\t\t\t.eClass()\n\t\t\t\t\t\t\t\t.getName()\n\t\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t\tthoseElements.get(j).eClass().getName())) {\n\t\t\t\t\t\t\tisEqual = true;\n\t\t\t\t\t\t} else {\n\t\t\t\t\t\t\tisEqual = false;\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\t\t\n\t\t\t}\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r */" });
		addAnnotation(
				userSortEClass,
				source,
				new String[] {
						"signature",
						"boolean equalSorts(Sort sort)",
						"body",
						"boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\t//further sub-classes must override this method.\n\t\t\t\tif (\"UserSort\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tisEqual = ((UserSort) this).getDeclaration().getName()\n\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t((UserSort) sort).getDeclaration()\n\t\t\t\t\t\t\t\t\t\t\t.getName());\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn isEqual;",
						"documentation",
						"/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r */" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.pnml.org/models/OCL";
		addAnnotation(operatorEClass, source, new String[] { "sameOperatorNTermSort", "self.sort = self.output" });
		addAnnotation(namedSortEClass, source, new String[] { "refSortNotMultiset",
				"not(self.sortdef.oclIsTypeOf(MultisetSort))" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(operatorEClass, source, new String[] { "constraints", "sameOperatorNTermSort" });
		addAnnotation(namedSortEClass, source, new String[] { "constraints", "refSortNotMultiset" });
	}

} //TermsPackageImpl
