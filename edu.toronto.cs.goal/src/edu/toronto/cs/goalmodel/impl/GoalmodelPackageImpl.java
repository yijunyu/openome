/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.Contribution;
import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.Goal;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.LabelType;
import edu.toronto.cs.goalmodel.Property;
import edu.toronto.cs.goalmodel.Topic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalmodelPackageImpl extends EPackageImpl implements GoalmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contributionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decompositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.toronto.cs.goalmodel.GoalmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GoalmodelPackageImpl() {
		super(eNS_URI, GoalmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GoalmodelPackage init() {
		if (isInited) return (GoalmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GoalmodelPackage.eNS_URI);

		// Obtain or create and register package
		GoalmodelPackageImpl theGoalmodelPackage = (GoalmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GoalmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GoalmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGoalmodelPackage.createPackageContents();

		// Initialize created meta-data
		theGoalmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGoalmodelPackage.freeze();

		return theGoalmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Type() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Target() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Name() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Label() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Type() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Parent() {
		return (EReference)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Goal() {
		return (EReference)goalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Topics() {
		return (EReference)goalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Rule() {
		return (EReference)goalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Property() {
		return (EReference)goalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_Topic() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContributionType() {
		return contributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecompositionType() {
		return decompositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelType() {
		return labelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalmodelFactory getGoalmodelFactory() {
		return (GoalmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contributionEClass = createEClass(CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__TYPE);
		createEReference(contributionEClass, CONTRIBUTION__TARGET);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__NAME);
		createEAttribute(goalEClass, GOAL__LABEL);
		createEAttribute(goalEClass, GOAL__TYPE);
		createEReference(goalEClass, GOAL__PARENT);
		createEReference(goalEClass, GOAL__GOAL);
		createEReference(goalEClass, GOAL__TOPICS);
		createEReference(goalEClass, GOAL__RULE);
		createEReference(goalEClass, GOAL__PROPERTY);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__TOPIC);

		// Create enums
		contributionTypeEEnum = createEEnum(CONTRIBUTION_TYPE);
		decompositionTypeEEnum = createEEnum(DECOMPOSITION_TYPE);
		labelTypeEEnum = createEEnum(LABEL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContribution_Type(), this.getContributionType(), "type", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContribution_Target(), this.getGoal(), null, "target", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Label(), this.getLabelType(), "label", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Type(), this.getDecompositionType(), "type", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Parent(), this.getGoal(), this.getGoal_Goal(), "parent", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Goal(), this.getGoal(), this.getGoal_Parent(), "goal", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Topics(), this.getTopic(), null, "topics", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Rule(), this.getContribution(), null, "rule", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Property(), this.getProperty(), null, "property", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopic_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contributionTypeEEnum, ContributionType.class, "ContributionType");
		addEEnumLiteral(contributionTypeEEnum, ContributionType.HELP_LITERAL);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.HURT_LITERAL);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.MAKE_LITERAL);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.BREAK_LITERAL);

		initEEnum(decompositionTypeEEnum, DecompositionType.class, "DecompositionType");
		addEEnumLiteral(decompositionTypeEEnum, DecompositionType.OR_LITERAL);
		addEEnumLiteral(decompositionTypeEEnum, DecompositionType.AND_LITERAL);
		addEEnumLiteral(decompositionTypeEEnum, DecompositionType.LEAF_LITERAL);

		initEEnum(labelTypeEEnum, LabelType.class, "LabelType");
		addEEnumLiteral(labelTypeEEnum, LabelType.SATISFIED_LITERAL);
		addEEnumLiteral(labelTypeEEnum, LabelType.DENIED_LITERAL);
		addEEnumLiteral(labelTypeEEnum, LabelType.PARTIALLY_SATISFIED_LITERAL);
		addEEnumLiteral(labelTypeEEnum, LabelType.PARTIALLY_DENIED_LITERAL);
		addEEnumLiteral(labelTypeEEnum, LabelType.UNKNOWN_LITERAL);
		addEEnumLiteral(labelTypeEEnum, LabelType.CONFLICT_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GoalmodelPackageImpl
