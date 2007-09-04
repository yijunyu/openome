/**
 * Copyright University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.Model#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Model#getIntentions <em>Intentions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Model#getContributions <em>Contributions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Model#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Model#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Model#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Intentions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Intention}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intentions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intentions</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel_Intentions()
	 * @model type="edu.toronto.cs.goalmodel.Intention" containment="true"
	 * @generated
	 */
	EList getIntentions();

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Contribution}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Contribution#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributions</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel_Contributions()
	 * @see edu.toronto.cs.goalmodel.Contribution#getModel
	 * @model type="edu.toronto.cs.goalmodel.Contribution" opposite="model" containment="true"
	 * @generated
	 */
	EList getContributions();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Dependency#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel_Dependencies()
	 * @see edu.toronto.cs.goalmodel.Dependency#getModel
	 * @model type="edu.toronto.cs.goalmodel.Dependency" opposite="model" containment="true"
	 * @generated
	 */
	EList getDependencies();

	/**
	 * Returns the value of the '<em><b>Decompositions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Decomposition}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Decomposition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decompositions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decompositions</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel_Decompositions()
	 * @see edu.toronto.cs.goalmodel.Decomposition#getModel
	 * @model type="edu.toronto.cs.goalmodel.Decomposition" opposite="model" containment="true"
	 * @generated
	 */
	EList getDecompositions();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Container}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Container#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getModel_Containers()
	 * @see edu.toronto.cs.goalmodel.Container#getModel
	 * @model type="edu.toronto.cs.goalmodel.Container" opposite="model" containment="true"
	 * @generated
	 */
	EList getContainers();

} // Model
