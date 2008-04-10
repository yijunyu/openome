/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.*;

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
public class openome_modelFactoryImpl extends EFactoryImpl implements openome_modelFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static openome_modelFactory init() {
		try {
			openome_modelFactory theopenome_modelFactory = (openome_modelFactory)EPackage.Registry.INSTANCE.getEFactory("http:///edu/toronto/cs/openome_model.ecore"); 
			if (theopenome_modelFactory != null) {
				return theopenome_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new openome_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public openome_modelFactoryImpl() {
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
			case openome_modelPackage.ACTOR: return createActor();
			case openome_modelPackage.AGENT: return createAgent();
			case openome_modelPackage.AND_DECOMPOSITION: return createAndDecomposition();
			case openome_modelPackage.ASPECT: return createAspect();
			case openome_modelPackage.BREAK_CONTRIBUTION: return createBreakContribution();
			case openome_modelPackage.CONFLICT_LABEL: return createConflictLabel();
			case openome_modelPackage.CONTRIBUTION: return createContribution();
			case openome_modelPackage.DECOMPOSITION: return createDecomposition();
			case openome_modelPackage.DENIED_LABEL: return createDeniedLabel();
			case openome_modelPackage.DEPENDENCY: return createDependency();
			case openome_modelPackage.GOAL: return createGoal();
			case openome_modelPackage.HELP_CONTRIBUTION: return createHelpContribution();
			case openome_modelPackage.HURT_CONTRIBUTION: return createHurtContribution();
			case openome_modelPackage.INTENTION: return createIntention();
			case openome_modelPackage.MAKE_CONTRIBUTION: return createMakeContribution();
			case openome_modelPackage.MODEL: return createModel();
			case openome_modelPackage.OR_DECOMPOSITION: return createOrDecomposition();
			case openome_modelPackage.PARTIALLY_DENIED_LABEL: return createPartiallyDeniedLabel();
			case openome_modelPackage.PARTIALLY_SATISFIED_LABEL: return createPartiallySatisfiedLabel();
			case openome_modelPackage.POSITION: return createPosition();
			case openome_modelPackage.PROPERTY: return createProperty();
			case openome_modelPackage.RESOURCE: return createResource();
			case openome_modelPackage.ROLE: return createRole();
			case openome_modelPackage.SATISFIED_LABEL: return createSatisfiedLabel();
			case openome_modelPackage.SOFTGOAL: return createSoftgoal();
			case openome_modelPackage.TASK: return createTask();
			case openome_modelPackage.TOPIC: return createTopic();
			case openome_modelPackage.UNKNOWN_LABEL: return createUnknownLabel();
			case openome_modelPackage.TRUTH_LABEL: return createTruthLabel();
			case openome_modelPackage.CONTAINER: return createContainer();
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
	public openome_modelPackage getopenome_modelPackage() {
		return (openome_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static openome_modelPackage getPackage() {
		return openome_modelPackage.eINSTANCE;
	}

} //openome_modelFactoryImpl
