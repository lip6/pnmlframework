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
package fr.lip6.move.pnml.pnmlcoremodel.impl;

import java.net.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.lip6.move.pnml.pnmlcoremodel.AnnotationGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.ArcGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2Color;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontFamily;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontSize;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontStyle;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontWeight;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Font;
import fr.lip6.move.pnml.pnmlcoremodel.FontAlign;
import fr.lip6.move.pnml.pnmlcoremodel.FontDecoration;
import fr.lip6.move.pnml.pnmlcoremodel.Gradient;
import fr.lip6.move.pnml.pnmlcoremodel.Line;
import fr.lip6.move.pnml.pnmlcoremodel.LineShape;
import fr.lip6.move.pnml.pnmlcoremodel.LineStyle;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Offset;
import fr.lip6.move.pnml.pnmlcoremodel.PNType;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;
import fr.lip6.move.pnml.pnmlcoremodel.Place;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelFactory;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelPackage;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.RefPlace;
import fr.lip6.move.pnml.pnmlcoremodel.RefTransition;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;
import fr.lip6.move.pnml.pnmlcoremodel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PnmlcoremodelFactoryImpl extends EFactoryImpl implements PnmlcoremodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PnmlcoremodelFactory init() {
		try {
			PnmlcoremodelFactory thePnmlcoremodelFactory = (PnmlcoremodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(PnmlcoremodelPackage.eNS_URI);
			if (thePnmlcoremodelFactory != null) {
				return thePnmlcoremodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PnmlcoremodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnmlcoremodelFactoryImpl() {
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
		case PnmlcoremodelPackage.PETRI_NET_DOC:
			return createPetriNetDoc();
		case PnmlcoremodelPackage.PETRI_NET:
			return createPetriNet();
		case PnmlcoremodelPackage.PAGE:
			return createPage();
		case PnmlcoremodelPackage.NAME:
			return createName();
		case PnmlcoremodelPackage.TOOL_INFO:
			return createToolInfo();
		case PnmlcoremodelPackage.NODE_GRAPHICS:
			return createNodeGraphics();
		case PnmlcoremodelPackage.POSITION:
			return createPosition();
		case PnmlcoremodelPackage.OFFSET:
			return createOffset();
		case PnmlcoremodelPackage.DIMENSION:
			return createDimension();
		case PnmlcoremodelPackage.ANNOTATION_GRAPHICS:
			return createAnnotationGraphics();
		case PnmlcoremodelPackage.FILL:
			return createFill();
		case PnmlcoremodelPackage.LINE:
			return createLine();
		case PnmlcoremodelPackage.ARC_GRAPHICS:
			return createArcGraphics();
		case PnmlcoremodelPackage.ARC:
			return createArc();
		case PnmlcoremodelPackage.FONT:
			return createFont();
		case PnmlcoremodelPackage.PLACE:
			return createPlace();
		case PnmlcoremodelPackage.REF_TRANSITION:
			return createRefTransition();
		case PnmlcoremodelPackage.TRANSITION:
			return createTransition();
		case PnmlcoremodelPackage.REF_PLACE:
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
		case PnmlcoremodelPackage.PN_TYPE:
			return createPNTypeFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.CSS2_COLOR:
			return createCSS2ColorFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.GRADIENT:
			return createGradientFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.LINE_SHAPE:
			return createLineShapeFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.FONT_ALIGN:
			return createFontAlignFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.FONT_DECORATION:
			return createFontDecorationFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.CSS2_FONT_FAMILY:
			return createCSS2FontFamilyFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.CSS2_FONT_SIZE:
			return createCSS2FontSizeFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.CSS2_FONT_STYLE:
			return createCSS2FontStyleFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.CSS2_FONT_WEIGHT:
			return createCSS2FontWeightFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.LINE_STYLE:
			return createLineStyleFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.URI:
			return createURIFromString(eDataType, initialValue);
		case PnmlcoremodelPackage.LONG_STRING:
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
		case PnmlcoremodelPackage.PN_TYPE:
			return convertPNTypeToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.CSS2_COLOR:
			return convertCSS2ColorToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.GRADIENT:
			return convertGradientToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.LINE_SHAPE:
			return convertLineShapeToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.FONT_ALIGN:
			return convertFontAlignToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.FONT_DECORATION:
			return convertFontDecorationToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.CSS2_FONT_FAMILY:
			return convertCSS2FontFamilyToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.CSS2_FONT_SIZE:
			return convertCSS2FontSizeToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.CSS2_FONT_STYLE:
			return convertCSS2FontStyleToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.CSS2_FONT_WEIGHT:
			return convertCSS2FontWeightToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.LINE_STYLE:
			return convertLineStyleToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.URI:
			return convertURIToString(eDataType, instanceValue);
		case PnmlcoremodelPackage.LONG_STRING:
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
	public PnmlcoremodelPackage getPnmlcoremodelPackage() {
		return (PnmlcoremodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PnmlcoremodelPackage getPackage() {
		return PnmlcoremodelPackage.eINSTANCE;
	}

} //PnmlcoremodelFactoryImpl
