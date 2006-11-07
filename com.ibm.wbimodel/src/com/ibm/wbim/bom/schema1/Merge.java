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
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Merge#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Merge#getInputBranch <em>Input Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Merge#getOutputBranch <em>Output Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Merge#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMerge()
 * @model extendedMetaData="name='Merge' kind='elementOnly'"
 * @generated
 */
public interface Merge extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMerge_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Merge#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Input Branch</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Branch</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMerge_InputBranch()
	 * @model type="com.ibm.wbim.bom.schema1.InputBranch" containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='inputBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInputBranch();

	/**
	 * Returns the value of the '<em><b>Output Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outputBranch lists the outputs that correspond to inputs in the same order as the inputs appear in the inputBranch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Branch</em>' containment reference.
	 * @see #setOutputBranch(OutputBranch)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMerge_OutputBranch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outputBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputBranch getOutputBranch();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Merge#getOutputBranch <em>Output Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Branch</em>' containment reference.
	 * @see #getOutputBranch()
	 * @generated
	 */
	void setOutputBranch(OutputBranch value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMerge_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Merge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Merge