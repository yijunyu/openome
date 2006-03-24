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
 * A representation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonNameType#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName1 <em>Alternative Name1</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName2 <em>Alternative Name2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonNameType()
 * @model extendedMetaData="name='personName_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonNameType extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonNameType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonNameType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Name1</em>' attribute.
	 * @see #setAlternativeName1(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonNameType_AlternativeName1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='alternativeName1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlternativeName1();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName1 <em>Alternative Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Name1</em>' attribute.
	 * @see #getAlternativeName1()
	 * @generated
	 */
	void setAlternativeName1(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Name2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Name2</em>' attribute.
	 * @see #setAlternativeName2(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPersonNameType_AlternativeName2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='alternativeName2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlternativeName2();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName2 <em>Alternative Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Name2</em>' attribute.
	 * @see #getAlternativeName2()
	 * @generated
	 */
	void setAlternativeName2(String value);

} // PersonNameType
