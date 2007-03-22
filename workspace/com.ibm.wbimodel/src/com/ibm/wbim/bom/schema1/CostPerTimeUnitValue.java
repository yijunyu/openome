/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Per Time Unit Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostPerTimeUnitValue()
 * @model extendedMetaData="name='CostPerTimeUnitValue' kind='elementOnly'"
 * @generated
 */
public interface CostPerTimeUnitValue extends CostValue {
	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The default value is <code>"Minute"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.TimeUnit
	 * @see #isSetTimeUnit()
	 * @see #unsetTimeUnit()
	 * @see #setTimeUnit(TimeUnit)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostPerTimeUnitValue_TimeUnit()
	 * @model default="Minute" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='timeUnit'"
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.TimeUnit
	 * @see #isSetTimeUnit()
	 * @see #unsetTimeUnit()
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeUnit()
	 * @see #getTimeUnit()
	 * @see #setTimeUnit(TimeUnit)
	 * @generated
	 */
	void unsetTimeUnit();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue#getTimeUnit <em>Time Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Unit</em>' attribute is set.
	 * @see #unsetTimeUnit()
	 * @see #getTimeUnit()
	 * @see #setTimeUnit(TimeUnit)
	 * @generated
	 */
	boolean isSetTimeUnit();

} // CostPerTimeUnitValue
