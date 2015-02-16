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
package fr.lip6.move.pnml.hlpn.hlcorestructure;

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
 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructureFactory
 * @model kind="package"
 * @generated
 */
public interface HlcorestructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlcorestructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hlpn.hlcorestructure.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlcorestructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlcorestructurePackage eINSTANCE = fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetDocImpl <em>Petri Net Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetDocImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPetriNetDoc()
	 * @generated
	 */
	int PETRI_NET_DOC = 0;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 1;

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
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__DECLARATION = 6;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PnObjectImpl <em>Pn Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PnObjectImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPnObject()
	 * @generated
	 */
	int PN_OBJECT = 3;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PageImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 2;

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
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DECLARATION = PN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LabelImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 6;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 27;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NameImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getName_()
	 * @generated
	 */
	int NAME = 4;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ToolInfoImpl <em>Tool Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ToolInfoImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getToolInfo()
	 * @generated
	 */
	int TOOL_INFO = 5;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.GraphicsImpl <em>Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.GraphicsImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getGraphics()
	 * @generated
	 */
	int GRAPHICS = 8;

	/**
	 * The number of structural features of the '<em>Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeGraphicsImpl <em>Node Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeGraphicsImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getNodeGraphics()
	 * @generated
	 */
	int NODE_GRAPHICS = 7;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.CoordinateImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 9;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PositionImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 10;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.OffsetImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 11;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DimensionImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 12;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationGraphicsImpl <em>Annotation Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationGraphicsImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAnnotationGraphics()
	 * @generated
	 */
	int ANNOTATION_GRAPHICS = 13;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FillImpl <em>Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FillImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFill()
	 * @generated
	 */
	int FILL = 14;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LineImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLine()
	 * @generated
	 */
	int LINE = 15;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcGraphicsImpl <em>Arc Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcGraphicsImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getArcGraphics()
	 * @generated
	 */
	int ARC_GRAPHICS = 16;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getArc()
	 * @generated
	 */
	int ARC = 17;

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
	 * The feature id for the '<em><b>Hlinscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__HLINSCRIPTION = PN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 18;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FontImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFont()
	 * @generated
	 */
	int FONT = 19;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceNodeImpl <em>Place Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceNodeImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPlaceNode()
	 * @generated
	 */
	int PLACE_NODE = 20;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionNodeImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getTransitionNode()
	 * @generated
	 */
	int TRANSITION_NODE = 21;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 22;

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
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = PLACE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hlinitial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__HLINITIAL_MARKING = PLACE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PLACE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefTransitionImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getRefTransition()
	 * @generated
	 */
	int REF_TRANSITION = 23;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 24;

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
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefPlaceImpl <em>Ref Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefPlaceImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getRefPlace()
	 * @generated
	 */
	int REF_PLACE = 25;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AttributeImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 26;

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
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl <em>Any Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAnyObject()
	 * @generated
	 */
	int ANY_OBJECT = 28;

	/**
	 * The feature id for the '<em><b>Container Tool Info</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT__CONTAINER_TOOL_INFO = 0;

	/**
	 * The feature id for the '<em><b>Container Unparsed</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT__CONTAINER_UNPARSED = 1;

	/**
	 * The feature id for the '<em><b>Container Any Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT__CONTAINER_ANY_SORT = 2;

	/**
	 * The feature id for the '<em><b>Container Arbitrary Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT__CONTAINER_ARBITRARY_SORT = 3;

	/**
	 * The number of structural features of the '<em>Any Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLCoreAnnotationImpl <em>HL Core Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLCoreAnnotationImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getHLCoreAnnotation()
	 * @generated
	 */
	int HL_CORE_ANNOTATION = 29;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_CORE_ANNOTATION__TOOLSPECIFICS = ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_CORE_ANNOTATION__ANNOTATIONGRAPHICS = ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_CORE_ANNOTATION__TEXT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HL Core Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_CORE_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TypeImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 30;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TOOLSPECIFICS = HL_CORE_ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONGRAPHICS = HL_CORE_ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEXT = HL_CORE_ANNOTATION__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__STRUCTURE = HL_CORE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Place</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTAINER_PLACE = HL_CORE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = HL_CORE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLMarkingImpl <em>HL Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLMarkingImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getHLMarking()
	 * @generated
	 */
	int HL_MARKING = 31;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__TOOLSPECIFICS = HL_CORE_ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__ANNOTATIONGRAPHICS = HL_CORE_ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__TEXT = HL_CORE_ANNOTATION__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__STRUCTURE = HL_CORE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Place</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__CONTAINER_PLACE = HL_CORE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HL Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING_FEATURE_COUNT = HL_CORE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ConditionImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 32;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TOOLSPECIFICS = HL_CORE_ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANNOTATIONGRAPHICS = HL_CORE_ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEXT = HL_CORE_ANNOTATION__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STRUCTURE = HL_CORE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONTAINER_TRANSITION = HL_CORE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = HL_CORE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLAnnotationImpl <em>HL Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLAnnotationImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getHLAnnotation()
	 * @generated
	 */
	int HL_ANNOTATION = 33;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__TOOLSPECIFICS = HL_CORE_ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__ANNOTATIONGRAPHICS = HL_CORE_ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__TEXT = HL_CORE_ANNOTATION__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__STRUCTURE = HL_CORE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Arc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__CONTAINER_ARC = HL_CORE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HL Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION_FEATURE_COUNT = HL_CORE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DeclarationImpl
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 34;

	/**
	 * The feature id for the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TOOLSPECIFICS = HL_CORE_ANNOTATION__TOOLSPECIFICS;

	/**
	 * The feature id for the '<em><b>Annotationgraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ANNOTATIONGRAPHICS = HL_CORE_ANNOTATION__ANNOTATIONGRAPHICS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TEXT = HL_CORE_ANNOTATION__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__STRUCTURE = HL_CORE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Declaration Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__CONTAINER_DECLARATION_PETRI_NET = HL_CORE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Declaration Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__CONTAINER_DECLARATION_PAGE = HL_CORE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = HL_CORE_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PNType <em>PN Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PNType
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPNType()
	 * @generated
	 */
	int PN_TYPE = 35;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color <em>CSS2 Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2Color()
	 * @generated
	 */
	int CSS2_COLOR = 36;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient <em>Gradient</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getGradient()
	 * @generated
	 */
	int GRADIENT = 37;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape <em>Line Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLineShape()
	 * @generated
	 */
	int LINE_SHAPE = 38;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign <em>Font Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFontAlign()
	 * @generated
	 */
	int FONT_ALIGN = 39;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration <em>Font Decoration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFontDecoration()
	 * @generated
	 */
	int FONT_DECORATION = 40;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily <em>CSS2 Font Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontFamily()
	 * @generated
	 */
	int CSS2_FONT_FAMILY = 41;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize <em>CSS2 Font Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontSize()
	 * @generated
	 */
	int CSS2_FONT_SIZE = 42;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle <em>CSS2 Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontStyle()
	 * @generated
	 */
	int CSS2_FONT_STYLE = 43;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight <em>CSS2 Font Weight</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontWeight()
	 * @generated
	 */
	int CSS2_FONT_WEIGHT = 44;

	/**
	 * The meta object id for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle <em>Line Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 45;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getURI()
	 * @generated
	 */
	int URI = 46;

	/**
	 * The meta object id for the '<em>Long String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.StringBuffer
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLongString()
	 * @generated
	 */
	int LONG_STRING = 47;

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc <em>Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Doc</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc
	 * @generated
	 */
	EClass getPetriNetDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc#getNets <em>Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nets</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc#getNets()
	 * @see #getPetriNetDoc()
	 * @generated
	 */
	EReference getPetriNetDoc_Nets();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc#getXmlns <em>Xmlns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmlns</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc#getXmlns()
	 * @see #getPetriNetDoc()
	 * @generated
	 */
	EAttribute getPetriNetDoc_Xmlns();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getId()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getType()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getPages()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecifics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getToolspecifics()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Toolspecifics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getContainerPetriNetDoc <em>Container Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Petri Net Doc</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getContainerPetriNetDoc()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainerPetriNetDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet#getDeclaration()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Declaration();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getObjects()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Objects();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getContainerPetriNet <em>Container Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Petri Net</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getContainerPetriNet()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ContainerPetriNet();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getNodegraphics <em>Nodegraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodegraphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getNodegraphics()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Nodegraphics();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Page#getDeclaration()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Declaration();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject <em>Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pn Object</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject
	 * @generated
	 */
	EClass getPnObject();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getId()
	 * @see #getPnObject()
	 * @generated
	 */
	EAttribute getPnObject_Id();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getName()
	 * @see #getPnObject()
	 * @generated
	 */
	EReference getPnObject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecifics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getToolspecifics()
	 * @see #getPnObject()
	 * @generated
	 */
	EReference getPnObject_Toolspecifics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getContainerPage <em>Container Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Page</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject#getContainerPage()
	 * @see #getPnObject()
	 * @generated
	 */
	EReference getPnObject_ContainerPage();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Name#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Name#getText()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Text();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Name#getContainerNamePetriNet <em>Container Name Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Name Petri Net</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Name#getContainerNamePetriNet()
	 * @see #getName_()
	 * @generated
	 */
	EReference getName_ContainerNamePetriNet();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Name#getContainerNamePnObject <em>Container Name Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Name Pn Object</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Name#getContainerNamePnObject()
	 * @see #getName_()
	 * @generated
	 */
	EReference getName_ContainerNamePnObject();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Info</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo
	 * @generated
	 */
	EClass getToolInfo();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getTool()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_Tool();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getVersion()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getFormattedXMLBuffer <em>Formatted XML Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formatted XML Buffer</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getFormattedXMLBuffer()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_FormattedXMLBuffer();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getToolInfoGrammarURI <em>Tool Info Grammar URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Info Grammar URI</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getToolInfoGrammarURI()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_ToolInfoGrammarURI();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getContainerPetriNet <em>Container Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Petri Net</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getContainerPetriNet()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ContainerPetriNet();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getContainerPnObject <em>Container Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Pn Object</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getContainerPnObject()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ContainerPnObject();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getContainerLabel <em>Container Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Label</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getContainerLabel()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ContainerLabel();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getToolInfoModel <em>Tool Info Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool Info Model</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getToolInfoModel()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_ToolInfoModel();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Label#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecifics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Label#getToolspecifics()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Toolspecifics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics <em>Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics
	 * @generated
	 */
	EClass getNodeGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getPosition()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Position();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getDimension()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getFill()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getLine()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Line();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getContainerNode()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_ContainerNode();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getContainerPage <em>Container Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Page</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics#getContainerPage()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_ContainerPage();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Graphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Graphics
	 * @generated
	 */
	EClass getGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate#getX()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Coordinate#getY()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Y();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Position#getContainerArcGraphics <em>Container Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Position#getContainerArcGraphics()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_ContainerArcGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Position#getContainerPNodeGraphics <em>Container PNode Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container PNode Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Position#getContainerPNodeGraphics()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_ContainerPNodeGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Offset#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Offset#getContainerAnnotationGraphics()
	 * @see #getOffset()
	 * @generated
	 */
	EReference getOffset_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension#getContainerDNodeGraphics <em>Container DNode Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container DNode Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension#getContainerDNodeGraphics()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_ContainerDNodeGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics <em>Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics
	 * @generated
	 */
	EClass getAnnotationGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getOffset()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getFill()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getLine()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Line();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getFont()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Font();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getContainerAnnotation <em>Container Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics#getContainerAnnotation()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_ContainerAnnotation();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill
	 * @generated
	 */
	EClass getFill();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getColor()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Color();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getGradientcolor <em>Gradientcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradientcolor</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getGradientcolor()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Gradientcolor();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getGradientrotation <em>Gradientrotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradientrotation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getGradientrotation()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Gradientrotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getImage()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Image();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getContainerNodeGraphics <em>Container Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getContainerNodeGraphics()
	 * @see #getFill()
	 * @generated
	 */
	EReference getFill_ContainerNodeGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Fill#getContainerAnnotationGraphics()
	 * @see #getFill()
	 * @generated
	 */
	EReference getFill_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getColor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Color();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getShape()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Shape();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getWidth()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Width();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getContainerNodeGraphics <em>Container Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getContainerNodeGraphics()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ContainerNodeGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getContainerArcGraphics <em>Container Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getContainerArcGraphics()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ContainerArcGraphics();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getContainerAnnotationGraphics()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Line#getStyle()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Style();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics <em>Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics
	 * @generated
	 */
	EClass getArcGraphics();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics#getPositions()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_Positions();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics#getLine()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_Line();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics#getContainerArc <em>Container Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics#getContainerArc()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_ContainerArc();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getArcgraphics <em>Arcgraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arcgraphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getArcgraphics()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Arcgraphics();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getHlinscription <em>Hlinscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hlinscription</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Arc#getHlinscription()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Hlinscription();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Node#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Node#getInArcs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InArcs();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Node#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Node#getOutArcs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutArcs();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Node#getNodegraphics <em>Nodegraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodegraphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Node#getNodegraphics()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Nodegraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getAlign()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Align();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getDecoration()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Decoration();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getFamily()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Family();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getRotation()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getStyle()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Style();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getWeight()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Weight();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Annotation Graphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Font#getContainerAnnotationGraphics()
	 * @see #getFont()
	 * @generated
	 */
	EReference getFont_ContainerAnnotationGraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode <em>Place Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Node</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode
	 * @generated
	 */
	EClass getPlaceNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode#getReferencingPlaces <em>Referencing Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Places</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode#getReferencingPlaces()
	 * @see #getPlaceNode()
	 * @generated
	 */
	EReference getPlaceNode_ReferencingPlaces();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Node</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode
	 * @generated
	 */
	EClass getTransitionNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode#getReferencingTransitions <em>Referencing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Transitions</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode#getReferencingTransitions()
	 * @see #getTransitionNode()
	 * @generated
	 */
	EReference getTransitionNode_ReferencingTransitions();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Place#getHlinitialMarking <em>Hlinitial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hlinitial Marking</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Place#getHlinitialMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_HlinitialMarking();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition <em>Ref Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Transition</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition
	 * @generated
	 */
	EClass getRefTransition();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition#getRef()
	 * @see #getRefTransition()
	 * @generated
	 */
	EReference getRefTransition_Ref();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace <em>Ref Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Place</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace
	 * @generated
	 */
	EClass getRefPlace();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace#getRef()
	 * @see #getRefPlace()
	 * @generated
	 */
	EReference getRefPlace_Ref();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation#getAnnotationgraphics <em>Annotationgraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotationgraphics</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation#getAnnotationgraphics()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Annotationgraphics();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject <em>Any Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Object</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject
	 * @generated
	 */
	EClass getAnyObject();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerToolInfo <em>Container Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Tool Info</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerToolInfo()
	 * @see #getAnyObject()
	 * @generated
	 */
	EReference getAnyObject_ContainerToolInfo();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerUnparsed <em>Container Unparsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Unparsed</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerUnparsed()
	 * @see #getAnyObject()
	 * @generated
	 */
	EReference getAnyObject_ContainerUnparsed();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerAnySort <em>Container Any Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Any Sort</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerAnySort()
	 * @see #getAnyObject()
	 * @generated
	 */
	EReference getAnyObject_ContainerAnySort();

	/**
	 * Returns the meta object for the reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerArbitrarySort <em>Container Arbitrary Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Arbitrary Sort</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerArbitrarySort()
	 * @see #getAnyObject()
	 * @generated
	 */
	EReference getAnyObject_ContainerArbitrarySort();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLCoreAnnotation <em>HL Core Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HL Core Annotation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLCoreAnnotation
	 * @generated
	 */
	EClass getHLCoreAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLCoreAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLCoreAnnotation#getText()
	 * @see #getHLCoreAnnotation()
	 * @generated
	 */
	EAttribute getHLCoreAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Type#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Type#getStructure()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Structure();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Type#getContainerPlace <em>Container Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Place</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Type#getContainerPlace()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_ContainerPlace();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking <em>HL Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HL Marking</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking
	 * @generated
	 */
	EClass getHLMarking();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking#getStructure()
	 * @see #getHLMarking()
	 * @generated
	 */
	EReference getHLMarking_Structure();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking#getContainerPlace <em>Container Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Place</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking#getContainerPlace()
	 * @see #getHLMarking()
	 * @generated
	 */
	EReference getHLMarking_ContainerPlace();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Condition#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Condition#getStructure()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Structure();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Condition#getContainerTransition <em>Container Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Transition</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Condition#getContainerTransition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ContainerTransition();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation <em>HL Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HL Annotation</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation
	 * @generated
	 */
	EClass getHLAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation#getStructure()
	 * @see #getHLAnnotation()
	 * @generated
	 */
	EReference getHLAnnotation_Structure();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation#getContainerArc <em>Container Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Arc</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation#getContainerArc()
	 * @see #getHLAnnotation()
	 * @generated
	 */
	EReference getHLAnnotation_ContainerArc();

	/**
	 * Returns the meta object for class '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration#getStructure()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Structure();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration#getContainerDeclarationPetriNet <em>Container Declaration Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Declaration Petri Net</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration#getContainerDeclarationPetriNet()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_ContainerDeclarationPetriNet();

	/**
	 * Returns the meta object for the container reference '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration#getContainerDeclarationPage <em>Container Declaration Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Declaration Page</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration#getContainerDeclarationPage()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_ContainerDeclarationPage();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PNType <em>PN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PN Type</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PNType
	 * @generated
	 */
	EEnum getPNType();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color <em>CSS2 Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Color</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color
	 * @generated
	 */
	EEnum getCSS2Color();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gradient</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient
	 * @generated
	 */
	EEnum getGradient();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape <em>Line Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Shape</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape
	 * @generated
	 */
	EEnum getLineShape();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign <em>Font Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Align</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign
	 * @generated
	 */
	EEnum getFontAlign();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration <em>Font Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Decoration</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration
	 * @generated
	 */
	EEnum getFontDecoration();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily <em>CSS2 Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Family</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily
	 * @generated
	 */
	EEnum getCSS2FontFamily();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize <em>CSS2 Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Size</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize
	 * @generated
	 */
	EEnum getCSS2FontSize();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle <em>CSS2 Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Style</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle
	 * @generated
	 */
	EEnum getCSS2FontStyle();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight <em>CSS2 Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSS2 Font Weight</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight
	 * @generated
	 */
	EEnum getCSS2FontWeight();

	/**
	 * Returns the meta object for enum '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Style</em>'.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle
	 * @generated
	 */
	EEnum getLineStyle();

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
	HlcorestructureFactory getHlcorestructureFactory();

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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetDocImpl <em>Petri Net Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetDocImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPetriNetDoc()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PetriNetImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPetriNet()
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
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__DECLARATION = eINSTANCE.getPetriNet_Declaration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PageImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPage()
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
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__DECLARATION = eINSTANCE.getPage_Declaration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PnObjectImpl <em>Pn Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PnObjectImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPnObject()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NameImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getName_()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ToolInfoImpl <em>Tool Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ToolInfoImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getToolInfo()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LabelImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLabel()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeGraphicsImpl <em>Node Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeGraphicsImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getNodeGraphics()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.GraphicsImpl <em>Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.GraphicsImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getGraphics()
		 * @generated
		 */
		EClass GRAPHICS = eINSTANCE.getGraphics();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.CoordinateImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCoordinate()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PositionImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPosition()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.OffsetImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getOffset()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DimensionImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getDimension()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationGraphicsImpl <em>Annotation Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationGraphicsImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAnnotationGraphics()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FillImpl <em>Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FillImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFill()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.LineImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLine()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcGraphicsImpl <em>Arc Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcGraphicsImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getArcGraphics()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getArc()
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
		 * The meta object literal for the '<em><b>Hlinscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__HLINSCRIPTION = eINSTANCE.getArc_Hlinscription();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.NodeImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getNode()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.FontImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFont()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceNodeImpl <em>Place Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceNodeImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPlaceNode()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionNodeImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getTransitionNode()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '<em><b>Hlinitial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__HLINITIAL_MARKING = eINSTANCE.getPlace_HlinitialMarking();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefTransitionImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getRefTransition()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefPlaceImpl <em>Ref Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefPlaceImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getRefPlace()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AttributeImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnnotationImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAnnotation()
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
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl <em>Any Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.AnyObjectImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getAnyObject()
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
		 * The meta object literal for the '<em><b>Container Unparsed</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OBJECT__CONTAINER_UNPARSED = eINSTANCE.getAnyObject_ContainerUnparsed();

		/**
		 * The meta object literal for the '<em><b>Container Any Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OBJECT__CONTAINER_ANY_SORT = eINSTANCE.getAnyObject_ContainerAnySort();

		/**
		 * The meta object literal for the '<em><b>Container Arbitrary Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OBJECT__CONTAINER_ARBITRARY_SORT = eINSTANCE.getAnyObject_ContainerArbitrarySort();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLCoreAnnotationImpl <em>HL Core Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLCoreAnnotationImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getHLCoreAnnotation()
		 * @generated
		 */
		EClass HL_CORE_ANNOTATION = eINSTANCE.getHLCoreAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HL_CORE_ANNOTATION__TEXT = eINSTANCE.getHLCoreAnnotation_Text();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TypeImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__STRUCTURE = eINSTANCE.getType_Structure();

		/**
		 * The meta object literal for the '<em><b>Container Place</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__CONTAINER_PLACE = eINSTANCE.getType_ContainerPlace();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLMarkingImpl <em>HL Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLMarkingImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getHLMarking()
		 * @generated
		 */
		EClass HL_MARKING = eINSTANCE.getHLMarking();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HL_MARKING__STRUCTURE = eINSTANCE.getHLMarking_Structure();

		/**
		 * The meta object literal for the '<em><b>Container Place</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HL_MARKING__CONTAINER_PLACE = eINSTANCE.getHLMarking_ContainerPlace();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ConditionImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__STRUCTURE = eINSTANCE.getCondition_Structure();

		/**
		 * The meta object literal for the '<em><b>Container Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONTAINER_TRANSITION = eINSTANCE.getCondition_ContainerTransition();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLAnnotationImpl <em>HL Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HLAnnotationImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getHLAnnotation()
		 * @generated
		 */
		EClass HL_ANNOTATION = eINSTANCE.getHLAnnotation();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HL_ANNOTATION__STRUCTURE = eINSTANCE.getHLAnnotation_Structure();

		/**
		 * The meta object literal for the '<em><b>Container Arc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HL_ANNOTATION__CONTAINER_ARC = eINSTANCE.getHLAnnotation_ContainerArc();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.DeclarationImpl
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__STRUCTURE = eINSTANCE.getDeclaration_Structure();

		/**
		 * The meta object literal for the '<em><b>Container Declaration Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__CONTAINER_DECLARATION_PETRI_NET = eINSTANCE
				.getDeclaration_ContainerDeclarationPetriNet();

		/**
		 * The meta object literal for the '<em><b>Container Declaration Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__CONTAINER_DECLARATION_PAGE = eINSTANCE.getDeclaration_ContainerDeclarationPage();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.PNType <em>PN Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.PNType
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getPNType()
		 * @generated
		 */
		EEnum PN_TYPE = eINSTANCE.getPNType();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color <em>CSS2 Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2Color()
		 * @generated
		 */
		EEnum CSS2_COLOR = eINSTANCE.getCSS2Color();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient <em>Gradient</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getGradient()
		 * @generated
		 */
		EEnum GRADIENT = eINSTANCE.getGradient();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape <em>Line Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLineShape()
		 * @generated
		 */
		EEnum LINE_SHAPE = eINSTANCE.getLineShape();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign <em>Font Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFontAlign()
		 * @generated
		 */
		EEnum FONT_ALIGN = eINSTANCE.getFontAlign();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration <em>Font Decoration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getFontDecoration()
		 * @generated
		 */
		EEnum FONT_DECORATION = eINSTANCE.getFontDecoration();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily <em>CSS2 Font Family</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontFamily()
		 * @generated
		 */
		EEnum CSS2_FONT_FAMILY = eINSTANCE.getCSS2FontFamily();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize <em>CSS2 Font Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontSize()
		 * @generated
		 */
		EEnum CSS2_FONT_SIZE = eINSTANCE.getCSS2FontSize();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle <em>CSS2 Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontStyle()
		 * @generated
		 */
		EEnum CSS2_FONT_STYLE = eINSTANCE.getCSS2FontStyle();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight <em>CSS2 Font Weight</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getCSS2FontWeight()
		 * @generated
		 */
		EEnum CSS2_FONT_WEIGHT = eINSTANCE.getCSS2FontWeight();

		/**
		 * The meta object literal for the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle <em>Line Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLineStyle()
		 * @generated
		 */
		EEnum LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Long String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.StringBuffer
		 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructurePackageImpl#getLongString()
		 * @generated
		 */
		EDataType LONG_STRING = eINSTANCE.getLongString();

	}

} //HlcorestructurePackage
