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
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Decision#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Decision#getInputBranch <em>Input Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Decision#getOutputBranch <em>Output Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Decision#isIsInclusive <em>Is Inclusive</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Decision#isIsSimpleDecision <em>Is Simple Decision</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Decision#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision()
 * @model extendedMetaData="name='Decision' kind='elementOnly'"
 * @generated
 */
public interface Decision extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Input Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Branch</em>' containment reference.
	 * @see #setInputBranch(InputBranch)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision_InputBranch()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='inputBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InputBranch getInputBranch();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#getInputBranch <em>Input Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Branch</em>' containment reference.
	 * @see #getInputBranch()
	 * @generated
	 */
	void setInputBranch(InputBranch value);

	/**
	 * Returns the value of the '<em><b>Output Branch</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OutputBranchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outputBranch lists the outputs that correspond to inputs in the same order as the inputs appear in the inputBranch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Branch</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision_OutputBranch()
	 * @model type="com.ibm.wbim.bom.schema1.OutputBranchType" containment="true" resolveProxies="false" lower="2"
	 *        extendedMetaData="kind='element' name='outputBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOutputBranch();

	/**
	 * Returns the value of the '<em><b>Is Inclusive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inclusive</em>' attribute.
	 * @see #isSetIsInclusive()
	 * @see #unsetIsInclusive()
	 * @see #setIsInclusive(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision_IsInclusive()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isInclusive'"
	 * @generated
	 */
	boolean isIsInclusive();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#isIsInclusive <em>Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inclusive</em>' attribute.
	 * @see #isSetIsInclusive()
	 * @see #unsetIsInclusive()
	 * @see #isIsInclusive()
	 * @generated
	 */
	void setIsInclusive(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#isIsInclusive <em>Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInclusive()
	 * @see #isIsInclusive()
	 * @see #setIsInclusive(boolean)
	 * @generated
	 */
	void unsetIsInclusive();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Decision#isIsInclusive <em>Is Inclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Inclusive</em>' attribute is set.
	 * @see #unsetIsInclusive()
	 * @see #isIsInclusive()
	 * @see #setIsInclusive(boolean)
	 * @generated
	 */
	boolean isSetIsInclusive();

	/**
	 * Returns the value of the '<em><b>Is Simple Decision</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple Decision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple Decision</em>' attribute.
	 * @see #isSetIsSimpleDecision()
	 * @see #unsetIsSimpleDecision()
	 * @see #setIsSimpleDecision(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision_IsSimpleDecision()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isSimpleDecision'"
	 * @generated
	 */
	boolean isIsSimpleDecision();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#isIsSimpleDecision <em>Is Simple Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simple Decision</em>' attribute.
	 * @see #isSetIsSimpleDecision()
	 * @see #unsetIsSimpleDecision()
	 * @see #isIsSimpleDecision()
	 * @generated
	 */
	void setIsSimpleDecision(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#isIsSimpleDecision <em>Is Simple Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSimpleDecision()
	 * @see #isIsSimpleDecision()
	 * @see #setIsSimpleDecision(boolean)
	 * @generated
	 */
	void unsetIsSimpleDecision();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Decision#isIsSimpleDecision <em>Is Simple Decision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Simple Decision</em>' attribute is set.
	 * @see #unsetIsSimpleDecision()
	 * @see #isIsSimpleDecision()
	 * @see #setIsSimpleDecision(boolean)
	 * @generated
	 */
	boolean isSetIsSimpleDecision();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDecision_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Decision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Decision
