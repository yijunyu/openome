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
 * A representation of the model object '<em><b>Extended Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ExtendedAttributes#getExtendedAttribute <em>Extended Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getExtendedAttributes()
 * @model extendedMetaData="name='ExtendedAttributes' kind='elementOnly'"
 * @generated
 */
public interface ExtendedAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ExtendedAttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Attribute</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getExtendedAttributes_ExtendedAttribute()
	 * @model type="com.ibm.wbim.bom.schema1.ExtendedAttributeType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='extendedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getExtendedAttribute();

} // ExtendedAttributes
