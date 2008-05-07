/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.Contribution#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Contribution#getModel <em>Model</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.Contribution#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.openome_model.openome_modelPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Intention)
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getContribution_Target()
	 * @model
	 * @generated
	 */
	Intention getTarget();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Contribution#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Intention value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Model#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getContribution_Model()
	 * @see edu.toronto.cs.openome_model.Model#getContributions
	 * @model opposite="contributions"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Contribution#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.openome_model.Intention#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Intention)
	 * @see edu.toronto.cs.openome_model.openome_modelPackage#getContribution_Source()
	 * @see edu.toronto.cs.openome_model.Intention#getRule
	 * @model opposite="rule"
	 * @generated
	 */
	Intention getSource();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.openome_model.Contribution#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Intention value);

} // Contribution
