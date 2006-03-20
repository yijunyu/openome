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
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TTerminate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTerminate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TTerminateImpl extends TActivityImpl implements TTerminate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTerminateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTTerminate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TTERMINATE__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TTERMINATE__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TTERMINATE__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TTERMINATE__SOURCE:
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
			case ProcessPackage.TTERMINATE__ANY:
				return getAny();
			case ProcessPackage.TTERMINATE__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TTERMINATE__TARGET:
				return getTarget();
			case ProcessPackage.TTERMINATE__SOURCE:
				return getSource();
			case ProcessPackage.TTERMINATE__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TTERMINATE__NAME:
				return getName();
			case ProcessPackage.TTERMINATE__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
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
			case ProcessPackage.TTERMINATE__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TTERMINATE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TTERMINATE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TTERMINATE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TTERMINATE__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TTERMINATE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TTERMINATE__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
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
			case ProcessPackage.TTERMINATE__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TTERMINATE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TTERMINATE__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TTERMINATE__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TTERMINATE__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TTERMINATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TTERMINATE__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
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
			case ProcessPackage.TTERMINATE__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TTERMINATE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TTERMINATE__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TTERMINATE__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TTERMINATE__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TTERMINATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TTERMINATE__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
		}
		return eDynamicIsSet(eFeature);
	}

} //TTerminateImpl
