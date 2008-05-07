/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.provider;


import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.openome_modelFactory;
import edu.toronto.cs.openome_model.openome_modelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.toronto.cs.openome_model.Intention} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentionItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addRulePropertyDescriptor(object);
			addSystemPropertyDescriptor(object);
			addBoundaryPropertyDescriptor(object);
			addExclusivePropertyDescriptor(object);
			addSequentialPropertyDescriptor(object);
			addParallelPropertyDescriptor(object);
			addDependencyFromPropertyDescriptor(object);
			addDependencyToPropertyDescriptor(object);
			addDecompositionsPropertyDescriptor(object);
			addParentDecompositionsPropertyDescriptor(object);
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
				 getString("_UI_Intention_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_name_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intention_rule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_rule_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__RULE,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_Intention_system_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_system_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__SYSTEM,
				 true,
				 false,
				 false,
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
				 getString("_UI_Intention_boundary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_boundary_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__BOUNDARY,
				 true,
				 false,
				 false,
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
				 getString("_UI_Intention_exclusive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_exclusive_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__EXCLUSIVE,
				 true,
				 false,
				 false,
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
				 getString("_UI_Intention_sequential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_sequential_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__SEQUENTIAL,
				 true,
				 false,
				 false,
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
				 getString("_UI_Intention_parallel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_parallel_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__PARALLEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependency From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intention_dependencyFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_dependencyFrom_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__DEPENDENCY_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependency To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intention_dependencyTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_dependencyTo_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__DEPENDENCY_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decompositions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecompositionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intention_decompositions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_decompositions_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__DECOMPOSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Decompositions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentDecompositionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intention_parentDecompositions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intention_parentDecompositions_feature", "_UI_Intention_type"),
				 openome_modelPackage.Literals.INTENTION__PARENT_DECOMPOSITIONS,
				 true,
				 false,
				 true,
				 null,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(openome_modelPackage.Literals.INTENTION__LABEL);
			childrenFeatures.add(openome_modelPackage.Literals.INTENTION__INPUT);
			childrenFeatures.add(openome_modelPackage.Literals.INTENTION__OUTPUT);
			childrenFeatures.add(openome_modelPackage.Literals.INTENTION__PROPERTY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Intention.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Intention"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Intention)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Intention_type") :
			getString("_UI_Intention_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Intention.class)) {
			case openome_modelPackage.INTENTION__NAME:
			case openome_modelPackage.INTENTION__SYSTEM:
			case openome_modelPackage.INTENTION__BOUNDARY:
			case openome_modelPackage.INTENTION__EXCLUSIVE:
			case openome_modelPackage.INTENTION__SEQUENTIAL:
			case openome_modelPackage.INTENTION__PARALLEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case openome_modelPackage.INTENTION__LABEL:
			case openome_modelPackage.INTENTION__INPUT:
			case openome_modelPackage.INTENTION__OUTPUT:
			case openome_modelPackage.INTENTION__PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createTruthLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createConflictLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createDeniedLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createPartiallyDeniedLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createPartiallySatisfiedLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createSatisfiedLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__LABEL,
				 openome_modelFactory.eINSTANCE.createUnknownLabel()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__INPUT,
				 openome_modelFactory.eINSTANCE.createTopic()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__OUTPUT,
				 openome_modelFactory.eINSTANCE.createTopic()));

		newChildDescriptors.add
			(createChildParameter
				(openome_modelPackage.Literals.INTENTION__PROPERTY,
				 openome_modelFactory.eINSTANCE.createProperty()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == openome_modelPackage.Literals.INTENTION__INPUT ||
			childFeature == openome_modelPackage.Literals.INTENTION__OUTPUT;

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
	@Override
	public ResourceLocator getResourceLocator() {
		return openome_modelEditPlugin.INSTANCE;
	}

}
