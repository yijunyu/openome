/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.InputCriterionRef;
import com.ibm.wbim.bom.schema1.RelatedInputCriteriaType;
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
 * An implementation of the model object '<em><b>Related Input Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RelatedInputCriteriaTypeImpl#getInputCriterion <em>Input Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedInputCriteriaTypeImpl extends EObjectImpl implements RelatedInputCriteriaType {
	/**
	 * The cached value of the '{@link #getInputCriterion() <em>Input Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList inputCriterion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedInputCriteriaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.RELATED_INPUT_CRITERIA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputCriterion() {
		if (inputCriterion == null) {
			inputCriterion = new EObjectContainmentEList(InputCriterionRef.class, this, Schema1Package.RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION);
		}
		return inputCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION:
				return ((InternalEList)getInputCriterion()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION:
				return getInputCriterion();
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
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION:
				getInputCriterion().clear();
				getInputCriterion().addAll((Collection)newValue);
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
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION:
				return inputCriterion != null && !inputCriterion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelatedInputCriteriaTypeImpl
