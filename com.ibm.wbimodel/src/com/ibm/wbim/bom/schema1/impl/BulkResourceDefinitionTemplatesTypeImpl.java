/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType;
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
 * An implementation of the model object '<em><b>Bulk Resource Definition Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionTemplatesTypeImpl#getBulkResourceDefinitionTemplate <em>Bulk Resource Definition Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BulkResourceDefinitionTemplatesTypeImpl extends EObjectImpl implements BulkResourceDefinitionTemplatesType {
	/**
	 * The cached value of the '{@link #getBulkResourceDefinitionTemplate() <em>Bulk Resource Definition Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceDefinitionTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList bulkResourceDefinitionTemplate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulkResourceDefinitionTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getBulkResourceDefinitionTemplatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBulkResourceDefinitionTemplate() {
		if (bulkResourceDefinitionTemplate == null) {
			bulkResourceDefinitionTemplate = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE);
		}
		return bulkResourceDefinitionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE:
					return ((InternalEList)getBulkResourceDefinitionTemplate()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE:
				return getBulkResourceDefinitionTemplate();
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
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE:
				getBulkResourceDefinitionTemplate().clear();
				getBulkResourceDefinitionTemplate().addAll((Collection)newValue);
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
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE:
				getBulkResourceDefinitionTemplate().clear();
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
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE:
				return bulkResourceDefinitionTemplate != null && !bulkResourceDefinitionTemplate.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //BulkResourceDefinitionTemplatesTypeImpl
