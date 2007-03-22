/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.LocationDefinitionsType;
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
 * An implementation of the model object '<em><b>Location Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LocationDefinitionsTypeImpl#getLocationDefinition <em>Location Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationDefinitionsTypeImpl extends EObjectImpl implements LocationDefinitionsType {
	/**
	 * The cached value of the '{@link #getLocationDefinition() <em>Location Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList locationDefinition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.LOCATION_DEFINITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocationDefinition() {
		if (locationDefinition == null) {
			locationDefinition = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION);
		}
		return locationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION:
				return ((InternalEList)getLocationDefinition()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION:
				return getLocationDefinition();
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
			case Schema1Package.LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION:
				getLocationDefinition().clear();
				getLocationDefinition().addAll((Collection)newValue);
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
			case Schema1Package.LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION:
				getLocationDefinition().clear();
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
			case Schema1Package.LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION:
				return locationDefinition != null && !locationDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationDefinitionsTypeImpl
