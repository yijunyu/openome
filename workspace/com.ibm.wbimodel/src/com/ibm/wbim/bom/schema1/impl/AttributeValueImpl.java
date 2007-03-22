/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.AttributeValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl#getExpressionValue <em>Expression Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl#getPublicInstance <em>Public Instance</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl#getPrivateInstance <em>Private Instance</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueImpl extends EObjectImpl implements AttributeValue {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ATTRIBUTE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Schema1Package.ATTRIBUTE_VALUE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLiteralValue() {
		return ((FeatureMap)getGroup()).list(Schema1Package.Literals.ATTRIBUTE_VALUE__LITERAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExpressionValue() {
		return ((FeatureMap)getGroup()).list(Schema1Package.Literals.ATTRIBUTE_VALUE__EXPRESSION_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPublicInstance() {
		return ((FeatureMap)getGroup()).list(Schema1Package.Literals.ATTRIBUTE_VALUE__PUBLIC_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrivateInstance() {
		return ((FeatureMap)getGroup()).list(Schema1Package.Literals.ATTRIBUTE_VALUE__PRIVATE_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ATTRIBUTE_VALUE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.ATTRIBUTE_VALUE__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case Schema1Package.ATTRIBUTE_VALUE__EXPRESSION_VALUE:
				return ((InternalEList)getExpressionValue()).basicRemove(otherEnd, msgs);
			case Schema1Package.ATTRIBUTE_VALUE__PUBLIC_INSTANCE:
				return ((InternalEList)getPublicInstance()).basicRemove(otherEnd, msgs);
			case Schema1Package.ATTRIBUTE_VALUE__PRIVATE_INSTANCE:
				return ((InternalEList)getPrivateInstance()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.ATTRIBUTE_VALUE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Schema1Package.ATTRIBUTE_VALUE__LITERAL_VALUE:
				return getLiteralValue();
			case Schema1Package.ATTRIBUTE_VALUE__EXPRESSION_VALUE:
				return getExpressionValue();
			case Schema1Package.ATTRIBUTE_VALUE__PUBLIC_INSTANCE:
				return getPublicInstance();
			case Schema1Package.ATTRIBUTE_VALUE__PRIVATE_INSTANCE:
				return getPrivateInstance();
			case Schema1Package.ATTRIBUTE_VALUE__ATTRIBUTE:
				return getAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Schema1Package.ATTRIBUTE_VALUE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Schema1Package.ATTRIBUTE_VALUE__LITERAL_VALUE:
				getLiteralValue().clear();
				getLiteralValue().addAll((Collection)newValue);
				return;
			case Schema1Package.ATTRIBUTE_VALUE__EXPRESSION_VALUE:
				getExpressionValue().clear();
				getExpressionValue().addAll((Collection)newValue);
				return;
			case Schema1Package.ATTRIBUTE_VALUE__PUBLIC_INSTANCE:
				getPublicInstance().clear();
				getPublicInstance().addAll((Collection)newValue);
				return;
			case Schema1Package.ATTRIBUTE_VALUE__PRIVATE_INSTANCE:
				getPrivateInstance().clear();
				getPrivateInstance().addAll((Collection)newValue);
				return;
			case Schema1Package.ATTRIBUTE_VALUE__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Schema1Package.ATTRIBUTE_VALUE__GROUP:
				getGroup().clear();
				return;
			case Schema1Package.ATTRIBUTE_VALUE__LITERAL_VALUE:
				getLiteralValue().clear();
				return;
			case Schema1Package.ATTRIBUTE_VALUE__EXPRESSION_VALUE:
				getExpressionValue().clear();
				return;
			case Schema1Package.ATTRIBUTE_VALUE__PUBLIC_INSTANCE:
				getPublicInstance().clear();
				return;
			case Schema1Package.ATTRIBUTE_VALUE__PRIVATE_INSTANCE:
				getPrivateInstance().clear();
				return;
			case Schema1Package.ATTRIBUTE_VALUE__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.ATTRIBUTE_VALUE__GROUP:
				return group != null && !group.isEmpty();
			case Schema1Package.ATTRIBUTE_VALUE__LITERAL_VALUE:
				return !getLiteralValue().isEmpty();
			case Schema1Package.ATTRIBUTE_VALUE__EXPRESSION_VALUE:
				return !getExpressionValue().isEmpty();
			case Schema1Package.ATTRIBUTE_VALUE__PUBLIC_INSTANCE:
				return !getPublicInstance().isEmpty();
			case Schema1Package.ATTRIBUTE_VALUE__PRIVATE_INSTANCE:
				return !getPrivateInstance().isEmpty();
			case Schema1Package.ATTRIBUTE_VALUE__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(')');
		return result.toString();
	}

} //AttributeValueImpl
