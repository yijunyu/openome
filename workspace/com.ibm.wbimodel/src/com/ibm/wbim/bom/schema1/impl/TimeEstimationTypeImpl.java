/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TimeEstimationType;
import com.ibm.wbim.bom.schema1.TimeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Estimation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimeEstimationTypeImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimeEstimationTypeImpl#getMaxResourceWaitingTime <em>Max Resource Waiting Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEstimationTypeImpl extends EObjectImpl implements TimeEstimationType {
	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue processingTime;

	/**
	 * The cached value of the '{@link #getMaxResourceWaitingTime() <em>Max Resource Waiting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResourceWaitingTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue maxResourceWaitingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEstimationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.TIME_ESTIMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingTime(TimeValue newProcessingTime, NotificationChain msgs) {
		TimeValue oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME, oldProcessingTime, newProcessingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(TimeValue newProcessingTime) {
		if (newProcessingTime != processingTime) {
			NotificationChain msgs = null;
			if (processingTime != null)
				msgs = ((InternalEObject)processingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME, null, msgs);
			if (newProcessingTime != null)
				msgs = ((InternalEObject)newProcessingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME, null, msgs);
			msgs = basicSetProcessingTime(newProcessingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME, newProcessingTime, newProcessingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getMaxResourceWaitingTime() {
		return maxResourceWaitingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxResourceWaitingTime(TimeValue newMaxResourceWaitingTime, NotificationChain msgs) {
		TimeValue oldMaxResourceWaitingTime = maxResourceWaitingTime;
		maxResourceWaitingTime = newMaxResourceWaitingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME, oldMaxResourceWaitingTime, newMaxResourceWaitingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResourceWaitingTime(TimeValue newMaxResourceWaitingTime) {
		if (newMaxResourceWaitingTime != maxResourceWaitingTime) {
			NotificationChain msgs = null;
			if (maxResourceWaitingTime != null)
				msgs = ((InternalEObject)maxResourceWaitingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME, null, msgs);
			if (newMaxResourceWaitingTime != null)
				msgs = ((InternalEObject)newMaxResourceWaitingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME, null, msgs);
			msgs = basicSetMaxResourceWaitingTime(newMaxResourceWaitingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME, newMaxResourceWaitingTime, newMaxResourceWaitingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME:
				return basicSetProcessingTime(null, msgs);
			case Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME:
				return basicSetMaxResourceWaitingTime(null, msgs);
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
			case Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME:
				return getProcessingTime();
			case Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME:
				return getMaxResourceWaitingTime();
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
			case Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME:
				setProcessingTime((TimeValue)newValue);
				return;
			case Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME:
				setMaxResourceWaitingTime((TimeValue)newValue);
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
			case Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME:
				setProcessingTime((TimeValue)null);
				return;
			case Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME:
				setMaxResourceWaitingTime((TimeValue)null);
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
			case Schema1Package.TIME_ESTIMATION_TYPE__PROCESSING_TIME:
				return processingTime != null;
			case Schema1Package.TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME:
				return maxResourceWaitingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeEstimationTypeImpl
