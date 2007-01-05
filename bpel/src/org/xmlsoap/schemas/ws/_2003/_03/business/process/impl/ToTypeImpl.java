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
import org.xmlsoap.schemas.ws._2003._03.business.process.TRoles;
import org.xmlsoap.schemas.ws._2003._03.business.process.ToType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ToTypeImpl extends TFromImpl implements ToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TO_TYPE__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TO_TYPE__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TO_TYPE__ANY:
				return getAny();
			case ProcessPackage.TO_TYPE__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TO_TYPE__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case ProcessPackage.TO_TYPE__EXPRESSION:
				return getExpression();
			case ProcessPackage.TO_TYPE__OPAQUE:
				return getOpaque();
			case ProcessPackage.TO_TYPE__PART:
				return getPart();
			case ProcessPackage.TO_TYPE__PARTNER_LINK:
				return getPartnerLink();
			case ProcessPackage.TO_TYPE__PROPERTY:
				return getProperty();
			case ProcessPackage.TO_TYPE__QUERY:
				return getQuery();
			case ProcessPackage.TO_TYPE__VARIABLE:
				return getVariable();
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
			case ProcessPackage.TO_TYPE__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TO_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TO_TYPE__ENDPOINT_REFERENCE:
				setEndpointReference((TRoles)newValue);
				return;
			case ProcessPackage.TO_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case ProcessPackage.TO_TYPE__OPAQUE:
				setOpaque((TBoolean)newValue);
				return;
			case ProcessPackage.TO_TYPE__PART:
				setPart((String)newValue);
				return;
			case ProcessPackage.TO_TYPE__PARTNER_LINK:
				setPartnerLink((String)newValue);
				return;
			case ProcessPackage.TO_TYPE__PROPERTY:
				setProperty((Object)newValue);
				return;
			case ProcessPackage.TO_TYPE__QUERY:
				setQuery((String)newValue);
				return;
			case ProcessPackage.TO_TYPE__VARIABLE:
				setVariable((String)newValue);
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
			case ProcessPackage.TO_TYPE__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TO_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TO_TYPE__ENDPOINT_REFERENCE:
				unsetEndpointReference();
				return;
			case ProcessPackage.TO_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case ProcessPackage.TO_TYPE__OPAQUE:
				unsetOpaque();
				return;
			case ProcessPackage.TO_TYPE__PART:
				setPart(PART_EDEFAULT);
				return;
			case ProcessPackage.TO_TYPE__PARTNER_LINK:
				setPartnerLink(PARTNER_LINK_EDEFAULT);
				return;
			case ProcessPackage.TO_TYPE__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case ProcessPackage.TO_TYPE__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case ProcessPackage.TO_TYPE__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
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
			case ProcessPackage.TO_TYPE__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TO_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TO_TYPE__ENDPOINT_REFERENCE:
				return isSetEndpointReference();
			case ProcessPackage.TO_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case ProcessPackage.TO_TYPE__OPAQUE:
				return isSetOpaque();
			case ProcessPackage.TO_TYPE__PART:
				return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
			case ProcessPackage.TO_TYPE__PARTNER_LINK:
				return PARTNER_LINK_EDEFAULT == null ? partnerLink != null : !PARTNER_LINK_EDEFAULT.equals(partnerLink);
			case ProcessPackage.TO_TYPE__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case ProcessPackage.TO_TYPE__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case ProcessPackage.TO_TYPE__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
		}
		return eDynamicIsSet(eFeature);
	}

} //ToTypeImpl
