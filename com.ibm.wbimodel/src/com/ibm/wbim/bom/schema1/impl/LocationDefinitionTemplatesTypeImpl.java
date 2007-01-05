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
import org.eclipse.emf.ecore.EStructuralFeature;
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
public class LocationDefinitionTemplatesTypeImpl extends EObjectImpl implements LocationDefinitionTemplatesType {
	/**
	 * The cached value of the '{@link #getLocationDefinitionTemplate() <em>Location Definition Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDefinitionTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList locationDefinitionTemplate = null;

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
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getLocationDefinitionTemplatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocationDefinitionTemplate() {
		if (locationDefinitionTemplate == null) {
			locationDefinitionTemplate = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE);
		}
		return locationDefinitionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
					return ((InternalEList)getLocationDefinitionTemplate()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
				return getLocationDefinitionTemplate();
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
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
				getLocationDefinitionTemplate().clear();
				getLocationDefinitionTemplate().addAll((Collection)newValue);
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
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
				getLocationDefinitionTemplate().clear();
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
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE:
				return locationDefinitionTemplate != null && !locationDefinitionTemplate.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //LocationDefinitionTemplatesTypeImpl
