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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessFactory;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TActivityOrCompensateContainer;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2003._03.business.process.TActivityOrCompensateContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TActivityOrCompensateContainerItemProvider
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
	public TActivityOrCompensateContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Empty());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Invoke());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Receive());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Reply());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Assign());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Wait());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Throw());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Terminate());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Flow());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Switch());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_While());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Sequence());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Pick());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Scope());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Compensate());
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
	 * This returns TActivityOrCompensateContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TActivityOrCompensateContainer");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_TActivityOrCompensateContainer_type");
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

		switch (notification.getFeatureID(TActivityOrCompensateContainer.class)) {
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE:
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE:
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
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Empty(),
				 ProcessFactory.eINSTANCE.createTEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Invoke(),
				 ProcessFactory.eINSTANCE.createTInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Receive(),
				 ProcessFactory.eINSTANCE.createTReceive()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Reply(),
				 ProcessFactory.eINSTANCE.createTReply()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Assign(),
				 ProcessFactory.eINSTANCE.createTAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Wait(),
				 ProcessFactory.eINSTANCE.createTWait()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Throw(),
				 ProcessFactory.eINSTANCE.createTThrow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Terminate(),
				 ProcessFactory.eINSTANCE.createTTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Flow(),
				 ProcessFactory.eINSTANCE.createTFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Switch(),
				 ProcessFactory.eINSTANCE.createTSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_While(),
				 ProcessFactory.eINSTANCE.createTWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Sequence(),
				 ProcessFactory.eINSTANCE.createTSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Pick(),
				 ProcessFactory.eINSTANCE.createTPick()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Scope(),
				 ProcessFactory.eINSTANCE.createTScope()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer_Compensate(),
				 ProcessFactory.eINSTANCE.createTCompensate()));
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
