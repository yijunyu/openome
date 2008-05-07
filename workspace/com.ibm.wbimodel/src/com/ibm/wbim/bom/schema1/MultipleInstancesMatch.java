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
 * A representation of the literals of the enumeration '<em><b>Multiple Instances Match</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMultipleInstancesMatch()
 * @model extendedMetaData="name='MultipleInstancesMatch'"
 * @generated
 */
public enum MultipleInstancesMatch implements Enumerator {
	/**
	 * The '<em><b>TREATASERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATASERROR_VALUE
	 * @generated
	 * @ordered
	 */
	TREATASERROR(0, "TREATASERROR", "TREAT_AS_ERROR"),
	/**
	 * The '<em><b>DISCARDINPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARDINPUT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCARDINPUT(1, "DISCARDINPUT", "DISCARD_INPUT"),
	/**
	 * The '<em><b>DELIVERTOALLINSTANCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERTOALLINSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERTOALLINSTANCES(2, "DELIVERTOALLINSTANCES",
			"DELIVER_TO_ALL_INSTANCES"),
	/**
	 * The '<em><b>DELIVERTOANYINSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERTOANYINSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERTOANYINSTANCE(3, "DELIVERTOANYINSTANCE", "DELIVER_TO_ANY_INSTANCE");
	/**
	 * The '<em><b>TREATASERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TREATASERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATASERROR
	 * @model literal="TREAT_AS_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int TREATASERROR_VALUE = 0;

	/**
	 * The '<em><b>DISCARDINPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCARDINPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCARDINPUT
	 * @model literal="DISCARD_INPUT"
	 * @generated
	 * @ordered
	 */
	public static final int DISCARDINPUT_VALUE = 1;

	/**
	 * The '<em><b>DELIVERTOALLINSTANCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIVERTOALLINSTANCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIVERTOALLINSTANCES
	 * @model literal="DELIVER_TO_ALL_INSTANCES"
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERTOALLINSTANCES_VALUE = 2;

	/**
	 * The '<em><b>DELIVERTOANYINSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIVERTOANYINSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIVERTOANYINSTANCE
	 * @model literal="DELIVER_TO_ANY_INSTANCE"
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERTOANYINSTANCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiple Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultipleInstancesMatch[] VALUES_ARRAY = new MultipleInstancesMatch[] {
			TREATASERROR, DISCARDINPUT, DELIVERTOALLINSTANCES,
			DELIVERTOANYINSTANCE, };

	/**
	 * A public read-only list of all the '<em><b>Multiple Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultipleInstancesMatch> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiple Instances Match</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleInstancesMatch get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleInstancesMatch result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Instances Match</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleInstancesMatch getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleInstancesMatch result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Instances Match</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleInstancesMatch get(int value) {
		switch (value) {
		case TREATASERROR_VALUE:
			return TREATASERROR;
		case DISCARDINPUT_VALUE:
			return DISCARDINPUT;
		case DELIVERTOALLINSTANCES_VALUE:
			return DELIVERTOALLINSTANCES;
		case DELIVERTOANYINSTANCE_VALUE:
			return DELIVERTOANYINSTANCE;
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
	private MultipleInstancesMatch(int value, String name, String literal) {
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
}
