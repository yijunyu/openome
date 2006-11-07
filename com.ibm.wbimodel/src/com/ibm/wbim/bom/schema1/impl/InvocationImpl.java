/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.AdditionalInputType;
import com.ibm.wbim.bom.schema1.AdditionalOutputType;
import com.ibm.wbim.bom.schema1.InputConstantValueType;
import com.ibm.wbim.bom.schema1.InputRepositoryValueType;
import com.ibm.wbim.bom.schema1.Invocation;
import com.ibm.wbim.bom.schema1.OutputRepositoryValueType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#getInputConstantValue <em>Input Constant Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#getInputRepositoryValue <em>Input Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#getOutputRepositoryValue <em>Output Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#getAdditionalInput <em>Additional Input</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#getAdditionalOutput <em>Additional Output</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#isCallSynchronously <em>Call Synchronously</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationImpl extends EObjectImpl implements Invocation {
	/**
	 * The cached value of the '{@link #getInputConstantValue() <em>Input Constant Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConstantValue()
	 * @generated
	 * @ordered
	 */
	protected EList inputConstantValue = null;

	/**
	 * The cached value of the '{@link #getInputRepositoryValue() <em>Input Repository Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRepositoryValue()
	 * @generated
	 * @ordered
	 */
	protected EList inputRepositoryValue = null;

	/**
	 * The cached value of the '{@link #getOutputRepositoryValue() <em>Output Repository Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRepositoryValue()
	 * @generated
	 * @ordered
	 */
	protected EList outputRepositoryValue = null;

	/**
	 * The cached value of the '{@link #getAdditionalInput() <em>Additional Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInput()
	 * @generated
	 * @ordered
	 */
	protected EList additionalInput = null;

	/**
	 * The cached value of the '{@link #getAdditionalOutput() <em>Additional Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalOutput()
	 * @generated
	 * @ordered
	 */
	protected EList additionalOutput = null;

	/**
	 * The default value of the '{@link #isCallSynchronously() <em>Call Synchronously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallSynchronously()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_SYNCHRONOUSLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCallSynchronously() <em>Call Synchronously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallSynchronously()
	 * @generated
	 * @ordered
	 */
	protected boolean callSynchronously = CALL_SYNCHRONOUSLY_EDEFAULT;

	/**
	 * This is true if the Call Synchronously attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callSynchronouslyESet = false;

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
	protected InvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputConstantValue() {
		if (inputConstantValue == null) {
			inputConstantValue = new EObjectContainmentEList(InputConstantValueType.class, this, Schema1Package.INVOCATION__INPUT_CONSTANT_VALUE);
		}
		return inputConstantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputRepositoryValue() {
		if (inputRepositoryValue == null) {
			inputRepositoryValue = new EObjectContainmentEList(InputRepositoryValueType.class, this, Schema1Package.INVOCATION__INPUT_REPOSITORY_VALUE);
		}
		return inputRepositoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputRepositoryValue() {
		if (outputRepositoryValue == null) {
			outputRepositoryValue = new EObjectContainmentEList(OutputRepositoryValueType.class, this, Schema1Package.INVOCATION__OUTPUT_REPOSITORY_VALUE);
		}
		return outputRepositoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAdditionalInput() {
		if (additionalInput == null) {
			additionalInput = new EObjectContainmentEList(AdditionalInputType.class, this, Schema1Package.INVOCATION__ADDITIONAL_INPUT);
		}
		return additionalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAdditionalOutput() {
		if (additionalOutput == null) {
			additionalOutput = new EObjectContainmentEList(AdditionalOutputType.class, this, Schema1Package.INVOCATION__ADDITIONAL_OUTPUT);
		}
		return additionalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallSynchronously() {
		return callSynchronously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallSynchronously(boolean newCallSynchronously) {
		boolean oldCallSynchronously = callSynchronously;
		callSynchronously = newCallSynchronously;
		boolean oldCallSynchronouslyESet = callSynchronouslyESet;
		callSynchronouslyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INVOCATION__CALL_SYNCHRONOUSLY, oldCallSynchronously, callSynchronously, !oldCallSynchronouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallSynchronously() {
		boolean oldCallSynchronously = callSynchronously;
		boolean oldCallSynchronouslyESet = callSynchronouslyESet;
		callSynchronously = CALL_SYNCHRONOUSLY_EDEFAULT;
		callSynchronouslyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.INVOCATION__CALL_SYNCHRONOUSLY, oldCallSynchronously, CALL_SYNCHRONOUSLY_EDEFAULT, oldCallSynchronouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallSynchronously() {
		return callSynchronouslyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INVOCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.INVOCATION__INPUT_CONSTANT_VALUE:
				return ((InternalEList)getInputConstantValue()).basicRemove(otherEnd, msgs);
			case Schema1Package.INVOCATION__INPUT_REPOSITORY_VALUE:
				return ((InternalEList)getInputRepositoryValue()).basicRemove(otherEnd, msgs);
			case Schema1Package.INVOCATION__OUTPUT_REPOSITORY_VALUE:
				return ((InternalEList)getOutputRepositoryValue()).basicRemove(otherEnd, msgs);
			case Schema1Package.INVOCATION__ADDITIONAL_INPUT:
				return ((InternalEList)getAdditionalInput()).basicRemove(otherEnd, msgs);
			case Schema1Package.INVOCATION__ADDITIONAL_OUTPUT:
				return ((InternalEList)getAdditionalOutput()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.INVOCATION__INPUT_CONSTANT_VALUE:
				return getInputConstantValue();
			case Schema1Package.INVOCATION__INPUT_REPOSITORY_VALUE:
				return getInputRepositoryValue();
			case Schema1Package.INVOCATION__OUTPUT_REPOSITORY_VALUE:
				return getOutputRepositoryValue();
			case Schema1Package.INVOCATION__ADDITIONAL_INPUT:
				return getAdditionalInput();
			case Schema1Package.INVOCATION__ADDITIONAL_OUTPUT:
				return getAdditionalOutput();
			case Schema1Package.INVOCATION__CALL_SYNCHRONOUSLY:
				return isCallSynchronously() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.INVOCATION__NAME:
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
			case Schema1Package.INVOCATION__INPUT_CONSTANT_VALUE:
				getInputConstantValue().clear();
				getInputConstantValue().addAll((Collection)newValue);
				return;
			case Schema1Package.INVOCATION__INPUT_REPOSITORY_VALUE:
				getInputRepositoryValue().clear();
				getInputRepositoryValue().addAll((Collection)newValue);
				return;
			case Schema1Package.INVOCATION__OUTPUT_REPOSITORY_VALUE:
				getOutputRepositoryValue().clear();
				getOutputRepositoryValue().addAll((Collection)newValue);
				return;
			case Schema1Package.INVOCATION__ADDITIONAL_INPUT:
				getAdditionalInput().clear();
				getAdditionalInput().addAll((Collection)newValue);
				return;
			case Schema1Package.INVOCATION__ADDITIONAL_OUTPUT:
				getAdditionalOutput().clear();
				getAdditionalOutput().addAll((Collection)newValue);
				return;
			case Schema1Package.INVOCATION__CALL_SYNCHRONOUSLY:
				setCallSynchronously(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.INVOCATION__NAME:
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
			case Schema1Package.INVOCATION__INPUT_CONSTANT_VALUE:
				getInputConstantValue().clear();
				return;
			case Schema1Package.INVOCATION__INPUT_REPOSITORY_VALUE:
				getInputRepositoryValue().clear();
				return;
			case Schema1Package.INVOCATION__OUTPUT_REPOSITORY_VALUE:
				getOutputRepositoryValue().clear();
				return;
			case Schema1Package.INVOCATION__ADDITIONAL_INPUT:
				getAdditionalInput().clear();
				return;
			case Schema1Package.INVOCATION__ADDITIONAL_OUTPUT:
				getAdditionalOutput().clear();
				return;
			case Schema1Package.INVOCATION__CALL_SYNCHRONOUSLY:
				unsetCallSynchronously();
				return;
			case Schema1Package.INVOCATION__NAME:
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
			case Schema1Package.INVOCATION__INPUT_CONSTANT_VALUE:
				return inputConstantValue != null && !inputConstantValue.isEmpty();
			case Schema1Package.INVOCATION__INPUT_REPOSITORY_VALUE:
				return inputRepositoryValue != null && !inputRepositoryValue.isEmpty();
			case Schema1Package.INVOCATION__OUTPUT_REPOSITORY_VALUE:
				return outputRepositoryValue != null && !outputRepositoryValue.isEmpty();
			case Schema1Package.INVOCATION__ADDITIONAL_INPUT:
				return additionalInput != null && !additionalInput.isEmpty();
			case Schema1Package.INVOCATION__ADDITIONAL_OUTPUT:
				return additionalOutput != null && !additionalOutput.isEmpty();
			case Schema1Package.INVOCATION__CALL_SYNCHRONOUSLY:
				return isSetCallSynchronously();
			case Schema1Package.INVOCATION__NAME:
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
		result.append(" (callSynchronously: ");
		if (callSynchronouslyESet) result.append(callSynchronously); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InvocationImpl