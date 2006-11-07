/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.AttributeValue#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AttributeValue#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AttributeValue#getExpressionValue <em>Expression Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AttributeValue#getPublicInstance <em>Public Instance</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AttributeValue#getPrivateInstance <em>Private Instance</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.AttributeValue#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue()
 * @model extendedMetaData="name='AttributeValue' kind='elementOnly'"
 * @generated
 */
public interface AttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue_LiteralValue()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literalValue' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getLiteralValue();

	/**
	 * Returns the value of the '<em><b>Expression Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Value</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue_ExpressionValue()
	 * @model type="com.ibm.wbim.bom.schema1.Expression" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expressionValue' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getExpressionValue();

	/**
	 * Returns the value of the '<em><b>Public Instance</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.PublicInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Instance</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue_PublicInstance()
	 * @model type="com.ibm.wbim.bom.schema1.PublicInstance" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publicInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getPublicInstance();

	/**
	 * Returns the value of the '<em><b>Private Instance</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.PrivateInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Instance</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue_PrivateInstance()
	 * @model type="com.ibm.wbim.bom.schema1.PrivateInstance" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='privateInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getPrivateInstance();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAttributeValue_Attribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='attribute'"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.AttributeValue#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

} // AttributeValue