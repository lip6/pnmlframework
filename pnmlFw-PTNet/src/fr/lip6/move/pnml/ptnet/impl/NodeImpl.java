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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Node;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.PtnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.NodeImpl#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.NodeImpl#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.NodeImpl#getNodegraphics <em>Nodegraphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends PnObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getInArcs() <em>In Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> inArcs;

	/**
	 * The cached value of the '{@link #getOutArcs() <em>Out Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outArcs;

	/**
	 * The cached value of the '{@link #getNodegraphics() <em>Nodegraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodegraphics()
	 * @generated
	 * @ordered
	 */
	protected NodeGraphics nodegraphics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Arc> getInArcs() {
		if (inArcs == null) {
			inArcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetPackage.NODE__IN_ARCS,
					PtnetPackage.ARC__TARGET);
		}
		return inArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Arc> getOutArcs() {
		if (outArcs == null) {
			outArcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetPackage.NODE__OUT_ARCS,
					PtnetPackage.ARC__SOURCE);
		}
		return outArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGraphics getNodegraphics() {
		return nodegraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodegraphics(NodeGraphics newNodegraphics, NotificationChain msgs) {
		NodeGraphics oldNodegraphics = nodegraphics;
		nodegraphics = newNodegraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.NODE__NODEGRAPHICS, oldNodegraphics, newNodegraphics);
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
	public void setNodegraphics(NodeGraphics newNodegraphics) {
		if (newNodegraphics != nodegraphics) {
			NotificationChain msgs = null;
			if (nodegraphics != null)
				msgs = ((InternalEObject) nodegraphics).eInverseRemove(this,
						PtnetPackage.NODE_GRAPHICS__CONTAINER_NODE, NodeGraphics.class, msgs);
			if (newNodegraphics != null)
				msgs = ((InternalEObject) newNodegraphics).eInverseAdd(this,
						PtnetPackage.NODE_GRAPHICS__CONTAINER_NODE, NodeGraphics.class, msgs);
			msgs = basicSetNodegraphics(newNodegraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.NODE__NODEGRAPHICS, newNodegraphics,
					newNodegraphics));
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
		case PtnetPackage.NODE__IN_ARCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInArcs()).basicAdd(otherEnd, msgs);
		case PtnetPackage.NODE__OUT_ARCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutArcs()).basicAdd(otherEnd, msgs);
		case PtnetPackage.NODE__NODEGRAPHICS:
			if (nodegraphics != null)
				msgs = ((InternalEObject) nodegraphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.NODE__NODEGRAPHICS, null, msgs);
			return basicSetNodegraphics((NodeGraphics) otherEnd, msgs);
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
		case PtnetPackage.NODE__IN_ARCS:
			return ((InternalEList<?>) getInArcs()).basicRemove(otherEnd, msgs);
		case PtnetPackage.NODE__OUT_ARCS:
			return ((InternalEList<?>) getOutArcs()).basicRemove(otherEnd, msgs);
		case PtnetPackage.NODE__NODEGRAPHICS:
			return basicSetNodegraphics(null, msgs);
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
		case PtnetPackage.NODE__IN_ARCS:
			return getInArcs();
		case PtnetPackage.NODE__OUT_ARCS:
			return getOutArcs();
		case PtnetPackage.NODE__NODEGRAPHICS:
			return getNodegraphics();
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
		case PtnetPackage.NODE__NODEGRAPHICS:
			setNodegraphics((NodeGraphics) newValue);
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
		case PtnetPackage.NODE__NODEGRAPHICS:
			setNodegraphics((NodeGraphics) null);
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
		case PtnetPackage.NODE__IN_ARCS:
			return inArcs != null && !inArcs.isEmpty();
		case PtnetPackage.NODE__OUT_ARCS:
			return outArcs != null && !outArcs.isEmpty();
		case PtnetPackage.NODE__NODEGRAPHICS:
			return nodegraphics != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //NodeImpl
