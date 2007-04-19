/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.IndividualResourceRequirement;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl#getIndividualResource <em>Individual Resource</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl#getTimeRequired <em>Time Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualResourceRequirementImpl extends EObjectImpl implements IndividualResourceRequirement {
	/**
	 * The default value of the '{@link #getIndividualResource() <em>Individual Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResource()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIVIDUAL_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndividualResource() <em>Individual Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResource()
	 * @generated
	 * @ordered
	 */
	protected String individualResource = INDIVIDUAL_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Object TIME_REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected Object timeRequired = TIME_REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualResourceRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INDIVIDUAL_RESOURCE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndividualResource() {
		return individualResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualResource(String newIndividualResource) {
		String oldIndividualResource = individualResource;
		individualResource = newIndividualResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE, oldIndividualResource, individualResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTimeRequired() {
		return timeRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRequired(Object newTimeRequired) {
		Object oldTimeRequired = timeRequired;
		timeRequired = newTimeRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED, oldTimeRequired, timeRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				return getIndividualResource();
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				return getName();
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				return getTimeRequired();
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
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				setIndividualResource((String)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				setTimeRequired((Object)newValue);
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
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				setIndividualResource(INDIVIDUAL_RESOURCE_EDEFAULT);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				setTimeRequired(TIME_REQUIRED_EDEFAULT);
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
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE:
				return INDIVIDUAL_RESOURCE_EDEFAULT == null ? individualResource != null : !INDIVIDUAL_RESOURCE_EDEFAULT.equals(individualResource);
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED:
				return TIME_REQUIRED_EDEFAULT == null ? timeRequired != null : !TIME_REQUIRED_EDEFAULT.equals(timeRequired);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (individualResource: ");
		result.append(individualResource);
		result.append(", name: ");
		result.append(name);
		result.append(", timeRequired: ");
		result.append(timeRequired);
		result.append(')');
		return result.toString();
	}

} //IndividualResourceRequirementImpl
