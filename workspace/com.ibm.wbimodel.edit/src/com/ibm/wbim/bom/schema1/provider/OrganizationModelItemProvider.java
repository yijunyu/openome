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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
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
public class OrganizationModelItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(Schema1Package.Literals.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES);
			childrenFeatures
					.add(Schema1Package.Literals.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS);
			childrenFeatures
					.add(Schema1Package.Literals.ORGANIZATION_MODEL__ORGANIZATION_UNITS);
			childrenFeatures
					.add(Schema1Package.Literals.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES);
			childrenFeatures
					.add(Schema1Package.Literals.ORGANIZATION_MODEL__LOCATION_DEFINITIONS);
			childrenFeatures
					.add(Schema1Package.Literals.ORGANIZATION_MODEL__LOCATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/OrganizationModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OrganizationModel.class)) {
		case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
		case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
		case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
		case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
		case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
		case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
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
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(
						Schema1Package.Literals.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES,
						Schema1Factory.eINSTANCE
								.createOrganizationDefinitionTemplatesType()));

		newChildDescriptors
				.add(createChildParameter(
						Schema1Package.Literals.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS,
						Schema1Factory.eINSTANCE
								.createOrganizationDefinitionsType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.ORGANIZATION_MODEL__ORGANIZATION_UNITS,
				Schema1Factory.eINSTANCE.createOrganizationUnitsType()));

		newChildDescriptors
				.add(createChildParameter(
						Schema1Package.Literals.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES,
						Schema1Factory.eINSTANCE
								.createLocationDefinitionTemplatesType()));

		newChildDescriptors
				.add(createChildParameter(
						Schema1Package.Literals.ORGANIZATION_MODEL__LOCATION_DEFINITIONS,
						Schema1Factory.eINSTANCE
								.createLocationDefinitionsType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.ORGANIZATION_MODEL__LOCATIONS,
				Schema1Factory.eINSTANCE.createLocationsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WbimodelEditPlugin.INSTANCE;
	}

}
