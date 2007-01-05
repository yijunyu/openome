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
 * A representation of the model object '<em><b>Complex Data Type Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getAttributeValue <em>Attribute Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataTypeInstance()
 * @model extendedMetaData="name='ComplexDataTypeInstance' kind='elementOnly'"
 * @generated
 */
public interface ComplexDataTypeInstance extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataTypeInstance_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataTypeInstance_AttributeValue()
	 * @model type="com.ibm.wbim.bom.schema1.AttributeValue" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='attributeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAttributeValue();

	/**
	 * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is currently not processed. It can contain additional information about the element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #setExtendedAttributes(ExtendedAttributes)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataTypeInstance_ExtendedAttributes()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='extendedAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedAttributes getExtendedAttributes();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getExtendedAttributes <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #getExtendedAttributes()
	 * @generated
	 */
	void setExtendedAttributes(ExtendedAttributes value);

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' attribute.
	 * @see #setInstanceOf(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataTypeInstance_InstanceOf()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.InstanceOfType" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceOf'"
	 * @generated
	 */
	String getInstanceOf();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getInstanceOf <em>Instance Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' attribute.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getComplexDataTypeInstance_Name()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComplexDataTypeInstance
