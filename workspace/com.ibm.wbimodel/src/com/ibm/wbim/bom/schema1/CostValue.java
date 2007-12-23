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
 * A representation of the model object '<em><b>Cost Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostValue#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostValue#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CostValue#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostValue()
 * @model extendedMetaData="name='CostValue' kind='elementOnly'"
 * @generated
 */
public interface CostValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute.
	 * @see #isSetLiteralValue()
	 * @see #unsetLiteralValue()
	 * @see #setLiteralValue(double)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostValue_LiteralValue()
	 * @model unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.NonNegativeDouble"
	 *        extendedMetaData="kind='element' name='literalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLiteralValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getLiteralValue <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' attribute.
	 * @see #isSetLiteralValue()
	 * @see #unsetLiteralValue()
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(double value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getLiteralValue <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiteralValue()
	 * @see #getLiteralValue()
	 * @see #setLiteralValue(double)
	 * @generated
	 */
	void unsetLiteralValue();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getLiteralValue <em>Literal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Literal Value</em>' attribute is set.
	 * @see #unsetLiteralValue()
	 * @see #getLiteralValue()
	 * @see #setLiteralValue(double)
	 * @generated
	 */
	boolean isSetLiteralValue();

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference.
	 * @see #setDistribution(DistributionType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostValue_Distribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	DistributionType getDistribution();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getDistribution <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' containment reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(DistributionType value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCostValue_Currency()
	 * @model default="AED" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='currency'"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getCurrency <em>Currency</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(Currency)
	 * @generated
	 */
	void unsetCurrency();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.CostValue#getCurrency <em>Currency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency</em>' attribute is set.
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(Currency)
	 * @generated
	 */
	boolean isSetCurrency();

} // CostValue
