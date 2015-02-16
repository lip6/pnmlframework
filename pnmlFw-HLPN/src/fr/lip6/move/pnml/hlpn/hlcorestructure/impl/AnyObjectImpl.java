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
package fr.lip6.move.pnml.hlpn.hlcorestructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl#getContainerToolInfo <em>Container Tool Info</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl#getContainerUnparsed <em>Container Unparsed</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl#getContainerAnySort <em>Container Any Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl#getContainerArbitrarySort <em>Container Arbitrary Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnyObjectImpl extends MinimalEObjectImpl implements AnyObject {
	/**
	 * The cached value of the '{@link #getContainerAnySort() <em>Container Any Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerAnySort()
	 * @generated
	 * @ordered
	 */
	protected AnySort containerAnySort;

	/**
	 * The cached value of the '{@link #getContainerArbitrarySort() <em>Container Arbitrary Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerArbitrarySort()
	 * @generated
	 * @ordered
	 */
	protected ArbitrarySort containerArbitrarySort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.ANY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolInfo getContainerToolInfo() {
		if (eContainerFeatureID() != HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO)
			return null;
		return (ToolInfo) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unparsed getContainerUnparsed() {
		if (eContainerFeatureID() != HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED)
			return null;
		return (Unparsed) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerUnparsed(Unparsed newContainerUnparsed, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerUnparsed,
				HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerUnparsed(Unparsed newContainerUnparsed) {
		if (newContainerUnparsed != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED && newContainerUnparsed != null)) {
			if (EcoreUtil.isAncestor(this, newContainerUnparsed))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerUnparsed != null)
				msgs = ((InternalEObject) newContainerUnparsed).eInverseAdd(this,
						ArbitrarydeclarationsPackage.UNPARSED__UNPARSED_MODEL, Unparsed.class, msgs);
			msgs = basicSetContainerUnparsed(newContainerUnparsed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED, newContainerUnparsed, newContainerUnparsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnySort getContainerAnySort() {
		if (containerAnySort != null && containerAnySort.eIsProxy()) {
			InternalEObject oldContainerAnySort = (InternalEObject) containerAnySort;
			containerAnySort = (AnySort) eResolveProxy(oldContainerAnySort);
			if (containerAnySort != oldContainerAnySort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT, oldContainerAnySort,
							containerAnySort));
			}
		}
		return containerAnySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnySort basicGetContainerAnySort() {
		return containerAnySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerAnySort(AnySort newContainerAnySort, NotificationChain msgs) {
		AnySort oldContainerAnySort = containerAnySort;
		containerAnySort = newContainerAnySort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT, oldContainerAnySort, newContainerAnySort);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerAnySort(AnySort newContainerAnySort) {
		if (newContainerAnySort != containerAnySort) {
			NotificationChain msgs = null;
			if (containerAnySort != null)
				msgs = ((InternalEObject) containerAnySort).eInverseRemove(this,
						ArbitrarydeclarationsPackage.ANY_SORT__ANY_SORT_MODEL, AnySort.class, msgs);
			if (newContainerAnySort != null)
				msgs = ((InternalEObject) newContainerAnySort).eInverseAdd(this,
						ArbitrarydeclarationsPackage.ANY_SORT__ANY_SORT_MODEL, AnySort.class, msgs);
			msgs = basicSetContainerAnySort(newContainerAnySort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT, newContainerAnySort, newContainerAnySort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArbitrarySort getContainerArbitrarySort() {
		if (containerArbitrarySort != null && containerArbitrarySort.eIsProxy()) {
			InternalEObject oldContainerArbitrarySort = (InternalEObject) containerArbitrarySort;
			containerArbitrarySort = (ArbitrarySort) eResolveProxy(oldContainerArbitrarySort);
			if (containerArbitrarySort != oldContainerArbitrarySort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HlcorestructurePackage.ANY_OBJECT__CONTAINER_ARBITRARY_SORT, oldContainerArbitrarySort,
							containerArbitrarySort));
			}
		}
		return containerArbitrarySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrarySort basicGetContainerArbitrarySort() {
		return containerArbitrarySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerArbitrarySort(ArbitrarySort newContainerArbitrarySort) {
		ArbitrarySort oldContainerArbitrarySort = containerArbitrarySort;
		containerArbitrarySort = newContainerArbitrarySort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.ANY_OBJECT__CONTAINER_ARBITRARY_SORT, oldContainerArbitrarySort,
					containerArbitrarySort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return eBasicSetContainer(otherEnd, HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO, msgs);
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerUnparsed((Unparsed) otherEnd, msgs);
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT:
			if (containerAnySort != null)
				msgs = ((InternalEObject) containerAnySort).eInverseRemove(this,
						ArbitrarydeclarationsPackage.ANY_SORT__ANY_SORT_MODEL, AnySort.class, msgs);
			return basicSetContainerAnySort((AnySort) otherEnd, msgs);
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
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO:
			return eBasicSetContainer(null, HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO, msgs);
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			return basicSetContainerUnparsed(null, msgs);
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT:
			return basicSetContainerAnySort(null, msgs);
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
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.TOOL_INFO__TOOL_INFO_MODEL,
					ToolInfo.class, msgs);
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			return eInternalContainer().eInverseRemove(this, ArbitrarydeclarationsPackage.UNPARSED__UNPARSED_MODEL,
					Unparsed.class, msgs);
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
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO:
			return getContainerToolInfo();
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			return getContainerUnparsed();
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT:
			if (resolve)
				return getContainerAnySort();
			return basicGetContainerAnySort();
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ARBITRARY_SORT:
			if (resolve)
				return getContainerArbitrarySort();
			return basicGetContainerArbitrarySort();
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
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			setContainerUnparsed((Unparsed) newValue);
			return;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT:
			setContainerAnySort((AnySort) newValue);
			return;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ARBITRARY_SORT:
			setContainerArbitrarySort((ArbitrarySort) newValue);
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
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			setContainerUnparsed((Unparsed) null);
			return;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT:
			setContainerAnySort((AnySort) null);
			return;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ARBITRARY_SORT:
			setContainerArbitrarySort((ArbitrarySort) null);
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
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO:
			return getContainerToolInfo() != null;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_UNPARSED:
			return getContainerUnparsed() != null;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ANY_SORT:
			return containerAnySort != null;
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_ARBITRARY_SORT:
			return containerArbitrarySort != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //AnyObjectImpl
