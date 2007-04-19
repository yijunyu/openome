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
 * A representation of the model object '<em><b>One Time Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OneTimeCost#getCostValue <em>Cost Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OneTimeCost#getWhenCostApplicable <em>When Cost Applicable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOneTimeCost()
 * @model extendedMetaData="name='OneTimeCost' kind='elementOnly'"
 * @generated
 */
public interface OneTimeCost extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Value</em>' containment reference.
	 * @see #setCostValue(MonetaryValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOneTimeCost_CostValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costValue' namespace='##targetNamespace'"
	 * @generated
	 */
	MonetaryValue getCostValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OneTimeCost#getCostValue <em>Cost Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Value</em>' containment reference.
	 * @see #getCostValue()
	 * @generated
	 */
	void setCostValue(MonetaryValue value);

	/**
	 * Returns the value of the '<em><b>When Cost Applicable</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.WhenCostApplicableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Cost Applicable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Cost Applicable</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOneTimeCost_WhenCostApplicable()
	 * @model type="com.ibm.wbim.bom.schema1.WhenCostApplicableType" containment="true"
	 *        extendedMetaData="kind='element' name='whenCostApplicable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getWhenCostApplicable();

} // OneTimeCost
