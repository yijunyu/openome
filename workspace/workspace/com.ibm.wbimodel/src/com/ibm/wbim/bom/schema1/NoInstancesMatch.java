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
 * A representation of the literals of the enumeration '<em><b>No Instances Match</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNoInstancesMatch()
 * @model extendedMetaData="name='NoInstancesMatch'"
 * @generated
 */
public enum NoInstancesMatch implements Enumerator {
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
	 * The '<em><b>CREATENEWINSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATENEWINSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATENEWINSTANCE(2, "CREATENEWINSTANCE", "CREATE_NEW_INSTANCE");
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
	 * The '<em><b>CREATENEWINSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATENEWINSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATENEWINSTANCE
	 * @model literal="CREATE_NEW_INSTANCE"
	 * @generated
	 * @ordered
	 */
	public static final int CREATENEWINSTANCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>No Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoInstancesMatch[] VALUES_ARRAY = new NoInstancesMatch[] {
			TREATASERROR, DISCARDINPUT, CREATENEWINSTANCE, };

	/**
	 * A public read-only list of all the '<em><b>No Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoInstancesMatch> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>No Instances Match</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoInstancesMatch get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoInstancesMatch result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>No Instances Match</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoInstancesMatch getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoInstancesMatch result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>No Instances Match</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoInstancesMatch get(int value) {
		switch (value) {
		case TREATASERROR_VALUE:
			return TREATASERROR;
		case DISCARDINPUT_VALUE:
			return DISCARDINPUT;
		case CREATENEWINSTANCE_VALUE:
			return CREATENEWINSTANCE;
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
	private NoInstancesMatch(int value, String name, String literal) {
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
