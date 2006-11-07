/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call To Process Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CallToProcessType#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCallToProcessType()
 * @model extendedMetaData="name='callToProcess_._type' kind='elementOnly'"
 * @generated
 */
public interface CallToProcessType extends Invocation {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' attribute.
	 * @see #setProcess(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCallToProcessType_Process()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='process'"
	 * @generated
	 */
	String getProcess();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CallToProcessType#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(String value);

} // CallToProcessType