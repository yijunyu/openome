/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.DocumentRoot;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TFrom;
import org.xmlsoap.schemas.ws._2003._03.business.process.TProcess;
import org.xmlsoap.schemas.ws._2003._03.business.process.ToType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ProcessPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrom getFrom() {
		return (TFrom)getMixed().get(ProcessPackage.eINSTANCE.getDocumentRoot_From(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(TFrom newFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.eINSTANCE.getDocumentRoot_From(), newFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TFrom newFrom) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.eINSTANCE.getDocumentRoot_From(), newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProcess getProcess() {
		return (TProcess)getMixed().get(ProcessPackage.eINSTANCE.getDocumentRoot_Process(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(TProcess newProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.eINSTANCE.getDocumentRoot_Process(), newProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(TProcess newProcess) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.eINSTANCE.getDocumentRoot_Process(), newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToType getTo() {
		return (ToType)getMixed().get(ProcessPackage.eINSTANCE.getDocumentRoot_To(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ToType newTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.eINSTANCE.getDocumentRoot_To(), newTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ToType newTo) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.eINSTANCE.getDocumentRoot_To(), newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.DOCUMENT_ROOT__MIXED:
					return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
				case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
					return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
				case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
					return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
				case ProcessPackage.DOCUMENT_ROOT__FROM:
					return basicSetFrom(null, msgs);
				case ProcessPackage.DOCUMENT_ROOT__PROCESS:
					return basicSetProcess(null, msgs);
				case ProcessPackage.DOCUMENT_ROOT__TO:
					return basicSetTo(null, msgs);
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
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				return getMixed();
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return getXMLNSPrefixMap();
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return getXSISchemaLocation();
			case ProcessPackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case ProcessPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess();
			case ProcessPackage.DOCUMENT_ROOT__TO:
				return getTo();
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
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				getMixed().addAll((Collection)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				getXMLNSPrefixMap().addAll((Collection)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				getXSISchemaLocation().addAll((Collection)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__FROM:
				setFrom((TFrom)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((TProcess)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__TO:
				setTo((ToType)newValue);
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
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ProcessPackage.DOCUMENT_ROOT__FROM:
				setFrom((TFrom)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((TProcess)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__TO:
				setTo((ToType)null);
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
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ProcessPackage.DOCUMENT_ROOT__FROM:
				return getFrom() != null;
			case ProcessPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess() != null;
			case ProcessPackage.DOCUMENT_ROOT__TO:
				return getTo() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
