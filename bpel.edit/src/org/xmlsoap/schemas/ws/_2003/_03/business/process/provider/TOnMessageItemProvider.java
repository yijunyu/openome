/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessFactory;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TOnMessage;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2003._03.business.process.TOnMessage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TOnMessageItemProvider
	extends TExtensibleElementsItemProvider
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
	public TOnMessageItemProvider(AdapterFactory adapterFactory) {
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

			addOperationPropertyDescriptor(object);
			addPartnerLinkPropertyDescriptor(object);
			addPortTypePropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TOnMessage_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TOnMessage_operation_feature", "_UI_TOnMessage_type"),
				 ProcessPackage.eINSTANCE.getTOnMessage_Operation(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partner Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartnerLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TOnMessage_partnerLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TOnMessage_partnerLink_feature", "_UI_TOnMessage_type"),
				 ProcessPackage.eINSTANCE.getTOnMessage_PartnerLink(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TOnMessage_portType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TOnMessage_portType_feature", "_UI_TOnMessage_type"),
				 ProcessPackage.eINSTANCE.getTOnMessage_PortType(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TOnMessage_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TOnMessage_variable_feature", "_UI_TOnMessage_type"),
				 ProcessPackage.eINSTANCE.getTOnMessage_Variable(),
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
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Correlations());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Empty());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Invoke());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Receive());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Reply());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Assign());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Wait());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Throw());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Terminate());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Flow());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Switch());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_While());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Sequence());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Pick());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTOnMessage_Scope());
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
	 * This returns TOnMessage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TOnMessage");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TOnMessage)object).getOperation();
		return label == null || label.length() == 0 ?
			getString("_UI_TOnMessage_type") :
			getString("_UI_TOnMessage_type") + " " + label;
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

		switch (notification.getFeatureID(TOnMessage.class)) {
			case ProcessPackage.TON_MESSAGE__OPERATION:
			case ProcessPackage.TON_MESSAGE__PARTNER_LINK:
			case ProcessPackage.TON_MESSAGE__PORT_TYPE:
			case ProcessPackage.TON_MESSAGE__VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessPackage.TON_MESSAGE__CORRELATIONS:
			case ProcessPackage.TON_MESSAGE__EMPTY:
			case ProcessPackage.TON_MESSAGE__INVOKE:
			case ProcessPackage.TON_MESSAGE__RECEIVE:
			case ProcessPackage.TON_MESSAGE__REPLY:
			case ProcessPackage.TON_MESSAGE__ASSIGN:
			case ProcessPackage.TON_MESSAGE__WAIT:
			case ProcessPackage.TON_MESSAGE__THROW:
			case ProcessPackage.TON_MESSAGE__TERMINATE:
			case ProcessPackage.TON_MESSAGE__FLOW:
			case ProcessPackage.TON_MESSAGE__SWITCH:
			case ProcessPackage.TON_MESSAGE__WHILE:
			case ProcessPackage.TON_MESSAGE__SEQUENCE:
			case ProcessPackage.TON_MESSAGE__PICK:
			case ProcessPackage.TON_MESSAGE__SCOPE:
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
				(ProcessPackage.eINSTANCE.getTOnMessage_Correlations(),
				 ProcessFactory.eINSTANCE.createTCorrelations()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Empty(),
				 ProcessFactory.eINSTANCE.createTEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Invoke(),
				 ProcessFactory.eINSTANCE.createTInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Receive(),
				 ProcessFactory.eINSTANCE.createTReceive()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Reply(),
				 ProcessFactory.eINSTANCE.createTReply()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Assign(),
				 ProcessFactory.eINSTANCE.createTAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Wait(),
				 ProcessFactory.eINSTANCE.createTWait()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Throw(),
				 ProcessFactory.eINSTANCE.createTThrow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Terminate(),
				 ProcessFactory.eINSTANCE.createTTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Flow(),
				 ProcessFactory.eINSTANCE.createTFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Switch(),
				 ProcessFactory.eINSTANCE.createTSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_While(),
				 ProcessFactory.eINSTANCE.createTWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Sequence(),
				 ProcessFactory.eINSTANCE.createTSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Pick(),
				 ProcessFactory.eINSTANCE.createTPick()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTOnMessage_Scope(),
				 ProcessFactory.eINSTANCE.createTScope()));
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
