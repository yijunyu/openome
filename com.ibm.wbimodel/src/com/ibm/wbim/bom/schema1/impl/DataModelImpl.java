/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BusinessItemInstancesType;
import com.ibm.wbim.bom.schema1.BusinessItemTemplatesType;
import com.ibm.wbim.bom.schema1.BusinessItemsType;
import com.ibm.wbim.bom.schema1.DataModel;
import com.ibm.wbim.bom.schema1.NotificationTemplatesType;
import com.ibm.wbim.bom.schema1.NotificationsType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl#getBusinessItemTemplates <em>Business Item Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl#getBusinessItems <em>Business Items</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl#getBusinessItemInstances <em>Business Item Instances</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl#getNotificationTemplates <em>Notification Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataModelImpl extends EObjectImpl implements DataModel {
	/**
	 * The cached value of the '{@link #getBusinessItemTemplates() <em>Business Item Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItemTemplates()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemTemplatesType businessItemTemplates = null;

	/**
	 * The cached value of the '{@link #getBusinessItems() <em>Business Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItems()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemsType businessItems = null;

	/**
	 * The cached value of the '{@link #getBusinessItemInstances() <em>Business Item Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItemInstances()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemInstancesType businessItemInstances = null;

	/**
	 * The cached value of the '{@link #getNotificationTemplates() <em>Notification Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTemplates()
	 * @generated
	 * @ordered
	 */
	protected NotificationTemplatesType notificationTemplates = null;

	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected NotificationsType notifications = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemTemplatesType getBusinessItemTemplates() {
		return businessItemTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessItemTemplates(BusinessItemTemplatesType newBusinessItemTemplates, NotificationChain msgs) {
		BusinessItemTemplatesType oldBusinessItemTemplates = businessItemTemplates;
		businessItemTemplates = newBusinessItemTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES, oldBusinessItemTemplates, newBusinessItemTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessItemTemplates(BusinessItemTemplatesType newBusinessItemTemplates) {
		if (newBusinessItemTemplates != businessItemTemplates) {
			NotificationChain msgs = null;
			if (businessItemTemplates != null)
				msgs = ((InternalEObject)businessItemTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES, null, msgs);
			if (newBusinessItemTemplates != null)
				msgs = ((InternalEObject)newBusinessItemTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES, null, msgs);
			msgs = basicSetBusinessItemTemplates(newBusinessItemTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES, newBusinessItemTemplates, newBusinessItemTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemsType getBusinessItems() {
		return businessItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessItems(BusinessItemsType newBusinessItems, NotificationChain msgs) {
		BusinessItemsType oldBusinessItems = businessItems;
		businessItems = newBusinessItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__BUSINESS_ITEMS, oldBusinessItems, newBusinessItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessItems(BusinessItemsType newBusinessItems) {
		if (newBusinessItems != businessItems) {
			NotificationChain msgs = null;
			if (businessItems != null)
				msgs = ((InternalEObject)businessItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__BUSINESS_ITEMS, null, msgs);
			if (newBusinessItems != null)
				msgs = ((InternalEObject)newBusinessItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__BUSINESS_ITEMS, null, msgs);
			msgs = basicSetBusinessItems(newBusinessItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__BUSINESS_ITEMS, newBusinessItems, newBusinessItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemInstancesType getBusinessItemInstances() {
		return businessItemInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessItemInstances(BusinessItemInstancesType newBusinessItemInstances, NotificationChain msgs) {
		BusinessItemInstancesType oldBusinessItemInstances = businessItemInstances;
		businessItemInstances = newBusinessItemInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES, oldBusinessItemInstances, newBusinessItemInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessItemInstances(BusinessItemInstancesType newBusinessItemInstances) {
		if (newBusinessItemInstances != businessItemInstances) {
			NotificationChain msgs = null;
			if (businessItemInstances != null)
				msgs = ((InternalEObject)businessItemInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES, null, msgs);
			if (newBusinessItemInstances != null)
				msgs = ((InternalEObject)newBusinessItemInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES, null, msgs);
			msgs = basicSetBusinessItemInstances(newBusinessItemInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES, newBusinessItemInstances, newBusinessItemInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTemplatesType getNotificationTemplates() {
		return notificationTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationTemplates(NotificationTemplatesType newNotificationTemplates, NotificationChain msgs) {
		NotificationTemplatesType oldNotificationTemplates = notificationTemplates;
		notificationTemplates = newNotificationTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES, oldNotificationTemplates, newNotificationTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationTemplates(NotificationTemplatesType newNotificationTemplates) {
		if (newNotificationTemplates != notificationTemplates) {
			NotificationChain msgs = null;
			if (notificationTemplates != null)
				msgs = ((InternalEObject)notificationTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES, null, msgs);
			if (newNotificationTemplates != null)
				msgs = ((InternalEObject)newNotificationTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES, null, msgs);
			msgs = basicSetNotificationTemplates(newNotificationTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES, newNotificationTemplates, newNotificationTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationsType getNotifications() {
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotifications(NotificationsType newNotifications, NotificationChain msgs) {
		NotificationsType oldNotifications = notifications;
		notifications = newNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__NOTIFICATIONS, oldNotifications, newNotifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifications(NotificationsType newNotifications) {
		if (newNotifications != notifications) {
			NotificationChain msgs = null;
			if (notifications != null)
				msgs = ((InternalEObject)notifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__NOTIFICATIONS, null, msgs);
			if (newNotifications != null)
				msgs = ((InternalEObject)newNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DATA_MODEL__NOTIFICATIONS, null, msgs);
			msgs = basicSetNotifications(newNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DATA_MODEL__NOTIFICATIONS, newNotifications, newNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES:
				return basicSetBusinessItemTemplates(null, msgs);
			case Schema1Package.DATA_MODEL__BUSINESS_ITEMS:
				return basicSetBusinessItems(null, msgs);
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES:
				return basicSetBusinessItemInstances(null, msgs);
			case Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES:
				return basicSetNotificationTemplates(null, msgs);
			case Schema1Package.DATA_MODEL__NOTIFICATIONS:
				return basicSetNotifications(null, msgs);
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
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES:
				return getBusinessItemTemplates();
			case Schema1Package.DATA_MODEL__BUSINESS_ITEMS:
				return getBusinessItems();
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES:
				return getBusinessItemInstances();
			case Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES:
				return getNotificationTemplates();
			case Schema1Package.DATA_MODEL__NOTIFICATIONS:
				return getNotifications();
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
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES:
				setBusinessItemTemplates((BusinessItemTemplatesType)newValue);
				return;
			case Schema1Package.DATA_MODEL__BUSINESS_ITEMS:
				setBusinessItems((BusinessItemsType)newValue);
				return;
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES:
				setBusinessItemInstances((BusinessItemInstancesType)newValue);
				return;
			case Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES:
				setNotificationTemplates((NotificationTemplatesType)newValue);
				return;
			case Schema1Package.DATA_MODEL__NOTIFICATIONS:
				setNotifications((NotificationsType)newValue);
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
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES:
				setBusinessItemTemplates((BusinessItemTemplatesType)null);
				return;
			case Schema1Package.DATA_MODEL__BUSINESS_ITEMS:
				setBusinessItems((BusinessItemsType)null);
				return;
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES:
				setBusinessItemInstances((BusinessItemInstancesType)null);
				return;
			case Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES:
				setNotificationTemplates((NotificationTemplatesType)null);
				return;
			case Schema1Package.DATA_MODEL__NOTIFICATIONS:
				setNotifications((NotificationsType)null);
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
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_TEMPLATES:
				return businessItemTemplates != null;
			case Schema1Package.DATA_MODEL__BUSINESS_ITEMS:
				return businessItems != null;
			case Schema1Package.DATA_MODEL__BUSINESS_ITEM_INSTANCES:
				return businessItemInstances != null;
			case Schema1Package.DATA_MODEL__NOTIFICATION_TEMPLATES:
				return notificationTemplates != null;
			case Schema1Package.DATA_MODEL__NOTIFICATIONS:
				return notifications != null;
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl