/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BulkResourceRequirement;
import com.ibm.wbim.bom.schema1.Resources;
import com.ibm.wbim.bom.schema1.RoleRequirement;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement;

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
 * An implementation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourcesImpl#getRoleRequirement <em>Role Requirement</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourcesImpl#getIndividualResourceRequirement <em>Individual Resource Requirement</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourcesImpl#getBulkResourceRequirement <em>Bulk Resource Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourcesImpl extends EObjectImpl implements Resources {
	/**
	 * The cached value of the '{@link #getRoleRequirement() <em>Role Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList roleRequirement = null;

	/**
	 * The cached value of the '{@link #getIndividualResourceRequirement() <em>Individual Resource Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList individualResourceRequirement = null;

	/**
	 * The cached value of the '{@link #getBulkResourceRequirement() <em>Bulk Resource Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList bulkResourceRequirement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getResources();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoleRequirement() {
		if (roleRequirement == null) {
			roleRequirement = new EObjectContainmentEList(RoleRequirement.class, this, Schema1Package.RESOURCES__ROLE_REQUIREMENT);
		}
		return roleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIndividualResourceRequirement() {
		if (individualResourceRequirement == null) {
			individualResourceRequirement = new EObjectContainmentEList(TaskIndividualResourceRequirement.class, this, Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT);
		}
		return individualResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBulkResourceRequirement() {
		if (bulkResourceRequirement == null) {
			bulkResourceRequirement = new EObjectContainmentEList(BulkResourceRequirement.class, this, Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT);
		}
		return bulkResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
					return ((InternalEList)getRoleRequirement()).basicRemove(otherEnd, msgs);
				case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
					return ((InternalEList)getIndividualResourceRequirement()).basicRemove(otherEnd, msgs);
				case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
					return ((InternalEList)getBulkResourceRequirement()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
				return getRoleRequirement();
			case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
				return getIndividualResourceRequirement();
			case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
				return getBulkResourceRequirement();
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
			case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
				getRoleRequirement().clear();
				getRoleRequirement().addAll((Collection)newValue);
				return;
			case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
				getIndividualResourceRequirement().clear();
				getIndividualResourceRequirement().addAll((Collection)newValue);
				return;
			case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
				getBulkResourceRequirement().clear();
				getBulkResourceRequirement().addAll((Collection)newValue);
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
			case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
				getRoleRequirement().clear();
				return;
			case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
				getIndividualResourceRequirement().clear();
				return;
			case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
				getBulkResourceRequirement().clear();
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
			case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
				return roleRequirement != null && !roleRequirement.isEmpty();
			case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
				return individualResourceRequirement != null && !individualResourceRequirement.isEmpty();
			case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
				return bulkResourceRequirement != null && !bulkResourceRequirement.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ResourcesImpl
