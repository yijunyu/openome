/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Input;
import com.ibm.wbim.bom.schema1.InputCriterion;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputsImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputsImpl#getInputCriterion <em>Input Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputsImpl extends EObjectImpl implements Inputs {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList input = null;

	/**
	 * The cached value of the '{@link #getInputCriterion() <em>Input Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList inputCriterion = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getInputs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInput() {
		if (input == null) {
			input = new EObjectContainmentEList(Input.class, this, Schema1Package.INPUTS__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputCriterion() {
		if (inputCriterion == null) {
			inputCriterion = new EObjectContainmentEList(InputCriterion.class, this, Schema1Package.INPUTS__INPUT_CRITERION);
		}
		return inputCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.INPUTS__INPUT:
					return ((InternalEList)getInput()).basicRemove(otherEnd, msgs);
				case Schema1Package.INPUTS__INPUT_CRITERION:
					return ((InternalEList)getInputCriterion()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.INPUTS__INPUT:
				return getInput();
			case Schema1Package.INPUTS__INPUT_CRITERION:
				return getInputCriterion();
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
			case Schema1Package.INPUTS__INPUT:
				getInput().clear();
				getInput().addAll((Collection)newValue);
				return;
			case Schema1Package.INPUTS__INPUT_CRITERION:
				getInputCriterion().clear();
				getInputCriterion().addAll((Collection)newValue);
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
			case Schema1Package.INPUTS__INPUT:
				getInput().clear();
				return;
			case Schema1Package.INPUTS__INPUT_CRITERION:
				getInputCriterion().clear();
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
			case Schema1Package.INPUTS__INPUT:
				return input != null && !input.isEmpty();
			case Schema1Package.INPUTS__INPUT_CRITERION:
				return inputCriterion != null && !inputCriterion.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //InputsImpl
