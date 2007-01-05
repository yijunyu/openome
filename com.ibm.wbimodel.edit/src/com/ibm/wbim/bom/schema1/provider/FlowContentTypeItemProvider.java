/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;


import com.ibm.wbim.bom.schema1.FlowContentType;
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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.FlowContentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowContentTypeItemProvider
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
	public FlowContentTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Schema1Package.eINSTANCE.getFlowContentType_Group());
		}
		return childrenFeatures;
	}

	/**
	 * This returns FlowContentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/FlowContentType");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_FlowContentType_type");
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

		switch (notification.getFeatureID(FlowContentType.class)) {
			case Schema1Package.FLOW_CONTENT_TYPE__GROUP:
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
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_StartNode(),
					 Schema1Factory.eINSTANCE.createStartNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_StopNode(),
					 Schema1Factory.eINSTANCE.createStopNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_EndNode(),
					 Schema1Factory.eINSTANCE.createEndNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createTask())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createMap())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createNotificationBroadcaster())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createNotificationReceiver())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createObserver())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createService())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Task(),
					 Schema1Factory.eINSTANCE.createTimer())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Decision(),
					 Schema1Factory.eINSTANCE.createDecision())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Merge(),
					 Schema1Factory.eINSTANCE.createMerge())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Fork(),
					 Schema1Factory.eINSTANCE.createFork())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Join(),
					 Schema1Factory.eINSTANCE.createJoin())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_NotificationBroadcaster(),
					 Schema1Factory.eINSTANCE.createNotificationBroadcaster())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_NotificationReceiver(),
					 Schema1Factory.eINSTANCE.createNotificationReceiver())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Observer(),
					 Schema1Factory.eINSTANCE.createObserver())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Timer(),
					 Schema1Factory.eINSTANCE.createTimer())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Map(),
					 Schema1Factory.eINSTANCE.createMap())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Loop(),
					 Schema1Factory.eINSTANCE.createLoop())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_ForLoop(),
					 Schema1Factory.eINSTANCE.createForLoop())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Process(),
					 Schema1Factory.eINSTANCE.createProcess())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Process(),
					 Schema1Factory.eINSTANCE.createForLoop())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Process(),
					 Schema1Factory.eINSTANCE.createLoop())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_LocalRepository(),
					 Schema1Factory.eINSTANCE.createLocalRepository())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_CallToProcess(),
					 Schema1Factory.eINSTANCE.createCallToProcessType())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_CallToTask(),
					 Schema1Factory.eINSTANCE.createCallToTaskType())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_CallToService(),
					 Schema1Factory.eINSTANCE.createCallToServiceType())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Connection(),
					 Schema1Factory.eINSTANCE.createConnection())));

		newChildDescriptors.add
			(createChildParameter
				(Schema1Package.eINSTANCE.getFlowContentType_Group(),
				 FeatureMapUtil.createEntry
					(Schema1Package.eINSTANCE.getFlowContentType_Annotation(),
					 Schema1Factory.eINSTANCE.createAnnotation())));
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
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_Task() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_Map() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_NotificationBroadcaster() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_NotificationReceiver() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_Observer() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_Timer() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_Loop() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_Process() ||
			childFeature == Schema1Package.eINSTANCE.getFlowContentType_ForLoop();

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
