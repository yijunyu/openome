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
 * A representation of the model object '<em><b>Output Path Probability Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputPathProbabilityValue()
 * @model extendedMetaData="name='OutputPathProbabilityValue' kind='elementOnly'"
 * @generated
 */
public interface OutputPathProbabilityValue extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputPathProbabilityValue_LiteralValue()
	 * @model unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.PercentageValue"
	 *        extendedMetaData="kind='element' name='literalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLiteralValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue#getLiteralValue <em>Literal Value</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue#getLiteralValue <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiteralValue()
	 * @see #getLiteralValue()
	 * @see #setLiteralValue(double)
	 * @generated
	 */
	void unsetLiteralValue();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue#getLiteralValue <em>Literal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Literal Value</em>' attribute is set.
	 * @see #unsetLiteralValue()
	 * @see #getLiteralValue()
	 * @see #setLiteralValue(double)
	 * @generated
	 */
	boolean isSetLiteralValue();

} // OutputPathProbabilityValue