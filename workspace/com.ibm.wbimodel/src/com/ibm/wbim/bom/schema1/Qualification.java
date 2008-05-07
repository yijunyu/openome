/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Qualification#getScopeDimensionValue <em>Scope Dimension Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Qualification#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getQualification()
 * @model extendedMetaData="name='Qualification' kind='elementOnly'"
 * @generated
 */
public interface Qualification extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope Dimension Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ScopeDimensionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Dimension Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Dimension Value</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getQualification_ScopeDimensionValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scopeDimensionValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScopeDimensionValue> getScopeDimensionValue();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getQualification_Role()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Qualification#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // Qualification
