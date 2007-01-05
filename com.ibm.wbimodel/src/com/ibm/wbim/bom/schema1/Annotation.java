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
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Annotation#getAnnotationText <em>Annotation Text</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Annotation#getAnnotatedNode <em>Annotated Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAnnotation()
 * @model extendedMetaData="name='Annotation' kind='elementOnly'"
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Text</em>' attribute.
	 * @see #setAnnotationText(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAnnotation_AnnotationText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='annotationText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnnotationText();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Annotation#getAnnotationText <em>Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Text</em>' attribute.
	 * @see #getAnnotationText()
	 * @generated
	 */
	void setAnnotationText(String value);

	/**
	 * Returns the value of the '<em><b>Annotated Node</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.AnnotatedNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Node</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getAnnotation_AnnotatedNode()
	 * @model type="com.ibm.wbim.bom.schema1.AnnotatedNodeType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='annotatedNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAnnotatedNode();

} // Annotation
