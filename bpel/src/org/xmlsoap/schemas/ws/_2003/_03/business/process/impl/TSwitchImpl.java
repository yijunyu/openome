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

import org.xmlsoap.schemas.ws._2003._03.business.process.CaseType;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TActivityContainer;
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSwitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSwitch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSwitchImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TSwitchImpl#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSwitchImpl extends TActivityImpl implements TSwitch {
	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected EList case_ = null;

	/**
	 * The cached value of the '{@link #getOtherwise() <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwise()
	 * @generated
	 * @ordered
	 */
	protected TActivityContainer otherwise = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTSwitch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCase() {
		if (case_ == null) {
			case_ = new EObjectContainmentEList(CaseType.class, this, ProcessPackage.TSWITCH__CASE);
		}
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TActivityContainer getOtherwise() {
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(TActivityContainer newOtherwise, NotificationChain msgs) {
		TActivityContainer oldOtherwise = otherwise;
		otherwise = newOtherwise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TSWITCH__OTHERWISE, oldOtherwise, newOtherwise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(TActivityContainer newOtherwise) {
		if (newOtherwise != otherwise) {
			NotificationChain msgs = null;
			if (otherwise != null)
				msgs = ((InternalEObject)otherwise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TSWITCH__OTHERWISE, null, msgs);
			if (newOtherwise != null)
				msgs = ((InternalEObject)newOtherwise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TSWITCH__OTHERWISE, null, msgs);
			msgs = basicSetOtherwise(newOtherwise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TSWITCH__OTHERWISE, newOtherwise, newOtherwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TSWITCH__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSWITCH__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSWITCH__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSWITCH__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSWITCH__CASE:
					return ((InternalEList)getCase()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TSWITCH__OTHERWISE:
					return basicSetOtherwise(null, msgs);
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
			case ProcessPackage.TSWITCH__ANY:
				return getAny();
			case ProcessPackage.TSWITCH__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TSWITCH__TARGET:
				return getTarget();
			case ProcessPackage.TSWITCH__SOURCE:
				return getSource();
			case ProcessPackage.TSWITCH__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TSWITCH__NAME:
				return getName();
			case ProcessPackage.TSWITCH__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TSWITCH__CASE:
				return getCase();
			case ProcessPackage.TSWITCH__OTHERWISE:
				return getOtherwise();
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
			case ProcessPackage.TSWITCH__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSWITCH__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSWITCH__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSWITCH__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSWITCH__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TSWITCH__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TSWITCH__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TSWITCH__CASE:
				getCase().clear();
				getCase().addAll((Collection)newValue);
				return;
			case ProcessPackage.TSWITCH__OTHERWISE:
				setOtherwise((TActivityContainer)newValue);
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
			case ProcessPackage.TSWITCH__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TSWITCH__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TSWITCH__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TSWITCH__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TSWITCH__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TSWITCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TSWITCH__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TSWITCH__CASE:
				getCase().clear();
				return;
			case ProcessPackage.TSWITCH__OTHERWISE:
				setOtherwise((TActivityContainer)null);
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
			case ProcessPackage.TSWITCH__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TSWITCH__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TSWITCH__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TSWITCH__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TSWITCH__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TSWITCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TSWITCH__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TSWITCH__CASE:
				return case_ != null && !case_.isEmpty();
			case ProcessPackage.TSWITCH__OTHERWISE:
				return otherwise != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TSwitchImpl
