/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.PersonSearchType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.PersonSearchType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonSearchTypeItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonSearchTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUserIdPropertyDescriptor(object);
			addProfilePropertyDescriptor(object);
			addLastNamePropertyDescriptor(object);
			addFirstNamePropertyDescriptor(object);
			addMiddleNamePropertyDescriptor(object);
			addEMailPropertyDescriptor(object);
			addCompanyPropertyDescriptor(object);
			addDisplayNamePropertyDescriptor(object);
			addSecretaryPropertyDescriptor(object);
			addAssistantPropertyDescriptor(object);
			addManagerPropertyDescriptor(object);
			addDepartmentPropertyDescriptor(object);
			addEmployeeIdPropertyDescriptor(object);
			addTaxPayerIdPropertyDescriptor(object);
			addPhonePropertyDescriptor(object);
			addFaxPropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addTimeZonePropertyDescriptor(object);
			addPreferredLanguagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the User Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_userId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_userId_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__USER_ID,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_profile_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__PROFILE,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_lastName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_lastName_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__LAST_NAME,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_firstName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_firstName_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__FIRST_NAME,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Middle Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiddleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_middleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_middleName_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__MIDDLE_NAME,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EMail feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEMailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_eMail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_eMail_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__EMAIL,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Company feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompanyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_company_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_company_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__COMPANY,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_displayName_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__DISPLAY_NAME,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secretary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecretaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_secretary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_secretary_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__SECRETARY,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assistant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssistantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_assistant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_assistant_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__ASSISTANT,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_manager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_manager_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__MANAGER,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Department feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepartmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_department_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_department_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__DEPARTMENT,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Employee Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmployeeIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_employeeId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_employeeId_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__EMPLOYEE_ID,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tax Payer Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaxPayerIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_taxPayerId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_taxPayerId_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__TAX_PAYER_ID,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_phone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_phone_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__PHONE,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_fax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_fax_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__FAX,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_gender_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_gender_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__GENDER,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_timeZone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_timeZone_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__TIME_ZONE,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preferred Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferredLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonSearchType_preferredLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonSearchType_preferredLanguage_feature", "_UI_PersonSearchType_type"),
				 Schema1Package.Literals.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PersonSearchType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PersonSearchType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((PersonSearchType)object).getLastName();
		return label == null || label.length() == 0 ?
			getString("_UI_PersonSearchType_type") :
			getString("_UI_PersonSearchType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PersonSearchType.class)) {
			case Schema1Package.PERSON_SEARCH_TYPE__USER_ID:
			case Schema1Package.PERSON_SEARCH_TYPE__PROFILE:
			case Schema1Package.PERSON_SEARCH_TYPE__LAST_NAME:
			case Schema1Package.PERSON_SEARCH_TYPE__FIRST_NAME:
			case Schema1Package.PERSON_SEARCH_TYPE__MIDDLE_NAME:
			case Schema1Package.PERSON_SEARCH_TYPE__EMAIL:
			case Schema1Package.PERSON_SEARCH_TYPE__COMPANY:
			case Schema1Package.PERSON_SEARCH_TYPE__DISPLAY_NAME:
			case Schema1Package.PERSON_SEARCH_TYPE__SECRETARY:
			case Schema1Package.PERSON_SEARCH_TYPE__ASSISTANT:
			case Schema1Package.PERSON_SEARCH_TYPE__MANAGER:
			case Schema1Package.PERSON_SEARCH_TYPE__DEPARTMENT:
			case Schema1Package.PERSON_SEARCH_TYPE__EMPLOYEE_ID:
			case Schema1Package.PERSON_SEARCH_TYPE__TAX_PAYER_ID:
			case Schema1Package.PERSON_SEARCH_TYPE__PHONE:
			case Schema1Package.PERSON_SEARCH_TYPE__FAX:
			case Schema1Package.PERSON_SEARCH_TYPE__GENDER:
			case Schema1Package.PERSON_SEARCH_TYPE__TIME_ZONE:
			case Schema1Package.PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return WbimodelerEditPlugin.INSTANCE;
	}

}
