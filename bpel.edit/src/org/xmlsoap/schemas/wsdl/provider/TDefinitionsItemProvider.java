/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.wsdl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xmlsoap.schemas.ws._2003._03.business.process.provider.BPEL4WSEditPlugin;

import org.xmlsoap.schemas.wsdl.TDefinitions;
import org.xmlsoap.schemas.wsdl.WsdlFactory;
import org.xmlsoap.schemas.wsdl.WsdlPackage;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.wsdl.TDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDefinitionsItemProvider
	extends TExtensibleDocumentedItemProvider
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
	public TDefinitionsItemProvider(AdapterFactory adapterFactory) {
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
			addTargetNamespacePropertyDescriptor(object);
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
				 getString("_UI_TDefinitions_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_name_feature", "_UI_TDefinitions_type"),
				 WsdlPackage.eINSTANCE.getTDefinitions_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TDefinitions_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_targetNamespace_feature", "_UI_TDefinitions_type"),
				 WsdlPackage.eINSTANCE.getTDefinitions_TargetNamespace(),
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
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement());
		}
		return childrenFeatures;
	}

	/**
	 * This returns TDefinitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TDefinitions");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TDefinitions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TDefinitions_type") :
			getString("_UI_TDefinitions_type") + " " + label;
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

		switch (notification.getFeatureID(TDefinitions.class)) {
			case WsdlPackage.TDEFINITIONS__NAME:
			case WsdlPackage.TDEFINITIONS__TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT:
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
				(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement(),
				 FeatureMapUtil.createEntry
					(WsdlPackage.eINSTANCE.getTDefinitions_Import(),
					 WsdlFactory.eINSTANCE.createTImport())));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement(),
				 FeatureMapUtil.createEntry
					(WsdlPackage.eINSTANCE.getTDefinitions_Types(),
					 WsdlFactory.eINSTANCE.createTTypes())));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement(),
				 FeatureMapUtil.createEntry
					(WsdlPackage.eINSTANCE.getTDefinitions_Message(),
					 WsdlFactory.eINSTANCE.createTMessage())));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement(),
				 FeatureMapUtil.createEntry
					(WsdlPackage.eINSTANCE.getTDefinitions_PortType(),
					 WsdlFactory.eINSTANCE.createTPortType())));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement(),
				 FeatureMapUtil.createEntry
					(WsdlPackage.eINSTANCE.getTDefinitions_Binding(),
					 WsdlFactory.eINSTANCE.createTBinding())));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTDefinitions_AnyTopLevelOptionalElement(),
				 FeatureMapUtil.createEntry
					(WsdlPackage.eINSTANCE.getTDefinitions_Service(),
					 WsdlFactory.eINSTANCE.createTService())));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return BPEL4WSEditPlugin.INSTANCE;
	}

}
