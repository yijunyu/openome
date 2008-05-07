/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.provider;

import com.ibm.wbim.bom.schema1.DistributionType;
import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.ibm.wbim.bom.schema1.DistributionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionTypeItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTypeItemProvider(AdapterFactory adapterFactory) {
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__EXPONENTIAL);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__GAMMA);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__LOGNORMAL);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__NORMAL);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__POISSON);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__RANDOM_LIST);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__UNIFORM);
			childrenFeatures
					.add(Schema1Package.Literals.DISTRIBUTION_TYPE__WEIGHTED_LIST);
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
	 * This returns DistributionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DistributionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DistributionType_type");
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

		switch (notification.getFeatureID(DistributionType.class)) {
		case Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL:
		case Schema1Package.DISTRIBUTION_TYPE__GAMMA:
		case Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL:
		case Schema1Package.DISTRIBUTION_TYPE__NORMAL:
		case Schema1Package.DISTRIBUTION_TYPE__POISSON:
		case Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST:
		case Schema1Package.DISTRIBUTION_TYPE__UNIFORM:
		case Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__EXPONENTIAL,
				Schema1Factory.eINSTANCE.createExponentialType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__GAMMA,
				Schema1Factory.eINSTANCE.createGammaType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__LOGNORMAL,
				Schema1Factory.eINSTANCE.createLognormalType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__NORMAL,
				Schema1Factory.eINSTANCE.createNormalType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__POISSON,
				Schema1Factory.eINSTANCE.createPoissonType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__RANDOM_LIST,
				Schema1Factory.eINSTANCE.createRandomListType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__UNIFORM,
				Schema1Factory.eINSTANCE.createUniformType()));

		newChildDescriptors.add(createChildParameter(
				Schema1Package.Literals.DISTRIBUTION_TYPE__WEIGHTED_LIST,
				Schema1Factory.eINSTANCE.createWeightedListType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WbimodelEditPlugin.INSTANCE;
	}

}
