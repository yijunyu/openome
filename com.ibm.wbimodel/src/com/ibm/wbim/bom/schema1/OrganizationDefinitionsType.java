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
 * A representation of the model object '<em><b>Organization Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionsType#getOrganizationDefinition <em>Organization Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationDefinitionsType()
 * @model extendedMetaData="name='organizationDefinitions_._type' kind='elementOnly'"
 * @generated
 */
public interface OrganizationDefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Definition</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Definition</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationDefinitionsType_OrganizationDefinition()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='organizationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOrganizationDefinition();

} // OrganizationDefinitionsType