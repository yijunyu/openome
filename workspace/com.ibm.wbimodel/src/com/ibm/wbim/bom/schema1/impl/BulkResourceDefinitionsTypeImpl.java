/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType;
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
 * An implementation of the model object '<em><b>Bulk Resource Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionsTypeImpl#getBulkResourceDefinition <em>Bulk Resource Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BulkResourceDefinitionsTypeImpl extends EObjectImpl implements
		BulkResourceDefinitionsType {
	/**
	 * The cached value of the '{@link #getBulkResourceDefinition() <em>Bulk Resource Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> bulkResourceDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulkResourceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.BULK_RESOURCE_DEFINITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getBulkResourceDefinition() {
		if (bulkResourceDefinition == null) {
			bulkResourceDefinition = new EObjectContainmentEList<TypeDeclaration>(
					TypeDeclaration.class,
					this,
					Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION);
		}
		return bulkResourceDefinition;
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
		case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
			return ((InternalEList<?>) getBulkResourceDefinition())
					.basicRemove(otherEnd, msgs);
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
		case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
			return getBulkResourceDefinition();
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
		case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
			getBulkResourceDefinition().clear();
			getBulkResourceDefinition().addAll(
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
		case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
			getBulkResourceDefinition().clear();
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
		case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
			return bulkResourceDefinition != null
					&& !bulkResourceDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BulkResourceDefinitionsTypeImpl
