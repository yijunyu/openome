/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BusinessItemInstancesType;
import com.ibm.wbim.bom.schema1.ComplexDataTypeInstance;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BusinessItemInstancesTypeImpl#getBusinessItemInstance <em>Business Item Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessItemInstancesTypeImpl extends EObjectImpl implements BusinessItemInstancesType {
	/**
	 * The cached value of the '{@link #getBusinessItemInstance() <em>Business Item Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItemInstance()
	 * @generated
	 * @ordered
	 */
	protected EList businessItemInstance = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessItemInstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getBusinessItemInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBusinessItemInstance() {
		if (businessItemInstance == null) {
			businessItemInstance = new EObjectContainmentEList(ComplexDataTypeInstance.class, this, Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE);
		}
		return businessItemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE:
					return ((InternalEList)getBusinessItemInstance()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE:
				return getBusinessItemInstance();
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
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE:
				getBusinessItemInstance().clear();
				getBusinessItemInstance().addAll((Collection)newValue);
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
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE:
				getBusinessItemInstance().clear();
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
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE:
				return businessItemInstance != null && !businessItemInstance.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //BusinessItemInstancesTypeImpl
