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
package fr.lip6.move.pnml.pthlpng.hlcorestructure.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.AnyObjectImpl#getContainerToolInfo <em>Container Tool Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnyObjectImpl extends MinimalEObjectImpl implements AnyObject {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return eBasicSetContainer(otherEnd, HlcorestructurePackage.ANY_OBJECT__CONTAINER_TOOL_INFO, msgs);
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
		}
		return super.eGet(featureID, resolve, coreType);
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
		}
		return super.eIsSet(featureID);
	}

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //AnyObjectImpl
