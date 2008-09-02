/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Annotation;
import com.ibm.wbim.bom.schema1.CallToProcessType;
import com.ibm.wbim.bom.schema1.CallToServiceType;
import com.ibm.wbim.bom.schema1.CallToTaskType;
import com.ibm.wbim.bom.schema1.Connection;
import com.ibm.wbim.bom.schema1.Decision;
import com.ibm.wbim.bom.schema1.EndNodeType;
import com.ibm.wbim.bom.schema1.FlowContentType;
import com.ibm.wbim.bom.schema1.ForLoop;
import com.ibm.wbim.bom.schema1.Fork;
import com.ibm.wbim.bom.schema1.Join;
import com.ibm.wbim.bom.schema1.LocalRepository;
import com.ibm.wbim.bom.schema1.Loop;
import com.ibm.wbim.bom.schema1.Map;
import com.ibm.wbim.bom.schema1.Merge;
import com.ibm.wbim.bom.schema1.NotificationBroadcaster;
import com.ibm.wbim.bom.schema1.NotificationReceiver;
import com.ibm.wbim.bom.schema1.Observer;
import com.ibm.wbim.bom.schema1.Schema1Package;

import com.ibm.wbim.bom.schema1.StartNodeType;
import com.ibm.wbim.bom.schema1.StopNodeType;
import com.ibm.wbim.bom.schema1.Task;
import com.ibm.wbim.bom.schema1.Timer;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getStartNode <em>Start Node</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getStopNode <em>Stop Node</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getEndNode <em>End Node</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getMerge <em>Merge</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getNotificationBroadcaster <em>Notification Broadcaster</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getNotificationReceiver <em>Notification Receiver</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getForLoop <em>For Loop</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getLocalRepository <em>Local Repository</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getCallToProcess <em>Call To Process</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getCallToTask <em>Call To Task</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getCallToService <em>Call To Service</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowContentTypeImpl extends EObjectImpl implements FlowContentType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.FLOW_CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this,
					Schema1Package.FLOW_CONTENT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartNodeType> getStartNode() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__START_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopNodeType> getStopNode() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__STOP_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndNodeType> getEndNode() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__END_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		return getGroup().list(Schema1Package.Literals.FLOW_CONTENT_TYPE__TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecision() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__DECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Merge> getMerge() {
		return getGroup()
				.list(Schema1Package.Literals.FLOW_CONTENT_TYPE__MERGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fork> getFork() {
		return getGroup().list(Schema1Package.Literals.FLOW_CONTENT_TYPE__FORK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Join> getJoin() {
		return getGroup().list(Schema1Package.Literals.FLOW_CONTENT_TYPE__JOIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationBroadcaster> getNotificationBroadcaster() {
		return getGroup()
				.list(
						Schema1Package.Literals.FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationReceiver> getNotificationReceiver() {
		return getGroup()
				.list(
						Schema1Package.Literals.FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observer> getObserver() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__OBSERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timer> getTimer() {
		return getGroup()
				.list(Schema1Package.Literals.FLOW_CONTENT_TYPE__TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMap() {
		return getGroup().list(Schema1Package.Literals.FLOW_CONTENT_TYPE__MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loop> getLoop() {
		return getGroup().list(Schema1Package.Literals.FLOW_CONTENT_TYPE__LOOP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForLoop> getForLoop() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__FOR_LOOP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.ibm.wbim.bom.schema1.Process> getProcess() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__PROCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalRepository> getLocalRepository() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__LOCAL_REPOSITORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallToProcessType> getCallToProcess() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__CALL_TO_PROCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallToTaskType> getCallToTask() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__CALL_TO_TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallToServiceType> getCallToService() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__CALL_TO_SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__CONNECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		return getGroup().list(
				Schema1Package.Literals.FLOW_CONTENT_TYPE__ANNOTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Schema1Package.FLOW_CONTENT_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__START_NODE:
			return ((InternalEList<?>) getStartNode()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__STOP_NODE:
			return ((InternalEList<?>) getStopNode()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__END_NODE:
			return ((InternalEList<?>) getEndNode())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__TASK:
			return ((InternalEList<?>) getTask()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__DECISION:
			return ((InternalEList<?>) getDecision()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__MERGE:
			return ((InternalEList<?>) getMerge()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__FORK:
			return ((InternalEList<?>) getFork()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__JOIN:
			return ((InternalEList<?>) getJoin()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER:
			return ((InternalEList<?>) getNotificationBroadcaster())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER:
			return ((InternalEList<?>) getNotificationReceiver()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__OBSERVER:
			return ((InternalEList<?>) getObserver()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__TIMER:
			return ((InternalEList<?>) getTimer()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__MAP:
			return ((InternalEList<?>) getMap()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__LOOP:
			return ((InternalEList<?>) getLoop()).basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__FOR_LOOP:
			return ((InternalEList<?>) getForLoop())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__PROCESS:
			return ((InternalEList<?>) getProcess())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__LOCAL_REPOSITORY:
			return ((InternalEList<?>) getLocalRepository()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_PROCESS:
			return ((InternalEList<?>) getCallToProcess()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_TASK:
			return ((InternalEList<?>) getCallToTask()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_SERVICE:
			return ((InternalEList<?>) getCallToService()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__CONNECTION:
			return ((InternalEList<?>) getConnection()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.FLOW_CONTENT_TYPE__ANNOTATION:
			return ((InternalEList<?>) getAnnotation()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.FLOW_CONTENT_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case Schema1Package.FLOW_CONTENT_TYPE__START_NODE:
			return getStartNode();
		case Schema1Package.FLOW_CONTENT_TYPE__STOP_NODE:
			return getStopNode();
		case Schema1Package.FLOW_CONTENT_TYPE__END_NODE:
			return getEndNode();
		case Schema1Package.FLOW_CONTENT_TYPE__TASK:
			return getTask();
		case Schema1Package.FLOW_CONTENT_TYPE__DECISION:
			return getDecision();
		case Schema1Package.FLOW_CONTENT_TYPE__MERGE:
			return getMerge();
		case Schema1Package.FLOW_CONTENT_TYPE__FORK:
			return getFork();
		case Schema1Package.FLOW_CONTENT_TYPE__JOIN:
			return getJoin();
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER:
			return getNotificationBroadcaster();
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER:
			return getNotificationReceiver();
		case Schema1Package.FLOW_CONTENT_TYPE__OBSERVER:
			return getObserver();
		case Schema1Package.FLOW_CONTENT_TYPE__TIMER:
			return getTimer();
		case Schema1Package.FLOW_CONTENT_TYPE__MAP:
			return getMap();
		case Schema1Package.FLOW_CONTENT_TYPE__LOOP:
			return getLoop();
		case Schema1Package.FLOW_CONTENT_TYPE__FOR_LOOP:
			return getForLoop();
		case Schema1Package.FLOW_CONTENT_TYPE__PROCESS:
			return getProcess();
		case Schema1Package.FLOW_CONTENT_TYPE__LOCAL_REPOSITORY:
			return getLocalRepository();
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_PROCESS:
			return getCallToProcess();
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_TASK:
			return getCallToTask();
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_SERVICE:
			return getCallToService();
		case Schema1Package.FLOW_CONTENT_TYPE__CONNECTION:
			return getConnection();
		case Schema1Package.FLOW_CONTENT_TYPE__ANNOTATION:
			return getAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.FLOW_CONTENT_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__START_NODE:
			getStartNode().clear();
			getStartNode().addAll(
					(Collection<? extends StartNodeType>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__STOP_NODE:
			getStopNode().clear();
			getStopNode().addAll((Collection<? extends StopNodeType>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__END_NODE:
			getEndNode().clear();
			getEndNode().addAll((Collection<? extends EndNodeType>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends Task>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__DECISION:
			getDecision().clear();
			getDecision().addAll((Collection<? extends Decision>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__MERGE:
			getMerge().clear();
			getMerge().addAll((Collection<? extends Merge>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__FORK:
			getFork().clear();
			getFork().addAll((Collection<? extends Fork>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__JOIN:
			getJoin().clear();
			getJoin().addAll((Collection<? extends Join>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER:
			getNotificationBroadcaster().clear();
			getNotificationBroadcaster().addAll(
					(Collection<? extends NotificationBroadcaster>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER:
			getNotificationReceiver().clear();
			getNotificationReceiver().addAll(
					(Collection<? extends NotificationReceiver>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__OBSERVER:
			getObserver().clear();
			getObserver().addAll((Collection<? extends Observer>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__TIMER:
			getTimer().clear();
			getTimer().addAll((Collection<? extends Timer>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__MAP:
			getMap().clear();
			getMap().addAll((Collection<? extends Map>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__LOOP:
			getLoop().clear();
			getLoop().addAll((Collection<? extends Loop>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__FOR_LOOP:
			getForLoop().clear();
			getForLoop().addAll((Collection<? extends ForLoop>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__PROCESS:
			getProcess().clear();
			getProcess()
					.addAll(
							(Collection<? extends com.ibm.wbim.bom.schema1.Process>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__LOCAL_REPOSITORY:
			getLocalRepository().clear();
			getLocalRepository().addAll(
					(Collection<? extends LocalRepository>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_PROCESS:
			getCallToProcess().clear();
			getCallToProcess().addAll(
					(Collection<? extends CallToProcessType>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_TASK:
			getCallToTask().clear();
			getCallToTask().addAll(
					(Collection<? extends CallToTaskType>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_SERVICE:
			getCallToService().clear();
			getCallToService().addAll(
					(Collection<? extends CallToServiceType>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CONNECTION:
			getConnection().clear();
			getConnection().addAll((Collection<? extends Connection>) newValue);
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__ANNOTATION:
			getAnnotation().clear();
			getAnnotation().addAll((Collection<? extends Annotation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Schema1Package.FLOW_CONTENT_TYPE__GROUP:
			getGroup().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__START_NODE:
			getStartNode().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__STOP_NODE:
			getStopNode().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__END_NODE:
			getEndNode().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__TASK:
			getTask().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__DECISION:
			getDecision().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__MERGE:
			getMerge().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__FORK:
			getFork().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__JOIN:
			getJoin().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER:
			getNotificationBroadcaster().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER:
			getNotificationReceiver().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__OBSERVER:
			getObserver().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__TIMER:
			getTimer().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__MAP:
			getMap().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__LOOP:
			getLoop().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__FOR_LOOP:
			getForLoop().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__PROCESS:
			getProcess().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__LOCAL_REPOSITORY:
			getLocalRepository().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_PROCESS:
			getCallToProcess().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_TASK:
			getCallToTask().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_SERVICE:
			getCallToService().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__CONNECTION:
			getConnection().clear();
			return;
		case Schema1Package.FLOW_CONTENT_TYPE__ANNOTATION:
			getAnnotation().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Schema1Package.FLOW_CONTENT_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__START_NODE:
			return !getStartNode().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__STOP_NODE:
			return !getStopNode().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__END_NODE:
			return !getEndNode().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__TASK:
			return !getTask().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__DECISION:
			return !getDecision().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__MERGE:
			return !getMerge().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__FORK:
			return !getFork().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__JOIN:
			return !getJoin().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER:
			return !getNotificationBroadcaster().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER:
			return !getNotificationReceiver().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__OBSERVER:
			return !getObserver().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__TIMER:
			return !getTimer().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__MAP:
			return !getMap().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__LOOP:
			return !getLoop().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__FOR_LOOP:
			return !getForLoop().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__PROCESS:
			return !getProcess().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__LOCAL_REPOSITORY:
			return !getLocalRepository().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_PROCESS:
			return !getCallToProcess().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_TASK:
			return !getCallToTask().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__CALL_TO_SERVICE:
			return !getCallToService().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__CONNECTION:
			return !getConnection().isEmpty();
		case Schema1Package.FLOW_CONTENT_TYPE__ANNOTATION:
			return !getAnnotation().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //FlowContentTypeImpl
