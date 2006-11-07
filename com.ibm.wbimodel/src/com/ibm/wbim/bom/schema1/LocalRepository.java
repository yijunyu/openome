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
 * A representation of the model object '<em><b>Local Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocalRepository#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocalRepository#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocalRepository#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocalRepository#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository()
 * @model extendedMetaData="name='LocalRepository' kind='elementOnly'"
 * @generated
 */
public interface LocalRepository extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #isSetCapacity()
	 * @see #unsetCapacity()
	 * @see #setCapacity(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository_Capacity()
	 * @model default="-1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='capacity'"
	 * @generated
	 */
	BigInteger getCapacity();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #isSetCapacity()
	 * @see #unsetCapacity()
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacity()
	 * @see #getCapacity()
	 * @see #setCapacity(BigInteger)
	 * @generated
	 */
	void unsetCapacity();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getCapacity <em>Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity</em>' attribute is set.
	 * @see #unsetCapacity()
	 * @see #getCapacity()
	 * @see #setCapacity(BigInteger)
	 * @generated
	 */
	boolean isSetCapacity();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository_IsOrdered()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isOrdered'"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsOrdered <em>Is Ordered</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOrdered()
	 * @see #isIsOrdered()
	 * @see #setIsOrdered(boolean)
	 * @generated
	 */
	void unsetIsOrdered();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsOrdered <em>Is Ordered</em>}' attribute is set.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository_IsUnique()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUnique'"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsUnique <em>Is Unique</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUnique()
	 * @see #isIsUnique()
	 * @see #setIsUnique(boolean)
	 * @generated
	 */
	void unsetIsUnique();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsUnique <em>Is Unique</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getName <em>Name</em>}' attribute.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocalRepository_Type()
	 * @model default="String" unique="false" unsettable="true" dataType="com.ibm.wbim.bom.schema1.TypeType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Object)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LocalRepository#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Object)
	 * @generated
	 */
	boolean isSetType();

} // LocalRepository