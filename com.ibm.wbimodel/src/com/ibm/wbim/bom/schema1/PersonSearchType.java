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
 * A representation of the model object '<em><b>Person Search Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getEMail <em>EMail</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getCompany <em>Company</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getManager <em>Manager</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getDepartment <em>Department</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getTaxPayerId <em>Tax Payer Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getPhone <em>Phone</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getFax <em>Fax</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getGender <em>Gender</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonSearchType#getPreferredLanguage <em>Preferred Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType()
 * @model extendedMetaData="name='personSearch_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonSearchType extends EObject {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_UserId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='userId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Profile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_LastName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='lastName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_FirstName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='firstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_MiddleName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='middleName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_EMail()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='e-Mail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEMail();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(String value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Company()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='company' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_DisplayName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Secretary()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='secretary' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecretary();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getSecretary <em>Secretary</em>}' attribute.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Assistant()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='assistant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssistant();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getAssistant <em>Assistant</em>}' attribute.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Manager()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='manager' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Department()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='element' name='department' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #setEmployeeId(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_EmployeeId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='employeeId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmployeeId();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #getEmployeeId()
	 * @generated
	 */
	void setEmployeeId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Payer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Payer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer Id</em>' attribute.
	 * @see #setTaxPayerId(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_TaxPayerId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='taxPayerId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxPayerId();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getTaxPayerId <em>Tax Payer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payer Id</em>' attribute.
	 * @see #getTaxPayerId()
	 * @generated
	 */
	void setTaxPayerId(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Phone()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Fax()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='fax' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_Gender()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone</em>' attribute.
	 * @see #setTimeZone(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_TimeZone()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='timeZone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTimeZone();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getTimeZone <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone</em>' attribute.
	 * @see #getTimeZone()
	 * @generated
	 */
	void setTimeZone(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Language</em>' attribute.
	 * @see #setPreferredLanguage(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonSearchType_PreferredLanguage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='preferred_language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPreferredLanguage();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getPreferredLanguage <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Language</em>' attribute.
	 * @see #getPreferredLanguage()
	 * @generated
	 */
	void setPreferredLanguage(String value);

} // PersonSearchType