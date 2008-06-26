/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.Actor;
import edu.toronto.cs.openome_model.Belief;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.openome_modelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ActorImpl#getIs_a <em>Is a</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ActorImpl#getIs_part_of <em>Is part of</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ActorImpl#getBelieves <em>Believes</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ActorImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ActorImpl#getDependencyTo <em>Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends ContainerImpl implements Actor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The cached value of the '{@link #getIs_a() <em>Is a</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_a()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> is_a;
	/**
	 * The cached value of the '{@link #getIs_part_of() <em>Is part of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_part_of()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> is_part_of;
	/**
	 * The cached value of the '{@link #getBelieves() <em>Believes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelieves()
	 * @generated
	 * @ordered
	 */
	protected EList<Belief> believes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openome_modelPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getIs_a() {
		if (is_a == null) {
			is_a = new EObjectResolvingEList<Actor>(Actor.class, this, openome_modelPackage.ACTOR__IS_A);
		}
		return is_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getIs_part_of() {
		if (is_part_of == null) {
			is_part_of = new EObjectResolvingEList<Actor>(Actor.class, this, openome_modelPackage.ACTOR__IS_PART_OF);
		}
		return is_part_of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Belief> getBelieves() {
		if (believes == null) {
			believes = new EObjectResolvingEList<Belief>(Belief.class, this, openome_modelPackage.ACTOR__BELIEVES);
		}
		return believes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencyFrom() {
		if (dependencyFrom == null) {
			dependencyFrom = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, openome_modelPackage.ACTOR__DEPENDENCY_FROM, openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_TO);
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
			dependencyTo = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, openome_modelPackage.ACTOR__DEPENDENCY_TO, openome_modelPackage.DEPENDENCY__ACTOR_DEPENDENCY_FROM);
		}
		return dependencyTo;
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
			case openome_modelPackage.ACTOR__DEPENDENCY_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencyFrom()).basicAdd(otherEnd, msgs);
			case openome_modelPackage.ACTOR__DEPENDENCY_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencyTo()).basicAdd(otherEnd, msgs);
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
			case openome_modelPackage.ACTOR__DEPENDENCY_FROM:
				return ((InternalEList<?>)getDependencyFrom()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.ACTOR__DEPENDENCY_TO:
				return ((InternalEList<?>)getDependencyTo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case openome_modelPackage.ACTOR__IS_A:
				return getIs_a();
			case openome_modelPackage.ACTOR__IS_PART_OF:
				return getIs_part_of();
			case openome_modelPackage.ACTOR__BELIEVES:
				return getBelieves();
			case openome_modelPackage.ACTOR__DEPENDENCY_FROM:
				return getDependencyFrom();
			case openome_modelPackage.ACTOR__DEPENDENCY_TO:
				return getDependencyTo();
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
			case openome_modelPackage.ACTOR__IS_A:
				getIs_a().clear();
				getIs_a().addAll((Collection<? extends Actor>)newValue);
				return;
			case openome_modelPackage.ACTOR__IS_PART_OF:
				getIs_part_of().clear();
				getIs_part_of().addAll((Collection<? extends Actor>)newValue);
				return;
			case openome_modelPackage.ACTOR__BELIEVES:
				getBelieves().clear();
				getBelieves().addAll((Collection<? extends Belief>)newValue);
				return;
			case openome_modelPackage.ACTOR__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				getDependencyFrom().addAll((Collection<? extends Dependency>)newValue);
				return;
			case openome_modelPackage.ACTOR__DEPENDENCY_TO:
				getDependencyTo().clear();
				getDependencyTo().addAll((Collection<? extends Dependency>)newValue);
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
			case openome_modelPackage.ACTOR__IS_A:
				getIs_a().clear();
				return;
			case openome_modelPackage.ACTOR__IS_PART_OF:
				getIs_part_of().clear();
				return;
			case openome_modelPackage.ACTOR__BELIEVES:
				getBelieves().clear();
				return;
			case openome_modelPackage.ACTOR__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				return;
			case openome_modelPackage.ACTOR__DEPENDENCY_TO:
				getDependencyTo().clear();
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
			case openome_modelPackage.ACTOR__IS_A:
				return is_a != null && !is_a.isEmpty();
			case openome_modelPackage.ACTOR__IS_PART_OF:
				return is_part_of != null && !is_part_of.isEmpty();
			case openome_modelPackage.ACTOR__BELIEVES:
				return believes != null && !believes.isEmpty();
			case openome_modelPackage.ACTOR__DEPENDENCY_FROM:
				return dependencyFrom != null && !dependencyFrom.isEmpty();
			case openome_modelPackage.ACTOR__DEPENDENCY_TO:
				return dependencyTo != null && !dependencyTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
