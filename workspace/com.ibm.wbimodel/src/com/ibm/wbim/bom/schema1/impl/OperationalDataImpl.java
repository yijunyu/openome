/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CostType;
import com.ibm.wbim.bom.schema1.CostValue;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TimeEstimationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OperationalDataImpl#getTimeEstimation <em>Time Estimation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OperationalDataImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OperationalDataImpl#getRevenue <em>Revenue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalDataImpl extends EObjectImpl implements OperationalData {
	/**
	 * The cached value of the '{@link #getTimeEstimation() <em>Time Estimation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEstimation()
	 * @generated
	 * @ordered
	 */
	protected TimeEstimationType timeEstimation = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected CostType cost = null;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CostValue revenue = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OPERATIONAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEstimationType getTimeEstimation() {
		return timeEstimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeEstimation(TimeEstimationType newTimeEstimation, NotificationChain msgs) {
		TimeEstimationType oldTimeEstimation = timeEstimation;
		timeEstimation = newTimeEstimation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION, oldTimeEstimation, newTimeEstimation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeEstimation(TimeEstimationType newTimeEstimation) {
		if (newTimeEstimation != timeEstimation) {
			NotificationChain msgs = null;
			if (timeEstimation != null)
				msgs = ((InternalEObject)timeEstimation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION, null, msgs);
			if (newTimeEstimation != null)
				msgs = ((InternalEObject)newTimeEstimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION, null, msgs);
			msgs = basicSetTimeEstimation(newTimeEstimation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION, newTimeEstimation, newTimeEstimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCost(CostType newCost, NotificationChain msgs) {
		CostType oldCost = cost;
		cost = newCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OPERATIONAL_DATA__COST, oldCost, newCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(CostType newCost) {
		if (newCost != cost) {
			NotificationChain msgs = null;
			if (cost != null)
				msgs = ((InternalEObject)cost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OPERATIONAL_DATA__COST, null, msgs);
			if (newCost != null)
				msgs = ((InternalEObject)newCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OPERATIONAL_DATA__COST, null, msgs);
			msgs = basicSetCost(newCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OPERATIONAL_DATA__COST, newCost, newCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostValue getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(CostValue newRevenue, NotificationChain msgs) {
		CostValue oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OPERATIONAL_DATA__REVENUE, oldRevenue, newRevenue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(CostValue newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OPERATIONAL_DATA__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OPERATIONAL_DATA__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OPERATIONAL_DATA__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION:
				return basicSetTimeEstimation(null, msgs);
			case Schema1Package.OPERATIONAL_DATA__COST:
				return basicSetCost(null, msgs);
			case Schema1Package.OPERATIONAL_DATA__REVENUE:
				return basicSetRevenue(null, msgs);
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
			case Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION:
				return getTimeEstimation();
			case Schema1Package.OPERATIONAL_DATA__COST:
				return getCost();
			case Schema1Package.OPERATIONAL_DATA__REVENUE:
				return getRevenue();
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
			case Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION:
				setTimeEstimation((TimeEstimationType)newValue);
				return;
			case Schema1Package.OPERATIONAL_DATA__COST:
				setCost((CostType)newValue);
				return;
			case Schema1Package.OPERATIONAL_DATA__REVENUE:
				setRevenue((CostValue)newValue);
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
			case Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION:
				setTimeEstimation((TimeEstimationType)null);
				return;
			case Schema1Package.OPERATIONAL_DATA__COST:
				setCost((CostType)null);
				return;
			case Schema1Package.OPERATIONAL_DATA__REVENUE:
				setRevenue((CostValue)null);
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
			case Schema1Package.OPERATIONAL_DATA__TIME_ESTIMATION:
				return timeEstimation != null;
			case Schema1Package.OPERATIONAL_DATA__COST:
				return cost != null;
			case Schema1Package.OPERATIONAL_DATA__REVENUE:
				return revenue != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalDataImpl
