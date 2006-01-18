package edu.toronto.cs.goalmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import java.util.List;

/** @model */
public interface actor extends EObject {
	/** @model */
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

	/** @model */
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

	/** @model type="actor" containment="true" opposite="super" */
	EList getSub();
	
	/** @model */
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

	/** @model type="goal" containment="true" opposite="actor" */
	EList getGoals();
}
