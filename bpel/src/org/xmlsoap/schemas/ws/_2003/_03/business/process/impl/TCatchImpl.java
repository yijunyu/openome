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
import org.xmlsoap.schemas.ws._2003._03.business.process.TCatch;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCompensate;
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
 * An implementation of the model object '<em><b>TCatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TCatchImpl#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TCatchImpl#getFaultVariable <em>Fault Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCatchImpl extends TActivityOrCompensateContainerImpl implements TCatch {
	/**
	 * The default value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected static final Object FAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected Object faultName = FAULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultVariable() <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultVariable() <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultVariable()
	 * @generated
	 * @ordered
	 */
	protected String faultVariable = FAULT_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTCatch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFaultName() {
		return faultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultName(Object newFaultName) {
		Object oldFaultName = faultName;
		faultName = newFaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TCATCH__FAULT_NAME, oldFaultName, faultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultVariable() {
		return faultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultVariable(String newFaultVariable) {
		String oldFaultVariable = faultVariable;
		faultVariable = newFaultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TCATCH__FAULT_VARIABLE, oldFaultVariable, faultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TCATCH__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCATCH__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCATCH__EMPTY:
					return basicSetEmpty(null, msgs);
				case ProcessPackage.TCATCH__INVOKE:
					return basicSetInvoke(null, msgs);
				case ProcessPackage.TCATCH__RECEIVE:
					return basicSetReceive(null, msgs);
				case ProcessPackage.TCATCH__REPLY:
					return basicSetReply(null, msgs);
				case ProcessPackage.TCATCH__ASSIGN:
					return basicSetAssign(null, msgs);
				case ProcessPackage.TCATCH__WAIT:
					return basicSetWait(null, msgs);
				case ProcessPackage.TCATCH__THROW:
					return basicSetThrow(null, msgs);
				case ProcessPackage.TCATCH__TERMINATE:
					return basicSetTerminate(null, msgs);
				case ProcessPackage.TCATCH__FLOW:
					return basicSetFlow(null, msgs);
				case ProcessPackage.TCATCH__SWITCH:
					return basicSetSwitch(null, msgs);
				case ProcessPackage.TCATCH__WHILE:
					return basicSetWhile(null, msgs);
				case ProcessPackage.TCATCH__SEQUENCE:
					return basicSetSequence(null, msgs);
				case ProcessPackage.TCATCH__PICK:
					return basicSetPick(null, msgs);
				case ProcessPackage.TCATCH__SCOPE:
					return basicSetScope(null, msgs);
				case ProcessPackage.TCATCH__COMPENSATE:
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
			case ProcessPackage.TCATCH__ANY:
				return getAny();
			case ProcessPackage.TCATCH__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TCATCH__EMPTY:
				return getEmpty();
			case ProcessPackage.TCATCH__INVOKE:
				return getInvoke();
			case ProcessPackage.TCATCH__RECEIVE:
				return getReceive();
			case ProcessPackage.TCATCH__REPLY:
				return getReply();
			case ProcessPackage.TCATCH__ASSIGN:
				return getAssign();
			case ProcessPackage.TCATCH__WAIT:
				return getWait();
			case ProcessPackage.TCATCH__THROW:
				return getThrow();
			case ProcessPackage.TCATCH__TERMINATE:
				return getTerminate();
			case ProcessPackage.TCATCH__FLOW:
				return getFlow();
			case ProcessPackage.TCATCH__SWITCH:
				return getSwitch();
			case ProcessPackage.TCATCH__WHILE:
				return getWhile();
			case ProcessPackage.TCATCH__SEQUENCE:
				return getSequence();
			case ProcessPackage.TCATCH__PICK:
				return getPick();
			case ProcessPackage.TCATCH__SCOPE:
				return getScope();
			case ProcessPackage.TCATCH__COMPENSATE:
				return getCompensate();
			case ProcessPackage.TCATCH__FAULT_NAME:
				return getFaultName();
			case ProcessPackage.TCATCH__FAULT_VARIABLE:
				return getFaultVariable();
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
			case ProcessPackage.TCATCH__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCATCH__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCATCH__EMPTY:
				setEmpty((TEmpty)newValue);
				return;
			case ProcessPackage.TCATCH__INVOKE:
				setInvoke((TInvoke)newValue);
				return;
			case ProcessPackage.TCATCH__RECEIVE:
				setReceive((TReceive)newValue);
				return;
			case ProcessPackage.TCATCH__REPLY:
				setReply((TReply)newValue);
				return;
			case ProcessPackage.TCATCH__ASSIGN:
				setAssign((TAssign)newValue);
				return;
			case ProcessPackage.TCATCH__WAIT:
				setWait((TWait)newValue);
				return;
			case ProcessPackage.TCATCH__THROW:
				setThrow((TThrow)newValue);
				return;
			case ProcessPackage.TCATCH__TERMINATE:
				setTerminate((TTerminate)newValue);
				return;
			case ProcessPackage.TCATCH__FLOW:
				setFlow((TFlow)newValue);
				return;
			case ProcessPackage.TCATCH__SWITCH:
				setSwitch((TSwitch)newValue);
				return;
			case ProcessPackage.TCATCH__WHILE:
				setWhile((TWhile)newValue);
				return;
			case ProcessPackage.TCATCH__SEQUENCE:
				setSequence((TSequence)newValue);
				return;
			case ProcessPackage.TCATCH__PICK:
				setPick((TPick)newValue);
				return;
			case ProcessPackage.TCATCH__SCOPE:
				setScope((TScope)newValue);
				return;
			case ProcessPackage.TCATCH__COMPENSATE:
				setCompensate((TCompensate)newValue);
				return;
			case ProcessPackage.TCATCH__FAULT_NAME:
				setFaultName((Object)newValue);
				return;
			case ProcessPackage.TCATCH__FAULT_VARIABLE:
				setFaultVariable((String)newValue);
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
			case ProcessPackage.TCATCH__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TCATCH__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TCATCH__EMPTY:
				setEmpty((TEmpty)null);
				return;
			case ProcessPackage.TCATCH__INVOKE:
				setInvoke((TInvoke)null);
				return;
			case ProcessPackage.TCATCH__RECEIVE:
				setReceive((TReceive)null);
				return;
			case ProcessPackage.TCATCH__REPLY:
				setReply((TReply)null);
				return;
			case ProcessPackage.TCATCH__ASSIGN:
				setAssign((TAssign)null);
				return;
			case ProcessPackage.TCATCH__WAIT:
				setWait((TWait)null);
				return;
			case ProcessPackage.TCATCH__THROW:
				setThrow((TThrow)null);
				return;
			case ProcessPackage.TCATCH__TERMINATE:
				setTerminate((TTerminate)null);
				return;
			case ProcessPackage.TCATCH__FLOW:
				setFlow((TFlow)null);
				return;
			case ProcessPackage.TCATCH__SWITCH:
				setSwitch((TSwitch)null);
				return;
			case ProcessPackage.TCATCH__WHILE:
				setWhile((TWhile)null);
				return;
			case ProcessPackage.TCATCH__SEQUENCE:
				setSequence((TSequence)null);
				return;
			case ProcessPackage.TCATCH__PICK:
				setPick((TPick)null);
				return;
			case ProcessPackage.TCATCH__SCOPE:
				setScope((TScope)null);
				return;
			case ProcessPackage.TCATCH__COMPENSATE:
				setCompensate((TCompensate)null);
				return;
			case ProcessPackage.TCATCH__FAULT_NAME:
				setFaultName(FAULT_NAME_EDEFAULT);
				return;
			case ProcessPackage.TCATCH__FAULT_VARIABLE:
				setFaultVariable(FAULT_VARIABLE_EDEFAULT);
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
			case ProcessPackage.TCATCH__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TCATCH__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TCATCH__EMPTY:
				return empty != null;
			case ProcessPackage.TCATCH__INVOKE:
				return invoke != null;
			case ProcessPackage.TCATCH__RECEIVE:
				return receive != null;
			case ProcessPackage.TCATCH__REPLY:
				return reply != null;
			case ProcessPackage.TCATCH__ASSIGN:
				return assign != null;
			case ProcessPackage.TCATCH__WAIT:
				return wait != null;
			case ProcessPackage.TCATCH__THROW:
				return throw_ != null;
			case ProcessPackage.TCATCH__TERMINATE:
				return terminate != null;
			case ProcessPackage.TCATCH__FLOW:
				return flow != null;
			case ProcessPackage.TCATCH__SWITCH:
				return switch_ != null;
			case ProcessPackage.TCATCH__WHILE:
				return while_ != null;
			case ProcessPackage.TCATCH__SEQUENCE:
				return sequence != null;
			case ProcessPackage.TCATCH__PICK:
				return pick != null;
			case ProcessPackage.TCATCH__SCOPE:
				return scope != null;
			case ProcessPackage.TCATCH__COMPENSATE:
				return compensate != null;
			case ProcessPackage.TCATCH__FAULT_NAME:
				return FAULT_NAME_EDEFAULT == null ? faultName != null : !FAULT_NAME_EDEFAULT.equals(faultName);
			case ProcessPackage.TCATCH__FAULT_VARIABLE:
				return FAULT_VARIABLE_EDEFAULT == null ? faultVariable != null : !FAULT_VARIABLE_EDEFAULT.equals(faultVariable);
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
		result.append(" (faultName: ");
		result.append(faultName);
		result.append(", faultVariable: ");
		result.append(faultVariable);
		result.append(')');
		return result.toString();
	}

} //TCatchImpl
