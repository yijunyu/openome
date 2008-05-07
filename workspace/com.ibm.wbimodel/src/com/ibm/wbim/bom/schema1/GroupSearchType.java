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
 * A representation of the model object '<em><b>Group Search Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getIndustryType <em>Industry Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessType <em>Business Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getGeographicLocation <em>Geographic Location</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getAffiliates <em>Affiliates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getManager <em>Manager</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupSearchType#getParentCompany <em>Parent Company</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType()
 * @model extendedMetaData="name='groupSearch_._type' kind='elementOnly'"
 * @generated
 */
public interface GroupSearchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_GroupId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_Profile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Industry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Industry Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry Type</em>' attribute.
	 * @see #setIndustryType(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_IndustryType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='industryType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndustryType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getIndustryType <em>Industry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Industry Type</em>' attribute.
	 * @see #getIndustryType()
	 * @generated
	 */
	void setIndustryType(String value);

	/**
	 * Returns the value of the '<em><b>Business Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Type</em>' attribute.
	 * @see #setBusinessType(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_BusinessType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='businessType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBusinessType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessType <em>Business Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Type</em>' attribute.
	 * @see #getBusinessType()
	 * @generated
	 */
	void setBusinessType(String value);

	/**
	 * Returns the value of the '<em><b>Geographic Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographic Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic Location</em>' attribute.
	 * @see #setGeographicLocation(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_GeographicLocation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='geographicLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeographicLocation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getGeographicLocation <em>Geographic Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic Location</em>' attribute.
	 * @see #getGeographicLocation()
	 * @generated
	 */
	void setGeographicLocation(String value);

	/**
	 * Returns the value of the '<em><b>Affiliates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliates</em>' attribute.
	 * @see #setAffiliates(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_Affiliates()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='affiliates' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAffiliates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getAffiliates <em>Affiliates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliates</em>' attribute.
	 * @see #getAffiliates()
	 * @generated
	 */
	void setAffiliates(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_DisplayName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Secretary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secretary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretary</em>' attribute.
	 * @see #setSecretary(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_Secretary()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='secretary' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecretary();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getSecretary <em>Secretary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secretary</em>' attribute.
	 * @see #getSecretary()
	 * @generated
	 */
	void setSecretary(String value);

	/**
	 * Returns the value of the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assistant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistant</em>' attribute.
	 * @see #setAssistant(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_Assistant()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='assistant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssistant();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getAssistant <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant</em>' attribute.
	 * @see #getAssistant()
	 * @generated
	 */
	void setAssistant(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_Manager()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='manager' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(String value);

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute.
	 * @see #setBusinessCategory(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_BusinessCategory()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='businessCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBusinessCategory();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessCategory <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Category</em>' attribute.
	 * @see #getBusinessCategory()
	 * @generated
	 */
	void setBusinessCategory(String value);

	/**
	 * Returns the value of the '<em><b>Parent Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Company</em>' attribute.
	 * @see #setParentCompany(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupSearchType_ParentCompany()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='parentCompany' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParentCompany();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getParentCompany <em>Parent Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Company</em>' attribute.
	 * @see #getParentCompany()
	 * @generated
	 */
	void setParentCompany(String value);

} // GroupSearchType
