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
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.Annotation;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Graphics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl#getFont <em>Font</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.AnnotationGraphicsImpl#getContainerAnnotation <em>Container Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationGraphicsImpl extends GraphicsImpl implements AnnotationGraphics {
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Offset offset;

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Fill fill;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Line line;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationGraphicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.ANNOTATION_GRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offset getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(Offset newOffset, NotificationChain msgs) {
		Offset oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.ANNOTATION_GRAPHICS__OFFSET, oldOffset, newOffset);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(Offset newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject) offset).eInverseRemove(this,
						PtnetPackage.OFFSET__CONTAINER_ANNOTATION_GRAPHICS, Offset.class, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject) newOffset).eInverseAdd(this,
						PtnetPackage.OFFSET__CONTAINER_ANNOTATION_GRAPHICS, Offset.class, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.ANNOTATION_GRAPHICS__OFFSET, newOffset,
					newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fill getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFill(Fill newFill, NotificationChain msgs) {
		Fill oldFill = fill;
		fill = newFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.ANNOTATION_GRAPHICS__FILL, oldFill, newFill);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFill(Fill newFill) {
		if (newFill != fill) {
			NotificationChain msgs = null;
			if (fill != null)
				msgs = ((InternalEObject) fill).eInverseRemove(this, PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS,
						Fill.class, msgs);
			if (newFill != null)
				msgs = ((InternalEObject) newFill).eInverseAdd(this, PtnetPackage.FILL__CONTAINER_ANNOTATION_GRAPHICS,
						Fill.class, msgs);
			msgs = basicSetFill(newFill, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.ANNOTATION_GRAPHICS__FILL, newFill,
					newFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Line getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(Line newLine, NotificationChain msgs) {
		Line oldLine = line;
		line = newLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.ANNOTATION_GRAPHICS__LINE, oldLine, newLine);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(Line newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject) line).eInverseRemove(this, PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS,
						Line.class, msgs);
			if (newLine != null)
				msgs = ((InternalEObject) newLine).eInverseAdd(this, PtnetPackage.LINE__CONTAINER_ANNOTATION_GRAPHICS,
						Line.class, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.ANNOTATION_GRAPHICS__LINE, newLine,
					newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.ANNOTATION_GRAPHICS__FONT, oldFont, newFont);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject) font).eInverseRemove(this, PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS,
						Font.class, msgs);
			if (newFont != null)
				msgs = ((InternalEObject) newFont).eInverseAdd(this, PtnetPackage.FONT__CONTAINER_ANNOTATION_GRAPHICS,
						Font.class, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.ANNOTATION_GRAPHICS__FONT, newFont,
					newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getContainerAnnotation() {
		if (eContainerFeatureID() != PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION)
			return null;
		return (Annotation) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerAnnotation(Annotation newContainerAnnotation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerAnnotation,
				PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerAnnotation(Annotation newContainerAnnotation) {
		if (newContainerAnnotation != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION && newContainerAnnotation != null)) {
			if (EcoreUtil.isAncestor(this, newContainerAnnotation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerAnnotation != null)
				msgs = ((InternalEObject) newContainerAnnotation).eInverseAdd(this,
						PtnetPackage.ANNOTATION__ANNOTATIONGRAPHICS, Annotation.class, msgs);
			msgs = basicSetContainerAnnotation(newContainerAnnotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION, newContainerAnnotation,
					newContainerAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.ANNOTATION_GRAPHICS__OFFSET:
			if (offset != null)
				msgs = ((InternalEObject) offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.ANNOTATION_GRAPHICS__OFFSET, null, msgs);
			return basicSetOffset((Offset) otherEnd, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__FILL:
			if (fill != null)
				msgs = ((InternalEObject) fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.ANNOTATION_GRAPHICS__FILL, null, msgs);
			return basicSetFill((Fill) otherEnd, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__LINE:
			if (line != null)
				msgs = ((InternalEObject) line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.ANNOTATION_GRAPHICS__LINE, null, msgs);
			return basicSetLine((Line) otherEnd, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__FONT:
			if (font != null)
				msgs = ((InternalEObject) font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.ANNOTATION_GRAPHICS__FONT, null, msgs);
			return basicSetFont((Font) otherEnd, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerAnnotation((Annotation) otherEnd, msgs);
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
		case PtnetPackage.ANNOTATION_GRAPHICS__OFFSET:
			return basicSetOffset(null, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__FILL:
			return basicSetFill(null, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__LINE:
			return basicSetLine(null, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__FONT:
			return basicSetFont(null, msgs);
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			return basicSetContainerAnnotation(null, msgs);
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
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.ANNOTATION__ANNOTATIONGRAPHICS,
					Annotation.class, msgs);
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
		case PtnetPackage.ANNOTATION_GRAPHICS__OFFSET:
			return getOffset();
		case PtnetPackage.ANNOTATION_GRAPHICS__FILL:
			return getFill();
		case PtnetPackage.ANNOTATION_GRAPHICS__LINE:
			return getLine();
		case PtnetPackage.ANNOTATION_GRAPHICS__FONT:
			return getFont();
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			return getContainerAnnotation();
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
		case PtnetPackage.ANNOTATION_GRAPHICS__OFFSET:
			setOffset((Offset) newValue);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__FILL:
			setFill((Fill) newValue);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__LINE:
			setLine((Line) newValue);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__FONT:
			setFont((Font) newValue);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			setContainerAnnotation((Annotation) newValue);
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
		case PtnetPackage.ANNOTATION_GRAPHICS__OFFSET:
			setOffset((Offset) null);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__FILL:
			setFill((Fill) null);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__LINE:
			setLine((Line) null);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__FONT:
			setFont((Font) null);
			return;
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			setContainerAnnotation((Annotation) null);
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
		case PtnetPackage.ANNOTATION_GRAPHICS__OFFSET:
			return offset != null;
		case PtnetPackage.ANNOTATION_GRAPHICS__FILL:
			return fill != null;
		case PtnetPackage.ANNOTATION_GRAPHICS__LINE:
			return line != null;
		case PtnetPackage.ANNOTATION_GRAPHICS__FONT:
			return font != null;
		case PtnetPackage.ANNOTATION_GRAPHICS__CONTAINER_ANNOTATION:
			return getContainerAnnotation() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 0
		//idref 0
		//attributes 0
		//sons 4

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
		sb.append("<graphics");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getOffset() != null) {

			String top = getOffset().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getFill() != null) {

			String top = getFill().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getLine() != null) {

			String top = getLine().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getFont() != null) {

			String top = getFont().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</graphics>");
			sb.append(retline);
		} else {
			sb.delete(sb.lastIndexOf(">"), sb.length());
			sb.append("/>");
		}

		return sb.toString();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//0
		//0
		//0
		//4
		@SuppressWarnings("unused")
		PtnetFactory fact = PtnetFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("offset")) {
				Offset item;
				item = PtnetFactory.eINSTANCE.createOffset();
				item.fromPNML(type, idr);

				item.setContainerAnnotationGraphics(this);

				continue;
			}//end if

			if (type.getLocalName().equals("fill")) {
				Fill item;
				item = PtnetFactory.eINSTANCE.createFill();
				item.fromPNML(type, idr);

				item.setContainerAnnotationGraphics(this);

				continue;
			}//end if

			if (type.getLocalName().equals("line")) {
				Line item;
				item = PtnetFactory.eINSTANCE.createLine();
				item.fromPNML(type, idr);

				item.setContainerAnnotationGraphics(this);

				continue;
			}//end if

			if (type.getLocalName().equals("font")) {
				Font item;
				item = PtnetFactory.eINSTANCE.createFont();
				item.fromPNML(type, idr);

				item.setContainerAnnotationGraphics(this);

				continue;
			}//end if

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 0
		//attributes 0
		//sons 4

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
		sb.append("<graphics");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getOffset() != null) {

			String top = getOffset().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getFill() != null) {

			String top = getFill().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getLine() != null) {

			String top = getLine().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getFont() != null) {

			String top = getFont().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</graphics>");
		sb.append(retline);

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

		if (getOffset() != null) {
			retour &= getOffset().validateOCL(diagnostics);
		}

		if (getFill() != null) {
			retour &= getFill().validateOCL(diagnostics);
		}

		if (getLine() != null) {
			retour &= getLine().validateOCL(diagnostics);
		}

		if (getFont() != null) {
			retour &= getFont().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //AnnotationGraphicsImpl
