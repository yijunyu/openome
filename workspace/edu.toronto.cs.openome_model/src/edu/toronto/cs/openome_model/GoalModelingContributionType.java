/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Goal Modeling Contribution Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.openome_model.openome_modelPackage#getGoalModelingContributionType()
 * @model
 * @generated
 */
public enum GoalModelingContributionType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Plus Plus Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_PLUS_SAT_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_PLUS_SAT(1, "PlusPlusSat", ""),

	/**
	 * The '<em><b>Plus Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_SAT_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_SAT(2, "PlusSat", "PlusSat"),

	/**
	 * The '<em><b>Minus Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_SAT_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_SAT(3, "MinusSat", "MinusSat"),

	/**
	 * The '<em><b>Minus Minus Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_MINUS_SAT_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_MINUS_SAT(4, "MinusMinusSat", "MinusMinusSat"),

	/**
	 * The '<em><b>Plus Plus Den</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_PLUS_DEN_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_PLUS_DEN(5, "PlusPlusDen", "PlusPlusDen"),

	/**
	 * The '<em><b>Plus Den</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_DEN_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_DEN(6, "PlusDen", "PlusDen"),

	/**
	 * The '<em><b>Minus Den</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_DEN_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_DEN(7, "MinusDen", "MinusDen"),

	/**
	 * The '<em><b>Minus Minus Den</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_MINUS_DEN_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_MINUS_DEN(8, "MinusMinusDen", "MinusMinusDen");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Plus Plus Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus Plus Sat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_PLUS_SAT
	 * @model name="PlusPlusSat" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_PLUS_SAT_VALUE = 1;

	/**
	 * The '<em><b>Plus Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus Sat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_SAT
	 * @model name="PlusSat"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_SAT_VALUE = 2;

	/**
	 * The '<em><b>Minus Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus Sat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_SAT
	 * @model name="MinusSat"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_SAT_VALUE = 3;

	/**
	 * The '<em><b>Minus Minus Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus Minus Sat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_MINUS_SAT
	 * @model name="MinusMinusSat"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_MINUS_SAT_VALUE = 4;

	/**
	 * The '<em><b>Plus Plus Den</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus Plus Den</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_PLUS_DEN
	 * @model name="PlusPlusDen"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_PLUS_DEN_VALUE = 5;

	/**
	 * The '<em><b>Plus Den</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus Den</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_DEN
	 * @model name="PlusDen"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_DEN_VALUE = 6;

	/**
	 * The '<em><b>Minus Den</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus Den</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_DEN
	 * @model name="MinusDen"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_DEN_VALUE = 7;

	/**
	 * The '<em><b>Minus Minus Den</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus Minus Den</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_MINUS_DEN
	 * @model name="MinusMinusDen"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_MINUS_DEN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Goal Modeling Contribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalModelingContributionType[] VALUES_ARRAY =
		new GoalModelingContributionType[] {
			NONE,
			PLUS_PLUS_SAT,
			PLUS_SAT,
			MINUS_SAT,
			MINUS_MINUS_SAT,
			PLUS_PLUS_DEN,
			PLUS_DEN,
			MINUS_DEN,
			MINUS_MINUS_DEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Modeling Contribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalModelingContributionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Modeling Contribution Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoalModelingContributionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalModelingContributionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Modeling Contribution Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoalModelingContributionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalModelingContributionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Modeling Contribution Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoalModelingContributionType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case PLUS_PLUS_SAT_VALUE: return PLUS_PLUS_SAT;
			case PLUS_SAT_VALUE: return PLUS_SAT;
			case MINUS_SAT_VALUE: return MINUS_SAT;
			case MINUS_MINUS_SAT_VALUE: return MINUS_MINUS_SAT;
			case PLUS_PLUS_DEN_VALUE: return PLUS_PLUS_DEN;
			case PLUS_DEN_VALUE: return PLUS_DEN;
			case MINUS_DEN_VALUE: return MINUS_DEN;
			case MINUS_MINUS_DEN_VALUE: return MINUS_MINUS_DEN;
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
	private GoalModelingContributionType(int value, String name, String literal) {
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
	
} //GoalModelingContributionType
