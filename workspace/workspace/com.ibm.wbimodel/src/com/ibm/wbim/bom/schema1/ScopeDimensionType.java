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
 * A representation of the model object '<em><b>Scope Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getScopeDimensionType()
 * @model extendedMetaData="name='scopeDimension_._type' kind='empty'"
 * @generated
 */
public interface ScopeDimensionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getScopeDimensionType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The default value is <code>"Boolean"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.BasicDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.BasicDataType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #setValueType(BasicDataType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getScopeDimensionType_ValueType()
	 * @model default="Boolean" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valueType'"
	 * @generated
	 */
	BasicDataType getValueType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.BasicDataType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(BasicDataType value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueType()
	 * @see #getValueType()
	 * @see #setValueType(BasicDataType)
	 * @generated
	 */
	void unsetValueType();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getValueType <em>Value Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Type</em>' attribute is set.
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @see #setValueType(BasicDataType)
	 * @generated
	 */
	boolean isSetValueType();

} // ScopeDimensionType
