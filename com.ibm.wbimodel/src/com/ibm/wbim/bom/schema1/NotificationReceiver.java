/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.NotificationReceiver#getNotificationFilter <em>Notification Filter</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.NotificationReceiver#getNotification <em>Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationReceiver()
 * @model extendedMetaData="name='NotificationReceiver' kind='elementOnly'"
 * @generated
 */
public interface NotificationReceiver extends Task {
	/**
	 * Returns the value of the '<em><b>Notification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Filter</em>' containment reference.
	 * @see #setNotificationFilter(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationReceiver_NotificationFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='notificationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getNotificationFilter();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.NotificationReceiver#getNotificationFilter <em>Notification Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Filter</em>' containment reference.
	 * @see #getNotificationFilter()
	 * @generated
	 */
	void setNotificationFilter(Expression value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see #setNotification(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationReceiver_Notification()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='notification'"
	 * @generated
	 */
	String getNotification();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.NotificationReceiver#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(String value);

} // NotificationReceiver
