/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.FlowContentType;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Outputs;
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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getOperationalData <em>Operational Data</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getFlowContent <em>Flow Content</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements com.ibm.wbim.bom.schema1.Process {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected Inputs inputs = null;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected Outputs outputs = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList precondition = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList postcondition = null;

	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected Organizations organizations = null;

	/**
	 * The cached value of the '{@link #getOperationalData() <em>Operational Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalData()
	 * @generated
	 * @ordered
	 */
	protected OperationalData operationalData = null;

	/**
	 * The cached value of the '{@link #getFlowContent() <em>Flow Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowContent()
	 * @generated
	 * @ordered
	 */
	protected FlowContentType flowContent = null;

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
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inputs getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(Inputs newInputs, NotificationChain msgs) {
		Inputs oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(Inputs newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outputs getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(Outputs newOutputs, NotificationChain msgs) {
		Outputs oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__OUTPUTS, oldOutputs, newOutputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(Outputs newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList(Expression.class, this, Schema1Package.PROCESS__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList(Expression.class, this, Schema1Package.PROCESS__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizations getOrganizations() {
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizations(Organizations newOrganizations, NotificationChain msgs) {
		Organizations oldOrganizations = organizations;
		organizations = newOrganizations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__ORGANIZATIONS, oldOrganizations, newOrganizations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizations(Organizations newOrganizations) {
		if (newOrganizations != organizations) {
			NotificationChain msgs = null;
			if (organizations != null)
				msgs = ((InternalEObject)organizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__ORGANIZATIONS, null, msgs);
			if (newOrganizations != null)
				msgs = ((InternalEObject)newOrganizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__ORGANIZATIONS, null, msgs);
			msgs = basicSetOrganizations(newOrganizations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__ORGANIZATIONS, newOrganizations, newOrganizations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalData getOperationalData() {
		return operationalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalData(OperationalData newOperationalData, NotificationChain msgs) {
		OperationalData oldOperationalData = operationalData;
		operationalData = newOperationalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__OPERATIONAL_DATA, oldOperationalData, newOperationalData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalData(OperationalData newOperationalData) {
		if (newOperationalData != operationalData) {
			NotificationChain msgs = null;
			if (operationalData != null)
				msgs = ((InternalEObject)operationalData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__OPERATIONAL_DATA, null, msgs);
			if (newOperationalData != null)
				msgs = ((InternalEObject)newOperationalData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__OPERATIONAL_DATA, null, msgs);
			msgs = basicSetOperationalData(newOperationalData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__OPERATIONAL_DATA, newOperationalData, newOperationalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowContentType getFlowContent() {
		return flowContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowContent(FlowContentType newFlowContent, NotificationChain msgs) {
		FlowContentType oldFlowContent = flowContent;
		flowContent = newFlowContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__FLOW_CONTENT, oldFlowContent, newFlowContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowContent(FlowContentType newFlowContent) {
		if (newFlowContent != flowContent) {
			NotificationChain msgs = null;
			if (flowContent != null)
				msgs = ((InternalEObject)flowContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__FLOW_CONTENT, null, msgs);
			if (newFlowContent != null)
				msgs = ((InternalEObject)newFlowContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__FLOW_CONTENT, null, msgs);
			msgs = basicSetFlowContent(newFlowContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__FLOW_CONTENT, newFlowContent, newFlowContent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__EXTENDED_ATTRIBUTES, oldExtendedAttributes, newExtendedAttributes);
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
				msgs = ((InternalEObject)extendedAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__EXTENDED_ATTRIBUTES, null, msgs);
			if (newExtendedAttributes != null)
				msgs = ((InternalEObject)newExtendedAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.PROCESS__EXTENDED_ATTRIBUTES, null, msgs);
			msgs = basicSetExtendedAttributes(newExtendedAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__EXTENDED_ATTRIBUTES, newExtendedAttributes, newExtendedAttributes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.PROCESS__INPUTS:
				return basicSetInputs(null, msgs);
			case Schema1Package.PROCESS__OUTPUTS:
				return basicSetOutputs(null, msgs);
			case Schema1Package.PROCESS__PRECONDITION:
				return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
			case Schema1Package.PROCESS__POSTCONDITION:
				return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
			case Schema1Package.PROCESS__ORGANIZATIONS:
				return basicSetOrganizations(null, msgs);
			case Schema1Package.PROCESS__OPERATIONAL_DATA:
				return basicSetOperationalData(null, msgs);
			case Schema1Package.PROCESS__FLOW_CONTENT:
				return basicSetFlowContent(null, msgs);
			case Schema1Package.PROCESS__EXTENDED_ATTRIBUTES:
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
			case Schema1Package.PROCESS__DESCRIPTION:
				return getDescription();
			case Schema1Package.PROCESS__INPUTS:
				return getInputs();
			case Schema1Package.PROCESS__OUTPUTS:
				return getOutputs();
			case Schema1Package.PROCESS__PRECONDITION:
				return getPrecondition();
			case Schema1Package.PROCESS__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.PROCESS__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.PROCESS__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.PROCESS__FLOW_CONTENT:
				return getFlowContent();
			case Schema1Package.PROCESS__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.PROCESS__NAME:
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
			case Schema1Package.PROCESS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.PROCESS__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.PROCESS__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.PROCESS__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.PROCESS__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.PROCESS__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.PROCESS__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.PROCESS__FLOW_CONTENT:
				setFlowContent((FlowContentType)newValue);
				return;
			case Schema1Package.PROCESS__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.PROCESS__NAME:
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
			case Schema1Package.PROCESS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.PROCESS__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.PROCESS__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.PROCESS__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.PROCESS__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.PROCESS__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.PROCESS__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.PROCESS__FLOW_CONTENT:
				setFlowContent((FlowContentType)null);
				return;
			case Schema1Package.PROCESS__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.PROCESS__NAME:
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
			case Schema1Package.PROCESS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.PROCESS__INPUTS:
				return inputs != null;
			case Schema1Package.PROCESS__OUTPUTS:
				return outputs != null;
			case Schema1Package.PROCESS__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.PROCESS__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.PROCESS__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.PROCESS__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.PROCESS__FLOW_CONTENT:
				return flowContent != null;
			case Schema1Package.PROCESS__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.PROCESS__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
