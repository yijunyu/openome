/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ProcessModel;
import com.ibm.wbim.bom.schema1.ProcessesType;
import com.ibm.wbim.bom.schema1.RepositoriesType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.ServicesType;
import com.ibm.wbim.bom.schema1.TasksType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessModelImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessModelImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessModelImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessModelImpl extends EObjectImpl implements ProcessModel {
	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected ProcessesType processes = null;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected TasksType tasks = null;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected RepositoriesType repositories = null;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesType services = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.PROCESS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessesType getProcesses() {
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcesses(ProcessesType newProcesses, NotificationChain msgs) {
		ProcessesType oldProcesses = processes;
		processes = newProcesses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__PROCESSES, oldProcesses, newProcesses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesses(ProcessesType newProcesses) {
		if (newProcesses != processes) {
			NotificationChain msgs = null;
			if (processes != null)
				msgs = ((InternalEObject)processes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__PROCESSES, null, msgs);
			if (newProcesses != null)
				msgs = ((InternalEObject)newProcesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__PROCESSES, null, msgs);
			msgs = basicSetProcesses(newProcesses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__PROCESSES, newProcesses, newProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksType getTasks() {
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasks(TasksType newTasks, NotificationChain msgs) {
		TasksType oldTasks = tasks;
		tasks = newTasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__TASKS, oldTasks, newTasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasks(TasksType newTasks) {
		if (newTasks != tasks) {
			NotificationChain msgs = null;
			if (tasks != null)
				msgs = ((InternalEObject)tasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__TASKS, null, msgs);
			if (newTasks != null)
				msgs = ((InternalEObject)newTasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__TASKS, null, msgs);
			msgs = basicSetTasks(newTasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__TASKS, newTasks, newTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoriesType getRepositories() {
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositories(RepositoriesType newRepositories, NotificationChain msgs) {
		RepositoriesType oldRepositories = repositories;
		repositories = newRepositories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__REPOSITORIES, oldRepositories, newRepositories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositories(RepositoriesType newRepositories) {
		if (newRepositories != repositories) {
			NotificationChain msgs = null;
			if (repositories != null)
				msgs = ((InternalEObject)repositories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__REPOSITORIES, null, msgs);
			if (newRepositories != null)
				msgs = ((InternalEObject)newRepositories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__REPOSITORIES, null, msgs);
			msgs = basicSetRepositories(newRepositories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__REPOSITORIES, newRepositories, newRepositories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesType getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(ServicesType newServices, NotificationChain msgs) {
		ServicesType oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(ServicesType newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS_MODEL__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS_MODEL__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.PROCESS_MODEL__PROCESSES:
				return basicSetProcesses(null, msgs);
			case Schema1Package.PROCESS_MODEL__TASKS:
				return basicSetTasks(null, msgs);
			case Schema1Package.PROCESS_MODEL__REPOSITORIES:
				return basicSetRepositories(null, msgs);
			case Schema1Package.PROCESS_MODEL__SERVICES:
				return basicSetServices(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.PROCESS_MODEL__PROCESSES:
				return getProcesses();
			case Schema1Package.PROCESS_MODEL__TASKS:
				return getTasks();
			case Schema1Package.PROCESS_MODEL__REPOSITORIES:
				return getRepositories();
			case Schema1Package.PROCESS_MODEL__SERVICES:
				return getServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Schema1Package.PROCESS_MODEL__PROCESSES:
				setProcesses((ProcessesType)newValue);
				return;
			case Schema1Package.PROCESS_MODEL__TASKS:
				setTasks((TasksType)newValue);
				return;
			case Schema1Package.PROCESS_MODEL__REPOSITORIES:
				setRepositories((RepositoriesType)newValue);
				return;
			case Schema1Package.PROCESS_MODEL__SERVICES:
				setServices((ServicesType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Schema1Package.PROCESS_MODEL__PROCESSES:
				setProcesses((ProcessesType)null);
				return;
			case Schema1Package.PROCESS_MODEL__TASKS:
				setTasks((TasksType)null);
				return;
			case Schema1Package.PROCESS_MODEL__REPOSITORIES:
				setRepositories((RepositoriesType)null);
				return;
			case Schema1Package.PROCESS_MODEL__SERVICES:
				setServices((ServicesType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.PROCESS_MODEL__PROCESSES:
				return processes != null;
			case Schema1Package.PROCESS_MODEL__TASKS:
				return tasks != null;
			case Schema1Package.PROCESS_MODEL__REPOSITORIES:
				return repositories != null;
			case Schema1Package.PROCESS_MODEL__SERVICES:
				return services != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessModelImpl
