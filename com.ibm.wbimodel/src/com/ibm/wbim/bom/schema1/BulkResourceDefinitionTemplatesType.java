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
 * A representation of the model object '<em><b>Bulk Resource Definition Templates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType#getBulkResourceDefinitionTemplate <em>Bulk Resource Definition Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceDefinitionTemplatesType()
 * @model extendedMetaData="name='bulkResourceDefinitionTemplates_._type' kind='elementOnly'"
 * @generated
 */
public interface BulkResourceDefinitionTemplatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bulk Resource Definition Template</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource Definition Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource Definition Template</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourceDefinitionTemplatesType_BulkResourceDefinitionTemplate()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bulkResourceDefinitionTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getBulkResourceDefinitionTemplate();

} // BulkResourceDefinitionTemplatesType