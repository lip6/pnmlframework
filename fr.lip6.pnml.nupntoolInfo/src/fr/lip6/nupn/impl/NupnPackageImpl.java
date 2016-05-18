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
 */
package fr.lip6.nupn.impl;

import fr.lip6.nupn.NUPNToolspecificType;
import fr.lip6.nupn.NupnFactory;
import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.SizeType;
import fr.lip6.nupn.StructureType;
import fr.lip6.nupn.UnitType;

import fr.lip6.nupn.util.NupnValidator;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NupnPackageImpl extends EPackageImpl implements NupnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nupnToolspecificTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType placeListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitListEDataType = null;

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
	 * @see fr.lip6.nupn.NupnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NupnPackageImpl() {
		super(eNS_URI, NupnFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NupnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NupnPackage init() {
		if (isInited)
			return (NupnPackage) EPackage.Registry.INSTANCE.getEPackage(NupnPackage.eNS_URI);

		// Obtain or create and register package
		NupnPackageImpl theNupnPackage = (NupnPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NupnPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new NupnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNupnPackage.createPackageContents();

		// Initialize created meta-data
		theNupnPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theNupnPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return NupnValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theNupnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NupnPackage.eNS_URI, theNupnPackage);
		return theNupnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeType() {
		return sizeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeType_Arcs() {
		return (EAttribute) sizeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeType_Places() {
		return (EAttribute) sizeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeType_Transitions() {
		return (EAttribute) sizeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureType() {
		return structureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureType_Unit() {
		return (EReference) structureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_Root() {
		return (EAttribute) structureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_Safe() {
		return (EAttribute) structureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_Units() {
		return (EAttribute) structureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUPNToolspecificType() {
		return nupnToolspecificTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUPNToolspecificType_Size() {
		return (EReference) nupnToolspecificTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUPNToolspecificType_Structure() {
		return (EReference) nupnToolspecificTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUPNToolspecificType_Tool() {
		return (EAttribute) nupnToolspecificTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUPNToolspecificType_Version() {
		return (EAttribute) nupnToolspecificTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUPNToolspecificType_Mixed() {
		return (EAttribute) nupnToolspecificTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUPNToolspecificType_XMLNSPrefixMap() {
		return (EReference) nupnToolspecificTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUPNToolspecificType_XSISchemaLocation() {
		return (EReference) nupnToolspecificTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitType() {
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Places() {
		return (EAttribute) unitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Subunits() {
		return (EAttribute) unitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Id() {
		return (EAttribute) unitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlaceList() {
		return placeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitList() {
		return unitListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NupnFactory getNupnFactory() {
		return (NupnFactory) getEFactoryInstance();
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
		sizeTypeEClass = createEClass(SIZE_TYPE);
		createEAttribute(sizeTypeEClass, SIZE_TYPE__ARCS);
		createEAttribute(sizeTypeEClass, SIZE_TYPE__PLACES);
		createEAttribute(sizeTypeEClass, SIZE_TYPE__TRANSITIONS);

		structureTypeEClass = createEClass(STRUCTURE_TYPE);
		createEReference(structureTypeEClass, STRUCTURE_TYPE__UNIT);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__ROOT);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__SAFE);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__UNITS);

		nupnToolspecificTypeEClass = createEClass(NUPN_TOOLSPECIFIC_TYPE);
		createEReference(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__SIZE);
		createEReference(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__STRUCTURE);
		createEAttribute(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__TOOL);
		createEAttribute(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__VERSION);
		createEAttribute(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__MIXED);
		createEReference(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP);
		createEReference(nupnToolspecificTypeEClass, NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION);

		unitTypeEClass = createEClass(UNIT_TYPE);
		createEAttribute(unitTypeEClass, UNIT_TYPE__PLACES);
		createEAttribute(unitTypeEClass, UNIT_TYPE__SUBUNITS);
		createEAttribute(unitTypeEClass, UNIT_TYPE__ID);

		// Create data types
		placeListEDataType = createEDataType(PLACE_LIST);
		unitListEDataType = createEDataType(UNIT_LIST);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sizeTypeEClass, SizeType.class, "SizeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizeType_Arcs(), theXMLTypePackage.getNonNegativeInteger(), "arcs", null, 1, 1,
				SizeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeType_Places(), theXMLTypePackage.getPositiveInteger(), "places", null, 1, 1,
				SizeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeType_Transitions(), theXMLTypePackage.getNonNegativeInteger(), "transitions", null, 1, 1,
				SizeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(structureTypeEClass, StructureType.class, "StructureType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureType_Unit(), this.getUnitType(), null, "unit", null, 1, -1, StructureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureType_Root(), theXMLTypePackage.getIDREF(), "root", null, 1, 1, StructureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureType_Safe(), theXMLTypePackage.getBoolean(), "safe", null, 1, 1,
				StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureType_Units(), theXMLTypePackage.getPositiveInteger(), "units", null, 1, 1,
				StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nupnToolspecificTypeEClass, NUPNToolspecificType.class, "NUPNToolspecificType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUPNToolspecificType_Size(), this.getSizeType(), null, "size", null, 1, 1,
				NUPNToolspecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUPNToolspecificType_Structure(), this.getStructureType(), null, "structure", null, 1, 1,
				NUPNToolspecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUPNToolspecificType_Tool(), theXMLTypePackage.getString(), "tool", "nupn", 0, 1,
				NUPNToolspecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUPNToolspecificType_Version(), theXMLTypePackage.getDecimal(), "version", "1.1", 0, 1,
				NUPNToolspecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUPNToolspecificType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1,
				NUPNToolspecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUPNToolspecificType_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, NUPNToolspecificType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUPNToolspecificType_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, NUPNToolspecificType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTypeEClass, UnitType.class, "UnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitType_Places(), this.getPlaceList(), "places", null, 1, 1, UnitType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitType_Subunits(), this.getUnitList(), "subunits", null, 1, 1, UnitType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, UnitType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(placeListEDataType, List.class, "PlaceList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitListEDataType, List.class, "UnitList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(this, source, new String[] { "qualified", "false" });
		addAnnotation(placeListEDataType, source, new String[] { "name", "places", "kind", "elementOnly", "itemType",
				"http://www.eclipse.org/emf/2003/XMLType#IDREF" });
		addAnnotation(sizeTypeEClass, source, new String[] { "name", "size", "kind", "empty" });
		addAnnotation(getSizeType_Arcs(), source, new String[] { "kind", "attribute", "name", "arcs", "namespace",
				"##targetNamespace" });
		addAnnotation(getSizeType_Places(), source, new String[] { "kind", "attribute", "name", "places", "namespace",
				"##targetNamespace" });
		addAnnotation(getSizeType_Transitions(), source, new String[] { "kind", "attribute", "name", "transitions",
				"namespace", "##targetNamespace" });
		addAnnotation(structureTypeEClass, source, new String[] { "name", "structure", "kind", "elementOnly" });
		addAnnotation(getStructureType_Root(), source, new String[] { "kind", "attribute", "name", "root", "namespace",
				"##targetNamespace" });
		addAnnotation(getStructureType_Safe(), source, new String[] { "kind", "attribute", "name", "safe", "namespace",
				"##targetNamespace" });
		addAnnotation(getStructureType_Units(), source, new String[] { "kind", "attribute", "name", "units",
				"namespace", "##targetNamespace" });
		addAnnotation(nupnToolspecificTypeEClass, source, new String[] { "name", "toolspecific", "kind", "mixed",
				"namespace", "##targetNamespace" });
		addAnnotation(getNUPNToolspecificType_Tool(), source, new String[] { "kind", "attribute", "name", "tool",
				"namespace", "##targetNamespace" });
		addAnnotation(getNUPNToolspecificType_Version(), source, new String[] { "kind", "attribute", "name", "version",
				"namespace", "##targetNamespace" });
		addAnnotation(getNUPNToolspecificType_Mixed(), source, new String[] { "kind", "elementWildcard", "name",
				":mixed" });
		addAnnotation(getNUPNToolspecificType_XMLNSPrefixMap(), source, new String[] { "kind", "attribute", "name",
				"xmlns" });
		addAnnotation(getNUPNToolspecificType_XSISchemaLocation(), source, new String[] { "kind", "attribute", "name",
				"xsi:schemaLocation" });
		addAnnotation(unitListEDataType, source, new String[] { "name", "subunits", "kind", "elementOnly", "itemType",
				"http://www.eclipse.org/emf/2003/XMLType#IDREF" });
		addAnnotation(unitTypeEClass, source, new String[] { "name", "unit", "kind", "elementOnly" });
		addAnnotation(getUnitType_Id(), source, new String[] { "kind", "attribute", "name", "id", "namespace",
				"##targetNamespace" });
	}

} //NupnPackageImpl
