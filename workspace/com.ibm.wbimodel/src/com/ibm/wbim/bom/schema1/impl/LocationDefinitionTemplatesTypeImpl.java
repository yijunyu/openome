/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType;
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
 * An implementation of the model object '<em><b>Location Definition Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LocationDefinitionTemplatesTypeImpl#getLocationDefinitionTemplate <em>Location Definition Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationDefinitionTemplatesTypeImpl extends EObjectImpl implements
		LocationDefinitionTemplatesType {
	/**
	 * The cached value of the '{@link #getLocationDefinitionTemplate() <em>Location Definition Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDefinitionTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> locationDefinitionTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationDefinitionTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.LOCATION_DEFINITION_TEMPLATES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getLocationDefinitionTemplate() {
		if (locationDefinitionTemplate == null) {
			locationDefinitionTemplate = new EObjectContainmentEList<TypeDeclaration>(
					TypeDeclaration.class,
					this,
					Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE);
		}
		return locationDefinitionTemplate;
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
		case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
			return ((InternalEList<?>) getLocationDefinitionTemplate())
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
		case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
			return getLocationDefinitionTemplate();
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
		case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
			getLocationDefinitionTemplate().clear();
			getLocationDefinitionTemplate().addAll(
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
		case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
			getLocationDefinitionTemplate().clear();
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
		case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
			return locationDefinitionTemplate != null
					&& !locationDefinitionTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationDefinitionTemplatesTypeImpl
