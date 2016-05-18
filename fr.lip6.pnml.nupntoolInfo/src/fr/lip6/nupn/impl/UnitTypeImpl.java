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

import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.UnitType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.nupn.impl.UnitTypeImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.UnitTypeImpl#getSubunits <em>Subunits</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.UnitTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitTypeImpl extends MinimalEObjectImpl.Container implements UnitType {
	/**
	 * The default value of the '{@link #getPlaces() <em>Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> PLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected List<String> places = PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubunits() <em>Subunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunits()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SUBUNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubunits() <em>Subunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunits()
	 * @generated
	 * @ordered
	 */
	protected List<String> subunits = SUBUNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NupnPackage.Literals.UNIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getPlaces() {
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaces(List<String> newPlaces) {
		List<String> oldPlaces = places;
		places = newPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.UNIT_TYPE__PLACES, oldPlaces, places));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSubunits() {
		return subunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubunits(List<String> newSubunits) {
		List<String> oldSubunits = subunits;
		subunits = newSubunits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.UNIT_TYPE__SUBUNITS, oldSubunits,
					subunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.UNIT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NupnPackage.UNIT_TYPE__PLACES:
			return getPlaces();
		case NupnPackage.UNIT_TYPE__SUBUNITS:
			return getSubunits();
		case NupnPackage.UNIT_TYPE__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NupnPackage.UNIT_TYPE__PLACES:
			setPlaces((List<String>) newValue);
			return;
		case NupnPackage.UNIT_TYPE__SUBUNITS:
			setSubunits((List<String>) newValue);
			return;
		case NupnPackage.UNIT_TYPE__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NupnPackage.UNIT_TYPE__PLACES:
			setPlaces(PLACES_EDEFAULT);
			return;
		case NupnPackage.UNIT_TYPE__SUBUNITS:
			setSubunits(SUBUNITS_EDEFAULT);
			return;
		case NupnPackage.UNIT_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NupnPackage.UNIT_TYPE__PLACES:
			return PLACES_EDEFAULT == null ? places != null : !PLACES_EDEFAULT.equals(places);
		case NupnPackage.UNIT_TYPE__SUBUNITS:
			return SUBUNITS_EDEFAULT == null ? subunits != null : !SUBUNITS_EDEFAULT.equals(subunits);
		case NupnPackage.UNIT_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (places: ");
		result.append(places);
		result.append(", subunits: ");
		result.append(subunits);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UnitTypeImpl
