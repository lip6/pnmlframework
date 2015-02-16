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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.lip6.move.pnml.ptnet.Annotation;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.AnyObject;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.Attribute;
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.CSS2FontFamily;
import fr.lip6.move.pnml.ptnet.CSS2FontSize;
import fr.lip6.move.pnml.ptnet.CSS2FontStyle;
import fr.lip6.move.pnml.ptnet.CSS2FontWeight;
import fr.lip6.move.pnml.ptnet.Coordinate;
import fr.lip6.move.pnml.ptnet.Dimension;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.FontAlign;
import fr.lip6.move.pnml.ptnet.FontDecoration;
import fr.lip6.move.pnml.ptnet.Gradient;
import fr.lip6.move.pnml.ptnet.Graphics;
import fr.lip6.move.pnml.ptnet.Label;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.LineShape;
import fr.lip6.move.pnml.ptnet.LineStyle;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.Node;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PlaceNode;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.RefPlace;
import fr.lip6.move.pnml.ptnet.RefTransition;
import fr.lip6.move.pnml.ptnet.ToolInfo;
import fr.lip6.move.pnml.ptnet.Transition;
import fr.lip6.move.pnml.ptnet.TransitionNode;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetPackageImpl extends EPackageImpl implements PtnetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptArcAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetDocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pnObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeGraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationGraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcGraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refPlaceEClass = null;

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
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum css2ColorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradientEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineShapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontDecorationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum css2FontFamilyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum css2FontSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum css2FontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum css2FontWeightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType naturalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longStringEDataType = null;

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
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetPackageImpl() {
		super(eNS_URI, PtnetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PtnetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetPackage init() {
		if (isInited)
			return (PtnetPackage) EPackage.Registry.INSTANCE.getEPackage(PtnetPackage.eNS_URI);

		// Obtain or create and register package
		PtnetPackageImpl thePtnetPackage = (PtnetPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PtnetPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new PtnetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePtnetPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(thePtnetPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return PtnetValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		thePtnetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetPackage.eNS_URI, thePtnetPackage);
		return thePtnetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTMarking() {
		return ptMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTMarking_Text() {
		return (EAttribute) ptMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTMarking_ContainerPlace() {
		return (EReference) ptMarkingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTArcAnnotation() {
		return ptArcAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTArcAnnotation_Text() {
		return (EAttribute) ptArcAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTArcAnnotation_ContainerArc() {
		return (EReference) ptArcAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNetDoc() {
		return petriNetDocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNetDoc_Nets() {
		return (EReference) petriNetDocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriNetDoc_Xmlns() {
		return (EAttribute) petriNetDocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriNet_Id() {
		return (EAttribute) petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriNet_Type() {
		return (EAttribute) petriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Pages() {
		return (EReference) petriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Name() {
		return (EReference) petriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Toolspecifics() {
		return (EReference) petriNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_ContainerPetriNetDoc() {
		return (EReference) petriNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Objects() {
		return (EReference) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ContainerPetriNet() {
		return (EReference) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Nodegraphics() {
		return (EReference) pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPnObject() {
		return pnObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPnObject_Id() {
		return (EAttribute) pnObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPnObject_Name() {
		return (EReference) pnObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPnObject_Toolspecifics() {
		return (EReference) pnObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPnObject_ContainerPage() {
		return (EReference) pnObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Text() {
		return (EAttribute) nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getName_ContainerNamePetriNet() {
		return (EReference) nameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getName_ContainerNamePnObject() {
		return (EReference) nameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolInfo() {
		return toolInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfo_Tool() {
		return (EAttribute) toolInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfo_Version() {
		return (EAttribute) toolInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfo_FormattedXMLBuffer() {
		return (EAttribute) toolInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfo_ToolInfoGrammarURI() {
		return (EAttribute) toolInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolInfo_ContainerPetriNet() {
		return (EReference) toolInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolInfo_ContainerPnObject() {
		return (EReference) toolInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolInfo_ContainerLabel() {
		return (EReference) toolInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolInfo_ToolInfoModel() {
		return (EReference) toolInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Toolspecifics() {
		return (EReference) labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeGraphics() {
		return nodeGraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Position() {
		return (EReference) nodeGraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Dimension() {
		return (EReference) nodeGraphicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Fill() {
		return (EReference) nodeGraphicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Line() {
		return (EReference) nodeGraphicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_ContainerNode() {
		return (EReference) nodeGraphicsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_ContainerPage() {
		return (EReference) nodeGraphicsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphics() {
		return graphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinate() {
		return coordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_X() {
		return (EAttribute) coordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Y() {
		return (EAttribute) coordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_ContainerArcGraphics() {
		return (EReference) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_ContainerPNodeGraphics() {
		return (EReference) positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffset_ContainerAnnotationGraphics() {
		return (EReference) offsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_ContainerDNodeGraphics() {
		return (EReference) dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationGraphics() {
		return annotationGraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Offset() {
		return (EReference) annotationGraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Fill() {
		return (EReference) annotationGraphicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Line() {
		return (EReference) annotationGraphicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Font() {
		return (EReference) annotationGraphicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_ContainerAnnotation() {
		return (EReference) annotationGraphicsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFill() {
		return fillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Color() {
		return (EAttribute) fillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Gradientcolor() {
		return (EAttribute) fillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Gradientrotation() {
		return (EAttribute) fillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Image() {
		return (EAttribute) fillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFill_ContainerNodeGraphics() {
		return (EReference) fillEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFill_ContainerAnnotationGraphics() {
		return (EReference) fillEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Color() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Shape() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Width() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_ContainerNodeGraphics() {
		return (EReference) lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_ContainerArcGraphics() {
		return (EReference) lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_ContainerAnnotationGraphics() {
		return (EReference) lineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Style() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcGraphics() {
		return arcGraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcGraphics_Positions() {
		return (EReference) arcGraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcGraphics_Line() {
		return (EReference) arcGraphicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcGraphics_ContainerArc() {
		return (EReference) arcGraphicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Source() {
		return (EReference) arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Target() {
		return (EReference) arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Arcgraphics() {
		return (EReference) arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Inscription() {
		return (EReference) arcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_InArcs() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_OutArcs() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Nodegraphics() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Align() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Decoration() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Family() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Rotation() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Size() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Style() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Weight() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFont_ContainerAnnotationGraphics() {
		return (EReference) fontEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceNode() {
		return placeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceNode_ReferencingPlaces() {
		return (EReference) placeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionNode() {
		return transitionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionNode_ReferencingTransitions() {
		return (EReference) transitionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InitialMarking() {
		return (EReference) placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefTransition() {
		return refTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefTransition_Ref() {
		return (EReference) refTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefPlace() {
		return refPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefPlace_Ref() {
		return (EReference) refPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Annotationgraphics() {
		return (EReference) annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyObject() {
		return anyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyObject_ContainerToolInfo() {
		return (EReference) anyObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPNType() {
		return pnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSS2Color() {
		return css2ColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGradient() {
		return gradientEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineShape() {
		return lineShapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontAlign() {
		return fontAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontDecoration() {
		return fontDecorationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSS2FontFamily() {
		return css2FontFamilyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSS2FontSize() {
		return css2FontSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSS2FontStyle() {
		return css2FontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSS2FontWeight() {
		return css2FontWeightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineStyle() {
		return lineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInteger() {
		return positiveIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNatural() {
		return naturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongString() {
		return longStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetFactory getPtnetFactory() {
		return (PtnetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ptMarkingEClass = createEClass(PT_MARKING);
		createEAttribute(ptMarkingEClass, PT_MARKING__TEXT);
		createEReference(ptMarkingEClass, PT_MARKING__CONTAINER_PLACE);

		ptArcAnnotationEClass = createEClass(PT_ARC_ANNOTATION);
		createEAttribute(ptArcAnnotationEClass, PT_ARC_ANNOTATION__TEXT);
		createEReference(ptArcAnnotationEClass, PT_ARC_ANNOTATION__CONTAINER_ARC);

		petriNetDocEClass = createEClass(PETRI_NET_DOC);
		createEReference(petriNetDocEClass, PETRI_NET_DOC__NETS);
		createEAttribute(petriNetDocEClass, PETRI_NET_DOC__XMLNS);

		petriNetEClass = createEClass(PETRI_NET);
		createEAttribute(petriNetEClass, PETRI_NET__ID);
		createEAttribute(petriNetEClass, PETRI_NET__TYPE);
		createEReference(petriNetEClass, PETRI_NET__PAGES);
		createEReference(petriNetEClass, PETRI_NET__NAME);
		createEReference(petriNetEClass, PETRI_NET__TOOLSPECIFICS);
		createEReference(petriNetEClass, PETRI_NET__CONTAINER_PETRI_NET_DOC);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__OBJECTS);
		createEReference(pageEClass, PAGE__CONTAINER_PETRI_NET);
		createEReference(pageEClass, PAGE__NODEGRAPHICS);

		pnObjectEClass = createEClass(PN_OBJECT);
		createEAttribute(pnObjectEClass, PN_OBJECT__ID);
		createEReference(pnObjectEClass, PN_OBJECT__NAME);
		createEReference(pnObjectEClass, PN_OBJECT__TOOLSPECIFICS);
		createEReference(pnObjectEClass, PN_OBJECT__CONTAINER_PAGE);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__TEXT);
		createEReference(nameEClass, NAME__CONTAINER_NAME_PETRI_NET);
		createEReference(nameEClass, NAME__CONTAINER_NAME_PN_OBJECT);

		toolInfoEClass = createEClass(TOOL_INFO);
		createEAttribute(toolInfoEClass, TOOL_INFO__TOOL);
		createEAttribute(toolInfoEClass, TOOL_INFO__VERSION);
		createEAttribute(toolInfoEClass, TOOL_INFO__FORMATTED_XML_BUFFER);
		createEAttribute(toolInfoEClass, TOOL_INFO__TOOL_INFO_GRAMMAR_URI);
		createEReference(toolInfoEClass, TOOL_INFO__CONTAINER_PETRI_NET);
		createEReference(toolInfoEClass, TOOL_INFO__CONTAINER_PN_OBJECT);
		createEReference(toolInfoEClass, TOOL_INFO__CONTAINER_LABEL);
		createEReference(toolInfoEClass, TOOL_INFO__TOOL_INFO_MODEL);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__TOOLSPECIFICS);

		nodeGraphicsEClass = createEClass(NODE_GRAPHICS);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__POSITION);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__DIMENSION);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__FILL);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__LINE);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__CONTAINER_NODE);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__CONTAINER_PAGE);

		graphicsEClass = createEClass(GRAPHICS);

		coordinateEClass = createEClass(COORDINATE);
		createEAttribute(coordinateEClass, COORDINATE__X);
		createEAttribute(coordinateEClass, COORDINATE__Y);

		positionEClass = createEClass(POSITION);
		createEReference(positionEClass, POSITION__CONTAINER_ARC_GRAPHICS);
		createEReference(positionEClass, POSITION__CONTAINER_PNODE_GRAPHICS);

		offsetEClass = createEClass(OFFSET);
		createEReference(offsetEClass, OFFSET__CONTAINER_ANNOTATION_GRAPHICS);

		dimensionEClass = createEClass(DIMENSION);
		createEReference(dimensionEClass, DIMENSION__CONTAINER_DNODE_GRAPHICS);

		annotationGraphicsEClass = createEClass(ANNOTATION_GRAPHICS);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__OFFSET);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__FILL);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__LINE);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__FONT);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION);

		fillEClass = createEClass(FILL);
		createEAttribute(fillEClass, FILL__COLOR);
		createEAttribute(fillEClass, FILL__GRADIENTCOLOR);
		createEAttribute(fillEClass, FILL__GRADIENTROTATION);
		createEAttribute(fillEClass, FILL__IMAGE);
		createEReference(fillEClass, FILL__CONTAINER_NODE_GRAPHICS);
		createEReference(fillEClass, FILL__CONTAINER_ANNOTATION_GRAPHICS);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__COLOR);
		createEAttribute(lineEClass, LINE__SHAPE);
		createEAttribute(lineEClass, LINE__WIDTH);
		createEReference(lineEClass, LINE__CONTAINER_NODE_GRAPHICS);
		createEReference(lineEClass, LINE__CONTAINER_ARC_GRAPHICS);
		createEReference(lineEClass, LINE__CONTAINER_ANNOTATION_GRAPHICS);
		createEAttribute(lineEClass, LINE__STYLE);

		arcGraphicsEClass = createEClass(ARC_GRAPHICS);
		createEReference(arcGraphicsEClass, ARC_GRAPHICS__POSITIONS);
		createEReference(arcGraphicsEClass, ARC_GRAPHICS__LINE);
		createEReference(arcGraphicsEClass, ARC_GRAPHICS__CONTAINER_ARC);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEReference(arcEClass, ARC__ARCGRAPHICS);
		createEReference(arcEClass, ARC__INSCRIPTION);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__IN_ARCS);
		createEReference(nodeEClass, NODE__OUT_ARCS);
		createEReference(nodeEClass, NODE__NODEGRAPHICS);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__ALIGN);
		createEAttribute(fontEClass, FONT__DECORATION);
		createEAttribute(fontEClass, FONT__FAMILY);
		createEAttribute(fontEClass, FONT__ROTATION);
		createEAttribute(fontEClass, FONT__SIZE);
		createEAttribute(fontEClass, FONT__STYLE);
		createEAttribute(fontEClass, FONT__WEIGHT);
		createEReference(fontEClass, FONT__CONTAINER_ANNOTATION_GRAPHICS);

		placeNodeEClass = createEClass(PLACE_NODE);
		createEReference(placeNodeEClass, PLACE_NODE__REFERENCING_PLACES);

		transitionNodeEClass = createEClass(TRANSITION_NODE);
		createEReference(transitionNodeEClass, TRANSITION_NODE__REFERENCING_TRANSITIONS);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__INITIAL_MARKING);

		refTransitionEClass = createEClass(REF_TRANSITION);
		createEReference(refTransitionEClass, REF_TRANSITION__REF);

		transitionEClass = createEClass(TRANSITION);

		refPlaceEClass = createEClass(REF_PLACE);
		createEReference(refPlaceEClass, REF_PLACE__REF);

		attributeEClass = createEClass(ATTRIBUTE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__ANNOTATIONGRAPHICS);

		anyObjectEClass = createEClass(ANY_OBJECT);
		createEReference(anyObjectEClass, ANY_OBJECT__CONTAINER_TOOL_INFO);

		// Create enums
		pnTypeEEnum = createEEnum(PN_TYPE);
		css2ColorEEnum = createEEnum(CSS2_COLOR);
		gradientEEnum = createEEnum(GRADIENT);
		lineShapeEEnum = createEEnum(LINE_SHAPE);
		fontAlignEEnum = createEEnum(FONT_ALIGN);
		fontDecorationEEnum = createEEnum(FONT_DECORATION);
		css2FontFamilyEEnum = createEEnum(CSS2_FONT_FAMILY);
		css2FontSizeEEnum = createEEnum(CSS2_FONT_SIZE);
		css2FontStyleEEnum = createEEnum(CSS2_FONT_STYLE);
		css2FontWeightEEnum = createEEnum(CSS2_FONT_WEIGHT);
		lineStyleEEnum = createEEnum(LINE_STYLE);

		// Create data types
		positiveIntegerEDataType = createEDataType(POSITIVE_INTEGER);
		naturalEDataType = createEDataType(NATURAL);
		uriEDataType = createEDataType(URI);
		longStringEDataType = createEDataType(LONG_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ptMarkingEClass.getESuperTypes().add(this.getAnnotation());
		ptArcAnnotationEClass.getESuperTypes().add(this.getAnnotation());
		pageEClass.getESuperTypes().add(this.getPnObject());
		nameEClass.getESuperTypes().add(this.getAnnotation());
		nodeGraphicsEClass.getESuperTypes().add(this.getGraphics());
		positionEClass.getESuperTypes().add(this.getCoordinate());
		offsetEClass.getESuperTypes().add(this.getCoordinate());
		dimensionEClass.getESuperTypes().add(this.getCoordinate());
		annotationGraphicsEClass.getESuperTypes().add(this.getGraphics());
		arcGraphicsEClass.getESuperTypes().add(this.getGraphics());
		arcEClass.getESuperTypes().add(this.getPnObject());
		nodeEClass.getESuperTypes().add(this.getPnObject());
		placeNodeEClass.getESuperTypes().add(this.getNode());
		transitionNodeEClass.getESuperTypes().add(this.getNode());
		placeEClass.getESuperTypes().add(this.getPlaceNode());
		refTransitionEClass.getESuperTypes().add(this.getTransitionNode());
		transitionEClass.getESuperTypes().add(this.getTransitionNode());
		refPlaceEClass.getESuperTypes().add(this.getPlaceNode());
		attributeEClass.getESuperTypes().add(this.getLabel());
		annotationEClass.getESuperTypes().add(this.getLabel());

		// Initialize classes and features; add operations and parameters
		initEClass(ptMarkingEClass, PTMarking.class, "PTMarking", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPTMarking_Text(), this.getNatural(), "text", null, 1, 1, PTMarking.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTMarking_ContainerPlace(), this.getPlace(), this.getPlace_InitialMarking(),
				"containerPlace", null, 0, 1, PTMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptArcAnnotationEClass, PTArcAnnotation.class, "PTArcAnnotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPTArcAnnotation_Text(), this.getPositiveInteger(), "text", null, 1, 1, PTArcAnnotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTArcAnnotation_ContainerArc(), this.getArc(), this.getArc_Inscription(), "containerArc",
				null, 0, 1, PTArcAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetDocEClass, PetriNetDoc.class, "PetriNetDoc", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNetDoc_Nets(), this.getPetriNet(), this.getPetriNet_ContainerPetriNetDoc(), "nets",
				null, 1, -1, PetriNetDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPetriNetDoc_Xmlns(), ecorePackage.getEString(), "xmlns",
				"http://www.pnml.org/version-2009/grammar/pnml", 0, 1, PetriNetDoc.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPetriNet_Id(), ecorePackage.getEString(), "id", "", 1, 1, PetriNet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPetriNet_Type(), this.getPNType(), "type", "http://www.pnml.org/version-2009/grammar/ptnet",
				1, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getPetriNet_Pages(), this.getPage(), this.getPage_ContainerPetriNet(), "pages", null, 1, -1,
				PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPetriNet_Name(), this.getName_(), this.getName_ContainerNamePetriNet(), "name", null, 0, 1,
				PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPetriNet_Toolspecifics(), this.getToolInfo(), this.getToolInfo_ContainerPetriNet(),
				"toolspecifics", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPetriNet_ContainerPetriNetDoc(), this.getPetriNetDoc(), this.getPetriNetDoc_Nets(),
				"containerPetriNetDoc", null, 0, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Objects(), this.getPnObject(), this.getPnObject_ContainerPage(), "objects", null, 0, -1,
				Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_ContainerPetriNet(), this.getPetriNet(), this.getPetriNet_Pages(), "containerPetriNet",
				null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_Nodegraphics(), this.getNodeGraphics(), this.getNodeGraphics_ContainerPage(),
				"nodegraphics", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pnObjectEClass, PnObject.class, "PnObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPnObject_Id(), ecorePackage.getEString(), "id", null, 1, 1, PnObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPnObject_Name(), this.getName_(), this.getName_ContainerNamePnObject(), "name", null, 0, 1,
				PnObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPnObject_Toolspecifics(), this.getToolInfo(), this.getToolInfo_ContainerPnObject(),
				"toolspecifics", null, 0, -1, PnObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPnObject_ContainerPage(), this.getPage(), this.getPage_Objects(), "containerPage", null, 0,
				1, PnObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_Text(), ecorePackage.getEString(), "text", null, 1, 1, Name.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getName_ContainerNamePetriNet(), this.getPetriNet(), this.getPetriNet_Name(),
				"containerNamePetriNet", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getName_ContainerNamePnObject(), this.getPnObject(), this.getPnObject_Name(),
				"containerNamePnObject", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolInfoEClass, ToolInfo.class, "ToolInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolInfo_Tool(), ecorePackage.getEString(), "tool", null, 1, 1, ToolInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getToolInfo_Version(), ecorePackage.getEString(), "version", null, 1, 1, ToolInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getToolInfo_FormattedXMLBuffer(), this.getLongString(), "formattedXMLBuffer", null, 0, 1,
				ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getToolInfo_ToolInfoGrammarURI(), this.getURI(), "toolInfoGrammarURI", null, 0, 1,
				ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getToolInfo_ContainerPetriNet(), this.getPetriNet(), this.getPetriNet_Toolspecifics(),
				"containerPetriNet", null, 0, 1, ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToolInfo_ContainerPnObject(), this.getPnObject(), this.getPnObject_Toolspecifics(),
				"containerPnObject", null, 0, 1, ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToolInfo_ContainerLabel(), this.getLabel(), this.getLabel_Toolspecifics(), "containerLabel",
				null, 0, 1, ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToolInfo_ToolInfoModel(), this.getAnyObject(), this.getAnyObject_ContainerToolInfo(),
				"toolInfoModel", null, 0, 1, ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabel_Toolspecifics(), this.getToolInfo(), this.getToolInfo_ContainerLabel(),
				"toolspecifics", null, 0, -1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeGraphicsEClass, NodeGraphics.class, "NodeGraphics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeGraphics_Position(), this.getPosition(), this.getPosition_ContainerPNodeGraphics(),
				"position", null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNodeGraphics_Dimension(), this.getDimension(), this.getDimension_ContainerDNodeGraphics(),
				"dimension", null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNodeGraphics_Fill(), this.getFill(), this.getFill_ContainerNodeGraphics(), "fill", null, 0,
				1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNodeGraphics_Line(), this.getLine(), this.getLine_ContainerNodeGraphics(), "line", null, 0,
				1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNodeGraphics_ContainerNode(), this.getNode(), this.getNode_Nodegraphics(), "containerNode",
				null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeGraphics_ContainerPage(), this.getPage(), this.getPage_Nodegraphics(), "containerPage",
				null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicsEClass, Graphics.class, "Graphics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinateEClass, Coordinate.class, "Coordinate", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinate_X(), ecorePackage.getEIntegerObject(), "x", null, 1, 1, Coordinate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoordinate_Y(), ecorePackage.getEIntegerObject(), "y", null, 1, 1, Coordinate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_ContainerArcGraphics(), this.getArcGraphics(), this.getArcGraphics_Positions(),
				"containerArcGraphics", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPosition_ContainerPNodeGraphics(), this.getNodeGraphics(), this.getNodeGraphics_Position(),
				"containerPNodeGraphics", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffset_ContainerAnnotationGraphics(), this.getAnnotationGraphics(),
				this.getAnnotationGraphics_Offset(), "containerAnnotationGraphics", null, 0, 1, Offset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimension_ContainerDNodeGraphics(), this.getNodeGraphics(), this.getNodeGraphics_Dimension(),
				"containerDNodeGraphics", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotationGraphicsEClass, AnnotationGraphics.class, "AnnotationGraphics", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationGraphics_Offset(), this.getOffset(), this.getOffset_ContainerAnnotationGraphics(),
				"offset", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotationGraphics_Fill(), this.getFill(), this.getFill_ContainerAnnotationGraphics(),
				"fill", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotationGraphics_Line(), this.getLine(), this.getLine_ContainerAnnotationGraphics(),
				"line", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotationGraphics_Font(), this.getFont(), this.getFont_ContainerAnnotationGraphics(),
				"font", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotationGraphics_ContainerAnnotation(), this.getAnnotation(),
				this.getAnnotation_Annotationgraphics(), "containerAnnotation", null, 0, 1, AnnotationGraphics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillEClass, Fill.class, "Fill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFill_Color(), this.getCSS2Color(), "color", "black", 0, 1, Fill.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFill_Gradientcolor(), this.getCSS2Color(), "gradientcolor", "black", 0, 1, Fill.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFill_Gradientrotation(), this.getGradient(), "gradientrotation", null, 0, 1, Fill.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFill_Image(), this.getURI(), "image", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFill_ContainerNodeGraphics(), this.getNodeGraphics(), this.getNodeGraphics_Fill(),
				"containerNodeGraphics", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFill_ContainerAnnotationGraphics(), this.getAnnotationGraphics(),
				this.getAnnotationGraphics_Fill(), "containerAnnotationGraphics", null, 0, 1, Fill.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Color(), this.getCSS2Color(), "color", "black", 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLine_Shape(), this.getLineShape(), "shape", "line", 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLine_Width(), ecorePackage.getEIntegerObject(), "width", null, 0, 1, Line.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLine_ContainerNodeGraphics(), this.getNodeGraphics(), this.getNodeGraphics_Line(),
				"containerNodeGraphics", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLine_ContainerArcGraphics(), this.getArcGraphics(), this.getArcGraphics_Line(),
				"containerArcGraphics", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLine_ContainerAnnotationGraphics(), this.getAnnotationGraphics(),
				this.getAnnotationGraphics_Line(), "containerAnnotationGraphics", null, 0, 1, Line.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLine_Style(), this.getLineStyle(), "style", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcGraphicsEClass, ArcGraphics.class, "ArcGraphics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcGraphics_Positions(), this.getPosition(), this.getPosition_ContainerArcGraphics(),
				"positions", null, 0, -1, ArcGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcGraphics_Line(), this.getLine(), this.getLine_ContainerArcGraphics(), "line", null, 0, 1,
				ArcGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArcGraphics_ContainerArc(), this.getArc(), this.getArc_Arcgraphics(), "containerArc", null,
				0, 1, ArcGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_OutArcs(), "source", null, 1, 1, Arc.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_InArcs(), "target", null, 1, 1, Arc.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArc_Arcgraphics(), this.getArcGraphics(), this.getArcGraphics_ContainerArc(), "arcgraphics",
				null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArc_Inscription(), this.getPTArcAnnotation(), this.getPTArcAnnotation_ContainerArc(),
				"inscription", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_InArcs(), this.getArc(), this.getArc_Target(), "InArcs", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNode_OutArcs(), this.getArc(), this.getArc_Source(), "OutArcs", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNode_Nodegraphics(), this.getNodeGraphics(), this.getNodeGraphics_ContainerNode(),
				"nodegraphics", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Align(), this.getFontAlign(), "align", "left", 0, 1, Font.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFont_Decoration(), this.getFontDecoration(), "decoration", "underline", 0, 1, Font.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFont_Family(), this.getCSS2FontFamily(), "family", "verdana", 0, 1, Font.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFont_Rotation(), ecorePackage.getEBigDecimal(), "rotation", null, 0, 1, Font.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFont_Size(), this.getCSS2FontSize(), "size", "small", 0, 1, Font.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFont_Style(), this.getCSS2FontStyle(), "style", "normal", 0, 1, Font.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFont_Weight(), this.getCSS2FontWeight(), "weight", null, 0, 1, Font.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFont_ContainerAnnotationGraphics(), this.getAnnotationGraphics(),
				this.getAnnotationGraphics_Font(), "containerAnnotationGraphics", null, 0, 1, Font.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(placeNodeEClass, PlaceNode.class, "PlaceNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceNode_ReferencingPlaces(), this.getRefPlace(), this.getRefPlace_Ref(),
				"referencingPlaces", null, 0, -1, PlaceNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionNodeEClass, TransitionNode.class, "TransitionNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionNode_ReferencingTransitions(), this.getRefTransition(),
				this.getRefTransition_Ref(), "referencingTransitions", null, 0, -1, TransitionNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_InitialMarking(), this.getPTMarking(), this.getPTMarking_ContainerPlace(),
				"initialMarking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refTransitionEClass, RefTransition.class, "RefTransition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefTransition_Ref(), this.getTransitionNode(),
				this.getTransitionNode_ReferencingTransitions(), "ref", null, 1, 1, RefTransition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(refPlaceEClass, RefPlace.class, "RefPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefPlace_Ref(), this.getPlaceNode(), this.getPlaceNode_ReferencingPlaces(), "ref", null, 1,
				1, RefPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Annotationgraphics(), this.getAnnotationGraphics(),
				this.getAnnotationGraphics_ContainerAnnotation(), "annotationgraphics", null, 0, 1, Annotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(anyObjectEClass, AnyObject.class, "AnyObject", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnyObject_ContainerToolInfo(), this.getToolInfo(), this.getToolInfo_ToolInfoModel(),
				"containerToolInfo", null, 0, 1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pnTypeEEnum, PNType.class, "PNType");
		addEEnumLiteral(pnTypeEEnum, PNType.PTNET);
		addEEnumLiteral(pnTypeEEnum, PNType.COREMODEL);
		addEEnumLiteral(pnTypeEEnum, PNType.SYMNET);
		addEEnumLiteral(pnTypeEEnum, PNType.HLPN);

		initEEnum(css2ColorEEnum, CSS2Color.class, "CSS2Color");
		addEEnumLiteral(css2ColorEEnum, CSS2Color.AQUA);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.BLACK);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.BLUE);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.FUCHSIA);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.GRAY);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.GREEN);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.LIME);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.MAROON);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.NAVY);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.OLIVE);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.ORANGE);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.PURPLE);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.RED);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.SILVER);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.TEAL);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.WHITE);
		addEEnumLiteral(css2ColorEEnum, CSS2Color.YELLOW);

		initEEnum(gradientEEnum, Gradient.class, "Gradient");
		addEEnumLiteral(gradientEEnum, Gradient.HORIZONTAL);
		addEEnumLiteral(gradientEEnum, Gradient.VERTICAL);
		addEEnumLiteral(gradientEEnum, Gradient.DIAGONAL);

		initEEnum(lineShapeEEnum, LineShape.class, "LineShape");
		addEEnumLiteral(lineShapeEEnum, LineShape.LINE);
		addEEnumLiteral(lineShapeEEnum, LineShape.CURVE);

		initEEnum(fontAlignEEnum, FontAlign.class, "FontAlign");
		addEEnumLiteral(fontAlignEEnum, FontAlign.LEFT);
		addEEnumLiteral(fontAlignEEnum, FontAlign.CENTER);
		addEEnumLiteral(fontAlignEEnum, FontAlign.RIGHT);

		initEEnum(fontDecorationEEnum, FontDecoration.class, "FontDecoration");
		addEEnumLiteral(fontDecorationEEnum, FontDecoration.UNDERLINE);
		addEEnumLiteral(fontDecorationEEnum, FontDecoration.OVERLINE);
		addEEnumLiteral(fontDecorationEEnum, FontDecoration.LINETHROUGH);

		initEEnum(css2FontFamilyEEnum, CSS2FontFamily.class, "CSS2FontFamily");
		addEEnumLiteral(css2FontFamilyEEnum, CSS2FontFamily.VERDANA);
		addEEnumLiteral(css2FontFamilyEEnum, CSS2FontFamily.ARIAL);
		addEEnumLiteral(css2FontFamilyEEnum, CSS2FontFamily.TIMES);
		addEEnumLiteral(css2FontFamilyEEnum, CSS2FontFamily.GEORGIA);
		addEEnumLiteral(css2FontFamilyEEnum, CSS2FontFamily.TREBUCHET);

		initEEnum(css2FontSizeEEnum, CSS2FontSize.class, "CSS2FontSize");
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.XXSMALL);
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.XSMALL);
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.SMALL);
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.MEDIUM);
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.LARGE);
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.XLARGE);
		addEEnumLiteral(css2FontSizeEEnum, CSS2FontSize.XXLARGE);

		initEEnum(css2FontStyleEEnum, CSS2FontStyle.class, "CSS2FontStyle");
		addEEnumLiteral(css2FontStyleEEnum, CSS2FontStyle.NORMAL);
		addEEnumLiteral(css2FontStyleEEnum, CSS2FontStyle.ITALIC);
		addEEnumLiteral(css2FontStyleEEnum, CSS2FontStyle.OBLIQUE);

		initEEnum(css2FontWeightEEnum, CSS2FontWeight.class, "CSS2FontWeight");
		addEEnumLiteral(css2FontWeightEEnum, CSS2FontWeight.NORMAL);
		addEEnumLiteral(css2FontWeightEEnum, CSS2FontWeight.BOLD);
		addEEnumLiteral(css2FontWeightEEnum, CSS2FontWeight.BOLDER);
		addEEnumLiteral(css2FontWeightEEnum, CSS2FontWeight.LIGHTER);

		initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
		addEEnumLiteral(lineStyleEEnum, LineStyle.SOLID);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASH);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DOT);

		// Initialize data types
		initEDataType(positiveIntegerEDataType, Integer.class, "PositiveInteger", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(naturalEDataType, Integer.class, "Natural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longStringEDataType, StringBuffer.class, "LongString", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.pnml.org/models/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.pnml.org/models/ToPNML
		createToPNMLAnnotations();
		// http://www.pnml.org/models/HLAPI
		createHLAPIAnnotations();
		// redefines
		createRedefinesAnnotations();
		// http://www.pnml.org/models/HLAPI_id
		createHLAPI_idAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.pnml.org/models/OCL";
		addAnnotation(ptMarkingEClass, source, new String[] { "markingValueRange", "self.text >= 0" });
		addAnnotation(ptArcAnnotationEClass, source, new String[] { "inscriptionValueRange", "self.text > 0" });
		addAnnotation(
				arcEClass,
				source,
				new String[] {
						"samePageSourceTarget",
						"self.source.containerPage = self.target.containerPage",
						"differentSourceTarget",
						"(self.source.oclIsKindOf(PlaceNode) and self.target.oclIsKindOf(TransitionNode)) or (self.source.oclIsKindOf(TransitionNode) and self.target.oclIsKindOf(PlaceNode))" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(ptMarkingEClass, source, new String[] { "constraints", "markingValueRange" });
		addAnnotation(ptArcAnnotationEClass, source, new String[] { "constraints", "inscriptionValueRange" });
		addAnnotation(arcEClass, source, new String[] { "constraints", "samePageSourceTarget differentSourceTarget" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/ToPNML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToPNMLAnnotations() {
		String source = "http://www.pnml.org/models/ToPNML";
		addAnnotation(ptMarkingEClass, source, new String[] { "tag", "initialMarking", "kind", "son" });
		addAnnotation(getPTMarking_Text(), source, new String[] { "tag", "text", "kind", "son" });
		addAnnotation(ptArcAnnotationEClass, source, new String[] { "tag", "inscription", "kind", "son" });
		addAnnotation(getPTArcAnnotation_Text(), source, new String[] { "tag", "text", "kind", "son" });
		addAnnotation(petriNetDocEClass, source, new String[] { "tag", "pnml", "kind", "son" });
		addAnnotation(getPetriNetDoc_Nets(), source, new String[] { "kind", "follow" });
		addAnnotation(getPetriNetDoc_Xmlns(), source, new String[] { "tag", "xmlns", "kind", "attribute" });
		addAnnotation(petriNetEClass, source, new String[] { "kind", "son", "tag", "net" });
		addAnnotation(getPetriNet_Id(), source, new String[] { "tag", "id", "kind", "id" });
		addAnnotation(getPetriNet_Type(), source, new String[] { "tag", "type", "kind", "attribute" });
		addAnnotation(getPetriNet_Pages(), source, new String[] { "kind", "follow" });
		addAnnotation(getPetriNet_Name(), source, new String[] { "kind", "follow" });
		addAnnotation(getPetriNet_Toolspecifics(), source, new String[] { "kind", "follow" });
		addAnnotation(pageEClass, source, new String[] { "kind", "son", "tag", "page" });
		addAnnotation(getPage_Objects(), source, new String[] { "kind", "follow" });
		addAnnotation(getPage_Nodegraphics(), source, new String[] { "kind", "follow" });
		addAnnotation(getPnObject_Id(), source, new String[] { "tag", "id", "kind", "id" });
		addAnnotation(getPnObject_Name(), source, new String[] { "kind", "follow" });
		addAnnotation(getPnObject_Toolspecifics(), source, new String[] { "kind", "follow" });
		addAnnotation(nameEClass, source, new String[] { "tag", "name", "kind", "son" });
		addAnnotation(getName_Text(), source, new String[] { "tag", "text", "kind", "son" });
		addAnnotation(toolInfoEClass, source, new String[] { "tag", "toolspecific", "kind", "son" });
		addAnnotation(getToolInfo_Tool(), source, new String[] { "tag", "tool", "kind", "attribute" });
		addAnnotation(getToolInfo_Version(), source, new String[] { "tag", "version", "kind", "attribute" });
		addAnnotation(getToolInfo_FormattedXMLBuffer(), source, new String[] { "tag", "", "kind", "son" });
		addAnnotation(getLabel_Toolspecifics(), source, new String[] { "kind", "follow" });
		addAnnotation(nodeGraphicsEClass, source, new String[] { "tag", "graphics", "kind", "son" });
		addAnnotation(getNodeGraphics_Position(), source, new String[] { "kind", "follow" });
		addAnnotation(getNodeGraphics_Dimension(), source, new String[] { "kind", "follow" });
		addAnnotation(getNodeGraphics_Fill(), source, new String[] { "kind", "follow" });
		addAnnotation(getNodeGraphics_Line(), source, new String[] { "kind", "follow" });
		addAnnotation(getCoordinate_X(), source, new String[] { "tag", "x", "kind", "attribute" });
		addAnnotation(getCoordinate_Y(), source, new String[] { "tag", "y", "kind", "attribute" });
		addAnnotation(positionEClass, source, new String[] { "tag", "position", "kind", "son" });
		addAnnotation(offsetEClass, source, new String[] { "tag", "offset", "kind", "son" });
		addAnnotation(dimensionEClass, source, new String[] { "tag", "dimension", "kind", "son" });
		addAnnotation(annotationGraphicsEClass, source, new String[] { "tag", "graphics", "kind", "son" });
		addAnnotation(getAnnotationGraphics_Offset(), source, new String[] { "kind", "follow" });
		addAnnotation(getAnnotationGraphics_Fill(), source, new String[] { "kind", "follow" });
		addAnnotation(getAnnotationGraphics_Line(), source, new String[] { "kind", "follow" });
		addAnnotation(getAnnotationGraphics_Font(), source, new String[] { "kind", "follow" });
		addAnnotation(fillEClass, source, new String[] { "tag", "fill", "kind", "son" });
		addAnnotation(getFill_Color(), source, new String[] { "tag", "color", "kind", "attribute" });
		addAnnotation(getFill_Gradientcolor(), source, new String[] { "tag", "gradient-color", "kind", "attribute" });
		addAnnotation(getFill_Gradientrotation(), source, new String[] { "tag", "gradient-rotation", "kind",
				"attribute" });
		addAnnotation(getFill_Image(), source, new String[] { "tag", "image", "kind", "attribute" });
		addAnnotation(lineEClass, source, new String[] { "tag", "line", "kind", "son" });
		addAnnotation(getLine_Color(), source, new String[] { "tag", "color", "kind", "attribute" });
		addAnnotation(getLine_Shape(), source, new String[] { "tag", "shape", "kind", "attribute" });
		addAnnotation(getLine_Width(), source, new String[] { "tag", "width", "kind", "attribute" });
		addAnnotation(getLine_Style(), source, new String[] { "tag", "style", "kind", "attribute" });
		addAnnotation(arcGraphicsEClass, source, new String[] { "tag", "graphics", "kind", "son" });
		addAnnotation(getArcGraphics_Positions(), source, new String[] { "kind", "follow" });
		addAnnotation(getArcGraphics_Line(), source, new String[] { "kind", "follow" });
		addAnnotation(arcEClass, source, new String[] { "tag", "arc", "kind", "son" });
		addAnnotation(getArc_Source(), source, new String[] { "kind", "idref", "tag", "source" });
		addAnnotation(getArc_Target(), source, new String[] { "kind", "idref", "tag", "target" });
		addAnnotation(getArc_Arcgraphics(), source, new String[] { "kind", "follow" });
		addAnnotation(getArc_Inscription(), source, new String[] { "kind", "follow" });
		addAnnotation(getNode_Nodegraphics(), source, new String[] { "kind", "follow" });
		addAnnotation(fontEClass, source, new String[] { "tag", "font", "kind", "son" });
		addAnnotation(getFont_Align(), source, new String[] { "tag", "align", "kind", "attribute" });
		addAnnotation(getFont_Decoration(), source, new String[] { "tag", "decoration", "kind", "attribute" });
		addAnnotation(getFont_Family(), source, new String[] { "tag", "family", "kind", "attribute" });
		addAnnotation(getFont_Rotation(), source, new String[] { "tag", "rotation", "kind", "attribute" });
		addAnnotation(getFont_Size(), source, new String[] { "tag", "size", "kind", "attribute" });
		addAnnotation(getFont_Style(), source, new String[] { "tag", "style", "kind", "attribute" });
		addAnnotation(getFont_Weight(), source, new String[] { "tag", "weight", "kind", "attribute" });
		addAnnotation(placeEClass, source, new String[] { "tag", "place", "kind", "son" });
		addAnnotation(getPlace_InitialMarking(), source, new String[] { "kind", "follow" });
		addAnnotation(refTransitionEClass, source, new String[] { "tag", "referenceTransition", "kind", "son" });
		addAnnotation(getRefTransition_Ref(), source, new String[] { "kind", "idref", "tag", "ref" });
		addAnnotation(transitionEClass, source, new String[] { "tag", "transition", "kind", "son" });
		addAnnotation(refPlaceEClass, source, new String[] { "tag", "referencePlace", "kind", "son" });
		addAnnotation(getRefPlace_Ref(), source, new String[] { "kind", "idref", "tag", "ref" });
		addAnnotation(getAnnotation_Annotationgraphics(), source, new String[] { "kind", "follow" });
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPIAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI";
		addAnnotation(ptMarkingEClass, source, new String[] {});
		addAnnotation(ptArcAnnotationEClass, source, new String[] {});
		addAnnotation(petriNetDocEClass, source, new String[] {});
		addAnnotation(petriNetEClass, source, new String[] {});
		addAnnotation(pnTypeEEnum, source, new String[] {});
		addAnnotation(pageEClass, source, new String[] {});
		addAnnotation(pnObjectEClass, source, new String[] {});
		addAnnotation(nameEClass, source, new String[] {});
		addAnnotation(toolInfoEClass, source, new String[] {});
		addAnnotation(labelEClass, source, new String[] {});
		addAnnotation(nodeGraphicsEClass, source, new String[] {});
		addAnnotation(graphicsEClass, source, new String[] {});
		addAnnotation(coordinateEClass, source, new String[] {});
		addAnnotation(positionEClass, source, new String[] {});
		addAnnotation(offsetEClass, source, new String[] {});
		addAnnotation(dimensionEClass, source, new String[] {});
		addAnnotation(annotationGraphicsEClass, source, new String[] {});
		addAnnotation(fillEClass, source, new String[] {});
		addAnnotation(css2ColorEEnum, source, new String[] {});
		addAnnotation(gradientEEnum, source, new String[] {});
		addAnnotation(lineEClass, source, new String[] {});
		addAnnotation(lineShapeEEnum, source, new String[] {});
		addAnnotation(arcGraphicsEClass, source, new String[] {});
		addAnnotation(arcEClass, source, new String[] {});
		addAnnotation(nodeEClass, source, new String[] {});
		addAnnotation(fontEClass, source, new String[] {});
		addAnnotation(fontAlignEEnum, source, new String[] {});
		addAnnotation(fontDecorationEEnum, source, new String[] {});
		addAnnotation(css2FontFamilyEEnum, source, new String[] {});
		addAnnotation(css2FontSizeEEnum, source, new String[] {});
		addAnnotation(css2FontStyleEEnum, source, new String[] {});
		addAnnotation(css2FontWeightEEnum, source, new String[] {});
		addAnnotation(placeNodeEClass, source, new String[] {});
		addAnnotation(transitionNodeEClass, source, new String[] {});
		addAnnotation(placeEClass, source, new String[] {});
		addAnnotation(refTransitionEClass, source, new String[] {});
		addAnnotation(transitionEClass, source, new String[] {});
		addAnnotation(refPlaceEClass, source, new String[] {});
		addAnnotation(lineStyleEEnum, source, new String[] {});
		addAnnotation(annotationEClass, source, new String[] {});
		addAnnotation(anyObjectEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		addAnnotation(getPetriNet_Name(), source, new String[] {});
		addAnnotation(getPnObject_Name(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.pnml.org/models/HLAPI_id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHLAPI_idAnnotations() {
		String source = "http://www.pnml.org/models/HLAPI_id";
		addAnnotation(getPnObject_Id(), source, new String[] {});
	}

} //PtnetPackageImpl
