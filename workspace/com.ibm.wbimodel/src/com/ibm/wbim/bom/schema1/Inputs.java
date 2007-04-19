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
 * A representation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Inputs#getInput <em>Input</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Inputs#getInputCriterion <em>Input Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputs()
 * @model extendedMetaData="name='Inputs' kind='elementOnly'"
 * @generated
 */
public interface Inputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputs_Input()
	 * @model type="com.ibm.wbim.bom.schema1.Input" containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInput();

	/**
	 * Returns the value of the '<em><b>Input Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Criterion</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputs_InputCriterion()
	 * @model type="com.ibm.wbim.bom.schema1.InputCriterion" containment="true"
	 *        extendedMetaData="kind='element' name='inputCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInputCriterion();

} // Inputs
