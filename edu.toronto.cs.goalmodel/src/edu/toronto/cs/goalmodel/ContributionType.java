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
 * A representation of the literals of the enumeration '<em><b>Contribution Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContributionType()
 * @model
 * @generated
 */
public final class ContributionType extends AbstractEnumerator {
	/**
	 * The '<em><b>HELP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HELP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HELP = 1;

	/**
	 * The '<em><b>HURT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HURT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HURT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HURT = -1;

	/**
	 * The '<em><b>MAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAKE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAKE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAKE = 2;

	/**
	 * The '<em><b>BREAK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BREAK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAK_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BREAK = -2;

	/**
	 * The '<em><b>HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP
	 * @generated
	 * @ordered
	 */
	public static final ContributionType HELP_LITERAL = new ContributionType(HELP, "HELP", "HELP");

	/**
	 * The '<em><b>HURT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HURT
	 * @generated
	 * @ordered
	 */
	public static final ContributionType HURT_LITERAL = new ContributionType(HURT, "HURT", "HURT");

	/**
	 * The '<em><b>MAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE
	 * @generated
	 * @ordered
	 */
	public static final ContributionType MAKE_LITERAL = new ContributionType(MAKE, "MAKE", "MAKE");

	/**
	 * The '<em><b>BREAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @generated
	 * @ordered
	 */
	public static final ContributionType BREAK_LITERAL = new ContributionType(BREAK, "BREAK", "BREAK");

	/**
	 * An array of all the '<em><b>Contribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContributionType[] VALUES_ARRAY =
		new ContributionType[] {
			HELP_LITERAL,
			HURT_LITERAL,
			MAKE_LITERAL,
			BREAK_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Contribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType get(int value) {
		switch (value) {
			case HELP: return HELP_LITERAL;
			case HURT: return HURT_LITERAL;
			case MAKE: return MAKE_LITERAL;
			case BREAK: return BREAK_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContributionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ContributionType
