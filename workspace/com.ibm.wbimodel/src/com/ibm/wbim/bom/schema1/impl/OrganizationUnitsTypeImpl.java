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
public class OrganizationUnitsTypeImpl extends EObjectImpl implements
		OrganizationUnitsType {
	/**
	 * The cached value of the '{@link #getOrganizationUnit() <em>Organization Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexDataTypeInstance> organizationUnit;

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
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ORGANIZATION_UNITS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexDataTypeInstance> getOrganizationUnit() {
		if (organizationUnit == null) {
			organizationUnit = new EObjectContainmentEList<ComplexDataTypeInstance>(
					ComplexDataTypeInstance.class, this,
					Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT);
		}
		return organizationUnit;
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
		case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
			return ((InternalEList<?>) getOrganizationUnit()).basicRemove(
					otherEnd, msgs);
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
		case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
			return getOrganizationUnit();
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
		case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
			getOrganizationUnit().clear();
			getOrganizationUnit().addAll(
					(Collection<? extends ComplexDataTypeInstance>) newValue);
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
		case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
			getOrganizationUnit().clear();
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
		case Schema1Package.ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT:
			return organizationUnit != null && !organizationUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationUnitsTypeImpl
