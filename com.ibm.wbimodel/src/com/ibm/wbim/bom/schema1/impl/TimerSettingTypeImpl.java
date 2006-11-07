/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BasedOnTimetableType;
import com.ibm.wbim.bom.schema1.ConstantTimeType;
import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.LastActivationTimePlusType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TimerSettingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Setting Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl#getBasedOnTimetable <em>Based On Timetable</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl#getConstantTime <em>Constant Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl#getLastActivationTimePlus <em>Last Activation Time Plus</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl#getTimerExpression <em>Timer Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerSettingTypeImpl extends EObjectImpl implements TimerSettingType {
	/**
	 * The cached value of the '{@link #getBasedOnTimetable() <em>Based On Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnTimetable()
	 * @generated
	 * @ordered
	 */
	protected BasedOnTimetableType basedOnTimetable = null;

	/**
	 * The cached value of the '{@link #getConstantTime() <em>Constant Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantTime()
	 * @generated
	 * @ordered
	 */
	protected ConstantTimeType constantTime = null;

	/**
	 * The cached value of the '{@link #getLastActivationTimePlus() <em>Last Activation Time Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActivationTimePlus()
	 * @generated
	 * @ordered
	 */
	protected LastActivationTimePlusType lastActivationTimePlus = null;

	/**
	 * The cached value of the '{@link #getTimerExpression() <em>Timer Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression timerExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerSettingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.TIMER_SETTING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedOnTimetableType getBasedOnTimetable() {
		return basedOnTimetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasedOnTimetable(BasedOnTimetableType newBasedOnTimetable, NotificationChain msgs) {
		BasedOnTimetableType oldBasedOnTimetable = basedOnTimetable;
		basedOnTimetable = newBasedOnTimetable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE, oldBasedOnTimetable, newBasedOnTimetable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOnTimetable(BasedOnTimetableType newBasedOnTimetable) {
		if (newBasedOnTimetable != basedOnTimetable) {
			NotificationChain msgs = null;
			if (basedOnTimetable != null)
				msgs = ((InternalEObject)basedOnTimetable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE, null, msgs);
			if (newBasedOnTimetable != null)
				msgs = ((InternalEObject)newBasedOnTimetable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE, null, msgs);
			msgs = basicSetBasedOnTimetable(newBasedOnTimetable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE, newBasedOnTimetable, newBasedOnTimetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantTimeType getConstantTime() {
		return constantTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantTime(ConstantTimeType newConstantTime, NotificationChain msgs) {
		ConstantTimeType oldConstantTime = constantTime;
		constantTime = newConstantTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME, oldConstantTime, newConstantTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantTime(ConstantTimeType newConstantTime) {
		if (newConstantTime != constantTime) {
			NotificationChain msgs = null;
			if (constantTime != null)
				msgs = ((InternalEObject)constantTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME, null, msgs);
			if (newConstantTime != null)
				msgs = ((InternalEObject)newConstantTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME, null, msgs);
			msgs = basicSetConstantTime(newConstantTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME, newConstantTime, newConstantTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastActivationTimePlusType getLastActivationTimePlus() {
		return lastActivationTimePlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastActivationTimePlus(LastActivationTimePlusType newLastActivationTimePlus, NotificationChain msgs) {
		LastActivationTimePlusType oldLastActivationTimePlus = lastActivationTimePlus;
		lastActivationTimePlus = newLastActivationTimePlus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS, oldLastActivationTimePlus, newLastActivationTimePlus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastActivationTimePlus(LastActivationTimePlusType newLastActivationTimePlus) {
		if (newLastActivationTimePlus != lastActivationTimePlus) {
			NotificationChain msgs = null;
			if (lastActivationTimePlus != null)
				msgs = ((InternalEObject)lastActivationTimePlus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS, null, msgs);
			if (newLastActivationTimePlus != null)
				msgs = ((InternalEObject)newLastActivationTimePlus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS, null, msgs);
			msgs = basicSetLastActivationTimePlus(newLastActivationTimePlus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS, newLastActivationTimePlus, newLastActivationTimePlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimerExpression() {
		return timerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerExpression(Expression newTimerExpression, NotificationChain msgs) {
		Expression oldTimerExpression = timerExpression;
		timerExpression = newTimerExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION, oldTimerExpression, newTimerExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerExpression(Expression newTimerExpression) {
		if (newTimerExpression != timerExpression) {
			NotificationChain msgs = null;
			if (timerExpression != null)
				msgs = ((InternalEObject)timerExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION, null, msgs);
			if (newTimerExpression != null)
				msgs = ((InternalEObject)newTimerExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION, null, msgs);
			msgs = basicSetTimerExpression(newTimerExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION, newTimerExpression, newTimerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE:
				return basicSetBasedOnTimetable(null, msgs);
			case Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME:
				return basicSetConstantTime(null, msgs);
			case Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS:
				return basicSetLastActivationTimePlus(null, msgs);
			case Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION:
				return basicSetTimerExpression(null, msgs);
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
			case Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE:
				return getBasedOnTimetable();
			case Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME:
				return getConstantTime();
			case Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS:
				return getLastActivationTimePlus();
			case Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION:
				return getTimerExpression();
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
			case Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE:
				setBasedOnTimetable((BasedOnTimetableType)newValue);
				return;
			case Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME:
				setConstantTime((ConstantTimeType)newValue);
				return;
			case Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS:
				setLastActivationTimePlus((LastActivationTimePlusType)newValue);
				return;
			case Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION:
				setTimerExpression((Expression)newValue);
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
			case Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE:
				setBasedOnTimetable((BasedOnTimetableType)null);
				return;
			case Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME:
				setConstantTime((ConstantTimeType)null);
				return;
			case Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS:
				setLastActivationTimePlus((LastActivationTimePlusType)null);
				return;
			case Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION:
				setTimerExpression((Expression)null);
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
			case Schema1Package.TIMER_SETTING_TYPE__BASED_ON_TIMETABLE:
				return basedOnTimetable != null;
			case Schema1Package.TIMER_SETTING_TYPE__CONSTANT_TIME:
				return constantTime != null;
			case Schema1Package.TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS:
				return lastActivationTimePlus != null;
			case Schema1Package.TIMER_SETTING_TYPE__TIMER_EXPRESSION:
				return timerExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //TimerSettingTypeImpl