/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.IndividualResource;
import com.ibm.wbim.bom.schema1.IndividualResourcesType;
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
 * An implementation of the model object '<em><b>Individual Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourcesTypeImpl#getIndividualResource <em>Individual Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualResourcesTypeImpl extends EObjectImpl implements IndividualResourcesType {
	/**
	 * The cached value of the '{@link #getIndividualResource() <em>Individual Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResource()
	 * @generated
	 * @ordered
	 */
	protected EList individualResource = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INDIVIDUAL_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIndividualResource() {
		if (individualResource == null) {
			individualResource = new EObjectContainmentEList(IndividualResource.class, this, Schema1Package.INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE);
		}
		return individualResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE:
				return ((InternalEList)getIndividualResource()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE:
				return getIndividualResource();
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
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE:
				getIndividualResource().clear();
				getIndividualResource().addAll((Collection)newValue);
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
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE:
				getIndividualResource().clear();
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
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE:
				return individualResource != null && !individualResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualResourcesTypeImpl