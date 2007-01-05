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
 * A representation of the model object '<em><b>Flow Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getStartNode <em>Start Node</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getStopNode <em>Stop Node</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getEndNode <em>End Node</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getTask <em>Task</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getMerge <em>Merge</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getFork <em>Fork</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getJoin <em>Join</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getNotificationBroadcaster <em>Notification Broadcaster</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getNotificationReceiver <em>Notification Receiver</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getObserver <em>Observer</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getTimer <em>Timer</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getMap <em>Map</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getLoop <em>Loop</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getForLoop <em>For Loop</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getProcess <em>Process</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getLocalRepository <em>Local Repository</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getCallToProcess <em>Call To Process</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getCallToTask <em>Call To Task</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getCallToService <em>Call To Service</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.FlowContentType#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType()
 * @model extendedMetaData="name='flowContent_._type' kind='elementOnly'"
 * @generated
 */
public interface FlowContentType extends EObject {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Start Node</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.StartNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Node</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_StartNode()
	 * @model type="com.ibm.wbim.bom.schema1.StartNodeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='startNode' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getStartNode();

	/**
	 * Returns the value of the '<em><b>Stop Node</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.StopNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Node</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_StopNode()
	 * @model type="com.ibm.wbim.bom.schema1.StopNodeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stopNode' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getStopNode();

	/**
	 * Returns the value of the '<em><b>End Node</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.EndNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Node</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_EndNode()
	 * @model type="com.ibm.wbim.bom.schema1.EndNodeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endNode' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getEndNode();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Task()
	 * @model type="com.ibm.wbim.bom.schema1.Task" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getTask();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Decision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Decision()
	 * @model type="com.ibm.wbim.bom.schema1.Decision" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getDecision();

	/**
	 * Returns the value of the '<em><b>Merge</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Merge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Merge()
	 * @model type="com.ibm.wbim.bom.schema1.Merge" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='merge' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getMerge();

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Fork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Fork()
	 * @model type="com.ibm.wbim.bom.schema1.Fork" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fork' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getFork();

	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Join()
	 * @model type="com.ibm.wbim.bom.schema1.Join" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='join' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getJoin();

	/**
	 * Returns the value of the '<em><b>Notification Broadcaster</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.NotificationBroadcaster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Broadcaster</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Broadcaster</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_NotificationBroadcaster()
	 * @model type="com.ibm.wbim.bom.schema1.NotificationBroadcaster" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notificationBroadcaster' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getNotificationBroadcaster();

	/**
	 * Returns the value of the '<em><b>Notification Receiver</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.NotificationReceiver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Receiver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Receiver</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_NotificationReceiver()
	 * @model type="com.ibm.wbim.bom.schema1.NotificationReceiver" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notificationReceiver' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getNotificationReceiver();

	/**
	 * Returns the value of the '<em><b>Observer</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Observer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Observer()
	 * @model type="com.ibm.wbim.bom.schema1.Observer" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='observer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getObserver();

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Timer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Timer()
	 * @model type="com.ibm.wbim.bom.schema1.Timer" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getTimer();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Map}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Map()
	 * @model type="com.ibm.wbim.bom.schema1.Map" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getMap();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Loop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Loop()
	 * @model type="com.ibm.wbim.bom.schema1.Loop" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getLoop();

	/**
	 * Returns the value of the '<em><b>For Loop</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ForLoop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Loop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Loop</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_ForLoop()
	 * @model type="com.ibm.wbim.bom.schema1.ForLoop" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='forLoop' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getForLoop();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Process()
	 * @model type="com.ibm.wbim.bom.schema1.Process" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getProcess();

	/**
	 * Returns the value of the '<em><b>Local Repository</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.LocalRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Repository</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_LocalRepository()
	 * @model type="com.ibm.wbim.bom.schema1.LocalRepository" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='localRepository' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getLocalRepository();

	/**
	 * Returns the value of the '<em><b>Call To Process</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.CallToProcessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call To Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call To Process</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_CallToProcess()
	 * @model type="com.ibm.wbim.bom.schema1.CallToProcessType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='callToProcess' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getCallToProcess();

	/**
	 * Returns the value of the '<em><b>Call To Task</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.CallToTaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call To Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call To Task</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_CallToTask()
	 * @model type="com.ibm.wbim.bom.schema1.CallToTaskType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='callToTask' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getCallToTask();

	/**
	 * Returns the value of the '<em><b>Call To Service</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.CallToServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call To Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call To Service</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_CallToService()
	 * @model type="com.ibm.wbim.bom.schema1.CallToServiceType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='callToService' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getCallToService();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Connection()
	 * @model type="com.ibm.wbim.bom.schema1.Connection" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connection' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getConnection();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getFlowContentType_Annotation()
	 * @model type="com.ibm.wbim.bom.schema1.Annotation" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getAnnotation();

} // FlowContentType
