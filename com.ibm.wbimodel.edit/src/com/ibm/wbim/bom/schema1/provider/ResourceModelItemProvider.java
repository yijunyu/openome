/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.ResourceModel;
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
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.ResourceModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceModelItemProvider
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
	public ResourceModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__INDIVIDUAL_RESOURCES);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__BULK_RESOURCES);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__ROLES);
			childrenFeatures.add(Schema1Package.Literals.RESOURCE_MODEL__TIMETABLES);
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
	 * This returns ResourceModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_ResourceModel_type");
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

		switch (notification.getFeatureID(ResourceModel.class)) {
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES:
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS:
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES:
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS:
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES:
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCES:
			case Schema1Package.RESOURCE_MODEL__ROLES:
			case Schema1Package.RESOURCE_MODEL__TIMETABLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES,
				 Schema1Factory.eINSTANCE.createIndividualResourceDefinitionTemplatesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS,
				 Schema1Factory.eINSTANCE.createIndividualResourceDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES,
				 Schema1Factory.eINSTANCE.createBulkResourceDefinitionTemplatesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS,
				 Schema1Factory.eINSTANCE.createBulkResourceDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__INDIVIDUAL_RESOURCES,
				 Schema1Factory.eINSTANCE.createIndividualResourcesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__BULK_RESOURCES,
				 Schema1Factory.eINSTANCE.createBulkResourcesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__ROLES,
				 Schema1Factory.eINSTANCE.createRolesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.RESOURCE_MODEL__TIMETABLES,
				 Schema1Factory.eINSTANCE.createTimetablesType()));
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
