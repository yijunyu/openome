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
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#getInputConstantValue <em>Input Constant Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#getInputRepositoryValue <em>Input Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#getOutputRepositoryValue <em>Output Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#getAdditionalInput <em>Additional Input</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#getAdditionalOutput <em>Additional Output</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#isCallSynchronously <em>Call Synchronously</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Invocation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation()
 * @model extendedMetaData="name='Invocation' kind='elementOnly'"
 * @generated
 */
public interface Invocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Constant Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputConstantValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Constant Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Constant Value</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_InputConstantValue()
	 * @model type="com.ibm.wbim.bom.schema1.InputConstantValueType" containment="true"
	 *        extendedMetaData="kind='element' name='inputConstantValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInputConstantValue();

	/**
	 * Returns the value of the '<em><b>Input Repository Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputRepositoryValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Repository Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Repository Value</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_InputRepositoryValue()
	 * @model type="com.ibm.wbim.bom.schema1.InputRepositoryValueType" containment="true"
	 *        extendedMetaData="kind='element' name='inputRepositoryValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInputRepositoryValue();

	/**
	 * Returns the value of the '<em><b>Output Repository Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OutputRepositoryValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Repository Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Repository Value</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_OutputRepositoryValue()
	 * @model type="com.ibm.wbim.bom.schema1.OutputRepositoryValueType" containment="true"
	 *        extendedMetaData="kind='element' name='outputRepositoryValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOutputRepositoryValue();

	/**
	 * Returns the value of the '<em><b>Additional Input</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.AdditionalInputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Input</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_AdditionalInput()
	 * @model type="com.ibm.wbim.bom.schema1.AdditionalInputType" containment="true"
	 *        extendedMetaData="kind='element' name='additionalInput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAdditionalInput();

	/**
	 * Returns the value of the '<em><b>Additional Output</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.AdditionalOutputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Output</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_AdditionalOutput()
	 * @model type="com.ibm.wbim.bom.schema1.AdditionalOutputType" containment="true"
	 *        extendedMetaData="kind='element' name='additionalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAdditionalOutput();

	/**
	 * Returns the value of the '<em><b>Call Synchronously</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Synchronously</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Synchronously</em>' attribute.
	 * @see #isSetCallSynchronously()
	 * @see #unsetCallSynchronously()
	 * @see #setCallSynchronously(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_CallSynchronously()
	 * @model default="true" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='callSynchronously'"
	 * @generated
	 */
	boolean isCallSynchronously();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Invocation#isCallSynchronously <em>Call Synchronously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Synchronously</em>' attribute.
	 * @see #isSetCallSynchronously()
	 * @see #unsetCallSynchronously()
	 * @see #isCallSynchronously()
	 * @generated
	 */
	void setCallSynchronously(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Invocation#isCallSynchronously <em>Call Synchronously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallSynchronously()
	 * @see #isCallSynchronously()
	 * @see #setCallSynchronously(boolean)
	 * @generated
	 */
	void unsetCallSynchronously();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Invocation#isCallSynchronously <em>Call Synchronously</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Call Synchronously</em>' attribute is set.
	 * @see #unsetCallSynchronously()
	 * @see #isCallSynchronously()
	 * @see #setCallSynchronously(boolean)
	 * @generated
	 */
	boolean isSetCallSynchronously();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInvocation_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Invocation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Invocation
