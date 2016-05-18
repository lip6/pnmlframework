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

import fr.lip6.nupn.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NupnFactoryImpl extends EFactoryImpl implements NupnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NupnFactory init() {
		try {
			NupnFactory theNupnFactory = (NupnFactory) EPackage.Registry.INSTANCE.getEFactory(NupnPackage.eNS_URI);
			if (theNupnFactory != null) {
				return theNupnFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NupnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NupnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NupnPackage.SIZE_TYPE:
			return createSizeType();
		case NupnPackage.STRUCTURE_TYPE:
			return createStructureType();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE:
			return createNUPNToolspecificType();
		case NupnPackage.UNIT_TYPE:
			return createUnitType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case NupnPackage.PLACE_LIST:
			return createPlaceListFromString(eDataType, initialValue);
		case NupnPackage.UNIT_LIST:
			return createUnitListFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case NupnPackage.PLACE_LIST:
			return convertPlaceListToString(eDataType, instanceValue);
		case NupnPackage.UNIT_LIST:
			return convertUnitListToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeType createSizeType() {
		SizeTypeImpl sizeType = new SizeTypeImpl();
		return sizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType createStructureType() {
		StructureTypeImpl structureType = new StructureTypeImpl();
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUPNToolspecificType createNUPNToolspecificType() {
		NUPNToolspecificTypeImpl nupnToolspecificType = new NUPNToolspecificTypeImpl();
		return nupnToolspecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createPlaceListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null)
			return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREF, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null)
			return null;
		List<?> list = (List<?>) instanceValue;
		if (list.isEmpty())
			return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREF, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createUnitListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null)
			return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREF, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null)
			return null;
		List<?> list = (List<?>) instanceValue;
		if (list.isEmpty())
			return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREF, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NupnPackage getNupnPackage() {
		return (NupnPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NupnPackage getPackage() {
		return NupnPackage.eINSTANCE;
	}

} //NupnFactoryImpl
