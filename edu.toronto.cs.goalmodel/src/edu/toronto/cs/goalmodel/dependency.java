package edu.toronto.cs.goalmodel;

import org.eclipse.emf.ecore.EObject;

/** @model */
public interface dependency extends EObject {
	/** @model */
	goal getDependencyFrom();
	
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.dependency#getDependencyFrom <em>Dependency From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency From</em>' container reference.
	 * @see #getDependencyFrom()
	 * @generated
	 */
	void setDependencyFrom(goal value);

	/** @model */
	goal getDependencyTo();
	
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.dependency#getDependencyTo <em>Dependency To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency To</em>' container reference.
	 * @see #getDependencyTo()
	 * @generated
	 */
	void setDependencyTo(goal value);

	/** @model */
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

}
