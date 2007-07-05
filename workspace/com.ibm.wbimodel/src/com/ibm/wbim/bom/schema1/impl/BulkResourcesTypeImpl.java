/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BulkResource;
import com.ibm.wbim.bom.schema1.BulkResourcesType;
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
 * An implementation of the model object '<em><b>Bulk Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourcesTypeImpl#getBulkResource <em>Bulk Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BulkResourcesTypeImpl extends EObjectImpl implements BulkResourcesType {
	/**
	 * The cached value of the '{@link #getBulkResource() <em>Bulk Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResource()
	 * @generated
	 * @ordered
	 */
	protected EList bulkResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulkResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.BULK_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBulkResource() {
		if (bulkResource == null) {
			bulkResource = new EObjectContainmentEList(BulkResource.class, this, Schema1Package.BULK_RESOURCES_TYPE__BULK_RESOURCE);
		}
		return bulkResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.BULK_RESOURCES_TYPE__BULK_RESOURCE:
				return ((InternalEList)getBulkResource()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.BULK_RESOURCES_TYPE__BULK_RESOURCE:
				return getBulkResource();
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
			case Schema1Package.BULK_RESOURCES_TYPE__BULK_RESOURCE:
				getBulkResource().clear();
				getBulkResource().addAll((Collection)newValue);
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
			case Schema1Package.BULK_RESOURCES_TYPE__BULK_RESOURCE:
				getBulkResource().clear();
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
			case Schema1Package.BULK_RESOURCES_TYPE__BULK_RESOURCE:
				return bulkResource != null && !bulkResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BulkResourcesTypeImpl
