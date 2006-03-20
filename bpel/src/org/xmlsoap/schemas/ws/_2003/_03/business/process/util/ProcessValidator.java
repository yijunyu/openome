/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.xmlsoap.schemas.ws._2003._03.business.process.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage
 * @generated
 */
public class ProcessValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProcessValidator INSTANCE = new ProcessValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.xmlsoap.schemas.ws._2003._03.business.process";

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
	public ProcessValidator() {
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
	  return ProcessPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case ProcessPackage.CASE_TYPE:
				return validateCaseType((CaseType)value, diagnostics, context);
			case ProcessPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ProcessPackage.PARTNER_LINK_TYPE:
				return validatePartnerLinkType((PartnerLinkType)value, diagnostics, context);
			case ProcessPackage.TACTIVITY:
				return validateTActivity((TActivity)value, diagnostics, context);
			case ProcessPackage.TACTIVITY_CONTAINER:
				return validateTActivityContainer((TActivityContainer)value, diagnostics, context);
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER:
				return validateTActivityOrCompensateContainer((TActivityOrCompensateContainer)value, diagnostics, context);
			case ProcessPackage.TASSIGN:
				return validateTAssign((TAssign)value, diagnostics, context);
			case ProcessPackage.TCATCH:
				return validateTCatch((TCatch)value, diagnostics, context);
			case ProcessPackage.TCOMPENSATE:
				return validateTCompensate((TCompensate)value, diagnostics, context);
			case ProcessPackage.TCOMPENSATION_HANDLER:
				return validateTCompensationHandler((TCompensationHandler)value, diagnostics, context);
			case ProcessPackage.TCOPY:
				return validateTCopy((TCopy)value, diagnostics, context);
			case ProcessPackage.TCORRELATION:
				return validateTCorrelation((TCorrelation)value, diagnostics, context);
			case ProcessPackage.TCORRELATIONS:
				return validateTCorrelations((TCorrelations)value, diagnostics, context);
			case ProcessPackage.TCORRELATION_SET:
				return validateTCorrelationSet((TCorrelationSet)value, diagnostics, context);
			case ProcessPackage.TCORRELATION_SETS:
				return validateTCorrelationSets((TCorrelationSets)value, diagnostics, context);
			case ProcessPackage.TCORRELATIONS_WITH_PATTERN:
				return validateTCorrelationsWithPattern((TCorrelationsWithPattern)value, diagnostics, context);
			case ProcessPackage.TCORRELATION_WITH_PATTERN:
				return validateTCorrelationWithPattern((TCorrelationWithPattern)value, diagnostics, context);
			case ProcessPackage.TEMPTY:
				return validateTEmpty((TEmpty)value, diagnostics, context);
			case ProcessPackage.TEVENT_HANDLERS:
				return validateTEventHandlers((TEventHandlers)value, diagnostics, context);
			case ProcessPackage.TEXTENSIBLE_ELEMENTS:
				return validateTExtensibleElements((TExtensibleElements)value, diagnostics, context);
			case ProcessPackage.TFAULT_HANDLERS:
				return validateTFaultHandlers((TFaultHandlers)value, diagnostics, context);
			case ProcessPackage.TFLOW:
				return validateTFlow((TFlow)value, diagnostics, context);
			case ProcessPackage.TFROM:
				return validateTFrom((TFrom)value, diagnostics, context);
			case ProcessPackage.TINVOKE:
				return validateTInvoke((TInvoke)value, diagnostics, context);
			case ProcessPackage.TLINK:
				return validateTLink((TLink)value, diagnostics, context);
			case ProcessPackage.TLINKS:
				return validateTLinks((TLinks)value, diagnostics, context);
			case ProcessPackage.TON_ALARM:
				return validateTOnAlarm((TOnAlarm)value, diagnostics, context);
			case ProcessPackage.TON_MESSAGE:
				return validateTOnMessage((TOnMessage)value, diagnostics, context);
			case ProcessPackage.TO_TYPE:
				return validateToType((ToType)value, diagnostics, context);
			case ProcessPackage.TPARTNER:
				return validateTPartner((TPartner)value, diagnostics, context);
			case ProcessPackage.TPARTNER_LINK:
				return validateTPartnerLink((TPartnerLink)value, diagnostics, context);
			case ProcessPackage.TPARTNER_LINKS:
				return validateTPartnerLinks((TPartnerLinks)value, diagnostics, context);
			case ProcessPackage.TPARTNERS:
				return validateTPartners((TPartners)value, diagnostics, context);
			case ProcessPackage.TPICK:
				return validateTPick((TPick)value, diagnostics, context);
			case ProcessPackage.TPROCESS:
				return validateTProcess((TProcess)value, diagnostics, context);
			case ProcessPackage.TRECEIVE:
				return validateTReceive((TReceive)value, diagnostics, context);
			case ProcessPackage.TREPLY:
				return validateTReply((TReply)value, diagnostics, context);
			case ProcessPackage.TSCOPE:
				return validateTScope((TScope)value, diagnostics, context);
			case ProcessPackage.TSEQUENCE:
				return validateTSequence((TSequence)value, diagnostics, context);
			case ProcessPackage.TSOURCE:
				return validateTSource((TSource)value, diagnostics, context);
			case ProcessPackage.TSWITCH:
				return validateTSwitch((TSwitch)value, diagnostics, context);
			case ProcessPackage.TTARGET:
				return validateTTarget((TTarget)value, diagnostics, context);
			case ProcessPackage.TTERMINATE:
				return validateTTerminate((TTerminate)value, diagnostics, context);
			case ProcessPackage.TTHROW:
				return validateTThrow((TThrow)value, diagnostics, context);
			case ProcessPackage.TVARIABLE:
				return validateTVariable((TVariable)value, diagnostics, context);
			case ProcessPackage.TVARIABLES:
				return validateTVariables((TVariables)value, diagnostics, context);
			case ProcessPackage.TWAIT:
				return validateTWait((TWait)value, diagnostics, context);
			case ProcessPackage.TWHILE:
				return validateTWhile((TWhile)value, diagnostics, context);
			case ProcessPackage.TBOOLEAN:
				return validateTBoolean((Object)value, diagnostics, context);
			case ProcessPackage.TROLES:
				return validateTRoles((Object)value, diagnostics, context);
			case ProcessPackage.PATTERN_TYPE:
				return validatePatternType((String)value, diagnostics, context);
			case ProcessPackage.PROPERTIES_TYPE:
				return validatePropertiesType((List)value, diagnostics, context);
			case ProcessPackage.TBOOLEAN_EXPR:
				return validateTBooleanExpr((String)value, diagnostics, context);
			case ProcessPackage.TBOOLEAN_OBJECT:
				return validateTBooleanObject((TBoolean)value, diagnostics, context);
			case ProcessPackage.TDEADLINE_EXPR:
				return validateTDeadlineExpr((String)value, diagnostics, context);
			case ProcessPackage.TDURATION_EXPR:
				return validateTDurationExpr((String)value, diagnostics, context);
			case ProcessPackage.TROLES_OBJECT:
				return validateTRolesObject((TRoles)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseType(CaseType caseType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(caseType, diagnostics, context);
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
	public boolean validatePartnerLinkType(PartnerLinkType partnerLinkType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(partnerLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTActivity(TActivity tActivity, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTActivityContainer(TActivityContainer tActivityContainer, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tActivityContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTActivityOrCompensateContainer(TActivityOrCompensateContainer tActivityOrCompensateContainer, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tActivityOrCompensateContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssign(TAssign tAssign, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tAssign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCatch(TCatch tCatch, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCatch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCompensate(TCompensate tCompensate, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCompensate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCompensationHandler(TCompensationHandler tCompensationHandler, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCompensationHandler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCopy(TCopy tCopy, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCopy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCorrelation(TCorrelation tCorrelation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCorrelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCorrelations(TCorrelations tCorrelations, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCorrelations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCorrelationSet(TCorrelationSet tCorrelationSet, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCorrelationSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCorrelationSets(TCorrelationSets tCorrelationSets, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCorrelationSets, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCorrelationsWithPattern(TCorrelationsWithPattern tCorrelationsWithPattern, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCorrelationsWithPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCorrelationWithPattern(TCorrelationWithPattern tCorrelationWithPattern, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tCorrelationWithPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEmpty(TEmpty tEmpty, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tEmpty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEventHandlers(TEventHandlers tEventHandlers, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tEventHandlers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensibleElements(TExtensibleElements tExtensibleElements, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tExtensibleElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFaultHandlers(TFaultHandlers tFaultHandlers, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tFaultHandlers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFlow(TFlow tFlow, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFrom(TFrom tFrom, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTInvoke(TInvoke tInvoke, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tInvoke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLink(TLink tLink, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLinks(TLinks tLinks, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tLinks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOnAlarm(TOnAlarm tOnAlarm, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tOnAlarm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOnMessage(TOnMessage tOnMessage, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tOnMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToType(ToType toType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(toType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPartner(TPartner tPartner, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tPartner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPartnerLink(TPartnerLink tPartnerLink, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tPartnerLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPartnerLinks(TPartnerLinks tPartnerLinks, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tPartnerLinks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPartners(TPartners tPartners, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tPartners, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPick(TPick tPick, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tPick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProcess(TProcess tProcess, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTReceive(TReceive tReceive, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tReceive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTReply(TReply tReply, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tReply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTScope(TScope tScope, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSequence(TSequence tSequence, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSource(TSource tSource, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSwitch(TSwitch tSwitch, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tSwitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTarget(TTarget tTarget, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTerminate(TTerminate tTerminate, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tTerminate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTThrow(TThrow tThrow, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tThrow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVariable(TVariable tVariable, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVariables(TVariables tVariables, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tVariables, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTWait(TWait tWait, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tWait, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTWhile(TWhile tWhile, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tWhile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBoolean(Object tBoolean, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRoles(Object tRoles, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternType(String patternType, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePatternType_Enumeration(patternType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePatternType_Enumeration
	 */
	public static final Collection PATTERN_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 "in",
				 "out",
				 "out-in"
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Pattern Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternType_Enumeration(String patternType, DiagnosticChain diagnostics, Map context) {
		boolean result = PATTERN_TYPE__ENUMERATION__VALUES.contains(patternType);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(ProcessPackage.eINSTANCE.getPatternType(), patternType, PATTERN_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType(List propertiesType, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePropertiesType_ItemType(propertiesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType_ItemType(List propertiesType, DiagnosticChain diagnostics, Map context) {
		boolean result = true;
		for (Iterator i = propertiesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.eINSTANCE.getQName().isInstance(item)) {
				result &= xmlTypeValidator.validateQName((Object)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.eINSTANCE.getQName(), item, diagnostics, context);
			}
		}
	  return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBooleanExpr(String tBooleanExpr, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBooleanObject(TBoolean tBooleanObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeadlineExpr(String tDeadlineExpr, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDurationExpr(String tDurationExpr, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRolesObject(TRoles tRolesObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //ProcessValidator
