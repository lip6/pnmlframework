/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
package fr.lip6.nupn;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * New documentation note
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.nupn.SizeType#getArcs <em>Arcs</em>}</li>
 *   <li>{@link fr.lip6.nupn.SizeType#getPlaces <em>Places</em>}</li>
 *   <li>{@link fr.lip6.nupn.SizeType#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.nupn.NupnPackage#getSizeType()
 * @model extendedMetaData="name='size' kind='empty'"
 * @generated
 */
public interface SizeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' attribute.
	 * @see #setArcs(BigInteger)
	 * @see fr.lip6.nupn.NupnPackage#getSizeType_Arcs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='arcs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getArcs();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.SizeType#getArcs <em>Arcs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcs</em>' attribute.
	 * @see #getArcs()
	 * @generated
	 */
	void setArcs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' attribute.
	 * @see #setPlaces(BigInteger)
	 * @see fr.lip6.nupn.NupnPackage#getSizeType_Places()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='places' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPlaces();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.SizeType#getPlaces <em>Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Places</em>' attribute.
	 * @see #getPlaces()
	 * @generated
	 */
	void setPlaces(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' attribute.
	 * @see #setTransitions(BigInteger)
	 * @see fr.lip6.nupn.NupnPackage#getSizeType_Transitions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='transitions' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTransitions();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.SizeType#getTransitions <em>Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' attribute.
	 * @see #getTransitions()
	 * @generated
	 */
	void setTransitions(BigInteger value);

} // SizeType
