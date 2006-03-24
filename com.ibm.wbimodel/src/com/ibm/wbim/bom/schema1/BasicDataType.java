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

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Basic Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Modeler predefined basic types
 * <!-- end-model-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBasicDataType()
 * @model
 * @generated
 */
public final class BasicDataType extends AbstractEnumerator {
	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model name="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 0;

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE_LITERAL
	 * @model name="Byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE = 1;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_LITERAL
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE = 2;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_LITERAL
	 * @model name="DateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME = 3;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model name="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 4;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Duration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DURATION_LITERAL
	 * @model name="Duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION = 5;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT_LITERAL
	 * @model name="Float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT = 6;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model name="Integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 7;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_LITERAL
	 * @model name="Long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG = 8;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT_LITERAL
	 * @model name="Short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT = 9;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 10;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_LITERAL
	 * @model name="Time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 11;

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType BOOLEAN_LITERAL = new BasicDataType(BOOLEAN, "Boolean");

	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType BYTE_LITERAL = new BasicDataType(BYTE, "Byte");

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType DATE_LITERAL = new BasicDataType(DATE, "Date");

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType DATE_TIME_LITERAL = new BasicDataType(DATE_TIME, "DateTime");

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType DOUBLE_LITERAL = new BasicDataType(DOUBLE, "Double");

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType DURATION_LITERAL = new BasicDataType(DURATION, "Duration");

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType FLOAT_LITERAL = new BasicDataType(FLOAT, "Float");

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType INTEGER_LITERAL = new BasicDataType(INTEGER, "Integer");

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType LONG_LITERAL = new BasicDataType(LONG, "Long");

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType SHORT_LITERAL = new BasicDataType(SHORT, "Short");

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType STRING_LITERAL = new BasicDataType(STRING, "String");

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	public static final BasicDataType TIME_LITERAL = new BasicDataType(TIME, "Time");

	/**
	 * An array of all the '<em><b>Basic Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasicDataType[] VALUES_ARRAY =
		new BasicDataType[] {
			BOOLEAN_LITERAL,
			BYTE_LITERAL,
			DATE_LITERAL,
			DATE_TIME_LITERAL,
			DOUBLE_LITERAL,
			DURATION_LITERAL,
			FLOAT_LITERAL,
			INTEGER_LITERAL,
			LONG_LITERAL,
			SHORT_LITERAL,
			STRING_LITERAL,
			TIME_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Basic Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basic Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicDataType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicDataType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Data Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicDataType get(int value) {
		switch (value) {
			case BOOLEAN: return BOOLEAN_LITERAL;
			case BYTE: return BYTE_LITERAL;
			case DATE: return DATE_LITERAL;
			case DATE_TIME: return DATE_TIME_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
			case DURATION: return DURATION_LITERAL;
			case FLOAT: return FLOAT_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
			case LONG: return LONG_LITERAL;
			case SHORT: return SHORT_LITERAL;
			case STRING: return STRING_LITERAL;
			case TIME: return TIME_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BasicDataType(int value, String name) {
		super(value, name);
	}

} //BasicDataType
