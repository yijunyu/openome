/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.CatalogsType;
import com.ibm.wbim.bom.schema1.DataModel;
import com.ibm.wbim.bom.schema1.ModelType;
import com.ibm.wbim.bom.schema1.OrganizationModel;
import com.ibm.wbim.bom.schema1.ProcessModel;
import com.ibm.wbim.bom.schema1.ResourceModel;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getCatalogs <em>Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getResourceModel <em>Resource Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getOrganizationModel <em>Organization Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends EObjectImpl implements ModelType {
	/**
	 * The cached value of the '{@link #getCatalogs() <em>Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogs()
	 * @generated
	 * @ordered
	 */
	protected CatalogsType catalogs;

	/**
	 * The cached value of the '{@link #getDataModel() <em>Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModel()
	 * @generated
	 * @ordered
	 */
	protected DataModel dataModel;

	/**
	 * The cached value of the '{@link #getResourceModel() <em>Resource Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceModel()
	 * @generated
	 * @ordered
	 */
	protected ResourceModel resourceModel;

	/**
	 * The cached value of the '{@link #getOrganizationModel() <em>Organization Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationModel()
	 * @generated
	 * @ordered
	 */
	protected OrganizationModel organizationModel;

	/**
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel processModel;

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
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * This is true if the Schema Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schemaVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogsType getCatalogs() {
		return catalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogs(CatalogsType newCatalogs,
			NotificationChain msgs) {
		CatalogsType oldCatalogs = catalogs;
		catalogs = newCatalogs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Schema1Package.MODEL_TYPE__CATALOGS,
					oldCatalogs, newCatalogs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogs(CatalogsType newCatalogs) {
		if (newCatalogs != catalogs) {
			NotificationChain msgs = null;
			if (catalogs != null)
				msgs = ((InternalEObject) catalogs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__CATALOGS, null,
						msgs);
			if (newCatalogs != null)
				msgs = ((InternalEObject) newCatalogs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__CATALOGS, null,
						msgs);
			msgs = basicSetCatalogs(newCatalogs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__CATALOGS, newCatalogs,
					newCatalogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getDataModel() {
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataModel(DataModel newDataModel,
			NotificationChain msgs) {
		DataModel oldDataModel = dataModel;
		dataModel = newDataModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Schema1Package.MODEL_TYPE__DATA_MODEL,
					oldDataModel, newDataModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataModel(DataModel newDataModel) {
		if (newDataModel != dataModel) {
			NotificationChain msgs = null;
			if (dataModel != null)
				msgs = ((InternalEObject) dataModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__DATA_MODEL, null,
						msgs);
			if (newDataModel != null)
				msgs = ((InternalEObject) newDataModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__DATA_MODEL, null,
						msgs);
			msgs = basicSetDataModel(newDataModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__DATA_MODEL, newDataModel,
					newDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel getResourceModel() {
		return resourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceModel(
			ResourceModel newResourceModel, NotificationChain msgs) {
		ResourceModel oldResourceModel = resourceModel;
		resourceModel = newResourceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.MODEL_TYPE__RESOURCE_MODEL,
					oldResourceModel, newResourceModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceModel(ResourceModel newResourceModel) {
		if (newResourceModel != resourceModel) {
			NotificationChain msgs = null;
			if (resourceModel != null)
				msgs = ((InternalEObject) resourceModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__RESOURCE_MODEL,
						null, msgs);
			if (newResourceModel != null)
				msgs = ((InternalEObject) newResourceModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__RESOURCE_MODEL,
						null, msgs);
			msgs = basicSetResourceModel(newResourceModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__RESOURCE_MODEL,
					newResourceModel, newResourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationModel getOrganizationModel() {
		return organizationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationModel(
			OrganizationModel newOrganizationModel, NotificationChain msgs) {
		OrganizationModel oldOrganizationModel = organizationModel;
		organizationModel = newOrganizationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL,
					oldOrganizationModel, newOrganizationModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationModel(OrganizationModel newOrganizationModel) {
		if (newOrganizationModel != organizationModel) {
			NotificationChain msgs = null;
			if (organizationModel != null)
				msgs = ((InternalEObject) organizationModel)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL,
								null, msgs);
			if (newOrganizationModel != null)
				msgs = ((InternalEObject) newOrganizationModel)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL,
								null, msgs);
			msgs = basicSetOrganizationModel(newOrganizationModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL,
					newOrganizationModel, newOrganizationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getProcessModel() {
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessModel(ProcessModel newProcessModel,
			NotificationChain msgs) {
		ProcessModel oldProcessModel = processModel;
		processModel = newProcessModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Schema1Package.MODEL_TYPE__PROCESS_MODEL,
					oldProcessModel, newProcessModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessModel(ProcessModel newProcessModel) {
		if (newProcessModel != processModel) {
			NotificationChain msgs = null;
			if (processModel != null)
				msgs = ((InternalEObject) processModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__PROCESS_MODEL,
						null, msgs);
			if (newProcessModel != null)
				msgs = ((InternalEObject) newProcessModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.MODEL_TYPE__PROCESS_MODEL,
						null, msgs);
			msgs = basicSetProcessModel(newProcessModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__PROCESS_MODEL, newProcessModel,
					newProcessModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(String newSchemaVersion) {
		String oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.MODEL_TYPE__SCHEMA_VERSION,
					oldSchemaVersion, schemaVersion, !oldSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchemaVersion() {
		String oldSchemaVersion = schemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersion = SCHEMA_VERSION_EDEFAULT;
		schemaVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					Schema1Package.MODEL_TYPE__SCHEMA_VERSION,
					oldSchemaVersion, SCHEMA_VERSION_EDEFAULT,
					oldSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchemaVersion() {
		return schemaVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Schema1Package.MODEL_TYPE__CATALOGS:
			return basicSetCatalogs(null, msgs);
		case Schema1Package.MODEL_TYPE__DATA_MODEL:
			return basicSetDataModel(null, msgs);
		case Schema1Package.MODEL_TYPE__RESOURCE_MODEL:
			return basicSetResourceModel(null, msgs);
		case Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL:
			return basicSetOrganizationModel(null, msgs);
		case Schema1Package.MODEL_TYPE__PROCESS_MODEL:
			return basicSetProcessModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.MODEL_TYPE__CATALOGS:
			return getCatalogs();
		case Schema1Package.MODEL_TYPE__DATA_MODEL:
			return getDataModel();
		case Schema1Package.MODEL_TYPE__RESOURCE_MODEL:
			return getResourceModel();
		case Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL:
			return getOrganizationModel();
		case Schema1Package.MODEL_TYPE__PROCESS_MODEL:
			return getProcessModel();
		case Schema1Package.MODEL_TYPE__NAME:
			return getName();
		case Schema1Package.MODEL_TYPE__SCHEMA_VERSION:
			return getSchemaVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.MODEL_TYPE__CATALOGS:
			setCatalogs((CatalogsType) newValue);
			return;
		case Schema1Package.MODEL_TYPE__DATA_MODEL:
			setDataModel((DataModel) newValue);
			return;
		case Schema1Package.MODEL_TYPE__RESOURCE_MODEL:
			setResourceModel((ResourceModel) newValue);
			return;
		case Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL:
			setOrganizationModel((OrganizationModel) newValue);
			return;
		case Schema1Package.MODEL_TYPE__PROCESS_MODEL:
			setProcessModel((ProcessModel) newValue);
			return;
		case Schema1Package.MODEL_TYPE__NAME:
			setName((String) newValue);
			return;
		case Schema1Package.MODEL_TYPE__SCHEMA_VERSION:
			setSchemaVersion((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Schema1Package.MODEL_TYPE__CATALOGS:
			setCatalogs((CatalogsType) null);
			return;
		case Schema1Package.MODEL_TYPE__DATA_MODEL:
			setDataModel((DataModel) null);
			return;
		case Schema1Package.MODEL_TYPE__RESOURCE_MODEL:
			setResourceModel((ResourceModel) null);
			return;
		case Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL:
			setOrganizationModel((OrganizationModel) null);
			return;
		case Schema1Package.MODEL_TYPE__PROCESS_MODEL:
			setProcessModel((ProcessModel) null);
			return;
		case Schema1Package.MODEL_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Schema1Package.MODEL_TYPE__SCHEMA_VERSION:
			unsetSchemaVersion();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Schema1Package.MODEL_TYPE__CATALOGS:
			return catalogs != null;
		case Schema1Package.MODEL_TYPE__DATA_MODEL:
			return dataModel != null;
		case Schema1Package.MODEL_TYPE__RESOURCE_MODEL:
			return resourceModel != null;
		case Schema1Package.MODEL_TYPE__ORGANIZATION_MODEL:
			return organizationModel != null;
		case Schema1Package.MODEL_TYPE__PROCESS_MODEL:
			return processModel != null;
		case Schema1Package.MODEL_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case Schema1Package.MODEL_TYPE__SCHEMA_VERSION:
			return isSetSchemaVersion();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", schemaVersion: ");
		if (schemaVersionESet)
			result.append(schemaVersion);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
