/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Attribute;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Coordinate;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Graphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLCoreAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage
 * @generated
 */
public class HlcorestructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HlcorestructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlcorestructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HlcorestructurePackage.eINSTANCE;
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
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HlcorestructureSwitch<Adapter> modelSwitch = new HlcorestructureSwitch<Adapter>() {
		@Override
		public Adapter casePetriNetDoc(PetriNetDoc object) {
			return createPetriNetDocAdapter();
		}

		@Override
		public Adapter casePetriNet(PetriNet object) {
			return createPetriNetAdapter();
		}

		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter casePnObject(PnObject object) {
			return createPnObjectAdapter();
		}

		@Override
		public Adapter caseName(Name object) {
			return createNameAdapter();
		}

		@Override
		public Adapter caseToolInfo(ToolInfo object) {
			return createToolInfoAdapter();
		}

		@Override
		public Adapter caseLabel(Label object) {
			return createLabelAdapter();
		}

		@Override
		public Adapter caseNodeGraphics(NodeGraphics object) {
			return createNodeGraphicsAdapter();
		}

		@Override
		public Adapter caseGraphics(Graphics object) {
			return createGraphicsAdapter();
		}

		@Override
		public Adapter caseCoordinate(Coordinate object) {
			return createCoordinateAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseOffset(Offset object) {
			return createOffsetAdapter();
		}

		@Override
		public Adapter caseDimension(Dimension object) {
			return createDimensionAdapter();
		}

		@Override
		public Adapter caseAnnotationGraphics(AnnotationGraphics object) {
			return createAnnotationGraphicsAdapter();
		}

		@Override
		public Adapter caseFill(Fill object) {
			return createFillAdapter();
		}

		@Override
		public Adapter caseLine(Line object) {
			return createLineAdapter();
		}

		@Override
		public Adapter caseArcGraphics(ArcGraphics object) {
			return createArcGraphicsAdapter();
		}

		@Override
		public Adapter caseArc(Arc object) {
			return createArcAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseFont(Font object) {
			return createFontAdapter();
		}

		@Override
		public Adapter casePlaceNode(PlaceNode object) {
			return createPlaceNodeAdapter();
		}

		@Override
		public Adapter caseTransitionNode(TransitionNode object) {
			return createTransitionNodeAdapter();
		}

		@Override
		public Adapter casePlace(Place object) {
			return createPlaceAdapter();
		}

		@Override
		public Adapter caseRefTransition(RefTransition object) {
			return createRefTransitionAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseRefPlace(RefPlace object) {
			return createRefPlaceAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseAnyObject(AnyObject object) {
			return createAnyObjectAdapter();
		}

		@Override
		public Adapter caseHLCoreAnnotation(HLCoreAnnotation object) {
			return createHLCoreAnnotationAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseHLMarking(HLMarking object) {
			return createHLMarkingAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseHLAnnotation(HLAnnotation object) {
			return createHLAnnotationAdapter();
		}

		@Override
		public Adapter caseDeclaration(Declaration object) {
			return createDeclarationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc <em>Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc
	 * @generated
	 */
	public Adapter createPetriNetDocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet
	 * @generated
	 */
	public Adapter createPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject <em>Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject
	 * @generated
	 */
	public Adapter createPnObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo
	 * @generated
	 */
	public Adapter createToolInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics <em>Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics
	 * @generated
	 */
	public Adapter createNodeGraphicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Graphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Graphics
	 * @generated
	 */
	public Adapter createGraphicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Coordinate
	 * @generated
	 */
	public Adapter createCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset
	 * @generated
	 */
	public Adapter createOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics <em>Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics
	 * @generated
	 */
	public Adapter createAnnotationGraphicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill
	 * @generated
	 */
	public Adapter createFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics <em>Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics
	 * @generated
	 */
	public Adapter createArcGraphicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode <em>Place Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode
	 * @generated
	 */
	public Adapter createPlaceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode
	 * @generated
	 */
	public Adapter createTransitionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition <em>Ref Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition
	 * @generated
	 */
	public Adapter createRefTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace <em>Ref Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace
	 * @generated
	 */
	public Adapter createRefPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject <em>Any Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject
	 * @generated
	 */
	public Adapter createAnyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLCoreAnnotation <em>HL Core Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLCoreAnnotation
	 * @generated
	 */
	public Adapter createHLCoreAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking <em>HL Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking
	 * @generated
	 */
	public Adapter createHLMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation <em>HL Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation
	 * @generated
	 */
	public Adapter createHLAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
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

} //HlcorestructureAdapterFactory
