/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CorrelationType;
import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.MultipleInstancesMatch;
import com.ibm.wbim.bom.schema1.NoInstancesMatch;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl#getMultipleInstancesSatisfyCondition <em>Multiple Instances Satisfy Condition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl#getNoInstancesSatisfyCondition <em>No Instances Satisfy Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationTypeImpl extends EObjectImpl implements CorrelationType {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Expression predicate;

	/**
	 * The default value of the '{@link #getMultipleInstancesSatisfyCondition() <em>Multiple Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleInstancesSatisfyCondition()
	 * @generated
	 * @ordered
	 */
	protected static final MultipleInstancesMatch MULTIPLE_INSTANCES_SATISFY_CONDITION_EDEFAULT = MultipleInstancesMatch.TREATASERROR;

	/**
	 * The cached value of the '{@link #getMultipleInstancesSatisfyCondition() <em>Multiple Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleInstancesSatisfyCondition()
	 * @generated
	 * @ordered
	 */
	protected MultipleInstancesMatch multipleInstancesSatisfyCondition = MULTIPLE_INSTANCES_SATISFY_CONDITION_EDEFAULT;

	/**
	 * This is true if the Multiple Instances Satisfy Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleInstancesSatisfyConditionESet;

	/**
	 * The default value of the '{@link #getNoInstancesSatisfyCondition() <em>No Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoInstancesSatisfyCondition()
	 * @generated
	 * @ordered
	 */
	protected static final NoInstancesMatch NO_INSTANCES_SATISFY_CONDITION_EDEFAULT = NoInstancesMatch.TREATASERROR;

	/**
	 * The cached value of the '{@link #getNoInstancesSatisfyCondition() <em>No Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoInstancesSatisfyCondition()
	 * @generated
	 * @ordered
	 */
	protected NoInstancesMatch noInstancesSatisfyCondition = NO_INSTANCES_SATISFY_CONDITION_EDEFAULT;

	/**
	 * This is true if the No Instances Satisfy Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noInstancesSatisfyConditionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.CORRELATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(Expression newPredicate,
			NotificationChain msgs) {
		Expression oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.CORRELATION_TYPE__PREDICATE, oldPredicate,
					newPredicate);
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
	public void setPredicate(Expression newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject) predicate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.CORRELATION_TYPE__PREDICATE,
						null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.CORRELATION_TYPE__PREDICATE,
						null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.CORRELATION_TYPE__PREDICATE, newPredicate,
					newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleInstancesMatch getMultipleInstancesSatisfyCondition() {
		return multipleInstancesSatisfyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleInstancesSatisfyCondition(
			MultipleInstancesMatch newMultipleInstancesSatisfyCondition) {
		MultipleInstancesMatch oldMultipleInstancesSatisfyCondition = multipleInstancesSatisfyCondition;
		multipleInstancesSatisfyCondition = newMultipleInstancesSatisfyCondition == null ? MULTIPLE_INSTANCES_SATISFY_CONDITION_EDEFAULT
				: newMultipleInstancesSatisfyCondition;
		boolean oldMultipleInstancesSatisfyConditionESet = multipleInstancesSatisfyConditionESet;
		multipleInstancesSatisfyConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Schema1Package.CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION,
					oldMultipleInstancesSatisfyCondition,
					multipleInstancesSatisfyCondition,
					!oldMultipleInstancesSatisfyConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleInstancesSatisfyCondition() {
		MultipleInstancesMatch oldMultipleInstancesSatisfyCondition = multipleInstancesSatisfyCondition;
		boolean oldMultipleInstancesSatisfyConditionESet = multipleInstancesSatisfyConditionESet;
		multipleInstancesSatisfyCondition = MULTIPLE_INSTANCES_SATISFY_CONDITION_EDEFAULT;
		multipleInstancesSatisfyConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					Schema1Package.CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION,
					oldMultipleInstancesSatisfyCondition,
					MULTIPLE_INSTANCES_SATISFY_CONDITION_EDEFAULT,
					oldMultipleInstancesSatisfyConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleInstancesSatisfyCondition() {
		return multipleInstancesSatisfyConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoInstancesMatch getNoInstancesSatisfyCondition() {
		return noInstancesSatisfyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoInstancesSatisfyCondition(
			NoInstancesMatch newNoInstancesSatisfyCondition) {
		NoInstancesMatch oldNoInstancesSatisfyCondition = noInstancesSatisfyCondition;
		noInstancesSatisfyCondition = newNoInstancesSatisfyCondition == null ? NO_INSTANCES_SATISFY_CONDITION_EDEFAULT
				: newNoInstancesSatisfyCondition;
		boolean oldNoInstancesSatisfyConditionESet = noInstancesSatisfyConditionESet;
		noInstancesSatisfyConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Schema1Package.CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION,
					oldNoInstancesSatisfyCondition,
					noInstancesSatisfyCondition,
					!oldNoInstancesSatisfyConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoInstancesSatisfyCondition() {
		NoInstancesMatch oldNoInstancesSatisfyCondition = noInstancesSatisfyCondition;
		boolean oldNoInstancesSatisfyConditionESet = noInstancesSatisfyConditionESet;
		noInstancesSatisfyCondition = NO_INSTANCES_SATISFY_CONDITION_EDEFAULT;
		noInstancesSatisfyConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					Schema1Package.CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION,
					oldNoInstancesSatisfyCondition,
					NO_INSTANCES_SATISFY_CONDITION_EDEFAULT,
					oldNoInstancesSatisfyConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoInstancesSatisfyCondition() {
		return noInstancesSatisfyConditionESet;
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
		case Schema1Package.CORRELATION_TYPE__PREDICATE:
			return basicSetPredicate(null, msgs);
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
		case Schema1Package.CORRELATION_TYPE__PREDICATE:
			return getPredicate();
		case Schema1Package.CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION:
			return getMultipleInstancesSatisfyCondition();
		case Schema1Package.CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION:
			return getNoInstancesSatisfyCondition();
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
		case Schema1Package.CORRELATION_TYPE__PREDICATE:
			setPredicate((Expression) newValue);
			return;
		case Schema1Package.CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION:
			setMultipleInstancesSatisfyCondition((MultipleInstancesMatch) newValue);
			return;
		case Schema1Package.CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION:
			setNoInstancesSatisfyCondition((NoInstancesMatch) newValue);
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
		case Schema1Package.CORRELATION_TYPE__PREDICATE:
			setPredicate((Expression) null);
			return;
		case Schema1Package.CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION:
			unsetMultipleInstancesSatisfyCondition();
			return;
		case Schema1Package.CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION:
			unsetNoInstancesSatisfyCondition();
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
		case Schema1Package.CORRELATION_TYPE__PREDICATE:
			return predicate != null;
		case Schema1Package.CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION:
			return isSetMultipleInstancesSatisfyCondition();
		case Schema1Package.CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION:
			return isSetNoInstancesSatisfyCondition();
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
		result.append(" (multipleInstancesSatisfyCondition: ");
		if (multipleInstancesSatisfyConditionESet)
			result.append(multipleInstancesSatisfyCondition);
		else
			result.append("<unset>");
		result.append(", noInstancesSatisfyCondition: ");
		if (noInstancesSatisfyConditionESet)
			result.append(noInstancesSatisfyCondition);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CorrelationTypeImpl
