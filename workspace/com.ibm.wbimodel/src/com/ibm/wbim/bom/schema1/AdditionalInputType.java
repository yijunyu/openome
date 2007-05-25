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
 * A representation of the model object '<em><b>Additional Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.AdditionalInputType#getInputCriterion <em>Input Criterion</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AdditionalInputType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAdditionalInputType()
 * @model extendedMetaData="name='additionalInput_._type' kind='elementOnly'"
 * @generated
 */
public interface AdditionalInputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputCriterionRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Criterion</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAdditionalInputType_InputCriterion()
	 * @model type="com.ibm.wbim.bom.schema1.InputCriterionRef" containment="true"
	 *        extendedMetaData="kind='element' name='inputCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInputCriterion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAdditionalInputType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.AdditionalInputType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AdditionalInputType