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
 * A representation of the model object '<em><b>Input Constant Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputConstantValue#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputConstantValue#getPublicInstance <em>Public Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputConstantValue()
 * @model extendedMetaData="name='InputConstantValue' kind='elementOnly'"
 * @generated
 */
public interface InputConstantValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputConstantValue_LiteralValue()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='literalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getLiteralValue();

	/**
	 * Returns the value of the '<em><b>Public Instance</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.PublicInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Instance</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputConstantValue_PublicInstance()
	 * @model type="com.ibm.wbim.bom.schema1.PublicInstance" containment="true"
	 *        extendedMetaData="kind='element' name='publicInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getPublicInstance();

} // InputConstantValue
