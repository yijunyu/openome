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
 * A representation of the model object '<em><b>Business Item Templates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BusinessItemTemplatesType#getBusinessItemTemplate <em>Business Item Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBusinessItemTemplatesType()
 * @model extendedMetaData="name='businessItemTemplates_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessItemTemplatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Item Template</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Template</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBusinessItemTemplatesType_BusinessItemTemplate()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='businessItemTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getBusinessItemTemplate();

} // BusinessItemTemplatesType
