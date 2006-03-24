/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.RecurringTimeIntervalType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.StartDayOfWeekType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurring Time Interval Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl#getStartDayOfWeek <em>Start Day Of Week</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecurringTimeIntervalTypeImpl extends EObjectImpl implements RecurringTimeIntervalType {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Object startTime = START_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartDayOfWeek() <em>Start Day Of Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected StartDayOfWeekType startDayOfWeek = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Object DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Object duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurringTimeIntervalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getRecurringTimeIntervalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Object newStartTime) {
		Object oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartDayOfWeekType getStartDayOfWeek() {
		return startDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDayOfWeek(StartDayOfWeekType newStartDayOfWeek, NotificationChain msgs) {
		StartDayOfWeekType oldStartDayOfWeek = startDayOfWeek;
		startDayOfWeek = newStartDayOfWeek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK, oldStartDayOfWeek, newStartDayOfWeek);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDayOfWeek(StartDayOfWeekType newStartDayOfWeek) {
		if (newStartDayOfWeek != startDayOfWeek) {
			NotificationChain msgs = null;
			if (startDayOfWeek != null)
				msgs = ((InternalEObject)startDayOfWeek).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK, null, msgs);
			if (newStartDayOfWeek != null)
				msgs = ((InternalEObject)newStartDayOfWeek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK, null, msgs);
			msgs = basicSetStartDayOfWeek(newStartDayOfWeek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK, newStartDayOfWeek, newStartDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Object newDuration) {
		Object oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RECURRING_TIME_INTERVAL_TYPE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RECURRING_TIME_INTERVAL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK:
					return basicSetStartDayOfWeek(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_TIME:
				return getStartTime();
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK:
				return getStartDayOfWeek();
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__DURATION:
				return getDuration();
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__NAME:
				return getName();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_TIME:
				setStartTime((Object)newValue);
				return;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK:
				setStartDayOfWeek((StartDayOfWeekType)newValue);
				return;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__DURATION:
				setDuration((Object)newValue);
				return;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__NAME:
				setName((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK:
				setStartDayOfWeek((StartDayOfWeekType)null);
				return;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK:
				return startDayOfWeek != null;
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", duration: ");
		result.append(duration);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecurringTimeIntervalTypeImpl
