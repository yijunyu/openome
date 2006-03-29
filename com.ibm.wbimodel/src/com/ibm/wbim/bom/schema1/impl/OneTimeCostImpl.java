/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.MonetaryValue;
import com.ibm.wbim.bom.schema1.OneTimeCost;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.WhenCostApplicableType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Time Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OneTimeCostImpl#getCostValue <em>Cost Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OneTimeCostImpl#getWhenCostApplicable <em>When Cost Applicable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneTimeCostImpl extends EObjectImpl implements OneTimeCost {
	/**
	 * The cached value of the '{@link #getCostValue() <em>Cost Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostValue()
	 * @generated
	 * @ordered
	 */
	protected MonetaryValue costValue = null;

	/**
	 * The cached value of the '{@link #getWhenCostApplicable() <em>When Cost Applicable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenCostApplicable()
	 * @generated
	 * @ordered
	 */
	protected EList whenCostApplicable = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneTimeCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getOneTimeCost();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonetaryValue getCostValue() {
		return costValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostValue(MonetaryValue newCostValue, NotificationChain msgs) {
		MonetaryValue oldCostValue = costValue;
		costValue = newCostValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ONE_TIME_COST__COST_VALUE, oldCostValue, newCostValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostValue(MonetaryValue newCostValue) {
		if (newCostValue != costValue) {
			NotificationChain msgs = null;
			if (costValue != null)
				msgs = ((InternalEObject)costValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ONE_TIME_COST__COST_VALUE, null, msgs);
			if (newCostValue != null)
				msgs = ((InternalEObject)newCostValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ONE_TIME_COST__COST_VALUE, null, msgs);
			msgs = basicSetCostValue(newCostValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ONE_TIME_COST__COST_VALUE, newCostValue, newCostValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhenCostApplicable() {
		if (whenCostApplicable == null) {
			whenCostApplicable = new EObjectContainmentEList(WhenCostApplicableType.class, this, Schema1Package.ONE_TIME_COST__WHEN_COST_APPLICABLE);
		}
		return whenCostApplicable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.ONE_TIME_COST__COST_VALUE:
					return basicSetCostValue(null, msgs);
				case Schema1Package.ONE_TIME_COST__WHEN_COST_APPLICABLE:
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
			case Schema1Package.ONE_TIME_COST__COST_VALUE:
				return getCostValue();
			case Schema1Package.ONE_TIME_COST__WHEN_COST_APPLICABLE:
				return getWhenCostApplicable();
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
			case Schema1Package.ONE_TIME_COST__COST_VALUE:
				setCostValue((MonetaryValue)newValue);
				return;
			case Schema1Package.ONE_TIME_COST__WHEN_COST_APPLICABLE:
				getWhenCostApplicable().clear();
				getWhenCostApplicable().addAll((Collection)newValue);
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
			case Schema1Package.ONE_TIME_COST__COST_VALUE:
				setCostValue((MonetaryValue)null);
				return;
			case Schema1Package.ONE_TIME_COST__WHEN_COST_APPLICABLE:
				getWhenCostApplicable().clear();
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
			case Schema1Package.ONE_TIME_COST__COST_VALUE:
				return costValue != null;
			case Schema1Package.ONE_TIME_COST__WHEN_COST_APPLICABLE:
				return whenCostApplicable != null && !whenCostApplicable.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //OneTimeCostImpl