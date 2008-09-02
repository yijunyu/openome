/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Predefined Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Modeler predefined resource types
 * <!-- end-model-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getPredefinedResourceType()
 * @model extendedMetaData="name='PredefinedResourceType'"
 * @generated
 */
public enum PredefinedResourceType implements Enumerator {
	/**
	 * The '<em><b>Person Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON_TEMPLATE(0, "PersonTemplate", "Person template"),

	/**
	 * The '<em><b>Resource Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_TEMPLATE(1, "ResourceTemplate", "Resource template"),

	/**
	 * The '<em><b>Staff Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAFF_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	STAFF_TEMPLATE(2, "StaffTemplate", "Staff template"),

	/**
	 * The '<em><b>Communication Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_SERVICE(3, "CommunicationService", "Communication Service"),

	/**
	 * The '<em><b>Equipment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIPMENT(4, "Equipment", "Equipment"),

	/**
	 * The '<em><b>Facility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACILITY_VALUE
	 * @generated
	 * @ordered
	 */
	FACILITY(5, "Facility", "Facility"),

	/**
	 * The '<em><b>General Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_SERVICE(6, "GeneralService", "General Service"),

	/**
	 * The '<em><b>Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	MACHINE(7, "Machine", "Machine"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(8, "Person", "Person"),

	/**
	 * The '<em><b>Staff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAFF_VALUE
	 * @generated
	 * @ordered
	 */
	STAFF(9, "Staff", "Staff"),

	/**
	 * The '<em><b>Tool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOL_VALUE
	 * @generated
	 * @ordered
	 */
	TOOL(10, "Tool", "Tool");

	/**
	 * The '<em><b>Person Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Person Template</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSON_TEMPLATE
	 * @model name="PersonTemplate" literal="Person template"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_TEMPLATE_VALUE = 0;

	/**
	 * The '<em><b>Resource Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Template</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_TEMPLATE
	 * @model name="ResourceTemplate" literal="Resource template"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_TEMPLATE_VALUE = 1;

	/**
	 * The '<em><b>Staff Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Staff Template</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAFF_TEMPLATE
	 * @model name="StaffTemplate" literal="Staff template"
	 * @generated
	 * @ordered
	 */
	public static final int STAFF_TEMPLATE_VALUE = 2;

	/**
	 * The '<em><b>Communication Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Communication Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_SERVICE
	 * @model name="CommunicationService" literal="Communication Service"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_SERVICE_VALUE = 3;

	/**
	 * The '<em><b>Equipment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equipment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUIPMENT
	 * @model name="Equipment"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_VALUE = 4;

	/**
	 * The '<em><b>Facility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Facility</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACILITY
	 * @model name="Facility"
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY_VALUE = 5;

	/**
	 * The '<em><b>General Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_SERVICE
	 * @model name="GeneralService" literal="General Service"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_SERVICE_VALUE = 6;

	/**
	 * The '<em><b>Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Machine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACHINE
	 * @model name="Machine"
	 * @generated
	 * @ordered
	 */
	public static final int MACHINE_VALUE = 7;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Person</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSON
	 * @model name="Person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 8;

	/**
	 * The '<em><b>Staff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Staff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAFF
	 * @model name="Staff"
	 * @generated
	 * @ordered
	 */
	public static final int STAFF_VALUE = 9;

	/**
	 * The '<em><b>Tool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tool</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOL
	 * @model name="Tool"
	 * @generated
	 * @ordered
	 */
	public static final int TOOL_VALUE = 10;

	/**
	 * An array of all the '<em><b>Predefined Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PredefinedResourceType[] VALUES_ARRAY = new PredefinedResourceType[] {
			PERSON_TEMPLATE, RESOURCE_TEMPLATE, STAFF_TEMPLATE,
			COMMUNICATION_SERVICE, EQUIPMENT, FACILITY, GENERAL_SERVICE,
			MACHINE, PERSON, STAFF, TOOL, };

	/**
	 * A public read-only list of all the '<em><b>Predefined Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PredefinedResourceType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predefined Resource Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedResourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedResourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Resource Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedResourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedResourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Resource Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedResourceType get(int value) {
		switch (value) {
		case PERSON_TEMPLATE_VALUE:
			return PERSON_TEMPLATE;
		case RESOURCE_TEMPLATE_VALUE:
			return RESOURCE_TEMPLATE;
		case STAFF_TEMPLATE_VALUE:
			return STAFF_TEMPLATE;
		case COMMUNICATION_SERVICE_VALUE:
			return COMMUNICATION_SERVICE;
		case EQUIPMENT_VALUE:
			return EQUIPMENT;
		case FACILITY_VALUE:
			return FACILITY;
		case GENERAL_SERVICE_VALUE:
			return GENERAL_SERVICE;
		case MACHINE_VALUE:
			return MACHINE;
		case PERSON_VALUE:
			return PERSON;
		case STAFF_VALUE:
			return STAFF;
		case TOOL_VALUE:
			return TOOL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PredefinedResourceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PredefinedResourceType
