/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import javax.xml.datatype.Duration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Per Time Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostPerTimeUnit#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostPerTimeUnit()
 * @model extendedMetaData="name='CostPerTimeUnit' kind='elementOnly'"
 * @generated
 */
public interface CostPerTimeUnit extends OneTimeCost {
	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(Duration)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostPerTimeUnit_TimeUnit()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeUnit'"
	 * @generated
	 */
	Duration getTimeUnit();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnit#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(Duration value);

} // CostPerTimeUnit
