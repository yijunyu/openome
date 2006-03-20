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
import org.xmlsoap.schemas.ws._2003._03.business.process.TCorrelation;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCorrelations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCorrelations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TCorrelationsImpl#getCorrelation <em>Correlation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCorrelationsImpl extends TExtensibleElementsImpl implements TCorrelations {
	/**
	 * The cached value of the '{@link #getCorrelation() <em>Correlation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelation()
	 * @generated
	 * @ordered
	 */
	protected EList correlation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCorrelationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTCorrelations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCorrelation() {
		if (correlation == null) {
			correlation = new EObjectContainmentEList(TCorrelation.class, this, ProcessPackage.TCORRELATIONS__CORRELATION);
		}
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TCORRELATIONS__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCORRELATIONS__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TCORRELATIONS__CORRELATION:
					return ((InternalEList)getCorrelation()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TCORRELATIONS__ANY:
				return getAny();
			case ProcessPackage.TCORRELATIONS__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TCORRELATIONS__CORRELATION:
				return getCorrelation();
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
			case ProcessPackage.TCORRELATIONS__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCORRELATIONS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TCORRELATIONS__CORRELATION:
				getCorrelation().clear();
				getCorrelation().addAll((Collection)newValue);
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
			case ProcessPackage.TCORRELATIONS__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TCORRELATIONS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TCORRELATIONS__CORRELATION:
				getCorrelation().clear();
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
			case ProcessPackage.TCORRELATIONS__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TCORRELATIONS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TCORRELATIONS__CORRELATION:
				return correlation != null && !correlation.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //TCorrelationsImpl