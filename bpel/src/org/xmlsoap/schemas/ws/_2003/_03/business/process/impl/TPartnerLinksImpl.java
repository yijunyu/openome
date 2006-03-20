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
import org.xmlsoap.schemas.ws._2003._03.business.process.TPartnerLink;
import org.xmlsoap.schemas.ws._2003._03.business.process.TPartnerLinks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPartner Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TPartnerLinksImpl#getPartnerLink <em>Partner Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPartnerLinksImpl extends TExtensibleElementsImpl implements TPartnerLinks {
	/**
	 * The cached value of the '{@link #getPartnerLink() <em>Partner Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected EList partnerLink = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPartnerLinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTPartnerLinks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPartnerLink() {
		if (partnerLink == null) {
			partnerLink = new EObjectContainmentEList(TPartnerLink.class, this, ProcessPackage.TPARTNER_LINKS__PARTNER_LINK);
		}
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TPARTNER_LINKS__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPARTNER_LINKS__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TPARTNER_LINKS__PARTNER_LINK:
					return ((InternalEList)getPartnerLink()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TPARTNER_LINKS__ANY:
				return getAny();
			case ProcessPackage.TPARTNER_LINKS__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TPARTNER_LINKS__PARTNER_LINK:
				return getPartnerLink();
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
			case ProcessPackage.TPARTNER_LINKS__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPARTNER_LINKS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TPARTNER_LINKS__PARTNER_LINK:
				getPartnerLink().clear();
				getPartnerLink().addAll((Collection)newValue);
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
			case ProcessPackage.TPARTNER_LINKS__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TPARTNER_LINKS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TPARTNER_LINKS__PARTNER_LINK:
				getPartnerLink().clear();
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
			case ProcessPackage.TPARTNER_LINKS__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TPARTNER_LINKS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TPARTNER_LINKS__PARTNER_LINK:
				return partnerLink != null && !partnerLink.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //TPartnerLinksImpl
