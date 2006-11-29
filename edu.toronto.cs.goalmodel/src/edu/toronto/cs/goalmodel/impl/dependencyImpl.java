/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.dependency;
import edu.toronto.cs.goalmodel.goal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.dependencyImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.dependencyImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.dependencyImpl#getTrust <em>Trust</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.dependencyImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dependencyImpl extends EObjectImpl implements dependency {
	/**
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected goal dependencyFrom = null;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected goal dependencyTo = null;

	/**
	 * The default value of the '{@link #getTrust() <em>Trust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrust()
	 * @generated
	 * @ordered
	 */
	protected static final float TRUST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTrust() <em>Trust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrust()
	 * @generated
	 * @ordered
	 */
	protected float trust = TRUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GoalmodelPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public goal getDependencyFrom() {
		if (dependencyFrom != null && dependencyFrom.eIsProxy()) {
			InternalEObject oldDependencyFrom = (InternalEObject)dependencyFrom;
			dependencyFrom = (goal)eResolveProxy(oldDependencyFrom);
			if (dependencyFrom != oldDependencyFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM, oldDependencyFrom, dependencyFrom));
			}
		}
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public goal basicGetDependencyFrom() {
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyFrom(goal newDependencyFrom, NotificationChain msgs) {
		goal oldDependencyFrom = dependencyFrom;
		dependencyFrom = newDependencyFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM, oldDependencyFrom, newDependencyFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyFrom(goal newDependencyFrom) {
		if (newDependencyFrom != dependencyFrom) {
			NotificationChain msgs = null;
			if (dependencyFrom != null)
				msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, GoalmodelPackage.GOAL__DEPENDENCY_TO, goal.class, msgs);
			if (newDependencyFrom != null)
				msgs = ((InternalEObject)newDependencyFrom).eInverseAdd(this, GoalmodelPackage.GOAL__DEPENDENCY_TO, goal.class, msgs);
			msgs = basicSetDependencyFrom(newDependencyFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM, newDependencyFrom, newDependencyFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public goal getDependencyTo() {
		if (dependencyTo != null && dependencyTo.eIsProxy()) {
			InternalEObject oldDependencyTo = (InternalEObject)dependencyTo;
			dependencyTo = (goal)eResolveProxy(oldDependencyTo);
			if (dependencyTo != oldDependencyTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
			}
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public goal basicGetDependencyTo() {
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyTo(goal newDependencyTo, NotificationChain msgs) {
		goal oldDependencyTo = dependencyTo;
		dependencyTo = newDependencyTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO, oldDependencyTo, newDependencyTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyTo(goal newDependencyTo) {
		if (newDependencyTo != dependencyTo) {
			NotificationChain msgs = null;
			if (dependencyTo != null)
				msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, GoalmodelPackage.GOAL__DEPENDENCY_FROM, goal.class, msgs);
			if (newDependencyTo != null)
				msgs = ((InternalEObject)newDependencyTo).eInverseAdd(this, GoalmodelPackage.GOAL__DEPENDENCY_FROM, goal.class, msgs);
			msgs = basicSetDependencyTo(newDependencyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO, newDependencyTo, newDependencyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTrust() {
		return trust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrust(float newTrust) {
		float oldTrust = trust;
		trust = newTrust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__TRUST, oldTrust, trust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				if (dependencyFrom != null)
					msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, GoalmodelPackage.GOAL__DEPENDENCY_TO, goal.class, msgs);
				return basicSetDependencyFrom((goal)otherEnd, msgs);
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				if (dependencyTo != null)
					msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, GoalmodelPackage.GOAL__DEPENDENCY_FROM, goal.class, msgs);
				return basicSetDependencyTo((goal)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return basicSetDependencyFrom(null, msgs);
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				return basicSetDependencyTo(null, msgs);
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				if (resolve) return getDependencyFrom();
				return basicGetDependencyFrom();
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				if (resolve) return getDependencyTo();
				return basicGetDependencyTo();
			case GoalmodelPackage.DEPENDENCY__TRUST:
				return new Float(getTrust());
			case GoalmodelPackage.DEPENDENCY__LABEL:
				return getLabel();
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((goal)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((goal)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				setTrust(((Float)newValue).floatValue());
				return;
			case GoalmodelPackage.DEPENDENCY__LABEL:
				setLabel((String)newValue);
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((goal)null);
				return;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((goal)null);
				return;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				setTrust(TRUST_EDEFAULT);
				return;
			case GoalmodelPackage.DEPENDENCY__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return dependencyFrom != null;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				return dependencyTo != null;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				return trust != TRUST_EDEFAULT;
			case GoalmodelPackage.DEPENDENCY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (trust: ");
		result.append(trust);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //dependencyImpl