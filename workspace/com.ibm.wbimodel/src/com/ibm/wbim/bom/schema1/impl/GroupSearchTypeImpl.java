/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.GroupSearchType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Search Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getIndustryType <em>Industry Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getBusinessType <em>Business Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getGeographicLocation <em>Geographic Location</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getAffiliates <em>Affiliates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl#getParentCompany <em>Parent Company</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupSearchTypeImpl extends EObjectImpl implements GroupSearchType {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getIndustryType() <em>Industry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryType()
	 * @generated
	 * @ordered
	 */
	protected static final String INDUSTRY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndustryType() <em>Industry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryType()
	 * @generated
	 * @ordered
	 */
	protected String industryType = INDUSTRY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessType() <em>Business Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessType()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessType() <em>Business Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessType()
	 * @generated
	 * @ordered
	 */
	protected String businessType = BUSINESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeographicLocation() <em>Geographic Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOGRAPHIC_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeographicLocation() <em>Geographic Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicLocation()
	 * @generated
	 * @ordered
	 */
	protected String geographicLocation = GEOGRAPHIC_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAffiliates() <em>Affiliates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliates()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFILIATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffiliates() <em>Affiliates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliates()
	 * @generated
	 * @ordered
	 */
	protected String affiliates = AFFILIATES_EDEFAULT;

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
	 * The default value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected String businessCategory = BUSINESS_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentCompany() <em>Parent Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentCompany() <em>Parent Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCompany()
	 * @generated
	 * @ordered
	 */
	protected String parentCompany = PARENT_COMPANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupSearchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.GROUP_SEARCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__GROUP_ID, oldGroupId,
					groupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__PROFILE, oldProfile,
					profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndustryType() {
		return industryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndustryType(String newIndustryType) {
		String oldIndustryType = industryType;
		industryType = newIndustryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__INDUSTRY_TYPE,
					oldIndustryType, industryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessType(String newBusinessType) {
		String oldBusinessType = businessType;
		businessType = newBusinessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_TYPE,
					oldBusinessType, businessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeographicLocation() {
		return geographicLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicLocation(String newGeographicLocation) {
		String oldGeographicLocation = geographicLocation;
		geographicLocation = newGeographicLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION,
					oldGeographicLocation, geographicLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffiliates() {
		return affiliates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffiliates(String newAffiliates) {
		String oldAffiliates = affiliates;
		affiliates = newAffiliates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__AFFILIATES,
					oldAffiliates, affiliates));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__DISPLAY_NAME,
					oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__SECRETARY, oldSecretary,
					secretary));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__ASSISTANT, oldAssistant,
					assistant));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__MANAGER, oldManager,
					manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessCategory() {
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessCategory(String newBusinessCategory) {
		String oldBusinessCategory = businessCategory;
		businessCategory = newBusinessCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY,
					oldBusinessCategory, businessCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentCompany() {
		return parentCompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCompany(String newParentCompany) {
		String oldParentCompany = parentCompany;
		parentCompany = newParentCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_SEARCH_TYPE__PARENT_COMPANY,
					oldParentCompany, parentCompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.GROUP_SEARCH_TYPE__GROUP_ID:
			return getGroupId();
		case Schema1Package.GROUP_SEARCH_TYPE__PROFILE:
			return getProfile();
		case Schema1Package.GROUP_SEARCH_TYPE__INDUSTRY_TYPE:
			return getIndustryType();
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_TYPE:
			return getBusinessType();
		case Schema1Package.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION:
			return getGeographicLocation();
		case Schema1Package.GROUP_SEARCH_TYPE__AFFILIATES:
			return getAffiliates();
		case Schema1Package.GROUP_SEARCH_TYPE__DISPLAY_NAME:
			return getDisplayName();
		case Schema1Package.GROUP_SEARCH_TYPE__SECRETARY:
			return getSecretary();
		case Schema1Package.GROUP_SEARCH_TYPE__ASSISTANT:
			return getAssistant();
		case Schema1Package.GROUP_SEARCH_TYPE__MANAGER:
			return getManager();
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY:
			return getBusinessCategory();
		case Schema1Package.GROUP_SEARCH_TYPE__PARENT_COMPANY:
			return getParentCompany();
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
		case Schema1Package.GROUP_SEARCH_TYPE__GROUP_ID:
			setGroupId((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__PROFILE:
			setProfile((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__INDUSTRY_TYPE:
			setIndustryType((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_TYPE:
			setBusinessType((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION:
			setGeographicLocation((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__AFFILIATES:
			setAffiliates((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__DISPLAY_NAME:
			setDisplayName((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__SECRETARY:
			setSecretary((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__ASSISTANT:
			setAssistant((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__MANAGER:
			setManager((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY:
			setBusinessCategory((String) newValue);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__PARENT_COMPANY:
			setParentCompany((String) newValue);
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
		case Schema1Package.GROUP_SEARCH_TYPE__GROUP_ID:
			setGroupId(GROUP_ID_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__PROFILE:
			setProfile(PROFILE_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__INDUSTRY_TYPE:
			setIndustryType(INDUSTRY_TYPE_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_TYPE:
			setBusinessType(BUSINESS_TYPE_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION:
			setGeographicLocation(GEOGRAPHIC_LOCATION_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__AFFILIATES:
			setAffiliates(AFFILIATES_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__DISPLAY_NAME:
			setDisplayName(DISPLAY_NAME_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__SECRETARY:
			setSecretary(SECRETARY_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__ASSISTANT:
			setAssistant(ASSISTANT_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__MANAGER:
			setManager(MANAGER_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY:
			setBusinessCategory(BUSINESS_CATEGORY_EDEFAULT);
			return;
		case Schema1Package.GROUP_SEARCH_TYPE__PARENT_COMPANY:
			setParentCompany(PARENT_COMPANY_EDEFAULT);
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
		case Schema1Package.GROUP_SEARCH_TYPE__GROUP_ID:
			return GROUP_ID_EDEFAULT == null ? groupId != null
					: !GROUP_ID_EDEFAULT.equals(groupId);
		case Schema1Package.GROUP_SEARCH_TYPE__PROFILE:
			return PROFILE_EDEFAULT == null ? profile != null
					: !PROFILE_EDEFAULT.equals(profile);
		case Schema1Package.GROUP_SEARCH_TYPE__INDUSTRY_TYPE:
			return INDUSTRY_TYPE_EDEFAULT == null ? industryType != null
					: !INDUSTRY_TYPE_EDEFAULT.equals(industryType);
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_TYPE:
			return BUSINESS_TYPE_EDEFAULT == null ? businessType != null
					: !BUSINESS_TYPE_EDEFAULT.equals(businessType);
		case Schema1Package.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION:
			return GEOGRAPHIC_LOCATION_EDEFAULT == null ? geographicLocation != null
					: !GEOGRAPHIC_LOCATION_EDEFAULT.equals(geographicLocation);
		case Schema1Package.GROUP_SEARCH_TYPE__AFFILIATES:
			return AFFILIATES_EDEFAULT == null ? affiliates != null
					: !AFFILIATES_EDEFAULT.equals(affiliates);
		case Schema1Package.GROUP_SEARCH_TYPE__DISPLAY_NAME:
			return DISPLAY_NAME_EDEFAULT == null ? displayName != null
					: !DISPLAY_NAME_EDEFAULT.equals(displayName);
		case Schema1Package.GROUP_SEARCH_TYPE__SECRETARY:
			return SECRETARY_EDEFAULT == null ? secretary != null
					: !SECRETARY_EDEFAULT.equals(secretary);
		case Schema1Package.GROUP_SEARCH_TYPE__ASSISTANT:
			return ASSISTANT_EDEFAULT == null ? assistant != null
					: !ASSISTANT_EDEFAULT.equals(assistant);
		case Schema1Package.GROUP_SEARCH_TYPE__MANAGER:
			return MANAGER_EDEFAULT == null ? manager != null
					: !MANAGER_EDEFAULT.equals(manager);
		case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY:
			return BUSINESS_CATEGORY_EDEFAULT == null ? businessCategory != null
					: !BUSINESS_CATEGORY_EDEFAULT.equals(businessCategory);
		case Schema1Package.GROUP_SEARCH_TYPE__PARENT_COMPANY:
			return PARENT_COMPANY_EDEFAULT == null ? parentCompany != null
					: !PARENT_COMPANY_EDEFAULT.equals(parentCompany);
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", profile: ");
		result.append(profile);
		result.append(", industryType: ");
		result.append(industryType);
		result.append(", businessType: ");
		result.append(businessType);
		result.append(", geographicLocation: ");
		result.append(geographicLocation);
		result.append(", affiliates: ");
		result.append(affiliates);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", secretary: ");
		result.append(secretary);
		result.append(", assistant: ");
		result.append(assistant);
		result.append(", manager: ");
		result.append(manager);
		result.append(", businessCategory: ");
		result.append(businessCategory);
		result.append(", parentCompany: ");
		result.append(parentCompany);
		result.append(')');
		return result.toString();
	}

} //GroupSearchTypeImpl
