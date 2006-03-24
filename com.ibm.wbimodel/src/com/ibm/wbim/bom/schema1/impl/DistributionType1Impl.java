/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.DistributionType1;
import com.ibm.wbim.bom.schema1.ExponentialType;
import com.ibm.wbim.bom.schema1.GammaType;
import com.ibm.wbim.bom.schema1.LognormalType;
import com.ibm.wbim.bom.schema1.NormalType;
import com.ibm.wbim.bom.schema1.PoissonType;
import com.ibm.wbim.bom.schema1.RandomListType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TimeUnit;
import com.ibm.wbim.bom.schema1.UniformType;
import com.ibm.wbim.bom.schema1.WeightedListType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionType1Impl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributionType1Impl extends DistributionTypeImpl implements DistributionType1 {
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
	protected DistributionType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getDistributionType1();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DISTRIBUTION_TYPE1__TIME_UNIT, oldTimeUnit, timeUnit, !oldTimeUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.DISTRIBUTION_TYPE1__TIME_UNIT, oldTimeUnit, TIME_UNIT_EDEFAULT, oldTimeUnitESet));
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
				case Schema1Package.DISTRIBUTION_TYPE1__EXPONENTIAL:
					return basicSetExponential(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__GAMMA:
					return basicSetGamma(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__LOGNORMAL:
					return basicSetLognormal(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__NORMAL:
					return basicSetNormal(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__POISSON:
					return basicSetPoisson(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__RANDOM_LIST:
					return basicSetRandomList(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__UNIFORM:
					return basicSetUniform(null, msgs);
				case Schema1Package.DISTRIBUTION_TYPE1__WEIGHTED_LIST:
					return basicSetWeightedList(null, msgs);
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
			case Schema1Package.DISTRIBUTION_TYPE1__EXPONENTIAL:
				return getExponential();
			case Schema1Package.DISTRIBUTION_TYPE1__GAMMA:
				return getGamma();
			case Schema1Package.DISTRIBUTION_TYPE1__LOGNORMAL:
				return getLognormal();
			case Schema1Package.DISTRIBUTION_TYPE1__NORMAL:
				return getNormal();
			case Schema1Package.DISTRIBUTION_TYPE1__POISSON:
				return getPoisson();
			case Schema1Package.DISTRIBUTION_TYPE1__RANDOM_LIST:
				return getRandomList();
			case Schema1Package.DISTRIBUTION_TYPE1__UNIFORM:
				return getUniform();
			case Schema1Package.DISTRIBUTION_TYPE1__WEIGHTED_LIST:
				return getWeightedList();
			case Schema1Package.DISTRIBUTION_TYPE1__TIME_UNIT:
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
			case Schema1Package.DISTRIBUTION_TYPE1__EXPONENTIAL:
				setExponential((ExponentialType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__GAMMA:
				setGamma((GammaType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__LOGNORMAL:
				setLognormal((LognormalType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__NORMAL:
				setNormal((NormalType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__POISSON:
				setPoisson((PoissonType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__RANDOM_LIST:
				setRandomList((RandomListType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__UNIFORM:
				setUniform((UniformType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__WEIGHTED_LIST:
				setWeightedList((WeightedListType)newValue);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__TIME_UNIT:
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
			case Schema1Package.DISTRIBUTION_TYPE1__EXPONENTIAL:
				setExponential((ExponentialType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__GAMMA:
				setGamma((GammaType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__LOGNORMAL:
				setLognormal((LognormalType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__NORMAL:
				setNormal((NormalType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__POISSON:
				setPoisson((PoissonType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__RANDOM_LIST:
				setRandomList((RandomListType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__UNIFORM:
				setUniform((UniformType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__WEIGHTED_LIST:
				setWeightedList((WeightedListType)null);
				return;
			case Schema1Package.DISTRIBUTION_TYPE1__TIME_UNIT:
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
			case Schema1Package.DISTRIBUTION_TYPE1__EXPONENTIAL:
				return exponential != null;
			case Schema1Package.DISTRIBUTION_TYPE1__GAMMA:
				return gamma != null;
			case Schema1Package.DISTRIBUTION_TYPE1__LOGNORMAL:
				return lognormal != null;
			case Schema1Package.DISTRIBUTION_TYPE1__NORMAL:
				return normal != null;
			case Schema1Package.DISTRIBUTION_TYPE1__POISSON:
				return poisson != null;
			case Schema1Package.DISTRIBUTION_TYPE1__RANDOM_LIST:
				return randomList != null;
			case Schema1Package.DISTRIBUTION_TYPE1__UNIFORM:
				return uniform != null;
			case Schema1Package.DISTRIBUTION_TYPE1__WEIGHTED_LIST:
				return weightedList != null;
			case Schema1Package.DISTRIBUTION_TYPE1__TIME_UNIT:
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

} //DistributionType1Impl
