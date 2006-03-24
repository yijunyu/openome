/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.NotificationReceiver;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.Resources;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

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
		return Schema1Package.eINSTANCE.getNotificationReceiver();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.NOTIFICATION_RECEIVER__INPUTS:
					return basicSetInputs(null, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__OUTPUTS:
					return basicSetOutputs(null, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__PRECONDITION:
					return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__POSTCONDITION:
					return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__RESOURCES:
					return basicSetResources(null, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__ORGANIZATIONS:
					return basicSetOrganizations(null, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__OPERATIONAL_DATA:
					return basicSetOperationalData(null, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
				case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
					return basicSetNotificationFilter(null, msgs);
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
			case Schema1Package.NOTIFICATION_RECEIVER__DESCRIPTION:
				return getDescription();
			case Schema1Package.NOTIFICATION_RECEIVER__INPUTS:
				return getInputs();
			case Schema1Package.NOTIFICATION_RECEIVER__OUTPUTS:
				return getOutputs();
			case Schema1Package.NOTIFICATION_RECEIVER__PRECONDITION:
				return getPrecondition();
			case Schema1Package.NOTIFICATION_RECEIVER__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.NOTIFICATION_RECEIVER__RESOURCES:
				return getResources();
			case Schema1Package.NOTIFICATION_RECEIVER__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.NOTIFICATION_RECEIVER__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.NOTIFICATION_RECEIVER__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.NOTIFICATION_RECEIVER__NAME:
				return getName();
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				return getNotificationFilter();
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				return getNotification();
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
			case Schema1Package.NOTIFICATION_RECEIVER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__RESOURCES:
				setResources((Resources)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				setNotificationFilter((Expression)newValue);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				setNotification((String)newValue);
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
			case Schema1Package.NOTIFICATION_RECEIVER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__RESOURCES:
				setResources((Resources)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				setNotificationFilter((Expression)null);
				return;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				setNotification(NOTIFICATION_EDEFAULT);
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
			case Schema1Package.NOTIFICATION_RECEIVER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.NOTIFICATION_RECEIVER__INPUTS:
				return inputs != null;
			case Schema1Package.NOTIFICATION_RECEIVER__OUTPUTS:
				return outputs != null;
			case Schema1Package.NOTIFICATION_RECEIVER__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.NOTIFICATION_RECEIVER__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.NOTIFICATION_RECEIVER__RESOURCES:
				return resources != null;
			case Schema1Package.NOTIFICATION_RECEIVER__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.NOTIFICATION_RECEIVER__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.NOTIFICATION_RECEIVER__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.NOTIFICATION_RECEIVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION_FILTER:
				return notificationFilter != null;
			case Schema1Package.NOTIFICATION_RECEIVER__NOTIFICATION:
				return NOTIFICATION_EDEFAULT == null ? notification != null : !NOTIFICATION_EDEFAULT.equals(notification);
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
		result.append(" (notification: ");
		result.append(notification);
		result.append(')');
		return result.toString();
	}

} //NotificationReceiverImpl
