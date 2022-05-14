/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.ArcGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelFactory;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelPackage;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;
import fr.lip6.move.pnml.pnmlcoremodel.util.PnmlcoremodelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.ArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.ArcImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.ArcImpl#getArcgraphics <em>Arcgraphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends PnObjectImpl implements Arc {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * The cached value of the '{@link #getArcgraphics() <em>Arcgraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcgraphics()
	 * @generated
	 * @ordered
	 */
	protected ArcGraphics arcgraphics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Node) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PnmlcoremodelPackage.ARC__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
		Node oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PnmlcoremodelPackage.ARC__SOURCE, oldSource, newSource);
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
	public void setSource(Node newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PnmlcoremodelPackage.NODE__OUT_ARCS, Node.class,
						msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, PnmlcoremodelPackage.NODE__OUT_ARCS, Node.class,
						msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ARC__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Node) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PnmlcoremodelPackage.ARC__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		Node oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PnmlcoremodelPackage.ARC__TARGET, oldTarget, newTarget);
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
	public void setTarget(Node newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PnmlcoremodelPackage.NODE__IN_ARCS, Node.class,
						msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, PnmlcoremodelPackage.NODE__IN_ARCS, Node.class,
						msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ARC__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcGraphics getArcgraphics() {
		return arcgraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcgraphics(ArcGraphics newArcgraphics, NotificationChain msgs) {
		ArcGraphics oldArcgraphics = arcgraphics;
		arcgraphics = newArcgraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PnmlcoremodelPackage.ARC__ARCGRAPHICS, oldArcgraphics, newArcgraphics);
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
	public void setArcgraphics(ArcGraphics newArcgraphics) {
		if (newArcgraphics != arcgraphics) {
			NotificationChain msgs = null;
			if (arcgraphics != null)
				msgs = ((InternalEObject) arcgraphics).eInverseRemove(this,
						PnmlcoremodelPackage.ARC_GRAPHICS__CONTAINER_ARC, ArcGraphics.class, msgs);
			if (newArcgraphics != null)
				msgs = ((InternalEObject) newArcgraphics).eInverseAdd(this,
						PnmlcoremodelPackage.ARC_GRAPHICS__CONTAINER_ARC, ArcGraphics.class, msgs);
			msgs = basicSetArcgraphics(newArcgraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ARC__ARCGRAPHICS,
					newArcgraphics, newArcgraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PnmlcoremodelPackage.ARC__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PnmlcoremodelPackage.NODE__OUT_ARCS, Node.class,
						msgs);
			return basicSetSource((Node) otherEnd, msgs);
		case PnmlcoremodelPackage.ARC__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PnmlcoremodelPackage.NODE__IN_ARCS, Node.class,
						msgs);
			return basicSetTarget((Node) otherEnd, msgs);
		case PnmlcoremodelPackage.ARC__ARCGRAPHICS:
			if (arcgraphics != null)
				msgs = ((InternalEObject) arcgraphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PnmlcoremodelPackage.ARC__ARCGRAPHICS, null, msgs);
			return basicSetArcgraphics((ArcGraphics) otherEnd, msgs);
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
		case PnmlcoremodelPackage.ARC__SOURCE:
			return basicSetSource(null, msgs);
		case PnmlcoremodelPackage.ARC__TARGET:
			return basicSetTarget(null, msgs);
		case PnmlcoremodelPackage.ARC__ARCGRAPHICS:
			return basicSetArcgraphics(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PnmlcoremodelPackage.ARC__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case PnmlcoremodelPackage.ARC__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case PnmlcoremodelPackage.ARC__ARCGRAPHICS:
			return getArcgraphics();
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
		case PnmlcoremodelPackage.ARC__SOURCE:
			setSource((Node) newValue);
			return;
		case PnmlcoremodelPackage.ARC__TARGET:
			setTarget((Node) newValue);
			return;
		case PnmlcoremodelPackage.ARC__ARCGRAPHICS:
			setArcgraphics((ArcGraphics) newValue);
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
		case PnmlcoremodelPackage.ARC__SOURCE:
			setSource((Node) null);
			return;
		case PnmlcoremodelPackage.ARC__TARGET:
			setTarget((Node) null);
			return;
		case PnmlcoremodelPackage.ARC__ARCGRAPHICS:
			setArcgraphics((ArcGraphics) null);
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
		case PnmlcoremodelPackage.ARC__SOURCE:
			return source != null;
		case PnmlcoremodelPackage.ARC__TARGET:
			return target != null;
		case PnmlcoremodelPackage.ARC__ARCGRAPHICS:
			return arcgraphics != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 1
		//idref 2
		//attributes 0
		//sons 3

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
		sb.append("<arc");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getId() != null) {
			sb.append(" id");
			sb.append("=\"");
			sb.append(getId());
			sb.append("\"");
		}

		if (getSource() != null) {
			sb.append(" source");
			sb.append("=\"");
			sb.append(getSource().getId());
			sb.append("\"");
		}

		if (getTarget() != null) {
			sb.append(" target");
			sb.append("=\"");
			sb.append(getTarget().getId());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getName() != null) {

			String top = getName().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getToolspecifics() != null) {

			java.util.List<fr.lip6.move.pnml.pnmlcoremodel.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		if (getArcgraphics() != null) {

			String top = getArcgraphics().toPNML();
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
			sb.append("</arc>");
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
		//1
		//2
		//0
		//3
		@SuppressWarnings("unused")
		PnmlcoremodelFactory fact = PnmlcoremodelFactory.eINSTANCE;

		//processing id

		if (locRoot.getAttributeValue(new QName("id")) != null) {
			this.setId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))));
			ModelRepository.getInstance().getCurrentIdRepository()
					.checkId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))).toString(), this);
		}

		//processing idref

		List<String> ids = new ArrayList<String>();
		String[] tmp = {};

		if (locRoot.getAttributeValue(new QName("source")) != null) {
			ids.add(locRoot.getAttributeValue(new QName("source")).toString());
		}
		idr.addIdRef(this, ids.toArray(tmp));

		if (locRoot.getAttributeValue(new QName("target")) != null) {
			ids.add(locRoot.getAttributeValue(new QName("target")).toString());
		}
		idr.addIdRef(this, ids.toArray(tmp));

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("name")) {
				Name item;
				item = PnmlcoremodelFactory.eINSTANCE.createName();
				item.fromPNML(type, idr);

				item.setContainerNamePnObject(this);

				continue;
			}//end if

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = PnmlcoremodelFactory.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerPnObject(this);

				continue;
			}//end if

			if (type.getLocalName().equals("graphics")) {
				ArcGraphics item;
				item = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
				item.fromPNML(type, idr);

				item.setContainerArc(this);

				continue;
			}//end if

		}

	}

	public void idRefHang(ArrayList<Object> oList) {

		this.setSource((fr.lip6.move.pnml.pnmlcoremodel.Node) oList.get(0));

		this.setTarget((fr.lip6.move.pnml.pnmlcoremodel.Node) oList.get(1));

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 1
		//idref 2
		//attributes 0
		//sons 3

		final int bufferSizeKB = 8;
		final int bufferSize = bufferSizeKB * 1024;
		final ByteBuffer bytebuf = ByteBuffer.allocateDirect(bufferSize);
		final String charsetEncoding = PNMLEncoding.UTF_8.getName();

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
		sb.append("<arc");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getId() != null) {
			sb.append(" id");
			sb.append("=\"");
			sb.append(getId());
			sb.append("\"");
		}

		if (getSource() != null) {
			sb.append(" source");
			sb.append("=\"");
			sb.append(getSource().getId());
			sb.append("\"");
		}

		if (getTarget() != null) {
			sb.append(" target");
			sb.append("=\"");
			sb.append(getTarget().getId());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getName() != null) {

			String top = getName().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getToolspecifics() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.pnmlcoremodel.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		if (getArcgraphics() != null) {

			String top = getArcgraphics().toPNML();
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
		sb.append("</arc>");
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

		PnmlcoremodelValidator val = new PnmlcoremodelValidator();
		boolean retour = true;

		if (getName() != null) {
			retour &= getName().validateOCL(diagnostics);
		}

		if (getToolspecifics() != null) {
			java.util.List<fr.lip6.move.pnml.pnmlcoremodel.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getArcgraphics() != null) {
			retour &= getArcgraphics().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //ArcImpl
