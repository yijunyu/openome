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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TEventHandlers;
import org.xmlsoap.schemas.ws._2003._03.business.process.TOnAlarm;
import org.xmlsoap.schemas.ws._2003._03.business.process.TOnMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEvent Handlers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TEventHandlersImpl#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TEventHandlersImpl#getOnAlarm <em>On Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TEventHandlersImpl extends TExtensibleElementsImpl implements TEventHandlers {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEventHandlersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTEventHandlers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOnMessage() {
		if (onMessage == null) {
			onMessage = new EObjectContainmentEList(TOnMessage.class, this, ProcessPackage.TEVENT_HANDLERS__ON_MESSAGE);
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
			onAlarm = new EObjectContainmentEList(TOnAlarm.class, this, ProcessPackage.TEVENT_HANDLERS__ON_ALARM);
		}
		return onAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TEVENT_HANDLERS__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TEVENT_HANDLERS__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TEVENT_HANDLERS__ON_MESSAGE:
					return ((InternalEList)getOnMessage()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TEVENT_HANDLERS__ON_ALARM:
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
			case ProcessPackage.TEVENT_HANDLERS__ANY:
				return getAny();
			case ProcessPackage.TEVENT_HANDLERS__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TEVENT_HANDLERS__ON_MESSAGE:
				return getOnMessage();
			case ProcessPackage.TEVENT_HANDLERS__ON_ALARM:
				return getOnAlarm();
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
			case ProcessPackage.TEVENT_HANDLERS__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TEVENT_HANDLERS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TEVENT_HANDLERS__ON_MESSAGE:
				getOnMessage().clear();
				getOnMessage().addAll((Collection)newValue);
				return;
			case ProcessPackage.TEVENT_HANDLERS__ON_ALARM:
				getOnAlarm().clear();
				getOnAlarm().addAll((Collection)newValue);
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
			case ProcessPackage.TEVENT_HANDLERS__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TEVENT_HANDLERS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TEVENT_HANDLERS__ON_MESSAGE:
				getOnMessage().clear();
				return;
			case ProcessPackage.TEVENT_HANDLERS__ON_ALARM:
				getOnAlarm().clear();
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
			case ProcessPackage.TEVENT_HANDLERS__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TEVENT_HANDLERS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TEVENT_HANDLERS__ON_MESSAGE:
				return onMessage != null && !onMessage.isEmpty();
			case ProcessPackage.TEVENT_HANDLERS__ON_ALARM:
				return onAlarm != null && !onAlarm.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //TEventHandlersImpl
