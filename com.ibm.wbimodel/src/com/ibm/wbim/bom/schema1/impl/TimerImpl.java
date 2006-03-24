/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.Resources;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.Timer;
import com.ibm.wbim.bom.schema1.TimerSettingType;

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
		return Schema1Package.eINSTANCE.getTimer();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.TIMER__INPUTS:
					return basicSetInputs(null, msgs);
				case Schema1Package.TIMER__OUTPUTS:
					return basicSetOutputs(null, msgs);
				case Schema1Package.TIMER__PRECONDITION:
					return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.TIMER__POSTCONDITION:
					return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.TIMER__RESOURCES:
					return basicSetResources(null, msgs);
				case Schema1Package.TIMER__ORGANIZATIONS:
					return basicSetOrganizations(null, msgs);
				case Schema1Package.TIMER__OPERATIONAL_DATA:
					return basicSetOperationalData(null, msgs);
				case Schema1Package.TIMER__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
				case Schema1Package.TIMER__TIMER_SETTING:
					return basicSetTimerSetting(null, msgs);
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
			case Schema1Package.TIMER__DESCRIPTION:
				return getDescription();
			case Schema1Package.TIMER__INPUTS:
				return getInputs();
			case Schema1Package.TIMER__OUTPUTS:
				return getOutputs();
			case Schema1Package.TIMER__PRECONDITION:
				return getPrecondition();
			case Schema1Package.TIMER__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.TIMER__RESOURCES:
				return getResources();
			case Schema1Package.TIMER__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.TIMER__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.TIMER__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.TIMER__NAME:
				return getName();
			case Schema1Package.TIMER__TIMER_SETTING:
				return getTimerSetting();
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
			case Schema1Package.TIMER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.TIMER__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.TIMER__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.TIMER__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.TIMER__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.TIMER__RESOURCES:
				setResources((Resources)newValue);
				return;
			case Schema1Package.TIMER__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.TIMER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.TIMER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.TIMER__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.TIMER__TIMER_SETTING:
				setTimerSetting((TimerSettingType)newValue);
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
			case Schema1Package.TIMER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.TIMER__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.TIMER__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.TIMER__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.TIMER__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.TIMER__RESOURCES:
				setResources((Resources)null);
				return;
			case Schema1Package.TIMER__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.TIMER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.TIMER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.TIMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.TIMER__TIMER_SETTING:
				setTimerSetting((TimerSettingType)null);
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
			case Schema1Package.TIMER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.TIMER__INPUTS:
				return inputs != null;
			case Schema1Package.TIMER__OUTPUTS:
				return outputs != null;
			case Schema1Package.TIMER__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.TIMER__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.TIMER__RESOURCES:
				return resources != null;
			case Schema1Package.TIMER__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.TIMER__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.TIMER__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.TIMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.TIMER__TIMER_SETTING:
				return timerSetting != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TimerImpl
