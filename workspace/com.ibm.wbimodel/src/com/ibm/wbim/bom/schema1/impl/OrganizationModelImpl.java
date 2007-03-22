/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.LocationDefinitionsType;
import com.ibm.wbim.bom.schema1.LocationsType;
import com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.OrganizationDefinitionsType;
import com.ibm.wbim.bom.schema1.OrganizationModel;
import com.ibm.wbim.bom.schema1.OrganizationUnitsType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl#getOrganizationDefinitionTemplates <em>Organization Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl#getOrganizationDefinitions <em>Organization Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl#getOrganizationUnits <em>Organization Units</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl#getLocationDefinitionTemplates <em>Location Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl#getLocationDefinitions <em>Location Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationModelImpl extends EObjectImpl implements OrganizationModel {
	/**
	 * The cached value of the '{@link #getOrganizationDefinitionTemplates() <em>Organization Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDefinitionTemplates()
	 * @generated
	 * @ordered
	 */
	protected OrganizationDefinitionTemplatesType organizationDefinitionTemplates = null;

	/**
	 * The cached value of the '{@link #getOrganizationDefinitions() <em>Organization Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDefinitions()
	 * @generated
	 * @ordered
	 */
	protected OrganizationDefinitionsType organizationDefinitions = null;

	/**
	 * The cached value of the '{@link #getOrganizationUnits() <em>Organization Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnits()
	 * @generated
	 * @ordered
	 */
	protected OrganizationUnitsType organizationUnits = null;

	/**
	 * The cached value of the '{@link #getLocationDefinitionTemplates() <em>Location Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDefinitionTemplates()
	 * @generated
	 * @ordered
	 */
	protected LocationDefinitionTemplatesType locationDefinitionTemplates = null;

	/**
	 * The cached value of the '{@link #getLocationDefinitions() <em>Location Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDefinitions()
	 * @generated
	 * @ordered
	 */
	protected LocationDefinitionsType locationDefinitions = null;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected LocationsType locations = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ORGANIZATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationDefinitionTemplatesType getOrganizationDefinitionTemplates() {
		return organizationDefinitionTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationDefinitionTemplates(OrganizationDefinitionTemplatesType newOrganizationDefinitionTemplates, NotificationChain msgs) {
		OrganizationDefinitionTemplatesType oldOrganizationDefinitionTemplates = organizationDefinitionTemplates;
		organizationDefinitionTemplates = newOrganizationDefinitionTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES, oldOrganizationDefinitionTemplates, newOrganizationDefinitionTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationDefinitionTemplates(OrganizationDefinitionTemplatesType newOrganizationDefinitionTemplates) {
		if (newOrganizationDefinitionTemplates != organizationDefinitionTemplates) {
			NotificationChain msgs = null;
			if (organizationDefinitionTemplates != null)
				msgs = ((InternalEObject)organizationDefinitionTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES, null, msgs);
			if (newOrganizationDefinitionTemplates != null)
				msgs = ((InternalEObject)newOrganizationDefinitionTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES, null, msgs);
			msgs = basicSetOrganizationDefinitionTemplates(newOrganizationDefinitionTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES, newOrganizationDefinitionTemplates, newOrganizationDefinitionTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationDefinitionsType getOrganizationDefinitions() {
		return organizationDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationDefinitions(OrganizationDefinitionsType newOrganizationDefinitions, NotificationChain msgs) {
		OrganizationDefinitionsType oldOrganizationDefinitions = organizationDefinitions;
		organizationDefinitions = newOrganizationDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS, oldOrganizationDefinitions, newOrganizationDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationDefinitions(OrganizationDefinitionsType newOrganizationDefinitions) {
		if (newOrganizationDefinitions != organizationDefinitions) {
			NotificationChain msgs = null;
			if (organizationDefinitions != null)
				msgs = ((InternalEObject)organizationDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS, null, msgs);
			if (newOrganizationDefinitions != null)
				msgs = ((InternalEObject)newOrganizationDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS, null, msgs);
			msgs = basicSetOrganizationDefinitions(newOrganizationDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS, newOrganizationDefinitions, newOrganizationDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnitsType getOrganizationUnits() {
		return organizationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationUnits(OrganizationUnitsType newOrganizationUnits, NotificationChain msgs) {
		OrganizationUnitsType oldOrganizationUnits = organizationUnits;
		organizationUnits = newOrganizationUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS, oldOrganizationUnits, newOrganizationUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationUnits(OrganizationUnitsType newOrganizationUnits) {
		if (newOrganizationUnits != organizationUnits) {
			NotificationChain msgs = null;
			if (organizationUnits != null)
				msgs = ((InternalEObject)organizationUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS, null, msgs);
			if (newOrganizationUnits != null)
				msgs = ((InternalEObject)newOrganizationUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS, null, msgs);
			msgs = basicSetOrganizationUnits(newOrganizationUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS, newOrganizationUnits, newOrganizationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinitionTemplatesType getLocationDefinitionTemplates() {
		return locationDefinitionTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationDefinitionTemplates(LocationDefinitionTemplatesType newLocationDefinitionTemplates, NotificationChain msgs) {
		LocationDefinitionTemplatesType oldLocationDefinitionTemplates = locationDefinitionTemplates;
		locationDefinitionTemplates = newLocationDefinitionTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES, oldLocationDefinitionTemplates, newLocationDefinitionTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationDefinitionTemplates(LocationDefinitionTemplatesType newLocationDefinitionTemplates) {
		if (newLocationDefinitionTemplates != locationDefinitionTemplates) {
			NotificationChain msgs = null;
			if (locationDefinitionTemplates != null)
				msgs = ((InternalEObject)locationDefinitionTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES, null, msgs);
			if (newLocationDefinitionTemplates != null)
				msgs = ((InternalEObject)newLocationDefinitionTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES, null, msgs);
			msgs = basicSetLocationDefinitionTemplates(newLocationDefinitionTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES, newLocationDefinitionTemplates, newLocationDefinitionTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinitionsType getLocationDefinitions() {
		return locationDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationDefinitions(LocationDefinitionsType newLocationDefinitions, NotificationChain msgs) {
		LocationDefinitionsType oldLocationDefinitions = locationDefinitions;
		locationDefinitions = newLocationDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS, oldLocationDefinitions, newLocationDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationDefinitions(LocationDefinitionsType newLocationDefinitions) {
		if (newLocationDefinitions != locationDefinitions) {
			NotificationChain msgs = null;
			if (locationDefinitions != null)
				msgs = ((InternalEObject)locationDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS, null, msgs);
			if (newLocationDefinitions != null)
				msgs = ((InternalEObject)newLocationDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS, null, msgs);
			msgs = basicSetLocationDefinitions(newLocationDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS, newLocationDefinitions, newLocationDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType getLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(LocationsType newLocations, NotificationChain msgs) {
		LocationsType oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__LOCATIONS, oldLocations, newLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(LocationsType newLocations) {
		if (newLocations != locations) {
			NotificationChain msgs = null;
			if (locations != null)
				msgs = ((InternalEObject)locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__LOCATIONS, null, msgs);
			if (newLocations != null)
				msgs = ((InternalEObject)newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.ORGANIZATION_MODEL__LOCATIONS, null, msgs);
			msgs = basicSetLocations(newLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ORGANIZATION_MODEL__LOCATIONS, newLocations, newLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
				return basicSetOrganizationDefinitionTemplates(null, msgs);
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
				return basicSetOrganizationDefinitions(null, msgs);
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
				return basicSetOrganizationUnits(null, msgs);
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
				return basicSetLocationDefinitionTemplates(null, msgs);
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
				return basicSetLocationDefinitions(null, msgs);
			case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
				return basicSetLocations(null, msgs);
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
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
				return getOrganizationDefinitionTemplates();
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
				return getOrganizationDefinitions();
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
				return getOrganizationUnits();
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
				return getLocationDefinitionTemplates();
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
				return getLocationDefinitions();
			case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
				return getLocations();
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
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
				setOrganizationDefinitionTemplates((OrganizationDefinitionTemplatesType)newValue);
				return;
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
				setOrganizationDefinitions((OrganizationDefinitionsType)newValue);
				return;
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
				setOrganizationUnits((OrganizationUnitsType)newValue);
				return;
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
				setLocationDefinitionTemplates((LocationDefinitionTemplatesType)newValue);
				return;
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
				setLocationDefinitions((LocationDefinitionsType)newValue);
				return;
			case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
				setLocations((LocationsType)newValue);
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
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
				setOrganizationDefinitionTemplates((OrganizationDefinitionTemplatesType)null);
				return;
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
				setOrganizationDefinitions((OrganizationDefinitionsType)null);
				return;
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
				setOrganizationUnits((OrganizationUnitsType)null);
				return;
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
				setLocationDefinitionTemplates((LocationDefinitionTemplatesType)null);
				return;
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
				setLocationDefinitions((LocationDefinitionsType)null);
				return;
			case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
				setLocations((LocationsType)null);
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
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES:
				return organizationDefinitionTemplates != null;
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS:
				return organizationDefinitions != null;
			case Schema1Package.ORGANIZATION_MODEL__ORGANIZATION_UNITS:
				return organizationUnits != null;
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES:
				return locationDefinitionTemplates != null;
			case Schema1Package.ORGANIZATION_MODEL__LOCATION_DEFINITIONS:
				return locationDefinitions != null;
			case Schema1Package.ORGANIZATION_MODEL__LOCATIONS:
				return locations != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganizationModelImpl
