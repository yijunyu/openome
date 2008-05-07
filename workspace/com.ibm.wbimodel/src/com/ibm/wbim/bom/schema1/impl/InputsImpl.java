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
	protected EList<Input> input;

	/**
	 * The cached value of the '{@link #getInputCriterion() <em>Input Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<InputCriterion> inputCriterion;

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
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Input>(Input.class, this,
					Schema1Package.INPUTS__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputCriterion> getInputCriterion() {
		if (inputCriterion == null) {
			inputCriterion = new EObjectContainmentEList<InputCriterion>(
					InputCriterion.class, this,
					Schema1Package.INPUTS__INPUT_CRITERION);
		}
		return inputCriterion;
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
		case Schema1Package.INPUTS__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case Schema1Package.INPUTS__INPUT_CRITERION:
			return ((InternalEList<?>) getInputCriterion()).basicRemove(
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
		case Schema1Package.INPUTS__INPUT:
			return getInput();
		case Schema1Package.INPUTS__INPUT_CRITERION:
			return getInputCriterion();
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
		case Schema1Package.INPUTS__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
			return;
		case Schema1Package.INPUTS__INPUT_CRITERION:
			getInputCriterion().clear();
			getInputCriterion().addAll(
					(Collection<? extends InputCriterion>) newValue);
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
		case Schema1Package.INPUTS__INPUT:
			getInput().clear();
			return;
		case Schema1Package.INPUTS__INPUT_CRITERION:
			getInputCriterion().clear();
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
		case Schema1Package.INPUTS__INPUT:
			return input != null && !input.isEmpty();
		case Schema1Package.INPUTS__INPUT_CRITERION:
			return inputCriterion != null && !inputCriterion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputsImpl
