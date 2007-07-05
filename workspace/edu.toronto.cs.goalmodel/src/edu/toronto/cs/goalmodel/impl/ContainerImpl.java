/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.Actor;
import edu.toronto.cs.goalmodel.Container;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.Model;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.ContainerImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.ContainerImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.ContainerImpl#getIntentions <em>Intentions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.ContainerImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends EObjectImpl implements Container {
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
	 * The cached value of the '{@link #getIntentions() <em>Intentions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentions()
	 * @generated
	 * @ordered
	 */
	protected EList intentions = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GoalmodelPackage.Literals.CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getSuper() {
		if (eContainerFeatureID != GoalmodelPackage.CONTAINER__SUPER) return null;
		return (Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuper(Container newSuper, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuper, GoalmodelPackage.CONTAINER__SUPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(Container newSuper) {
		if (newSuper != eInternalContainer() || (eContainerFeatureID != GoalmodelPackage.CONTAINER__SUPER && newSuper != null)) {
			if (EcoreUtil.isAncestor(this, newSuper))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuper != null)
				msgs = ((InternalEObject)newSuper).eInverseAdd(this, GoalmodelPackage.CONTAINER__SUB, Container.class, msgs);
			msgs = basicSetSuper(newSuper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.CONTAINER__SUPER, newSuper, newSuper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSub() {
		if (sub == null) {
			sub = new EObjectContainmentWithInverseEList(Actor.class, this, GoalmodelPackage.CONTAINER__SUB, GoalmodelPackage.CONTAINER__SUPER);
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIntentions() {
		if (intentions == null) {
			intentions = new EObjectContainmentWithInverseEList(Intention.class, this, GoalmodelPackage.CONTAINER__INTENTIONS, GoalmodelPackage.INTENTION__CONTAINER);
		}
		return intentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID != GoalmodelPackage.CONTAINER__MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, GoalmodelPackage.CONTAINER__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID != GoalmodelPackage.CONTAINER__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, GoalmodelPackage.MODEL__CONTAINERS, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.CONTAINER__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.CONTAINER__SUPER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuper((Container)otherEnd, msgs);
			case GoalmodelPackage.CONTAINER__SUB:
				return ((InternalEList)getSub()).basicAdd(otherEnd, msgs);
			case GoalmodelPackage.CONTAINER__INTENTIONS:
				return ((InternalEList)getIntentions()).basicAdd(otherEnd, msgs);
			case GoalmodelPackage.CONTAINER__MODEL:
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.CONTAINER__SUPER:
				return basicSetSuper(null, msgs);
			case GoalmodelPackage.CONTAINER__SUB:
				return ((InternalEList)getSub()).basicRemove(otherEnd, msgs);
			case GoalmodelPackage.CONTAINER__INTENTIONS:
				return ((InternalEList)getIntentions()).basicRemove(otherEnd, msgs);
			case GoalmodelPackage.CONTAINER__MODEL:
				return basicSetModel(null, msgs);
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
			case GoalmodelPackage.CONTAINER__SUPER:
				return eInternalContainer().eInverseRemove(this, GoalmodelPackage.CONTAINER__SUB, Container.class, msgs);
			case GoalmodelPackage.CONTAINER__MODEL:
				return eInternalContainer().eInverseRemove(this, GoalmodelPackage.MODEL__CONTAINERS, Model.class, msgs);
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
			case GoalmodelPackage.CONTAINER__NAME:
				return getName();
			case GoalmodelPackage.CONTAINER__SUPER:
				return getSuper();
			case GoalmodelPackage.CONTAINER__SUB:
				return getSub();
			case GoalmodelPackage.CONTAINER__INTENTIONS:
				return getIntentions();
			case GoalmodelPackage.CONTAINER__MODEL:
				return getModel();
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
			case GoalmodelPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case GoalmodelPackage.CONTAINER__SUPER:
				setSuper((Container)newValue);
				return;
			case GoalmodelPackage.CONTAINER__SUB:
				getSub().clear();
				getSub().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.CONTAINER__INTENTIONS:
				getIntentions().clear();
				getIntentions().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.CONTAINER__MODEL:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GoalmodelPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalmodelPackage.CONTAINER__SUPER:
				setSuper((Container)null);
				return;
			case GoalmodelPackage.CONTAINER__SUB:
				getSub().clear();
				return;
			case GoalmodelPackage.CONTAINER__INTENTIONS:
				getIntentions().clear();
				return;
			case GoalmodelPackage.CONTAINER__MODEL:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GoalmodelPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalmodelPackage.CONTAINER__SUPER:
				return getSuper() != null;
			case GoalmodelPackage.CONTAINER__SUB:
				return sub != null && !sub.isEmpty();
			case GoalmodelPackage.CONTAINER__INTENTIONS:
				return intentions != null && !intentions.isEmpty();
			case GoalmodelPackage.CONTAINER__MODEL:
				return getModel() != null;
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

} //ContainerImpl