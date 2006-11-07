/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CorrelationType;
import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.InputCriterion;
import com.ibm.wbim.bom.schema1.InputType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputCriterionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputCriterionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputCriterionImpl#getCorrelation <em>Correlation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputCriterionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputCriterionImpl extends EObjectImpl implements InputCriterion {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList input = null;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList constraint = null;

	/**
	 * The cached value of the '{@link #getCorrelation() <em>Correlation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelation()
	 * @generated
	 * @ordered
	 */
	protected CorrelationType correlation = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INPUT_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInput() {
		if (input == null) {
			input = new EObjectContainmentEList(InputType.class, this, Schema1Package.INPUT_CRITERION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList(Expression.class, this, Schema1Package.INPUT_CRITERION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationType getCorrelation() {
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelation(CorrelationType newCorrelation, NotificationChain msgs) {
		CorrelationType oldCorrelation = correlation;
		correlation = newCorrelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.INPUT_CRITERION__CORRELATION, oldCorrelation, newCorrelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelation(CorrelationType newCorrelation) {
		if (newCorrelation != correlation) {
			NotificationChain msgs = null;
			if (correlation != null)
				msgs = ((InternalEObject)correlation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.INPUT_CRITERION__CORRELATION, null, msgs);
			if (newCorrelation != null)
				msgs = ((InternalEObject)newCorrelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.INPUT_CRITERION__CORRELATION, null, msgs);
			msgs = basicSetCorrelation(newCorrelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INPUT_CRITERION__CORRELATION, newCorrelation, newCorrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INPUT_CRITERION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.INPUT_CRITERION__INPUT:
				return ((InternalEList)getInput()).basicRemove(otherEnd, msgs);
			case Schema1Package.INPUT_CRITERION__CONSTRAINT:
				return ((InternalEList)getConstraint()).basicRemove(otherEnd, msgs);
			case Schema1Package.INPUT_CRITERION__CORRELATION:
				return basicSetCorrelation(null, msgs);
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
			case Schema1Package.INPUT_CRITERION__INPUT:
				return getInput();
			case Schema1Package.INPUT_CRITERION__CONSTRAINT:
				return getConstraint();
			case Schema1Package.INPUT_CRITERION__CORRELATION:
				return getCorrelation();
			case Schema1Package.INPUT_CRITERION__NAME:
				return getName();
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
			case Schema1Package.INPUT_CRITERION__INPUT:
				getInput().clear();
				getInput().addAll((Collection)newValue);
				return;
			case Schema1Package.INPUT_CRITERION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection)newValue);
				return;
			case Schema1Package.INPUT_CRITERION__CORRELATION:
				setCorrelation((CorrelationType)newValue);
				return;
			case Schema1Package.INPUT_CRITERION__NAME:
				setName((String)newValue);
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
			case Schema1Package.INPUT_CRITERION__INPUT:
				getInput().clear();
				return;
			case Schema1Package.INPUT_CRITERION__CONSTRAINT:
				getConstraint().clear();
				return;
			case Schema1Package.INPUT_CRITERION__CORRELATION:
				setCorrelation((CorrelationType)null);
				return;
			case Schema1Package.INPUT_CRITERION__NAME:
				setName(NAME_EDEFAULT);
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
			case Schema1Package.INPUT_CRITERION__INPUT:
				return input != null && !input.isEmpty();
			case Schema1Package.INPUT_CRITERION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case Schema1Package.INPUT_CRITERION__CORRELATION:
				return correlation != null;
			case Schema1Package.INPUT_CRITERION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InputCriterionImpl