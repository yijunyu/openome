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
 * A representation of the model object '<em><b>goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getGoal <em>Goal</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getRule <em>Rule</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getSystem <em>System</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getInput <em>Input</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getExclusive <em>Exclusive</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getSequential <em>Sequential</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getParallel <em>Parallel</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getActor <em>Actor</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.goal#getDependencyTo <em>Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal()
 * @model
 * @generated
 */
public interface goal extends EObject {
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.toronto.cs.goalmodel.DecompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.DecompositionType
	 * @see #setType(DecompositionType)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Type()
	 * @model
	 * @generated
	 */
	DecompositionType getType();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.DecompositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecompositionType value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.goal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(goal)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Parent()
	 * @see edu.toronto.cs.goalmodel.goal#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	goal getParent();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(goal value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.goal}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.goal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Goal()
	 * @see edu.toronto.cs.goalmodel.goal#getParent
	 * @model type="edu.toronto.cs.goalmodel.goal" opposite="parent" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getGoal();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.toronto.cs.goalmodel.LabelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.LabelType
	 * @see #setLabel(LabelType)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Label()
	 * @model
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.LabelType
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.contribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Rule()
	 * @model type="edu.toronto.cs.goalmodel.contribution" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getRule();

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(Boolean)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_System()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSystem();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Boolean value);

	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary</em>' attribute.
	 * @see #setBoundary(Boolean)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Boundary()
	 * @model default="false"
	 * @generated
	 */
	Boolean getBoundary();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' attribute.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Input()
	 * @model type="edu.toronto.cs.goalmodel.topic" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Output()
	 * @model type="edu.toronto.cs.goalmodel.topic" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getOutput();

	/**
	 * Returns the value of the '<em><b>Exclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive</em>' attribute.
	 * @see #setExclusive(Boolean)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Exclusive()
	 * @model default="true"
	 * @generated
	 */
	Boolean getExclusive();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getExclusive <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive</em>' attribute.
	 * @see #getExclusive()
	 * @generated
	 */
	void setExclusive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sequential</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential</em>' attribute.
	 * @see #setSequential(Boolean)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Sequential()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSequential();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getSequential <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential</em>' attribute.
	 * @see #getSequential()
	 * @generated
	 */
	void setSequential(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see #setParallel(Boolean)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Parallel()
	 * @model default="false"
	 * @generated
	 */
	Boolean getParallel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Property()
	 * @model type="edu.toronto.cs.goalmodel.property" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getProperty();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.actor#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' container reference.
	 * @see #setActor(actor)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_Actor()
	 * @see edu.toronto.cs.goalmodel.actor#getGoals
	 * @model opposite="goals"
	 * @generated
	 */
	actor getActor();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.goal#getActor <em>Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' container reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(actor value);

	/**
	 * Returns the value of the '<em><b>Dependency From</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.dependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency From</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_DependencyFrom()
	 * @see edu.toronto.cs.goalmodel.dependency#getDependencyTo
	 * @model type="edu.toronto.cs.goalmodel.dependency" opposite="dependencyTo"
	 * @generated
	 */
	EList getDependencyFrom();

	/**
	 * Returns the value of the '<em><b>Dependency To</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.dependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency To</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getgoal_DependencyTo()
	 * @see edu.toronto.cs.goalmodel.dependency#getDependencyFrom
	 * @model type="edu.toronto.cs.goalmodel.dependency" opposite="dependencyFrom"
	 * @generated
	 */
	EList getDependencyTo();

} // goal
