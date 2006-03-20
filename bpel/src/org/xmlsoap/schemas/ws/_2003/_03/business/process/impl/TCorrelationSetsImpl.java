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
import org.xmlsoap.schemas.ws._2003._03.business.process.TCorrelationSet;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCorrelationSets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCorrelation Sets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TCorrelationSetsImpl#getCorrelationSet <em>Correlation Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCorrelationSetsImpl extends TExtensibleElementsImpl implements TCorrelationSets {
	/**
	 * The cached value of the '{@link #getCorrelationSet() <em>Correlation Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSet()
	 * @generated
	 * @ordered
	 */
	protected EList correlationSet = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCorrelationSetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTCorrelationSets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCorrelationSet() {
		if (correlationSet == null) {
			correlationSet = new EObjectContainmentEList(TCorrelationSet.class, this, ProcessPackage.TCORRELATION_SETS__CORRELATION_SET);
		}
		return correlationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TCORRELATION_SETS__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCORRELATION_SETS__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCORRELATION_SETS__CORRELATION_SET:
					return ((InternalEList)getCorrelationSet()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TCORRELATION_SETS__ANY:
				return getAny();
			case ProcessPackage.TCORRELATION_SETS__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TCORRELATION_SETS__CORRELATION_SET:
				return getCorrelationSet();
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
			case ProcessPackage.TCORRELATION_SETS__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCORRELATION_SETS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCORRELATION_SETS__CORRELATION_SET:
				getCorrelationSet().clear();
				getCorrelationSet().addAll((Collection)newValue);
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
			case ProcessPackage.TCORRELATION_SETS__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TCORRELATION_SETS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TCORRELATION_SETS__CORRELATION_SET:
				getCorrelationSet().clear();
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
			case ProcessPackage.TCORRELATION_SETS__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TCORRELATION_SETS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TCORRELATION_SETS__CORRELATION_SET:
				return correlationSet != null && !correlationSet.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //TCorrelationSetsImpl
