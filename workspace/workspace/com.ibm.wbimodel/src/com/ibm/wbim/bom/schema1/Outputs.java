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
 * A representation of the model object '<em><b>Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Outputs#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Outputs#getOutputCriterion <em>Output Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputs()
 * @model extendedMetaData="name='Outputs' kind='elementOnly'"
 * @generated
 */
public interface Outputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputs_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Output Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OutputCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Criterion</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputs_OutputCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputCriterion> getOutputCriterion();

} // Outputs
