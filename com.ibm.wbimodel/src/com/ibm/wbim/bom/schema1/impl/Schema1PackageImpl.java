/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;

import com.ibm.wbim.bom.schema1.util.Schema1Validator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Schema1PackageImpl extends EPackageImpl implements Schema1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "schema1.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalOutputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basedOnTimetableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulkResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulkResourceDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulkResourceDefinitionTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulkResourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulkResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemInstancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callToProcessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callToServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callToTaskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexDataTypeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlActionOutputRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costPerQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costPerQuantityAndTimeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costPerTimeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costPerTimeUnitValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriaTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemptionPeriodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gammaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalRepositoryRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupMembersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupSearchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualResourceDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualResourceDefinitionTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualResourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputConstantValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputConstantValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputCriterionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRepositoryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRepositoryValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastActivationTimePlusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localRepositoryRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationDefinitionTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lognormalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopConditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerOfEmployeeByIDTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerOfEmployeeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monetaryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationBroadcasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationReceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneTimeCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationDefinitionTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationUnitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputCriterionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPathOperationalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPathProbabilityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRepositoryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRepositoryValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personSearchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poissonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurringTimeIntervalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedInputCriteriaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDimensionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startDayOfWeekTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskIndividualResourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEstimationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerSettingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightedListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenCostApplicableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayOfWeekEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleInstancesMatchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noInstancesMatchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType associatedDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType basicDataTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayOfWeekObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elementNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instanceOfTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multipleInstancesMatchObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType noInstancesMatchObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parentTemplateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageValueObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType predefinedOrganizationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType predefinedResourceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitEDataType = null;

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Schema1PackageImpl() {
		super(eNS_URI, Schema1Factory.eINSTANCE);
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
	 * @generated
	 */
	public static Schema1Package init() {
		if (isInited) return (Schema1Package)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI);

		// Obtain or create and register package
		Schema1PackageImpl theSchema1Package = (Schema1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Schema1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Schema1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Load packages
		theSchema1Package.loadPackage();

		// Fix loaded packages
		theSchema1Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSchema1Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Schema1Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSchema1Package.freeze();

		return theSchema1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalInputType() {
		if (additionalInputTypeEClass == null) {
			additionalInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(0);
		}
		return additionalInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalInputType_InputCriterion() {
        return (EReference)getAdditionalInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalInputType_Name() {
        return (EAttribute)getAdditionalInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalOutputType() {
		if (additionalOutputTypeEClass == null) {
			additionalOutputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(1);
		}
		return additionalOutputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalOutputType_OutputCriterion() {
        return (EReference)getAdditionalOutputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalOutputType_Name() {
        return (EAttribute)getAdditionalOutputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedNodeType() {
		if (annotatedNodeTypeEClass == null) {
			annotatedNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(2);
		}
		return annotatedNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedNodeType_Name() {
        return (EAttribute)getAnnotatedNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(3);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_AnnotationText() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnnotatedNode() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		if (attributeEClass == null) {
			attributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(5);
		}
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Description() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Rule() {
        return (EReference)getAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_DefaultValue() {
        return (EReference)getAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsOrdered() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsReadOnly() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsStatic() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsUnique() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Maximum() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Minimum() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		if (attributeValueEClass == null) {
			attributeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(6);
		}
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Group() {
        return (EAttribute)getAttributeValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_LiteralValue() {
        return (EAttribute)getAttributeValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_ExpressionValue() {
        return (EReference)getAttributeValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_PublicInstance() {
        return (EReference)getAttributeValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_PrivateInstance() {
        return (EReference)getAttributeValue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Attribute() {
        return (EAttribute)getAttributeValue().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailability() {
		if (availabilityEClass == null) {
			availabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(7);
		}
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Timetable() {
        return (EAttribute)getAvailability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasedOnTimetableType() {
		if (basedOnTimetableTypeEClass == null) {
			basedOnTimetableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(8);
		}
		return basedOnTimetableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasedOnTimetableType_Timetable() {
        return (EAttribute)getBasedOnTimetableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulkResource() {
		if (bulkResourceEClass == null) {
			bulkResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(11);
		}
		return bulkResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkResource_BulkResourceCostType() {
        return (EAttribute)getBulkResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResource_OneTimeCost() {
        return (EReference)getBulkResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResource_CostPerQuantity() {
        return (EReference)getBulkResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResource_CostPerQuantityAndTimeUnit() {
        return (EReference)getBulkResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResource_AvailableQuantity() {
        return (EReference)getBulkResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResource_Availability() {
        return (EReference)getBulkResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResource_Qualification() {
        return (EReference)getBulkResource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkResource_IsConsumable() {
        return (EAttribute)getBulkResource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulkResourceDefinitionsType() {
		if (bulkResourceDefinitionsTypeEClass == null) {
			bulkResourceDefinitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(12);
		}
		return bulkResourceDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResourceDefinitionsType_BulkResourceDefinition() {
        return (EReference)getBulkResourceDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulkResourceDefinitionTemplatesType() {
		if (bulkResourceDefinitionTemplatesTypeEClass == null) {
			bulkResourceDefinitionTemplatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(13);
		}
		return bulkResourceDefinitionTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResourceDefinitionTemplatesType_BulkResourceDefinitionTemplate() {
        return (EReference)getBulkResourceDefinitionTemplatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulkResourceRequirement() {
		if (bulkResourceRequirementEClass == null) {
			bulkResourceRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(14);
		}
		return bulkResourceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResourceRequirement_ResourceQuantity() {
        return (EReference)getBulkResourceRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkResourceRequirement_BulkResource() {
        return (EAttribute)getBulkResourceRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkResourceRequirement_Name() {
        return (EAttribute)getBulkResourceRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkResourceRequirement_TimeRequired() {
        return (EAttribute)getBulkResourceRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulkResourcesType() {
		if (bulkResourcesTypeEClass == null) {
			bulkResourcesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(15);
		}
		return bulkResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBulkResourcesType_BulkResource() {
        return (EReference)getBulkResourcesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItemInstancesType() {
		if (businessItemInstancesTypeEClass == null) {
			businessItemInstancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(16);
		}
		return businessItemInstancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemInstancesType_BusinessItemInstance() {
        return (EReference)getBusinessItemInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItemsType() {
		if (businessItemsTypeEClass == null) {
			businessItemsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(17);
		}
		return businessItemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemsType_BusinessItem() {
        return (EReference)getBusinessItemsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItemTemplatesType() {
		if (businessItemTemplatesTypeEClass == null) {
			businessItemTemplatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(18);
		}
		return businessItemTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemTemplatesType_BusinessItemTemplate() {
        return (EReference)getBusinessItemTemplatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallToProcessType() {
		if (callToProcessTypeEClass == null) {
			callToProcessTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(19);
		}
		return callToProcessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallToProcessType_Process() {
        return (EAttribute)getCallToProcessType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallToServiceType() {
		if (callToServiceTypeEClass == null) {
			callToServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(20);
		}
		return callToServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallToServiceType_Service() {
        return (EAttribute)getCallToServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallToTaskType() {
		if (callToTaskTypeEClass == null) {
			callToTaskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(21);
		}
		return callToTaskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallToTaskType_Task() {
        return (EAttribute)getCallToTaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalog() {
		if (catalogEClass == null) {
			catalogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(22);
		}
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Catalog() {
        return (EReference)getCatalog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_Id() {
        return (EAttribute)getCatalog().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_Name() {
        return (EAttribute)getCatalog().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogs() {
		if (catalogsEClass == null) {
			catalogsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(23);
		}
		return catalogsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogs_Catalog() {
        return (EReference)getCatalogs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogsType() {
		if (catalogsTypeEClass == null) {
			catalogsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(24);
		}
		return catalogsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogsType_DataCatalogs() {
        return (EReference)getCatalogsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogsType_ResourceCatalogs() {
        return (EReference)getCatalogsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogsType_OrganizationCatalogs() {
        return (EReference)getCatalogsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogsType_ProcessCatalogs() {
        return (EReference)getCatalogsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexDataType() {
		if (complexDataTypeEClass == null) {
			complexDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(25);
		}
		return complexDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexDataType_Documentation() {
        return (EAttribute)getComplexDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexDataType_Attribute() {
        return (EReference)getComplexDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexDataType_Rule() {
        return (EReference)getComplexDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexDataType_ExtendedAttributes() {
        return (EReference)getComplexDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexDataType_ParentTemplate() {
        return (EAttribute)getComplexDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexDataTypeInstance() {
		if (complexDataTypeInstanceEClass == null) {
			complexDataTypeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(26);
		}
		return complexDataTypeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexDataTypeInstance_Documentation() {
        return (EAttribute)getComplexDataTypeInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexDataTypeInstance_AttributeValue() {
        return (EReference)getComplexDataTypeInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexDataTypeInstance_ExtendedAttributes() {
        return (EReference)getComplexDataTypeInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexDataTypeInstance_InstanceOf() {
        return (EAttribute)getComplexDataTypeInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexDataTypeInstance_Name() {
        return (EAttribute)getComplexDataTypeInstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		if (connectionEClass == null) {
			connectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(27);
		}
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Description() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Source() {
        return (EReference)getConnection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Target() {
        return (EReference)getConnection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Name() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantTimeType() {
		if (constantTimeTypeEClass == null) {
			constantTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(28);
		}
		return constantTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantTimeType_Time() {
        return (EAttribute)getConstantTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlActionOutputRef() {
		if (controlActionOutputRefEClass == null) {
			controlActionOutputRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(29);
		}
		return controlActionOutputRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlActionOutputRef_RepositoryValue() {
        return (EReference)getControlActionOutputRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlActionOutputRef_Name() {
        return (EAttribute)getControlActionOutputRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationType() {
		if (correlationTypeEClass == null) {
			correlationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(30);
		}
		return correlationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationType_Predicate() {
        return (EReference)getCorrelationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelationType_MultipleInstancesSatisfyCondition() {
        return (EAttribute)getCorrelationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelationType_NoInstancesSatisfyCondition() {
        return (EAttribute)getCorrelationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostPerQuantity() {
		if (costPerQuantityEClass == null) {
			costPerQuantityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(31);
		}
		return costPerQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostPerQuantity_Unit() {
        return (EAttribute)getCostPerQuantity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostPerQuantityAndTimeUnit() {
		if (costPerQuantityAndTimeUnitEClass == null) {
			costPerQuantityAndTimeUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(32);
		}
		return costPerQuantityAndTimeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostPerQuantityAndTimeUnit_TimeUnit() {
        return (EAttribute)getCostPerQuantityAndTimeUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostPerTimeUnit() {
		if (costPerTimeUnitEClass == null) {
			costPerTimeUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(33);
		}
		return costPerTimeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostPerTimeUnit_TimeUnit() {
        return (EAttribute)getCostPerTimeUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostPerTimeUnitValue() {
		if (costPerTimeUnitValueEClass == null) {
			costPerTimeUnitValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(34);
		}
		return costPerTimeUnitValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostPerTimeUnitValue_TimeUnit() {
        return (EAttribute)getCostPerTimeUnitValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostType() {
		if (costTypeEClass == null) {
			costTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(35);
		}
		return costTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_ExecutionCost() {
        return (EReference)getCostType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_StartupCost() {
        return (EReference)getCostType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_ResourceWaitingCost() {
        return (EReference)getCostType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostValue() {
		if (costValueEClass == null) {
			costValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(36);
		}
		return costValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostValue_LiteralValue() {
        return (EAttribute)getCostValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostValue_Distribution() {
        return (EReference)getCostValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostValue_Currency() {
        return (EAttribute)getCostValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriteriaTemplate() {
		if (criteriaTemplateEClass == null) {
			criteriaTemplateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(37);
		}
		return criteriaTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_ManagerOfEmployee() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_ManagerOfEmployeeByID() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_PersonSearch() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_PersonName() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_GroupMembers() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_GroupSearch() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteriaTemplate_OrganizationManager() {
        return (EReference)getCriteriaTemplate().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		if (dataModelEClass == null) {
			dataModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(40);
		}
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_BusinessItemTemplates() {
        return (EReference)getDataModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_BusinessItems() {
        return (EReference)getDataModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_BusinessItemInstances() {
        return (EReference)getDataModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_NotificationTemplates() {
        return (EReference)getDataModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Notifications() {
        return (EReference)getDataModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		if (decisionEClass == null) {
			decisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(43);
		}
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Description() {
        return (EAttribute)getDecision().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_InputBranch() {
        return (EReference)getDecision().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_OutputBranch() {
        return (EReference)getDecision().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_IsInclusive() {
        return (EAttribute)getDecision().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_IsSimpleDecision() {
        return (EAttribute)getDecision().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Name() {
        return (EAttribute)getDecision().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValue() {
		if (defaultValueEClass == null) {
			defaultValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(44);
		}
		return defaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValue_LiteralValue() {
        return (EAttribute)getDefaultValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultValue_ExpressionValue() {
        return (EReference)getDefaultValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributionType() {
		if (distributionTypeEClass == null) {
			distributionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(45);
		}
		return distributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_Exponential() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_Gamma() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_Lognormal() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_Normal() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_Poisson() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_RandomList() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_Uniform() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionType_WeightedList() {
        return (EReference)getDistributionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributionType1() {
		if (distributionType1EClass == null) {
			distributionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(46);
		}
		return distributionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionType1_TimeUnit() {
        return (EAttribute)getDistributionType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(47);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Model() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndNodeType() {
		if (endNodeTypeEClass == null) {
			endNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(49);
		}
		return endNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndNodeType_Name() {
        return (EAttribute)getEndNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointType() {
		if (entryPointTypeEClass == null) {
			entryPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(50);
		}
		return entryPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointType_InputCriterion() {
        return (EAttribute)getEntryPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemptionPeriodType() {
		if (exemptionPeriodTypeEClass == null) {
			exemptionPeriodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(51);
		}
		return exemptionPeriodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemptionPeriodType_Timetable() {
        return (EAttribute)getExemptionPeriodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialType() {
		if (exponentialTypeEClass == null) {
			exponentialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(52);
		}
		return exponentialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialType_Mean() {
        return (EAttribute)getExponentialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(53);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Description() {
        return (EAttribute)getExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Name() {
        return (EAttribute)getExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributes() {
		if (extendedAttributesEClass == null) {
			extendedAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(54);
		}
		return extendedAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedAttributes_ExtendedAttribute() {
        return (EReference)getExtendedAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributeType() {
		if (extendedAttributeTypeEClass == null) {
			extendedAttributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(55);
		}
		return extendedAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_Mixed() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_Group() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_Any() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_Name() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_Value() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowContentType() {
		if (flowContentTypeEClass == null) {
			flowContentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(56);
		}
		return flowContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowContentType_Group() {
        return (EAttribute)getFlowContentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_StartNode() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_StopNode() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_EndNode() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Task() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Decision() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Merge() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Fork() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Join() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_NotificationBroadcaster() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_NotificationReceiver() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Observer() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Timer() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Map() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Loop() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_ForLoop() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Process() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_LocalRepository() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_CallToProcess() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_CallToTask() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_CallToService() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Connection() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowContentType_Annotation() {
        return (EReference)getFlowContentType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFork() {
		if (forkEClass == null) {
			forkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(57);
		}
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFork_Description() {
        return (EAttribute)getFork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFork_InputBranch() {
        return (EReference)getFork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFork_OutputBranch() {
        return (EReference)getFork().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFork_Name() {
        return (EAttribute)getFork().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoop() {
		if (forLoopEClass == null) {
			forLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(58);
		}
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_LoopCondition() {
        return (EReference)getForLoop().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGammaType() {
		if (gammaTypeEClass == null) {
			gammaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(59);
		}
		return gammaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGammaType_Mean() {
        return (EAttribute)getGammaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGammaType_StandardDeviation() {
        return (EAttribute)getGammaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalRepositoryRef() {
		if (globalRepositoryRefEClass == null) {
			globalRepositoryRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(60);
		}
		return globalRepositoryRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalRepositoryRef_Name() {
        return (EAttribute)getGlobalRepositoryRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupMembersType() {
		if (groupMembersTypeEClass == null) {
			groupMembersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(61);
		}
		return groupMembersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupMembersType_Group() {
        return (EAttribute)getGroupMembersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupMembersType_Domain() {
        return (EAttribute)getGroupMembersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupMembersType_IncludeSubgroups() {
        return (EAttribute)getGroupMembersType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupMembersType_AlternativeName1() {
        return (EAttribute)getGroupMembersType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupMembersType_AlternativeName2() {
        return (EAttribute)getGroupMembersType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupSearchType() {
		if (groupSearchTypeEClass == null) {
			groupSearchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(62);
		}
		return groupSearchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_GroupId() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_Profile() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_IndustryType() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_BusinessType() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_GeographicLocation() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_Affiliates() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_DisplayName() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_Secretary() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_Assistant() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_Manager() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_BusinessCategory() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupSearchType_ParentCompany() {
        return (EAttribute)getGroupSearchType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualResource() {
		if (individualResourceEClass == null) {
			individualResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(63);
		}
		return individualResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualResource_IndividualResourceCostType() {
        return (EAttribute)getIndividualResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResource_OneTimeCost() {
        return (EReference)getIndividualResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResource_CostPerTimeUnit() {
        return (EReference)getIndividualResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResource_Availability() {
        return (EReference)getIndividualResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResource_Qualification() {
        return (EReference)getIndividualResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualResourceDefinitionsType() {
		if (individualResourceDefinitionsTypeEClass == null) {
			individualResourceDefinitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(64);
		}
		return individualResourceDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResourceDefinitionsType_IndividualResourceDefinition() {
        return (EReference)getIndividualResourceDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualResourceDefinitionTemplatesType() {
		if (individualResourceDefinitionTemplatesTypeEClass == null) {
			individualResourceDefinitionTemplatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(65);
		}
		return individualResourceDefinitionTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResourceDefinitionTemplatesType_IndividualResourceDefinitionTemplate() {
        return (EReference)getIndividualResourceDefinitionTemplatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualResourceRequirement() {
		if (individualResourceRequirementEClass == null) {
			individualResourceRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(66);
		}
		return individualResourceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualResourceRequirement_IndividualResource() {
        return (EAttribute)getIndividualResourceRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualResourceRequirement_Name() {
        return (EAttribute)getIndividualResourceRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualResourceRequirement_TimeRequired() {
        return (EAttribute)getIndividualResourceRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualResourcesType() {
		if (individualResourcesTypeEClass == null) {
			individualResourcesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(67);
		}
		return individualResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualResourcesType_IndividualResource() {
        return (EReference)getIndividualResourcesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		if (inputEClass == null) {
			inputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(68);
		}
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_ConstantValue() {
        return (EReference)getInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_RepositoryValue() {
        return (EReference)getInput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_AssociatedData() {
        return (EAttribute)getInput().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_IsOrdered() {
        return (EAttribute)getInput().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_IsUnique() {
        return (EAttribute)getInput().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Maximum() {
        return (EAttribute)getInput().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Minimum() {
        return (EAttribute)getInput().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Name() {
        return (EAttribute)getInput().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBranch() {
		if (inputBranchEClass == null) {
			inputBranchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(69);
		}
		return inputBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputBranch_Input() {
        return (EReference)getInputBranch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBranch_Name() {
        return (EAttribute)getInputBranch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputConstantValue() {
		if (inputConstantValueEClass == null) {
			inputConstantValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(70);
		}
		return inputConstantValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputConstantValue_LiteralValue() {
        return (EAttribute)getInputConstantValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConstantValue_PublicInstance() {
        return (EReference)getInputConstantValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputConstantValueType() {
		if (inputConstantValueTypeEClass == null) {
			inputConstantValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(71);
		}
		return inputConstantValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputConstantValueType_Input() {
        return (EAttribute)getInputConstantValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputCriterion() {
		if (inputCriterionEClass == null) {
			inputCriterionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(72);
		}
		return inputCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputCriterion_Input() {
        return (EReference)getInputCriterion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputCriterion_Constraint() {
        return (EReference)getInputCriterion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputCriterion_Correlation() {
        return (EReference)getInputCriterion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputCriterion_Name() {
        return (EAttribute)getInputCriterion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputCriterionRef() {
		if (inputCriterionRefEClass == null) {
			inputCriterionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(73);
		}
		return inputCriterionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputCriterionRef_Name() {
        return (EAttribute)getInputCriterionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputRepositoryValue() {
		if (inputRepositoryValueEClass == null) {
			inputRepositoryValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(74);
		}
		return inputRepositoryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputRepositoryValue_LocalRepository() {
        return (EReference)getInputRepositoryValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputRepositoryValue_GlobalRepository() {
        return (EReference)getInputRepositoryValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputRepositoryValue_AtBeginning() {
        return (EAttribute)getInputRepositoryValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputRepositoryValue_IsRemove() {
        return (EAttribute)getInputRepositoryValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputRepositoryValueType() {
		if (inputRepositoryValueTypeEClass == null) {
			inputRepositoryValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(75);
		}
		return inputRepositoryValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputRepositoryValueType_Input() {
        return (EAttribute)getInputRepositoryValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputs() {
		if (inputsEClass == null) {
			inputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(76);
		}
		return inputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputs_Input() {
        return (EReference)getInputs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputs_InputCriterion() {
        return (EReference)getInputs().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputType() {
		if (inputTypeEClass == null) {
			inputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(77);
		}
		return inputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_Name() {
        return (EAttribute)getInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocation() {
		if (invocationEClass == null) {
			invocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(79);
		}
		return invocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_InputConstantValue() {
        return (EReference)getInvocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_InputRepositoryValue() {
        return (EReference)getInvocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_OutputRepositoryValue() {
        return (EReference)getInvocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_AdditionalInput() {
        return (EReference)getInvocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_AdditionalOutput() {
        return (EReference)getInvocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvocation_CallSynchronously() {
        return (EAttribute)getInvocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvocation_Name() {
        return (EAttribute)getInvocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		if (joinEClass == null) {
			joinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(80);
		}
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Description() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_InputBranch() {
        return (EReference)getJoin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_OutputBranch() {
        return (EReference)getJoin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Name() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastActivationTimePlusType() {
		if (lastActivationTimePlusTypeEClass == null) {
			lastActivationTimePlusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(81);
		}
		return lastActivationTimePlusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastActivationTimePlusType_Duration() {
        return (EAttribute)getLastActivationTimePlusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalRepository() {
		if (localRepositoryEClass == null) {
			localRepositoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(82);
		}
		return localRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_Description() {
        return (EAttribute)getLocalRepository().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_Capacity() {
        return (EAttribute)getLocalRepository().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_IsOrdered() {
        return (EAttribute)getLocalRepository().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_IsUnique() {
        return (EAttribute)getLocalRepository().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_Name() {
        return (EAttribute)getLocalRepository().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_Type() {
        return (EAttribute)getLocalRepository().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalRepositoryRef() {
		if (localRepositoryRefEClass == null) {
			localRepositoryRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(83);
		}
		return localRepositoryRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepositoryRef_Name() {
        return (EAttribute)getLocalRepositoryRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationDefinitionsType() {
		if (locationDefinitionsTypeEClass == null) {
			locationDefinitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(84);
		}
		return locationDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationDefinitionsType_LocationDefinition() {
        return (EReference)getLocationDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationDefinitionTemplatesType() {
		if (locationDefinitionTemplatesTypeEClass == null) {
			locationDefinitionTemplatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(85);
		}
		return locationDefinitionTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationDefinitionTemplatesType_LocationDefinitionTemplate() {
        return (EReference)getLocationDefinitionTemplatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationsType() {
		if (locationsTypeEClass == null) {
			locationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(86);
		}
		return locationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsType_Location() {
        return (EReference)getLocationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationType() {
		if (locationTypeEClass == null) {
			locationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(87);
		}
		return locationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Name() {
        return (EAttribute)getLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLognormalType() {
		if (lognormalTypeEClass == null) {
			lognormalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(88);
		}
		return lognormalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLognormalType_Mean() {
        return (EAttribute)getLognormalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLognormalType_StandardDeviation() {
        return (EAttribute)getLognormalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		if (loopEClass == null) {
			loopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(89);
		}
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_LoopCondition() {
        return (EReference)getLoop().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_IsConditionTestedFirst() {
        return (EAttribute)getLoop().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopConditionType() {
		if (loopConditionTypeEClass == null) {
			loopConditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(90);
		}
		return loopConditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopConditionType_CounterIncrement() {
        return (EAttribute)getLoopConditionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopConditionType_FinalCounter() {
        return (EAttribute)getLoopConditionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopConditionType_InitialCounter() {
        return (EAttribute)getLoopConditionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerOfEmployeeByIDType() {
		if (managerOfEmployeeByIDTypeEClass == null) {
			managerOfEmployeeByIDTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(91);
		}
		return managerOfEmployeeByIDTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerOfEmployeeByIDType_Staff() {
        return (EAttribute)getManagerOfEmployeeByIDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerOfEmployeeByIDType_Domain() {
        return (EAttribute)getManagerOfEmployeeByIDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerOfEmployeeType() {
		if (managerOfEmployeeTypeEClass == null) {
			managerOfEmployeeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(92);
		}
		return managerOfEmployeeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerOfEmployeeType_Name() {
        return (EAttribute)getManagerOfEmployeeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerOfEmployeeType_Domain() {
        return (EAttribute)getManagerOfEmployeeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		if (mapEClass == null) {
			mapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(93);
		}
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerge() {
		if (mergeEClass == null) {
			mergeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(94);
		}
		return mergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMerge_Description() {
        return (EAttribute)getMerge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerge_InputBranch() {
        return (EReference)getMerge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerge_OutputBranch() {
        return (EReference)getMerge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMerge_Name() {
        return (EAttribute)getMerge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		if (modelTypeEClass == null) {
			modelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(95);
		}
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Catalogs() {
        return (EReference)getModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_DataModel() {
        return (EReference)getModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_ResourceModel() {
        return (EReference)getModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_OrganizationModel() {
        return (EReference)getModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_ProcessModel() {
        return (EReference)getModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_Name() {
        return (EAttribute)getModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_SchemaVersion() {
        return (EAttribute)getModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonetaryValue() {
		if (monetaryValueEClass == null) {
			monetaryValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(96);
		}
		return monetaryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonetaryValue_Value() {
        return (EAttribute)getMonetaryValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonetaryValue_Currency() {
        return (EAttribute)getMonetaryValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalType() {
		if (normalTypeEClass == null) {
			normalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(103);
		}
		return normalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalType_Mean() {
        return (EAttribute)getNormalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalType_StandardDeviation() {
        return (EAttribute)getNormalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationBroadcaster() {
		if (notificationBroadcasterEClass == null) {
			notificationBroadcasterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(104);
		}
		return notificationBroadcasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationBroadcaster_Notification() {
        return (EAttribute)getNotificationBroadcaster().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationBroadcaster_Scope() {
        return (EAttribute)getNotificationBroadcaster().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationReceiver() {
		if (notificationReceiverEClass == null) {
			notificationReceiverEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(105);
		}
		return notificationReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationReceiver_NotificationFilter() {
        return (EReference)getNotificationReceiver().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationReceiver_Notification() {
        return (EAttribute)getNotificationReceiver().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationsType() {
		if (notificationsTypeEClass == null) {
			notificationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(106);
		}
		return notificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationsType_Notification() {
        return (EReference)getNotificationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationTemplatesType() {
		if (notificationTemplatesTypeEClass == null) {
			notificationTemplatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(107);
		}
		return notificationTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationTemplatesType_NotificationTemplate() {
        return (EReference)getNotificationTemplatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserver() {
		if (observerEClass == null) {
			observerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(108);
		}
		return observerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserver_ObservationExpression() {
        return (EReference)getObserver().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserver_IsObserveContinuously() {
        return (EAttribute)getObserver().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneTimeCost() {
		if (oneTimeCostEClass == null) {
			oneTimeCostEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(109);
		}
		return oneTimeCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneTimeCost_CostValue() {
        return (EReference)getOneTimeCost().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneTimeCost_WhenCostApplicable() {
        return (EReference)getOneTimeCost().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalData() {
		if (operationalDataEClass == null) {
			operationalDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(110);
		}
		return operationalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalData_TimeEstimation() {
        return (EReference)getOperationalData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalData_Cost() {
        return (EReference)getOperationalData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalData_Revenue() {
        return (EReference)getOperationalData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationDefinitionsType() {
		if (organizationDefinitionsTypeEClass == null) {
			organizationDefinitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(111);
		}
		return organizationDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationDefinitionsType_OrganizationDefinition() {
        return (EReference)getOrganizationDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationDefinitionTemplatesType() {
		if (organizationDefinitionTemplatesTypeEClass == null) {
			organizationDefinitionTemplatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(112);
		}
		return organizationDefinitionTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationDefinitionTemplatesType_OrganizationDefinitionTemplate() {
        return (EReference)getOrganizationDefinitionTemplatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationManagerType() {
		if (organizationManagerTypeEClass == null) {
			organizationManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(113);
		}
		return organizationManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationManagerType_Organization() {
        return (EAttribute)getOrganizationManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationModel() {
		if (organizationModelEClass == null) {
			organizationModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(114);
		}
		return organizationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationModel_OrganizationDefinitionTemplates() {
        return (EReference)getOrganizationModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationModel_OrganizationDefinitions() {
        return (EReference)getOrganizationModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationModel_OrganizationUnits() {
        return (EReference)getOrganizationModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationModel_LocationDefinitionTemplates() {
        return (EReference)getOrganizationModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationModel_LocationDefinitions() {
        return (EReference)getOrganizationModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationModel_Locations() {
        return (EReference)getOrganizationModel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizations() {
		if (organizationsEClass == null) {
			organizationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(115);
		}
		return organizationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizations_OrganizationUnit() {
        return (EReference)getOrganizations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizations_Location() {
        return (EReference)getOrganizations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationUnitsType() {
		if (organizationUnitsTypeEClass == null) {
			organizationUnitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(116);
		}
		return organizationUnitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnitsType_OrganizationUnit() {
        return (EReference)getOrganizationUnitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationUnitType() {
		if (organizationUnitTypeEClass == null) {
			organizationUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(117);
		}
		return organizationUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationUnitType_Name() {
        return (EAttribute)getOrganizationUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		if (outputEClass == null) {
			outputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(118);
		}
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_RepositoryValue() {
        return (EReference)getOutput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_AssociatedData() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_IsOrdered() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_IsUnique() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Maximum() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Minimum() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Name() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputBranch() {
		if (outputBranchEClass == null) {
			outputBranchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(119);
		}
		return outputBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBranch_Output() {
        return (EReference)getOutputBranch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputBranch_Name() {
        return (EAttribute)getOutputBranch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputBranchType() {
		if (outputBranchTypeEClass == null) {
			outputBranchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(120);
		}
		return outputBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBranchType_Condition() {
        return (EReference)getOutputBranchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBranchType_OperationalData() {
        return (EReference)getOutputBranchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputCriterion() {
		if (outputCriterionEClass == null) {
			outputCriterionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(121);
		}
		return outputCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputCriterion_Output() {
        return (EReference)getOutputCriterion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputCriterion_RelatedInputCriteria() {
        return (EReference)getOutputCriterion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCriterion_Name() {
        return (EAttribute)getOutputCriterion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCriterion_Type() {
        return (EAttribute)getOutputCriterion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputCriterionRef() {
		if (outputCriterionRefEClass == null) {
			outputCriterionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(122);
		}
		return outputCriterionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCriterionRef_Name() {
        return (EAttribute)getOutputCriterionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPathOperationalData() {
		if (outputPathOperationalDataEClass == null) {
			outputPathOperationalDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(123);
		}
		return outputPathOperationalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPathOperationalData_Probability() {
        return (EReference)getOutputPathOperationalData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPathProbabilityValue() {
		if (outputPathProbabilityValueEClass == null) {
			outputPathProbabilityValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(124);
		}
		return outputPathProbabilityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPathProbabilityValue_LiteralValue() {
        return (EAttribute)getOutputPathProbabilityValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputRef() {
		if (outputRefEClass == null) {
			outputRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(125);
		}
		return outputRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRef_Name() {
        return (EAttribute)getOutputRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputRepositoryValue() {
		if (outputRepositoryValueEClass == null) {
			outputRepositoryValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(126);
		}
		return outputRepositoryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputRepositoryValue_LocalRepository() {
        return (EReference)getOutputRepositoryValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputRepositoryValue_GlobalRepository() {
        return (EReference)getOutputRepositoryValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRepositoryValue_AtBeginning() {
        return (EAttribute)getOutputRepositoryValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRepositoryValue_IsInsert() {
        return (EAttribute)getOutputRepositoryValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputRepositoryValueType() {
		if (outputRepositoryValueTypeEClass == null) {
			outputRepositoryValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(127);
		}
		return outputRepositoryValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRepositoryValueType_Output() {
        return (EAttribute)getOutputRepositoryValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputs() {
		if (outputsEClass == null) {
			outputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(128);
		}
		return outputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputs_Output() {
        return (EReference)getOutputs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputs_OutputCriterion() {
        return (EReference)getOutputs().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonNameType() {
		if (personNameTypeEClass == null) {
			personNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(132);
		}
		return personNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_Name() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_AlternativeName1() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_AlternativeName2() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonSearchType() {
		if (personSearchTypeEClass == null) {
			personSearchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(133);
		}
		return personSearchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_UserId() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Profile() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_LastName() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_FirstName() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_MiddleName() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_EMail() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Company() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_DisplayName() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Secretary() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Assistant() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Manager() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Department() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_EmployeeId() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_TaxPayerId() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Phone() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Fax() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_Gender() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_TimeZone() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonSearchType_PreferredLanguage() {
        return (EAttribute)getPersonSearchType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoissonType() {
		if (poissonTypeEClass == null) {
			poissonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(134);
		}
		return poissonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoissonType_Mean() {
        return (EAttribute)getPoissonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivateInstance() {
		if (privateInstanceEClass == null) {
			privateInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(137);
		}
		return privateInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivateInstance_AttributeValue() {
        return (EReference)getPrivateInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateInstance_Name() {
        return (EAttribute)getPrivateInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		if (processEClass == null) {
			processEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(138);
		}
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Description() {
        return (EAttribute)getProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Inputs() {
        return (EReference)getProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Outputs() {
        return (EReference)getProcess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Precondition() {
        return (EReference)getProcess().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Postcondition() {
        return (EReference)getProcess().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Organizations() {
        return (EReference)getProcess().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_OperationalData() {
        return (EReference)getProcess().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_FlowContent() {
        return (EReference)getProcess().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ExtendedAttributes() {
        return (EReference)getProcess().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Name() {
        return (EAttribute)getProcess().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessesType() {
		if (processesTypeEClass == null) {
			processesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(139);
		}
		return processesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessesType_Process() {
        return (EReference)getProcessesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessModel() {
		if (processModelEClass == null) {
			processModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(140);
		}
		return processModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Processes() {
        return (EReference)getProcessModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Tasks() {
        return (EReference)getProcessModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Repositories() {
        return (EReference)getProcessModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Services() {
        return (EReference)getProcessModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicInstance() {
		if (publicInstanceEClass == null) {
			publicInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(141);
		}
		return publicInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicInstance_Instance() {
        return (EAttribute)getPublicInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualification() {
		if (qualificationEClass == null) {
			qualificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(142);
		}
		return qualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualification_ScopeDimensionValue() {
        return (EReference)getQualification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualification_Role() {
        return (EAttribute)getQualification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		if (quantityEClass == null) {
			quantityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(143);
		}
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Value() {
        return (EAttribute)getQuantity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Unit() {
        return (EAttribute)getQuantity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomListType() {
		if (randomListTypeEClass == null) {
			randomListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(144);
		}
		return randomListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRandomListType_Value() {
        return (EAttribute)getRandomListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurringTimeIntervalType() {
		if (recurringTimeIntervalTypeEClass == null) {
			recurringTimeIntervalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(145);
		}
		return recurringTimeIntervalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringTimeIntervalType_StartTime() {
        return (EAttribute)getRecurringTimeIntervalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurringTimeIntervalType_StartDayOfWeek() {
        return (EReference)getRecurringTimeIntervalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringTimeIntervalType_Duration() {
        return (EAttribute)getRecurringTimeIntervalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringTimeIntervalType_Name() {
        return (EAttribute)getRecurringTimeIntervalType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedInputCriteriaType() {
		if (relatedInputCriteriaTypeEClass == null) {
			relatedInputCriteriaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(146);
		}
		return relatedInputCriteriaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedInputCriteriaType_InputCriterion() {
        return (EReference)getRelatedInputCriteriaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoriesType() {
		if (repositoriesTypeEClass == null) {
			repositoriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(147);
		}
		return repositoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoriesType_Repository() {
        return (EReference)getRepositoriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		if (repositoryEClass == null) {
			repositoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(148);
		}
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Description() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_DefaultValues() {
        return (EReference)getRepository().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ComputedValues() {
        return (EReference)getRepository().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Capacity() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_IsOrdered() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_IsReadOnly() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_IsUnique() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Name() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Type() {
        return (EAttribute)getRepository().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryDataValue() {
		if (repositoryDataValueEClass == null) {
			repositoryDataValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(149);
		}
		return repositoryDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDataValue_Group() {
        return (EAttribute)getRepositoryDataValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDataValue_LiteralValue() {
        return (EAttribute)getRepositoryDataValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryDataValue_ExpressionValue() {
        return (EReference)getRepositoryDataValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryDataValue_PublicInstance() {
        return (EReference)getRepositoryDataValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryDataValue_PrivateInstance() {
        return (EReference)getRepositoryDataValue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceModel() {
		if (resourceModelEClass == null) {
			resourceModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(150);
		}
		return resourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_IndividualResourceDefinitionTemplates() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_IndividualResourceDefinitions() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_BulkResourceDefinitionTemplates() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_BulkResourceDefinitions() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_IndividualResources() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_BulkResources() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_Roles() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_Timetables() {
        return (EReference)getResourceModel().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		if (resourcesEClass == null) {
			resourcesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(151);
		}
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_RoleRequirement() {
        return (EReference)getResources().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_IndividualResourceRequirement() {
        return (EReference)getResources().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_BulkResourceRequirement() {
        return (EReference)getResources().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		if (roleEClass == null) {
			roleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(152);
		}
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Documentation() {
        return (EAttribute)getRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ScopeDimension() {
        return (EReference)getRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IndividualResourceCostType() {
        return (EAttribute)getRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_OneTimeCost() {
        return (EReference)getRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_CostPerTimeUnit() {
        return (EReference)getRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Availability() {
        return (EReference)getRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ExtendedAttributes() {
        return (EReference)getRole().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
        return (EAttribute)getRole().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequirement() {
		if (roleRequirementEClass == null) {
			roleRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(153);
		}
		return roleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirement_ResourceQuantity() {
        return (EReference)getRoleRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleRequirement_Name() {
        return (EAttribute)getRoleRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleRequirement_Role() {
        return (EAttribute)getRoleRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleRequirement_TimeRequired() {
        return (EAttribute)getRoleRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleRequirement_Type() {
        return (EAttribute)getRoleRequirement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolesType() {
		if (rolesTypeEClass == null) {
			rolesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(154);
		}
		return rolesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolesType_Role() {
        return (EReference)getRolesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeDimensionType() {
		if (scopeDimensionTypeEClass == null) {
			scopeDimensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(155);
		}
		return scopeDimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeDimensionType_Name() {
        return (EAttribute)getScopeDimensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeDimensionType_ValueType() {
        return (EAttribute)getScopeDimensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeDimensionValue() {
		if (scopeDimensionValueEClass == null) {
			scopeDimensionValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(156);
		}
		return scopeDimensionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeDimensionValue_Value() {
        return (EAttribute)getScopeDimensionValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeDimensionValue_Name() {
        return (EAttribute)getScopeDimensionValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		if (serviceEClass == null) {
			serviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(157);
		}
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicesType() {
		if (servicesTypeEClass == null) {
			servicesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(158);
		}
		return servicesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicesType_Service() {
        return (EReference)getServicesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		if (sourceTypeEClass == null) {
			sourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(159);
		}
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_ContactPoint() {
        return (EAttribute)getSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Node() {
        return (EAttribute)getSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartDayOfWeekType() {
		if (startDayOfWeekTypeEClass == null) {
			startDayOfWeekTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(160);
		}
		return startDayOfWeekTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartDayOfWeekType_DayOfWeek() {
        return (EAttribute)getStartDayOfWeekType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartDayOfWeekType_StartTime() {
        return (EAttribute)getStartDayOfWeekType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartDayOfWeekType_WeekNumber() {
        return (EAttribute)getStartDayOfWeekType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartNodeType() {
		if (startNodeTypeEClass == null) {
			startNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(161);
		}
		return startNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartNodeType_EntryPoint() {
        return (EReference)getStartNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartNodeType_Name() {
        return (EAttribute)getStartNodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopNodeType() {
		if (stopNodeTypeEClass == null) {
			stopNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(162);
		}
		return stopNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopNodeType_AssociatedOutputCriterion() {
        return (EAttribute)getStopNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopNodeType_Name() {
        return (EAttribute)getStopNodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetType() {
		if (targetTypeEClass == null) {
			targetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(163);
		}
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_ContactPoint() {
        return (EAttribute)getTargetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_Node() {
        return (EAttribute)getTargetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		if (taskEClass == null) {
			taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(164);
		}
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
        return (EAttribute)getTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
        return (EReference)getTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
        return (EReference)getTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Precondition() {
        return (EReference)getTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Postcondition() {
        return (EReference)getTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Resources() {
        return (EReference)getTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Organizations() {
        return (EReference)getTask().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OperationalData() {
        return (EReference)getTask().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ExtendedAttributes() {
        return (EReference)getTask().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
        return (EAttribute)getTask().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskIndividualResourceRequirement() {
		if (taskIndividualResourceRequirementEClass == null) {
			taskIndividualResourceRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(165);
		}
		return taskIndividualResourceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskIndividualResourceRequirement_Criteria() {
        return (EReference)getTaskIndividualResourceRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasksType() {
		if (tasksTypeEClass == null) {
			tasksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(166);
		}
		return tasksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTasksType_Task() {
        return (EReference)getTasksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEstimationType() {
		if (timeEstimationTypeEClass == null) {
			timeEstimationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(167);
		}
		return timeEstimationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEstimationType_ProcessingTime() {
        return (EReference)getTimeEstimationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEstimationType_MaxResourceWaitingTime() {
        return (EReference)getTimeEstimationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		if (timerEClass == null) {
			timerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(168);
		}
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimer_TimerSetting() {
        return (EReference)getTimer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerSettingType() {
		if (timerSettingTypeEClass == null) {
			timerSettingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(169);
		}
		return timerSettingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerSettingType_BasedOnTimetable() {
        return (EReference)getTimerSettingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerSettingType_ConstantTime() {
        return (EReference)getTimerSettingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerSettingType_LastActivationTimePlus() {
        return (EReference)getTimerSettingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerSettingType_TimerExpression() {
        return (EReference)getTimerSettingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimetable() {
		if (timetableEClass == null) {
			timetableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(170);
		}
		return timetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_Documentation() {
        return (EAttribute)getTimetable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_RecurringTimeInterval() {
        return (EReference)getTimetable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_ExemptionPeriod() {
        return (EReference)getTimetable().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_ExtendedAttributes() {
        return (EReference)getTimetable().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_BeginingOn() {
        return (EAttribute)getTimetable().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_Name() {
        return (EAttribute)getTimetable().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_NumberOfTimesToRepeat() {
        return (EAttribute)getTimetable().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_RepetitionPeriod() {
        return (EAttribute)getTimetable().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimetablesType() {
		if (timetablesTypeEClass == null) {
			timetablesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(171);
		}
		return timetablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetablesType_Timetable() {
        return (EReference)getTimetablesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeValue() {
		if (timeValueEClass == null) {
			timeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(174);
		}
		return timeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeValue_LiteralValue() {
        return (EAttribute)getTimeValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeValue_Distribution() {
        return (EReference)getTimeValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		if (typeDeclarationEClass == null) {
			typeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(175);
		}
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_ComplexDataType() {
        return (EReference)getTypeDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDeclaration_Name() {
        return (EAttribute)getTypeDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformType() {
		if (uniformTypeEClass == null) {
			uniformTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(180);
		}
		return uniformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniformType_Maximum() {
        return (EAttribute)getUniformType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniformType_Minimum() {
        return (EAttribute)getUniformType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(182);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Probability() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightedListType() {
		if (weightedListTypeEClass == null) {
			weightedListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(183);
		}
		return weightedListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeightedListType_Value() {
        return (EReference)getWeightedListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenCostApplicableType() {
		if (whenCostApplicableTypeEClass == null) {
			whenCostApplicableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(184);
		}
		return whenCostApplicableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhenCostApplicableType_Timetable() {
        return (EAttribute)getWhenCostApplicableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasicDataType() {
		if (basicDataTypeEEnum == null) {
			basicDataTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(9);
		}
		return basicDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurrency() {
		if (currencyEEnum == null) {
			currencyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(38);
		}
		return currencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDayOfWeek() {
		if (dayOfWeekEEnum == null) {
			dayOfWeekEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(41);
		}
		return dayOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultipleInstancesMatch() {
		if (multipleInstancesMatchEEnum == null) {
			multipleInstancesMatchEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(97);
		}
		return multipleInstancesMatchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoInstancesMatch() {
		if (noInstancesMatchEEnum == null) {
			noInstancesMatchEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(99);
		}
		return noInstancesMatchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		if (timeUnitEEnum == null) {
			timeUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(172);
		}
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType1() {
		if (typeType1EEnum == null) {
			typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(177);
		}
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAssociatedDataType() {
		if (associatedDataTypeEDataType == null) {
			associatedDataTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(4);
		}
		return associatedDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBasicDataTypeObject() {
		if (basicDataTypeObjectEDataType == null) {
			basicDataTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(10);
		}
		return basicDataTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyObject() {
		if (currencyObjectEDataType == null) {
			currencyObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(39);
		}
		return currencyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDayOfWeekObject() {
		if (dayOfWeekObjectEDataType == null) {
			dayOfWeekObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(42);
		}
		return dayOfWeekObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElementName() {
		if (elementNameEDataType == null) {
			elementNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(48);
		}
		return elementNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstanceOfType() {
		if (instanceOfTypeEDataType == null) {
			instanceOfTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(78);
		}
		return instanceOfTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultipleInstancesMatchObject() {
		if (multipleInstancesMatchObjectEDataType == null) {
			multipleInstancesMatchObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(98);
		}
		return multipleInstancesMatchObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNoInstancesMatchObject() {
		if (noInstancesMatchObjectEDataType == null) {
			noInstancesMatchObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(100);
		}
		return noInstancesMatchObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeDouble() {
		if (nonNegativeDoubleEDataType == null) {
			nonNegativeDoubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(101);
		}
		return nonNegativeDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeDoubleObject() {
		if (nonNegativeDoubleObjectEDataType == null) {
			nonNegativeDoubleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(102);
		}
		return nonNegativeDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParentTemplateType() {
		if (parentTemplateTypeEDataType == null) {
			parentTemplateTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(129);
		}
		return parentTemplateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentageValue() {
		if (percentageValueEDataType == null) {
			percentageValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(130);
		}
		return percentageValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentageValueObject() {
		if (percentageValueObjectEDataType == null) {
			percentageValueObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(131);
		}
		return percentageValueObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPredefinedOrganizationType() {
		if (predefinedOrganizationTypeEDataType == null) {
			predefinedOrganizationTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(135);
		}
		return predefinedOrganizationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPredefinedResourceType() {
		if (predefinedResourceTypeEDataType == null) {
			predefinedResourceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(136);
		}
		return predefinedResourceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitObject() {
		if (timeUnitObjectEDataType == null) {
			timeUnitObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(173);
		}
		return timeUnitObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeType() {
		if (typeTypeEDataType == null) {
			typeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(176);
		}
		return typeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeType2() {
		if (typeType2EDataType == null) {
			typeType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(178);
		}
		return typeType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(179);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnit() {
		if (unitEDataType == null) {
			unitEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Schema1Package.eNS_URI).getEClassifiers().get(181);
		}
		return unitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1Factory getSchema1Factory() {
		return (Schema1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(URI.createURI(url.toString()));
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}
} //Schema1PackageImpl
