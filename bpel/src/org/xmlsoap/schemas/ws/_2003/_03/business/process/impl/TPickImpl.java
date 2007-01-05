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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TOnAlarm;
import org.xmlsoap.schemas.ws._2003._03.business.process.TOnMessage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TPick;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TPickImpl#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TPickImpl#getOnAlarm <em>On Alarm</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TPickImpl#getCreateInstance <em>Create Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPickImpl extends TActivityImpl implements TPick {
	/**
	 * The cached value of the '{@link #getOnMessage() <em>On Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMessage()
	 * @generated
	 * @ordered
	 */
	protected EList onMessage = null;

	/**
	 * The cached value of the '{@link #getOnAlarm() <em>On Alarm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList onAlarm = null;

	/**
	 * The default value of the '{@link #getCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected static final TBoolean CREATE_INSTANCE_EDEFAULT = TBoolean.NO_LITERAL;

	/**
	 * The cached value of the '{@link #getCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected TBoolean createInstance = CREATE_INSTANCE_EDEFAULT;

	/**
	 * This is true if the Create Instance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createInstanceESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTPick();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOnMessage() {
		if (onMessage == null) {
			onMessage = new EObjectContainmentEList(TOnMessage.class, this, ProcessPackage.TPICK__ON_MESSAGE);
		}
		return onMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOnAlarm() {
		if (onAlarm == null) {
			onAlarm = new EObjectContainmentEList(TOnAlarm.class, this, ProcessPackage.TPICK__ON_ALARM);
		}
		return onAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean getCreateInstance() {
		return createInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateInstance(TBoolean newCreateInstance) {
		TBoolean oldCreateInstance = createInstance;
		createInstance = newCreateInstance == null ? CREATE_INSTANCE_EDEFAULT : newCreateInstance;
		boolean oldCreateInstanceESet = createInstanceESet;
		createInstanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TPICK__CREATE_INSTANCE, oldCreateInstance, createInstance, !oldCreateInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateInstance() {
		TBoolean oldCreateInstance = createInstance;
		boolean oldCreateInstanceESet = createInstanceESet;
		createInstance = CREATE_INSTANCE_EDEFAULT;
		createInstanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.TPICK__CREATE_INSTANCE, oldCreateInstance, CREATE_INSTANCE_EDEFAULT, oldCreateInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateInstance() {
		return createInstanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TPICK__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPICK__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPICK__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPICK__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPICK__ON_MESSAGE:
					return ((InternalEList)getOnMessage()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPICK__ON_ALARM:
					return ((InternalEList)getOnAlarm()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TPICK__ANY:
				return getAny();
			case ProcessPackage.TPICK__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TPICK__TARGET:
				return getTarget();
			case ProcessPackage.TPICK__SOURCE:
				return getSource();
			case ProcessPackage.TPICK__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TPICK__NAME:
				return getName();
			case ProcessPackage.TPICK__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TPICK__ON_MESSAGE:
				return getOnMessage();
			case ProcessPackage.TPICK__ON_ALARM:
				return getOnAlarm();
			case ProcessPackage.TPICK__CREATE_INSTANCE:
				return getCreateInstance();
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
			case ProcessPackage.TPICK__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPICK__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPICK__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPICK__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPICK__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TPICK__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TPICK__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TPICK__ON_MESSAGE:
				getOnMessage().clear();
				getOnMessage().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPICK__ON_ALARM:
				getOnAlarm().clear();
				getOnAlarm().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPICK__CREATE_INSTANCE:
				setCreateInstance((TBoolean)newValue);
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
			case ProcessPackage.TPICK__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TPICK__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TPICK__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TPICK__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TPICK__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TPICK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TPICK__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TPICK__ON_MESSAGE:
				getOnMessage().clear();
				return;
			case ProcessPackage.TPICK__ON_ALARM:
				getOnAlarm().clear();
				return;
			case ProcessPackage.TPICK__CREATE_INSTANCE:
				unsetCreateInstance();
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
			case ProcessPackage.TPICK__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TPICK__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TPICK__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TPICK__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TPICK__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TPICK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TPICK__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TPICK__ON_MESSAGE:
				return onMessage != null && !onMessage.isEmpty();
			case ProcessPackage.TPICK__ON_ALARM:
				return onAlarm != null && !onAlarm.isEmpty();
			case ProcessPackage.TPICK__CREATE_INSTANCE:
				return isSetCreateInstance();
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
		result.append(" (createInstance: ");
		if (createInstanceESet) result.append(createInstance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TPickImpl
