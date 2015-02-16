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
package fr.lip6.move.pnml.ptnet.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pn Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PnObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PnObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PnObjectImpl#getToolspecifics <em>Toolspecifics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PnObjectImpl#getContainerPage <em>Container Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PnObjectImpl extends MinimalEObjectImpl implements PnObject {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getToolspecifics() <em>Toolspecifics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolspecifics()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolInfo> toolspecifics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PnObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.PN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PN_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.PN_OBJECT__NAME, oldName, newName);
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
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this, PtnetPackage.NAME__CONTAINER_NAME_PN_OBJECT,
						Name.class, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this, PtnetPackage.NAME__CONTAINER_NAME_PN_OBJECT,
						Name.class, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PN_OBJECT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ToolInfo> getToolspecifics() {
		if (toolspecifics == null) {
			toolspecifics = new EObjectContainmentWithInverseEList<ToolInfo>(ToolInfo.class, this,
					PtnetPackage.PN_OBJECT__TOOLSPECIFICS, PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT);
		}
		return toolspecifics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getContainerPage() {
		if (eContainerFeatureID() != PtnetPackage.PN_OBJECT__CONTAINER_PAGE)
			return null;
		return (Page) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPage(Page newContainerPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPage, PtnetPackage.PN_OBJECT__CONTAINER_PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPage(Page newContainerPage) {
		if (newContainerPage != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.PN_OBJECT__CONTAINER_PAGE && newContainerPage != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPage != null)
				msgs = ((InternalEObject) newContainerPage).eInverseAdd(this, PtnetPackage.PAGE__OBJECTS, Page.class,
						msgs);
			msgs = basicSetContainerPage(newContainerPage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PN_OBJECT__CONTAINER_PAGE,
					newContainerPage, newContainerPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.PN_OBJECT__NAME:
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.PN_OBJECT__NAME, null, msgs);
			return basicSetName((Name) otherEnd, msgs);
		case PtnetPackage.PN_OBJECT__TOOLSPECIFICS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getToolspecifics()).basicAdd(otherEnd, msgs);
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPage((Page) otherEnd, msgs);
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
		case PtnetPackage.PN_OBJECT__NAME:
			return basicSetName(null, msgs);
		case PtnetPackage.PN_OBJECT__TOOLSPECIFICS:
			return ((InternalEList<?>) getToolspecifics()).basicRemove(otherEnd, msgs);
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			return basicSetContainerPage(null, msgs);
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
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.PAGE__OBJECTS, Page.class, msgs);
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
		case PtnetPackage.PN_OBJECT__ID:
			return getId();
		case PtnetPackage.PN_OBJECT__NAME:
			return getName();
		case PtnetPackage.PN_OBJECT__TOOLSPECIFICS:
			return getToolspecifics();
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			return getContainerPage();
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
		case PtnetPackage.PN_OBJECT__ID:
			setId((String) newValue);
			return;
		case PtnetPackage.PN_OBJECT__NAME:
			setName((Name) newValue);
			return;
		case PtnetPackage.PN_OBJECT__TOOLSPECIFICS:
			getToolspecifics().clear();
			getToolspecifics().addAll((Collection<? extends ToolInfo>) newValue);
			return;
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			setContainerPage((Page) newValue);
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
		case PtnetPackage.PN_OBJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case PtnetPackage.PN_OBJECT__NAME:
			setName((Name) null);
			return;
		case PtnetPackage.PN_OBJECT__TOOLSPECIFICS:
			getToolspecifics().clear();
			return;
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			setContainerPage((Page) null);
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
		case PtnetPackage.PN_OBJECT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case PtnetPackage.PN_OBJECT__NAME:
			return name != null;
		case PtnetPackage.PN_OBJECT__TOOLSPECIFICS:
			return toolspecifics != null && !toolspecifics.isEmpty();
		case PtnetPackage.PN_OBJECT__CONTAINER_PAGE:
			return getContainerPage() != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //PnObjectImpl
