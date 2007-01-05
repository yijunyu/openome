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
 * A representation of the model object '<em><b>dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.dependency#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.dependency#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.dependency#getTrust <em>Trust</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getdependency()
 * @model
 * @generated
 */
public interface dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.goal#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency From</em>' reference.
	 * @see #setDependencyFrom(goal)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getdependency_DependencyFrom()
	 * @see edu.toronto.cs.goalmodel.goal#getDependencyTo
	 * @model opposite="dependencyTo"
	 * @generated
	 */
	goal getDependencyFrom();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.dependency#getDependencyFrom <em>Dependency From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency From</em>' reference.
	 * @see #getDependencyFrom()
	 * @generated
	 */
	void setDependencyFrom(goal value);

	/**
	 * Returns the value of the '<em><b>Dependency To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.goalmodel.goal#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency To</em>' reference.
	 * @see #setDependencyTo(goal)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getdependency_DependencyTo()
	 * @see edu.toronto.cs.goalmodel.goal#getDependencyFrom
	 * @model opposite="dependencyFrom"
	 * @generated
	 */
	goal getDependencyTo();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.dependency#getDependencyTo <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency To</em>' reference.
	 * @see #getDependencyTo()
	 * @generated
	 */
	void setDependencyTo(goal value);

	/**
	 * Returns the value of the '<em><b>Trust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust</em>' attribute.
	 * @see #setTrust(float)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getdependency_Trust()
	 * @model
	 * @generated
	 */
	float getTrust();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.dependency#getTrust <em>Trust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust</em>' attribute.
	 * @see #getTrust()
	 * @generated
	 */
	void setTrust(float value);

} // dependency
