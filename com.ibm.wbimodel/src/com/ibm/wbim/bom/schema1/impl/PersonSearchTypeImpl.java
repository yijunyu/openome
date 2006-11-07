/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.PersonSearchType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Search Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getTaxPayerId <em>Tax Payer Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl#getPreferredLanguage <em>Preferred Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonSearchTypeImpl extends EObjectImpl implements PersonSearchType {
	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected String eMail = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretary() <em>Secretary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretary()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRETARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretary() <em>Secretary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretary()
	 * @generated
	 * @ordered
	 */
	protected String secretary = SECRETARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssistant() <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSISTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssistant() <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant()
	 * @generated
	 * @ordered
	 */
	protected String assistant = ASSISTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected String manager = MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected String department = DEPARTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected String employeeId = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxPayerId() <em>Tax Payer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayerId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_PAYER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxPayerId() <em>Tax Payer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayerId()
	 * @generated
	 * @ordered
	 */
	protected String taxPayerId = TAX_PAYER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected String timeZone = TIME_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredLanguage() <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredLanguage() <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredLanguage()
	 * @generated
	 * @ordered
	 */
	protected String preferredLanguage = PREFERRED_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonSearchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.PERSON_SEARCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddleName(String newMiddleName) {
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__MIDDLE_NAME, oldMiddleName, middleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMail() {
		return eMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMail(String newEMail) {
		String oldEMail = eMail;
		eMail = newEMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__EMAIL, oldEMail, eMail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretary() {
		return secretary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretary(String newSecretary) {
		String oldSecretary = secretary;
		secretary = newSecretary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__SECRETARY, oldSecretary, secretary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssistant() {
		return assistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssistant(String newAssistant) {
		String oldAssistant = assistant;
		assistant = newAssistant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__ASSISTANT, oldAssistant, assistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(String newManager) {
		String oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(String newDepartment) {
		String oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__DEPARTMENT, oldDepartment, department));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeId(String newEmployeeId) {
		String oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__EMPLOYEE_ID, oldEmployeeId, employeeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxPayerId() {
		return taxPayerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPayerId(String newTaxPayerId) {
		String oldTaxPayerId = taxPayerId;
		taxPayerId = newTaxPayerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__TAX_PAYER_ID, oldTaxPayerId, taxPayerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZone(String newTimeZone) {
		String oldTimeZone = timeZone;
		timeZone = newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredLanguage(String newPreferredLanguage) {
		String oldPreferredLanguage = preferredLanguage;
		preferredLanguage = newPreferredLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE, oldPreferredLanguage, preferredLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.PERSON_SEARCH_TYPE__USER_ID:
				return getUserId();
			case Schema1Package.PERSON_SEARCH_TYPE__PROFILE:
				return getProfile();
			case Schema1Package.PERSON_SEARCH_TYPE__LAST_NAME:
				return getLastName();
			case Schema1Package.PERSON_SEARCH_TYPE__FIRST_NAME:
				return getFirstName();
			case Schema1Package.PERSON_SEARCH_TYPE__MIDDLE_NAME:
				return getMiddleName();
			case Schema1Package.PERSON_SEARCH_TYPE__EMAIL:
				return getEMail();
			case Schema1Package.PERSON_SEARCH_TYPE__COMPANY:
				return getCompany();
			case Schema1Package.PERSON_SEARCH_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Schema1Package.PERSON_SEARCH_TYPE__SECRETARY:
				return getSecretary();
			case Schema1Package.PERSON_SEARCH_TYPE__ASSISTANT:
				return getAssistant();
			case Schema1Package.PERSON_SEARCH_TYPE__MANAGER:
				return getManager();
			case Schema1Package.PERSON_SEARCH_TYPE__DEPARTMENT:
				return getDepartment();
			case Schema1Package.PERSON_SEARCH_TYPE__EMPLOYEE_ID:
				return getEmployeeId();
			case Schema1Package.PERSON_SEARCH_TYPE__TAX_PAYER_ID:
				return getTaxPayerId();
			case Schema1Package.PERSON_SEARCH_TYPE__PHONE:
				return getPhone();
			case Schema1Package.PERSON_SEARCH_TYPE__FAX:
				return getFax();
			case Schema1Package.PERSON_SEARCH_TYPE__GENDER:
				return getGender();
			case Schema1Package.PERSON_SEARCH_TYPE__TIME_ZONE:
				return getTimeZone();
			case Schema1Package.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE:
				return getPreferredLanguage();
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
			case Schema1Package.PERSON_SEARCH_TYPE__USER_ID:
				setUserId((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__PROFILE:
				setProfile((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__LAST_NAME:
				setLastName((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__EMAIL:
				setEMail((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__COMPANY:
				setCompany((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__SECRETARY:
				setSecretary((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__ASSISTANT:
				setAssistant((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__MANAGER:
				setManager((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__DEPARTMENT:
				setDepartment((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__EMPLOYEE_ID:
				setEmployeeId((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__TAX_PAYER_ID:
				setTaxPayerId((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__PHONE:
				setPhone((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__FAX:
				setFax((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__GENDER:
				setGender((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__TIME_ZONE:
				setTimeZone((String)newValue);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE:
				setPreferredLanguage((String)newValue);
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
			case Schema1Package.PERSON_SEARCH_TYPE__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__PROFILE:
				setProfile(PROFILE_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__EMAIL:
				setEMail(EMAIL_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__SECRETARY:
				setSecretary(SECRETARY_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__ASSISTANT:
				setAssistant(ASSISTANT_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__MANAGER:
				setManager(MANAGER_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__DEPARTMENT:
				setDepartment(DEPARTMENT_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__EMPLOYEE_ID:
				setEmployeeId(EMPLOYEE_ID_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__TAX_PAYER_ID:
				setTaxPayerId(TAX_PAYER_ID_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case Schema1Package.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE:
				setPreferredLanguage(PREFERRED_LANGUAGE_EDEFAULT);
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
			case Schema1Package.PERSON_SEARCH_TYPE__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case Schema1Package.PERSON_SEARCH_TYPE__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
			case Schema1Package.PERSON_SEARCH_TYPE__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case Schema1Package.PERSON_SEARCH_TYPE__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case Schema1Package.PERSON_SEARCH_TYPE__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
			case Schema1Package.PERSON_SEARCH_TYPE__EMAIL:
				return EMAIL_EDEFAULT == null ? eMail != null : !EMAIL_EDEFAULT.equals(eMail);
			case Schema1Package.PERSON_SEARCH_TYPE__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
			case Schema1Package.PERSON_SEARCH_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case Schema1Package.PERSON_SEARCH_TYPE__SECRETARY:
				return SECRETARY_EDEFAULT == null ? secretary != null : !SECRETARY_EDEFAULT.equals(secretary);
			case Schema1Package.PERSON_SEARCH_TYPE__ASSISTANT:
				return ASSISTANT_EDEFAULT == null ? assistant != null : !ASSISTANT_EDEFAULT.equals(assistant);
			case Schema1Package.PERSON_SEARCH_TYPE__MANAGER:
				return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
			case Schema1Package.PERSON_SEARCH_TYPE__DEPARTMENT:
				return DEPARTMENT_EDEFAULT == null ? department != null : !DEPARTMENT_EDEFAULT.equals(department);
			case Schema1Package.PERSON_SEARCH_TYPE__EMPLOYEE_ID:
				return EMPLOYEE_ID_EDEFAULT == null ? employeeId != null : !EMPLOYEE_ID_EDEFAULT.equals(employeeId);
			case Schema1Package.PERSON_SEARCH_TYPE__TAX_PAYER_ID:
				return TAX_PAYER_ID_EDEFAULT == null ? taxPayerId != null : !TAX_PAYER_ID_EDEFAULT.equals(taxPayerId);
			case Schema1Package.PERSON_SEARCH_TYPE__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case Schema1Package.PERSON_SEARCH_TYPE__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case Schema1Package.PERSON_SEARCH_TYPE__GENDER:
				return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
			case Schema1Package.PERSON_SEARCH_TYPE__TIME_ZONE:
				return TIME_ZONE_EDEFAULT == null ? timeZone != null : !TIME_ZONE_EDEFAULT.equals(timeZone);
			case Schema1Package.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE:
				return PREFERRED_LANGUAGE_EDEFAULT == null ? preferredLanguage != null : !PREFERRED_LANGUAGE_EDEFAULT.equals(preferredLanguage);
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
		result.append(" (userId: ");
		result.append(userId);
		result.append(", profile: ");
		result.append(profile);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", middleName: ");
		result.append(middleName);
		result.append(", eMail: ");
		result.append(eMail);
		result.append(", company: ");
		result.append(company);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", secretary: ");
		result.append(secretary);
		result.append(", assistant: ");
		result.append(assistant);
		result.append(", manager: ");
		result.append(manager);
		result.append(", department: ");
		result.append(department);
		result.append(", employeeId: ");
		result.append(employeeId);
		result.append(", taxPayerId: ");
		result.append(taxPayerId);
		result.append(", phone: ");
		result.append(phone);
		result.append(", fax: ");
		result.append(fax);
		result.append(", gender: ");
		result.append(gender);
		result.append(", timeZone: ");
		result.append(timeZone);
		result.append(", preferredLanguage: ");
		result.append(preferredLanguage);
		result.append(')');
		return result.toString();
	}

} //PersonSearchTypeImpl