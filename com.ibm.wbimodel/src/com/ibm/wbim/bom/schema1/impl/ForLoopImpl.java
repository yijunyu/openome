/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.FlowContentType;
import com.ibm.wbim.bom.schema1.ForLoop;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.LoopConditionType;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ForLoopImpl#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLoopImpl extends ProcessImpl implements ForLoop {
	/**
	 * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCondition()
	 * @generated
	 * @ordered
	 */
	protected LoopConditionType loopCondition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getForLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopConditionType getLoopCondition() {
		return loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition(LoopConditionType newLoopCondition, NotificationChain msgs) {
		LoopConditionType oldLoopCondition = loopCondition;
		loopCondition = newLoopCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.FOR_LOOP__LOOP_CONDITION, oldLoopCondition, newLoopCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(LoopConditionType newLoopCondition) {
		if (newLoopCondition != loopCondition) {
			NotificationChain msgs = null;
			if (loopCondition != null)
				msgs = ((InternalEObject)loopCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.FOR_LOOP__LOOP_CONDITION, null, msgs);
			if (newLoopCondition != null)
				msgs = ((InternalEObject)newLoopCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.FOR_LOOP__LOOP_CONDITION, null, msgs);
			msgs = basicSetLoopCondition(newLoopCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.FOR_LOOP__LOOP_CONDITION, newLoopCondition, newLoopCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.FOR_LOOP__INPUTS:
					return basicSetInputs(null, msgs);
				case Schema1Package.FOR_LOOP__OUTPUTS:
					return basicSetOutputs(null, msgs);
				case Schema1Package.FOR_LOOP__PRECONDITION:
					return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.FOR_LOOP__POSTCONDITION:
					return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.FOR_LOOP__ORGANIZATIONS:
					return basicSetOrganizations(null, msgs);
				case Schema1Package.FOR_LOOP__OPERATIONAL_DATA:
					return basicSetOperationalData(null, msgs);
				case Schema1Package.FOR_LOOP__FLOW_CONTENT:
					return basicSetFlowContent(null, msgs);
				case Schema1Package.FOR_LOOP__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
				case Schema1Package.FOR_LOOP__LOOP_CONDITION:
					return basicSetLoopCondition(null, msgs);
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
			case Schema1Package.FOR_LOOP__DESCRIPTION:
				return getDescription();
			case Schema1Package.FOR_LOOP__INPUTS:
				return getInputs();
			case Schema1Package.FOR_LOOP__OUTPUTS:
				return getOutputs();
			case Schema1Package.FOR_LOOP__PRECONDITION:
				return getPrecondition();
			case Schema1Package.FOR_LOOP__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.FOR_LOOP__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.FOR_LOOP__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.FOR_LOOP__FLOW_CONTENT:
				return getFlowContent();
			case Schema1Package.FOR_LOOP__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.FOR_LOOP__NAME:
				return getName();
			case Schema1Package.FOR_LOOP__LOOP_CONDITION:
				return getLoopCondition();
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
			case Schema1Package.FOR_LOOP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.FOR_LOOP__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.FOR_LOOP__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.FOR_LOOP__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.FOR_LOOP__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.FOR_LOOP__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.FOR_LOOP__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.FOR_LOOP__FLOW_CONTENT:
				setFlowContent((FlowContentType)newValue);
				return;
			case Schema1Package.FOR_LOOP__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.FOR_LOOP__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.FOR_LOOP__LOOP_CONDITION:
				setLoopCondition((LoopConditionType)newValue);
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
			case Schema1Package.FOR_LOOP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.FOR_LOOP__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.FOR_LOOP__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.FOR_LOOP__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.FOR_LOOP__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.FOR_LOOP__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.FOR_LOOP__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.FOR_LOOP__FLOW_CONTENT:
				setFlowContent((FlowContentType)null);
				return;
			case Schema1Package.FOR_LOOP__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.FOR_LOOP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.FOR_LOOP__LOOP_CONDITION:
				setLoopCondition((LoopConditionType)null);
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
			case Schema1Package.FOR_LOOP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.FOR_LOOP__INPUTS:
				return inputs != null;
			case Schema1Package.FOR_LOOP__OUTPUTS:
				return outputs != null;
			case Schema1Package.FOR_LOOP__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.FOR_LOOP__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.FOR_LOOP__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.FOR_LOOP__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.FOR_LOOP__FLOW_CONTENT:
				return flowContent != null;
			case Schema1Package.FOR_LOOP__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.FOR_LOOP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.FOR_LOOP__LOOP_CONDITION:
				return loopCondition != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ForLoopImpl