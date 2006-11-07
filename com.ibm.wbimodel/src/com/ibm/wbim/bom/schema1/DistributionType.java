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
 * A representation of the model object '<em><b>Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getExponential <em>Exponential</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getGamma <em>Gamma</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getLognormal <em>Lognormal</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getNormal <em>Normal</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getPoisson <em>Poisson</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getRandomList <em>Random List</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getUniform <em>Uniform</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.DistributionType#getWeightedList <em>Weighted List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType()
 * @model extendedMetaData="name='DistributionType' kind='elementOnly'"
 * @generated
 */
public interface DistributionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exponential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponential</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponential</em>' containment reference.
	 * @see #setExponential(ExponentialType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_Exponential()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exponential' namespace='##targetNamespace'"
	 * @generated
	 */
	ExponentialType getExponential();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getExponential <em>Exponential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponential</em>' containment reference.
	 * @see #getExponential()
	 * @generated
	 */
	void setExponential(ExponentialType value);

	/**
	 * Returns the value of the '<em><b>Gamma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamma</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamma</em>' containment reference.
	 * @see #setGamma(GammaType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_Gamma()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma' namespace='##targetNamespace'"
	 * @generated
	 */
	GammaType getGamma();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getGamma <em>Gamma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma</em>' containment reference.
	 * @see #getGamma()
	 * @generated
	 */
	void setGamma(GammaType value);

	/**
	 * Returns the value of the '<em><b>Lognormal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lognormal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lognormal</em>' containment reference.
	 * @see #setLognormal(LognormalType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_Lognormal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lognormal' namespace='##targetNamespace'"
	 * @generated
	 */
	LognormalType getLognormal();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getLognormal <em>Lognormal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lognormal</em>' containment reference.
	 * @see #getLognormal()
	 * @generated
	 */
	void setLognormal(LognormalType value);

	/**
	 * Returns the value of the '<em><b>Normal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal</em>' containment reference.
	 * @see #setNormal(NormalType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_Normal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='normal' namespace='##targetNamespace'"
	 * @generated
	 */
	NormalType getNormal();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getNormal <em>Normal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal</em>' containment reference.
	 * @see #getNormal()
	 * @generated
	 */
	void setNormal(NormalType value);

	/**
	 * Returns the value of the '<em><b>Poisson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poisson</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poisson</em>' containment reference.
	 * @see #setPoisson(PoissonType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_Poisson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='poisson' namespace='##targetNamespace'"
	 * @generated
	 */
	PoissonType getPoisson();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getPoisson <em>Poisson</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poisson</em>' containment reference.
	 * @see #getPoisson()
	 * @generated
	 */
	void setPoisson(PoissonType value);

	/**
	 * Returns the value of the '<em><b>Random List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random List</em>' containment reference.
	 * @see #setRandomList(RandomListType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_RandomList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='randomList' namespace='##targetNamespace'"
	 * @generated
	 */
	RandomListType getRandomList();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getRandomList <em>Random List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random List</em>' containment reference.
	 * @see #getRandomList()
	 * @generated
	 */
	void setRandomList(RandomListType value);

	/**
	 * Returns the value of the '<em><b>Uniform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uniform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniform</em>' containment reference.
	 * @see #setUniform(UniformType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_Uniform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uniform' namespace='##targetNamespace'"
	 * @generated
	 */
	UniformType getUniform();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getUniform <em>Uniform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniform</em>' containment reference.
	 * @see #getUniform()
	 * @generated
	 */
	void setUniform(UniformType value);

	/**
	 * Returns the value of the '<em><b>Weighted List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weighted List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weighted List</em>' containment reference.
	 * @see #setWeightedList(WeightedListType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getDistributionType_WeightedList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightedList' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightedListType getWeightedList();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.DistributionType#getWeightedList <em>Weighted List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighted List</em>' containment reference.
	 * @see #getWeightedList()
	 * @generated
	 */
	void setWeightedList(WeightedListType value);

} // DistributionType