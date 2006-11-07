/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputCriterion#getInput <em>Input</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputCriterion#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputCriterion#getCorrelation <em>Correlation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputCriterion#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputCriterion()
 * @model extendedMetaData="name='InputCriterion' kind='elementOnly'"
 * @generated
 */
public interface InputCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputCriterion_Input()
	 * @model type="com.ibm.wbim.bom.schema1.InputType" containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInput();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputCriterion_Constraint()
	 * @model type="com.ibm.wbim.bom.schema1.Expression" containment="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getConstraint();

	/**
	 * Returns the value of the '<em><b>Correlation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation</em>' containment reference.
	 * @see #setCorrelation(CorrelationType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputCriterion_Correlation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correlation' namespace='##targetNamespace'"
	 * @generated
	 */
	CorrelationType getCorrelation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputCriterion#getCorrelation <em>Correlation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation</em>' containment reference.
	 * @see #getCorrelation()
	 * @generated
	 */
	void setCorrelation(CorrelationType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputCriterion_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputCriterion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // InputCriterion