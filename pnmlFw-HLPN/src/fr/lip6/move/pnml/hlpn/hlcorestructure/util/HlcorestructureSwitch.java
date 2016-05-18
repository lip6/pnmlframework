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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Arc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Attribute;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Font;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Graphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLCoreAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Offset;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage
 * @generated
 */
public class HlcorestructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HlcorestructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlcorestructureSwitch() {
		if (modelPackage == null) {
			modelPackage = HlcorestructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case HlcorestructurePackage.PETRI_NET_DOC: {
			PetriNetDoc petriNetDoc = (PetriNetDoc) theEObject;
			T result = casePetriNetDoc(petriNetDoc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.PETRI_NET: {
			PetriNet petriNet = (PetriNet) theEObject;
			T result = casePetriNet(petriNet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = casePnObject(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.PN_OBJECT: {
			PnObject pnObject = (PnObject) theEObject;
			T result = casePnObject(pnObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.NAME: {
			Name name = (Name) theEObject;
			T result = caseName(name);
			if (result == null)
				result = caseAnnotation(name);
			if (result == null)
				result = caseLabel(name);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.TOOL_INFO: {
			ToolInfo toolInfo = (ToolInfo) theEObject;
			T result = caseToolInfo(toolInfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.NODE_GRAPHICS: {
			NodeGraphics nodeGraphics = (NodeGraphics) theEObject;
			T result = caseNodeGraphics(nodeGraphics);
			if (result == null)
				result = caseGraphics(nodeGraphics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.GRAPHICS: {
			Graphics graphics = (Graphics) theEObject;
			T result = caseGraphics(graphics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.COORDINATE: {
			Coordinate coordinate = (Coordinate) theEObject;
			T result = caseCoordinate(coordinate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.POSITION: {
			Position position = (Position) theEObject;
			T result = casePosition(position);
			if (result == null)
				result = caseCoordinate(position);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.OFFSET: {
			Offset offset = (Offset) theEObject;
			T result = caseOffset(offset);
			if (result == null)
				result = caseCoordinate(offset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.DIMENSION: {
			Dimension dimension = (Dimension) theEObject;
			T result = caseDimension(dimension);
			if (result == null)
				result = caseCoordinate(dimension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.ANNOTATION_GRAPHICS: {
			AnnotationGraphics annotationGraphics = (AnnotationGraphics) theEObject;
			T result = caseAnnotationGraphics(annotationGraphics);
			if (result == null)
				result = caseGraphics(annotationGraphics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.FILL: {
			Fill fill = (Fill) theEObject;
			T result = caseFill(fill);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.ARC_GRAPHICS: {
			ArcGraphics arcGraphics = (ArcGraphics) theEObject;
			T result = caseArcGraphics(arcGraphics);
			if (result == null)
				result = caseGraphics(arcGraphics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.ARC: {
			Arc arc = (Arc) theEObject;
			T result = caseArc(arc);
			if (result == null)
				result = casePnObject(arc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = casePnObject(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.FONT: {
			Font font = (Font) theEObject;
			T result = caseFont(font);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.PLACE_NODE: {
			PlaceNode placeNode = (PlaceNode) theEObject;
			T result = casePlaceNode(placeNode);
			if (result == null)
				result = caseNode(placeNode);
			if (result == null)
				result = casePnObject(placeNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.TRANSITION_NODE: {
			TransitionNode transitionNode = (TransitionNode) theEObject;
			T result = caseTransitionNode(transitionNode);
			if (result == null)
				result = caseNode(transitionNode);
			if (result == null)
				result = casePnObject(transitionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.PLACE: {
			Place place = (Place) theEObject;
			T result = casePlace(place);
			if (result == null)
				result = casePlaceNode(place);
			if (result == null)
				result = caseNode(place);
			if (result == null)
				result = casePnObject(place);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.REF_TRANSITION: {
			RefTransition refTransition = (RefTransition) theEObject;
			T result = caseRefTransition(refTransition);
			if (result == null)
				result = caseTransitionNode(refTransition);
			if (result == null)
				result = caseNode(refTransition);
			if (result == null)
				result = casePnObject(refTransition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseTransitionNode(transition);
			if (result == null)
				result = caseNode(transition);
			if (result == null)
				result = casePnObject(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.REF_PLACE: {
			RefPlace refPlace = (RefPlace) theEObject;
			T result = caseRefPlace(refPlace);
			if (result == null)
				result = casePlaceNode(refPlace);
			if (result == null)
				result = caseNode(refPlace);
			if (result == null)
				result = casePnObject(refPlace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = caseLabel(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = caseLabel(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.ANY_OBJECT: {
			AnyObject anyObject = (AnyObject) theEObject;
			T result = caseAnyObject(anyObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.HL_CORE_ANNOTATION: {
			HLCoreAnnotation hlCoreAnnotation = (HLCoreAnnotation) theEObject;
			T result = caseHLCoreAnnotation(hlCoreAnnotation);
			if (result == null)
				result = caseAnnotation(hlCoreAnnotation);
			if (result == null)
				result = caseLabel(hlCoreAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseHLCoreAnnotation(type);
			if (result == null)
				result = caseAnnotation(type);
			if (result == null)
				result = caseLabel(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.HL_MARKING: {
			HLMarking hlMarking = (HLMarking) theEObject;
			T result = caseHLMarking(hlMarking);
			if (result == null)
				result = caseHLCoreAnnotation(hlMarking);
			if (result == null)
				result = caseAnnotation(hlMarking);
			if (result == null)
				result = caseLabel(hlMarking);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseHLCoreAnnotation(condition);
			if (result == null)
				result = caseAnnotation(condition);
			if (result == null)
				result = caseLabel(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.HL_ANNOTATION: {
			HLAnnotation hlAnnotation = (HLAnnotation) theEObject;
			T result = caseHLAnnotation(hlAnnotation);
			if (result == null)
				result = caseHLCoreAnnotation(hlAnnotation);
			if (result == null)
				result = caseAnnotation(hlAnnotation);
			if (result == null)
				result = caseLabel(hlAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlcorestructurePackage.DECLARATION: {
			Declaration declaration = (Declaration) theEObject;
			T result = caseDeclaration(declaration);
			if (result == null)
				result = caseHLCoreAnnotation(declaration);
			if (result == null)
				result = caseAnnotation(declaration);
			if (result == null)
				result = caseLabel(declaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net Doc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net Doc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNetDoc(PetriNetDoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNet(PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pn Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pn Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePnObject(PnObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolInfo(ToolInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Graphics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeGraphics(NodeGraphics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphics(Graphics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinate(Coordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Graphics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationGraphics(AnnotationGraphics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFill(Fill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Graphics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcGraphics(ArcGraphics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceNode(PlaceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionNode(TransitionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefTransition(RefTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefPlace(RefPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyObject(AnyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HL Core Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HL Core Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLCoreAnnotation(HLCoreAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HL Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HL Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLMarking(HLMarking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HL Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HL Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLAnnotation(HLAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HlcorestructureSwitch
