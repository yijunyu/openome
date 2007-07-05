/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ContainerImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUPER = 1;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUB = 2;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INTENTIONS = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ActorImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getActor()
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
	int ACTOR__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUPER = CONTAINER__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUB = CONTAINER__SUB;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INTENTIONS = CONTAINER__INTENTIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MODEL = CONTAINER__MODEL;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.AgentImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__SUPER = CONTAINER__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__SUB = CONTAINER__SUB;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INTENTIONS = CONTAINER__INTENTIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MODEL = CONTAINER__MODEL;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.DecompositionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.AndDecompositionImpl <em>And Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.AndDecompositionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getAndDecomposition()
	 * @generated
	 */
	int AND_DECOMPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__SOURCE = DECOMPOSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__TARGET = DECOMPOSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__MODEL = DECOMPOSITION__MODEL;

	/**
	 * The number of structural features of the '<em>And Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.AspectImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__SUPER = CONTAINER__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__SUB = CONTAINER__SUB;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__INTENTIONS = CONTAINER__INTENTIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__MODEL = CONTAINER__MODEL;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ContributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.BreakContributionImpl <em>Break Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.BreakContributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getBreakContribution()
	 * @generated
	 */
	int BREAK_CONTRIBUTION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_CONTRIBUTION__TARGET = CONTRIBUTION__TARGET;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_CONTRIBUTION__MODEL = CONTRIBUTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_CONTRIBUTION__SOURCE = CONTRIBUTION__SOURCE;

	/**
	 * The number of structural features of the '<em>Break Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_CONTRIBUTION_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.TruthLabelImpl <em>Truth Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.TruthLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTruthLabel()
	 * @generated
	 */
	int TRUTH_LABEL = 28;

	/**
	 * The number of structural features of the '<em>Truth Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_LABEL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ConflictLabelImpl <em>Conflict Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ConflictLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getConflictLabel()
	 * @generated
	 */
	int CONFLICT_LABEL = 5;

	/**
	 * The number of structural features of the '<em>Conflict Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_LABEL_FEATURE_COUNT = TRUTH_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.DeniedLabelImpl <em>Denied Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.DeniedLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDeniedLabel()
	 * @generated
	 */
	int DENIED_LABEL = 8;

	/**
	 * The number of structural features of the '<em>Denied Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_LABEL_FEATURE_COUNT = TRUTH_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.DependencyImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 9;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.IntentionImpl <em>Intention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.IntentionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getIntention()
	 * @generated
	 */
	int INTENTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__RULE = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__BOUNDARY = 4;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__INPUT = 5;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__EXCLUSIVE = 7;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__SEQUENTIAL = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__DEPENDENCY_FROM = 11;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__DEPENDENCY_TO = 12;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__DECOMPOSITIONS = 13;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__PARENT_DECOMPOSITIONS = 14;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__CONTAINER = 15;

	/**
	 * The number of structural features of the '<em>Intention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.GoalImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = INTENTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__LABEL = INTENTION__LABEL;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RULE = INTENTION__RULE;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SYSTEM = INTENTION__SYSTEM;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BOUNDARY = INTENTION__BOUNDARY;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__INPUT = INTENTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OUTPUT = INTENTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EXCLUSIVE = INTENTION__EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SEQUENTIAL = INTENTION__SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARALLEL = INTENTION__PARALLEL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PROPERTY = INTENTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPENDENCY_FROM = INTENTION__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPENDENCY_TO = INTENTION__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DECOMPOSITIONS = INTENTION__DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT_DECOMPOSITIONS = INTENTION__PARENT_DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTAINER = INTENTION__CONTAINER;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.HelpContributionImpl <em>Help Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.HelpContributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getHelpContribution()
	 * @generated
	 */
	int HELP_CONTRIBUTION = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTRIBUTION__TARGET = CONTRIBUTION__TARGET;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTRIBUTION__MODEL = CONTRIBUTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTRIBUTION__SOURCE = CONTRIBUTION__SOURCE;

	/**
	 * The number of structural features of the '<em>Help Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTRIBUTION_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.HurtContributionImpl <em>Hurt Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.HurtContributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getHurtContribution()
	 * @generated
	 */
	int HURT_CONTRIBUTION = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_CONTRIBUTION__TARGET = CONTRIBUTION__TARGET;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_CONTRIBUTION__MODEL = CONTRIBUTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_CONTRIBUTION__SOURCE = CONTRIBUTION__SOURCE;

	/**
	 * The number of structural features of the '<em>Hurt Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_CONTRIBUTION_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.MakeContributionImpl <em>Make Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.MakeContributionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getMakeContribution()
	 * @generated
	 */
	int MAKE_CONTRIBUTION = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CONTRIBUTION__TARGET = CONTRIBUTION__TARGET;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CONTRIBUTION__MODEL = CONTRIBUTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CONTRIBUTION__SOURCE = CONTRIBUTION__SOURCE;

	/**
	 * The number of structural features of the '<em>Make Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CONTRIBUTION_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ModelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INTENTIONS = 1;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTRIBUTIONS = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DECOMPOSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINERS = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.OrDecompositionImpl <em>Or Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.OrDecompositionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getOrDecomposition()
	 * @generated
	 */
	int OR_DECOMPOSITION = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__SOURCE = DECOMPOSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__TARGET = DECOMPOSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__MODEL = DECOMPOSITION__MODEL;

	/**
	 * The number of structural features of the '<em>Or Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.PartiallyDeniedLabelImpl <em>Partially Denied Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.PartiallyDeniedLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getPartiallyDeniedLabel()
	 * @generated
	 */
	int PARTIALLY_DENIED_LABEL = 17;

	/**
	 * The number of structural features of the '<em>Partially Denied Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_DENIED_LABEL_FEATURE_COUNT = TRUTH_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.PartiallySatisfiedLabelImpl <em>Partially Satisfied Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.PartiallySatisfiedLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getPartiallySatisfiedLabel()
	 * @generated
	 */
	int PARTIALLY_SATISFIED_LABEL = 18;

	/**
	 * The number of structural features of the '<em>Partially Satisfied Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_SATISFIED_LABEL_FEATURE_COUNT = TRUTH_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.PositionImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__SUPER = CONTAINER__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__SUB = CONTAINER__SUB;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__INTENTIONS = CONTAINER__INTENTIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__MODEL = CONTAINER__MODEL;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.PropertyImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 20;

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
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.ResourceImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = INTENTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABEL = INTENTION__LABEL;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RULE = INTENTION__RULE;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SYSTEM = INTENTION__SYSTEM;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BOUNDARY = INTENTION__BOUNDARY;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INPUT = INTENTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OUTPUT = INTENTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXCLUSIVE = INTENTION__EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SEQUENTIAL = INTENTION__SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARALLEL = INTENTION__PARALLEL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTY = INTENTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEPENDENCY_FROM = INTENTION__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEPENDENCY_TO = INTENTION__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DECOMPOSITIONS = INTENTION__DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARENT_DECOMPOSITIONS = INTENTION__PARENT_DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINER = INTENTION__CONTAINER;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.RoleImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Super</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUPER = CONTAINER__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUB = CONTAINER__SUB;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTENTIONS = CONTAINER__INTENTIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODEL = CONTAINER__MODEL;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.SatisfiedLabelImpl <em>Satisfied Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.SatisfiedLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getSatisfiedLabel()
	 * @generated
	 */
	int SATISFIED_LABEL = 23;

	/**
	 * The number of structural features of the '<em>Satisfied Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED_LABEL_FEATURE_COUNT = TRUTH_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.SoftgoalImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getSoftgoal()
	 * @generated
	 */
	int SOFTGOAL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__NAME = INTENTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__LABEL = INTENTION__LABEL;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__RULE = INTENTION__RULE;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__SYSTEM = INTENTION__SYSTEM;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__BOUNDARY = INTENTION__BOUNDARY;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__INPUT = INTENTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__OUTPUT = INTENTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__EXCLUSIVE = INTENTION__EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__SEQUENTIAL = INTENTION__SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__PARALLEL = INTENTION__PARALLEL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__PROPERTY = INTENTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__DEPENDENCY_FROM = INTENTION__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__DEPENDENCY_TO = INTENTION__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__DECOMPOSITIONS = INTENTION__DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__PARENT_DECOMPOSITIONS = INTENTION__PARENT_DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CONTAINER = INTENTION__CONTAINER;

	/**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.TaskImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = INTENTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LABEL = INTENTION__LABEL;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RULE = INTENTION__RULE;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SYSTEM = INTENTION__SYSTEM;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BOUNDARY = INTENTION__BOUNDARY;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT = INTENTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUT = INTENTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXCLUSIVE = INTENTION__EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SEQUENTIAL = INTENTION__SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARALLEL = INTENTION__PARALLEL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROPERTY = INTENTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCY_FROM = INTENTION__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCY_TO = INTENTION__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DECOMPOSITIONS = INTENTION__DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_DECOMPOSITIONS = INTENTION__PARENT_DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTAINER = INTENTION__CONTAINER;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.TopicImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 26;

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
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.goalmodel.impl.UnknownLabelImpl <em>Unknown Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.goalmodel.impl.UnknownLabelImpl
	 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getUnknownLabel()
	 * @generated
	 */
	int UNKNOWN_LABEL = 27;

	/**
	 * The number of structural features of the '<em>Unknown Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_LABEL_FEATURE_COUNT = TRUTH_LABEL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see edu.toronto.cs.goalmodel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see edu.toronto.cs.goalmodel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.AndDecomposition <em>And Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Decomposition</em>'.
	 * @see edu.toronto.cs.goalmodel.AndDecomposition
	 * @generated
	 */
	EClass getAndDecomposition();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see edu.toronto.cs.goalmodel.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.BreakContribution <em>Break Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Contribution</em>'.
	 * @see edu.toronto.cs.goalmodel.BreakContribution
	 * @generated
	 */
	EClass getBreakContribution();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.ConflictLabel <em>Conflict Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Label</em>'.
	 * @see edu.toronto.cs.goalmodel.ConflictLabel
	 * @generated
	 */
	EClass getConflictLabel();

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
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Contribution#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.goalmodel.Contribution#getModel()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Model();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.Contribution#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.toronto.cs.goalmodel.Contribution#getSource()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Source();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see edu.toronto.cs.goalmodel.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.Decomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.toronto.cs.goalmodel.Decomposition#getSource()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.Decomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.toronto.cs.goalmodel.Decomposition#getTarget()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Target();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Decomposition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.goalmodel.Decomposition#getModel()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Model();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.DeniedLabel <em>Denied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Denied Label</em>'.
	 * @see edu.toronto.cs.goalmodel.DeniedLabel
	 * @generated
	 */
	EClass getDeniedLabel();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see edu.toronto.cs.goalmodel.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.Dependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.goalmodel.Dependency#getDependencyFrom()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependencyFrom();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.goalmodel.Dependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.goalmodel.Dependency#getDependencyTo()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependencyTo();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Dependency#getTrust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust</em>'.
	 * @see edu.toronto.cs.goalmodel.Dependency#getTrust()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Trust();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Dependency#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.toronto.cs.goalmodel.Dependency#getLabel()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Label();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Dependency#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.goalmodel.Dependency#getModel()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Model();

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
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.HelpContribution <em>Help Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Contribution</em>'.
	 * @see edu.toronto.cs.goalmodel.HelpContribution
	 * @generated
	 */
	EClass getHelpContribution();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.HurtContribution <em>Hurt Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hurt Contribution</em>'.
	 * @see edu.toronto.cs.goalmodel.HurtContribution
	 * @generated
	 */
	EClass getHurtContribution();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Intention <em>Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intention</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention
	 * @generated
	 */
	EClass getIntention();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Intention#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getName()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Name();

	/**
	 * Returns the meta object for the containment reference '{@link edu.toronto.cs.goalmodel.Intention#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Label();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.Intention#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getRule()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Rule();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Intention#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getSystem()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_System();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Intention#getBoundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getBoundary()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Boundary();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Intention#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getInput()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Intention#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getOutput()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Output();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Intention#getExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getExclusive()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Exclusive();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Intention#getSequential <em>Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequential</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getSequential()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Sequential();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Intention#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getParallel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Intention#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getProperty()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Property();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.Intention#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getDependencyFrom()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_DependencyFrom();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.Intention#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getDependencyTo()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_DependencyTo();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.Intention#getDecompositions <em>Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decompositions</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getDecompositions()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Decompositions();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.goalmodel.Intention#getParentDecompositions <em>Parent Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Decompositions</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getParentDecompositions()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_ParentDecompositions();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Intention#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see edu.toronto.cs.goalmodel.Intention#getContainer()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Container();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.MakeContribution <em>Make Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make Contribution</em>'.
	 * @see edu.toronto.cs.goalmodel.MakeContribution
	 * @generated
	 */
	EClass getMakeContribution();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see edu.toronto.cs.goalmodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Model#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intentions</em>'.
	 * @see edu.toronto.cs.goalmodel.Model#getIntentions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Intentions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Model#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributions</em>'.
	 * @see edu.toronto.cs.goalmodel.Model#getContributions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contributions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Model#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see edu.toronto.cs.goalmodel.Model#getDependencies()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Model#getDecompositions <em>Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decompositions</em>'.
	 * @see edu.toronto.cs.goalmodel.Model#getDecompositions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Decompositions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Model#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see edu.toronto.cs.goalmodel.Model#getContainers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Containers();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.OrDecomposition <em>Or Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Decomposition</em>'.
	 * @see edu.toronto.cs.goalmodel.OrDecomposition
	 * @generated
	 */
	EClass getOrDecomposition();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.PartiallyDeniedLabel <em>Partially Denied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partially Denied Label</em>'.
	 * @see edu.toronto.cs.goalmodel.PartiallyDeniedLabel
	 * @generated
	 */
	EClass getPartiallyDeniedLabel();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.PartiallySatisfiedLabel <em>Partially Satisfied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partially Satisfied Label</em>'.
	 * @see edu.toronto.cs.goalmodel.PartiallySatisfiedLabel
	 * @generated
	 */
	EClass getPartiallySatisfiedLabel();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see edu.toronto.cs.goalmodel.Position
	 * @generated
	 */
	EClass getPosition();

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
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see edu.toronto.cs.goalmodel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.toronto.cs.goalmodel.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.SatisfiedLabel <em>Satisfied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfied Label</em>'.
	 * @see edu.toronto.cs.goalmodel.SatisfiedLabel
	 * @generated
	 */
	EClass getSatisfiedLabel();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softgoal</em>'.
	 * @see edu.toronto.cs.goalmodel.Softgoal
	 * @generated
	 */
	EClass getSoftgoal();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see edu.toronto.cs.goalmodel.Task
	 * @generated
	 */
	EClass getTask();

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
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Topic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.toronto.cs.goalmodel.Topic#getType()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Type();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.UnknownLabel <em>Unknown Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Label</em>'.
	 * @see edu.toronto.cs.goalmodel.UnknownLabel
	 * @generated
	 */
	EClass getUnknownLabel();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.TruthLabel <em>Truth Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truth Label</em>'.
	 * @see edu.toronto.cs.goalmodel.TruthLabel
	 * @generated
	 */
	EClass getTruthLabel();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.goalmodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see edu.toronto.cs.goalmodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.goalmodel.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.goalmodel.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Container#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super</em>'.
	 * @see edu.toronto.cs.goalmodel.Container#getSuper()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Super();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Container#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see edu.toronto.cs.goalmodel.Container#getSub()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.goalmodel.Container#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intentions</em>'.
	 * @see edu.toronto.cs.goalmodel.Container#getIntentions()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Intentions();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.goalmodel.Container#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.goalmodel.Container#getModel()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Model();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.ActorImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.AgentImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.AndDecompositionImpl <em>And Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.AndDecompositionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getAndDecomposition()
		 * @generated
		 */
		EClass AND_DECOMPOSITION = eINSTANCE.getAndDecomposition();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.AspectImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.BreakContributionImpl <em>Break Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.BreakContributionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getBreakContribution()
		 * @generated
		 */
		EClass BREAK_CONTRIBUTION = eINSTANCE.getBreakContribution();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.ConflictLabelImpl <em>Conflict Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.ConflictLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getConflictLabel()
		 * @generated
		 */
		EClass CONFLICT_LABEL = eINSTANCE.getConflictLabel();

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
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__TARGET = eINSTANCE.getContribution_Target();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__MODEL = eINSTANCE.getContribution_Model();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__SOURCE = eINSTANCE.getContribution_Source();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.DecompositionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__SOURCE = eINSTANCE.getDecomposition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__TARGET = eINSTANCE.getDecomposition_Target();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__MODEL = eINSTANCE.getDecomposition_Model();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.DeniedLabelImpl <em>Denied Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.DeniedLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDeniedLabel()
		 * @generated
		 */
		EClass DENIED_LABEL = eINSTANCE.getDeniedLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.DependencyImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDENCY_FROM = eINSTANCE.getDependency_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDENCY_TO = eINSTANCE.getDependency_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Trust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TRUST = eINSTANCE.getDependency_Trust();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__LABEL = eINSTANCE.getDependency_Label();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__MODEL = eINSTANCE.getDependency_Model();

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
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.HelpContributionImpl <em>Help Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.HelpContributionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getHelpContribution()
		 * @generated
		 */
		EClass HELP_CONTRIBUTION = eINSTANCE.getHelpContribution();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.HurtContributionImpl <em>Hurt Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.HurtContributionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getHurtContribution()
		 * @generated
		 */
		EClass HURT_CONTRIBUTION = eINSTANCE.getHurtContribution();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.IntentionImpl <em>Intention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.IntentionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getIntention()
		 * @generated
		 */
		EClass INTENTION = eINSTANCE.getIntention();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__NAME = eINSTANCE.getIntention_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__LABEL = eINSTANCE.getIntention_Label();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__RULE = eINSTANCE.getIntention_Rule();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__SYSTEM = eINSTANCE.getIntention_System();

		/**
		 * The meta object literal for the '<em><b>Boundary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__BOUNDARY = eINSTANCE.getIntention_Boundary();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__INPUT = eINSTANCE.getIntention_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__OUTPUT = eINSTANCE.getIntention_Output();

		/**
		 * The meta object literal for the '<em><b>Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__EXCLUSIVE = eINSTANCE.getIntention_Exclusive();

		/**
		 * The meta object literal for the '<em><b>Sequential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__SEQUENTIAL = eINSTANCE.getIntention_Sequential();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__PARALLEL = eINSTANCE.getIntention_Parallel();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__PROPERTY = eINSTANCE.getIntention_Property();

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__DEPENDENCY_FROM = eINSTANCE.getIntention_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__DEPENDENCY_TO = eINSTANCE.getIntention_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Decompositions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__DECOMPOSITIONS = eINSTANCE.getIntention_Decompositions();

		/**
		 * The meta object literal for the '<em><b>Parent Decompositions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__PARENT_DECOMPOSITIONS = eINSTANCE.getIntention_ParentDecompositions();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__CONTAINER = eINSTANCE.getIntention_Container();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.MakeContributionImpl <em>Make Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.MakeContributionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getMakeContribution()
		 * @generated
		 */
		EClass MAKE_CONTRIBUTION = eINSTANCE.getMakeContribution();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.ModelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Intentions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INTENTIONS = eINSTANCE.getModel_Intentions();

		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTRIBUTIONS = eINSTANCE.getModel_Contributions();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEPENDENCIES = eINSTANCE.getModel_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Decompositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DECOMPOSITIONS = eINSTANCE.getModel_Decompositions();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINERS = eINSTANCE.getModel_Containers();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.OrDecompositionImpl <em>Or Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.OrDecompositionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getOrDecomposition()
		 * @generated
		 */
		EClass OR_DECOMPOSITION = eINSTANCE.getOrDecomposition();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.PartiallyDeniedLabelImpl <em>Partially Denied Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.PartiallyDeniedLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getPartiallyDeniedLabel()
		 * @generated
		 */
		EClass PARTIALLY_DENIED_LABEL = eINSTANCE.getPartiallyDeniedLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.PartiallySatisfiedLabelImpl <em>Partially Satisfied Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.PartiallySatisfiedLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getPartiallySatisfiedLabel()
		 * @generated
		 */
		EClass PARTIALLY_SATISFIED_LABEL = eINSTANCE.getPartiallySatisfiedLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.PositionImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

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
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.ResourceImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.RoleImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.SatisfiedLabelImpl <em>Satisfied Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.SatisfiedLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getSatisfiedLabel()
		 * @generated
		 */
		EClass SATISFIED_LABEL = eINSTANCE.getSatisfiedLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.SoftgoalImpl <em>Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.SoftgoalImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getSoftgoal()
		 * @generated
		 */
		EClass SOFTGOAL = eINSTANCE.getSoftgoal();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.TaskImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TYPE = eINSTANCE.getTopic_Type();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.UnknownLabelImpl <em>Unknown Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.UnknownLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getUnknownLabel()
		 * @generated
		 */
		EClass UNKNOWN_LABEL = eINSTANCE.getUnknownLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.TruthLabelImpl <em>Truth Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.TruthLabelImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getTruthLabel()
		 * @generated
		 */
		EClass TRUTH_LABEL = eINSTANCE.getTruthLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.goalmodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.goalmodel.impl.ContainerImpl
		 * @see edu.toronto.cs.goalmodel.impl.GoalmodelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__SUPER = eINSTANCE.getContainer_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__SUB = eINSTANCE.getContainer_Sub();

		/**
		 * The meta object literal for the '<em><b>Intentions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__INTENTIONS = eINSTANCE.getContainer_Intentions();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__MODEL = eINSTANCE.getContainer_Model();

	}

} //GoalmodelPackage
