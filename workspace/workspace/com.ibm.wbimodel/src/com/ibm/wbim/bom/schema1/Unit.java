/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Modeler supported unit of measure
 * <!-- end-model-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getUnit()
 * @model extendedMetaData="name='Unit'"
 * @generated
 */
public enum Unit implements Enumerator {
	/**
	 * The '<em><b>Acre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACRE_VALUE
	 * @generated
	 * @ordered
	 */
	ACRE(0, "acre", "acre"),

	/**
	 * The '<em><b>Centimeter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTIMETER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTIMETER(1, "centimeter", "centimeter"),

	/**
	 * The '<em><b>Foot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOT_VALUE
	 * @generated
	 * @ordered
	 */
	FOOT(2, "foot", "foot"),

	/**
	 * The '<em><b>Gallon UK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GALLON_UK_VALUE
	 * @generated
	 * @ordered
	 */
	GALLON_UK(3, "gallonUK", "gallon (UK)"),

	/**
	 * The '<em><b>Gallon US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GALLON_US_VALUE
	 * @generated
	 * @ordered
	 */
	GALLON_US(4, "gallonUS", "gallon (US)"),

	/**
	 * The '<em><b>Gram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAM_VALUE
	 * @generated
	 * @ordered
	 */
	GRAM(5, "gram", "gram"),

	/**
	 * The '<em><b>Hectare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HECTARE_VALUE
	 * @generated
	 * @ordered
	 */
	HECTARE(6, "hectare", "hectare"),

	/**
	 * The '<em><b>Inch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCH_VALUE
	 * @generated
	 * @ordered
	 */
	INCH(7, "inch", "inch"),

	/**
	 * The '<em><b>Kilogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	KILOGRAM(8, "kilogram", "kilogram"),

	/**
	 * The '<em><b>Kilometer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOMETER_VALUE
	 * @generated
	 * @ordered
	 */
	KILOMETER(9, "kilometer", "kilometer"),

	/**
	 * The '<em><b>Liter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITER_VALUE
	 * @generated
	 * @ordered
	 */
	LITER(10, "liter", "liter"),

	/**
	 * The '<em><b>Meter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_VALUE
	 * @generated
	 * @ordered
	 */
	METER(11, "meter", "meter"),

	/**
	 * The '<em><b>Mile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILE_VALUE
	 * @generated
	 * @ordered
	 */
	MILE(12, "mile", "mile"),

	/**
	 * The '<em><b>Ounce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUNCE_VALUE
	 * @generated
	 * @ordered
	 */
	OUNCE(13, "ounce", "ounce"),

	/**
	 * The '<em><b>Pint UK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINT_UK_VALUE
	 * @generated
	 * @ordered
	 */
	PINT_UK(14, "pintUK", "pint (UK)"),

	/**
	 * The '<em><b>Pint US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINT_US_VALUE
	 * @generated
	 * @ordered
	 */
	PINT_US(15, "pintUS", "pint (US)"),

	/**
	 * The '<em><b>Pound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POUND_VALUE
	 * @generated
	 * @ordered
	 */
	POUND(16, "pound", "pound"),

	/**
	 * The '<em><b>Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(17, "unit", "unit"),

	/**
	 * The '<em><b>Yard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YARD_VALUE
	 * @generated
	 * @ordered
	 */
	YARD(18, "yard", "yard");

	/**
	 * The '<em><b>Acre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACRE
	 * @model name="acre"
	 * @generated
	 * @ordered
	 */
	public static final int ACRE_VALUE = 0;

	/**
	 * The '<em><b>Centimeter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centimeter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTIMETER
	 * @model name="centimeter"
	 * @generated
	 * @ordered
	 */
	public static final int CENTIMETER_VALUE = 1;

	/**
	 * The '<em><b>Foot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Foot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOOT
	 * @model name="foot"
	 * @generated
	 * @ordered
	 */
	public static final int FOOT_VALUE = 2;

	/**
	 * The '<em><b>Gallon UK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gallon UK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GALLON_UK
	 * @model name="gallonUK" literal="gallon (UK)"
	 * @generated
	 * @ordered
	 */
	public static final int GALLON_UK_VALUE = 3;

	/**
	 * The '<em><b>Gallon US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gallon US</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GALLON_US
	 * @model name="gallonUS" literal="gallon (US)"
	 * @generated
	 * @ordered
	 */
	public static final int GALLON_US_VALUE = 4;

	/**
	 * The '<em><b>Gram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAM
	 * @model name="gram"
	 * @generated
	 * @ordered
	 */
	public static final int GRAM_VALUE = 5;

	/**
	 * The '<em><b>Hectare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hectare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HECTARE
	 * @model name="hectare"
	 * @generated
	 * @ordered
	 */
	public static final int HECTARE_VALUE = 6;

	/**
	 * The '<em><b>Inch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCH
	 * @model name="inch"
	 * @generated
	 * @ordered
	 */
	public static final int INCH_VALUE = 7;

	/**
	 * The '<em><b>Kilogram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kilogram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KILOGRAM
	 * @model name="kilogram"
	 * @generated
	 * @ordered
	 */
	public static final int KILOGRAM_VALUE = 8;

	/**
	 * The '<em><b>Kilometer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kilometer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KILOMETER
	 * @model name="kilometer"
	 * @generated
	 * @ordered
	 */
	public static final int KILOMETER_VALUE = 9;

	/**
	 * The '<em><b>Liter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Liter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITER
	 * @model name="liter"
	 * @generated
	 * @ordered
	 */
	public static final int LITER_VALUE = 10;

	/**
	 * The '<em><b>Meter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER
	 * @model name="meter"
	 * @generated
	 * @ordered
	 */
	public static final int METER_VALUE = 11;

	/**
	 * The '<em><b>Mile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILE
	 * @model name="mile"
	 * @generated
	 * @ordered
	 */
	public static final int MILE_VALUE = 12;

	/**
	 * The '<em><b>Ounce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ounce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUNCE
	 * @model name="ounce"
	 * @generated
	 * @ordered
	 */
	public static final int OUNCE_VALUE = 13;

	/**
	 * The '<em><b>Pint UK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pint UK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PINT_UK
	 * @model name="pintUK" literal="pint (UK)"
	 * @generated
	 * @ordered
	 */
	public static final int PINT_UK_VALUE = 14;

	/**
	 * The '<em><b>Pint US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pint US</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PINT_US
	 * @model name="pintUS" literal="pint (US)"
	 * @generated
	 * @ordered
	 */
	public static final int PINT_US_VALUE = 15;

	/**
	 * The '<em><b>Pound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pound</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POUND
	 * @model name="pound"
	 * @generated
	 * @ordered
	 */
	public static final int POUND_VALUE = 16;

	/**
	 * The '<em><b>Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT
	 * @model name="unit"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VALUE = 17;

	/**
	 * The '<em><b>Yard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YARD
	 * @model name="yard"
	 * @generated
	 * @ordered
	 */
	public static final int YARD_VALUE = 18;

	/**
	 * An array of all the '<em><b>Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Unit[] VALUES_ARRAY = new Unit[] { ACRE, CENTIMETER,
			FOOT, GALLON_UK, GALLON_US, GRAM, HECTARE, INCH, KILOGRAM,
			KILOMETER, LITER, METER, MILE, OUNCE, PINT_UK, PINT_US, POUND,
			UNIT, YARD, };

	/**
	 * A public read-only list of all the '<em><b>Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Unit> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Unit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Unit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Unit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Unit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Unit get(int value) {
		switch (value) {
		case ACRE_VALUE:
			return ACRE;
		case CENTIMETER_VALUE:
			return CENTIMETER;
		case FOOT_VALUE:
			return FOOT;
		case GALLON_UK_VALUE:
			return GALLON_UK;
		case GALLON_US_VALUE:
			return GALLON_US;
		case GRAM_VALUE:
			return GRAM;
		case HECTARE_VALUE:
			return HECTARE;
		case INCH_VALUE:
			return INCH;
		case KILOGRAM_VALUE:
			return KILOGRAM;
		case KILOMETER_VALUE:
			return KILOMETER;
		case LITER_VALUE:
			return LITER;
		case METER_VALUE:
			return METER;
		case MILE_VALUE:
			return MILE;
		case OUNCE_VALUE:
			return OUNCE;
		case PINT_UK_VALUE:
			return PINT_UK;
		case PINT_US_VALUE:
			return PINT_US;
		case POUND_VALUE:
			return POUND;
		case UNIT_VALUE:
			return UNIT;
		case YARD_VALUE:
			return YARD;
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
	private Unit(int value, String name, String literal) {
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

} //Unit
