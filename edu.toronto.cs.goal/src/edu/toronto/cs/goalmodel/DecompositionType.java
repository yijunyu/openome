package edu.toronto.cs.goalmodel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/** @model */
public final class DecompositionType extends AbstractEnumerator {
	/** @model name="OR" */
	public static final int OR = 0;
	/** @model name="AND" */
	public static final int AND = 1;
	/** @model name="LEAF" */
	public static final int LEAF = 2;
	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @generated
	 * @ordered
	 */
	public static final DecompositionType OR_LITERAL = new DecompositionType(OR, "OR", "OR");

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @generated
	 * @ordered
	 */
	public static final DecompositionType AND_LITERAL = new DecompositionType(AND, "AND", "AND");

	/**
	 * The '<em><b>LEAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF
	 * @generated
	 * @ordered
	 */
	public static final DecompositionType LEAF_LITERAL = new DecompositionType(LEAF, "LEAF", "LEAF");

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
	 * Returns the '<em><b>Decomposition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecompositionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecompositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decomposition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecompositionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecompositionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decomposition Type</b></em>' literal with the specified integer value.
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
	private DecompositionType(int value, String name, String literal) {
		super(value, name, literal);
	}

}
