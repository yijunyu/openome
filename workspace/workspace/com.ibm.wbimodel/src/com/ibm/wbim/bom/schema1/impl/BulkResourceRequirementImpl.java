/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BulkResourceRequirement;
import com.ibm.wbim.bom.schema1.Quantity;
import com.ibm.wbim.bom.schema1.Schema1Package;

import javax.xml.datatype.Duration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bulk Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl#getResourceQuantity <em>Resource Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl#getBulkResource <em>Bulk Resource</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl#getTimeRequired <em>Time Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BulkResourceRequirementImpl extends EObjectImpl implements
		BulkResourceRequirement {
	/**
	 * The cached value of the '{@link #getResourceQuantity() <em>Resource Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity resourceQuantity;

	/**
	 * The default value of the '{@link #getBulkResource() <em>Bulk Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResource()
	 * @generated
	 * @ordered
	 */
	protected static final String BULK_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkResource() <em>Bulk Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResource()
	 * @generated
	 * @ordered
	 */
	protected String bulkResource = BULK_RESOURCE_EDEFAULT;

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
	 * The default value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected Duration timeRequired = TIME_REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulkResourceRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.BULK_RESOURCE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getResourceQuantity() {
		return resourceQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceQuantity(
			Quantity newResourceQuantity, NotificationChain msgs) {
		Quantity oldResourceQuantity = resourceQuantity;
		resourceQuantity = newResourceQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY,
					oldResourceQuantity, newResourceQuantity);
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
	public void setResourceQuantity(Quantity newResourceQuantity) {
		if (newResourceQuantity != resourceQuantity) {
			NotificationChain msgs = null;
			if (resourceQuantity != null)
				msgs = ((InternalEObject) resourceQuantity)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY,
								null, msgs);
			if (newResourceQuantity != null)
				msgs = ((InternalEObject) newResourceQuantity)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY,
								null, msgs);
			msgs = basicSetResourceQuantity(newResourceQuantity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY,
					newResourceQuantity, newResourceQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBulkResource() {
		return bulkResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkResource(String newBulkResource) {
		String oldBulkResource = bulkResource;
		bulkResource = newBulkResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE,
					oldBulkResource, bulkResource));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.BULK_RESOURCE_REQUIREMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeRequired() {
		return timeRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRequired(Duration newTimeRequired) {
		Duration oldTimeRequired = timeRequired;
		timeRequired = newTimeRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED,
					oldTimeRequired, timeRequired));
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
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY:
			return basicSetResourceQuantity(null, msgs);
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
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY:
			return getResourceQuantity();
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE:
			return getBulkResource();
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__NAME:
			return getName();
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED:
			return getTimeRequired();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY:
			setResourceQuantity((Quantity) newValue);
			return;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE:
			setBulkResource((String) newValue);
			return;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__NAME:
			setName((String) newValue);
			return;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED:
			setTimeRequired((Duration) newValue);
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
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY:
			setResourceQuantity((Quantity) null);
			return;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE:
			setBulkResource(BULK_RESOURCE_EDEFAULT);
			return;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED:
			setTimeRequired(TIME_REQUIRED_EDEFAULT);
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
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY:
			return resourceQuantity != null;
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE:
			return BULK_RESOURCE_EDEFAULT == null ? bulkResource != null
					: !BULK_RESOURCE_EDEFAULT.equals(bulkResource);
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case Schema1Package.BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED:
			return TIME_REQUIRED_EDEFAULT == null ? timeRequired != null
					: !TIME_REQUIRED_EDEFAULT.equals(timeRequired);
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
		result.append(" (bulkResource: ");
		result.append(bulkResource);
		result.append(", name: ");
		result.append(name);
		result.append(", timeRequired: ");
		result.append(timeRequired);
		result.append(')');
		return result.toString();
	}

} //BulkResourceRequirementImpl
