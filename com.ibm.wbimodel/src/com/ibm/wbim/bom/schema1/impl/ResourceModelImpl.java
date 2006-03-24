/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType;
import com.ibm.wbim.bom.schema1.BulkResourcesType;
import com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType;
import com.ibm.wbim.bom.schema1.IndividualResourcesType;
import com.ibm.wbim.bom.schema1.ResourceModel;
import com.ibm.wbim.bom.schema1.RolesType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TimetablesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getIndividualResourceDefinitionTemplates <em>Individual Resource Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getIndividualResourceDefinitions <em>Individual Resource Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getBulkResourceDefinitionTemplates <em>Bulk Resource Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getBulkResourceDefinitions <em>Bulk Resource Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getIndividualResources <em>Individual Resources</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getBulkResources <em>Bulk Resources</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl#getTimetables <em>Timetables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceModelImpl extends EObjectImpl implements ResourceModel {
	/**
	 * The cached value of the '{@link #getIndividualResourceDefinitionTemplates() <em>Individual Resource Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceDefinitionTemplates()
	 * @generated
	 * @ordered
	 */
	protected IndividualResourceDefinitionTemplatesType individualResourceDefinitionTemplates = null;

	/**
	 * The cached value of the '{@link #getIndividualResourceDefinitions() <em>Individual Resource Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected IndividualResourceDefinitionsType individualResourceDefinitions = null;

	/**
	 * The cached value of the '{@link #getBulkResourceDefinitionTemplates() <em>Bulk Resource Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceDefinitionTemplates()
	 * @generated
	 * @ordered
	 */
	protected BulkResourceDefinitionTemplatesType bulkResourceDefinitionTemplates = null;

	/**
	 * The cached value of the '{@link #getBulkResourceDefinitions() <em>Bulk Resource Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResourceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected BulkResourceDefinitionsType bulkResourceDefinitions = null;

	/**
	 * The cached value of the '{@link #getIndividualResources() <em>Individual Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResources()
	 * @generated
	 * @ordered
	 */
	protected IndividualResourcesType individualResources = null;

	/**
	 * The cached value of the '{@link #getBulkResources() <em>Bulk Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkResources()
	 * @generated
	 * @ordered
	 */
	protected BulkResourcesType bulkResources = null;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected RolesType roles = null;

	/**
	 * The cached value of the '{@link #getTimetables() <em>Timetables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetables()
	 * @generated
	 * @ordered
	 */
	protected TimetablesType timetables = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getResourceModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourceDefinitionTemplatesType getIndividualResourceDefinitionTemplates() {
		return individualResourceDefinitionTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualResourceDefinitionTemplates(IndividualResourceDefinitionTemplatesType newIndividualResourceDefinitionTemplates, NotificationChain msgs) {
		IndividualResourceDefinitionTemplatesType oldIndividualResourceDefinitionTemplates = individualResourceDefinitionTemplates;
		individualResourceDefinitionTemplates = newIndividualResourceDefinitionTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES, oldIndividualResourceDefinitionTemplates, newIndividualResourceDefinitionTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualResourceDefinitionTemplates(IndividualResourceDefinitionTemplatesType newIndividualResourceDefinitionTemplates) {
		if (newIndividualResourceDefinitionTemplates != individualResourceDefinitionTemplates) {
			NotificationChain msgs = null;
			if (individualResourceDefinitionTemplates != null)
				msgs = ((InternalEObject)individualResourceDefinitionTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES, null, msgs);
			if (newIndividualResourceDefinitionTemplates != null)
				msgs = ((InternalEObject)newIndividualResourceDefinitionTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES, null, msgs);
			msgs = basicSetIndividualResourceDefinitionTemplates(newIndividualResourceDefinitionTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES, newIndividualResourceDefinitionTemplates, newIndividualResourceDefinitionTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourceDefinitionsType getIndividualResourceDefinitions() {
		return individualResourceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualResourceDefinitions(IndividualResourceDefinitionsType newIndividualResourceDefinitions, NotificationChain msgs) {
		IndividualResourceDefinitionsType oldIndividualResourceDefinitions = individualResourceDefinitions;
		individualResourceDefinitions = newIndividualResourceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS, oldIndividualResourceDefinitions, newIndividualResourceDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualResourceDefinitions(IndividualResourceDefinitionsType newIndividualResourceDefinitions) {
		if (newIndividualResourceDefinitions != individualResourceDefinitions) {
			NotificationChain msgs = null;
			if (individualResourceDefinitions != null)
				msgs = ((InternalEObject)individualResourceDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS, null, msgs);
			if (newIndividualResourceDefinitions != null)
				msgs = ((InternalEObject)newIndividualResourceDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS, null, msgs);
			msgs = basicSetIndividualResourceDefinitions(newIndividualResourceDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS, newIndividualResourceDefinitions, newIndividualResourceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourceDefinitionTemplatesType getBulkResourceDefinitionTemplates() {
		return bulkResourceDefinitionTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBulkResourceDefinitionTemplates(BulkResourceDefinitionTemplatesType newBulkResourceDefinitionTemplates, NotificationChain msgs) {
		BulkResourceDefinitionTemplatesType oldBulkResourceDefinitionTemplates = bulkResourceDefinitionTemplates;
		bulkResourceDefinitionTemplates = newBulkResourceDefinitionTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES, oldBulkResourceDefinitionTemplates, newBulkResourceDefinitionTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkResourceDefinitionTemplates(BulkResourceDefinitionTemplatesType newBulkResourceDefinitionTemplates) {
		if (newBulkResourceDefinitionTemplates != bulkResourceDefinitionTemplates) {
			NotificationChain msgs = null;
			if (bulkResourceDefinitionTemplates != null)
				msgs = ((InternalEObject)bulkResourceDefinitionTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES, null, msgs);
			if (newBulkResourceDefinitionTemplates != null)
				msgs = ((InternalEObject)newBulkResourceDefinitionTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES, null, msgs);
			msgs = basicSetBulkResourceDefinitionTemplates(newBulkResourceDefinitionTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES, newBulkResourceDefinitionTemplates, newBulkResourceDefinitionTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourceDefinitionsType getBulkResourceDefinitions() {
		return bulkResourceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBulkResourceDefinitions(BulkResourceDefinitionsType newBulkResourceDefinitions, NotificationChain msgs) {
		BulkResourceDefinitionsType oldBulkResourceDefinitions = bulkResourceDefinitions;
		bulkResourceDefinitions = newBulkResourceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS, oldBulkResourceDefinitions, newBulkResourceDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkResourceDefinitions(BulkResourceDefinitionsType newBulkResourceDefinitions) {
		if (newBulkResourceDefinitions != bulkResourceDefinitions) {
			NotificationChain msgs = null;
			if (bulkResourceDefinitions != null)
				msgs = ((InternalEObject)bulkResourceDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS, null, msgs);
			if (newBulkResourceDefinitions != null)
				msgs = ((InternalEObject)newBulkResourceDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS, null, msgs);
			msgs = basicSetBulkResourceDefinitions(newBulkResourceDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS, newBulkResourceDefinitions, newBulkResourceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourcesType getIndividualResources() {
		return individualResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualResources(IndividualResourcesType newIndividualResources, NotificationChain msgs) {
		IndividualResourcesType oldIndividualResources = individualResources;
		individualResources = newIndividualResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES, oldIndividualResources, newIndividualResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualResources(IndividualResourcesType newIndividualResources) {
		if (newIndividualResources != individualResources) {
			NotificationChain msgs = null;
			if (individualResources != null)
				msgs = ((InternalEObject)individualResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES, null, msgs);
			if (newIndividualResources != null)
				msgs = ((InternalEObject)newIndividualResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES, null, msgs);
			msgs = basicSetIndividualResources(newIndividualResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES, newIndividualResources, newIndividualResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourcesType getBulkResources() {
		return bulkResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBulkResources(BulkResourcesType newBulkResources, NotificationChain msgs) {
		BulkResourcesType oldBulkResources = bulkResources;
		bulkResources = newBulkResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__BULK_RESOURCES, oldBulkResources, newBulkResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkResources(BulkResourcesType newBulkResources) {
		if (newBulkResources != bulkResources) {
			NotificationChain msgs = null;
			if (bulkResources != null)
				msgs = ((InternalEObject)bulkResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__BULK_RESOURCES, null, msgs);
			if (newBulkResources != null)
				msgs = ((InternalEObject)newBulkResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__BULK_RESOURCES, null, msgs);
			msgs = basicSetBulkResources(newBulkResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__BULK_RESOURCES, newBulkResources, newBulkResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(RolesType newRoles, NotificationChain msgs) {
		RolesType oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(RolesType newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetablesType getTimetables() {
		return timetables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimetables(TimetablesType newTimetables, NotificationChain msgs) {
		TimetablesType oldTimetables = timetables;
		timetables = newTimetables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__TIMETABLES, oldTimetables, newTimetables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetables(TimetablesType newTimetables) {
		if (newTimetables != timetables) {
			NotificationChain msgs = null;
			if (timetables != null)
				msgs = ((InternalEObject)timetables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__TIMETABLES, null, msgs);
			if (newTimetables != null)
				msgs = ((InternalEObject)newTimetables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.RESOURCE_MODEL__TIMETABLES, null, msgs);
			msgs = basicSetTimetables(newTimetables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.RESOURCE_MODEL__TIMETABLES, newTimetables, newTimetables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES:
					return basicSetIndividualResourceDefinitionTemplates(null, msgs);
				case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS:
					return basicSetIndividualResourceDefinitions(null, msgs);
				case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES:
					return basicSetBulkResourceDefinitionTemplates(null, msgs);
				case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS:
					return basicSetBulkResourceDefinitions(null, msgs);
				case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES:
					return basicSetIndividualResources(null, msgs);
				case Schema1Package.RESOURCE_MODEL__BULK_RESOURCES:
					return basicSetBulkResources(null, msgs);
				case Schema1Package.RESOURCE_MODEL__ROLES:
					return basicSetRoles(null, msgs);
				case Schema1Package.RESOURCE_MODEL__TIMETABLES:
					return basicSetTimetables(null, msgs);
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
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES:
				return getIndividualResourceDefinitionTemplates();
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS:
				return getIndividualResourceDefinitions();
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES:
				return getBulkResourceDefinitionTemplates();
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS:
				return getBulkResourceDefinitions();
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES:
				return getIndividualResources();
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCES:
				return getBulkResources();
			case Schema1Package.RESOURCE_MODEL__ROLES:
				return getRoles();
			case Schema1Package.RESOURCE_MODEL__TIMETABLES:
				return getTimetables();
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
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES:
				setIndividualResourceDefinitionTemplates((IndividualResourceDefinitionTemplatesType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS:
				setIndividualResourceDefinitions((IndividualResourceDefinitionsType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES:
				setBulkResourceDefinitionTemplates((BulkResourceDefinitionTemplatesType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS:
				setBulkResourceDefinitions((BulkResourceDefinitionsType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES:
				setIndividualResources((IndividualResourcesType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCES:
				setBulkResources((BulkResourcesType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__ROLES:
				setRoles((RolesType)newValue);
				return;
			case Schema1Package.RESOURCE_MODEL__TIMETABLES:
				setTimetables((TimetablesType)newValue);
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
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES:
				setIndividualResourceDefinitionTemplates((IndividualResourceDefinitionTemplatesType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS:
				setIndividualResourceDefinitions((IndividualResourceDefinitionsType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES:
				setBulkResourceDefinitionTemplates((BulkResourceDefinitionTemplatesType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS:
				setBulkResourceDefinitions((BulkResourceDefinitionsType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES:
				setIndividualResources((IndividualResourcesType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCES:
				setBulkResources((BulkResourcesType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__ROLES:
				setRoles((RolesType)null);
				return;
			case Schema1Package.RESOURCE_MODEL__TIMETABLES:
				setTimetables((TimetablesType)null);
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
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES:
				return individualResourceDefinitionTemplates != null;
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS:
				return individualResourceDefinitions != null;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES:
				return bulkResourceDefinitionTemplates != null;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS:
				return bulkResourceDefinitions != null;
			case Schema1Package.RESOURCE_MODEL__INDIVIDUAL_RESOURCES:
				return individualResources != null;
			case Schema1Package.RESOURCE_MODEL__BULK_RESOURCES:
				return bulkResources != null;
			case Schema1Package.RESOURCE_MODEL__ROLES:
				return roles != null;
			case Schema1Package.RESOURCE_MODEL__TIMETABLES:
				return timetables != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ResourceModelImpl
