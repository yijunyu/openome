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
 * A representation of the model object '<em><b>Correlation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CorrelationType#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CorrelationType#getMultipleInstancesSatisfyCondition <em>Multiple Instances Satisfy Condition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CorrelationType#getNoInstancesSatisfyCondition <em>No Instances Satisfy Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCorrelationType()
 * @model extendedMetaData="name='correlation_._type' kind='elementOnly'"
 * @generated
 */
public interface CorrelationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCorrelationType_Predicate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>Multiple Instances Satisfy Condition</b></em>' attribute.
	 * The default value is <code>"TREAT_AS_ERROR"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.MultipleInstancesMatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Instances Satisfy Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Instances Satisfy Condition</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
	 * @see #isSetMultipleInstancesSatisfyCondition()
	 * @see #unsetMultipleInstancesSatisfyCondition()
	 * @see #setMultipleInstancesSatisfyCondition(MultipleInstancesMatch)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCorrelationType_MultipleInstancesSatisfyCondition()
	 * @model default="TREAT_AS_ERROR" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multipleInstancesSatisfyCondition'"
	 * @generated
	 */
	MultipleInstancesMatch getMultipleInstancesSatisfyCondition();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getMultipleInstancesSatisfyCondition <em>Multiple Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Instances Satisfy Condition</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
	 * @see #isSetMultipleInstancesSatisfyCondition()
	 * @see #unsetMultipleInstancesSatisfyCondition()
	 * @see #getMultipleInstancesSatisfyCondition()
	 * @generated
	 */
	void setMultipleInstancesSatisfyCondition(MultipleInstancesMatch value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getMultipleInstancesSatisfyCondition <em>Multiple Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultipleInstancesSatisfyCondition()
	 * @see #getMultipleInstancesSatisfyCondition()
	 * @see #setMultipleInstancesSatisfyCondition(MultipleInstancesMatch)
	 * @generated
	 */
	void unsetMultipleInstancesSatisfyCondition();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getMultipleInstancesSatisfyCondition <em>Multiple Instances Satisfy Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple Instances Satisfy Condition</em>' attribute is set.
	 * @see #unsetMultipleInstancesSatisfyCondition()
	 * @see #getMultipleInstancesSatisfyCondition()
	 * @see #setMultipleInstancesSatisfyCondition(MultipleInstancesMatch)
	 * @generated
	 */
	boolean isSetMultipleInstancesSatisfyCondition();

	/**
	 * Returns the value of the '<em><b>No Instances Satisfy Condition</b></em>' attribute.
	 * The default value is <code>"TREAT_AS_ERROR"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.NoInstancesMatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Instances Satisfy Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Instances Satisfy Condition</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
	 * @see #isSetNoInstancesSatisfyCondition()
	 * @see #unsetNoInstancesSatisfyCondition()
	 * @see #setNoInstancesSatisfyCondition(NoInstancesMatch)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCorrelationType_NoInstancesSatisfyCondition()
	 * @model default="TREAT_AS_ERROR" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='noInstancesSatisfyCondition'"
	 * @generated
	 */
	NoInstancesMatch getNoInstancesSatisfyCondition();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getNoInstancesSatisfyCondition <em>No Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Instances Satisfy Condition</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
	 * @see #isSetNoInstancesSatisfyCondition()
	 * @see #unsetNoInstancesSatisfyCondition()
	 * @see #getNoInstancesSatisfyCondition()
	 * @generated
	 */
	void setNoInstancesSatisfyCondition(NoInstancesMatch value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getNoInstancesSatisfyCondition <em>No Instances Satisfy Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoInstancesSatisfyCondition()
	 * @see #getNoInstancesSatisfyCondition()
	 * @see #setNoInstancesSatisfyCondition(NoInstancesMatch)
	 * @generated
	 */
	void unsetNoInstancesSatisfyCondition();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.CorrelationType#getNoInstancesSatisfyCondition <em>No Instances Satisfy Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>No Instances Satisfy Condition</em>' attribute is set.
	 * @see #unsetNoInstancesSatisfyCondition()
	 * @see #getNoInstancesSatisfyCondition()
	 * @see #setNoInstancesSatisfyCondition(NoInstancesMatch)
	 * @generated
	 */
	boolean isSetNoInstancesSatisfyCondition();

} // CorrelationType
