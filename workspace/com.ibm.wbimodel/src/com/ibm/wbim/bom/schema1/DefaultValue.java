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
 * A representation of the model object '<em><b>Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.DefaultValue#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DefaultValue#getExpressionValue <em>Expression Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDefaultValue()
 * @model extendedMetaData="name='DefaultValue' kind='elementOnly'"
 * @generated
 */
public interface DefaultValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute.
	 * @see #setLiteralValue(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDefaultValue_LiteralValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='literalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLiteralValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DefaultValue#getLiteralValue <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' attribute.
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(String value);

	/**
	 * Returns the value of the '<em><b>Expression Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Value</em>' containment reference.
	 * @see #setExpressionValue(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDefaultValue_ExpressionValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressionValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionValue();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DefaultValue#getExpressionValue <em>Expression Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Value</em>' containment reference.
	 * @see #getExpressionValue()
	 * @generated
	 */
	void setExpressionValue(Expression value);

} // DefaultValue
