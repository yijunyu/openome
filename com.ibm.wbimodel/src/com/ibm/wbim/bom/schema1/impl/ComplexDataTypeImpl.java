/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Attribute;
import com.ibm.wbim.bom.schema1.ComplexDataType;
import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl#getParentTemplate <em>Parent Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexDataTypeImpl extends EObjectImpl implements ComplexDataType {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList attribute = null;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList rule = null;

	/**
	 * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAttributes()
	 * @generated
	 * @ordered
	 */
	protected ExtendedAttributes extendedAttributes = null;

	/**
	 * The default value of the '{@link #getParentTemplate() <em>Parent Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentTemplate() <em>Parent Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTemplate()
	 * @generated
	 * @ordered
	 */
	protected String parentTemplate = PARENT_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getComplexDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList(Attribute.class, this, Schema1Package.COMPLEX_DATA_TYPE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList(Expression.class, this, Schema1Package.COMPLEX_DATA_TYPE__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributes getExtendedAttributes() {
		return extendedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedAttributes(ExtendedAttributes newExtendedAttributes, NotificationChain msgs) {
		ExtendedAttributes oldExtendedAttributes = extendedAttributes;
		extendedAttributes = newExtendedAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES, oldExtendedAttributes, newExtendedAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedAttributes(ExtendedAttributes newExtendedAttributes) {
		if (newExtendedAttributes != extendedAttributes) {
			NotificationChain msgs = null;
			if (extendedAttributes != null)
				msgs = ((InternalEObject)extendedAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES, null, msgs);
			if (newExtendedAttributes != null)
				msgs = ((InternalEObject)newExtendedAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES, null, msgs);
			msgs = basicSetExtendedAttributes(newExtendedAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES, newExtendedAttributes, newExtendedAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentTemplate() {
		return parentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTemplate(String newParentTemplate) {
		String oldParentTemplate = parentTemplate;
		parentTemplate = newParentTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE__PARENT_TEMPLATE, oldParentTemplate, parentTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.COMPLEX_DATA_TYPE__ATTRIBUTE:
					return ((InternalEList)getAttribute()).basicRemove(otherEnd, msgs);
				case Schema1Package.COMPLEX_DATA_TYPE__RULE:
					return ((InternalEList)getRule()).basicRemove(otherEnd, msgs);
				case Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
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
			case Schema1Package.COMPLEX_DATA_TYPE__DOCUMENTATION:
				return getDocumentation();
			case Schema1Package.COMPLEX_DATA_TYPE__ATTRIBUTE:
				return getAttribute();
			case Schema1Package.COMPLEX_DATA_TYPE__RULE:
				return getRule();
			case Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.COMPLEX_DATA_TYPE__PARENT_TEMPLATE:
				return getParentTemplate();
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
			case Schema1Package.COMPLEX_DATA_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__RULE:
				getRule().clear();
				getRule().addAll((Collection)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__PARENT_TEMPLATE:
				setParentTemplate((String)newValue);
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
			case Schema1Package.COMPLEX_DATA_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__RULE:
				getRule().clear();
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE__PARENT_TEMPLATE:
				setParentTemplate(PARENT_TEMPLATE_EDEFAULT);
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
			case Schema1Package.COMPLEX_DATA_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Schema1Package.COMPLEX_DATA_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case Schema1Package.COMPLEX_DATA_TYPE__RULE:
				return rule != null && !rule.isEmpty();
			case Schema1Package.COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.COMPLEX_DATA_TYPE__PARENT_TEMPLATE:
				return PARENT_TEMPLATE_EDEFAULT == null ? parentTemplate != null : !PARENT_TEMPLATE_EDEFAULT.equals(parentTemplate);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", parentTemplate: ");
		result.append(parentTemplate);
		result.append(')');
		return result.toString();
	}

} //ComplexDataTypeImpl
