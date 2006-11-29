package edu.toronto.cs.goalmodel;
import org.eclipse.emf.ecore.EObject;

/** @model */
public interface Contribution extends EObject {
	/** @model type="ContributionType" */
	ContributionType getType();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Contribution#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.toronto.cs.goalmodel.ContributionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContributionType value);

	/** @model */
	Goal getTarget();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Contribution#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Goal value);

}
