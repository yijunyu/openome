/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.Role;
import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.Role} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleItemProvider
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
	public RoleItemProvider(AdapterFactory adapterFactory) {
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

			addDocumentationPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_documentation_feature", "_UI_Role_type"),
				 Schema1Package.Literals.ROLE__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Role_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_name_feature", "_UI_Role_type"),
				 Schema1Package.Literals.ROLE__NAME,
				 true,
				 false,
				 false,
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
			childrenFeatures.add(Schema1Package.Literals.ROLE__SCOPE_DIMENSION);
			childrenFeatures.add(Schema1Package.Literals.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE);
			childrenFeatures.add(Schema1Package.Literals.ROLE__AVAILABILITY);
			childrenFeatures.add(Schema1Package.Literals.ROLE__EXTENDED_ATTRIBUTES);
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
	 * This returns Role.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Role"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Role)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Role_type") :
			getString("_UI_Role_type") + " " + label;
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

		switch (notification.getFeatureID(Role.class)) {
			case Schema1Package.ROLE__DOCUMENTATION:
			case Schema1Package.ROLE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Schema1Package.ROLE__SCOPE_DIMENSION:
			case Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE:
			case Schema1Package.ROLE__AVAILABILITY:
			case Schema1Package.ROLE__EXTENDED_ATTRIBUTES:
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
				(Schema1Package.Literals.ROLE__SCOPE_DIMENSION,
				 Schema1Factory.eINSTANCE.createScopeDimensionType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE,
				 FeatureMapUtil.createEntry
					(Schema1Package.Literals.ROLE__ONE_TIME_COST,
					 Schema1Factory.eINSTANCE.createOneTimeCost())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE,
				 FeatureMapUtil.createEntry
					(Schema1Package.Literals.ROLE__ONE_TIME_COST,
					 Schema1Factory.eINSTANCE.createCostPerQuantity())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE,
				 FeatureMapUtil.createEntry
					(Schema1Package.Literals.ROLE__ONE_TIME_COST,
					 Schema1Factory.eINSTANCE.createCostPerQuantityAndTimeUnit())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE,
				 FeatureMapUtil.createEntry
					(Schema1Package.Literals.ROLE__ONE_TIME_COST,
					 Schema1Factory.eINSTANCE.createCostPerTimeUnit())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE,
				 FeatureMapUtil.createEntry
					(Schema1Package.Literals.ROLE__COST_PER_TIME_UNIT,
					 Schema1Factory.eINSTANCE.createCostPerTimeUnit())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__AVAILABILITY,
				 Schema1Factory.eINSTANCE.createAvailability()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.ROLE__EXTENDED_ATTRIBUTES,
				 Schema1Factory.eINSTANCE.createExtendedAttributes()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == Schema1Package.Literals.ROLE__ONE_TIME_COST ||
			childFeature == Schema1Package.Literals.ROLE__COST_PER_TIME_UNIT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
