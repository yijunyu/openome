/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.OrganizationModel;
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
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.OrganizationModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationModelItemProvider
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
	public OrganizationModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Schema1Package.eINSTANCE.getOrganizationModel_OrganizationDefinitionTemplates());
			childrenFeatures.add(Schema1Package.eINSTANCE.getOrganizationModel_OrganizationDefinitions());
			childrenFeatures.add(Schema1Package.eINSTANCE.getOrganizationModel_OrganizationUnits());
			childrenFeatures.add(Schema1Package.eINSTANCE.getOrganizationModel_LocationDefinitionTemplates());
			childrenFeatures.add(Schema1Package.eINSTANCE.getOrganizationModel_LocationDefinitions());
			childrenFeatures.add(Schema1Package.eINSTANCE.getOrganizationModel_Locations());
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
	 * This returns OrganizationModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/OrganizationModel");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_OrganizationModel_type");
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

		switch (notification.getFeatureID(OrganizationModel.class)) {
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
			case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
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
				(Schema1Package.eINSTANCE.getOrganizationModel_OrganizationDefinitionTemplates(),
				 Schema1Factory.eINSTANCE.createOrganizationDefinitionTemplatesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getOrganizationModel_OrganizationDefinitions(),
				 Schema1Factory.eINSTANCE.createOrganizationDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getOrganizationModel_OrganizationUnits(),
				 Schema1Factory.eINSTANCE.createOrganizationUnitsType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getOrganizationModel_LocationDefinitionTemplates(),
				 Schema1Factory.eINSTANCE.createLocationDefinitionTemplatesType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getOrganizationModel_LocationDefinitions(),
				 Schema1Factory.eINSTANCE.createLocationDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getOrganizationModel_Locations(),
				 Schema1Factory.eINSTANCE.createLocationsType()));
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