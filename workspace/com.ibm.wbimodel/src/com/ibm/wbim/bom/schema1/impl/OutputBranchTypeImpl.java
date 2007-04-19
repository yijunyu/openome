/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.OutputBranchType;
import com.ibm.wbim.bom.schema1.OutputPathOperationalData;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputBranchTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputBranchTypeImpl#getOperationalData <em>Operational Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputBranchTypeImpl extends OutputBranchImpl implements OutputBranchType {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition = null;

	/**
	 * The cached value of the '{@link #getOperationalData() <em>Operational Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalData()
	 * @generated
	 * @ordered
	 */
	protected OutputPathOperationalData operationalData = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OUTPUT_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPathOperationalData getOperationalData() {
		return operationalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalData(OutputPathOperationalData newOperationalData, NotificationChain msgs) {
		OutputPathOperationalData oldOperationalData = operationalData;
		operationalData = newOperationalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA, oldOperationalData, newOperationalData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalData(OutputPathOperationalData newOperationalData) {
		if (newOperationalData != operationalData) {
			NotificationChain msgs = null;
			if (operationalData != null)
				msgs = ((InternalEObject)operationalData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA, null, msgs);
			if (newOperationalData != null)
				msgs = ((InternalEObject)newOperationalData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA, null, msgs);
			msgs = basicSetOperationalData(newOperationalData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA, newOperationalData, newOperationalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION:
				return basicSetCondition(null, msgs);
			case Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA:
				return basicSetOperationalData(null, msgs);
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
			case Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION:
				return getCondition();
			case Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA:
				return getOperationalData();
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
			case Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION:
				setCondition((Expression)newValue);
				return;
			case Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA:
				setOperationalData((OutputPathOperationalData)newValue);
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
			case Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION:
				setCondition((Expression)null);
				return;
			case Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA:
				setOperationalData((OutputPathOperationalData)null);
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
			case Schema1Package.OUTPUT_BRANCH_TYPE__CONDITION:
				return condition != null;
			case Schema1Package.OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA:
				return operationalData != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputBranchTypeImpl
