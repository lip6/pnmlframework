/**
 */
package fr.lip6.nupn.impl;

import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.SizeType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.nupn.impl.SizeTypeImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.SizeTypeImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.SizeTypeImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeTypeImpl extends MinimalEObjectImpl.Container implements SizeType {
	/**
	 * The default value of the '{@link #getArcs() <em>Arcs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ARCS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected BigInteger arcs = ARCS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaces() <em>Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected BigInteger places = PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitions() <em>Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TRANSITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger transitions = TRANSITIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NupnPackage.Literals.SIZE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getArcs() {
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcs(BigInteger newArcs) {
		BigInteger oldArcs = arcs;
		arcs = newArcs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.SIZE_TYPE__ARCS, oldArcs, arcs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPlaces() {
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaces(BigInteger newPlaces) {
		BigInteger oldPlaces = places;
		places = newPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.SIZE_TYPE__PLACES, oldPlaces, places));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTransitions() {
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitions(BigInteger newTransitions) {
		BigInteger oldTransitions = transitions;
		transitions = newTransitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.SIZE_TYPE__TRANSITIONS, oldTransitions,
					transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NupnPackage.SIZE_TYPE__ARCS:
			return getArcs();
		case NupnPackage.SIZE_TYPE__PLACES:
			return getPlaces();
		case NupnPackage.SIZE_TYPE__TRANSITIONS:
			return getTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NupnPackage.SIZE_TYPE__ARCS:
			setArcs((BigInteger) newValue);
			return;
		case NupnPackage.SIZE_TYPE__PLACES:
			setPlaces((BigInteger) newValue);
			return;
		case NupnPackage.SIZE_TYPE__TRANSITIONS:
			setTransitions((BigInteger) newValue);
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
		case NupnPackage.SIZE_TYPE__ARCS:
			setArcs(ARCS_EDEFAULT);
			return;
		case NupnPackage.SIZE_TYPE__PLACES:
			setPlaces(PLACES_EDEFAULT);
			return;
		case NupnPackage.SIZE_TYPE__TRANSITIONS:
			setTransitions(TRANSITIONS_EDEFAULT);
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
		case NupnPackage.SIZE_TYPE__ARCS:
			return ARCS_EDEFAULT == null ? arcs != null : !ARCS_EDEFAULT.equals(arcs);
		case NupnPackage.SIZE_TYPE__PLACES:
			return PLACES_EDEFAULT == null ? places != null : !PLACES_EDEFAULT.equals(places);
		case NupnPackage.SIZE_TYPE__TRANSITIONS:
			return TRANSITIONS_EDEFAULT == null ? transitions != null : !TRANSITIONS_EDEFAULT.equals(transitions);
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
		result.append(" (arcs: ");
		result.append(arcs);
		result.append(", places: ");
		result.append(places);
		result.append(", transitions: ");
		result.append(transitions);
		result.append(')');
		return result.toString();
	}

} //SizeTypeImpl
