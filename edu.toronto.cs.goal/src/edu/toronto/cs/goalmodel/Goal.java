package edu.toronto.cs.goalmodel;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import java.util.List;
/** @model */
public interface Goal extends EObject {
	/** @model */
	String getName();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Goal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/** @model default=0 */
	LabelType getLabel();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Goal#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.LabelType
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/** @model */
	DecompositionType getType();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Goal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.DecompositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecompositionType value);

	/** @model */
	Goal getParent();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Goal#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Goal value);

	/** @model type="Goal" containment="true" opposite="parent" */
	EList getGoal();
	/** @model type="Topic" containment="true" */
	EList getTopics();
	/** @model type="Contribution" containment="true" */
	EList getRule();
	/** @model type="Property" containment="true" */
	EList getProperty();
}
