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
 * A representation of the literals of the enumeration '<em><b>Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTypeType1()
 * @model extendedMetaData="name='type_._1_._type'"
 * @generated
 */
public final class TypeType1 extends AbstractEnumerator {
	/**
	 * The '<em><b>REGULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULAR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR = 0;

	/**
	 * The '<em><b>EXCEPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCEPTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTIONAL = 1;

	/**
	 * The '<em><b>STREAMING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STREAMING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREAMING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STREAMING = 2;

	/**
	 * The '<em><b>REGULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @generated
	 * @ordered
	 */
	public static final TypeType1 REGULAR_LITERAL = new TypeType1(REGULAR, "REGULAR", "REGULAR");

	/**
	 * The '<em><b>EXCEPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONAL
	 * @generated
	 * @ordered
	 */
	public static final TypeType1 EXCEPTIONAL_LITERAL = new TypeType1(EXCEPTIONAL, "EXCEPTIONAL", "EXCEPTIONAL");

	/**
	 * The '<em><b>STREAMING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAMING
	 * @generated
	 * @ordered
	 */
	public static final TypeType1 STREAMING_LITERAL = new TypeType1(STREAMING, "STREAMING", "STREAMING");

	/**
	 * An array of all the '<em><b>Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType1[] VALUES_ARRAY =
		new TypeType1[] {
			REGULAR_LITERAL,
			EXCEPTIONAL_LITERAL,
			STREAMING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType1 get(int value) {
		switch (value) {
			case REGULAR: return REGULAR_LITERAL;
			case EXCEPTIONAL: return EXCEPTIONAL_LITERAL;
			case STREAMING: return STREAMING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeType1(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TypeType1
