/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Repository Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputRepositoryValueType#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputRepositoryValueType()
 * @model extendedMetaData="name='outputRepositoryValue_._type' kind='elementOnly'"
 * @generated
 */
public interface OutputRepositoryValueType extends OutputRepositoryValue {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputRepositoryValueType_Output()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='output'"
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValueType#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

} // OutputRepositoryValueType
