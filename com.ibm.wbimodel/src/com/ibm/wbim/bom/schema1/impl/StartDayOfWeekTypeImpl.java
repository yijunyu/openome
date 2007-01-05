/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.DayOfWeek;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.StartDayOfWeekType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Day Of Week Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl#getWeekNumber <em>Week Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartDayOfWeekTypeImpl extends EObjectImpl implements StartDayOfWeekType {
	/**
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final DayOfWeek DAY_OF_WEEK_EDEFAULT = DayOfWeek.MONDAY_LITERAL;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected DayOfWeek dayOfWeek = DAY_OF_WEEK_EDEFAULT;

	/**
	 * This is true if the Day Of Week attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dayOfWeekESet = false;

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
	 * The default value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WEEK_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger weekNumber = WEEK_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartDayOfWeekTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getStartDayOfWeekType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfWeek(DayOfWeek newDayOfWeek) {
		DayOfWeek oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek == null ? DAY_OF_WEEK_EDEFAULT : newDayOfWeek;
		boolean oldDayOfWeekESet = dayOfWeekESet;
		dayOfWeekESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK, oldDayOfWeek, dayOfWeek, !oldDayOfWeekESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayOfWeek() {
		DayOfWeek oldDayOfWeek = dayOfWeek;
		boolean oldDayOfWeekESet = dayOfWeekESet;
		dayOfWeek = DAY_OF_WEEK_EDEFAULT;
		dayOfWeekESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK, oldDayOfWeek, DAY_OF_WEEK_EDEFAULT, oldDayOfWeekESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayOfWeek() {
		return dayOfWeekESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.START_DAY_OF_WEEK_TYPE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWeekNumber() {
		return weekNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekNumber(BigInteger newWeekNumber) {
		BigInteger oldWeekNumber = weekNumber;
		weekNumber = newWeekNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.START_DAY_OF_WEEK_TYPE__WEEK_NUMBER, oldWeekNumber, weekNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK:
				return getDayOfWeek();
			case Schema1Package.START_DAY_OF_WEEK_TYPE__START_TIME:
				return getStartTime();
			case Schema1Package.START_DAY_OF_WEEK_TYPE__WEEK_NUMBER:
				return getWeekNumber();
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
			case Schema1Package.START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK:
				setDayOfWeek((DayOfWeek)newValue);
				return;
			case Schema1Package.START_DAY_OF_WEEK_TYPE__START_TIME:
				setStartTime((Object)newValue);
				return;
			case Schema1Package.START_DAY_OF_WEEK_TYPE__WEEK_NUMBER:
				setWeekNumber((BigInteger)newValue);
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
			case Schema1Package.START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK:
				unsetDayOfWeek();
				return;
			case Schema1Package.START_DAY_OF_WEEK_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case Schema1Package.START_DAY_OF_WEEK_TYPE__WEEK_NUMBER:
				setWeekNumber(WEEK_NUMBER_EDEFAULT);
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
			case Schema1Package.START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK:
				return isSetDayOfWeek();
			case Schema1Package.START_DAY_OF_WEEK_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case Schema1Package.START_DAY_OF_WEEK_TYPE__WEEK_NUMBER:
				return WEEK_NUMBER_EDEFAULT == null ? weekNumber != null : !WEEK_NUMBER_EDEFAULT.equals(weekNumber);
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
		result.append(" (dayOfWeek: ");
		if (dayOfWeekESet) result.append(dayOfWeek); else result.append("<unset>");
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", weekNumber: ");
		result.append(weekNumber);
		result.append(')');
		return result.toString();
	}

} //StartDayOfWeekTypeImpl
