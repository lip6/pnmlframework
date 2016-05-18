/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
/**
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6/MoVe)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial models and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture 
 *    Guillaume Giffo (UPMC) - Code generation refactoring, High-level API
 */
package fr.lip6.move.pnml.hlpn.hlcorestructure.util;

import java.net.URI;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Arc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Attribute;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Font;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Graphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLCoreAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Offset;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Place;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Position;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Transition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage
 * @generated
 */
public class HlcorestructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HlcorestructureValidator INSTANCE = new HlcorestructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.lip6.move.pnml.hlpn.hlcorestructure";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlcorestructureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return HlcorestructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case HlcorestructurePackage.PETRI_NET_DOC:
			return validatePetriNetDoc((PetriNetDoc) value, diagnostics, context);
		case HlcorestructurePackage.PETRI_NET:
			return validatePetriNet((PetriNet) value, diagnostics, context);
		case HlcorestructurePackage.PAGE:
			return validatePage((Page) value, diagnostics, context);
		case HlcorestructurePackage.PN_OBJECT:
			return validatePnObject((PnObject) value, diagnostics, context);
		case HlcorestructurePackage.NAME:
			return validateName((Name) value, diagnostics, context);
		case HlcorestructurePackage.TOOL_INFO:
			return validateToolInfo((ToolInfo) value, diagnostics, context);
		case HlcorestructurePackage.LABEL:
			return validateLabel((Label) value, diagnostics, context);
		case HlcorestructurePackage.NODE_GRAPHICS:
			return validateNodeGraphics((NodeGraphics) value, diagnostics, context);
		case HlcorestructurePackage.GRAPHICS:
			return validateGraphics((Graphics) value, diagnostics, context);
		case HlcorestructurePackage.COORDINATE:
			return validateCoordinate((Coordinate) value, diagnostics, context);
		case HlcorestructurePackage.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case HlcorestructurePackage.OFFSET:
			return validateOffset((Offset) value, diagnostics, context);
		case HlcorestructurePackage.DIMENSION:
			return validateDimension((Dimension) value, diagnostics, context);
		case HlcorestructurePackage.ANNOTATION_GRAPHICS:
			return validateAnnotationGraphics((AnnotationGraphics) value, diagnostics, context);
		case HlcorestructurePackage.FILL:
			return validateFill((Fill) value, diagnostics, context);
		case HlcorestructurePackage.LINE:
			return validateLine((Line) value, diagnostics, context);
		case HlcorestructurePackage.ARC_GRAPHICS:
			return validateArcGraphics((ArcGraphics) value, diagnostics, context);
		case HlcorestructurePackage.ARC:
			return validateArc((Arc) value, diagnostics, context);
		case HlcorestructurePackage.NODE:
			return validateNode((Node) value, diagnostics, context);
		case HlcorestructurePackage.FONT:
			return validateFont((Font) value, diagnostics, context);
		case HlcorestructurePackage.PLACE_NODE:
			return validatePlaceNode((PlaceNode) value, diagnostics, context);
		case HlcorestructurePackage.TRANSITION_NODE:
			return validateTransitionNode((TransitionNode) value, diagnostics, context);
		case HlcorestructurePackage.PLACE:
			return validatePlace((Place) value, diagnostics, context);
		case HlcorestructurePackage.REF_TRANSITION:
			return validateRefTransition((RefTransition) value, diagnostics, context);
		case HlcorestructurePackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case HlcorestructurePackage.REF_PLACE:
			return validateRefPlace((RefPlace) value, diagnostics, context);
		case HlcorestructurePackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case HlcorestructurePackage.ANNOTATION:
			return validateAnnotation((Annotation) value, diagnostics, context);
		case HlcorestructurePackage.ANY_OBJECT:
			return validateAnyObject((AnyObject) value, diagnostics, context);
		case HlcorestructurePackage.HL_CORE_ANNOTATION:
			return validateHLCoreAnnotation((HLCoreAnnotation) value, diagnostics, context);
		case HlcorestructurePackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case HlcorestructurePackage.HL_MARKING:
			return validateHLMarking((HLMarking) value, diagnostics, context);
		case HlcorestructurePackage.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
		case HlcorestructurePackage.HL_ANNOTATION:
			return validateHLAnnotation((HLAnnotation) value, diagnostics, context);
		case HlcorestructurePackage.DECLARATION:
			return validateDeclaration((Declaration) value, diagnostics, context);
		case HlcorestructurePackage.PN_TYPE:
			return validatePNType((PNType) value, diagnostics, context);
		case HlcorestructurePackage.CSS2_COLOR:
			return validateCSS2Color((CSS2Color) value, diagnostics, context);
		case HlcorestructurePackage.GRADIENT:
			return validateGradient((Gradient) value, diagnostics, context);
		case HlcorestructurePackage.LINE_SHAPE:
			return validateLineShape((LineShape) value, diagnostics, context);
		case HlcorestructurePackage.FONT_ALIGN:
			return validateFontAlign((FontAlign) value, diagnostics, context);
		case HlcorestructurePackage.FONT_DECORATION:
			return validateFontDecoration((FontDecoration) value, diagnostics, context);
		case HlcorestructurePackage.CSS2_FONT_FAMILY:
			return validateCSS2FontFamily((CSS2FontFamily) value, diagnostics, context);
		case HlcorestructurePackage.CSS2_FONT_SIZE:
			return validateCSS2FontSize((CSS2FontSize) value, diagnostics, context);
		case HlcorestructurePackage.CSS2_FONT_STYLE:
			return validateCSS2FontStyle((CSS2FontStyle) value, diagnostics, context);
		case HlcorestructurePackage.CSS2_FONT_WEIGHT:
			return validateCSS2FontWeight((CSS2FontWeight) value, diagnostics, context);
		case HlcorestructurePackage.LINE_STYLE:
			return validateLineStyle((LineStyle) value, diagnostics, context);
		case HlcorestructurePackage.URI:
			return validateURI((URI) value, diagnostics, context);
		case HlcorestructurePackage.LONG_STRING:
			return validateLongString((StringBuffer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNetDoc(PetriNetDoc petriNetDoc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(petriNetDoc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(petriNet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePnObject(PnObject pnObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pnObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName(Name name, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(name, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolInfo(ToolInfo toolInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeGraphics(NodeGraphics nodeGraphics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeGraphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphics(Graphics graphics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinate(Coordinate coordinate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffset(Offset offset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimension(Dimension dimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationGraphics(AnnotationGraphics annotationGraphics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationGraphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFill(Fill fill, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fill, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(line, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcGraphics(ArcGraphics arcGraphics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcGraphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arc, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArc_samePageSourceTarget(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArc_differentSourceTarget(arc, diagnostics, context);
		return result;
	}

	/**
	 * Validates the samePageSourceTarget constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_samePageSourceTarget(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "samePageSourceTarget", getObjectLabel(arc, context) }, new Object[] { arc },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the differentSourceTarget constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_differentSourceTarget(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "differentSourceTarget", getObjectLabel(arc, context) }, new Object[] { arc },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFont(Font font, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(font, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceNode(PlaceNode placeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placeNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionNode(TransitionNode transitionNode, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(place, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefTransition(RefTransition refTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefPlace(RefPlace refPlace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refPlace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyObject(AnyObject anyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHLCoreAnnotation(HLCoreAnnotation hlCoreAnnotation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hlCoreAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHLMarking(HLMarking hlMarking, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hlMarking, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHLAnnotation(HLAnnotation hlAnnotation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hlAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaration(Declaration declaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePNType(PNType pnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCSS2Color(CSS2Color css2Color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradient(Gradient gradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineShape(LineShape lineShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontAlign(FontAlign fontAlign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontDecoration(FontDecoration fontDecoration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCSS2FontFamily(CSS2FontFamily css2FontFamily, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCSS2FontSize(CSS2FontSize css2FontSize, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCSS2FontStyle(CSS2FontStyle css2FontStyle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCSS2FontWeight(CSS2FontWeight css2FontWeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStyle(LineStyle lineStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongString(StringBuffer longString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HlcorestructureValidator
