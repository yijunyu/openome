/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.OutputCriterion;
import com.ibm.wbim.bom.schema1.OutputRef;
import com.ibm.wbim.bom.schema1.RelatedInputCriteriaType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TypeType1;

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
 * An implementation of the model object '<em><b>Output Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl#getRelatedInputCriteria <em>Related Input Criteria</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputCriterionImpl extends EObjectImpl implements OutputCriterion {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList output = null;

	/**
	 * The cached value of the '{@link #getRelatedInputCriteria() <em>Related Input Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedInputCriteria()
	 * @generated
	 * @ordered
	 */
	protected RelatedInputCriteriaType relatedInputCriteria = null;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType1 TYPE_EDEFAULT = TypeType1.REGULAR_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType1 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OUTPUT_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList(OutputRef.class, this, Schema1Package.OUTPUT_CRITERION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedInputCriteriaType getRelatedInputCriteria() {
		return relatedInputCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedInputCriteria(RelatedInputCriteriaType newRelatedInputCriteria, NotificationChain msgs) {
		RelatedInputCriteriaType oldRelatedInputCriteria = relatedInputCriteria;
		relatedInputCriteria = newRelatedInputCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA, oldRelatedInputCriteria, newRelatedInputCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedInputCriteria(RelatedInputCriteriaType newRelatedInputCriteria) {
		if (newRelatedInputCriteria != relatedInputCriteria) {
			NotificationChain msgs = null;
			if (relatedInputCriteria != null)
				msgs = ((InternalEObject)relatedInputCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA, null, msgs);
			if (newRelatedInputCriteria != null)
				msgs = ((InternalEObject)newRelatedInputCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA, null, msgs);
			msgs = basicSetRelatedInputCriteria(newRelatedInputCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA, newRelatedInputCriteria, newRelatedInputCriteria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_CRITERION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType1 newType) {
		TypeType1 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_CRITERION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType1 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT_CRITERION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.OUTPUT_CRITERION__OUTPUT:
				return ((InternalEList)getOutput()).basicRemove(otherEnd, msgs);
			case Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA:
				return basicSetRelatedInputCriteria(null, msgs);
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
			case Schema1Package.OUTPUT_CRITERION__OUTPUT:
				return getOutput();
			case Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA:
				return getRelatedInputCriteria();
			case Schema1Package.OUTPUT_CRITERION__NAME:
				return getName();
			case Schema1Package.OUTPUT_CRITERION__TYPE:
				return getType();
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
			case Schema1Package.OUTPUT_CRITERION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection)newValue);
				return;
			case Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA:
				setRelatedInputCriteria((RelatedInputCriteriaType)newValue);
				return;
			case Schema1Package.OUTPUT_CRITERION__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.OUTPUT_CRITERION__TYPE:
				setType((TypeType1)newValue);
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
			case Schema1Package.OUTPUT_CRITERION__OUTPUT:
				getOutput().clear();
				return;
			case Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA:
				setRelatedInputCriteria((RelatedInputCriteriaType)null);
				return;
			case Schema1Package.OUTPUT_CRITERION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.OUTPUT_CRITERION__TYPE:
				unsetType();
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
			case Schema1Package.OUTPUT_CRITERION__OUTPUT:
				return output != null && !output.isEmpty();
			case Schema1Package.OUTPUT_CRITERION__RELATED_INPUT_CRITERIA:
				return relatedInputCriteria != null;
			case Schema1Package.OUTPUT_CRITERION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.OUTPUT_CRITERION__TYPE:
				return isSetType();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutputCriterionImpl
