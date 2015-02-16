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
 * A representation of the literals of the enumeration '<em><b>CSS2 Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getCSS2Color()
 * @model
 * @generated
 */
public enum CSS2Color implements Enumerator {
	/**
	 * The '<em><b>AQUA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AQUA_VALUE
	 * @generated
	 * @ordered
	 */
	AQUA(0, "AQUA", "aqua"),

	/**
	 * The '<em><b>BLACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(1, "BLACK", "black"),

	/**
	 * The '<em><b>BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(2, "BLUE", "blue"),

	/**
	 * The '<em><b>FUCHSIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUCHSIA_VALUE
	 * @generated
	 * @ordered
	 */
	FUCHSIA(3, "FUCHSIA", "fuchsia"),

	/**
	 * The '<em><b>GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(4, "GRAY", "gray"),

	/**
	 * The '<em><b>GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(5, "GREEN", "green"),

	/**
	 * The '<em><b>LIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIME_VALUE
	 * @generated
	 * @ordered
	 */
	LIME(6, "LIME", "lime"),

	/**
	 * The '<em><b>MAROON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAROON_VALUE
	 * @generated
	 * @ordered
	 */
	MAROON(7, "MAROON", "maroon"),

	/**
	 * The '<em><b>NAVY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVY_VALUE
	 * @generated
	 * @ordered
	 */
	NAVY(8, "NAVY", "navy"),

	/**
	 * The '<em><b>OLIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLIVE_VALUE
	 * @generated
	 * @ordered
	 */
	OLIVE(9, "OLIVE", "olive"),

	/**
	 * The '<em><b>ORANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(10, "ORANGE", "orange"),

	/**
	 * The '<em><b>PURPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(11, "PURPLE", "purple"),

	/**
	 * The '<em><b>RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(12, "RED", "red"),

	/**
	 * The '<em><b>SILVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILVER_VALUE
	 * @generated
	 * @ordered
	 */
	SILVER(13, "SILVER", "silver"),

	/**
	 * The '<em><b>TEAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEAL(14, "TEAL", "teal"),

	/**
	 * The '<em><b>WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(15, "WHITE", "white"),

	/**
	 * The '<em><b>YELLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(16, "YELLOW", "yellow");

	/**
	 * The '<em><b>AQUA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AQUA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AQUA
	 * @model literal="aqua"
	 * @generated
	 * @ordered
	 */
	public static final int AQUA_VALUE = 0;

	/**
	 * The '<em><b>BLACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model literal="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 1;

	/**
	 * The '<em><b>BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model literal="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 2;

	/**
	 * The '<em><b>FUCHSIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUCHSIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUCHSIA
	 * @model literal="fuchsia"
	 * @generated
	 * @ordered
	 */
	public static final int FUCHSIA_VALUE = 3;

	/**
	 * The '<em><b>GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model literal="gray"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 4;

	/**
	 * The '<em><b>GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model literal="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 5;

	/**
	 * The '<em><b>LIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIME
	 * @model literal="lime"
	 * @generated
	 * @ordered
	 */
	public static final int LIME_VALUE = 6;

	/**
	 * The '<em><b>MAROON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAROON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAROON
	 * @model literal="maroon"
	 * @generated
	 * @ordered
	 */
	public static final int MAROON_VALUE = 7;

	/**
	 * The '<em><b>NAVY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAVY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVY
	 * @model literal="navy"
	 * @generated
	 * @ordered
	 */
	public static final int NAVY_VALUE = 8;

	/**
	 * The '<em><b>OLIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OLIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OLIVE
	 * @model literal="olive"
	 * @generated
	 * @ordered
	 */
	public static final int OLIVE_VALUE = 9;

	/**
	 * The '<em><b>ORANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model literal="orange"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 10;

	/**
	 * The '<em><b>PURPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PURPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PURPLE
	 * @model literal="purple"
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 11;

	/**
	 * The '<em><b>RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model literal="red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 12;

	/**
	 * The '<em><b>SILVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SILVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SILVER
	 * @model literal="silver"
	 * @generated
	 * @ordered
	 */
	public static final int SILVER_VALUE = 13;

	/**
	 * The '<em><b>TEAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEAL
	 * @model literal="teal"
	 * @generated
	 * @ordered
	 */
	public static final int TEAL_VALUE = 14;

	/**
	 * The '<em><b>WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model literal="white"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 15;

	/**
	 * The '<em><b>YELLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YELLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model literal="yellow"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 16;

	/**
	 * An array of all the '<em><b>CSS2 Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CSS2Color[] VALUES_ARRAY = new CSS2Color[] { AQUA, BLACK, BLUE, FUCHSIA, GRAY, GREEN, LIME,
			MAROON, NAVY, OLIVE, ORANGE, PURPLE, RED, SILVER, TEAL, WHITE, YELLOW, };

	/**
	 * A public read-only list of all the '<em><b>CSS2 Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CSS2Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CSS2 Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSS2Color get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CSS2Color result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CSS2 Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSS2Color getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CSS2Color result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CSS2 Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSS2Color get(int value) {
		switch (value) {
		case AQUA_VALUE:
			return AQUA;
		case BLACK_VALUE:
			return BLACK;
		case BLUE_VALUE:
			return BLUE;
		case FUCHSIA_VALUE:
			return FUCHSIA;
		case GRAY_VALUE:
			return GRAY;
		case GREEN_VALUE:
			return GREEN;
		case LIME_VALUE:
			return LIME;
		case MAROON_VALUE:
			return MAROON;
		case NAVY_VALUE:
			return NAVY;
		case OLIVE_VALUE:
			return OLIVE;
		case ORANGE_VALUE:
			return ORANGE;
		case PURPLE_VALUE:
			return PURPLE;
		case RED_VALUE:
			return RED;
		case SILVER_VALUE:
			return SILVER;
		case TEAL_VALUE:
			return TEAL;
		case WHITE_VALUE:
			return WHITE;
		case YELLOW_VALUE:
			return YELLOW;
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
	private CSS2Color(int value, String name, String literal) {
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

} //CSS2Color
