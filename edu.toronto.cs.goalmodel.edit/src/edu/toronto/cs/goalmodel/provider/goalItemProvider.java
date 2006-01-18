/**
 * <copyright>
 * </copyright>
 *
 * $Id: goalItemProvider.java,v 1.1 2005/10/30 17:12:48 yijunsf Exp $
 */
package edu.toronto.cs.goalmodel.provider;


import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.goal;

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
 * This is the item provider adapter for a {@link edu.toronto.cs.goalmodel.goal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class goalItemProvider
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
	public goalItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addSystemPropertyDescriptor(object);
			addBoundaryPropertyDescriptor(object);
			addExclusivePropertyDescriptor(object);
			addSequentialPropertyDescriptor(object);
			addParallelPropertyDescriptor(object);
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
				 getString("_UI_goal_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_name_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_type_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Type(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_label_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Label(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_system_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_system_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_System(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boundary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_boundary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_boundary_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Boundary(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_exclusive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_exclusive_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Exclusive(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequential feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequentialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_sequential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_sequential_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Sequential(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_goal_parallel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_goal_parallel_feature", "_UI_goal_type"),
				 GoalmodelPackage.eINSTANCE.getgoal_Parallel(),
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
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_Goal());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_Rule());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_Topic());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_Input());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_Output());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_Property());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_DependencyFrom());
			childrenFeatures.add(GoalmodelPackage.eINSTANCE.getgoal_DependencyTo());
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
	 * This returns goal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/goal");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((goal)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_goal_type") :
			getString("_UI_goal_type") + " " + label;
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

		switch (notification.getFeatureID(goal.class)) {
			case GoalmodelPackage.GOAL__NAME:
			case GoalmodelPackage.GOAL__TYPE:
			case GoalmodelPackage.GOAL__LABEL:
			case GoalmodelPackage.GOAL__SYSTEM:
			case GoalmodelPackage.GOAL__BOUNDARY:
			case GoalmodelPackage.GOAL__EXCLUSIVE:
			case GoalmodelPackage.GOAL__SEQUENTIAL:
			case GoalmodelPackage.GOAL__PARALLEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GoalmodelPackage.GOAL__GOAL:
			case GoalmodelPackage.GOAL__RULE:
			case GoalmodelPackage.GOAL__TOPIC:
			case GoalmodelPackage.GOAL__INPUT:
			case GoalmodelPackage.GOAL__OUTPUT:
			case GoalmodelPackage.GOAL__PROPERTY:
			case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
			case GoalmodelPackage.GOAL__DEPENDENCY_TO:
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
				(GoalmodelPackage.eINSTANCE.getgoal_Goal(),
				 GoalmodelFactory.eINSTANCE.creategoal()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_Rule(),
				 GoalmodelFactory.eINSTANCE.createcontribution()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_Topic(),
				 GoalmodelFactory.eINSTANCE.createtopic()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_Input(),
				 GoalmodelFactory.eINSTANCE.createtopic()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_Output(),
				 GoalmodelFactory.eINSTANCE.createtopic()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_Property(),
				 GoalmodelFactory.eINSTANCE.createproperty()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_DependencyFrom(),
				 GoalmodelFactory.eINSTANCE.createdependency()));

		newChildDescriptors.add
			(createChildParameter
				(GoalmodelPackage.eINSTANCE.getgoal_DependencyTo(),
				 GoalmodelFactory.eINSTANCE.createdependency()));
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
			childFeature == GoalmodelPackage.eINSTANCE.getgoal_Topic() ||
			childFeature == GoalmodelPackage.eINSTANCE.getgoal_Input() ||
			childFeature == GoalmodelPackage.eINSTANCE.getgoal_Output() ||
			childFeature == GoalmodelPackage.eINSTANCE.getgoal_DependencyFrom() ||
			childFeature == GoalmodelPackage.eINSTANCE.getgoal_DependencyTo();

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
		return GoalEditPlugin.INSTANCE;
	}

}
