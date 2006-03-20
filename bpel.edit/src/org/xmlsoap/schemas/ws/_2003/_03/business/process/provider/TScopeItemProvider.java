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
import org.xmlsoap.schemas.ws._2003._03.business.process.TScope;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2003._03.business.process.TScope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TScopeItemProvider
	extends TActivityItemProvider
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
	public TScopeItemProvider(AdapterFactory adapterFactory) {
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

			addVariableAccessSerializablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable Access Serializable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableAccessSerializablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TScope_variableAccessSerializable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TScope_variableAccessSerializable_feature", "_UI_TScope_type"),
				 ProcessPackage.eINSTANCE.getTScope_VariableAccessSerializable(),
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
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Variables());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_CorrelationSets());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_FaultHandlers());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_CompensationHandler());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_EventHandlers());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Empty());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Invoke());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Receive());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Reply());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Assign());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Wait());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Throw());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Terminate());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Flow());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Switch());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_While());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Sequence());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Pick());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTScope_Scope());
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
	 * This returns TScope.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TScope");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TScope)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TScope_type") :
			getString("_UI_TScope_type") + " " + label;
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

		switch (notification.getFeatureID(TScope.class)) {
			case ProcessPackage.TSCOPE__VARIABLE_ACCESS_SERIALIZABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessPackage.TSCOPE__VARIABLES:
			case ProcessPackage.TSCOPE__CORRELATION_SETS:
			case ProcessPackage.TSCOPE__FAULT_HANDLERS:
			case ProcessPackage.TSCOPE__COMPENSATION_HANDLER:
			case ProcessPackage.TSCOPE__EVENT_HANDLERS:
			case ProcessPackage.TSCOPE__EMPTY:
			case ProcessPackage.TSCOPE__INVOKE:
			case ProcessPackage.TSCOPE__RECEIVE:
			case ProcessPackage.TSCOPE__REPLY:
			case ProcessPackage.TSCOPE__ASSIGN:
			case ProcessPackage.TSCOPE__WAIT:
			case ProcessPackage.TSCOPE__THROW:
			case ProcessPackage.TSCOPE__TERMINATE:
			case ProcessPackage.TSCOPE__FLOW:
			case ProcessPackage.TSCOPE__SWITCH:
			case ProcessPackage.TSCOPE__WHILE:
			case ProcessPackage.TSCOPE__SEQUENCE:
			case ProcessPackage.TSCOPE__PICK:
			case ProcessPackage.TSCOPE__SCOPE:
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
				(ProcessPackage.eINSTANCE.getTScope_Variables(),
				 ProcessFactory.eINSTANCE.createTVariables()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_CorrelationSets(),
				 ProcessFactory.eINSTANCE.createTCorrelationSets()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_FaultHandlers(),
				 ProcessFactory.eINSTANCE.createTFaultHandlers()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_CompensationHandler(),
				 ProcessFactory.eINSTANCE.createTCompensationHandler()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_EventHandlers(),
				 ProcessFactory.eINSTANCE.createTEventHandlers()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Empty(),
				 ProcessFactory.eINSTANCE.createTEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Invoke(),
				 ProcessFactory.eINSTANCE.createTInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Receive(),
				 ProcessFactory.eINSTANCE.createTReceive()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Reply(),
				 ProcessFactory.eINSTANCE.createTReply()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Assign(),
				 ProcessFactory.eINSTANCE.createTAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Wait(),
				 ProcessFactory.eINSTANCE.createTWait()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Throw(),
				 ProcessFactory.eINSTANCE.createTThrow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Terminate(),
				 ProcessFactory.eINSTANCE.createTTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Flow(),
				 ProcessFactory.eINSTANCE.createTFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Switch(),
				 ProcessFactory.eINSTANCE.createTSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_While(),
				 ProcessFactory.eINSTANCE.createTWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Sequence(),
				 ProcessFactory.eINSTANCE.createTSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Pick(),
				 ProcessFactory.eINSTANCE.createTPick()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTScope_Scope(),
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
