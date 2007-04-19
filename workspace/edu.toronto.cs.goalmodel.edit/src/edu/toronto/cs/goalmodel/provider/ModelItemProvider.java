/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.provider;


import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Model;

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
 * This is the item provider adapter for a {@link edu.toronto.cs.goalmodel.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider
  extends ItemProviderAdapter
  implements	
    IEditingDomainItemProvider,	
    IStructuredItemContentProvider,	
    ITreeItemContentProvider,	
    IItemLabelProvider,	
    IItemPropertySource		
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addNamePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Model_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Model_name_feature", "_UI_Model_type"),
         GoalmodelPackage.Literals.MODEL__NAME,
         true,
         false,
         false,
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
  public Collection getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(GoalmodelPackage.Literals.MODEL__INTENTIONS);
      childrenFeatures.add(GoalmodelPackage.Literals.MODEL__CONTRIBUTIONS);
      childrenFeatures.add(GoalmodelPackage.Literals.MODEL__DEPENDENCIES);
      childrenFeatures.add(GoalmodelPackage.Literals.MODEL__DECOMPOSITIONS);
      childrenFeatures.add(GoalmodelPackage.Literals.MODEL__CONTAINERS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Model.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object)
  {
    String label = ((Model)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Model_type") :
      getString("_UI_Model_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Model.class))
    {
      case GoalmodelPackage.MODEL__NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case GoalmodelPackage.MODEL__INTENTIONS:
      case GoalmodelPackage.MODEL__CONTRIBUTIONS:
      case GoalmodelPackage.MODEL__DEPENDENCIES:
      case GoalmodelPackage.MODEL__DECOMPOSITIONS:
      case GoalmodelPackage.MODEL__CONTAINERS:
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
  protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__INTENTIONS,
         GoalmodelFactory.eINSTANCE.createIntention()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__INTENTIONS,
         GoalmodelFactory.eINSTANCE.createGoal()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__INTENTIONS,
         GoalmodelFactory.eINSTANCE.createResource()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__INTENTIONS,
         GoalmodelFactory.eINSTANCE.createSoftgoal()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__INTENTIONS,
         GoalmodelFactory.eINSTANCE.createTask()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTRIBUTIONS,
         GoalmodelFactory.eINSTANCE.createContribution()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTRIBUTIONS,
         GoalmodelFactory.eINSTANCE.createBreakContribution()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTRIBUTIONS,
         GoalmodelFactory.eINSTANCE.createHelpContribution()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTRIBUTIONS,
         GoalmodelFactory.eINSTANCE.createHurtContribution()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTRIBUTIONS,
         GoalmodelFactory.eINSTANCE.createMakeContribution()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__DEPENDENCIES,
         GoalmodelFactory.eINSTANCE.createDependency()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__DECOMPOSITIONS,
         GoalmodelFactory.eINSTANCE.createDecomposition()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__DECOMPOSITIONS,
         GoalmodelFactory.eINSTANCE.createAndDecomposition()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__DECOMPOSITIONS,
         GoalmodelFactory.eINSTANCE.createOrDecomposition()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTAINERS,
         GoalmodelFactory.eINSTANCE.createContainer()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTAINERS,
         GoalmodelFactory.eINSTANCE.createActor()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTAINERS,
         GoalmodelFactory.eINSTANCE.createAgent()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTAINERS,
         GoalmodelFactory.eINSTANCE.createAspect()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTAINERS,
         GoalmodelFactory.eINSTANCE.createPosition()));

    newChildDescriptors.add
      (createChildParameter
        (GoalmodelPackage.Literals.MODEL__CONTAINERS,
         GoalmodelFactory.eINSTANCE.createRole()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return GoalmodelEditPlugin.INSTANCE;
  }

}
