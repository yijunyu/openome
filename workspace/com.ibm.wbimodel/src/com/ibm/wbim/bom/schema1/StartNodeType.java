/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.StartNodeType#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.StartNodeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartNodeType()
 * @model extendedMetaData="name='startNode_._type' kind='elementOnly'"
 * @generated
 */
public interface StartNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.EntryPointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartNodeType_EntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryPointType> getEntryPoint();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartNodeType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.StartNodeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StartNodeType
