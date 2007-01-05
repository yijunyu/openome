/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getTerminate <em>Terminate</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSequenceImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSequenceImpl extends TActivityImpl implements TSequence {
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
	protected TSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivity() {
		if (activity == null) {
			activity = new BasicFeatureMap(this, ProcessPackage.TSEQUENCE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmpty() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Empty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInvoke() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Invoke());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReceive() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Receive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReply() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Reply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssign() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Assign());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWait() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Wait());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThrow() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Throw());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTerminate() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Terminate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlow() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Flow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSwitch() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Switch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhile() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_While());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSequence() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Sequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPick() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Pick());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getScope() {
		return ((FeatureMap)getActivity()).list(ProcessPackage.eINSTANCE.getTSequence_Scope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TSEQUENCE__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__ACTIVITY:
					return ((InternalEList)getActivity()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__EMPTY:
					return ((InternalEList)getEmpty()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__INVOKE:
					return ((InternalEList)getInvoke()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__RECEIVE:
					return ((InternalEList)getReceive()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__REPLY:
					return ((InternalEList)getReply()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__ASSIGN:
					return ((InternalEList)getAssign()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__WAIT:
					return ((InternalEList)getWait()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__THROW:
					return ((InternalEList)getThrow()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__TERMINATE:
					return ((InternalEList)getTerminate()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__FLOW:
					return ((InternalEList)getFlow()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__SWITCH:
					return ((InternalEList)getSwitch()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__WHILE:
					return ((InternalEList)getWhile()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__SEQUENCE:
					return ((InternalEList)getSequence()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__PICK:
					return ((InternalEList)getPick()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSEQUENCE__SCOPE:
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
			case ProcessPackage.TSEQUENCE__ANY:
				return getAny();
			case ProcessPackage.TSEQUENCE__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TSEQUENCE__TARGET:
				return getTarget();
			case ProcessPackage.TSEQUENCE__SOURCE:
				return getSource();
			case ProcessPackage.TSEQUENCE__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TSEQUENCE__NAME:
				return getName();
			case ProcessPackage.TSEQUENCE__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TSEQUENCE__ACTIVITY:
				return getActivity();
			case ProcessPackage.TSEQUENCE__EMPTY:
				return getEmpty();
			case ProcessPackage.TSEQUENCE__INVOKE:
				return getInvoke();
			case ProcessPackage.TSEQUENCE__RECEIVE:
				return getReceive();
			case ProcessPackage.TSEQUENCE__REPLY:
				return getReply();
			case ProcessPackage.TSEQUENCE__ASSIGN:
				return getAssign();
			case ProcessPackage.TSEQUENCE__WAIT:
				return getWait();
			case ProcessPackage.TSEQUENCE__THROW:
				return getThrow();
			case ProcessPackage.TSEQUENCE__TERMINATE:
				return getTerminate();
			case ProcessPackage.TSEQUENCE__FLOW:
				return getFlow();
			case ProcessPackage.TSEQUENCE__SWITCH:
				return getSwitch();
			case ProcessPackage.TSEQUENCE__WHILE:
				return getWhile();
			case ProcessPackage.TSEQUENCE__SEQUENCE:
				return getSequence();
			case ProcessPackage.TSEQUENCE__PICK:
				return getPick();
			case ProcessPackage.TSEQUENCE__SCOPE:
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
			case ProcessPackage.TSEQUENCE__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TSEQUENCE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TSEQUENCE__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TSEQUENCE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__EMPTY:
				getEmpty().clear();
				getEmpty().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__INVOKE:
				getInvoke().clear();
				getInvoke().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__RECEIVE:
				getReceive().clear();
				getReceive().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__REPLY:
				getReply().clear();
				getReply().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__WAIT:
				getWait().clear();
				getWait().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__THROW:
				getThrow().clear();
				getThrow().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__TERMINATE:
				getTerminate().clear();
				getTerminate().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__SWITCH:
				getSwitch().clear();
				getSwitch().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__WHILE:
				getWhile().clear();
				getWhile().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__PICK:
				getPick().clear();
				getPick().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSEQUENCE__SCOPE:
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
			case ProcessPackage.TSEQUENCE__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TSEQUENCE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TSEQUENCE__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TSEQUENCE__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TSEQUENCE__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TSEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TSEQUENCE__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TSEQUENCE__ACTIVITY:
				getActivity().clear();
				return;
			case ProcessPackage.TSEQUENCE__EMPTY:
				getEmpty().clear();
				return;
			case ProcessPackage.TSEQUENCE__INVOKE:
				getInvoke().clear();
				return;
			case ProcessPackage.TSEQUENCE__RECEIVE:
				getReceive().clear();
				return;
			case ProcessPackage.TSEQUENCE__REPLY:
				getReply().clear();
				return;
			case ProcessPackage.TSEQUENCE__ASSIGN:
				getAssign().clear();
				return;
			case ProcessPackage.TSEQUENCE__WAIT:
				getWait().clear();
				return;
			case ProcessPackage.TSEQUENCE__THROW:
				getThrow().clear();
				return;
			case ProcessPackage.TSEQUENCE__TERMINATE:
				getTerminate().clear();
				return;
			case ProcessPackage.TSEQUENCE__FLOW:
				getFlow().clear();
				return;
			case ProcessPackage.TSEQUENCE__SWITCH:
				getSwitch().clear();
				return;
			case ProcessPackage.TSEQUENCE__WHILE:
				getWhile().clear();
				return;
			case ProcessPackage.TSEQUENCE__SEQUENCE:
				getSequence().clear();
				return;
			case ProcessPackage.TSEQUENCE__PICK:
				getPick().clear();
				return;
			case ProcessPackage.TSEQUENCE__SCOPE:
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
			case ProcessPackage.TSEQUENCE__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TSEQUENCE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TSEQUENCE__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TSEQUENCE__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TSEQUENCE__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TSEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TSEQUENCE__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TSEQUENCE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case ProcessPackage.TSEQUENCE__EMPTY:
				return !getEmpty().isEmpty();
			case ProcessPackage.TSEQUENCE__INVOKE:
				return !getInvoke().isEmpty();
			case ProcessPackage.TSEQUENCE__RECEIVE:
				return !getReceive().isEmpty();
			case ProcessPackage.TSEQUENCE__REPLY:
				return !getReply().isEmpty();
			case ProcessPackage.TSEQUENCE__ASSIGN:
				return !getAssign().isEmpty();
			case ProcessPackage.TSEQUENCE__WAIT:
				return !getWait().isEmpty();
			case ProcessPackage.TSEQUENCE__THROW:
				return !getThrow().isEmpty();
			case ProcessPackage.TSEQUENCE__TERMINATE:
				return !getTerminate().isEmpty();
			case ProcessPackage.TSEQUENCE__FLOW:
				return !getFlow().isEmpty();
			case ProcessPackage.TSEQUENCE__SWITCH:
				return !getSwitch().isEmpty();
			case ProcessPackage.TSEQUENCE__WHILE:
				return !getWhile().isEmpty();
			case ProcessPackage.TSEQUENCE__SEQUENCE:
				return !getSequence().isEmpty();
			case ProcessPackage.TSEQUENCE__PICK:
				return !getPick().isEmpty();
			case ProcessPackage.TSEQUENCE__SCOPE:
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

} //TSequenceImpl
