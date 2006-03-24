/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.LabelType;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.dependency;
import edu.toronto.cs.goalmodel.goal;
import edu.toronto.cs.goalmodel.property;
import edu.toronto.cs.goalmodel.topic;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getSystem <em>System</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getInput <em>Input</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getExclusive <em>Exclusive</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getSequential <em>Sequential</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.impl.goalImpl#getDependencyTo <em>Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class goalImpl extends EObjectImpl implements goal {
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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList rule = null;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYSTEM_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Boolean system = SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOUNDARY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected Boolean boundary = BOUNDARY_EDEFAULT;

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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList output = null;

	/**
	 * The default value of the '{@link #getExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusive()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusive = EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequential()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SEQUENTIAL_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequential()
	 * @generated
	 * @ordered
	 */
	protected Boolean sequential = SEQUENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARALLEL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected Boolean parallel = PARALLEL_EDEFAULT;

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
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected EList dependencyFrom = null;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected EList dependencyTo = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected goalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GoalmodelPackage.eINSTANCE.getgoal();
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
	public goal getParent() {
		if (eContainerFeatureID != GoalmodelPackage.GOAL__PARENT) return null;
		return (goal)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(goal newParent) {
		if (newParent != eContainer || (eContainerFeatureID != GoalmodelPackage.GOAL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GoalmodelPackage.GOAL__GOAL, goal.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newParent, GoalmodelPackage.GOAL__PARENT, msgs);
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
			goal = new EObjectContainmentWithInverseEList(goal.class, this, GoalmodelPackage.GOAL__GOAL, GoalmodelPackage.GOAL__PARENT);
		}
		return goal;
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
	public EList getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList(contribution.class, this, GoalmodelPackage.GOAL__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Boolean newSystem) {
		Boolean oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundary(Boolean newBoundary) {
		Boolean oldBoundary = boundary;
		boundary = newBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__BOUNDARY, oldBoundary, boundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInput() {
		if (input == null) {
			input = new EObjectContainmentEList(topic.class, this, GoalmodelPackage.GOAL__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList(topic.class, this, GoalmodelPackage.GOAL__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclusive() {
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusive(Boolean newExclusive) {
		Boolean oldExclusive = exclusive;
		exclusive = newExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__EXCLUSIVE, oldExclusive, exclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSequential() {
		return sequential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequential(Boolean newSequential) {
		Boolean oldSequential = sequential;
		sequential = newSequential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__SEQUENTIAL, oldSequential, sequential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(Boolean newParallel) {
		Boolean oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__PARALLEL, oldParallel, parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList(property.class, this, GoalmodelPackage.GOAL__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public actor getActor() {
		if (eContainerFeatureID != GoalmodelPackage.GOAL__ACTOR) return null;
		return (actor)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(actor newActor) {
		if (newActor != eContainer || (eContainerFeatureID != GoalmodelPackage.GOAL__ACTOR && newActor != null)) {
			if (EcoreUtil.isAncestor(this, newActor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, GoalmodelPackage.ACTOR__GOALS, actor.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newActor, GoalmodelPackage.GOAL__ACTOR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalmodelPackage.GOAL__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependencyFrom() {
		if (dependencyFrom == null) {
			dependencyFrom = new EObjectWithInverseResolvingEList(dependency.class, this, GoalmodelPackage.GOAL__DEPENDENCY_FROM, GoalmodelPackage.DEPENDENCY__DEPENDENCY_TO);
		}
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependencyTo() {
		if (dependencyTo == null) {
			dependencyTo = new EObjectWithInverseResolvingEList(dependency.class, this, GoalmodelPackage.GOAL__DEPENDENCY_TO, GoalmodelPackage.DEPENDENCY__DEPENDENCY_FROM);
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GoalmodelPackage.GOAL__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GoalmodelPackage.GOAL__PARENT, msgs);
				case GoalmodelPackage.GOAL__GOAL:
					return ((InternalEList)getGoal()).basicAdd(otherEnd, msgs);
				case GoalmodelPackage.GOAL__ACTOR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GoalmodelPackage.GOAL__ACTOR, msgs);
				case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
					return ((InternalEList)getDependencyFrom()).basicAdd(otherEnd, msgs);
				case GoalmodelPackage.GOAL__DEPENDENCY_TO:
					return ((InternalEList)getDependencyTo()).basicAdd(otherEnd, msgs);
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
				case GoalmodelPackage.GOAL__PARENT:
					return eBasicSetContainer(null, GoalmodelPackage.GOAL__PARENT, msgs);
				case GoalmodelPackage.GOAL__GOAL:
					return ((InternalEList)getGoal()).basicRemove(otherEnd, msgs);
				case GoalmodelPackage.GOAL__RULE:
					return ((InternalEList)getRule()).basicRemove(otherEnd, msgs);
				case GoalmodelPackage.GOAL__INPUT:
					return ((InternalEList)getInput()).basicRemove(otherEnd, msgs);
				case GoalmodelPackage.GOAL__OUTPUT:
					return ((InternalEList)getOutput()).basicRemove(otherEnd, msgs);
				case GoalmodelPackage.GOAL__PROPERTY:
					return ((InternalEList)getProperty()).basicRemove(otherEnd, msgs);
				case GoalmodelPackage.GOAL__ACTOR:
					return eBasicSetContainer(null, GoalmodelPackage.GOAL__ACTOR, msgs);
				case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
					return ((InternalEList)getDependencyFrom()).basicRemove(otherEnd, msgs);
				case GoalmodelPackage.GOAL__DEPENDENCY_TO:
					return ((InternalEList)getDependencyTo()).basicRemove(otherEnd, msgs);
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
				case GoalmodelPackage.GOAL__PARENT:
					return eContainer.eInverseRemove(this, GoalmodelPackage.GOAL__GOAL, goal.class, msgs);
				case GoalmodelPackage.GOAL__ACTOR:
					return eContainer.eInverseRemove(this, GoalmodelPackage.ACTOR__GOALS, actor.class, msgs);
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
			case GoalmodelPackage.GOAL__NAME:
				return getName();
			case GoalmodelPackage.GOAL__TYPE:
				return getType();
			case GoalmodelPackage.GOAL__PARENT:
				return getParent();
			case GoalmodelPackage.GOAL__GOAL:
				return getGoal();
			case GoalmodelPackage.GOAL__LABEL:
				return getLabel();
			case GoalmodelPackage.GOAL__RULE:
				return getRule();
			case GoalmodelPackage.GOAL__SYSTEM:
				return getSystem();
			case GoalmodelPackage.GOAL__BOUNDARY:
				return getBoundary();
			case GoalmodelPackage.GOAL__INPUT:
				return getInput();
			case GoalmodelPackage.GOAL__OUTPUT:
				return getOutput();
			case GoalmodelPackage.GOAL__EXCLUSIVE:
				return getExclusive();
			case GoalmodelPackage.GOAL__SEQUENTIAL:
				return getSequential();
			case GoalmodelPackage.GOAL__PARALLEL:
				return getParallel();
			case GoalmodelPackage.GOAL__PROPERTY:
				return getProperty();
			case GoalmodelPackage.GOAL__ACTOR:
				return getActor();
			case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
				return getDependencyFrom();
			case GoalmodelPackage.GOAL__DEPENDENCY_TO:
				return getDependencyTo();
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
			case GoalmodelPackage.GOAL__NAME:
				setName((String)newValue);
				return;
			case GoalmodelPackage.GOAL__TYPE:
				setType((DecompositionType)newValue);
				return;
			case GoalmodelPackage.GOAL__PARENT:
				setParent((goal)newValue);
				return;
			case GoalmodelPackage.GOAL__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__LABEL:
				setLabel((LabelType)newValue);
				return;
			case GoalmodelPackage.GOAL__RULE:
				getRule().clear();
				getRule().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__SYSTEM:
				setSystem((Boolean)newValue);
				return;
			case GoalmodelPackage.GOAL__BOUNDARY:
				setBoundary((Boolean)newValue);
				return;
			case GoalmodelPackage.GOAL__INPUT:
				getInput().clear();
				getInput().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__EXCLUSIVE:
				setExclusive((Boolean)newValue);
				return;
			case GoalmodelPackage.GOAL__SEQUENTIAL:
				setSequential((Boolean)newValue);
				return;
			case GoalmodelPackage.GOAL__PARALLEL:
				setParallel((Boolean)newValue);
				return;
			case GoalmodelPackage.GOAL__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__ACTOR:
				setActor((actor)newValue);
				return;
			case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				getDependencyFrom().addAll((Collection)newValue);
				return;
			case GoalmodelPackage.GOAL__DEPENDENCY_TO:
				getDependencyTo().clear();
				getDependencyTo().addAll((Collection)newValue);
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
			case GoalmodelPackage.GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__PARENT:
				setParent((goal)null);
				return;
			case GoalmodelPackage.GOAL__GOAL:
				getGoal().clear();
				return;
			case GoalmodelPackage.GOAL__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__RULE:
				getRule().clear();
				return;
			case GoalmodelPackage.GOAL__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__BOUNDARY:
				setBoundary(BOUNDARY_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__INPUT:
				getInput().clear();
				return;
			case GoalmodelPackage.GOAL__OUTPUT:
				getOutput().clear();
				return;
			case GoalmodelPackage.GOAL__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__SEQUENTIAL:
				setSequential(SEQUENTIAL_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__PARALLEL:
				setParallel(PARALLEL_EDEFAULT);
				return;
			case GoalmodelPackage.GOAL__PROPERTY:
				getProperty().clear();
				return;
			case GoalmodelPackage.GOAL__ACTOR:
				setActor((actor)null);
				return;
			case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				return;
			case GoalmodelPackage.GOAL__DEPENDENCY_TO:
				getDependencyTo().clear();
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
			case GoalmodelPackage.GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalmodelPackage.GOAL__TYPE:
				return type != TYPE_EDEFAULT;
			case GoalmodelPackage.GOAL__PARENT:
				return getParent() != null;
			case GoalmodelPackage.GOAL__GOAL:
				return goal != null && !goal.isEmpty();
			case GoalmodelPackage.GOAL__LABEL:
				return label != LABEL_EDEFAULT;
			case GoalmodelPackage.GOAL__RULE:
				return rule != null && !rule.isEmpty();
			case GoalmodelPackage.GOAL__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case GoalmodelPackage.GOAL__BOUNDARY:
				return BOUNDARY_EDEFAULT == null ? boundary != null : !BOUNDARY_EDEFAULT.equals(boundary);
			case GoalmodelPackage.GOAL__INPUT:
				return input != null && !input.isEmpty();
			case GoalmodelPackage.GOAL__OUTPUT:
				return output != null && !output.isEmpty();
			case GoalmodelPackage.GOAL__EXCLUSIVE:
				return EXCLUSIVE_EDEFAULT == null ? exclusive != null : !EXCLUSIVE_EDEFAULT.equals(exclusive);
			case GoalmodelPackage.GOAL__SEQUENTIAL:
				return SEQUENTIAL_EDEFAULT == null ? sequential != null : !SEQUENTIAL_EDEFAULT.equals(sequential);
			case GoalmodelPackage.GOAL__PARALLEL:
				return PARALLEL_EDEFAULT == null ? parallel != null : !PARALLEL_EDEFAULT.equals(parallel);
			case GoalmodelPackage.GOAL__PROPERTY:
				return property != null && !property.isEmpty();
			case GoalmodelPackage.GOAL__ACTOR:
				return getActor() != null;
			case GoalmodelPackage.GOAL__DEPENDENCY_FROM:
				return dependencyFrom != null && !dependencyFrom.isEmpty();
			case GoalmodelPackage.GOAL__DEPENDENCY_TO:
				return dependencyTo != null && !dependencyTo.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", label: ");
		result.append(label);
		result.append(", system: ");
		result.append(system);
		result.append(", boundary: ");
		result.append(boundary);
		result.append(", exclusive: ");
		result.append(exclusive);
		result.append(", sequential: ");
		result.append(sequential);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(')');
		return result.toString();
	}

} //goalImpl
