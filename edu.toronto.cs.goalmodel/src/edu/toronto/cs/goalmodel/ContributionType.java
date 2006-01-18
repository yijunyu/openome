package edu.toronto.cs.goalmodel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/** @model */
public final class ContributionType extends AbstractEnumerator {
	/** @model name="HELP" */
	public static final int HELP = 1;
	/** @model name="HURT" */
	public static final int HURT = -1;
	/** @model name="MAKE" */
	public static final int MAKE = 2;
	/** @model name="BREAK" */
	public static final int BREAK = -2;
	/**
	 * The '<em><b>HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP
	 * @generated
	 * @ordered
	 */
	public static final ContributionType HELP_LITERAL = new ContributionType(HELP, "HELP");

	/**
	 * The '<em><b>HURT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HURT
	 * @generated
	 * @ordered
	 */
	public static final ContributionType HURT_LITERAL = new ContributionType(HURT, "HURT");

	/**
	 * The '<em><b>MAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE
	 * @generated
	 * @ordered
	 */
	public static final ContributionType MAKE_LITERAL = new ContributionType(MAKE, "MAKE");

	/**
	 * The '<em><b>BREAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @generated
	 * @ordered
	 */
	public static final ContributionType BREAK_LITERAL = new ContributionType(BREAK, "BREAK");

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
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributionType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified value.
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
	private ContributionType(int value, String name) {
		super(value, name);
	}

} 
