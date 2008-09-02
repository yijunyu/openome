/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Of Employee By ID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeByIDTypeImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeByIDTypeImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerOfEmployeeByIDTypeImpl extends EObjectImpl implements
		ManagerOfEmployeeByIDType {
	/**
	 * The default value of the '{@link #getStaff() <em>Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected String staff = STAFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerOfEmployeeByIDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.MANAGER_OF_EMPLOYEE_BY_ID_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaff() {
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaff(String newStaff) {
		String oldStaff = staff;
		staff = newStaff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF,
					oldStaff, staff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN,
					oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF:
			return getStaff();
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN:
			return getDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF:
			setStaff((String) newValue);
			return;
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN:
			setDomain((String) newValue);
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
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF:
			setStaff(STAFF_EDEFAULT);
			return;
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
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
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF:
			return STAFF_EDEFAULT == null ? staff != null : !STAFF_EDEFAULT
					.equals(staff);
		case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN:
			return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT
					.equals(domain);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (staff: ");
		result.append(staff);
		result.append(", domain: ");
		result.append(domain);
		result.append(')');
		return result.toString();
	}

} //ManagerOfEmployeeByIDTypeImpl
