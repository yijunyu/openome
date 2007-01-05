/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TRoles</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage#getTRoles()
 * @model
 * @generated
 */
public final class TRoles extends AbstractEnumerator {
	/**
	 * The '<em><b>My Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_ROLE_LITERAL
	 * @model name="myRole"
	 * @generated
	 * @ordered
	 */
	public static final int MY_ROLE = 0;

	/**
	 * The '<em><b>Partner Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partner Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTNER_ROLE_LITERAL
	 * @model name="partnerRole"
	 * @generated
	 * @ordered
	 */
	public static final int PARTNER_ROLE = 1;

	/**
	 * The '<em><b>My Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_ROLE
	 * @generated
	 * @ordered
	 */
	public static final TRoles MY_ROLE_LITERAL = new TRoles(MY_ROLE, "myRole");

	/**
	 * The '<em><b>Partner Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTNER_ROLE
	 * @generated
	 * @ordered
	 */
	public static final TRoles PARTNER_ROLE_LITERAL = new TRoles(PARTNER_ROLE, "partnerRole");

	/**
	 * An array of all the '<em><b>TRoles</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TRoles[] VALUES_ARRAY =
		new TRoles[] {
			MY_ROLE_LITERAL,
			PARTNER_ROLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>TRoles</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TRoles</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRoles get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRoles result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRoles</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRoles get(int value) {
		switch (value) {
			case MY_ROLE: return MY_ROLE_LITERAL;
			case PARTNER_ROLE: return PARTNER_ROLE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TRoles(int value, String name) {
		super(value, name);
	}

} //TRoles
