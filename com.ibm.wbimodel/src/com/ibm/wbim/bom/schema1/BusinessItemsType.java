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
 * A representation of the model object '<em><b>Business Items Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BusinessItemsType#getBusinessItem <em>Business Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBusinessItemsType()
 * @model extendedMetaData="name='businessItems_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessItemsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Item</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBusinessItemsType_BusinessItem()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='businessItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getBusinessItem();

} // BusinessItemsType