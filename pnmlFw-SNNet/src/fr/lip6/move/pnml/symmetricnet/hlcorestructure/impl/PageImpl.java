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
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.util.HlcorestructureValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.PageImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.PageImpl#getContainerPetriNet <em>Container Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.PageImpl#getNodegraphics <em>Nodegraphics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.PageImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends PnObjectImpl implements Page {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<PnObject> objects;

	/**
	 * The cached value of the '{@link #getNodegraphics() <em>Nodegraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodegraphics()
	 * @generated
	 * @ordered
	 */
	protected NodeGraphics nodegraphics;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PnObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentWithInverseEList<PnObject>(PnObject.class, this,
					HlcorestructurePackage.PAGE__OBJECTS, HlcorestructurePackage.PN_OBJECT__CONTAINER_PAGE);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getContainerPetriNet() {
		if (eContainerFeatureID() != HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET)
			return null;
		return (PetriNet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPetriNet(PetriNet newContainerPetriNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPetriNet,
				HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerPetriNet(PetriNet newContainerPetriNet) {
		if (newContainerPetriNet != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET && newContainerPetriNet != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPetriNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPetriNet != null)
				msgs = ((InternalEObject) newContainerPetriNet).eInverseAdd(this,
						HlcorestructurePackage.PETRI_NET__PAGES, PetriNet.class, msgs);
			msgs = basicSetContainerPetriNet(newContainerPetriNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET,
					newContainerPetriNet, newContainerPetriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGraphics getNodegraphics() {
		return nodegraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodegraphics(NodeGraphics newNodegraphics, NotificationChain msgs) {
		NodeGraphics oldNodegraphics = nodegraphics;
		nodegraphics = newNodegraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.PAGE__NODEGRAPHICS, oldNodegraphics, newNodegraphics);
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
	public void setNodegraphics(NodeGraphics newNodegraphics) {
		if (newNodegraphics != nodegraphics) {
			NotificationChain msgs = null;
			if (nodegraphics != null)
				msgs = ((InternalEObject) nodegraphics).eInverseRemove(this,
						HlcorestructurePackage.NODE_GRAPHICS__CONTAINER_PAGE, NodeGraphics.class, msgs);
			if (newNodegraphics != null)
				msgs = ((InternalEObject) newNodegraphics).eInverseAdd(this,
						HlcorestructurePackage.NODE_GRAPHICS__CONTAINER_PAGE, NodeGraphics.class, msgs);
			msgs = basicSetNodegraphics(newNodegraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.PAGE__NODEGRAPHICS,
					newNodegraphics, newNodegraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentWithInverseEList<Declaration>(Declaration.class, this,
					HlcorestructurePackage.PAGE__DECLARATION,
					HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.PAGE__OBJECTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getObjects()).basicAdd(otherEnd, msgs);
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPetriNet((PetriNet) otherEnd, msgs);
		case HlcorestructurePackage.PAGE__NODEGRAPHICS:
			if (nodegraphics != null)
				msgs = ((InternalEObject) nodegraphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- HlcorestructurePackage.PAGE__NODEGRAPHICS, null, msgs);
			return basicSetNodegraphics((NodeGraphics) otherEnd, msgs);
		case HlcorestructurePackage.PAGE__DECLARATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDeclaration()).basicAdd(otherEnd, msgs);
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
		case HlcorestructurePackage.PAGE__OBJECTS:
			return ((InternalEList<?>) getObjects()).basicRemove(otherEnd, msgs);
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			return basicSetContainerPetriNet(null, msgs);
		case HlcorestructurePackage.PAGE__NODEGRAPHICS:
			return basicSetNodegraphics(null, msgs);
		case HlcorestructurePackage.PAGE__DECLARATION:
			return ((InternalEList<?>) getDeclaration()).basicRemove(otherEnd, msgs);
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
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PETRI_NET__PAGES, PetriNet.class,
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
		case HlcorestructurePackage.PAGE__OBJECTS:
			return getObjects();
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			return getContainerPetriNet();
		case HlcorestructurePackage.PAGE__NODEGRAPHICS:
			return getNodegraphics();
		case HlcorestructurePackage.PAGE__DECLARATION:
			return getDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HlcorestructurePackage.PAGE__OBJECTS:
			getObjects().clear();
			getObjects().addAll((Collection<? extends PnObject>) newValue);
			return;
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			setContainerPetriNet((PetriNet) newValue);
			return;
		case HlcorestructurePackage.PAGE__NODEGRAPHICS:
			setNodegraphics((NodeGraphics) newValue);
			return;
		case HlcorestructurePackage.PAGE__DECLARATION:
			getDeclaration().clear();
			getDeclaration().addAll((Collection<? extends Declaration>) newValue);
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
		case HlcorestructurePackage.PAGE__OBJECTS:
			getObjects().clear();
			return;
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			setContainerPetriNet((PetriNet) null);
			return;
		case HlcorestructurePackage.PAGE__NODEGRAPHICS:
			setNodegraphics((NodeGraphics) null);
			return;
		case HlcorestructurePackage.PAGE__DECLARATION:
			getDeclaration().clear();
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
		case HlcorestructurePackage.PAGE__OBJECTS:
			return objects != null && !objects.isEmpty();
		case HlcorestructurePackage.PAGE__CONTAINER_PETRI_NET:
			return getContainerPetriNet() != null;
		case HlcorestructurePackage.PAGE__NODEGRAPHICS:
			return nodegraphics != null;
		case HlcorestructurePackage.PAGE__DECLARATION:
			return declaration != null && !declaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the string containing the pnml output
	 */
	public String toPNML() {
		//id 1
		//idref 0
		//attributes 0
		//sons 5

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
		sb.append("<page");
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

			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = (ToolInfo) iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		if (getObjects() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject> items = getObjects();
			for (Iterator<PnObject> iterator = items.iterator(); iterator.hasNext();) {
				PnObject item = (PnObject) iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		if (getNodegraphics() != null) {

			String top = getNodegraphics().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getDeclaration() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration> items = getDeclaration();
			for (Iterator<Declaration> iterator = items.iterator(); iterator.hasNext();) {
				Declaration item = (Declaration) iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</page>");
			sb.append(retline);
		} else {
			sb.delete(sb.lastIndexOf(">"), sb.length());
			sb.append("/>");
		}

		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//1
		//0
		//0
		//5
		@SuppressWarnings("unused")
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;

		//processing id

		if (locRoot.getAttributeValue(new QName("id")) != null) {
			this.setId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))));
			ModelRepository
					.getInstance()
					.getCurrentIdRepository()
					.checkId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))).toString(), (Object) this);
		}

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("name")) {
				Name item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createName();
				item.fromPNML(type, idr);

				item.setContainerNamePnObject(this);

				continue;
			}//end if

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerPnObject(this);

				continue;
			}//end if

			if (type.getLocalName().equals("page")) {
				Page item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createPage();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("arc")) {
				Arc item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createArc();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("place")) {
				Place item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createPlace();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("referenceTransition")) {
				RefTransition item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createRefTransition();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("transition")) {
				Transition item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createTransition();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("referencePlace")) {
				RefPlace item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createRefPlace();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("graphics")) {
				NodeGraphics item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createNodeGraphics();
				item.fromPNML(type, idr);

				item.setContainerPage(this);

				continue;
			}//end if

			if (type.getLocalName().equals("declaration")) {
				Declaration item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createDeclaration();
				item.fromPNML(type, idr);

				item.setContainerDeclarationPage(this);

				continue;
			}//end if

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
	public void toPNML(FileChannel fc) {
		//id 1
		//idref 0
		//attributes 0
		//sons 5

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
		sb.append("<page");
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
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = (ToolInfo) iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		if (getObjects() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject> items = getObjects();
			for (Iterator<PnObject> iterator = items.iterator(); iterator.hasNext();) {
				PnObject item = (PnObject) iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		if (getNodegraphics() != null) {

			String top = getNodegraphics().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getDeclaration() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration> items = getDeclaration();
			for (Iterator<Declaration> iterator = items.iterator(); iterator.hasNext();) {
				Declaration item = (Declaration) iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</page>");
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
	public boolean validateOCL(DiagnosticChain diagnostics) {

		HlcorestructureValidator val = new HlcorestructureValidator();
		boolean retour = true;

		if (getName() != null) {
			retour &= getName().validateOCL(diagnostics);
		}

		if (getToolspecifics() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = (ToolInfo) iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getObjects() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject> items = getObjects();
			for (Iterator<PnObject> iterator = items.iterator(); iterator.hasNext();) {
				PnObject item = (PnObject) iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getNodegraphics() != null) {
			retour &= getNodegraphics().validateOCL(diagnostics);
		}

		if (getDeclaration() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration> items = getDeclaration();
			for (Iterator<Declaration> iterator = items.iterator(); iterator.hasNext();) {
				Declaration item = (Declaration) iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //PageImpl
