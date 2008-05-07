/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Per Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostPerQuantity#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostPerQuantity()
 * @model extendedMetaData="name='CostPerQuantity' kind='elementOnly'"
 * @generated
 */
public interface CostPerQuantity extends OneTimeCost {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"acre"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.Unit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(Unit)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostPerQuantity_Unit()
	 * @model default="acre" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostPerQuantity#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.Unit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.CostPerQuantity#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(Unit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.CostPerQuantity#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(Unit)
	 * @generated
	 */
	boolean isSetUnit();

} // CostPerQuantity
