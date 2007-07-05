/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import javax.xml.datatype.Duration;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.RoleRequirement#getResourceQuantity <em>Resource Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RoleRequirement#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RoleRequirement#getRole <em>Role</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RoleRequirement#getTimeRequired <em>Time Required</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RoleRequirement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRoleRequirement()
 * @model extendedMetaData="name='RoleRequirement' kind='elementOnly'"
 * @generated
 */
public interface RoleRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Quantity</em>' containment reference.
	 * @see #setResourceQuantity(Quantity)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRoleRequirement_ResourceQuantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resourceQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getResourceQuantity();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getResourceQuantity <em>Resource Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Quantity</em>' containment reference.
	 * @see #getResourceQuantity()
	 * @generated
	 */
	void setResourceQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRoleRequirement_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRoleRequirement_Role()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Required</em>' attribute.
	 * @see #setTimeRequired(Duration)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRoleRequirement_TimeRequired()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeRequired'"
	 * @generated
	 */
	Duration getTimeRequired();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getTimeRequired <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Required</em>' attribute.
	 * @see #getTimeRequired()
	 * @generated
	 */
	void setTimeRequired(Duration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRoleRequirement_Type()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RoleRequirement
