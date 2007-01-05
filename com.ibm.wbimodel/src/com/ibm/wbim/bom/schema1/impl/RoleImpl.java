/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Availability;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Role;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.ScopeDimensionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getScopeDimension <em>Scope Dimension</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getIndividualResourceCostType <em>Individual Resource Cost Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getOneTimeCost <em>One Time Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getCostPerTimeUnit <em>Cost Per Time Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RoleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends EObjectImpl implements Role {
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
	 * The cached value of the '{@link #getScopeDimension() <em>Scope Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeDimension()
	 * @generated
	 * @ordered
	 */
	protected EList scopeDimension = null;

	/**
	 * The cached value of the '{@link #getIndividualResourceCostType() <em>Individual Resource Cost Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceCostType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap individualResourceCostType = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList availability = null;

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
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getRole();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getScopeDimension() {
		if (scopeDimension == null) {
			scopeDimension = new EObjectContainmentEList(ScopeDimensionType.class, this, Schema1Package.ROLE__SCOPE_DIMENSION);
		}
		return scopeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIndividualResourceCostType() {
		if (individualResourceCostType == null) {
			individualResourceCostType = new BasicFeatureMap(this, Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE);
		}
		return individualResourceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOneTimeCost() {
		return ((FeatureMap)getIndividualResourceCostType()).list(Schema1Package.eINSTANCE.getRole_OneTimeCost());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCostPerTimeUnit() {
		return ((FeatureMap)getIndividualResourceCostType()).list(Schema1Package.eINSTANCE.getRole_CostPerTimeUnit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAvailability() {
		if (availability == null) {
			availability = new EObjectContainmentEList(Availability.class, this, Schema1Package.ROLE__AVAILABILITY);
		}
		return availability;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE__EXTENDED_ATTRIBUTES, oldExtendedAttributes, newExtendedAttributes);
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
				msgs = ((InternalEObject)extendedAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ROLE__EXTENDED_ATTRIBUTES, null, msgs);
			if (newExtendedAttributes != null)
				msgs = ((InternalEObject)newExtendedAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ROLE__EXTENDED_ATTRIBUTES, null, msgs);
			msgs = basicSetExtendedAttributes(newExtendedAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE__EXTENDED_ATTRIBUTES, newExtendedAttributes, newExtendedAttributes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.ROLE__SCOPE_DIMENSION:
					return ((InternalEList)getScopeDimension()).basicRemove(otherEnd, msgs);
				case Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE:
					return ((InternalEList)getIndividualResourceCostType()).basicRemove(otherEnd, msgs);
				case Schema1Package.ROLE__ONE_TIME_COST:
					return ((InternalEList)getOneTimeCost()).basicRemove(otherEnd, msgs);
				case Schema1Package.ROLE__COST_PER_TIME_UNIT:
					return ((InternalEList)getCostPerTimeUnit()).basicRemove(otherEnd, msgs);
				case Schema1Package.ROLE__AVAILABILITY:
					return ((InternalEList)getAvailability()).basicRemove(otherEnd, msgs);
				case Schema1Package.ROLE__EXTENDED_ATTRIBUTES:
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
			case Schema1Package.ROLE__DOCUMENTATION:
				return getDocumentation();
			case Schema1Package.ROLE__SCOPE_DIMENSION:
				return getScopeDimension();
			case Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE:
				return getIndividualResourceCostType();
			case Schema1Package.ROLE__ONE_TIME_COST:
				return getOneTimeCost();
			case Schema1Package.ROLE__COST_PER_TIME_UNIT:
				return getCostPerTimeUnit();
			case Schema1Package.ROLE__AVAILABILITY:
				return getAvailability();
			case Schema1Package.ROLE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.ROLE__NAME:
				return getName();
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
			case Schema1Package.ROLE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Schema1Package.ROLE__SCOPE_DIMENSION:
				getScopeDimension().clear();
				getScopeDimension().addAll((Collection)newValue);
				return;
			case Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE:
				getIndividualResourceCostType().clear();
				getIndividualResourceCostType().addAll((Collection)newValue);
				return;
			case Schema1Package.ROLE__ONE_TIME_COST:
				getOneTimeCost().clear();
				getOneTimeCost().addAll((Collection)newValue);
				return;
			case Schema1Package.ROLE__COST_PER_TIME_UNIT:
				getCostPerTimeUnit().clear();
				getCostPerTimeUnit().addAll((Collection)newValue);
				return;
			case Schema1Package.ROLE__AVAILABILITY:
				getAvailability().clear();
				getAvailability().addAll((Collection)newValue);
				return;
			case Schema1Package.ROLE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.ROLE__NAME:
				setName((String)newValue);
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
			case Schema1Package.ROLE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Schema1Package.ROLE__SCOPE_DIMENSION:
				getScopeDimension().clear();
				return;
			case Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE:
				getIndividualResourceCostType().clear();
				return;
			case Schema1Package.ROLE__ONE_TIME_COST:
				getOneTimeCost().clear();
				return;
			case Schema1Package.ROLE__COST_PER_TIME_UNIT:
				getCostPerTimeUnit().clear();
				return;
			case Schema1Package.ROLE__AVAILABILITY:
				getAvailability().clear();
				return;
			case Schema1Package.ROLE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.ROLE__NAME:
				setName(NAME_EDEFAULT);
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
			case Schema1Package.ROLE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Schema1Package.ROLE__SCOPE_DIMENSION:
				return scopeDimension != null && !scopeDimension.isEmpty();
			case Schema1Package.ROLE__INDIVIDUAL_RESOURCE_COST_TYPE:
				return individualResourceCostType != null && !individualResourceCostType.isEmpty();
			case Schema1Package.ROLE__ONE_TIME_COST:
				return !getOneTimeCost().isEmpty();
			case Schema1Package.ROLE__COST_PER_TIME_UNIT:
				return !getCostPerTimeUnit().isEmpty();
			case Schema1Package.ROLE__AVAILABILITY:
				return availability != null && !availability.isEmpty();
			case Schema1Package.ROLE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", individualResourceCostType: ");
		result.append(individualResourceCostType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
