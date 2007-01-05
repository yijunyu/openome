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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xmlsoap.schemas.ws._2003._03.business.process.provider.BPEL4WSEditPlugin;

import org.xmlsoap.schemas.wsdl.TOperation;
import org.xmlsoap.schemas.wsdl.WsdlFactory;
import org.xmlsoap.schemas.wsdl.WsdlPackage;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.wsdl.TOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TOperationItemProvider
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
	public TOperationItemProvider(AdapterFactory adapterFactory) {
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
			addParameterOrderPropertyDescriptor(object);
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
				 getString("_UI_TOperation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TOperation_name_feature", "_UI_TOperation_type"),
				 WsdlPackage.eINSTANCE.getTOperation_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TOperation_parameterOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TOperation_parameterOrder_feature", "_UI_TOperation_type"),
				 WsdlPackage.eINSTANCE.getTOperation_ParameterOrder(),
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
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTOperation_Input());
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTOperation_Output());
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTOperation_Fault());
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTOperation_Output1());
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTOperation_Input1());
			childrenFeatures.add(WsdlPackage.eINSTANCE.getTOperation_Fault1());
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
	 * This returns TOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TOperation");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TOperation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TOperation_type") :
			getString("_UI_TOperation_type") + " " + label;
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

		switch (notification.getFeatureID(TOperation.class)) {
			case WsdlPackage.TOPERATION__NAME:
			case WsdlPackage.TOPERATION__PARAMETER_ORDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WsdlPackage.TOPERATION__INPUT:
			case WsdlPackage.TOPERATION__OUTPUT:
			case WsdlPackage.TOPERATION__FAULT:
			case WsdlPackage.TOPERATION__OUTPUT1:
			case WsdlPackage.TOPERATION__INPUT1:
			case WsdlPackage.TOPERATION__FAULT1:
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
				(WsdlPackage.eINSTANCE.getTOperation_Input(),
				 WsdlFactory.eINSTANCE.createTParam()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTOperation_Output(),
				 WsdlFactory.eINSTANCE.createTParam()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTOperation_Fault(),
				 WsdlFactory.eINSTANCE.createTFault()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTOperation_Output1(),
				 WsdlFactory.eINSTANCE.createTParam()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTOperation_Input1(),
				 WsdlFactory.eINSTANCE.createTParam()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlPackage.eINSTANCE.getTOperation_Fault1(),
				 WsdlFactory.eINSTANCE.createTFault()));
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
			childFeature == WsdlPackage.eINSTANCE.getTOperation_Input() ||
			childFeature == WsdlPackage.eINSTANCE.getTOperation_Output() ||
			childFeature == WsdlPackage.eINSTANCE.getTOperation_Output1() ||
			childFeature == WsdlPackage.eINSTANCE.getTOperation_Input1() ||
			childFeature == WsdlPackage.eINSTANCE.getTOperation_Fault() ||
			childFeature == WsdlPackage.eINSTANCE.getTOperation_Fault1();

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
		return BPEL4WSEditPlugin.INSTANCE;
	}

}
