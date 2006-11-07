/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.LoopConditionType#getCounterIncrement <em>Counter Increment</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LoopConditionType#getFinalCounter <em>Final Counter</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.LoopConditionType#getInitialCounter <em>Initial Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoopConditionType()
 * @model extendedMetaData="name='loopCondition_._type' kind='elementOnly'"
 * @generated
 */
public interface LoopConditionType extends Expression {
	/**
	 * Returns the value of the '<em><b>Counter Increment</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Increment</em>' attribute.
	 * @see #isSetCounterIncrement()
	 * @see #unsetCounterIncrement()
	 * @see #setCounterIncrement(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoopConditionType_CounterIncrement()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='counterIncrement'"
	 * @generated
	 */
	BigInteger getCounterIncrement();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getCounterIncrement <em>Counter Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Increment</em>' attribute.
	 * @see #isSetCounterIncrement()
	 * @see #unsetCounterIncrement()
	 * @see #getCounterIncrement()
	 * @generated
	 */
	void setCounterIncrement(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getCounterIncrement <em>Counter Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCounterIncrement()
	 * @see #getCounterIncrement()
	 * @see #setCounterIncrement(BigInteger)
	 * @generated
	 */
	void unsetCounterIncrement();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getCounterIncrement <em>Counter Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Counter Increment</em>' attribute is set.
	 * @see #unsetCounterIncrement()
	 * @see #getCounterIncrement()
	 * @see #setCounterIncrement(BigInteger)
	 * @generated
	 */
	boolean isSetCounterIncrement();

	/**
	 * Returns the value of the '<em><b>Final Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Counter</em>' attribute.
	 * @see #isSetFinalCounter()
	 * @see #unsetFinalCounter()
	 * @see #setFinalCounter(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoopConditionType_FinalCounter()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='finalCounter'"
	 * @generated
	 */
	BigInteger getFinalCounter();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getFinalCounter <em>Final Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Counter</em>' attribute.
	 * @see #isSetFinalCounter()
	 * @see #unsetFinalCounter()
	 * @see #getFinalCounter()
	 * @generated
	 */
	void setFinalCounter(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getFinalCounter <em>Final Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalCounter()
	 * @see #getFinalCounter()
	 * @see #setFinalCounter(BigInteger)
	 * @generated
	 */
	void unsetFinalCounter();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getFinalCounter <em>Final Counter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Counter</em>' attribute is set.
	 * @see #unsetFinalCounter()
	 * @see #getFinalCounter()
	 * @see #setFinalCounter(BigInteger)
	 * @generated
	 */
	boolean isSetFinalCounter();

	/**
	 * Returns the value of the '<em><b>Initial Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Counter</em>' attribute.
	 * @see #isSetInitialCounter()
	 * @see #unsetInitialCounter()
	 * @see #setInitialCounter(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoopConditionType_InitialCounter()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='initialCounter'"
	 * @generated
	 */
	BigInteger getInitialCounter();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getInitialCounter <em>Initial Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Counter</em>' attribute.
	 * @see #isSetInitialCounter()
	 * @see #unsetInitialCounter()
	 * @see #getInitialCounter()
	 * @generated
	 */
	void setInitialCounter(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getInitialCounter <em>Initial Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialCounter()
	 * @see #getInitialCounter()
	 * @see #setInitialCounter(BigInteger)
	 * @generated
	 */
	void unsetInitialCounter();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getInitialCounter <em>Initial Counter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Counter</em>' attribute is set.
	 * @see #unsetInitialCounter()
	 * @see #getInitialCounter()
	 * @see #setInitialCounter(BigInteger)
	 * @generated
	 */
	boolean isSetInitialCounter();

} // LoopConditionType