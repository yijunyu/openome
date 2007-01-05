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
	String eNS_URI = "http:///edu/toronto/cs/goalmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.toronto.cs.goalmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoalmodelPackage eINSTANCE = edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.actorImpl <em>actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.actorImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getactor()
	 * @generated
	 */
	int ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUPER = 1;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUB = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GOALS = 4;

	/**
	 * The number of structural features of the '<em>actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.contributionImpl <em>contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.contributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getcontribution()
	 * @generated
	 */
	int CONTRIBUTION = 1;

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
	 * The number of structural features of the '<em>contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.dependencyImpl <em>dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.dependencyImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getdependency()
	 * @generated
	 */
	int DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY_FROM = 0;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY_TO = 1;

	/**
	 * The feature id for the '<em><b>Trust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TRUST = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LABEL = 3;

	/**
	 * The number of structural features of the '<em>dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.goalImpl <em>goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.goalImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getgoal()
	 * @generated
	 */
	int GOAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RULE = 5;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BOUNDARY = 7;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__INPUT = 8;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EXCLUSIVE = 10;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SEQUENTIAL = 11;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARALLEL = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ACTOR = 14;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPENDENCY_FROM = 15;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPENDENCY_TO = 16;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MODE = 17;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ANNOTATION = 18;

	/**
	 * The number of structural features of the '<em>goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.propertyImpl <em>property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.propertyImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getproperty()
	 * @generated
	 */
	int PROPERTY = 4;

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
	 * The number of structural features of the '<em>property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.topicImpl <em>topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.topicImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#gettopic()
	 * @generated
	 */
	int TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TYPE = 1;

	/**
	 * The number of structural features of the '<em>topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.linkAnnotationImpl <em>link Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.linkAnnotationImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getlinkAnnotation()
	 * @generated
	 */
	int LINK_ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ANNOTATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ANNOTATION__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>link Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.ActorType <em>Actor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.ActorType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getActorType()
	 * @generated
	 */
	int ACTOR_TYPE = 7;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.ContributionType <em>Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.ContributionType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContributionType()
	 * @generated
	 */
	int CONTRIBUTION_TYPE = 8;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.DecompositionType <em>Decomposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.DecompositionType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDecompositionType()
	 * @generated
	 */
	int DECOMPOSITION_TYPE = 9;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.LabelType <em>Label Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.LabelType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 10;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.ModeType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 11;


	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.linkAnnotationType <em>link Annotation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.linkAnnotationType
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getlinkAnnotationType()
	 * @generated
	 */
	int LINK_ANNOTATION_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.actor <em>actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>actor</em>'.
	 * @see edu.toronto.cs.goalmodel.actor
	 * @generated
	 */
	EClass getactor();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.actor#getName()
	 * @see #getactor()
	 * @generated
	 */
	EAttribute getactor_Name();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.actor#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super</em>'.
	 * @see edu.toronto.cs.goalmodel.actor#getSuper()
	 * @see #getactor()
	 * @generated
	 */
	EReference getactor_Super();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.actor#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see edu.toronto.cs.goalmodel.actor#getSub()
	 * @see #getactor()
	 * @generated
	 */
	EReference getactor_Sub();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.actor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.actor#getType()
	 * @see #getactor()
	 * @generated
	 */
	EAttribute getactor_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.actor#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see edu.toronto.cs.goalmodel.actor#getGoals()
	 * @see #getactor()
	 * @generated
	 */
	EReference getactor_Goals();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.contribution <em>contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>contribution</em>'.
	 * @see edu.toronto.cs.goalmodel.contribution
	 * @generated
	 */
	EClass getcontribution();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.contribution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.contribution#getType()
	 * @see #getcontribution()
	 * @generated
	 */
	EAttribute getcontribution_Type();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.contribution#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.toronto.cs.goalmodel.contribution#getTarget()
	 * @see #getcontribution()
	 * @generated
	 */
	EReference getcontribution_Target();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.dependency <em>dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dependency</em>'.
	 * @see edu.toronto.cs.goalmodel.dependency
	 * @generated
	 */
	EClass getdependency();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.dependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.goalmodel.dependency#getDependencyFrom()
	 * @see #getdependency()
	 * @generated
	 */
	EReference getdependency_DependencyFrom();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.dependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.goalmodel.dependency#getDependencyTo()
	 * @see #getdependency()
	 * @generated
	 */
	EReference getdependency_DependencyTo();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.dependency#getTrust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust</em>'.
	 * @see edu.toronto.cs.goalmodel.dependency#getTrust()
	 * @see #getdependency()
	 * @generated
	 */
	EAttribute getdependency_Trust();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.dependency#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.toronto.cs.goalmodel.dependency#getLabel()
	 * @see #getdependency()
	 * @generated
	 */
	EAttribute getdependency_Label();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.goal <em>goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>goal</em>'.
	 * @see edu.toronto.cs.goalmodel.goal
	 * @generated
	 */
	EClass getgoal();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getName()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getType()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Type();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.goal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getParent()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.goal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getGoal()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Goal();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getLabel()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.goal#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getRule()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Rule();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getSystem()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_System();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getBoundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getBoundary()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Boundary();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.goal#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getInput()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.goal#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getOutput()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Output();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getExclusive()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Exclusive();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getSequential <em>Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequential</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getSequential()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Sequential();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getParallel()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.goal#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getProperty()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Property();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.goal#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actor</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getActor()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Actor();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.goal#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getDependencyFrom()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_DependencyFrom();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.goal#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getDependencyTo()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_DependencyTo();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.goal#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getMode()
	 * @see #getgoal()
	 * @generated
	 */
	EAttribute getgoal_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link edu.toronto.cs.goalmodel.goal#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see edu.toronto.cs.goalmodel.goal#getAnnotation()
	 * @see #getgoal()
	 * @generated
	 */
	EReference getgoal_Annotation();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.property <em>property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>property</em>'.
	 * @see edu.toronto.cs.goalmodel.property
	 * @generated
	 */
	EClass getproperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.property#getName()
	 * @see #getproperty()
	 * @generated
	 */
	EAttribute getproperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.toronto.cs.goalmodel.property#getValue()
	 * @see #getproperty()
	 * @generated
	 */
	EAttribute getproperty_Value();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.topic <em>topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>topic</em>'.
	 * @see edu.toronto.cs.goalmodel.topic
	 * @generated
	 */
	EClass gettopic();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.topic#getName()
	 * @see #gettopic()
	 * @generated
	 */
	EAttribute gettopic_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.topic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.topic#getType()
	 * @see #gettopic()
	 * @generated
	 */
	EAttribute gettopic_Type();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.linkAnnotation <em>link Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>link Annotation</em>'.
	 * @see edu.toronto.cs.goalmodel.linkAnnotation
	 * @generated
	 */
	EClass getlinkAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.linkAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.linkAnnotation#getType()
	 * @see #getlinkAnnotation()
	 * @generated
	 */
	EAttribute getlinkAnnotation_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.linkAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see edu.toronto.cs.goalmodel.linkAnnotation#getDetails()
	 * @see #getlinkAnnotation()
	 * @generated
	 */
	EAttribute getlinkAnnotation_Details();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.goalmodel.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Type</em>'.
	 * @see edu.toronto.cs.goalmodel.ActorType
	 * @generated
	 */
	EEnum getActorType();

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
	 * Returns the meta object for enum '{@link edu.toronto.cs.goalmodel.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see edu.toronto.cs.goalmodel.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.goalmodel.linkAnnotationType <em>link Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>link Annotation Type</em>'.
	 * @see edu.toronto.cs.goalmodel.linkAnnotationType
	 * @generated
	 */
	EEnum getlinkAnnotationType();

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
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.actorImpl <em>actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.actorImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getactor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getactor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getactor_Name();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SUPER = eINSTANCE.getactor_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SUB = eINSTANCE.getactor_Sub();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__TYPE = eINSTANCE.getactor_Type();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__GOALS = eINSTANCE.getactor_Goals();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.contributionImpl <em>contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.contributionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getcontribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getcontribution();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__TYPE = eINSTANCE.getcontribution_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__TARGET = eINSTANCE.getcontribution_Target();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.dependencyImpl <em>dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.dependencyImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getdependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getdependency();

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDENCY_FROM = eINSTANCE.getdependency_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDENCY_TO = eINSTANCE.getdependency_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Trust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TRUST = eINSTANCE.getdependency_Trust();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__LABEL = eINSTANCE.getdependency_Label();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.goalImpl <em>goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.goalImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getgoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getgoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getgoal_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TYPE = eINSTANCE.getgoal_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__PARENT = eINSTANCE.getgoal_Parent();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL = eINSTANCE.getgoal_Goal();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__LABEL = eINSTANCE.getgoal_Label();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__RULE = eINSTANCE.getgoal_Rule();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__SYSTEM = eINSTANCE.getgoal_System();

		/**
		 * The meta object literal for the '<em><b>Boundary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__BOUNDARY = eINSTANCE.getgoal_Boundary();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__INPUT = eINSTANCE.getgoal_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__OUTPUT = eINSTANCE.getgoal_Output();

		/**
		 * The meta object literal for the '<em><b>Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__EXCLUSIVE = eINSTANCE.getgoal_Exclusive();

		/**
		 * The meta object literal for the '<em><b>Sequential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__SEQUENTIAL = eINSTANCE.getgoal_Sequential();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__PARALLEL = eINSTANCE.getgoal_Parallel();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__PROPERTY = eINSTANCE.getgoal_Property();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ACTOR = eINSTANCE.getgoal_Actor();

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__DEPENDENCY_FROM = eINSTANCE.getgoal_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__DEPENDENCY_TO = eINSTANCE.getgoal_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__MODE = eINSTANCE.getgoal_Mode();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ANNOTATION = eINSTANCE.getgoal_Annotation();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.propertyImpl <em>property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.propertyImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getproperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getproperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getproperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getproperty_Value();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.topicImpl <em>topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.topicImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#gettopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.gettopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.gettopic_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TYPE = eINSTANCE.gettopic_Type();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.linkAnnotationImpl <em>link Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.linkAnnotationImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getlinkAnnotation()
		 * @generated
		 */
		EClass LINK_ANNOTATION = eINSTANCE.getlinkAnnotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ANNOTATION__TYPE = eINSTANCE.getlinkAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ANNOTATION__DETAILS = eINSTANCE.getlinkAnnotation_Details();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.ActorType <em>Actor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.ActorType
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getActorType()
		 * @generated
		 */
		EEnum ACTOR_TYPE = eINSTANCE.getActorType();

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

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.ModeType <em>Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.ModeType
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getModeType()
		 * @generated
		 */
		EEnum MODE_TYPE = eINSTANCE.getModeType();

			/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.linkAnnotationType <em>link Annotation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.linkAnnotationType
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getlinkAnnotationType()
		 * @generated
		 */
		EEnum LINK_ANNOTATION_TYPE = eINSTANCE.getlinkAnnotationType();

	}

} //GoalmodelPackage
