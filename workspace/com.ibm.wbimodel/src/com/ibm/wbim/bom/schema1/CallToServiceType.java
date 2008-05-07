/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call To Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CallToServiceType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCallToServiceType()
 * @model extendedMetaData="name='callToService_._type' kind='elementOnly'"
 * @generated
 */
public interface CallToServiceType extends Invocation {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCallToServiceType_Service()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CallToServiceType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

} // CallToServiceType
