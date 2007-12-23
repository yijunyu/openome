/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Quantity;
import com.ibm.wbim.bom.schema1.RoleRequirement;
import com.ibm.wbim.bom.schema1.Schema1Package;

import javax.xml.datatype.Duration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl#getResourceQuantity <em>Resource Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl#getRole <em>Role</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl#getTimeRequired <em>Time Required</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleRequirementImpl extends EObjectImpl implements RoleRequirement {
	/**
	 * The cached value of the '{@link #getResourceQuantity() <em>Resource Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity resourceQuantity;

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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected Duration timeRequired = TIME_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ROLE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getResourceQuantity() {
		return resourceQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceQuantity(Quantity newResourceQuantity, NotificationChain msgs) {
		Quantity oldResourceQuantity = resourceQuantity;
		resourceQuantity = newResourceQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY, oldResourceQuantity, newResourceQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceQuantity(Quantity newResourceQuantity) {
		if (newResourceQuantity != resourceQuantity) {
			NotificationChain msgs = null;
			if (resourceQuantity != null)
				msgs = ((InternalEObject)resourceQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY, null, msgs);
			if (newResourceQuantity != null)
				msgs = ((InternalEObject)newResourceQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY, null, msgs);
			msgs = basicSetResourceQuantity(newResourceQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY, newResourceQuantity, newResourceQuantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE_REQUIREMENT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeRequired() {
		return timeRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRequired(Duration newTimeRequired) {
		Duration oldTimeRequired = timeRequired;
		timeRequired = newTimeRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE_REQUIREMENT__TIME_REQUIRED, oldTimeRequired, timeRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE_REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY:
				return basicSetResourceQuantity(null, msgs);
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
			case Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY:
				return getResourceQuantity();
			case Schema1Package.ROLE_REQUIREMENT__NAME:
				return getName();
			case Schema1Package.ROLE_REQUIREMENT__ROLE:
				return getRole();
			case Schema1Package.ROLE_REQUIREMENT__TIME_REQUIRED:
				return getTimeRequired();
			case Schema1Package.ROLE_REQUIREMENT__TYPE:
				return getType();
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
			case Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY:
				setResourceQuantity((Quantity)newValue);
				return;
			case Schema1Package.ROLE_REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.ROLE_REQUIREMENT__ROLE:
				setRole((String)newValue);
				return;
			case Schema1Package.ROLE_REQUIREMENT__TIME_REQUIRED:
				setTimeRequired((Duration)newValue);
				return;
			case Schema1Package.ROLE_REQUIREMENT__TYPE:
				setType((String)newValue);
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
			case Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY:
				setResourceQuantity((Quantity)null);
				return;
			case Schema1Package.ROLE_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.ROLE_REQUIREMENT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Schema1Package.ROLE_REQUIREMENT__TIME_REQUIRED:
				setTimeRequired(TIME_REQUIRED_EDEFAULT);
				return;
			case Schema1Package.ROLE_REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Schema1Package.ROLE_REQUIREMENT__RESOURCE_QUANTITY:
				return resourceQuantity != null;
			case Schema1Package.ROLE_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.ROLE_REQUIREMENT__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Schema1Package.ROLE_REQUIREMENT__TIME_REQUIRED:
				return TIME_REQUIRED_EDEFAULT == null ? timeRequired != null : !TIME_REQUIRED_EDEFAULT.equals(timeRequired);
			case Schema1Package.ROLE_REQUIREMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", role: ");
		result.append(role);
		result.append(", timeRequired: ");
		result.append(timeRequired);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RoleRequirementImpl
