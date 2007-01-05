/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.xmlsoap.schemas.ws._2003._03.business.process.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessFactoryImpl extends EFactoryImpl implements ProcessFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessPackage.CASE_TYPE: return createCaseType();
			case ProcessPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ProcessPackage.PARTNER_LINK_TYPE: return createPartnerLinkType();
			case ProcessPackage.TACTIVITY: return createTActivity();
			case ProcessPackage.TACTIVITY_CONTAINER: return createTActivityContainer();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER: return createTActivityOrCompensateContainer();
			case ProcessPackage.TASSIGN: return createTAssign();
			case ProcessPackage.TCATCH: return createTCatch();
			case ProcessPackage.TCOMPENSATE: return createTCompensate();
			case ProcessPackage.TCOMPENSATION_HANDLER: return createTCompensationHandler();
			case ProcessPackage.TCOPY: return createTCopy();
			case ProcessPackage.TCORRELATION: return createTCorrelation();
			case ProcessPackage.TCORRELATIONS: return createTCorrelations();
			case ProcessPackage.TCORRELATION_SET: return createTCorrelationSet();
			case ProcessPackage.TCORRELATION_SETS: return createTCorrelationSets();
			case ProcessPackage.TCORRELATIONS_WITH_PATTERN: return createTCorrelationsWithPattern();
			case ProcessPackage.TCORRELATION_WITH_PATTERN: return createTCorrelationWithPattern();
			case ProcessPackage.TEMPTY: return createTEmpty();
			case ProcessPackage.TEVENT_HANDLERS: return createTEventHandlers();
			case ProcessPackage.TEXTENSIBLE_ELEMENTS: return createTExtensibleElements();
			case ProcessPackage.TFAULT_HANDLERS: return createTFaultHandlers();
			case ProcessPackage.TFLOW: return createTFlow();
			case ProcessPackage.TFROM: return createTFrom();
			case ProcessPackage.TINVOKE: return createTInvoke();
			case ProcessPackage.TLINK: return createTLink();
			case ProcessPackage.TLINKS: return createTLinks();
			case ProcessPackage.TON_ALARM: return createTOnAlarm();
			case ProcessPackage.TON_MESSAGE: return createTOnMessage();
			case ProcessPackage.TO_TYPE: return createToType();
			case ProcessPackage.TPARTNER: return createTPartner();
			case ProcessPackage.TPARTNER_LINK: return createTPartnerLink();
			case ProcessPackage.TPARTNER_LINKS: return createTPartnerLinks();
			case ProcessPackage.TPARTNERS: return createTPartners();
			case ProcessPackage.TPICK: return createTPick();
			case ProcessPackage.TPROCESS: return createTProcess();
			case ProcessPackage.TRECEIVE: return createTReceive();
			case ProcessPackage.TREPLY: return createTReply();
			case ProcessPackage.TSCOPE: return createTScope();
			case ProcessPackage.TSEQUENCE: return createTSequence();
			case ProcessPackage.TSOURCE: return createTSource();
			case ProcessPackage.TSWITCH: return createTSwitch();
			case ProcessPackage.TTARGET: return createTTarget();
			case ProcessPackage.TTERMINATE: return createTTerminate();
			case ProcessPackage.TTHROW: return createTThrow();
			case ProcessPackage.TVARIABLE: return createTVariable();
			case ProcessPackage.TVARIABLES: return createTVariables();
			case ProcessPackage.TWAIT: return createTWait();
			case ProcessPackage.TWHILE: return createTWhile();
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
			case ProcessPackage.TBOOLEAN: {
				TBoolean result = TBoolean.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case ProcessPackage.TROLES: {
				TRoles result = TRoles.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case ProcessPackage.PATTERN_TYPE:
				return createPatternTypeFromString(eDataType, initialValue);
			case ProcessPackage.PROPERTIES_TYPE:
				return createPropertiesTypeFromString(eDataType, initialValue);
			case ProcessPackage.TBOOLEAN_EXPR:
				return createTBooleanExprFromString(eDataType, initialValue);
			case ProcessPackage.TBOOLEAN_OBJECT:
				return createTBooleanObjectFromString(eDataType, initialValue);
			case ProcessPackage.TDEADLINE_EXPR:
				return createTDeadlineExprFromString(eDataType, initialValue);
			case ProcessPackage.TDURATION_EXPR:
				return createTDurationExprFromString(eDataType, initialValue);
			case ProcessPackage.TROLES_OBJECT:
				return createTRolesObjectFromString(eDataType, initialValue);
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
			case ProcessPackage.TBOOLEAN:
				return instanceValue == null ? null : instanceValue.toString();
			case ProcessPackage.TROLES:
				return instanceValue == null ? null : instanceValue.toString();
			case ProcessPackage.PATTERN_TYPE:
				return convertPatternTypeToString(eDataType, instanceValue);
			case ProcessPackage.PROPERTIES_TYPE:
				return convertPropertiesTypeToString(eDataType, instanceValue);
			case ProcessPackage.TBOOLEAN_EXPR:
				return convertTBooleanExprToString(eDataType, instanceValue);
			case ProcessPackage.TBOOLEAN_OBJECT:
				return convertTBooleanObjectToString(eDataType, instanceValue);
			case ProcessPackage.TDEADLINE_EXPR:
				return convertTDeadlineExprToString(eDataType, instanceValue);
			case ProcessPackage.TDURATION_EXPR:
				return convertTDurationExprToString(eDataType, instanceValue);
			case ProcessPackage.TROLES_OBJECT:
				return convertTRolesObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseType createCaseType() {
		CaseTypeImpl caseType = new CaseTypeImpl();
		return caseType;
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
	public PartnerLinkType createPartnerLinkType() {
		PartnerLinkTypeImpl partnerLinkType = new PartnerLinkTypeImpl();
		return partnerLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TActivity createTActivity() {
		TActivityImpl tActivity = new TActivityImpl();
		return tActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TActivityContainer createTActivityContainer() {
		TActivityContainerImpl tActivityContainer = new TActivityContainerImpl();
		return tActivityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TActivityOrCompensateContainer createTActivityOrCompensateContainer() {
		TActivityOrCompensateContainerImpl tActivityOrCompensateContainer = new TActivityOrCompensateContainerImpl();
		return tActivityOrCompensateContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssign createTAssign() {
		TAssignImpl tAssign = new TAssignImpl();
		return tAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCatch createTCatch() {
		TCatchImpl tCatch = new TCatchImpl();
		return tCatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCompensate createTCompensate() {
		TCompensateImpl tCompensate = new TCompensateImpl();
		return tCompensate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCompensationHandler createTCompensationHandler() {
		TCompensationHandlerImpl tCompensationHandler = new TCompensationHandlerImpl();
		return tCompensationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCopy createTCopy() {
		TCopyImpl tCopy = new TCopyImpl();
		return tCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelation createTCorrelation() {
		TCorrelationImpl tCorrelation = new TCorrelationImpl();
		return tCorrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelations createTCorrelations() {
		TCorrelationsImpl tCorrelations = new TCorrelationsImpl();
		return tCorrelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelationSet createTCorrelationSet() {
		TCorrelationSetImpl tCorrelationSet = new TCorrelationSetImpl();
		return tCorrelationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelationSets createTCorrelationSets() {
		TCorrelationSetsImpl tCorrelationSets = new TCorrelationSetsImpl();
		return tCorrelationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelationsWithPattern createTCorrelationsWithPattern() {
		TCorrelationsWithPatternImpl tCorrelationsWithPattern = new TCorrelationsWithPatternImpl();
		return tCorrelationsWithPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelationWithPattern createTCorrelationWithPattern() {
		TCorrelationWithPatternImpl tCorrelationWithPattern = new TCorrelationWithPatternImpl();
		return tCorrelationWithPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEmpty createTEmpty() {
		TEmptyImpl tEmpty = new TEmptyImpl();
		return tEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEventHandlers createTEventHandlers() {
		TEventHandlersImpl tEventHandlers = new TEventHandlersImpl();
		return tEventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensibleElements createTExtensibleElements() {
		TExtensibleElementsImpl tExtensibleElements = new TExtensibleElementsImpl();
		return tExtensibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFaultHandlers createTFaultHandlers() {
		TFaultHandlersImpl tFaultHandlers = new TFaultHandlersImpl();
		return tFaultHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFlow createTFlow() {
		TFlowImpl tFlow = new TFlowImpl();
		return tFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrom createTFrom() {
		TFromImpl tFrom = new TFromImpl();
		return tFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInvoke createTInvoke() {
		TInvokeImpl tInvoke = new TInvokeImpl();
		return tInvoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLink createTLink() {
		TLinkImpl tLink = new TLinkImpl();
		return tLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLinks createTLinks() {
		TLinksImpl tLinks = new TLinksImpl();
		return tLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOnAlarm createTOnAlarm() {
		TOnAlarmImpl tOnAlarm = new TOnAlarmImpl();
		return tOnAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOnMessage createTOnMessage() {
		TOnMessageImpl tOnMessage = new TOnMessageImpl();
		return tOnMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToType createToType() {
		ToTypeImpl toType = new ToTypeImpl();
		return toType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPartner createTPartner() {
		TPartnerImpl tPartner = new TPartnerImpl();
		return tPartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPartnerLink createTPartnerLink() {
		TPartnerLinkImpl tPartnerLink = new TPartnerLinkImpl();
		return tPartnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPartnerLinks createTPartnerLinks() {
		TPartnerLinksImpl tPartnerLinks = new TPartnerLinksImpl();
		return tPartnerLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPartners createTPartners() {
		TPartnersImpl tPartners = new TPartnersImpl();
		return tPartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPick createTPick() {
		TPickImpl tPick = new TPickImpl();
		return tPick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProcess createTProcess() {
		TProcessImpl tProcess = new TProcessImpl();
		return tProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReceive createTReceive() {
		TReceiveImpl tReceive = new TReceiveImpl();
		return tReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReply createTReply() {
		TReplyImpl tReply = new TReplyImpl();
		return tReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TScope createTScope() {
		TScopeImpl tScope = new TScopeImpl();
		return tScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSequence createTSequence() {
		TSequenceImpl tSequence = new TSequenceImpl();
		return tSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSource createTSource() {
		TSourceImpl tSource = new TSourceImpl();
		return tSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSwitch createTSwitch() {
		TSwitchImpl tSwitch = new TSwitchImpl();
		return tSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTarget createTTarget() {
		TTargetImpl tTarget = new TTargetImpl();
		return tTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTerminate createTTerminate() {
		TTerminateImpl tTerminate = new TTerminateImpl();
		return tTerminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TThrow createTThrow() {
		TThrowImpl tThrow = new TThrowImpl();
		return tThrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariable createTVariable() {
		TVariableImpl tVariable = new TVariableImpl();
		return tVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariables createTVariables() {
		TVariablesImpl tVariables = new TVariablesImpl();
		return tVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWait createTWait() {
		TWaitImpl tWait = new TWaitImpl();
		return tWait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWhile createTWhile() {
		TWhileImpl tWhile = new TWhileImpl();
		return tWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPatternTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createPropertiesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List result = new ArrayList();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertiesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List list = (List)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Iterator i = list.iterator(); i.hasNext(); ) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getQName(), i.next()));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTBooleanExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return (TBoolean)ProcessFactory.eINSTANCE.createFromString(ProcessPackage.eINSTANCE.getTBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return ProcessFactory.eINSTANCE.convertToString(ProcessPackage.eINSTANCE.getTBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTDeadlineExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDeadlineExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTDurationExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDurationExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRoles createTRolesObjectFromString(EDataType eDataType, String initialValue) {
		return (TRoles)ProcessFactory.eINSTANCE.createFromString(ProcessPackage.eINSTANCE.getTRoles(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRolesObjectToString(EDataType eDataType, Object instanceValue) {
		return ProcessFactory.eINSTANCE.convertToString(ProcessPackage.eINSTANCE.getTRoles(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage getProcessPackage() {
		return (ProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ProcessPackage getPackage() {
		return ProcessPackage.eINSTANCE;
	}

} //ProcessFactoryImpl
