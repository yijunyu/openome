package edu.toronto.cs.goalmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/** @model */
public final class ActorType extends AbstractEnumerator {
	/** @model name="ACTOR" */
	public static final int ACTOR = 0;
	/** @model name="AGENT" */
	public static final int AGENT = 1;
	/** @model name="ROLE" */
	public static final int ROLE = 2;
	/** @model name="POSITION" */
	public static final int POSITION = 3;
	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @generated
	 * @ordered
	 */
	public static final ActorType ACTOR_LITERAL = new ActorType(ACTOR, "ACTOR");

	/**
	 * The '<em><b>AGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT
	 * @generated
	 * @ordered
	 */
	public static final ActorType AGENT_LITERAL = new ActorType(AGENT, "AGENT");

	/**
	 * The '<em><b>ROLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE
	 * @generated
	 * @ordered
	 */
	public static final ActorType ROLE_LITERAL = new ActorType(ROLE, "ROLE");

	/**
	 * The '<em><b>POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION
	 * @generated
	 * @ordered
	 */
	public static final ActorType POSITION_LITERAL = new ActorType(POSITION, "POSITION");

	/**
	 * An array of all the '<em><b>Actor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActorType[] VALUES_ARRAY =
		new ActorType[] {
			ACTOR_LITERAL,
			AGENT_LITERAL,
			ROLE_LITERAL,
			POSITION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Actor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActorType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActorType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActorType get(int value) {
		switch (value) {
			case ACTOR: return ACTOR_LITERAL;
			case AGENT: return AGENT_LITERAL;
			case ROLE: return ROLE_LITERAL;
			case POSITION: return POSITION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActorType(int value, String name) {
		super(value, name);
	}

}
