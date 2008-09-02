/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Observer#getObservationExpression <em>Observation Expression</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Observer#isIsObserveContinuously <em>Is Observe Continuously</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getObserver()
 * @model extendedMetaData="name='Observer' kind='elementOnly'"
 * @generated
 */
public interface Observer extends Task {
	/**
	 * Returns the value of the '<em><b>Observation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation Expression</em>' containment reference.
	 * @see #setObservationExpression(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getObserver_ObservationExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='observationExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getObservationExpression();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Observer#getObservationExpression <em>Observation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Expression</em>' containment reference.
	 * @see #getObservationExpression()
	 * @generated
	 */
	void setObservationExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Observe Continuously</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Observe Continuously</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Observe Continuously</em>' attribute.
	 * @see #isSetIsObserveContinuously()
	 * @see #unsetIsObserveContinuously()
	 * @see #setIsObserveContinuously(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getObserver_IsObserveContinuously()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isObserveContinuously'"
	 * @generated
	 */
	boolean isIsObserveContinuously();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Observer#isIsObserveContinuously <em>Is Observe Continuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Observe Continuously</em>' attribute.
	 * @see #isSetIsObserveContinuously()
	 * @see #unsetIsObserveContinuously()
	 * @see #isIsObserveContinuously()
	 * @generated
	 */
	void setIsObserveContinuously(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Observer#isIsObserveContinuously <em>Is Observe Continuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsObserveContinuously()
	 * @see #isIsObserveContinuously()
	 * @see #setIsObserveContinuously(boolean)
	 * @generated
	 */
	void unsetIsObserveContinuously();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Observer#isIsObserveContinuously <em>Is Observe Continuously</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Observe Continuously</em>' attribute is set.
	 * @see #unsetIsObserveContinuously()
	 * @see #isIsObserveContinuously()
	 * @see #setIsObserveContinuously(boolean)
	 * @generated
	 */
	boolean isSetIsObserveContinuously();

} // Observer
