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
import org.eclipse.emf.ecore.EStructuralFeature;
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
public class BulkResourceDefinitionsTypeImpl extends EObjectImpl implements BulkResourceDefinitionsType {
	/**
	 * The cached value of the '{@link #getBulkResourceDefinition() <em>Bulk Resource Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList bulkResourceDefinition = null;

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
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getBulkResourceDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBulkResourceDefinition() {
		if (bulkResourceDefinition == null) {
			bulkResourceDefinition = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION);
		}
		return bulkResourceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
					return ((InternalEList)getBulkResourceDefinition()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
				return getBulkResourceDefinition();
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
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
				getBulkResourceDefinition().clear();
				getBulkResourceDefinition().addAll((Collection)newValue);
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
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
				getBulkResourceDefinition().clear();
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
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION:
				return bulkResourceDefinition != null && !bulkResourceDefinition.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //BulkResourceDefinitionsTypeImpl
