package edu.toronto.cs.goalmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/** @model */
public interface goal extends EObject{
	/** @model */
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

	/** @model */
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

	/** @model */
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

	/** @model type="goal" containment="true" opposite="parent" */
	EList getGoal();
	/** @model */
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

	/** @model type="contribution" containment="true" */
	EList getRule();
	/* Simple enrichments: */
	/** @model type="topic" containment="true" */
	EList getTopic();
	/** @model default="true" */
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

	/** @model default="false" */
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

	/** @model type="topic" containment="true" */
	EList getInput();
	/** @model type="topic" containment="true" */
	EList getOutput();
	/** @model default="true" */
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

	/** @model default="true" */
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

	/** @model default="false" */
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

	/* More enrichments: */
	/** @model type="property" containment="true" */
	EList getProperty();
	
	/** @model */
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

	/** @model type="dependency" containment="true" opposite="dependencyTo" */
	EList getDependencyFrom();

	/** @model type="dependency" containment="true" opposite="dependencyFrom" */
	EList getDependencyTo();
}
