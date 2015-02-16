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
package fr.lip6.move.pnml.pnmlcoremodel.impl;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;
import java.util.List;

import javax.xml.stream.XMLStreamException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.common.util.*;
import fr.lip6.move.pnml.pnmlcoremodel.PlaceNode;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelPackage;
import fr.lip6.move.pnml.pnmlcoremodel.RefPlace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.PlaceNodeImpl#getReferencingPlaces <em>Referencing Places</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PlaceNodeImpl extends NodeImpl implements PlaceNode {
	/**
	 * The cached value of the '{@link #getReferencingPlaces() <em>Referencing Places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RefPlace> referencingPlaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.PLACE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RefPlace> getReferencingPlaces() {
		if (referencingPlaces == null) {
			referencingPlaces = new EObjectWithInverseResolvingEList<RefPlace>(RefPlace.class, this,
					PnmlcoremodelPackage.PLACE_NODE__REFERENCING_PLACES, PnmlcoremodelPackage.REF_PLACE__REF);
		}
		return referencingPlaces;
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
		case PnmlcoremodelPackage.PLACE_NODE__REFERENCING_PLACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferencingPlaces())
					.basicAdd(otherEnd, msgs);
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
		case PnmlcoremodelPackage.PLACE_NODE__REFERENCING_PLACES:
			return ((InternalEList<?>) getReferencingPlaces()).basicRemove(otherEnd, msgs);
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
		case PnmlcoremodelPackage.PLACE_NODE__REFERENCING_PLACES:
			return getReferencingPlaces();
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
		case PnmlcoremodelPackage.PLACE_NODE__REFERENCING_PLACES:
			return referencingPlaces != null && !referencingPlaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} //PlaceNodeImpl
