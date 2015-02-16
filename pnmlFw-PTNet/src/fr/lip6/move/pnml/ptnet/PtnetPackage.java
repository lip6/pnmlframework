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
package fr.lip6.move.pnml.ptnet;

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
 * @see fr.lip6.move.pnml.ptnet.PtnetFactory
 * @model kind="package"
 * @generated
 */
public interface PtnetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ptnet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ptnet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ptnet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PtnetPackage eINSTANCE = fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.LabelImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOLSPECIFICS = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.AnnotationImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 29;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TOOLSPECIFICS = LABEL__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATIONGRAPHICS = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PTMarkingImpl <em>PT Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PTMarkingImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPTMarking()
	 * @generated
	 */
	int PT_MARKING = 0;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__TOOLSPECIFICS = ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__ANNOTATIONGRAPHICS = ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__TEXT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Place</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__CONTAINER_PLACE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PT Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PTArcAnnotationImpl <em>PT Arc Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PTArcAnnotationImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPTArcAnnotation()
	 * @generated
	 */
	int PT_ARC_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__TOOLSPECIFICS = ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__ANNOTATIONGRAPHICS = ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__TEXT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Arc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__CONTAINER_ARC = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PT Arc Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PetriNetDocImpl <em>Petri Net Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PetriNetDocImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPetriNetDoc()
	 * @generated
	 */
	int PETRI_NET_DOC = 2;

	/**
	 * The feature id for the '<em><b>Nets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_DOC__NETS = 0;

	/**
	 * The feature id for the '<em><b>Xmlns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_DOC__XMLNS = 1;

	/**
	 * The number of structural features of the '<em>Petri Net Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_DOC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PetriNetImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PAGES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = 3;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TOOLSPECIFICS = 4;

	/**
	 * The feature id for the '<em><b>Container Petri Net Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__CONTAINER_PETRI_NET_DOC = 5;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PnObjectImpl <em>Pn Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PnObjectImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPnObject()
	 * @generated
	 */
	int PN_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN_OBJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN_OBJECT__TOOLSPECIFICS = 2;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN_OBJECT__CONTAINER_PAGE = 3;

	/**
	 * The number of structural features of the '<em>Pn Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PageImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLSPECIFICS = PN_OBJECT__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTAINER_PAGE = PN_OBJECT__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OBJECTS = PN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTAINER_PETRI_NET = PN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NODEGRAPHICS = PN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.NameImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 6;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__TOOLSPECIFICS = ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__ANNOTATIONGRAPHICS = ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__TEXT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Name Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__CONTAINER_NAME_PETRI_NET = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Name Pn Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__CONTAINER_NAME_PN_OBJECT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl <em>Tool Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getToolInfo()
	 * @generated
	 */
	int TOOL_INFO = 7;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Formatted XML Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__FORMATTED_XML_BUFFER = 2;

	/**
	 * The feature id for the '<em><b>Tool Info Grammar URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__TOOL_INFO_GRAMMAR_URI = 3;

	/**
	 * The feature id for the '<em><b>Container Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__CONTAINER_PETRI_NET = 4;

	/**
	 * The feature id for the '<em><b>Container Pn Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__CONTAINER_PN_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Container Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__CONTAINER_LABEL = 6;

	/**
	 * The feature id for the '<em><b>Tool Info Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__TOOL_INFO_MODEL = 7;

	/**
	 * The number of structural features of the '<em>Tool Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.GraphicsImpl <em>Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.GraphicsImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getGraphics()
	 * @generated
	 */
	int GRAPHICS = 10;

	/**
	 * The number of structural features of the '<em>Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.NodeGraphicsImpl <em>Node Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.NodeGraphicsImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getNodeGraphics()
	 * @generated
	 */
	int NODE_GRAPHICS = 9;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__POSITION = GRAPHICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__DIMENSION = GRAPHICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__FILL = GRAPHICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__LINE = GRAPHICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__CONTAINER_NODE = GRAPHICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__CONTAINER_PAGE = GRAPHICS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS_FEATURE_COUNT = GRAPHICS_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.CoordinateImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__Y = 1;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PositionImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = COORDINATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = COORDINATE__Y;

	/**
	 * The feature id for the '<em><b>Container Arc Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONTAINER_ARC_GRAPHICS = COORDINATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container PNode Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONTAINER_PNODE_GRAPHICS = COORDINATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.OffsetImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__X = COORDINATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__Y = COORDINATE__Y;

	/**
	 * The feature id for the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__CONTAINER_ANNOTATION_GRAPHICS = COORDINATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.DimensionImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 14;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__X = COORDINATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__Y = COORDINATE__Y;

	/**
	 * The feature id for the '<em><b>Container DNode Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CONTAINER_DNODE_GRAPHICS = COORDINATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl <em>Annotation Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAnnotationGraphics()
	 * @generated
	 */
	int ANNOTATION_GRAPHICS = 15;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__OFFSET = GRAPHICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__FILL = GRAPHICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__LINE = GRAPHICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__FONT = GRAPHICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION = GRAPHICS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Annotation Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS_FEATURE_COUNT = GRAPHICS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.FillImpl <em>Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.FillImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFill()
	 * @generated
	 */
	int FILL = 16;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Gradientcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__GRADIENTCOLOR = 1;

	/**
	 * The feature id for the '<em><b>Gradientrotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__GRADIENTROTATION = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Container Node Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__CONTAINER_NODE_GRAPHICS = 4;

	/**
	 * The feature id for the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__CONTAINER_ANNOTATION_GRAPHICS = 5;

	/**
	 * The number of structural features of the '<em>Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.LineImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 17;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Container Node Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINER_NODE_GRAPHICS = 3;

	/**
	 * The feature id for the '<em><b>Container Arc Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINER_ARC_GRAPHICS = 4;

	/**
	 * The feature id for the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINER_ANNOTATION_GRAPHICS = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE = 6;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.ArcGraphicsImpl <em>Arc Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.ArcGraphicsImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getArcGraphics()
	 * @generated
	 */
	int ARC_GRAPHICS = 18;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS__POSITIONS = GRAPHICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS__LINE = GRAPHICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Arc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS__CONTAINER_ARC = GRAPHICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arc Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS_FEATURE_COUNT = GRAPHICS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.ArcImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFICS = PN_OBJECT__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__CONTAINER_PAGE = PN_OBJECT__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ARCGRAPHICS = PN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__INSCRIPTION = PN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.NodeImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = PN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = PN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TOOLSPECIFICS = PN_OBJECT__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINER_PAGE = PN_OBJECT__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IN_ARCS = PN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUT_ARCS = PN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODEGRAPHICS = PN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = PN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.FontImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 21;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__DECORATION = 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FAMILY = 2;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ROTATION = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__STYLE = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__WEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Container Annotation Graphics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__CONTAINER_ANNOTATION_GRAPHICS = 7;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PlaceNodeImpl <em>Place Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PlaceNodeImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPlaceNode()
	 * @generated
	 */
	int PLACE_NODE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__TOOLSPECIFICS = NODE__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__CONTAINER_PAGE = NODE__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__IN_ARCS = NODE__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__OUT_ARCS = NODE__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__NODEGRAPHICS = NODE__NODEGRAPHICS;

	/**
	 * The feature id for the '<em><b>Referencing Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__REFERENCING_PLACES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.TransitionNodeImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getTransitionNode()
	 * @generated
	 */
	int TRANSITION_NODE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__TOOLSPECIFICS = NODE__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__CONTAINER_PAGE = NODE__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__IN_ARCS = NODE__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__OUT_ARCS = NODE__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__NODEGRAPHICS = NODE__NODEGRAPHICS;

	/**
	 * The feature id for the '<em><b>Referencing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__REFERENCING_TRANSITIONS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.PlaceImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PLACE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PLACE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFICS = PLACE_NODE__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CONTAINER_PAGE = PLACE_NODE__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN_ARCS = PLACE_NODE__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT_ARCS = PLACE_NODE__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NODEGRAPHICS = PLACE_NODE__NODEGRAPHICS;

	/**
	 * The feature id for the '<em><b>Referencing Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__REFERENCING_PLACES = PLACE_NODE__REFERENCING_PLACES;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_MARKING = PLACE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PLACE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getRefTransition()
	 * @generated
	 */
	int REF_TRANSITION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__ID = TRANSITION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__NAME = TRANSITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__TOOLSPECIFICS = TRANSITION_NODE__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__CONTAINER_PAGE = TRANSITION_NODE__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__IN_ARCS = TRANSITION_NODE__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__OUT_ARCS = TRANSITION_NODE__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__NODEGRAPHICS = TRANSITION_NODE__NODEGRAPHICS;

	/**
	 * The feature id for the '<em><b>Referencing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__REFERENCING_TRANSITIONS = TRANSITION_NODE__REFERENCING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__REF = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.TransitionImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = TRANSITION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = TRANSITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFICS = TRANSITION_NODE__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONTAINER_PAGE = TRANSITION_NODE__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN_ARCS = TRANSITION_NODE__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT_ARCS = TRANSITION_NODE__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NODEGRAPHICS = TRANSITION_NODE__NODEGRAPHICS;

	/**
	 * The feature id for the '<em><b>Referencing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REFERENCING_TRANSITIONS = TRANSITION_NODE__REFERENCING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl <em>Ref Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getRefPlace()
	 * @generated
	 */
	int REF_PLACE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__ID = PLACE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__NAME = PLACE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__TOOLSPECIFICS = PLACE_NODE__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Container Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__CONTAINER_PAGE = PLACE_NODE__CONTAINER_PAGE;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__IN_ARCS = PLACE_NODE__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__OUT_ARCS = PLACE_NODE__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Nodegraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__NODEGRAPHICS = PLACE_NODE__NODEGRAPHICS;

	/**
	 * The feature id for the '<em><b>Referencing Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__REFERENCING_PLACES = PLACE_NODE__REFERENCING_PLACES;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__REF = PLACE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE_FEATURE_COUNT = PLACE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.AttributeImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 28;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TOOLSPECIFICS = LABEL__TOOLSPECIFICS;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.impl.AnyObjectImpl <em>Any Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.impl.AnyObjectImpl
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAnyObject()
	 * @generated
	 */
	int ANY_OBJECT = 30;

	/**
	 * The feature id for the '<em><b>Container Tool Info</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT__CONTAINER_TOOL_INFO = 0;

	/**
	 * The number of structural features of the '<em>Any Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.PNType <em>PN Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.PNType
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPNType()
	 * @generated
	 */
	int PN_TYPE = 31;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.CSS2Color <em>CSS2 Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2Color()
	 * @generated
	 */
	int CSS2_COLOR = 32;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.Gradient <em>Gradient</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.Gradient
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getGradient()
	 * @generated
	 */
	int GRADIENT = 33;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.LineShape <em>Line Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.LineShape
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLineShape()
	 * @generated
	 */
	int LINE_SHAPE = 34;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.FontAlign <em>Font Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.FontAlign
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFontAlign()
	 * @generated
	 */
	int FONT_ALIGN = 35;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.FontDecoration <em>Font Decoration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.FontDecoration
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFontDecoration()
	 * @generated
	 */
	int FONT_DECORATION = 36;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontFamily <em>CSS2 Font Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontFamily
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontFamily()
	 * @generated
	 */
	int CSS2_FONT_FAMILY = 37;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontSize <em>CSS2 Font Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontSize
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontSize()
	 * @generated
	 */
	int CSS2_FONT_SIZE = 38;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontStyle <em>CSS2 Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontStyle
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontStyle()
	 * @generated
	 */
	int CSS2_FONT_STYLE = 39;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontWeight <em>CSS2 Font Weight</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontWeight
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontWeight()
	 * @generated
	 */
	int CSS2_FONT_WEIGHT = 40;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.ptnet.LineStyle <em>Line Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.ptnet.LineStyle
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 41;

	/**
	 * The meta object id for the '<em>Positive Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 42;

	/**
	 * The meta object id for the '<em>Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getNatural()
	 * @generated
	 */
	int NATURAL = 43;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getURI()
	 * @generated
	 */
	int URI = 44;

	/**
	 * The meta object id for the '<em>Long String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.StringBuffer
	 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLongString()
	 * @generated
	 */
	int LONG_STRING = 45;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.PTMarking <em>PT Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Marking</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PTMarking
	 * @generated
	 */
	EClass getPTMarking();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.PTMarking#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PTMarking#getText()
	 * @see #getPTMarking()
	 * @generated
	 */
	EAttribute getPTMarking_Text();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.PTMarking#getContainerPlace <em>Container Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Place</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PTMarking#getContainerPlace()
	 * @see #getPTMarking()
	 * @generated
	 */
	EReference getPTMarking_ContainerPlace();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.PTArcAnnotation <em>PT Arc Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Arc Annotation</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PTArcAnnotation
	 * @generated
	 */
	EClass getPTArcAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.PTArcAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PTArcAnnotation#getText()
	 * @see #getPTArcAnnotation()
	 * @generated
	 */
	EAttribute getPTArcAnnotation_Text();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.PTArcAnnotation#getContainerArc <em>Container Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PTArcAnnotation#getContainerArc()
	 * @see #getPTArcAnnotation()
	 * @generated
	 */
	EReference getPTArcAnnotation_ContainerArc();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.PetriNetDoc <em>Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Doc</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNetDoc
	 * @generated
	 */
	EClass getPetriNetDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.PetriNetDoc#getNets <em>Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nets</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNetDoc#getNets()
	 * @see #getPetriNetDoc()
	 * @generated
	 */
	EReference getPetriNetDoc_Nets();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.PetriNetDoc#getXmlns <em>Xmlns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmlns</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNetDoc#getXmlns()
	 * @see #getPetriNetDoc()
	 * @generated
	 */
	EAttribute getPetriNetDoc_Xmlns();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.PetriNet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getId()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.PetriNet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getType()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.PetriNet#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getPages()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.PetriNet#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecifics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getToolspecifics()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Toolspecifics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.PetriNet#getContainerPetriNetDoc <em>Container Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Petri Net Doc</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getContainerPetriNetDoc()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainerPetriNetDoc();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.Page#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Page#getObjects()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Objects();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Page#getContainerPetriNet <em>Container Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Petri Net</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Page#getContainerPetriNet()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ContainerPetriNet();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.Page#getNodegraphics <em>Nodegraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodegraphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Page#getNodegraphics()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Nodegraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.PnObject <em>Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pn Object</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PnObject
	 * @generated
	 */
	EClass getPnObject();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.PnObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getId()
	 * @see #getPnObject()
	 * @generated
	 */
	EAttribute getPnObject_Id();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.PnObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getName()
	 * @see #getPnObject()
	 * @generated
	 */
	EReference getPnObject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.PnObject#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecifics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getToolspecifics()
	 * @see #getPnObject()
	 * @generated
	 */
	EReference getPnObject_Toolspecifics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.PnObject#getContainerPage <em>Container Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Page</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getContainerPage()
	 * @see #getPnObject()
	 * @generated
	 */
	EReference getPnObject_ContainerPage();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Name#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Name#getText()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Text();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePetriNet <em>Container Name Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Name Petri Net</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Name#getContainerNamePetriNet()
	 * @see #getName_()
	 * @generated
	 */
	EReference getName_ContainerNamePetriNet();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePnObject <em>Container Name Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Name Pn Object</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Name#getContainerNamePnObject()
	 * @see #getName_()
	 * @generated
	 */
	EReference getName_ContainerNamePnObject();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Info</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo
	 * @generated
	 */
	EClass getToolInfo();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getTool()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_Tool();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getVersion()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getFormattedXMLBuffer <em>Formatted XML Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formatted XML Buffer</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getFormattedXMLBuffer()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_FormattedXMLBuffer();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoGrammarURI <em>Tool Info Grammar URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Info Grammar URI</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoGrammarURI()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_ToolInfoGrammarURI();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPetriNet <em>Container Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Petri Net</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPetriNet()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ContainerPetriNet();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPnObject <em>Container Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Pn Object</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPnObject()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ContainerPnObject();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerLabel <em>Container Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Label</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getContainerLabel()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ContainerLabel();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoModel <em>Tool Info Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool Info Model</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoModel()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ToolInfoModel();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.Label#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecifics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Label#getToolspecifics()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Toolspecifics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.NodeGraphics <em>Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics
	 * @generated
	 */
	EClass getNodeGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getPosition()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Position();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getDimension()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getFill()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getLine()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Line();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerNode()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_ContainerNode();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerPage <em>Container Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Page</em>'.
	 * @see fr.lip6.move.pnml.ptnet.NodeGraphics#getContainerPage()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_ContainerPage();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Graphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Graphics
	 * @generated
	 */
	EClass getGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Coordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Coordinate#getX()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Coordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Coordinate#getY()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Y();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Position#getContainerArcGraphics <em>Container Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Position#getContainerArcGraphics()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_ContainerArcGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Position#getContainerPNodeGraphics <em>Container PNode Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container PNode Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Position#getContainerPNodeGraphics()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_ContainerPNodeGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Offset#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Offset#getContainerAnnotationGraphics()
	 * @see #getOffset()
	 * @generated
	 */
	EReference getOffset_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Dimension#getContainerDNodeGraphics <em>Container DNode Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container DNode Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Dimension#getContainerDNodeGraphics()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_ContainerDNodeGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics <em>Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics
	 * @generated
	 */
	EClass getAnnotationGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getOffset()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFill()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getLine()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Line();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getFont()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Font();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.AnnotationGraphics#getContainerAnnotation <em>Container Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnnotationGraphics#getContainerAnnotation()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_ContainerAnnotation();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill
	 * @generated
	 */
	EClass getFill();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Fill#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill#getColor()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Color();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Fill#getGradientcolor <em>Gradientcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradientcolor</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill#getGradientcolor()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Gradientcolor();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Fill#getGradientrotation <em>Gradientrotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradientrotation</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill#getGradientrotation()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Gradientrotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Fill#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill#getImage()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Image();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Fill#getContainerNodeGraphics <em>Container Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill#getContainerNodeGraphics()
	 * @see #getFill()
	 * @generated
	 */
	EReference getFill_ContainerNodeGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Fill#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Fill#getContainerAnnotationGraphics()
	 * @see #getFill()
	 * @generated
	 */
	EReference getFill_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Line#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getColor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Color();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Line#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getShape()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Shape();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Line#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getWidth()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Width();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Line#getContainerNodeGraphics <em>Container Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getContainerNodeGraphics()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ContainerNodeGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Line#getContainerArcGraphics <em>Container Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getContainerArcGraphics()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ContainerArcGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Line#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getContainerAnnotationGraphics()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Line#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Line#getStyle()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Style();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.ArcGraphics <em>Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ArcGraphics
	 * @generated
	 */
	EClass getArcGraphics();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.ptnet.ArcGraphics#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ArcGraphics#getPositions()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_Positions();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.ArcGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ArcGraphics#getLine()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_Line();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.ArcGraphics#getContainerArc <em>Container Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc</em>'.
	 * @see fr.lip6.move.pnml.ptnet.ArcGraphics#getContainerArc()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_ContainerArc();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.ptnet.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.ptnet.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.Arc#getArcgraphics <em>Arcgraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arcgraphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Arc#getArcgraphics()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Arcgraphics();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.Arc#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Arc#getInscription()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Inscription();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.ptnet.Node#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Node#getInArcs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InArcs();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.ptnet.Node#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Node#getOutArcs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutArcs();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.Node#getNodegraphics <em>Nodegraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodegraphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Node#getNodegraphics()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Nodegraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getAlign()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Align();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getDecoration()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Decoration();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getFamily()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Family();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getRotation()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getStyle()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Style();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.ptnet.Font#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getWeight()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Weight();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.Font#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Font#getContainerAnnotationGraphics()
	 * @see #getFont()
	 * @generated
	 */
	EReference getFont_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.PlaceNode <em>Place Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Node</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PlaceNode
	 * @generated
	 */
	EClass getPlaceNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.ptnet.PlaceNode#getReferencingPlaces <em>Referencing Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Places</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PlaceNode#getReferencingPlaces()
	 * @see #getPlaceNode()
	 * @generated
	 */
	EReference getPlaceNode_ReferencingPlaces();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Node</em>'.
	 * @see fr.lip6.move.pnml.ptnet.TransitionNode
	 * @generated
	 */
	EClass getTransitionNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.ptnet.TransitionNode#getReferencingTransitions <em>Referencing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Transitions</em>'.
	 * @see fr.lip6.move.pnml.ptnet.TransitionNode#getReferencingTransitions()
	 * @see #getTransitionNode()
	 * @generated
	 */
	EReference getTransitionNode_ReferencingTransitions();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.Place#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Place#getInitialMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InitialMarking();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.RefTransition <em>Ref Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Transition</em>'.
	 * @see fr.lip6.move.pnml.ptnet.RefTransition
	 * @generated
	 */
	EClass getRefTransition();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.ptnet.RefTransition#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.lip6.move.pnml.ptnet.RefTransition#getRef()
	 * @see #getRefTransition()
	 * @generated
	 */
	EReference getRefTransition_Ref();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.RefPlace <em>Ref Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Place</em>'.
	 * @see fr.lip6.move.pnml.ptnet.RefPlace
	 * @generated
	 */
	EClass getRefPlace();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.ptnet.RefPlace#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.lip6.move.pnml.ptnet.RefPlace#getRef()
	 * @see #getRefPlace()
	 * @generated
	 */
	EReference getRefPlace_Ref();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.ptnet.Annotation#getAnnotationgraphics <em>Annotationgraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotationgraphics</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Annotation#getAnnotationgraphics()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Annotationgraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.ptnet.AnyObject <em>Any Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Object</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnyObject
	 * @generated
	 */
	EClass getAnyObject();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.ptnet.AnyObject#getContainerToolInfo <em>Container Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Tool Info</em>'.
	 * @see fr.lip6.move.pnml.ptnet.AnyObject#getContainerToolInfo()
	 * @see #getAnyObject()
	 * @generated
	 */
	EReference getAnyObject_ContainerToolInfo();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.PNType <em>PN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PN Type</em>'.
	 * @see fr.lip6.move.pnml.ptnet.PNType
	 * @generated
	 */
	EEnum getPNType();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.CSS2Color <em>CSS2 Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Color</em>'.
	 * @see fr.lip6.move.pnml.ptnet.CSS2Color
	 * @generated
	 */
	EEnum getCSS2Color();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.Gradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gradient</em>'.
	 * @see fr.lip6.move.pnml.ptnet.Gradient
	 * @generated
	 */
	EEnum getGradient();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.LineShape <em>Line Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Shape</em>'.
	 * @see fr.lip6.move.pnml.ptnet.LineShape
	 * @generated
	 */
	EEnum getLineShape();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.FontAlign <em>Font Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Align</em>'.
	 * @see fr.lip6.move.pnml.ptnet.FontAlign
	 * @generated
	 */
	EEnum getFontAlign();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.FontDecoration <em>Font Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Decoration</em>'.
	 * @see fr.lip6.move.pnml.ptnet.FontDecoration
	 * @generated
	 */
	EEnum getFontDecoration();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.CSS2FontFamily <em>CSS2 Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Family</em>'.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontFamily
	 * @generated
	 */
	EEnum getCSS2FontFamily();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.CSS2FontSize <em>CSS2 Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Size</em>'.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontSize
	 * @generated
	 */
	EEnum getCSS2FontSize();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.CSS2FontStyle <em>CSS2 Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Style</em>'.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontStyle
	 * @generated
	 */
	EEnum getCSS2FontStyle();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.CSS2FontWeight <em>CSS2 Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Weight</em>'.
	 * @see fr.lip6.move.pnml.ptnet.CSS2FontWeight
	 * @generated
	 */
	EEnum getCSS2FontWeight();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.ptnet.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Style</em>'.
	 * @see fr.lip6.move.pnml.ptnet.LineStyle
	 * @generated
	 */
	EEnum getLineStyle();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getPositiveInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Natural</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getNatural();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.StringBuffer <em>Long String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long String</em>'.
	 * @see java.lang.StringBuffer
	 * @model instanceClass="java.lang.StringBuffer"
	 * @generated
	 */
	EDataType getLongString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PtnetFactory getPtnetFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PTMarkingImpl <em>PT Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PTMarkingImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPTMarking()
		 * @generated
		 */
		EClass PT_MARKING = eINSTANCE.getPTMarking();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_MARKING__TEXT = eINSTANCE.getPTMarking_Text();

		/**
		 * The meta object literal for the '<em><b>Container Place</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PT_MARKING__CONTAINER_PLACE = eINSTANCE.getPTMarking_ContainerPlace();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PTArcAnnotationImpl <em>PT Arc Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PTArcAnnotationImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPTArcAnnotation()
		 * @generated
		 */
		EClass PT_ARC_ANNOTATION = eINSTANCE.getPTArcAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_ARC_ANNOTATION__TEXT = eINSTANCE.getPTArcAnnotation_Text();

		/**
		 * The meta object literal for the '<em><b>Container Arc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PT_ARC_ANNOTATION__CONTAINER_ARC = eINSTANCE.getPTArcAnnotation_ContainerArc();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PetriNetDocImpl <em>Petri Net Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PetriNetDocImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPetriNetDoc()
		 * @generated
		 */
		EClass PETRI_NET_DOC = eINSTANCE.getPetriNetDoc();

		/**
		 * The meta object literal for the '<em><b>Nets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET_DOC__NETS = eINSTANCE.getPetriNetDoc_Nets();

		/**
		 * The meta object literal for the '<em><b>Xmlns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET_DOC__XMLNS = eINSTANCE.getPetriNetDoc_Xmlns();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PetriNetImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET__ID = eINSTANCE.getPetriNet_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET__TYPE = eINSTANCE.getPetriNet_Type();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PAGES = eINSTANCE.getPetriNet_Pages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

		/**
		 * The meta object literal for the '<em><b>Toolspecifics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TOOLSPECIFICS = eINSTANCE.getPetriNet_Toolspecifics();

		/**
		 * The meta object literal for the '<em><b>Container Petri Net Doc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__CONTAINER_PETRI_NET_DOC = eINSTANCE.getPetriNet_ContainerPetriNetDoc();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PageImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__OBJECTS = eINSTANCE.getPage_Objects();

		/**
		 * The meta object literal for the '<em><b>Container Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTAINER_PETRI_NET = eINSTANCE.getPage_ContainerPetriNet();

		/**
		 * The meta object literal for the '<em><b>Nodegraphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__NODEGRAPHICS = eINSTANCE.getPage_Nodegraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PnObjectImpl <em>Pn Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PnObjectImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPnObject()
		 * @generated
		 */
		EClass PN_OBJECT = eINSTANCE.getPnObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PN_OBJECT__ID = eINSTANCE.getPnObject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PN_OBJECT__NAME = eINSTANCE.getPnObject_Name();

		/**
		 * The meta object literal for the '<em><b>Toolspecifics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PN_OBJECT__TOOLSPECIFICS = eINSTANCE.getPnObject_Toolspecifics();

		/**
		 * The meta object literal for the '<em><b>Container Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PN_OBJECT__CONTAINER_PAGE = eINSTANCE.getPnObject_ContainerPage();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.NameImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__TEXT = eINSTANCE.getName_Text();

		/**
		 * The meta object literal for the '<em><b>Container Name Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME__CONTAINER_NAME_PETRI_NET = eINSTANCE.getName_ContainerNamePetriNet();

		/**
		 * The meta object literal for the '<em><b>Container Name Pn Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME__CONTAINER_NAME_PN_OBJECT = eINSTANCE.getName_ContainerNamePnObject();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl <em>Tool Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getToolInfo()
		 * @generated
		 */
		EClass TOOL_INFO = eINSTANCE.getToolInfo();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO__TOOL = eINSTANCE.getToolInfo_Tool();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO__VERSION = eINSTANCE.getToolInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Formatted XML Buffer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO__FORMATTED_XML_BUFFER = eINSTANCE.getToolInfo_FormattedXMLBuffer();

		/**
		 * The meta object literal for the '<em><b>Tool Info Grammar URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO__TOOL_INFO_GRAMMAR_URI = eINSTANCE.getToolInfo_ToolInfoGrammarURI();

		/**
		 * The meta object literal for the '<em><b>Container Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_INFO__CONTAINER_PETRI_NET = eINSTANCE.getToolInfo_ContainerPetriNet();

		/**
		 * The meta object literal for the '<em><b>Container Pn Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_INFO__CONTAINER_PN_OBJECT = eINSTANCE.getToolInfo_ContainerPnObject();

		/**
		 * The meta object literal for the '<em><b>Container Label</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_INFO__CONTAINER_LABEL = eINSTANCE.getToolInfo_ContainerLabel();

		/**
		 * The meta object literal for the '<em><b>Tool Info Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_INFO__TOOL_INFO_MODEL = eINSTANCE.getToolInfo_ToolInfoModel();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.LabelImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Toolspecifics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__TOOLSPECIFICS = eINSTANCE.getLabel_Toolspecifics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.NodeGraphicsImpl <em>Node Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.NodeGraphicsImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getNodeGraphics()
		 * @generated
		 */
		EClass NODE_GRAPHICS = eINSTANCE.getNodeGraphics();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__POSITION = eINSTANCE.getNodeGraphics_Position();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__DIMENSION = eINSTANCE.getNodeGraphics_Dimension();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__FILL = eINSTANCE.getNodeGraphics_Fill();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__LINE = eINSTANCE.getNodeGraphics_Line();

		/**
		 * The meta object literal for the '<em><b>Container Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__CONTAINER_NODE = eINSTANCE.getNodeGraphics_ContainerNode();

		/**
		 * The meta object literal for the '<em><b>Container Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__CONTAINER_PAGE = eINSTANCE.getNodeGraphics_ContainerPage();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.GraphicsImpl <em>Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.GraphicsImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getGraphics()
		 * @generated
		 */
		EClass GRAPHICS = eINSTANCE.getGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.CoordinateImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__X = eINSTANCE.getCoordinate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__Y = eINSTANCE.getCoordinate_Y();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PositionImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Container Arc Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__CONTAINER_ARC_GRAPHICS = eINSTANCE.getPosition_ContainerArcGraphics();

		/**
		 * The meta object literal for the '<em><b>Container PNode Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__CONTAINER_PNODE_GRAPHICS = eINSTANCE.getPosition_ContainerPNodeGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.OffsetImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Container Annotation Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFSET__CONTAINER_ANNOTATION_GRAPHICS = eINSTANCE.getOffset_ContainerAnnotationGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.DimensionImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Container DNode Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__CONTAINER_DNODE_GRAPHICS = eINSTANCE.getDimension_ContainerDNodeGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl <em>Annotation Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAnnotationGraphics()
		 * @generated
		 */
		EClass ANNOTATION_GRAPHICS = eINSTANCE.getAnnotationGraphics();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__OFFSET = eINSTANCE.getAnnotationGraphics_Offset();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__FILL = eINSTANCE.getAnnotationGraphics_Fill();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__LINE = eINSTANCE.getAnnotationGraphics_Line();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__FONT = eINSTANCE.getAnnotationGraphics_Font();

		/**
		 * The meta object literal for the '<em><b>Container Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION = eINSTANCE.getAnnotationGraphics_ContainerAnnotation();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.FillImpl <em>Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.FillImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFill()
		 * @generated
		 */
		EClass FILL = eINSTANCE.getFill();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__COLOR = eINSTANCE.getFill_Color();

		/**
		 * The meta object literal for the '<em><b>Gradientcolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__GRADIENTCOLOR = eINSTANCE.getFill_Gradientcolor();

		/**
		 * The meta object literal for the '<em><b>Gradientrotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__GRADIENTROTATION = eINSTANCE.getFill_Gradientrotation();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__IMAGE = eINSTANCE.getFill_Image();

		/**
		 * The meta object literal for the '<em><b>Container Node Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILL__CONTAINER_NODE_GRAPHICS = eINSTANCE.getFill_ContainerNodeGraphics();

		/**
		 * The meta object literal for the '<em><b>Container Annotation Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILL__CONTAINER_ANNOTATION_GRAPHICS = eINSTANCE.getFill_ContainerAnnotationGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.LineImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__COLOR = eINSTANCE.getLine_Color();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SHAPE = eINSTANCE.getLine_Shape();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__WIDTH = eINSTANCE.getLine_Width();

		/**
		 * The meta object literal for the '<em><b>Container Node Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CONTAINER_NODE_GRAPHICS = eINSTANCE.getLine_ContainerNodeGraphics();

		/**
		 * The meta object literal for the '<em><b>Container Arc Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CONTAINER_ARC_GRAPHICS = eINSTANCE.getLine_ContainerArcGraphics();

		/**
		 * The meta object literal for the '<em><b>Container Annotation Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CONTAINER_ANNOTATION_GRAPHICS = eINSTANCE.getLine_ContainerAnnotationGraphics();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__STYLE = eINSTANCE.getLine_Style();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.ArcGraphicsImpl <em>Arc Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.ArcGraphicsImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getArcGraphics()
		 * @generated
		 */
		EClass ARC_GRAPHICS = eINSTANCE.getArcGraphics();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_GRAPHICS__POSITIONS = eINSTANCE.getArcGraphics_Positions();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_GRAPHICS__LINE = eINSTANCE.getArcGraphics_Line();

		/**
		 * The meta object literal for the '<em><b>Container Arc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_GRAPHICS__CONTAINER_ARC = eINSTANCE.getArcGraphics_ContainerArc();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.ArcImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Arcgraphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ARCGRAPHICS = eINSTANCE.getArc_Arcgraphics();

		/**
		 * The meta object literal for the '<em><b>Inscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__INSCRIPTION = eINSTANCE.getArc_Inscription();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.NodeImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IN_ARCS = eINSTANCE.getNode_InArcs();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUT_ARCS = eINSTANCE.getNode_OutArcs();

		/**
		 * The meta object literal for the '<em><b>Nodegraphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODEGRAPHICS = eINSTANCE.getNode_Nodegraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.FontImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ALIGN = eINSTANCE.getFont_Align();

		/**
		 * The meta object literal for the '<em><b>Decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__DECORATION = eINSTANCE.getFont_Decoration();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FAMILY = eINSTANCE.getFont_Family();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ROTATION = eINSTANCE.getFont_Rotation();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__STYLE = eINSTANCE.getFont_Style();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__WEIGHT = eINSTANCE.getFont_Weight();

		/**
		 * The meta object literal for the '<em><b>Container Annotation Graphics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT__CONTAINER_ANNOTATION_GRAPHICS = eINSTANCE.getFont_ContainerAnnotationGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PlaceNodeImpl <em>Place Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PlaceNodeImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPlaceNode()
		 * @generated
		 */
		EClass PLACE_NODE = eINSTANCE.getPlaceNode();

		/**
		 * The meta object literal for the '<em><b>Referencing Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_NODE__REFERENCING_PLACES = eINSTANCE.getPlaceNode_ReferencingPlaces();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.TransitionNodeImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getTransitionNode()
		 * @generated
		 */
		EClass TRANSITION_NODE = eINSTANCE.getTransitionNode();

		/**
		 * The meta object literal for the '<em><b>Referencing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NODE__REFERENCING_TRANSITIONS = eINSTANCE.getTransitionNode_ReferencingTransitions();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.PlaceImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INITIAL_MARKING = eINSTANCE.getPlace_InitialMarking();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getRefTransition()
		 * @generated
		 */
		EClass REF_TRANSITION = eINSTANCE.getRefTransition();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_TRANSITION__REF = eINSTANCE.getRefTransition_Ref();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.TransitionImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl <em>Ref Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getRefPlace()
		 * @generated
		 */
		EClass REF_PLACE = eINSTANCE.getRefPlace();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_PLACE__REF = eINSTANCE.getRefPlace_Ref();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.AttributeImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.AnnotationImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotationgraphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATIONGRAPHICS = eINSTANCE.getAnnotation_Annotationgraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.impl.AnyObjectImpl <em>Any Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.impl.AnyObjectImpl
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getAnyObject()
		 * @generated
		 */
		EClass ANY_OBJECT = eINSTANCE.getAnyObject();

		/**
		 * The meta object literal for the '<em><b>Container Tool Info</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OBJECT__CONTAINER_TOOL_INFO = eINSTANCE.getAnyObject_ContainerToolInfo();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.PNType <em>PN Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.PNType
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPNType()
		 * @generated
		 */
		EEnum PN_TYPE = eINSTANCE.getPNType();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.CSS2Color <em>CSS2 Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.CSS2Color
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2Color()
		 * @generated
		 */
		EEnum CSS2_COLOR = eINSTANCE.getCSS2Color();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.Gradient <em>Gradient</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.Gradient
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getGradient()
		 * @generated
		 */
		EEnum GRADIENT = eINSTANCE.getGradient();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.LineShape <em>Line Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.LineShape
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLineShape()
		 * @generated
		 */
		EEnum LINE_SHAPE = eINSTANCE.getLineShape();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.FontAlign <em>Font Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.FontAlign
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFontAlign()
		 * @generated
		 */
		EEnum FONT_ALIGN = eINSTANCE.getFontAlign();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.FontDecoration <em>Font Decoration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.FontDecoration
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getFontDecoration()
		 * @generated
		 */
		EEnum FONT_DECORATION = eINSTANCE.getFontDecoration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontFamily <em>CSS2 Font Family</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.CSS2FontFamily
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontFamily()
		 * @generated
		 */
		EEnum CSS2_FONT_FAMILY = eINSTANCE.getCSS2FontFamily();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontSize <em>CSS2 Font Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.CSS2FontSize
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontSize()
		 * @generated
		 */
		EEnum CSS2_FONT_SIZE = eINSTANCE.getCSS2FontSize();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontStyle <em>CSS2 Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.CSS2FontStyle
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontStyle()
		 * @generated
		 */
		EEnum CSS2_FONT_STYLE = eINSTANCE.getCSS2FontStyle();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.CSS2FontWeight <em>CSS2 Font Weight</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.CSS2FontWeight
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getCSS2FontWeight()
		 * @generated
		 */
		EEnum CSS2_FONT_WEIGHT = eINSTANCE.getCSS2FontWeight();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.ptnet.LineStyle <em>Line Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.ptnet.LineStyle
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLineStyle()
		 * @generated
		 */
		EEnum LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em>Positive Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getPositiveInteger()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

		/**
		 * The meta object literal for the '<em>Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getNatural()
		 * @generated
		 */
		EDataType NATURAL = eINSTANCE.getNatural();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Long String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.StringBuffer
		 * @see fr.lip6.move.pnml.ptnet.impl.PtnetPackageImpl#getLongString()
		 * @generated
		 */
		EDataType LONG_STRING = eINSTANCE.getLongString();

	}

} //PtnetPackage
