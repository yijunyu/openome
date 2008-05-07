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
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Quantity#getValue <em>Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Quantity#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getQuantity()
 * @model extendedMetaData="name='Quantity' kind='simple'"
 * @generated
 */
public interface Quantity extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getQuantity_Value()
	 * @model unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.NonNegativeDouble"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Quantity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Quantity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Quantity#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getQuantity_Unit()
	 * @model default="acre" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Quantity#getUnit <em>Unit</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Quantity#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(Unit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Quantity#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(Unit)
	 * @generated
	 */
	boolean isSetUnit();

} // Quantity
