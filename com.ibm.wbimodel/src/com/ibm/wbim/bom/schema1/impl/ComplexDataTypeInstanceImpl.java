/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.AttributeValue;
import com.ibm.wbim.bom.schema1.ComplexDataTypeInstance;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Data Type Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl#getAttributeValue <em>Attribute Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexDataTypeInstanceImpl extends EObjectImpl implements ComplexDataTypeInstance {
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
	 * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected EList attributeValue = null;

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
	 * The default value of the '{@link #getInstanceOf() <em>Instance Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected String instanceOf = INSTANCE_OF_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexDataTypeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.COMPLEX_DATA_TYPE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributeValue() {
		if (attributeValue == null) {
			attributeValue = new EObjectContainmentEList(AttributeValue.class, this, Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE);
		}
		return attributeValue;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES, oldExtendedAttributes, newExtendedAttributes);
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
				msgs = ((InternalEObject)extendedAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES, null, msgs);
			if (newExtendedAttributes != null)
				msgs = ((InternalEObject)newExtendedAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES, null, msgs);
			msgs = basicSetExtendedAttributes(newExtendedAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES, newExtendedAttributes, newExtendedAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(String newInstanceOf) {
		String oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE:
				return ((InternalEList)getAttributeValue()).basicRemove(otherEnd, msgs);
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES:
				return basicSetExtendedAttributes(null, msgs);
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
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION:
				return getDocumentation();
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE:
				return getAttributeValue();
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF:
				return getInstanceOf();
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__NAME:
				return getName();
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
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE:
				getAttributeValue().clear();
				getAttributeValue().addAll((Collection)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF:
				setInstanceOf((String)newValue);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__NAME:
				setName((String)newValue);
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
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE:
				getAttributeValue().clear();
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF:
				setInstanceOf(INSTANCE_OF_EDEFAULT);
				return;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
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
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE:
				return attributeValue != null && !attributeValue.isEmpty();
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF:
				return INSTANCE_OF_EDEFAULT == null ? instanceOf != null : !INSTANCE_OF_EDEFAULT.equals(instanceOf);
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", instanceOf: ");
		result.append(instanceOf);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComplexDataTypeInstanceImpl