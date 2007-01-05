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
 * A representation of the model object '<em><b>Additional Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.AdditionalOutputType#getOutputCriterion <em>Output Criterion</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AdditionalOutputType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAdditionalOutputType()
 * @model extendedMetaData="name='additionalOutput_._type' kind='elementOnly'"
 * @generated
 */
public interface AdditionalOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OutputCriterionRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Criterion</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAdditionalOutputType_OutputCriterion()
	 * @model type="com.ibm.wbim.bom.schema1.OutputCriterionRef" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='outputCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOutputCriterion();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAdditionalOutputType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.AdditionalOutputType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AdditionalOutputType
