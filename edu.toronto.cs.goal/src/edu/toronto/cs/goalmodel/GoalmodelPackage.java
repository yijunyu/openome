/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelFactory
 * @model kind="package"
 * @generated
 */
public interface GoalmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "goalmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.toronto.edu/km/goalmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "goalmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoalmodelPackage eINSTANCE = edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ContributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.GoalImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT = 3;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL = 4;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TOPICS = 5;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RULE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PROPERTY = 7;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.PropertyImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.TopicImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 3;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TOPIC = 0;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.ContributionType <em>Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.ContributionType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContributionType()
	 * @generated
	 */
	int CONTRIBUTION_TYPE = 4;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.DecompositionType <em>Decomposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.DecompositionType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDecompositionType()
	 * @generated
	 */
	int DECOMPOSITION_TYPE = 5;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.LabelType <em>Label Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.LabelType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see edu.toronto.cs.goalmodel.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Contribution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.Contribution#getType()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Type();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.Contribution#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.toronto.cs.goalmodel.Contribution#getTarget()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Target();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Goal#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getLabel()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Label();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Goal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getType()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Type();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Goal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getParent()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Goal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getGoal()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Goal#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getTopics()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Goal#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getRule()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Goal#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see edu.toronto.cs.goalmodel.Goal#getProperty()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Property();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.toronto.cs.goalmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.toronto.cs.goalmodel.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see edu.toronto.cs.goalmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Topic#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see edu.toronto.cs.goalmodel.Topic#getTopic()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Topic();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.goalmodel.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contribution Type</em>'.
	 * @see edu.toronto.cs.goalmodel.ContributionType
	 * @generated
	 */
	EEnum getContributionType();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.goalmodel.DecompositionType <em>Decomposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Type</em>'.
	 * @see edu.toronto.cs.goalmodel.DecompositionType
	 * @generated
	 */
	EEnum getDecompositionType();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.goalmodel.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Type</em>'.
	 * @see edu.toronto.cs.goalmodel.LabelType
	 * @generated
	 */
	EEnum getLabelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GoalmodelFactory getGoalmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.ContributionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__TYPE = eINSTANCE.getContribution_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__TARGET = eINSTANCE.getContribution_Target();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.GoalImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__LABEL = eINSTANCE.getGoal_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TYPE = eINSTANCE.getGoal_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__PARENT = eINSTANCE.getGoal_Parent();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL = eINSTANCE.getGoal_Goal();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__TOPICS = eINSTANCE.getGoal_Topics();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__RULE = eINSTANCE.getGoal_Rule();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__PROPERTY = eINSTANCE.getGoal_Property();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.PropertyImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.TopicImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TOPIC = eINSTANCE.getTopic_Topic();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.ContributionType <em>Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.ContributionType
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContributionType()
		 * @generated
		 */
		EEnum CONTRIBUTION_TYPE = eINSTANCE.getContributionType();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.DecompositionType <em>Decomposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.DecompositionType
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDecompositionType()
		 * @generated
		 */
		EEnum DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.LabelType <em>Label Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.LabelType
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getLabelType()
		 * @generated
		 */
		EEnum LABEL_TYPE = eINSTANCE.getLabelType();

	}

} //GoalmodelPackage
