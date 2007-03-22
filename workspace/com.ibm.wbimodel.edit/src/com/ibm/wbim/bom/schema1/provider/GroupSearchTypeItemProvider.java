/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.GroupSearchType;
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
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.GroupSearchType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupSearchTypeItemProvider
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
	public GroupSearchTypeItemProvider(AdapterFactory adapterFactory) {
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

			addGroupIdPropertyDescriptor(object);
			addProfilePropertyDescriptor(object);
			addIndustryTypePropertyDescriptor(object);
			addBusinessTypePropertyDescriptor(object);
			addGeographicLocationPropertyDescriptor(object);
			addAffiliatesPropertyDescriptor(object);
			addDisplayNamePropertyDescriptor(object);
			addSecretaryPropertyDescriptor(object);
			addAssistantPropertyDescriptor(object);
			addManagerPropertyDescriptor(object);
			addBusinessCategoryPropertyDescriptor(object);
			addParentCompanyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Group Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_groupId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_groupId_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__GROUP_ID,
				 true,
				 false,
				 false,
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
				 getString("_UI_GroupSearchType_profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_profile_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__PROFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Industry Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndustryTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_industryType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_industryType_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__INDUSTRY_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_businessType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_businessType_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__BUSINESS_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geographic Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeographicLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_geographicLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_geographicLocation_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affiliates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffiliatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_affiliates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_affiliates_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__AFFILIATES,
				 true,
				 false,
				 false,
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
				 getString("_UI_GroupSearchType_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_displayName_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__DISPLAY_NAME,
				 true,
				 false,
				 false,
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
				 getString("_UI_GroupSearchType_secretary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_secretary_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__SECRETARY,
				 true,
				 false,
				 false,
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
				 getString("_UI_GroupSearchType_assistant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_assistant_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__ASSISTANT,
				 true,
				 false,
				 false,
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
				 getString("_UI_GroupSearchType_manager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_manager_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__MANAGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_businessCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_businessCategory_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Company feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentCompanyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupSearchType_parentCompany_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupSearchType_parentCompany_feature", "_UI_GroupSearchType_type"),
				 Schema1Package.Literals.GROUP_SEARCH_TYPE__PARENT_COMPANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GroupSearchType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroupSearchType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((GroupSearchType)object).getDisplayName();
		return label == null || label.length() == 0 ?
			getString("_UI_GroupSearchType_type") :
			getString("_UI_GroupSearchType_type") + " " + label;
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

		switch (notification.getFeatureID(GroupSearchType.class)) {
			case Schema1Package.GROUP_SEARCH_TYPE__GROUP_ID:
			case Schema1Package.GROUP_SEARCH_TYPE__PROFILE:
			case Schema1Package.GROUP_SEARCH_TYPE__INDUSTRY_TYPE:
			case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_TYPE:
			case Schema1Package.GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION:
			case Schema1Package.GROUP_SEARCH_TYPE__AFFILIATES:
			case Schema1Package.GROUP_SEARCH_TYPE__DISPLAY_NAME:
			case Schema1Package.GROUP_SEARCH_TYPE__SECRETARY:
			case Schema1Package.GROUP_SEARCH_TYPE__ASSISTANT:
			case Schema1Package.GROUP_SEARCH_TYPE__MANAGER:
			case Schema1Package.GROUP_SEARCH_TYPE__BUSINESS_CATEGORY:
			case Schema1Package.GROUP_SEARCH_TYPE__PARENT_COMPANY:
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
