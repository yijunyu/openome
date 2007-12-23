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
 * A representation of the model object '<em><b>Criteria Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the resource search criteria for assigning task resources when the resource type is the "Staff" or "Person" predefined resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployee <em>Manager Of Employee</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployeeByID <em>Manager Of Employee By ID</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonSearch <em>Person Search</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupMembers <em>Group Members</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupSearch <em>Group Search</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getOrganizationManager <em>Organization Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate()
 * @model extendedMetaData="name='CriteriaTemplate' kind='elementOnly'"
 * @generated
 */
public interface CriteriaTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Manager Of Employee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Of Employee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Of Employee</em>' containment reference.
	 * @see #setManagerOfEmployee(ManagerOfEmployeeType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_ManagerOfEmployee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managerOfEmployee' namespace='##targetNamespace'"
	 * @generated
	 */
	ManagerOfEmployeeType getManagerOfEmployee();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployee <em>Manager Of Employee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Of Employee</em>' containment reference.
	 * @see #getManagerOfEmployee()
	 * @generated
	 */
	void setManagerOfEmployee(ManagerOfEmployeeType value);

	/**
	 * Returns the value of the '<em><b>Manager Of Employee By ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Of Employee By ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Of Employee By ID</em>' containment reference.
	 * @see #setManagerOfEmployeeByID(ManagerOfEmployeeByIDType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_ManagerOfEmployeeByID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managerOfEmployeeByID' namespace='##targetNamespace'"
	 * @generated
	 */
	ManagerOfEmployeeByIDType getManagerOfEmployeeByID();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployeeByID <em>Manager Of Employee By ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Of Employee By ID</em>' containment reference.
	 * @see #getManagerOfEmployeeByID()
	 * @generated
	 */
	void setManagerOfEmployeeByID(ManagerOfEmployeeByIDType value);

	/**
	 * Returns the value of the '<em><b>Person Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Search</em>' containment reference.
	 * @see #setPersonSearch(PersonSearchType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_PersonSearch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personSearch' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonSearchType getPersonSearch();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonSearch <em>Person Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Search</em>' containment reference.
	 * @see #getPersonSearch()
	 * @generated
	 */
	void setPersonSearch(PersonSearchType value);

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference.
	 * @see #setPersonName(PersonNameType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_PersonName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personName' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonNameType getPersonName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonName <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' containment reference.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(PersonNameType value);

	/**
	 * Returns the value of the '<em><b>Group Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Members</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Members</em>' containment reference.
	 * @see #setGroupMembers(GroupMembersType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_GroupMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupMembersType getGroupMembers();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupMembers <em>Group Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Members</em>' containment reference.
	 * @see #getGroupMembers()
	 * @generated
	 */
	void setGroupMembers(GroupMembersType value);

	/**
	 * Returns the value of the '<em><b>Group Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Search</em>' containment reference.
	 * @see #setGroupSearch(GroupSearchType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_GroupSearch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupSearch' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupSearchType getGroupSearch();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupSearch <em>Group Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Search</em>' containment reference.
	 * @see #getGroupSearch()
	 * @generated
	 */
	void setGroupSearch(GroupSearchType value);

	/**
	 * Returns the value of the '<em><b>Organization Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Manager</em>' containment reference.
	 * @see #setOrganizationManager(OrganizationManagerType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCriteriaTemplate_OrganizationManager()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationManager' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationManagerType getOrganizationManager();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getOrganizationManager <em>Organization Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Manager</em>' containment reference.
	 * @see #getOrganizationManager()
	 * @generated
	 */
	void setOrganizationManager(OrganizationManagerType value);

} // CriteriaTemplate
