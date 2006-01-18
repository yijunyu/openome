/**
 * <copyright>
 * </copyright>
 *
 * $Id: GoalmodelFactory.java,v 1.2 2005/09/26 00:01:59 yijunsf Exp $
 */
package edu.toronto.cs.goalmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage
 * @generated
 */
public interface GoalmodelFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoalmodelFactory eINSTANCE = new edu.toronto.cs.goalmodel.impl.GoalmodelFactoryImpl();

	/**
	 * Returns a new object of class '<em>contribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>contribution</em>'.
	 * @generated
	 */
	contribution createcontribution();

	/**
	 * Returns a new object of class '<em>goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>goal</em>'.
	 * @generated
	 */
	goal creategoal();

	/**
	 * Returns a new object of class '<em>property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>property</em>'.
	 * @generated
	 */
	property createproperty();

	/**
	 * Returns a new object of class '<em>topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>topic</em>'.
	 * @generated
	 */
	topic createtopic();

	/**
	 * Returns a new object of class '<em>actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>actor</em>'.
	 * @generated
	 */
	actor createactor();

	/**
	 * Returns a new object of class '<em>dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dependency</em>'.
	 * @generated
	 */
	dependency createdependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GoalmodelPackage getGoalmodelPackage();

} //GoalmodelFactory
