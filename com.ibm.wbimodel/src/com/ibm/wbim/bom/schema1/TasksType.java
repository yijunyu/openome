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
 * A representation of the model object '<em><b>Tasks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.TasksType#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTasksType()
 * @model extendedMetaData="name='tasks_._type' kind='elementOnly'"
 * @generated
 */
public interface TasksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a global task, its inputs and outputs must have associated data. In inputs for global tasks, the constantValue element is ignored. In inputs and outputs for global tasks, the repositoryValue element is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTasksType_Task()
	 * @model type="com.ibm.wbim.bom.schema1.Task" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTask();

} // TasksType
