/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getRule <em>Rule</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute()
 * @model extendedMetaData="name='Attribute' kind='elementOnly'"
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_Rule()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getRule();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Expression value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(DefaultValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_DefaultValue()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultValue getDefaultValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(DefaultValue value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #isSetIsOrdered()
	 * @see #unsetIsOrdered()
	 * @see #setIsOrdered(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_IsOrdered()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isOrdered'"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isSetIsOrdered()
	 * @see #unsetIsOrdered()
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOrdered()
	 * @see #isIsOrdered()
	 * @see #setIsOrdered(boolean)
	 * @generated
	 */
	void unsetIsOrdered();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsOrdered <em>Is Ordered</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Ordered</em>' attribute is set.
	 * @see #unsetIsOrdered()
	 * @see #isIsOrdered()
	 * @see #setIsOrdered(boolean)
	 * @generated
	 */
	boolean isSetIsOrdered();

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #isSetIsReadOnly()
	 * @see #unsetIsReadOnly()
	 * @see #setIsReadOnly(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_IsReadOnly()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isReadOnly'"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isSetIsReadOnly()
	 * @see #unsetIsReadOnly()
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReadOnly()
	 * @see #isIsReadOnly()
	 * @see #setIsReadOnly(boolean)
	 * @generated
	 */
	void unsetIsReadOnly();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsReadOnly <em>Is Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Read Only</em>' attribute is set.
	 * @see #unsetIsReadOnly()
	 * @see #isIsReadOnly()
	 * @see #setIsReadOnly(boolean)
	 * @generated
	 */
	boolean isSetIsReadOnly();

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #isSetIsStatic()
	 * @see #unsetIsStatic()
	 * @see #setIsStatic(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_IsStatic()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isStatic'"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isSetIsStatic()
	 * @see #unsetIsStatic()
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsStatic()
	 * @see #isIsStatic()
	 * @see #setIsStatic(boolean)
	 * @generated
	 */
	void unsetIsStatic();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsStatic <em>Is Static</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Static</em>' attribute is set.
	 * @see #unsetIsStatic()
	 * @see #isIsStatic()
	 * @see #setIsStatic(boolean)
	 * @generated
	 */
	boolean isSetIsStatic();

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #isSetIsUnique()
	 * @see #unsetIsUnique()
	 * @see #setIsUnique(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_IsUnique()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUnique'"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isSetIsUnique()
	 * @see #unsetIsUnique()
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUnique()
	 * @see #isIsUnique()
	 * @see #setIsUnique(boolean)
	 * @generated
	 */
	void unsetIsUnique();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#isIsUnique <em>Is Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Unique</em>' attribute is set.
	 * @see #unsetIsUnique()
	 * @see #isIsUnique()
	 * @see #setIsUnique(boolean)
	 * @generated
	 */
	boolean isSetIsUnique();

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Negative value == unlimited
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #setMaximum(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_Maximum()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='maximum'"
	 * @generated
	 */
	BigInteger getMaximum();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(BigInteger)
	 * @generated
	 */
	void unsetMaximum();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getMaximum <em>Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum</em>' attribute is set.
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(BigInteger)
	 * @generated
	 */
	boolean isSetMaximum();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #setMinimum(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_Minimum()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minimum'"
	 * @generated
	 */
	BigInteger getMinimum();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(BigInteger)
	 * @generated
	 */
	void unsetMinimum();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getMinimum <em>Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum</em>' attribute is set.
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(BigInteger)
	 * @generated
	 */
	boolean isSetMinimum();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Object)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttribute_Type()
	 * @model default="String" unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.TypeType2"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Object)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Attribute#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Object)
	 * @generated
	 */
	boolean isSetType();

} // Attribute
