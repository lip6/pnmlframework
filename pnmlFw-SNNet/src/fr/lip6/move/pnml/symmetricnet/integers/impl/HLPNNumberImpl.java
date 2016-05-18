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
package fr.lip6.move.pnml.symmetricnet.integers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber;
import fr.lip6.move.pnml.symmetricnet.integers.IntegersPackage;
import fr.lip6.move.pnml.symmetricnet.integers.NumberConstant;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.impl.BuiltInSortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLPN Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.integers.impl.HLPNNumberImpl#getContainerNumberConstant <em>Container Number Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HLPNNumberImpl extends BuiltInSortImpl implements HLPNNumber {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLPNNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegersPackage.Literals.HLPN_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberConstant getContainerNumberConstant() {
		if (eContainerFeatureID() != IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT)
			return null;
		return (NumberConstant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNumberConstant(NumberConstant newContainerNumberConstant,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNumberConstant,
				IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNumberConstant(NumberConstant newContainerNumberConstant) {
		if (newContainerNumberConstant != eInternalContainer()
				|| (eContainerFeatureID() != IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT && newContainerNumberConstant != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNumberConstant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNumberConstant != null)
				msgs = ((InternalEObject) newContainerNumberConstant).eInverseAdd(this,
						IntegersPackage.NUMBER_CONSTANT__TYPE, NumberConstant.class, msgs);
			msgs = basicSetContainerNumberConstant(newContainerNumberConstant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT, newContainerNumberConstant,
					newContainerNumberConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNumberConstant((NumberConstant) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			return basicSetContainerNumberConstant(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			return eInternalContainer().eInverseRemove(this, IntegersPackage.NUMBER_CONSTANT__TYPE,
					NumberConstant.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			return getContainerNumberConstant();
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
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			setContainerNumberConstant((NumberConstant) newValue);
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
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			setContainerNumberConstant((NumberConstant) null);
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
		case IntegersPackage.HLPN_NUMBER__CONTAINER_NUMBER_CONSTANT:
			return getContainerNumberConstant() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);

	@Override
	public boolean equalSorts(Sort sort) {
		boolean isEqual = false;
		if (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {
			//by default they are the same sort, unless they have been named.
			isEqual = true;
			if (this.getContainerNamedSort() != null && sort.getContainerNamedSort() != null) {
				// we test them if they have been explicitly named.
				isEqual = this.getContainerNamedSort().getName()
						.equalsIgnoreCase(sort.getContainerNamedSort().getName());
			}// otherwise, keep the default.
		}
		return isEqual;

	}

} //HLPNNumberImpl
