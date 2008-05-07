/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.OutputPathProbabilityValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Path Probability Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputPathProbabilityValueImpl#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPathProbabilityValueImpl extends EObjectImpl implements
		OutputPathProbabilityValue {
	/**
	 * The default value of the '{@link #getLiteralValue() <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralValue()
	 * @generated
	 * @ordered
	 */
	protected static final double LITERAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLiteralValue() <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralValue()
	 * @generated
	 * @ordered
	 */
	protected double literalValue = LITERAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Literal Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean literalValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPathProbabilityValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OUTPUT_PATH_PROBABILITY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLiteralValue() {
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralValue(double newLiteralValue) {
		double oldLiteralValue = literalValue;
		literalValue = newLiteralValue;
		boolean oldLiteralValueESet = literalValueESet;
		literalValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE,
					oldLiteralValue, literalValue, !oldLiteralValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiteralValue() {
		double oldLiteralValue = literalValue;
		boolean oldLiteralValueESet = literalValueESet;
		literalValue = LITERAL_VALUE_EDEFAULT;
		literalValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE,
					oldLiteralValue, LITERAL_VALUE_EDEFAULT,
					oldLiteralValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiteralValue() {
		return literalValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE:
			return new Double(getLiteralValue());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE:
			setLiteralValue(((Double) newValue).doubleValue());
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
		case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE:
			unsetLiteralValue();
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
		case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE:
			return isSetLiteralValue();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (literalValue: ");
		if (literalValueESet)
			result.append(literalValue);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutputPathProbabilityValueImpl
