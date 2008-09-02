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
 * A representation of the model object '<em><b>Control Action Output Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef#getRepositoryValue <em>Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getControlActionOutputRef()
 * @model extendedMetaData="name='ControlActionOutputRef' kind='elementOnly'"
 * @generated
 */
public interface ControlActionOutputRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Value</em>' containment reference.
	 * @see #setRepositoryValue(OutputRepositoryValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getControlActionOutputRef_RepositoryValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repositoryValue' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputRepositoryValue getRepositoryValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef#getRepositoryValue <em>Repository Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Value</em>' containment reference.
	 * @see #getRepositoryValue()
	 * @generated
	 */
	void setRepositoryValue(OutputRepositoryValue value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getControlActionOutputRef_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ControlActionOutputRef
