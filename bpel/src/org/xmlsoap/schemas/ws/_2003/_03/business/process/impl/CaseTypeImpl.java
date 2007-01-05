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

import org.xmlsoap.schemas.ws._2003._03.business.process.CaseType;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TAssign;
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
 * An implementation of the model object '<em><b>Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.CaseTypeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseTypeImpl extends TActivityContainerImpl implements CaseType {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getCaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CASE_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.CASE_TYPE__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.CASE_TYPE__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.CASE_TYPE__EMPTY:
					return basicSetEmpty(null, msgs);
				case ProcessPackage.CASE_TYPE__INVOKE:
					return basicSetInvoke(null, msgs);
				case ProcessPackage.CASE_TYPE__RECEIVE:
					return basicSetReceive(null, msgs);
				case ProcessPackage.CASE_TYPE__REPLY:
					return basicSetReply(null, msgs);
				case ProcessPackage.CASE_TYPE__ASSIGN:
					return basicSetAssign(null, msgs);
				case ProcessPackage.CASE_TYPE__WAIT:
					return basicSetWait(null, msgs);
				case ProcessPackage.CASE_TYPE__THROW:
					return basicSetThrow(null, msgs);
				case ProcessPackage.CASE_TYPE__TERMINATE:
					return basicSetTerminate(null, msgs);
				case ProcessPackage.CASE_TYPE__FLOW:
					return basicSetFlow(null, msgs);
				case ProcessPackage.CASE_TYPE__SWITCH:
					return basicSetSwitch(null, msgs);
				case ProcessPackage.CASE_TYPE__WHILE:
					return basicSetWhile(null, msgs);
				case ProcessPackage.CASE_TYPE__SEQUENCE:
					return basicSetSequence(null, msgs);
				case ProcessPackage.CASE_TYPE__PICK:
					return basicSetPick(null, msgs);
				case ProcessPackage.CASE_TYPE__SCOPE:
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
			case ProcessPackage.CASE_TYPE__ANY:
				return getAny();
			case ProcessPackage.CASE_TYPE__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.CASE_TYPE__EMPTY:
				return getEmpty();
			case ProcessPackage.CASE_TYPE__INVOKE:
				return getInvoke();
			case ProcessPackage.CASE_TYPE__RECEIVE:
				return getReceive();
			case ProcessPackage.CASE_TYPE__REPLY:
				return getReply();
			case ProcessPackage.CASE_TYPE__ASSIGN:
				return getAssign();
			case ProcessPackage.CASE_TYPE__WAIT:
				return getWait();
			case ProcessPackage.CASE_TYPE__THROW:
				return getThrow();
			case ProcessPackage.CASE_TYPE__TERMINATE:
				return getTerminate();
			case ProcessPackage.CASE_TYPE__FLOW:
				return getFlow();
			case ProcessPackage.CASE_TYPE__SWITCH:
				return getSwitch();
			case ProcessPackage.CASE_TYPE__WHILE:
				return getWhile();
			case ProcessPackage.CASE_TYPE__SEQUENCE:
				return getSequence();
			case ProcessPackage.CASE_TYPE__PICK:
				return getPick();
			case ProcessPackage.CASE_TYPE__SCOPE:
				return getScope();
			case ProcessPackage.CASE_TYPE__CONDITION:
				return getCondition();
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
			case ProcessPackage.CASE_TYPE__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.CASE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.CASE_TYPE__EMPTY:
				setEmpty((TEmpty)newValue);
				return;
			case ProcessPackage.CASE_TYPE__INVOKE:
				setInvoke((TInvoke)newValue);
				return;
			case ProcessPackage.CASE_TYPE__RECEIVE:
				setReceive((TReceive)newValue);
				return;
			case ProcessPackage.CASE_TYPE__REPLY:
				setReply((TReply)newValue);
				return;
			case ProcessPackage.CASE_TYPE__ASSIGN:
				setAssign((TAssign)newValue);
				return;
			case ProcessPackage.CASE_TYPE__WAIT:
				setWait((TWait)newValue);
				return;
			case ProcessPackage.CASE_TYPE__THROW:
				setThrow((TThrow)newValue);
				return;
			case ProcessPackage.CASE_TYPE__TERMINATE:
				setTerminate((TTerminate)newValue);
				return;
			case ProcessPackage.CASE_TYPE__FLOW:
				setFlow((TFlow)newValue);
				return;
			case ProcessPackage.CASE_TYPE__SWITCH:
				setSwitch((TSwitch)newValue);
				return;
			case ProcessPackage.CASE_TYPE__WHILE:
				setWhile((TWhile)newValue);
				return;
			case ProcessPackage.CASE_TYPE__SEQUENCE:
				setSequence((TSequence)newValue);
				return;
			case ProcessPackage.CASE_TYPE__PICK:
				setPick((TPick)newValue);
				return;
			case ProcessPackage.CASE_TYPE__SCOPE:
				setScope((TScope)newValue);
				return;
			case ProcessPackage.CASE_TYPE__CONDITION:
				setCondition((String)newValue);
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
			case ProcessPackage.CASE_TYPE__ANY:
				getAny().clear();
				return;
			case ProcessPackage.CASE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.CASE_TYPE__EMPTY:
				setEmpty((TEmpty)null);
				return;
			case ProcessPackage.CASE_TYPE__INVOKE:
				setInvoke((TInvoke)null);
				return;
			case ProcessPackage.CASE_TYPE__RECEIVE:
				setReceive((TReceive)null);
				return;
			case ProcessPackage.CASE_TYPE__REPLY:
				setReply((TReply)null);
				return;
			case ProcessPackage.CASE_TYPE__ASSIGN:
				setAssign((TAssign)null);
				return;
			case ProcessPackage.CASE_TYPE__WAIT:
				setWait((TWait)null);
				return;
			case ProcessPackage.CASE_TYPE__THROW:
				setThrow((TThrow)null);
				return;
			case ProcessPackage.CASE_TYPE__TERMINATE:
				setTerminate((TTerminate)null);
				return;
			case ProcessPackage.CASE_TYPE__FLOW:
				setFlow((TFlow)null);
				return;
			case ProcessPackage.CASE_TYPE__SWITCH:
				setSwitch((TSwitch)null);
				return;
			case ProcessPackage.CASE_TYPE__WHILE:
				setWhile((TWhile)null);
				return;
			case ProcessPackage.CASE_TYPE__SEQUENCE:
				setSequence((TSequence)null);
				return;
			case ProcessPackage.CASE_TYPE__PICK:
				setPick((TPick)null);
				return;
			case ProcessPackage.CASE_TYPE__SCOPE:
				setScope((TScope)null);
				return;
			case ProcessPackage.CASE_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case ProcessPackage.CASE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.CASE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.CASE_TYPE__EMPTY:
				return empty != null;
			case ProcessPackage.CASE_TYPE__INVOKE:
				return invoke != null;
			case ProcessPackage.CASE_TYPE__RECEIVE:
				return receive != null;
			case ProcessPackage.CASE_TYPE__REPLY:
				return reply != null;
			case ProcessPackage.CASE_TYPE__ASSIGN:
				return assign != null;
			case ProcessPackage.CASE_TYPE__WAIT:
				return wait != null;
			case ProcessPackage.CASE_TYPE__THROW:
				return throw_ != null;
			case ProcessPackage.CASE_TYPE__TERMINATE:
				return terminate != null;
			case ProcessPackage.CASE_TYPE__FLOW:
				return flow != null;
			case ProcessPackage.CASE_TYPE__SWITCH:
				return switch_ != null;
			case ProcessPackage.CASE_TYPE__WHILE:
				return while_ != null;
			case ProcessPackage.CASE_TYPE__SEQUENCE:
				return sequence != null;
			case ProcessPackage.CASE_TYPE__PICK:
				return pick != null;
			case ProcessPackage.CASE_TYPE__SCOPE:
				return scope != null;
			case ProcessPackage.CASE_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //CaseTypeImpl
