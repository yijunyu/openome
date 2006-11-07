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
 * A representation of the model object '<em><b>Business Item Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BusinessItemInstancesType#getBusinessItemInstance <em>Business Item Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBusinessItemInstancesType()
 * @model extendedMetaData="name='businessItemInstances_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessItemInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Item Instance</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Instance</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBusinessItemInstancesType_BusinessItemInstance()
	 * @model type="com.ibm.wbim.bom.schema1.ComplexDataTypeInstance" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='businessItemInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getBusinessItemInstance();

} // BusinessItemInstancesType