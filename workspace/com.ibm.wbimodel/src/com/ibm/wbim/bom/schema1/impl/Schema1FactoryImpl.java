/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.AdditionalInputType;
import com.ibm.wbim.bom.schema1.AdditionalOutputType;
import com.ibm.wbim.bom.schema1.AnnotatedNodeType;
import com.ibm.wbim.bom.schema1.Annotation;
import com.ibm.wbim.bom.schema1.Attribute;
import com.ibm.wbim.bom.schema1.AttributeValue;
import com.ibm.wbim.bom.schema1.Availability;
import com.ibm.wbim.bom.schema1.BasedOnTimetableType;
import com.ibm.wbim.bom.schema1.BasicDataType;
import com.ibm.wbim.bom.schema1.BulkResource;
import com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType;
import com.ibm.wbim.bom.schema1.BulkResourceRequirement;
import com.ibm.wbim.bom.schema1.BulkResourcesType;
import com.ibm.wbim.bom.schema1.BusinessItemInstancesType;
import com.ibm.wbim.bom.schema1.BusinessItemTemplatesType;
import com.ibm.wbim.bom.schema1.BusinessItemsType;
import com.ibm.wbim.bom.schema1.CallToProcessType;
import com.ibm.wbim.bom.schema1.CallToServiceType;
import com.ibm.wbim.bom.schema1.CallToTaskType;
import com.ibm.wbim.bom.schema1.Catalog;
import com.ibm.wbim.bom.schema1.Catalogs;
import com.ibm.wbim.bom.schema1.CatalogsType;
import com.ibm.wbim.bom.schema1.ComplexDataType;
import com.ibm.wbim.bom.schema1.ComplexDataTypeInstance;
import com.ibm.wbim.bom.schema1.Connection;
import com.ibm.wbim.bom.schema1.ConstantTimeType;
import com.ibm.wbim.bom.schema1.ControlActionOutputRef;
import com.ibm.wbim.bom.schema1.CorrelationType;
import com.ibm.wbim.bom.schema1.CostPerQuantity;
import com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit;
import com.ibm.wbim.bom.schema1.CostPerTimeUnit;
import com.ibm.wbim.bom.schema1.CostPerTimeUnitValue;
import com.ibm.wbim.bom.schema1.CostType;
import com.ibm.wbim.bom.schema1.CostValue;
import com.ibm.wbim.bom.schema1.CriteriaTemplate;
import com.ibm.wbim.bom.schema1.Currency;
import com.ibm.wbim.bom.schema1.DataModel;
import com.ibm.wbim.bom.schema1.DayOfWeek;
import com.ibm.wbim.bom.schema1.Decision;
import com.ibm.wbim.bom.schema1.DefaultValue;
import com.ibm.wbim.bom.schema1.DistributionType;
import com.ibm.wbim.bom.schema1.DistributionType1;
import com.ibm.wbim.bom.schema1.DocumentRoot;
import com.ibm.wbim.bom.schema1.EndNodeType;
import com.ibm.wbim.bom.schema1.EntryPointType;
import com.ibm.wbim.bom.schema1.ExemptionPeriodType;
import com.ibm.wbim.bom.schema1.ExponentialType;
import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.ExtendedAttributeType;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.FlowContentType;
import com.ibm.wbim.bom.schema1.ForLoop;
import com.ibm.wbim.bom.schema1.Fork;
import com.ibm.wbim.bom.schema1.GammaType;
import com.ibm.wbim.bom.schema1.GlobalRepositoryRef;
import com.ibm.wbim.bom.schema1.GroupMembersType;
import com.ibm.wbim.bom.schema1.GroupSearchType;
import com.ibm.wbim.bom.schema1.IndividualResource;
import com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType;
import com.ibm.wbim.bom.schema1.IndividualResourceRequirement;
import com.ibm.wbim.bom.schema1.IndividualResourcesType;
import com.ibm.wbim.bom.schema1.Input;
import com.ibm.wbim.bom.schema1.InputBranch;
import com.ibm.wbim.bom.schema1.InputConstantValue;
import com.ibm.wbim.bom.schema1.InputConstantValueType;
import com.ibm.wbim.bom.schema1.InputCriterion;
import com.ibm.wbim.bom.schema1.InputCriterionRef;
import com.ibm.wbim.bom.schema1.InputRepositoryValue;
import com.ibm.wbim.bom.schema1.InputRepositoryValueType;
import com.ibm.wbim.bom.schema1.InputType;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.Invocation;
import com.ibm.wbim.bom.schema1.Join;
import com.ibm.wbim.bom.schema1.LastActivationTimePlusType;
import com.ibm.wbim.bom.schema1.LocalRepository;
import com.ibm.wbim.bom.schema1.LocalRepositoryRef;
import com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.LocationDefinitionsType;
import com.ibm.wbim.bom.schema1.LocationType;
import com.ibm.wbim.bom.schema1.LocationsType;
import com.ibm.wbim.bom.schema1.LognormalType;
import com.ibm.wbim.bom.schema1.Loop;
import com.ibm.wbim.bom.schema1.LoopConditionType;
import com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType;
import com.ibm.wbim.bom.schema1.ManagerOfEmployeeType;
import com.ibm.wbim.bom.schema1.Map;
import com.ibm.wbim.bom.schema1.Merge;
import com.ibm.wbim.bom.schema1.ModelType;
import com.ibm.wbim.bom.schema1.MonetaryValue;
import com.ibm.wbim.bom.schema1.MultipleInstancesMatch;
import com.ibm.wbim.bom.schema1.NoInstancesMatch;
import com.ibm.wbim.bom.schema1.NormalType;
import com.ibm.wbim.bom.schema1.NotificationBroadcaster;
import com.ibm.wbim.bom.schema1.NotificationReceiver;
import com.ibm.wbim.bom.schema1.NotificationTemplatesType;
import com.ibm.wbim.bom.schema1.NotificationsType;
import com.ibm.wbim.bom.schema1.Observer;
import com.ibm.wbim.bom.schema1.OneTimeCost;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType;
import com.ibm.wbim.bom.schema1.OrganizationDefinitionsType;
import com.ibm.wbim.bom.schema1.OrganizationManagerType;
import com.ibm.wbim.bom.schema1.OrganizationModel;
import com.ibm.wbim.bom.schema1.OrganizationUnitType;
import com.ibm.wbim.bom.schema1.OrganizationUnitsType;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Output;
import com.ibm.wbim.bom.schema1.OutputBranch;
import com.ibm.wbim.bom.schema1.OutputBranchType;
import com.ibm.wbim.bom.schema1.OutputCriterion;
import com.ibm.wbim.bom.schema1.OutputCriterionRef;
import com.ibm.wbim.bom.schema1.OutputPathOperationalData;
import com.ibm.wbim.bom.schema1.OutputPathProbabilityValue;
import com.ibm.wbim.bom.schema1.OutputRef;
import com.ibm.wbim.bom.schema1.OutputRepositoryValue;
import com.ibm.wbim.bom.schema1.OutputRepositoryValueType;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.PersonNameType;
import com.ibm.wbim.bom.schema1.PersonSearchType;
import com.ibm.wbim.bom.schema1.PoissonType;
import com.ibm.wbim.bom.schema1.PrivateInstance;
import com.ibm.wbim.bom.schema1.ProcessModel;
import com.ibm.wbim.bom.schema1.ProcessesType;
import com.ibm.wbim.bom.schema1.PublicInstance;
import com.ibm.wbim.bom.schema1.Qualification;
import com.ibm.wbim.bom.schema1.Quantity;
import com.ibm.wbim.bom.schema1.RandomListType;
import com.ibm.wbim.bom.schema1.RecurringTimeIntervalType;
import com.ibm.wbim.bom.schema1.RelatedInputCriteriaType;
import com.ibm.wbim.bom.schema1.RepositoriesType;
import com.ibm.wbim.bom.schema1.Repository;
import com.ibm.wbim.bom.schema1.RepositoryDataValue;
import com.ibm.wbim.bom.schema1.ResourceModel;
import com.ibm.wbim.bom.schema1.Resources;
import com.ibm.wbim.bom.schema1.Role;
import com.ibm.wbim.bom.schema1.RoleRequirement;
import com.ibm.wbim.bom.schema1.RolesType;
import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.ScopeDimensionType;
import com.ibm.wbim.bom.schema1.ScopeDimensionValue;
import com.ibm.wbim.bom.schema1.Service;
import com.ibm.wbim.bom.schema1.ServicesType;
import com.ibm.wbim.bom.schema1.SourceType;
import com.ibm.wbim.bom.schema1.StartDayOfWeekType;
import com.ibm.wbim.bom.schema1.StartNodeType;
import com.ibm.wbim.bom.schema1.StopNodeType;
import com.ibm.wbim.bom.schema1.TargetType;
import com.ibm.wbim.bom.schema1.Task;
import com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement;
import com.ibm.wbim.bom.schema1.TasksType;
import com.ibm.wbim.bom.schema1.TimeEstimationType;
import com.ibm.wbim.bom.schema1.TimeUnit;
import com.ibm.wbim.bom.schema1.TimeValue;
import com.ibm.wbim.bom.schema1.Timer;
import com.ibm.wbim.bom.schema1.TimerSettingType;
import com.ibm.wbim.bom.schema1.Timetable;
import com.ibm.wbim.bom.schema1.TimetablesType;
import com.ibm.wbim.bom.schema1.TypeDeclaration;
import com.ibm.wbim.bom.schema1.TypeType1;
import com.ibm.wbim.bom.schema1.UniformType;
import com.ibm.wbim.bom.schema1.ValueType;
import com.ibm.wbim.bom.schema1.WeightedListType;
import com.ibm.wbim.bom.schema1.WhenCostApplicableType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Schema1FactoryImpl extends EFactoryImpl implements Schema1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Schema1Factory init() {
		try {
			Schema1Factory theSchema1Factory = (Schema1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.ibm.com/wbim/bomSchema1.0"); 
			if (theSchema1Factory != null) {
				return theSchema1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Schema1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Schema1Package.ADDITIONAL_INPUT_TYPE: return createAdditionalInputType();
			case Schema1Package.ADDITIONAL_OUTPUT_TYPE: return createAdditionalOutputType();
			case Schema1Package.ANNOTATED_NODE_TYPE: return createAnnotatedNodeType();
			case Schema1Package.ANNOTATION: return createAnnotation();
			case Schema1Package.ATTRIBUTE: return createAttribute();
			case Schema1Package.ATTRIBUTE_VALUE: return createAttributeValue();
			case Schema1Package.AVAILABILITY: return createAvailability();
			case Schema1Package.BASED_ON_TIMETABLE_TYPE: return createBasedOnTimetableType();
			case Schema1Package.BULK_RESOURCE: return createBulkResource();
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE: return createBulkResourceDefinitionsType();
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE: return createBulkResourceDefinitionTemplatesType();
			case Schema1Package.BULK_RESOURCE_REQUIREMENT: return createBulkResourceRequirement();
			case Schema1Package.BULK_RESOURCES_TYPE: return createBulkResourcesType();
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE: return createBusinessItemInstancesType();
			case Schema1Package.BUSINESS_ITEMS_TYPE: return createBusinessItemsType();
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE: return createBusinessItemTemplatesType();
			case Schema1Package.CALL_TO_PROCESS_TYPE: return createCallToProcessType();
			case Schema1Package.CALL_TO_SERVICE_TYPE: return createCallToServiceType();
			case Schema1Package.CALL_TO_TASK_TYPE: return createCallToTaskType();
			case Schema1Package.CATALOG: return createCatalog();
			case Schema1Package.CATALOGS: return createCatalogs();
			case Schema1Package.CATALOGS_TYPE: return createCatalogsType();
			case Schema1Package.COMPLEX_DATA_TYPE: return createComplexDataType();
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE: return createComplexDataTypeInstance();
			case Schema1Package.CONNECTION: return createConnection();
			case Schema1Package.CONSTANT_TIME_TYPE: return createConstantTimeType();
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF: return createControlActionOutputRef();
			case Schema1Package.CORRELATION_TYPE: return createCorrelationType();
			case Schema1Package.COST_PER_QUANTITY: return createCostPerQuantity();
			case Schema1Package.COST_PER_QUANTITY_AND_TIME_UNIT: return createCostPerQuantityAndTimeUnit();
			case Schema1Package.COST_PER_TIME_UNIT: return createCostPerTimeUnit();
			case Schema1Package.COST_PER_TIME_UNIT_VALUE: return createCostPerTimeUnitValue();
			case Schema1Package.COST_TYPE: return createCostType();
			case Schema1Package.COST_VALUE: return createCostValue();
			case Schema1Package.CRITERIA_TEMPLATE: return createCriteriaTemplate();
			case Schema1Package.DATA_MODEL: return createDataModel();
			case Schema1Package.DECISION: return createDecision();
			case Schema1Package.DEFAULT_VALUE: return createDefaultValue();
			case Schema1Package.DISTRIBUTION_TYPE: return createDistributionType();
			case Schema1Package.DISTRIBUTION_TYPE1: return createDistributionType1();
			case Schema1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Schema1Package.END_NODE_TYPE: return createEndNodeType();
			case Schema1Package.ENTRY_POINT_TYPE: return createEntryPointType();
			case Schema1Package.EXEMPTION_PERIOD_TYPE: return createExemptionPeriodType();
			case Schema1Package.EXPONENTIAL_TYPE: return createExponentialType();
			case Schema1Package.EXPRESSION: return createExpression();
			case Schema1Package.EXTENDED_ATTRIBUTES: return createExtendedAttributes();
			case Schema1Package.EXTENDED_ATTRIBUTE_TYPE: return createExtendedAttributeType();
			case Schema1Package.FLOW_CONTENT_TYPE: return createFlowContentType();
			case Schema1Package.FORK: return createFork();
			case Schema1Package.FOR_LOOP: return createForLoop();
			case Schema1Package.GAMMA_TYPE: return createGammaType();
			case Schema1Package.GLOBAL_REPOSITORY_REF: return createGlobalRepositoryRef();
			case Schema1Package.GROUP_MEMBERS_TYPE: return createGroupMembersType();
			case Schema1Package.GROUP_SEARCH_TYPE: return createGroupSearchType();
			case Schema1Package.INDIVIDUAL_RESOURCE: return createIndividualResource();
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE: return createIndividualResourceDefinitionsType();
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE: return createIndividualResourceDefinitionTemplatesType();
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT: return createIndividualResourceRequirement();
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE: return createIndividualResourcesType();
			case Schema1Package.INPUT: return createInput();
			case Schema1Package.INPUT_BRANCH: return createInputBranch();
			case Schema1Package.INPUT_CONSTANT_VALUE: return createInputConstantValue();
			case Schema1Package.INPUT_CONSTANT_VALUE_TYPE: return createInputConstantValueType();
			case Schema1Package.INPUT_CRITERION: return createInputCriterion();
			case Schema1Package.INPUT_CRITERION_REF: return createInputCriterionRef();
			case Schema1Package.INPUT_REPOSITORY_VALUE: return createInputRepositoryValue();
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE: return createInputRepositoryValueType();
			case Schema1Package.INPUTS: return createInputs();
			case Schema1Package.INPUT_TYPE: return createInputType();
			case Schema1Package.INVOCATION: return createInvocation();
			case Schema1Package.JOIN: return createJoin();
			case Schema1Package.LAST_ACTIVATION_TIME_PLUS_TYPE: return createLastActivationTimePlusType();
			case Schema1Package.LOCAL_REPOSITORY: return createLocalRepository();
			case Schema1Package.LOCAL_REPOSITORY_REF: return createLocalRepositoryRef();
			case Schema1Package.LOCATION_DEFINITIONS_TYPE: return createLocationDefinitionsType();
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE: return createLocationDefinitionTemplatesType();
			case Schema1Package.LOCATIONS_TYPE: return createLocationsType();
			case Schema1Package.LOCATION_TYPE: return createLocationType();
			case Schema1Package.LOGNORMAL_TYPE: return createLognormalType();
			case Schema1Package.LOOP: return createLoop();
			case Schema1Package.LOOP_CONDITION_TYPE: return createLoopConditionType();
			case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE: return createManagerOfEmployeeByIDType();
			case Schema1Package.MANAGER_OF_EMPLOYEE_TYPE: return createManagerOfEmployeeType();
			case Schema1Package.MAP: return createMap();
			case Schema1Package.MERGE: return createMerge();
			case Schema1Package.MODEL_TYPE: return createModelType();
			case Schema1Package.MONETARY_VALUE: return createMonetaryValue();
			case Schema1Package.NORMAL_TYPE: return createNormalType();
			case Schema1Package.NOTIFICATION_BROADCASTER: return createNotificationBroadcaster();
			case Schema1Package.NOTIFICATION_RECEIVER: return createNotificationReceiver();
			case Schema1Package.NOTIFICATIONS_TYPE: return createNotificationsType();
			case Schema1Package.NOTIFICATION_TEMPLATES_TYPE: return createNotificationTemplatesType();
			case Schema1Package.OBSERVER: return createObserver();
			case Schema1Package.ONE_TIME_COST: return createOneTimeCost();
			case Schema1Package.OPERATIONAL_DATA: return createOperationalData();
			case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE: return createOrganizationDefinitionsType();
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE: return createOrganizationDefinitionTemplatesType();
			case Schema1Package.ORGANIZATION_MANAGER_TYPE: return createOrganizationManagerType();
			case Schema1Package.ORGANIZATION_MODEL: return createOrganizationModel();
			case Schema1Package.ORGANIZATIONS: return createOrganizations();
			case Schema1Package.ORGANIZATION_UNITS_TYPE: return createOrganizationUnitsType();
			case Schema1Package.ORGANIZATION_UNIT_TYPE: return createOrganizationUnitType();
			case Schema1Package.OUTPUT: return createOutput();
			case Schema1Package.OUTPUT_BRANCH: return createOutputBranch();
			case Schema1Package.OUTPUT_BRANCH_TYPE: return createOutputBranchType();
			case Schema1Package.OUTPUT_CRITERION: return createOutputCriterion();
			case Schema1Package.OUTPUT_CRITERION_REF: return createOutputCriterionRef();
			case Schema1Package.OUTPUT_PATH_OPERATIONAL_DATA: return createOutputPathOperationalData();
			case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE: return createOutputPathProbabilityValue();
			case Schema1Package.OUTPUT_REF: return createOutputRef();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE: return createOutputRepositoryValue();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE: return createOutputRepositoryValueType();
			case Schema1Package.OUTPUTS: return createOutputs();
			case Schema1Package.PERSON_NAME_TYPE: return createPersonNameType();
			case Schema1Package.PERSON_SEARCH_TYPE: return createPersonSearchType();
			case Schema1Package.POISSON_TYPE: return createPoissonType();
			case Schema1Package.PRIVATE_INSTANCE: return createPrivateInstance();
			case Schema1Package.PROCESS: return createProcess();
			case Schema1Package.PROCESSES_TYPE: return createProcessesType();
			case Schema1Package.PROCESS_MODEL: return createProcessModel();
			case Schema1Package.PUBLIC_INSTANCE: return createPublicInstance();
			case Schema1Package.QUALIFICATION: return createQualification();
			case Schema1Package.QUANTITY: return createQuantity();
			case Schema1Package.RANDOM_LIST_TYPE: return createRandomListType();
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE: return createRecurringTimeIntervalType();
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE: return createRelatedInputCriteriaType();
			case Schema1Package.REPOSITORIES_TYPE: return createRepositoriesType();
			case Schema1Package.REPOSITORY: return createRepository();
			case Schema1Package.REPOSITORY_DATA_VALUE: return createRepositoryDataValue();
			case Schema1Package.RESOURCE_MODEL: return createResourceModel();
			case Schema1Package.RESOURCES: return createResources();
			case Schema1Package.ROLE: return createRole();
			case Schema1Package.ROLE_REQUIREMENT: return createRoleRequirement();
			case Schema1Package.ROLES_TYPE: return createRolesType();
			case Schema1Package.SCOPE_DIMENSION_TYPE: return createScopeDimensionType();
			case Schema1Package.SCOPE_DIMENSION_VALUE: return createScopeDimensionValue();
			case Schema1Package.SERVICE: return createService();
			case Schema1Package.SERVICES_TYPE: return createServicesType();
			case Schema1Package.SOURCE_TYPE: return createSourceType();
			case Schema1Package.START_DAY_OF_WEEK_TYPE: return createStartDayOfWeekType();
			case Schema1Package.START_NODE_TYPE: return createStartNodeType();
			case Schema1Package.STOP_NODE_TYPE: return createStopNodeType();
			case Schema1Package.TARGET_TYPE: return createTargetType();
			case Schema1Package.TASK: return createTask();
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT: return createTaskIndividualResourceRequirement();
			case Schema1Package.TASKS_TYPE: return createTasksType();
			case Schema1Package.TIME_ESTIMATION_TYPE: return createTimeEstimationType();
			case Schema1Package.TIMER: return createTimer();
			case Schema1Package.TIMER_SETTING_TYPE: return createTimerSettingType();
			case Schema1Package.TIMETABLE: return createTimetable();
			case Schema1Package.TIMETABLES_TYPE: return createTimetablesType();
			case Schema1Package.TIME_VALUE: return createTimeValue();
			case Schema1Package.TYPE_DECLARATION: return createTypeDeclaration();
			case Schema1Package.UNIFORM_TYPE: return createUniformType();
			case Schema1Package.VALUE_TYPE: return createValueType();
			case Schema1Package.WEIGHTED_LIST_TYPE: return createWeightedListType();
			case Schema1Package.WHEN_COST_APPLICABLE_TYPE: return createWhenCostApplicableType();
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
			case Schema1Package.BASIC_DATA_TYPE:
				return createBasicDataTypeFromString(eDataType, initialValue);
			case Schema1Package.CURRENCY:
				return createCurrencyFromString(eDataType, initialValue);
			case Schema1Package.DAY_OF_WEEK:
				return createDayOfWeekFromString(eDataType, initialValue);
			case Schema1Package.MULTIPLE_INSTANCES_MATCH:
				return createMultipleInstancesMatchFromString(eDataType, initialValue);
			case Schema1Package.NO_INSTANCES_MATCH:
				return createNoInstancesMatchFromString(eDataType, initialValue);
			case Schema1Package.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case Schema1Package.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case Schema1Package.ASSOCIATED_DATA_TYPE:
				return createAssociatedDataTypeFromString(eDataType, initialValue);
			case Schema1Package.BASIC_DATA_TYPE_OBJECT:
				return createBasicDataTypeObjectFromString(eDataType, initialValue);
			case Schema1Package.CURRENCY_OBJECT:
				return createCurrencyObjectFromString(eDataType, initialValue);
			case Schema1Package.DAY_OF_WEEK_OBJECT:
				return createDayOfWeekObjectFromString(eDataType, initialValue);
			case Schema1Package.ELEMENT_NAME:
				return createElementNameFromString(eDataType, initialValue);
			case Schema1Package.INSTANCE_OF_TYPE:
				return createInstanceOfTypeFromString(eDataType, initialValue);
			case Schema1Package.MULTIPLE_INSTANCES_MATCH_OBJECT:
				return createMultipleInstancesMatchObjectFromString(eDataType, initialValue);
			case Schema1Package.NO_INSTANCES_MATCH_OBJECT:
				return createNoInstancesMatchObjectFromString(eDataType, initialValue);
			case Schema1Package.NON_NEGATIVE_DOUBLE:
				return createNonNegativeDoubleFromString(eDataType, initialValue);
			case Schema1Package.NON_NEGATIVE_DOUBLE_OBJECT:
				return createNonNegativeDoubleObjectFromString(eDataType, initialValue);
			case Schema1Package.PARENT_TEMPLATE_TYPE:
				return createParentTemplateTypeFromString(eDataType, initialValue);
			case Schema1Package.PERCENTAGE_VALUE:
				return createPercentageValueFromString(eDataType, initialValue);
			case Schema1Package.PERCENTAGE_VALUE_OBJECT:
				return createPercentageValueObjectFromString(eDataType, initialValue);
			case Schema1Package.PREDEFINED_ORGANIZATION_TYPE:
				return createPredefinedOrganizationTypeFromString(eDataType, initialValue);
			case Schema1Package.PREDEFINED_RESOURCE_TYPE:
				return createPredefinedResourceTypeFromString(eDataType, initialValue);
			case Schema1Package.TIME_UNIT_OBJECT:
				return createTimeUnitObjectFromString(eDataType, initialValue);
			case Schema1Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case Schema1Package.TYPE_TYPE2:
				return createTypeType2FromString(eDataType, initialValue);
			case Schema1Package.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case Schema1Package.UNIT:
				return createUnitFromString(eDataType, initialValue);
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
			case Schema1Package.BASIC_DATA_TYPE:
				return convertBasicDataTypeToString(eDataType, instanceValue);
			case Schema1Package.CURRENCY:
				return convertCurrencyToString(eDataType, instanceValue);
			case Schema1Package.DAY_OF_WEEK:
				return convertDayOfWeekToString(eDataType, instanceValue);
			case Schema1Package.MULTIPLE_INSTANCES_MATCH:
				return convertMultipleInstancesMatchToString(eDataType, instanceValue);
			case Schema1Package.NO_INSTANCES_MATCH:
				return convertNoInstancesMatchToString(eDataType, instanceValue);
			case Schema1Package.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case Schema1Package.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case Schema1Package.ASSOCIATED_DATA_TYPE:
				return convertAssociatedDataTypeToString(eDataType, instanceValue);
			case Schema1Package.BASIC_DATA_TYPE_OBJECT:
				return convertBasicDataTypeObjectToString(eDataType, instanceValue);
			case Schema1Package.CURRENCY_OBJECT:
				return convertCurrencyObjectToString(eDataType, instanceValue);
			case Schema1Package.DAY_OF_WEEK_OBJECT:
				return convertDayOfWeekObjectToString(eDataType, instanceValue);
			case Schema1Package.ELEMENT_NAME:
				return convertElementNameToString(eDataType, instanceValue);
			case Schema1Package.INSTANCE_OF_TYPE:
				return convertInstanceOfTypeToString(eDataType, instanceValue);
			case Schema1Package.MULTIPLE_INSTANCES_MATCH_OBJECT:
				return convertMultipleInstancesMatchObjectToString(eDataType, instanceValue);
			case Schema1Package.NO_INSTANCES_MATCH_OBJECT:
				return convertNoInstancesMatchObjectToString(eDataType, instanceValue);
			case Schema1Package.NON_NEGATIVE_DOUBLE:
				return convertNonNegativeDoubleToString(eDataType, instanceValue);
			case Schema1Package.NON_NEGATIVE_DOUBLE_OBJECT:
				return convertNonNegativeDoubleObjectToString(eDataType, instanceValue);
			case Schema1Package.PARENT_TEMPLATE_TYPE:
				return convertParentTemplateTypeToString(eDataType, instanceValue);
			case Schema1Package.PERCENTAGE_VALUE:
				return convertPercentageValueToString(eDataType, instanceValue);
			case Schema1Package.PERCENTAGE_VALUE_OBJECT:
				return convertPercentageValueObjectToString(eDataType, instanceValue);
			case Schema1Package.PREDEFINED_ORGANIZATION_TYPE:
				return convertPredefinedOrganizationTypeToString(eDataType, instanceValue);
			case Schema1Package.PREDEFINED_RESOURCE_TYPE:
				return convertPredefinedResourceTypeToString(eDataType, instanceValue);
			case Schema1Package.TIME_UNIT_OBJECT:
				return convertTimeUnitObjectToString(eDataType, instanceValue);
			case Schema1Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case Schema1Package.TYPE_TYPE2:
				return convertTypeType2ToString(eDataType, instanceValue);
			case Schema1Package.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case Schema1Package.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalInputType createAdditionalInputType() {
		AdditionalInputTypeImpl additionalInputType = new AdditionalInputTypeImpl();
		return additionalInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalOutputType createAdditionalOutputType() {
		AdditionalOutputTypeImpl additionalOutputType = new AdditionalOutputTypeImpl();
		return additionalOutputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedNodeType createAnnotatedNodeType() {
		AnnotatedNodeTypeImpl annotatedNodeType = new AnnotatedNodeTypeImpl();
		return annotatedNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue() {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedOnTimetableType createBasedOnTimetableType() {
		BasedOnTimetableTypeImpl basedOnTimetableType = new BasedOnTimetableTypeImpl();
		return basedOnTimetableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResource createBulkResource() {
		BulkResourceImpl bulkResource = new BulkResourceImpl();
		return bulkResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourceDefinitionsType createBulkResourceDefinitionsType() {
		BulkResourceDefinitionsTypeImpl bulkResourceDefinitionsType = new BulkResourceDefinitionsTypeImpl();
		return bulkResourceDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourceDefinitionTemplatesType createBulkResourceDefinitionTemplatesType() {
		BulkResourceDefinitionTemplatesTypeImpl bulkResourceDefinitionTemplatesType = new BulkResourceDefinitionTemplatesTypeImpl();
		return bulkResourceDefinitionTemplatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourceRequirement createBulkResourceRequirement() {
		BulkResourceRequirementImpl bulkResourceRequirement = new BulkResourceRequirementImpl();
		return bulkResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkResourcesType createBulkResourcesType() {
		BulkResourcesTypeImpl bulkResourcesType = new BulkResourcesTypeImpl();
		return bulkResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemInstancesType createBusinessItemInstancesType() {
		BusinessItemInstancesTypeImpl businessItemInstancesType = new BusinessItemInstancesTypeImpl();
		return businessItemInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemsType createBusinessItemsType() {
		BusinessItemsTypeImpl businessItemsType = new BusinessItemsTypeImpl();
		return businessItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemTemplatesType createBusinessItemTemplatesType() {
		BusinessItemTemplatesTypeImpl businessItemTemplatesType = new BusinessItemTemplatesTypeImpl();
		return businessItemTemplatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallToProcessType createCallToProcessType() {
		CallToProcessTypeImpl callToProcessType = new CallToProcessTypeImpl();
		return callToProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallToServiceType createCallToServiceType() {
		CallToServiceTypeImpl callToServiceType = new CallToServiceTypeImpl();
		return callToServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallToTaskType createCallToTaskType() {
		CallToTaskTypeImpl callToTaskType = new CallToTaskTypeImpl();
		return callToTaskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogs createCatalogs() {
		CatalogsImpl catalogs = new CatalogsImpl();
		return catalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogsType createCatalogsType() {
		CatalogsTypeImpl catalogsType = new CatalogsTypeImpl();
		return catalogsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexDataType createComplexDataType() {
		ComplexDataTypeImpl complexDataType = new ComplexDataTypeImpl();
		return complexDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexDataTypeInstance createComplexDataTypeInstance() {
		ComplexDataTypeInstanceImpl complexDataTypeInstance = new ComplexDataTypeInstanceImpl();
		return complexDataTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantTimeType createConstantTimeType() {
		ConstantTimeTypeImpl constantTimeType = new ConstantTimeTypeImpl();
		return constantTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlActionOutputRef createControlActionOutputRef() {
		ControlActionOutputRefImpl controlActionOutputRef = new ControlActionOutputRefImpl();
		return controlActionOutputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationType createCorrelationType() {
		CorrelationTypeImpl correlationType = new CorrelationTypeImpl();
		return correlationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerQuantity createCostPerQuantity() {
		CostPerQuantityImpl costPerQuantity = new CostPerQuantityImpl();
		return costPerQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerQuantityAndTimeUnit createCostPerQuantityAndTimeUnit() {
		CostPerQuantityAndTimeUnitImpl costPerQuantityAndTimeUnit = new CostPerQuantityAndTimeUnitImpl();
		return costPerQuantityAndTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerTimeUnit createCostPerTimeUnit() {
		CostPerTimeUnitImpl costPerTimeUnit = new CostPerTimeUnitImpl();
		return costPerTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerTimeUnitValue createCostPerTimeUnitValue() {
		CostPerTimeUnitValueImpl costPerTimeUnitValue = new CostPerTimeUnitValueImpl();
		return costPerTimeUnitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType createCostType() {
		CostTypeImpl costType = new CostTypeImpl();
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostValue createCostValue() {
		CostValueImpl costValue = new CostValueImpl();
		return costValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaTemplate createCriteriaTemplate() {
		CriteriaTemplateImpl criteriaTemplate = new CriteriaTemplateImpl();
		return criteriaTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValue createDefaultValue() {
		DefaultValueImpl defaultValue = new DefaultValueImpl();
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType createDistributionType() {
		DistributionTypeImpl distributionType = new DistributionTypeImpl();
		return distributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType1 createDistributionType1() {
		DistributionType1Impl distributionType1 = new DistributionType1Impl();
		return distributionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndNodeType createEndNodeType() {
		EndNodeTypeImpl endNodeType = new EndNodeTypeImpl();
		return endNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointType createEntryPointType() {
		EntryPointTypeImpl entryPointType = new EntryPointTypeImpl();
		return entryPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExemptionPeriodType createExemptionPeriodType() {
		ExemptionPeriodTypeImpl exemptionPeriodType = new ExemptionPeriodTypeImpl();
		return exemptionPeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialType createExponentialType() {
		ExponentialTypeImpl exponentialType = new ExponentialTypeImpl();
		return exponentialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributes createExtendedAttributes() {
		ExtendedAttributesImpl extendedAttributes = new ExtendedAttributesImpl();
		return extendedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributeType createExtendedAttributeType() {
		ExtendedAttributeTypeImpl extendedAttributeType = new ExtendedAttributeTypeImpl();
		return extendedAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowContentType createFlowContentType() {
		FlowContentTypeImpl flowContentType = new FlowContentTypeImpl();
		return flowContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GammaType createGammaType() {
		GammaTypeImpl gammaType = new GammaTypeImpl();
		return gammaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalRepositoryRef createGlobalRepositoryRef() {
		GlobalRepositoryRefImpl globalRepositoryRef = new GlobalRepositoryRefImpl();
		return globalRepositoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembersType createGroupMembersType() {
		GroupMembersTypeImpl groupMembersType = new GroupMembersTypeImpl();
		return groupMembersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSearchType createGroupSearchType() {
		GroupSearchTypeImpl groupSearchType = new GroupSearchTypeImpl();
		return groupSearchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResource createIndividualResource() {
		IndividualResourceImpl individualResource = new IndividualResourceImpl();
		return individualResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourceDefinitionsType createIndividualResourceDefinitionsType() {
		IndividualResourceDefinitionsTypeImpl individualResourceDefinitionsType = new IndividualResourceDefinitionsTypeImpl();
		return individualResourceDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourceDefinitionTemplatesType createIndividualResourceDefinitionTemplatesType() {
		IndividualResourceDefinitionTemplatesTypeImpl individualResourceDefinitionTemplatesType = new IndividualResourceDefinitionTemplatesTypeImpl();
		return individualResourceDefinitionTemplatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourceRequirement createIndividualResourceRequirement() {
		IndividualResourceRequirementImpl individualResourceRequirement = new IndividualResourceRequirementImpl();
		return individualResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualResourcesType createIndividualResourcesType() {
		IndividualResourcesTypeImpl individualResourcesType = new IndividualResourcesTypeImpl();
		return individualResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBranch createInputBranch() {
		InputBranchImpl inputBranch = new InputBranchImpl();
		return inputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConstantValue createInputConstantValue() {
		InputConstantValueImpl inputConstantValue = new InputConstantValueImpl();
		return inputConstantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConstantValueType createInputConstantValueType() {
		InputConstantValueTypeImpl inputConstantValueType = new InputConstantValueTypeImpl();
		return inputConstantValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputCriterion createInputCriterion() {
		InputCriterionImpl inputCriterion = new InputCriterionImpl();
		return inputCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputCriterionRef createInputCriterionRef() {
		InputCriterionRefImpl inputCriterionRef = new InputCriterionRefImpl();
		return inputCriterionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRepositoryValue createInputRepositoryValue() {
		InputRepositoryValueImpl inputRepositoryValue = new InputRepositoryValueImpl();
		return inputRepositoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRepositoryValueType createInputRepositoryValueType() {
		InputRepositoryValueTypeImpl inputRepositoryValueType = new InputRepositoryValueTypeImpl();
		return inputRepositoryValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inputs createInputs() {
		InputsImpl inputs = new InputsImpl();
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invocation createInvocation() {
		InvocationImpl invocation = new InvocationImpl();
		return invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastActivationTimePlusType createLastActivationTimePlusType() {
		LastActivationTimePlusTypeImpl lastActivationTimePlusType = new LastActivationTimePlusTypeImpl();
		return lastActivationTimePlusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalRepository createLocalRepository() {
		LocalRepositoryImpl localRepository = new LocalRepositoryImpl();
		return localRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalRepositoryRef createLocalRepositoryRef() {
		LocalRepositoryRefImpl localRepositoryRef = new LocalRepositoryRefImpl();
		return localRepositoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinitionsType createLocationDefinitionsType() {
		LocationDefinitionsTypeImpl locationDefinitionsType = new LocationDefinitionsTypeImpl();
		return locationDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinitionTemplatesType createLocationDefinitionTemplatesType() {
		LocationDefinitionTemplatesTypeImpl locationDefinitionTemplatesType = new LocationDefinitionTemplatesTypeImpl();
		return locationDefinitionTemplatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType createLocationsType() {
		LocationsTypeImpl locationsType = new LocationsTypeImpl();
		return locationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LognormalType createLognormalType() {
		LognormalTypeImpl lognormalType = new LognormalTypeImpl();
		return lognormalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopConditionType createLoopConditionType() {
		LoopConditionTypeImpl loopConditionType = new LoopConditionTypeImpl();
		return loopConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerOfEmployeeByIDType createManagerOfEmployeeByIDType() {
		ManagerOfEmployeeByIDTypeImpl managerOfEmployeeByIDType = new ManagerOfEmployeeByIDTypeImpl();
		return managerOfEmployeeByIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerOfEmployeeType createManagerOfEmployeeType() {
		ManagerOfEmployeeTypeImpl managerOfEmployeeType = new ManagerOfEmployeeTypeImpl();
		return managerOfEmployeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merge createMerge() {
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonetaryValue createMonetaryValue() {
		MonetaryValueImpl monetaryValue = new MonetaryValueImpl();
		return monetaryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalType createNormalType() {
		NormalTypeImpl normalType = new NormalTypeImpl();
		return normalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationBroadcaster createNotificationBroadcaster() {
		NotificationBroadcasterImpl notificationBroadcaster = new NotificationBroadcasterImpl();
		return notificationBroadcaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationReceiver createNotificationReceiver() {
		NotificationReceiverImpl notificationReceiver = new NotificationReceiverImpl();
		return notificationReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationsType createNotificationsType() {
		NotificationsTypeImpl notificationsType = new NotificationsTypeImpl();
		return notificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTemplatesType createNotificationTemplatesType() {
		NotificationTemplatesTypeImpl notificationTemplatesType = new NotificationTemplatesTypeImpl();
		return notificationTemplatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observer createObserver() {
		ObserverImpl observer = new ObserverImpl();
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneTimeCost createOneTimeCost() {
		OneTimeCostImpl oneTimeCost = new OneTimeCostImpl();
		return oneTimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalData createOperationalData() {
		OperationalDataImpl operationalData = new OperationalDataImpl();
		return operationalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationDefinitionsType createOrganizationDefinitionsType() {
		OrganizationDefinitionsTypeImpl organizationDefinitionsType = new OrganizationDefinitionsTypeImpl();
		return organizationDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationDefinitionTemplatesType createOrganizationDefinitionTemplatesType() {
		OrganizationDefinitionTemplatesTypeImpl organizationDefinitionTemplatesType = new OrganizationDefinitionTemplatesTypeImpl();
		return organizationDefinitionTemplatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationManagerType createOrganizationManagerType() {
		OrganizationManagerTypeImpl organizationManagerType = new OrganizationManagerTypeImpl();
		return organizationManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationModel createOrganizationModel() {
		OrganizationModelImpl organizationModel = new OrganizationModelImpl();
		return organizationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizations createOrganizations() {
		OrganizationsImpl organizations = new OrganizationsImpl();
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnitsType createOrganizationUnitsType() {
		OrganizationUnitsTypeImpl organizationUnitsType = new OrganizationUnitsTypeImpl();
		return organizationUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnitType createOrganizationUnitType() {
		OrganizationUnitTypeImpl organizationUnitType = new OrganizationUnitTypeImpl();
		return organizationUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBranch createOutputBranch() {
		OutputBranchImpl outputBranch = new OutputBranchImpl();
		return outputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBranchType createOutputBranchType() {
		OutputBranchTypeImpl outputBranchType = new OutputBranchTypeImpl();
		return outputBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputCriterion createOutputCriterion() {
		OutputCriterionImpl outputCriterion = new OutputCriterionImpl();
		return outputCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputCriterionRef createOutputCriterionRef() {
		OutputCriterionRefImpl outputCriterionRef = new OutputCriterionRefImpl();
		return outputCriterionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPathOperationalData createOutputPathOperationalData() {
		OutputPathOperationalDataImpl outputPathOperationalData = new OutputPathOperationalDataImpl();
		return outputPathOperationalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPathProbabilityValue createOutputPathProbabilityValue() {
		OutputPathProbabilityValueImpl outputPathProbabilityValue = new OutputPathProbabilityValueImpl();
		return outputPathProbabilityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRef createOutputRef() {
		OutputRefImpl outputRef = new OutputRefImpl();
		return outputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRepositoryValue createOutputRepositoryValue() {
		OutputRepositoryValueImpl outputRepositoryValue = new OutputRepositoryValueImpl();
		return outputRepositoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRepositoryValueType createOutputRepositoryValueType() {
		OutputRepositoryValueTypeImpl outputRepositoryValueType = new OutputRepositoryValueTypeImpl();
		return outputRepositoryValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outputs createOutputs() {
		OutputsImpl outputs = new OutputsImpl();
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType createPersonNameType() {
		PersonNameTypeImpl personNameType = new PersonNameTypeImpl();
		return personNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonSearchType createPersonSearchType() {
		PersonSearchTypeImpl personSearchType = new PersonSearchTypeImpl();
		return personSearchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoissonType createPoissonType() {
		PoissonTypeImpl poissonType = new PoissonTypeImpl();
		return poissonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateInstance createPrivateInstance() {
		PrivateInstanceImpl privateInstance = new PrivateInstanceImpl();
		return privateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.ibm.wbim.bom.schema1.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessesType createProcessesType() {
		ProcessesTypeImpl processesType = new ProcessesTypeImpl();
		return processesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel createProcessModel() {
		ProcessModelImpl processModel = new ProcessModelImpl();
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicInstance createPublicInstance() {
		PublicInstanceImpl publicInstance = new PublicInstanceImpl();
		return publicInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualification createQualification() {
		QualificationImpl qualification = new QualificationImpl();
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomListType createRandomListType() {
		RandomListTypeImpl randomListType = new RandomListTypeImpl();
		return randomListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurringTimeIntervalType createRecurringTimeIntervalType() {
		RecurringTimeIntervalTypeImpl recurringTimeIntervalType = new RecurringTimeIntervalTypeImpl();
		return recurringTimeIntervalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedInputCriteriaType createRelatedInputCriteriaType() {
		RelatedInputCriteriaTypeImpl relatedInputCriteriaType = new RelatedInputCriteriaTypeImpl();
		return relatedInputCriteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoriesType createRepositoriesType() {
		RepositoriesTypeImpl repositoriesType = new RepositoriesTypeImpl();
		return repositoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDataValue createRepositoryDataValue() {
		RepositoryDataValueImpl repositoryDataValue = new RepositoryDataValueImpl();
		return repositoryDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel createResourceModel() {
		ResourceModelImpl resourceModel = new ResourceModelImpl();
		return resourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
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
	public RoleRequirement createRoleRequirement() {
		RoleRequirementImpl roleRequirement = new RoleRequirementImpl();
		return roleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType createRolesType() {
		RolesTypeImpl rolesType = new RolesTypeImpl();
		return rolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDimensionType createScopeDimensionType() {
		ScopeDimensionTypeImpl scopeDimensionType = new ScopeDimensionTypeImpl();
		return scopeDimensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDimensionValue createScopeDimensionValue() {
		ScopeDimensionValueImpl scopeDimensionValue = new ScopeDimensionValueImpl();
		return scopeDimensionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesType createServicesType() {
		ServicesTypeImpl servicesType = new ServicesTypeImpl();
		return servicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartDayOfWeekType createStartDayOfWeekType() {
		StartDayOfWeekTypeImpl startDayOfWeekType = new StartDayOfWeekTypeImpl();
		return startDayOfWeekType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNodeType createStartNodeType() {
		StartNodeTypeImpl startNodeType = new StartNodeTypeImpl();
		return startNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopNodeType createStopNodeType() {
		StopNodeTypeImpl stopNodeType = new StopNodeTypeImpl();
		return stopNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
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
	public TaskIndividualResourceRequirement createTaskIndividualResourceRequirement() {
		TaskIndividualResourceRequirementImpl taskIndividualResourceRequirement = new TaskIndividualResourceRequirementImpl();
		return taskIndividualResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksType createTasksType() {
		TasksTypeImpl tasksType = new TasksTypeImpl();
		return tasksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEstimationType createTimeEstimationType() {
		TimeEstimationTypeImpl timeEstimationType = new TimeEstimationTypeImpl();
		return timeEstimationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerSettingType createTimerSettingType() {
		TimerSettingTypeImpl timerSettingType = new TimerSettingTypeImpl();
		return timerSettingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable createTimetable() {
		TimetableImpl timetable = new TimetableImpl();
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetablesType createTimetablesType() {
		TimetablesTypeImpl timetablesType = new TimetablesTypeImpl();
		return timetablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue createTimeValue() {
		TimeValueImpl timeValue = new TimeValueImpl();
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformType createUniformType() {
		UniformTypeImpl uniformType = new UniformTypeImpl();
		return uniformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedListType createWeightedListType() {
		WeightedListTypeImpl weightedListType = new WeightedListTypeImpl();
		return weightedListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenCostApplicableType createWhenCostApplicableType() {
		WhenCostApplicableTypeImpl whenCostApplicableType = new WhenCostApplicableTypeImpl();
		return whenCostApplicableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType createBasicDataTypeFromString(EDataType eDataType, String initialValue) {
		BasicDataType result = BasicDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrencyFromString(EDataType eDataType, String initialValue) {
		Currency result = Currency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
		DayOfWeek result = DayOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleInstancesMatch createMultipleInstancesMatchFromString(EDataType eDataType, String initialValue) {
		MultipleInstancesMatch result = MultipleInstancesMatch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleInstancesMatchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoInstancesMatch createNoInstancesMatchFromString(EDataType eDataType, String initialValue) {
		NoInstancesMatch result = NoInstancesMatch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoInstancesMatchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAssociatedDataTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBasicDataTypeFromString(Schema1Package.Literals.BASIC_DATA_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createElementNameFromString(Schema1Package.Literals.ELEMENT_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociatedDataTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertBasicDataTypeToString(Schema1Package.Literals.BASIC_DATA_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceValue)) {
			try {
				String value = convertElementNameToString(Schema1Package.Literals.ELEMENT_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType createBasicDataTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBasicDataTypeFromString(Schema1Package.Literals.BASIC_DATA_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicDataTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBasicDataTypeToString(Schema1Package.Literals.BASIC_DATA_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrencyObjectFromString(EDataType eDataType, String initialValue) {
		return createCurrencyFromString(Schema1Package.Literals.CURRENCY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCurrencyToString(Schema1Package.Literals.CURRENCY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekObjectFromString(EDataType eDataType, String initialValue) {
		return createDayOfWeekFromString(Schema1Package.Literals.DAY_OF_WEEK, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDayOfWeekToString(Schema1Package.Literals.DAY_OF_WEEK, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createElementNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstanceOfTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createPredefinedResourceTypeFromString(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPredefinedOrganizationTypeFromString(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createElementNameFromString(Schema1Package.Literals.ELEMENT_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceOfTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertPredefinedResourceTypeToString(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertPredefinedOrganizationTypeToString(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceValue)) {
			try {
				String value = convertElementNameToString(Schema1Package.Literals.ELEMENT_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleInstancesMatch createMultipleInstancesMatchObjectFromString(EDataType eDataType, String initialValue) {
		return createMultipleInstancesMatchFromString(Schema1Package.Literals.MULTIPLE_INSTANCES_MATCH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleInstancesMatchObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultipleInstancesMatchToString(Schema1Package.Literals.MULTIPLE_INSTANCES_MATCH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoInstancesMatch createNoInstancesMatchObjectFromString(EDataType eDataType, String initialValue) {
		return createNoInstancesMatchFromString(Schema1Package.Literals.NO_INSTANCES_MATCH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoInstancesMatchObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoInstancesMatchToString(Schema1Package.Literals.NO_INSTANCES_MATCH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createNonNegativeDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createNonNegativeDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeDoubleFromString(Schema1Package.Literals.NON_NEGATIVE_DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeDoubleToString(Schema1Package.Literals.NON_NEGATIVE_DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParentTemplateTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createPredefinedResourceTypeFromString(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPredefinedOrganizationTypeFromString(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createElementNameFromString(Schema1Package.Literals.ELEMENT_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentTemplateTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertPredefinedResourceTypeToString(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertPredefinedOrganizationTypeToString(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceValue)) {
			try {
				String value = convertElementNameToString(Schema1Package.Literals.ELEMENT_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPercentageValueFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPercentageValueObjectFromString(EDataType eDataType, String initialValue) {
		return createPercentageValueFromString(Schema1Package.Literals.PERCENTAGE_VALUE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageValueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPercentageValueToString(Schema1Package.Literals.PERCENTAGE_VALUE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPredefinedOrganizationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedOrganizationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPredefinedResourceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeUnitFromString(Schema1Package.Literals.TIME_UNIT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeUnitToString(Schema1Package.Literals.TIME_UNIT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTypeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBasicDataTypeFromString(Schema1Package.Literals.BASIC_DATA_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createElementNameFromString(Schema1Package.Literals.ELEMENT_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertBasicDataTypeToString(Schema1Package.Literals.BASIC_DATA_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceValue)) {
			try {
				String value = convertElementNameToString(Schema1Package.Literals.ELEMENT_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTypeType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBasicDataTypeFromString(Schema1Package.Literals.BASIC_DATA_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPredefinedResourceTypeFromString(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPredefinedOrganizationTypeFromString(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createElementNameFromString(Schema1Package.Literals.ELEMENT_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertBasicDataTypeToString(Schema1Package.Literals.BASIC_DATA_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertPredefinedResourceTypeToString(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertPredefinedOrganizationTypeToString(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceValue)) {
			try {
				String value = convertElementNameToString(Schema1Package.Literals.ELEMENT_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(Schema1Package.Literals.TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(Schema1Package.Literals.TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUnitFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1Package getSchema1Package() {
		return (Schema1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Schema1Package getPackage() {
		return Schema1Package.eINSTANCE;
	}

} //Schema1FactoryImpl
