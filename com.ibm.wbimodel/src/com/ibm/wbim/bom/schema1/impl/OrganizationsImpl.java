/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.LocationType;
import com.ibm.wbim.bom.schema1.OrganizationUnitType;
import com.ibm.wbim.bom.schema1.Organizations;
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
 * An implementation of the model object '<em><b>Organizations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationsImpl#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationsImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationsImpl extends EObjectImpl implements Organizations {
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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList location = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ORGANIZATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrganizationUnit() {
		if (organizationUnit == null) {
			organizationUnit = new EObjectContainmentEList(OrganizationUnitType.class, this, Schema1Package.ORGANIZATIONS__ORGANIZATION_UNIT);
		}
		return organizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList(LocationType.class, this, Schema1Package.ORGANIZATIONS__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.ORGANIZATIONS__ORGANIZATION_UNIT:
				return ((InternalEList)getOrganizationUnit()).basicRemove(otherEnd, msgs);
			case Schema1Package.ORGANIZATIONS__LOCATION:
				return ((InternalEList)getLocation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.ORGANIZATIONS__ORGANIZATION_UNIT:
				return getOrganizationUnit();
			case Schema1Package.ORGANIZATIONS__LOCATION:
				return getLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Schema1Package.ORGANIZATIONS__ORGANIZATION_UNIT:
				getOrganizationUnit().clear();
				getOrganizationUnit().addAll((Collection)newValue);
				return;
			case Schema1Package.ORGANIZATIONS__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Schema1Package.ORGANIZATIONS__ORGANIZATION_UNIT:
				getOrganizationUnit().clear();
				return;
			case Schema1Package.ORGANIZATIONS__LOCATION:
				getLocation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.ORGANIZATIONS__ORGANIZATION_UNIT:
				return organizationUnit != null && !organizationUnit.isEmpty();
			case Schema1Package.ORGANIZATIONS__LOCATION:
				return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationsImpl