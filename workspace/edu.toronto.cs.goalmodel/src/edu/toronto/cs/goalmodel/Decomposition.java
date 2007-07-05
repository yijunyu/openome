/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.Decomposition#getSource <em>Source</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Decomposition#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Decomposition#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Intention#getDecompositions <em>Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Intention)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getDecomposition_Source()
	 * @see edu.toronto.cs.goalmodel.Intention#getDecompositions
	 * @model opposite="decompositions"
	 * @generated
	 */
	Intention getSource();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Decomposition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Intention value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Intention#getParentDecompositions <em>Parent Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Intention)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getDecomposition_Target()
	 * @see edu.toronto.cs.goalmodel.Intention#getParentDecompositions
	 * @model opposite="parentDecompositions"
	 * @generated
	 */
	Intention getTarget();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Decomposition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Intention value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Model#getDecompositions <em>Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getDecomposition_Model()
	 * @see edu.toronto.cs.goalmodel.Model#getDecompositions
	 * @model opposite="decompositions"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Decomposition#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Decomposition