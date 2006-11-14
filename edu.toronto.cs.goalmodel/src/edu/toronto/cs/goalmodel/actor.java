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
 * A representation of the model object '<em><b>actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.actor#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.actor#getSuper <em>Super</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.actor#getSub <em>Sub</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.actor#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.actor#getGoals <em>Goals</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getactor()
 * @model
 * @generated
 */
public interface actor extends EObject {
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getactor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.actor#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' container reference.
	 * @see #setSuper(actor)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getactor_Super()
	 * @see edu.toronto.cs.goalmodel.actor#getSub
	 * @model opposite="sub"
	 * @generated
	 */
	actor getSuper();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.actor#getSuper <em>Super</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' container reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(actor value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.actor}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.actor#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getactor_Sub()
	 * @see edu.toronto.cs.goalmodel.actor#getSuper
	 * @model type="edu.toronto.cs.goalmodel.actor" opposite="super" containment="true"
	 * @generated
	 */
	EList getSub();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.toronto.cs.goalmodel.ActorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.ActorType
	 * @see #setType(ActorType)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getactor_Type()
	 * @model
	 * @generated
	 */
	ActorType getType();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.actor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.ActorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActorType value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.goal}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.goal#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getactor_Goals()
	 * @see edu.toronto.cs.goalmodel.goal#getActor
	 * @model type="edu.toronto.cs.goalmodel.goal" opposite="actor" containment="true"
	 * @generated
	 */
	EList getGoals();

} // actor