/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Availability;
import com.ibm.wbim.bom.schema1.BulkResource;
import com.ibm.wbim.bom.schema1.CostPerQuantity;
import com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit;
import com.ibm.wbim.bom.schema1.OneTimeCost;
import com.ibm.wbim.bom.schema1.Qualification;
import com.ibm.wbim.bom.schema1.Quantity;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bulk Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getBulkResourceCostType <em>Bulk Resource Cost Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getOneTimeCost <em>One Time Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getCostPerQuantity <em>Cost Per Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getCostPerQuantityAndTimeUnit <em>Cost Per Quantity And Time Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getAvailableQuantity <em>Available Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl#isIsConsumable <em>Is Consumable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BulkResourceImpl extends ComplexDataTypeInstanceImpl implements
		BulkResource {
	/**
	 * The cached value of the '{@link #getBulkResourceCostType() <em>Bulk Resource Cost Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceCostType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap bulkResourceCostType;

	/**
	 * The cached value of the '{@link #getAvailableQuantity() <em>Available Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity availableQuantity;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList<Availability> availability;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualification;

	/**
	 * The default value of the '{@link #isIsConsumable() <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConsumable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSUMABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConsumable() <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConsumable()
	 * @generated
	 * @ordered
	 */
	protected boolean isConsumable = IS_CONSUMABLE_EDEFAULT;

	/**
	 * This is true if the Is Consumable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConsumableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulkResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.BULK_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBulkResourceCostType() {
		if (bulkResourceCostType == null) {
			bulkResourceCostType = new BasicFeatureMap(this,
					Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE);
		}
		return bulkResourceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneTimeCost> getOneTimeCost() {
		return getBulkResourceCostType().list(
				Schema1Package.Literals.BULK_RESOURCE__ONE_TIME_COST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostPerQuantity> getCostPerQuantity() {
		return getBulkResourceCostType().list(
				Schema1Package.Literals.BULK_RESOURCE__COST_PER_QUANTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostPerQuantityAndTimeUnit> getCostPerQuantityAndTimeUnit() {
		return getBulkResourceCostType()
				.list(
						Schema1Package.Literals.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getAvailableQuantity() {
		return availableQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableQuantity(
			Quantity newAvailableQuantity, NotificationChain msgs) {
		Quantity oldAvailableQuantity = availableQuantity;
		availableQuantity = newAvailableQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY,
					oldAvailableQuantity, newAvailableQuantity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableQuantity(Quantity newAvailableQuantity) {
		if (newAvailableQuantity != availableQuantity) {
			NotificationChain msgs = null;
			if (availableQuantity != null)
				msgs = ((InternalEObject) availableQuantity)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY,
								null, msgs);
			if (newAvailableQuantity != null)
				msgs = ((InternalEObject) newAvailableQuantity)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY,
								null, msgs);
			msgs = basicSetAvailableQuantity(newAvailableQuantity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY,
					newAvailableQuantity, newAvailableQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Availability> getAvailability() {
		if (availability == null) {
			availability = new EObjectContainmentEList<Availability>(
					Availability.class, this,
					Schema1Package.BULK_RESOURCE__AVAILABILITY);
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualification() {
		if (qualification == null) {
			qualification = new EObjectContainmentEList<Qualification>(
					Qualification.class, this,
					Schema1Package.BULK_RESOURCE__QUALIFICATION);
		}
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConsumable() {
		return isConsumable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConsumable(boolean newIsConsumable) {
		boolean oldIsConsumable = isConsumable;
		isConsumable = newIsConsumable;
		boolean oldIsConsumableESet = isConsumableESet;
		isConsumableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.BULK_RESOURCE__IS_CONSUMABLE,
					oldIsConsumable, isConsumable, !oldIsConsumableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConsumable() {
		boolean oldIsConsumable = isConsumable;
		boolean oldIsConsumableESet = isConsumableESet;
		isConsumable = IS_CONSUMABLE_EDEFAULT;
		isConsumableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					Schema1Package.BULK_RESOURCE__IS_CONSUMABLE,
					oldIsConsumable, IS_CONSUMABLE_EDEFAULT,
					oldIsConsumableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConsumable() {
		return isConsumableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
			return ((InternalEList<?>) getBulkResourceCostType()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
			return ((InternalEList<?>) getOneTimeCost()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
			return ((InternalEList<?>) getCostPerQuantity()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
			return ((InternalEList<?>) getCostPerQuantityAndTimeUnit())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
			return basicSetAvailableQuantity(null, msgs);
		case Schema1Package.BULK_RESOURCE__AVAILABILITY:
			return ((InternalEList<?>) getAvailability()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.BULK_RESOURCE__QUALIFICATION:
			return ((InternalEList<?>) getQualification()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
			if (coreType)
				return getBulkResourceCostType();
			return ((FeatureMap.Internal) getBulkResourceCostType())
					.getWrapper();
		case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
			return getOneTimeCost();
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
			return getCostPerQuantity();
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
			return getCostPerQuantityAndTimeUnit();
		case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
			return getAvailableQuantity();
		case Schema1Package.BULK_RESOURCE__AVAILABILITY:
			return getAvailability();
		case Schema1Package.BULK_RESOURCE__QUALIFICATION:
			return getQualification();
		case Schema1Package.BULK_RESOURCE__IS_CONSUMABLE:
			return isIsConsumable() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
			((FeatureMap.Internal) getBulkResourceCostType()).set(newValue);
			return;
		case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
			getOneTimeCost().clear();
			getOneTimeCost().addAll(
					(Collection<? extends OneTimeCost>) newValue);
			return;
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
			getCostPerQuantity().clear();
			getCostPerQuantity().addAll(
					(Collection<? extends CostPerQuantity>) newValue);
			return;
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
			getCostPerQuantityAndTimeUnit().clear();
			getCostPerQuantityAndTimeUnit()
					.addAll(
							(Collection<? extends CostPerQuantityAndTimeUnit>) newValue);
			return;
		case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
			setAvailableQuantity((Quantity) newValue);
			return;
		case Schema1Package.BULK_RESOURCE__AVAILABILITY:
			getAvailability().clear();
			getAvailability().addAll(
					(Collection<? extends Availability>) newValue);
			return;
		case Schema1Package.BULK_RESOURCE__QUALIFICATION:
			getQualification().clear();
			getQualification().addAll(
					(Collection<? extends Qualification>) newValue);
			return;
		case Schema1Package.BULK_RESOURCE__IS_CONSUMABLE:
			setIsConsumable(((Boolean) newValue).booleanValue());
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
			getBulkResourceCostType().clear();
			return;
		case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
			getOneTimeCost().clear();
			return;
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
			getCostPerQuantity().clear();
			return;
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
			getCostPerQuantityAndTimeUnit().clear();
			return;
		case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
			setAvailableQuantity((Quantity) null);
			return;
		case Schema1Package.BULK_RESOURCE__AVAILABILITY:
			getAvailability().clear();
			return;
		case Schema1Package.BULK_RESOURCE__QUALIFICATION:
			getQualification().clear();
			return;
		case Schema1Package.BULK_RESOURCE__IS_CONSUMABLE:
			unsetIsConsumable();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
			return bulkResourceCostType != null
					&& !bulkResourceCostType.isEmpty();
		case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
			return !getOneTimeCost().isEmpty();
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
			return !getCostPerQuantity().isEmpty();
		case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
			return !getCostPerQuantityAndTimeUnit().isEmpty();
		case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
			return availableQuantity != null;
		case Schema1Package.BULK_RESOURCE__AVAILABILITY:
			return availability != null && !availability.isEmpty();
		case Schema1Package.BULK_RESOURCE__QUALIFICATION:
			return qualification != null && !qualification.isEmpty();
		case Schema1Package.BULK_RESOURCE__IS_CONSUMABLE:
			return isSetIsConsumable();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bulkResourceCostType: ");
		result.append(bulkResourceCostType);
		result.append(", isConsumable: ");
		if (isConsumableESet)
			result.append(isConsumable);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BulkResourceImpl
