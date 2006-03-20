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
import org.xmlsoap.schemas.ws._2003._03.business.process.TProcess;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2003._03.business.process.TProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TProcessItemProvider
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
	public TProcessItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractProcessPropertyDescriptor(object);
			addEnableInstanceCompensationPropertyDescriptor(object);
			addExpressionLanguagePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addQueryLanguagePropertyDescriptor(object);
			addSuppressJoinFailurePropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TProcess_abstractProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_abstractProcess_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_AbstractProcess(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Instance Compensation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableInstanceCompensationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TProcess_enableInstanceCompensation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_enableInstanceCompensation_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_EnableInstanceCompensation(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expression Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TProcess_expressionLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_expressionLanguage_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_ExpressionLanguage(),
				 true,
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
				 getString("_UI_TProcess_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_name_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Query Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TProcess_queryLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_queryLanguage_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_QueryLanguage(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Suppress Join Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressJoinFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TProcess_suppressJoinFailure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_suppressJoinFailure_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_SuppressJoinFailure(),
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
				 getString("_UI_TProcess_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TProcess_targetNamespace_feature", "_UI_TProcess_type"),
				 ProcessPackage.eINSTANCE.getTProcess_TargetNamespace(),
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
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_PartnerLinks());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Partners());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Variables());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_CorrelationSets());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_FaultHandlers());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_CompensationHandler());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_EventHandlers());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Empty());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Invoke());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Receive());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Reply());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Assign());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Wait());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Throw());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Terminate());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Flow());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Switch());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_While());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Sequence());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Pick());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTProcess_Scope());
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
	 * This returns TProcess.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TProcess");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TProcess)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TProcess_type") :
			getString("_UI_TProcess_type") + " " + label;
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

		switch (notification.getFeatureID(TProcess.class)) {
			case ProcessPackage.TPROCESS__ABSTRACT_PROCESS:
			case ProcessPackage.TPROCESS__ENABLE_INSTANCE_COMPENSATION:
			case ProcessPackage.TPROCESS__EXPRESSION_LANGUAGE:
			case ProcessPackage.TPROCESS__NAME:
			case ProcessPackage.TPROCESS__QUERY_LANGUAGE:
			case ProcessPackage.TPROCESS__SUPPRESS_JOIN_FAILURE:
			case ProcessPackage.TPROCESS__TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessPackage.TPROCESS__PARTNER_LINKS:
			case ProcessPackage.TPROCESS__PARTNERS:
			case ProcessPackage.TPROCESS__VARIABLES:
			case ProcessPackage.TPROCESS__CORRELATION_SETS:
			case ProcessPackage.TPROCESS__FAULT_HANDLERS:
			case ProcessPackage.TPROCESS__COMPENSATION_HANDLER:
			case ProcessPackage.TPROCESS__EVENT_HANDLERS:
			case ProcessPackage.TPROCESS__EMPTY:
			case ProcessPackage.TPROCESS__INVOKE:
			case ProcessPackage.TPROCESS__RECEIVE:
			case ProcessPackage.TPROCESS__REPLY:
			case ProcessPackage.TPROCESS__ASSIGN:
			case ProcessPackage.TPROCESS__WAIT:
			case ProcessPackage.TPROCESS__THROW:
			case ProcessPackage.TPROCESS__TERMINATE:
			case ProcessPackage.TPROCESS__FLOW:
			case ProcessPackage.TPROCESS__SWITCH:
			case ProcessPackage.TPROCESS__WHILE:
			case ProcessPackage.TPROCESS__SEQUENCE:
			case ProcessPackage.TPROCESS__PICK:
			case ProcessPackage.TPROCESS__SCOPE:
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
				(ProcessPackage.eINSTANCE.getTProcess_PartnerLinks(),
				 ProcessFactory.eINSTANCE.createTPartnerLinks()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Partners(),
				 ProcessFactory.eINSTANCE.createTPartners()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Variables(),
				 ProcessFactory.eINSTANCE.createTVariables()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_CorrelationSets(),
				 ProcessFactory.eINSTANCE.createTCorrelationSets()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_FaultHandlers(),
				 ProcessFactory.eINSTANCE.createTFaultHandlers()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_CompensationHandler(),
				 ProcessFactory.eINSTANCE.createTCompensationHandler()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_EventHandlers(),
				 ProcessFactory.eINSTANCE.createTEventHandlers()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Empty(),
				 ProcessFactory.eINSTANCE.createTEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Invoke(),
				 ProcessFactory.eINSTANCE.createTInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Receive(),
				 ProcessFactory.eINSTANCE.createTReceive()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Reply(),
				 ProcessFactory.eINSTANCE.createTReply()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Assign(),
				 ProcessFactory.eINSTANCE.createTAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Wait(),
				 ProcessFactory.eINSTANCE.createTWait()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Throw(),
				 ProcessFactory.eINSTANCE.createTThrow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Terminate(),
				 ProcessFactory.eINSTANCE.createTTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Flow(),
				 ProcessFactory.eINSTANCE.createTFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Switch(),
				 ProcessFactory.eINSTANCE.createTSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_While(),
				 ProcessFactory.eINSTANCE.createTWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Sequence(),
				 ProcessFactory.eINSTANCE.createTSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Pick(),
				 ProcessFactory.eINSTANCE.createTPick()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTProcess_Scope(),
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
