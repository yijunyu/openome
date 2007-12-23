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
 * A representation of the model object '<em><b>Repository Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getExpressionValue <em>Expression Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getPublicInstance <em>Public Instance</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getPrivateInstance <em>Private Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRepositoryDataValue()
 * @model extendedMetaData="name='RepositoryDataValue' kind='elementOnly'"
 * @generated
 */
public interface RepositoryDataValue extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRepositoryDataValue_Group()
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRepositoryDataValue_LiteralValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRepositoryDataValue_ExpressionValue()
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRepositoryDataValue_PublicInstance()
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRepositoryDataValue_PrivateInstance()
	 * @model type="com.ibm.wbim.bom.schema1.PrivateInstance" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='privateInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getPrivateInstance();

} // RepositoryDataValue
