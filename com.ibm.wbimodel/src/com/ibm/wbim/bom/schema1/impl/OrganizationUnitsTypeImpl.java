/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ComplexDataTypeInstance;
import com.ibm.wbim.bom.schema1.OrganizationUnitsType;
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
 * An implementation of the model object '<em><b>Organization Units Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationUnitsTypeImpl#getOrganizationUnit <em>Organization Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationUnitsTypeImpl extends EObjectImpl implements OrganizationUnitsType {
	/**
	 * The cached value of the '{@link #getOrganizationUnit() <em>Organization Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList organizationUnit = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationUnitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getOrganizationUnitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrganizationUnit() {
		if (organizationUnit == null) {
			organizationUnit = new EObjectContainmentEList(ComplexDataTypeInstance.class, this, Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT);
		}
		return organizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
					return ((InternalEList)getOrganizationUnit()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
				return getOrganizationUnit();
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
			case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
				getOrganizationUnit().clear();
				getOrganizationUnit().addAll((Collection)newValue);
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
			case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
				getOrganizationUnit().clear();
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
			case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
				return organizationUnit != null && !organizationUnit.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //OrganizationUnitsTypeImpl
