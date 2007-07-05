/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.Container#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Container#getSuper <em>Super</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Container#getSub <em>Sub</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Container#getIntentions <em>Intentions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Container#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Container#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' container reference.
	 * @see #setSuper(Container)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContainer_Super()
	 * @see edu.toronto.cs.goalmodel.Container#getSub
	 * @model opposite="sub"
	 * @generated
	 */
	Container getSuper();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Container#getSuper <em>Super</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' container reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(Container value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Actor}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Container#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContainer_Sub()
	 * @see edu.toronto.cs.goalmodel.Container#getSuper
	 * @model type="edu.toronto.cs.goalmodel.Actor" opposite="super" containment="true"
	 * @generated
	 */
	EList getSub();

	/**
	 * Returns the value of the '<em><b>Intentions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Intention}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Intention#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intentions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intentions</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContainer_Intentions()
	 * @see edu.toronto.cs.goalmodel.Intention#getContainer
	 * @model type="edu.toronto.cs.goalmodel.Intention" opposite="container" containment="true"
	 * @generated
	 */
	EList getIntentions();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Model#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getContainer_Model()
	 * @see edu.toronto.cs.goalmodel.Model#getContainers
	 * @model opposite="containers"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Container#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Container