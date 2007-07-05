/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.CriteriaTemplate;
import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.CriteriaTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CriteriaTemplateItemProvider
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
	public CriteriaTemplateItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__PERSON_SEARCH);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__PERSON_NAME);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__GROUP_MEMBERS);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__GROUP_SEARCH);
			childrenFeatures.add(Schema1Package.Literals.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CriteriaTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CriteriaTemplate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_CriteriaTemplate_type");
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

		switch (notification.getFeatureID(CriteriaTemplate.class)) {
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE:
			case Schema1Package.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID:
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_SEARCH:
			case Schema1Package.CRITERIA_TEMPLATE__PERSON_NAME:
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_MEMBERS:
			case Schema1Package.CRITERIA_TEMPLATE__GROUP_SEARCH:
			case Schema1Package.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE,
				 Schema1Factory.eINSTANCE.createManagerOfEmployeeType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID,
				 Schema1Factory.eINSTANCE.createManagerOfEmployeeByIDType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__PERSON_SEARCH,
				 Schema1Factory.eINSTANCE.createPersonSearchType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__PERSON_NAME,
				 Schema1Factory.eINSTANCE.createPersonNameType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__GROUP_MEMBERS,
				 Schema1Factory.eINSTANCE.createGroupMembersType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__GROUP_SEARCH,
				 Schema1Factory.eINSTANCE.createGroupSearchType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.CRITERIA_TEMPLATE__ORGANIZATION_MANAGER,
				 Schema1Factory.eINSTANCE.createOrganizationManagerType()));
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
