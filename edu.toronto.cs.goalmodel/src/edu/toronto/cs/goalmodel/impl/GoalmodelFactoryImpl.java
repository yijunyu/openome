/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.impl;

import edu.toronto.cs.goalmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GoalmodelPackage.ACTOR: return createactor();
			case GoalmodelPackage.CONTRIBUTION: return createcontribution();
			case GoalmodelPackage.DEPENDENCY: return createdependency();
			case GoalmodelPackage.GOAL: return creategoal();
			case GoalmodelPackage.PROPERTY: return createproperty();
			case GoalmodelPackage.TOPIC: return createtopic();
			case GoalmodelPackage.LINK_ANNOTATION: return createlinkAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GoalmodelPackage.ACTOR_TYPE:
				return createActorTypeFromString(eDataType, initialValue);
			case GoalmodelPackage.CONTRIBUTION_TYPE:
				return createContributionTypeFromString(eDataType, initialValue);
			case GoalmodelPackage.DECOMPOSITION_TYPE:
				return createDecompositionTypeFromString(eDataType, initialValue);
			case GoalmodelPackage.LABEL_TYPE:
				return createLabelTypeFromString(eDataType, initialValue);
			case GoalmodelPackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case GoalmodelPackage.LINK_ANNOTATION_TYPE:
				return createlinkAnnotationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GoalmodelPackage.ACTOR_TYPE:
				return convertActorTypeToString(eDataType, instanceValue);
			case GoalmodelPackage.CONTRIBUTION_TYPE:
				return convertContributionTypeToString(eDataType, instanceValue);
			case GoalmodelPackage.DECOMPOSITION_TYPE:
				return convertDecompositionTypeToString(eDataType, instanceValue);
			case GoalmodelPackage.LABEL_TYPE:
				return convertLabelTypeToString(eDataType, instanceValue);
			case GoalmodelPackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case GoalmodelPackage.LINK_ANNOTATION_TYPE:
				return convertlinkAnnotationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public actor createactor() {
		actorImpl actor = new actorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public contribution createcontribution() {
		contributionImpl contribution = new contributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dependency createdependency() {
		dependencyImpl dependency = new dependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public goal creategoal() {
		goalImpl goal = new goalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public property createproperty() {
		propertyImpl property = new propertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topic createtopic() {
		topicImpl topic = new topicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public linkAnnotation createlinkAnnotation() {
		linkAnnotationImpl linkAnnotation = new linkAnnotationImpl();
		return linkAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorType createActorTypeFromString(EDataType eDataType, String initialValue) {
		ActorType result = ActorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType createContributionTypeFromString(EDataType eDataType, String initialValue) {
		ContributionType result = ContributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType createDecompositionTypeFromString(EDataType eDataType, String initialValue) {
		DecompositionType result = DecompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelTypeFromString(EDataType eDataType, String initialValue) {
		LabelType result = LabelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public linkAnnotationType createlinkAnnotationTypeFromString(EDataType eDataType, String initialValue) {
		linkAnnotationType result = linkAnnotationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlinkAnnotationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public static GoalmodelPackage getPackage() {
		return GoalmodelPackage.eINSTANCE;
	}

} //GoalmodelFactoryImpl
