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
 */
package fr.lip6.nupn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.lip6.nupn.NupnFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface NupnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nupn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.pnml.org/version-2009/grammar/pnml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nupn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NupnPackage eINSTANCE = fr.lip6.nupn.impl.NupnPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.nupn.impl.SizeTypeImpl <em>Size Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.nupn.impl.SizeTypeImpl
	 * @see fr.lip6.nupn.impl.NupnPackageImpl#getSizeType()
	 * @generated
	 */
	int SIZE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TYPE__ARCS = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TYPE__PLACES = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TYPE__TRANSITIONS = 2;

	/**
	 * The number of structural features of the '<em>Size Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Size Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.lip6.nupn.impl.StructureTypeImpl <em>Structure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.nupn.impl.StructureTypeImpl
	 * @see fr.lip6.nupn.impl.NupnPackageImpl#getStructureType()
	 * @generated
	 */
	int STRUCTURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__SAFE = 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__UNITS = 3;

	/**
	 * The number of structural features of the '<em>Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl <em>NUPN Toolspecific Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.nupn.impl.NUPNToolspecificTypeImpl
	 * @see fr.lip6.nupn.impl.NupnPackageImpl#getNUPNToolspecificType()
	 * @generated
	 */
	int NUPN_TOOLSPECIFIC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__TOOL = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__MIXED = 4;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP = 5;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION = 6;

	/**
	 * The number of structural features of the '<em>NUPN Toolspecific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>NUPN Toolspecific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUPN_TOOLSPECIFIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.lip6.nupn.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.nupn.impl.UnitTypeImpl
	 * @see fr.lip6.nupn.impl.NupnPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Subunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__SUBUNITS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Place List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.lip6.nupn.impl.NupnPackageImpl#getPlaceList()
	 * @generated
	 */
	int PLACE_LIST = 4;

	/**
	 * The meta object id for the '<em>Unit List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.lip6.nupn.impl.NupnPackageImpl#getUnitList()
	 * @generated
	 */
	int UNIT_LIST = 5;

	/**
	 * Returns the meta object for class '{@link fr.lip6.nupn.SizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Type</em>'.
	 * @see fr.lip6.nupn.SizeType
	 * @generated
	 */
	EClass getSizeType();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.SizeType#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcs</em>'.
	 * @see fr.lip6.nupn.SizeType#getArcs()
	 * @see #getSizeType()
	 * @generated
	 */
	EAttribute getSizeType_Arcs();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.SizeType#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Places</em>'.
	 * @see fr.lip6.nupn.SizeType#getPlaces()
	 * @see #getSizeType()
	 * @generated
	 */
	EAttribute getSizeType_Places();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.SizeType#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitions</em>'.
	 * @see fr.lip6.nupn.SizeType#getTransitions()
	 * @see #getSizeType()
	 * @generated
	 */
	EAttribute getSizeType_Transitions();

	/**
	 * Returns the meta object for class '{@link fr.lip6.nupn.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Type</em>'.
	 * @see fr.lip6.nupn.StructureType
	 * @generated
	 */
	EClass getStructureType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.nupn.StructureType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see fr.lip6.nupn.StructureType#getUnit()
	 * @see #getStructureType()
	 * @generated
	 */
	EReference getStructureType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.StructureType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see fr.lip6.nupn.StructureType#getRoot()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_Root();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.StructureType#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see fr.lip6.nupn.StructureType#isSafe()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_Safe();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.StructureType#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see fr.lip6.nupn.StructureType#getUnits()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_Units();

	/**
	 * Returns the meta object for class '{@link fr.lip6.nupn.NUPNToolspecificType <em>NUPN Toolspecific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NUPN Toolspecific Type</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType
	 * @generated
	 */
	EClass getNUPNToolspecificType();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.nupn.NUPNToolspecificType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getSize()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EReference getNUPNToolspecificType_Size();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.nupn.NUPNToolspecificType#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getStructure()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EReference getNUPNToolspecificType_Structure();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.NUPNToolspecificType#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getTool()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EAttribute getNUPNToolspecificType_Tool();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.NUPNToolspecificType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getVersion()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EAttribute getNUPNToolspecificType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link fr.lip6.nupn.NUPNToolspecificType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getMixed()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EAttribute getNUPNToolspecificType_Mixed();

	/**
	 * Returns the meta object for the map '{@link fr.lip6.nupn.NUPNToolspecificType#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getXMLNSPrefixMap()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EReference getNUPNToolspecificType_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link fr.lip6.nupn.NUPNToolspecificType#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see fr.lip6.nupn.NUPNToolspecificType#getXSISchemaLocation()
	 * @see #getNUPNToolspecificType()
	 * @generated
	 */
	EReference getNUPNToolspecificType_XSISchemaLocation();

	/**
	 * Returns the meta object for class '{@link fr.lip6.nupn.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see fr.lip6.nupn.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.UnitType#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Places</em>'.
	 * @see fr.lip6.nupn.UnitType#getPlaces()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Places();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.UnitType#getSubunits <em>Subunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subunits</em>'.
	 * @see fr.lip6.nupn.UnitType#getSubunits()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Subunits();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.nupn.UnitType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.lip6.nupn.UnitType#getId()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Id();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Place List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Place List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='places' kind='elementOnly' itemType='http://www.eclipse.org/emf/2003/XMLType#IDREF'"
	 * @generated
	 */
	EDataType getPlaceList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Unit List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='subunits' kind='elementOnly' itemType='http://www.eclipse.org/emf/2003/XMLType#IDREF'"
	 * @generated
	 */
	EDataType getUnitList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NupnFactory getNupnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.lip6.nupn.impl.SizeTypeImpl <em>Size Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.nupn.impl.SizeTypeImpl
		 * @see fr.lip6.nupn.impl.NupnPackageImpl#getSizeType()
		 * @generated
		 */
		EClass SIZE_TYPE = eINSTANCE.getSizeType();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_TYPE__ARCS = eINSTANCE.getSizeType_Arcs();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_TYPE__PLACES = eINSTANCE.getSizeType_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_TYPE__TRANSITIONS = eINSTANCE.getSizeType_Transitions();

		/**
		 * The meta object literal for the '{@link fr.lip6.nupn.impl.StructureTypeImpl <em>Structure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.nupn.impl.StructureTypeImpl
		 * @see fr.lip6.nupn.impl.NupnPackageImpl#getStructureType()
		 * @generated
		 */
		EClass STRUCTURE_TYPE = eINSTANCE.getStructureType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_TYPE__UNIT = eINSTANCE.getStructureType_Unit();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__ROOT = eINSTANCE.getStructureType_Root();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__SAFE = eINSTANCE.getStructureType_Safe();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__UNITS = eINSTANCE.getStructureType_Units();

		/**
		 * The meta object literal for the '{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl <em>NUPN Toolspecific Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.nupn.impl.NUPNToolspecificTypeImpl
		 * @see fr.lip6.nupn.impl.NupnPackageImpl#getNUPNToolspecificType()
		 * @generated
		 */
		EClass NUPN_TOOLSPECIFIC_TYPE = eINSTANCE.getNUPNToolspecificType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUPN_TOOLSPECIFIC_TYPE__SIZE = eINSTANCE.getNUPNToolspecificType_Size();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUPN_TOOLSPECIFIC_TYPE__STRUCTURE = eINSTANCE.getNUPNToolspecificType_Structure();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUPN_TOOLSPECIFIC_TYPE__TOOL = eINSTANCE.getNUPNToolspecificType_Tool();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUPN_TOOLSPECIFIC_TYPE__VERSION = eINSTANCE.getNUPNToolspecificType_Version();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUPN_TOOLSPECIFIC_TYPE__MIXED = eINSTANCE.getNUPNToolspecificType_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP = eINSTANCE.getNUPNToolspecificType_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION = eINSTANCE.getNUPNToolspecificType_XSISchemaLocation();

		/**
		 * The meta object literal for the '{@link fr.lip6.nupn.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.nupn.impl.UnitTypeImpl
		 * @see fr.lip6.nupn.impl.NupnPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__PLACES = eINSTANCE.getUnitType_Places();

		/**
		 * The meta object literal for the '<em><b>Subunits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__SUBUNITS = eINSTANCE.getUnitType_Subunits();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__ID = eINSTANCE.getUnitType_Id();

		/**
		 * The meta object literal for the '<em>Place List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.lip6.nupn.impl.NupnPackageImpl#getPlaceList()
		 * @generated
		 */
		EDataType PLACE_LIST = eINSTANCE.getPlaceList();

		/**
		 * The meta object literal for the '<em>Unit List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.lip6.nupn.impl.NupnPackageImpl#getUnitList()
		 * @generated
		 */
		EDataType UNIT_LIST = eINSTANCE.getUnitList();

	}

} //NupnPackage
