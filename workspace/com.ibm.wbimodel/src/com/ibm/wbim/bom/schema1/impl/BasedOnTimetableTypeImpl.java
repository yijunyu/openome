/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BasedOnTimetableType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Based On Timetable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BasedOnTimetableTypeImpl#getTimetable <em>Timetable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasedOnTimetableTypeImpl extends EObjectImpl implements
		BasedOnTimetableType {
	/**
	 * The default value of the '{@link #getTimetable() <em>Timetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMETABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimetable() <em>Timetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected String timetable = TIMETABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasedOnTimetableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.BASED_ON_TIMETABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimetable() {
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetable(String newTimetable) {
		String oldTimetable = timetable;
		timetable = newTimetable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.BASED_ON_TIMETABLE_TYPE__TIMETABLE,
					oldTimetable, timetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.BASED_ON_TIMETABLE_TYPE__TIMETABLE:
			return getTimetable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.BASED_ON_TIMETABLE_TYPE__TIMETABLE:
			setTimetable((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Schema1Package.BASED_ON_TIMETABLE_TYPE__TIMETABLE:
			setTimetable(TIMETABLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Schema1Package.BASED_ON_TIMETABLE_TYPE__TIMETABLE:
			return TIMETABLE_EDEFAULT == null ? timetable != null
					: !TIMETABLE_EDEFAULT.equals(timetable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timetable: ");
		result.append(timetable);
		result.append(')');
		return result.toString();
	}

} //BasedOnTimetableTypeImpl
