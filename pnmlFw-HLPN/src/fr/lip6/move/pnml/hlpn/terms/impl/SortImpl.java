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

import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Empty;
import fr.lip6.move.pnml.hlpn.multisets.MultisetsPackage;
import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getMulti <em>Multi</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerNamedSort <em>Container Named Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerVariableDecl <em>Container Variable Decl</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerProductSort <em>Container Product Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerAll <em>Container All</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerEmpty <em>Container Empty</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerPartition <em>Container Partition</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerList <em>Container List</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerEmptyList <em>Container Empty List</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.SortImpl#getContainerMakeList <em>Container Make List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SortImpl extends MinimalEObjectImpl implements Sort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetSort getMulti() {
		if (eContainerFeatureID() != TermsPackage.SORT__MULTI)
			return null;
		return (MultisetSort) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMulti(MultisetSort newMulti, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMulti, TermsPackage.SORT__MULTI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulti(MultisetSort newMulti) {
		if (newMulti != eInternalContainer() || (eContainerFeatureID() != TermsPackage.SORT__MULTI && newMulti != null)) {
			if (EcoreUtil.isAncestor(this, newMulti))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMulti != null)
				msgs = ((InternalEObject) newMulti).eInverseAdd(this, TermsPackage.MULTISET_SORT__BASIS,
						MultisetSort.class, msgs);
			msgs = basicSetMulti(newMulti, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__MULTI, newMulti, newMulti));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedSort getContainerNamedSort() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_NAMED_SORT)
			return null;
		return (NamedSort) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNamedSort(NamedSort newContainerNamedSort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNamedSort, TermsPackage.SORT__CONTAINER_NAMED_SORT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerNamedSort(NamedSort newContainerNamedSort) {
		if (newContainerNamedSort != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_NAMED_SORT && newContainerNamedSort != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNamedSort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNamedSort != null)
				msgs = ((InternalEObject) newContainerNamedSort).eInverseAdd(this, TermsPackage.NAMED_SORT__SORTDEF,
						NamedSort.class, msgs);
			msgs = basicSetContainerNamedSort(newContainerNamedSort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_NAMED_SORT,
					newContainerNamedSort, newContainerNamedSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl getContainerVariableDecl() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_VARIABLE_DECL)
			return null;
		return (VariableDecl) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerVariableDecl(VariableDecl newContainerVariableDecl, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerVariableDecl,
				TermsPackage.SORT__CONTAINER_VARIABLE_DECL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerVariableDecl(VariableDecl newContainerVariableDecl) {
		if (newContainerVariableDecl != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_VARIABLE_DECL && newContainerVariableDecl != null)) {
			if (EcoreUtil.isAncestor(this, newContainerVariableDecl))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerVariableDecl != null)
				msgs = ((InternalEObject) newContainerVariableDecl).eInverseAdd(this, TermsPackage.VARIABLE_DECL__SORT,
						VariableDecl.class, msgs);
			msgs = basicSetContainerVariableDecl(newContainerVariableDecl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_VARIABLE_DECL,
					newContainerVariableDecl, newContainerVariableDecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSort getContainerProductSort() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_PRODUCT_SORT)
			return null;
		return (ProductSort) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerProductSort(ProductSort newContainerProductSort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerProductSort, TermsPackage.SORT__CONTAINER_PRODUCT_SORT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerProductSort(ProductSort newContainerProductSort) {
		if (newContainerProductSort != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_PRODUCT_SORT && newContainerProductSort != null)) {
			if (EcoreUtil.isAncestor(this, newContainerProductSort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerProductSort != null)
				msgs = ((InternalEObject) newContainerProductSort).eInverseAdd(this,
						TermsPackage.PRODUCT_SORT__ELEMENT_SORT, ProductSort.class, msgs);
			msgs = basicSetContainerProductSort(newContainerProductSort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_PRODUCT_SORT,
					newContainerProductSort, newContainerProductSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getContainerType() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_TYPE)
			return null;
		return (Type) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerType(Type newContainerType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerType, TermsPackage.SORT__CONTAINER_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(Type newContainerType) {
		if (newContainerType != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_TYPE && newContainerType != null)) {
			if (EcoreUtil.isAncestor(this, newContainerType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerType != null)
				msgs = ((InternalEObject) newContainerType).eInverseAdd(this, HlcorestructurePackage.TYPE__STRUCTURE,
						Type.class, msgs);
			msgs = basicSetContainerType(newContainerType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_TYPE, newContainerType,
					newContainerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All getContainerAll() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_ALL)
			return null;
		return (All) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerAll(All newContainerAll, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerAll, TermsPackage.SORT__CONTAINER_ALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerAll(All newContainerAll) {
		if (newContainerAll != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_ALL && newContainerAll != null)) {
			if (EcoreUtil.isAncestor(this, newContainerAll))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerAll != null)
				msgs = ((InternalEObject) newContainerAll).eInverseAdd(this, MultisetsPackage.ALL__REFSORT, All.class,
						msgs);
			msgs = basicSetContainerAll(newContainerAll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_ALL, newContainerAll,
					newContainerAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty getContainerEmpty() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_EMPTY)
			return null;
		return (Empty) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerEmpty(Empty newContainerEmpty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerEmpty, TermsPackage.SORT__CONTAINER_EMPTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerEmpty(Empty newContainerEmpty) {
		if (newContainerEmpty != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_EMPTY && newContainerEmpty != null)) {
			if (EcoreUtil.isAncestor(this, newContainerEmpty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerEmpty != null)
				msgs = ((InternalEObject) newContainerEmpty).eInverseAdd(this, MultisetsPackage.EMPTY__REFSORT,
						Empty.class, msgs);
			msgs = basicSetContainerEmpty(newContainerEmpty, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_EMPTY,
					newContainerEmpty, newContainerEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getContainerPartition() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_PARTITION)
			return null;
		return (Partition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPartition(Partition newContainerPartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPartition, TermsPackage.SORT__CONTAINER_PARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerPartition(Partition newContainerPartition) {
		if (newContainerPartition != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_PARTITION && newContainerPartition != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPartition != null)
				msgs = ((InternalEObject) newContainerPartition).eInverseAdd(this, PartitionsPackage.PARTITION__DEF,
						Partition.class, msgs);
			msgs = basicSetContainerPartition(newContainerPartition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_PARTITION,
					newContainerPartition, newContainerPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNList getContainerList() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_LIST)
			return null;
		return (HLPNList) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerList(HLPNList newContainerList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerList, TermsPackage.SORT__CONTAINER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerList(HLPNList newContainerList) {
		if (newContainerList != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_LIST && newContainerList != null)) {
			if (EcoreUtil.isAncestor(this, newContainerList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerList != null)
				msgs = ((InternalEObject) newContainerList).eInverseAdd(this, ListsPackage.HLPN_LIST__BASIS,
						HLPNList.class, msgs);
			msgs = basicSetContainerList(newContainerList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_LIST, newContainerList,
					newContainerList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyList getContainerEmptyList() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_EMPTY_LIST)
			return null;
		return (EmptyList) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerEmptyList(EmptyList newContainerEmptyList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerEmptyList, TermsPackage.SORT__CONTAINER_EMPTY_LIST,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerEmptyList(EmptyList newContainerEmptyList) {
		if (newContainerEmptyList != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_EMPTY_LIST && newContainerEmptyList != null)) {
			if (EcoreUtil.isAncestor(this, newContainerEmptyList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerEmptyList != null)
				msgs = ((InternalEObject) newContainerEmptyList).eInverseAdd(this, ListsPackage.EMPTY_LIST__REFSORT,
						EmptyList.class, msgs);
			msgs = basicSetContainerEmptyList(newContainerEmptyList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_EMPTY_LIST,
					newContainerEmptyList, newContainerEmptyList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeList getContainerMakeList() {
		if (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_MAKE_LIST)
			return null;
		return (MakeList) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerMakeList(MakeList newContainerMakeList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerMakeList, TermsPackage.SORT__CONTAINER_MAKE_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerMakeList(MakeList newContainerMakeList) {
		if (newContainerMakeList != eInternalContainer()
				|| (eContainerFeatureID() != TermsPackage.SORT__CONTAINER_MAKE_LIST && newContainerMakeList != null)) {
			if (EcoreUtil.isAncestor(this, newContainerMakeList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerMakeList != null)
				msgs = ((InternalEObject) newContainerMakeList).eInverseAdd(this, ListsPackage.MAKE_LIST__REFSORT,
						MakeList.class, msgs);
			msgs = basicSetContainerMakeList(newContainerMakeList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.SORT__CONTAINER_MAKE_LIST,
					newContainerMakeList, newContainerMakeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TermsPackage.SORT__MULTI:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMulti((MultisetSort) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNamedSort((NamedSort) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerVariableDecl((VariableDecl) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerProductSort((ProductSort) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerType((Type) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_ALL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerAll((All) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_EMPTY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerEmpty((Empty) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_PARTITION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPartition((Partition) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_LIST:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerList((HLPNList) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerEmptyList((EmptyList) otherEnd, msgs);
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerMakeList((MakeList) otherEnd, msgs);
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
		case TermsPackage.SORT__MULTI:
			return basicSetMulti(null, msgs);
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			return basicSetContainerNamedSort(null, msgs);
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			return basicSetContainerVariableDecl(null, msgs);
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			return basicSetContainerProductSort(null, msgs);
		case TermsPackage.SORT__CONTAINER_TYPE:
			return basicSetContainerType(null, msgs);
		case TermsPackage.SORT__CONTAINER_ALL:
			return basicSetContainerAll(null, msgs);
		case TermsPackage.SORT__CONTAINER_EMPTY:
			return basicSetContainerEmpty(null, msgs);
		case TermsPackage.SORT__CONTAINER_PARTITION:
			return basicSetContainerPartition(null, msgs);
		case TermsPackage.SORT__CONTAINER_LIST:
			return basicSetContainerList(null, msgs);
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			return basicSetContainerEmptyList(null, msgs);
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			return basicSetContainerMakeList(null, msgs);
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
		case TermsPackage.SORT__MULTI:
			return eInternalContainer().eInverseRemove(this, TermsPackage.MULTISET_SORT__BASIS, MultisetSort.class,
					msgs);
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			return eInternalContainer().eInverseRemove(this, TermsPackage.NAMED_SORT__SORTDEF, NamedSort.class, msgs);
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			return eInternalContainer()
					.eInverseRemove(this, TermsPackage.VARIABLE_DECL__SORT, VariableDecl.class, msgs);
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			return eInternalContainer().eInverseRemove(this, TermsPackage.PRODUCT_SORT__ELEMENT_SORT,
					ProductSort.class, msgs);
		case TermsPackage.SORT__CONTAINER_TYPE:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.TYPE__STRUCTURE, Type.class, msgs);
		case TermsPackage.SORT__CONTAINER_ALL:
			return eInternalContainer().eInverseRemove(this, MultisetsPackage.ALL__REFSORT, All.class, msgs);
		case TermsPackage.SORT__CONTAINER_EMPTY:
			return eInternalContainer().eInverseRemove(this, MultisetsPackage.EMPTY__REFSORT, Empty.class, msgs);
		case TermsPackage.SORT__CONTAINER_PARTITION:
			return eInternalContainer().eInverseRemove(this, PartitionsPackage.PARTITION__DEF, Partition.class, msgs);
		case TermsPackage.SORT__CONTAINER_LIST:
			return eInternalContainer().eInverseRemove(this, ListsPackage.HLPN_LIST__BASIS, HLPNList.class, msgs);
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			return eInternalContainer().eInverseRemove(this, ListsPackage.EMPTY_LIST__REFSORT, EmptyList.class, msgs);
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			return eInternalContainer().eInverseRemove(this, ListsPackage.MAKE_LIST__REFSORT, MakeList.class, msgs);
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
		case TermsPackage.SORT__MULTI:
			return getMulti();
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			return getContainerNamedSort();
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			return getContainerVariableDecl();
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			return getContainerProductSort();
		case TermsPackage.SORT__CONTAINER_TYPE:
			return getContainerType();
		case TermsPackage.SORT__CONTAINER_ALL:
			return getContainerAll();
		case TermsPackage.SORT__CONTAINER_EMPTY:
			return getContainerEmpty();
		case TermsPackage.SORT__CONTAINER_PARTITION:
			return getContainerPartition();
		case TermsPackage.SORT__CONTAINER_LIST:
			return getContainerList();
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			return getContainerEmptyList();
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			return getContainerMakeList();
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
		case TermsPackage.SORT__MULTI:
			setMulti((MultisetSort) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			setContainerNamedSort((NamedSort) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			setContainerVariableDecl((VariableDecl) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			setContainerProductSort((ProductSort) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_TYPE:
			setContainerType((Type) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_ALL:
			setContainerAll((All) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_EMPTY:
			setContainerEmpty((Empty) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_PARTITION:
			setContainerPartition((Partition) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_LIST:
			setContainerList((HLPNList) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			setContainerEmptyList((EmptyList) newValue);
			return;
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			setContainerMakeList((MakeList) newValue);
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
		case TermsPackage.SORT__MULTI:
			setMulti((MultisetSort) null);
			return;
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			setContainerNamedSort((NamedSort) null);
			return;
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			setContainerVariableDecl((VariableDecl) null);
			return;
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			setContainerProductSort((ProductSort) null);
			return;
		case TermsPackage.SORT__CONTAINER_TYPE:
			setContainerType((Type) null);
			return;
		case TermsPackage.SORT__CONTAINER_ALL:
			setContainerAll((All) null);
			return;
		case TermsPackage.SORT__CONTAINER_EMPTY:
			setContainerEmpty((Empty) null);
			return;
		case TermsPackage.SORT__CONTAINER_PARTITION:
			setContainerPartition((Partition) null);
			return;
		case TermsPackage.SORT__CONTAINER_LIST:
			setContainerList((HLPNList) null);
			return;
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			setContainerEmptyList((EmptyList) null);
			return;
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			setContainerMakeList((MakeList) null);
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
		case TermsPackage.SORT__MULTI:
			return getMulti() != null;
		case TermsPackage.SORT__CONTAINER_NAMED_SORT:
			return getContainerNamedSort() != null;
		case TermsPackage.SORT__CONTAINER_VARIABLE_DECL:
			return getContainerVariableDecl() != null;
		case TermsPackage.SORT__CONTAINER_PRODUCT_SORT:
			return getContainerProductSort() != null;
		case TermsPackage.SORT__CONTAINER_TYPE:
			return getContainerType() != null;
		case TermsPackage.SORT__CONTAINER_ALL:
			return getContainerAll() != null;
		case TermsPackage.SORT__CONTAINER_EMPTY:
			return getContainerEmpty() != null;
		case TermsPackage.SORT__CONTAINER_PARTITION:
			return getContainerPartition() != null;
		case TermsPackage.SORT__CONTAINER_LIST:
			return getContainerList() != null;
		case TermsPackage.SORT__CONTAINER_EMPTY_LIST:
			return getContainerEmptyList() != null;
		case TermsPackage.SORT__CONTAINER_MAKE_LIST:
			return getContainerMakeList() != null;
		}
		return super.eIsSet(featureID);
	}

	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //SortImpl
