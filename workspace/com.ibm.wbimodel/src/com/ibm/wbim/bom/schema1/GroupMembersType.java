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
 * A representation of the model object '<em><b>Group Members Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupMembersType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupMembersType#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupMembersType#isIncludeSubgroups <em>Include Subgroups</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName1 <em>Alternative Name1</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName2 <em>Alternative Name2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupMembersType()
 * @model extendedMetaData="name='groupMembers_._type' kind='elementOnly'"
 * @generated
 */
public interface GroupMembersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupMembersType_Group()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupMembersType_Domain()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Include Subgroups</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Subgroups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Subgroups</em>' attribute.
	 * @see #isSetIncludeSubgroups()
	 * @see #unsetIncludeSubgroups()
	 * @see #setIncludeSubgroups(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupMembersType_IncludeSubgroups()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='includeSubgroups' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIncludeSubgroups();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#isIncludeSubgroups <em>Include Subgroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Subgroups</em>' attribute.
	 * @see #isSetIncludeSubgroups()
	 * @see #unsetIncludeSubgroups()
	 * @see #isIncludeSubgroups()
	 * @generated
	 */
	void setIncludeSubgroups(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#isIncludeSubgroups <em>Include Subgroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeSubgroups()
	 * @see #isIncludeSubgroups()
	 * @see #setIncludeSubgroups(boolean)
	 * @generated
	 */
	void unsetIncludeSubgroups();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#isIncludeSubgroups <em>Include Subgroups</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Subgroups</em>' attribute is set.
	 * @see #unsetIncludeSubgroups()
	 * @see #isIncludeSubgroups()
	 * @see #setIncludeSubgroups(boolean)
	 * @generated
	 */
	boolean isSetIncludeSubgroups();

	/**
	 * Returns the value of the '<em><b>Alternative Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Name1</em>' attribute.
	 * @see #setAlternativeName1(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupMembersType_AlternativeName1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='alternativeName1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlternativeName1();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName1 <em>Alternative Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Name1</em>' attribute.
	 * @see #getAlternativeName1()
	 * @generated
	 */
	void setAlternativeName1(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Name2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Name2</em>' attribute.
	 * @see #setAlternativeName2(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getGroupMembersType_AlternativeName2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='alternativeName2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlternativeName2();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName2 <em>Alternative Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Name2</em>' attribute.
	 * @see #getAlternativeName2()
	 * @generated
	 */
	void setAlternativeName2(String value);

} // GroupMembersType
