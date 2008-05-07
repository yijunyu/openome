/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.Loop;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LoopImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.LoopImpl#isIsConditionTestedFirst <em>Is Condition Tested First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopImpl extends ProcessImpl implements Loop {
	/**
	 * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression loopCondition;

	/**
	 * The default value of the '{@link #isIsConditionTestedFirst() <em>Is Condition Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConditionTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONDITION_TESTED_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConditionTestedFirst() <em>Is Condition Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConditionTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean isConditionTestedFirst = IS_CONDITION_TESTED_FIRST_EDEFAULT;

	/**
	 * This is true if the Is Condition Tested First attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConditionTestedFirstESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopCondition() {
		return loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition(Expression newLoopCondition,
			NotificationChain msgs) {
		Expression oldLoopCondition = loopCondition;
		loopCondition = newLoopCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Schema1Package.LOOP__LOOP_CONDITION,
					oldLoopCondition, newLoopCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(Expression newLoopCondition) {
		if (newLoopCondition != loopCondition) {
			NotificationChain msgs = null;
			if (loopCondition != null)
				msgs = ((InternalEObject) loopCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.LOOP__LOOP_CONDITION, null,
						msgs);
			if (newLoopCondition != null)
				msgs = ((InternalEObject) newLoopCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.LOOP__LOOP_CONDITION, null,
						msgs);
			msgs = basicSetLoopCondition(newLoopCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.LOOP__LOOP_CONDITION, newLoopCondition,
					newLoopCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConditionTestedFirst() {
		return isConditionTestedFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConditionTestedFirst(boolean newIsConditionTestedFirst) {
		boolean oldIsConditionTestedFirst = isConditionTestedFirst;
		isConditionTestedFirst = newIsConditionTestedFirst;
		boolean oldIsConditionTestedFirstESet = isConditionTestedFirstESet;
		isConditionTestedFirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.LOOP__IS_CONDITION_TESTED_FIRST,
					oldIsConditionTestedFirst, isConditionTestedFirst,
					!oldIsConditionTestedFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConditionTestedFirst() {
		boolean oldIsConditionTestedFirst = isConditionTestedFirst;
		boolean oldIsConditionTestedFirstESet = isConditionTestedFirstESet;
		isConditionTestedFirst = IS_CONDITION_TESTED_FIRST_EDEFAULT;
		isConditionTestedFirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					Schema1Package.LOOP__IS_CONDITION_TESTED_FIRST,
					oldIsConditionTestedFirst,
					IS_CONDITION_TESTED_FIRST_EDEFAULT,
					oldIsConditionTestedFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConditionTestedFirst() {
		return isConditionTestedFirstESet;
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
		case Schema1Package.LOOP__LOOP_CONDITION:
			return basicSetLoopCondition(null, msgs);
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
		case Schema1Package.LOOP__LOOP_CONDITION:
			return getLoopCondition();
		case Schema1Package.LOOP__IS_CONDITION_TESTED_FIRST:
			return isIsConditionTestedFirst() ? Boolean.TRUE : Boolean.FALSE;
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
		case Schema1Package.LOOP__LOOP_CONDITION:
			setLoopCondition((Expression) newValue);
			return;
		case Schema1Package.LOOP__IS_CONDITION_TESTED_FIRST:
			setIsConditionTestedFirst(((Boolean) newValue).booleanValue());
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
		case Schema1Package.LOOP__LOOP_CONDITION:
			setLoopCondition((Expression) null);
			return;
		case Schema1Package.LOOP__IS_CONDITION_TESTED_FIRST:
			unsetIsConditionTestedFirst();
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
		case Schema1Package.LOOP__LOOP_CONDITION:
			return loopCondition != null;
		case Schema1Package.LOOP__IS_CONDITION_TESTED_FIRST:
			return isSetIsConditionTestedFirst();
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
		result.append(" (isConditionTestedFirst: ");
		if (isConditionTestedFirstESet)
			result.append(isConditionTestedFirst);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LoopImpl
