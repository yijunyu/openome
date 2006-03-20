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

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessFactory;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TInvoke;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2003._03.business.process.TInvoke} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TInvokeItemProvider
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
	public TInvokeItemProvider(AdapterFactory adapterFactory) {
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

			addInputVariablePropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addOutputVariablePropertyDescriptor(object);
			addPartnerLinkPropertyDescriptor(object);
			addPortTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TInvoke_inputVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TInvoke_inputVariable_feature", "_UI_TInvoke_type"),
				 ProcessPackage.eINSTANCE.getTInvoke_InputVariable(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_TInvoke_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TInvoke_operation_feature", "_UI_TInvoke_type"),
				 ProcessPackage.eINSTANCE.getTInvoke_Operation(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TInvoke_outputVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TInvoke_outputVariable_feature", "_UI_TInvoke_type"),
				 ProcessPackage.eINSTANCE.getTInvoke_OutputVariable(),
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
				 getString("_UI_TInvoke_partnerLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TInvoke_partnerLink_feature", "_UI_TInvoke_type"),
				 ProcessPackage.eINSTANCE.getTInvoke_PartnerLink(),
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
				 getString("_UI_TInvoke_portType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TInvoke_portType_feature", "_UI_TInvoke_type"),
				 ProcessPackage.eINSTANCE.getTInvoke_PortType(),
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
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTInvoke_Correlations());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTInvoke_Catch());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTInvoke_CatchAll());
			childrenFeatures.add(ProcessPackage.eINSTANCE.getTInvoke_CompensationHandler());
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
	 * This returns TInvoke.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TInvoke");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TInvoke)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TInvoke_type") :
			getString("_UI_TInvoke_type") + " " + label;
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

		switch (notification.getFeatureID(TInvoke.class)) {
			case ProcessPackage.TINVOKE__INPUT_VARIABLE:
			case ProcessPackage.TINVOKE__OPERATION:
			case ProcessPackage.TINVOKE__OUTPUT_VARIABLE:
			case ProcessPackage.TINVOKE__PARTNER_LINK:
			case ProcessPackage.TINVOKE__PORT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessPackage.TINVOKE__CORRELATIONS:
			case ProcessPackage.TINVOKE__CATCH:
			case ProcessPackage.TINVOKE__CATCH_ALL:
			case ProcessPackage.TINVOKE__COMPENSATION_HANDLER:
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
				(ProcessPackage.eINSTANCE.getTInvoke_Correlations(),
				 ProcessFactory.eINSTANCE.createTCorrelationsWithPattern()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTInvoke_Catch(),
				 ProcessFactory.eINSTANCE.createTCatch()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTInvoke_CatchAll(),
				 ProcessFactory.eINSTANCE.createTActivityOrCompensateContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTInvoke_CatchAll(),
				 ProcessFactory.eINSTANCE.createTCatch()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTInvoke_CatchAll(),
				 ProcessFactory.eINSTANCE.createTCompensationHandler()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.eINSTANCE.getTInvoke_CompensationHandler(),
				 ProcessFactory.eINSTANCE.createTCompensationHandler()));
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
			childFeature == ProcessPackage.eINSTANCE.getTInvoke_Catch() ||
			childFeature == ProcessPackage.eINSTANCE.getTInvoke_CatchAll() ||
			childFeature == ProcessPackage.eINSTANCE.getTInvoke_CompensationHandler();

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
