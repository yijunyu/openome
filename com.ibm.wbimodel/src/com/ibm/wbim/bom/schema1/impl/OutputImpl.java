/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Output;
import com.ibm.wbim.bom.schema1.OutputRepositoryValue;
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
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#getRepositoryValue <em>Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#getAssociatedData <em>Associated Data</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputImpl extends EObjectImpl implements Output {
	/**
	 * The cached value of the '{@link #getRepositoryValue() <em>Repository Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryValue()
	 * @generated
	 * @ordered
	 */
	protected OutputRepositoryValue repositoryValue = null;

	/**
	 * The default value of the '{@link #getAssociatedData() <em>Associated Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedData()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedData() <em>Associated Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedData()
	 * @generated
	 * @ordered
	 */
	protected String associatedData = ASSOCIATED_DATA_EDEFAULT;

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
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

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
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximum = MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumESet = false;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimum = MINIMUM_EDEFAULT;

	/**
	 * This is true if the Minimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumESet = false;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRepositoryValue getRepositoryValue() {
		return repositoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositoryValue(OutputRepositoryValue newRepositoryValue, NotificationChain msgs) {
		OutputRepositoryValue oldRepositoryValue = repositoryValue;
		repositoryValue = newRepositoryValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__REPOSITORY_VALUE, oldRepositoryValue, newRepositoryValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryValue(OutputRepositoryValue newRepositoryValue) {
		if (newRepositoryValue != repositoryValue) {
			NotificationChain msgs = null;
			if (repositoryValue != null)
				msgs = ((InternalEObject)repositoryValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT__REPOSITORY_VALUE, null, msgs);
			if (newRepositoryValue != null)
				msgs = ((InternalEObject)newRepositoryValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT__REPOSITORY_VALUE, null, msgs);
			msgs = basicSetRepositoryValue(newRepositoryValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__REPOSITORY_VALUE, newRepositoryValue, newRepositoryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedData() {
		return associatedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedData(String newAssociatedData) {
		String oldAssociatedData = associatedData;
		associatedData = newAssociatedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__ASSOCIATED_DATA, oldAssociatedData, associatedData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__IS_ORDERED, oldIsOrdered, isOrdered, !oldIsOrderedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT__IS_ORDERED, oldIsOrdered, IS_ORDERED_EDEFAULT, oldIsOrderedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__IS_UNIQUE, oldIsUnique, isUnique, !oldIsUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT__IS_UNIQUE, oldIsUnique, IS_UNIQUE_EDEFAULT, oldIsUniqueESet));
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
	public BigInteger getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(BigInteger newMaximum) {
		BigInteger oldMaximum = maximum;
		maximum = newMaximum;
		boolean oldMaximumESet = maximumESet;
		maximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__MAXIMUM, oldMaximum, maximum, !oldMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximum() {
		BigInteger oldMaximum = maximum;
		boolean oldMaximumESet = maximumESet;
		maximum = MAXIMUM_EDEFAULT;
		maximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT__MAXIMUM, oldMaximum, MAXIMUM_EDEFAULT, oldMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximum() {
		return maximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(BigInteger newMinimum) {
		BigInteger oldMinimum = minimum;
		minimum = newMinimum;
		boolean oldMinimumESet = minimumESet;
		minimumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__MINIMUM, oldMinimum, minimum, !oldMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimum() {
		BigInteger oldMinimum = minimum;
		boolean oldMinimumESet = minimumESet;
		minimum = MINIMUM_EDEFAULT;
		minimumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT__MINIMUM, oldMinimum, MINIMUM_EDEFAULT, oldMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimum() {
		return minimumESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.OUTPUT__REPOSITORY_VALUE:
				return basicSetRepositoryValue(null, msgs);
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
			case Schema1Package.OUTPUT__REPOSITORY_VALUE:
				return getRepositoryValue();
			case Schema1Package.OUTPUT__ASSOCIATED_DATA:
				return getAssociatedData();
			case Schema1Package.OUTPUT__IS_ORDERED:
				return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.OUTPUT__IS_UNIQUE:
				return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.OUTPUT__MAXIMUM:
				return getMaximum();
			case Schema1Package.OUTPUT__MINIMUM:
				return getMinimum();
			case Schema1Package.OUTPUT__NAME:
				return getName();
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
			case Schema1Package.OUTPUT__REPOSITORY_VALUE:
				setRepositoryValue((OutputRepositoryValue)newValue);
				return;
			case Schema1Package.OUTPUT__ASSOCIATED_DATA:
				setAssociatedData((String)newValue);
				return;
			case Schema1Package.OUTPUT__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.OUTPUT__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.OUTPUT__MAXIMUM:
				setMaximum((BigInteger)newValue);
				return;
			case Schema1Package.OUTPUT__MINIMUM:
				setMinimum((BigInteger)newValue);
				return;
			case Schema1Package.OUTPUT__NAME:
				setName((String)newValue);
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
			case Schema1Package.OUTPUT__REPOSITORY_VALUE:
				setRepositoryValue((OutputRepositoryValue)null);
				return;
			case Schema1Package.OUTPUT__ASSOCIATED_DATA:
				setAssociatedData(ASSOCIATED_DATA_EDEFAULT);
				return;
			case Schema1Package.OUTPUT__IS_ORDERED:
				unsetIsOrdered();
				return;
			case Schema1Package.OUTPUT__IS_UNIQUE:
				unsetIsUnique();
				return;
			case Schema1Package.OUTPUT__MAXIMUM:
				unsetMaximum();
				return;
			case Schema1Package.OUTPUT__MINIMUM:
				unsetMinimum();
				return;
			case Schema1Package.OUTPUT__NAME:
				setName(NAME_EDEFAULT);
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
			case Schema1Package.OUTPUT__REPOSITORY_VALUE:
				return repositoryValue != null;
			case Schema1Package.OUTPUT__ASSOCIATED_DATA:
				return ASSOCIATED_DATA_EDEFAULT == null ? associatedData != null : !ASSOCIATED_DATA_EDEFAULT.equals(associatedData);
			case Schema1Package.OUTPUT__IS_ORDERED:
				return isSetIsOrdered();
			case Schema1Package.OUTPUT__IS_UNIQUE:
				return isSetIsUnique();
			case Schema1Package.OUTPUT__MAXIMUM:
				return isSetMaximum();
			case Schema1Package.OUTPUT__MINIMUM:
				return isSetMinimum();
			case Schema1Package.OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (associatedData: ");
		result.append(associatedData);
		result.append(", isOrdered: ");
		if (isOrderedESet) result.append(isOrdered); else result.append("<unset>");
		result.append(", isUnique: ");
		if (isUniqueESet) result.append(isUnique); else result.append("<unset>");
		result.append(", maximum: ");
		if (maximumESet) result.append(maximum); else result.append("<unset>");
		result.append(", minimum: ");
		if (minimumESet) result.append(minimum); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OutputImpl