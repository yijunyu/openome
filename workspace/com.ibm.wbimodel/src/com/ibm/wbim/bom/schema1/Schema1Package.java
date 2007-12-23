/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.ibm.wbim.bom.schema1.Schema1Factory
 * @model kind="package"
 * @generated
 */
public interface Schema1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schema1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ibm.com/wbim/bomSchema1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schema1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Schema1Package eINSTANCE = com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AdditionalInputTypeImpl <em>Additional Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AdditionalInputTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAdditionalInputType()
	 * @generated
	 */
	int ADDITIONAL_INPUT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Input Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INPUT_TYPE__INPUT_CRITERION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INPUT_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Additional Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INPUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AdditionalOutputTypeImpl <em>Additional Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AdditionalOutputTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAdditionalOutputType()
	 * @generated
	 */
	int ADDITIONAL_OUTPUT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Output Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OUTPUT_TYPE__OUTPUT_CRITERION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OUTPUT_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Additional Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OUTPUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AnnotatedNodeTypeImpl <em>Annotated Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AnnotatedNodeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAnnotatedNodeType()
	 * @generated
	 */
	int ANNOTATED_NODE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_NODE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Annotated Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_NODE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AnnotationImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Annotated Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_NODE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AttributeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RULE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ORDERED = 3;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_READ_ONLY = 4;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = 5;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAXIMUM = 7;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MINIMUM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AttributeValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__LITERAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__EXPRESSION_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Public Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__PUBLIC_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Private Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__PRIVATE_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.AvailabilityImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 6;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__TIMETABLE = 0;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BasedOnTimetableTypeImpl <em>Based On Timetable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BasedOnTimetableTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBasedOnTimetableType()
	 * @generated
	 */
	int BASED_ON_TIMETABLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_TIMETABLE_TYPE__TIMETABLE = 0;

	/**
	 * The number of structural features of the '<em>Based On Timetable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_TIMETABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl <em>Complex Data Type Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getComplexDataTypeInstance()
	 * @generated
	 */
	int COMPLEX_DATA_TYPE_INSTANCE = 23;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_INSTANCE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Complex Data Type Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl <em>Bulk Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResource()
	 * @generated
	 */
	int BULK_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__DOCUMENTATION = COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__ATTRIBUTE_VALUE = COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__EXTENDED_ATTRIBUTES = COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__INSTANCE_OF = COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__NAME = COMPLEX_DATA_TYPE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Bulk Resource Cost Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__BULK_RESOURCE_COST_TYPE = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One Time Cost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__ONE_TIME_COST = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost Per Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__COST_PER_QUANTITY = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost Per Quantity And Time Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Available Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__AVAILABLE_QUANTITY = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__AVAILABILITY = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__QUALIFICATION = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Consumable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE__IS_CONSUMABLE = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Bulk Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_FEATURE_COUNT = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionsTypeImpl <em>Bulk Resource Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourceDefinitionsType()
	 * @generated
	 */
	int BULK_RESOURCE_DEFINITIONS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Bulk Resource Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Bulk Resource Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionTemplatesTypeImpl <em>Bulk Resource Definition Templates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionTemplatesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourceDefinitionTemplatesType()
	 * @generated
	 */
	int BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Bulk Resource Definition Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Bulk Resource Definition Templates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl <em>Bulk Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourceRequirement()
	 * @generated
	 */
	int BULK_RESOURCE_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Resource Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Bulk Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_REQUIREMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED = 3;

	/**
	 * The number of structural features of the '<em>Bulk Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCE_REQUIREMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourcesTypeImpl <em>Bulk Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BulkResourcesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourcesType()
	 * @generated
	 */
	int BULK_RESOURCES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Bulk Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCES_TYPE__BULK_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Bulk Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BusinessItemInstancesTypeImpl <em>Business Item Instances Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BusinessItemInstancesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBusinessItemInstancesType()
	 * @generated
	 */
	int BUSINESS_ITEM_INSTANCES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Business Item Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Business Item Instances Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ITEM_INSTANCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BusinessItemsTypeImpl <em>Business Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BusinessItemsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBusinessItemsType()
	 * @generated
	 */
	int BUSINESS_ITEMS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Business Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ITEMS_TYPE__BUSINESS_ITEM = 0;

	/**
	 * The number of structural features of the '<em>Business Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ITEMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.BusinessItemTemplatesTypeImpl <em>Business Item Templates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.BusinessItemTemplatesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBusinessItemTemplatesType()
	 * @generated
	 */
	int BUSINESS_ITEM_TEMPLATES_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Business Item Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Business Item Templates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ITEM_TEMPLATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InvocationImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 70;

	/**
	 * The feature id for the '<em><b>Input Constant Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__INPUT_CONSTANT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Input Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__INPUT_REPOSITORY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Output Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__OUTPUT_REPOSITORY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Additional Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ADDITIONAL_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Additional Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ADDITIONAL_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Call Synchronously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__CALL_SYNCHRONOUSLY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__NAME = 6;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CallToProcessTypeImpl <em>Call To Process Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CallToProcessTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCallToProcessType()
	 * @generated
	 */
	int CALL_TO_PROCESS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Input Constant Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__INPUT_CONSTANT_VALUE = INVOCATION__INPUT_CONSTANT_VALUE;

	/**
	 * The feature id for the '<em><b>Input Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__INPUT_REPOSITORY_VALUE = INVOCATION__INPUT_REPOSITORY_VALUE;

	/**
	 * The feature id for the '<em><b>Output Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__OUTPUT_REPOSITORY_VALUE = INVOCATION__OUTPUT_REPOSITORY_VALUE;

	/**
	 * The feature id for the '<em><b>Additional Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__ADDITIONAL_INPUT = INVOCATION__ADDITIONAL_INPUT;

	/**
	 * The feature id for the '<em><b>Additional Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__ADDITIONAL_OUTPUT = INVOCATION__ADDITIONAL_OUTPUT;

	/**
	 * The feature id for the '<em><b>Call Synchronously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__CALL_SYNCHRONOUSLY = INVOCATION__CALL_SYNCHRONOUSLY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__NAME = INVOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE__PROCESS = INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call To Process Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_PROCESS_TYPE_FEATURE_COUNT = INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CallToServiceTypeImpl <em>Call To Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CallToServiceTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCallToServiceType()
	 * @generated
	 */
	int CALL_TO_SERVICE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Input Constant Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__INPUT_CONSTANT_VALUE = INVOCATION__INPUT_CONSTANT_VALUE;

	/**
	 * The feature id for the '<em><b>Input Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__INPUT_REPOSITORY_VALUE = INVOCATION__INPUT_REPOSITORY_VALUE;

	/**
	 * The feature id for the '<em><b>Output Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__OUTPUT_REPOSITORY_VALUE = INVOCATION__OUTPUT_REPOSITORY_VALUE;

	/**
	 * The feature id for the '<em><b>Additional Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__ADDITIONAL_INPUT = INVOCATION__ADDITIONAL_INPUT;

	/**
	 * The feature id for the '<em><b>Additional Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__ADDITIONAL_OUTPUT = INVOCATION__ADDITIONAL_OUTPUT;

	/**
	 * The feature id for the '<em><b>Call Synchronously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__CALL_SYNCHRONOUSLY = INVOCATION__CALL_SYNCHRONOUSLY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__NAME = INVOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE__SERVICE = INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call To Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_SERVICE_TYPE_FEATURE_COUNT = INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CallToTaskTypeImpl <em>Call To Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CallToTaskTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCallToTaskType()
	 * @generated
	 */
	int CALL_TO_TASK_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Input Constant Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__INPUT_CONSTANT_VALUE = INVOCATION__INPUT_CONSTANT_VALUE;

	/**
	 * The feature id for the '<em><b>Input Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__INPUT_REPOSITORY_VALUE = INVOCATION__INPUT_REPOSITORY_VALUE;

	/**
	 * The feature id for the '<em><b>Output Repository Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__OUTPUT_REPOSITORY_VALUE = INVOCATION__OUTPUT_REPOSITORY_VALUE;

	/**
	 * The feature id for the '<em><b>Additional Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__ADDITIONAL_INPUT = INVOCATION__ADDITIONAL_INPUT;

	/**
	 * The feature id for the '<em><b>Additional Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__ADDITIONAL_OUTPUT = INVOCATION__ADDITIONAL_OUTPUT;

	/**
	 * The feature id for the '<em><b>Call Synchronously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__CALL_SYNCHRONOUSLY = INVOCATION__CALL_SYNCHRONOUSLY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__NAME = INVOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE__TASK = INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call To Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TO_TASK_TYPE_FEATURE_COUNT = INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CatalogImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 19;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NAME = 2;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CatalogsImpl <em>Catalogs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CatalogsImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCatalogs()
	 * @generated
	 */
	int CATALOGS = 20;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS__CATALOG = 0;

	/**
	 * The number of structural features of the '<em>Catalogs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl <em>Catalogs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCatalogsType()
	 * @generated
	 */
	int CATALOGS_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Data Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_TYPE__DATA_CATALOGS = 0;

	/**
	 * The feature id for the '<em><b>Resource Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_TYPE__RESOURCE_CATALOGS = 1;

	/**
	 * The feature id for the '<em><b>Organization Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_TYPE__ORGANIZATION_CATALOGS = 2;

	/**
	 * The feature id for the '<em><b>Process Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_TYPE__PROCESS_CATALOGS = 3;

	/**
	 * The number of structural features of the '<em>Catalogs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getComplexDataType()
	 * @generated
	 */
	int COMPLEX_DATA_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__RULE = 2;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Parent Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__PARENT_TEMPLATE = 4;

	/**
	 * The number of structural features of the '<em>Complex Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ConnectionImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ConstantTimeTypeImpl <em>Constant Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ConstantTimeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getConstantTimeType()
	 * @generated
	 */
	int CONSTANT_TIME_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TIME_TYPE__TIME = 0;

	/**
	 * The number of structural features of the '<em>Constant Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TIME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ControlActionOutputRefImpl <em>Control Action Output Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ControlActionOutputRefImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getControlActionOutputRef()
	 * @generated
	 */
	int CONTROL_ACTION_OUTPUT_REF = 26;

	/**
	 * The feature id for the '<em><b>Repository Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OUTPUT_REF__NAME = 1;

	/**
	 * The number of structural features of the '<em>Control Action Output Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OUTPUT_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl <em>Correlation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCorrelationType()
	 * @generated
	 */
	int CORRELATION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_TYPE__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Multiple Instances Satisfy Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>No Instances Satisfy Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Correlation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OneTimeCostImpl <em>One Time Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OneTimeCostImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOneTimeCost()
	 * @generated
	 */
	int ONE_TIME_COST = 94;

	/**
	 * The feature id for the '<em><b>Cost Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TIME_COST__COST_VALUE = 0;

	/**
	 * The feature id for the '<em><b>When Cost Applicable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TIME_COST__WHEN_COST_APPLICABLE = 1;

	/**
	 * The number of structural features of the '<em>One Time Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TIME_COST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerQuantityImpl <em>Cost Per Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CostPerQuantityImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerQuantity()
	 * @generated
	 */
	int COST_PER_QUANTITY = 28;

	/**
	 * The feature id for the '<em><b>Cost Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY__COST_VALUE = ONE_TIME_COST__COST_VALUE;

	/**
	 * The feature id for the '<em><b>When Cost Applicable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY__WHEN_COST_APPLICABLE = ONE_TIME_COST__WHEN_COST_APPLICABLE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY__UNIT = ONE_TIME_COST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cost Per Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY_FEATURE_COUNT = ONE_TIME_COST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerQuantityAndTimeUnitImpl <em>Cost Per Quantity And Time Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CostPerQuantityAndTimeUnitImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerQuantityAndTimeUnit()
	 * @generated
	 */
	int COST_PER_QUANTITY_AND_TIME_UNIT = 29;

	/**
	 * The feature id for the '<em><b>Cost Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY_AND_TIME_UNIT__COST_VALUE = COST_PER_QUANTITY__COST_VALUE;

	/**
	 * The feature id for the '<em><b>When Cost Applicable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY_AND_TIME_UNIT__WHEN_COST_APPLICABLE = COST_PER_QUANTITY__WHEN_COST_APPLICABLE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY_AND_TIME_UNIT__UNIT = COST_PER_QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY_AND_TIME_UNIT__TIME_UNIT = COST_PER_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cost Per Quantity And Time Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_QUANTITY_AND_TIME_UNIT_FEATURE_COUNT = COST_PER_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitImpl <em>Cost Per Time Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerTimeUnit()
	 * @generated
	 */
	int COST_PER_TIME_UNIT = 30;

	/**
	 * The feature id for the '<em><b>Cost Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT__COST_VALUE = ONE_TIME_COST__COST_VALUE;

	/**
	 * The feature id for the '<em><b>When Cost Applicable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT__WHEN_COST_APPLICABLE = ONE_TIME_COST__WHEN_COST_APPLICABLE;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT__TIME_UNIT = ONE_TIME_COST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cost Per Time Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT_FEATURE_COUNT = ONE_TIME_COST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CostValueImpl <em>Cost Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CostValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostValue()
	 * @generated
	 */
	int COST_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_VALUE__LITERAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_VALUE__DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_VALUE__CURRENCY = 2;

	/**
	 * The number of structural features of the '<em>Cost Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitValueImpl <em>Cost Per Time Unit Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerTimeUnitValue()
	 * @generated
	 */
	int COST_PER_TIME_UNIT_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT_VALUE__LITERAL_VALUE = COST_VALUE__LITERAL_VALUE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT_VALUE__DISTRIBUTION = COST_VALUE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT_VALUE__CURRENCY = COST_VALUE__CURRENCY;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT_VALUE__TIME_UNIT = COST_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cost Per Time Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PER_TIME_UNIT_VALUE_FEATURE_COUNT = COST_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CostTypeImpl <em>Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CostTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostType()
	 * @generated
	 */
	int COST_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Execution Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__EXECUTION_COST = 0;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__STARTUP_COST = 1;

	/**
	 * The feature id for the '<em><b>Resource Waiting Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__RESOURCE_WAITING_COST = 2;

	/**
	 * The number of structural features of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl <em>Criteria Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCriteriaTemplate()
	 * @generated
	 */
	int CRITERIA_TEMPLATE = 34;

	/**
	 * The feature id for the '<em><b>Manager Of Employee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Manager Of Employee By ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID = 1;

	/**
	 * The feature id for the '<em><b>Person Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__PERSON_SEARCH = 2;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__PERSON_NAME = 3;

	/**
	 * The feature id for the '<em><b>Group Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__GROUP_MEMBERS = 4;

	/**
	 * The feature id for the '<em><b>Group Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__GROUP_SEARCH = 5;

	/**
	 * The feature id for the '<em><b>Organization Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE__ORGANIZATION_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>Criteria Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TEMPLATE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.DataModelImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 35;

	/**
	 * The feature id for the '<em><b>Business Item Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__BUSINESS_ITEM_TEMPLATES = 0;

	/**
	 * The feature id for the '<em><b>Business Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__BUSINESS_ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Business Item Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__BUSINESS_ITEM_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Notification Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NOTIFICATION_TEMPLATES = 3;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NOTIFICATIONS = 4;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.DecisionImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 36;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Input Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INPUT_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Output Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTPUT_BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Is Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__IS_INCLUSIVE = 3;

	/**
	 * The feature id for the '<em><b>Is Simple Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__IS_SIMPLE_DECISION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = 5;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.DefaultValueImpl <em>Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.DefaultValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDefaultValue()
	 * @generated
	 */
	int DEFAULT_VALUE = 37;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__LITERAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__EXPRESSION_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl <em>Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDistributionType()
	 * @generated
	 */
	int DISTRIBUTION_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Exponential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__EXPONENTIAL = 0;

	/**
	 * The feature id for the '<em><b>Gamma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__GAMMA = 1;

	/**
	 * The feature id for the '<em><b>Lognormal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__LOGNORMAL = 2;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__NORMAL = 3;

	/**
	 * The feature id for the '<em><b>Poisson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__POISSON = 4;

	/**
	 * The feature id for the '<em><b>Random List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__RANDOM_LIST = 5;

	/**
	 * The feature id for the '<em><b>Uniform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__UNIFORM = 6;

	/**
	 * The feature id for the '<em><b>Weighted List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__WEIGHTED_LIST = 7;

	/**
	 * The number of structural features of the '<em>Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.DistributionType1Impl <em>Distribution Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.DistributionType1Impl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDistributionType1()
	 * @generated
	 */
	int DISTRIBUTION_TYPE1 = 39;

	/**
	 * The feature id for the '<em><b>Exponential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__EXPONENTIAL = DISTRIBUTION_TYPE__EXPONENTIAL;

	/**
	 * The feature id for the '<em><b>Gamma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__GAMMA = DISTRIBUTION_TYPE__GAMMA;

	/**
	 * The feature id for the '<em><b>Lognormal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__LOGNORMAL = DISTRIBUTION_TYPE__LOGNORMAL;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__NORMAL = DISTRIBUTION_TYPE__NORMAL;

	/**
	 * The feature id for the '<em><b>Poisson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__POISSON = DISTRIBUTION_TYPE__POISSON;

	/**
	 * The feature id for the '<em><b>Random List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__RANDOM_LIST = DISTRIBUTION_TYPE__RANDOM_LIST;

	/**
	 * The feature id for the '<em><b>Uniform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__UNIFORM = DISTRIBUTION_TYPE__UNIFORM;

	/**
	 * The feature id for the '<em><b>Weighted List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__WEIGHTED_LIST = DISTRIBUTION_TYPE__WEIGHTED_LIST;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1__TIME_UNIT = DISTRIBUTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distribution Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE1_FEATURE_COUNT = DISTRIBUTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.DocumentRootImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.EndNodeTypeImpl <em>End Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.EndNodeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getEndNodeType()
	 * @generated
	 */
	int END_NODE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>End Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.EntryPointTypeImpl <em>Entry Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.EntryPointTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getEntryPointType()
	 * @generated
	 */
	int ENTRY_POINT_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Input Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_TYPE__INPUT_CRITERION = 0;

	/**
	 * The number of structural features of the '<em>Entry Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ExemptionPeriodTypeImpl <em>Exemption Period Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ExemptionPeriodTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExemptionPeriodType()
	 * @generated
	 */
	int EXEMPTION_PERIOD_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPTION_PERIOD_TYPE__TIMETABLE = 0;

	/**
	 * The number of structural features of the '<em>Exemption Period Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPTION_PERIOD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ExponentialTypeImpl <em>Exponential Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ExponentialTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExponentialType()
	 * @generated
	 */
	int EXPONENTIAL_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TYPE__MEAN = 0;

	/**
	 * The number of structural features of the '<em>Exponential Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ExpressionImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ExtendedAttributesImpl <em>Extended Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ExtendedAttributesImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExtendedAttributes()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTES = 46;

	/**
	 * The feature id for the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTES__EXTENDED_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Extended Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ExtendedAttributeTypeImpl <em>Extended Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ExtendedAttributeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExtendedAttributeType()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Extended Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl <em>Flow Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getFlowContentType()
	 * @generated
	 */
	int FLOW_CONTENT_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Start Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__START_NODE = 1;

	/**
	 * The feature id for the '<em><b>Stop Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__STOP_NODE = 2;

	/**
	 * The feature id for the '<em><b>End Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__END_NODE = 3;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__TASK = 4;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__DECISION = 5;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__MERGE = 6;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__FORK = 7;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__JOIN = 8;

	/**
	 * The feature id for the '<em><b>Notification Broadcaster</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER = 9;

	/**
	 * The feature id for the '<em><b>Notification Receiver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER = 10;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__OBSERVER = 11;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__TIMER = 12;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__MAP = 13;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__LOOP = 14;

	/**
	 * The feature id for the '<em><b>For Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__FOR_LOOP = 15;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__PROCESS = 16;

	/**
	 * The feature id for the '<em><b>Local Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__LOCAL_REPOSITORY = 17;

	/**
	 * The feature id for the '<em><b>Call To Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__CALL_TO_PROCESS = 18;

	/**
	 * The feature id for the '<em><b>Call To Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__CALL_TO_TASK = 19;

	/**
	 * The feature id for the '<em><b>Call To Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__CALL_TO_SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__CONNECTION = 21;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE__ANNOTATION = 22;

	/**
	 * The number of structural features of the '<em>Flow Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONTENT_TYPE_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ForkImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getFork()
	 * @generated
	 */
	int FORK = 49;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Input Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INPUT_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Output Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUTPUT_BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = 3;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ProcessImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 118;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRECONDITION = 3;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__POSTCONDITION = 4;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ORGANIZATIONS = 5;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OPERATIONAL_DATA = 6;

	/**
	 * The feature id for the '<em><b>Flow Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FLOW_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENDED_ATTRIBUTES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 9;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ForLoopImpl <em>For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ForLoopImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getForLoop()
	 * @generated
	 */
	int FOR_LOOP = 50;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__DESCRIPTION = PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__INPUTS = PROCESS__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__OUTPUTS = PROCESS__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__PRECONDITION = PROCESS__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__POSTCONDITION = PROCESS__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__ORGANIZATIONS = PROCESS__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__OPERATIONAL_DATA = PROCESS__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Flow Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__FLOW_CONTENT = PROCESS__FLOW_CONTENT;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__EXTENDED_ATTRIBUTES = PROCESS__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__LOOP_CONDITION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.GammaTypeImpl <em>Gamma Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.GammaTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGammaType()
	 * @generated
	 */
	int GAMMA_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_TYPE__MEAN = 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_TYPE__STANDARD_DEVIATION = 1;

	/**
	 * The number of structural features of the '<em>Gamma Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.GlobalRepositoryRefImpl <em>Global Repository Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.GlobalRepositoryRefImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGlobalRepositoryRef()
	 * @generated
	 */
	int GLOBAL_REPOSITORY_REF = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_REPOSITORY_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Global Repository Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_REPOSITORY_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl <em>Group Members Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGroupMembersType()
	 * @generated
	 */
	int GROUP_MEMBERS_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERS_TYPE__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Include Subgroups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS = 2;

	/**
	 * The feature id for the '<em><b>Alternative Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1 = 3;

	/**
	 * The feature id for the '<em><b>Alternative Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2 = 4;

	/**
	 * The number of structural features of the '<em>Group Members Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl <em>Group Search Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGroupSearchType()
	 * @generated
	 */
	int GROUP_SEARCH_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Industry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__INDUSTRY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Business Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__BUSINESS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Geographic Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Affiliates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__AFFILIATES = 5;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__DISPLAY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Secretary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__SECRETARY = 7;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__ASSISTANT = 8;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Business Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__BUSINESS_CATEGORY = 10;

	/**
	 * The feature id for the '<em><b>Parent Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE__PARENT_COMPANY = 11;

	/**
	 * The number of structural features of the '<em>Group Search Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SEARCH_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl <em>Individual Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResource()
	 * @generated
	 */
	int INDIVIDUAL_RESOURCE = 55;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__DOCUMENTATION = COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__ATTRIBUTE_VALUE = COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__EXTENDED_ATTRIBUTES = COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__INSTANCE_OF = COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__NAME = COMPLEX_DATA_TYPE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Individual Resource Cost Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One Time Cost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__ONE_TIME_COST = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost Per Time Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__AVAILABILITY = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE__QUALIFICATION = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Individual Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_FEATURE_COUNT = COMPLEX_DATA_TYPE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionsTypeImpl <em>Individual Resource Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourceDefinitionsType()
	 * @generated
	 */
	int INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Individual Resource Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Individual Resource Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionTemplatesTypeImpl <em>Individual Resource Definition Templates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionTemplatesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourceDefinitionTemplatesType()
	 * @generated
	 */
	int INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Individual Resource Definition Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Individual Resource Definition Templates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl <em>Individual Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourceRequirement()
	 * @generated
	 */
	int INDIVIDUAL_RESOURCE_REQUIREMENT = 58;

	/**
	 * The feature id for the '<em><b>Individual Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_REQUIREMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>Individual Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCE_REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourcesTypeImpl <em>Individual Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourcesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourcesType()
	 * @generated
	 */
	int INDIVIDUAL_RESOURCES_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Individual Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Individual Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 60;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CONSTANT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Repository Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REPOSITORY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Associated Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ASSOCIATED_DATA = 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_ORDERED = 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_UNIQUE = 4;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MAXIMUM = 5;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MINIMUM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 7;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputBranchImpl <em>Input Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputBranchImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputBranch()
	 * @generated
	 */
	int INPUT_BRANCH = 61;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRANCH__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRANCH__NAME = 1;

	/**
	 * The number of structural features of the '<em>Input Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputConstantValueImpl <em>Input Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputConstantValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputConstantValue()
	 * @generated
	 */
	int INPUT_CONSTANT_VALUE = 62;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE__LITERAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Public Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Input Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputConstantValueTypeImpl <em>Input Constant Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputConstantValueTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputConstantValueType()
	 * @generated
	 */
	int INPUT_CONSTANT_VALUE_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE_TYPE__LITERAL_VALUE = INPUT_CONSTANT_VALUE__LITERAL_VALUE;

	/**
	 * The feature id for the '<em><b>Public Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE_TYPE__PUBLIC_INSTANCE = INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE_TYPE__INPUT = INPUT_CONSTANT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Constant Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONSTANT_VALUE_TYPE_FEATURE_COUNT = INPUT_CONSTANT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputCriterionImpl <em>Input Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputCriterionImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputCriterion()
	 * @generated
	 */
	int INPUT_CRITERION = 64;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION__CORRELATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Input Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputCriterionRefImpl <em>Input Criterion Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputCriterionRefImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputCriterionRef()
	 * @generated
	 */
	int INPUT_CRITERION_REF = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Input Criterion Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CRITERION_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputRepositoryValueImpl <em>Input Repository Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputRepositoryValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputRepositoryValue()
	 * @generated
	 */
	int INPUT_REPOSITORY_VALUE = 66;

	/**
	 * The feature id for the '<em><b>Local Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Global Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>At Beginning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE__AT_BEGINNING = 2;

	/**
	 * The feature id for the '<em><b>Is Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE__IS_REMOVE = 3;

	/**
	 * The number of structural features of the '<em>Input Repository Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputRepositoryValueTypeImpl <em>Input Repository Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputRepositoryValueTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputRepositoryValueType()
	 * @generated
	 */
	int INPUT_REPOSITORY_VALUE_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Local Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY = INPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Global Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY = INPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY;

	/**
	 * The feature id for the '<em><b>At Beginning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING = INPUT_REPOSITORY_VALUE__AT_BEGINNING;

	/**
	 * The feature id for the '<em><b>Is Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_TYPE__IS_REMOVE = INPUT_REPOSITORY_VALUE__IS_REMOVE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_TYPE__INPUT = INPUT_REPOSITORY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Repository Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPOSITORY_VALUE_TYPE_FEATURE_COUNT = INPUT_REPOSITORY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputsImpl <em>Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputsImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputs()
	 * @generated
	 */
	int INPUTS = 68;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Input Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS__INPUT_CRITERION = 1;

	/**
	 * The number of structural features of the '<em>Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.InputTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.JoinImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 71;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Input Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INPUT_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Output Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTPUT_BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = 3;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LastActivationTimePlusTypeImpl <em>Last Activation Time Plus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LastActivationTimePlusTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLastActivationTimePlusType()
	 * @generated
	 */
	int LAST_ACTIVATION_TIME_PLUS_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_ACTIVATION_TIME_PLUS_TYPE__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Last Activation Time Plus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_ACTIVATION_TIME_PLUS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LocalRepositoryImpl <em>Local Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LocalRepositoryImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocalRepository()
	 * @generated
	 */
	int LOCAL_REPOSITORY = 73;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__IS_ORDERED = 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__IS_UNIQUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Local Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LocalRepositoryRefImpl <em>Local Repository Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LocalRepositoryRefImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocalRepositoryRef()
	 * @generated
	 */
	int LOCAL_REPOSITORY_REF = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Local Repository Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LocationDefinitionsTypeImpl <em>Location Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LocationDefinitionsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationDefinitionsType()
	 * @generated
	 */
	int LOCATION_DEFINITIONS_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Location Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Location Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LocationDefinitionTemplatesTypeImpl <em>Location Definition Templates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LocationDefinitionTemplatesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationDefinitionTemplatesType()
	 * @generated
	 */
	int LOCATION_DEFINITION_TEMPLATES_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Location Definition Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Location Definition Templates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION_TEMPLATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LocationsTypeImpl <em>Locations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LocationsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationsType()
	 * @generated
	 */
	int LOCATIONS_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_TYPE__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Locations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LocationTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LognormalTypeImpl <em>Lognormal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LognormalTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLognormalType()
	 * @generated
	 */
	int LOGNORMAL_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL_TYPE__MEAN = 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL_TYPE__STANDARD_DEVIATION = 1;

	/**
	 * The number of structural features of the '<em>Lognormal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LoopImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 80;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__DESCRIPTION = PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INPUTS = PROCESS__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__OUTPUTS = PROCESS__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__PRECONDITION = PROCESS__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__POSTCONDITION = PROCESS__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ORGANIZATIONS = PROCESS__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__OPERATIONAL_DATA = PROCESS__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Flow Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__FLOW_CONTENT = PROCESS__FLOW_CONTENT;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXTENDED_ATTRIBUTES = PROCESS__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_CONDITION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Condition Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__IS_CONDITION_TESTED_FIRST = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl <em>Loop Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLoopConditionType()
	 * @generated
	 */
	int LOOP_CONDITION_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_TYPE__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_TYPE__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Counter Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_TYPE__COUNTER_INCREMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_TYPE__FINAL_COUNTER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_TYPE__INITIAL_COUNTER = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loop Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_TYPE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeByIDTypeImpl <em>Manager Of Employee By ID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeByIDTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getManagerOfEmployeeByIDType()
	 * @generated
	 */
	int MANAGER_OF_EMPLOYEE_BY_ID_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Manager Of Employee By ID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OF_EMPLOYEE_BY_ID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeTypeImpl <em>Manager Of Employee Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getManagerOfEmployeeType()
	 * @generated
	 */
	int MANAGER_OF_EMPLOYEE_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OF_EMPLOYEE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OF_EMPLOYEE_TYPE__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Manager Of Employee Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OF_EMPLOYEE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TaskImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTask()
	 * @generated
	 */
	int TASK = 144;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRECONDITION = 3;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__POSTCONDITION = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ORGANIZATIONS = 6;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OPERATIONAL_DATA = 7;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXTENDED_ATTRIBUTES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 9;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.MapImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMap()
	 * @generated
	 */
	int MAP = 84;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__PRECONDITION = TASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__POSTCONDITION = TASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ORGANIZATIONS = TASK__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__OPERATIONAL_DATA = TASK__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__EXTENDED_ATTRIBUTES = TASK__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = TASK__NAME;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.MergeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 85;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Input Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__INPUT_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Output Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__OUTPUT_BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ModelTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CATALOGS = 0;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Resource Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RESOURCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Organization Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ORGANIZATION_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PROCESS_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SCHEMA_VERSION = 6;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.MonetaryValueImpl <em>Monetary Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.MonetaryValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMonetaryValue()
	 * @generated
	 */
	int MONETARY_VALUE = 87;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_VALUE__CURRENCY = 1;

	/**
	 * The number of structural features of the '<em>Monetary Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.NormalTypeImpl <em>Normal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.NormalTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNormalType()
	 * @generated
	 */
	int NORMAL_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TYPE__MEAN = 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TYPE__STANDARD_DEVIATION = 1;

	/**
	 * The number of structural features of the '<em>Normal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationBroadcasterImpl <em>Notification Broadcaster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.NotificationBroadcasterImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationBroadcaster()
	 * @generated
	 */
	int NOTIFICATION_BROADCASTER = 89;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__PRECONDITION = TASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__POSTCONDITION = TASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__ORGANIZATIONS = TASK__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__OPERATIONAL_DATA = TASK__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__EXTENDED_ATTRIBUTES = TASK__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__NOTIFICATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER__SCOPE = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification Broadcaster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_BROADCASTER_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationReceiverImpl <em>Notification Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.NotificationReceiverImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationReceiver()
	 * @generated
	 */
	int NOTIFICATION_RECEIVER = 90;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__PRECONDITION = TASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__POSTCONDITION = TASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__ORGANIZATIONS = TASK__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__OPERATIONAL_DATA = TASK__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__EXTENDED_ATTRIBUTES = TASK__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Notification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__NOTIFICATION_FILTER = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER__NOTIFICATION = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RECEIVER_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationsTypeImpl <em>Notifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.NotificationsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationsType()
	 * @generated
	 */
	int NOTIFICATIONS_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_TYPE__NOTIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Notifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationTemplatesTypeImpl <em>Notification Templates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.NotificationTemplatesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationTemplatesType()
	 * @generated
	 */
	int NOTIFICATION_TEMPLATES_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Notification Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Notification Templates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TEMPLATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ObserverImpl <em>Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ObserverImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getObserver()
	 * @generated
	 */
	int OBSERVER = 93;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__PRECONDITION = TASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__POSTCONDITION = TASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__ORGANIZATIONS = TASK__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__OPERATIONAL_DATA = TASK__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__EXTENDED_ATTRIBUTES = TASK__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Observation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__OBSERVATION_EXPRESSION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Observe Continuously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__IS_OBSERVE_CONTINUOUSLY = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OperationalDataImpl <em>Operational Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OperationalDataImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOperationalData()
	 * @generated
	 */
	int OPERATIONAL_DATA = 95;

	/**
	 * The feature id for the '<em><b>Time Estimation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_DATA__TIME_ESTIMATION = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_DATA__COST = 1;

	/**
	 * The feature id for the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_DATA__REVENUE = 2;

	/**
	 * The number of structural features of the '<em>Operational Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionsTypeImpl <em>Organization Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationDefinitionsType()
	 * @generated
	 */
	int ORGANIZATION_DEFINITIONS_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Organization Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Organization Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionTemplatesTypeImpl <em>Organization Definition Templates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionTemplatesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationDefinitionTemplatesType()
	 * @generated
	 */
	int ORGANIZATION_DEFINITION_TEMPLATES_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Organization Definition Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Organization Definition Templates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_DEFINITION_TEMPLATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationManagerTypeImpl <em>Organization Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationManagerTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationManagerType()
	 * @generated
	 */
	int ORGANIZATION_MANAGER_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MANAGER_TYPE__ORGANIZATION = 0;

	/**
	 * The number of structural features of the '<em>Organization Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MANAGER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl <em>Organization Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationModel()
	 * @generated
	 */
	int ORGANIZATION_MODEL = 99;

	/**
	 * The feature id for the '<em><b>Organization Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES = 0;

	/**
	 * The feature id for the '<em><b>Organization Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Organization Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL__ORGANIZATION_UNITS = 2;

	/**
	 * The feature id for the '<em><b>Location Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES = 3;

	/**
	 * The feature id for the '<em><b>Location Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL__LOCATION_DEFINITIONS = 4;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL__LOCATIONS = 5;

	/**
	 * The number of structural features of the '<em>Organization Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationsImpl <em>Organizations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationsImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizations()
	 * @generated
	 */
	int ORGANIZATIONS = 100;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS__ORGANIZATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Organizations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationUnitsTypeImpl <em>Organization Units Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationUnitsTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationUnitsType()
	 * @generated
	 */
	int ORGANIZATION_UNITS_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT = 0;

	/**
	 * The number of structural features of the '<em>Organization Units Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNITS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationUnitTypeImpl <em>Organization Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OrganizationUnitTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationUnitType()
	 * @generated
	 */
	int ORGANIZATION_UNIT_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Organization Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 103;

	/**
	 * The feature id for the '<em><b>Repository Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__REPOSITORY_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Associated Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ASSOCIATED_DATA = 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_ORDERED = 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_UNIQUE = 3;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MAXIMUM = 4;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MINIMUM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 6;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputBranchImpl <em>Output Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputBranchImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputBranch()
	 * @generated
	 */
	int OUTPUT_BRANCH = 104;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH__NAME = 1;

	/**
	 * The number of structural features of the '<em>Output Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputBranchTypeImpl <em>Output Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputBranchTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputBranchType()
	 * @generated
	 */
	int OUTPUT_BRANCH_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH_TYPE__OUTPUT = OUTPUT_BRANCH__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH_TYPE__NAME = OUTPUT_BRANCH__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH_TYPE__CONDITION = OUTPUT_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA = OUTPUT_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRANCH_TYPE_FEATURE_COUNT = OUTPUT_BRANCH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl <em>Output Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputCriterion()
	 * @generated
	 */
	int OUTPUT_CRITERION = 106;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Related Input Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION__RELATED_INPUT_CRITERIA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Output Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionRefImpl <em>Output Criterion Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputCriterionRefImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputCriterionRef()
	 * @generated
	 */
	int OUTPUT_CRITERION_REF = 107;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Output Criterion Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CRITERION_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputPathOperationalDataImpl <em>Output Path Operational Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputPathOperationalDataImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputPathOperationalData()
	 * @generated
	 */
	int OUTPUT_PATH_OPERATIONAL_DATA = 108;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATH_OPERATIONAL_DATA__PROBABILITY = 0;

	/**
	 * The number of structural features of the '<em>Output Path Operational Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATH_OPERATIONAL_DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputPathProbabilityValueImpl <em>Output Path Probability Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputPathProbabilityValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputPathProbabilityValue()
	 * @generated
	 */
	int OUTPUT_PATH_PROBABILITY_VALUE = 109;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Path Probability Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATH_PROBABILITY_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputRefImpl <em>Output Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputRefImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputRef()
	 * @generated
	 */
	int OUTPUT_REF = 110;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Output Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl <em>Output Repository Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputRepositoryValue()
	 * @generated
	 */
	int OUTPUT_REPOSITORY_VALUE = 111;

	/**
	 * The feature id for the '<em><b>Local Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Global Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>At Beginning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE__AT_BEGINNING = 2;

	/**
	 * The feature id for the '<em><b>Is Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE__IS_INSERT = 3;

	/**
	 * The number of structural features of the '<em>Output Repository Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueTypeImpl <em>Output Repository Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputRepositoryValueType()
	 * @generated
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE = 112;

	/**
	 * The feature id for the '<em><b>Local Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY = OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Global Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY = OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY;

	/**
	 * The feature id for the '<em><b>At Beginning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING = OUTPUT_REPOSITORY_VALUE__AT_BEGINNING;

	/**
	 * The feature id for the '<em><b>Is Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE__IS_INSERT = OUTPUT_REPOSITORY_VALUE__IS_INSERT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT = OUTPUT_REPOSITORY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Repository Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPOSITORY_VALUE_TYPE_FEATURE_COUNT = OUTPUT_REPOSITORY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.OutputsImpl <em>Outputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.OutputsImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputs()
	 * @generated
	 */
	int OUTPUTS = 113;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Output Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS__OUTPUT_CRITERION = 1;

	/**
	 * The number of structural features of the '<em>Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPersonNameType()
	 * @generated
	 */
	int PERSON_NAME_TYPE = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alternative Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ALTERNATIVE_NAME1 = 1;

	/**
	 * The feature id for the '<em><b>Alternative Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ALTERNATIVE_NAME2 = 2;

	/**
	 * The number of structural features of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl <em>Person Search Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPersonSearchType()
	 * @generated
	 */
	int PERSON_SEARCH_TYPE = 115;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__FIRST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__MIDDLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__COMPANY = 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__DISPLAY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Secretary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__SECRETARY = 8;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__ASSISTANT = 9;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__DEPARTMENT = 11;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__EMPLOYEE_ID = 12;

	/**
	 * The feature id for the '<em><b>Tax Payer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__TAX_PAYER_ID = 13;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__PHONE = 14;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__FAX = 15;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__GENDER = 16;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__TIME_ZONE = 17;

	/**
	 * The feature id for the '<em><b>Preferred Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE = 18;

	/**
	 * The number of structural features of the '<em>Person Search Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SEARCH_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.PoissonTypeImpl <em>Poisson Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.PoissonTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPoissonType()
	 * @generated
	 */
	int POISSON_TYPE = 116;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_TYPE__MEAN = 0;

	/**
	 * The number of structural features of the '<em>Poisson Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.PrivateInstanceImpl <em>Private Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.PrivateInstanceImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPrivateInstance()
	 * @generated
	 */
	int PRIVATE_INSTANCE = 117;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSTANCE__ATTRIBUTE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSTANCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Private Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ProcessesTypeImpl <em>Processes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ProcessesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getProcessesType()
	 * @generated
	 */
	int PROCESSES_TYPE = 119;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES_TYPE__PROCESS = 0;

	/**
	 * The number of structural features of the '<em>Processes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ProcessModelImpl <em>Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ProcessModelImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getProcessModel()
	 * @generated
	 */
	int PROCESS_MODEL = 120;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__PROCESSES = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__REPOSITORIES = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.PublicInstanceImpl <em>Public Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.PublicInstanceImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPublicInstance()
	 * @generated
	 */
	int PUBLIC_INSTANCE = 121;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INSTANCE__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Public Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.QualificationImpl <em>Qualification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.QualificationImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getQualification()
	 * @generated
	 */
	int QUALIFICATION = 122;

	/**
	 * The feature id for the '<em><b>Scope Dimension Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__SCOPE_DIMENSION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.QuantityImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 123;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RandomListTypeImpl <em>Random List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RandomListTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRandomListType()
	 * @generated
	 */
	int RANDOM_LIST_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_LIST_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Random List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl <em>Recurring Time Interval Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRecurringTimeIntervalType()
	 * @generated
	 */
	int RECURRING_TIME_INTERVAL_TYPE = 125;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_TIME_INTERVAL_TYPE__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>Start Day Of Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_TIME_INTERVAL_TYPE__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_TIME_INTERVAL_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Recurring Time Interval Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_TIME_INTERVAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RelatedInputCriteriaTypeImpl <em>Related Input Criteria Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RelatedInputCriteriaTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRelatedInputCriteriaType()
	 * @generated
	 */
	int RELATED_INPUT_CRITERIA_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Input Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION = 0;

	/**
	 * The number of structural features of the '<em>Related Input Criteria Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_INPUT_CRITERIA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RepositoriesTypeImpl <em>Repositories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RepositoriesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRepositoriesType()
	 * @generated
	 */
	int REPOSITORIES_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIES_TYPE__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Repositories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RepositoryImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 128;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DEFAULT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Computed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPUTED_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CAPACITY = 3;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IS_ORDERED = 4;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IS_READ_ONLY = 5;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IS_UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl <em>Repository Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRepositoryDataValue()
	 * @generated
	 */
	int REPOSITORY_DATA_VALUE = 129;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DATA_VALUE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DATA_VALUE__LITERAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DATA_VALUE__EXPRESSION_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Public Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Private Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE = 4;

	/**
	 * The number of structural features of the '<em>Repository Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DATA_VALUE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl <em>Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ResourceModelImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getResourceModel()
	 * @generated
	 */
	int RESOURCE_MODEL = 130;

	/**
	 * The feature id for the '<em><b>Individual Resource Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES = 0;

	/**
	 * The feature id for the '<em><b>Individual Resource Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Bulk Resource Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES = 2;

	/**
	 * The feature id for the '<em><b>Bulk Resource Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Individual Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__INDIVIDUAL_RESOURCES = 4;

	/**
	 * The feature id for the '<em><b>Bulk Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__BULK_RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__ROLES = 6;

	/**
	 * The feature id for the '<em><b>Timetables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__TIMETABLES = 7;

	/**
	 * The number of structural features of the '<em>Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ResourcesImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 131;

	/**
	 * The feature id for the '<em><b>Role Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__ROLE_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Individual Resource Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Bulk Resource Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__BULK_RESOURCE_REQUIREMENT = 2;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RoleImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 132;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Scope Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SCOPE_DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Individual Resource Cost Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INDIVIDUAL_RESOURCE_COST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>One Time Cost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ONE_TIME_COST = 3;

	/**
	 * The feature id for the '<em><b>Cost Per Time Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COST_PER_TIME_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__AVAILABILITY = 5;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EXTENDED_ATTRIBUTES = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl <em>Role Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRoleRequirement()
	 * @generated
	 */
	int ROLE_REQUIREMENT = 133;

	/**
	 * The feature id for the '<em><b>Resource Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENT__RESOURCE_QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENT__ROLE = 2;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENT__TIME_REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENT__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Role Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.RolesTypeImpl <em>Roles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.RolesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRolesType()
	 * @generated
	 */
	int ROLES_TYPE = 134;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_TYPE__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Roles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ScopeDimensionTypeImpl <em>Scope Dimension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ScopeDimensionTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getScopeDimensionType()
	 * @generated
	 */
	int SCOPE_DIMENSION_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DIMENSION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DIMENSION_TYPE__VALUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Scope Dimension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DIMENSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ScopeDimensionValueImpl <em>Scope Dimension Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ScopeDimensionValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getScopeDimensionValue()
	 * @generated
	 */
	int SCOPE_DIMENSION_VALUE = 136;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DIMENSION_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DIMENSION_VALUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Scope Dimension Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DIMENSION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ServiceImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 137;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRECONDITION = TASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__POSTCONDITION = TASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ORGANIZATIONS = TASK__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATIONAL_DATA = TASK__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXTENDED_ATTRIBUTES = TASK__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = TASK__NAME;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ServicesTypeImpl <em>Services Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ServicesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getServicesType()
	 * @generated
	 */
	int SERVICES_TYPE = 138;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Services Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.SourceTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 139;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__CONTACT_POINT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__NODE = 1;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl <em>Start Day Of Week Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getStartDayOfWeekType()
	 * @generated
	 */
	int START_DAY_OF_WEEK_TYPE = 140;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DAY_OF_WEEK_TYPE__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DAY_OF_WEEK_TYPE__WEEK_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Start Day Of Week Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DAY_OF_WEEK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.StartNodeTypeImpl <em>Start Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.StartNodeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getStartNodeType()
	 * @generated
	 */
	int START_NODE_TYPE = 141;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Start Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.StopNodeTypeImpl <em>Stop Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.StopNodeTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getStopNodeType()
	 * @generated
	 */
	int STOP_NODE_TYPE = 142;

	/**
	 * The feature id for the '<em><b>Associated Output Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Stop Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TargetTypeImpl <em>Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TargetTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 143;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__CONTACT_POINT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__NODE = 1;

	/**
	 * The number of structural features of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TaskIndividualResourceRequirementImpl <em>Task Individual Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TaskIndividualResourceRequirementImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTaskIndividualResourceRequirement()
	 * @generated
	 */
	int TASK_INDIVIDUAL_RESOURCE_REQUIREMENT = 145;

	/**
	 * The feature id for the '<em><b>Individual Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE = INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__NAME = INDIVIDUAL_RESOURCE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED = INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA = INDIVIDUAL_RESOURCE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Individual Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INDIVIDUAL_RESOURCE_REQUIREMENT_FEATURE_COUNT = INDIVIDUAL_RESOURCE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TasksTypeImpl <em>Tasks Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TasksTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTasksType()
	 * @generated
	 */
	int TASKS_TYPE = 146;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE__TASK = 0;

	/**
	 * The number of structural features of the '<em>Tasks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TimeEstimationTypeImpl <em>Time Estimation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TimeEstimationTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeEstimationType()
	 * @generated
	 */
	int TIME_ESTIMATION_TYPE = 147;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ESTIMATION_TYPE__PROCESSING_TIME = 0;

	/**
	 * The feature id for the '<em><b>Max Resource Waiting Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME = 1;

	/**
	 * The number of structural features of the '<em>Time Estimation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ESTIMATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TimerImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 148;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__PRECONDITION = TASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__POSTCONDITION = TASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__ORGANIZATIONS = TASK__ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__OPERATIONAL_DATA = TASK__OPERATIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__EXTENDED_ATTRIBUTES = TASK__EXTENDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Timer Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TIMER_SETTING = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl <em>Timer Setting Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimerSettingType()
	 * @generated
	 */
	int TIMER_SETTING_TYPE = 149;

	/**
	 * The feature id for the '<em><b>Based On Timetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SETTING_TYPE__BASED_ON_TIMETABLE = 0;

	/**
	 * The feature id for the '<em><b>Constant Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SETTING_TYPE__CONSTANT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Last Activation Time Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS = 2;

	/**
	 * The feature id for the '<em><b>Timer Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SETTING_TYPE__TIMER_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Timer Setting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SETTING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TimetableImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 150;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Recurring Time Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__RECURRING_TIME_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Exemption Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__EXEMPTION_PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__EXTENDED_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Begining On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__BEGINING_ON = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Number Of Times To Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT = 6;

	/**
	 * The feature id for the '<em><b>Repetition Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__REPETITION_PERIOD = 7;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TimetablesTypeImpl <em>Timetables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TimetablesTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimetablesType()
	 * @generated
	 */
	int TIMETABLES_TYPE = 151;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLES_TYPE__TIMETABLE = 0;

	/**
	 * The number of structural features of the '<em>Timetables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TimeValueImpl <em>Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TimeValueImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeValue()
	 * @generated
	 */
	int TIME_VALUE = 152;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__LITERAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__DISTRIBUTION = 1;

	/**
	 * The number of structural features of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.TypeDeclarationImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 153;

	/**
	 * The feature id for the '<em><b>Complex Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__COMPLEX_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.UniformTypeImpl <em>Uniform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.UniformTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getUniformType()
	 * @generated
	 */
	int UNIFORM_TYPE = 154;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TYPE__MAXIMUM = 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TYPE__MINIMUM = 1;

	/**
	 * The number of structural features of the '<em>Uniform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.ValueTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 155;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.WeightedListTypeImpl <em>Weighted List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.WeightedListTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getWeightedListType()
	 * @generated
	 */
	int WEIGHTED_LIST_TYPE = 156;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_LIST_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Weighted List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.impl.WhenCostApplicableTypeImpl <em>When Cost Applicable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.WhenCostApplicableTypeImpl
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getWhenCostApplicableType()
	 * @generated
	 */
	int WHEN_COST_APPLICABLE_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COST_APPLICABLE_TYPE__TIMETABLE = 0;

	/**
	 * The number of structural features of the '<em>When Cost Applicable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COST_APPLICABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.BasicDataType <em>Basic Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.BasicDataType
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBasicDataType()
	 * @generated
	 */
	int BASIC_DATA_TYPE = 158;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.Currency
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 159;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.DayOfWeek
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 160;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.MultipleInstancesMatch <em>Multiple Instances Match</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMultipleInstancesMatch()
	 * @generated
	 */
	int MULTIPLE_INSTANCES_MATCH = 161;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.NoInstancesMatch <em>No Instances Match</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNoInstancesMatch()
	 * @generated
	 */
	int NO_INSTANCES_MATCH = 162;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.TimeUnit
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 163;

	/**
	 * The meta object id for the '{@link com.ibm.wbim.bom.schema1.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.TypeType1
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 164;

	/**
	 * The meta object id for the '<em>Associated Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAssociatedDataType()
	 * @generated
	 */
	int ASSOCIATED_DATA_TYPE = 165;

	/**
	 * The meta object id for the '<em>Basic Data Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.BasicDataType
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBasicDataTypeObject()
	 * @generated
	 */
	int BASIC_DATA_TYPE_OBJECT = 166;

	/**
	 * The meta object id for the '<em>Currency Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.Currency
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCurrencyObject()
	 * @generated
	 */
	int CURRENCY_OBJECT = 167;

	/**
	 * The meta object id for the '<em>Day Of Week Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.DayOfWeek
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDayOfWeekObject()
	 * @generated
	 */
	int DAY_OF_WEEK_OBJECT = 168;

	/**
	 * The meta object id for the '<em>Element Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getElementName()
	 * @generated
	 */
	int ELEMENT_NAME = 169;

	/**
	 * The meta object id for the '<em>Instance Of Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInstanceOfType()
	 * @generated
	 */
	int INSTANCE_OF_TYPE = 170;

	/**
	 * The meta object id for the '<em>Multiple Instances Match Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMultipleInstancesMatchObject()
	 * @generated
	 */
	int MULTIPLE_INSTANCES_MATCH_OBJECT = 171;

	/**
	 * The meta object id for the '<em>No Instances Match Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNoInstancesMatchObject()
	 * @generated
	 */
	int NO_INSTANCES_MATCH_OBJECT = 172;

	/**
	 * The meta object id for the '<em>Non Negative Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNonNegativeDouble()
	 * @generated
	 */
	int NON_NEGATIVE_DOUBLE = 173;

	/**
	 * The meta object id for the '<em>Non Negative Double Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNonNegativeDoubleObject()
	 * @generated
	 */
	int NON_NEGATIVE_DOUBLE_OBJECT = 174;

	/**
	 * The meta object id for the '<em>Parent Template Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getParentTemplateType()
	 * @generated
	 */
	int PARENT_TEMPLATE_TYPE = 175;

	/**
	 * The meta object id for the '<em>Percentage Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPercentageValue()
	 * @generated
	 */
	int PERCENTAGE_VALUE = 176;

	/**
	 * The meta object id for the '<em>Percentage Value Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPercentageValueObject()
	 * @generated
	 */
	int PERCENTAGE_VALUE_OBJECT = 177;

	/**
	 * The meta object id for the '<em>Predefined Organization Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPredefinedOrganizationType()
	 * @generated
	 */
	int PREDEFINED_ORGANIZATION_TYPE = 178;

	/**
	 * The meta object id for the '<em>Predefined Resource Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPredefinedResourceType()
	 * @generated
	 */
	int PREDEFINED_RESOURCE_TYPE = 179;

	/**
	 * The meta object id for the '<em>Time Unit Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.TimeUnit
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeUnitObject()
	 * @generated
	 */
	int TIME_UNIT_OBJECT = 180;

	/**
	 * The meta object id for the '<em>Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 181;

	/**
	 * The meta object id for the '<em>Type Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeType2()
	 * @generated
	 */
	int TYPE_TYPE2 = 182;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.wbim.bom.schema1.TypeType1
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 183;

	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 184;


	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.AdditionalInputType <em>Additional Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Input Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.AdditionalInputType
	 * @generated
	 */
	EClass getAdditionalInputType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.AdditionalInputType#getInputCriterion <em>Input Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.AdditionalInputType#getInputCriterion()
	 * @see #getAdditionalInputType()
	 * @generated
	 */
	EReference getAdditionalInputType_InputCriterion();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.AdditionalInputType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.AdditionalInputType#getName()
	 * @see #getAdditionalInputType()
	 * @generated
	 */
	EAttribute getAdditionalInputType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.AdditionalOutputType <em>Additional Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Output Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.AdditionalOutputType
	 * @generated
	 */
	EClass getAdditionalOutputType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.AdditionalOutputType#getOutputCriterion <em>Output Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.AdditionalOutputType#getOutputCriterion()
	 * @see #getAdditionalOutputType()
	 * @generated
	 */
	EReference getAdditionalOutputType_OutputCriterion();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.AdditionalOutputType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.AdditionalOutputType#getName()
	 * @see #getAdditionalOutputType()
	 * @generated
	 */
	EAttribute getAdditionalOutputType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.AnnotatedNodeType <em>Annotated Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Node Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.AnnotatedNodeType
	 * @generated
	 */
	EClass getAnnotatedNodeType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.AnnotatedNodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.AnnotatedNodeType#getName()
	 * @see #getAnnotatedNodeType()
	 * @generated
	 */
	EAttribute getAnnotatedNodeType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.ibm.wbim.bom.schema1.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Annotation#getAnnotationText <em>Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Text</em>'.
	 * @see com.ibm.wbim.bom.schema1.Annotation#getAnnotationText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_AnnotationText();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Annotation#getAnnotatedNode <em>Annotated Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotated Node</em>'.
	 * @see com.ibm.wbim.bom.schema1.Annotation#getAnnotatedNode()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotatedNode();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Attribute#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getRule()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#isIsOrdered()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#isIsReadOnly()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#isIsStatic()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#isIsUnique()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getMaximum()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getMinimum()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.AttributeValue#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue#getGroup()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Group();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.AttributeValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue#getLiteralValue()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_LiteralValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.AttributeValue#getExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue#getExpressionValue()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_ExpressionValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.AttributeValue#getPublicInstance <em>Public Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue#getPublicInstance()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_PublicInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.AttributeValue#getPrivateInstance <em>Private Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue#getPrivateInstance()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_PrivateInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.AttributeValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see com.ibm.wbim.bom.schema1.AttributeValue#getAttribute()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Attribute();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see com.ibm.wbim.bom.schema1.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Availability#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.Availability#getTimetable()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Timetable();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BasedOnTimetableType <em>Based On Timetable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Based On Timetable Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BasedOnTimetableType
	 * @generated
	 */
	EClass getBasedOnTimetableType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.BasedOnTimetableType#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.BasedOnTimetableType#getTimetable()
	 * @see #getBasedOnTimetableType()
	 * @generated
	 */
	EAttribute getBasedOnTimetableType_Timetable();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BulkResource <em>Bulk Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulk Resource</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource
	 * @generated
	 */
	EClass getBulkResource();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.BulkResource#getBulkResourceCostType <em>Bulk Resource Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bulk Resource Cost Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getBulkResourceCostType()
	 * @see #getBulkResource()
	 * @generated
	 */
	EAttribute getBulkResource_BulkResourceCostType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResource#getOneTimeCost <em>One Time Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Time Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getOneTimeCost()
	 * @see #getBulkResource()
	 * @generated
	 */
	EReference getBulkResource_OneTimeCost();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResource#getCostPerQuantity <em>Cost Per Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cost Per Quantity</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getCostPerQuantity()
	 * @see #getBulkResource()
	 * @generated
	 */
	EReference getBulkResource_CostPerQuantity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResource#getCostPerQuantityAndTimeUnit <em>Cost Per Quantity And Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cost Per Quantity And Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getCostPerQuantityAndTimeUnit()
	 * @see #getBulkResource()
	 * @generated
	 */
	EReference getBulkResource_CostPerQuantityAndTimeUnit();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.BulkResource#getAvailableQuantity <em>Available Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Quantity</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getAvailableQuantity()
	 * @see #getBulkResource()
	 * @generated
	 */
	EReference getBulkResource_AvailableQuantity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResource#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availability</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getAvailability()
	 * @see #getBulkResource()
	 * @generated
	 */
	EReference getBulkResource_Availability();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResource#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualification</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#getQualification()
	 * @see #getBulkResource()
	 * @generated
	 */
	EReference getBulkResource_Qualification();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.BulkResource#isIsConsumable <em>Is Consumable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Consumable</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResource#isIsConsumable()
	 * @see #getBulkResource()
	 * @generated
	 */
	EAttribute getBulkResource_IsConsumable();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType <em>Bulk Resource Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulk Resource Definitions Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType
	 * @generated
	 */
	EClass getBulkResourceDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType#getBulkResourceDefinition <em>Bulk Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bulk Resource Definition</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceDefinitionsType#getBulkResourceDefinition()
	 * @see #getBulkResourceDefinitionsType()
	 * @generated
	 */
	EReference getBulkResourceDefinitionsType_BulkResourceDefinition();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType <em>Bulk Resource Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulk Resource Definition Templates Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType
	 * @generated
	 */
	EClass getBulkResourceDefinitionTemplatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType#getBulkResourceDefinitionTemplate <em>Bulk Resource Definition Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bulk Resource Definition Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceDefinitionTemplatesType#getBulkResourceDefinitionTemplate()
	 * @see #getBulkResourceDefinitionTemplatesType()
	 * @generated
	 */
	EReference getBulkResourceDefinitionTemplatesType_BulkResourceDefinitionTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement <em>Bulk Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulk Resource Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceRequirement
	 * @generated
	 */
	EClass getBulkResourceRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getResourceQuantity <em>Resource Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Quantity</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceRequirement#getResourceQuantity()
	 * @see #getBulkResourceRequirement()
	 * @generated
	 */
	EReference getBulkResourceRequirement_ResourceQuantity();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getBulkResource <em>Bulk Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulk Resource</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceRequirement#getBulkResource()
	 * @see #getBulkResourceRequirement()
	 * @generated
	 */
	EAttribute getBulkResourceRequirement_BulkResource();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceRequirement#getName()
	 * @see #getBulkResourceRequirement()
	 * @generated
	 */
	EAttribute getBulkResourceRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.BulkResourceRequirement#getTimeRequired <em>Time Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Required</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourceRequirement#getTimeRequired()
	 * @see #getBulkResourceRequirement()
	 * @generated
	 */
	EAttribute getBulkResourceRequirement_TimeRequired();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BulkResourcesType <em>Bulk Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulk Resources Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourcesType
	 * @generated
	 */
	EClass getBulkResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BulkResourcesType#getBulkResource <em>Bulk Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bulk Resource</em>'.
	 * @see com.ibm.wbim.bom.schema1.BulkResourcesType#getBulkResource()
	 * @see #getBulkResourcesType()
	 * @generated
	 */
	EReference getBulkResourcesType_BulkResource();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BusinessItemInstancesType <em>Business Item Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Item Instances Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemInstancesType
	 * @generated
	 */
	EClass getBusinessItemInstancesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BusinessItemInstancesType#getBusinessItemInstance <em>Business Item Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Item Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemInstancesType#getBusinessItemInstance()
	 * @see #getBusinessItemInstancesType()
	 * @generated
	 */
	EReference getBusinessItemInstancesType_BusinessItemInstance();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BusinessItemsType <em>Business Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Items Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemsType
	 * @generated
	 */
	EClass getBusinessItemsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BusinessItemsType#getBusinessItem <em>Business Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Item</em>'.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemsType#getBusinessItem()
	 * @see #getBusinessItemsType()
	 * @generated
	 */
	EReference getBusinessItemsType_BusinessItem();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.BusinessItemTemplatesType <em>Business Item Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Item Templates Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemTemplatesType
	 * @generated
	 */
	EClass getBusinessItemTemplatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.BusinessItemTemplatesType#getBusinessItemTemplate <em>Business Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Item Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.BusinessItemTemplatesType#getBusinessItemTemplate()
	 * @see #getBusinessItemTemplatesType()
	 * @generated
	 */
	EReference getBusinessItemTemplatesType_BusinessItemTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CallToProcessType <em>Call To Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call To Process Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.CallToProcessType
	 * @generated
	 */
	EClass getCallToProcessType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CallToProcessType#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see com.ibm.wbim.bom.schema1.CallToProcessType#getProcess()
	 * @see #getCallToProcessType()
	 * @generated
	 */
	EAttribute getCallToProcessType_Process();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CallToServiceType <em>Call To Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call To Service Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.CallToServiceType
	 * @generated
	 */
	EClass getCallToServiceType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CallToServiceType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see com.ibm.wbim.bom.schema1.CallToServiceType#getService()
	 * @see #getCallToServiceType()
	 * @generated
	 */
	EAttribute getCallToServiceType_Service();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CallToTaskType <em>Call To Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call To Task Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.CallToTaskType
	 * @generated
	 */
	EClass getCallToTaskType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CallToTaskType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see com.ibm.wbim.bom.schema1.CallToTaskType#getTask()
	 * @see #getCallToTaskType()
	 * @generated
	 */
	EAttribute getCallToTaskType_Task();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see com.ibm.wbim.bom.schema1.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Catalog#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see com.ibm.wbim.bom.schema1.Catalog#getCatalog()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Catalog#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.ibm.wbim.bom.schema1.Catalog#getId()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Catalog#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Catalog#getName()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Catalogs <em>Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Catalogs
	 * @generated
	 */
	EClass getCatalogs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Catalogs#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see com.ibm.wbim.bom.schema1.Catalogs#getCatalog()
	 * @see #getCatalogs()
	 * @generated
	 */
	EReference getCatalogs_Catalog();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CatalogsType <em>Catalogs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogs Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.CatalogsType
	 * @generated
	 */
	EClass getCatalogsType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CatalogsType#getDataCatalogs <em>Data Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Catalogs</em>'.
	 * @see com.ibm.wbim.bom.schema1.CatalogsType#getDataCatalogs()
	 * @see #getCatalogsType()
	 * @generated
	 */
	EReference getCatalogsType_DataCatalogs();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CatalogsType#getResourceCatalogs <em>Resource Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Catalogs</em>'.
	 * @see com.ibm.wbim.bom.schema1.CatalogsType#getResourceCatalogs()
	 * @see #getCatalogsType()
	 * @generated
	 */
	EReference getCatalogsType_ResourceCatalogs();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CatalogsType#getOrganizationCatalogs <em>Organization Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Catalogs</em>'.
	 * @see com.ibm.wbim.bom.schema1.CatalogsType#getOrganizationCatalogs()
	 * @see #getCatalogsType()
	 * @generated
	 */
	EReference getCatalogsType_OrganizationCatalogs();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CatalogsType#getProcessCatalogs <em>Process Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Catalogs</em>'.
	 * @see com.ibm.wbim.bom.schema1.CatalogsType#getProcessCatalogs()
	 * @see #getCatalogsType()
	 * @generated
	 */
	EReference getCatalogsType_ProcessCatalogs();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Data Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType
	 * @generated
	 */
	EClass getComplexDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType#getDocumentation()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EAttribute getComplexDataType_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType#getAttribute()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EReference getComplexDataType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType#getRule()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EReference getComplexDataType_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType#getExtendedAttributes()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EReference getComplexDataType_ExtendedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ComplexDataType#getParentTemplate <em>Parent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataType#getParentTemplate()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EAttribute getComplexDataType_ParentTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance <em>Complex Data Type Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Data Type Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance
	 * @generated
	 */
	EClass getComplexDataTypeInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getDocumentation()
	 * @see #getComplexDataTypeInstance()
	 * @generated
	 */
	EAttribute getComplexDataTypeInstance_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getAttributeValue()
	 * @see #getComplexDataTypeInstance()
	 * @generated
	 */
	EReference getComplexDataTypeInstance_AttributeValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getExtendedAttributes()
	 * @see #getComplexDataTypeInstance()
	 * @generated
	 */
	EReference getComplexDataTypeInstance_ExtendedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Of</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getInstanceOf()
	 * @see #getComplexDataTypeInstance()
	 * @generated
	 */
	EAttribute getComplexDataTypeInstance_InstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ComplexDataTypeInstance#getName()
	 * @see #getComplexDataTypeInstance()
	 * @generated
	 */
	EAttribute getComplexDataTypeInstance_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see com.ibm.wbim.bom.schema1.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Connection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Connection#getDescription()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.ibm.wbim.bom.schema1.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.ibm.wbim.bom.schema1.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ConstantTimeType <em>Constant Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Time Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ConstantTimeType
	 * @generated
	 */
	EClass getConstantTimeType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ConstantTimeType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.ibm.wbim.bom.schema1.ConstantTimeType#getTime()
	 * @see #getConstantTimeType()
	 * @generated
	 */
	EAttribute getConstantTimeType_Time();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef <em>Control Action Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Action Output Ref</em>'.
	 * @see com.ibm.wbim.bom.schema1.ControlActionOutputRef
	 * @generated
	 */
	EClass getControlActionOutputRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef#getRepositoryValue <em>Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.ControlActionOutputRef#getRepositoryValue()
	 * @see #getControlActionOutputRef()
	 * @generated
	 */
	EReference getControlActionOutputRef_RepositoryValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ControlActionOutputRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ControlActionOutputRef#getName()
	 * @see #getControlActionOutputRef()
	 * @generated
	 */
	EAttribute getControlActionOutputRef_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CorrelationType <em>Correlation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.CorrelationType
	 * @generated
	 */
	EClass getCorrelationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CorrelationType#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see com.ibm.wbim.bom.schema1.CorrelationType#getPredicate()
	 * @see #getCorrelationType()
	 * @generated
	 */
	EReference getCorrelationType_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CorrelationType#getMultipleInstancesSatisfyCondition <em>Multiple Instances Satisfy Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Instances Satisfy Condition</em>'.
	 * @see com.ibm.wbim.bom.schema1.CorrelationType#getMultipleInstancesSatisfyCondition()
	 * @see #getCorrelationType()
	 * @generated
	 */
	EAttribute getCorrelationType_MultipleInstancesSatisfyCondition();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CorrelationType#getNoInstancesSatisfyCondition <em>No Instances Satisfy Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Instances Satisfy Condition</em>'.
	 * @see com.ibm.wbim.bom.schema1.CorrelationType#getNoInstancesSatisfyCondition()
	 * @see #getCorrelationType()
	 * @generated
	 */
	EAttribute getCorrelationType_NoInstancesSatisfyCondition();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CostPerQuantity <em>Cost Per Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Per Quantity</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerQuantity
	 * @generated
	 */
	EClass getCostPerQuantity();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CostPerQuantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerQuantity#getUnit()
	 * @see #getCostPerQuantity()
	 * @generated
	 */
	EAttribute getCostPerQuantity_Unit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit <em>Cost Per Quantity And Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Per Quantity And Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit
	 * @generated
	 */
	EClass getCostPerQuantityAndTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit#getTimeUnit()
	 * @see #getCostPerQuantityAndTimeUnit()
	 * @generated
	 */
	EAttribute getCostPerQuantityAndTimeUnit_TimeUnit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnit <em>Cost Per Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Per Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerTimeUnit
	 * @generated
	 */
	EClass getCostPerTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnit#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerTimeUnit#getTimeUnit()
	 * @see #getCostPerTimeUnit()
	 * @generated
	 */
	EAttribute getCostPerTimeUnit_TimeUnit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue <em>Cost Per Time Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Per Time Unit Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerTimeUnitValue
	 * @generated
	 */
	EClass getCostPerTimeUnitValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CostPerTimeUnitValue#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostPerTimeUnitValue#getTimeUnit()
	 * @see #getCostPerTimeUnitValue()
	 * @generated
	 */
	EAttribute getCostPerTimeUnitValue_TimeUnit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostType
	 * @generated
	 */
	EClass getCostType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CostType#getExecutionCost <em>Execution Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostType#getExecutionCost()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_ExecutionCost();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CostType#getStartupCost <em>Startup Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startup Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostType#getStartupCost()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_StartupCost();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CostType#getResourceWaitingCost <em>Resource Waiting Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Waiting Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostType#getResourceWaitingCost()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_ResourceWaitingCost();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CostValue <em>Cost Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostValue
	 * @generated
	 */
	EClass getCostValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CostValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostValue#getLiteralValue()
	 * @see #getCostValue()
	 * @generated
	 */
	EAttribute getCostValue_LiteralValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CostValue#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostValue#getDistribution()
	 * @see #getCostValue()
	 * @generated
	 */
	EReference getCostValue_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.CostValue#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see com.ibm.wbim.bom.schema1.CostValue#getCurrency()
	 * @see #getCostValue()
	 * @generated
	 */
	EAttribute getCostValue_Currency();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate <em>Criteria Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate
	 * @generated
	 */
	EClass getCriteriaTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployee <em>Manager Of Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager Of Employee</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployee()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_ManagerOfEmployee();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployeeByID <em>Manager Of Employee By ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager Of Employee By ID</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getManagerOfEmployeeByID()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_ManagerOfEmployeeByID();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonSearch <em>Person Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Search</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonSearch()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_PersonSearch();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getPersonName()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupMembers <em>Group Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Members</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupMembers()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_GroupMembers();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupSearch <em>Group Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Search</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getGroupSearch()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_GroupSearch();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.CriteriaTemplate#getOrganizationManager <em>Organization Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Manager</em>'.
	 * @see com.ibm.wbim.bom.schema1.CriteriaTemplate#getOrganizationManager()
	 * @see #getCriteriaTemplate()
	 * @generated
	 */
	EReference getCriteriaTemplate_OrganizationManager();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItemTemplates <em>Business Item Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Item Templates</em>'.
	 * @see com.ibm.wbim.bom.schema1.DataModel#getBusinessItemTemplates()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_BusinessItemTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItems <em>Business Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Items</em>'.
	 * @see com.ibm.wbim.bom.schema1.DataModel#getBusinessItems()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_BusinessItems();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DataModel#getBusinessItemInstances <em>Business Item Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Item Instances</em>'.
	 * @see com.ibm.wbim.bom.schema1.DataModel#getBusinessItemInstances()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_BusinessItemInstances();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DataModel#getNotificationTemplates <em>Notification Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Templates</em>'.
	 * @see com.ibm.wbim.bom.schema1.DataModel#getNotificationTemplates()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_NotificationTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DataModel#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notifications</em>'.
	 * @see com.ibm.wbim.bom.schema1.DataModel#getNotifications()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Notifications();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Decision#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision#getDescription()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Decision#getInputBranch <em>Input Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision#getInputBranch()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_InputBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Decision#getOutputBranch <em>Output Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision#getOutputBranch()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_OutputBranch();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Decision#isIsInclusive <em>Is Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inclusive</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision#isIsInclusive()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_IsInclusive();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Decision#isIsSimpleDecision <em>Is Simple Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Simple Decision</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision#isIsSimpleDecision()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_IsSimpleDecision();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Decision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Decision#getName()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.DefaultValue
	 * @generated
	 */
	EClass getDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.DefaultValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.DefaultValue#getLiteralValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	EAttribute getDefaultValue_LiteralValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DefaultValue#getExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.DefaultValue#getExpressionValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	EReference getDefaultValue_ExpressionValue();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.DistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType
	 * @generated
	 */
	EClass getDistributionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getExponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exponential</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getExponential()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Exponential();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getGamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gamma</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getGamma()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Gamma();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getLognormal <em>Lognormal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lognormal</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getLognormal()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Lognormal();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getNormal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normal</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getNormal()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Normal();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getPoisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poisson</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getPoisson()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Poisson();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getRandomList <em>Random List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Random List</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getRandomList()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_RandomList();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getUniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uniform</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getUniform()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Uniform();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DistributionType#getWeightedList <em>Weighted List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weighted List</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType#getWeightedList()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_WeightedList();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.DistributionType1 <em>Distribution Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Type1</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType1
	 * @generated
	 */
	EClass getDistributionType1();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.DistributionType1#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.DistributionType1#getTimeUnit()
	 * @see #getDistributionType1()
	 * @generated
	 */
	EAttribute getDistributionType1_TimeUnit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.ibm.wbim.bom.schema1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.ibm.wbim.bom.schema1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.ibm.wbim.bom.schema1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.ibm.wbim.bom.schema1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.ibm.wbim.bom.schema1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.ibm.wbim.bom.schema1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.EndNodeType <em>End Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Node Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.EndNodeType
	 * @generated
	 */
	EClass getEndNodeType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.EndNodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.EndNodeType#getName()
	 * @see #getEndNodeType()
	 * @generated
	 */
	EAttribute getEndNodeType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.EntryPointType <em>Entry Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.EntryPointType
	 * @generated
	 */
	EClass getEntryPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.EntryPointType#getInputCriterion <em>Input Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.EntryPointType#getInputCriterion()
	 * @see #getEntryPointType()
	 * @generated
	 */
	EAttribute getEntryPointType_InputCriterion();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ExemptionPeriodType <em>Exemption Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemption Period Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExemptionPeriodType
	 * @generated
	 */
	EClass getExemptionPeriodType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ExemptionPeriodType#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExemptionPeriodType#getTimetable()
	 * @see #getExemptionPeriodType()
	 * @generated
	 */
	EAttribute getExemptionPeriodType_Timetable();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ExponentialType <em>Exponential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExponentialType
	 * @generated
	 */
	EClass getExponentialType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ExponentialType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExponentialType#getMean()
	 * @see #getExponentialType()
	 * @generated
	 */
	EAttribute getExponentialType_Mean();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see com.ibm.wbim.bom.schema1.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Expression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Expression#getDescription()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributes
	 * @generated
	 */
	EClass getExtendedAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.ExtendedAttributes#getExtendedAttribute <em>Extended Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Attribute</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributes#getExtendedAttribute()
	 * @see #getExtendedAttributes()
	 * @generated
	 */
	EReference getExtendedAttributes_ExtendedAttribute();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType <em>Extended Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attribute Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType
	 * @generated
	 */
	EClass getExtendedAttributeType();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType#getMixed()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType#getGroup()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType#getAny()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType#getName()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ExtendedAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.ExtendedAttributeType#getValue()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_Value();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.FlowContentType <em>Flow Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Content Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType
	 * @generated
	 */
	EClass getFlowContentType();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getGroup()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EAttribute getFlowContentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getStartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start Node</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getStartNode()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_StartNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getStopNode <em>Stop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Node</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getStopNode()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_StopNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getEndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Node</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getEndNode()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_EndNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getTask()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getDecision()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Decision();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merge</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getMerge()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Merge();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getFork()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Fork();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getJoin()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Join();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getNotificationBroadcaster <em>Notification Broadcaster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification Broadcaster</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getNotificationBroadcaster()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_NotificationBroadcaster();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getNotificationReceiver <em>Notification Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification Receiver</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getNotificationReceiver()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_NotificationReceiver();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observer</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getObserver()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Observer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getTimer()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getMap()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getLoop()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Loop();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>For Loop</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getForLoop()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_ForLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getProcess()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getLocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getLocalRepository()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_LocalRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getCallToProcess <em>Call To Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call To Process</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getCallToProcess()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_CallToProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getCallToTask <em>Call To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call To Task</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getCallToTask()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_CallToTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getCallToService <em>Call To Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call To Service</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getCallToService()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_CallToService();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getConnection()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.FlowContentType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see com.ibm.wbim.bom.schema1.FlowContentType#getAnnotation()
	 * @see #getFlowContentType()
	 * @generated
	 */
	EReference getFlowContentType_Annotation();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see com.ibm.wbim.bom.schema1.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Fork#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Fork#getDescription()
	 * @see #getFork()
	 * @generated
	 */
	EAttribute getFork_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Fork#getInputBranch <em>Input Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Fork#getInputBranch()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_InputBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Fork#getOutputBranch <em>Output Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Fork#getOutputBranch()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_OutputBranch();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Fork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Fork#getName()
	 * @see #getFork()
	 * @generated
	 */
	EAttribute getFork_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop</em>'.
	 * @see com.ibm.wbim.bom.schema1.ForLoop
	 * @generated
	 */
	EClass getForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ForLoop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see com.ibm.wbim.bom.schema1.ForLoop#getLoopCondition()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_LoopCondition();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.GammaType <em>Gamma Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.GammaType
	 * @generated
	 */
	EClass getGammaType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GammaType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see com.ibm.wbim.bom.schema1.GammaType#getMean()
	 * @see #getGammaType()
	 * @generated
	 */
	EAttribute getGammaType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GammaType#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see com.ibm.wbim.bom.schema1.GammaType#getStandardDeviation()
	 * @see #getGammaType()
	 * @generated
	 */
	EAttribute getGammaType_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.GlobalRepositoryRef <em>Global Repository Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Repository Ref</em>'.
	 * @see com.ibm.wbim.bom.schema1.GlobalRepositoryRef
	 * @generated
	 */
	EClass getGlobalRepositoryRef();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GlobalRepositoryRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.GlobalRepositoryRef#getName()
	 * @see #getGlobalRepositoryRef()
	 * @generated
	 */
	EAttribute getGlobalRepositoryRef_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.GroupMembersType <em>Group Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Members Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType
	 * @generated
	 */
	EClass getGroupMembersType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType#getGroup()
	 * @see #getGroupMembersType()
	 * @generated
	 */
	EAttribute getGroupMembersType_Group();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType#getDomain()
	 * @see #getGroupMembersType()
	 * @generated
	 */
	EAttribute getGroupMembersType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupMembersType#isIncludeSubgroups <em>Include Subgroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Subgroups</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType#isIncludeSubgroups()
	 * @see #getGroupMembersType()
	 * @generated
	 */
	EAttribute getGroupMembersType_IncludeSubgroups();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName1 <em>Alternative Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Name1</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName1()
	 * @see #getGroupMembersType()
	 * @generated
	 */
	EAttribute getGroupMembersType_AlternativeName1();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName2 <em>Alternative Name2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Name2</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupMembersType#getAlternativeName2()
	 * @see #getGroupMembersType()
	 * @generated
	 */
	EAttribute getGroupMembersType_AlternativeName2();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.GroupSearchType <em>Group Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Search Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType
	 * @generated
	 */
	EClass getGroupSearchType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getGroupId()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getProfile()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_Profile();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getIndustryType <em>Industry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Industry Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getIndustryType()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_IndustryType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessType <em>Business Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessType()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_BusinessType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getGeographicLocation <em>Geographic Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geographic Location</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getGeographicLocation()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_GeographicLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getAffiliates <em>Affiliates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliates</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getAffiliates()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_Affiliates();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getDisplayName()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getSecretary <em>Secretary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secretary</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getSecretary()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_Secretary();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assistant</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getAssistant()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_Assistant();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getManager()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_Manager();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessCategory <em>Business Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Category</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getBusinessCategory()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_BusinessCategory();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.GroupSearchType#getParentCompany <em>Parent Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Company</em>'.
	 * @see com.ibm.wbim.bom.schema1.GroupSearchType#getParentCompany()
	 * @see #getGroupSearchType()
	 * @generated
	 */
	EAttribute getGroupSearchType_ParentCompany();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.IndividualResource <em>Individual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Resource</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource
	 * @generated
	 */
	EClass getIndividualResource();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.IndividualResource#getIndividualResourceCostType <em>Individual Resource Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Individual Resource Cost Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource#getIndividualResourceCostType()
	 * @see #getIndividualResource()
	 * @generated
	 */
	EAttribute getIndividualResource_IndividualResourceCostType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResource#getOneTimeCost <em>One Time Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Time Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource#getOneTimeCost()
	 * @see #getIndividualResource()
	 * @generated
	 */
	EReference getIndividualResource_OneTimeCost();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResource#getCostPerTimeUnit <em>Cost Per Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cost Per Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource#getCostPerTimeUnit()
	 * @see #getIndividualResource()
	 * @generated
	 */
	EReference getIndividualResource_CostPerTimeUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResource#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availability</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource#getAvailability()
	 * @see #getIndividualResource()
	 * @generated
	 */
	EReference getIndividualResource_Availability();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResource#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualification</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResource#getQualification()
	 * @see #getIndividualResource()
	 * @generated
	 */
	EReference getIndividualResource_Qualification();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType <em>Individual Resource Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Resource Definitions Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType
	 * @generated
	 */
	EClass getIndividualResourceDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType#getIndividualResourceDefinition <em>Individual Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual Resource Definition</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType#getIndividualResourceDefinition()
	 * @see #getIndividualResourceDefinitionsType()
	 * @generated
	 */
	EReference getIndividualResourceDefinitionsType_IndividualResourceDefinition();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType <em>Individual Resource Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Resource Definition Templates Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType
	 * @generated
	 */
	EClass getIndividualResourceDefinitionTemplatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType#getIndividualResourceDefinitionTemplate <em>Individual Resource Definition Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual Resource Definition Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType#getIndividualResourceDefinitionTemplate()
	 * @see #getIndividualResourceDefinitionTemplatesType()
	 * @generated
	 */
	EReference getIndividualResourceDefinitionTemplatesType_IndividualResourceDefinitionTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement <em>Individual Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Resource Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceRequirement
	 * @generated
	 */
	EClass getIndividualResourceRequirement();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getIndividualResource <em>Individual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Resource</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getIndividualResource()
	 * @see #getIndividualResourceRequirement()
	 * @generated
	 */
	EAttribute getIndividualResourceRequirement_IndividualResource();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getName()
	 * @see #getIndividualResourceRequirement()
	 * @generated
	 */
	EAttribute getIndividualResourceRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getTimeRequired <em>Time Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Required</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getTimeRequired()
	 * @see #getIndividualResourceRequirement()
	 * @generated
	 */
	EAttribute getIndividualResourceRequirement_TimeRequired();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.IndividualResourcesType <em>Individual Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Resources Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourcesType
	 * @generated
	 */
	EClass getIndividualResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.IndividualResourcesType#getIndividualResource <em>Individual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual Resource</em>'.
	 * @see com.ibm.wbim.bom.schema1.IndividualResourcesType#getIndividualResource()
	 * @see #getIndividualResourcesType()
	 * @generated
	 */
	EReference getIndividualResourcesType_IndividualResource();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Input#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#getConstantValue()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_ConstantValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Input#getRepositoryValue <em>Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#getRepositoryValue()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_RepositoryValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Input#getAssociatedData <em>Associated Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#getAssociatedData()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_AssociatedData();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Input#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#isIsOrdered()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Input#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#isIsUnique()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Input#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#getMaximum()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Input#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#getMinimum()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputBranch <em>Input Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputBranch
	 * @generated
	 */
	EClass getInputBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.InputBranch#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputBranch#getInput()
	 * @see #getInputBranch()
	 * @generated
	 */
	EReference getInputBranch_Input();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputBranch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputBranch#getName()
	 * @see #getInputBranch()
	 * @generated
	 */
	EAttribute getInputBranch_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputConstantValue <em>Input Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Constant Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValue
	 * @generated
	 */
	EClass getInputConstantValue();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.InputConstantValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValue#getLiteralValue()
	 * @see #getInputConstantValue()
	 * @generated
	 */
	EAttribute getInputConstantValue_LiteralValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.InputConstantValue#getPublicInstance <em>Public Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValue#getPublicInstance()
	 * @see #getInputConstantValue()
	 * @generated
	 */
	EReference getInputConstantValue_PublicInstance();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputConstantValueType <em>Input Constant Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Constant Value Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValueType
	 * @generated
	 */
	EClass getInputConstantValueType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputConstantValueType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputConstantValueType#getInput()
	 * @see #getInputConstantValueType()
	 * @generated
	 */
	EAttribute getInputConstantValueType_Input();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputCriterion <em>Input Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterion
	 * @generated
	 */
	EClass getInputCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.InputCriterion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterion#getInput()
	 * @see #getInputCriterion()
	 * @generated
	 */
	EReference getInputCriterion_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.InputCriterion#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterion#getConstraint()
	 * @see #getInputCriterion()
	 * @generated
	 */
	EReference getInputCriterion_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.InputCriterion#getCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterion#getCorrelation()
	 * @see #getInputCriterion()
	 * @generated
	 */
	EReference getInputCriterion_Correlation();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputCriterion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterion#getName()
	 * @see #getInputCriterion()
	 * @generated
	 */
	EAttribute getInputCriterion_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputCriterionRef <em>Input Criterion Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Criterion Ref</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterionRef
	 * @generated
	 */
	EClass getInputCriterionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputCriterionRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputCriterionRef#getName()
	 * @see #getInputCriterionRef()
	 * @generated
	 */
	EAttribute getInputCriterionRef_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue <em>Input Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValue
	 * @generated
	 */
	EClass getInputRepositoryValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#getLocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValue#getLocalRepository()
	 * @see #getInputRepositoryValue()
	 * @generated
	 */
	EReference getInputRepositoryValue_LocalRepository();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#getGlobalRepository <em>Global Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValue#getGlobalRepository()
	 * @see #getInputRepositoryValue()
	 * @generated
	 */
	EReference getInputRepositoryValue_GlobalRepository();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isAtBeginning <em>At Beginning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Beginning</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValue#isAtBeginning()
	 * @see #getInputRepositoryValue()
	 * @generated
	 */
	EAttribute getInputRepositoryValue_AtBeginning();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputRepositoryValue#isIsRemove <em>Is Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remove</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValue#isIsRemove()
	 * @see #getInputRepositoryValue()
	 * @generated
	 */
	EAttribute getInputRepositoryValue_IsRemove();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputRepositoryValueType <em>Input Repository Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Repository Value Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValueType
	 * @generated
	 */
	EClass getInputRepositoryValueType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputRepositoryValueType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputRepositoryValueType#getInput()
	 * @see #getInputRepositoryValueType()
	 * @generated
	 */
	EAttribute getInputRepositoryValueType_Input();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Inputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Inputs
	 * @generated
	 */
	EClass getInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Inputs#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.Inputs#getInput()
	 * @see #getInputs()
	 * @generated
	 */
	EReference getInputs_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Inputs#getInputCriterion <em>Input Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.Inputs#getInputCriterion()
	 * @see #getInputs()
	 * @generated
	 */
	EReference getInputs_InputCriterion();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.InputType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.InputType#getName()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Invocation#getInputConstantValue <em>Input Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Constant Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#getInputConstantValue()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_InputConstantValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Invocation#getInputRepositoryValue <em>Input Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#getInputRepositoryValue()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_InputRepositoryValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Invocation#getOutputRepositoryValue <em>Output Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#getOutputRepositoryValue()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_OutputRepositoryValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Invocation#getAdditionalInput <em>Additional Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Input</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#getAdditionalInput()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_AdditionalInput();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Invocation#getAdditionalOutput <em>Additional Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Output</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#getAdditionalOutput()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_AdditionalOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Invocation#isCallSynchronously <em>Call Synchronously</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Synchronously</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#isCallSynchronously()
	 * @see #getInvocation()
	 * @generated
	 */
	EAttribute getInvocation_CallSynchronously();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Invocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Invocation#getName()
	 * @see #getInvocation()
	 * @generated
	 */
	EAttribute getInvocation_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see com.ibm.wbim.bom.schema1.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Join#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Join#getDescription()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Join#getInputBranch <em>Input Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Join#getInputBranch()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_InputBranch();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Join#getOutputBranch <em>Output Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Join#getOutputBranch()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_OutputBranch();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Join#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Join#getName()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LastActivationTimePlusType <em>Last Activation Time Plus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Activation Time Plus Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LastActivationTimePlusType
	 * @generated
	 */
	EClass getLastActivationTimePlusType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LastActivationTimePlusType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.ibm.wbim.bom.schema1.LastActivationTimePlusType#getDuration()
	 * @see #getLastActivationTimePlusType()
	 * @generated
	 */
	EAttribute getLastActivationTimePlusType_Duration();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository
	 * @generated
	 */
	EClass getLocalRepository();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository#getDescription()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepository#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository#getCapacity()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository#isIsOrdered()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepository#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository#isIsUnique()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository#getName()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepository#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepository#getType()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_Type();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LocalRepositoryRef <em>Local Repository Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Repository Ref</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepositoryRef
	 * @generated
	 */
	EClass getLocalRepositoryRef();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocalRepositoryRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocalRepositoryRef#getName()
	 * @see #getLocalRepositoryRef()
	 * @generated
	 */
	EAttribute getLocalRepositoryRef_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LocationDefinitionsType <em>Location Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Definitions Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationDefinitionsType
	 * @generated
	 */
	EClass getLocationDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.LocationDefinitionsType#getLocationDefinition <em>Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Definition</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationDefinitionsType#getLocationDefinition()
	 * @see #getLocationDefinitionsType()
	 * @generated
	 */
	EReference getLocationDefinitionsType_LocationDefinition();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType <em>Location Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Definition Templates Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType
	 * @generated
	 */
	EClass getLocationDefinitionTemplatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType#getLocationDefinitionTemplate <em>Location Definition Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Definition Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationDefinitionTemplatesType#getLocationDefinitionTemplate()
	 * @see #getLocationDefinitionTemplatesType()
	 * @generated
	 */
	EReference getLocationDefinitionTemplatesType_LocationDefinitionTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LocationsType <em>Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locations Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationsType
	 * @generated
	 */
	EClass getLocationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.LocationsType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationsType#getLocation()
	 * @see #getLocationsType()
	 * @generated
	 */
	EReference getLocationsType_Location();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LocationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.LocationType#getName()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LognormalType <em>Lognormal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lognormal Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LognormalType
	 * @generated
	 */
	EClass getLognormalType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LognormalType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see com.ibm.wbim.bom.schema1.LognormalType#getMean()
	 * @see #getLognormalType()
	 * @generated
	 */
	EAttribute getLognormalType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LognormalType#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see com.ibm.wbim.bom.schema1.LognormalType#getStandardDeviation()
	 * @see #getLognormalType()
	 * @generated
	 */
	EAttribute getLognormalType_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see com.ibm.wbim.bom.schema1.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Loop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see com.ibm.wbim.bom.schema1.Loop#getLoopCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopCondition();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Loop#isIsConditionTestedFirst <em>Is Condition Tested First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Condition Tested First</em>'.
	 * @see com.ibm.wbim.bom.schema1.Loop#isIsConditionTestedFirst()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_IsConditionTestedFirst();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.LoopConditionType <em>Loop Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Condition Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.LoopConditionType
	 * @generated
	 */
	EClass getLoopConditionType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getCounterIncrement <em>Counter Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Increment</em>'.
	 * @see com.ibm.wbim.bom.schema1.LoopConditionType#getCounterIncrement()
	 * @see #getLoopConditionType()
	 * @generated
	 */
	EAttribute getLoopConditionType_CounterIncrement();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getFinalCounter <em>Final Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Counter</em>'.
	 * @see com.ibm.wbim.bom.schema1.LoopConditionType#getFinalCounter()
	 * @see #getLoopConditionType()
	 * @generated
	 */
	EAttribute getLoopConditionType_FinalCounter();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.LoopConditionType#getInitialCounter <em>Initial Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Counter</em>'.
	 * @see com.ibm.wbim.bom.schema1.LoopConditionType#getInitialCounter()
	 * @see #getLoopConditionType()
	 * @generated
	 */
	EAttribute getLoopConditionType_InitialCounter();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType <em>Manager Of Employee By ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Of Employee By ID Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType
	 * @generated
	 */
	EClass getManagerOfEmployeeByIDType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff</em>'.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getStaff()
	 * @see #getManagerOfEmployeeByIDType()
	 * @generated
	 */
	EAttribute getManagerOfEmployeeByIDType_Staff();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeByIDType#getDomain()
	 * @see #getManagerOfEmployeeByIDType()
	 * @generated
	 */
	EAttribute getManagerOfEmployeeByIDType_Domain();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeType <em>Manager Of Employee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Of Employee Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeType
	 * @generated
	 */
	EClass getManagerOfEmployeeType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeType#getName()
	 * @see #getManagerOfEmployeeType()
	 * @generated
	 */
	EAttribute getManagerOfEmployeeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ManagerOfEmployeeType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.ibm.wbim.bom.schema1.ManagerOfEmployeeType#getDomain()
	 * @see #getManagerOfEmployeeType()
	 * @generated
	 */
	EAttribute getManagerOfEmployeeType_Domain();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see com.ibm.wbim.bom.schema1.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see com.ibm.wbim.bom.schema1.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Merge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Merge#getDescription()
	 * @see #getMerge()
	 * @generated
	 */
	EAttribute getMerge_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Merge#getInputBranch <em>Input Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Merge#getInputBranch()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_InputBranch();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Merge#getOutputBranch <em>Output Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.Merge#getOutputBranch()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_OutputBranch();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Merge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Merge#getName()
	 * @see #getMerge()
	 * @generated
	 */
	EAttribute getMerge_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ModelType#getCatalogs <em>Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalogs</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getCatalogs()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Catalogs();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ModelType#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getDataModel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_DataModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ModelType#getResourceModel <em>Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getResourceModel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_ResourceModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ModelType#getOrganizationModel <em>Organization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getOrganizationModel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_OrganizationModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ModelType#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getProcessModel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_ProcessModel();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getName()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ModelType#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see com.ibm.wbim.bom.schema1.ModelType#getSchemaVersion()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_SchemaVersion();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.MonetaryValue <em>Monetary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monetary Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.MonetaryValue
	 * @generated
	 */
	EClass getMonetaryValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.MonetaryValue#getValue()
	 * @see #getMonetaryValue()
	 * @generated
	 */
	EAttribute getMonetaryValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.MonetaryValue#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see com.ibm.wbim.bom.schema1.MonetaryValue#getCurrency()
	 * @see #getMonetaryValue()
	 * @generated
	 */
	EAttribute getMonetaryValue_Currency();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.NormalType <em>Normal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.NormalType
	 * @generated
	 */
	EClass getNormalType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.NormalType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see com.ibm.wbim.bom.schema1.NormalType#getMean()
	 * @see #getNormalType()
	 * @generated
	 */
	EAttribute getNormalType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.NormalType#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see com.ibm.wbim.bom.schema1.NormalType#getStandardDeviation()
	 * @see #getNormalType()
	 * @generated
	 */
	EAttribute getNormalType_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster <em>Notification Broadcaster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Broadcaster</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationBroadcaster
	 * @generated
	 */
	EClass getNotificationBroadcaster();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationBroadcaster#getNotification()
	 * @see #getNotificationBroadcaster()
	 * @generated
	 */
	EAttribute getNotificationBroadcaster_Notification();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.NotificationBroadcaster#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationBroadcaster#getScope()
	 * @see #getNotificationBroadcaster()
	 * @generated
	 */
	EAttribute getNotificationBroadcaster_Scope();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.NotificationReceiver <em>Notification Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Receiver</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationReceiver
	 * @generated
	 */
	EClass getNotificationReceiver();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.NotificationReceiver#getNotificationFilter <em>Notification Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Filter</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationReceiver#getNotificationFilter()
	 * @see #getNotificationReceiver()
	 * @generated
	 */
	EReference getNotificationReceiver_NotificationFilter();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.NotificationReceiver#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationReceiver#getNotification()
	 * @see #getNotificationReceiver()
	 * @generated
	 */
	EAttribute getNotificationReceiver_Notification();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.NotificationsType <em>Notifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifications Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationsType
	 * @generated
	 */
	EClass getNotificationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.NotificationsType#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationsType#getNotification()
	 * @see #getNotificationsType()
	 * @generated
	 */
	EReference getNotificationsType_Notification();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.NotificationTemplatesType <em>Notification Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Templates Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationTemplatesType
	 * @generated
	 */
	EClass getNotificationTemplatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.NotificationTemplatesType#getNotificationTemplate <em>Notification Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.NotificationTemplatesType#getNotificationTemplate()
	 * @see #getNotificationTemplatesType()
	 * @generated
	 */
	EReference getNotificationTemplatesType_NotificationTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer</em>'.
	 * @see com.ibm.wbim.bom.schema1.Observer
	 * @generated
	 */
	EClass getObserver();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Observer#getObservationExpression <em>Observation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation Expression</em>'.
	 * @see com.ibm.wbim.bom.schema1.Observer#getObservationExpression()
	 * @see #getObserver()
	 * @generated
	 */
	EReference getObserver_ObservationExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Observer#isIsObserveContinuously <em>Is Observe Continuously</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Observe Continuously</em>'.
	 * @see com.ibm.wbim.bom.schema1.Observer#isIsObserveContinuously()
	 * @see #getObserver()
	 * @generated
	 */
	EAttribute getObserver_IsObserveContinuously();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OneTimeCost <em>One Time Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Time Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.OneTimeCost
	 * @generated
	 */
	EClass getOneTimeCost();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OneTimeCost#getCostValue <em>Cost Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.OneTimeCost#getCostValue()
	 * @see #getOneTimeCost()
	 * @generated
	 */
	EReference getOneTimeCost_CostValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.OneTimeCost#getWhenCostApplicable <em>When Cost Applicable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Cost Applicable</em>'.
	 * @see com.ibm.wbim.bom.schema1.OneTimeCost#getWhenCostApplicable()
	 * @see #getOneTimeCost()
	 * @generated
	 */
	EReference getOneTimeCost_WhenCostApplicable();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OperationalData <em>Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.OperationalData
	 * @generated
	 */
	EClass getOperationalData();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OperationalData#getTimeEstimation <em>Time Estimation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Estimation</em>'.
	 * @see com.ibm.wbim.bom.schema1.OperationalData#getTimeEstimation()
	 * @see #getOperationalData()
	 * @generated
	 */
	EReference getOperationalData_TimeEstimation();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OperationalData#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.OperationalData#getCost()
	 * @see #getOperationalData()
	 * @generated
	 */
	EReference getOperationalData_Cost();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OperationalData#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revenue</em>'.
	 * @see com.ibm.wbim.bom.schema1.OperationalData#getRevenue()
	 * @see #getOperationalData()
	 * @generated
	 */
	EReference getOperationalData_Revenue();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionsType <em>Organization Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Definitions Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationDefinitionsType
	 * @generated
	 */
	EClass getOrganizationDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionsType#getOrganizationDefinition <em>Organization Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization Definition</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationDefinitionsType#getOrganizationDefinition()
	 * @see #getOrganizationDefinitionsType()
	 * @generated
	 */
	EReference getOrganizationDefinitionsType_OrganizationDefinition();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType <em>Organization Definition Templates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Definition Templates Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType
	 * @generated
	 */
	EClass getOrganizationDefinitionTemplatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType#getOrganizationDefinitionTemplate <em>Organization Definition Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization Definition Template</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationDefinitionTemplatesType#getOrganizationDefinitionTemplate()
	 * @see #getOrganizationDefinitionTemplatesType()
	 * @generated
	 */
	EReference getOrganizationDefinitionTemplatesType_OrganizationDefinitionTemplate();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OrganizationManagerType <em>Organization Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Manager Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationManagerType
	 * @generated
	 */
	EClass getOrganizationManagerType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OrganizationManagerType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationManagerType#getOrganization()
	 * @see #getOrganizationManagerType()
	 * @generated
	 */
	EAttribute getOrganizationManagerType_Organization();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OrganizationModel <em>Organization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel
	 * @generated
	 */
	EClass getOrganizationModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitionTemplates <em>Organization Definition Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Definition Templates</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitionTemplates()
	 * @see #getOrganizationModel()
	 * @generated
	 */
	EReference getOrganizationModel_OrganizationDefinitionTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitions <em>Organization Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Definitions</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitions()
	 * @see #getOrganizationModel()
	 * @generated
	 */
	EReference getOrganizationModel_OrganizationDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationUnits <em>Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Units</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationUnits()
	 * @see #getOrganizationModel()
	 * @generated
	 */
	EReference getOrganizationModel_OrganizationUnits();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitionTemplates <em>Location Definition Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Definition Templates</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitionTemplates()
	 * @see #getOrganizationModel()
	 * @generated
	 */
	EReference getOrganizationModel_LocationDefinitionTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitions <em>Location Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Definitions</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitions()
	 * @see #getOrganizationModel()
	 * @generated
	 */
	EReference getOrganizationModel_LocationDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locations</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationModel#getLocations()
	 * @see #getOrganizationModel()
	 * @generated
	 */
	EReference getOrganizationModel_Locations();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Organizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizations</em>'.
	 * @see com.ibm.wbim.bom.schema1.Organizations
	 * @generated
	 */
	EClass getOrganizations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Organizations#getOrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.Organizations#getOrganizationUnit()
	 * @see #getOrganizations()
	 * @generated
	 */
	EReference getOrganizations_OrganizationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Organizations#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see com.ibm.wbim.bom.schema1.Organizations#getLocation()
	 * @see #getOrganizations()
	 * @generated
	 */
	EReference getOrganizations_Location();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OrganizationUnitsType <em>Organization Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Units Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationUnitsType
	 * @generated
	 */
	EClass getOrganizationUnitsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.OrganizationUnitsType#getOrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationUnitsType#getOrganizationUnit()
	 * @see #getOrganizationUnitsType()
	 * @generated
	 */
	EReference getOrganizationUnitsType_OrganizationUnit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OrganizationUnitType <em>Organization Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Unit Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationUnitType
	 * @generated
	 */
	EClass getOrganizationUnitType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OrganizationUnitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.OrganizationUnitType#getName()
	 * @see #getOrganizationUnitType()
	 * @generated
	 */
	EAttribute getOrganizationUnitType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Output#getRepositoryValue <em>Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#getRepositoryValue()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_RepositoryValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Output#getAssociatedData <em>Associated Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#getAssociatedData()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_AssociatedData();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Output#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#isIsOrdered()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Output#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#isIsUnique()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Output#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#getMaximum()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Output#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#getMinimum()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputBranch <em>Output Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Branch</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputBranch
	 * @generated
	 */
	EClass getOutputBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.OutputBranch#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputBranch#getOutput()
	 * @see #getOutputBranch()
	 * @generated
	 */
	EReference getOutputBranch_Output();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputBranch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputBranch#getName()
	 * @see #getOutputBranch()
	 * @generated
	 */
	EAttribute getOutputBranch_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputBranchType <em>Output Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Branch Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputBranchType
	 * @generated
	 */
	EClass getOutputBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OutputBranchType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputBranchType#getCondition()
	 * @see #getOutputBranchType()
	 * @generated
	 */
	EReference getOutputBranchType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OutputBranchType#getOperationalData <em>Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operational Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputBranchType#getOperationalData()
	 * @see #getOutputBranchType()
	 * @generated
	 */
	EReference getOutputBranchType_OperationalData();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputCriterion <em>Output Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterion
	 * @generated
	 */
	EClass getOutputCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterion#getOutput()
	 * @see #getOutputCriterion()
	 * @generated
	 */
	EReference getOutputCriterion_Output();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getRelatedInputCriteria <em>Related Input Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Input Criteria</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterion#getRelatedInputCriteria()
	 * @see #getOutputCriterion()
	 * @generated
	 */
	EReference getOutputCriterion_RelatedInputCriteria();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterion#getName()
	 * @see #getOutputCriterion()
	 * @generated
	 */
	EAttribute getOutputCriterion_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputCriterion#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterion#getType()
	 * @see #getOutputCriterion()
	 * @generated
	 */
	EAttribute getOutputCriterion_Type();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputCriterionRef <em>Output Criterion Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Criterion Ref</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterionRef
	 * @generated
	 */
	EClass getOutputCriterionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputCriterionRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputCriterionRef#getName()
	 * @see #getOutputCriterionRef()
	 * @generated
	 */
	EAttribute getOutputCriterionRef_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputPathOperationalData <em>Output Path Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Path Operational Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputPathOperationalData
	 * @generated
	 */
	EClass getOutputPathOperationalData();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OutputPathOperationalData#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probability</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputPathOperationalData#getProbability()
	 * @see #getOutputPathOperationalData()
	 * @generated
	 */
	EReference getOutputPathOperationalData_Probability();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue <em>Output Path Probability Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Path Probability Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputPathProbabilityValue
	 * @generated
	 */
	EClass getOutputPathProbabilityValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputPathProbabilityValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputPathProbabilityValue#getLiteralValue()
	 * @see #getOutputPathProbabilityValue()
	 * @generated
	 */
	EAttribute getOutputPathProbabilityValue_LiteralValue();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputRef <em>Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Ref</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRef
	 * @generated
	 */
	EClass getOutputRef();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRef#getName()
	 * @see #getOutputRef()
	 * @generated
	 */
	EAttribute getOutputRef_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValue <em>Output Repository Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Repository Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValue
	 * @generated
	 */
	EClass getOutputRepositoryValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValue#getLocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValue#getLocalRepository()
	 * @see #getOutputRepositoryValue()
	 * @generated
	 */
	EReference getOutputRepositoryValue_LocalRepository();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValue#getGlobalRepository <em>Global Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValue#getGlobalRepository()
	 * @see #getOutputRepositoryValue()
	 * @generated
	 */
	EReference getOutputRepositoryValue_GlobalRepository();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValue#isAtBeginning <em>At Beginning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Beginning</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValue#isAtBeginning()
	 * @see #getOutputRepositoryValue()
	 * @generated
	 */
	EAttribute getOutputRepositoryValue_AtBeginning();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValue#isIsInsert <em>Is Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Insert</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValue#isIsInsert()
	 * @see #getOutputRepositoryValue()
	 * @generated
	 */
	EAttribute getOutputRepositoryValue_IsInsert();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValueType <em>Output Repository Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Repository Value Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValueType
	 * @generated
	 */
	EClass getOutputRepositoryValueType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.OutputRepositoryValueType#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see com.ibm.wbim.bom.schema1.OutputRepositoryValueType#getOutput()
	 * @see #getOutputRepositoryValueType()
	 * @generated
	 */
	EAttribute getOutputRepositoryValueType_Output();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Outputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Outputs
	 * @generated
	 */
	EClass getOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Outputs#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see com.ibm.wbim.bom.schema1.Outputs#getOutput()
	 * @see #getOutputs()
	 * @generated
	 */
	EReference getOutputs_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Outputs#getOutputCriterion <em>Output Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.Outputs#getOutputCriterion()
	 * @see #getOutputs()
	 * @generated
	 */
	EReference getOutputs_OutputCriterion();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Name Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonNameType
	 * @generated
	 */
	EClass getPersonNameType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonNameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonNameType#getName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName1 <em>Alternative Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Name1</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName1()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_AlternativeName1();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName2 <em>Alternative Name2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Name2</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonNameType#getAlternativeName2()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_AlternativeName2();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.PersonSearchType <em>Person Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Search Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType
	 * @generated
	 */
	EClass getPersonSearchType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getUserId()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getProfile()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Profile();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getLastName()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getFirstName()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getMiddleName()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getEMail()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_EMail();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getCompany()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Company();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getDisplayName()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getSecretary <em>Secretary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secretary</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getSecretary()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Secretary();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assistant</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getAssistant()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Assistant();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getManager()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Manager();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getDepartment()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Department();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getEmployeeId <em>Employee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Id</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getEmployeeId()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_EmployeeId();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getTaxPayerId <em>Tax Payer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payer Id</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getTaxPayerId()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_TaxPayerId();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getPhone()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Phone();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getFax()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getGender()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_Gender();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getTimeZone()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_TimeZone();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PersonSearchType#getPreferredLanguage <em>Preferred Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Language</em>'.
	 * @see com.ibm.wbim.bom.schema1.PersonSearchType#getPreferredLanguage()
	 * @see #getPersonSearchType()
	 * @generated
	 */
	EAttribute getPersonSearchType_PreferredLanguage();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.PoissonType <em>Poisson Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poisson Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.PoissonType
	 * @generated
	 */
	EClass getPoissonType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PoissonType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see com.ibm.wbim.bom.schema1.PoissonType#getMean()
	 * @see #getPoissonType()
	 * @generated
	 */
	EAttribute getPoissonType_Mean();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.PrivateInstance <em>Private Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.PrivateInstance
	 * @generated
	 */
	EClass getPrivateInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.PrivateInstance#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.PrivateInstance#getAttributeValue()
	 * @see #getPrivateInstance()
	 * @generated
	 */
	EReference getPrivateInstance_AttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PrivateInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.PrivateInstance#getName()
	 * @see #getPrivateInstance()
	 * @generated
	 */
	EAttribute getPrivateInstance_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Process#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getDescription()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Process#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getInputs()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Process#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getOutputs()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Process#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getPrecondition()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Process#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getPostcondition()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Postcondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Process#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizations</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getOrganizations()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Organizations();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Process#getOperationalData <em>Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operational Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getOperationalData()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OperationalData();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Process#getFlowContent <em>Flow Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Content</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getFlowContent()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FlowContent();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Process#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getExtendedAttributes()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ExtendedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ProcessesType <em>Processes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processes Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessesType
	 * @generated
	 */
	EClass getProcessesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.ProcessesType#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessesType#getProcess()
	 * @see #getProcessesType()
	 * @generated
	 */
	EReference getProcessesType_Process();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessModel
	 * @generated
	 */
	EClass getProcessModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ProcessModel#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processes</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessModel#getProcesses()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_Processes();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ProcessModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tasks</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessModel#getTasks()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ProcessModel#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repositories</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessModel#getRepositories()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_Repositories();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ProcessModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see com.ibm.wbim.bom.schema1.ProcessModel#getServices()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_Services();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.PublicInstance <em>Public Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.PublicInstance
	 * @generated
	 */
	EClass getPublicInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.PublicInstance#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.PublicInstance#getInstance()
	 * @see #getPublicInstance()
	 * @generated
	 */
	EAttribute getPublicInstance_Instance();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification</em>'.
	 * @see com.ibm.wbim.bom.schema1.Qualification
	 * @generated
	 */
	EClass getQualification();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Qualification#getScopeDimensionValue <em>Scope Dimension Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope Dimension Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Qualification#getScopeDimensionValue()
	 * @see #getQualification()
	 * @generated
	 */
	EReference getQualification_ScopeDimensionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Qualification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see com.ibm.wbim.bom.schema1.Qualification#getRole()
	 * @see #getQualification()
	 * @generated
	 */
	EAttribute getQualification_Role();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see com.ibm.wbim.bom.schema1.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Unit();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RandomListType <em>Random List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random List Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.RandomListType
	 * @generated
	 */
	EClass getRandomListType();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.RandomListType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.RandomListType#getValue()
	 * @see #getRandomListType()
	 * @generated
	 */
	EAttribute getRandomListType_Value();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType <em>Recurring Time Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurring Time Interval Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.RecurringTimeIntervalType
	 * @generated
	 */
	EClass getRecurringTimeIntervalType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartTime()
	 * @see #getRecurringTimeIntervalType()
	 * @generated
	 */
	EAttribute getRecurringTimeIntervalType_StartTime();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartDayOfWeek <em>Start Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Day Of Week</em>'.
	 * @see com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartDayOfWeek()
	 * @see #getRecurringTimeIntervalType()
	 * @generated
	 */
	EReference getRecurringTimeIntervalType_StartDayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getDuration()
	 * @see #getRecurringTimeIntervalType()
	 * @generated
	 */
	EAttribute getRecurringTimeIntervalType_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getName()
	 * @see #getRecurringTimeIntervalType()
	 * @generated
	 */
	EAttribute getRecurringTimeIntervalType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RelatedInputCriteriaType <em>Related Input Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Input Criteria Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.RelatedInputCriteriaType
	 * @generated
	 */
	EClass getRelatedInputCriteriaType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.RelatedInputCriteriaType#getInputCriterion <em>Input Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.RelatedInputCriteriaType#getInputCriterion()
	 * @see #getRelatedInputCriteriaType()
	 * @generated
	 */
	EReference getRelatedInputCriteriaType_InputCriterion();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RepositoriesType <em>Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositories Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoriesType
	 * @generated
	 */
	EClass getRepositoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.RepositoriesType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoriesType#getRepository()
	 * @see #getRepositoriesType()
	 * @generated
	 */
	EReference getRepositoriesType_Repository();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#getDescription()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Repository#getDefaultValues <em>Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Values</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#getDefaultValues()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_DefaultValues();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Repository#getComputedValues <em>Computed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Computed Values</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#getComputedValues()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ComputedValues();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#getCapacity()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#isIsOrdered()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#isIsReadOnly()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#isIsUnique()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Repository#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.Repository#getType()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Type();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue <em>Repository Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Data Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue
	 * @generated
	 */
	EClass getRepositoryDataValue();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue#getGroup()
	 * @see #getRepositoryDataValue()
	 * @generated
	 */
	EAttribute getRepositoryDataValue_Group();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue#getLiteralValue()
	 * @see #getRepositoryDataValue()
	 * @generated
	 */
	EAttribute getRepositoryDataValue_LiteralValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue#getExpressionValue()
	 * @see #getRepositoryDataValue()
	 * @generated
	 */
	EReference getRepositoryDataValue_ExpressionValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getPublicInstance <em>Public Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue#getPublicInstance()
	 * @see #getRepositoryDataValue()
	 * @generated
	 */
	EReference getRepositoryDataValue_PublicInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.RepositoryDataValue#getPrivateInstance <em>Private Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private Instance</em>'.
	 * @see com.ibm.wbim.bom.schema1.RepositoryDataValue#getPrivateInstance()
	 * @see #getRepositoryDataValue()
	 * @generated
	 */
	EReference getRepositoryDataValue_PrivateInstance();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ResourceModel <em>Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Model</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel
	 * @generated
	 */
	EClass getResourceModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitionTemplates <em>Individual Resource Definition Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual Resource Definition Templates</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitionTemplates()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_IndividualResourceDefinitionTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitions <em>Individual Resource Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual Resource Definitions</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitions()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_IndividualResourceDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitionTemplates <em>Bulk Resource Definition Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bulk Resource Definition Templates</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitionTemplates()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_BulkResourceDefinitionTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitions <em>Bulk Resource Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bulk Resource Definitions</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitions()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_BulkResourceDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResources <em>Individual Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual Resources</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResources()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_IndividualResources();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResources <em>Bulk Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bulk Resources</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getBulkResources()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_BulkResources();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getRoles()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.ResourceModel#getTimetables <em>Timetables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timetables</em>'.
	 * @see com.ibm.wbim.bom.schema1.ResourceModel#getTimetables()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_Timetables();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see com.ibm.wbim.bom.schema1.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Resources#getRoleRequirement <em>Role Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.Resources#getRoleRequirement()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_RoleRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Resources#getIndividualResourceRequirement <em>Individual Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual Resource Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.Resources#getIndividualResourceRequirement()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_IndividualResourceRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Resources#getBulkResourceRequirement <em>Bulk Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bulk Resource Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.Resources#getBulkResourceRequirement()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_BulkResourceRequirement();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Role#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getDocumentation()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Role#getScopeDimension <em>Scope Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope Dimension</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getScopeDimension()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ScopeDimension();

	/**
	 * Returns the meta object for the attribute list '{@link com.ibm.wbim.bom.schema1.Role#getIndividualResourceCostType <em>Individual Resource Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Individual Resource Cost Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getIndividualResourceCostType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IndividualResourceCostType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Role#getOneTimeCost <em>One Time Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Time Cost</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getOneTimeCost()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_OneTimeCost();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Role#getCostPerTimeUnit <em>Cost Per Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cost Per Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getCostPerTimeUnit()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_CostPerTimeUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Role#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availability</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getAvailability()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Availability();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Role#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getExtendedAttributes()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ExtendedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RoleRequirement <em>Role Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement
	 * @generated
	 */
	EClass getRoleRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getResourceQuantity <em>Resource Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Quantity</em>'.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement#getResourceQuantity()
	 * @see #getRoleRequirement()
	 * @generated
	 */
	EReference getRoleRequirement_ResourceQuantity();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement#getName()
	 * @see #getRoleRequirement()
	 * @generated
	 */
	EAttribute getRoleRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement#getRole()
	 * @see #getRoleRequirement()
	 * @generated
	 */
	EAttribute getRoleRequirement_Role();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getTimeRequired <em>Time Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Required</em>'.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement#getTimeRequired()
	 * @see #getRoleRequirement()
	 * @generated
	 */
	EAttribute getRoleRequirement_TimeRequired();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.RoleRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.RoleRequirement#getType()
	 * @see #getRoleRequirement()
	 * @generated
	 */
	EAttribute getRoleRequirement_Type();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.RolesType <em>Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.RolesType
	 * @generated
	 */
	EClass getRolesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.RolesType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see com.ibm.wbim.bom.schema1.RolesType#getRole()
	 * @see #getRolesType()
	 * @generated
	 */
	EReference getRolesType_Role();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType <em>Scope Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Dimension Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionType
	 * @generated
	 */
	EClass getScopeDimensionType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionType#getName()
	 * @see #getScopeDimensionType()
	 * @generated
	 */
	EAttribute getScopeDimensionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ScopeDimensionType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionType#getValueType()
	 * @see #getScopeDimensionType()
	 * @generated
	 */
	EAttribute getScopeDimensionType_ValueType();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ScopeDimensionValue <em>Scope Dimension Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Dimension Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionValue
	 * @generated
	 */
	EClass getScopeDimensionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ScopeDimensionValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionValue#getValue()
	 * @see #getScopeDimensionValue()
	 * @generated
	 */
	EAttribute getScopeDimensionValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ScopeDimensionValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.ScopeDimensionValue#getName()
	 * @see #getScopeDimensionValue()
	 * @generated
	 */
	EAttribute getScopeDimensionValue_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.ibm.wbim.bom.schema1.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ServicesType <em>Services Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ServicesType
	 * @generated
	 */
	EClass getServicesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.ServicesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see com.ibm.wbim.bom.schema1.ServicesType#getService()
	 * @see #getServicesType()
	 * @generated
	 */
	EReference getServicesType_Service();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.SourceType#getContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Point</em>'.
	 * @see com.ibm.wbim.bom.schema1.SourceType#getContactPoint()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_ContactPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.SourceType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see com.ibm.wbim.bom.schema1.SourceType#getNode()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Node();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType <em>Start Day Of Week Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Day Of Week Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartDayOfWeekType
	 * @generated
	 */
	EClass getStartDayOfWeekType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartDayOfWeekType#getDayOfWeek()
	 * @see #getStartDayOfWeekType()
	 * @generated
	 */
	EAttribute getStartDayOfWeekType_DayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartDayOfWeekType#getStartTime()
	 * @see #getStartDayOfWeekType()
	 * @generated
	 */
	EAttribute getStartDayOfWeekType_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getWeekNumber <em>Week Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Number</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartDayOfWeekType#getWeekNumber()
	 * @see #getStartDayOfWeekType()
	 * @generated
	 */
	EAttribute getStartDayOfWeekType_WeekNumber();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.StartNodeType <em>Start Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartNodeType
	 * @generated
	 */
	EClass getStartNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.StartNodeType#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Point</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartNodeType#getEntryPoint()
	 * @see #getStartNodeType()
	 * @generated
	 */
	EReference getStartNodeType_EntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.StartNodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.StartNodeType#getName()
	 * @see #getStartNodeType()
	 * @generated
	 */
	EAttribute getStartNodeType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.StopNodeType <em>Stop Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Node Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.StopNodeType
	 * @generated
	 */
	EClass getStopNodeType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.StopNodeType#getAssociatedOutputCriterion <em>Associated Output Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Output Criterion</em>'.
	 * @see com.ibm.wbim.bom.schema1.StopNodeType#getAssociatedOutputCriterion()
	 * @see #getStopNodeType()
	 * @generated
	 */
	EAttribute getStopNodeType_AssociatedOutputCriterion();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.StopNodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.StopNodeType#getName()
	 * @see #getStopNodeType()
	 * @generated
	 */
	EAttribute getStopNodeType_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.TargetType
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.TargetType#getContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Point</em>'.
	 * @see com.ibm.wbim.bom.schema1.TargetType#getContactPoint()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_ContactPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.TargetType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see com.ibm.wbim.bom.schema1.TargetType#getNode()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Node();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Task#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getPrecondition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Task#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getPostcondition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Postcondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Task#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getResources()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Task#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizations</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getOrganizations()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Organizations();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Task#getOperationalData <em>Operational Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operational Data</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getOperationalData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OperationalData();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Task#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getExtendedAttributes()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ExtendedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement <em>Task Individual Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Individual Resource Requirement</em>'.
	 * @see com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement
	 * @generated
	 */
	EClass getTaskIndividualResourceRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Criteria</em>'.
	 * @see com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement#getCriteria()
	 * @see #getTaskIndividualResourceRequirement()
	 * @generated
	 */
	EReference getTaskIndividualResourceRequirement_Criteria();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TasksType <em>Tasks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.TasksType
	 * @generated
	 */
	EClass getTasksType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.TasksType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see com.ibm.wbim.bom.schema1.TasksType#getTask()
	 * @see #getTasksType()
	 * @generated
	 */
	EReference getTasksType_Task();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TimeEstimationType <em>Time Estimation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Estimation Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeEstimationType
	 * @generated
	 */
	EClass getTimeEstimationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimeEstimationType#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Time</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeEstimationType#getProcessingTime()
	 * @see #getTimeEstimationType()
	 * @generated
	 */
	EReference getTimeEstimationType_ProcessingTime();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimeEstimationType#getMaxResourceWaitingTime <em>Max Resource Waiting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Resource Waiting Time</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeEstimationType#getMaxResourceWaitingTime()
	 * @see #getTimeEstimationType()
	 * @generated
	 */
	EReference getTimeEstimationType_MaxResourceWaitingTime();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Timer#getTimerSetting <em>Timer Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Setting</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timer#getTimerSetting()
	 * @see #getTimer()
	 * @generated
	 */
	EReference getTimer_TimerSetting();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TimerSettingType <em>Timer Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Setting Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimerSettingType
	 * @generated
	 */
	EClass getTimerSettingType();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getBasedOnTimetable <em>Based On Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Based On Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimerSettingType#getBasedOnTimetable()
	 * @see #getTimerSettingType()
	 * @generated
	 */
	EReference getTimerSettingType_BasedOnTimetable();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getConstantTime <em>Constant Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant Time</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimerSettingType#getConstantTime()
	 * @see #getTimerSettingType()
	 * @generated
	 */
	EReference getTimerSettingType_ConstantTime();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getLastActivationTimePlus <em>Last Activation Time Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Activation Time Plus</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimerSettingType#getLastActivationTimePlus()
	 * @see #getTimerSettingType()
	 * @generated
	 */
	EReference getTimerSettingType_LastActivationTimePlus();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getTimerExpression <em>Timer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Expression</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimerSettingType#getTimerExpression()
	 * @see #getTimerSettingType()
	 * @generated
	 */
	EReference getTimerSettingType_TimerExpression();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Timetable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getDocumentation()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Timetable#getRecurringTimeInterval <em>Recurring Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recurring Time Interval</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getRecurringTimeInterval()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_RecurringTimeInterval();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.Timetable#getExemptionPeriod <em>Exemption Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exemption Period</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getExemptionPeriod()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_ExemptionPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.Timetable#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getExtendedAttributes()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_ExtendedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Timetable#getBeginingOn <em>Begining On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begining On</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getBeginingOn()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_BeginingOn();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Timetable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getName()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Timetable#getNumberOfTimesToRepeat <em>Number Of Times To Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Times To Repeat</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getNumberOfTimesToRepeat()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_NumberOfTimesToRepeat();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.Timetable#getRepetitionPeriod <em>Repetition Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Period</em>'.
	 * @see com.ibm.wbim.bom.schema1.Timetable#getRepetitionPeriod()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_RepetitionPeriod();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TimetablesType <em>Timetables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetables Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimetablesType
	 * @generated
	 */
	EClass getTimetablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.TimetablesType#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimetablesType#getTimetable()
	 * @see #getTimetablesType()
	 * @generated
	 */
	EReference getTimetablesType_Timetable();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeValue
	 * @generated
	 */
	EClass getTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.TimeValue#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeValue#getLiteralValue()
	 * @see #getTimeValue()
	 * @generated
	 */
	EAttribute getTimeValue_LiteralValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TimeValue#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeValue#getDistribution()
	 * @see #getTimeValue()
	 * @generated
	 */
	EReference getTimeValue_Distribution();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see com.ibm.wbim.bom.schema1.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link com.ibm.wbim.bom.schema1.TypeDeclaration#getComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Data Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.TypeDeclaration#getComplexDataType()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_ComplexDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.TypeDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.wbim.bom.schema1.TypeDeclaration#getName()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EAttribute getTypeDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.UniformType <em>Uniform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.UniformType
	 * @generated
	 */
	EClass getUniformType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.UniformType#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see com.ibm.wbim.bom.schema1.UniformType#getMaximum()
	 * @see #getUniformType()
	 * @generated
	 */
	EAttribute getUniformType_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.UniformType#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see com.ibm.wbim.bom.schema1.UniformType#getMinimum()
	 * @see #getUniformType()
	 * @generated
	 */
	EAttribute getUniformType_Minimum();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.ValueType#getValue()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.ValueType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see com.ibm.wbim.bom.schema1.ValueType#getProbability()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Probability();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.WeightedListType <em>Weighted List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighted List Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.WeightedListType
	 * @generated
	 */
	EClass getWeightedListType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ibm.wbim.bom.schema1.WeightedListType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see com.ibm.wbim.bom.schema1.WeightedListType#getValue()
	 * @see #getWeightedListType()
	 * @generated
	 */
	EReference getWeightedListType_Value();

	/**
	 * Returns the meta object for class '{@link com.ibm.wbim.bom.schema1.WhenCostApplicableType <em>When Cost Applicable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Cost Applicable Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.WhenCostApplicableType
	 * @generated
	 */
	EClass getWhenCostApplicableType();

	/**
	 * Returns the meta object for the attribute '{@link com.ibm.wbim.bom.schema1.WhenCostApplicableType#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable</em>'.
	 * @see com.ibm.wbim.bom.schema1.WhenCostApplicableType#getTimetable()
	 * @see #getWhenCostApplicableType()
	 * @generated
	 */
	EAttribute getWhenCostApplicableType_Timetable();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.BasicDataType <em>Basic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Data Type</em>'.
	 * @see com.ibm.wbim.bom.schema1.BasicDataType
	 * @generated
	 */
	EEnum getBasicDataType();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see com.ibm.wbim.bom.schema1.Currency
	 * @generated
	 */
	EEnum getCurrency();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see com.ibm.wbim.bom.schema1.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.MultipleInstancesMatch <em>Multiple Instances Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiple Instances Match</em>'.
	 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
	 * @generated
	 */
	EEnum getMultipleInstancesMatch();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.NoInstancesMatch <em>No Instances Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>No Instances Match</em>'.
	 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
	 * @generated
	 */
	EEnum getNoInstancesMatch();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link com.ibm.wbim.bom.schema1.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see com.ibm.wbim.bom.schema1.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Associated Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Associated Data Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='associatedData_._type' memberTypes='BasicDataType ElementName'"
	 * @generated
	 */
	EDataType getAssociatedDataType();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.BasicDataType <em>Basic Data Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Basic Data Type Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.BasicDataType
	 * @model instanceClass="com.ibm.wbim.bom.schema1.BasicDataType"
	 *        extendedMetaData="name='BasicDataType:Object' baseType='BasicDataType'"
	 * @generated
	 */
	EDataType getBasicDataTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.Currency <em>Currency Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.Currency
	 * @model instanceClass="com.ibm.wbim.bom.schema1.Currency"
	 *        extendedMetaData="name='Currency:Object' baseType='Currency'"
	 * @generated
	 */
	EDataType getCurrencyObject();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.DayOfWeek <em>Day Of Week Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Day Of Week Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.DayOfWeek
	 * @model instanceClass="com.ibm.wbim.bom.schema1.DayOfWeek"
	 *        extendedMetaData="name='DayOfWeek:Object' baseType='DayOfWeek'"
	 * @generated
	 */
	EDataType getDayOfWeekObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Element Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ElementName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.* .*##.*'"
	 * @generated
	 */
	EDataType getElementName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Instance Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instance Of Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='instanceOf_._type' memberTypes='PredefinedResourceType PredefinedOrganizationType ElementName'"
	 * @generated
	 */
	EDataType getInstanceOfType();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.MultipleInstancesMatch <em>Multiple Instances Match Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiple Instances Match Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
	 * @model instanceClass="com.ibm.wbim.bom.schema1.MultipleInstancesMatch"
	 *        extendedMetaData="name='MultipleInstancesMatch:Object' baseType='MultipleInstancesMatch'"
	 * @generated
	 */
	EDataType getMultipleInstancesMatchObject();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.NoInstancesMatch <em>No Instances Match Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>No Instances Match Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
	 * @model instanceClass="com.ibm.wbim.bom.schema1.NoInstancesMatch"
	 *        extendedMetaData="name='NoInstancesMatch:Object' baseType='NoInstancesMatch'"
	 * @generated
	 */
	EDataType getNoInstancesMatchObject();

	/**
	 * Returns the meta object for data type '<em>Non Negative Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Double</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='NonNegativeDouble' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0'"
	 * @generated
	 */
	EDataType getNonNegativeDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Non Negative Double Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Double Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='NonNegativeDouble:Object' baseType='NonNegativeDouble'"
	 * @generated
	 */
	EDataType getNonNegativeDoubleObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Parent Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parent Template Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='parentTemplate_._type' memberTypes='PredefinedResourceType PredefinedOrganizationType ElementName'"
	 * @generated
	 */
	EDataType getParentTemplateType();

	/**
	 * Returns the meta object for data type '<em>Percentage Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percentage Value</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='PercentageValue' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0' maxInclusive='100'"
	 * @generated
	 */
	EDataType getPercentageValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Percentage Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percentage Value Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='PercentageValue:Object' baseType='PercentageValue'"
	 * @generated
	 */
	EDataType getPercentageValueObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Predefined Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Predefined Organization Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PredefinedOrganizationType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' enumeration='Organization%20template Organization'"
	 * @generated
	 */
	EDataType getPredefinedOrganizationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Predefined Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Predefined Resource Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PredefinedResourceType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' enumeration='Person%20template Resource%20template Staff%20template Communication%20Service Equipment Facility General%20Service Machine Person Staff Tool'"
	 * @generated
	 */
	EDataType getPredefinedResourceType();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.TimeUnit <em>Time Unit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Unit Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.TimeUnit
	 * @model instanceClass="com.ibm.wbim.bom.schema1.TimeUnit"
	 *        extendedMetaData="name='TimeUnit:Object' baseType='TimeUnit'"
	 * @generated
	 */
	EDataType getTimeUnitObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='type_._type' memberTypes='BasicDataType ElementName'"
	 * @generated
	 */
	EDataType getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Type Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type2</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='type_._2_._type' memberTypes='BasicDataType PredefinedResourceType PredefinedOrganizationType ElementName'"
	 * @generated
	 */
	EDataType getTypeType2();

	/**
	 * Returns the meta object for data type '{@link com.ibm.wbim.bom.schema1.TypeType1 <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see com.ibm.wbim.bom.schema1.TypeType1
	 * @model instanceClass="com.ibm.wbim.bom.schema1.TypeType1"
	 *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Unit' baseType='http://www.eclipse.org/emf/2003/XMLType#string' enumeration='acre centimeter foot gallon%20(UK) gallon%20(US) gram hectare inch kilogram kilometer liter meter mile ounce pint%20(UK) pint%20(US) pound unit yard'"
	 * @generated
	 */
	EDataType getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Schema1Factory getSchema1Factory();

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
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AdditionalInputTypeImpl <em>Additional Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AdditionalInputTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAdditionalInputType()
		 * @generated
		 */
		EClass ADDITIONAL_INPUT_TYPE = eINSTANCE.getAdditionalInputType();

		/**
		 * The meta object literal for the '<em><b>Input Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_INPUT_TYPE__INPUT_CRITERION = eINSTANCE.getAdditionalInputType_InputCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_INPUT_TYPE__NAME = eINSTANCE.getAdditionalInputType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AdditionalOutputTypeImpl <em>Additional Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AdditionalOutputTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAdditionalOutputType()
		 * @generated
		 */
		EClass ADDITIONAL_OUTPUT_TYPE = eINSTANCE.getAdditionalOutputType();

		/**
		 * The meta object literal for the '<em><b>Output Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_OUTPUT_TYPE__OUTPUT_CRITERION = eINSTANCE.getAdditionalOutputType_OutputCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_OUTPUT_TYPE__NAME = eINSTANCE.getAdditionalOutputType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AnnotatedNodeTypeImpl <em>Annotated Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AnnotatedNodeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAnnotatedNodeType()
		 * @generated
		 */
		EClass ANNOTATED_NODE_TYPE = eINSTANCE.getAnnotatedNodeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATED_NODE_TYPE__NAME = eINSTANCE.getAnnotatedNodeType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AnnotationImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__ANNOTATION_TEXT = eINSTANCE.getAnnotation_AnnotationText();

		/**
		 * The meta object literal for the '<em><b>Annotated Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATED_NODE = eINSTANCE.getAnnotation_AnnotatedNode();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AttributeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__RULE = eINSTANCE.getAttribute_Rule();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ORDERED = eINSTANCE.getAttribute_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_READ_ONLY = eINSTANCE.getAttribute_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_STATIC = eINSTANCE.getAttribute_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_UNIQUE = eINSTANCE.getAttribute_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MAXIMUM = eINSTANCE.getAttribute_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MINIMUM = eINSTANCE.getAttribute_Minimum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AttributeValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__GROUP = eINSTANCE.getAttributeValue_Group();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__LITERAL_VALUE = eINSTANCE.getAttributeValue_LiteralValue();

		/**
		 * The meta object literal for the '<em><b>Expression Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__EXPRESSION_VALUE = eINSTANCE.getAttributeValue_ExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Public Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__PUBLIC_INSTANCE = eINSTANCE.getAttributeValue_PublicInstance();

		/**
		 * The meta object literal for the '<em><b>Private Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__PRIVATE_INSTANCE = eINSTANCE.getAttributeValue_PrivateInstance();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__ATTRIBUTE = eINSTANCE.getAttributeValue_Attribute();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.AvailabilityImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__TIMETABLE = eINSTANCE.getAvailability_Timetable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BasedOnTimetableTypeImpl <em>Based On Timetable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BasedOnTimetableTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBasedOnTimetableType()
		 * @generated
		 */
		EClass BASED_ON_TIMETABLE_TYPE = eINSTANCE.getBasedOnTimetableType();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASED_ON_TIMETABLE_TYPE__TIMETABLE = eINSTANCE.getBasedOnTimetableType_Timetable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceImpl <em>Bulk Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResource()
		 * @generated
		 */
		EClass BULK_RESOURCE = eINSTANCE.getBulkResource();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource Cost Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_RESOURCE__BULK_RESOURCE_COST_TYPE = eINSTANCE.getBulkResource_BulkResourceCostType();

		/**
		 * The meta object literal for the '<em><b>One Time Cost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE__ONE_TIME_COST = eINSTANCE.getBulkResource_OneTimeCost();

		/**
		 * The meta object literal for the '<em><b>Cost Per Quantity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE__COST_PER_QUANTITY = eINSTANCE.getBulkResource_CostPerQuantity();

		/**
		 * The meta object literal for the '<em><b>Cost Per Quantity And Time Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE__COST_PER_QUANTITY_AND_TIME_UNIT = eINSTANCE.getBulkResource_CostPerQuantityAndTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Available Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE__AVAILABLE_QUANTITY = eINSTANCE.getBulkResource_AvailableQuantity();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE__AVAILABILITY = eINSTANCE.getBulkResource_Availability();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE__QUALIFICATION = eINSTANCE.getBulkResource_Qualification();

		/**
		 * The meta object literal for the '<em><b>Is Consumable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_RESOURCE__IS_CONSUMABLE = eINSTANCE.getBulkResource_IsConsumable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionsTypeImpl <em>Bulk Resource Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourceDefinitionsType()
		 * @generated
		 */
		EClass BULK_RESOURCE_DEFINITIONS_TYPE = eINSTANCE.getBulkResourceDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE_DEFINITIONS_TYPE__BULK_RESOURCE_DEFINITION = eINSTANCE.getBulkResourceDefinitionsType_BulkResourceDefinition();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionTemplatesTypeImpl <em>Bulk Resource Definition Templates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceDefinitionTemplatesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourceDefinitionTemplatesType()
		 * @generated
		 */
		EClass BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE = eINSTANCE.getBulkResourceDefinitionTemplatesType();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource Definition Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE_DEFINITION_TEMPLATES_TYPE__BULK_RESOURCE_DEFINITION_TEMPLATE = eINSTANCE.getBulkResourceDefinitionTemplatesType_BulkResourceDefinitionTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl <em>Bulk Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BulkResourceRequirementImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourceRequirement()
		 * @generated
		 */
		EClass BULK_RESOURCE_REQUIREMENT = eINSTANCE.getBulkResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Resource Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCE_REQUIREMENT__RESOURCE_QUANTITY = eINSTANCE.getBulkResourceRequirement_ResourceQuantity();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_RESOURCE_REQUIREMENT__BULK_RESOURCE = eINSTANCE.getBulkResourceRequirement_BulkResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_RESOURCE_REQUIREMENT__NAME = eINSTANCE.getBulkResourceRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Time Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_RESOURCE_REQUIREMENT__TIME_REQUIRED = eINSTANCE.getBulkResourceRequirement_TimeRequired();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BulkResourcesTypeImpl <em>Bulk Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BulkResourcesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBulkResourcesType()
		 * @generated
		 */
		EClass BULK_RESOURCES_TYPE = eINSTANCE.getBulkResourcesType();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BULK_RESOURCES_TYPE__BULK_RESOURCE = eINSTANCE.getBulkResourcesType_BulkResource();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BusinessItemInstancesTypeImpl <em>Business Item Instances Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BusinessItemInstancesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBusinessItemInstancesType()
		 * @generated
		 */
		EClass BUSINESS_ITEM_INSTANCES_TYPE = eINSTANCE.getBusinessItemInstancesType();

		/**
		 * The meta object literal for the '<em><b>Business Item Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ITEM_INSTANCES_TYPE__BUSINESS_ITEM_INSTANCE = eINSTANCE.getBusinessItemInstancesType_BusinessItemInstance();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BusinessItemsTypeImpl <em>Business Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BusinessItemsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBusinessItemsType()
		 * @generated
		 */
		EClass BUSINESS_ITEMS_TYPE = eINSTANCE.getBusinessItemsType();

		/**
		 * The meta object literal for the '<em><b>Business Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ITEMS_TYPE__BUSINESS_ITEM = eINSTANCE.getBusinessItemsType_BusinessItem();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.BusinessItemTemplatesTypeImpl <em>Business Item Templates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.BusinessItemTemplatesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBusinessItemTemplatesType()
		 * @generated
		 */
		EClass BUSINESS_ITEM_TEMPLATES_TYPE = eINSTANCE.getBusinessItemTemplatesType();

		/**
		 * The meta object literal for the '<em><b>Business Item Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ITEM_TEMPLATES_TYPE__BUSINESS_ITEM_TEMPLATE = eINSTANCE.getBusinessItemTemplatesType_BusinessItemTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CallToProcessTypeImpl <em>Call To Process Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CallToProcessTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCallToProcessType()
		 * @generated
		 */
		EClass CALL_TO_PROCESS_TYPE = eINSTANCE.getCallToProcessType();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_TO_PROCESS_TYPE__PROCESS = eINSTANCE.getCallToProcessType_Process();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CallToServiceTypeImpl <em>Call To Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CallToServiceTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCallToServiceType()
		 * @generated
		 */
		EClass CALL_TO_SERVICE_TYPE = eINSTANCE.getCallToServiceType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_TO_SERVICE_TYPE__SERVICE = eINSTANCE.getCallToServiceType_Service();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CallToTaskTypeImpl <em>Call To Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CallToTaskTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCallToTaskType()
		 * @generated
		 */
		EClass CALL_TO_TASK_TYPE = eINSTANCE.getCallToTaskType();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_TO_TASK_TYPE__TASK = eINSTANCE.getCallToTaskType_Task();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CatalogImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CATALOG = eINSTANCE.getCatalog_Catalog();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__ID = eINSTANCE.getCatalog_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__NAME = eINSTANCE.getCatalog_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CatalogsImpl <em>Catalogs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CatalogsImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCatalogs()
		 * @generated
		 */
		EClass CATALOGS = eINSTANCE.getCatalogs();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGS__CATALOG = eINSTANCE.getCatalogs_Catalog();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl <em>Catalogs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCatalogsType()
		 * @generated
		 */
		EClass CATALOGS_TYPE = eINSTANCE.getCatalogsType();

		/**
		 * The meta object literal for the '<em><b>Data Catalogs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGS_TYPE__DATA_CATALOGS = eINSTANCE.getCatalogsType_DataCatalogs();

		/**
		 * The meta object literal for the '<em><b>Resource Catalogs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGS_TYPE__RESOURCE_CATALOGS = eINSTANCE.getCatalogsType_ResourceCatalogs();

		/**
		 * The meta object literal for the '<em><b>Organization Catalogs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGS_TYPE__ORGANIZATION_CATALOGS = eINSTANCE.getCatalogsType_OrganizationCatalogs();

		/**
		 * The meta object literal for the '<em><b>Process Catalogs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGS_TYPE__PROCESS_CATALOGS = eINSTANCE.getCatalogsType_ProcessCatalogs();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ComplexDataTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getComplexDataType()
		 * @generated
		 */
		EClass COMPLEX_DATA_TYPE = eINSTANCE.getComplexDataType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_DATA_TYPE__DOCUMENTATION = eINSTANCE.getComplexDataType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_TYPE__ATTRIBUTE = eINSTANCE.getComplexDataType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_TYPE__RULE = eINSTANCE.getComplexDataType_Rule();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_TYPE__EXTENDED_ATTRIBUTES = eINSTANCE.getComplexDataType_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Parent Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_DATA_TYPE__PARENT_TEMPLATE = eINSTANCE.getComplexDataType_ParentTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl <em>Complex Data Type Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ComplexDataTypeInstanceImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getComplexDataTypeInstance()
		 * @generated
		 */
		EClass COMPLEX_DATA_TYPE_INSTANCE = eINSTANCE.getComplexDataTypeInstance();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_DATA_TYPE_INSTANCE__DOCUMENTATION = eINSTANCE.getComplexDataTypeInstance_Documentation();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_TYPE_INSTANCE__ATTRIBUTE_VALUE = eINSTANCE.getComplexDataTypeInstance_AttributeValue();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_TYPE_INSTANCE__EXTENDED_ATTRIBUTES = eINSTANCE.getComplexDataTypeInstance_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_DATA_TYPE_INSTANCE__INSTANCE_OF = eINSTANCE.getComplexDataTypeInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_DATA_TYPE_INSTANCE__NAME = eINSTANCE.getComplexDataTypeInstance_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ConnectionImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DESCRIPTION = eINSTANCE.getConnection_Description();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ConstantTimeTypeImpl <em>Constant Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ConstantTimeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getConstantTimeType()
		 * @generated
		 */
		EClass CONSTANT_TIME_TYPE = eINSTANCE.getConstantTimeType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_TIME_TYPE__TIME = eINSTANCE.getConstantTimeType_Time();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ControlActionOutputRefImpl <em>Control Action Output Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ControlActionOutputRefImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getControlActionOutputRef()
		 * @generated
		 */
		EClass CONTROL_ACTION_OUTPUT_REF = eINSTANCE.getControlActionOutputRef();

		/**
		 * The meta object literal for the '<em><b>Repository Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE = eINSTANCE.getControlActionOutputRef_RepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_ACTION_OUTPUT_REF__NAME = eINSTANCE.getControlActionOutputRef_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl <em>Correlation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CorrelationTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCorrelationType()
		 * @generated
		 */
		EClass CORRELATION_TYPE = eINSTANCE.getCorrelationType();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_TYPE__PREDICATE = eINSTANCE.getCorrelationType_Predicate();

		/**
		 * The meta object literal for the '<em><b>Multiple Instances Satisfy Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_TYPE__MULTIPLE_INSTANCES_SATISFY_CONDITION = eINSTANCE.getCorrelationType_MultipleInstancesSatisfyCondition();

		/**
		 * The meta object literal for the '<em><b>No Instances Satisfy Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_TYPE__NO_INSTANCES_SATISFY_CONDITION = eINSTANCE.getCorrelationType_NoInstancesSatisfyCondition();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerQuantityImpl <em>Cost Per Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CostPerQuantityImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerQuantity()
		 * @generated
		 */
		EClass COST_PER_QUANTITY = eINSTANCE.getCostPerQuantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PER_QUANTITY__UNIT = eINSTANCE.getCostPerQuantity_Unit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerQuantityAndTimeUnitImpl <em>Cost Per Quantity And Time Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CostPerQuantityAndTimeUnitImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerQuantityAndTimeUnit()
		 * @generated
		 */
		EClass COST_PER_QUANTITY_AND_TIME_UNIT = eINSTANCE.getCostPerQuantityAndTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PER_QUANTITY_AND_TIME_UNIT__TIME_UNIT = eINSTANCE.getCostPerQuantityAndTimeUnit_TimeUnit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitImpl <em>Cost Per Time Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerTimeUnit()
		 * @generated
		 */
		EClass COST_PER_TIME_UNIT = eINSTANCE.getCostPerTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PER_TIME_UNIT__TIME_UNIT = eINSTANCE.getCostPerTimeUnit_TimeUnit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitValueImpl <em>Cost Per Time Unit Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CostPerTimeUnitValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostPerTimeUnitValue()
		 * @generated
		 */
		EClass COST_PER_TIME_UNIT_VALUE = eINSTANCE.getCostPerTimeUnitValue();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PER_TIME_UNIT_VALUE__TIME_UNIT = eINSTANCE.getCostPerTimeUnitValue_TimeUnit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CostTypeImpl <em>Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CostTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostType()
		 * @generated
		 */
		EClass COST_TYPE = eINSTANCE.getCostType();

		/**
		 * The meta object literal for the '<em><b>Execution Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__EXECUTION_COST = eINSTANCE.getCostType_ExecutionCost();

		/**
		 * The meta object literal for the '<em><b>Startup Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__STARTUP_COST = eINSTANCE.getCostType_StartupCost();

		/**
		 * The meta object literal for the '<em><b>Resource Waiting Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__RESOURCE_WAITING_COST = eINSTANCE.getCostType_ResourceWaitingCost();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CostValueImpl <em>Cost Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CostValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCostValue()
		 * @generated
		 */
		EClass COST_VALUE = eINSTANCE.getCostValue();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_VALUE__LITERAL_VALUE = eINSTANCE.getCostValue_LiteralValue();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_VALUE__DISTRIBUTION = eINSTANCE.getCostValue_Distribution();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_VALUE__CURRENCY = eINSTANCE.getCostValue_Currency();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl <em>Criteria Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.CriteriaTemplateImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCriteriaTemplate()
		 * @generated
		 */
		EClass CRITERIA_TEMPLATE = eINSTANCE.getCriteriaTemplate();

		/**
		 * The meta object literal for the '<em><b>Manager Of Employee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE = eINSTANCE.getCriteriaTemplate_ManagerOfEmployee();

		/**
		 * The meta object literal for the '<em><b>Manager Of Employee By ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__MANAGER_OF_EMPLOYEE_BY_ID = eINSTANCE.getCriteriaTemplate_ManagerOfEmployeeByID();

		/**
		 * The meta object literal for the '<em><b>Person Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__PERSON_SEARCH = eINSTANCE.getCriteriaTemplate_PersonSearch();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__PERSON_NAME = eINSTANCE.getCriteriaTemplate_PersonName();

		/**
		 * The meta object literal for the '<em><b>Group Members</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__GROUP_MEMBERS = eINSTANCE.getCriteriaTemplate_GroupMembers();

		/**
		 * The meta object literal for the '<em><b>Group Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__GROUP_SEARCH = eINSTANCE.getCriteriaTemplate_GroupSearch();

		/**
		 * The meta object literal for the '<em><b>Organization Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA_TEMPLATE__ORGANIZATION_MANAGER = eINSTANCE.getCriteriaTemplate_OrganizationManager();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.DataModelImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Business Item Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__BUSINESS_ITEM_TEMPLATES = eINSTANCE.getDataModel_BusinessItemTemplates();

		/**
		 * The meta object literal for the '<em><b>Business Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__BUSINESS_ITEMS = eINSTANCE.getDataModel_BusinessItems();

		/**
		 * The meta object literal for the '<em><b>Business Item Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__BUSINESS_ITEM_INSTANCES = eINSTANCE.getDataModel_BusinessItemInstances();

		/**
		 * The meta object literal for the '<em><b>Notification Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__NOTIFICATION_TEMPLATES = eINSTANCE.getDataModel_NotificationTemplates();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__NOTIFICATIONS = eINSTANCE.getDataModel_Notifications();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.DecisionImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__DESCRIPTION = eINSTANCE.getDecision_Description();

		/**
		 * The meta object literal for the '<em><b>Input Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__INPUT_BRANCH = eINSTANCE.getDecision_InputBranch();

		/**
		 * The meta object literal for the '<em><b>Output Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__OUTPUT_BRANCH = eINSTANCE.getDecision_OutputBranch();

		/**
		 * The meta object literal for the '<em><b>Is Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__IS_INCLUSIVE = eINSTANCE.getDecision_IsInclusive();

		/**
		 * The meta object literal for the '<em><b>Is Simple Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__IS_SIMPLE_DECISION = eINSTANCE.getDecision_IsSimpleDecision();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__NAME = eINSTANCE.getDecision_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.DefaultValueImpl <em>Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.DefaultValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDefaultValue()
		 * @generated
		 */
		EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE__LITERAL_VALUE = eINSTANCE.getDefaultValue_LiteralValue();

		/**
		 * The meta object literal for the '<em><b>Expression Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE__EXPRESSION_VALUE = eINSTANCE.getDefaultValue_ExpressionValue();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl <em>Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDistributionType()
		 * @generated
		 */
		EClass DISTRIBUTION_TYPE = eINSTANCE.getDistributionType();

		/**
		 * The meta object literal for the '<em><b>Exponential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__EXPONENTIAL = eINSTANCE.getDistributionType_Exponential();

		/**
		 * The meta object literal for the '<em><b>Gamma</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__GAMMA = eINSTANCE.getDistributionType_Gamma();

		/**
		 * The meta object literal for the '<em><b>Lognormal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__LOGNORMAL = eINSTANCE.getDistributionType_Lognormal();

		/**
		 * The meta object literal for the '<em><b>Normal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__NORMAL = eINSTANCE.getDistributionType_Normal();

		/**
		 * The meta object literal for the '<em><b>Poisson</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__POISSON = eINSTANCE.getDistributionType_Poisson();

		/**
		 * The meta object literal for the '<em><b>Random List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__RANDOM_LIST = eINSTANCE.getDistributionType_RandomList();

		/**
		 * The meta object literal for the '<em><b>Uniform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__UNIFORM = eINSTANCE.getDistributionType_Uniform();

		/**
		 * The meta object literal for the '<em><b>Weighted List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__WEIGHTED_LIST = eINSTANCE.getDistributionType_WeightedList();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.DistributionType1Impl <em>Distribution Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.DistributionType1Impl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDistributionType1()
		 * @generated
		 */
		EClass DISTRIBUTION_TYPE1 = eINSTANCE.getDistributionType1();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE1__TIME_UNIT = eINSTANCE.getDistributionType1_TimeUnit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.DocumentRootImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.EndNodeTypeImpl <em>End Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.EndNodeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getEndNodeType()
		 * @generated
		 */
		EClass END_NODE_TYPE = eINSTANCE.getEndNodeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_NODE_TYPE__NAME = eINSTANCE.getEndNodeType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.EntryPointTypeImpl <em>Entry Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.EntryPointTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getEntryPointType()
		 * @generated
		 */
		EClass ENTRY_POINT_TYPE = eINSTANCE.getEntryPointType();

		/**
		 * The meta object literal for the '<em><b>Input Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT_TYPE__INPUT_CRITERION = eINSTANCE.getEntryPointType_InputCriterion();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ExemptionPeriodTypeImpl <em>Exemption Period Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ExemptionPeriodTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExemptionPeriodType()
		 * @generated
		 */
		EClass EXEMPTION_PERIOD_TYPE = eINSTANCE.getExemptionPeriodType();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPTION_PERIOD_TYPE__TIMETABLE = eINSTANCE.getExemptionPeriodType_Timetable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ExponentialTypeImpl <em>Exponential Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ExponentialTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExponentialType()
		 * @generated
		 */
		EClass EXPONENTIAL_TYPE = eINSTANCE.getExponentialType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_TYPE__MEAN = eINSTANCE.getExponentialType_Mean();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ExpressionImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__DESCRIPTION = eINSTANCE.getExpression_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ExtendedAttributesImpl <em>Extended Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ExtendedAttributesImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExtendedAttributes()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTES = eINSTANCE.getExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Extended Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_ATTRIBUTES__EXTENDED_ATTRIBUTE = eINSTANCE.getExtendedAttributes_ExtendedAttribute();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ExtendedAttributeTypeImpl <em>Extended Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ExtendedAttributeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getExtendedAttributeType()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTE_TYPE = eINSTANCE.getExtendedAttributeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__MIXED = eINSTANCE.getExtendedAttributeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__GROUP = eINSTANCE.getExtendedAttributeType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__ANY = eINSTANCE.getExtendedAttributeType_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__NAME = eINSTANCE.getExtendedAttributeType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getExtendedAttributeType_Value();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl <em>Flow Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.FlowContentTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getFlowContentType()
		 * @generated
		 */
		EClass FLOW_CONTENT_TYPE = eINSTANCE.getFlowContentType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_CONTENT_TYPE__GROUP = eINSTANCE.getFlowContentType_Group();

		/**
		 * The meta object literal for the '<em><b>Start Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__START_NODE = eINSTANCE.getFlowContentType_StartNode();

		/**
		 * The meta object literal for the '<em><b>Stop Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__STOP_NODE = eINSTANCE.getFlowContentType_StopNode();

		/**
		 * The meta object literal for the '<em><b>End Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__END_NODE = eINSTANCE.getFlowContentType_EndNode();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__TASK = eINSTANCE.getFlowContentType_Task();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__DECISION = eINSTANCE.getFlowContentType_Decision();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__MERGE = eINSTANCE.getFlowContentType_Merge();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__FORK = eINSTANCE.getFlowContentType_Fork();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__JOIN = eINSTANCE.getFlowContentType_Join();

		/**
		 * The meta object literal for the '<em><b>Notification Broadcaster</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__NOTIFICATION_BROADCASTER = eINSTANCE.getFlowContentType_NotificationBroadcaster();

		/**
		 * The meta object literal for the '<em><b>Notification Receiver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__NOTIFICATION_RECEIVER = eINSTANCE.getFlowContentType_NotificationReceiver();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__OBSERVER = eINSTANCE.getFlowContentType_Observer();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__TIMER = eINSTANCE.getFlowContentType_Timer();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__MAP = eINSTANCE.getFlowContentType_Map();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__LOOP = eINSTANCE.getFlowContentType_Loop();

		/**
		 * The meta object literal for the '<em><b>For Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__FOR_LOOP = eINSTANCE.getFlowContentType_ForLoop();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__PROCESS = eINSTANCE.getFlowContentType_Process();

		/**
		 * The meta object literal for the '<em><b>Local Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__LOCAL_REPOSITORY = eINSTANCE.getFlowContentType_LocalRepository();

		/**
		 * The meta object literal for the '<em><b>Call To Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__CALL_TO_PROCESS = eINSTANCE.getFlowContentType_CallToProcess();

		/**
		 * The meta object literal for the '<em><b>Call To Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__CALL_TO_TASK = eINSTANCE.getFlowContentType_CallToTask();

		/**
		 * The meta object literal for the '<em><b>Call To Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__CALL_TO_SERVICE = eINSTANCE.getFlowContentType_CallToService();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__CONNECTION = eINSTANCE.getFlowContentType_Connection();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CONTENT_TYPE__ANNOTATION = eINSTANCE.getFlowContentType_Annotation();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ForkImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK__DESCRIPTION = eINSTANCE.getFork_Description();

		/**
		 * The meta object literal for the '<em><b>Input Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__INPUT_BRANCH = eINSTANCE.getFork_InputBranch();

		/**
		 * The meta object literal for the '<em><b>Output Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__OUTPUT_BRANCH = eINSTANCE.getFork_OutputBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK__NAME = eINSTANCE.getFork_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ForLoopImpl <em>For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ForLoopImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getForLoop()
		 * @generated
		 */
		EClass FOR_LOOP = eINSTANCE.getForLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__LOOP_CONDITION = eINSTANCE.getForLoop_LoopCondition();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.GammaTypeImpl <em>Gamma Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.GammaTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGammaType()
		 * @generated
		 */
		EClass GAMMA_TYPE = eINSTANCE.getGammaType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMMA_TYPE__MEAN = eINSTANCE.getGammaType_Mean();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMMA_TYPE__STANDARD_DEVIATION = eINSTANCE.getGammaType_StandardDeviation();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.GlobalRepositoryRefImpl <em>Global Repository Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.GlobalRepositoryRefImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGlobalRepositoryRef()
		 * @generated
		 */
		EClass GLOBAL_REPOSITORY_REF = eINSTANCE.getGlobalRepositoryRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_REPOSITORY_REF__NAME = eINSTANCE.getGlobalRepositoryRef_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl <em>Group Members Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.GroupMembersTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGroupMembersType()
		 * @generated
		 */
		EClass GROUP_MEMBERS_TYPE = eINSTANCE.getGroupMembersType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_MEMBERS_TYPE__GROUP = eINSTANCE.getGroupMembersType_Group();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_MEMBERS_TYPE__DOMAIN = eINSTANCE.getGroupMembersType_Domain();

		/**
		 * The meta object literal for the '<em><b>Include Subgroups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_MEMBERS_TYPE__INCLUDE_SUBGROUPS = eINSTANCE.getGroupMembersType_IncludeSubgroups();

		/**
		 * The meta object literal for the '<em><b>Alternative Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME1 = eINSTANCE.getGroupMembersType_AlternativeName1();

		/**
		 * The meta object literal for the '<em><b>Alternative Name2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_MEMBERS_TYPE__ALTERNATIVE_NAME2 = eINSTANCE.getGroupMembersType_AlternativeName2();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl <em>Group Search Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.GroupSearchTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getGroupSearchType()
		 * @generated
		 */
		EClass GROUP_SEARCH_TYPE = eINSTANCE.getGroupSearchType();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__GROUP_ID = eINSTANCE.getGroupSearchType_GroupId();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__PROFILE = eINSTANCE.getGroupSearchType_Profile();

		/**
		 * The meta object literal for the '<em><b>Industry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__INDUSTRY_TYPE = eINSTANCE.getGroupSearchType_IndustryType();

		/**
		 * The meta object literal for the '<em><b>Business Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__BUSINESS_TYPE = eINSTANCE.getGroupSearchType_BusinessType();

		/**
		 * The meta object literal for the '<em><b>Geographic Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__GEOGRAPHIC_LOCATION = eINSTANCE.getGroupSearchType_GeographicLocation();

		/**
		 * The meta object literal for the '<em><b>Affiliates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__AFFILIATES = eINSTANCE.getGroupSearchType_Affiliates();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__DISPLAY_NAME = eINSTANCE.getGroupSearchType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Secretary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__SECRETARY = eINSTANCE.getGroupSearchType_Secretary();

		/**
		 * The meta object literal for the '<em><b>Assistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__ASSISTANT = eINSTANCE.getGroupSearchType_Assistant();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__MANAGER = eINSTANCE.getGroupSearchType_Manager();

		/**
		 * The meta object literal for the '<em><b>Business Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__BUSINESS_CATEGORY = eINSTANCE.getGroupSearchType_BusinessCategory();

		/**
		 * The meta object literal for the '<em><b>Parent Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SEARCH_TYPE__PARENT_COMPANY = eINSTANCE.getGroupSearchType_ParentCompany();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl <em>Individual Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResource()
		 * @generated
		 */
		EClass INDIVIDUAL_RESOURCE = eINSTANCE.getIndividualResource();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Cost Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE = eINSTANCE.getIndividualResource_IndividualResourceCostType();

		/**
		 * The meta object literal for the '<em><b>One Time Cost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCE__ONE_TIME_COST = eINSTANCE.getIndividualResource_OneTimeCost();

		/**
		 * The meta object literal for the '<em><b>Cost Per Time Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT = eINSTANCE.getIndividualResource_CostPerTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCE__AVAILABILITY = eINSTANCE.getIndividualResource_Availability();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCE__QUALIFICATION = eINSTANCE.getIndividualResource_Qualification();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionsTypeImpl <em>Individual Resource Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourceDefinitionsType()
		 * @generated
		 */
		EClass INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE = eINSTANCE.getIndividualResourceDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION = eINSTANCE.getIndividualResourceDefinitionsType_IndividualResourceDefinition();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionTemplatesTypeImpl <em>Individual Resource Definition Templates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionTemplatesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourceDefinitionTemplatesType()
		 * @generated
		 */
		EClass INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE = eINSTANCE.getIndividualResourceDefinitionTemplatesType();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Definition Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE = eINSTANCE.getIndividualResourceDefinitionTemplatesType_IndividualResourceDefinitionTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl <em>Individual Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourceRequirementImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourceRequirement()
		 * @generated
		 */
		EClass INDIVIDUAL_RESOURCE_REQUIREMENT = eINSTANCE.getIndividualResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Individual Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_RESOURCE_REQUIREMENT__INDIVIDUAL_RESOURCE = eINSTANCE.getIndividualResourceRequirement_IndividualResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_RESOURCE_REQUIREMENT__NAME = eINSTANCE.getIndividualResourceRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Time Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_RESOURCE_REQUIREMENT__TIME_REQUIRED = eINSTANCE.getIndividualResourceRequirement_TimeRequired();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.IndividualResourcesTypeImpl <em>Individual Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.IndividualResourcesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getIndividualResourcesType()
		 * @generated
		 */
		EClass INDIVIDUAL_RESOURCES_TYPE = eINSTANCE.getIndividualResourcesType();

		/**
		 * The meta object literal for the '<em><b>Individual Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_RESOURCES_TYPE__INDIVIDUAL_RESOURCE = eINSTANCE.getIndividualResourcesType_IndividualResource();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__CONSTANT_VALUE = eINSTANCE.getInput_ConstantValue();

		/**
		 * The meta object literal for the '<em><b>Repository Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__REPOSITORY_VALUE = eINSTANCE.getInput_RepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Associated Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ASSOCIATED_DATA = eINSTANCE.getInput_AssociatedData();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__IS_ORDERED = eINSTANCE.getInput_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__IS_UNIQUE = eINSTANCE.getInput_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MAXIMUM = eINSTANCE.getInput_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MINIMUM = eINSTANCE.getInput_Minimum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputBranchImpl <em>Input Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputBranchImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputBranch()
		 * @generated
		 */
		EClass INPUT_BRANCH = eINSTANCE.getInputBranch();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BRANCH__INPUT = eINSTANCE.getInputBranch_Input();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BRANCH__NAME = eINSTANCE.getInputBranch_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputConstantValueImpl <em>Input Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputConstantValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputConstantValue()
		 * @generated
		 */
		EClass INPUT_CONSTANT_VALUE = eINSTANCE.getInputConstantValue();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CONSTANT_VALUE__LITERAL_VALUE = eINSTANCE.getInputConstantValue_LiteralValue();

		/**
		 * The meta object literal for the '<em><b>Public Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE = eINSTANCE.getInputConstantValue_PublicInstance();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputConstantValueTypeImpl <em>Input Constant Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputConstantValueTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputConstantValueType()
		 * @generated
		 */
		EClass INPUT_CONSTANT_VALUE_TYPE = eINSTANCE.getInputConstantValueType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CONSTANT_VALUE_TYPE__INPUT = eINSTANCE.getInputConstantValueType_Input();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputCriterionImpl <em>Input Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputCriterionImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputCriterion()
		 * @generated
		 */
		EClass INPUT_CRITERION = eINSTANCE.getInputCriterion();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CRITERION__INPUT = eINSTANCE.getInputCriterion_Input();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CRITERION__CONSTRAINT = eINSTANCE.getInputCriterion_Constraint();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CRITERION__CORRELATION = eINSTANCE.getInputCriterion_Correlation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CRITERION__NAME = eINSTANCE.getInputCriterion_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputCriterionRefImpl <em>Input Criterion Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputCriterionRefImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputCriterionRef()
		 * @generated
		 */
		EClass INPUT_CRITERION_REF = eINSTANCE.getInputCriterionRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CRITERION_REF__NAME = eINSTANCE.getInputCriterionRef_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputRepositoryValueImpl <em>Input Repository Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputRepositoryValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputRepositoryValue()
		 * @generated
		 */
		EClass INPUT_REPOSITORY_VALUE = eINSTANCE.getInputRepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Local Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY = eINSTANCE.getInputRepositoryValue_LocalRepository();

		/**
		 * The meta object literal for the '<em><b>Global Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY = eINSTANCE.getInputRepositoryValue_GlobalRepository();

		/**
		 * The meta object literal for the '<em><b>At Beginning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REPOSITORY_VALUE__AT_BEGINNING = eINSTANCE.getInputRepositoryValue_AtBeginning();

		/**
		 * The meta object literal for the '<em><b>Is Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REPOSITORY_VALUE__IS_REMOVE = eINSTANCE.getInputRepositoryValue_IsRemove();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputRepositoryValueTypeImpl <em>Input Repository Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputRepositoryValueTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputRepositoryValueType()
		 * @generated
		 */
		EClass INPUT_REPOSITORY_VALUE_TYPE = eINSTANCE.getInputRepositoryValueType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REPOSITORY_VALUE_TYPE__INPUT = eINSTANCE.getInputRepositoryValueType_Input();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputsImpl <em>Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputsImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputs()
		 * @generated
		 */
		EClass INPUTS = eINSTANCE.getInputs();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUTS__INPUT = eINSTANCE.getInputs_Input();

		/**
		 * The meta object literal for the '<em><b>Input Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUTS__INPUT_CRITERION = eINSTANCE.getInputs_InputCriterion();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InputTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInputType()
		 * @generated
		 */
		EClass INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__NAME = eINSTANCE.getInputType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.InvocationImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Input Constant Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__INPUT_CONSTANT_VALUE = eINSTANCE.getInvocation_InputConstantValue();

		/**
		 * The meta object literal for the '<em><b>Input Repository Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__INPUT_REPOSITORY_VALUE = eINSTANCE.getInvocation_InputRepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Output Repository Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__OUTPUT_REPOSITORY_VALUE = eINSTANCE.getInvocation_OutputRepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Additional Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__ADDITIONAL_INPUT = eINSTANCE.getInvocation_AdditionalInput();

		/**
		 * The meta object literal for the '<em><b>Additional Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__ADDITIONAL_OUTPUT = eINSTANCE.getInvocation_AdditionalOutput();

		/**
		 * The meta object literal for the '<em><b>Call Synchronously</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION__CALL_SYNCHRONOUSLY = eINSTANCE.getInvocation_CallSynchronously();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION__NAME = eINSTANCE.getInvocation_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.JoinImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__DESCRIPTION = eINSTANCE.getJoin_Description();

		/**
		 * The meta object literal for the '<em><b>Input Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__INPUT_BRANCH = eINSTANCE.getJoin_InputBranch();

		/**
		 * The meta object literal for the '<em><b>Output Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__OUTPUT_BRANCH = eINSTANCE.getJoin_OutputBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__NAME = eINSTANCE.getJoin_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LastActivationTimePlusTypeImpl <em>Last Activation Time Plus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LastActivationTimePlusTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLastActivationTimePlusType()
		 * @generated
		 */
		EClass LAST_ACTIVATION_TIME_PLUS_TYPE = eINSTANCE.getLastActivationTimePlusType();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_ACTIVATION_TIME_PLUS_TYPE__DURATION = eINSTANCE.getLastActivationTimePlusType_Duration();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LocalRepositoryImpl <em>Local Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LocalRepositoryImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocalRepository()
		 * @generated
		 */
		EClass LOCAL_REPOSITORY = eINSTANCE.getLocalRepository();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__DESCRIPTION = eINSTANCE.getLocalRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__CAPACITY = eINSTANCE.getLocalRepository_Capacity();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__IS_ORDERED = eINSTANCE.getLocalRepository_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__IS_UNIQUE = eINSTANCE.getLocalRepository_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__NAME = eINSTANCE.getLocalRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__TYPE = eINSTANCE.getLocalRepository_Type();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LocalRepositoryRefImpl <em>Local Repository Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LocalRepositoryRefImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocalRepositoryRef()
		 * @generated
		 */
		EClass LOCAL_REPOSITORY_REF = eINSTANCE.getLocalRepositoryRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY_REF__NAME = eINSTANCE.getLocalRepositoryRef_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LocationDefinitionsTypeImpl <em>Location Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LocationDefinitionsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationDefinitionsType()
		 * @generated
		 */
		EClass LOCATION_DEFINITIONS_TYPE = eINSTANCE.getLocationDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Location Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_DEFINITIONS_TYPE__LOCATION_DEFINITION = eINSTANCE.getLocationDefinitionsType_LocationDefinition();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LocationDefinitionTemplatesTypeImpl <em>Location Definition Templates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LocationDefinitionTemplatesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationDefinitionTemplatesType()
		 * @generated
		 */
		EClass LOCATION_DEFINITION_TEMPLATES_TYPE = eINSTANCE.getLocationDefinitionTemplatesType();

		/**
		 * The meta object literal for the '<em><b>Location Definition Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_DEFINITION_TEMPLATES_TYPE__LOCATION_DEFINITION_TEMPLATE = eINSTANCE.getLocationDefinitionTemplatesType_LocationDefinitionTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LocationsTypeImpl <em>Locations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LocationsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationsType()
		 * @generated
		 */
		EClass LOCATIONS_TYPE = eINSTANCE.getLocationsType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_TYPE__LOCATION = eINSTANCE.getLocationsType_Location();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LocationTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__NAME = eINSTANCE.getLocationType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LognormalTypeImpl <em>Lognormal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LognormalTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLognormalType()
		 * @generated
		 */
		EClass LOGNORMAL_TYPE = eINSTANCE.getLognormalType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGNORMAL_TYPE__MEAN = eINSTANCE.getLognormalType_Mean();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGNORMAL_TYPE__STANDARD_DEVIATION = eINSTANCE.getLognormalType_StandardDeviation();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LoopImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_CONDITION = eINSTANCE.getLoop_LoopCondition();

		/**
		 * The meta object literal for the '<em><b>Is Condition Tested First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__IS_CONDITION_TESTED_FIRST = eINSTANCE.getLoop_IsConditionTestedFirst();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl <em>Loop Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.LoopConditionTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getLoopConditionType()
		 * @generated
		 */
		EClass LOOP_CONDITION_TYPE = eINSTANCE.getLoopConditionType();

		/**
		 * The meta object literal for the '<em><b>Counter Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_CONDITION_TYPE__COUNTER_INCREMENT = eINSTANCE.getLoopConditionType_CounterIncrement();

		/**
		 * The meta object literal for the '<em><b>Final Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_CONDITION_TYPE__FINAL_COUNTER = eINSTANCE.getLoopConditionType_FinalCounter();

		/**
		 * The meta object literal for the '<em><b>Initial Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_CONDITION_TYPE__INITIAL_COUNTER = eINSTANCE.getLoopConditionType_InitialCounter();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeByIDTypeImpl <em>Manager Of Employee By ID Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeByIDTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getManagerOfEmployeeByIDType()
		 * @generated
		 */
		EClass MANAGER_OF_EMPLOYEE_BY_ID_TYPE = eINSTANCE.getManagerOfEmployeeByIDType();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_OF_EMPLOYEE_BY_ID_TYPE__STAFF = eINSTANCE.getManagerOfEmployeeByIDType_Staff();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_OF_EMPLOYEE_BY_ID_TYPE__DOMAIN = eINSTANCE.getManagerOfEmployeeByIDType_Domain();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeTypeImpl <em>Manager Of Employee Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ManagerOfEmployeeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getManagerOfEmployeeType()
		 * @generated
		 */
		EClass MANAGER_OF_EMPLOYEE_TYPE = eINSTANCE.getManagerOfEmployeeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_OF_EMPLOYEE_TYPE__NAME = eINSTANCE.getManagerOfEmployeeType_Name();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_OF_EMPLOYEE_TYPE__DOMAIN = eINSTANCE.getManagerOfEmployeeType_Domain();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.MapImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.MergeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE__DESCRIPTION = eINSTANCE.getMerge_Description();

		/**
		 * The meta object literal for the '<em><b>Input Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE__INPUT_BRANCH = eINSTANCE.getMerge_InputBranch();

		/**
		 * The meta object literal for the '<em><b>Output Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE__OUTPUT_BRANCH = eINSTANCE.getMerge_OutputBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE__NAME = eINSTANCE.getMerge_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ModelTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Catalogs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__CATALOGS = eINSTANCE.getModelType_Catalogs();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DATA_MODEL = eINSTANCE.getModelType_DataModel();

		/**
		 * The meta object literal for the '<em><b>Resource Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__RESOURCE_MODEL = eINSTANCE.getModelType_ResourceModel();

		/**
		 * The meta object literal for the '<em><b>Organization Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__ORGANIZATION_MODEL = eINSTANCE.getModelType_OrganizationModel();

		/**
		 * The meta object literal for the '<em><b>Process Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__PROCESS_MODEL = eINSTANCE.getModelType_ProcessModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__NAME = eINSTANCE.getModelType_Name();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__SCHEMA_VERSION = eINSTANCE.getModelType_SchemaVersion();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.MonetaryValueImpl <em>Monetary Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.MonetaryValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMonetaryValue()
		 * @generated
		 */
		EClass MONETARY_VALUE = eINSTANCE.getMonetaryValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETARY_VALUE__VALUE = eINSTANCE.getMonetaryValue_Value();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETARY_VALUE__CURRENCY = eINSTANCE.getMonetaryValue_Currency();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.NormalTypeImpl <em>Normal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.NormalTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNormalType()
		 * @generated
		 */
		EClass NORMAL_TYPE = eINSTANCE.getNormalType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_TYPE__MEAN = eINSTANCE.getNormalType_Mean();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_TYPE__STANDARD_DEVIATION = eINSTANCE.getNormalType_StandardDeviation();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationBroadcasterImpl <em>Notification Broadcaster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.NotificationBroadcasterImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationBroadcaster()
		 * @generated
		 */
		EClass NOTIFICATION_BROADCASTER = eINSTANCE.getNotificationBroadcaster();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_BROADCASTER__NOTIFICATION = eINSTANCE.getNotificationBroadcaster_Notification();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_BROADCASTER__SCOPE = eINSTANCE.getNotificationBroadcaster_Scope();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationReceiverImpl <em>Notification Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.NotificationReceiverImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationReceiver()
		 * @generated
		 */
		EClass NOTIFICATION_RECEIVER = eINSTANCE.getNotificationReceiver();

		/**
		 * The meta object literal for the '<em><b>Notification Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_RECEIVER__NOTIFICATION_FILTER = eINSTANCE.getNotificationReceiver_NotificationFilter();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_RECEIVER__NOTIFICATION = eINSTANCE.getNotificationReceiver_Notification();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationsTypeImpl <em>Notifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.NotificationsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationsType()
		 * @generated
		 */
		EClass NOTIFICATIONS_TYPE = eINSTANCE.getNotificationsType();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATIONS_TYPE__NOTIFICATION = eINSTANCE.getNotificationsType_Notification();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.NotificationTemplatesTypeImpl <em>Notification Templates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.NotificationTemplatesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNotificationTemplatesType()
		 * @generated
		 */
		EClass NOTIFICATION_TEMPLATES_TYPE = eINSTANCE.getNotificationTemplatesType();

		/**
		 * The meta object literal for the '<em><b>Notification Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_TEMPLATES_TYPE__NOTIFICATION_TEMPLATE = eINSTANCE.getNotificationTemplatesType_NotificationTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ObserverImpl <em>Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ObserverImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getObserver()
		 * @generated
		 */
		EClass OBSERVER = eINSTANCE.getObserver();

		/**
		 * The meta object literal for the '<em><b>Observation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER__OBSERVATION_EXPRESSION = eINSTANCE.getObserver_ObservationExpression();

		/**
		 * The meta object literal for the '<em><b>Is Observe Continuously</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVER__IS_OBSERVE_CONTINUOUSLY = eINSTANCE.getObserver_IsObserveContinuously();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OneTimeCostImpl <em>One Time Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OneTimeCostImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOneTimeCost()
		 * @generated
		 */
		EClass ONE_TIME_COST = eINSTANCE.getOneTimeCost();

		/**
		 * The meta object literal for the '<em><b>Cost Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TIME_COST__COST_VALUE = eINSTANCE.getOneTimeCost_CostValue();

		/**
		 * The meta object literal for the '<em><b>When Cost Applicable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TIME_COST__WHEN_COST_APPLICABLE = eINSTANCE.getOneTimeCost_WhenCostApplicable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OperationalDataImpl <em>Operational Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OperationalDataImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOperationalData()
		 * @generated
		 */
		EClass OPERATIONAL_DATA = eINSTANCE.getOperationalData();

		/**
		 * The meta object literal for the '<em><b>Time Estimation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_DATA__TIME_ESTIMATION = eINSTANCE.getOperationalData_TimeEstimation();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_DATA__COST = eINSTANCE.getOperationalData_Cost();

		/**
		 * The meta object literal for the '<em><b>Revenue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_DATA__REVENUE = eINSTANCE.getOperationalData_Revenue();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionsTypeImpl <em>Organization Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationDefinitionsType()
		 * @generated
		 */
		EClass ORGANIZATION_DEFINITIONS_TYPE = eINSTANCE.getOrganizationDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Organization Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_DEFINITIONS_TYPE__ORGANIZATION_DEFINITION = eINSTANCE.getOrganizationDefinitionsType_OrganizationDefinition();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionTemplatesTypeImpl <em>Organization Definition Templates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationDefinitionTemplatesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationDefinitionTemplatesType()
		 * @generated
		 */
		EClass ORGANIZATION_DEFINITION_TEMPLATES_TYPE = eINSTANCE.getOrganizationDefinitionTemplatesType();

		/**
		 * The meta object literal for the '<em><b>Organization Definition Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_DEFINITION_TEMPLATES_TYPE__ORGANIZATION_DEFINITION_TEMPLATE = eINSTANCE.getOrganizationDefinitionTemplatesType_OrganizationDefinitionTemplate();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationManagerTypeImpl <em>Organization Manager Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationManagerTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationManagerType()
		 * @generated
		 */
		EClass ORGANIZATION_MANAGER_TYPE = eINSTANCE.getOrganizationManagerType();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_MANAGER_TYPE__ORGANIZATION = eINSTANCE.getOrganizationManagerType_Organization();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl <em>Organization Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationModelImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationModel()
		 * @generated
		 */
		EClass ORGANIZATION_MODEL = eINSTANCE.getOrganizationModel();

		/**
		 * The meta object literal for the '<em><b>Organization Definition Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MODEL__ORGANIZATION_DEFINITION_TEMPLATES = eINSTANCE.getOrganizationModel_OrganizationDefinitionTemplates();

		/**
		 * The meta object literal for the '<em><b>Organization Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MODEL__ORGANIZATION_DEFINITIONS = eINSTANCE.getOrganizationModel_OrganizationDefinitions();

		/**
		 * The meta object literal for the '<em><b>Organization Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MODEL__ORGANIZATION_UNITS = eINSTANCE.getOrganizationModel_OrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Location Definition Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MODEL__LOCATION_DEFINITION_TEMPLATES = eINSTANCE.getOrganizationModel_LocationDefinitionTemplates();

		/**
		 * The meta object literal for the '<em><b>Location Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MODEL__LOCATION_DEFINITIONS = eINSTANCE.getOrganizationModel_LocationDefinitions();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MODEL__LOCATIONS = eINSTANCE.getOrganizationModel_Locations();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationsImpl <em>Organizations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationsImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizations()
		 * @generated
		 */
		EClass ORGANIZATIONS = eINSTANCE.getOrganizations();

		/**
		 * The meta object literal for the '<em><b>Organization Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONS__ORGANIZATION_UNIT = eINSTANCE.getOrganizations_OrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONS__LOCATION = eINSTANCE.getOrganizations_Location();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationUnitsTypeImpl <em>Organization Units Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationUnitsTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationUnitsType()
		 * @generated
		 */
		EClass ORGANIZATION_UNITS_TYPE = eINSTANCE.getOrganizationUnitsType();

		/**
		 * The meta object literal for the '<em><b>Organization Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNITS_TYPE__ORGANIZATION_UNIT = eINSTANCE.getOrganizationUnitsType_OrganizationUnit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OrganizationUnitTypeImpl <em>Organization Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OrganizationUnitTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOrganizationUnitType()
		 * @generated
		 */
		EClass ORGANIZATION_UNIT_TYPE = eINSTANCE.getOrganizationUnitType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_UNIT_TYPE__NAME = eINSTANCE.getOrganizationUnitType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Repository Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__REPOSITORY_VALUE = eINSTANCE.getOutput_RepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Associated Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__ASSOCIATED_DATA = eINSTANCE.getOutput_AssociatedData();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__IS_ORDERED = eINSTANCE.getOutput_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__IS_UNIQUE = eINSTANCE.getOutput_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__MAXIMUM = eINSTANCE.getOutput_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__MINIMUM = eINSTANCE.getOutput_Minimum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputBranchImpl <em>Output Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputBranchImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputBranch()
		 * @generated
		 */
		EClass OUTPUT_BRANCH = eINSTANCE.getOutputBranch();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BRANCH__OUTPUT = eINSTANCE.getOutputBranch_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_BRANCH__NAME = eINSTANCE.getOutputBranch_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputBranchTypeImpl <em>Output Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputBranchTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputBranchType()
		 * @generated
		 */
		EClass OUTPUT_BRANCH_TYPE = eINSTANCE.getOutputBranchType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BRANCH_TYPE__CONDITION = eINSTANCE.getOutputBranchType_Condition();

		/**
		 * The meta object literal for the '<em><b>Operational Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BRANCH_TYPE__OPERATIONAL_DATA = eINSTANCE.getOutputBranchType_OperationalData();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl <em>Output Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputCriterionImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputCriterion()
		 * @generated
		 */
		EClass OUTPUT_CRITERION = eINSTANCE.getOutputCriterion();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CRITERION__OUTPUT = eINSTANCE.getOutputCriterion_Output();

		/**
		 * The meta object literal for the '<em><b>Related Input Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CRITERION__RELATED_INPUT_CRITERIA = eINSTANCE.getOutputCriterion_RelatedInputCriteria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_CRITERION__NAME = eINSTANCE.getOutputCriterion_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_CRITERION__TYPE = eINSTANCE.getOutputCriterion_Type();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputCriterionRefImpl <em>Output Criterion Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputCriterionRefImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputCriterionRef()
		 * @generated
		 */
		EClass OUTPUT_CRITERION_REF = eINSTANCE.getOutputCriterionRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_CRITERION_REF__NAME = eINSTANCE.getOutputCriterionRef_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputPathOperationalDataImpl <em>Output Path Operational Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputPathOperationalDataImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputPathOperationalData()
		 * @generated
		 */
		EClass OUTPUT_PATH_OPERATIONAL_DATA = eINSTANCE.getOutputPathOperationalData();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATH_OPERATIONAL_DATA__PROBABILITY = eINSTANCE.getOutputPathOperationalData_Probability();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputPathProbabilityValueImpl <em>Output Path Probability Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputPathProbabilityValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputPathProbabilityValue()
		 * @generated
		 */
		EClass OUTPUT_PATH_PROBABILITY_VALUE = eINSTANCE.getOutputPathProbabilityValue();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PATH_PROBABILITY_VALUE__LITERAL_VALUE = eINSTANCE.getOutputPathProbabilityValue_LiteralValue();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputRefImpl <em>Output Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputRefImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputRef()
		 * @generated
		 */
		EClass OUTPUT_REF = eINSTANCE.getOutputRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REF__NAME = eINSTANCE.getOutputRef_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl <em>Output Repository Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputRepositoryValue()
		 * @generated
		 */
		EClass OUTPUT_REPOSITORY_VALUE = eINSTANCE.getOutputRepositoryValue();

		/**
		 * The meta object literal for the '<em><b>Local Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY = eINSTANCE.getOutputRepositoryValue_LocalRepository();

		/**
		 * The meta object literal for the '<em><b>Global Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY = eINSTANCE.getOutputRepositoryValue_GlobalRepository();

		/**
		 * The meta object literal for the '<em><b>At Beginning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REPOSITORY_VALUE__AT_BEGINNING = eINSTANCE.getOutputRepositoryValue_AtBeginning();

		/**
		 * The meta object literal for the '<em><b>Is Insert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REPOSITORY_VALUE__IS_INSERT = eINSTANCE.getOutputRepositoryValue_IsInsert();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueTypeImpl <em>Output Repository Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputRepositoryValueType()
		 * @generated
		 */
		EClass OUTPUT_REPOSITORY_VALUE_TYPE = eINSTANCE.getOutputRepositoryValueType();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT = eINSTANCE.getOutputRepositoryValueType_Output();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.OutputsImpl <em>Outputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.OutputsImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getOutputs()
		 * @generated
		 */
		EClass OUTPUTS = eINSTANCE.getOutputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUTS__OUTPUT = eINSTANCE.getOutputs_Output();

		/**
		 * The meta object literal for the '<em><b>Output Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUTS__OUTPUT_CRITERION = eINSTANCE.getOutputs_OutputCriterion();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPersonNameType()
		 * @generated
		 */
		EClass PERSON_NAME_TYPE = eINSTANCE.getPersonNameType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__NAME = eINSTANCE.getPersonNameType_Name();

		/**
		 * The meta object literal for the '<em><b>Alternative Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__ALTERNATIVE_NAME1 = eINSTANCE.getPersonNameType_AlternativeName1();

		/**
		 * The meta object literal for the '<em><b>Alternative Name2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__ALTERNATIVE_NAME2 = eINSTANCE.getPersonNameType_AlternativeName2();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl <em>Person Search Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.PersonSearchTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPersonSearchType()
		 * @generated
		 */
		EClass PERSON_SEARCH_TYPE = eINSTANCE.getPersonSearchType();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__USER_ID = eINSTANCE.getPersonSearchType_UserId();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__PROFILE = eINSTANCE.getPersonSearchType_Profile();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__LAST_NAME = eINSTANCE.getPersonSearchType_LastName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__FIRST_NAME = eINSTANCE.getPersonSearchType_FirstName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__MIDDLE_NAME = eINSTANCE.getPersonSearchType_MiddleName();

		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__EMAIL = eINSTANCE.getPersonSearchType_EMail();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__COMPANY = eINSTANCE.getPersonSearchType_Company();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__DISPLAY_NAME = eINSTANCE.getPersonSearchType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Secretary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__SECRETARY = eINSTANCE.getPersonSearchType_Secretary();

		/**
		 * The meta object literal for the '<em><b>Assistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__ASSISTANT = eINSTANCE.getPersonSearchType_Assistant();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__MANAGER = eINSTANCE.getPersonSearchType_Manager();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__DEPARTMENT = eINSTANCE.getPersonSearchType_Department();

		/**
		 * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__EMPLOYEE_ID = eINSTANCE.getPersonSearchType_EmployeeId();

		/**
		 * The meta object literal for the '<em><b>Tax Payer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__TAX_PAYER_ID = eINSTANCE.getPersonSearchType_TaxPayerId();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__PHONE = eINSTANCE.getPersonSearchType_Phone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__FAX = eINSTANCE.getPersonSearchType_Fax();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__GENDER = eINSTANCE.getPersonSearchType_Gender();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__TIME_ZONE = eINSTANCE.getPersonSearchType_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Preferred Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SEARCH_TYPE__PREFERRED_LANGUAGE = eINSTANCE.getPersonSearchType_PreferredLanguage();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.PoissonTypeImpl <em>Poisson Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.PoissonTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPoissonType()
		 * @generated
		 */
		EClass POISSON_TYPE = eINSTANCE.getPoissonType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISSON_TYPE__MEAN = eINSTANCE.getPoissonType_Mean();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.PrivateInstanceImpl <em>Private Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.PrivateInstanceImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPrivateInstance()
		 * @generated
		 */
		EClass PRIVATE_INSTANCE = eINSTANCE.getPrivateInstance();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVATE_INSTANCE__ATTRIBUTE_VALUE = eINSTANCE.getPrivateInstance_AttributeValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_INSTANCE__NAME = eINSTANCE.getPrivateInstance_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ProcessImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DESCRIPTION = eINSTANCE.getProcess_Description();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INPUTS = eINSTANCE.getProcess_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OUTPUTS = eINSTANCE.getProcess_Outputs();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PRECONDITION = eINSTANCE.getProcess_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__POSTCONDITION = eINSTANCE.getProcess_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ORGANIZATIONS = eINSTANCE.getProcess_Organizations();

		/**
		 * The meta object literal for the '<em><b>Operational Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OPERATIONAL_DATA = eINSTANCE.getProcess_OperationalData();

		/**
		 * The meta object literal for the '<em><b>Flow Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FLOW_CONTENT = eINSTANCE.getProcess_FlowContent();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EXTENDED_ATTRIBUTES = eINSTANCE.getProcess_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ProcessesTypeImpl <em>Processes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ProcessesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getProcessesType()
		 * @generated
		 */
		EClass PROCESSES_TYPE = eINSTANCE.getProcessesType();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSES_TYPE__PROCESS = eINSTANCE.getProcessesType_Process();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ProcessModelImpl <em>Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ProcessModelImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getProcessModel()
		 * @generated
		 */
		EClass PROCESS_MODEL = eINSTANCE.getProcessModel();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__PROCESSES = eINSTANCE.getProcessModel_Processes();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__TASKS = eINSTANCE.getProcessModel_Tasks();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__REPOSITORIES = eINSTANCE.getProcessModel_Repositories();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__SERVICES = eINSTANCE.getProcessModel_Services();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.PublicInstanceImpl <em>Public Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.PublicInstanceImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPublicInstance()
		 * @generated
		 */
		EClass PUBLIC_INSTANCE = eINSTANCE.getPublicInstance();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_INSTANCE__INSTANCE = eINSTANCE.getPublicInstance_Instance();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.QualificationImpl <em>Qualification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.QualificationImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getQualification()
		 * @generated
		 */
		EClass QUALIFICATION = eINSTANCE.getQualification();

		/**
		 * The meta object literal for the '<em><b>Scope Dimension Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION__SCOPE_DIMENSION_VALUE = eINSTANCE.getQualification_ScopeDimensionValue();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFICATION__ROLE = eINSTANCE.getQualification_Role();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.QuantityImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RandomListTypeImpl <em>Random List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RandomListTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRandomListType()
		 * @generated
		 */
		EClass RANDOM_LIST_TYPE = eINSTANCE.getRandomListType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_LIST_TYPE__VALUE = eINSTANCE.getRandomListType_Value();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl <em>Recurring Time Interval Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RecurringTimeIntervalTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRecurringTimeIntervalType()
		 * @generated
		 */
		EClass RECURRING_TIME_INTERVAL_TYPE = eINSTANCE.getRecurringTimeIntervalType();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_TIME_INTERVAL_TYPE__START_TIME = eINSTANCE.getRecurringTimeIntervalType_StartTime();

		/**
		 * The meta object literal for the '<em><b>Start Day Of Week</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURRING_TIME_INTERVAL_TYPE__START_DAY_OF_WEEK = eINSTANCE.getRecurringTimeIntervalType_StartDayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_TIME_INTERVAL_TYPE__DURATION = eINSTANCE.getRecurringTimeIntervalType_Duration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_TIME_INTERVAL_TYPE__NAME = eINSTANCE.getRecurringTimeIntervalType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RelatedInputCriteriaTypeImpl <em>Related Input Criteria Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RelatedInputCriteriaTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRelatedInputCriteriaType()
		 * @generated
		 */
		EClass RELATED_INPUT_CRITERIA_TYPE = eINSTANCE.getRelatedInputCriteriaType();

		/**
		 * The meta object literal for the '<em><b>Input Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_INPUT_CRITERIA_TYPE__INPUT_CRITERION = eINSTANCE.getRelatedInputCriteriaType_InputCriterion();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RepositoriesTypeImpl <em>Repositories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RepositoriesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRepositoriesType()
		 * @generated
		 */
		EClass REPOSITORIES_TYPE = eINSTANCE.getRepositoriesType();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIES_TYPE__REPOSITORY = eINSTANCE.getRepositoriesType_Repository();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RepositoryImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DESCRIPTION = eINSTANCE.getRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Default Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__DEFAULT_VALUES = eINSTANCE.getRepository_DefaultValues();

		/**
		 * The meta object literal for the '<em><b>Computed Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPUTED_VALUES = eINSTANCE.getRepository_ComputedValues();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CAPACITY = eINSTANCE.getRepository_Capacity();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__IS_ORDERED = eINSTANCE.getRepository_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__IS_READ_ONLY = eINSTANCE.getRepository_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__IS_UNIQUE = eINSTANCE.getRepository_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TYPE = eINSTANCE.getRepository_Type();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl <em>Repository Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRepositoryDataValue()
		 * @generated
		 */
		EClass REPOSITORY_DATA_VALUE = eINSTANCE.getRepositoryDataValue();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DATA_VALUE__GROUP = eINSTANCE.getRepositoryDataValue_Group();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DATA_VALUE__LITERAL_VALUE = eINSTANCE.getRepositoryDataValue_LiteralValue();

		/**
		 * The meta object literal for the '<em><b>Expression Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_DATA_VALUE__EXPRESSION_VALUE = eINSTANCE.getRepositoryDataValue_ExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Public Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE = eINSTANCE.getRepositoryDataValue_PublicInstance();

		/**
		 * The meta object literal for the '<em><b>Private Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE = eINSTANCE.getRepositoryDataValue_PrivateInstance();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ResourceModelImpl <em>Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ResourceModelImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getResourceModel()
		 * @generated
		 */
		EClass RESOURCE_MODEL = eINSTANCE.getResourceModel();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Definition Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES = eINSTANCE.getResourceModel_IndividualResourceDefinitionTemplates();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__INDIVIDUAL_RESOURCE_DEFINITIONS = eINSTANCE.getResourceModel_IndividualResourceDefinitions();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource Definition Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__BULK_RESOURCE_DEFINITION_TEMPLATES = eINSTANCE.getResourceModel_BulkResourceDefinitionTemplates();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__BULK_RESOURCE_DEFINITIONS = eINSTANCE.getResourceModel_BulkResourceDefinitions();

		/**
		 * The meta object literal for the '<em><b>Individual Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__INDIVIDUAL_RESOURCES = eINSTANCE.getResourceModel_IndividualResources();

		/**
		 * The meta object literal for the '<em><b>Bulk Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__BULK_RESOURCES = eINSTANCE.getResourceModel_BulkResources();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__ROLES = eINSTANCE.getResourceModel_Roles();

		/**
		 * The meta object literal for the '<em><b>Timetables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__TIMETABLES = eINSTANCE.getResourceModel_Timetables();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ResourcesImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Role Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__ROLE_REQUIREMENT = eINSTANCE.getResources_RoleRequirement();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__INDIVIDUAL_RESOURCE_REQUIREMENT = eINSTANCE.getResources_IndividualResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Bulk Resource Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__BULK_RESOURCE_REQUIREMENT = eINSTANCE.getResources_BulkResourceRequirement();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RoleImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DOCUMENTATION = eINSTANCE.getRole_Documentation();

		/**
		 * The meta object literal for the '<em><b>Scope Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SCOPE_DIMENSION = eINSTANCE.getRole_ScopeDimension();

		/**
		 * The meta object literal for the '<em><b>Individual Resource Cost Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__INDIVIDUAL_RESOURCE_COST_TYPE = eINSTANCE.getRole_IndividualResourceCostType();

		/**
		 * The meta object literal for the '<em><b>One Time Cost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ONE_TIME_COST = eINSTANCE.getRole_OneTimeCost();

		/**
		 * The meta object literal for the '<em><b>Cost Per Time Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__COST_PER_TIME_UNIT = eINSTANCE.getRole_CostPerTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__AVAILABILITY = eINSTANCE.getRole_Availability();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__EXTENDED_ATTRIBUTES = eINSTANCE.getRole_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl <em>Role Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RoleRequirementImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRoleRequirement()
		 * @generated
		 */
		EClass ROLE_REQUIREMENT = eINSTANCE.getRoleRequirement();

		/**
		 * The meta object literal for the '<em><b>Resource Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENT__RESOURCE_QUANTITY = eINSTANCE.getRoleRequirement_ResourceQuantity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_REQUIREMENT__NAME = eINSTANCE.getRoleRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_REQUIREMENT__ROLE = eINSTANCE.getRoleRequirement_Role();

		/**
		 * The meta object literal for the '<em><b>Time Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_REQUIREMENT__TIME_REQUIRED = eINSTANCE.getRoleRequirement_TimeRequired();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_REQUIREMENT__TYPE = eINSTANCE.getRoleRequirement_Type();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.RolesTypeImpl <em>Roles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.RolesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getRolesType()
		 * @generated
		 */
		EClass ROLES_TYPE = eINSTANCE.getRolesType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES_TYPE__ROLE = eINSTANCE.getRolesType_Role();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ScopeDimensionTypeImpl <em>Scope Dimension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ScopeDimensionTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getScopeDimensionType()
		 * @generated
		 */
		EClass SCOPE_DIMENSION_TYPE = eINSTANCE.getScopeDimensionType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_DIMENSION_TYPE__NAME = eINSTANCE.getScopeDimensionType_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_DIMENSION_TYPE__VALUE_TYPE = eINSTANCE.getScopeDimensionType_ValueType();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ScopeDimensionValueImpl <em>Scope Dimension Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ScopeDimensionValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getScopeDimensionValue()
		 * @generated
		 */
		EClass SCOPE_DIMENSION_VALUE = eINSTANCE.getScopeDimensionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_DIMENSION_VALUE__VALUE = eINSTANCE.getScopeDimensionValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_DIMENSION_VALUE__NAME = eINSTANCE.getScopeDimensionValue_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ServiceImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ServicesTypeImpl <em>Services Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ServicesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getServicesType()
		 * @generated
		 */
		EClass SERVICES_TYPE = eINSTANCE.getServicesType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES_TYPE__SERVICE = eINSTANCE.getServicesType_Service();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.SourceTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>Contact Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__CONTACT_POINT = eINSTANCE.getSourceType_ContactPoint();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__NODE = eINSTANCE.getSourceType_Node();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl <em>Start Day Of Week Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.StartDayOfWeekTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getStartDayOfWeekType()
		 * @generated
		 */
		EClass START_DAY_OF_WEEK_TYPE = eINSTANCE.getStartDayOfWeekType();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_DAY_OF_WEEK_TYPE__DAY_OF_WEEK = eINSTANCE.getStartDayOfWeekType_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_DAY_OF_WEEK_TYPE__START_TIME = eINSTANCE.getStartDayOfWeekType_StartTime();

		/**
		 * The meta object literal for the '<em><b>Week Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_DAY_OF_WEEK_TYPE__WEEK_NUMBER = eINSTANCE.getStartDayOfWeekType_WeekNumber();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.StartNodeTypeImpl <em>Start Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.StartNodeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getStartNodeType()
		 * @generated
		 */
		EClass START_NODE_TYPE = eINSTANCE.getStartNodeType();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_NODE_TYPE__ENTRY_POINT = eINSTANCE.getStartNodeType_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_NODE_TYPE__NAME = eINSTANCE.getStartNodeType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.StopNodeTypeImpl <em>Stop Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.StopNodeTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getStopNodeType()
		 * @generated
		 */
		EClass STOP_NODE_TYPE = eINSTANCE.getStopNodeType();

		/**
		 * The meta object literal for the '<em><b>Associated Output Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION = eINSTANCE.getStopNodeType_AssociatedOutputCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_NODE_TYPE__NAME = eINSTANCE.getStopNodeType_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TargetTypeImpl <em>Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TargetTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTargetType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTargetType();

		/**
		 * The meta object literal for the '<em><b>Contact Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__CONTACT_POINT = eINSTANCE.getTargetType_ContactPoint();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__NODE = eINSTANCE.getTargetType_Node();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TaskImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PRECONDITION = eINSTANCE.getTask_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__POSTCONDITION = eINSTANCE.getTask_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RESOURCES = eINSTANCE.getTask_Resources();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ORGANIZATIONS = eINSTANCE.getTask_Organizations();

		/**
		 * The meta object literal for the '<em><b>Operational Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OPERATIONAL_DATA = eINSTANCE.getTask_OperationalData();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__EXTENDED_ATTRIBUTES = eINSTANCE.getTask_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TaskIndividualResourceRequirementImpl <em>Task Individual Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TaskIndividualResourceRequirementImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTaskIndividualResourceRequirement()
		 * @generated
		 */
		EClass TASK_INDIVIDUAL_RESOURCE_REQUIREMENT = eINSTANCE.getTaskIndividualResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INDIVIDUAL_RESOURCE_REQUIREMENT__CRITERIA = eINSTANCE.getTaskIndividualResourceRequirement_Criteria();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TasksTypeImpl <em>Tasks Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TasksTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTasksType()
		 * @generated
		 */
		EClass TASKS_TYPE = eINSTANCE.getTasksType();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKS_TYPE__TASK = eINSTANCE.getTasksType_Task();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TimeEstimationTypeImpl <em>Time Estimation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TimeEstimationTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeEstimationType()
		 * @generated
		 */
		EClass TIME_ESTIMATION_TYPE = eINSTANCE.getTimeEstimationType();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ESTIMATION_TYPE__PROCESSING_TIME = eINSTANCE.getTimeEstimationType_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Max Resource Waiting Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ESTIMATION_TYPE__MAX_RESOURCE_WAITING_TIME = eINSTANCE.getTimeEstimationType_MaxResourceWaitingTime();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TimerImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Timer Setting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER__TIMER_SETTING = eINSTANCE.getTimer_TimerSetting();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl <em>Timer Setting Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TimerSettingTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimerSettingType()
		 * @generated
		 */
		EClass TIMER_SETTING_TYPE = eINSTANCE.getTimerSettingType();

		/**
		 * The meta object literal for the '<em><b>Based On Timetable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_SETTING_TYPE__BASED_ON_TIMETABLE = eINSTANCE.getTimerSettingType_BasedOnTimetable();

		/**
		 * The meta object literal for the '<em><b>Constant Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_SETTING_TYPE__CONSTANT_TIME = eINSTANCE.getTimerSettingType_ConstantTime();

		/**
		 * The meta object literal for the '<em><b>Last Activation Time Plus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_SETTING_TYPE__LAST_ACTIVATION_TIME_PLUS = eINSTANCE.getTimerSettingType_LastActivationTimePlus();

		/**
		 * The meta object literal for the '<em><b>Timer Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_SETTING_TYPE__TIMER_EXPRESSION = eINSTANCE.getTimerSettingType_TimerExpression();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TimetableImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__DOCUMENTATION = eINSTANCE.getTimetable_Documentation();

		/**
		 * The meta object literal for the '<em><b>Recurring Time Interval</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__RECURRING_TIME_INTERVAL = eINSTANCE.getTimetable_RecurringTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Exemption Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__EXEMPTION_PERIOD = eINSTANCE.getTimetable_ExemptionPeriod();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__EXTENDED_ATTRIBUTES = eINSTANCE.getTimetable_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Begining On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__BEGINING_ON = eINSTANCE.getTimetable_BeginingOn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__NAME = eINSTANCE.getTimetable_Name();

		/**
		 * The meta object literal for the '<em><b>Number Of Times To Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT = eINSTANCE.getTimetable_NumberOfTimesToRepeat();

		/**
		 * The meta object literal for the '<em><b>Repetition Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__REPETITION_PERIOD = eINSTANCE.getTimetable_RepetitionPeriod();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TimetablesTypeImpl <em>Timetables Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TimetablesTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimetablesType()
		 * @generated
		 */
		EClass TIMETABLES_TYPE = eINSTANCE.getTimetablesType();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLES_TYPE__TIMETABLE = eINSTANCE.getTimetablesType_Timetable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TimeValueImpl <em>Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TimeValueImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeValue()
		 * @generated
		 */
		EClass TIME_VALUE = eINSTANCE.getTimeValue();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE__LITERAL_VALUE = eINSTANCE.getTimeValue_LiteralValue();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_VALUE__DISTRIBUTION = eINSTANCE.getTimeValue_Distribution();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.TypeDeclarationImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Complex Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__COMPLEX_DATA_TYPE = eINSTANCE.getTypeDeclaration_ComplexDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DECLARATION__NAME = eINSTANCE.getTypeDeclaration_Name();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.UniformTypeImpl <em>Uniform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.UniformTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getUniformType()
		 * @generated
		 */
		EClass UNIFORM_TYPE = eINSTANCE.getUniformType();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TYPE__MAXIMUM = eINSTANCE.getUniformType_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TYPE__MINIMUM = eINSTANCE.getUniformType_Minimum();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.ValueTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__VALUE = eINSTANCE.getValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__PROBABILITY = eINSTANCE.getValueType_Probability();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.WeightedListTypeImpl <em>Weighted List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.WeightedListTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getWeightedListType()
		 * @generated
		 */
		EClass WEIGHTED_LIST_TYPE = eINSTANCE.getWeightedListType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTED_LIST_TYPE__VALUE = eINSTANCE.getWeightedListType_Value();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.impl.WhenCostApplicableTypeImpl <em>When Cost Applicable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.WhenCostApplicableTypeImpl
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getWhenCostApplicableType()
		 * @generated
		 */
		EClass WHEN_COST_APPLICABLE_TYPE = eINSTANCE.getWhenCostApplicableType();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_COST_APPLICABLE_TYPE__TIMETABLE = eINSTANCE.getWhenCostApplicableType_Timetable();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.BasicDataType <em>Basic Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.BasicDataType
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBasicDataType()
		 * @generated
		 */
		EEnum BASIC_DATA_TYPE = eINSTANCE.getBasicDataType();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.Currency
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.DayOfWeek
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.MultipleInstancesMatch <em>Multiple Instances Match</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMultipleInstancesMatch()
		 * @generated
		 */
		EEnum MULTIPLE_INSTANCES_MATCH = eINSTANCE.getMultipleInstancesMatch();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.NoInstancesMatch <em>No Instances Match</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNoInstancesMatch()
		 * @generated
		 */
		EEnum NO_INSTANCES_MATCH = eINSTANCE.getNoInstancesMatch();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.TimeUnit
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link com.ibm.wbim.bom.schema1.TypeType1 <em>Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.TypeType1
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeType1()
		 * @generated
		 */
		EEnum TYPE_TYPE1 = eINSTANCE.getTypeType1();

		/**
		 * The meta object literal for the '<em>Associated Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getAssociatedDataType()
		 * @generated
		 */
		EDataType ASSOCIATED_DATA_TYPE = eINSTANCE.getAssociatedDataType();

		/**
		 * The meta object literal for the '<em>Basic Data Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.BasicDataType
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getBasicDataTypeObject()
		 * @generated
		 */
		EDataType BASIC_DATA_TYPE_OBJECT = eINSTANCE.getBasicDataTypeObject();

		/**
		 * The meta object literal for the '<em>Currency Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.Currency
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getCurrencyObject()
		 * @generated
		 */
		EDataType CURRENCY_OBJECT = eINSTANCE.getCurrencyObject();

		/**
		 * The meta object literal for the '<em>Day Of Week Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.DayOfWeek
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getDayOfWeekObject()
		 * @generated
		 */
		EDataType DAY_OF_WEEK_OBJECT = eINSTANCE.getDayOfWeekObject();

		/**
		 * The meta object literal for the '<em>Element Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getElementName()
		 * @generated
		 */
		EDataType ELEMENT_NAME = eINSTANCE.getElementName();

		/**
		 * The meta object literal for the '<em>Instance Of Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getInstanceOfType()
		 * @generated
		 */
		EDataType INSTANCE_OF_TYPE = eINSTANCE.getInstanceOfType();

		/**
		 * The meta object literal for the '<em>Multiple Instances Match Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.MultipleInstancesMatch
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getMultipleInstancesMatchObject()
		 * @generated
		 */
		EDataType MULTIPLE_INSTANCES_MATCH_OBJECT = eINSTANCE.getMultipleInstancesMatchObject();

		/**
		 * The meta object literal for the '<em>No Instances Match Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.NoInstancesMatch
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNoInstancesMatchObject()
		 * @generated
		 */
		EDataType NO_INSTANCES_MATCH_OBJECT = eINSTANCE.getNoInstancesMatchObject();

		/**
		 * The meta object literal for the '<em>Non Negative Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNonNegativeDouble()
		 * @generated
		 */
		EDataType NON_NEGATIVE_DOUBLE = eINSTANCE.getNonNegativeDouble();

		/**
		 * The meta object literal for the '<em>Non Negative Double Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getNonNegativeDoubleObject()
		 * @generated
		 */
		EDataType NON_NEGATIVE_DOUBLE_OBJECT = eINSTANCE.getNonNegativeDoubleObject();

		/**
		 * The meta object literal for the '<em>Parent Template Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getParentTemplateType()
		 * @generated
		 */
		EDataType PARENT_TEMPLATE_TYPE = eINSTANCE.getParentTemplateType();

		/**
		 * The meta object literal for the '<em>Percentage Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPercentageValue()
		 * @generated
		 */
		EDataType PERCENTAGE_VALUE = eINSTANCE.getPercentageValue();

		/**
		 * The meta object literal for the '<em>Percentage Value Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPercentageValueObject()
		 * @generated
		 */
		EDataType PERCENTAGE_VALUE_OBJECT = eINSTANCE.getPercentageValueObject();

		/**
		 * The meta object literal for the '<em>Predefined Organization Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPredefinedOrganizationType()
		 * @generated
		 */
		EDataType PREDEFINED_ORGANIZATION_TYPE = eINSTANCE.getPredefinedOrganizationType();

		/**
		 * The meta object literal for the '<em>Predefined Resource Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getPredefinedResourceType()
		 * @generated
		 */
		EDataType PREDEFINED_RESOURCE_TYPE = eINSTANCE.getPredefinedResourceType();

		/**
		 * The meta object literal for the '<em>Time Unit Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.TimeUnit
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTimeUnitObject()
		 * @generated
		 */
		EDataType TIME_UNIT_OBJECT = eINSTANCE.getTimeUnitObject();

		/**
		 * The meta object literal for the '<em>Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeType()
		 * @generated
		 */
		EDataType TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Type Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeType2()
		 * @generated
		 */
		EDataType TYPE_TYPE2 = eINSTANCE.getTypeType2();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.wbim.bom.schema1.TypeType1
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.ibm.wbim.bom.schema1.impl.Schema1PackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

	}

} //Schema1Package
