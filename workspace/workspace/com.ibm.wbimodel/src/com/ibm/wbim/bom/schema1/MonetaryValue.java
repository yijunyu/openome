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
 * A representation of the model object '<em><b>Monetary Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.MonetaryValue#getValue <em>Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.MonetaryValue#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMonetaryValue()
 * @model extendedMetaData="name='MonetaryValue' kind='simple'"
 * @generated
 */
public interface MonetaryValue extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMonetaryValue_Value()
	 * @model unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.NonNegativeDouble"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The default value is <code>"AED"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.Currency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.Currency
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #setCurrency(Currency)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getMonetaryValue_Currency()
	 * @model default="AED" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='currency'"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.Currency
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(Currency)
	 * @generated
	 */
	void unsetCurrency();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getCurrency <em>Currency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency</em>' attribute is set.
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(Currency)
	 * @generated
	 */
	boolean isSetCurrency();

} // MonetaryValue
