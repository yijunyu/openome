/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.GroupMembersType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Members Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl#isIncludeSubgroups <em>Include Subgroups</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl#getAlternativeName1 <em>Alternative Name1</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl#getAlternativeName2 <em>Alternative Name2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupMembersTypeImpl extends EObjectImpl implements
		GroupMembersType {
	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeSubgroups() <em>Include Subgroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubgroups()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUBGROUPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSubgroups() <em>Include Subgroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubgroups()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubgroups = INCLUDE_SUBGROUPS_EDEFAULT;

	/**
	 * This is true if the Include Subgroups attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubgroupsESet;

	/**
	 * The default value of the '{@link #getAlternativeName1() <em>Alternative Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName1()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeName1() <em>Alternative Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName1()
	 * @generated
	 * @ordered
	 */
	protected String alternativeName1 = ALTERNATIVE_NAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternativeName2() <em>Alternative Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName2()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_NAME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeName2() <em>Alternative Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName2()
	 * @generated
	 * @ordered
	 */
	protected String alternativeName2 = ALTERNATIVE_NAME2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupMembersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.GROUP_MEMBERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_MEMBERS_TYPE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_MEMBERS_TYPE__DOMAIN, oldDomain,
					domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeSubgroups() {
		return includeSubgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSubgroups(boolean newIncludeSubgroups) {
		boolean oldIncludeSubgroups = includeSubgroups;
		includeSubgroups = newIncludeSubgroups;
		boolean oldIncludeSubgroupsESet = includeSubgroupsESet;
		includeSubgroupsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS,
					oldIncludeSubgroups, includeSubgroups,
					!oldIncludeSubgroupsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeSubgroups() {
		boolean oldIncludeSubgroups = includeSubgroups;
		boolean oldIncludeSubgroupsESet = includeSubgroupsESet;
		includeSubgroups = INCLUDE_SUBGROUPS_EDEFAULT;
		includeSubgroupsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					Schema1Package.GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS,
					oldIncludeSubgroups, INCLUDE_SUBGROUPS_EDEFAULT,
					oldIncludeSubgroupsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeSubgroups() {
		return includeSubgroupsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeName1() {
		return alternativeName1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeName1(String newAlternativeName1) {
		String oldAlternativeName1 = alternativeName1;
		alternativeName1 = newAlternativeName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1,
					oldAlternativeName1, alternativeName1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeName2() {
		return alternativeName2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeName2(String newAlternativeName2) {
		String oldAlternativeName2 = alternativeName2;
		alternativeName2 = newAlternativeName2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2,
					oldAlternativeName2, alternativeName2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.GROUP_MEMBERS_TYPE__GROUP:
			return getGroup();
		case Schema1Package.GROUP_MEMBERS_TYPE__DOMAIN:
			return getDomain();
		case Schema1Package.GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS:
			return isIncludeSubgroups() ? Boolean.TRUE : Boolean.FALSE;
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1:
			return getAlternativeName1();
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2:
			return getAlternativeName2();
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
		case Schema1Package.GROUP_MEMBERS_TYPE__GROUP:
			setGroup((String) newValue);
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__DOMAIN:
			setDomain((String) newValue);
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS:
			setIncludeSubgroups(((Boolean) newValue).booleanValue());
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1:
			setAlternativeName1((String) newValue);
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2:
			setAlternativeName2((String) newValue);
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
		case Schema1Package.GROUP_MEMBERS_TYPE__GROUP:
			setGroup(GROUP_EDEFAULT);
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS:
			unsetIncludeSubgroups();
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1:
			setAlternativeName1(ALTERNATIVE_NAME1_EDEFAULT);
			return;
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2:
			setAlternativeName2(ALTERNATIVE_NAME2_EDEFAULT);
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
		case Schema1Package.GROUP_MEMBERS_TYPE__GROUP:
			return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT
					.equals(group);
		case Schema1Package.GROUP_MEMBERS_TYPE__DOMAIN:
			return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT
					.equals(domain);
		case Schema1Package.GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS:
			return isSetIncludeSubgroups();
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1:
			return ALTERNATIVE_NAME1_EDEFAULT == null ? alternativeName1 != null
					: !ALTERNATIVE_NAME1_EDEFAULT.equals(alternativeName1);
		case Schema1Package.GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2:
			return ALTERNATIVE_NAME2_EDEFAULT == null ? alternativeName2 != null
					: !ALTERNATIVE_NAME2_EDEFAULT.equals(alternativeName2);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", domain: ");
		result.append(domain);
		result.append(", includeSubgroups: ");
		if (includeSubgroupsESet)
			result.append(includeSubgroups);
		else
			result.append("<unset>");
		result.append(", alternativeName1: ");
		result.append(alternativeName1);
		result.append(", alternativeName2: ");
		result.append(alternativeName2);
		result.append(')');
		return result.toString();
	}

} //GroupMembersTypeImpl
