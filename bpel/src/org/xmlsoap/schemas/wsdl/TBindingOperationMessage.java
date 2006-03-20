/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.wsdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBinding Operation Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.wsdl.TBindingOperationMessage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.wsdl.WsdlPackage#getTBindingOperationMessage()
 * @model extendedMetaData="name='tBindingOperationMessage' kind='elementOnly'"
 * @generated
 */
public interface TBindingOperationMessage extends TExtensibleDocumented {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xmlsoap.schemas.wsdl.WsdlPackage#getTBindingOperationMessage_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.wsdl.TBindingOperationMessage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TBindingOperationMessage
