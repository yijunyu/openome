/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CallToServiceType;
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
 * An implementation of the model object '<em><b>Call To Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CallToServiceTypeImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallToServiceTypeImpl extends InvocationImpl implements CallToServiceType {
	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected String service = SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallToServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getCallToServiceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(String newService) {
		String oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CALL_TO_SERVICE_TYPE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_CONSTANT_VALUE:
					return ((InternalEList)getInputConstantValue()).basicRemove(otherEnd, msgs);
				case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_REPOSITORY_VALUE:
					return ((InternalEList)getInputRepositoryValue()).basicRemove(otherEnd, msgs);
				case Schema1Package.CALL_TO_SERVICE_TYPE__OUTPUT_REPOSITORY_VALUE:
					return ((InternalEList)getOutputRepositoryValue()).basicRemove(otherEnd, msgs);
				case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_INPUT:
					return ((InternalEList)getAdditionalInput()).basicRemove(otherEnd, msgs);
				case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_OUTPUT:
					return ((InternalEList)getAdditionalOutput()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_CONSTANT_VALUE:
				return getInputConstantValue();
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_REPOSITORY_VALUE:
				return getInputRepositoryValue();
			case Schema1Package.CALL_TO_SERVICE_TYPE__OUTPUT_REPOSITORY_VALUE:
				return getOutputRepositoryValue();
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_INPUT:
				return getAdditionalInput();
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_OUTPUT:
				return getAdditionalOutput();
			case Schema1Package.CALL_TO_SERVICE_TYPE__CALL_SYNCHRONOUSLY:
				return isCallSynchronously() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.CALL_TO_SERVICE_TYPE__NAME:
				return getName();
			case Schema1Package.CALL_TO_SERVICE_TYPE__SERVICE:
				return getService();
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
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_CONSTANT_VALUE:
				getInputConstantValue().clear();
				getInputConstantValue().addAll((Collection)newValue);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_REPOSITORY_VALUE:
				getInputRepositoryValue().clear();
				getInputRepositoryValue().addAll((Collection)newValue);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__OUTPUT_REPOSITORY_VALUE:
				getOutputRepositoryValue().clear();
				getOutputRepositoryValue().addAll((Collection)newValue);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_INPUT:
				getAdditionalInput().clear();
				getAdditionalInput().addAll((Collection)newValue);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_OUTPUT:
				getAdditionalOutput().clear();
				getAdditionalOutput().addAll((Collection)newValue);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__CALL_SYNCHRONOUSLY:
				setCallSynchronously(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__SERVICE:
				setService((String)newValue);
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
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_CONSTANT_VALUE:
				getInputConstantValue().clear();
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_REPOSITORY_VALUE:
				getInputRepositoryValue().clear();
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__OUTPUT_REPOSITORY_VALUE:
				getOutputRepositoryValue().clear();
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_INPUT:
				getAdditionalInput().clear();
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_OUTPUT:
				getAdditionalOutput().clear();
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__CALL_SYNCHRONOUSLY:
				unsetCallSynchronously();
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.CALL_TO_SERVICE_TYPE__SERVICE:
				setService(SERVICE_EDEFAULT);
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
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_CONSTANT_VALUE:
				return inputConstantValue != null && !inputConstantValue.isEmpty();
			case Schema1Package.CALL_TO_SERVICE_TYPE__INPUT_REPOSITORY_VALUE:
				return inputRepositoryValue != null && !inputRepositoryValue.isEmpty();
			case Schema1Package.CALL_TO_SERVICE_TYPE__OUTPUT_REPOSITORY_VALUE:
				return outputRepositoryValue != null && !outputRepositoryValue.isEmpty();
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_INPUT:
				return additionalInput != null && !additionalInput.isEmpty();
			case Schema1Package.CALL_TO_SERVICE_TYPE__ADDITIONAL_OUTPUT:
				return additionalOutput != null && !additionalOutput.isEmpty();
			case Schema1Package.CALL_TO_SERVICE_TYPE__CALL_SYNCHRONOUSLY:
				return isSetCallSynchronously();
			case Schema1Package.CALL_TO_SERVICE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.CALL_TO_SERVICE_TYPE__SERVICE:
				return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
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
		result.append(" (service: ");
		result.append(service);
		result.append(')');
		return result.toString();
	}

} //CallToServiceTypeImpl
