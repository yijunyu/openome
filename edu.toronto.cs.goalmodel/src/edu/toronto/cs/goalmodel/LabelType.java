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
 * A representation of the literals of the enumeration '<em><b>Label Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getLabelType()
 * @model
 * @generated
 */
public final class LabelType extends AbstractEnumerator {
	/**
	 * The '<em><b>Satisfied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Satisfied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATISFIED_LITERAL
	 * @model name="Satisfied"
	 * @generated
	 * @ordered
	 */
	public static final int SATISFIED = 2;

	/**
	 * The '<em><b>Denied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Denied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENIED_LITERAL
	 * @model name="Denied"
	 * @generated
	 * @ordered
	 */
	public static final int DENIED = -2;

	/**
	 * The '<em><b>Partially Satisfied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partially Satisfied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_SATISFIED_LITERAL
	 * @model name="PartiallySatisfied"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_SATISFIED = 1;

	/**
	 * The '<em><b>Partially Denied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partially Denied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_DENIED_LITERAL
	 * @model name="PartiallyDenied"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_DENIED = -1;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_LITERAL
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN = 0;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conflict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_LITERAL
	 * @model name="Conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT = 4;

	/**
	 * The '<em><b>Satisfied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATISFIED
	 * @generated
	 * @ordered
	 */
	public static final LabelType SATISFIED_LITERAL = new LabelType(SATISFIED, "Satisfied");

	/**
	 * The '<em><b>Denied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIED
	 * @generated
	 * @ordered
	 */
	public static final LabelType DENIED_LITERAL = new LabelType(DENIED, "Denied");

	/**
	 * The '<em><b>Partially Satisfied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_SATISFIED
	 * @generated
	 * @ordered
	 */
	public static final LabelType PARTIALLY_SATISFIED_LITERAL = new LabelType(PARTIALLY_SATISFIED, "PartiallySatisfied");

	/**
	 * The '<em><b>Partially Denied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_DENIED
	 * @generated
	 * @ordered
	 */
	public static final LabelType PARTIALLY_DENIED_LITERAL = new LabelType(PARTIALLY_DENIED, "PartiallyDenied");

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @generated
	 * @ordered
	 */
	public static final LabelType UNKNOWN_LITERAL = new LabelType(UNKNOWN, "Unknown");

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @generated
	 * @ordered
	 */
	public static final LabelType CONFLICT_LITERAL = new LabelType(CONFLICT, "Conflict");

	/**
	 * An array of all the '<em><b>Label Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LabelType[] VALUES_ARRAY =
		new LabelType[] {
			SATISFIED_LITERAL,
			DENIED_LITERAL,
			PARTIALLY_SATISFIED_LITERAL,
			PARTIALLY_DENIED_LITERAL,
			UNKNOWN_LITERAL,
			CONFLICT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Label Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelType get(int value) {
		switch (value) {
			case SATISFIED: return SATISFIED_LITERAL;
			case DENIED: return DENIED_LITERAL;
			case PARTIALLY_SATISFIED: return PARTIALLY_SATISFIED_LITERAL;
			case PARTIALLY_DENIED: return PARTIALLY_DENIED_LITERAL;
			case UNKNOWN: return UNKNOWN_LITERAL;
			case CONFLICT: return CONFLICT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LabelType(int value, String name) {
		super(value, name);
	}

} //LabelType
