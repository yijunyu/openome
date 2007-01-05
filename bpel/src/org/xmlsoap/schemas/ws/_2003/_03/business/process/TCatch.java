/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.TCatch#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.TCatch#getFaultVariable <em>Fault Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage#getTCatch()
 * @model extendedMetaData="name='tCatch' kind='elementOnly'"
 * @generated
 */
public interface TCatch extends TActivityOrCompensateContainer {
	/**
	 * Returns the value of the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Name</em>' attribute.
	 * @see #setFaultName(Object)
	 * @see org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage#getTCatch_FaultName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='faultName'"
	 * @generated
	 */
	Object getFaultName();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2003._03.business.process.TCatch#getFaultName <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Name</em>' attribute.
	 * @see #getFaultName()
	 * @generated
	 */
	void setFaultName(Object value);

	/**
	 * Returns the value of the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Variable</em>' attribute.
	 * @see #setFaultVariable(String)
	 * @see org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage#getTCatch_FaultVariable()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='faultVariable'"
	 * @generated
	 */
	String getFaultVariable();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2003._03.business.process.TCatch#getFaultVariable <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Variable</em>' attribute.
	 * @see #getFaultVariable()
	 * @generated
	 */
	void setFaultVariable(String value);

} // TCatch
