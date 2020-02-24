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
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Line;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelFactory;
import fr.lip6.move.pnml.pnmlcoremodel.PnmlcoremodelPackage;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.util.PnmlcoremodelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Graphics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.NodeGraphicsImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.NodeGraphicsImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.NodeGraphicsImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.NodeGraphicsImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.NodeGraphicsImpl#getContainerNode <em>Container Node</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pnmlcoremodel.impl.NodeGraphicsImpl#getContainerPage <em>Container Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeGraphicsImpl extends GraphicsImpl implements NodeGraphics {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeGraphicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.NODE_GRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PnmlcoremodelPackage.NODE_GRAPHICS__POSITION, oldPosition, newPosition);
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
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						PnmlcoremodelPackage.POSITION__CONTAINER_PNODE_GRAPHICS, Position.class, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						PnmlcoremodelPackage.POSITION__CONTAINER_PNODE_GRAPHICS, Position.class, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__POSITION,
					newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION, oldDimension, newDimension);
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
	public void setDimension(Dimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject) dimension).eInverseRemove(this,
						PnmlcoremodelPackage.DIMENSION__CONTAINER_DNODE_GRAPHICS, Dimension.class, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject) newDimension).eInverseAdd(this,
						PnmlcoremodelPackage.DIMENSION__CONTAINER_DNODE_GRAPHICS, Dimension.class, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION,
					newDimension, newDimension));
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
					PnmlcoremodelPackage.NODE_GRAPHICS__FILL, oldFill, newFill);
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
				msgs = ((InternalEObject) fill).eInverseRemove(this,
						PnmlcoremodelPackage.FILL__CONTAINER_NODE_GRAPHICS, Fill.class, msgs);
			if (newFill != null)
				msgs = ((InternalEObject) newFill).eInverseAdd(this,
						PnmlcoremodelPackage.FILL__CONTAINER_NODE_GRAPHICS, Fill.class, msgs);
			msgs = basicSetFill(newFill, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__FILL, newFill,
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
					PnmlcoremodelPackage.NODE_GRAPHICS__LINE, oldLine, newLine);
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
				msgs = ((InternalEObject) line).eInverseRemove(this,
						PnmlcoremodelPackage.LINE__CONTAINER_NODE_GRAPHICS, Line.class, msgs);
			if (newLine != null)
				msgs = ((InternalEObject) newLine).eInverseAdd(this,
						PnmlcoremodelPackage.LINE__CONTAINER_NODE_GRAPHICS, Line.class, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__LINE, newLine,
					newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getContainerNode() {
		if (eContainerFeatureID() != PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNode(Node newContainerNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNode,
				PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNode(Node newContainerNode) {
		if (newContainerNode != eInternalContainer()
				|| (eContainerFeatureID() != PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE && newContainerNode != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNode != null)
				msgs = ((InternalEObject) newContainerNode).eInverseAdd(this, PnmlcoremodelPackage.NODE__NODEGRAPHICS,
						Node.class, msgs);
			msgs = basicSetContainerNode(newContainerNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE,
					newContainerNode, newContainerNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getContainerPage() {
		if (eContainerFeatureID() != PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE)
			return null;
		return (Page) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPage(Page newContainerPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPage,
				PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPage(Page newContainerPage) {
		if (newContainerPage != eInternalContainer()
				|| (eContainerFeatureID() != PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE && newContainerPage != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPage != null)
				msgs = ((InternalEObject) newContainerPage).eInverseAdd(this, PnmlcoremodelPackage.PAGE__NODEGRAPHICS,
						Page.class, msgs);
			msgs = basicSetContainerPage(newContainerPage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE,
					newContainerPage, newContainerPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PnmlcoremodelPackage.NODE_GRAPHICS__POSITION, null, msgs);
			return basicSetPosition((Position) otherEnd, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
			if (dimension != null)
				msgs = ((InternalEObject) dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION, null, msgs);
			return basicSetDimension((Dimension) otherEnd, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
			if (fill != null)
				msgs = ((InternalEObject) fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PnmlcoremodelPackage.NODE_GRAPHICS__FILL, null, msgs);
			return basicSetFill((Fill) otherEnd, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
			if (line != null)
				msgs = ((InternalEObject) line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PnmlcoremodelPackage.NODE_GRAPHICS__LINE, null, msgs);
			return basicSetLine((Line) otherEnd, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNode((Node) otherEnd, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPage((Page) otherEnd, msgs);
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
		case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
			return basicSetPosition(null, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
			return basicSetDimension(null, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
			return basicSetFill(null, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
			return basicSetLine(null, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			return basicSetContainerNode(null, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			return basicSetContainerPage(null, msgs);
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
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			return eInternalContainer().eInverseRemove(this, PnmlcoremodelPackage.NODE__NODEGRAPHICS, Node.class, msgs);
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			return eInternalContainer().eInverseRemove(this, PnmlcoremodelPackage.PAGE__NODEGRAPHICS, Page.class, msgs);
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
		case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
			return getPosition();
		case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
			return getDimension();
		case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
			return getFill();
		case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
			return getLine();
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			return getContainerNode();
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			return getContainerPage();
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
		case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
			setPosition((Position) newValue);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
			setDimension((Dimension) newValue);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
			setFill((Fill) newValue);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
			setLine((Line) newValue);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			setContainerNode((Node) newValue);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			setContainerPage((Page) newValue);
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
		case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
			setPosition((Position) null);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
			setDimension((Dimension) null);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
			setFill((Fill) null);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
			setLine((Line) null);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			setContainerNode((Node) null);
			return;
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			setContainerPage((Page) null);
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
		case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
			return position != null;
		case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
			return dimension != null;
		case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
			return fill != null;
		case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
			return line != null;
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_NODE:
			return getContainerNode() != null;
		case PnmlcoremodelPackage.NODE_GRAPHICS__CONTAINER_PAGE:
			return getContainerPage() != null;
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

		if (getPosition() != null) {

			String top = getPosition().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getDimension() != null) {

			String top = getDimension().toPNML();
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
		PnmlcoremodelFactory fact = PnmlcoremodelFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("position")) {
				Position item;
				item = PnmlcoremodelFactory.eINSTANCE.createPosition();
				item.fromPNML(type, idr);

				item.setContainerPNodeGraphics(this);

				continue;
			}//end if

			if (type.getLocalName().equals("dimension")) {
				Dimension item;
				item = PnmlcoremodelFactory.eINSTANCE.createDimension();
				item.fromPNML(type, idr);

				item.setContainerDNodeGraphics(this);

				continue;
			}//end if

			if (type.getLocalName().equals("fill")) {
				Fill item;
				item = PnmlcoremodelFactory.eINSTANCE.createFill();
				item.fromPNML(type, idr);

				item.setContainerNodeGraphics(this);

				continue;
			}//end if

			if (type.getLocalName().equals("line")) {
				Line item;
				item = PnmlcoremodelFactory.eINSTANCE.createLine();
				item.fromPNML(type, idr);

				item.setContainerNodeGraphics(this);

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
		sb.append("<graphics");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getPosition() != null) {

			String top = getPosition().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getDimension() != null) {

			String top = getDimension().toPNML();
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

		PnmlcoremodelValidator val = new PnmlcoremodelValidator();
		boolean retour = true;

		if (getPosition() != null) {
			retour &= getPosition().validateOCL(diagnostics);
		}

		if (getDimension() != null) {
			retour &= getDimension().validateOCL(diagnostics);
		}

		if (getFill() != null) {
			retour &= getFill().validateOCL(diagnostics);
		}

		if (getLine() != null) {
			retour &= getLine().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //NodeGraphicsImpl
