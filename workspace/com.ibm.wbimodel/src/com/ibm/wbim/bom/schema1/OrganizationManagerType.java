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
 * A representation of the model object '<em><b>Organization Manager Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationManagerType#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationManagerType()
 * @model extendedMetaData="name='organizationManager_._type' kind='elementOnly'"
 * @generated
 */
public interface OrganizationManagerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationManagerType_Organization()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationManagerType#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

} // OrganizationManagerType
