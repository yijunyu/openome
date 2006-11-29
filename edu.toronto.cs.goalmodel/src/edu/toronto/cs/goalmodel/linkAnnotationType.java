/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>link Annotation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getlinkAnnotationType()
 * @model
 * @generated
 */
public final class linkAnnotationType extends AbstractEnumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>CONDITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONDITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION = 1;

	/**
	 * The '<em><b>WHILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE = 2;

	/**
	 * The '<em><b>GUARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARD_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUARD = 3;

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final linkAnnotationType NONE_LITERAL = new linkAnnotationType(NONE, "NONE", "NONE");

	/**
	 * The '<em><b>CONDITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION
	 * @generated
	 * @ordered
	 */
	public static final linkAnnotationType CONDITION_LITERAL = new linkAnnotationType(CONDITION, "CONDITION", "CONDITION");

	/**
	 * The '<em><b>WHILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE
	 * @generated
	 * @ordered
	 */
	public static final linkAnnotationType WHILE_LITERAL = new linkAnnotationType(WHILE, "WHILE", "WHILE");

	/**
	 * The '<em><b>GUARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARD
	 * @generated
	 * @ordered
	 */
	public static final linkAnnotationType GUARD_LITERAL = new linkAnnotationType(GUARD, "GUARD", "GUARD");

	/**
	 * An array of all the '<em><b>link Annotation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final linkAnnotationType[] VALUES_ARRAY =
		new linkAnnotationType[] {
			NONE_LITERAL,
			CONDITION_LITERAL,
			WHILE_LITERAL,
			GUARD_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>link Annotation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>link Annotation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static linkAnnotationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			linkAnnotationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>link Annotation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static linkAnnotationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			linkAnnotationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>link Annotation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static linkAnnotationType get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case CONDITION: return CONDITION_LITERAL;
			case WHILE: return WHILE_LITERAL;
			case GUARD: return GUARD_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private linkAnnotationType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //linkAnnotationType
