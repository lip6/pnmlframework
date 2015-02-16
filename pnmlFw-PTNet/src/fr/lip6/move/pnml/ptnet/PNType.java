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
package fr.lip6.move.pnml.ptnet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PN Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPNType()
 * @model
 * @generated
 */
public enum PNType implements Enumerator {
	/**
	 * The '<em><b>PTNET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTNET_VALUE
	 * @generated
	 * @ordered
	 */
	PTNET(1, "PTNET", "http://www.pnml.org/version-2009/grammar/ptnet"),

	/**
	 * The '<em><b>COREMODEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COREMODEL_VALUE
	 * @generated
	 * @ordered
	 */
	COREMODEL(0, "COREMODEL", "http://www.pnml.org/version-2009/grammar/pnmlcoremodel"),

	/**
	 * The '<em><b>SYMNET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMNET_VALUE
	 * @generated
	 * @ordered
	 */
	SYMNET(2, "SYMNET", "http://www.pnml.org/version-2009/grammar/snnet"),

	/**
	 * The '<em><b>HLPN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HLPN_VALUE
	 * @generated
	 * @ordered
	 */
	HLPN(3, "HLPN", "http://www.pnml.org/version-2009/grammar/highlevelnet");

	/**
	 * The '<em><b>PTNET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTNET
	 * @model literal="http://www.pnml.org/version-2009/grammar/ptnet"
	 * @generated
	 * @ordered
	 */
	public static final int PTNET_VALUE = 1;

	/**
	 * The '<em><b>COREMODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COREMODEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COREMODEL
	 * @model literal="http://www.pnml.org/version-2009/grammar/pnmlcoremodel"
	 * @generated
	 * @ordered
	 */
	public static final int COREMODEL_VALUE = 0;

	/**
	 * The '<em><b>SYMNET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYMNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMNET
	 * @model literal="http://www.pnml.org/version-2009/grammar/snnet"
	 * @generated
	 * @ordered
	 */
	public static final int SYMNET_VALUE = 2;

	/**
	 * The '<em><b>HLPN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HLPN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HLPN
	 * @model literal="http://www.pnml.org/version-2009/grammar/highlevelnet"
	 * @generated
	 * @ordered
	 */
	public static final int HLPN_VALUE = 3;

	/**
	 * An array of all the '<em><b>PN Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PNType[] VALUES_ARRAY = new PNType[] { PTNET, COREMODEL, SYMNET, HLPN, };

	/**
	 * A public read-only list of all the '<em><b>PN Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PNType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PN Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PNType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PNType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PN Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PNType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PNType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PN Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PNType get(int value) {
		switch (value) {
		case PTNET_VALUE:
			return PTNET;
		case COREMODEL_VALUE:
			return COREMODEL;
		case SYMNET_VALUE:
			return SYMNET;
		case HLPN_VALUE:
			return HLPN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PNType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PNType
