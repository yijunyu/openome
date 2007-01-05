/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.ModelType;
import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.ModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeItemProvider
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
	public ModelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addSchemaVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_name_feature", "_UI_ModelType_type"),
				 Schema1Package.Literals.MODEL_TYPE__NAME,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_schemaVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_schemaVersion_feature", "_UI_ModelType_type"),
				 Schema1Package.Literals.MODEL_TYPE__SCHEMA_VERSION,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(Schema1Package.Literals.MODEL_TYPE__CATALOGS);
			childrenFeatures.add(Schema1Package.Literals.MODEL_TYPE__DATA_MODEL);
			childrenFeatures.add(Schema1Package.Literals.MODEL_TYPE__RESOURCE_MODEL);
			childrenFeatures.add(Schema1Package.Literals.MODEL_TYPE__ORGANIZATION_MODEL);
			childrenFeatures.add(Schema1Package.Literals.MODEL_TYPE__PROCESS_MODEL);
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
	 * This returns ModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelType_type") :
			getString("_UI_ModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelType.class)) {
			case Schema1Package.MODEL_TYPE__NAME:
			case Schema1Package.MODEL_TYPE__SCHEMA_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Schema1Package.MODEL_TYPE__CATALOGS:
			case Schema1Package.MODEL_TYPE__DATA_MODEL:
			case Schema1Package.MODEL_TYPE__RESOURCE_MODEL:
			case Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL:
			case Schema1Package.MODEL_TYPE__PROCESS_MODEL:
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
				(Schema1Package.Literals.MODEL_TYPE__CATALOGS,
				 Schema1Factory.eINSTANCE.createCatalogsType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.MODEL_TYPE__DATA_MODEL,
				 Schema1Factory.eINSTANCE.createDataModel()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.MODEL_TYPE__RESOURCE_MODEL,
				 Schema1Factory.eINSTANCE.createResourceModel()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.MODEL_TYPE__ORGANIZATION_MODEL,
				 Schema1Factory.eINSTANCE.createOrganizationModel()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.MODEL_TYPE__PROCESS_MODEL,
				 Schema1Factory.eINSTANCE.createProcessModel()));
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
