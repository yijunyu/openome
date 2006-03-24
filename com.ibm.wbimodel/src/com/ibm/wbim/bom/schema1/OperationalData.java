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
 * A representation of the model object '<em><b>Operational Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OperationalData#getTimeEstimation <em>Time Estimation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OperationalData#getCost <em>Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OperationalData#getRevenue <em>Revenue</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOperationalData()
 * @model extendedMetaData="name='OperationalData' kind='elementOnly'"
 * @generated
 */
public interface OperationalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Estimation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Estimation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Estimation</em>' containment reference.
	 * @see #setTimeEstimation(TimeEstimationType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOperationalData_TimeEstimation()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='timeEstimation' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeEstimationType getTimeEstimation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OperationalData#getTimeEstimation <em>Time Estimation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Estimation</em>' containment reference.
	 * @see #getTimeEstimation()
	 * @generated
	 */
	void setTimeEstimation(TimeEstimationType value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(CostType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOperationalData_Cost()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	CostType getCost();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OperationalData#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(CostType value);

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revenue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(CostValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOperationalData_Revenue()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	CostValue getRevenue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OperationalData#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(CostValue value);

} // OperationalData
