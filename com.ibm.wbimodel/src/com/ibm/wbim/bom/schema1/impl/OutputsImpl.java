/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Output;
import com.ibm.wbim.bom.schema1.OutputCriterion;
import com.ibm.wbim.bom.schema1.Outputs;
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
 * An implementation of the model object '<em><b>Outputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputsImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputsImpl#getOutputCriterion <em>Output Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputsImpl extends EObjectImpl implements Outputs {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList output = null;

	/**
	 * The cached value of the '{@link #getOutputCriterion() <em>Output Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList outputCriterion = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OUTPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList(Output.class, this, Schema1Package.OUTPUTS__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputCriterion() {
		if (outputCriterion == null) {
			outputCriterion = new EObjectContainmentEList(OutputCriterion.class, this, Schema1Package.OUTPUTS__OUTPUT_CRITERION);
		}
		return outputCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.OUTPUTS__OUTPUT:
				return ((InternalEList)getOutput()).basicRemove(otherEnd, msgs);
			case Schema1Package.OUTPUTS__OUTPUT_CRITERION:
				return ((InternalEList)getOutputCriterion()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.OUTPUTS__OUTPUT:
				return getOutput();
			case Schema1Package.OUTPUTS__OUTPUT_CRITERION:
				return getOutputCriterion();
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
			case Schema1Package.OUTPUTS__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection)newValue);
				return;
			case Schema1Package.OUTPUTS__OUTPUT_CRITERION:
				getOutputCriterion().clear();
				getOutputCriterion().addAll((Collection)newValue);
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
			case Schema1Package.OUTPUTS__OUTPUT:
				getOutput().clear();
				return;
			case Schema1Package.OUTPUTS__OUTPUT_CRITERION:
				getOutputCriterion().clear();
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
			case Schema1Package.OUTPUTS__OUTPUT:
				return output != null && !output.isEmpty();
			case Schema1Package.OUTPUTS__OUTPUT_CRITERION:
				return outputCriterion != null && !outputCriterion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputsImpl