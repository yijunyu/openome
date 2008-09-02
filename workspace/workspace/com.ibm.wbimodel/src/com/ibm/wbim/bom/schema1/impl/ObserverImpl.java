/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.Observer;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ObserverImpl#getObservationExpression <em>Observation Expression</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ObserverImpl#isIsObserveContinuously <em>Is Observe Continuously</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserverImpl extends TaskImpl implements Observer {
	/**
	 * The cached value of the '{@link #getObservationExpression() <em>Observation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression observationExpression;

	/**
	 * The default value of the '{@link #isIsObserveContinuously() <em>Is Observe Continuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObserveContinuously()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OBSERVE_CONTINUOUSLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsObserveContinuously() <em>Is Observe Continuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObserveContinuously()
	 * @generated
	 * @ordered
	 */
	protected boolean isObserveContinuously = IS_OBSERVE_CONTINUOUSLY_EDEFAULT;

	/**
	 * This is true if the Is Observe Continuously attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isObserveContinuouslyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OBSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getObservationExpression() {
		return observationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservationExpression(
			Expression newObservationExpression, NotificationChain msgs) {
		Expression oldObservationExpression = observationExpression;
		observationExpression = newObservationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.OBSERVER__OBSERVATION_EXPRESSION,
					oldObservationExpression, newObservationExpression);
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
	public void setObservationExpression(Expression newObservationExpression) {
		if (newObservationExpression != observationExpression) {
			NotificationChain msgs = null;
			if (observationExpression != null)
				msgs = ((InternalEObject) observationExpression)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.OBSERVER__OBSERVATION_EXPRESSION,
								null, msgs);
			if (newObservationExpression != null)
				msgs = ((InternalEObject) newObservationExpression)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.OBSERVER__OBSERVATION_EXPRESSION,
								null, msgs);
			msgs = basicSetObservationExpression(newObservationExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.OBSERVER__OBSERVATION_EXPRESSION,
					newObservationExpression, newObservationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsObserveContinuously() {
		return isObserveContinuously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsObserveContinuously(boolean newIsObserveContinuously) {
		boolean oldIsObserveContinuously = isObserveContinuously;
		isObserveContinuously = newIsObserveContinuously;
		boolean oldIsObserveContinuouslyESet = isObserveContinuouslyESet;
		isObserveContinuouslyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY,
					oldIsObserveContinuously, isObserveContinuously,
					!oldIsObserveContinuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsObserveContinuously() {
		boolean oldIsObserveContinuously = isObserveContinuously;
		boolean oldIsObserveContinuouslyESet = isObserveContinuouslyESet;
		isObserveContinuously = IS_OBSERVE_CONTINUOUSLY_EDEFAULT;
		isObserveContinuouslyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY,
					oldIsObserveContinuously, IS_OBSERVE_CONTINUOUSLY_EDEFAULT,
					oldIsObserveContinuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsObserveContinuously() {
		return isObserveContinuouslyESet;
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
		case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
			return basicSetObservationExpression(null, msgs);
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
		case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
			return getObservationExpression();
		case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
			return isIsObserveContinuously() ? Boolean.TRUE : Boolean.FALSE;
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
		case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
			setObservationExpression((Expression) newValue);
			return;
		case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
			setIsObserveContinuously(((Boolean) newValue).booleanValue());
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
		case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
			setObservationExpression((Expression) null);
			return;
		case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
			unsetIsObserveContinuously();
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
		case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
			return observationExpression != null;
		case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
			return isSetIsObserveContinuously();
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
		result.append(" (isObserveContinuously: ");
		if (isObserveContinuouslyESet)
			result.append(isObserveContinuously);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObserverImpl
