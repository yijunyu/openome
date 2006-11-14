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
 * A representation of the model object '<em><b>link Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.goalmodel.linkAnnotation#getType <em>Type</em>}</li>
 *   <li>{@link edu.toronto.cs.goalmodel.linkAnnotation#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getlinkAnnotation()
 * @model
 * @generated
 */
public interface linkAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.toronto.cs.goalmodel.linkAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.linkAnnotationType
	 * @see #setType(linkAnnotationType)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getlinkAnnotation_Type()
	 * @model
	 * @generated
	 */
	linkAnnotationType getType();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.linkAnnotation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.linkAnnotationType
	 * @see #getType()
	 * @generated
	 */
	void setType(linkAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#getlinkAnnotation_Details()
	 * @model default=""
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.linkAnnotation#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

} // linkAnnotation