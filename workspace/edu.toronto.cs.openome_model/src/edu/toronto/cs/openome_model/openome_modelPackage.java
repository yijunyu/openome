/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model;

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
 * @see edu.toronto.cs.openome_model.openome_modelFactory
 * @model kind="package"
 * @generated
 */
public interface openome_modelPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openome_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///edu/toronto/cs/openome_model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.toronto.cs.openome_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	openome_modelPackage eINSTANCE = edu.toronto.cs.openome_model.impl.openome_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.ContainerImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUB = 1;

	/**
	 * The feature id for the '<em><b>Intentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INTENTIONS = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MODEL = 3;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEPENDENCY_FROM = 4;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEPENDENCY_TO = 5;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.ActorImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getActor()
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
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DEPENDENCY_FROM = CONTAINER__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DEPENDENCY_TO = CONTAINER__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Is a</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_A = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is part of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_PART_OF = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Believes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__BELIEVES = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.AgentImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getAgent()
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
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DEPENDENCY_FROM = CONTAINER__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DEPENDENCY_TO = CONTAINER__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Plays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PLAYS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occupies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__OCCUPIES = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INS = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.LinkImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 18;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.DecompositionImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__MODEL = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.AndDecompositionImpl <em>And Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.AndDecompositionImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getAndDecomposition()
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
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.ContributionImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__MODEL = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SOURCE = LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Goal model contribution type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__GOAL_MODEL_CONTRIBUTION_TYPE = LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Istar contribution type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__ISTAR_CONTRIBUTION_TYPE = LINK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Goal model symmetry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__GOAL_MODEL_SYMMETRY = LINK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = LINK_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.DependencyImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY_FROM = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY_TO = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TRUST = LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LABEL = LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__MODEL = LINK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actor Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ACTOR_DEPENDENCY_FROM = LINK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actor Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ACTOR_DEPENDENCY_TO = LINK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = LINK_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.IntentionImpl <em>Intention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.IntentionImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getIntention()
	 * @generated
	 */
	int INTENTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__BOUNDARY = 2;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__EXCLUSIVE = 3;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__SEQUENTIAL = 4;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__PARALLEL = 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__DEPENDENCY_FROM = 7;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__DEPENDENCY_TO = 8;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__DECOMPOSITIONS = 9;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__PARENT_DECOMPOSITIONS = 10;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__MODEL = 12;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL = 13;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL = 14;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL = 15;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL = 16;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL = 17;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL = 18;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__CONTRIBUTES_TO = 19;

	/**
	 * The feature id for the '<em><b>Contributes From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION__CONTRIBUTES_FROM = 20;

	/**
	 * The number of structural features of the '<em>Intention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.GoalImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = INTENTION__NAME;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MODEL = INTENTION__MODEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUALITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUALITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUALITATIVE_REASONING_DENIAL_LABEL = INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUANTITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUANTITATIVE_REASONING_DENIED_LABEL = INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUANTITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTES_TO = INTENTION__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Contributes From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTES_FROM = INTENTION__CONTRIBUTES_FROM;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.ModelImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

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
	 * The feature id for the '<em><b>Correlations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CORRELATIONS = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.OrDecompositionImpl <em>Or Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.OrDecompositionImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getOrDecomposition()
	 * @generated
	 */
	int OR_DECOMPOSITION = 9;

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
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.PositionImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = CONTAINER__NAME;

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
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__DEPENDENCY_FROM = CONTAINER__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__DEPENDENCY_TO = CONTAINER__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Covers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__COVERS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.PropertyImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

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
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.ResourceImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = INTENTION__NAME;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MODEL = INTENTION__MODEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__QUALITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__QUALITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__QUALITATIVE_REASONING_DENIAL_LABEL = INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__QUANTITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__QUANTITATIVE_REASONING_DENIED_LABEL = INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__QUANTITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTES_TO = INTENTION__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Contributes From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTES_FROM = INTENTION__CONTRIBUTES_FROM;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.RoleImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = CONTAINER__NAME;

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
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEPENDENCY_FROM = CONTAINER__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEPENDENCY_TO = CONTAINER__DEPENDENCY_TO;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.SoftgoalImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getSoftgoal()
	 * @generated
	 */
	int SOFTGOAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__NAME = INTENTION__NAME;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__MODEL = INTENTION__MODEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__QUALITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__QUALITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__QUALITATIVE_REASONING_DENIAL_LABEL = INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__QUANTITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__QUANTITATIVE_REASONING_DENIED_LABEL = INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__QUANTITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CONTRIBUTES_TO = INTENTION__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Contributes From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CONTRIBUTES_FROM = INTENTION__CONTRIBUTES_FROM;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__TOPIC = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.TaskImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = INTENTION__NAME;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODEL = INTENTION__MODEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUALITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUALITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUALITATIVE_REASONING_DENIAL_LABEL = INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUANTITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUANTITATIVE_REASONING_DENIED_LABEL = INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUANTITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTES_TO = INTENTION__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Contributes From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTES_FROM = INTENTION__CONTRIBUTES_FROM;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.BeliefImpl <em>Belief</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.BeliefImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getBelief()
	 * @generated
	 */
	int BELIEF = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__NAME = INTENTION__NAME;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__SYSTEM = INTENTION__SYSTEM;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__BOUNDARY = INTENTION__BOUNDARY;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__EXCLUSIVE = INTENTION__EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__SEQUENTIAL = INTENTION__SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__PARALLEL = INTENTION__PARALLEL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__PROPERTY = INTENTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__DEPENDENCY_FROM = INTENTION__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__DEPENDENCY_TO = INTENTION__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__DECOMPOSITIONS = INTENTION__DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Parent Decompositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__PARENT_DECOMPOSITIONS = INTENTION__PARENT_DECOMPOSITIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__CONTAINER = INTENTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__MODEL = INTENTION__MODEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__QUALITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__QUALITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__QUALITATIVE_REASONING_DENIAL_LABEL = INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__QUANTITATIVE_REASONING_COMBINED_LABEL = INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__QUANTITATIVE_REASONING_DENIED_LABEL = INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL;

	/**
	 * The feature id for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__QUANTITATIVE_REASONING_SATISFIED_LABEL = INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__CONTRIBUTES_TO = INTENTION__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Contributes From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__CONTRIBUTES_FROM = INTENTION__CONTRIBUTES_FROM;

	/**
	 * The number of structural features of the '<em>Belief</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF_FEATURE_COUNT = INTENTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.impl.CorrelationImpl
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__TARGET = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__SOURCE = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.EvaluationLabel <em>Evaluation Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.EvaluationLabel
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getEvaluationLabel()
	 * @generated
	 */
	int EVALUATION_LABEL = 20;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.GoalModelingContributionType <em>Goal Modeling Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.GoalModelingContributionType
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getGoalModelingContributionType()
	 * @generated
	 */
	int GOAL_MODELING_CONTRIBUTION_TYPE = 21;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.IStarContributionType <em>IStar Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.IStarContributionType
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getIStarContributionType()
	 * @generated
	 */
	int ISTAR_CONTRIBUTION_TYPE = 22;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.openome_model.GoalModelingContributionSymmetry <em>Goal Modeling Contribution Symmetry</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.openome_model.GoalModelingContributionSymmetry
	 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getGoalModelingContributionSymmetry()
	 * @generated
	 */
	int GOAL_MODELING_CONTRIBUTION_SYMMETRY = 23;

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see edu.toronto.cs.openome_model.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Actor#getIs_a <em>Is a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is a</em>'.
	 * @see edu.toronto.cs.openome_model.Actor#getIs_a()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Is_a();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Actor#getIs_part_of <em>Is part of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is part of</em>'.
	 * @see edu.toronto.cs.openome_model.Actor#getIs_part_of()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Is_part_of();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Actor#getBelieves <em>Believes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Believes</em>'.
	 * @see edu.toronto.cs.openome_model.Actor#getBelieves()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Believes();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see edu.toronto.cs.openome_model.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Agent#getPlays <em>Plays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plays</em>'.
	 * @see edu.toronto.cs.openome_model.Agent#getPlays()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Plays();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Agent#getOccupies <em>Occupies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupies</em>'.
	 * @see edu.toronto.cs.openome_model.Agent#getOccupies()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Occupies();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Agent#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ins</em>'.
	 * @see edu.toronto.cs.openome_model.Agent#getIns()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Ins();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.AndDecomposition <em>And Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Decomposition</em>'.
	 * @see edu.toronto.cs.openome_model.AndDecomposition
	 * @generated
	 */
	EClass getAndDecomposition();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Contribution#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution#getTarget()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Target();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.openome_model.Contribution#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution#getModel()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Model();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Contribution#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution#getSource()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Source();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Contribution#getGoal_model_contribution_type <em>Goal model contribution type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal model contribution type</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution#getGoal_model_contribution_type()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Goal_model_contribution_type();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Contribution#getIstar_contribution_type <em>Istar contribution type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Istar contribution type</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution#getIstar_contribution_type()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Istar_contribution_type();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Contribution#getGoal_model_symmetry <em>Goal model symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal model symmetry</em>'.
	 * @see edu.toronto.cs.openome_model.Contribution#getGoal_model_symmetry()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Goal_model_symmetry();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see edu.toronto.cs.openome_model.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Decomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.toronto.cs.openome_model.Decomposition#getSource()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Decomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.toronto.cs.openome_model.Decomposition#getTarget()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Target();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.openome_model.Decomposition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.openome_model.Decomposition#getModel()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Model();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Dependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getDependencyFrom()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependencyFrom();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Dependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getDependencyTo()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependencyTo();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Dependency#getTrust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getTrust()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Trust();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Dependency#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getLabel()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Label();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.openome_model.Dependency#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getModel()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Model();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Dependency#getActorDependencyFrom <em>Actor Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor Dependency From</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getActorDependencyFrom()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_ActorDependencyFrom();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Dependency#getActorDependencyTo <em>Actor Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Dependency To</em>'.
	 * @see edu.toronto.cs.openome_model.Dependency#getActorDependencyTo()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_ActorDependencyTo();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see edu.toronto.cs.openome_model.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Intention <em>Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intention</em>'.
	 * @see edu.toronto.cs.openome_model.Intention
	 * @generated
	 */
	EClass getIntention();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getName()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getSystem()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_System();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getBoundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getBoundary()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Boundary();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getExclusive()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Exclusive();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getSequential <em>Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequential</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getSequential()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Sequential();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getParallel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Intention#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getProperty()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Property();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Intention#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getDependencyFrom()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_DependencyFrom();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Intention#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getDependencyTo()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_DependencyTo();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Intention#getDecompositions <em>Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decompositions</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getDecompositions()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Decompositions();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Intention#getParentDecompositions <em>Parent Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Decompositions</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getParentDecompositions()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_ParentDecompositions();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.openome_model.Intention#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getContainer()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Container();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.openome_model.Intention#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getModel()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_Model();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getQualitativeReasoningCombinedLabel <em>Qualitative Reasoning Combined Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualitative Reasoning Combined Label</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getQualitativeReasoningCombinedLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_QualitativeReasoningCombinedLabel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getQualitativeReasoningSatisfiedLabel <em>Qualitative Reasoning Satisfied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualitative Reasoning Satisfied Label</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getQualitativeReasoningSatisfiedLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_QualitativeReasoningSatisfiedLabel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getQualitativeReasoningDenialLabel <em>Qualitative Reasoning Denial Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualitative Reasoning Denial Label</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getQualitativeReasoningDenialLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_QualitativeReasoningDenialLabel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getQuantitativeReasoningCombinedLabel <em>Quantitative Reasoning Combined Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantitative Reasoning Combined Label</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getQuantitativeReasoningCombinedLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_QuantitativeReasoningCombinedLabel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getQuantitativeReasoningDeniedLabel <em>Quantitative Reasoning Denied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantitative Reasoning Denied Label</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getQuantitativeReasoningDeniedLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_QuantitativeReasoningDeniedLabel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Intention#getQuantitativeReasoningSatisfiedLabel <em>Quantitative Reasoning Satisfied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantitative Reasoning Satisfied Label</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getQuantitativeReasoningSatisfiedLabel()
	 * @see #getIntention()
	 * @generated
	 */
	EAttribute getIntention_QuantitativeReasoningSatisfiedLabel();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Intention#getContributesTo <em>Contributes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getContributesTo()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_ContributesTo();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Intention#getContributesFrom <em>Contributes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes From</em>'.
	 * @see edu.toronto.cs.openome_model.Intention#getContributesFrom()
	 * @see #getIntention()
	 * @generated
	 */
	EReference getIntention_ContributesFrom();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see edu.toronto.cs.openome_model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Model#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intentions</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getIntentions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Intentions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Model#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributions</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getContributions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contributions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Model#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getDependencies()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Model#getDecompositions <em>Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decompositions</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getDecompositions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Decompositions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Model#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getContainers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Containers();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Model#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correlations</em>'.
	 * @see edu.toronto.cs.openome_model.Model#getCorrelations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Correlations();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.OrDecomposition <em>Or Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Decomposition</em>'.
	 * @see edu.toronto.cs.openome_model.OrDecomposition
	 * @generated
	 */
	EClass getOrDecomposition();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see edu.toronto.cs.openome_model.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Position#getCovers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covers</em>'.
	 * @see edu.toronto.cs.openome_model.Position#getCovers()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Covers();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.toronto.cs.openome_model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.openome_model.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.toronto.cs.openome_model.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see edu.toronto.cs.openome_model.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.toronto.cs.openome_model.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softgoal</em>'.
	 * @see edu.toronto.cs.openome_model.Softgoal
	 * @generated
	 */
	EClass getSoftgoal();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Softgoal#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see edu.toronto.cs.openome_model.Softgoal#getTopic()
	 * @see #getSoftgoal()
	 * @generated
	 */
	EAttribute getSoftgoal_Topic();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see edu.toronto.cs.openome_model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see edu.toronto.cs.openome_model.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.openome_model.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.toronto.cs.openome_model.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Container#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see edu.toronto.cs.openome_model.Container#getSub()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.openome_model.Container#getIntentions <em>Intentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intentions</em>'.
	 * @see edu.toronto.cs.openome_model.Container#getIntentions()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Intentions();

	/**
	 * Returns the meta object for the container reference '{@link edu.toronto.cs.openome_model.Container#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see edu.toronto.cs.openome_model.Container#getModel()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Model();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Container#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency From</em>'.
	 * @see edu.toronto.cs.openome_model.Container#getDependencyFrom()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_DependencyFrom();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.openome_model.Container#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency To</em>'.
	 * @see edu.toronto.cs.openome_model.Container#getDependencyTo()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_DependencyTo();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief</em>'.
	 * @see edu.toronto.cs.openome_model.Belief
	 * @generated
	 */
	EClass getBelief();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see edu.toronto.cs.openome_model.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.openome_model.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see edu.toronto.cs.openome_model.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Correlation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.toronto.cs.openome_model.Correlation#getTarget()
	 * @see #getCorrelation()
	 * @generated
	 */
	EReference getCorrelation_Target();

	/**
	 * Returns the meta object for the reference '{@link edu.toronto.cs.openome_model.Correlation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.toronto.cs.openome_model.Correlation#getSource()
	 * @see #getCorrelation()
	 * @generated
	 */
	EReference getCorrelation_Source();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.openome_model.EvaluationLabel <em>Evaluation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Label</em>'.
	 * @see edu.toronto.cs.openome_model.EvaluationLabel
	 * @generated
	 */
	EEnum getEvaluationLabel();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.openome_model.GoalModelingContributionType <em>Goal Modeling Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Modeling Contribution Type</em>'.
	 * @see edu.toronto.cs.openome_model.GoalModelingContributionType
	 * @generated
	 */
	EEnum getGoalModelingContributionType();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.openome_model.IStarContributionType <em>IStar Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IStar Contribution Type</em>'.
	 * @see edu.toronto.cs.openome_model.IStarContributionType
	 * @generated
	 */
	EEnum getIStarContributionType();

	/**
	 * Returns the meta object for enum '{@link edu.toronto.cs.openome_model.GoalModelingContributionSymmetry <em>Goal Modeling Contribution Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Modeling Contribution Symmetry</em>'.
	 * @see edu.toronto.cs.openome_model.GoalModelingContributionSymmetry
	 * @generated
	 */
	EEnum getGoalModelingContributionSymmetry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	openome_modelFactory getopenome_modelFactory();

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
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.ActorImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Is a</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__IS_A = eINSTANCE.getActor_Is_a();

		/**
		 * The meta object literal for the '<em><b>Is part of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__IS_PART_OF = eINSTANCE.getActor_Is_part_of();

		/**
		 * The meta object literal for the '<em><b>Believes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__BELIEVES = eINSTANCE.getActor_Believes();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.AgentImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Plays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PLAYS = eINSTANCE.getAgent_Plays();

		/**
		 * The meta object literal for the '<em><b>Occupies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__OCCUPIES = eINSTANCE.getAgent_Occupies();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__INS = eINSTANCE.getAgent_Ins();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.AndDecompositionImpl <em>And Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.AndDecompositionImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getAndDecomposition()
		 * @generated
		 */
		EClass AND_DECOMPOSITION = eINSTANCE.getAndDecomposition();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.ContributionImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getContribution()
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
		 * The meta object literal for the '<em><b>Goal model contribution type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__GOAL_MODEL_CONTRIBUTION_TYPE = eINSTANCE.getContribution_Goal_model_contribution_type();

		/**
		 * The meta object literal for the '<em><b>Istar contribution type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__ISTAR_CONTRIBUTION_TYPE = eINSTANCE.getContribution_Istar_contribution_type();

		/**
		 * The meta object literal for the '<em><b>Goal model symmetry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__GOAL_MODEL_SYMMETRY = eINSTANCE.getContribution_Goal_model_symmetry();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.DecompositionImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getDecomposition()
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
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.DependencyImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getDependency()
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
		 * The meta object literal for the '<em><b>Actor Dependency From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__ACTOR_DEPENDENCY_FROM = eINSTANCE.getDependency_ActorDependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Actor Dependency To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__ACTOR_DEPENDENCY_TO = eINSTANCE.getDependency_ActorDependencyTo();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.GoalImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.IntentionImpl <em>Intention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.IntentionImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getIntention()
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
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__MODEL = eINSTANCE.getIntention_Model();

		/**
		 * The meta object literal for the '<em><b>Qualitative Reasoning Combined Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL = eINSTANCE.getIntention_QualitativeReasoningCombinedLabel();

		/**
		 * The meta object literal for the '<em><b>Qualitative Reasoning Satisfied Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL = eINSTANCE.getIntention_QualitativeReasoningSatisfiedLabel();

		/**
		 * The meta object literal for the '<em><b>Qualitative Reasoning Denial Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL = eINSTANCE.getIntention_QualitativeReasoningDenialLabel();

		/**
		 * The meta object literal for the '<em><b>Quantitative Reasoning Combined Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL = eINSTANCE.getIntention_QuantitativeReasoningCombinedLabel();

		/**
		 * The meta object literal for the '<em><b>Quantitative Reasoning Denied Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL = eINSTANCE.getIntention_QuantitativeReasoningDeniedLabel();

		/**
		 * The meta object literal for the '<em><b>Quantitative Reasoning Satisfied Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL = eINSTANCE.getIntention_QuantitativeReasoningSatisfiedLabel();

		/**
		 * The meta object literal for the '<em><b>Contributes To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__CONTRIBUTES_TO = eINSTANCE.getIntention_ContributesTo();

		/**
		 * The meta object literal for the '<em><b>Contributes From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTION__CONTRIBUTES_FROM = eINSTANCE.getIntention_ContributesFrom();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.ModelImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getModel()
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
		 * The meta object literal for the '<em><b>Correlations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CORRELATIONS = eINSTANCE.getModel_Correlations();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.OrDecompositionImpl <em>Or Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.OrDecompositionImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getOrDecomposition()
		 * @generated
		 */
		EClass OR_DECOMPOSITION = eINSTANCE.getOrDecomposition();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.PositionImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Covers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__COVERS = eINSTANCE.getPosition_Covers();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.PropertyImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.ResourceImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.RoleImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.SoftgoalImpl <em>Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.SoftgoalImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getSoftgoal()
		 * @generated
		 */
		EClass SOFTGOAL = eINSTANCE.getSoftgoal();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTGOAL__TOPIC = eINSTANCE.getSoftgoal_Topic();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.TaskImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.ContainerImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getContainer()
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

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DEPENDENCY_FROM = eINSTANCE.getContainer_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DEPENDENCY_TO = eINSTANCE.getContainer_DependencyTo();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.BeliefImpl <em>Belief</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.BeliefImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getBelief()
		 * @generated
		 */
		EClass BELIEF = eINSTANCE.getBelief();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.LinkImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.impl.CorrelationImpl
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION__TARGET = eINSTANCE.getCorrelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION__SOURCE = eINSTANCE.getCorrelation_Source();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.EvaluationLabel <em>Evaluation Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.EvaluationLabel
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getEvaluationLabel()
		 * @generated
		 */
		EEnum EVALUATION_LABEL = eINSTANCE.getEvaluationLabel();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.GoalModelingContributionType <em>Goal Modeling Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.GoalModelingContributionType
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getGoalModelingContributionType()
		 * @generated
		 */
		EEnum GOAL_MODELING_CONTRIBUTION_TYPE = eINSTANCE.getGoalModelingContributionType();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.IStarContributionType <em>IStar Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.IStarContributionType
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getIStarContributionType()
		 * @generated
		 */
		EEnum ISTAR_CONTRIBUTION_TYPE = eINSTANCE.getIStarContributionType();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.openome_model.GoalModelingContributionSymmetry <em>Goal Modeling Contribution Symmetry</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.openome_model.GoalModelingContributionSymmetry
		 * @see edu.toronto.cs.openome_model.impl.openome_modelPackageImpl#getGoalModelingContributionSymmetry()
		 * @generated
		 */
		EEnum GOAL_MODELING_CONTRIBUTION_SYMMETRY = eINSTANCE.getGoalModelingContributionSymmetry();

	}

} //openome_modelPackage
