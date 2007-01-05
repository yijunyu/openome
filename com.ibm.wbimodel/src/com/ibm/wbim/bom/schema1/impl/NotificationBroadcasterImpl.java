/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.NotificationBroadcaster;
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
 * An implementation of the model object '<em><b>Notification Broadcaster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.NotificationBroadcasterImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.NotificationBroadcasterImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationBroadcasterImpl extends TaskImpl implements NotificationBroadcaster {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationBroadcasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getNotificationBroadcaster();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.NOTIFICATION_BROADCASTER__NOTIFICATION, oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.NOTIFICATION_BROADCASTER__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.NOTIFICATION_BROADCASTER__INPUTS:
					return basicSetInputs(null, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__OUTPUTS:
					return basicSetOutputs(null, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__PRECONDITION:
					return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__POSTCONDITION:
					return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__RESOURCES:
					return basicSetResources(null, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__ORGANIZATIONS:
					return basicSetOrganizations(null, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__OPERATIONAL_DATA:
					return basicSetOperationalData(null, msgs);
				case Schema1Package.NOTIFICATION_BROADCASTER__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
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
			case Schema1Package.NOTIFICATION_BROADCASTER__DESCRIPTION:
				return getDescription();
			case Schema1Package.NOTIFICATION_BROADCASTER__INPUTS:
				return getInputs();
			case Schema1Package.NOTIFICATION_BROADCASTER__OUTPUTS:
				return getOutputs();
			case Schema1Package.NOTIFICATION_BROADCASTER__PRECONDITION:
				return getPrecondition();
			case Schema1Package.NOTIFICATION_BROADCASTER__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.NOTIFICATION_BROADCASTER__RESOURCES:
				return getResources();
			case Schema1Package.NOTIFICATION_BROADCASTER__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.NOTIFICATION_BROADCASTER__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.NOTIFICATION_BROADCASTER__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.NOTIFICATION_BROADCASTER__NAME:
				return getName();
			case Schema1Package.NOTIFICATION_BROADCASTER__NOTIFICATION:
				return getNotification();
			case Schema1Package.NOTIFICATION_BROADCASTER__SCOPE:
				return getScope();
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
			case Schema1Package.NOTIFICATION_BROADCASTER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__RESOURCES:
				setResources((Resources)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__NOTIFICATION:
				setNotification((String)newValue);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__SCOPE:
				setScope((String)newValue);
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
			case Schema1Package.NOTIFICATION_BROADCASTER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__RESOURCES:
				setResources((Resources)null);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__NOTIFICATION:
				setNotification(NOTIFICATION_EDEFAULT);
				return;
			case Schema1Package.NOTIFICATION_BROADCASTER__SCOPE:
				setScope(SCOPE_EDEFAULT);
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
			case Schema1Package.NOTIFICATION_BROADCASTER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.NOTIFICATION_BROADCASTER__INPUTS:
				return inputs != null;
			case Schema1Package.NOTIFICATION_BROADCASTER__OUTPUTS:
				return outputs != null;
			case Schema1Package.NOTIFICATION_BROADCASTER__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.NOTIFICATION_BROADCASTER__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.NOTIFICATION_BROADCASTER__RESOURCES:
				return resources != null;
			case Schema1Package.NOTIFICATION_BROADCASTER__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.NOTIFICATION_BROADCASTER__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.NOTIFICATION_BROADCASTER__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.NOTIFICATION_BROADCASTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.NOTIFICATION_BROADCASTER__NOTIFICATION:
				return NOTIFICATION_EDEFAULT == null ? notification != null : !NOTIFICATION_EDEFAULT.equals(notification);
			case Schema1Package.NOTIFICATION_BROADCASTER__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
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
		result.append(", scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //NotificationBroadcasterImpl
