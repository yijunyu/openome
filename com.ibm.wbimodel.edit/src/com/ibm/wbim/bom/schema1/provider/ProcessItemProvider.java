/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


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
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider
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
	public ProcessItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_description_feature", "_UI_Process_type"),
				 Schema1Package.Literals.PROCESS__DESCRIPTION,
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
				 getString("_UI_Process_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_name_feature", "_UI_Process_type"),
				 Schema1Package.Literals.PROCESS__NAME,
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
			childrenFeatures.add(Schema1Package.Literals.PROCESS__INPUTS);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__OUTPUTS);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__PRECONDITION);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__POSTCONDITION);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__ORGANIZATIONS);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__OPERATIONAL_DATA);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__FLOW_CONTENT);
			childrenFeatures.add(Schema1Package.Literals.PROCESS__EXTENDED_ATTRIBUTES);
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
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((com.ibm.wbim.bom.schema1.Process)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Process_type") :
			getString("_UI_Process_type") + " " + label;
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

		switch (notification.getFeatureID(com.ibm.wbim.bom.schema1.Process.class)) {
			case Schema1Package.PROCESS__DESCRIPTION:
			case Schema1Package.PROCESS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Schema1Package.PROCESS__INPUTS:
			case Schema1Package.PROCESS__OUTPUTS:
			case Schema1Package.PROCESS__PRECONDITION:
			case Schema1Package.PROCESS__POSTCONDITION:
			case Schema1Package.PROCESS__ORGANIZATIONS:
			case Schema1Package.PROCESS__OPERATIONAL_DATA:
			case Schema1Package.PROCESS__FLOW_CONTENT:
			case Schema1Package.PROCESS__EXTENDED_ATTRIBUTES:
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
				(Schema1Package.Literals.PROCESS__INPUTS,
				 Schema1Factory.eINSTANCE.createInputs()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__OUTPUTS,
				 Schema1Factory.eINSTANCE.createOutputs()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__PRECONDITION,
				 Schema1Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__POSTCONDITION,
				 Schema1Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__ORGANIZATIONS,
				 Schema1Factory.eINSTANCE.createOrganizations()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__OPERATIONAL_DATA,
				 Schema1Factory.eINSTANCE.createOperationalData()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__FLOW_CONTENT,
				 Schema1Factory.eINSTANCE.createFlowContentType()));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.Literals.PROCESS__EXTENDED_ATTRIBUTES,
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

		boolean qualify =
			childFeature == Schema1Package.Literals.PROCESS__PRECONDITION ||
			childFeature == Schema1Package.Literals.PROCESS__POSTCONDITION;

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
