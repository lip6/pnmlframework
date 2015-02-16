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
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PositionImpl#getContainerArcGraphics <em>Container Arc Graphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PositionImpl#getContainerPNodeGraphics <em>Container PNode Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionImpl extends CoordinateImpl implements Position {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcGraphics getContainerArcGraphics() {
		if (eContainerFeatureID() != PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS)
			return null;
		return (ArcGraphics) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerArcGraphics(ArcGraphics newContainerArcGraphics, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerArcGraphics,
				PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS, msgs);
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
				|| (eContainerFeatureID() != PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS && newContainerArcGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerArcGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerArcGraphics != null)
				msgs = ((InternalEObject) newContainerArcGraphics).eInverseAdd(this,
						PtnetPackage.ARC_GRAPHICS__POSITIONS, ArcGraphics.class, msgs);
			msgs = basicSetContainerArcGraphics(newContainerArcGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS,
					newContainerArcGraphics, newContainerArcGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGraphics getContainerPNodeGraphics() {
		if (eContainerFeatureID() != PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS)
			return null;
		return (NodeGraphics) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPNodeGraphics(NodeGraphics newContainerPNodeGraphics,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPNodeGraphics,
				PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPNodeGraphics(NodeGraphics newContainerPNodeGraphics) {
		if (newContainerPNodeGraphics != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS && newContainerPNodeGraphics != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPNodeGraphics))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPNodeGraphics != null)
				msgs = ((InternalEObject) newContainerPNodeGraphics).eInverseAdd(this,
						PtnetPackage.NODE_GRAPHICS__POSITION, NodeGraphics.class, msgs);
			msgs = basicSetContainerPNodeGraphics(newContainerPNodeGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS,
					newContainerPNodeGraphics, newContainerPNodeGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerArcGraphics((ArcGraphics) otherEnd, msgs);
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPNodeGraphics((NodeGraphics) otherEnd, msgs);
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
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			return basicSetContainerArcGraphics(null, msgs);
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			return basicSetContainerPNodeGraphics(null, msgs);
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
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.ARC_GRAPHICS__POSITIONS, ArcGraphics.class,
					msgs);
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.NODE_GRAPHICS__POSITION, NodeGraphics.class,
					msgs);
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
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			return getContainerArcGraphics();
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			return getContainerPNodeGraphics();
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
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			setContainerArcGraphics((ArcGraphics) newValue);
			return;
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			setContainerPNodeGraphics((NodeGraphics) newValue);
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
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			setContainerArcGraphics((ArcGraphics) null);
			return;
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			setContainerPNodeGraphics((NodeGraphics) null);
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
		case PtnetPackage.POSITION__CONTAINER_ARC_GRAPHICS:
			return getContainerArcGraphics() != null;
		case PtnetPackage.POSITION__CONTAINER_PNODE_GRAPHICS:
			return getContainerPNodeGraphics() != null;
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
		//attributes 2
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
		sb.append("<position");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getX() != null) {
			sb.append(" x");
			sb.append("=\"");
			sb.append(getX());
			sb.append("\"");
		}

		if (getY() != null) {
			sb.append(" y");
			sb.append("=\"");
			sb.append(getY());
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
		//2
		//0
		@SuppressWarnings("unused")
		PtnetFactory fact = PtnetFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("x")) != null) {
			try {
				this.setX(new Integer(locRoot.getAttributeValue(new QName("x"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		if (locRoot.getAttributeValue(new QName("y")) != null) {
			try {
				this.setY(new Integer(locRoot.getAttributeValue(new QName("y"))));
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
		//attributes 2
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
		sb.append("<position");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getX() != null) {
			sb.append(" x");
			sb.append("=\"");
			sb.append(getX());
			sb.append("\"");
		}

		if (getY() != null) {
			sb.append(" y");
			sb.append("=\"");
			sb.append(getY());
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
} //PositionImpl
