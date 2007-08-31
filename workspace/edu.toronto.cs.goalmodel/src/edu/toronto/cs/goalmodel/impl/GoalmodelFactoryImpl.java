/**
 * Copyright University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalmodelFactoryImpl extends EFactoryImpl implements GoalmodelFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright University of Toronto";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoalmodelFactory init() {
		try {
			GoalmodelFactory theGoalmodelFactory = (GoalmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http:///edu/toronto/cs/goalmodel.ecore"); 
			if (theGoalmodelFactory != null) {
				return theGoalmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GoalmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GoalmodelPackage.ACTOR: return createActor();
			case GoalmodelPackage.AGENT: return createAgent();
			case GoalmodelPackage.AND_DECOMPOSITION: return createAndDecomposition();
			case GoalmodelPackage.ASPECT: return createAspect();
			case GoalmodelPackage.BREAK_CONTRIBUTION: return createBreakContribution();
			case GoalmodelPackage.CONFLICT_LABEL: return createConflictLabel();
			case GoalmodelPackage.CONTRIBUTION: return createContribution();
			case GoalmodelPackage.DECOMPOSITION: return createDecomposition();
			case GoalmodelPackage.DENIED_LABEL: return createDeniedLabel();
			case GoalmodelPackage.DEPENDENCY: return createDependency();
			case GoalmodelPackage.GOAL: return createGoal();
			case GoalmodelPackage.HELP_CONTRIBUTION: return createHelpContribution();
			case GoalmodelPackage.HURT_CONTRIBUTION: return createHurtContribution();
			case GoalmodelPackage.INTENTION: return createIntention();
			case GoalmodelPackage.MAKE_CONTRIBUTION: return createMakeContribution();
			case GoalmodelPackage.MODEL: return createModel();
			case GoalmodelPackage.OR_DECOMPOSITION: return createOrDecomposition();
			case GoalmodelPackage.PARTIALLY_DENIED_LABEL: return createPartiallyDeniedLabel();
			case GoalmodelPackage.PARTIALLY_SATISFIED_LABEL: return createPartiallySatisfiedLabel();
			case GoalmodelPackage.POSITION: return createPosition();
			case GoalmodelPackage.PROPERTY: return createProperty();
			case GoalmodelPackage.RESOURCE: return createResource();
			case GoalmodelPackage.ROLE: return createRole();
			case GoalmodelPackage.SATISFIED_LABEL: return createSatisfiedLabel();
			case GoalmodelPackage.SOFTGOAL: return createSoftgoal();
			case GoalmodelPackage.TASK: return createTask();
			case GoalmodelPackage.TOPIC: return createTopic();
			case GoalmodelPackage.UNKNOWN_LABEL: return createUnknownLabel();
			case GoalmodelPackage.TRUTH_LABEL: return createTruthLabel();
			case GoalmodelPackage.CONTAINER: return createContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndDecomposition createAndDecomposition() {
		AndDecompositionImpl andDecomposition = new AndDecompositionImpl();
		return andDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakContribution createBreakContribution() {
		BreakContributionImpl breakContribution = new BreakContributionImpl();
		return breakContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictLabel createConflictLabel() {
		ConflictLabelImpl conflictLabel = new ConflictLabelImpl();
		return conflictLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeniedLabel createDeniedLabel() {
		DeniedLabelImpl deniedLabel = new DeniedLabelImpl();
		return deniedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpContribution createHelpContribution() {
		HelpContributionImpl helpContribution = new HelpContributionImpl();
		return helpContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HurtContribution createHurtContribution() {
		HurtContributionImpl hurtContribution = new HurtContributionImpl();
		return hurtContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intention createIntention() {
		IntentionImpl intention = new IntentionImpl();
		return intention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeContribution createMakeContribution() {
		MakeContributionImpl makeContribution = new MakeContributionImpl();
		return makeContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrDecomposition createOrDecomposition() {
		OrDecompositionImpl orDecomposition = new OrDecompositionImpl();
		return orDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartiallyDeniedLabel createPartiallyDeniedLabel() {
		PartiallyDeniedLabelImpl partiallyDeniedLabel = new PartiallyDeniedLabelImpl();
		return partiallyDeniedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartiallySatisfiedLabel createPartiallySatisfiedLabel() {
		PartiallySatisfiedLabelImpl partiallySatisfiedLabel = new PartiallySatisfiedLabelImpl();
		return partiallySatisfiedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfiedLabel createSatisfiedLabel() {
		SatisfiedLabelImpl satisfiedLabel = new SatisfiedLabelImpl();
		return satisfiedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal createSoftgoal() {
		SoftgoalImpl softgoal = new SoftgoalImpl();
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownLabel createUnknownLabel() {
		UnknownLabelImpl unknownLabel = new UnknownLabelImpl();
		return unknownLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthLabel createTruthLabel() {
		TruthLabelImpl truthLabel = new TruthLabelImpl();
		return truthLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalmodelPackage getGoalmodelPackage() {
		return (GoalmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GoalmodelPackage getPackage() {
		return GoalmodelPackage.eINSTANCE;
	}

} //GoalmodelFactoryImpl
