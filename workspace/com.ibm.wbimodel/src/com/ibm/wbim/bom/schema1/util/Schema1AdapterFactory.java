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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package
 * @generated
 */
public class Schema1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Schema1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Schema1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schema1Switch modelSwitch =
		new Schema1Switch() {
			public Object caseAdditionalInputType(AdditionalInputType object) {
				return createAdditionalInputTypeAdapter();
			}
			public Object caseAdditionalOutputType(AdditionalOutputType object) {
				return createAdditionalOutputTypeAdapter();
			}
			public Object caseAnnotatedNodeType(AnnotatedNodeType object) {
				return createAnnotatedNodeTypeAdapter();
			}
			public Object caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			public Object caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			public Object caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			public Object caseAvailability(Availability object) {
				return createAvailabilityAdapter();
			}
			public Object caseBasedOnTimetableType(BasedOnTimetableType object) {
				return createBasedOnTimetableTypeAdapter();
			}
			public Object caseBulkResource(BulkResource object) {
				return createBulkResourceAdapter();
			}
			public Object caseBulkResourceDefinitionsType(BulkResourceDefinitionsType object) {
				return createBulkResourceDefinitionsTypeAdapter();
			}
			public Object caseBulkResourceDefinitionTemplatesType(BulkResourceDefinitionTemplatesType object) {
				return createBulkResourceDefinitionTemplatesTypeAdapter();
			}
			public Object caseBulkResourceRequirement(BulkResourceRequirement object) {
				return createBulkResourceRequirementAdapter();
			}
			public Object caseBulkResourcesType(BulkResourcesType object) {
				return createBulkResourcesTypeAdapter();
			}
			public Object caseBusinessItemInstancesType(BusinessItemInstancesType object) {
				return createBusinessItemInstancesTypeAdapter();
			}
			public Object caseBusinessItemsType(BusinessItemsType object) {
				return createBusinessItemsTypeAdapter();
			}
			public Object caseBusinessItemTemplatesType(BusinessItemTemplatesType object) {
				return createBusinessItemTemplatesTypeAdapter();
			}
			public Object caseCallToProcessType(CallToProcessType object) {
				return createCallToProcessTypeAdapter();
			}
			public Object caseCallToServiceType(CallToServiceType object) {
				return createCallToServiceTypeAdapter();
			}
			public Object caseCallToTaskType(CallToTaskType object) {
				return createCallToTaskTypeAdapter();
			}
			public Object caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			public Object caseCatalogs(Catalogs object) {
				return createCatalogsAdapter();
			}
			public Object caseCatalogsType(CatalogsType object) {
				return createCatalogsTypeAdapter();
			}
			public Object caseComplexDataType(ComplexDataType object) {
				return createComplexDataTypeAdapter();
			}
			public Object caseComplexDataTypeInstance(ComplexDataTypeInstance object) {
				return createComplexDataTypeInstanceAdapter();
			}
			public Object caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			public Object caseConstantTimeType(ConstantTimeType object) {
				return createConstantTimeTypeAdapter();
			}
			public Object caseControlActionOutputRef(ControlActionOutputRef object) {
				return createControlActionOutputRefAdapter();
			}
			public Object caseCorrelationType(CorrelationType object) {
				return createCorrelationTypeAdapter();
			}
			public Object caseCostPerQuantity(CostPerQuantity object) {
				return createCostPerQuantityAdapter();
			}
			public Object caseCostPerQuantityAndTimeUnit(CostPerQuantityAndTimeUnit object) {
				return createCostPerQuantityAndTimeUnitAdapter();
			}
			public Object caseCostPerTimeUnit(CostPerTimeUnit object) {
				return createCostPerTimeUnitAdapter();
			}
			public Object caseCostPerTimeUnitValue(CostPerTimeUnitValue object) {
				return createCostPerTimeUnitValueAdapter();
			}
			public Object caseCostType(CostType object) {
				return createCostTypeAdapter();
			}
			public Object caseCostValue(CostValue object) {
				return createCostValueAdapter();
			}
			public Object caseCriteriaTemplate(CriteriaTemplate object) {
				return createCriteriaTemplateAdapter();
			}
			public Object caseDataModel(DataModel object) {
				return createDataModelAdapter();
			}
			public Object caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			public Object caseDefaultValue(DefaultValue object) {
				return createDefaultValueAdapter();
			}
			public Object caseDistributionType(DistributionType object) {
				return createDistributionTypeAdapter();
			}
			public Object caseDistributionType1(DistributionType1 object) {
				return createDistributionType1Adapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseEndNodeType(EndNodeType object) {
				return createEndNodeTypeAdapter();
			}
			public Object caseEntryPointType(EntryPointType object) {
				return createEntryPointTypeAdapter();
			}
			public Object caseExemptionPeriodType(ExemptionPeriodType object) {
				return createExemptionPeriodTypeAdapter();
			}
			public Object caseExponentialType(ExponentialType object) {
				return createExponentialTypeAdapter();
			}
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseExtendedAttributes(ExtendedAttributes object) {
				return createExtendedAttributesAdapter();
			}
			public Object caseExtendedAttributeType(ExtendedAttributeType object) {
				return createExtendedAttributeTypeAdapter();
			}
			public Object caseFlowContentType(FlowContentType object) {
				return createFlowContentTypeAdapter();
			}
			public Object caseFork(Fork object) {
				return createForkAdapter();
			}
			public Object caseForLoop(ForLoop object) {
				return createForLoopAdapter();
			}
			public Object caseGammaType(GammaType object) {
				return createGammaTypeAdapter();
			}
			public Object caseGlobalRepositoryRef(GlobalRepositoryRef object) {
				return createGlobalRepositoryRefAdapter();
			}
			public Object caseGroupMembersType(GroupMembersType object) {
				return createGroupMembersTypeAdapter();
			}
			public Object caseGroupSearchType(GroupSearchType object) {
				return createGroupSearchTypeAdapter();
			}
			public Object caseIndividualResource(IndividualResource object) {
				return createIndividualResourceAdapter();
			}
			public Object caseIndividualResourceDefinitionsType(IndividualResourceDefinitionsType object) {
				return createIndividualResourceDefinitionsTypeAdapter();
			}
			public Object caseIndividualResourceDefinitionTemplatesType(IndividualResourceDefinitionTemplatesType object) {
				return createIndividualResourceDefinitionTemplatesTypeAdapter();
			}
			public Object caseIndividualResourceRequirement(IndividualResourceRequirement object) {
				return createIndividualResourceRequirementAdapter();
			}
			public Object caseIndividualResourcesType(IndividualResourcesType object) {
				return createIndividualResourcesTypeAdapter();
			}
			public Object caseInput(Input object) {
				return createInputAdapter();
			}
			public Object caseInputBranch(InputBranch object) {
				return createInputBranchAdapter();
			}
			public Object caseInputConstantValue(InputConstantValue object) {
				return createInputConstantValueAdapter();
			}
			public Object caseInputConstantValueType(InputConstantValueType object) {
				return createInputConstantValueTypeAdapter();
			}
			public Object caseInputCriterion(InputCriterion object) {
				return createInputCriterionAdapter();
			}
			public Object caseInputCriterionRef(InputCriterionRef object) {
				return createInputCriterionRefAdapter();
			}
			public Object caseInputRepositoryValue(InputRepositoryValue object) {
				return createInputRepositoryValueAdapter();
			}
			public Object caseInputRepositoryValueType(InputRepositoryValueType object) {
				return createInputRepositoryValueTypeAdapter();
			}
			public Object caseInputs(Inputs object) {
				return createInputsAdapter();
			}
			public Object caseInputType(InputType object) {
				return createInputTypeAdapter();
			}
			public Object caseInvocation(Invocation object) {
				return createInvocationAdapter();
			}
			public Object caseJoin(Join object) {
				return createJoinAdapter();
			}
			public Object caseLastActivationTimePlusType(LastActivationTimePlusType object) {
				return createLastActivationTimePlusTypeAdapter();
			}
			public Object caseLocalRepository(LocalRepository object) {
				return createLocalRepositoryAdapter();
			}
			public Object caseLocalRepositoryRef(LocalRepositoryRef object) {
				return createLocalRepositoryRefAdapter();
			}
			public Object caseLocationDefinitionsType(LocationDefinitionsType object) {
				return createLocationDefinitionsTypeAdapter();
			}
			public Object caseLocationDefinitionTemplatesType(LocationDefinitionTemplatesType object) {
				return createLocationDefinitionTemplatesTypeAdapter();
			}
			public Object caseLocationsType(LocationsType object) {
				return createLocationsTypeAdapter();
			}
			public Object caseLocationType(LocationType object) {
				return createLocationTypeAdapter();
			}
			public Object caseLognormalType(LognormalType object) {
				return createLognormalTypeAdapter();
			}
			public Object caseLoop(Loop object) {
				return createLoopAdapter();
			}
			public Object caseLoopConditionType(LoopConditionType object) {
				return createLoopConditionTypeAdapter();
			}
			public Object caseManagerOfEmployeeByIDType(ManagerOfEmployeeByIDType object) {
				return createManagerOfEmployeeByIDTypeAdapter();
			}
			public Object caseManagerOfEmployeeType(ManagerOfEmployeeType object) {
				return createManagerOfEmployeeTypeAdapter();
			}
			public Object caseMap(Map object) {
				return createMapAdapter();
			}
			public Object caseMerge(Merge object) {
				return createMergeAdapter();
			}
			public Object caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			public Object caseMonetaryValue(MonetaryValue object) {
				return createMonetaryValueAdapter();
			}
			public Object caseNormalType(NormalType object) {
				return createNormalTypeAdapter();
			}
			public Object caseNotificationBroadcaster(NotificationBroadcaster object) {
				return createNotificationBroadcasterAdapter();
			}
			public Object caseNotificationReceiver(NotificationReceiver object) {
				return createNotificationReceiverAdapter();
			}
			public Object caseNotificationsType(NotificationsType object) {
				return createNotificationsTypeAdapter();
			}
			public Object caseNotificationTemplatesType(NotificationTemplatesType object) {
				return createNotificationTemplatesTypeAdapter();
			}
			public Object caseObserver(Observer object) {
				return createObserverAdapter();
			}
			public Object caseOneTimeCost(OneTimeCost object) {
				return createOneTimeCostAdapter();
			}
			public Object caseOperationalData(OperationalData object) {
				return createOperationalDataAdapter();
			}
			public Object caseOrganizationDefinitionsType(OrganizationDefinitionsType object) {
				return createOrganizationDefinitionsTypeAdapter();
			}
			public Object caseOrganizationDefinitionTemplatesType(OrganizationDefinitionTemplatesType object) {
				return createOrganizationDefinitionTemplatesTypeAdapter();
			}
			public Object caseOrganizationManagerType(OrganizationManagerType object) {
				return createOrganizationManagerTypeAdapter();
			}
			public Object caseOrganizationModel(OrganizationModel object) {
				return createOrganizationModelAdapter();
			}
			public Object caseOrganizations(Organizations object) {
				return createOrganizationsAdapter();
			}
			public Object caseOrganizationUnitsType(OrganizationUnitsType object) {
				return createOrganizationUnitsTypeAdapter();
			}
			public Object caseOrganizationUnitType(OrganizationUnitType object) {
				return createOrganizationUnitTypeAdapter();
			}
			public Object caseOutput(Output object) {
				return createOutputAdapter();
			}
			public Object caseOutputBranch(OutputBranch object) {
				return createOutputBranchAdapter();
			}
			public Object caseOutputBranchType(OutputBranchType object) {
				return createOutputBranchTypeAdapter();
			}
			public Object caseOutputCriterion(OutputCriterion object) {
				return createOutputCriterionAdapter();
			}
			public Object caseOutputCriterionRef(OutputCriterionRef object) {
				return createOutputCriterionRefAdapter();
			}
			public Object caseOutputPathOperationalData(OutputPathOperationalData object) {
				return createOutputPathOperationalDataAdapter();
			}
			public Object caseOutputPathProbabilityValue(OutputPathProbabilityValue object) {
				return createOutputPathProbabilityValueAdapter();
			}
			public Object caseOutputRef(OutputRef object) {
				return createOutputRefAdapter();
			}
			public Object caseOutputRepositoryValue(OutputRepositoryValue object) {
				return createOutputRepositoryValueAdapter();
			}
			public Object caseOutputRepositoryValueType(OutputRepositoryValueType object) {
				return createOutputRepositoryValueTypeAdapter();
			}
			public Object caseOutputs(Outputs object) {
				return createOutputsAdapter();
			}
			public Object casePersonNameType(PersonNameType object) {
				return createPersonNameTypeAdapter();
			}
			public Object casePersonSearchType(PersonSearchType object) {
				return createPersonSearchTypeAdapter();
			}
			public Object casePoissonType(PoissonType object) {
				return createPoissonTypeAdapter();
			}
			public Object casePrivateInstance(PrivateInstance object) {
				return createPrivateInstanceAdapter();
			}
			public Object caseProcess(com.ibm.wbim.bom.schema1.Process object) {
				return createProcessAdapter();
			}
			public Object caseProcessesType(ProcessesType object) {
				return createProcessesTypeAdapter();
			}
			public Object caseProcessModel(ProcessModel object) {
				return createProcessModelAdapter();
			}
			public Object casePublicInstance(PublicInstance object) {
				return createPublicInstanceAdapter();
			}
			public Object caseQualification(Qualification object) {
				return createQualificationAdapter();
			}
			public Object caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			public Object caseRandomListType(RandomListType object) {
				return createRandomListTypeAdapter();
			}
			public Object caseRecurringTimeIntervalType(RecurringTimeIntervalType object) {
				return createRecurringTimeIntervalTypeAdapter();
			}
			public Object caseRelatedInputCriteriaType(RelatedInputCriteriaType object) {
				return createRelatedInputCriteriaTypeAdapter();
			}
			public Object caseRepositoriesType(RepositoriesType object) {
				return createRepositoriesTypeAdapter();
			}
			public Object caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			public Object caseRepositoryDataValue(RepositoryDataValue object) {
				return createRepositoryDataValueAdapter();
			}
			public Object caseResourceModel(ResourceModel object) {
				return createResourceModelAdapter();
			}
			public Object caseResources(Resources object) {
				return createResourcesAdapter();
			}
			public Object caseRole(Role object) {
				return createRoleAdapter();
			}
			public Object caseRoleRequirement(RoleRequirement object) {
				return createRoleRequirementAdapter();
			}
			public Object caseRolesType(RolesType object) {
				return createRolesTypeAdapter();
			}
			public Object caseScopeDimensionType(ScopeDimensionType object) {
				return createScopeDimensionTypeAdapter();
			}
			public Object caseScopeDimensionValue(ScopeDimensionValue object) {
				return createScopeDimensionValueAdapter();
			}
			public Object caseService(Service object) {
				return createServiceAdapter();
			}
			public Object caseServicesType(ServicesType object) {
				return createServicesTypeAdapter();
			}
			public Object caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			public Object caseStartDayOfWeekType(StartDayOfWeekType object) {
				return createStartDayOfWeekTypeAdapter();
			}
			public Object caseStartNodeType(StartNodeType object) {
				return createStartNodeTypeAdapter();
			}
			public Object caseStopNodeType(StopNodeType object) {
				return createStopNodeTypeAdapter();
			}
			public Object caseTargetType(TargetType object) {
				return createTargetTypeAdapter();
			}
			public Object caseTask(Task object) {
				return createTaskAdapter();
			}
			public Object caseTaskIndividualResourceRequirement(TaskIndividualResourceRequirement object) {
				return createTaskIndividualResourceRequirementAdapter();
			}
			public Object caseTasksType(TasksType object) {
				return createTasksTypeAdapter();
			}
			public Object caseTimeEstimationType(TimeEstimationType object) {
				return createTimeEstimationTypeAdapter();
			}
			public Object caseTimer(Timer object) {
				return createTimerAdapter();
			}
			public Object caseTimerSettingType(TimerSettingType object) {
				return createTimerSettingTypeAdapter();
			}
			public Object caseTimetable(Timetable object) {
				return createTimetableAdapter();
			}
			public Object caseTimetablesType(TimetablesType object) {
				return createTimetablesTypeAdapter();
			}
			public Object caseTimeValue(TimeValue object) {
				return createTimeValueAdapter();
			}
			public Object caseTypeDeclaration(TypeDeclaration object) {
				return createTypeDeclarationAdapter();
			}
			public Object caseUniformType(UniformType object) {
				return createUniformTypeAdapter();
			}
			public Object caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			public Object caseWeightedListType(WeightedListType object) {
				return createWeightedListTypeAdapter();
			}
			public Object caseWhenCostApplicableType(WhenCostApplicableType object) {
				return createWhenCostApplicableTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.AdditionalInputType <em>Additional Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.AdditionalInputType
	 * @generated
	 */
	public Adapter createAdditionalInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.AdditionalOutputType <em>Additional Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.AdditionalOutputType
	 * @generated
	 */
	public Adapter createAdditionalOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.AnnotatedNodeType <em>Annotated Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.AnnotatedNodeType
	 * @generated
	 */
	public Adapter createAnnotatedNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Availability
	 * @generated
	 */
	public Adapter createAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BasedOnTimetableType <em>Based On Timetable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BasedOnTimetableType
	 * @generated
	 */
	public Adapter createBasedOnTimetableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BulkResource <em>Bulk Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BulkResource
	 * @generated
	 */
	public Adapter createBulkResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType <em>Bulk Resource Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType
	 * @generated
	 */
	public Adapter createBulkResourceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType <em>Bulk Resource Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType
	 * @generated
	 */
	public Adapter createBulkResourceDefinitionTemplatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement <em>Bulk Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceRequirement
	 * @generated
	 */
	public Adapter createBulkResourceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BulkResourcesType <em>Bulk Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BulkResourcesType
	 * @generated
	 */
	public Adapter createBulkResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BusinessItemInstancesType <em>Business Item Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemInstancesType
	 * @generated
	 */
	public Adapter createBusinessItemInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BusinessItemsType <em>Business Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemsType
	 * @generated
	 */
	public Adapter createBusinessItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.BusinessItemTemplatesType <em>Business Item Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemTemplatesType
	 * @generated
	 */
	public Adapter createBusinessItemTemplatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CallToProcessType <em>Call To Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CallToProcessType
	 * @generated
	 */
	public Adapter createCallToProcessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CallToServiceType <em>Call To Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CallToServiceType
	 * @generated
	 */
	public Adapter createCallToServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CallToTaskType <em>Call To Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CallToTaskType
	 * @generated
	 */
	public Adapter createCallToTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Catalogs <em>Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Catalogs
	 * @generated
	 */
	public Adapter createCatalogsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CatalogsType <em>Catalogs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CatalogsType
	 * @generated
	 */
	public Adapter createCatalogsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType
	 * @generated
	 */
	public Adapter createComplexDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance <em>Complex Data Type Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance
	 * @generated
	 */
	public Adapter createComplexDataTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ConstantTimeType <em>Constant Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ConstantTimeType
	 * @generated
	 */
	public Adapter createConstantTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef <em>Control Action Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ControlActionOutputRef
	 * @generated
	 */
	public Adapter createControlActionOutputRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CorrelationType <em>Correlation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CorrelationType
	 * @generated
	 */
	public Adapter createCorrelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CostPerQuantity <em>Cost Per Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CostPerQuantity
	 * @generated
	 */
	public Adapter createCostPerQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit <em>Cost Per Quantity And Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit
	 * @generated
	 */
	public Adapter createCostPerQuantityAndTimeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnit <em>Cost Per Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CostPerTimeUnit
	 * @generated
	 */
	public Adapter createCostPerTimeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue <em>Cost Per Time Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CostPerTimeUnitValue
	 * @generated
	 */
	public Adapter createCostPerTimeUnitValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CostType
	 * @generated
	 */
	public Adapter createCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CostValue <em>Cost Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CostValue
	 * @generated
	 */
	public Adapter createCostValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate <em>Criteria Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate
	 * @generated
	 */
	public Adapter createCriteriaTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.DataModel
	 * @generated
	 */
	public Adapter createDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.DefaultValue
	 * @generated
	 */
	public Adapter createDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.DistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.DistributionType
	 * @generated
	 */
	public Adapter createDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.DistributionType1 <em>Distribution Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.DistributionType1
	 * @generated
	 */
	public Adapter createDistributionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.EndNodeType <em>End Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.EndNodeType
	 * @generated
	 */
	public Adapter createEndNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.EntryPointType <em>Entry Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.EntryPointType
	 * @generated
	 */
	public Adapter createEntryPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ExemptionPeriodType <em>Exemption Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ExemptionPeriodType
	 * @generated
	 */
	public Adapter createExemptionPeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ExponentialType <em>Exponential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ExponentialType
	 * @generated
	 */
	public Adapter createExponentialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributes
	 * @generated
	 */
	public Adapter createExtendedAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType <em>Extended Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType
	 * @generated
	 */
	public Adapter createExtendedAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.FlowContentType <em>Flow Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType
	 * @generated
	 */
	public Adapter createFlowContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ForLoop
	 * @generated
	 */
	public Adapter createForLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.GammaType <em>Gamma Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.GammaType
	 * @generated
	 */
	public Adapter createGammaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.GlobalRepositoryRef <em>Global Repository Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.GlobalRepositoryRef
	 * @generated
	 */
	public Adapter createGlobalRepositoryRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.GroupMembersType <em>Group Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType
	 * @generated
	 */
	public Adapter createGroupMembersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.GroupSearchType <em>Group Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType
	 * @generated
	 */
	public Adapter createGroupSearchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.IndividualResource <em>Individual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource
	 * @generated
	 */
	public Adapter createIndividualResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType <em>Individual Resource Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType
	 * @generated
	 */
	public Adapter createIndividualResourceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType <em>Individual Resource Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType
	 * @generated
	 */
	public Adapter createIndividualResourceDefinitionTemplatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement <em>Individual Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceRequirement
	 * @generated
	 */
	public Adapter createIndividualResourceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.IndividualResourcesType <em>Individual Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourcesType
	 * @generated
	 */
	public Adapter createIndividualResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputBranch <em>Input Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputBranch
	 * @generated
	 */
	public Adapter createInputBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputConstantValue <em>Input Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValue
	 * @generated
	 */
	public Adapter createInputConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputConstantValueType <em>Input Constant Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValueType
	 * @generated
	 */
	public Adapter createInputConstantValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputCriterion <em>Input Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputCriterion
	 * @generated
	 */
	public Adapter createInputCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputCriterionRef <em>Input Criterion Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputCriterionRef
	 * @generated
	 */
	public Adapter createInputCriterionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue <em>Input Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValue
	 * @generated
	 */
	public Adapter createInputRepositoryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputRepositoryValueType <em>Input Repository Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValueType
	 * @generated
	 */
	public Adapter createInputRepositoryValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Inputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Inputs
	 * @generated
	 */
	public Adapter createInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.InputType
	 * @generated
	 */
	public Adapter createInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Invocation
	 * @generated
	 */
	public Adapter createInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LastActivationTimePlusType <em>Last Activation Time Plus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LastActivationTimePlusType
	 * @generated
	 */
	public Adapter createLastActivationTimePlusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository
	 * @generated
	 */
	public Adapter createLocalRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LocalRepositoryRef <em>Local Repository Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LocalRepositoryRef
	 * @generated
	 */
	public Adapter createLocalRepositoryRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LocationDefinitionsType <em>Location Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LocationDefinitionsType
	 * @generated
	 */
	public Adapter createLocationDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType <em>Location Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType
	 * @generated
	 */
	public Adapter createLocationDefinitionTemplatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LocationsType <em>Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LocationsType
	 * @generated
	 */
	public Adapter createLocationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LocationType
	 * @generated
	 */
	public Adapter createLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LognormalType <em>Lognormal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LognormalType
	 * @generated
	 */
	public Adapter createLognormalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.LoopConditionType <em>Loop Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.LoopConditionType
	 * @generated
	 */
	public Adapter createLoopConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType <em>Manager Of Employee By ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType
	 * @generated
	 */
	public Adapter createManagerOfEmployeeByIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeType <em>Manager Of Employee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeType
	 * @generated
	 */
	public Adapter createManagerOfEmployeeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Merge
	 * @generated
	 */
	public Adapter createMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.MonetaryValue <em>Monetary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.MonetaryValue
	 * @generated
	 */
	public Adapter createMonetaryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.NormalType <em>Normal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.NormalType
	 * @generated
	 */
	public Adapter createNormalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster <em>Notification Broadcaster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.NotificationBroadcaster
	 * @generated
	 */
	public Adapter createNotificationBroadcasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.NotificationReceiver <em>Notification Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.NotificationReceiver
	 * @generated
	 */
	public Adapter createNotificationReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.NotificationsType <em>Notifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.NotificationsType
	 * @generated
	 */
	public Adapter createNotificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.NotificationTemplatesType <em>Notification Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.NotificationTemplatesType
	 * @generated
	 */
	public Adapter createNotificationTemplatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Observer
	 * @generated
	 */
	public Adapter createObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OneTimeCost <em>One Time Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OneTimeCost
	 * @generated
	 */
	public Adapter createOneTimeCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OperationalData <em>Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OperationalData
	 * @generated
	 */
	public Adapter createOperationalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionsType <em>Organization Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OrganizationDefinitionsType
	 * @generated
	 */
	public Adapter createOrganizationDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType <em>Organization Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType
	 * @generated
	 */
	public Adapter createOrganizationDefinitionTemplatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OrganizationManagerType <em>Organization Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OrganizationManagerType
	 * @generated
	 */
	public Adapter createOrganizationManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OrganizationModel <em>Organization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel
	 * @generated
	 */
	public Adapter createOrganizationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Organizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Organizations
	 * @generated
	 */
	public Adapter createOrganizationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OrganizationUnitsType <em>Organization Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OrganizationUnitsType
	 * @generated
	 */
	public Adapter createOrganizationUnitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OrganizationUnitType <em>Organization Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OrganizationUnitType
	 * @generated
	 */
	public Adapter createOrganizationUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputBranch <em>Output Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputBranch
	 * @generated
	 */
	public Adapter createOutputBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputBranchType <em>Output Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputBranchType
	 * @generated
	 */
	public Adapter createOutputBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputCriterion <em>Output Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterion
	 * @generated
	 */
	public Adapter createOutputCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputCriterionRef <em>Output Criterion Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterionRef
	 * @generated
	 */
	public Adapter createOutputCriterionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputPathOperationalData <em>Output Path Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputPathOperationalData
	 * @generated
	 */
	public Adapter createOutputPathOperationalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue <em>Output Path Probability Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputPathProbabilityValue
	 * @generated
	 */
	public Adapter createOutputPathProbabilityValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputRef <em>Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputRef
	 * @generated
	 */
	public Adapter createOutputRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValue <em>Output Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValue
	 * @generated
	 */
	public Adapter createOutputRepositoryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValueType <em>Output Repository Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValueType
	 * @generated
	 */
	public Adapter createOutputRepositoryValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Outputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Outputs
	 * @generated
	 */
	public Adapter createOutputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.PersonNameType
	 * @generated
	 */
	public Adapter createPersonNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.PersonSearchType <em>Person Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType
	 * @generated
	 */
	public Adapter createPersonSearchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.PoissonType <em>Poisson Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.PoissonType
	 * @generated
	 */
	public Adapter createPoissonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.PrivateInstance <em>Private Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.PrivateInstance
	 * @generated
	 */
	public Adapter createPrivateInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ProcessesType <em>Processes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ProcessesType
	 * @generated
	 */
	public Adapter createProcessesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ProcessModel
	 * @generated
	 */
	public Adapter createProcessModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.PublicInstance <em>Public Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.PublicInstance
	 * @generated
	 */
	public Adapter createPublicInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Qualification
	 * @generated
	 */
	public Adapter createQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RandomListType <em>Random List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RandomListType
	 * @generated
	 */
	public Adapter createRandomListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType <em>Recurring Time Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RecurringTimeIntervalType
	 * @generated
	 */
	public Adapter createRecurringTimeIntervalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RelatedInputCriteriaType <em>Related Input Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RelatedInputCriteriaType
	 * @generated
	 */
	public Adapter createRelatedInputCriteriaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RepositoriesType <em>Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RepositoriesType
	 * @generated
	 */
	public Adapter createRepositoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue <em>Repository Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue
	 * @generated
	 */
	public Adapter createRepositoryDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ResourceModel <em>Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel
	 * @generated
	 */
	public Adapter createResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RoleRequirement <em>Role Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement
	 * @generated
	 */
	public Adapter createRoleRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.RolesType <em>Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.RolesType
	 * @generated
	 */
	public Adapter createRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType <em>Scope Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionType
	 * @generated
	 */
	public Adapter createScopeDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ScopeDimensionValue <em>Scope Dimension Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionValue
	 * @generated
	 */
	public Adapter createScopeDimensionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ServicesType <em>Services Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ServicesType
	 * @generated
	 */
	public Adapter createServicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType <em>Start Day Of Week Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.StartDayOfWeekType
	 * @generated
	 */
	public Adapter createStartDayOfWeekTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.StartNodeType <em>Start Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.StartNodeType
	 * @generated
	 */
	public Adapter createStartNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.StopNodeType <em>Stop Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.StopNodeType
	 * @generated
	 */
	public Adapter createStopNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TargetType
	 * @generated
	 */
	public Adapter createTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement <em>Task Individual Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement
	 * @generated
	 */
	public Adapter createTaskIndividualResourceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TasksType <em>Tasks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TasksType
	 * @generated
	 */
	public Adapter createTasksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TimeEstimationType <em>Time Estimation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TimeEstimationType
	 * @generated
	 */
	public Adapter createTimeEstimationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TimerSettingType <em>Timer Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TimerSettingType
	 * @generated
	 */
	public Adapter createTimerSettingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.Timetable
	 * @generated
	 */
	public Adapter createTimetableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TimetablesType <em>Timetables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TimetablesType
	 * @generated
	 */
	public Adapter createTimetablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TimeValue
	 * @generated
	 */
	public Adapter createTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.UniformType <em>Uniform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.UniformType
	 * @generated
	 */
	public Adapter createUniformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.WeightedListType <em>Weighted List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.WeightedListType
	 * @generated
	 */
	public Adapter createWeightedListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ibm.wbim.bom.schema1.WhenCostApplicableType <em>When Cost Applicable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ibm.wbim.bom.schema1.WhenCostApplicableType
	 * @generated
	 */
	public Adapter createWhenCostApplicableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Schema1AdapterFactory
