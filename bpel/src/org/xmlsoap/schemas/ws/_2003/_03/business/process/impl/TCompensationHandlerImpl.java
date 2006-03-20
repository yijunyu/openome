/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TAssign;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCompensate;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCompensationHandler;
import org.xmlsoap.schemas.ws._2003._03.business.process.TEmpty;
import org.xmlsoap.schemas.ws._2003._03.business.process.TFlow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TInvoke;
import org.xmlsoap.schemas.ws._2003._03.business.process.TPick;
import org.xmlsoap.schemas.ws._2003._03.business.process.TReceive;
import org.xmlsoap.schemas.ws._2003._03.business.process.TReply;
import org.xmlsoap.schemas.ws._2003._03.business.process.TScope;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSequence;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSwitch;
import org.xmlsoap.schemas.ws._2003._03.business.process.TTerminate;
import org.xmlsoap.schemas.ws._2003._03.business.process.TThrow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TWait;
import org.xmlsoap.schemas.ws._2003._03.business.process.TWhile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCompensation Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TCompensationHandlerImpl extends TActivityOrCompensateContainerImpl implements TCompensationHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCompensationHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTCompensationHandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TCOMPENSATION_HANDLER__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__EMPTY:
					return basicSetEmpty(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__INVOKE:
					return basicSetInvoke(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__RECEIVE:
					return basicSetReceive(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__REPLY:
					return basicSetReply(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__ASSIGN:
					return basicSetAssign(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__WAIT:
					return basicSetWait(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__THROW:
					return basicSetThrow(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__TERMINATE:
					return basicSetTerminate(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__FLOW:
					return basicSetFlow(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__SWITCH:
					return basicSetSwitch(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__WHILE:
					return basicSetWhile(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__SEQUENCE:
					return basicSetSequence(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__PICK:
					return basicSetPick(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__SCOPE:
					return basicSetScope(null, msgs);
				case ProcessPackage.TCOMPENSATION_HANDLER__COMPENSATE:
					return basicSetCompensate(null, msgs);
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
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY:
				return getAny();
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TCOMPENSATION_HANDLER__EMPTY:
				return getEmpty();
			case ProcessPackage.TCOMPENSATION_HANDLER__INVOKE:
				return getInvoke();
			case ProcessPackage.TCOMPENSATION_HANDLER__RECEIVE:
				return getReceive();
			case ProcessPackage.TCOMPENSATION_HANDLER__REPLY:
				return getReply();
			case ProcessPackage.TCOMPENSATION_HANDLER__ASSIGN:
				return getAssign();
			case ProcessPackage.TCOMPENSATION_HANDLER__WAIT:
				return getWait();
			case ProcessPackage.TCOMPENSATION_HANDLER__THROW:
				return getThrow();
			case ProcessPackage.TCOMPENSATION_HANDLER__TERMINATE:
				return getTerminate();
			case ProcessPackage.TCOMPENSATION_HANDLER__FLOW:
				return getFlow();
			case ProcessPackage.TCOMPENSATION_HANDLER__SWITCH:
				return getSwitch();
			case ProcessPackage.TCOMPENSATION_HANDLER__WHILE:
				return getWhile();
			case ProcessPackage.TCOMPENSATION_HANDLER__SEQUENCE:
				return getSequence();
			case ProcessPackage.TCOMPENSATION_HANDLER__PICK:
				return getPick();
			case ProcessPackage.TCOMPENSATION_HANDLER__SCOPE:
				return getScope();
			case ProcessPackage.TCOMPENSATION_HANDLER__COMPENSATE:
				return getCompensate();
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
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__EMPTY:
				setEmpty((TEmpty)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__INVOKE:
				setInvoke((TInvoke)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__RECEIVE:
				setReceive((TReceive)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__REPLY:
				setReply((TReply)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__ASSIGN:
				setAssign((TAssign)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__WAIT:
				setWait((TWait)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__THROW:
				setThrow((TThrow)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__TERMINATE:
				setTerminate((TTerminate)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__FLOW:
				setFlow((TFlow)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__SWITCH:
				setSwitch((TSwitch)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__WHILE:
				setWhile((TWhile)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__SEQUENCE:
				setSequence((TSequence)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__PICK:
				setPick((TPick)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__SCOPE:
				setScope((TScope)newValue);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__COMPENSATE:
				setCompensate((TCompensate)newValue);
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
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__EMPTY:
				setEmpty((TEmpty)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__INVOKE:
				setInvoke((TInvoke)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__RECEIVE:
				setReceive((TReceive)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__REPLY:
				setReply((TReply)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__ASSIGN:
				setAssign((TAssign)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__WAIT:
				setWait((TWait)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__THROW:
				setThrow((TThrow)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__TERMINATE:
				setTerminate((TTerminate)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__FLOW:
				setFlow((TFlow)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__SWITCH:
				setSwitch((TSwitch)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__WHILE:
				setWhile((TWhile)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__SEQUENCE:
				setSequence((TSequence)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__PICK:
				setPick((TPick)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__SCOPE:
				setScope((TScope)null);
				return;
			case ProcessPackage.TCOMPENSATION_HANDLER__COMPENSATE:
				setCompensate((TCompensate)null);
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
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TCOMPENSATION_HANDLER__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TCOMPENSATION_HANDLER__EMPTY:
				return empty != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__INVOKE:
				return invoke != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__RECEIVE:
				return receive != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__REPLY:
				return reply != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__ASSIGN:
				return assign != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__WAIT:
				return wait != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__THROW:
				return throw_ != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__TERMINATE:
				return terminate != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__FLOW:
				return flow != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__SWITCH:
				return switch_ != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__WHILE:
				return while_ != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__SEQUENCE:
				return sequence != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__PICK:
				return pick != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__SCOPE:
				return scope != null;
			case ProcessPackage.TCOMPENSATION_HANDLER__COMPENSATE:
				return compensate != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TCompensationHandlerImpl
