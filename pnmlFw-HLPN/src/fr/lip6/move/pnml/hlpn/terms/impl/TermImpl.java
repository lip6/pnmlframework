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
package fr.lip6.move.pnml.hlpn.terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getContainerOperator <em>Container Operator</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getContainerNamedOperator <em>Container Named Operator</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getContainerHLMarking <em>Container HL Marking</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getContainerCondition <em>Container Condition</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getContainerHLAnnotation <em>Container HL Annotation</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.TermImpl#getContainerPartitionElement <em>Container Partition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TermImpl extends MinimalEObjectImpl implements Term {
	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected Sort sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sort getSort() {
		if (sort != null && sort.eIsProxy()) {
			InternalEObject oldSort = (InternalEObject) sort;
			sort = (Sort) eResolveProxy(oldSort);
			if (sort != oldSort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.TERM__SORT, oldSort, sort));
			}
		}
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort basicGetSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSort(Sort newSort) {
		Sort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__SORT, oldSort, sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getContainerOperator() {
		if (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_OPERATOR)
			return null;
		return (Operator) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerOperator(Operator newContainerOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerOperator, TermsPackage.TERM__CONTAINER_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerOperator(Operator newContainerOperator) {
		if (newContainerOperator != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_OPERATOR && newContainerOperator != null)) {
			if (EcoreUtil.isAncestor(this, newContainerOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerOperator != null)
				msgs = ((InternalEObject) newContainerOperator).eInverseAdd(this, TermsPackage.OPERATOR__SUBTERM,
						Operator.class, msgs);
			msgs = basicSetContainerOperator(newContainerOperator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__CONTAINER_OPERATOR,
					newContainerOperator, newContainerOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedOperator getContainerNamedOperator() {
		if (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_NAMED_OPERATOR)
			return null;
		return (NamedOperator) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNamedOperator(NamedOperator newContainerNamedOperator,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNamedOperator,
				TermsPackage.TERM__CONTAINER_NAMED_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNamedOperator(NamedOperator newContainerNamedOperator) {
		if (newContainerNamedOperator != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_NAMED_OPERATOR && newContainerNamedOperator != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNamedOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNamedOperator != null)
				msgs = ((InternalEObject) newContainerNamedOperator).eInverseAdd(this,
						TermsPackage.NAMED_OPERATOR__DEF, NamedOperator.class, msgs);
			msgs = basicSetContainerNamedOperator(newContainerNamedOperator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__CONTAINER_NAMED_OPERATOR,
					newContainerNamedOperator, newContainerNamedOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLMarking getContainerHLMarking() {
		if (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_HL_MARKING)
			return null;
		return (HLMarking) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerHLMarking(HLMarking newContainerHLMarking, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerHLMarking, TermsPackage.TERM__CONTAINER_HL_MARKING,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerHLMarking(HLMarking newContainerHLMarking) {
		if (newContainerHLMarking != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_HL_MARKING && newContainerHLMarking != null)) {
			if (EcoreUtil.isAncestor(this, newContainerHLMarking))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerHLMarking != null)
				msgs = ((InternalEObject) newContainerHLMarking).eInverseAdd(this,
						HlcorestructurePackage.HL_MARKING__STRUCTURE, HLMarking.class, msgs);
			msgs = basicSetContainerHLMarking(newContainerHLMarking, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__CONTAINER_HL_MARKING,
					newContainerHLMarking, newContainerHLMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getContainerCondition() {
		if (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_CONDITION)
			return null;
		return (Condition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerCondition(Condition newContainerCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerCondition, TermsPackage.TERM__CONTAINER_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerCondition(Condition newContainerCondition) {
		if (newContainerCondition != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_CONDITION && newContainerCondition != null)) {
			if (EcoreUtil.isAncestor(this, newContainerCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerCondition != null)
				msgs = ((InternalEObject) newContainerCondition).eInverseAdd(this,
						HlcorestructurePackage.CONDITION__STRUCTURE, Condition.class, msgs);
			msgs = basicSetContainerCondition(newContainerCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__CONTAINER_CONDITION,
					newContainerCondition, newContainerCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLAnnotation getContainerHLAnnotation() {
		if (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_HL_ANNOTATION)
			return null;
		return (HLAnnotation) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerHLAnnotation(HLAnnotation newContainerHLAnnotation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerHLAnnotation,
				TermsPackage.TERM__CONTAINER_HL_ANNOTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerHLAnnotation(HLAnnotation newContainerHLAnnotation) {
		if (newContainerHLAnnotation != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_HL_ANNOTATION && newContainerHLAnnotation != null)) {
			if (EcoreUtil.isAncestor(this, newContainerHLAnnotation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerHLAnnotation != null)
				msgs = ((InternalEObject) newContainerHLAnnotation).eInverseAdd(this,
						HlcorestructurePackage.HL_ANNOTATION__STRUCTURE, HLAnnotation.class, msgs);
			msgs = basicSetContainerHLAnnotation(newContainerHLAnnotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__CONTAINER_HL_ANNOTATION,
					newContainerHLAnnotation, newContainerHLAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartitionElement getContainerPartitionElement() {
		if (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT)
			return null;
		return (PartitionElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPartitionElement(PartitionElement newContainerPartitionElement,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPartitionElement,
				TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPartitionElement(PartitionElement newContainerPartitionElement) {
		if (newContainerPartitionElement != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT && newContainerPartitionElement != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPartitionElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPartitionElement != null)
				msgs = ((InternalEObject) newContainerPartitionElement).eInverseAdd(this,
						PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS, PartitionElement.class, msgs);
			msgs = basicSetContainerPartitionElement(newContainerPartitionElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT,
					newContainerPartitionElement, newContainerPartitionElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerOperator((Operator) otherEnd, msgs);
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNamedOperator((NamedOperator) otherEnd, msgs);
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerHLMarking((HLMarking) otherEnd, msgs);
		case TermsPackage.TERM__CONTAINER_CONDITION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerCondition((Condition) otherEnd, msgs);
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerHLAnnotation((HLAnnotation) otherEnd, msgs);
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPartitionElement((PartitionElement) otherEnd, msgs);
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
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			return basicSetContainerOperator(null, msgs);
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			return basicSetContainerNamedOperator(null, msgs);
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			return basicSetContainerHLMarking(null, msgs);
		case TermsPackage.TERM__CONTAINER_CONDITION:
			return basicSetContainerCondition(null, msgs);
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			return basicSetContainerHLAnnotation(null, msgs);
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			return basicSetContainerPartitionElement(null, msgs);
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
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			return eInternalContainer().eInverseRemove(this, TermsPackage.OPERATOR__SUBTERM, Operator.class, msgs);
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			return eInternalContainer().eInverseRemove(this, TermsPackage.NAMED_OPERATOR__DEF, NamedOperator.class,
					msgs);
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.HL_MARKING__STRUCTURE,
					HLMarking.class, msgs);
		case TermsPackage.TERM__CONTAINER_CONDITION:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.CONDITION__STRUCTURE,
					Condition.class, msgs);
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.HL_ANNOTATION__STRUCTURE,
					HLAnnotation.class, msgs);
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS, PartitionElement.class, msgs);
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
		case TermsPackage.TERM__SORT:
			if (resolve)
				return getSort();
			return basicGetSort();
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			return getContainerOperator();
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			return getContainerNamedOperator();
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			return getContainerHLMarking();
		case TermsPackage.TERM__CONTAINER_CONDITION:
			return getContainerCondition();
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			return getContainerHLAnnotation();
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			return getContainerPartitionElement();
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
		case TermsPackage.TERM__SORT:
			setSort((Sort) newValue);
			return;
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			setContainerOperator((Operator) newValue);
			return;
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			setContainerNamedOperator((NamedOperator) newValue);
			return;
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			setContainerHLMarking((HLMarking) newValue);
			return;
		case TermsPackage.TERM__CONTAINER_CONDITION:
			setContainerCondition((Condition) newValue);
			return;
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			setContainerHLAnnotation((HLAnnotation) newValue);
			return;
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			setContainerPartitionElement((PartitionElement) newValue);
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
		case TermsPackage.TERM__SORT:
			setSort((Sort) null);
			return;
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			setContainerOperator((Operator) null);
			return;
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			setContainerNamedOperator((NamedOperator) null);
			return;
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			setContainerHLMarking((HLMarking) null);
			return;
		case TermsPackage.TERM__CONTAINER_CONDITION:
			setContainerCondition((Condition) null);
			return;
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			setContainerHLAnnotation((HLAnnotation) null);
			return;
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			setContainerPartitionElement((PartitionElement) null);
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
		case TermsPackage.TERM__SORT:
			return sort != null;
		case TermsPackage.TERM__CONTAINER_OPERATOR:
			return getContainerOperator() != null;
		case TermsPackage.TERM__CONTAINER_NAMED_OPERATOR:
			return getContainerNamedOperator() != null;
		case TermsPackage.TERM__CONTAINER_HL_MARKING:
			return getContainerHLMarking() != null;
		case TermsPackage.TERM__CONTAINER_CONDITION:
			return getContainerCondition() != null;
		case TermsPackage.TERM__CONTAINER_HL_ANNOTATION:
			return getContainerHLAnnotation() != null;
		case TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT:
			return getContainerPartitionElement() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //TermImpl
