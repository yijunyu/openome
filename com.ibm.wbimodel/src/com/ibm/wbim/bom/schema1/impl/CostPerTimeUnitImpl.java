/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CostPerTimeUnit;
import com.ibm.wbim.bom.schema1.MonetaryValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Per Time Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostPerTimeUnitImpl extends OneTimeCostImpl implements CostPerTimeUnit {
	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Object TIME_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected Object timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostPerTimeUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getCostPerTimeUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(Object newTimeUnit) {
		Object oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COST_PER_TIME_UNIT__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.COST_PER_TIME_UNIT__COST_VALUE:
					return basicSetCostValue(null, msgs);
				case Schema1Package.COST_PER_TIME_UNIT__WHEN_COST_APPLICABLE:
					return ((InternalEList)getWhenCostApplicable()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.COST_PER_TIME_UNIT__COST_VALUE:
				return getCostValue();
			case Schema1Package.COST_PER_TIME_UNIT__WHEN_COST_APPLICABLE:
				return getWhenCostApplicable();
			case Schema1Package.COST_PER_TIME_UNIT__TIME_UNIT:
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
			case Schema1Package.COST_PER_TIME_UNIT__COST_VALUE:
				setCostValue((MonetaryValue)newValue);
				return;
			case Schema1Package.COST_PER_TIME_UNIT__WHEN_COST_APPLICABLE:
				getWhenCostApplicable().clear();
				getWhenCostApplicable().addAll((Collection)newValue);
				return;
			case Schema1Package.COST_PER_TIME_UNIT__TIME_UNIT:
				setTimeUnit((Object)newValue);
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
			case Schema1Package.COST_PER_TIME_UNIT__COST_VALUE:
				setCostValue((MonetaryValue)null);
				return;
			case Schema1Package.COST_PER_TIME_UNIT__WHEN_COST_APPLICABLE:
				getWhenCostApplicable().clear();
				return;
			case Schema1Package.COST_PER_TIME_UNIT__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
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
			case Schema1Package.COST_PER_TIME_UNIT__COST_VALUE:
				return costValue != null;
			case Schema1Package.COST_PER_TIME_UNIT__WHEN_COST_APPLICABLE:
				return whenCostApplicable != null && !whenCostApplicable.isEmpty();
			case Schema1Package.COST_PER_TIME_UNIT__TIME_UNIT:
				return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
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
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //CostPerTimeUnitImpl
