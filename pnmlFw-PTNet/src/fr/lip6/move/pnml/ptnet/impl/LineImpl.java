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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.LineShape;
import fr.lip6.move.pnml.ptnet.LineStyle;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getContainerNodeGraphics <em>Container Node Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getContainerArcGraphics <em>Container Arc Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.LineImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends MinimalEObjectImpl implements Line {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final CSS2Color COLOR_EDEFAULT = CSS2Color.BLACK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected CSS2Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final LineShape SHAPE_EDEFAULT = LineShape.LINE;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected LineShape shape = SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle STYLE_EDEFAULT = LineStyle.SOLID;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle style = STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS2Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(CSS2Color newColor) {
		CSS2Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineShape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShape(LineShape newShape) {
		LineShape oldShape = shape;
		shape = newShape == null ? SHAPE_EDEFAULT : newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Integer newWidth) {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGraphics getContainerNodeGraphics() {
		if (eContainerFeatureID() != PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS)
			return null;
		return (NodeGraphics) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNodeGraphics(NodeGraphics newContainerNodeGraphics, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNodeGraphics,
				PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNodeGraphics(NodeGraphics newContainerNodeGraphics) {
		if (newContainerNodeGraphics != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS && newContainerNodeGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNodeGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNodeGraphics != null)
				msgs = ((InternalEObject) newContainerNodeGraphics).eInverseAdd(this, PtnetPackage.NODE_GRAPHICS__LINE,
						NodeGraphics.class, msgs);
			msgs = basicSetContainerNodeGraphics(newContainerNodeGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS,
					newContainerNodeGraphics, newContainerNodeGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcGraphics getContainerArcGraphics() {
		if (eContainerFeatureID() != PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS)
			return null;
		return (ArcGraphics) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerArcGraphics(ArcGraphics newContainerArcGraphics, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerArcGraphics, PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerArcGraphics(ArcGraphics newContainerArcGraphics) {
		if (newContainerArcGraphics != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS && newContainerArcGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerArcGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerArcGraphics != null)
				msgs = ((InternalEObject) newContainerArcGraphics).eInverseAdd(this, PtnetPackage.ARC_GRAPHICS__LINE,
						ArcGraphics.class, msgs);
			msgs = basicSetContainerArcGraphics(newContainerArcGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS,
					newContainerArcGraphics, newContainerArcGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationGraphics getContainerAnnotationGraphics() {
		if (eContainerFeatureID() != PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS)
			return null;
		return (AnnotationGraphics) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerAnnotationGraphics(AnnotationGraphics newContainerAnnotationGraphics,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerAnnotationGraphics,
				PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerAnnotationGraphics(AnnotationGraphics newContainerAnnotationGraphics) {
		if (newContainerAnnotationGraphics != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS && newContainerAnnotationGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerAnnotationGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerAnnotationGraphics != null)
				msgs = ((InternalEObject) newContainerAnnotationGraphics).eInverseAdd(this,
						PtnetPackage.ANNOTATION_GRAPHICS__LINE, AnnotationGraphics.class, msgs);
			msgs = basicSetContainerAnnotationGraphics(newContainerAnnotationGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS,
					newContainerAnnotationGraphics, newContainerAnnotationGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(LineStyle newStyle) {
		LineStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.LINE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNodeGraphics((NodeGraphics) otherEnd, msgs);
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerArcGraphics((ArcGraphics) otherEnd, msgs);
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerAnnotationGraphics((AnnotationGraphics) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			return basicSetContainerNodeGraphics(null, msgs);
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			return basicSetContainerArcGraphics(null, msgs);
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			return basicSetContainerAnnotationGraphics(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			return eInternalContainer()
					.eInverseRemove(this, PtnetPackage.NODE_GRAPHICS__LINE, NodeGraphics.class, msgs);
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.ARC_GRAPHICS__LINE, ArcGraphics.class, msgs);
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.ANNOTATION_GRAPHICS__LINE,
					AnnotationGraphics.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PtnetPackage.LINE__COLOR:
			return getColor();
		case PtnetPackage.LINE__SHAPE:
			return getShape();
		case PtnetPackage.LINE__WIDTH:
			return getWidth();
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			return getContainerNodeGraphics();
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			return getContainerArcGraphics();
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			return getContainerAnnotationGraphics();
		case PtnetPackage.LINE__STYLE:
			return getStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PtnetPackage.LINE__COLOR:
			setColor((CSS2Color) newValue);
			return;
		case PtnetPackage.LINE__SHAPE:
			setShape((LineShape) newValue);
			return;
		case PtnetPackage.LINE__WIDTH:
			setWidth((Integer) newValue);
			return;
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			setContainerNodeGraphics((NodeGraphics) newValue);
			return;
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			setContainerArcGraphics((ArcGraphics) newValue);
			return;
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			setContainerAnnotationGraphics((AnnotationGraphics) newValue);
			return;
		case PtnetPackage.LINE__STYLE:
			setStyle((LineStyle) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PtnetPackage.LINE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case PtnetPackage.LINE__SHAPE:
			setShape(SHAPE_EDEFAULT);
			return;
		case PtnetPackage.LINE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			setContainerNodeGraphics((NodeGraphics) null);
			return;
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			setContainerArcGraphics((ArcGraphics) null);
			return;
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			setContainerAnnotationGraphics((AnnotationGraphics) null);
			return;
		case PtnetPackage.LINE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PtnetPackage.LINE__COLOR:
			return color != COLOR_EDEFAULT;
		case PtnetPackage.LINE__SHAPE:
			return shape != SHAPE_EDEFAULT;
		case PtnetPackage.LINE__WIDTH:
			return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
		case PtnetPackage.LINE__CONTAINER_NODE_GRAPHICS:
			return getContainerNodeGraphics() != null;
		case PtnetPackage.LINE__CONTAINER_ARC_GRAPHICS:
			return getContainerArcGraphics() != null;
		case PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS:
			return getContainerAnnotationGraphics() != null;
		case PtnetPackage.LINE__STYLE:
			return style != STYLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", shape: ");
		result.append(shape);
		result.append(", width: ");
		result.append(width);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 0
		//idref 0
		//attributes 4
		//sons 0

		Boolean prettyPrintStatus = ModelRepository.getInstance().isPrettyPrintActive();
		String retline = "";
		String headline = "";
		PrettyPrintData prpd = null;
		if (prettyPrintStatus) {
			retline = "\n";
			prpd = ModelRepository.getInstance().getPrettyPrintData();
			headline = prpd.getCurrentLineHeader();
		}

		StringBuilder sb = new StringBuilder();
		sb.append(headline);
		sb.append("<line");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getColor() != null) {
			sb.append(" color");
			sb.append("=\"");
			sb.append(getColor());
			sb.append("\"");
		}

		if (getShape() != null) {
			sb.append(" shape");
			sb.append("=\"");
			sb.append(getShape());
			sb.append("\"");
		}

		if (getWidth() != null) {
			sb.append(" width");
			sb.append("=\"");
			sb.append(getWidth());
			sb.append("\"");
		}

		if (getStyle() != null) {
			sb.append(" style");
			sb.append("=\"");
			sb.append(getStyle());
			sb.append("\"");
		}

		sb.append("/>");
		sb.append(retline);

		//sons, follow processing

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		return sb.toString();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//0
		//0
		//4
		//0
		@SuppressWarnings("unused")
		PtnetFactory fact = PtnetFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("color")) != null) {
			this.setColor(CSS2Color.get(locRoot.getAttributeValue(new QName("color"))));
		}

		if (locRoot.getAttributeValue(new QName("shape")) != null) {
			this.setShape(LineShape.get(locRoot.getAttributeValue(new QName("shape"))));
		}

		if (locRoot.getAttributeValue(new QName("width")) != null) {
			try {
				this.setWidth(new Integer(locRoot.getAttributeValue(new QName("width"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		if (locRoot.getAttributeValue(new QName("style")) != null) {
			this.setStyle(LineStyle.get(locRoot.getAttributeValue(new QName("style"))));
		}

		//processing sons

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 0
		//attributes 4
		//sons 0

		final int bufferSizeKB = 8;
		final int bufferSize = bufferSizeKB * 1024;
		final ByteBuffer bytebuf = ByteBuffer.allocateDirect(bufferSize);
		final String charsetEncoding = PNMLEncoding.ISO_8859_1.getName();

		Boolean prettyPrintStatus = ModelRepository.getInstance().isPrettyPrintActive();
		String retline = "";
		String headline = "";
		PrettyPrintData prpd = null;
		if (prettyPrintStatus) {
			retline = "\n";
			prpd = ModelRepository.getInstance().getPrettyPrintData();
			headline = prpd.getCurrentLineHeader();
		}

		StringBuilder sb = new StringBuilder();
		sb.append(headline);
		sb.append("<line");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getColor() != null) {
			sb.append(" color");
			sb.append("=\"");
			sb.append(getColor());
			sb.append("\"");
		}

		if (getShape() != null) {
			sb.append(" shape");
			sb.append("=\"");
			sb.append(getShape());
			sb.append("\"");
		}

		if (getWidth() != null) {
			sb.append(" width");
			sb.append("=\"");
			sb.append(getWidth());
			sb.append("\"");
		}

		if (getStyle() != null) {
			sb.append(" style");
			sb.append("=\"");
			sb.append(getStyle());
			sb.append("\"");
		}

		sb.append("/>");
		sb.append(retline);

		//sons, follow processing

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		try {
			writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
		} catch (IOException io) {
			io.printStackTrace();
			// fail fast
			return;
		}
		sb = null;
	}

	/**
	 * Writes buffer of a given max size into file channel.
	 */
	private static final void writeIntoStream(final ByteBuffer bytebuf, final FileChannel fc, final byte[] contents)
			throws IOException {
		final int chopSize = 6 * 1024;
		if (contents.length >= bytebuf.capacity()) {
			List<byte[]> chops = PnmlExport.chopBytes(contents, chopSize);
			for (byte[] buf : chops) {
				bytebuf.put(buf);
				bytebuf.flip();
				fc.write(bytebuf);
				bytebuf.clear();
			}
		} else {
			bytebuf.put(contents);
			bytebuf.flip();
			fc.write(bytebuf);
			bytebuf.clear();
		}
	}

	/**
	 * -
	 */
	@Override
	public boolean validateOCL(DiagnosticChain diagnostics) {

		PtnetValidator val = new PtnetValidator();
		boolean retour = true;

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //LineImpl
