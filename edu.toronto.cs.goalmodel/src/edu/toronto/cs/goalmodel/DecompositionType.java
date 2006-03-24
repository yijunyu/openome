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
 * A representation of the literals of the enumeration '<em><b>Decomposition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getDecompositionType()
 * @model
 * @generated
 */
public final class DecompositionType extends AbstractEnumerator {
	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR = 0;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND = 1;

	/**
	 * The '<em><b>LEAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEAF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAF_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEAF = 2;

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @generated
	 * @ordered
	 */
	public static final DecompositionType OR_LITERAL = new DecompositionType(OR, "OR");

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @generated
	 * @ordered
	 */
	public static final DecompositionType AND_LITERAL = new DecompositionType(AND, "AND");

	/**
	 * The '<em><b>LEAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF
	 * @generated
	 * @ordered
	 */
	public static final DecompositionType LEAF_LITERAL = new DecompositionType(LEAF, "LEAF");

	/**
	 * An array of all the '<em><b>Decomposition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecompositionType[] VALUES_ARRAY =
		new DecompositionType[] {
			OR_LITERAL,
			AND_LITERAL,
			LEAF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Decomposition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decomposition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecompositionType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecompositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decomposition Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecompositionType get(int value) {
		switch (value) {
			case OR: return OR_LITERAL;
			case AND: return AND_LITERAL;
			case LEAF: return LEAF_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DecompositionType(int value, String name) {
		super(value, name);
	}

} //DecompositionType
