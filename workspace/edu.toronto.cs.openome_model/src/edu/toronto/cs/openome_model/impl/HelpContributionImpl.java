/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.openome_modelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Help Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.HelpContributionImpl#getContributionType <em>Contribution Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelpContributionImpl extends ContributionImpl implements HelpContribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The default value of the '{@link #getContributionType() <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTION_TYPE_EDEFAULT = "+";

	/**
	 * The cached value of the '{@link #getContributionType() <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
	protected String contributionType = CONTRIBUTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelpContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openome_modelPackage.Literals.HELP_CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContributionType() {
		return contributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case openome_modelPackage.HELP_CONTRIBUTION__CONTRIBUTION_TYPE:
				return getContributionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case openome_modelPackage.HELP_CONTRIBUTION__CONTRIBUTION_TYPE:
				return CONTRIBUTION_TYPE_EDEFAULT == null ? contributionType != null : !CONTRIBUTION_TYPE_EDEFAULT.equals(contributionType);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contributionType: ");
		result.append(contributionType);
		result.append(')');
		return result.toString();
	}

} //HelpContributionImpl
