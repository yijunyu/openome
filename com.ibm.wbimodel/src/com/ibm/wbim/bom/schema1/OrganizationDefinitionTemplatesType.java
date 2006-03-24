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
 * A representation of the model object '<em><b>Organization Definition Templates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType#getOrganizationDefinitionTemplate <em>Organization Definition Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationDefinitionTemplatesType()
 * @model extendedMetaData="name='organizationDefinitionTemplates_._type' kind='elementOnly'"
 * @generated
 */
public interface OrganizationDefinitionTemplatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Definition Template</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Definition Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Definition Template</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationDefinitionTemplatesType_OrganizationDefinitionTemplate()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='organizationDefinitionTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOrganizationDefinitionTemplate();

} // OrganizationDefinitionTemplatesType
