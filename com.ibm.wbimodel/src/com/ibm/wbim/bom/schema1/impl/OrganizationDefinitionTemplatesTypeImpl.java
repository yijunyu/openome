/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType;
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
 * An implementation of the model object '<em><b>Organization Definition Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionTemplatesTypeImpl#getOrganizationDefinitionTemplate <em>Organization Definition Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationDefinitionTemplatesTypeImpl extends EObjectImpl implements OrganizationDefinitionTemplatesType {
	/**
	 * The cached value of the '{@link #getOrganizationDefinitionTemplate() <em>Organization Definition Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDefinitionTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList organizationDefinitionTemplate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationDefinitionTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getOrganizationDefinitionTemplatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrganizationDefinitionTemplate() {
		if (organizationDefinitionTemplate == null) {
			organizationDefinitionTemplate = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE);
		}
		return organizationDefinitionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
					return ((InternalEList)getOrganizationDefinitionTemplate()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				return getOrganizationDefinitionTemplate();
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				getOrganizationDefinitionTemplate().clear();
				getOrganizationDefinitionTemplate().addAll((Collection)newValue);
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				getOrganizationDefinitionTemplate().clear();
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				return organizationDefinitionTemplate != null && !organizationDefinitionTemplate.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //OrganizationDefinitionTemplatesTypeImpl
