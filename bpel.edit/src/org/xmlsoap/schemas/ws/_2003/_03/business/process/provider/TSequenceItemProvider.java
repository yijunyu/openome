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

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessFactory;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSequence;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2003._03.business.process.TSequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TSequenceItemProvider
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
	public TSequenceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTSequence_Activity());
		}
		return childrenFeatures;
	}

	/**
	 * This returns TSequence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TSequence");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TSequence)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TSequence_type") :
			getString("_UI_TSequence_type") + " " + label;
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

		switch (notification.getFeatureID(TSequence.class)) {
			case ProcessPackage.TSEQUENCE__ACTIVITY:
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
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Empty(),
					 ProcessFactory.eINSTANCE.createTEmpty())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Invoke(),
					 ProcessFactory.eINSTANCE.createTInvoke())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Receive(),
					 ProcessFactory.eINSTANCE.createTReceive())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Reply(),
					 ProcessFactory.eINSTANCE.createTReply())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Assign(),
					 ProcessFactory.eINSTANCE.createTAssign())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Wait(),
					 ProcessFactory.eINSTANCE.createTWait())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Throw(),
					 ProcessFactory.eINSTANCE.createTThrow())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Terminate(),
					 ProcessFactory.eINSTANCE.createTTerminate())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Flow(),
					 ProcessFactory.eINSTANCE.createTFlow())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Switch(),
					 ProcessFactory.eINSTANCE.createTSwitch())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_While(),
					 ProcessFactory.eINSTANCE.createTWhile())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Sequence(),
					 ProcessFactory.eINSTANCE.createTSequence())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Pick(),
					 ProcessFactory.eINSTANCE.createTPick())));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTSequence_Activity(),
				 FeatureMapUtil.createEntry
					(ProcessPackage.eINSTANCE.getTSequence_Scope(),
					 ProcessFactory.eINSTANCE.createTScope())));
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
