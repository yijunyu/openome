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
 * A representation of the model object '<em><b>contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.contribution#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.contribution#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getcontribution()
 * @model
 * @generated
 */
public interface contribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.toronto.cs.goalmodel.ContributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.ContributionType
	 * @see #setType(ContributionType)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getcontribution_Type()
	 * @model
	 * @generated
	 */
	ContributionType getType();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.contribution#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.ContributionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContributionType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(goal)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getcontribution_Target()
	 * @model
	 * @generated
	 */
	goal getTarget();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.contribution#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(goal value);

} // contribution
