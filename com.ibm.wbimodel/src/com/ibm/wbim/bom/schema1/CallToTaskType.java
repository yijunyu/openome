/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call To Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CallToTaskType#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCallToTaskType()
 * @model extendedMetaData="name='callToTask_._type' kind='elementOnly'"
 * @generated
 */
public interface CallToTaskType extends Invocation {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCallToTaskType_Task()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='task'"
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CallToTaskType#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

} // CallToTaskType