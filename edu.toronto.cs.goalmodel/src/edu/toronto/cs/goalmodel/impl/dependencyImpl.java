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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class dependencyImpl extends EObjectImpl implements dependency {
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
		return GoalmodelPackage.eINSTANCE.getdependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public goal getDependencyFrom() {
		if (eContainerFeatureID != GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM) return null;
		return (goal)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyFrom(goal newDependencyFrom) {
		if (newDependencyFrom != eContainer || (eContainerFeatureID != GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM && newDependencyFrom != null)) {
			if (EcoreUtil.isAncestor(this, newDependencyFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDependencyFrom != null)
				msgs = ((InternalEObject)newDependencyFrom).eInverseAdd(this, GoalmodelPackage.GOAL__DEPENDENCY_TO, goal.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newDependencyFrom, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM, msgs);
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
		if (eContainerFeatureID != GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO) return null;
		return (goal)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyTo(goal newDependencyTo) {
		if (newDependencyTo != eContainer || (eContainerFeatureID != GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO && newDependencyTo != null)) {
			if (EcoreUtil.isAncestor(this, newDependencyTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDependencyTo != null)
				msgs = ((InternalEObject)newDependencyTo).eInverseAdd(this, GoalmodelPackage.GOAL__DEPENDENCY_FROM, goal.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newDependencyTo, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO, msgs);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM, msgs);
				case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
					return eBasicSetContainer(null, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM, msgs);
				case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
					return eBasicSetContainer(null, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
					return eContainer.eInverseRemove(this, GoalmodelPackage.GOAL__DEPENDENCY_TO, goal.class, msgs);
				case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
					return eContainer.eInverseRemove(this, GoalmodelPackage.GOAL__DEPENDENCY_FROM, goal.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return getDependencyFrom();
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				return getDependencyTo();
			case GoalmodelPackage.DEPENDENCY__TRUST:
				return new Float(getTrust());
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((goal)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((goal)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				setTrust(((Float)newValue).floatValue());
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((goal)null);
				return;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((goal)null);
				return;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				setTrust(TRUST_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return getDependencyFrom() != null;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				return getDependencyTo() != null;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				return trust != TRUST_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
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
		result.append(')');
		return result.toString();
	}

} //dependencyImpl
