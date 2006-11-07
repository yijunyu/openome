/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Repository;
import com.ibm.wbim.bom.schema1.RepositoryDataValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#getDefaultValues <em>Default Values</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#getComputedValues <em>Computed Values</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends EObjectImpl implements Repository {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValues() <em>Default Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValues()
	 * @generated
	 * @ordered
	 */
	protected RepositoryDataValue defaultValues = null;

	/**
	 * The cached value of the '{@link #getComputedValues() <em>Computed Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedValues()
	 * @generated
	 * @ordered
	 */
	protected RepositoryDataValue computedValues = null;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CAPACITY_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger capacity = CAPACITY_EDEFAULT;

	/**
	 * This is true if the Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityESet = false;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * This is true if the Is Ordered attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOrderedESet = false;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * This is true if the Is Read Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnlyESet = false;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * This is true if the Is Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isUniqueESet = false;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "String";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDataValue getDefaultValues() {
		return defaultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValues(RepositoryDataValue newDefaultValues, NotificationChain msgs) {
		RepositoryDataValue oldDefaultValues = defaultValues;
		defaultValues = newDefaultValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__DEFAULT_VALUES, oldDefaultValues, newDefaultValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValues(RepositoryDataValue newDefaultValues) {
		if (newDefaultValues != defaultValues) {
			NotificationChain msgs = null;
			if (defaultValues != null)
				msgs = ((InternalEObject)defaultValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.REPOSITORY__DEFAULT_VALUES, null, msgs);
			if (newDefaultValues != null)
				msgs = ((InternalEObject)newDefaultValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.REPOSITORY__DEFAULT_VALUES, null, msgs);
			msgs = basicSetDefaultValues(newDefaultValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__DEFAULT_VALUES, newDefaultValues, newDefaultValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDataValue getComputedValues() {
		return computedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputedValues(RepositoryDataValue newComputedValues, NotificationChain msgs) {
		RepositoryDataValue oldComputedValues = computedValues;
		computedValues = newComputedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__COMPUTED_VALUES, oldComputedValues, newComputedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedValues(RepositoryDataValue newComputedValues) {
		if (newComputedValues != computedValues) {
			NotificationChain msgs = null;
			if (computedValues != null)
				msgs = ((InternalEObject)computedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.REPOSITORY__COMPUTED_VALUES, null, msgs);
			if (newComputedValues != null)
				msgs = ((InternalEObject)newComputedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.REPOSITORY__COMPUTED_VALUES, null, msgs);
			msgs = basicSetComputedValues(newComputedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__COMPUTED_VALUES, newComputedValues, newComputedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(BigInteger newCapacity) {
		BigInteger oldCapacity = capacity;
		capacity = newCapacity;
		boolean oldCapacityESet = capacityESet;
		capacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__CAPACITY, oldCapacity, capacity, !oldCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacity() {
		BigInteger oldCapacity = capacity;
		boolean oldCapacityESet = capacityESet;
		capacity = CAPACITY_EDEFAULT;
		capacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.REPOSITORY__CAPACITY, oldCapacity, CAPACITY_EDEFAULT, oldCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacity() {
		return capacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		boolean oldIsOrderedESet = isOrderedESet;
		isOrderedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__IS_ORDERED, oldIsOrdered, isOrdered, !oldIsOrderedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsOrdered() {
		boolean oldIsOrdered = isOrdered;
		boolean oldIsOrderedESet = isOrderedESet;
		isOrdered = IS_ORDERED_EDEFAULT;
		isOrderedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.REPOSITORY__IS_ORDERED, oldIsOrdered, IS_ORDERED_EDEFAULT, oldIsOrderedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOrdered() {
		return isOrderedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		boolean oldIsReadOnlyESet = isReadOnlyESet;
		isReadOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__IS_READ_ONLY, oldIsReadOnly, isReadOnly, !oldIsReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReadOnly() {
		boolean oldIsReadOnly = isReadOnly;
		boolean oldIsReadOnlyESet = isReadOnlyESet;
		isReadOnly = IS_READ_ONLY_EDEFAULT;
		isReadOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.REPOSITORY__IS_READ_ONLY, oldIsReadOnly, IS_READ_ONLY_EDEFAULT, oldIsReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReadOnly() {
		return isReadOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		boolean oldIsUniqueESet = isUniqueESet;
		isUniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__IS_UNIQUE, oldIsUnique, isUnique, !oldIsUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsUnique() {
		boolean oldIsUnique = isUnique;
		boolean oldIsUniqueESet = isUniqueESet;
		isUnique = IS_UNIQUE_EDEFAULT;
		isUniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.REPOSITORY__IS_UNIQUE, oldIsUnique, IS_UNIQUE_EDEFAULT, oldIsUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsUnique() {
		return isUniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.REPOSITORY__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.REPOSITORY__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.REPOSITORY__DEFAULT_VALUES:
				return basicSetDefaultValues(null, msgs);
			case Schema1Package.REPOSITORY__COMPUTED_VALUES:
				return basicSetComputedValues(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.REPOSITORY__DESCRIPTION:
				return getDescription();
			case Schema1Package.REPOSITORY__DEFAULT_VALUES:
				return getDefaultValues();
			case Schema1Package.REPOSITORY__COMPUTED_VALUES:
				return getComputedValues();
			case Schema1Package.REPOSITORY__CAPACITY:
				return getCapacity();
			case Schema1Package.REPOSITORY__IS_ORDERED:
				return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.REPOSITORY__IS_READ_ONLY:
				return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.REPOSITORY__IS_UNIQUE:
				return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.REPOSITORY__NAME:
				return getName();
			case Schema1Package.REPOSITORY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Schema1Package.REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.REPOSITORY__DEFAULT_VALUES:
				setDefaultValues((RepositoryDataValue)newValue);
				return;
			case Schema1Package.REPOSITORY__COMPUTED_VALUES:
				setComputedValues((RepositoryDataValue)newValue);
				return;
			case Schema1Package.REPOSITORY__CAPACITY:
				setCapacity((BigInteger)newValue);
				return;
			case Schema1Package.REPOSITORY__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.REPOSITORY__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.REPOSITORY__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.REPOSITORY__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Schema1Package.REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.REPOSITORY__DEFAULT_VALUES:
				setDefaultValues((RepositoryDataValue)null);
				return;
			case Schema1Package.REPOSITORY__COMPUTED_VALUES:
				setComputedValues((RepositoryDataValue)null);
				return;
			case Schema1Package.REPOSITORY__CAPACITY:
				unsetCapacity();
				return;
			case Schema1Package.REPOSITORY__IS_ORDERED:
				unsetIsOrdered();
				return;
			case Schema1Package.REPOSITORY__IS_READ_ONLY:
				unsetIsReadOnly();
				return;
			case Schema1Package.REPOSITORY__IS_UNIQUE:
				unsetIsUnique();
				return;
			case Schema1Package.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.REPOSITORY__TYPE:
				unsetType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.REPOSITORY__DEFAULT_VALUES:
				return defaultValues != null;
			case Schema1Package.REPOSITORY__COMPUTED_VALUES:
				return computedValues != null;
			case Schema1Package.REPOSITORY__CAPACITY:
				return isSetCapacity();
			case Schema1Package.REPOSITORY__IS_ORDERED:
				return isSetIsOrdered();
			case Schema1Package.REPOSITORY__IS_READ_ONLY:
				return isSetIsReadOnly();
			case Schema1Package.REPOSITORY__IS_UNIQUE:
				return isSetIsUnique();
			case Schema1Package.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.REPOSITORY__TYPE:
				return isSetType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", capacity: ");
		if (capacityESet) result.append(capacity); else result.append("<unset>");
		result.append(", isOrdered: ");
		if (isOrderedESet) result.append(isOrdered); else result.append("<unset>");
		result.append(", isReadOnly: ");
		if (isReadOnlyESet) result.append(isReadOnly); else result.append("<unset>");
		result.append(", isUnique: ");
		if (isUniqueESet) result.append(isUnique); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl