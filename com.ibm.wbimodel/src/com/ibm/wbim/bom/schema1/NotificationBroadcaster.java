/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Broadcaster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster#getNotification <em>Notification</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationBroadcaster()
 * @model extendedMetaData="name='NotificationBroadcaster' kind='elementOnly'"
 * @generated
 */
public interface NotificationBroadcaster extends Task {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationBroadcaster_Notification()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='notification'"
	 * @generated
	 */
	String getNotification();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scope name has one of the following formats:  [catalog ID]##[global process name] or  [catalog ID]##[global process name]/[subprocess name]/...  
	 * For example, the notification broadcaster called Low Stock is in a subprocess called Check Inventory within a subprocess called Process Order within a process called Order Product. If the notification scope is to be Process Order, the scope name is [catlogId]##Order Product/Process Order. Note: this is a similar format to what the user sees in the scope entry of the notification broadcaster in its Attribute view except that the catalog ID prefixes the global process name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getNotificationBroadcaster_Scope()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

} // NotificationBroadcaster
