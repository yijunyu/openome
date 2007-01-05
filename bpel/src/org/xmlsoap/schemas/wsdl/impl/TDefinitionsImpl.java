/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.wsdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.wsdl.TDefinitions;
import org.xmlsoap.schemas.wsdl.TDocumentation;
import org.xmlsoap.schemas.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getAnyTopLevelOptionalElement <em>Any Top Level Optional Element</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.wsdl.impl.TDefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDefinitionsImpl extends TExtensibleDocumentedImpl implements TDefinitions {
	/**
	 * The cached value of the '{@link #getAnyTopLevelOptionalElement() <em>Any Top Level Optional Element</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyTopLevelOptionalElement()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyTopLevelOptionalElement = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WsdlPackage.eINSTANCE.getTDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyTopLevelOptionalElement() {
		if (anyTopLevelOptionalElement == null) {
			anyTopLevelOptionalElement = new BasicFeatureMap(this, WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT);
		}
		return anyTopLevelOptionalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImport() {
		return ((FeatureMap)getAnyTopLevelOptionalElement()).list(WsdlPackage.eINSTANCE.getTDefinitions_Import());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypes() {
		return ((FeatureMap)getAnyTopLevelOptionalElement()).list(WsdlPackage.eINSTANCE.getTDefinitions_Types());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessage() {
		return ((FeatureMap)getAnyTopLevelOptionalElement()).list(WsdlPackage.eINSTANCE.getTDefinitions_Message());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPortType() {
		return ((FeatureMap)getAnyTopLevelOptionalElement()).list(WsdlPackage.eINSTANCE.getTDefinitions_PortType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBinding() {
		return ((FeatureMap)getAnyTopLevelOptionalElement()).list(WsdlPackage.eINSTANCE.getTDefinitions_Binding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getService() {
		return ((FeatureMap)getAnyTopLevelOptionalElement()).list(WsdlPackage.eINSTANCE.getTDefinitions_Service());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.TDEFINITIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.TDEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WsdlPackage.TDEFINITIONS__DOCUMENTATION:
					return basicSetDocumentation(null, msgs);
				case WsdlPackage.TDEFINITIONS__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT:
					return ((InternalEList)getAnyTopLevelOptionalElement()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__IMPORT:
					return ((InternalEList)getImport()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__TYPES:
					return ((InternalEList)getTypes()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__MESSAGE:
					return ((InternalEList)getMessage()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__PORT_TYPE:
					return ((InternalEList)getPortType()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__BINDING:
					return ((InternalEList)getBinding()).basicRemove(otherEnd, msgs);
				case WsdlPackage.TDEFINITIONS__SERVICE:
					return ((InternalEList)getService()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.TDEFINITIONS__DOCUMENTATION:
				return getDocumentation();
			case WsdlPackage.TDEFINITIONS__ANY:
				return getAny();
			case WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT:
				return getAnyTopLevelOptionalElement();
			case WsdlPackage.TDEFINITIONS__IMPORT:
				return getImport();
			case WsdlPackage.TDEFINITIONS__TYPES:
				return getTypes();
			case WsdlPackage.TDEFINITIONS__MESSAGE:
				return getMessage();
			case WsdlPackage.TDEFINITIONS__PORT_TYPE:
				return getPortType();
			case WsdlPackage.TDEFINITIONS__BINDING:
				return getBinding();
			case WsdlPackage.TDEFINITIONS__SERVICE:
				return getService();
			case WsdlPackage.TDEFINITIONS__NAME:
				return getName();
			case WsdlPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case WsdlPackage.TDEFINITIONS__DOCUMENTATION:
				setDocumentation((TDocumentation)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT:
				getAnyTopLevelOptionalElement().clear();
				getAnyTopLevelOptionalElement().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__PORT_TYPE:
				getPortType().clear();
				getPortType().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__SERVICE:
				getService().clear();
				getService().addAll((Collection)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.TDEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case WsdlPackage.TDEFINITIONS__DOCUMENTATION:
				setDocumentation((TDocumentation)null);
				return;
			case WsdlPackage.TDEFINITIONS__ANY:
				getAny().clear();
				return;
			case WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT:
				getAnyTopLevelOptionalElement().clear();
				return;
			case WsdlPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				return;
			case WsdlPackage.TDEFINITIONS__TYPES:
				getTypes().clear();
				return;
			case WsdlPackage.TDEFINITIONS__MESSAGE:
				getMessage().clear();
				return;
			case WsdlPackage.TDEFINITIONS__PORT_TYPE:
				getPortType().clear();
				return;
			case WsdlPackage.TDEFINITIONS__BINDING:
				getBinding().clear();
				return;
			case WsdlPackage.TDEFINITIONS__SERVICE:
				getService().clear();
				return;
			case WsdlPackage.TDEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.TDEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
			case WsdlPackage.TDEFINITIONS__DOCUMENTATION:
				return documentation != null;
			case WsdlPackage.TDEFINITIONS__ANY:
				return any != null && !any.isEmpty();
			case WsdlPackage.TDEFINITIONS__ANY_TOP_LEVEL_OPTIONAL_ELEMENT:
				return anyTopLevelOptionalElement != null && !anyTopLevelOptionalElement.isEmpty();
			case WsdlPackage.TDEFINITIONS__IMPORT:
				return !getImport().isEmpty();
			case WsdlPackage.TDEFINITIONS__TYPES:
				return !getTypes().isEmpty();
			case WsdlPackage.TDEFINITIONS__MESSAGE:
				return !getMessage().isEmpty();
			case WsdlPackage.TDEFINITIONS__PORT_TYPE:
				return !getPortType().isEmpty();
			case WsdlPackage.TDEFINITIONS__BINDING:
				return !getBinding().isEmpty();
			case WsdlPackage.TDEFINITIONS__SERVICE:
				return !getService().isEmpty();
			case WsdlPackage.TDEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
		result.append(" (anyTopLevelOptionalElement: ");
		result.append(anyTopLevelOptionalElement);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //TDefinitionsImpl
