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
 * A representation of the model object '<em><b>Complex Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataType#getRule <em>Rule</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataType#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataType#getParentTemplate <em>Parent Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataType()
 * @model extendedMetaData="name='ComplexDataType' kind='elementOnly'"
 * @generated
 */
public interface ComplexDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataType_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataType_Attribute()
	 * @model type="com.ibm.wbim.bom.schema1.Attribute" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAttribute();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataType_Rule()
	 * @model type="com.ibm.wbim.bom.schema1.Expression" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRule();

	/**
	 * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is currently not processed. It can contain additional information about the element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #setExtendedAttributes(ExtendedAttributes)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataType_ExtendedAttributes()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='extendedAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedAttributes getExtendedAttributes();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getExtendedAttributes <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #getExtendedAttributes()
	 * @generated
	 */
	void setExtendedAttributes(ExtendedAttributes value);

	/**
	 * Returns the value of the '<em><b>Parent Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Template</em>' attribute.
	 * @see #setParentTemplate(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataType_ParentTemplate()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ParentTemplateType"
	 *        extendedMetaData="kind='attribute' name='parentTemplate'"
	 * @generated
	 */
	String getParentTemplate();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getParentTemplate <em>Parent Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Template</em>' attribute.
	 * @see #getParentTemplate()
	 * @generated
	 */
	void setParentTemplate(String value);

} // ComplexDataType
