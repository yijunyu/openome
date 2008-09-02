/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostType#getExecutionCost <em>Execution Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostType#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostType#getResourceWaitingCost <em>Resource Waiting Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostType()
 * @model extendedMetaData="name='cost_._type' kind='elementOnly'"
 * @generated
 */
public interface CostType extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Cost</em>' containment reference.
	 * @see #setExecutionCost(CostValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostType_ExecutionCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='executionCost' namespace='##targetNamespace'"
	 * @generated
	 */
	CostValue getExecutionCost();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostType#getExecutionCost <em>Execution Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Cost</em>' containment reference.
	 * @see #getExecutionCost()
	 * @generated
	 */
	void setExecutionCost(CostValue value);

	/**
	 * Returns the value of the '<em><b>Startup Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Cost</em>' containment reference.
	 * @see #setStartupCost(CostValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostType_StartupCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startupCost' namespace='##targetNamespace'"
	 * @generated
	 */
	CostValue getStartupCost();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostType#getStartupCost <em>Startup Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Cost</em>' containment reference.
	 * @see #getStartupCost()
	 * @generated
	 */
	void setStartupCost(CostValue value);

	/**
	 * Returns the value of the '<em><b>Resource Waiting Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Waiting Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Waiting Cost</em>' containment reference.
	 * @see #setResourceWaitingCost(CostPerTimeUnitValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostType_ResourceWaitingCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceWaitingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	CostPerTimeUnitValue getResourceWaitingCost();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostType#getResourceWaitingCost <em>Resource Waiting Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Waiting Cost</em>' containment reference.
	 * @see #getResourceWaitingCost()
	 * @generated
	 */
	void setResourceWaitingCost(CostPerTimeUnitValue value);

} // CostType
