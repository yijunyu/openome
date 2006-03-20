/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TFlow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TLinks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFlow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getTerminate <em>Terminate</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TFlowImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFlowImpl extends TActivityImpl implements TFlow {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected TLinks links = null;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activity = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLinks getLinks() {
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinks(TLinks newLinks, NotificationChain msgs) {
		TLinks oldLinks = links;
		links = newLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TFLOW__LINKS, oldLinks, newLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(TLinks newLinks) {
		if (newLinks != links) {
			NotificationChain msgs = null;
			if (links != null)
				msgs = ((InternalEObject)links).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TFLOW__LINKS, null, msgs);
			if (newLinks != null)
				msgs = ((InternalEObject)newLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TFLOW__LINKS, null, msgs);
			msgs = basicSetLinks(newLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TFLOW__LINKS, newLinks, newLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivity() {
		if (activity == null) {
			activity = new BasicFeatureMap(this, ProcessPackage.TFLOW__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmpty() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Empty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInvoke() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Invoke());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReceive() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Receive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReply() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Reply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssign() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Assign());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWait() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Wait());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThrow() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Throw());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTerminate() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Terminate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlow() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Flow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSwitch() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Switch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhile() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_While());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSequence() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Sequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPick() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Pick());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getScope() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTFlow_Scope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TFLOW__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__LINKS:
					return basicSetLinks(null, msgs);
				case ProcessPackage.TFLOW__ACTIVITY:
					return ((InternalEList)getActivity()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__EMPTY:
					return ((InternalEList)getEmpty()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__INVOKE:
					return ((InternalEList)getInvoke()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__RECEIVE:
					return ((InternalEList)getReceive()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__REPLY:
					return ((InternalEList)getReply()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__ASSIGN:
					return ((InternalEList)getAssign()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__WAIT:
					return ((InternalEList)getWait()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__THROW:
					return ((InternalEList)getThrow()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__TERMINATE:
					return ((InternalEList)getTerminate()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__FLOW:
					return ((InternalEList)getFlow()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__SWITCH:
					return ((InternalEList)getSwitch()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__WHILE:
					return ((InternalEList)getWhile()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__SEQUENCE:
					return ((InternalEList)getSequence()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__PICK:
					return ((InternalEList)getPick()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TFLOW__SCOPE:
					return ((InternalEList)getScope()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ProcessPackage.TFLOW__ANY:
				return getAny();
			case ProcessPackage.TFLOW__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TFLOW__TARGET:
				return getTarget();
			case ProcessPackage.TFLOW__SOURCE:
				return getSource();
			case ProcessPackage.TFLOW__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TFLOW__NAME:
				return getName();
			case ProcessPackage.TFLOW__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TFLOW__LINKS:
				return getLinks();
			case ProcessPackage.TFLOW__ACTIVITY:
				return getActivity();
			case ProcessPackage.TFLOW__EMPTY:
				return getEmpty();
			case ProcessPackage.TFLOW__INVOKE:
				return getInvoke();
			case ProcessPackage.TFLOW__RECEIVE:
				return getReceive();
			case ProcessPackage.TFLOW__REPLY:
				return getReply();
			case ProcessPackage.TFLOW__ASSIGN:
				return getAssign();
			case ProcessPackage.TFLOW__WAIT:
				return getWait();
			case ProcessPackage.TFLOW__THROW:
				return getThrow();
			case ProcessPackage.TFLOW__TERMINATE:
				return getTerminate();
			case ProcessPackage.TFLOW__FLOW:
				return getFlow();
			case ProcessPackage.TFLOW__SWITCH:
				return getSwitch();
			case ProcessPackage.TFLOW__WHILE:
				return getWhile();
			case ProcessPackage.TFLOW__SEQUENCE:
				return getSequence();
			case ProcessPackage.TFLOW__PICK:
				return getPick();
			case ProcessPackage.TFLOW__SCOPE:
				return getScope();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ProcessPackage.TFLOW__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TFLOW__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TFLOW__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TFLOW__LINKS:
				setLinks((TLinks)newValue);
				return;
			case ProcessPackage.TFLOW__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__EMPTY:
				getEmpty().clear();
				getEmpty().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__INVOKE:
				getInvoke().clear();
				getInvoke().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__RECEIVE:
				getReceive().clear();
				getReceive().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__REPLY:
				getReply().clear();
				getReply().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__WAIT:
				getWait().clear();
				getWait().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__THROW:
				getThrow().clear();
				getThrow().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__TERMINATE:
				getTerminate().clear();
				getTerminate().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__SWITCH:
				getSwitch().clear();
				getSwitch().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__WHILE:
				getWhile().clear();
				getWhile().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__PICK:
				getPick().clear();
				getPick().addAll((Collection)newValue);
				return;
			case ProcessPackage.TFLOW__SCOPE:
				getScope().clear();
				getScope().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ProcessPackage.TFLOW__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TFLOW__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TFLOW__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TFLOW__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TFLOW__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TFLOW__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TFLOW__LINKS:
				setLinks((TLinks)null);
				return;
			case ProcessPackage.TFLOW__ACTIVITY:
				getActivity().clear();
				return;
			case ProcessPackage.TFLOW__EMPTY:
				getEmpty().clear();
				return;
			case ProcessPackage.TFLOW__INVOKE:
				getInvoke().clear();
				return;
			case ProcessPackage.TFLOW__RECEIVE:
				getReceive().clear();
				return;
			case ProcessPackage.TFLOW__REPLY:
				getReply().clear();
				return;
			case ProcessPackage.TFLOW__ASSIGN:
				getAssign().clear();
				return;
			case ProcessPackage.TFLOW__WAIT:
				getWait().clear();
				return;
			case ProcessPackage.TFLOW__THROW:
				getThrow().clear();
				return;
			case ProcessPackage.TFLOW__TERMINATE:
				getTerminate().clear();
				return;
			case ProcessPackage.TFLOW__FLOW:
				getFlow().clear();
				return;
			case ProcessPackage.TFLOW__SWITCH:
				getSwitch().clear();
				return;
			case ProcessPackage.TFLOW__WHILE:
				getWhile().clear();
				return;
			case ProcessPackage.TFLOW__SEQUENCE:
				getSequence().clear();
				return;
			case ProcessPackage.TFLOW__PICK:
				getPick().clear();
				return;
			case ProcessPackage.TFLOW__SCOPE:
				getScope().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ProcessPackage.TFLOW__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TFLOW__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TFLOW__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TFLOW__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TFLOW__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TFLOW__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TFLOW__LINKS:
				return links != null;
			case ProcessPackage.TFLOW__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case ProcessPackage.TFLOW__EMPTY:
				return !getEmpty().isEmpty();
			case ProcessPackage.TFLOW__INVOKE:
				return !getInvoke().isEmpty();
			case ProcessPackage.TFLOW__RECEIVE:
				return !getReceive().isEmpty();
			case ProcessPackage.TFLOW__REPLY:
				return !getReply().isEmpty();
			case ProcessPackage.TFLOW__ASSIGN:
				return !getAssign().isEmpty();
			case ProcessPackage.TFLOW__WAIT:
				return !getWait().isEmpty();
			case ProcessPackage.TFLOW__THROW:
				return !getThrow().isEmpty();
			case ProcessPackage.TFLOW__TERMINATE:
				return !getTerminate().isEmpty();
			case ProcessPackage.TFLOW__FLOW:
				return !getFlow().isEmpty();
			case ProcessPackage.TFLOW__SWITCH:
				return !getSwitch().isEmpty();
			case ProcessPackage.TFLOW__WHILE:
				return !getWhile().isEmpty();
			case ProcessPackage.TFLOW__SEQUENCE:
				return !getSequence().isEmpty();
			case ProcessPackage.TFLOW__PICK:
				return !getPick().isEmpty();
			case ProcessPackage.TFLOW__SCOPE:
				return !getScope().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (activity: ");
		result.append(activity);
		result.append(')');
		return result.toString();
	}

} //TFlowImpl
