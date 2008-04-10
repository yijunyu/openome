/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model;

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
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getRule <em>Rule</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getSystem <em>System</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getInput <em>Input</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getExclusive <em>Exclusive</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getSequential <em>Sequential</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getParallel <em>Parallel</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getParentDecompositions <em>Parent Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getContainer <em>Container</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Intention#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention()
 * @model
 * @generated
 */
public interface Intention extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2001-2008 University of Toronto";

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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getName <em>Name</em>}' attribute.
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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Label()
	 * @model containment="true"
	 * @generated
	 */
	TruthLabel getLabel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(TruthLabel value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Contribution}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Contribution#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Rule()
	 * @see edu.toronto.cs.openome_model.Contribution#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Contribution> getRule();

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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_System()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSystem();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getSystem <em>System</em>}' attribute.
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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Boundary()
	 * @model default="false"
	 * @generated
	 */
	Boolean getBoundary();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' attribute.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getOutput();

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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Exclusive()
	 * @model default="true"
	 * @generated
	 */
	Boolean getExclusive();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getExclusive <em>Exclusive</em>}' attribute.
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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Sequential()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSequential();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getSequential <em>Sequential</em>}' attribute.
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
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Parallel()
	 * @model default="false"
	 * @generated
	 */
	Boolean getParallel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Dependency From</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Dependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency From</em>' reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_DependencyFrom()
	 * @see edu.toronto.cs.openome_model.Dependency#getDependencyTo
	 * @model opposite="dependencyTo"
	 * @generated
	 */
	EList<Dependency> getDependencyFrom();

	/**
	 * Returns the value of the '<em><b>Dependency To</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Dependency}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Dependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency To</em>' reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_DependencyTo()
	 * @see edu.toronto.cs.openome_model.Dependency#getDependencyFrom
	 * @model opposite="dependencyFrom"
	 * @generated
	 */
	EList<Dependency> getDependencyTo();

	/**
	 * Returns the value of the '<em><b>Decompositions</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Decomposition}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Decomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decompositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decompositions</em>' reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Decompositions()
	 * @see edu.toronto.cs.openome_model.Decomposition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Decomposition> getDecompositions();

	/**
	 * Returns the value of the '<em><b>Parent Decompositions</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.openome_model.Decomposition}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Decomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Decompositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Decompositions</em>' reference list.
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_ParentDecompositions()
	 * @see edu.toronto.cs.openome_model.Decomposition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Decomposition> getParentDecompositions();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Container#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Container()
	 * @see edu.toronto.cs.openome_model.Container#getIntentions
	 * @model opposite="intentions"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Model#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getIntention_Model()
	 * @see edu.toronto.cs.openome_model.Model#getIntentions
	 * @model opposite="intentions" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Intention#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Intention
