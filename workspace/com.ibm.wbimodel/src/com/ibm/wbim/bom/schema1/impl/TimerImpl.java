/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.Timer;
import com.ibm.wbim.bom.schema1.TimerSettingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimerImpl#getTimerSetting <em>Timer Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerImpl extends TaskImpl implements Timer {
	/**
	 * The cached value of the '{@link #getTimerSetting() <em>Timer Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerSetting()
	 * @generated
	 * @ordered
	 */
	protected TimerSettingType timerSetting = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerSettingType getTimerSetting() {
		return timerSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerSetting(TimerSettingType newTimerSetting, NotificationChain msgs) {
		TimerSettingType oldTimerSetting = timerSetting;
		timerSetting = newTimerSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER__TIMER_SETTING, oldTimerSetting, newTimerSetting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerSetting(TimerSettingType newTimerSetting) {
		if (newTimerSetting != timerSetting) {
			NotificationChain msgs = null;
			if (timerSetting != null)
				msgs = ((InternalEObject)timerSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER__TIMER_SETTING, null, msgs);
			if (newTimerSetting != null)
				msgs = ((InternalEObject)newTimerSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER__TIMER_SETTING, null, msgs);
			msgs = basicSetTimerSetting(newTimerSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER__TIMER_SETTING, newTimerSetting, newTimerSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.TIMER__TIMER_SETTING:
				return basicSetTimerSetting(null, msgs);
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
			case Schema1Package.TIMER__TIMER_SETTING:
				return getTimerSetting();
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
			case Schema1Package.TIMER__TIMER_SETTING:
				setTimerSetting((TimerSettingType)newValue);
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
			case Schema1Package.TIMER__TIMER_SETTING:
				setTimerSetting((TimerSettingType)null);
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
			case Schema1Package.TIMER__TIMER_SETTING:
				return timerSetting != null;
		}
		return super.eIsSet(featureID);
	}

} //TimerImpl
