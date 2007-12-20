/**
 * Copyright University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.Dependency;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.DependencyImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.DependencyImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.DependencyImpl#getTrust <em>Trust</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.DependencyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.DependencyImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends EObjectImpl implements Dependency {
	/**
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected Intention dependencyFrom= null;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected Intention dependencyTo= null;

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
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalmodelPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intention getDependencyFrom() {
		if (dependencyFrom != null && dependencyFrom.eIsProxy()) {
			InternalEObject oldDependencyFrom = (InternalEObject)dependencyFrom;
			dependencyFrom = (Intention)eResolveProxy(oldDependencyFrom);
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
	public Intention basicGetDependencyFrom() {
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyFrom(Intention newDependencyFrom, NotificationChain msgs) {
		Intention oldDependencyFrom = dependencyFrom;
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
	public void setDependencyFrom(Intention newDependencyFrom) {
		if (newDependencyFrom != dependencyFrom) {
			NotificationChain msgs = null;
			if (dependencyFrom != null)
				msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, GoalmodelPackage.INTENTION__DEPENDENCY_TO, Intention.class, msgs);
			if (newDependencyFrom != null)
				msgs = ((InternalEObject)newDependencyFrom).eInverseAdd(this, GoalmodelPackage.INTENTION__DEPENDENCY_TO, Intention.class, msgs);
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
	public Intention getDependencyTo() {
		if (dependencyTo != null && dependencyTo.eIsProxy()) {
			InternalEObject oldDependencyTo = (InternalEObject)dependencyTo;
			dependencyTo = (Intention)eResolveProxy(oldDependencyTo);
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
	public Intention basicGetDependencyTo() {
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyTo(Intention newDependencyTo, NotificationChain msgs) {
		Intention oldDependencyTo = dependencyTo;
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
	public void setDependencyTo(Intention newDependencyTo) {
		if (newDependencyTo != dependencyTo) {
			NotificationChain msgs = null;
			if (dependencyTo != null)
				msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, GoalmodelPackage.INTENTION__DEPENDENCY_FROM, Intention.class, msgs);
			if (newDependencyTo != null)
				msgs = ((InternalEObject)newDependencyTo).eInverseAdd(this, GoalmodelPackage.INTENTION__DEPENDENCY_FROM, Intention.class, msgs);
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
	public Model getModel() {
		if (eContainerFeatureID != GoalmodelPackage.DEPENDENCY__MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, GoalmodelPackage.DEPENDENCY__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID != GoalmodelPackage.DEPENDENCY__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, GoalmodelPackage.MODEL__DEPENDENCIES, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.DEPENDENCY__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				if (dependencyFrom != null)
					msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, GoalmodelPackage.INTENTION__DEPENDENCY_TO, Intention.class, msgs);
				return basicSetDependencyFrom((Intention)otherEnd, msgs);
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				if (dependencyTo != null)
					msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, GoalmodelPackage.INTENTION__DEPENDENCY_FROM, Intention.class, msgs);
				return basicSetDependencyTo((Intention)otherEnd, msgs);
			case GoalmodelPackage.DEPENDENCY__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return basicSetDependencyFrom(null, msgs);
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				return basicSetDependencyTo(null, msgs);
			case GoalmodelPackage.DEPENDENCY__MODEL:
				return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GoalmodelPackage.DEPENDENCY__MODEL:
				return eInternalContainer().eInverseRemove(this, GoalmodelPackage.MODEL__DEPENDENCIES, Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			case GoalmodelPackage.DEPENDENCY__MODEL:
				return getModel();
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((Intention)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((Intention)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				setTrust(((Float)newValue).floatValue());
				return;
			case GoalmodelPackage.DEPENDENCY__LABEL:
				setLabel((String)newValue);
				return;
			case GoalmodelPackage.DEPENDENCY__MODEL:
				setModel((Model)newValue);
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((Intention)null);
				return;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((Intention)null);
				return;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				setTrust(TRUST_EDEFAULT);
				return;
			case GoalmodelPackage.DEPENDENCY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GoalmodelPackage.DEPENDENCY__MODEL:
				setModel((Model)null);
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
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return dependencyFrom != null;
			case GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO:
				return dependencyTo != null;
			case GoalmodelPackage.DEPENDENCY__TRUST:
				return trust != TRUST_EDEFAULT;
			case GoalmodelPackage.DEPENDENCY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GoalmodelPackage.DEPENDENCY__MODEL:
				return getModel() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (trust: ");
		result.append(trust);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
