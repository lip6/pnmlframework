/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.ptnet.impl;

import java.net.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.CSS2FontFamily;
import fr.lip6.move.pnml.ptnet.CSS2FontSize;
import fr.lip6.move.pnml.ptnet.CSS2FontStyle;
import fr.lip6.move.pnml.ptnet.CSS2FontWeight;
import fr.lip6.move.pnml.ptnet.Dimension;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.FontAlign;
import fr.lip6.move.pnml.ptnet.FontDecoration;
import fr.lip6.move.pnml.ptnet.Gradient;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.LineShape;
import fr.lip6.move.pnml.ptnet.LineStyle;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.RefPlace;
import fr.lip6.move.pnml.ptnet.RefTransition;
import fr.lip6.move.pnml.ptnet.ToolInfo;
import fr.lip6.move.pnml.ptnet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetFactoryImpl extends EFactoryImpl implements PtnetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetFactory init() {
		try {
			PtnetFactory thePtnetFactory = (PtnetFactory) EPackage.Registry.INSTANCE.getEFactory(PtnetPackage.eNS_URI);
			if (thePtnetFactory != null) {
				return thePtnetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PtnetPackage.PT_MARKING:
			return createPTMarking();
		case PtnetPackage.PT_ARC_ANNOTATION:
			return createPTArcAnnotation();
		case PtnetPackage.PETRI_NET_DOC:
			return createPetriNetDoc();
		case PtnetPackage.PETRI_NET:
			return createPetriNet();
		case PtnetPackage.PAGE:
			return createPage();
		case PtnetPackage.NAME:
			return createName();
		case PtnetPackage.TOOL_INFO:
			return createToolInfo();
		case PtnetPackage.NODE_GRAPHICS:
			return createNodeGraphics();
		case PtnetPackage.POSITION:
			return createPosition();
		case PtnetPackage.OFFSET:
			return createOffset();
		case PtnetPackage.DIMENSION:
			return createDimension();
		case PtnetPackage.ANNOTATION_GRAPHICS:
			return createAnnotationGraphics();
		case PtnetPackage.FILL:
			return createFill();
		case PtnetPackage.LINE:
			return createLine();
		case PtnetPackage.ARC_GRAPHICS:
			return createArcGraphics();
		case PtnetPackage.ARC:
			return createArc();
		case PtnetPackage.FONT:
			return createFont();
		case PtnetPackage.PLACE:
			return createPlace();
		case PtnetPackage.REF_TRANSITION:
			return createRefTransition();
		case PtnetPackage.TRANSITION:
			return createTransition();
		case PtnetPackage.REF_PLACE:
			return createRefPlace();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PtnetPackage.PN_TYPE:
			return createPNTypeFromString(eDataType, initialValue);
		case PtnetPackage.CSS2_COLOR:
			return createCSS2ColorFromString(eDataType, initialValue);
		case PtnetPackage.GRADIENT:
			return createGradientFromString(eDataType, initialValue);
		case PtnetPackage.LINE_SHAPE:
			return createLineShapeFromString(eDataType, initialValue);
		case PtnetPackage.FONT_ALIGN:
			return createFontAlignFromString(eDataType, initialValue);
		case PtnetPackage.FONT_DECORATION:
			return createFontDecorationFromString(eDataType, initialValue);
		case PtnetPackage.CSS2_FONT_FAMILY:
			return createCSS2FontFamilyFromString(eDataType, initialValue);
		case PtnetPackage.CSS2_FONT_SIZE:
			return createCSS2FontSizeFromString(eDataType, initialValue);
		case PtnetPackage.CSS2_FONT_STYLE:
			return createCSS2FontStyleFromString(eDataType, initialValue);
		case PtnetPackage.CSS2_FONT_WEIGHT:
			return createCSS2FontWeightFromString(eDataType, initialValue);
		case PtnetPackage.LINE_STYLE:
			return createLineStyleFromString(eDataType, initialValue);
		case PtnetPackage.POSITIVE_INTEGER:
			return createPositiveIntegerFromString(eDataType, initialValue);
		case PtnetPackage.NATURAL:
			return createNaturalFromString(eDataType, initialValue);
		case PtnetPackage.URI:
			return createURIFromString(eDataType, initialValue);
		case PtnetPackage.LONG_STRING:
			return createLongStringFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PtnetPackage.PN_TYPE:
			return convertPNTypeToString(eDataType, instanceValue);
		case PtnetPackage.CSS2_COLOR:
			return convertCSS2ColorToString(eDataType, instanceValue);
		case PtnetPackage.GRADIENT:
			return convertGradientToString(eDataType, instanceValue);
		case PtnetPackage.LINE_SHAPE:
			return convertLineShapeToString(eDataType, instanceValue);
		case PtnetPackage.FONT_ALIGN:
			return convertFontAlignToString(eDataType, instanceValue);
		case PtnetPackage.FONT_DECORATION:
			return convertFontDecorationToString(eDataType, instanceValue);
		case PtnetPackage.CSS2_FONT_FAMILY:
			return convertCSS2FontFamilyToString(eDataType, instanceValue);
		case PtnetPackage.CSS2_FONT_SIZE:
			return convertCSS2FontSizeToString(eDataType, instanceValue);
		case PtnetPackage.CSS2_FONT_STYLE:
			return convertCSS2FontStyleToString(eDataType, instanceValue);
		case PtnetPackage.CSS2_FONT_WEIGHT:
			return convertCSS2FontWeightToString(eDataType, instanceValue);
		case PtnetPackage.LINE_STYLE:
			return convertLineStyleToString(eDataType, instanceValue);
		case PtnetPackage.POSITIVE_INTEGER:
			return convertPositiveIntegerToString(eDataType, instanceValue);
		case PtnetPackage.NATURAL:
			return convertNaturalToString(eDataType, instanceValue);
		case PtnetPackage.URI:
			return convertURIToString(eDataType, instanceValue);
		case PtnetPackage.LONG_STRING:
			return convertLongStringToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTMarking createPTMarking() {
		PTMarkingImpl ptMarking = new PTMarkingImpl();
		return ptMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTArcAnnotation createPTArcAnnotation() {
		PTArcAnnotationImpl ptArcAnnotation = new PTArcAnnotationImpl();
		return ptArcAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetDoc createPetriNetDoc() {
		PetriNetDocImpl petriNetDoc = new PetriNetDocImpl();
		return petriNetDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolInfo createToolInfo() {
		ToolInfoImpl toolInfo = new ToolInfoImpl();
		return toolInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGraphics createNodeGraphics() {
		NodeGraphicsImpl nodeGraphics = new NodeGraphicsImpl();
		return nodeGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationGraphics createAnnotationGraphics() {
		AnnotationGraphicsImpl annotationGraphics = new AnnotationGraphicsImpl();
		return annotationGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill createFill() {
		FillImpl fill = new FillImpl();
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcGraphics createArcGraphics() {
		ArcGraphicsImpl arcGraphics = new ArcGraphicsImpl();
		return arcGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTransition createRefTransition() {
		RefTransitionImpl refTransition = new RefTransitionImpl();
		return refTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefPlace createRefPlace() {
		RefPlaceImpl refPlace = new RefPlaceImpl();
		return refPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNType createPNTypeFromString(EDataType eDataType, String initialValue) {
		PNType result = PNType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPNTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS2Color createCSS2ColorFromString(EDataType eDataType, String initialValue) {
		CSS2Color result = CSS2Color.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSS2ColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gradient createGradientFromString(EDataType eDataType, String initialValue) {
		Gradient result = Gradient.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradientToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineShape createLineShapeFromString(EDataType eDataType, String initialValue) {
		LineShape result = LineShape.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontAlign createFontAlignFromString(EDataType eDataType, String initialValue) {
		FontAlign result = FontAlign.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDecoration createFontDecorationFromString(EDataType eDataType, String initialValue) {
		FontDecoration result = FontDecoration.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontDecorationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS2FontFamily createCSS2FontFamilyFromString(EDataType eDataType, String initialValue) {
		CSS2FontFamily result = CSS2FontFamily.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSS2FontFamilyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS2FontSize createCSS2FontSizeFromString(EDataType eDataType, String initialValue) {
		CSS2FontSize result = CSS2FontSize.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSS2FontSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS2FontStyle createCSS2FontStyleFromString(EDataType eDataType, String initialValue) {
		CSS2FontStyle result = CSS2FontStyle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSS2FontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS2FontWeight createCSS2FontWeightFromString(EDataType eDataType, String initialValue) {
		CSS2FontWeight result = CSS2FontWeight.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSS2FontWeightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue) {
		LineStyle result = LineStyle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
					+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createNaturalFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNaturalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBuffer createLongStringFromString(EDataType eDataType, String initialValue) {
		return (StringBuffer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetPackage getPtnetPackage() {
		return (PtnetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetPackage getPackage() {
		return PtnetPackage.eINSTANCE;
	}

} //PtnetFactoryImpl
