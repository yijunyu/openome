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
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.TypeDeclaration#getComplexDataType <em>Complex Data Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.TypeDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTypeDeclaration()
 * @model extendedMetaData="name='TypeDeclaration' kind='elementOnly'"
 * @generated
 */
public interface TypeDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Complex Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Data Type</em>' containment reference.
	 * @see #setComplexDataType(ComplexDataType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTypeDeclaration_ComplexDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complexDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexDataType getComplexDataType();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TypeDeclaration#getComplexDataType <em>Complex Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Data Type</em>' containment reference.
	 * @see #getComplexDataType()
	 * @generated
	 */
	void setComplexDataType(ComplexDataType value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTypeDeclaration_Name()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TypeDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TypeDeclaration
