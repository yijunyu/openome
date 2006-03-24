/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CriteriaTemplate;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Individual Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TaskIndividualResourceRequirementImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskIndividualResourceRequirementImpl extends IndividualResourceRequirementImpl implements TaskIndividualResourceRequirement {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected CriteriaTemplate criteria = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskIndividualResourceRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getTaskIndividualResourceRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaTemplate getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriteria(CriteriaTemplate newCriteria, NotificationChain msgs) {
		CriteriaTemplate oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA, oldCriteria, newCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(CriteriaTemplate newCriteria) {
		if (newCriteria != criteria) {
			NotificationChain msgs = null;
			if (criteria != null)
				msgs = ((InternalEObject)criteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA, null, msgs);
			if (newCriteria != null)
				msgs = ((InternalEObject)newCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA, null, msgs);
			msgs = basicSetCriteria(newCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA, newCriteria, newCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA:
					return basicSetCriteria(null, msgs);
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
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				return getIndividualResource();
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				return getName();
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				return getTimeRequired();
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA:
				return getCriteria();
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
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				setIndividualResource((String)newValue);
				return;
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				setTimeRequired((Object)newValue);
				return;
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA:
				setCriteria((CriteriaTemplate)newValue);
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
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				setIndividualResource(INDIVIDUAL_RESOURCE_EDEFAULT);
				return;
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				setTimeRequired(TIME_REQUIRED_EDEFAULT);
				return;
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA:
				setCriteria((CriteriaTemplate)null);
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
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				return INDIVIDUAL_RESOURCE_EDEFAULT == null ? individualResource != null : !INDIVIDUAL_RESOURCE_EDEFAULT.equals(individualResource);
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				return TIME_REQUIRED_EDEFAULT == null ? timeRequired != null : !TIME_REQUIRED_EDEFAULT.equals(timeRequired);
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA:
				return criteria != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TaskIndividualResourceRequirementImpl
