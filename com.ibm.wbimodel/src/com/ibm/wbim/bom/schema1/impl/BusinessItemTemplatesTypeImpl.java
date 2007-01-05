/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BusinessItemTemplatesType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TypeDeclaration;

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
 * An implementation of the model object '<em><b>Business Item Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BusinessItemTemplatesTypeImpl#getBusinessItemTemplate <em>Business Item Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessItemTemplatesTypeImpl extends EObjectImpl implements BusinessItemTemplatesType {
	/**
	 * The cached value of the '{@link #getBusinessItemTemplate() <em>Business Item Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItemTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList businessItemTemplate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessItemTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getBusinessItemTemplatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBusinessItemTemplate() {
		if (businessItemTemplate == null) {
			businessItemTemplate = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE);
		}
		return businessItemTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE:
					return ((InternalEList)getBusinessItemTemplate()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE:
				return getBusinessItemTemplate();
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
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE:
				getBusinessItemTemplate().clear();
				getBusinessItemTemplate().addAll((Collection)newValue);
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
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE:
				getBusinessItemTemplate().clear();
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
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE:
				return businessItemTemplate != null && !businessItemTemplate.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //BusinessItemTemplatesTypeImpl
