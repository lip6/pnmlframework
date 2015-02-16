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
import java.math.BigDecimal;
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
import fr.lip6.move.pnml.ptnet.CSS2FontFamily;
import fr.lip6.move.pnml.ptnet.CSS2FontSize;
import fr.lip6.move.pnml.ptnet.CSS2FontStyle;
import fr.lip6.move.pnml.ptnet.CSS2FontWeight;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.FontAlign;
import fr.lip6.move.pnml.ptnet.FontDecoration;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getSize <em>Size</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FontImpl#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontImpl extends MinimalEObjectImpl implements Font {
	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final FontAlign ALIGN_EDEFAULT = FontAlign.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected FontAlign align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecoration() <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final FontDecoration DECORATION_EDEFAULT = FontDecoration.UNDERLINE;

	/**
	 * The cached value of the '{@link #getDecoration() <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected FontDecoration decoration = DECORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final CSS2FontFamily FAMILY_EDEFAULT = CSS2FontFamily.VERDANA;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected CSS2FontFamily family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final CSS2FontSize SIZE_EDEFAULT = CSS2FontSize.SMALL;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected CSS2FontSize size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final CSS2FontStyle STYLE_EDEFAULT = CSS2FontStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected CSS2FontStyle style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final CSS2FontWeight WEIGHT_EDEFAULT = CSS2FontWeight.NORMAL;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected CSS2FontWeight weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.FONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontAlign getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(FontAlign newAlign) {
		FontAlign oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontDecoration getDecoration() {
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoration(FontDecoration newDecoration) {
		FontDecoration oldDecoration = decoration;
		decoration = newDecoration == null ? DECORATION_EDEFAULT : newDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__DECORATION, oldDecoration,
					decoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS2FontFamily getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily(CSS2FontFamily newFamily) {
		CSS2FontFamily oldFamily = family;
		family = newFamily == null ? FAMILY_EDEFAULT : newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(BigDecimal newRotation) {
		BigDecimal oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS2FontSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(CSS2FontSize newSize) {
		CSS2FontSize oldSize = size;
		size = newSize == null ? SIZE_EDEFAULT : newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS2FontStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(CSS2FontStyle newStyle) {
		CSS2FontStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS2FontWeight getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(CSS2FontWeight newWeight) {
		CSS2FontWeight oldWeight = weight;
		weight = newWeight == null ? WEIGHT_EDEFAULT : newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationGraphics getContainerAnnotationGraphics() {
		if (eContainerFeatureID() != PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS)
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
				PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS, msgs);
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
				|| (eContainerFeatureID() != PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS && newContainerAnnotationGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerAnnotationGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerAnnotationGraphics != null)
				msgs = ((InternalEObject) newContainerAnnotationGraphics).eInverseAdd(this,
						PtnetPackage.ANNOTATION_GRAPHICS__FONT, AnnotationGraphics.class, msgs);
			msgs = basicSetContainerAnnotationGraphics(newContainerAnnotationGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS,
					newContainerAnnotationGraphics, newContainerAnnotationGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.ANNOTATION_GRAPHICS__FONT,
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
		case PtnetPackage.FONT__ALIGN:
			return getAlign();
		case PtnetPackage.FONT__DECORATION:
			return getDecoration();
		case PtnetPackage.FONT__FAMILY:
			return getFamily();
		case PtnetPackage.FONT__ROTATION:
			return getRotation();
		case PtnetPackage.FONT__SIZE:
			return getSize();
		case PtnetPackage.FONT__STYLE:
			return getStyle();
		case PtnetPackage.FONT__WEIGHT:
			return getWeight();
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
			return getContainerAnnotationGraphics();
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
		case PtnetPackage.FONT__ALIGN:
			setAlign((FontAlign) newValue);
			return;
		case PtnetPackage.FONT__DECORATION:
			setDecoration((FontDecoration) newValue);
			return;
		case PtnetPackage.FONT__FAMILY:
			setFamily((CSS2FontFamily) newValue);
			return;
		case PtnetPackage.FONT__ROTATION:
			setRotation((BigDecimal) newValue);
			return;
		case PtnetPackage.FONT__SIZE:
			setSize((CSS2FontSize) newValue);
			return;
		case PtnetPackage.FONT__STYLE:
			setStyle((CSS2FontStyle) newValue);
			return;
		case PtnetPackage.FONT__WEIGHT:
			setWeight((CSS2FontWeight) newValue);
			return;
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
			setContainerAnnotationGraphics((AnnotationGraphics) newValue);
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
		case PtnetPackage.FONT__ALIGN:
			setAlign(ALIGN_EDEFAULT);
			return;
		case PtnetPackage.FONT__DECORATION:
			setDecoration(DECORATION_EDEFAULT);
			return;
		case PtnetPackage.FONT__FAMILY:
			setFamily(FAMILY_EDEFAULT);
			return;
		case PtnetPackage.FONT__ROTATION:
			setRotation(ROTATION_EDEFAULT);
			return;
		case PtnetPackage.FONT__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case PtnetPackage.FONT__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case PtnetPackage.FONT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
			setContainerAnnotationGraphics((AnnotationGraphics) null);
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
		case PtnetPackage.FONT__ALIGN:
			return align != ALIGN_EDEFAULT;
		case PtnetPackage.FONT__DECORATION:
			return decoration != DECORATION_EDEFAULT;
		case PtnetPackage.FONT__FAMILY:
			return family != FAMILY_EDEFAULT;
		case PtnetPackage.FONT__ROTATION:
			return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
		case PtnetPackage.FONT__SIZE:
			return size != SIZE_EDEFAULT;
		case PtnetPackage.FONT__STYLE:
			return style != STYLE_EDEFAULT;
		case PtnetPackage.FONT__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS:
			return getContainerAnnotationGraphics() != null;
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
		result.append(" (align: ");
		result.append(align);
		result.append(", decoration: ");
		result.append(decoration);
		result.append(", family: ");
		result.append(family);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", size: ");
		result.append(size);
		result.append(", style: ");
		result.append(style);
		result.append(", weight: ");
		result.append(weight);
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
		//attributes 7
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
		sb.append("<font");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getAlign() != null) {
			sb.append(" align");
			sb.append("=\"");
			sb.append(getAlign());
			sb.append("\"");
		}

		if (getDecoration() != null) {
			sb.append(" decoration");
			sb.append("=\"");
			sb.append(getDecoration());
			sb.append("\"");
		}

		if (getFamily() != null) {
			sb.append(" family");
			sb.append("=\"");
			sb.append(getFamily());
			sb.append("\"");
		}

		if (getRotation() != null) {
			sb.append(" rotation");
			sb.append("=\"");
			sb.append(getRotation());
			sb.append("\"");
		}

		if (getSize() != null) {
			sb.append(" size");
			sb.append("=\"");
			sb.append(getSize());
			sb.append("\"");
		}

		if (getStyle() != null) {
			sb.append(" style");
			sb.append("=\"");
			sb.append(getStyle());
			sb.append("\"");
		}

		if (getWeight() != null) {
			sb.append(" weight");
			sb.append("=\"");
			sb.append(getWeight());
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
		//7
		//0
		@SuppressWarnings("unused")
		PtnetFactory fact = PtnetFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("align")) != null) {
			this.setAlign(FontAlign.get(locRoot.getAttributeValue(new QName("align"))));
		}

		if (locRoot.getAttributeValue(new QName("decoration")) != null) {
			this.setDecoration(FontDecoration.get(locRoot.getAttributeValue(new QName("decoration"))));
		}

		if (locRoot.getAttributeValue(new QName("family")) != null) {
			this.setFamily(CSS2FontFamily.get(locRoot.getAttributeValue(new QName("family"))));
		}

		if (locRoot.getAttributeValue(new QName("rotation")) != null) {
			try {
				this.setRotation(new BigDecimal(locRoot.getAttributeValue(new QName("rotation"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		if (locRoot.getAttributeValue(new QName("size")) != null) {
			this.setSize(CSS2FontSize.get(locRoot.getAttributeValue(new QName("size"))));
		}

		if (locRoot.getAttributeValue(new QName("style")) != null) {
			this.setStyle(CSS2FontStyle.get(locRoot.getAttributeValue(new QName("style"))));
		}

		if (locRoot.getAttributeValue(new QName("weight")) != null) {
			this.setWeight(CSS2FontWeight.get(locRoot.getAttributeValue(new QName("weight"))));
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
		//attributes 7
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
		sb.append("<font");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getAlign() != null) {
			sb.append(" align");
			sb.append("=\"");
			sb.append(getAlign());
			sb.append("\"");
		}

		if (getDecoration() != null) {
			sb.append(" decoration");
			sb.append("=\"");
			sb.append(getDecoration());
			sb.append("\"");
		}

		if (getFamily() != null) {
			sb.append(" family");
			sb.append("=\"");
			sb.append(getFamily());
			sb.append("\"");
		}

		if (getRotation() != null) {
			sb.append(" rotation");
			sb.append("=\"");
			sb.append(getRotation());
			sb.append("\"");
		}

		if (getSize() != null) {
			sb.append(" size");
			sb.append("=\"");
			sb.append(getSize());
			sb.append("\"");
		}

		if (getStyle() != null) {
			sb.append(" style");
			sb.append("=\"");
			sb.append(getStyle());
			sb.append("\"");
		}

		if (getWeight() != null) {
			sb.append(" weight");
			sb.append("=\"");
			sb.append(getWeight());
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
} //FontImpl
