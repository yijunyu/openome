/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.util;

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

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package
 * @generated
 */
public class Schema1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Schema1Validator INSTANCE = new Schema1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.ibm.wbim.bom.schema1";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return Schema1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case Schema1Package.ADDITIONAL_INPUT_TYPE:
				return validateAdditionalInputType((AdditionalInputType)value, diagnostics, context);
			case Schema1Package.ADDITIONAL_OUTPUT_TYPE:
				return validateAdditionalOutputType((AdditionalOutputType)value, diagnostics, context);
			case Schema1Package.ANNOTATED_NODE_TYPE:
				return validateAnnotatedNodeType((AnnotatedNodeType)value, diagnostics, context);
			case Schema1Package.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case Schema1Package.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case Schema1Package.ATTRIBUTE_VALUE:
				return validateAttributeValue((AttributeValue)value, diagnostics, context);
			case Schema1Package.AVAILABILITY:
				return validateAvailability((Availability)value, diagnostics, context);
			case Schema1Package.BASED_ON_TIMETABLE_TYPE:
				return validateBasedOnTimetableType((BasedOnTimetableType)value, diagnostics, context);
			case Schema1Package.BULK_RESOURCE:
				return validateBulkResource((BulkResource)value, diagnostics, context);
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE:
				return validateBulkResourceDefinitionsType((BulkResourceDefinitionsType)value, diagnostics, context);
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE:
				return validateBulkResourceDefinitionTemplatesType((BulkResourceDefinitionTemplatesType)value, diagnostics, context);
			case Schema1Package.BULK_RESOURCE_REQUIREMENT:
				return validateBulkResourceRequirement((BulkResourceRequirement)value, diagnostics, context);
			case Schema1Package.BULK_RESOURCES_TYPE:
				return validateBulkResourcesType((BulkResourcesType)value, diagnostics, context);
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE:
				return validateBusinessItemInstancesType((BusinessItemInstancesType)value, diagnostics, context);
			case Schema1Package.BUSINESS_ITEMS_TYPE:
				return validateBusinessItemsType((BusinessItemsType)value, diagnostics, context);
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE:
				return validateBusinessItemTemplatesType((BusinessItemTemplatesType)value, diagnostics, context);
			case Schema1Package.CALL_TO_PROCESS_TYPE:
				return validateCallToProcessType((CallToProcessType)value, diagnostics, context);
			case Schema1Package.CALL_TO_SERVICE_TYPE:
				return validateCallToServiceType((CallToServiceType)value, diagnostics, context);
			case Schema1Package.CALL_TO_TASK_TYPE:
				return validateCallToTaskType((CallToTaskType)value, diagnostics, context);
			case Schema1Package.CATALOG:
				return validateCatalog((Catalog)value, diagnostics, context);
			case Schema1Package.CATALOGS:
				return validateCatalogs((Catalogs)value, diagnostics, context);
			case Schema1Package.CATALOGS_TYPE:
				return validateCatalogsType((CatalogsType)value, diagnostics, context);
			case Schema1Package.COMPLEX_DATA_TYPE:
				return validateComplexDataType((ComplexDataType)value, diagnostics, context);
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE:
				return validateComplexDataTypeInstance((ComplexDataTypeInstance)value, diagnostics, context);
			case Schema1Package.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case Schema1Package.CONSTANT_TIME_TYPE:
				return validateConstantTimeType((ConstantTimeType)value, diagnostics, context);
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF:
				return validateControlActionOutputRef((ControlActionOutputRef)value, diagnostics, context);
			case Schema1Package.CORRELATION_TYPE:
				return validateCorrelationType((CorrelationType)value, diagnostics, context);
			case Schema1Package.COST_PER_QUANTITY:
				return validateCostPerQuantity((CostPerQuantity)value, diagnostics, context);
			case Schema1Package.COST_PER_QUANTITY_AND_TIME_UNIT:
				return validateCostPerQuantityAndTimeUnit((CostPerQuantityAndTimeUnit)value, diagnostics, context);
			case Schema1Package.COST_PER_TIME_UNIT:
				return validateCostPerTimeUnit((CostPerTimeUnit)value, diagnostics, context);
			case Schema1Package.COST_PER_TIME_UNIT_VALUE:
				return validateCostPerTimeUnitValue((CostPerTimeUnitValue)value, diagnostics, context);
			case Schema1Package.COST_TYPE:
				return validateCostType((CostType)value, diagnostics, context);
			case Schema1Package.COST_VALUE:
				return validateCostValue((CostValue)value, diagnostics, context);
			case Schema1Package.CRITERIA_TEMPLATE:
				return validateCriteriaTemplate((CriteriaTemplate)value, diagnostics, context);
			case Schema1Package.DATA_MODEL:
				return validateDataModel((DataModel)value, diagnostics, context);
			case Schema1Package.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case Schema1Package.DEFAULT_VALUE:
				return validateDefaultValue((DefaultValue)value, diagnostics, context);
			case Schema1Package.DISTRIBUTION_TYPE:
				return validateDistributionType((DistributionType)value, diagnostics, context);
			case Schema1Package.DISTRIBUTION_TYPE1:
				return validateDistributionType1((DistributionType1)value, diagnostics, context);
			case Schema1Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Schema1Package.END_NODE_TYPE:
				return validateEndNodeType((EndNodeType)value, diagnostics, context);
			case Schema1Package.ENTRY_POINT_TYPE:
				return validateEntryPointType((EntryPointType)value, diagnostics, context);
			case Schema1Package.EXEMPTION_PERIOD_TYPE:
				return validateExemptionPeriodType((ExemptionPeriodType)value, diagnostics, context);
			case Schema1Package.EXPONENTIAL_TYPE:
				return validateExponentialType((ExponentialType)value, diagnostics, context);
			case Schema1Package.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case Schema1Package.EXTENDED_ATTRIBUTES:
				return validateExtendedAttributes((ExtendedAttributes)value, diagnostics, context);
			case Schema1Package.EXTENDED_ATTRIBUTE_TYPE:
				return validateExtendedAttributeType((ExtendedAttributeType)value, diagnostics, context);
			case Schema1Package.FLOW_CONTENT_TYPE:
				return validateFlowContentType((FlowContentType)value, diagnostics, context);
			case Schema1Package.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case Schema1Package.FOR_LOOP:
				return validateForLoop((ForLoop)value, diagnostics, context);
			case Schema1Package.GAMMA_TYPE:
				return validateGammaType((GammaType)value, diagnostics, context);
			case Schema1Package.GLOBAL_REPOSITORY_REF:
				return validateGlobalRepositoryRef((GlobalRepositoryRef)value, diagnostics, context);
			case Schema1Package.GROUP_MEMBERS_TYPE:
				return validateGroupMembersType((GroupMembersType)value, diagnostics, context);
			case Schema1Package.GROUP_SEARCH_TYPE:
				return validateGroupSearchType((GroupSearchType)value, diagnostics, context);
			case Schema1Package.INDIVIDUAL_RESOURCE:
				return validateIndividualResource((IndividualResource)value, diagnostics, context);
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE:
				return validateIndividualResourceDefinitionsType((IndividualResourceDefinitionsType)value, diagnostics, context);
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE:
				return validateIndividualResourceDefinitionTemplatesType((IndividualResourceDefinitionTemplatesType)value, diagnostics, context);
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT:
				return validateIndividualResourceRequirement((IndividualResourceRequirement)value, diagnostics, context);
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE:
				return validateIndividualResourcesType((IndividualResourcesType)value, diagnostics, context);
			case Schema1Package.INPUT:
				return validateInput((Input)value, diagnostics, context);
			case Schema1Package.INPUT_BRANCH:
				return validateInputBranch((InputBranch)value, diagnostics, context);
			case Schema1Package.INPUT_CONSTANT_VALUE:
				return validateInputConstantValue((InputConstantValue)value, diagnostics, context);
			case Schema1Package.INPUT_CONSTANT_VALUE_TYPE:
				return validateInputConstantValueType((InputConstantValueType)value, diagnostics, context);
			case Schema1Package.INPUT_CRITERION:
				return validateInputCriterion((InputCriterion)value, diagnostics, context);
			case Schema1Package.INPUT_CRITERION_REF:
				return validateInputCriterionRef((InputCriterionRef)value, diagnostics, context);
			case Schema1Package.INPUT_REPOSITORY_VALUE:
				return validateInputRepositoryValue((InputRepositoryValue)value, diagnostics, context);
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE:
				return validateInputRepositoryValueType((InputRepositoryValueType)value, diagnostics, context);
			case Schema1Package.INPUTS:
				return validateInputs((Inputs)value, diagnostics, context);
			case Schema1Package.INPUT_TYPE:
				return validateInputType((InputType)value, diagnostics, context);
			case Schema1Package.INVOCATION:
				return validateInvocation((Invocation)value, diagnostics, context);
			case Schema1Package.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case Schema1Package.LAST_ACTIVATION_TIME_PLUS_TYPE:
				return validateLastActivationTimePlusType((LastActivationTimePlusType)value, diagnostics, context);
			case Schema1Package.LOCAL_REPOSITORY:
				return validateLocalRepository((LocalRepository)value, diagnostics, context);
			case Schema1Package.LOCAL_REPOSITORY_REF:
				return validateLocalRepositoryRef((LocalRepositoryRef)value, diagnostics, context);
			case Schema1Package.LOCATION_DEFINITIONS_TYPE:
				return validateLocationDefinitionsType((LocationDefinitionsType)value, diagnostics, context);
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE:
				return validateLocationDefinitionTemplatesType((LocationDefinitionTemplatesType)value, diagnostics, context);
			case Schema1Package.LOCATIONS_TYPE:
				return validateLocationsType((LocationsType)value, diagnostics, context);
			case Schema1Package.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case Schema1Package.LOGNORMAL_TYPE:
				return validateLognormalType((LognormalType)value, diagnostics, context);
			case Schema1Package.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case Schema1Package.LOOP_CONDITION_TYPE:
				return validateLoopConditionType((LoopConditionType)value, diagnostics, context);
			case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE:
				return validateManagerOfEmployeeByIDType((ManagerOfEmployeeByIDType)value, diagnostics, context);
			case Schema1Package.MANAGER_OF_EMPLOYEE_TYPE:
				return validateManagerOfEmployeeType((ManagerOfEmployeeType)value, diagnostics, context);
			case Schema1Package.MAP:
				return validateMap((com.ibm.wbim.bom.schema1.Map)value, diagnostics, context);
			case Schema1Package.MERGE:
				return validateMerge((Merge)value, diagnostics, context);
			case Schema1Package.MODEL_TYPE:
				return validateModelType((ModelType)value, diagnostics, context);
			case Schema1Package.MONETARY_VALUE:
				return validateMonetaryValue((MonetaryValue)value, diagnostics, context);
			case Schema1Package.NORMAL_TYPE:
				return validateNormalType((NormalType)value, diagnostics, context);
			case Schema1Package.NOTIFICATION_BROADCASTER:
				return validateNotificationBroadcaster((NotificationBroadcaster)value, diagnostics, context);
			case Schema1Package.NOTIFICATION_RECEIVER:
				return validateNotificationReceiver((NotificationReceiver)value, diagnostics, context);
			case Schema1Package.NOTIFICATIONS_TYPE:
				return validateNotificationsType((NotificationsType)value, diagnostics, context);
			case Schema1Package.NOTIFICATION_TEMPLATES_TYPE:
				return validateNotificationTemplatesType((NotificationTemplatesType)value, diagnostics, context);
			case Schema1Package.OBSERVER:
				return validateObserver((Observer)value, diagnostics, context);
			case Schema1Package.ONE_TIME_COST:
				return validateOneTimeCost((OneTimeCost)value, diagnostics, context);
			case Schema1Package.OPERATIONAL_DATA:
				return validateOperationalData((OperationalData)value, diagnostics, context);
			case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE:
				return validateOrganizationDefinitionsType((OrganizationDefinitionsType)value, diagnostics, context);
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE:
				return validateOrganizationDefinitionTemplatesType((OrganizationDefinitionTemplatesType)value, diagnostics, context);
			case Schema1Package.ORGANIZATION_MANAGER_TYPE:
				return validateOrganizationManagerType((OrganizationManagerType)value, diagnostics, context);
			case Schema1Package.ORGANIZATION_MODEL:
				return validateOrganizationModel((OrganizationModel)value, diagnostics, context);
			case Schema1Package.ORGANIZATIONS:
				return validateOrganizations((Organizations)value, diagnostics, context);
			case Schema1Package.ORGANIZATION_UNITS_TYPE:
				return validateOrganizationUnitsType((OrganizationUnitsType)value, diagnostics, context);
			case Schema1Package.ORGANIZATION_UNIT_TYPE:
				return validateOrganizationUnitType((OrganizationUnitType)value, diagnostics, context);
			case Schema1Package.OUTPUT:
				return validateOutput((Output)value, diagnostics, context);
			case Schema1Package.OUTPUT_BRANCH:
				return validateOutputBranch((OutputBranch)value, diagnostics, context);
			case Schema1Package.OUTPUT_BRANCH_TYPE:
				return validateOutputBranchType((OutputBranchType)value, diagnostics, context);
			case Schema1Package.OUTPUT_CRITERION:
				return validateOutputCriterion((OutputCriterion)value, diagnostics, context);
			case Schema1Package.OUTPUT_CRITERION_REF:
				return validateOutputCriterionRef((OutputCriterionRef)value, diagnostics, context);
			case Schema1Package.OUTPUT_PATH_OPERATIONAL_DATA:
				return validateOutputPathOperationalData((OutputPathOperationalData)value, diagnostics, context);
			case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE:
				return validateOutputPathProbabilityValue((OutputPathProbabilityValue)value, diagnostics, context);
			case Schema1Package.OUTPUT_REF:
				return validateOutputRef((OutputRef)value, diagnostics, context);
			case Schema1Package.OUTPUT_REPOSITORY_VALUE:
				return validateOutputRepositoryValue((OutputRepositoryValue)value, diagnostics, context);
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE:
				return validateOutputRepositoryValueType((OutputRepositoryValueType)value, diagnostics, context);
			case Schema1Package.OUTPUTS:
				return validateOutputs((Outputs)value, diagnostics, context);
			case Schema1Package.PERSON_NAME_TYPE:
				return validatePersonNameType((PersonNameType)value, diagnostics, context);
			case Schema1Package.PERSON_SEARCH_TYPE:
				return validatePersonSearchType((PersonSearchType)value, diagnostics, context);
			case Schema1Package.POISSON_TYPE:
				return validatePoissonType((PoissonType)value, diagnostics, context);
			case Schema1Package.PRIVATE_INSTANCE:
				return validatePrivateInstance((PrivateInstance)value, diagnostics, context);
			case Schema1Package.PROCESS:
				return validateProcess((com.ibm.wbim.bom.schema1.Process)value, diagnostics, context);
			case Schema1Package.PROCESSES_TYPE:
				return validateProcessesType((ProcessesType)value, diagnostics, context);
			case Schema1Package.PROCESS_MODEL:
				return validateProcessModel((ProcessModel)value, diagnostics, context);
			case Schema1Package.PUBLIC_INSTANCE:
				return validatePublicInstance((PublicInstance)value, diagnostics, context);
			case Schema1Package.QUALIFICATION:
				return validateQualification((Qualification)value, diagnostics, context);
			case Schema1Package.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case Schema1Package.RANDOM_LIST_TYPE:
				return validateRandomListType((RandomListType)value, diagnostics, context);
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE:
				return validateRecurringTimeIntervalType((RecurringTimeIntervalType)value, diagnostics, context);
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE:
				return validateRelatedInputCriteriaType((RelatedInputCriteriaType)value, diagnostics, context);
			case Schema1Package.REPOSITORIES_TYPE:
				return validateRepositoriesType((RepositoriesType)value, diagnostics, context);
			case Schema1Package.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case Schema1Package.REPOSITORY_DATA_VALUE:
				return validateRepositoryDataValue((RepositoryDataValue)value, diagnostics, context);
			case Schema1Package.RESOURCE_MODEL:
				return validateResourceModel((ResourceModel)value, diagnostics, context);
			case Schema1Package.RESOURCES:
				return validateResources((Resources)value, diagnostics, context);
			case Schema1Package.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case Schema1Package.ROLE_REQUIREMENT:
				return validateRoleRequirement((RoleRequirement)value, diagnostics, context);
			case Schema1Package.ROLES_TYPE:
				return validateRolesType((RolesType)value, diagnostics, context);
			case Schema1Package.SCOPE_DIMENSION_TYPE:
				return validateScopeDimensionType((ScopeDimensionType)value, diagnostics, context);
			case Schema1Package.SCOPE_DIMENSION_VALUE:
				return validateScopeDimensionValue((ScopeDimensionValue)value, diagnostics, context);
			case Schema1Package.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case Schema1Package.SERVICES_TYPE:
				return validateServicesType((ServicesType)value, diagnostics, context);
			case Schema1Package.SOURCE_TYPE:
				return validateSourceType((SourceType)value, diagnostics, context);
			case Schema1Package.START_DAY_OF_WEEK_TYPE:
				return validateStartDayOfWeekType((StartDayOfWeekType)value, diagnostics, context);
			case Schema1Package.START_NODE_TYPE:
				return validateStartNodeType((StartNodeType)value, diagnostics, context);
			case Schema1Package.STOP_NODE_TYPE:
				return validateStopNodeType((StopNodeType)value, diagnostics, context);
			case Schema1Package.TARGET_TYPE:
				return validateTargetType((TargetType)value, diagnostics, context);
			case Schema1Package.TASK:
				return validateTask((Task)value, diagnostics, context);
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT:
				return validateTaskIndividualResourceRequirement((TaskIndividualResourceRequirement)value, diagnostics, context);
			case Schema1Package.TASKS_TYPE:
				return validateTasksType((TasksType)value, diagnostics, context);
			case Schema1Package.TIME_ESTIMATION_TYPE:
				return validateTimeEstimationType((TimeEstimationType)value, diagnostics, context);
			case Schema1Package.TIMER:
				return validateTimer((Timer)value, diagnostics, context);
			case Schema1Package.TIMER_SETTING_TYPE:
				return validateTimerSettingType((TimerSettingType)value, diagnostics, context);
			case Schema1Package.TIMETABLE:
				return validateTimetable((Timetable)value, diagnostics, context);
			case Schema1Package.TIMETABLES_TYPE:
				return validateTimetablesType((TimetablesType)value, diagnostics, context);
			case Schema1Package.TIME_VALUE:
				return validateTimeValue((TimeValue)value, diagnostics, context);
			case Schema1Package.TYPE_DECLARATION:
				return validateTypeDeclaration((TypeDeclaration)value, diagnostics, context);
			case Schema1Package.UNIFORM_TYPE:
				return validateUniformType((UniformType)value, diagnostics, context);
			case Schema1Package.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case Schema1Package.WEIGHTED_LIST_TYPE:
				return validateWeightedListType((WeightedListType)value, diagnostics, context);
			case Schema1Package.WHEN_COST_APPLICABLE_TYPE:
				return validateWhenCostApplicableType((WhenCostApplicableType)value, diagnostics, context);
			case Schema1Package.BASIC_DATA_TYPE:
				return validateBasicDataType((BasicDataType)value, diagnostics, context);
			case Schema1Package.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case Schema1Package.DAY_OF_WEEK:
				return validateDayOfWeek((DayOfWeek)value, diagnostics, context);
			case Schema1Package.MULTIPLE_INSTANCES_MATCH:
				return validateMultipleInstancesMatch((MultipleInstancesMatch)value, diagnostics, context);
			case Schema1Package.NO_INSTANCES_MATCH:
				return validateNoInstancesMatch((NoInstancesMatch)value, diagnostics, context);
			case Schema1Package.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case Schema1Package.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case Schema1Package.ASSOCIATED_DATA_TYPE:
				return validateAssociatedDataType(value, diagnostics, context);
			case Schema1Package.BASIC_DATA_TYPE_OBJECT:
				return validateBasicDataTypeObject((BasicDataType)value, diagnostics, context);
			case Schema1Package.CURRENCY_OBJECT:
				return validateCurrencyObject((Currency)value, diagnostics, context);
			case Schema1Package.DAY_OF_WEEK_OBJECT:
				return validateDayOfWeekObject((DayOfWeek)value, diagnostics, context);
			case Schema1Package.ELEMENT_NAME:
				return validateElementName((String)value, diagnostics, context);
			case Schema1Package.INSTANCE_OF_TYPE:
				return validateInstanceOfType((String)value, diagnostics, context);
			case Schema1Package.MULTIPLE_INSTANCES_MATCH_OBJECT:
				return validateMultipleInstancesMatchObject((MultipleInstancesMatch)value, diagnostics, context);
			case Schema1Package.NO_INSTANCES_MATCH_OBJECT:
				return validateNoInstancesMatchObject((NoInstancesMatch)value, diagnostics, context);
			case Schema1Package.NON_NEGATIVE_DOUBLE:
				return validateNonNegativeDouble(((Double)value).doubleValue(), diagnostics, context);
			case Schema1Package.NON_NEGATIVE_DOUBLE_OBJECT:
				return validateNonNegativeDoubleObject((Double)value, diagnostics, context);
			case Schema1Package.PARENT_TEMPLATE_TYPE:
				return validateParentTemplateType((String)value, diagnostics, context);
			case Schema1Package.PERCENTAGE_VALUE:
				return validatePercentageValue(((Double)value).doubleValue(), diagnostics, context);
			case Schema1Package.PERCENTAGE_VALUE_OBJECT:
				return validatePercentageValueObject((Double)value, diagnostics, context);
			case Schema1Package.PREDEFINED_ORGANIZATION_TYPE:
				return validatePredefinedOrganizationType((String)value, diagnostics, context);
			case Schema1Package.PREDEFINED_RESOURCE_TYPE:
				return validatePredefinedResourceType((String)value, diagnostics, context);
			case Schema1Package.TIME_UNIT_OBJECT:
				return validateTimeUnitObject((TimeUnit)value, diagnostics, context);
			case Schema1Package.TYPE_TYPE:
				return validateTypeType(value, diagnostics, context);
			case Schema1Package.TYPE_TYPE2:
				return validateTypeType2(value, diagnostics, context);
			case Schema1Package.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType1)value, diagnostics, context);
			case Schema1Package.UNIT:
				return validateUnit((String)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInputType(AdditionalInputType additionalInputType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(additionalInputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalOutputType(AdditionalOutputType additionalOutputType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(additionalOutputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotatedNodeType(AnnotatedNodeType annotatedNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(annotatedNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValue(AttributeValue attributeValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(attributeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailability(Availability availability, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(availability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasedOnTimetableType(BasedOnTimetableType basedOnTimetableType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(basedOnTimetableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBulkResource(BulkResource bulkResource, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(bulkResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBulkResourceDefinitionsType(BulkResourceDefinitionsType bulkResourceDefinitionsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(bulkResourceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBulkResourceDefinitionTemplatesType(BulkResourceDefinitionTemplatesType bulkResourceDefinitionTemplatesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(bulkResourceDefinitionTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBulkResourceRequirement(BulkResourceRequirement bulkResourceRequirement, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(bulkResourceRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBulkResourcesType(BulkResourcesType bulkResourcesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(bulkResourcesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessItemInstancesType(BusinessItemInstancesType businessItemInstancesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(businessItemInstancesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessItemsType(BusinessItemsType businessItemsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(businessItemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessItemTemplatesType(BusinessItemTemplatesType businessItemTemplatesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(businessItemTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallToProcessType(CallToProcessType callToProcessType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(callToProcessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallToServiceType(CallToServiceType callToServiceType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(callToServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallToTaskType(CallToTaskType callToTaskType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(callToTaskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalog(Catalog catalog, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(catalog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogs(Catalogs catalogs, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(catalogs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogsType(CatalogsType catalogsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(catalogsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexDataType(ComplexDataType complexDataType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(complexDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexDataTypeInstance(ComplexDataTypeInstance complexDataTypeInstance, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(complexDataTypeInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantTimeType(ConstantTimeType constantTimeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(constantTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlActionOutputRef(ControlActionOutputRef controlActionOutputRef, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(controlActionOutputRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationType(CorrelationType correlationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(correlationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostPerQuantity(CostPerQuantity costPerQuantity, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(costPerQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostPerQuantityAndTimeUnit(CostPerQuantityAndTimeUnit costPerQuantityAndTimeUnit, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(costPerQuantityAndTimeUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostPerTimeUnit(CostPerTimeUnit costPerTimeUnit, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(costPerTimeUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostPerTimeUnitValue(CostPerTimeUnitValue costPerTimeUnitValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(costPerTimeUnitValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostType(CostType costType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(costType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostValue(CostValue costValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(costValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriaTemplate(CriteriaTemplate criteriaTemplate, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(criteriaTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataModel(DataModel dataModel, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(dataModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(decision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultValue(DefaultValue defaultValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(defaultValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionType(DistributionType distributionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(distributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionType1(DistributionType1 distributionType1, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(distributionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndNodeType(EndNodeType endNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(endNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPointType(EntryPointType entryPointType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(entryPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExemptionPeriodType(ExemptionPeriodType exemptionPeriodType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(exemptionPeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExponentialType(ExponentialType exponentialType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(exponentialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributes(ExtendedAttributes extendedAttributes, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(extendedAttributes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributeType(ExtendedAttributeType extendedAttributeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(extendedAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowContentType(FlowContentType flowContentType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(flowContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(fork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForLoop(ForLoop forLoop, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(forLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGammaType(GammaType gammaType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(gammaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalRepositoryRef(GlobalRepositoryRef globalRepositoryRef, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(globalRepositoryRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMembersType(GroupMembersType groupMembersType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(groupMembersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupSearchType(GroupSearchType groupSearchType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(groupSearchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualResource(IndividualResource individualResource, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(individualResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualResourceDefinitionsType(IndividualResourceDefinitionsType individualResourceDefinitionsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(individualResourceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualResourceDefinitionTemplatesType(IndividualResourceDefinitionTemplatesType individualResourceDefinitionTemplatesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(individualResourceDefinitionTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualResourceRequirement(IndividualResourceRequirement individualResourceRequirement, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(individualResourceRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualResourcesType(IndividualResourcesType individualResourcesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(individualResourcesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(input, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputBranch(InputBranch inputBranch, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputBranch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputConstantValue(InputConstantValue inputConstantValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputConstantValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputConstantValueType(InputConstantValueType inputConstantValueType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputConstantValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputCriterion(InputCriterion inputCriterion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputCriterionRef(InputCriterionRef inputCriterionRef, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputCriterionRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputRepositoryValue(InputRepositoryValue inputRepositoryValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputRepositoryValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputRepositoryValueType(InputRepositoryValueType inputRepositoryValueType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputRepositoryValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputs(Inputs inputs, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(InputType inputType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(inputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocation(Invocation invocation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(invocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(join, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastActivationTimePlusType(LastActivationTimePlusType lastActivationTimePlusType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(lastActivationTimePlusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalRepository(LocalRepository localRepository, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(localRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalRepositoryRef(LocalRepositoryRef localRepositoryRef, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(localRepositoryRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationDefinitionsType(LocationDefinitionsType locationDefinitionsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(locationDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationDefinitionTemplatesType(LocationDefinitionTemplatesType locationDefinitionTemplatesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(locationDefinitionTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationsType(LocationsType locationsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(locationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(locationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLognormalType(LognormalType lognormalType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(lognormalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopConditionType(LoopConditionType loopConditionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(loopConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerOfEmployeeByIDType(ManagerOfEmployeeByIDType managerOfEmployeeByIDType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(managerOfEmployeeByIDType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerOfEmployeeType(ManagerOfEmployeeType managerOfEmployeeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(managerOfEmployeeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap(com.ibm.wbim.bom.schema1.Map map, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(map, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge(Merge merge, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(merge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelType(ModelType modelType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(modelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonetaryValue(MonetaryValue monetaryValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(monetaryValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalType(NormalType normalType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(normalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationBroadcaster(NotificationBroadcaster notificationBroadcaster, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(notificationBroadcaster, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationReceiver(NotificationReceiver notificationReceiver, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(notificationReceiver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationsType(NotificationsType notificationsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(notificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationTemplatesType(NotificationTemplatesType notificationTemplatesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(notificationTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObserver(Observer observer, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(observer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneTimeCost(OneTimeCost oneTimeCost, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(oneTimeCost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationalData(OperationalData operationalData, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(operationalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationDefinitionsType(OrganizationDefinitionsType organizationDefinitionsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationDefinitionTemplatesType(OrganizationDefinitionTemplatesType organizationDefinitionTemplatesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationDefinitionTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationManagerType(OrganizationManagerType organizationManagerType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationModel(OrganizationModel organizationModel, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizations(Organizations organizations, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationUnitsType(OrganizationUnitsType organizationUnitsType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationUnitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationUnitType(OrganizationUnitType organizationUnitType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(output, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputBranch(OutputBranch outputBranch, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputBranch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputBranchType(OutputBranchType outputBranchType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputBranchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputCriterion(OutputCriterion outputCriterion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputCriterionRef(OutputCriterionRef outputCriterionRef, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputCriterionRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPathOperationalData(OutputPathOperationalData outputPathOperationalData, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputPathOperationalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPathProbabilityValue(OutputPathProbabilityValue outputPathProbabilityValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputPathProbabilityValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputRef(OutputRef outputRef, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputRepositoryValue(OutputRepositoryValue outputRepositoryValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputRepositoryValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputRepositoryValueType(OutputRepositoryValueType outputRepositoryValueType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputRepositoryValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputs(Outputs outputs, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(outputs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonNameType(PersonNameType personNameType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(personNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonSearchType(PersonSearchType personSearchType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(personSearchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoissonType(PoissonType poissonType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(poissonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivateInstance(PrivateInstance privateInstance, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(privateInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(com.ibm.wbim.bom.schema1.Process process, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessesType(ProcessesType processesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(processesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModel(ProcessModel processModel, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(processModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicInstance(PublicInstance publicInstance, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(publicInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualification(Qualification qualification, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(qualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRandomListType(RandomListType randomListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(randomListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurringTimeIntervalType(RecurringTimeIntervalType recurringTimeIntervalType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(recurringTimeIntervalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedInputCriteriaType(RelatedInputCriteriaType relatedInputCriteriaType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(relatedInputCriteriaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoriesType(RepositoriesType repositoriesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(repositoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryDataValue(RepositoryDataValue repositoryDataValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(repositoryDataValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel(ResourceModel resourceModel, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resourceModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResources(Resources resources, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resources, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirement(RoleRequirement roleRequirement, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(roleRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesType(RolesType rolesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(rolesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeDimensionType(ScopeDimensionType scopeDimensionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(scopeDimensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeDimensionValue(ScopeDimensionValue scopeDimensionValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(scopeDimensionValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicesType(ServicesType servicesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(servicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceType(SourceType sourceType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(sourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartDayOfWeekType(StartDayOfWeekType startDayOfWeekType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(startDayOfWeekType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartNodeType(StartNodeType startNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(startNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopNodeType(StopNodeType stopNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(stopNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetType(TargetType targetType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(targetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskIndividualResourceRequirement(TaskIndividualResourceRequirement taskIndividualResourceRequirement, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(taskIndividualResourceRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTasksType(TasksType tasksType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tasksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEstimationType(TimeEstimationType timeEstimationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(timeEstimationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimer(Timer timer, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(timer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerSettingType(TimerSettingType timerSettingType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(timerSettingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetable(Timetable timetable, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(timetable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetablesType(TimetablesType timetablesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(timetablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeValue(TimeValue timeValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(timeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDeclaration(TypeDeclaration typeDeclaration, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(typeDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniformType(UniformType uniformType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(uniformType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightedListType(WeightedListType weightedListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(weightedListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhenCostApplicableType(WhenCostApplicableType whenCostApplicableType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(whenCostApplicableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicDataType(BasicDataType basicDataType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayOfWeek(DayOfWeek dayOfWeek, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleInstancesMatch(MultipleInstancesMatch multipleInstancesMatch, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoInstancesMatch(NoInstancesMatch noInstancesMatch, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedDataType(Object associatedDataType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateAssociatedDataType_MemberTypes(associatedDataType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Associated Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedDataType_MemberTypes(Object associatedDataType, DiagnosticChain diagnostics, Map context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(associatedDataType)) {
				if (validateBasicDataType((BasicDataType)associatedDataType, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(associatedDataType)) {
				if (validateElementName((String)associatedDataType, tempDiagnostics, context)) return true;
			}
			List children = tempDiagnostics.getChildren();
			for (int i = 0; i < children.size(); i++) {
				diagnostics.add((Diagnostic)children.get(i));
			}
		}
		else {
			if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(associatedDataType)) {
				if (validateBasicDataType((BasicDataType)associatedDataType, null, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(associatedDataType)) {
				if (validateElementName((String)associatedDataType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicDataTypeObject(BasicDataType basicDataTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyObject(Currency currencyObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayOfWeekObject(DayOfWeek dayOfWeekObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementName(String elementName, DiagnosticChain diagnostics, Map context) {
		boolean result = validateElementName_Pattern(elementName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateElementName_Pattern
	 */
	public static final  PatternMatcher [][] ELEMENT_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".*"),
				XMLTypeUtil.createPatternMatcher(".*##.*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Element Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementName_Pattern(String elementName, DiagnosticChain diagnostics, Map context) {
		return validatePattern(Schema1Package.Literals.ELEMENT_NAME, elementName, ELEMENT_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceOfType(String instanceOfType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateInstanceOfType_MemberTypes(instanceOfType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Instance Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceOfType_MemberTypes(String instanceOfType, DiagnosticChain diagnostics, Map context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(instanceOfType)) {
				if (validatePredefinedResourceType(instanceOfType, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(instanceOfType)) {
				if (validatePredefinedOrganizationType(instanceOfType, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceOfType)) {
				if (validateElementName(instanceOfType, tempDiagnostics, context)) return true;
			}
			List children = tempDiagnostics.getChildren();
			for (int i = 0; i < children.size(); i++) {
				diagnostics.add((Diagnostic)children.get(i));
			}
		}
		else {
			if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(instanceOfType)) {
				if (validatePredefinedResourceType(instanceOfType, null, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(instanceOfType)) {
				if (validatePredefinedOrganizationType(instanceOfType, null, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(instanceOfType)) {
				if (validateElementName(instanceOfType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleInstancesMatchObject(MultipleInstancesMatch multipleInstancesMatchObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoInstancesMatchObject(NoInstancesMatch noInstancesMatchObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDouble(double nonNegativeDouble, DiagnosticChain diagnostics, Map context) {
		boolean result = validateNonNegativeDouble_Min(nonNegativeDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeDouble_Min
	 */
	public static final double NON_NEGATIVE_DOUBLE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Non Negative Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDouble_Min(double nonNegativeDouble, DiagnosticChain diagnostics, Map context) {
		boolean result = nonNegativeDouble >= NON_NEGATIVE_DOUBLE__MIN__VALUE;
		if (!result && diagnostics != null) 
			reportMinViolation(Schema1Package.Literals.NON_NEGATIVE_DOUBLE, new Double(nonNegativeDouble), new Double(NON_NEGATIVE_DOUBLE__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDoubleObject(Double nonNegativeDoubleObject, DiagnosticChain diagnostics, Map context) {
		boolean result = validateNonNegativeDouble_Min(nonNegativeDoubleObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentTemplateType(String parentTemplateType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateParentTemplateType_MemberTypes(parentTemplateType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Parent Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentTemplateType_MemberTypes(String parentTemplateType, DiagnosticChain diagnostics, Map context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(parentTemplateType)) {
				if (validatePredefinedResourceType(parentTemplateType, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(parentTemplateType)) {
				if (validatePredefinedOrganizationType(parentTemplateType, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(parentTemplateType)) {
				if (validateElementName(parentTemplateType, tempDiagnostics, context)) return true;
			}
			List children = tempDiagnostics.getChildren();
			for (int i = 0; i < children.size(); i++) {
				diagnostics.add((Diagnostic)children.get(i));
			}
		}
		else {
			if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(parentTemplateType)) {
				if (validatePredefinedResourceType(parentTemplateType, null, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(parentTemplateType)) {
				if (validatePredefinedOrganizationType(parentTemplateType, null, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(parentTemplateType)) {
				if (validateElementName(parentTemplateType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageValue(double percentageValue, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePercentageValue_Min(percentageValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentageValue_Max(percentageValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentageValue_Min
	 */
	public static final double PERCENTAGE_VALUE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Percentage Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageValue_Min(double percentageValue, DiagnosticChain diagnostics, Map context) {
		boolean result = percentageValue >= PERCENTAGE_VALUE__MIN__VALUE;
		if (!result && diagnostics != null) 
			reportMinViolation(Schema1Package.Literals.PERCENTAGE_VALUE, new Double(percentageValue), new Double(PERCENTAGE_VALUE__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentageValue_Max
	 */
	public static final double PERCENTAGE_VALUE__MAX__VALUE = 100.0;

	/**
	 * Validates the Max constraint of '<em>Percentage Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageValue_Max(double percentageValue, DiagnosticChain diagnostics, Map context) {
		boolean result = percentageValue <= PERCENTAGE_VALUE__MAX__VALUE;
		if (!result && diagnostics != null) 
			reportMaxViolation(Schema1Package.Literals.PERCENTAGE_VALUE, new Double(percentageValue), new Double(PERCENTAGE_VALUE__MAX__VALUE), true, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageValueObject(Double percentageValueObject, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePercentageValue_Min(percentageValueObject.doubleValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentageValue_Max(percentageValueObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredefinedOrganizationType(String predefinedOrganizationType, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePredefinedOrganizationType_Enumeration(predefinedOrganizationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePredefinedOrganizationType_Enumeration
	 */
	public static final Collection PREDEFINED_ORGANIZATION_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 "Organization template",
				 "Organization"
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Predefined Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredefinedOrganizationType_Enumeration(String predefinedOrganizationType, DiagnosticChain diagnostics, Map context) {
		boolean result = PREDEFINED_ORGANIZATION_TYPE__ENUMERATION__VALUES.contains(predefinedOrganizationType);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE, predefinedOrganizationType, PREDEFINED_ORGANIZATION_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredefinedResourceType(String predefinedResourceType, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePredefinedResourceType_Enumeration(predefinedResourceType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePredefinedResourceType_Enumeration
	 */
	public static final Collection PREDEFINED_RESOURCE_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 "Person template",
				 "Resource template",
				 "Staff template",
				 "Communication Service",
				 "Equipment",
				 "Facility",
				 "General Service",
				 "Machine",
				 "Person",
				 "Staff",
				 "Tool"
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Predefined Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredefinedResourceType_Enumeration(String predefinedResourceType, DiagnosticChain diagnostics, Map context) {
		boolean result = PREDEFINED_RESOURCE_TYPE__ENUMERATION__VALUES.contains(predefinedResourceType);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE, predefinedResourceType, PREDEFINED_RESOURCE_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitObject(TimeUnit timeUnitObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(Object typeType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateTypeType_MemberTypes(typeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType_MemberTypes(Object typeType, DiagnosticChain diagnostics, Map context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(typeType)) {
				if (validateBasicDataType((BasicDataType)typeType, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(typeType)) {
				if (validateElementName((String)typeType, tempDiagnostics, context)) return true;
			}
			List children = tempDiagnostics.getChildren();
			for (int i = 0; i < children.size(); i++) {
				diagnostics.add((Diagnostic)children.get(i));
			}
		}
		else {
			if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(typeType)) {
				if (validateBasicDataType((BasicDataType)typeType, null, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(typeType)) {
				if (validateElementName((String)typeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2(Object typeType2, DiagnosticChain diagnostics, Map context) {
		boolean result = validateTypeType2_MemberTypes(typeType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Type Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2_MemberTypes(Object typeType2, DiagnosticChain diagnostics, Map context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(typeType2)) {
				if (validateBasicDataType((BasicDataType)typeType2, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(typeType2)) {
				if (validatePredefinedResourceType((String)typeType2, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(typeType2)) {
				if (validatePredefinedOrganizationType((String)typeType2, tempDiagnostics, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(typeType2)) {
				if (validateElementName((String)typeType2, tempDiagnostics, context)) return true;
			}
			List children = tempDiagnostics.getChildren();
			for (int i = 0; i < children.size(); i++) {
				diagnostics.add((Diagnostic)children.get(i));
			}
		}
		else {
			if (Schema1Package.Literals.BASIC_DATA_TYPE.isInstance(typeType2)) {
				if (validateBasicDataType((BasicDataType)typeType2, null, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_RESOURCE_TYPE.isInstance(typeType2)) {
				if (validatePredefinedResourceType((String)typeType2, null, context)) return true;
			}
			if (Schema1Package.Literals.PREDEFINED_ORGANIZATION_TYPE.isInstance(typeType2)) {
				if (validatePredefinedOrganizationType((String)typeType2, null, context)) return true;
			}
			if (Schema1Package.Literals.ELEMENT_NAME.isInstance(typeType2)) {
				if (validateElementName((String)typeType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType1 typeTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(String unit, DiagnosticChain diagnostics, Map context) {
		boolean result = validateUnit_Enumeration(unit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnit_Enumeration
	 */
	public static final Collection UNIT__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 "acre",
				 "centimeter",
				 "foot",
				 "gallon (UK)",
				 "gallon (US)",
				 "gram",
				 "hectare",
				 "inch",
				 "kilogram",
				 "kilometer",
				 "liter",
				 "meter",
				 "mile",
				 "ounce",
				 "pint (UK)",
				 "pint (US)",
				 "pound",
				 "unit",
				 "yard"
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit_Enumeration(String unit, DiagnosticChain diagnostics, Map context) {
		boolean result = UNIT__ENUMERATION__VALUES.contains(unit);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(Schema1Package.Literals.UNIT, unit, UNIT__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

} //Schema1Validator
