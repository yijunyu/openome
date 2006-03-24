/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.EntryPointType#getInputCriterion <em>Input Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getEntryPointType()
 * @model extendedMetaData="name='entryPoint_._type' kind='empty'"
 * @generated
 */
public interface EntryPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Criterion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Criterion</em>' attribute.
	 * @see #setInputCriterion(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getEntryPointType_InputCriterion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='inputCriterion'"
	 * @generated
	 */
	String getInputCriterion();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.EntryPointType#getInputCriterion <em>Input Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Criterion</em>' attribute.
	 * @see #getInputCriterion()
	 * @generated
	 */
	void setInputCriterion(String value);

} // EntryPointType
