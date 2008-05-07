/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BusinessItemsType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Items Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BusinessItemsTypeImpl#getBusinessItem <em>Business Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessItemsTypeImpl extends EObjectImpl implements
		BusinessItemsType {
	/**
	 * The cached value of the '{@link #getBusinessItem() <em>Business Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItem()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> businessItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessItemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.BUSINESS_ITEMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getBusinessItem() {
		if (businessItem == null) {
			businessItem = new EObjectContainmentEList<TypeDeclaration>(
					TypeDeclaration.class, this,
					Schema1Package.BUSINESS_ITEMS_TYPE__BUSINESS_ITEM);
		}
		return businessItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Schema1Package.BUSINESS_ITEMS_TYPE__BUSINESS_ITEM:
			return ((InternalEList<?>) getBusinessItem()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.BUSINESS_ITEMS_TYPE__BUSINESS_ITEM:
			return getBusinessItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.BUSINESS_ITEMS_TYPE__BUSINESS_ITEM:
			getBusinessItem().clear();
			getBusinessItem().addAll(
					(Collection<? extends TypeDeclaration>) newValue);
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
		case Schema1Package.BUSINESS_ITEMS_TYPE__BUSINESS_ITEM:
			getBusinessItem().clear();
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
		case Schema1Package.BUSINESS_ITEMS_TYPE__BUSINESS_ITEM:
			return businessItem != null && !businessItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessItemsTypeImpl
