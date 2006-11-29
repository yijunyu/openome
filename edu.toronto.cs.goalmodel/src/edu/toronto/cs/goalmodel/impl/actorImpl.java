/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.ActorType;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.actorImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.actorImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.actorImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.actorImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.actorImpl#getGoals <em>Goals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class actorImpl extends EObjectImpl implements actor {
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
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected EList sub = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActorType TYPE_EDEFAULT = ActorType.ACTOR_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActorType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList goals = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected actorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GoalmodelPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public actor getSuper() {
		if (eContainerFeatureID != GoalmodelPackage.ACTOR__SUPER) return null;
		return (actor)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuper(actor newSuper, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuper, GoalmodelPackage.ACTOR__SUPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(actor newSuper) {
		if (newSuper != eInternalContainer() || (eContainerFeatureID != GoalmodelPackage.ACTOR__SUPER && newSuper != null)) {
			if (EcoreUtil.isAncestor(this, newSuper))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuper != null)
				msgs = ((InternalEObject)newSuper).eInverseAdd(this, GoalmodelPackage.ACTOR__SUB, actor.class, msgs);
			msgs = basicSetSuper(newSuper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.ACTOR__SUPER, newSuper, newSuper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSub() {
		if (sub == null) {
			sub = new EObjectContainmentWithInverseEList(actor.class, this, GoalmodelPackage.ACTOR__SUB, GoalmodelPackage.ACTOR__SUPER);
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActorType newType) {
		ActorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.ACTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentWithInverseEList(goal.class, this, GoalmodelPackage.ACTOR__GOALS, GoalmodelPackage.GOAL__ACTOR);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.ACTOR__SUPER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuper((actor)otherEnd, msgs);
			case GoalmodelPackage.ACTOR__SUB:
				return ((InternalEList)getSub()).basicAdd(otherEnd, msgs);
			case GoalmodelPackage.ACTOR__GOALS:
				return ((InternalEList)getGoals()).basicAdd(otherEnd, msgs);
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
			case GoalmodelPackage.ACTOR__SUPER:
				return basicSetSuper(null, msgs);
			case GoalmodelPackage.ACTOR__SUB:
				return ((InternalEList)getSub()).basicRemove(otherEnd, msgs);
			case GoalmodelPackage.ACTOR__GOALS:
				return ((InternalEList)getGoals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GoalmodelPackage.ACTOR__SUPER:
				return eInternalContainer().eInverseRemove(this, GoalmodelPackage.ACTOR__SUB, actor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GoalmodelPackage.ACTOR__NAME:
				return getName();
			case GoalmodelPackage.ACTOR__SUPER:
				return getSuper();
			case GoalmodelPackage.ACTOR__SUB:
				return getSub();
			case GoalmodelPackage.ACTOR__TYPE:
				return getType();
			case GoalmodelPackage.ACTOR__GOALS:
				return getGoals();
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
			case GoalmodelPackage.ACTOR__NAME:
				setName((String)newValue);
				return;
			case GoalmodelPackage.ACTOR__SUPER:
				setSuper((actor)newValue);
				return;
			case GoalmodelPackage.ACTOR__SUB:
				getSub().clear();
				getSub().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.ACTOR__TYPE:
				setType((ActorType)newValue);
				return;
			case GoalmodelPackage.ACTOR__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection)newValue);
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
			case GoalmodelPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalmodelPackage.ACTOR__SUPER:
				setSuper((actor)null);
				return;
			case GoalmodelPackage.ACTOR__SUB:
				getSub().clear();
				return;
			case GoalmodelPackage.ACTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GoalmodelPackage.ACTOR__GOALS:
				getGoals().clear();
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
			case GoalmodelPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalmodelPackage.ACTOR__SUPER:
				return getSuper() != null;
			case GoalmodelPackage.ACTOR__SUB:
				return sub != null && !sub.isEmpty();
			case GoalmodelPackage.ACTOR__TYPE:
				return type != TYPE_EDEFAULT;
			case GoalmodelPackage.ACTOR__GOALS:
				return goals != null && !goals.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //actorImpl