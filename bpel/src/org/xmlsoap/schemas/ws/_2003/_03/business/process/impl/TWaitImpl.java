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
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TWait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TWait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TWaitImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TWaitImpl#getUntil <em>Until</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TWaitImpl extends TActivityImpl implements TWait {
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
	protected TWaitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTWait();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TWAIT__FOR, oldFor, for_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TWAIT__UNTIL, oldUntil, until));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TWAIT__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TWAIT__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TWAIT__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TWAIT__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TWAIT__ANY:
				return getAny();
			case ProcessPackage.TWAIT__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TWAIT__TARGET:
				return getTarget();
			case ProcessPackage.TWAIT__SOURCE:
				return getSource();
			case ProcessPackage.TWAIT__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TWAIT__NAME:
				return getName();
			case ProcessPackage.TWAIT__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TWAIT__FOR:
				return getFor();
			case ProcessPackage.TWAIT__UNTIL:
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
			case ProcessPackage.TWAIT__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TWAIT__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TWAIT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TWAIT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TWAIT__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TWAIT__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TWAIT__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TWAIT__FOR:
				setFor((String)newValue);
				return;
			case ProcessPackage.TWAIT__UNTIL:
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
			case ProcessPackage.TWAIT__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TWAIT__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TWAIT__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TWAIT__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TWAIT__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TWAIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TWAIT__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TWAIT__FOR:
				setFor(FOR_EDEFAULT);
				return;
			case ProcessPackage.TWAIT__UNTIL:
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
			case ProcessPackage.TWAIT__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TWAIT__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TWAIT__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TWAIT__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TWAIT__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TWAIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TWAIT__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TWAIT__FOR:
				return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
			case ProcessPackage.TWAIT__UNTIL:
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

} //TWaitImpl
