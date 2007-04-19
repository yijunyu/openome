/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.NotificationReceiver;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Receiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.NotificationReceiverImpl#getNotificationFilter <em>Notification Filter</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.NotificationReceiverImpl#getNotification <em>Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationReceiverImpl extends TaskImpl implements NotificationReceiver {
	/**
	 * The cached value of the '{@link #getNotificationFilter() <em>Notification Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationFilter()
	 * @generated
	 * @ordered
	 */
	protected Expression notificationFilter = null;

	/**
	 * The default value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected String notification = NOTIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationReceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.NOTIFICATION_RECEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getNotificationFilter() {
		return notificationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationFilter(Expression newNotificationFilter, NotificationChain msgs) {
		Expression oldNotificationFilter = notificationFilter;
		notificationFilter = newNotificationFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER, oldNotificationFilter, newNotificationFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationFilter(Expression newNotificationFilter) {
		if (newNotificationFilter != notificationFilter) {
			NotificationChain msgs = null;
			if (notificationFilter != null)
				msgs = ((InternalEObject)notificationFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER, null, msgs);
			if (newNotificationFilter != null)
				msgs = ((InternalEObject)newNotificationFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER, null, msgs);
			msgs = basicSetNotificationFilter(newNotificationFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER, newNotificationFilter, newNotificationFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotification() {
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification(String newNotification) {
		String oldNotification = notification;
		notification = newNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION, oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				return basicSetNotificationFilter(null, msgs);
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
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				return getNotificationFilter();
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				return getNotification();
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
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				setNotificationFilter((Expression)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				setNotification((String)newValue);
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
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				setNotificationFilter((Expression)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				setNotification(NOTIFICATION_EDEFAULT);
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
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				return notificationFilter != null;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				return NOTIFICATION_EDEFAULT == null ? notification != null : !NOTIFICATION_EDEFAULT.equals(notification);
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
		result.append(" (notification: ");
		result.append(notification);
		result.append(')');
		return result.toString();
	}

} //NotificationReceiverImpl
