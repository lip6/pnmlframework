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
import java.net.URI;
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
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Gradient;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FillImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FillImpl#getGradientcolor <em>Gradientcolor</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FillImpl#getGradientrotation <em>Gradientrotation</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FillImpl#getImage <em>Image</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FillImpl#getContainerNodeGraphics <em>Container Node Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.FillImpl#getContainerAnnotationGraphics <em>Container Annotation Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FillImpl extends MinimalEObjectImpl implements Fill {
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
	 * The default value of the '{@link #getGradientcolor() <em>Gradientcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientcolor()
	 * @generated
	 * @ordered
	 */
	protected static final CSS2Color GRADIENTCOLOR_EDEFAULT = CSS2Color.BLACK;

	/**
	 * The cached value of the '{@link #getGradientcolor() <em>Gradientcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientcolor()
	 * @generated
	 * @ordered
	 */
	protected CSS2Color gradientcolor = GRADIENTCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientrotation() <em>Gradientrotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientrotation()
	 * @generated
	 * @ordered
	 */
	protected static final Gradient GRADIENTROTATION_EDEFAULT = Gradient.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getGradientrotation() <em>Gradientrotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientrotation()
	 * @generated
	 * @ordered
	 */
	protected Gradient gradientrotation = GRADIENTROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final URI IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected URI image = IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.FILL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FILL__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS2Color getGradientcolor() {
		return gradientcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradientcolor(CSS2Color newGradientcolor) {
		CSS2Color oldGradientcolor = gradientcolor;
		gradientcolor = newGradientcolor == null ? GRADIENTCOLOR_EDEFAULT : newGradientcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FILL__GRADIENTCOLOR, oldGradientcolor,
					gradientcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gradient getGradientrotation() {
		return gradientrotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradientrotation(Gradient newGradientrotation) {
		Gradient oldGradientrotation = gradientrotation;
		gradientrotation = newGradientrotation == null ? GRADIENTROTATION_EDEFAULT : newGradientrotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FILL__GRADIENTROTATION,
					oldGradientrotation, gradientrotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(URI newImage) {
		URI oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FILL__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGraphics getContainerNodeGraphics() {
		if (eContainerFeatureID() != PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS)
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
				PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS, msgs);
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
				|| (eContainerFeatureID() != PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS && newContainerNodeGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNodeGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNodeGraphics != null)
				msgs = ((InternalEObject) newContainerNodeGraphics).eInverseAdd(this, PtnetPackage.NODE_GRAPHICS__FILL,
						NodeGraphics.class, msgs);
			msgs = basicSetContainerNodeGraphics(newContainerNodeGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS,
					newContainerNodeGraphics, newContainerNodeGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationGraphics getContainerAnnotationGraphics() {
		if (eContainerFeatureID() != PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS)
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
				PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS, msgs);
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
				|| (eContainerFeatureID() != PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS && newContainerAnnotationGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerAnnotationGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerAnnotationGraphics != null)
				msgs = ((InternalEObject) newContainerAnnotationGraphics).eInverseAdd(this,
						PtnetPackage.ANNOTATION_GRAPHICS__FILL, AnnotationGraphics.class, msgs);
			msgs = basicSetContainerAnnotationGraphics(newContainerAnnotationGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS,
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
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNodeGraphics((NodeGraphics) otherEnd, msgs);
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			return basicSetContainerNodeGraphics(null, msgs);
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			return eInternalContainer()
					.eInverseRemove(this, PtnetPackage.NODE_GRAPHICS__FILL, NodeGraphics.class, msgs);
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.ANNOTATION_GRAPHICS__FILL,
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
		case PtnetPackage.FILL__COLOR:
			return getColor();
		case PtnetPackage.FILL__GRADIENTCOLOR:
			return getGradientcolor();
		case PtnetPackage.FILL__GRADIENTROTATION:
			return getGradientrotation();
		case PtnetPackage.FILL__IMAGE:
			return getImage();
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			return getContainerNodeGraphics();
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FILL__COLOR:
			setColor((CSS2Color) newValue);
			return;
		case PtnetPackage.FILL__GRADIENTCOLOR:
			setGradientcolor((CSS2Color) newValue);
			return;
		case PtnetPackage.FILL__GRADIENTROTATION:
			setGradientrotation((Gradient) newValue);
			return;
		case PtnetPackage.FILL__IMAGE:
			setImage((URI) newValue);
			return;
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			setContainerNodeGraphics((NodeGraphics) newValue);
			return;
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FILL__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case PtnetPackage.FILL__GRADIENTCOLOR:
			setGradientcolor(GRADIENTCOLOR_EDEFAULT);
			return;
		case PtnetPackage.FILL__GRADIENTROTATION:
			setGradientrotation(GRADIENTROTATION_EDEFAULT);
			return;
		case PtnetPackage.FILL__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			setContainerNodeGraphics((NodeGraphics) null);
			return;
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
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
		case PtnetPackage.FILL__COLOR:
			return color != COLOR_EDEFAULT;
		case PtnetPackage.FILL__GRADIENTCOLOR:
			return gradientcolor != GRADIENTCOLOR_EDEFAULT;
		case PtnetPackage.FILL__GRADIENTROTATION:
			return gradientrotation != GRADIENTROTATION_EDEFAULT;
		case PtnetPackage.FILL__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case PtnetPackage.FILL__CONTAINER_NODE_GRAPHICS:
			return getContainerNodeGraphics() != null;
		case PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS:
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
		result.append(" (color: ");
		result.append(color);
		result.append(", gradientcolor: ");
		result.append(gradientcolor);
		result.append(", gradientrotation: ");
		result.append(gradientrotation);
		result.append(", image: ");
		result.append(image);
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
		sb.append("<fill");
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

		if (getGradientcolor() != null) {
			sb.append(" gradient-color");
			sb.append("=\"");
			sb.append(getGradientcolor());
			sb.append("\"");
		}

		if (getGradientrotation() != null) {
			sb.append(" gradient-rotation");
			sb.append("=\"");
			sb.append(getGradientrotation());
			sb.append("\"");
		}

		if (getImage() != null) {
			sb.append(" image");
			sb.append("=\"");
			sb.append(getImage());
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

		if (locRoot.getAttributeValue(new QName("gradient-color")) != null) {
			this.setGradientcolor(CSS2Color.get(locRoot.getAttributeValue(new QName("gradient-color"))));
		}

		if (locRoot.getAttributeValue(new QName("gradient-rotation")) != null) {
			this.setGradientrotation(Gradient.get(locRoot.getAttributeValue(new QName("gradient-rotation"))));
		}

		if (locRoot.getAttributeValue(new QName("image")) != null) {
			try {
				this.setImage(new URI(locRoot.getAttributeValue(new QName("image"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
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
		sb.append("<fill");
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

		if (getGradientcolor() != null) {
			sb.append(" gradient-color");
			sb.append("=\"");
			sb.append(getGradientcolor());
			sb.append("\"");
		}

		if (getGradientrotation() != null) {
			sb.append(" gradient-rotation");
			sb.append("=\"");
			sb.append(getGradientrotation());
			sb.append("\"");
		}

		if (getImage() != null) {
			sb.append(" image");
			sb.append("=\"");
			sb.append(getImage());
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
} //FillImpl
