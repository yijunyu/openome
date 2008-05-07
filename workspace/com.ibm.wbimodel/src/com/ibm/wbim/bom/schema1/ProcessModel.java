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
 * A representation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ProcessModel#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ProcessModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ProcessModel#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ProcessModel#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessModel()
 * @model extendedMetaData="name='ProcessModel' kind='elementOnly'"
 * @generated
 */
public interface ProcessModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference.
	 * @see #setProcesses(ProcessesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessModel_Processes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processes' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessesType getProcesses();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ProcessModel#getProcesses <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processes</em>' containment reference.
	 * @see #getProcesses()
	 * @generated
	 */
	void setProcesses(ProcessesType value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference.
	 * @see #setTasks(TasksType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessModel_Tasks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tasks' namespace='##targetNamespace'"
	 * @generated
	 */
	TasksType getTasks();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ProcessModel#getTasks <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasks</em>' containment reference.
	 * @see #getTasks()
	 * @generated
	 */
	void setTasks(TasksType value);

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference.
	 * @see #setRepositories(RepositoriesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessModel_Repositories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repositories' namespace='##targetNamespace'"
	 * @generated
	 */
	RepositoriesType getRepositories();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ProcessModel#getRepositories <em>Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repositories</em>' containment reference.
	 * @see #getRepositories()
	 * @generated
	 */
	void setRepositories(RepositoriesType value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(ServicesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessModel_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicesType getServices();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ProcessModel#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesType value);

} // ProcessModel
