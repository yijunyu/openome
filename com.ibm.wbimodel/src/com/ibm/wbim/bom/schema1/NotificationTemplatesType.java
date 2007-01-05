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
 * A representation of the model object '<em><b>Notification Templates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.NotificationTemplatesType#getNotificationTemplate <em>Notification Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationTemplatesType()
 * @model extendedMetaData="name='notificationTemplates_._type' kind='elementOnly'"
 * @generated
 */
public interface NotificationTemplatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Notification Template</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Template</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationTemplatesType_NotificationTemplate()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='notificationTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getNotificationTemplate();

} // NotificationTemplatesType
