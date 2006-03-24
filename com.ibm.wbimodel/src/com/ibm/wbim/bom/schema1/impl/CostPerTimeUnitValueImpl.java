/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CostPerTimeUnitValue;
import com.ibm.wbim.bom.schema1.Currency;
import com.ibm.wbim.bom.schema1.DistributionType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Per Time Unit Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitValueImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostPerTimeUnitValueImpl extends CostValueImpl implements CostPerTimeUnitValue {
	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.MINUTE_LITERAL;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * This is true if the Time Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeUnitESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostPerTimeUnitValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getCostPerTimeUnitValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(TimeUnit newTimeUnit) {
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		boolean oldTimeUnitESet = timeUnitESet;
		timeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COST_PER_TIME_UNIT_VALUE__TIME_UNIT, oldTimeUnit, timeUnit, !oldTimeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeUnit() {
		TimeUnit oldTimeUnit = timeUnit;
		boolean oldTimeUnitESet = timeUnitESet;
		timeUnit = TIME_UNIT_EDEFAULT;
		timeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.COST_PER_TIME_UNIT_VALUE__TIME_UNIT, oldTimeUnit, TIME_UNIT_EDEFAULT, oldTimeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeUnit() {
		return timeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.COST_PER_TIME_UNIT_VALUE__DISTRIBUTION:
					return basicSetDistribution(null, msgs);
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
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__LITERAL_VALUE:
				return new Double(getLiteralValue());
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__DISTRIBUTION:
				return getDistribution();
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__CURRENCY:
				return getCurrency();
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__TIME_UNIT:
				return getTimeUnit();
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
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__LITERAL_VALUE:
				setLiteralValue(((Double)newValue).doubleValue());
				return;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__DISTRIBUTION:
				setDistribution((DistributionType)newValue);
				return;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
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
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__LITERAL_VALUE:
				unsetLiteralValue();
				return;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__DISTRIBUTION:
				setDistribution((DistributionType)null);
				return;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__CURRENCY:
				unsetCurrency();
				return;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__TIME_UNIT:
				unsetTimeUnit();
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
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__LITERAL_VALUE:
				return isSetLiteralValue();
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__DISTRIBUTION:
				return distribution != null;
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__CURRENCY:
				return isSetCurrency();
			case Schema1Package.COST_PER_TIME_UNIT_VALUE__TIME_UNIT:
				return isSetTimeUnit();
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
		result.append(" (timeUnit: ");
		if (timeUnitESet) result.append(timeUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CostPerTimeUnitValueImpl
