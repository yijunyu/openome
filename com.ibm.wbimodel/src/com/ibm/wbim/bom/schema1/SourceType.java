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
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.SourceType#getContactPoint <em>Contact Point</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.SourceType#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getSourceType()
 * @model extendedMetaData="name='source_._type' kind='empty'"
 * @generated
 */
public interface SourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unless the source is a start node or repository node, specify the output name of the source activity or the input name of the containing process. If the source is a start node or repository node, do not use this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Point</em>' attribute.
	 * @see #setContactPoint(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getSourceType_ContactPoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contactPoint'"
	 * @generated
	 */
	String getContactPoint();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.SourceType#getContactPoint <em>Contact Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Point</em>' attribute.
	 * @see #getContactPoint()
	 * @generated
	 */
	void setContactPoint(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unless the source is an input of the containing process, specify the name of the source activity. If the source is an input of the containing process, do not use this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getSourceType_Node()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.SourceType#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // SourceType
