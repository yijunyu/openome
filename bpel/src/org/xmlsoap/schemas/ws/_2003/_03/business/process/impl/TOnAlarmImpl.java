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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TAssign;
import org.xmlsoap.schemas.ws._2003._03.business.process.TEmpty;
import org.xmlsoap.schemas.ws._2003._03.business.process.TFlow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TInvoke;
import org.xmlsoap.schemas.ws._2003._03.business.process.TOnAlarm;
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
 * An implementation of the model object '<em><b>TOn Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TOnAlarmImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TOnAlarmImpl#getUntil <em>Until</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOnAlarmImpl extends TActivityContainerImpl implements TOnAlarm {
	/**
	 * The default value of the '{@link #getFor() <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected String for_ = FOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntil() <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntil() <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected String until = UNTIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOnAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTOnAlarm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(String newFor) {
		String oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TON_ALARM__FOR, oldFor, for_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUntil() {
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntil(String newUntil) {
		String oldUntil = until;
		until = newUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TON_ALARM__UNTIL, oldUntil, until));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TON_ALARM__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TON_ALARM__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TON_ALARM__EMPTY:
					return basicSetEmpty(null, msgs);
				case ProcessPackage.TON_ALARM__INVOKE:
					return basicSetInvoke(null, msgs);
				case ProcessPackage.TON_ALARM__RECEIVE:
					return basicSetReceive(null, msgs);
				case ProcessPackage.TON_ALARM__REPLY:
					return basicSetReply(null, msgs);
				case ProcessPackage.TON_ALARM__ASSIGN:
					return basicSetAssign(null, msgs);
				case ProcessPackage.TON_ALARM__WAIT:
					return basicSetWait(null, msgs);
				case ProcessPackage.TON_ALARM__THROW:
					return basicSetThrow(null, msgs);
				case ProcessPackage.TON_ALARM__TERMINATE:
					return basicSetTerminate(null, msgs);
				case ProcessPackage.TON_ALARM__FLOW:
					return basicSetFlow(null, msgs);
				case ProcessPackage.TON_ALARM__SWITCH:
					return basicSetSwitch(null, msgs);
				case ProcessPackage.TON_ALARM__WHILE:
					return basicSetWhile(null, msgs);
				case ProcessPackage.TON_ALARM__SEQUENCE:
					return basicSetSequence(null, msgs);
				case ProcessPackage.TON_ALARM__PICK:
					return basicSetPick(null, msgs);
				case ProcessPackage.TON_ALARM__SCOPE:
					return basicSetScope(null, msgs);
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
			case ProcessPackage.TON_ALARM__ANY:
				return getAny();
			case ProcessPackage.TON_ALARM__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TON_ALARM__EMPTY:
				return getEmpty();
			case ProcessPackage.TON_ALARM__INVOKE:
				return getInvoke();
			case ProcessPackage.TON_ALARM__RECEIVE:
				return getReceive();
			case ProcessPackage.TON_ALARM__REPLY:
				return getReply();
			case ProcessPackage.TON_ALARM__ASSIGN:
				return getAssign();
			case ProcessPackage.TON_ALARM__WAIT:
				return getWait();
			case ProcessPackage.TON_ALARM__THROW:
				return getThrow();
			case ProcessPackage.TON_ALARM__TERMINATE:
				return getTerminate();
			case ProcessPackage.TON_ALARM__FLOW:
				return getFlow();
			case ProcessPackage.TON_ALARM__SWITCH:
				return getSwitch();
			case ProcessPackage.TON_ALARM__WHILE:
				return getWhile();
			case ProcessPackage.TON_ALARM__SEQUENCE:
				return getSequence();
			case ProcessPackage.TON_ALARM__PICK:
				return getPick();
			case ProcessPackage.TON_ALARM__SCOPE:
				return getScope();
			case ProcessPackage.TON_ALARM__FOR:
				return getFor();
			case ProcessPackage.TON_ALARM__UNTIL:
				return getUntil();
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
			case ProcessPackage.TON_ALARM__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TON_ALARM__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TON_ALARM__EMPTY:
				setEmpty((TEmpty)newValue);
				return;
			case ProcessPackage.TON_ALARM__INVOKE:
				setInvoke((TInvoke)newValue);
				return;
			case ProcessPackage.TON_ALARM__RECEIVE:
				setReceive((TReceive)newValue);
				return;
			case ProcessPackage.TON_ALARM__REPLY:
				setReply((TReply)newValue);
				return;
			case ProcessPackage.TON_ALARM__ASSIGN:
				setAssign((TAssign)newValue);
				return;
			case ProcessPackage.TON_ALARM__WAIT:
				setWait((TWait)newValue);
				return;
			case ProcessPackage.TON_ALARM__THROW:
				setThrow((TThrow)newValue);
				return;
			case ProcessPackage.TON_ALARM__TERMINATE:
				setTerminate((TTerminate)newValue);
				return;
			case ProcessPackage.TON_ALARM__FLOW:
				setFlow((TFlow)newValue);
				return;
			case ProcessPackage.TON_ALARM__SWITCH:
				setSwitch((TSwitch)newValue);
				return;
			case ProcessPackage.TON_ALARM__WHILE:
				setWhile((TWhile)newValue);
				return;
			case ProcessPackage.TON_ALARM__SEQUENCE:
				setSequence((TSequence)newValue);
				return;
			case ProcessPackage.TON_ALARM__PICK:
				setPick((TPick)newValue);
				return;
			case ProcessPackage.TON_ALARM__SCOPE:
				setScope((TScope)newValue);
				return;
			case ProcessPackage.TON_ALARM__FOR:
				setFor((String)newValue);
				return;
			case ProcessPackage.TON_ALARM__UNTIL:
				setUntil((String)newValue);
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
			case ProcessPackage.TON_ALARM__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TON_ALARM__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TON_ALARM__EMPTY:
				setEmpty((TEmpty)null);
				return;
			case ProcessPackage.TON_ALARM__INVOKE:
				setInvoke((TInvoke)null);
				return;
			case ProcessPackage.TON_ALARM__RECEIVE:
				setReceive((TReceive)null);
				return;
			case ProcessPackage.TON_ALARM__REPLY:
				setReply((TReply)null);
				return;
			case ProcessPackage.TON_ALARM__ASSIGN:
				setAssign((TAssign)null);
				return;
			case ProcessPackage.TON_ALARM__WAIT:
				setWait((TWait)null);
				return;
			case ProcessPackage.TON_ALARM__THROW:
				setThrow((TThrow)null);
				return;
			case ProcessPackage.TON_ALARM__TERMINATE:
				setTerminate((TTerminate)null);
				return;
			case ProcessPackage.TON_ALARM__FLOW:
				setFlow((TFlow)null);
				return;
			case ProcessPackage.TON_ALARM__SWITCH:
				setSwitch((TSwitch)null);
				return;
			case ProcessPackage.TON_ALARM__WHILE:
				setWhile((TWhile)null);
				return;
			case ProcessPackage.TON_ALARM__SEQUENCE:
				setSequence((TSequence)null);
				return;
			case ProcessPackage.TON_ALARM__PICK:
				setPick((TPick)null);
				return;
			case ProcessPackage.TON_ALARM__SCOPE:
				setScope((TScope)null);
				return;
			case ProcessPackage.TON_ALARM__FOR:
				setFor(FOR_EDEFAULT);
				return;
			case ProcessPackage.TON_ALARM__UNTIL:
				setUntil(UNTIL_EDEFAULT);
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
			case ProcessPackage.TON_ALARM__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TON_ALARM__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TON_ALARM__EMPTY:
				return empty != null;
			case ProcessPackage.TON_ALARM__INVOKE:
				return invoke != null;
			case ProcessPackage.TON_ALARM__RECEIVE:
				return receive != null;
			case ProcessPackage.TON_ALARM__REPLY:
				return reply != null;
			case ProcessPackage.TON_ALARM__ASSIGN:
				return assign != null;
			case ProcessPackage.TON_ALARM__WAIT:
				return wait != null;
			case ProcessPackage.TON_ALARM__THROW:
				return throw_ != null;
			case ProcessPackage.TON_ALARM__TERMINATE:
				return terminate != null;
			case ProcessPackage.TON_ALARM__FLOW:
				return flow != null;
			case ProcessPackage.TON_ALARM__SWITCH:
				return switch_ != null;
			case ProcessPackage.TON_ALARM__WHILE:
				return while_ != null;
			case ProcessPackage.TON_ALARM__SEQUENCE:
				return sequence != null;
			case ProcessPackage.TON_ALARM__PICK:
				return pick != null;
			case ProcessPackage.TON_ALARM__SCOPE:
				return scope != null;
			case ProcessPackage.TON_ALARM__FOR:
				return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
			case ProcessPackage.TON_ALARM__UNTIL:
				return UNTIL_EDEFAULT == null ? until != null : !UNTIL_EDEFAULT.equals(until);
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
		result.append(" (for: ");
		result.append(for_);
		result.append(", until: ");
		result.append(until);
		result.append(')');
		return result.toString();
	}

} //TOnAlarmImpl
