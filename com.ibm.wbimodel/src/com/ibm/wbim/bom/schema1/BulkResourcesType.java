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
 * A representation of the model object '<em><b>Bulk Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResourcesType#getBulkResource <em>Bulk Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourcesType()
 * @model extendedMetaData="name='bulkResources_._type' kind='elementOnly'"
 * @generated
 */
public interface BulkResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bulk Resource</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.BulkResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResourcesType_BulkResource()
	 * @model type="com.ibm.wbim.bom.schema1.BulkResource" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bulkResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getBulkResource();

} // BulkResourcesType