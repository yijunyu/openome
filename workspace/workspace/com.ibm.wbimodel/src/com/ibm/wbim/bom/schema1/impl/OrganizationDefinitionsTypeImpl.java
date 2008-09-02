/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.OrganizationDefinitionsType;
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
 * An implementation of the model object '<em><b>Organization Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionsTypeImpl#getOrganizationDefinition <em>Organization Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationDefinitionsTypeImpl extends EObjectImpl implements
		OrganizationDefinitionsType {
	/**
	 * The cached value of the '{@link #getOrganizationDefinition() <em>Organization Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> organizationDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ORGANIZATION_DEFINITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getOrganizationDefinition() {
		if (organizationDefinition == null) {
			organizationDefinition = new EObjectContainmentEList<TypeDeclaration>(
					TypeDeclaration.class,
					this,
					Schema1Package.ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION);
		}
		return organizationDefinition;
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
		case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION:
			return ((InternalEList<?>) getOrganizationDefinition())
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
		case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION:
			return getOrganizationDefinition();
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
		case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION:
			getOrganizationDefinition().clear();
			getOrganizationDefinition().addAll(
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
		case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION:
			getOrganizationDefinition().clear();
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
		case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION:
			return organizationDefinition != null
					&& !organizationDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationDefinitionsTypeImpl
