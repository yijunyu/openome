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
 * A representation of the model object '<em><b>Uniform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.UniformType#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.UniformType#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getUniformType()
 * @model extendedMetaData="name='uniform_._type' kind='empty'"
 * @generated
 */
public interface UniformType extends EObject {
	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #setMaximum(double)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getUniformType_Maximum()
	 * @model unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.NonNegativeDouble"
	 *        extendedMetaData="kind='attribute' name='maximum'"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.UniformType#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.UniformType#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(double)
	 * @generated
	 */
	void unsetMaximum();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.UniformType#getMaximum <em>Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum</em>' attribute is set.
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(double)
	 * @generated
	 */
	boolean isSetMaximum();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #setMinimum(double)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getUniformType_Minimum()
	 * @model unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.NonNegativeDouble"
	 *        extendedMetaData="kind='attribute' name='minimum'"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.UniformType#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.UniformType#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(double)
	 * @generated
	 */
	void unsetMinimum();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.UniformType#getMinimum <em>Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum</em>' attribute is set.
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(double)
	 * @generated
	 */
	boolean isSetMinimum();

} // UniformType
