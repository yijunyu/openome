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
 * A representation of the literals of the enumeration '<em><b>No Instances Match</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNoInstancesMatch()
 * @model extendedMetaData="name='NoInstancesMatch'"
 * @generated
 */
public final class NoInstancesMatch extends AbstractEnumerator {
	/**
	 * The '<em><b>TREAT AS ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TREAT AS ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREAT_AS_ERROR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TREAT_AS_ERROR = 0;

	/**
	 * The '<em><b>DISCARD INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCARD INPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCARD_INPUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCARD_INPUT = 1;

	/**
	 * The '<em><b>CREATE NEW INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE NEW INSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_NEW_INSTANCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_NEW_INSTANCE = 2;

	/**
	 * The '<em><b>TREAT AS ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREAT_AS_ERROR
	 * @generated
	 * @ordered
	 */
	public static final NoInstancesMatch TREAT_AS_ERROR_LITERAL = new NoInstancesMatch(TREAT_AS_ERROR, "TREAT_AS_ERROR", "TREAT_AS_ERROR");

	/**
	 * The '<em><b>DISCARD INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARD_INPUT
	 * @generated
	 * @ordered
	 */
	public static final NoInstancesMatch DISCARD_INPUT_LITERAL = new NoInstancesMatch(DISCARD_INPUT, "DISCARD_INPUT", "DISCARD_INPUT");

	/**
	 * The '<em><b>CREATE NEW INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_NEW_INSTANCE
	 * @generated
	 * @ordered
	 */
	public static final NoInstancesMatch CREATE_NEW_INSTANCE_LITERAL = new NoInstancesMatch(CREATE_NEW_INSTANCE, "CREATE_NEW_INSTANCE", "CREATE_NEW_INSTANCE");

	/**
	 * An array of all the '<em><b>No Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoInstancesMatch[] VALUES_ARRAY =
		new NoInstancesMatch[] {
			TREAT_AS_ERROR_LITERAL,
			DISCARD_INPUT_LITERAL,
			CREATE_NEW_INSTANCE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>No Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case TREAT_AS_ERROR: return TREAT_AS_ERROR_LITERAL;
			case DISCARD_INPUT: return DISCARD_INPUT_LITERAL;
			case CREATE_NEW_INSTANCE: return CREATE_NEW_INSTANCE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NoInstancesMatch(int value, String name, String literal) {
		super(value, name, literal);
	}

} //NoInstancesMatch
