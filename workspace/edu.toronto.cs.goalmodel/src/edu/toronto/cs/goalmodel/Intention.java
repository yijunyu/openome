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
 * A representation of the model object '<em><b>Intention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getRule <em>Rule</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getSystem <em>System</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getInput <em>Input</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getExclusive <em>Exclusive</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getSequential <em>Sequential</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getParallel <em>Parallel</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getParentDecompositions <em>Parent Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.Intention#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention()
 * @model
 * @generated
 */
public interface Intention extends EObject {
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(TruthLabel)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Label()
	 * @model containment="true"
	 * @generated
	 */
	TruthLabel getLabel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(TruthLabel value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Contribution}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Contribution#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Rule()
	 * @see edu.toronto.cs.goalmodel.Contribution#getSource
	 * @model type="edu.toronto.cs.goalmodel.Contribution" opposite="source"
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_System()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSystem();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getSystem <em>System</em>}' attribute.
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Boundary()
	 * @model default="false"
	 * @generated
	 */
	Boolean getBoundary();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' attribute.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Input()
	 * @model type="edu.toronto.cs.goalmodel.Topic" containment="true"
	 * @generated
	 */
	EList getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Output()
	 * @model type="edu.toronto.cs.goalmodel.Topic" containment="true"
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Exclusive()
	 * @model default="true"
	 * @generated
	 */
	Boolean getExclusive();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getExclusive <em>Exclusive</em>}' attribute.
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Sequential()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSequential();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getSequential <em>Sequential</em>}' attribute.
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
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Parallel()
	 * @model default="false"
	 * @generated
	 */
	Boolean getParallel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Property()
	 * @model type="edu.toronto.cs.goalmodel.Property" containment="true"
	 * @generated
	 */
	EList getProperty();

	/**
	 * Returns the value of the '<em><b>Dependency From</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Dependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency From</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_DependencyFrom()
	 * @see edu.toronto.cs.goalmodel.Dependency#getDependencyTo
	 * @model type="edu.toronto.cs.goalmodel.Dependency" opposite="dependencyTo"
	 * @generated
	 */
	EList getDependencyFrom();

	/**
	 * Returns the value of the '<em><b>Dependency To</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Dependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency To</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_DependencyTo()
	 * @see edu.toronto.cs.goalmodel.Dependency#getDependencyFrom
	 * @model type="edu.toronto.cs.goalmodel.Dependency" opposite="dependencyFrom"
	 * @generated
	 */
	EList getDependencyTo();

	/**
	 * Returns the value of the '<em><b>Decompositions</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Decomposition}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Decomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decompositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decompositions</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Decompositions()
	 * @see edu.toronto.cs.goalmodel.Decomposition#getSource
	 * @model type="edu.toronto.cs.goalmodel.Decomposition" opposite="source"
	 * @generated
	 */
	EList getDecompositions();

	/**
	 * Returns the value of the '<em><b>Parent Decompositions</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.goalmodel.Decomposition}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Decomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Decompositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Decompositions</em>' reference list.
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_ParentDecompositions()
	 * @see edu.toronto.cs.goalmodel.Decomposition#getTarget
	 * @model type="edu.toronto.cs.goalmodel.Decomposition" opposite="target"
	 * @generated
	 */
	EList getParentDecompositions();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.Container#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getIntention_Container()
	 * @see edu.toronto.cs.goalmodel.Container#getIntentions
	 * @model opposite="intentions"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Intention#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // Intention
