/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Repository Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputRepositoryValueType#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValueType()
 * @model extendedMetaData="name='inputRepositoryValue_._type' kind='elementOnly'"
 * @generated
 */
public interface InputRepositoryValueType extends InputRepositoryValue {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValueType_Input()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='input'"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValueType#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

} // InputRepositoryValueType