/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.wsdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.wsdl.TBindingOperation;
import org.xmlsoap.schemas.wsdl.TBindingOperationFault;
import org.xmlsoap.schemas.wsdl.TBindingOperationMessage;
import org.xmlsoap.schemas.wsdl.TDocumentation;
import org.xmlsoap.schemas.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBinding Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TBindingOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TBindingOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TBindingOperationImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TBindingOperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBindingOperationImpl extends TExtensibleDocumentedImpl implements TBindingOperation {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected TBindingOperationMessage input = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected TBindingOperationMessage output = null;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList fault = null;

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
	protected TBindingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WsdlPackage.eINSTANCE.getTBindingOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBindingOperationMessage getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(TBindingOperationMessage newInput, NotificationChain msgs) {
		TBindingOperationMessage oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.TBINDING_OPERATION__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(TBindingOperationMessage newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.TBINDING_OPERATION__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.TBINDING_OPERATION__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.TBINDING_OPERATION__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBindingOperationMessage getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(TBindingOperationMessage newOutput, NotificationChain msgs) {
		TBindingOperationMessage oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.TBINDING_OPERATION__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(TBindingOperationMessage newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.TBINDING_OPERATION__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.TBINDING_OPERATION__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.TBINDING_OPERATION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList(TBindingOperationFault.class, this, WsdlPackage.TBINDING_OPERATION__FAULT);
		}
		return fault;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.TBINDING_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WsdlPackage.TBINDING_OPERATION__DOCUMENTATION:
					return basicSetDocumentation(null, msgs);
				case WsdlPackage.TBINDING_OPERATION__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TBINDING_OPERATION__INPUT:
					return basicSetInput(null, msgs);
				case WsdlPackage.TBINDING_OPERATION__OUTPUT:
					return basicSetOutput(null, msgs);
				case WsdlPackage.TBINDING_OPERATION__FAULT:
					return ((InternalEList)getFault()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.TBINDING_OPERATION__DOCUMENTATION:
				return getDocumentation();
			case WsdlPackage.TBINDING_OPERATION__ANY:
				return getAny();
			case WsdlPackage.TBINDING_OPERATION__INPUT:
				return getInput();
			case WsdlPackage.TBINDING_OPERATION__OUTPUT:
				return getOutput();
			case WsdlPackage.TBINDING_OPERATION__FAULT:
				return getFault();
			case WsdlPackage.TBINDING_OPERATION__NAME:
				return getName();
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
			case WsdlPackage.TBINDING_OPERATION__DOCUMENTATION:
				setDocumentation((TDocumentation)newValue);
				return;
			case WsdlPackage.TBINDING_OPERATION__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case WsdlPackage.TBINDING_OPERATION__INPUT:
				setInput((TBindingOperationMessage)newValue);
				return;
			case WsdlPackage.TBINDING_OPERATION__OUTPUT:
				setOutput((TBindingOperationMessage)newValue);
				return;
			case WsdlPackage.TBINDING_OPERATION__FAULT:
				getFault().clear();
				getFault().addAll((Collection)newValue);
				return;
			case WsdlPackage.TBINDING_OPERATION__NAME:
				setName((String)newValue);
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
			case WsdlPackage.TBINDING_OPERATION__DOCUMENTATION:
				setDocumentation((TDocumentation)null);
				return;
			case WsdlPackage.TBINDING_OPERATION__ANY:
				getAny().clear();
				return;
			case WsdlPackage.TBINDING_OPERATION__INPUT:
				setInput((TBindingOperationMessage)null);
				return;
			case WsdlPackage.TBINDING_OPERATION__OUTPUT:
				setOutput((TBindingOperationMessage)null);
				return;
			case WsdlPackage.TBINDING_OPERATION__FAULT:
				getFault().clear();
				return;
			case WsdlPackage.TBINDING_OPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case WsdlPackage.TBINDING_OPERATION__DOCUMENTATION:
				return documentation != null;
			case WsdlPackage.TBINDING_OPERATION__ANY:
				return any != null && !any.isEmpty();
			case WsdlPackage.TBINDING_OPERATION__INPUT:
				return input != null;
			case WsdlPackage.TBINDING_OPERATION__OUTPUT:
				return output != null;
			case WsdlPackage.TBINDING_OPERATION__FAULT:
				return fault != null && !fault.isEmpty();
			case WsdlPackage.TBINDING_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TBindingOperationImpl
