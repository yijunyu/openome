/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.Property;
import edu.toronto.cs.openome_model.Topic;
import edu.toronto.cs.openome_model.TruthLabel;
import edu.toronto.cs.openome_model.openome_modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getExclusive <em>Exclusive</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getSequential <em>Sequential</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getParentDecompositions <em>Parent Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentionImpl extends EObjectImpl implements Intention {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

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
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected TruthLabel label;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> rule;

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
	protected EList<Topic> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> output;

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
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencyFrom;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencyTo;

	/**
	 * The cached value of the '{@link #getDecompositions() <em>Decompositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> decompositions;

	/**
	 * The cached value of the '{@link #getParentDecompositions() <em>Parent Decompositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDecompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> parentDecompositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openome_modelPackage.Literals.INTENTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(TruthLabel newLabel, NotificationChain msgs) {
		TruthLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(TruthLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - openome_modelPackage.INTENTION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - openome_modelPackage.INTENTION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contribution> getRule() {
		if (rule == null) {
			rule = new EObjectWithInverseResolvingEList<Contribution>(Contribution.class, this, openome_modelPackage.INTENTION__RULE, openome_modelPackage.CONTRIBUTION__SOURCE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__SYSTEM, oldSystem, system));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__BOUNDARY, oldBoundary, boundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Topic>(Topic.class, this, openome_modelPackage.INTENTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Topic>(Topic.class, this, openome_modelPackage.INTENTION__OUTPUT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__EXCLUSIVE, oldExclusive, exclusive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__SEQUENTIAL, oldSequential, sequential));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__PARALLEL, oldParallel, parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, openome_modelPackage.INTENTION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencyFrom() {
		if (dependencyFrom == null) {
			dependencyFrom = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, openome_modelPackage.INTENTION__DEPENDENCY_FROM, openome_modelPackage.DEPENDENCY__DEPENDENCY_TO);
		}
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencyTo() {
		if (dependencyTo == null) {
			dependencyTo = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, openome_modelPackage.INTENTION__DEPENDENCY_TO, openome_modelPackage.DEPENDENCY__DEPENDENCY_FROM);
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decomposition> getDecompositions() {
		if (decompositions == null) {
			decompositions = new EObjectWithInverseResolvingEList<Decomposition>(Decomposition.class, this, openome_modelPackage.INTENTION__DECOMPOSITIONS, openome_modelPackage.DECOMPOSITION__SOURCE);
		}
		return decompositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decomposition> getParentDecompositions() {
		if (parentDecompositions == null) {
			parentDecompositions = new EObjectWithInverseResolvingEList<Decomposition>(Decomposition.class, this, openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS, openome_modelPackage.DECOMPOSITION__TARGET);
		}
		return parentDecompositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getContainer() {
		if (eContainerFeatureID != openome_modelPackage.INTENTION__CONTAINER) return null;
		return (Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, openome_modelPackage.INTENTION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID != openome_modelPackage.INTENTION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, openome_modelPackage.CONTAINER__INTENTIONS, Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID != openome_modelPackage.INTENTION__MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, openome_modelPackage.INTENTION__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID != openome_modelPackage.INTENTION__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, openome_modelPackage.MODEL__INTENTIONS, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__MODEL, newModel, newModel));
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
			case openome_modelPackage.INTENTION__RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRule()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.INTENTION__DEPENDENCY_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencyFrom()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.INTENTION__DEPENDENCY_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencyTo()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecompositions()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentDecompositions()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.INTENTION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Container)otherEnd, msgs);
			case openome_modelPackage.INTENTION__MODEL:
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
			case openome_modelPackage.INTENTION__LABEL:
				return basicSetLabel(null, msgs);
			case openome_modelPackage.INTENTION__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__DEPENDENCY_FROM:
				return ((InternalEList<?>)getDependencyFrom()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__DEPENDENCY_TO:
				return ((InternalEList<?>)getDependencyTo()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				return ((InternalEList<?>)getDecompositions()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				return ((InternalEList<?>)getParentDecompositions()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__CONTAINER:
				return basicSetContainer(null, msgs);
			case openome_modelPackage.INTENTION__MODEL:
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
			case openome_modelPackage.INTENTION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, openome_modelPackage.CONTAINER__INTENTIONS, Container.class, msgs);
			case openome_modelPackage.INTENTION__MODEL:
				return eInternalContainer().eInverseRemove(this, openome_modelPackage.MODEL__INTENTIONS, Model.class, msgs);
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
			case openome_modelPackage.INTENTION__NAME:
				return getName();
			case openome_modelPackage.INTENTION__LABEL:
				return getLabel();
			case openome_modelPackage.INTENTION__RULE:
				return getRule();
			case openome_modelPackage.INTENTION__SYSTEM:
				return getSystem();
			case openome_modelPackage.INTENTION__BOUNDARY:
				return getBoundary();
			case openome_modelPackage.INTENTION__INPUT:
				return getInput();
			case openome_modelPackage.INTENTION__OUTPUT:
				return getOutput();
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				return getExclusive();
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				return getSequential();
			case openome_modelPackage.INTENTION__PARALLEL:
				return getParallel();
			case openome_modelPackage.INTENTION__PROPERTY:
				return getProperty();
			case openome_modelPackage.INTENTION__DEPENDENCY_FROM:
				return getDependencyFrom();
			case openome_modelPackage.INTENTION__DEPENDENCY_TO:
				return getDependencyTo();
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				return getDecompositions();
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				return getParentDecompositions();
			case openome_modelPackage.INTENTION__CONTAINER:
				return getContainer();
			case openome_modelPackage.INTENTION__MODEL:
				return getModel();
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
			case openome_modelPackage.INTENTION__NAME:
				setName((String)newValue);
				return;
			case openome_modelPackage.INTENTION__LABEL:
				setLabel((TruthLabel)newValue);
				return;
			case openome_modelPackage.INTENTION__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Contribution>)newValue);
				return;
			case openome_modelPackage.INTENTION__SYSTEM:
				setSystem((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__BOUNDARY:
				setBoundary((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Topic>)newValue);
				return;
			case openome_modelPackage.INTENTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Topic>)newValue);
				return;
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				setExclusive((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				setSequential((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__PARALLEL:
				setParallel((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case openome_modelPackage.INTENTION__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				getDependencyFrom().addAll((Collection<? extends Dependency>)newValue);
				return;
			case openome_modelPackage.INTENTION__DEPENDENCY_TO:
				getDependencyTo().clear();
				getDependencyTo().addAll((Collection<? extends Dependency>)newValue);
				return;
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				getDecompositions().clear();
				getDecompositions().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				getParentDecompositions().clear();
				getParentDecompositions().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case openome_modelPackage.INTENTION__CONTAINER:
				setContainer((Container)newValue);
				return;
			case openome_modelPackage.INTENTION__MODEL:
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
			case openome_modelPackage.INTENTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__LABEL:
				setLabel((TruthLabel)null);
				return;
			case openome_modelPackage.INTENTION__RULE:
				getRule().clear();
				return;
			case openome_modelPackage.INTENTION__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__BOUNDARY:
				setBoundary(BOUNDARY_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__INPUT:
				getInput().clear();
				return;
			case openome_modelPackage.INTENTION__OUTPUT:
				getOutput().clear();
				return;
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				setSequential(SEQUENTIAL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__PARALLEL:
				setParallel(PARALLEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__PROPERTY:
				getProperty().clear();
				return;
			case openome_modelPackage.INTENTION__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				return;
			case openome_modelPackage.INTENTION__DEPENDENCY_TO:
				getDependencyTo().clear();
				return;
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				getDecompositions().clear();
				return;
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				getParentDecompositions().clear();
				return;
			case openome_modelPackage.INTENTION__CONTAINER:
				setContainer((Container)null);
				return;
			case openome_modelPackage.INTENTION__MODEL:
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
			case openome_modelPackage.INTENTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case openome_modelPackage.INTENTION__LABEL:
				return label != null;
			case openome_modelPackage.INTENTION__RULE:
				return rule != null && !rule.isEmpty();
			case openome_modelPackage.INTENTION__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case openome_modelPackage.INTENTION__BOUNDARY:
				return BOUNDARY_EDEFAULT == null ? boundary != null : !BOUNDARY_EDEFAULT.equals(boundary);
			case openome_modelPackage.INTENTION__INPUT:
				return input != null && !input.isEmpty();
			case openome_modelPackage.INTENTION__OUTPUT:
				return output != null && !output.isEmpty();
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				return EXCLUSIVE_EDEFAULT == null ? exclusive != null : !EXCLUSIVE_EDEFAULT.equals(exclusive);
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				return SEQUENTIAL_EDEFAULT == null ? sequential != null : !SEQUENTIAL_EDEFAULT.equals(sequential);
			case openome_modelPackage.INTENTION__PARALLEL:
				return PARALLEL_EDEFAULT == null ? parallel != null : !PARALLEL_EDEFAULT.equals(parallel);
			case openome_modelPackage.INTENTION__PROPERTY:
				return property != null && !property.isEmpty();
			case openome_modelPackage.INTENTION__DEPENDENCY_FROM:
				return dependencyFrom != null && !dependencyFrom.isEmpty();
			case openome_modelPackage.INTENTION__DEPENDENCY_TO:
				return dependencyTo != null && !dependencyTo.isEmpty();
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				return decompositions != null && !decompositions.isEmpty();
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				return parentDecompositions != null && !parentDecompositions.isEmpty();
			case openome_modelPackage.INTENTION__CONTAINER:
				return getContainer() != null;
			case openome_modelPackage.INTENTION__MODEL:
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
		result.append(" (name: ");
		result.append(name);
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

} //IntentionImpl
