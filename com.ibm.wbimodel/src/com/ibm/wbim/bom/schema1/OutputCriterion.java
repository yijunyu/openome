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
 * A representation of the model object '<em><b>Output Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputCriterion#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputCriterion#getRelatedInputCriteria <em>Related Input Criteria</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputCriterion#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputCriterion#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputCriterion()
 * @model extendedMetaData="name='OutputCriterion' kind='elementOnly'"
 * @generated
 */
public interface OutputCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OutputRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputCriterion_Output()
	 * @model type="com.ibm.wbim.bom.schema1.OutputRef" containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOutput();

	/**
	 * Returns the value of the '<em><b>Related Input Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Input Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Input Criteria</em>' containment reference.
	 * @see #setRelatedInputCriteria(RelatedInputCriteriaType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputCriterion_RelatedInputCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedInputCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedInputCriteriaType getRelatedInputCriteria();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getRelatedInputCriteria <em>Related Input Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Input Criteria</em>' containment reference.
	 * @see #getRelatedInputCriteria()
	 * @generated
	 */
	void setRelatedInputCriteria(RelatedInputCriteriaType value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputCriterion_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"REGULAR"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.TypeType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType1)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputCriterion_Type()
	 * @model default="REGULAR" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType1 getType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType1 value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	boolean isSetType();

} // OutputCriterion