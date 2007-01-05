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
import com.ibm.wbim.bom.schema1.DataModel;
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
import com.ibm.wbim.bom.schema1.TimeValue;
import com.ibm.wbim.bom.schema1.Timer;
import com.ibm.wbim.bom.schema1.TimerSettingType;
import com.ibm.wbim.bom.schema1.Timetable;
import com.ibm.wbim.bom.schema1.TimetablesType;
import com.ibm.wbim.bom.schema1.TypeDeclaration;
import com.ibm.wbim.bom.schema1.UniformType;
import com.ibm.wbim.bom.schema1.ValueType;
import com.ibm.wbim.bom.schema1.WeightedListType;
import com.ibm.wbim.bom.schema1.WhenCostApplicableType;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package
 * @generated
 */
public class Schema1Switch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Schema1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1Switch() {
		if (modelPackage == null) {
			modelPackage = Schema1Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Schema1Package.ADDITIONAL_INPUT_TYPE: {
				AdditionalInputType additionalInputType = (AdditionalInputType)theEObject;
				Object result = caseAdditionalInputType(additionalInputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ADDITIONAL_OUTPUT_TYPE: {
				AdditionalOutputType additionalOutputType = (AdditionalOutputType)theEObject;
				Object result = caseAdditionalOutputType(additionalOutputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ANNOTATED_NODE_TYPE: {
				AnnotatedNodeType annotatedNodeType = (AnnotatedNodeType)theEObject;
				Object result = caseAnnotatedNodeType(annotatedNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				Object result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				Object result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				Object result = caseAttributeValue(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.AVAILABILITY: {
				Availability availability = (Availability)theEObject;
				Object result = caseAvailability(availability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BASED_ON_TIMETABLE_TYPE: {
				BasedOnTimetableType basedOnTimetableType = (BasedOnTimetableType)theEObject;
				Object result = caseBasedOnTimetableType(basedOnTimetableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BULK_RESOURCE: {
				BulkResource bulkResource = (BulkResource)theEObject;
				Object result = caseBulkResource(bulkResource);
				if (result == null) result = caseComplexDataTypeInstance(bulkResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BULK_RESOURCE_DEFINITIONS_TYPE: {
				BulkResourceDefinitionsType bulkResourceDefinitionsType = (BulkResourceDefinitionsType)theEObject;
				Object result = caseBulkResourceDefinitionsType(bulkResourceDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE: {
				BulkResourceDefinitionTemplatesType bulkResourceDefinitionTemplatesType = (BulkResourceDefinitionTemplatesType)theEObject;
				Object result = caseBulkResourceDefinitionTemplatesType(bulkResourceDefinitionTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BULK_RESOURCE_REQUIREMENT: {
				BulkResourceRequirement bulkResourceRequirement = (BulkResourceRequirement)theEObject;
				Object result = caseBulkResourceRequirement(bulkResourceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BULK_RESOURCES_TYPE: {
				BulkResourcesType bulkResourcesType = (BulkResourcesType)theEObject;
				Object result = caseBulkResourcesType(bulkResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BUSINESS_ITEM_INSTANCES_TYPE: {
				BusinessItemInstancesType businessItemInstancesType = (BusinessItemInstancesType)theEObject;
				Object result = caseBusinessItemInstancesType(businessItemInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BUSINESS_ITEMS_TYPE: {
				BusinessItemsType businessItemsType = (BusinessItemsType)theEObject;
				Object result = caseBusinessItemsType(businessItemsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.BUSINESS_ITEM_TEMPLATES_TYPE: {
				BusinessItemTemplatesType businessItemTemplatesType = (BusinessItemTemplatesType)theEObject;
				Object result = caseBusinessItemTemplatesType(businessItemTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CALL_TO_PROCESS_TYPE: {
				CallToProcessType callToProcessType = (CallToProcessType)theEObject;
				Object result = caseCallToProcessType(callToProcessType);
				if (result == null) result = caseInvocation(callToProcessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CALL_TO_SERVICE_TYPE: {
				CallToServiceType callToServiceType = (CallToServiceType)theEObject;
				Object result = caseCallToServiceType(callToServiceType);
				if (result == null) result = caseInvocation(callToServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CALL_TO_TASK_TYPE: {
				CallToTaskType callToTaskType = (CallToTaskType)theEObject;
				Object result = caseCallToTaskType(callToTaskType);
				if (result == null) result = caseInvocation(callToTaskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CATALOG: {
				Catalog catalog = (Catalog)theEObject;
				Object result = caseCatalog(catalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CATALOGS: {
				Catalogs catalogs = (Catalogs)theEObject;
				Object result = caseCatalogs(catalogs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CATALOGS_TYPE: {
				CatalogsType catalogsType = (CatalogsType)theEObject;
				Object result = caseCatalogsType(catalogsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COMPLEX_DATA_TYPE: {
				ComplexDataType complexDataType = (ComplexDataType)theEObject;
				Object result = caseComplexDataType(complexDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COMPLEX_DATA_TYPE_INSTANCE: {
				ComplexDataTypeInstance complexDataTypeInstance = (ComplexDataTypeInstance)theEObject;
				Object result = caseComplexDataTypeInstance(complexDataTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CONNECTION: {
				Connection connection = (Connection)theEObject;
				Object result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CONSTANT_TIME_TYPE: {
				ConstantTimeType constantTimeType = (ConstantTimeType)theEObject;
				Object result = caseConstantTimeType(constantTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF: {
				ControlActionOutputRef controlActionOutputRef = (ControlActionOutputRef)theEObject;
				Object result = caseControlActionOutputRef(controlActionOutputRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CORRELATION_TYPE: {
				CorrelationType correlationType = (CorrelationType)theEObject;
				Object result = caseCorrelationType(correlationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COST_PER_QUANTITY: {
				CostPerQuantity costPerQuantity = (CostPerQuantity)theEObject;
				Object result = caseCostPerQuantity(costPerQuantity);
				if (result == null) result = caseOneTimeCost(costPerQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COST_PER_QUANTITY_AND_TIME_UNIT: {
				CostPerQuantityAndTimeUnit costPerQuantityAndTimeUnit = (CostPerQuantityAndTimeUnit)theEObject;
				Object result = caseCostPerQuantityAndTimeUnit(costPerQuantityAndTimeUnit);
				if (result == null) result = caseCostPerQuantity(costPerQuantityAndTimeUnit);
				if (result == null) result = caseOneTimeCost(costPerQuantityAndTimeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COST_PER_TIME_UNIT: {
				CostPerTimeUnit costPerTimeUnit = (CostPerTimeUnit)theEObject;
				Object result = caseCostPerTimeUnit(costPerTimeUnit);
				if (result == null) result = caseOneTimeCost(costPerTimeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COST_PER_TIME_UNIT_VALUE: {
				CostPerTimeUnitValue costPerTimeUnitValue = (CostPerTimeUnitValue)theEObject;
				Object result = caseCostPerTimeUnitValue(costPerTimeUnitValue);
				if (result == null) result = caseCostValue(costPerTimeUnitValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COST_TYPE: {
				CostType costType = (CostType)theEObject;
				Object result = caseCostType(costType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.COST_VALUE: {
				CostValue costValue = (CostValue)theEObject;
				Object result = caseCostValue(costValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.CRITERIA_TEMPLATE: {
				CriteriaTemplate criteriaTemplate = (CriteriaTemplate)theEObject;
				Object result = caseCriteriaTemplate(criteriaTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.DATA_MODEL: {
				DataModel dataModel = (DataModel)theEObject;
				Object result = caseDataModel(dataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.DECISION: {
				Decision decision = (Decision)theEObject;
				Object result = caseDecision(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.DEFAULT_VALUE: {
				DefaultValue defaultValue = (DefaultValue)theEObject;
				Object result = caseDefaultValue(defaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.DISTRIBUTION_TYPE: {
				DistributionType distributionType = (DistributionType)theEObject;
				Object result = caseDistributionType(distributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.DISTRIBUTION_TYPE1: {
				DistributionType1 distributionType1 = (DistributionType1)theEObject;
				Object result = caseDistributionType1(distributionType1);
				if (result == null) result = caseDistributionType(distributionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.END_NODE_TYPE: {
				EndNodeType endNodeType = (EndNodeType)theEObject;
				Object result = caseEndNodeType(endNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ENTRY_POINT_TYPE: {
				EntryPointType entryPointType = (EntryPointType)theEObject;
				Object result = caseEntryPointType(entryPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.EXEMPTION_PERIOD_TYPE: {
				ExemptionPeriodType exemptionPeriodType = (ExemptionPeriodType)theEObject;
				Object result = caseExemptionPeriodType(exemptionPeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.EXPONENTIAL_TYPE: {
				ExponentialType exponentialType = (ExponentialType)theEObject;
				Object result = caseExponentialType(exponentialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.EXTENDED_ATTRIBUTES: {
				ExtendedAttributes extendedAttributes = (ExtendedAttributes)theEObject;
				Object result = caseExtendedAttributes(extendedAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.EXTENDED_ATTRIBUTE_TYPE: {
				ExtendedAttributeType extendedAttributeType = (ExtendedAttributeType)theEObject;
				Object result = caseExtendedAttributeType(extendedAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.FLOW_CONTENT_TYPE: {
				FlowContentType flowContentType = (FlowContentType)theEObject;
				Object result = caseFlowContentType(flowContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.FORK: {
				Fork fork = (Fork)theEObject;
				Object result = caseFork(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.FOR_LOOP: {
				ForLoop forLoop = (ForLoop)theEObject;
				Object result = caseForLoop(forLoop);
				if (result == null) result = caseProcess(forLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.GAMMA_TYPE: {
				GammaType gammaType = (GammaType)theEObject;
				Object result = caseGammaType(gammaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.GLOBAL_REPOSITORY_REF: {
				GlobalRepositoryRef globalRepositoryRef = (GlobalRepositoryRef)theEObject;
				Object result = caseGlobalRepositoryRef(globalRepositoryRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.GROUP_MEMBERS_TYPE: {
				GroupMembersType groupMembersType = (GroupMembersType)theEObject;
				Object result = caseGroupMembersType(groupMembersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.GROUP_SEARCH_TYPE: {
				GroupSearchType groupSearchType = (GroupSearchType)theEObject;
				Object result = caseGroupSearchType(groupSearchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INDIVIDUAL_RESOURCE: {
				IndividualResource individualResource = (IndividualResource)theEObject;
				Object result = caseIndividualResource(individualResource);
				if (result == null) result = caseComplexDataTypeInstance(individualResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE: {
				IndividualResourceDefinitionsType individualResourceDefinitionsType = (IndividualResourceDefinitionsType)theEObject;
				Object result = caseIndividualResourceDefinitionsType(individualResourceDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE: {
				IndividualResourceDefinitionTemplatesType individualResourceDefinitionTemplatesType = (IndividualResourceDefinitionTemplatesType)theEObject;
				Object result = caseIndividualResourceDefinitionTemplatesType(individualResourceDefinitionTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INDIVIDUAL_RESOURCE_REQUIREMENT: {
				IndividualResourceRequirement individualResourceRequirement = (IndividualResourceRequirement)theEObject;
				Object result = caseIndividualResourceRequirement(individualResourceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INDIVIDUAL_RESOURCES_TYPE: {
				IndividualResourcesType individualResourcesType = (IndividualResourcesType)theEObject;
				Object result = caseIndividualResourcesType(individualResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT: {
				Input input = (Input)theEObject;
				Object result = caseInput(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_BRANCH: {
				InputBranch inputBranch = (InputBranch)theEObject;
				Object result = caseInputBranch(inputBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_CONSTANT_VALUE: {
				InputConstantValue inputConstantValue = (InputConstantValue)theEObject;
				Object result = caseInputConstantValue(inputConstantValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_CONSTANT_VALUE_TYPE: {
				InputConstantValueType inputConstantValueType = (InputConstantValueType)theEObject;
				Object result = caseInputConstantValueType(inputConstantValueType);
				if (result == null) result = caseInputConstantValue(inputConstantValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_CRITERION: {
				InputCriterion inputCriterion = (InputCriterion)theEObject;
				Object result = caseInputCriterion(inputCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_CRITERION_REF: {
				InputCriterionRef inputCriterionRef = (InputCriterionRef)theEObject;
				Object result = caseInputCriterionRef(inputCriterionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_REPOSITORY_VALUE: {
				InputRepositoryValue inputRepositoryValue = (InputRepositoryValue)theEObject;
				Object result = caseInputRepositoryValue(inputRepositoryValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE: {
				InputRepositoryValueType inputRepositoryValueType = (InputRepositoryValueType)theEObject;
				Object result = caseInputRepositoryValueType(inputRepositoryValueType);
				if (result == null) result = caseInputRepositoryValue(inputRepositoryValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUTS: {
				Inputs inputs = (Inputs)theEObject;
				Object result = caseInputs(inputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INPUT_TYPE: {
				InputType inputType = (InputType)theEObject;
				Object result = caseInputType(inputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.INVOCATION: {
				Invocation invocation = (Invocation)theEObject;
				Object result = caseInvocation(invocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.JOIN: {
				Join join = (Join)theEObject;
				Object result = caseJoin(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LAST_ACTIVATION_TIME_PLUS_TYPE: {
				LastActivationTimePlusType lastActivationTimePlusType = (LastActivationTimePlusType)theEObject;
				Object result = caseLastActivationTimePlusType(lastActivationTimePlusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOCAL_REPOSITORY: {
				LocalRepository localRepository = (LocalRepository)theEObject;
				Object result = caseLocalRepository(localRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOCAL_REPOSITORY_REF: {
				LocalRepositoryRef localRepositoryRef = (LocalRepositoryRef)theEObject;
				Object result = caseLocalRepositoryRef(localRepositoryRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOCATION_DEFINITIONS_TYPE: {
				LocationDefinitionsType locationDefinitionsType = (LocationDefinitionsType)theEObject;
				Object result = caseLocationDefinitionsType(locationDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOCATION_DEFINITION_TEMPLATES_TYPE: {
				LocationDefinitionTemplatesType locationDefinitionTemplatesType = (LocationDefinitionTemplatesType)theEObject;
				Object result = caseLocationDefinitionTemplatesType(locationDefinitionTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOCATIONS_TYPE: {
				LocationsType locationsType = (LocationsType)theEObject;
				Object result = caseLocationsType(locationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOCATION_TYPE: {
				LocationType locationType = (LocationType)theEObject;
				Object result = caseLocationType(locationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOGNORMAL_TYPE: {
				LognormalType lognormalType = (LognormalType)theEObject;
				Object result = caseLognormalType(lognormalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOOP: {
				Loop loop = (Loop)theEObject;
				Object result = caseLoop(loop);
				if (result == null) result = caseProcess(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.LOOP_CONDITION_TYPE: {
				LoopConditionType loopConditionType = (LoopConditionType)theEObject;
				Object result = caseLoopConditionType(loopConditionType);
				if (result == null) result = caseExpression(loopConditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.MANAGER_OF_EMPLOYEE_BY_ID_TYPE: {
				ManagerOfEmployeeByIDType managerOfEmployeeByIDType = (ManagerOfEmployeeByIDType)theEObject;
				Object result = caseManagerOfEmployeeByIDType(managerOfEmployeeByIDType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.MANAGER_OF_EMPLOYEE_TYPE: {
				ManagerOfEmployeeType managerOfEmployeeType = (ManagerOfEmployeeType)theEObject;
				Object result = caseManagerOfEmployeeType(managerOfEmployeeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.MAP: {
				Map map = (Map)theEObject;
				Object result = caseMap(map);
				if (result == null) result = caseTask(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.MERGE: {
				Merge merge = (Merge)theEObject;
				Object result = caseMerge(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				Object result = caseModelType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.MONETARY_VALUE: {
				MonetaryValue monetaryValue = (MonetaryValue)theEObject;
				Object result = caseMonetaryValue(monetaryValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.NORMAL_TYPE: {
				NormalType normalType = (NormalType)theEObject;
				Object result = caseNormalType(normalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.NOTIFICATION_BROADCASTER: {
				NotificationBroadcaster notificationBroadcaster = (NotificationBroadcaster)theEObject;
				Object result = caseNotificationBroadcaster(notificationBroadcaster);
				if (result == null) result = caseTask(notificationBroadcaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.NOTIFICATION_RECEIVER: {
				NotificationReceiver notificationReceiver = (NotificationReceiver)theEObject;
				Object result = caseNotificationReceiver(notificationReceiver);
				if (result == null) result = caseTask(notificationReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.NOTIFICATIONS_TYPE: {
				NotificationsType notificationsType = (NotificationsType)theEObject;
				Object result = caseNotificationsType(notificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.NOTIFICATION_TEMPLATES_TYPE: {
				NotificationTemplatesType notificationTemplatesType = (NotificationTemplatesType)theEObject;
				Object result = caseNotificationTemplatesType(notificationTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OBSERVER: {
				Observer observer = (Observer)theEObject;
				Object result = caseObserver(observer);
				if (result == null) result = caseTask(observer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ONE_TIME_COST: {
				OneTimeCost oneTimeCost = (OneTimeCost)theEObject;
				Object result = caseOneTimeCost(oneTimeCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OPERATIONAL_DATA: {
				OperationalData operationalData = (OperationalData)theEObject;
				Object result = caseOperationalData(operationalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATION_DEFINITIONS_TYPE: {
				OrganizationDefinitionsType organizationDefinitionsType = (OrganizationDefinitionsType)theEObject;
				Object result = caseOrganizationDefinitionsType(organizationDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATION_DEFINITION_TEMPLATES_TYPE: {
				OrganizationDefinitionTemplatesType organizationDefinitionTemplatesType = (OrganizationDefinitionTemplatesType)theEObject;
				Object result = caseOrganizationDefinitionTemplatesType(organizationDefinitionTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATION_MANAGER_TYPE: {
				OrganizationManagerType organizationManagerType = (OrganizationManagerType)theEObject;
				Object result = caseOrganizationManagerType(organizationManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATION_MODEL: {
				OrganizationModel organizationModel = (OrganizationModel)theEObject;
				Object result = caseOrganizationModel(organizationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATIONS: {
				Organizations organizations = (Organizations)theEObject;
				Object result = caseOrganizations(organizations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATION_UNITS_TYPE: {
				OrganizationUnitsType organizationUnitsType = (OrganizationUnitsType)theEObject;
				Object result = caseOrganizationUnitsType(organizationUnitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ORGANIZATION_UNIT_TYPE: {
				OrganizationUnitType organizationUnitType = (OrganizationUnitType)theEObject;
				Object result = caseOrganizationUnitType(organizationUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT: {
				Output output = (Output)theEObject;
				Object result = caseOutput(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_BRANCH: {
				OutputBranch outputBranch = (OutputBranch)theEObject;
				Object result = caseOutputBranch(outputBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_BRANCH_TYPE: {
				OutputBranchType outputBranchType = (OutputBranchType)theEObject;
				Object result = caseOutputBranchType(outputBranchType);
				if (result == null) result = caseOutputBranch(outputBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_CRITERION: {
				OutputCriterion outputCriterion = (OutputCriterion)theEObject;
				Object result = caseOutputCriterion(outputCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_CRITERION_REF: {
				OutputCriterionRef outputCriterionRef = (OutputCriterionRef)theEObject;
				Object result = caseOutputCriterionRef(outputCriterionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_PATH_OPERATIONAL_DATA: {
				OutputPathOperationalData outputPathOperationalData = (OutputPathOperationalData)theEObject;
				Object result = caseOutputPathOperationalData(outputPathOperationalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_PATH_PROBABILITY_VALUE: {
				OutputPathProbabilityValue outputPathProbabilityValue = (OutputPathProbabilityValue)theEObject;
				Object result = caseOutputPathProbabilityValue(outputPathProbabilityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_REF: {
				OutputRef outputRef = (OutputRef)theEObject;
				Object result = caseOutputRef(outputRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_REPOSITORY_VALUE: {
				OutputRepositoryValue outputRepositoryValue = (OutputRepositoryValue)theEObject;
				Object result = caseOutputRepositoryValue(outputRepositoryValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE: {
				OutputRepositoryValueType outputRepositoryValueType = (OutputRepositoryValueType)theEObject;
				Object result = caseOutputRepositoryValueType(outputRepositoryValueType);
				if (result == null) result = caseOutputRepositoryValue(outputRepositoryValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.OUTPUTS: {
				Outputs outputs = (Outputs)theEObject;
				Object result = caseOutputs(outputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PERSON_NAME_TYPE: {
				PersonNameType personNameType = (PersonNameType)theEObject;
				Object result = casePersonNameType(personNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PERSON_SEARCH_TYPE: {
				PersonSearchType personSearchType = (PersonSearchType)theEObject;
				Object result = casePersonSearchType(personSearchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.POISSON_TYPE: {
				PoissonType poissonType = (PoissonType)theEObject;
				Object result = casePoissonType(poissonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PRIVATE_INSTANCE: {
				PrivateInstance privateInstance = (PrivateInstance)theEObject;
				Object result = casePrivateInstance(privateInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PROCESS: {
				com.ibm.wbim.bom.schema1.Process process = (com.ibm.wbim.bom.schema1.Process)theEObject;
				Object result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PROCESSES_TYPE: {
				ProcessesType processesType = (ProcessesType)theEObject;
				Object result = caseProcessesType(processesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PROCESS_MODEL: {
				ProcessModel processModel = (ProcessModel)theEObject;
				Object result = caseProcessModel(processModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.PUBLIC_INSTANCE: {
				PublicInstance publicInstance = (PublicInstance)theEObject;
				Object result = casePublicInstance(publicInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.QUALIFICATION: {
				Qualification qualification = (Qualification)theEObject;
				Object result = caseQualification(qualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				Object result = caseQuantity(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.RANDOM_LIST_TYPE: {
				RandomListType randomListType = (RandomListType)theEObject;
				Object result = caseRandomListType(randomListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.RECURRING_TIME_INTERVAL_TYPE: {
				RecurringTimeIntervalType recurringTimeIntervalType = (RecurringTimeIntervalType)theEObject;
				Object result = caseRecurringTimeIntervalType(recurringTimeIntervalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.RELATED_INPUT_CRITERIA_TYPE: {
				RelatedInputCriteriaType relatedInputCriteriaType = (RelatedInputCriteriaType)theEObject;
				Object result = caseRelatedInputCriteriaType(relatedInputCriteriaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.REPOSITORIES_TYPE: {
				RepositoriesType repositoriesType = (RepositoriesType)theEObject;
				Object result = caseRepositoriesType(repositoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				Object result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.REPOSITORY_DATA_VALUE: {
				RepositoryDataValue repositoryDataValue = (RepositoryDataValue)theEObject;
				Object result = caseRepositoryDataValue(repositoryDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.RESOURCE_MODEL: {
				ResourceModel resourceModel = (ResourceModel)theEObject;
				Object result = caseResourceModel(resourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.RESOURCES: {
				Resources resources = (Resources)theEObject;
				Object result = caseResources(resources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ROLE: {
				Role role = (Role)theEObject;
				Object result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ROLE_REQUIREMENT: {
				RoleRequirement roleRequirement = (RoleRequirement)theEObject;
				Object result = caseRoleRequirement(roleRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.ROLES_TYPE: {
				RolesType rolesType = (RolesType)theEObject;
				Object result = caseRolesType(rolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.SCOPE_DIMENSION_TYPE: {
				ScopeDimensionType scopeDimensionType = (ScopeDimensionType)theEObject;
				Object result = caseScopeDimensionType(scopeDimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.SCOPE_DIMENSION_VALUE: {
				ScopeDimensionValue scopeDimensionValue = (ScopeDimensionValue)theEObject;
				Object result = caseScopeDimensionValue(scopeDimensionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.SERVICE: {
				Service service = (Service)theEObject;
				Object result = caseService(service);
				if (result == null) result = caseTask(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.SERVICES_TYPE: {
				ServicesType servicesType = (ServicesType)theEObject;
				Object result = caseServicesType(servicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				Object result = caseSourceType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.START_DAY_OF_WEEK_TYPE: {
				StartDayOfWeekType startDayOfWeekType = (StartDayOfWeekType)theEObject;
				Object result = caseStartDayOfWeekType(startDayOfWeekType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.START_NODE_TYPE: {
				StartNodeType startNodeType = (StartNodeType)theEObject;
				Object result = caseStartNodeType(startNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.STOP_NODE_TYPE: {
				StopNodeType stopNodeType = (StopNodeType)theEObject;
				Object result = caseStopNodeType(stopNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TARGET_TYPE: {
				TargetType targetType = (TargetType)theEObject;
				Object result = caseTargetType(targetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TASK: {
				Task task = (Task)theEObject;
				Object result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TASK_INDIVIDUAL_RESOURCE_REQUIREMENT: {
				TaskIndividualResourceRequirement taskIndividualResourceRequirement = (TaskIndividualResourceRequirement)theEObject;
				Object result = caseTaskIndividualResourceRequirement(taskIndividualResourceRequirement);
				if (result == null) result = caseIndividualResourceRequirement(taskIndividualResourceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TASKS_TYPE: {
				TasksType tasksType = (TasksType)theEObject;
				Object result = caseTasksType(tasksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TIME_ESTIMATION_TYPE: {
				TimeEstimationType timeEstimationType = (TimeEstimationType)theEObject;
				Object result = caseTimeEstimationType(timeEstimationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TIMER: {
				Timer timer = (Timer)theEObject;
				Object result = caseTimer(timer);
				if (result == null) result = caseTask(timer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TIMER_SETTING_TYPE: {
				TimerSettingType timerSettingType = (TimerSettingType)theEObject;
				Object result = caseTimerSettingType(timerSettingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TIMETABLE: {
				Timetable timetable = (Timetable)theEObject;
				Object result = caseTimetable(timetable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TIMETABLES_TYPE: {
				TimetablesType timetablesType = (TimetablesType)theEObject;
				Object result = caseTimetablesType(timetablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TIME_VALUE: {
				TimeValue timeValue = (TimeValue)theEObject;
				Object result = caseTimeValue(timeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				Object result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.UNIFORM_TYPE: {
				UniformType uniformType = (UniformType)theEObject;
				Object result = caseUniformType(uniformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				Object result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.WEIGHTED_LIST_TYPE: {
				WeightedListType weightedListType = (WeightedListType)theEObject;
				Object result = caseWeightedListType(weightedListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Schema1Package.WHEN_COST_APPLICABLE_TYPE: {
				WhenCostApplicableType whenCostApplicableType = (WhenCostApplicableType)theEObject;
				Object result = caseWhenCostApplicableType(whenCostApplicableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Additional Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Additional Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdditionalInputType(AdditionalInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Additional Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Additional Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdditionalOutputType(AdditionalOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Annotated Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Annotated Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnotatedNodeType(AnnotatedNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAvailability(Availability object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Based On Timetable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Based On Timetable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasedOnTimetableType(BasedOnTimetableType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Bulk Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Bulk Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBulkResource(BulkResource object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Bulk Resource Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Bulk Resource Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBulkResourceDefinitionsType(BulkResourceDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Bulk Resource Definition Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Bulk Resource Definition Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBulkResourceDefinitionTemplatesType(BulkResourceDefinitionTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Bulk Resource Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Bulk Resource Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBulkResourceRequirement(BulkResourceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Bulk Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Bulk Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBulkResourcesType(BulkResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Business Item Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Business Item Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusinessItemInstancesType(BusinessItemInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Business Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Business Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusinessItemsType(BusinessItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Business Item Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Business Item Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusinessItemTemplatesType(BusinessItemTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call To Process Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call To Process Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallToProcessType(CallToProcessType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call To Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call To Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallToServiceType(CallToServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call To Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call To Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallToTaskType(CallToTaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Catalogs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Catalogs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCatalogs(Catalogs object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Catalogs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Catalogs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCatalogsType(CatalogsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Complex Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Complex Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComplexDataType(ComplexDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Complex Data Type Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Complex Data Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComplexDataTypeInstance(ComplexDataTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Constant Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Constant Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstantTimeType(ConstantTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Control Action Output Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Control Action Output Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlActionOutputRef(ControlActionOutputRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Correlation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Correlation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCorrelationType(CorrelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cost Per Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cost Per Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCostPerQuantity(CostPerQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cost Per Quantity And Time Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cost Per Quantity And Time Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCostPerQuantityAndTimeUnit(CostPerQuantityAndTimeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cost Per Time Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cost Per Time Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCostPerTimeUnit(CostPerTimeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cost Per Time Unit Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cost Per Time Unit Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCostPerTimeUnitValue(CostPerTimeUnitValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCostType(CostType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cost Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cost Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCostValue(CostValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Criteria Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Criteria Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCriteriaTemplate(CriteriaTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataModel(DataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultValue(DefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDistributionType(DistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Distribution Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Distribution Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDistributionType1(DistributionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>End Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>End Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEndNodeType(EndNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entry Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entry Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntryPointType(EntryPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Exemption Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Exemption Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExemptionPeriodType(ExemptionPeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Exponential Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Exponential Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExponentialType(ExponentialType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extended Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extended Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtendedAttributes(ExtendedAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extended Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extended Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtendedAttributeType(ExtendedAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Flow Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Flow Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlowContentType(FlowContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForLoop(ForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gamma Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gamma Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGammaType(GammaType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Global Repository Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Global Repository Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGlobalRepositoryRef(GlobalRepositoryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Group Members Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Group Members Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGroupMembersType(GroupMembersType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Group Search Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Group Search Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGroupSearchType(GroupSearchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Individual Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Individual Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndividualResource(IndividualResource object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Individual Resource Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Individual Resource Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndividualResourceDefinitionsType(IndividualResourceDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Individual Resource Definition Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Individual Resource Definition Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndividualResourceDefinitionTemplatesType(IndividualResourceDefinitionTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Individual Resource Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Individual Resource Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndividualResourceRequirement(IndividualResourceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Individual Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Individual Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndividualResourcesType(IndividualResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputBranch(InputBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Constant Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputConstantValue(InputConstantValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Constant Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Constant Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputConstantValueType(InputConstantValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputCriterion(InputCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Criterion Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Criterion Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputCriterionRef(InputCriterionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Repository Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Repository Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputRepositoryValue(InputRepositoryValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Repository Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Repository Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputRepositoryValueType(InputRepositoryValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Inputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputs(Inputs object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputType(InputType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInvocation(Invocation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Last Activation Time Plus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Last Activation Time Plus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLastActivationTimePlusType(LastActivationTimePlusType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Local Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Local Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocalRepository(LocalRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Local Repository Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Local Repository Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocalRepositoryRef(LocalRepositoryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Location Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Location Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocationDefinitionsType(LocationDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Location Definition Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Location Definition Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocationDefinitionTemplatesType(LocationDefinitionTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Locations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Locations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocationsType(LocationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocationType(LocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lognormal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lognormal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLognormalType(LognormalType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Loop Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Loop Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopConditionType(LoopConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Manager Of Employee By ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Manager Of Employee By ID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManagerOfEmployeeByIDType(ManagerOfEmployeeByIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Manager Of Employee Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Manager Of Employee Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManagerOfEmployeeType(ManagerOfEmployeeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMerge(Merge object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Monetary Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Monetary Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMonetaryValue(MonetaryValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Normal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Normal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNormalType(NormalType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notification Broadcaster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notification Broadcaster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotificationBroadcaster(NotificationBroadcaster object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notification Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notification Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotificationReceiver(NotificationReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotificationsType(NotificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notification Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notification Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotificationTemplatesType(NotificationTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObserver(Observer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One Time Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One Time Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneTimeCost(OneTimeCost object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operational Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operational Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperationalData(OperationalData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationDefinitionsType(OrganizationDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Definition Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Definition Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationDefinitionTemplatesType(OrganizationDefinitionTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationManagerType(OrganizationManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationModel(OrganizationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organizations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organizations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizations(Organizations object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Units Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Units Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationUnitsType(OrganizationUnitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationUnitType(OrganizationUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputBranch(OutputBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputBranchType(OutputBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputCriterion(OutputCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Criterion Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Criterion Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputCriterionRef(OutputCriterionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Path Operational Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Path Operational Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputPathOperationalData(OutputPathOperationalData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Path Probability Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Path Probability Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputPathProbabilityValue(OutputPathProbabilityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputRef(OutputRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Repository Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Repository Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputRepositoryValue(OutputRepositoryValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Repository Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Repository Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputRepositoryValueType(OutputRepositoryValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Outputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputs(Outputs object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePersonNameType(PersonNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Person Search Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person Search Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePersonSearchType(PersonSearchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Poisson Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Poisson Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePoissonType(PoissonType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Private Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Private Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrivateInstance(PrivateInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcess(com.ibm.wbim.bom.schema1.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Processes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Processes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessesType(ProcessesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Process Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessModel(ProcessModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Public Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Public Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublicInstance(PublicInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualification(Qualification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Random List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Random List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRandomListType(RandomListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Recurring Time Interval Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Recurring Time Interval Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRecurringTimeIntervalType(RecurringTimeIntervalType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Related Input Criteria Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Related Input Criteria Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelatedInputCriteriaType(RelatedInputCriteriaType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Repositories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Repositories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepositoriesType(RepositoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Repository Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Repository Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepositoryDataValue(RepositoryDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceModel(ResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Role Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Role Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoleRequirement(RoleRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRolesType(RolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Scope Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Scope Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScopeDimensionType(ScopeDimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Scope Dimension Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Scope Dimension Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScopeDimensionValue(ScopeDimensionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Services Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Services Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServicesType(ServicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Start Day Of Week Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Start Day Of Week Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStartDayOfWeekType(StartDayOfWeekType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Start Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Start Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStartNodeType(StartNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Stop Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Stop Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStopNodeType(StopNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTargetType(TargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Task Individual Resource Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Task Individual Resource Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTaskIndividualResourceRequirement(TaskIndividualResourceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tasks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tasks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTasksType(TasksType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Estimation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Estimation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeEstimationType(TimeEstimationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimer(Timer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Timer Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Timer Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimerSettingType(TimerSettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Timetable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimetable(Timetable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Timetables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Timetables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimetablesType(TimetablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeValue(TimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uniform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uniform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUniformType(UniformType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Weighted List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Weighted List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWeightedListType(WeightedListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>When Cost Applicable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>When Cost Applicable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhenCostApplicableType(WhenCostApplicableType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //Schema1Switch
