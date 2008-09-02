/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Repository Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#getLocalRepository <em>Local Repository</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#getGlobalRepository <em>Global Repository</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isAtBeginning <em>At Beginning</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isIsRemove <em>Is Remove</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValue()
 * @model extendedMetaData="name='InputRepositoryValue' kind='elementOnly'"
 * @generated
 */
public interface InputRepositoryValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Repository</em>' containment reference.
	 * @see #setLocalRepository(LocalRepositoryRef)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValue_LocalRepository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='localRepository' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalRepositoryRef getLocalRepository();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#getLocalRepository <em>Local Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Repository</em>' containment reference.
	 * @see #getLocalRepository()
	 * @generated
	 */
	void setLocalRepository(LocalRepositoryRef value);

	/**
	 * Returns the value of the '<em><b>Global Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Repository</em>' containment reference.
	 * @see #setGlobalRepository(GlobalRepositoryRef)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValue_GlobalRepository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalRepository' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalRepositoryRef getGlobalRepository();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#getGlobalRepository <em>Global Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Repository</em>' containment reference.
	 * @see #getGlobalRepository()
	 * @generated
	 */
	void setGlobalRepository(GlobalRepositoryRef value);

	/**
	 * Returns the value of the '<em><b>At Beginning</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Beginning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Beginning</em>' attribute.
	 * @see #isSetAtBeginning()
	 * @see #unsetAtBeginning()
	 * @see #setAtBeginning(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValue_AtBeginning()
	 * @model default="true" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='atBeginning'"
	 * @generated
	 */
	boolean isAtBeginning();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isAtBeginning <em>At Beginning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Beginning</em>' attribute.
	 * @see #isSetAtBeginning()
	 * @see #unsetAtBeginning()
	 * @see #isAtBeginning()
	 * @generated
	 */
	void setAtBeginning(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isAtBeginning <em>At Beginning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAtBeginning()
	 * @see #isAtBeginning()
	 * @see #setAtBeginning(boolean)
	 * @generated
	 */
	void unsetAtBeginning();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isAtBeginning <em>At Beginning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>At Beginning</em>' attribute is set.
	 * @see #unsetAtBeginning()
	 * @see #isAtBeginning()
	 * @see #setAtBeginning(boolean)
	 * @generated
	 */
	boolean isSetAtBeginning();

	/**
	 * Returns the value of the '<em><b>Is Remove</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remove</em>' attribute.
	 * @see #isSetIsRemove()
	 * @see #unsetIsRemove()
	 * @see #setIsRemove(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getInputRepositoryValue_IsRemove()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isRemove'"
	 * @generated
	 */
	boolean isIsRemove();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isIsRemove <em>Is Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remove</em>' attribute.
	 * @see #isSetIsRemove()
	 * @see #unsetIsRemove()
	 * @see #isIsRemove()
	 * @generated
	 */
	void setIsRemove(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isIsRemove <em>Is Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRemove()
	 * @see #isIsRemove()
	 * @see #setIsRemove(boolean)
	 * @generated
	 */
	void unsetIsRemove();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isIsRemove <em>Is Remove</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Remove</em>' attribute is set.
	 * @see #unsetIsRemove()
	 * @see #isIsRemove()
	 * @see #setIsRemove(boolean)
	 * @generated
	 */
	boolean isSetIsRemove();

} // InputRepositoryValue
