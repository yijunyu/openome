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
 * A representation of the model object '<em><b>Manager Of Employee By ID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getStaff <em>Staff</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getManagerOfEmployeeByIDType()
 * @model extendedMetaData="name='managerOfEmployeeByID_._type' kind='elementOnly'"
 * @generated
 */
public interface ManagerOfEmployeeByIDType extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' attribute.
	 * @see #setStaff(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getManagerOfEmployeeByIDType_Staff()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='element' name='staff' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStaff();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getStaff <em>Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff</em>' attribute.
	 * @see #getStaff()
	 * @generated
	 */
	void setStaff(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getManagerOfEmployeeByIDType_Domain()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

} // ManagerOfEmployeeByIDType
