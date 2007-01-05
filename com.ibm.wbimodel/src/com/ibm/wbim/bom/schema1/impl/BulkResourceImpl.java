/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Availability;
import com.ibm.wbim.bom.schema1.BulkResource;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Qualification;
import com.ibm.wbim.bom.schema1.Quantity;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
public class BulkResourceImpl extends ComplexDataTypeInstanceImpl implements BulkResource {
	/**
	 * The cached value of the '{@link #getBulkResourceCostType() <em>Bulk Resource Cost Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceCostType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap bulkResourceCostType = null;

	/**
	 * The cached value of the '{@link #getAvailableQuantity() <em>Available Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity availableQuantity = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList availability = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList qualification = null;

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
	protected boolean isConsumableESet = false;

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
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getBulkResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBulkResourceCostType() {
		if (bulkResourceCostType == null) {
			bulkResourceCostType = new BasicFeatureMap(this, Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE);
		}
		return bulkResourceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOneTimeCost() {
		return ((FeatureMap)getBulkResourceCostType()).list(Schema1Package.eINSTANCE.getBulkResource_OneTimeCost());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCostPerQuantity() {
		return ((FeatureMap)getBulkResourceCostType()).list(Schema1Package.eINSTANCE.getBulkResource_CostPerQuantity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCostPerQuantityAndTimeUnit() {
		return ((FeatureMap)getBulkResourceCostType()).list(Schema1Package.eINSTANCE.getBulkResource_CostPerQuantityAndTimeUnit());
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
	public NotificationChain basicSetAvailableQuantity(Quantity newAvailableQuantity, NotificationChain msgs) {
		Quantity oldAvailableQuantity = availableQuantity;
		availableQuantity = newAvailableQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY, oldAvailableQuantity, newAvailableQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)availableQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY, null, msgs);
			if (newAvailableQuantity != null)
				msgs = ((InternalEObject)newAvailableQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY, null, msgs);
			msgs = basicSetAvailableQuantity(newAvailableQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY, newAvailableQuantity, newAvailableQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAvailability() {
		if (availability == null) {
			availability = new EObjectContainmentEList(Availability.class, this, Schema1Package.BULK_RESOURCE__AVAILABILITY);
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQualification() {
		if (qualification == null) {
			qualification = new EObjectContainmentEList(Qualification.class, this, Schema1Package.BULK_RESOURCE__QUALIFICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.BULK_RESOURCE__IS_CONSUMABLE, oldIsConsumable, isConsumable, !oldIsConsumableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.BULK_RESOURCE__IS_CONSUMABLE, oldIsConsumable, IS_CONSUMABLE_EDEFAULT, oldIsConsumableESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.BULK_RESOURCE__ATTRIBUTE_VALUE:
					return ((InternalEList)getAttributeValue()).basicRemove(otherEnd, msgs);
				case Schema1Package.BULK_RESOURCE__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
				case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
					return ((InternalEList)getBulkResourceCostType()).basicRemove(otherEnd, msgs);
				case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
					return ((InternalEList)getOneTimeCost()).basicRemove(otherEnd, msgs);
				case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
					return ((InternalEList)getCostPerQuantity()).basicRemove(otherEnd, msgs);
				case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
					return ((InternalEList)getCostPerQuantityAndTimeUnit()).basicRemove(otherEnd, msgs);
				case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
					return basicSetAvailableQuantity(null, msgs);
				case Schema1Package.BULK_RESOURCE__AVAILABILITY:
					return ((InternalEList)getAvailability()).basicRemove(otherEnd, msgs);
				case Schema1Package.BULK_RESOURCE__QUALIFICATION:
					return ((InternalEList)getQualification()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.BULK_RESOURCE__DOCUMENTATION:
				return getDocumentation();
			case Schema1Package.BULK_RESOURCE__ATTRIBUTE_VALUE:
				return getAttributeValue();
			case Schema1Package.BULK_RESOURCE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.BULK_RESOURCE__INSTANCE_OF:
				return getInstanceOf();
			case Schema1Package.BULK_RESOURCE__NAME:
				return getName();
			case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
				return getBulkResourceCostType();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.BULK_RESOURCE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__ATTRIBUTE_VALUE:
				getAttributeValue().clear();
				getAttributeValue().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__INSTANCE_OF:
				setInstanceOf((String)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
				getBulkResourceCostType().clear();
				getBulkResourceCostType().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__ONE_TIME_COST:
				getOneTimeCost().clear();
				getOneTimeCost().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY:
				getCostPerQuantity().clear();
				getCostPerQuantity().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT:
				getCostPerQuantityAndTimeUnit().clear();
				getCostPerQuantityAndTimeUnit().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__AVAILABLE_QUANTITY:
				setAvailableQuantity((Quantity)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__AVAILABILITY:
				getAvailability().clear();
				getAvailability().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__QUALIFICATION:
				getQualification().clear();
				getQualification().addAll((Collection)newValue);
				return;
			case Schema1Package.BULK_RESOURCE__IS_CONSUMABLE:
				setIsConsumable(((Boolean)newValue).booleanValue());
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.BULK_RESOURCE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Schema1Package.BULK_RESOURCE__ATTRIBUTE_VALUE:
				getAttributeValue().clear();
				return;
			case Schema1Package.BULK_RESOURCE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.BULK_RESOURCE__INSTANCE_OF:
				setInstanceOf(INSTANCE_OF_EDEFAULT);
				return;
			case Schema1Package.BULK_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
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
				setAvailableQuantity((Quantity)null);
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.BULK_RESOURCE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Schema1Package.BULK_RESOURCE__ATTRIBUTE_VALUE:
				return attributeValue != null && !attributeValue.isEmpty();
			case Schema1Package.BULK_RESOURCE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.BULK_RESOURCE__INSTANCE_OF:
				return INSTANCE_OF_EDEFAULT == null ? instanceOf != null : !INSTANCE_OF_EDEFAULT.equals(instanceOf);
			case Schema1Package.BULK_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.BULK_RESOURCE__BULK_RESOURCE_COST_TYPE:
				return bulkResourceCostType != null && !bulkResourceCostType.isEmpty();
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
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bulkResourceCostType: ");
		result.append(bulkResourceCostType);
		result.append(", isConsumable: ");
		if (isConsumableESet) result.append(isConsumable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BulkResourceImpl
