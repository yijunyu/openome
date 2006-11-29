package edu.toronto.cs.goalmodel;
import org.eclipse.emf.ecore.EObject;

/** @model */
public interface Property extends EObject {
	/** @model */
	String getName();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/** @model */
	String getValue();
	/**
	 * Sets the value of the '{@link edu.toronto.cs.goalmodel.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

}
