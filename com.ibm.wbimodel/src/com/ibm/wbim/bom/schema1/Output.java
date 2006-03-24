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
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#getRepositoryValue <em>Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#getAssociatedData <em>Associated Data</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Output#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput()
 * @model extendedMetaData="name='Output' kind='elementOnly'"
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This definition only applies to outputs that send values to a repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository Value</em>' containment reference.
	 * @see #setRepositoryValue(OutputRepositoryValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_RepositoryValue()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='repositoryValue' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputRepositoryValue getRepositoryValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getRepositoryValue <em>Repository Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Value</em>' containment reference.
	 * @see #getRepositoryValue()
	 * @generated
	 */
	void setRepositoryValue(OutputRepositoryValue value);

	/**
	 * Returns the value of the '<em><b>Associated Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Data</em>' attribute.
	 * @see #setAssociatedData(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_AssociatedData()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='associatedData'"
	 * @generated
	 */
	String getAssociatedData();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getAssociatedData <em>Associated Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Data</em>' attribute.
	 * @see #getAssociatedData()
	 * @generated
	 */
	void setAssociatedData(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_IsOrdered()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isOrdered'"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#isIsOrdered <em>Is Ordered</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Output#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOrdered()
	 * @see #isIsOrdered()
	 * @see #setIsOrdered(boolean)
	 * @generated
	 */
	void unsetIsOrdered();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Output#isIsOrdered <em>Is Ordered</em>}' attribute is set.
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
	 * The default value is <code>"1"</code>.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_IsUnique()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUnique'"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#isIsUnique <em>Is Unique</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Output#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUnique()
	 * @see #isIsUnique()
	 * @see #setIsUnique(boolean)
	 * @generated
	 */
	void unsetIsUnique();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Output#isIsUnique <em>Is Unique</em>}' attribute is set.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_Maximum()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='maximum'"
	 * @generated
	 */
	BigInteger getMaximum();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getMaximum <em>Maximum</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(BigInteger)
	 * @generated
	 */
	void unsetMaximum();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Output#getMaximum <em>Maximum</em>}' attribute is set.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_Minimum()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='minimum'"
	 * @generated
	 */
	BigInteger getMinimum();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getMinimum <em>Minimum</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(BigInteger)
	 * @generated
	 */
	void unsetMinimum();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Output#getMinimum <em>Minimum</em>}' attribute is set.
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutput_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Output#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Output
