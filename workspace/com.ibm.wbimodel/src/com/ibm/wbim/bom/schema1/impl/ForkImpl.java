/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Fork;
import com.ibm.wbim.bom.schema1.InputBranch;
import com.ibm.wbim.bom.schema1.OutputBranch;
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
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ForkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ForkImpl#getInputBranch <em>Input Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ForkImpl#getOutputBranch <em>Output Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ForkImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForkImpl extends EObjectImpl implements Fork {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputBranch() <em>Input Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBranch()
	 * @generated
	 * @ordered
	 */
	protected InputBranch inputBranch;

	/**
	 * The cached value of the '{@link #getOutputBranch() <em>Output Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBranch()
	 * @generated
	 * @ordered
	 */
	protected EList outputBranch;

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
	protected ForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.FORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.FORK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBranch getInputBranch() {
		return inputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputBranch(InputBranch newInputBranch, NotificationChain msgs) {
		InputBranch oldInputBranch = inputBranch;
		inputBranch = newInputBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.FORK__INPUT_BRANCH, oldInputBranch, newInputBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputBranch(InputBranch newInputBranch) {
		if (newInputBranch != inputBranch) {
			NotificationChain msgs = null;
			if (inputBranch != null)
				msgs = ((InternalEObject)inputBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.FORK__INPUT_BRANCH, null, msgs);
			if (newInputBranch != null)
				msgs = ((InternalEObject)newInputBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.FORK__INPUT_BRANCH, null, msgs);
			msgs = basicSetInputBranch(newInputBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.FORK__INPUT_BRANCH, newInputBranch, newInputBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputBranch() {
		if (outputBranch == null) {
			outputBranch = new EObjectContainmentEList(OutputBranch.class, this, Schema1Package.FORK__OUTPUT_BRANCH);
		}
		return outputBranch;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.FORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.FORK__INPUT_BRANCH:
				return basicSetInputBranch(null, msgs);
			case Schema1Package.FORK__OUTPUT_BRANCH:
				return ((InternalEList)getOutputBranch()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.FORK__DESCRIPTION:
				return getDescription();
			case Schema1Package.FORK__INPUT_BRANCH:
				return getInputBranch();
			case Schema1Package.FORK__OUTPUT_BRANCH:
				return getOutputBranch();
			case Schema1Package.FORK__NAME:
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
			case Schema1Package.FORK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.FORK__INPUT_BRANCH:
				setInputBranch((InputBranch)newValue);
				return;
			case Schema1Package.FORK__OUTPUT_BRANCH:
				getOutputBranch().clear();
				getOutputBranch().addAll((Collection)newValue);
				return;
			case Schema1Package.FORK__NAME:
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
			case Schema1Package.FORK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.FORK__INPUT_BRANCH:
				setInputBranch((InputBranch)null);
				return;
			case Schema1Package.FORK__OUTPUT_BRANCH:
				getOutputBranch().clear();
				return;
			case Schema1Package.FORK__NAME:
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
			case Schema1Package.FORK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.FORK__INPUT_BRANCH:
				return inputBranch != null;
			case Schema1Package.FORK__OUTPUT_BRANCH:
				return outputBranch != null && !outputBranch.isEmpty();
			case Schema1Package.FORK__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ForkImpl
