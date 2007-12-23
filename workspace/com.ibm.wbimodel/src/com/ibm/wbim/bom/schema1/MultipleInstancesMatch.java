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
 * A representation of the literals of the enumeration '<em><b>Multiple Instances Match</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMultipleInstancesMatch()
 * @model extendedMetaData="name='MultipleInstancesMatch'"
 * @generated
 */
public final class MultipleInstancesMatch extends AbstractEnumerator {
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
	 * The '<em><b>DELIVER TO ALL INSTANCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIVER TO ALL INSTANCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIVER_TO_ALL_INSTANCES_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIVER_TO_ALL_INSTANCES = 2;

	/**
	 * The '<em><b>DELIVER TO ANY INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIVER TO ANY INSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIVER_TO_ANY_INSTANCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIVER_TO_ANY_INSTANCE = 3;

	/**
	 * The '<em><b>TREAT AS ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREAT_AS_ERROR
	 * @generated
	 * @ordered
	 */
	public static final MultipleInstancesMatch TREAT_AS_ERROR_LITERAL = new MultipleInstancesMatch(TREAT_AS_ERROR, "TREAT_AS_ERROR", "TREAT_AS_ERROR");

	/**
	 * The '<em><b>DISCARD INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARD_INPUT
	 * @generated
	 * @ordered
	 */
	public static final MultipleInstancesMatch DISCARD_INPUT_LITERAL = new MultipleInstancesMatch(DISCARD_INPUT, "DISCARD_INPUT", "DISCARD_INPUT");

	/**
	 * The '<em><b>DELIVER TO ALL INSTANCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVER_TO_ALL_INSTANCES
	 * @generated
	 * @ordered
	 */
	public static final MultipleInstancesMatch DELIVER_TO_ALL_INSTANCES_LITERAL = new MultipleInstancesMatch(DELIVER_TO_ALL_INSTANCES, "DELIVER_TO_ALL_INSTANCES", "DELIVER_TO_ALL_INSTANCES");

	/**
	 * The '<em><b>DELIVER TO ANY INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVER_TO_ANY_INSTANCE
	 * @generated
	 * @ordered
	 */
	public static final MultipleInstancesMatch DELIVER_TO_ANY_INSTANCE_LITERAL = new MultipleInstancesMatch(DELIVER_TO_ANY_INSTANCE, "DELIVER_TO_ANY_INSTANCE", "DELIVER_TO_ANY_INSTANCE");

	/**
	 * An array of all the '<em><b>Multiple Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultipleInstancesMatch[] VALUES_ARRAY =
		new MultipleInstancesMatch[] {
			TREAT_AS_ERROR_LITERAL,
			DISCARD_INPUT_LITERAL,
			DELIVER_TO_ALL_INSTANCES_LITERAL,
			DELIVER_TO_ANY_INSTANCE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiple Instances Match</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case TREAT_AS_ERROR: return TREAT_AS_ERROR_LITERAL;
			case DISCARD_INPUT: return DISCARD_INPUT_LITERAL;
			case DELIVER_TO_ALL_INSTANCES: return DELIVER_TO_ALL_INSTANCES_LITERAL;
			case DELIVER_TO_ANY_INSTANCE: return DELIVER_TO_ANY_INSTANCE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleInstancesMatch(int value, String name, String literal) {
		super(value, name, literal);
	}

} //MultipleInstancesMatch
