/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.LoopConditionType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl#getCounterIncrement <em>Counter Increment</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl#getFinalCounter <em>Final Counter</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl#getInitialCounter <em>Initial Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopConditionTypeImpl extends ExpressionImpl implements LoopConditionType {
	/**
	 * The default value of the '{@link #getCounterIncrement() <em>Counter Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COUNTER_INCREMENT_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getCounterIncrement() <em>Counter Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterIncrement()
	 * @generated
	 * @ordered
	 */
	protected BigInteger counterIncrement = COUNTER_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Counter Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean counterIncrementESet;

	/**
	 * The default value of the '{@link #getFinalCounter() <em>Final Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCounter()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FINAL_COUNTER_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getFinalCounter() <em>Final Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCounter()
	 * @generated
	 * @ordered
	 */
	protected BigInteger finalCounter = FINAL_COUNTER_EDEFAULT;

	/**
	 * This is true if the Final Counter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalCounterESet;

	/**
	 * The default value of the '{@link #getInitialCounter() <em>Initial Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCounter()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INITIAL_COUNTER_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getInitialCounter() <em>Initial Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCounter()
	 * @generated
	 * @ordered
	 */
	protected BigInteger initialCounter = INITIAL_COUNTER_EDEFAULT;

	/**
	 * This is true if the Initial Counter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialCounterESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.LOOP_CONDITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCounterIncrement() {
		return counterIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterIncrement(BigInteger newCounterIncrement) {
		BigInteger oldCounterIncrement = counterIncrement;
		counterIncrement = newCounterIncrement;
		boolean oldCounterIncrementESet = counterIncrementESet;
		counterIncrementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.LOOP_CONDITION_TYPE__COUNTER_INCREMENT, oldCounterIncrement, counterIncrement, !oldCounterIncrementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCounterIncrement() {
		BigInteger oldCounterIncrement = counterIncrement;
		boolean oldCounterIncrementESet = counterIncrementESet;
		counterIncrement = COUNTER_INCREMENT_EDEFAULT;
		counterIncrementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.LOOP_CONDITION_TYPE__COUNTER_INCREMENT, oldCounterIncrement, COUNTER_INCREMENT_EDEFAULT, oldCounterIncrementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCounterIncrement() {
		return counterIncrementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFinalCounter() {
		return finalCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalCounter(BigInteger newFinalCounter) {
		BigInteger oldFinalCounter = finalCounter;
		finalCounter = newFinalCounter;
		boolean oldFinalCounterESet = finalCounterESet;
		finalCounterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.LOOP_CONDITION_TYPE__FINAL_COUNTER, oldFinalCounter, finalCounter, !oldFinalCounterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinalCounter() {
		BigInteger oldFinalCounter = finalCounter;
		boolean oldFinalCounterESet = finalCounterESet;
		finalCounter = FINAL_COUNTER_EDEFAULT;
		finalCounterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.LOOP_CONDITION_TYPE__FINAL_COUNTER, oldFinalCounter, FINAL_COUNTER_EDEFAULT, oldFinalCounterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinalCounter() {
		return finalCounterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getInitialCounter() {
		return initialCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCounter(BigInteger newInitialCounter) {
		BigInteger oldInitialCounter = initialCounter;
		initialCounter = newInitialCounter;
		boolean oldInitialCounterESet = initialCounterESet;
		initialCounterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.LOOP_CONDITION_TYPE__INITIAL_COUNTER, oldInitialCounter, initialCounter, !oldInitialCounterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialCounter() {
		BigInteger oldInitialCounter = initialCounter;
		boolean oldInitialCounterESet = initialCounterESet;
		initialCounter = INITIAL_COUNTER_EDEFAULT;
		initialCounterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.LOOP_CONDITION_TYPE__INITIAL_COUNTER, oldInitialCounter, INITIAL_COUNTER_EDEFAULT, oldInitialCounterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialCounter() {
		return initialCounterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.LOOP_CONDITION_TYPE__COUNTER_INCREMENT:
				return getCounterIncrement();
			case Schema1Package.LOOP_CONDITION_TYPE__FINAL_COUNTER:
				return getFinalCounter();
			case Schema1Package.LOOP_CONDITION_TYPE__INITIAL_COUNTER:
				return getInitialCounter();
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
			case Schema1Package.LOOP_CONDITION_TYPE__COUNTER_INCREMENT:
				setCounterIncrement((BigInteger)newValue);
				return;
			case Schema1Package.LOOP_CONDITION_TYPE__FINAL_COUNTER:
				setFinalCounter((BigInteger)newValue);
				return;
			case Schema1Package.LOOP_CONDITION_TYPE__INITIAL_COUNTER:
				setInitialCounter((BigInteger)newValue);
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
			case Schema1Package.LOOP_CONDITION_TYPE__COUNTER_INCREMENT:
				unsetCounterIncrement();
				return;
			case Schema1Package.LOOP_CONDITION_TYPE__FINAL_COUNTER:
				unsetFinalCounter();
				return;
			case Schema1Package.LOOP_CONDITION_TYPE__INITIAL_COUNTER:
				unsetInitialCounter();
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
			case Schema1Package.LOOP_CONDITION_TYPE__COUNTER_INCREMENT:
				return isSetCounterIncrement();
			case Schema1Package.LOOP_CONDITION_TYPE__FINAL_COUNTER:
				return isSetFinalCounter();
			case Schema1Package.LOOP_CONDITION_TYPE__INITIAL_COUNTER:
				return isSetInitialCounter();
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
		result.append(" (counterIncrement: ");
		if (counterIncrementESet) result.append(counterIncrement); else result.append("<unset>");
		result.append(", finalCounter: ");
		if (finalCounterESet) result.append(finalCounter); else result.append("<unset>");
		result.append(", initialCounter: ");
		if (initialCounterESet) result.append(initialCounter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LoopConditionTypeImpl
