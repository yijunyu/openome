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
 * A representation of the model object '<em><b>Output Path Operational Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputPathOperationalData#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputPathOperationalData()
 * @model extendedMetaData="name='OutputPathOperationalData' kind='elementOnly'"
 * @generated
 */
public interface OutputPathOperationalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' containment reference.
	 * @see #setProbability(OutputPathProbabilityValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputPathOperationalData_Probability()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='probability' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputPathProbabilityValue getProbability();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputPathOperationalData#getProbability <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' containment reference.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(OutputPathProbabilityValue value);

} // OutputPathOperationalData
