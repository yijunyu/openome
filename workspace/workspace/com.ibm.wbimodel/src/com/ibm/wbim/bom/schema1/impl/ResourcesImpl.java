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
	protected EList<RoleRequirement> roleRequirement;

	/**
	 * The cached value of the '{@link #getIndividualResourceRequirement() <em>Individual Resource Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskIndividualResourceRequirement> individualResourceRequirement;

	/**
	 * The cached value of the '{@link #getBulkResourceRequirement() <em>Bulk Resource Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<BulkResourceRequirement> bulkResourceRequirement;

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
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleRequirement> getRoleRequirement() {
		if (roleRequirement == null) {
			roleRequirement = new EObjectContainmentEList<RoleRequirement>(
					RoleRequirement.class, this,
					Schema1Package.RESOURCES__ROLE_REQUIREMENT);
		}
		return roleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskIndividualResourceRequirement> getIndividualResourceRequirement() {
		if (individualResourceRequirement == null) {
			individualResourceRequirement = new EObjectContainmentEList<TaskIndividualResourceRequirement>(
					TaskIndividualResourceRequirement.class, this,
					Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT);
		}
		return individualResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BulkResourceRequirement> getBulkResourceRequirement() {
		if (bulkResourceRequirement == null) {
			bulkResourceRequirement = new EObjectContainmentEList<BulkResourceRequirement>(
					BulkResourceRequirement.class, this,
					Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT);
		}
		return bulkResourceRequirement;
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
		case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
			return ((InternalEList<?>) getRoleRequirement()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
			return ((InternalEList<?>) getIndividualResourceRequirement())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
			return ((InternalEList<?>) getBulkResourceRequirement())
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
		case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
			return getRoleRequirement();
		case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
			return getIndividualResourceRequirement();
		case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
			return getBulkResourceRequirement();
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
		case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
			getRoleRequirement().clear();
			getRoleRequirement().addAll(
					(Collection<? extends RoleRequirement>) newValue);
			return;
		case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
			getIndividualResourceRequirement().clear();
			getIndividualResourceRequirement()
					.addAll(
							(Collection<? extends TaskIndividualResourceRequirement>) newValue);
			return;
		case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
			getBulkResourceRequirement().clear();
			getBulkResourceRequirement().addAll(
					(Collection<? extends BulkResourceRequirement>) newValue);
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
		case Schema1Package.RESOURCES__ROLE_REQUIREMENT:
			return roleRequirement != null && !roleRequirement.isEmpty();
		case Schema1Package.RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT:
			return individualResourceRequirement != null
					&& !individualResourceRequirement.isEmpty();
		case Schema1Package.RESOURCES__BULK_RESOURCE_REQUIREMENT:
			return bulkResourceRequirement != null
					&& !bulkResourceRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourcesImpl
