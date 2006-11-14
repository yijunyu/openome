/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.Contribution;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.Goal;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.LabelType;
import edu.toronto.cs.goalmodel.Property;
import edu.toronto.cs.goalmodel.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.GoalImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends EObjectImpl implements Goal {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final LabelType LABEL_EDEFAULT = LabelType.SATISFIED_LITERAL;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DecompositionType TYPE_EDEFAULT = DecompositionType.OR_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DecompositionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList goal = null;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList topics = null;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList rule = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList property = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GoalmodelPackage.Literals.GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(LabelType newLabel) {
		LabelType oldLabel = label;
		label = newLabel == null ? LABEL_EDEFAULT : newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DecompositionType newType) {
		DecompositionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getParent() {
		if (eContainerFeatureID != GoalmodelPackage.GOAL__PARENT) return null;
		return (Goal)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Goal newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GoalmodelPackage.GOAL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Goal newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID != GoalmodelPackage.GOAL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GoalmodelPackage.GOAL__GOAL, Goal.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentWithInverseEList(Goal.class, this, GoalmodelPackage.GOAL__GOAL, GoalmodelPackage.GOAL__PARENT);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList(Topic.class, this, GoalmodelPackage.GOAL__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList(Contribution.class, this, GoalmodelPackage.GOAL__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList(Property.class, this, GoalmodelPackage.GOAL__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalmodelPackage.GOAL__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Goal)otherEnd, msgs);
			case GoalmodelPackage.GOAL__GOAL:
				return ((InternalEList)getGoal()).basicAdd(otherEnd, msgs);
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
			case GoalmodelPackage.GOAL__PARENT:
				return basicSetParent(null, msgs);
			case GoalmodelPackage.GOAL__GOAL:
				return ((InternalEList)getGoal()).basicRemove(otherEnd, msgs);
			case GoalmodelPackage.GOAL__TOPICS:
				return ((InternalEList)getTopics()).basicRemove(otherEnd, msgs);
			case GoalmodelPackage.GOAL__RULE:
				return ((InternalEList)getRule()).basicRemove(otherEnd, msgs);
			case GoalmodelPackage.GOAL__PROPERTY:
				return ((InternalEList)getProperty()).basicRemove(otherEnd, msgs);
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
			case GoalmodelPackage.GOAL__PARENT:
				return eInternalContainer().eInverseRemove(this, GoalmodelPackage.GOAL__GOAL, Goal.class, msgs);
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
			case GoalmodelPackage.GOAL__NAME:
				return getName();
			case GoalmodelPackage.GOAL__LABEL:
				return getLabel();
			case GoalmodelPackage.GOAL__TYPE:
				return getType();
			case GoalmodelPackage.GOAL__PARENT:
				return getParent();
			case GoalmodelPackage.GOAL__GOAL:
				return getGoal();
			case GoalmodelPackage.GOAL__TOPICS:
				return getTopics();
			case GoalmodelPackage.GOAL__RULE:
				return getRule();
			case GoalmodelPackage.GOAL__PROPERTY:
				return getProperty();
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
			case GoalmodelPackage.GOAL__NAME:
				setName((String)newValue);
				return;
			case GoalmodelPackage.GOAL__LABEL:
				setLabel((LabelType)newValue);
				return;
			case GoalmodelPackage.GOAL__TYPE:
				setType((DecompositionType)newValue);
				return;
			case GoalmodelPackage.GOAL__PARENT:
				setParent((Goal)newValue);
				return;
			case GoalmodelPackage.GOAL__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__RULE:
				getRule().clear();
				getRule().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection)newValue);
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
			case GoalmodelPackage.GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__PARENT:
				setParent((Goal)null);
				return;
			case GoalmodelPackage.GOAL__GOAL:
				getGoal().clear();
				return;
			case GoalmodelPackage.GOAL__TOPICS:
				getTopics().clear();
				return;
			case GoalmodelPackage.GOAL__RULE:
				getRule().clear();
				return;
			case GoalmodelPackage.GOAL__PROPERTY:
				getProperty().clear();
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
			case GoalmodelPackage.GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalmodelPackage.GOAL__LABEL:
				return label != LABEL_EDEFAULT;
			case GoalmodelPackage.GOAL__TYPE:
				return type != TYPE_EDEFAULT;
			case GoalmodelPackage.GOAL__PARENT:
				return getParent() != null;
			case GoalmodelPackage.GOAL__GOAL:
				return goal != null && !goal.isEmpty();
			case GoalmodelPackage.GOAL__TOPICS:
				return topics != null && !topics.isEmpty();
			case GoalmodelPackage.GOAL__RULE:
				return rule != null && !rule.isEmpty();
			case GoalmodelPackage.GOAL__PROPERTY:
				return property != null && !property.isEmpty();
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
		result.append(", label: ");
		result.append(label);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
