/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.NotificationTemplatesType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.NotificationTemplatesTypeImpl#getNotificationTemplate <em>Notification Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationTemplatesTypeImpl extends EObjectImpl implements
		NotificationTemplatesType {
	/**
	 * The cached value of the '{@link #getNotificationTemplate() <em>Notification Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> notificationTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.NOTIFICATION_TEMPLATES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getNotificationTemplate() {
		if (notificationTemplate == null) {
			notificationTemplate = new EObjectContainmentEList<TypeDeclaration>(
					TypeDeclaration.class,
					this,
					Schema1Package.NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE);
		}
		return notificationTemplate;
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
		case Schema1Package.NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE:
			return ((InternalEList<?>) getNotificationTemplate()).basicRemove(
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
		case Schema1Package.NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE:
			return getNotificationTemplate();
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
		case Schema1Package.NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE:
			getNotificationTemplate().clear();
			getNotificationTemplate().addAll(
					(Collection<? extends TypeDeclaration>) newValue);
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
		case Schema1Package.NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE:
			getNotificationTemplate().clear();
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
		case Schema1Package.NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE:
			return notificationTemplate != null
					&& !notificationTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotificationTemplatesTypeImpl
