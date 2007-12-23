/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CriteriaTemplate;
import com.ibm.wbim.bom.schema1.GroupMembersType;
import com.ibm.wbim.bom.schema1.GroupSearchType;
import com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType;
import com.ibm.wbim.bom.schema1.ManagerOfEmployeeType;
import com.ibm.wbim.bom.schema1.OrganizationManagerType;
import com.ibm.wbim.bom.schema1.PersonNameType;
import com.ibm.wbim.bom.schema1.PersonSearchType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criteria Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getManagerOfEmployee <em>Manager Of Employee</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getManagerOfEmployeeByID <em>Manager Of Employee By ID</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getPersonSearch <em>Person Search</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getGroupMembers <em>Group Members</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getGroupSearch <em>Group Search</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl#getOrganizationManager <em>Organization Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriteriaTemplateImpl extends EObjectImpl implements CriteriaTemplate {
	/**
	 * The cached value of the '{@link #getManagerOfEmployee() <em>Manager Of Employee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerOfEmployee()
	 * @generated
	 * @ordered
	 */
	protected ManagerOfEmployeeType managerOfEmployee;

	/**
	 * The cached value of the '{@link #getManagerOfEmployeeByID() <em>Manager Of Employee By ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerOfEmployeeByID()
	 * @generated
	 * @ordered
	 */
	protected ManagerOfEmployeeByIDType managerOfEmployeeByID;

	/**
	 * The cached value of the '{@link #getPersonSearch() <em>Person Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSearch()
	 * @generated
	 * @ordered
	 */
	protected PersonSearchType personSearch;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected PersonNameType personName;

	/**
	 * The cached value of the '{@link #getGroupMembers() <em>Group Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMembers()
	 * @generated
	 * @ordered
	 */
	protected GroupMembersType groupMembers;

	/**
	 * The cached value of the '{@link #getGroupSearch() <em>Group Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupSearch()
	 * @generated
	 * @ordered
	 */
	protected GroupSearchType groupSearch;

	/**
	 * The cached value of the '{@link #getOrganizationManager() <em>Organization Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationManager()
	 * @generated
	 * @ordered
	 */
	protected OrganizationManagerType organizationManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriaTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.CRITERIA_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerOfEmployeeType getManagerOfEmployee() {
		return managerOfEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagerOfEmployee(ManagerOfEmployeeType newManagerOfEmployee, NotificationChain msgs) {
		ManagerOfEmployeeType oldManagerOfEmployee = managerOfEmployee;
		managerOfEmployee = newManagerOfEmployee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE, oldManagerOfEmployee, newManagerOfEmployee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerOfEmployee(ManagerOfEmployeeType newManagerOfEmployee) {
		if (newManagerOfEmployee != managerOfEmployee) {
			NotificationChain msgs = null;
			if (managerOfEmployee != null)
				msgs = ((InternalEObject)managerOfEmployee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE, null, msgs);
			if (newManagerOfEmployee != null)
				msgs = ((InternalEObject)newManagerOfEmployee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE, null, msgs);
			msgs = basicSetManagerOfEmployee(newManagerOfEmployee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE, newManagerOfEmployee, newManagerOfEmployee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerOfEmployeeByIDType getManagerOfEmployeeByID() {
		return managerOfEmployeeByID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagerOfEmployeeByID(ManagerOfEmployeeByIDType newManagerOfEmployeeByID, NotificationChain msgs) {
		ManagerOfEmployeeByIDType oldManagerOfEmployeeByID = managerOfEmployeeByID;
		managerOfEmployeeByID = newManagerOfEmployeeByID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID, oldManagerOfEmployeeByID, newManagerOfEmployeeByID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerOfEmployeeByID(ManagerOfEmployeeByIDType newManagerOfEmployeeByID) {
		if (newManagerOfEmployeeByID != managerOfEmployeeByID) {
			NotificationChain msgs = null;
			if (managerOfEmployeeByID != null)
				msgs = ((InternalEObject)managerOfEmployeeByID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID, null, msgs);
			if (newManagerOfEmployeeByID != null)
				msgs = ((InternalEObject)newManagerOfEmployeeByID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID, null, msgs);
			msgs = basicSetManagerOfEmployeeByID(newManagerOfEmployeeByID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID, newManagerOfEmployeeByID, newManagerOfEmployeeByID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonSearchType getPersonSearch() {
		return personSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonSearch(PersonSearchType newPersonSearch, NotificationChain msgs) {
		PersonSearchType oldPersonSearch = personSearch;
		personSearch = newPersonSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH, oldPersonSearch, newPersonSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonSearch(PersonSearchType newPersonSearch) {
		if (newPersonSearch != personSearch) {
			NotificationChain msgs = null;
			if (personSearch != null)
				msgs = ((InternalEObject)personSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH, null, msgs);
			if (newPersonSearch != null)
				msgs = ((InternalEObject)newPersonSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH, null, msgs);
			msgs = basicSetPersonSearch(newPersonSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH, newPersonSearch, newPersonSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType getPersonName() {
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonName(PersonNameType newPersonName, NotificationChain msgs) {
		PersonNameType oldPersonName = personName;
		personName = newPersonName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME, oldPersonName, newPersonName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(PersonNameType newPersonName) {
		if (newPersonName != personName) {
			NotificationChain msgs = null;
			if (personName != null)
				msgs = ((InternalEObject)personName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME, null, msgs);
			if (newPersonName != null)
				msgs = ((InternalEObject)newPersonName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME, null, msgs);
			msgs = basicSetPersonName(newPersonName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME, newPersonName, newPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembersType getGroupMembers() {
		return groupMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupMembers(GroupMembersType newGroupMembers, NotificationChain msgs) {
		GroupMembersType oldGroupMembers = groupMembers;
		groupMembers = newGroupMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS, oldGroupMembers, newGroupMembers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupMembers(GroupMembersType newGroupMembers) {
		if (newGroupMembers != groupMembers) {
			NotificationChain msgs = null;
			if (groupMembers != null)
				msgs = ((InternalEObject)groupMembers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS, null, msgs);
			if (newGroupMembers != null)
				msgs = ((InternalEObject)newGroupMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS, null, msgs);
			msgs = basicSetGroupMembers(newGroupMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS, newGroupMembers, newGroupMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSearchType getGroupSearch() {
		return groupSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupSearch(GroupSearchType newGroupSearch, NotificationChain msgs) {
		GroupSearchType oldGroupSearch = groupSearch;
		groupSearch = newGroupSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH, oldGroupSearch, newGroupSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupSearch(GroupSearchType newGroupSearch) {
		if (newGroupSearch != groupSearch) {
			NotificationChain msgs = null;
			if (groupSearch != null)
				msgs = ((InternalEObject)groupSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH, null, msgs);
			if (newGroupSearch != null)
				msgs = ((InternalEObject)newGroupSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH, null, msgs);
			msgs = basicSetGroupSearch(newGroupSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH, newGroupSearch, newGroupSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationManagerType getOrganizationManager() {
		return organizationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationManager(OrganizationManagerType newOrganizationManager, NotificationChain msgs) {
		OrganizationManagerType oldOrganizationManager = organizationManager;
		organizationManager = newOrganizationManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER, oldOrganizationManager, newOrganizationManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationManager(OrganizationManagerType newOrganizationManager) {
		if (newOrganizationManager != organizationManager) {
			NotificationChain msgs = null;
			if (organizationManager != null)
				msgs = ((InternalEObject)organizationManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER, null, msgs);
			if (newOrganizationManager != null)
				msgs = ((InternalEObject)newOrganizationManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER, null, msgs);
			msgs = basicSetOrganizationManager(newOrganizationManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER, newOrganizationManager, newOrganizationManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE:
				return basicSetManagerOfEmployee(null, msgs);
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID:
				return basicSetManagerOfEmployeeByID(null, msgs);
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH:
				return basicSetPersonSearch(null, msgs);
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS:
				return basicSetGroupMembers(null, msgs);
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH:
				return basicSetGroupSearch(null, msgs);
			case Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER:
				return basicSetOrganizationManager(null, msgs);
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
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE:
				return getManagerOfEmployee();
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID:
				return getManagerOfEmployeeByID();
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH:
				return getPersonSearch();
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME:
				return getPersonName();
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS:
				return getGroupMembers();
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH:
				return getGroupSearch();
			case Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER:
				return getOrganizationManager();
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
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE:
				setManagerOfEmployee((ManagerOfEmployeeType)newValue);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID:
				setManagerOfEmployeeByID((ManagerOfEmployeeByIDType)newValue);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH:
				setPersonSearch((PersonSearchType)newValue);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS:
				setGroupMembers((GroupMembersType)newValue);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH:
				setGroupSearch((GroupSearchType)newValue);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER:
				setOrganizationManager((OrganizationManagerType)newValue);
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
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE:
				setManagerOfEmployee((ManagerOfEmployeeType)null);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID:
				setManagerOfEmployeeByID((ManagerOfEmployeeByIDType)null);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH:
				setPersonSearch((PersonSearchType)null);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS:
				setGroupMembers((GroupMembersType)null);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH:
				setGroupSearch((GroupSearchType)null);
				return;
			case Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER:
				setOrganizationManager((OrganizationManagerType)null);
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
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE:
				return managerOfEmployee != null;
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID:
				return managerOfEmployeeByID != null;
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH:
				return personSearch != null;
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME:
				return personName != null;
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS:
				return groupMembers != null;
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH:
				return groupSearch != null;
			case Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER:
				return organizationManager != null;
		}
		return super.eIsSet(featureID);
	}

} //CriteriaTemplateImpl
