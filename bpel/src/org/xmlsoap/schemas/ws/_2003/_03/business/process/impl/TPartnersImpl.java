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
import org.xmlsoap.schemas.ws._2003._03.business.process.TPartner;
import org.xmlsoap.schemas.ws._2003._03.business.process.TPartners;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPartners</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TPartnersImpl#getPartner <em>Partner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPartnersImpl extends TExtensibleElementsImpl implements TPartners {
	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected EList partner = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPartnersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTPartners();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPartner() {
		if (partner == null) {
			partner = new EObjectContainmentEList(TPartner.class, this, ProcessPackage.TPARTNERS__PARTNER);
		}
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TPARTNERS__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPARTNERS__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPARTNERS__PARTNER:
					return ((InternalEList)getPartner()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TPARTNERS__ANY:
				return getAny();
			case ProcessPackage.TPARTNERS__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TPARTNERS__PARTNER:
				return getPartner();
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
			case ProcessPackage.TPARTNERS__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPARTNERS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPARTNERS__PARTNER:
				getPartner().clear();
				getPartner().addAll((Collection)newValue);
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
			case ProcessPackage.TPARTNERS__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TPARTNERS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TPARTNERS__PARTNER:
				getPartner().clear();
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
			case ProcessPackage.TPARTNERS__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TPARTNERS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TPARTNERS__PARTNER:
				return partner != null && !partner.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //TPartnersImpl
