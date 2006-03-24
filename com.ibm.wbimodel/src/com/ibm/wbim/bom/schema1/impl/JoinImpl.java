/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.InputBranch;
import com.ibm.wbim.bom.schema1.Join;
import com.ibm.wbim.bom.schema1.OutputBranch;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.JoinImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.JoinImpl#getInputBranch <em>Input Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.JoinImpl#getOutputBranch <em>Output Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.JoinImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends EObjectImpl implements Join {
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
	 * The cached value of the '{@link #getInputBranch() <em>Input Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBranch()
	 * @generated
	 * @ordered
	 */
	protected EList inputBranch = null;

	/**
	 * The cached value of the '{@link #getOutputBranch() <em>Output Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBranch()
	 * @generated
	 * @ordered
	 */
	protected OutputBranch outputBranch = null;

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
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getJoin();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.JOIN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputBranch() {
		if (inputBranch == null) {
			inputBranch = new EObjectContainmentEList(InputBranch.class, this, Schema1Package.JOIN__INPUT_BRANCH);
		}
		return inputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBranch getOutputBranch() {
		return outputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputBranch(OutputBranch newOutputBranch, NotificationChain msgs) {
		OutputBranch oldOutputBranch = outputBranch;
		outputBranch = newOutputBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.JOIN__OUTPUT_BRANCH, oldOutputBranch, newOutputBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputBranch(OutputBranch newOutputBranch) {
		if (newOutputBranch != outputBranch) {
			NotificationChain msgs = null;
			if (outputBranch != null)
				msgs = ((InternalEObject)outputBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.JOIN__OUTPUT_BRANCH, null, msgs);
			if (newOutputBranch != null)
				msgs = ((InternalEObject)newOutputBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.JOIN__OUTPUT_BRANCH, null, msgs);
			msgs = basicSetOutputBranch(newOutputBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.JOIN__OUTPUT_BRANCH, newOutputBranch, newOutputBranch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.JOIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.JOIN__INPUT_BRANCH:
					return ((InternalEList)getInputBranch()).basicRemove(otherEnd, msgs);
				case Schema1Package.JOIN__OUTPUT_BRANCH:
					return basicSetOutputBranch(null, msgs);
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
			case Schema1Package.JOIN__DESCRIPTION:
				return getDescription();
			case Schema1Package.JOIN__INPUT_BRANCH:
				return getInputBranch();
			case Schema1Package.JOIN__OUTPUT_BRANCH:
				return getOutputBranch();
			case Schema1Package.JOIN__NAME:
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
			case Schema1Package.JOIN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.JOIN__INPUT_BRANCH:
				getInputBranch().clear();
				getInputBranch().addAll((Collection)newValue);
				return;
			case Schema1Package.JOIN__OUTPUT_BRANCH:
				setOutputBranch((OutputBranch)newValue);
				return;
			case Schema1Package.JOIN__NAME:
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
			case Schema1Package.JOIN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.JOIN__INPUT_BRANCH:
				getInputBranch().clear();
				return;
			case Schema1Package.JOIN__OUTPUT_BRANCH:
				setOutputBranch((OutputBranch)null);
				return;
			case Schema1Package.JOIN__NAME:
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
			case Schema1Package.JOIN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.JOIN__INPUT_BRANCH:
				return inputBranch != null && !inputBranch.isEmpty();
			case Schema1Package.JOIN__OUTPUT_BRANCH:
				return outputBranch != null;
			case Schema1Package.JOIN__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JoinImpl
