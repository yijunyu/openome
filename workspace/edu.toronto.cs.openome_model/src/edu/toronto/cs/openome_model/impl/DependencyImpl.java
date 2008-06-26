/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.Actor;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.openome_modelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getTrust <em>Trust</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getModel <em>Model</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getActorDependencyFrom <em>Actor Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.DependencyImpl#getActorDependencyTo <em>Actor Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends LinkImpl implements Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected Intention dependencyFrom;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected Intention dependencyTo;

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
	 * The cached value of the '{@link #getActorDependencyFrom() <em>Actor Dependency From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actorDependencyFrom;

	/**
	 * The cached value of the '{@link #getActorDependencyTo() <em>Actor Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected Actor actorDependencyTo;

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
		return openome_modelPackage.Literals.DEPENDENCY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM, oldDependencyFrom, dependencyFrom));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM, oldDependencyFrom, newDependencyFrom);
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
				msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, openome_modelPackage.INTENTION__DEPENDENCY_TO, Intention.class, msgs);
			if (newDependencyFrom != null)
				msgs = ((InternalEObject)newDependencyFrom).eInverseAdd(this, openome_modelPackage.INTENTION__DEPENDENCY_TO, Intention.class, msgs);
			msgs = basicSetDependencyFrom(newDependencyFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM, newDependencyFrom, newDependencyFrom));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, openome_modelPackage.DEPENDENCY__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__DEPENDENCY_TO, oldDependencyTo, newDependencyTo);
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
				msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, openome_modelPackage.INTENTION__DEPENDENCY_FROM, Intention.class, msgs);
			if (newDependencyTo != null)
				msgs = ((InternalEObject)newDependencyTo).eInverseAdd(this, openome_modelPackage.INTENTION__DEPENDENCY_FROM, Intention.class, msgs);
			msgs = basicSetDependencyTo(newDependencyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__DEPENDENCY_TO, newDependencyTo, newDependencyTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__TRUST, oldTrust, trust));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID != openome_modelPackage.DEPENDENCY__MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, openome_modelPackage.DEPENDENCY__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID != openome_modelPackage.DEPENDENCY__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, openome_modelPackage.MODEL__DEPENDENCIES, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActorDependencyFrom() {
		if (actorDependencyFrom == null) {
			actorDependencyFrom = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM, openome_modelPackage.ACTOR__DEPENDENCY_TO);
		}
		return actorDependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActorDependencyTo() {
		if (actorDependencyTo != null && actorDependencyTo.eIsProxy()) {
			InternalEObject oldActorDependencyTo = (InternalEObject)actorDependencyTo;
			actorDependencyTo = (Actor)eResolveProxy(oldActorDependencyTo);
			if (actorDependencyTo != oldActorDependencyTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO, oldActorDependencyTo, actorDependencyTo));
			}
		}
		return actorDependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActorDependencyTo() {
		return actorDependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorDependencyTo(Actor newActorDependencyTo, NotificationChain msgs) {
		Actor oldActorDependencyTo = actorDependencyTo;
		actorDependencyTo = newActorDependencyTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO, oldActorDependencyTo, newActorDependencyTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorDependencyTo(Actor newActorDependencyTo) {
		if (newActorDependencyTo != actorDependencyTo) {
			NotificationChain msgs = null;
			if (actorDependencyTo != null)
				msgs = ((InternalEObject)actorDependencyTo).eInverseRemove(this, openome_modelPackage.ACTOR__DEPENDENCY_FROM, Actor.class, msgs);
			if (newActorDependencyTo != null)
				msgs = ((InternalEObject)newActorDependencyTo).eInverseAdd(this, openome_modelPackage.ACTOR__DEPENDENCY_FROM, Actor.class, msgs);
			msgs = basicSetActorDependencyTo(newActorDependencyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO, newActorDependencyTo, newActorDependencyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM:
				if (dependencyFrom != null)
					msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, openome_modelPackage.INTENTION__DEPENDENCY_TO, Intention.class, msgs);
				return basicSetDependencyFrom((Intention)otherEnd, msgs);
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_TO:
				if (dependencyTo != null)
					msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, openome_modelPackage.INTENTION__DEPENDENCY_FROM, Intention.class, msgs);
				return basicSetDependencyTo((Intention)otherEnd, msgs);
			case openome_modelPackage.DEPENDENCY__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActorDependencyFrom()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO:
				if (actorDependencyTo != null)
					msgs = ((InternalEObject)actorDependencyTo).eInverseRemove(this, openome_modelPackage.ACTOR__DEPENDENCY_FROM, Actor.class, msgs);
				return basicSetActorDependencyTo((Actor)otherEnd, msgs);
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
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return basicSetDependencyFrom(null, msgs);
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_TO:
				return basicSetDependencyTo(null, msgs);
			case openome_modelPackage.DEPENDENCY__MODEL:
				return basicSetModel(null, msgs);
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM:
				return ((InternalEList<?>)getActorDependencyFrom()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO:
				return basicSetActorDependencyTo(null, msgs);
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
			case openome_modelPackage.DEPENDENCY__MODEL:
				return eInternalContainer().eInverseRemove(this, openome_modelPackage.MODEL__DEPENDENCIES, Model.class, msgs);
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
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM:
				if (resolve) return getDependencyFrom();
				return basicGetDependencyFrom();
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_TO:
				if (resolve) return getDependencyTo();
				return basicGetDependencyTo();
			case openome_modelPackage.DEPENDENCY__TRUST:
				return new Float(getTrust());
			case openome_modelPackage.DEPENDENCY__LABEL:
				return getLabel();
			case openome_modelPackage.DEPENDENCY__MODEL:
				return getModel();
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM:
				return getActorDependencyFrom();
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO:
				if (resolve) return getActorDependencyTo();
				return basicGetActorDependencyTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((Intention)newValue);
				return;
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((Intention)newValue);
				return;
			case openome_modelPackage.DEPENDENCY__TRUST:
				setTrust(((Float)newValue).floatValue());
				return;
			case openome_modelPackage.DEPENDENCY__LABEL:
				setLabel((String)newValue);
				return;
			case openome_modelPackage.DEPENDENCY__MODEL:
				setModel((Model)newValue);
				return;
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM:
				getActorDependencyFrom().clear();
				getActorDependencyFrom().addAll((Collection<? extends Actor>)newValue);
				return;
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO:
				setActorDependencyTo((Actor)newValue);
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
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM:
				setDependencyFrom((Intention)null);
				return;
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_TO:
				setDependencyTo((Intention)null);
				return;
			case openome_modelPackage.DEPENDENCY__TRUST:
				setTrust(TRUST_EDEFAULT);
				return;
			case openome_modelPackage.DEPENDENCY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case openome_modelPackage.DEPENDENCY__MODEL:
				setModel((Model)null);
				return;
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM:
				getActorDependencyFrom().clear();
				return;
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO:
				setActorDependencyTo((Actor)null);
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
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM:
				return dependencyFrom != null;
			case openome_modelPackage.DEPENDENCY__DEPENDENCY_TO:
				return dependencyTo != null;
			case openome_modelPackage.DEPENDENCY__TRUST:
				return trust != TRUST_EDEFAULT;
			case openome_modelPackage.DEPENDENCY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case openome_modelPackage.DEPENDENCY__MODEL:
				return getModel() != null;
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM:
				return actorDependencyFrom != null && !actorDependencyFrom.isEmpty();
			case openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO:
				return actorDependencyTo != null;
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
