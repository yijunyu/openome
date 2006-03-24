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
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItemTemplates <em>Business Item Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItems <em>Business Items</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItemInstances <em>Business Item Instances</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DataModel#getNotificationTemplates <em>Notification Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DataModel#getNotifications <em>Notifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDataModel()
 * @model extendedMetaData="name='DataModel' kind='elementOnly'"
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Item Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Templates</em>' containment reference.
	 * @see #setBusinessItemTemplates(BusinessItemTemplatesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDataModel_BusinessItemTemplates()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='businessItemTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessItemTemplatesType getBusinessItemTemplates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItemTemplates <em>Business Item Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Item Templates</em>' containment reference.
	 * @see #getBusinessItemTemplates()
	 * @generated
	 */
	void setBusinessItemTemplates(BusinessItemTemplatesType value);

	/**
	 * Returns the value of the '<em><b>Business Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Items</em>' containment reference.
	 * @see #setBusinessItems(BusinessItemsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDataModel_BusinessItems()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='businessItems' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessItemsType getBusinessItems();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItems <em>Business Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Items</em>' containment reference.
	 * @see #getBusinessItems()
	 * @generated
	 */
	void setBusinessItems(BusinessItemsType value);

	/**
	 * Returns the value of the '<em><b>Business Item Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Instances</em>' containment reference.
	 * @see #setBusinessItemInstances(BusinessItemInstancesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDataModel_BusinessItemInstances()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='businessItemInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessItemInstancesType getBusinessItemInstances();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItemInstances <em>Business Item Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Item Instances</em>' containment reference.
	 * @see #getBusinessItemInstances()
	 * @generated
	 */
	void setBusinessItemInstances(BusinessItemInstancesType value);

	/**
	 * Returns the value of the '<em><b>Notification Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Templates</em>' containment reference.
	 * @see #setNotificationTemplates(NotificationTemplatesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDataModel_NotificationTemplates()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='notificationTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationTemplatesType getNotificationTemplates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DataModel#getNotificationTemplates <em>Notification Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Templates</em>' containment reference.
	 * @see #getNotificationTemplates()
	 * @generated
	 */
	void setNotificationTemplates(NotificationTemplatesType value);

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference.
	 * @see #setNotifications(NotificationsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDataModel_Notifications()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='notifications' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationsType getNotifications();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DataModel#getNotifications <em>Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications</em>' containment reference.
	 * @see #getNotifications()
	 * @generated
	 */
	void setNotifications(NotificationsType value);

} // DataModel
