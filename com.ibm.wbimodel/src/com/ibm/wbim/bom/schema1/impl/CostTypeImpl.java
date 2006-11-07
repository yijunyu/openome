/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CostPerTimeUnitValue;
import com.ibm.wbim.bom.schema1.CostType;
import com.ibm.wbim.bom.schema1.CostValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CostTypeImpl#getExecutionCost <em>Execution Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CostTypeImpl#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CostTypeImpl#getResourceWaitingCost <em>Resource Waiting Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostTypeImpl extends EObjectImpl implements CostType {
	/**
	 * The cached value of the '{@link #getExecutionCost() <em>Execution Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCost()
	 * @generated
	 * @ordered
	 */
	protected CostValue executionCost = null;

	/**
	 * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected CostValue startupCost = null;

	/**
	 * The cached value of the '{@link #getResourceWaitingCost() <em>Resource Waiting Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceWaitingCost()
	 * @generated
	 * @ordered
	 */
	protected CostPerTimeUnitValue resourceWaitingCost = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.COST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostValue getExecutionCost() {
		return executionCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionCost(CostValue newExecutionCost, NotificationChain msgs) {
		CostValue oldExecutionCost = executionCost;
		executionCost = newExecutionCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.COST_TYPE__EXECUTION_COST, oldExecutionCost, newExecutionCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionCost(CostValue newExecutionCost) {
		if (newExecutionCost != executionCost) {
			NotificationChain msgs = null;
			if (executionCost != null)
				msgs = ((InternalEObject)executionCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COST_TYPE__EXECUTION_COST, null, msgs);
			if (newExecutionCost != null)
				msgs = ((InternalEObject)newExecutionCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COST_TYPE__EXECUTION_COST, null, msgs);
			msgs = basicSetExecutionCost(newExecutionCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COST_TYPE__EXECUTION_COST, newExecutionCost, newExecutionCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostValue getStartupCost() {
		return startupCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartupCost(CostValue newStartupCost, NotificationChain msgs) {
		CostValue oldStartupCost = startupCost;
		startupCost = newStartupCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.COST_TYPE__STARTUP_COST, oldStartupCost, newStartupCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupCost(CostValue newStartupCost) {
		if (newStartupCost != startupCost) {
			NotificationChain msgs = null;
			if (startupCost != null)
				msgs = ((InternalEObject)startupCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COST_TYPE__STARTUP_COST, null, msgs);
			if (newStartupCost != null)
				msgs = ((InternalEObject)newStartupCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COST_TYPE__STARTUP_COST, null, msgs);
			msgs = basicSetStartupCost(newStartupCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COST_TYPE__STARTUP_COST, newStartupCost, newStartupCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerTimeUnitValue getResourceWaitingCost() {
		return resourceWaitingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceWaitingCost(CostPerTimeUnitValue newResourceWaitingCost, NotificationChain msgs) {
		CostPerTimeUnitValue oldResourceWaitingCost = resourceWaitingCost;
		resourceWaitingCost = newResourceWaitingCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.COST_TYPE__RESOURCE_WAITING_COST, oldResourceWaitingCost, newResourceWaitingCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceWaitingCost(CostPerTimeUnitValue newResourceWaitingCost) {
		if (newResourceWaitingCost != resourceWaitingCost) {
			NotificationChain msgs = null;
			if (resourceWaitingCost != null)
				msgs = ((InternalEObject)resourceWaitingCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COST_TYPE__RESOURCE_WAITING_COST, null, msgs);
			if (newResourceWaitingCost != null)
				msgs = ((InternalEObject)newResourceWaitingCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COST_TYPE__RESOURCE_WAITING_COST, null, msgs);
			msgs = basicSetResourceWaitingCost(newResourceWaitingCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COST_TYPE__RESOURCE_WAITING_COST, newResourceWaitingCost, newResourceWaitingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.COST_TYPE__EXECUTION_COST:
				return basicSetExecutionCost(null, msgs);
			case Schema1Package.COST_TYPE__STARTUP_COST:
				return basicSetStartupCost(null, msgs);
			case Schema1Package.COST_TYPE__RESOURCE_WAITING_COST:
				return basicSetResourceWaitingCost(null, msgs);
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
			case Schema1Package.COST_TYPE__EXECUTION_COST:
				return getExecutionCost();
			case Schema1Package.COST_TYPE__STARTUP_COST:
				return getStartupCost();
			case Schema1Package.COST_TYPE__RESOURCE_WAITING_COST:
				return getResourceWaitingCost();
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
			case Schema1Package.COST_TYPE__EXECUTION_COST:
				setExecutionCost((CostValue)newValue);
				return;
			case Schema1Package.COST_TYPE__STARTUP_COST:
				setStartupCost((CostValue)newValue);
				return;
			case Schema1Package.COST_TYPE__RESOURCE_WAITING_COST:
				setResourceWaitingCost((CostPerTimeUnitValue)newValue);
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
			case Schema1Package.COST_TYPE__EXECUTION_COST:
				setExecutionCost((CostValue)null);
				return;
			case Schema1Package.COST_TYPE__STARTUP_COST:
				setStartupCost((CostValue)null);
				return;
			case Schema1Package.COST_TYPE__RESOURCE_WAITING_COST:
				setResourceWaitingCost((CostPerTimeUnitValue)null);
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
			case Schema1Package.COST_TYPE__EXECUTION_COST:
				return executionCost != null;
			case Schema1Package.COST_TYPE__STARTUP_COST:
				return startupCost != null;
			case Schema1Package.COST_TYPE__RESOURCE_WAITING_COST:
				return resourceWaitingCost != null;
		}
		return super.eIsSet(featureID);
	}

} //CostTypeImpl