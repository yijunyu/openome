/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bulk Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getResourceQuantity <em>Resource Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getBulkResource <em>Bulk Resource</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getTimeRequired <em>Time Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceRequirement()
 * @model extendedMetaData="name='BulkResourceRequirement' kind='elementOnly'"
 * @generated
 */
public interface BulkResourceRequirement extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceRequirement_ResourceQuantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resourceQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getResourceQuantity();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getResourceQuantity <em>Resource Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Quantity</em>' containment reference.
	 * @see #getResourceQuantity()
	 * @generated
	 */
	void setResourceQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Bulk Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource</em>' attribute.
	 * @see #setBulkResource(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceRequirement_BulkResource()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='bulkResource'"
	 * @generated
	 */
	String getBulkResource();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getBulkResource <em>Bulk Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Resource</em>' attribute.
	 * @see #getBulkResource()
	 * @generated
	 */
	void setBulkResource(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceRequirement_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Required</em>' attribute.
	 * @see #setTimeRequired(Object)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceRequirement_TimeRequired()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeRequired'"
	 * @generated
	 */
	Object getTimeRequired();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getTimeRequired <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Required</em>' attribute.
	 * @see #getTimeRequired()
	 * @generated
	 */
	void setTimeRequired(Object value);

} // BulkResourceRequirement
