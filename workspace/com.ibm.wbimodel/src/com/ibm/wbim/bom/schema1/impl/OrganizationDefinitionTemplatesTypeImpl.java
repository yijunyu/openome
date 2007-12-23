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
	protected EList organizationDefinitionTemplate;

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
		return Schema1Package.Literals.ORGANIZATION_DEFINITION_TEMPLATES_TYPE;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				return ((InternalEList)getOrganizationDefinitionTemplate()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				return getOrganizationDefinitionTemplate();
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				getOrganizationDefinitionTemplate().clear();
				getOrganizationDefinitionTemplate().addAll((Collection)newValue);
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				getOrganizationDefinitionTemplate().clear();
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
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE:
				return organizationDefinitionTemplate != null && !organizationDefinitionTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationDefinitionTemplatesTypeImpl
