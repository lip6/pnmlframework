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
package fr.lip6.move.pnml.framework.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * PN Types : Core model, PT net, Symmetric net, HLPN and PT-HLPN.
 * 
 * @author lom
 * 
 */
public enum PNType implements Enumerator {
	/**
	 * The '<em><b>PTNET</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #PTNET_VALUE
	 * 
	 * @ordered
	 */
	PTNET(1, "PTNET", "http://www.pnml.org/version-2009/grammar/ptnet"),

	/**
	 * The '<em><b>COREMODEL</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #COREMODEL_VALUE
	 * 
	 * @ordered
	 */
	COREMODEL(0, "COREMODEL",
			"http://www.pnml.org/version-2009/grammar/pnmlcoremodel"),

	/**
	 * The '<em><b>SYMNET</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #SYMNET_VALUE
	 * @generated
	 * @ordered
	 */
	SYMNET(2, "SYMNET", "http://www.pnml.org/version-2009/grammar/symmetricnet"),

	/**
	 * The '<em><b>HLPN</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #HLPN_VALUE
	 * 
	 * @ordered
	 */
	HLPN(3, "HLPN", "http://www.pnml.org/version-2009/grammar/highlevelnet"),

	/**
	 * The '<em><b>PT-HLPN</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PTHLPN_VALUE
	 * 
	 * @ordered
	 */
	PTHLPN(4, "PTHLPN", "http://www.pnml.org/version-2009/grammar/pt-hlpng");

	/**
	 * The '<em><b>PTNET</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #PTNET
	 * @model literal="http://www.pnml.org/version-2009/grammar/ptnet"
	 * 
	 * @ordered
	 */
	public static final int PTNET_VALUE = 1;

	/**
	 * The '<em><b>COREMODEL</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COREMODEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #COREMODEL
	 * @model literal="http://www.pnml.org/version-2009/grammar/pnmlcoremodel"
	 * 
	 * @ordered
	 */
	public static final int COREMODEL_VALUE = 0;

	/**
	 * The '<em><b>SYMNET</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYMNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SYMNET
	 * @model literal="http://www.pnml.org/version-2009/grammar/symmetricnet"
	 * 
	 * @ordered
	 */
	public static final int SYMNET_VALUE = 2;

	/**
	 * The '<em><b>HLPN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HLPN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #HLPN
	 * @model literal="http://www.pnml.org/version-2009/grammar/highlevelnet"
	 * 
	 * @ordered
	 */
	public static final int HLPN_VALUE = 3;

	/**
	 * The '<em><b>PTHLPN</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #PTHLPN
	 * @model literal="http://www.pnml.org/version-2009/grammar/pt-hlpng"
	 * 
	 * @ordered
	 */
	public static final int PTHLPN_VALUE = 4;

	/**
	 * An array of all the '<em><b>PN Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final PNType[] VALUES_ARRAY = new PNType[] { PTNET,
			COREMODEL, SYMNET, HLPN, PTHLPN, };

	/**
	 * A public read-only list of all the '<em><b>PN Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public static final List<PNType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * <!-- begin-user-doc --> int value.<!-- end-user-doc -->
	 * 
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> name. <!-- end-user-doc -->
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->literal. <!-- end-user-doc -->
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param lvalue
	 *            the int value
	 * @param lname
	 *            the name
	 * @param lliteral
	 *            the literal
	 */
	private PNType(int lvalue, String lname, String lliteral) {
		this.value = lvalue;
		this.name = lname;
		this.literal = lliteral;
	}

	/**
	 * Returns the '<em><b>PN Type</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal value of the PN type.
	 * @return {@link PNType}
	 */
	public static PNType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final PNType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PN Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name of the PN type literal.
	 * @return {@link PNType}
	 */
	public static PNType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final PNType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PN Type</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the PN type numeric value
	 * @return {@link PNType}
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
		case PTHLPN_VALUE:
			return PTHLPN;
		default:
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> the int value. <!-- end-user-doc -->
	 * 
	 * @return the int value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> returns name.<!-- end-user-doc -->
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> returns literal.<!-- end-user-doc -->
	 * 
	 * @return the literal
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the String representation of the literal value
	 */
	@Override
	public String toString() {
		return literal;
	}

}
