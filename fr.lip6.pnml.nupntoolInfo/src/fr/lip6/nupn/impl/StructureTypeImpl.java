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
package fr.lip6.nupn.impl;

import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.StructureType;
import fr.lip6.nupn.UnitType;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.nupn.impl.StructureTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.StructureTypeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.StructureTypeImpl#isSafe <em>Safe</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.StructureTypeImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureTypeImpl extends MinimalEObjectImpl.Container implements StructureType {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitType> unit;

	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
	protected boolean safe = SAFE_EDEFAULT;

	/**
	 * This is true if the Safe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean safeESet;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger units = UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NupnPackage.Literals.STRUCTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitType> getUnit() {
		if (unit == null) {
			unit = new EObjectContainmentEList<UnitType>(UnitType.class, this, NupnPackage.STRUCTURE_TYPE__UNIT);
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.STRUCTURE_TYPE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafe() {
		return safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafe(boolean newSafe) {
		boolean oldSafe = safe;
		safe = newSafe;
		boolean oldSafeESet = safeESet;
		safeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.STRUCTURE_TYPE__SAFE, oldSafe, safe,
					!oldSafeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSafe() {
		boolean oldSafe = safe;
		boolean oldSafeESet = safeESet;
		safe = SAFE_EDEFAULT;
		safeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NupnPackage.STRUCTURE_TYPE__SAFE, oldSafe,
					SAFE_EDEFAULT, oldSafeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSafe() {
		return safeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(BigInteger newUnits) {
		BigInteger oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.STRUCTURE_TYPE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NupnPackage.STRUCTURE_TYPE__UNIT:
			return ((InternalEList<?>) getUnit()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NupnPackage.STRUCTURE_TYPE__UNIT:
			return getUnit();
		case NupnPackage.STRUCTURE_TYPE__ROOT:
			return getRoot();
		case NupnPackage.STRUCTURE_TYPE__SAFE:
			return isSafe();
		case NupnPackage.STRUCTURE_TYPE__UNITS:
			return getUnits();
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
		case NupnPackage.STRUCTURE_TYPE__UNIT:
			getUnit().clear();
			getUnit().addAll((Collection<? extends UnitType>) newValue);
			return;
		case NupnPackage.STRUCTURE_TYPE__ROOT:
			setRoot((String) newValue);
			return;
		case NupnPackage.STRUCTURE_TYPE__SAFE:
			setSafe((Boolean) newValue);
			return;
		case NupnPackage.STRUCTURE_TYPE__UNITS:
			setUnits((BigInteger) newValue);
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
		case NupnPackage.STRUCTURE_TYPE__UNIT:
			getUnit().clear();
			return;
		case NupnPackage.STRUCTURE_TYPE__ROOT:
			setRoot(ROOT_EDEFAULT);
			return;
		case NupnPackage.STRUCTURE_TYPE__SAFE:
			unsetSafe();
			return;
		case NupnPackage.STRUCTURE_TYPE__UNITS:
			setUnits(UNITS_EDEFAULT);
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
		case NupnPackage.STRUCTURE_TYPE__UNIT:
			return unit != null && !unit.isEmpty();
		case NupnPackage.STRUCTURE_TYPE__ROOT:
			return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
		case NupnPackage.STRUCTURE_TYPE__SAFE:
			return isSetSafe();
		case NupnPackage.STRUCTURE_TYPE__UNITS:
			return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
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
		result.append(" (root: ");
		result.append(root);
		result.append(", safe: ");
		if (safeESet)
			result.append(safe);
		else
			result.append("<unset>");
		result.append(", units: ");
		result.append(units);
		result.append(')');
		return result.toString();
	}

} //StructureTypeImpl
