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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.ToolInfo;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl#getToolspecifics <em>Toolspecifics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.PetriNetImpl#getContainerPetriNetDoc <em>Container Petri Net Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends MinimalEObjectImpl implements PetriNet {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PNType TYPE_EDEFAULT = PNType.PTNET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PNType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getToolspecifics() <em>Toolspecifics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolspecifics()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolInfo> toolspecifics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PETRI_NET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PNType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PNType newType) {
		PNType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PETRI_NET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, PtnetPackage.PETRI_NET__PAGES,
					PtnetPackage.PAGE__CONTAINER_PETRI_NET);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.PETRI_NET__NAME, oldName, newName);
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
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this, PtnetPackage.NAME__CONTAINER_NAME_PETRI_NET,
						Name.class, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this, PtnetPackage.NAME__CONTAINER_NAME_PETRI_NET,
						Name.class, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PETRI_NET__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ToolInfo> getToolspecifics() {
		if (toolspecifics == null) {
			toolspecifics = new EObjectContainmentWithInverseEList<ToolInfo>(ToolInfo.class, this,
					PtnetPackage.PETRI_NET__TOOLSPECIFICS, PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET);
		}
		return toolspecifics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNetDoc getContainerPetriNetDoc() {
		if (eContainerFeatureID() != PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC)
			return null;
		return (PetriNetDoc) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPetriNetDoc(PetriNetDoc newContainerPetriNetDoc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPetriNetDoc,
				PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPetriNetDoc(PetriNetDoc newContainerPetriNetDoc) {
		if (newContainerPetriNetDoc != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC && newContainerPetriNetDoc != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPetriNetDoc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPetriNetDoc != null)
				msgs = ((InternalEObject) newContainerPetriNetDoc).eInverseAdd(this, PtnetPackage.PETRI_NET_DOC__NETS,
						PetriNetDoc.class, msgs);
			msgs = basicSetContainerPetriNetDoc(newContainerPetriNetDoc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC,
					newContainerPetriNetDoc, newContainerPetriNetDoc));
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
		case PtnetPackage.PETRI_NET__PAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPages()).basicAdd(otherEnd, msgs);
		case PtnetPackage.PETRI_NET__NAME:
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.PETRI_NET__NAME, null, msgs);
			return basicSetName((Name) otherEnd, msgs);
		case PtnetPackage.PETRI_NET__TOOLSPECIFICS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getToolspecifics()).basicAdd(otherEnd, msgs);
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPetriNetDoc((PetriNetDoc) otherEnd, msgs);
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
		case PtnetPackage.PETRI_NET__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		case PtnetPackage.PETRI_NET__NAME:
			return basicSetName(null, msgs);
		case PtnetPackage.PETRI_NET__TOOLSPECIFICS:
			return ((InternalEList<?>) getToolspecifics()).basicRemove(otherEnd, msgs);
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			return basicSetContainerPetriNetDoc(null, msgs);
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
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.PETRI_NET_DOC__NETS, PetriNetDoc.class, msgs);
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
		case PtnetPackage.PETRI_NET__ID:
			return getId();
		case PtnetPackage.PETRI_NET__TYPE:
			return getType();
		case PtnetPackage.PETRI_NET__PAGES:
			return getPages();
		case PtnetPackage.PETRI_NET__NAME:
			return getName();
		case PtnetPackage.PETRI_NET__TOOLSPECIFICS:
			return getToolspecifics();
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			return getContainerPetriNetDoc();
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
		case PtnetPackage.PETRI_NET__ID:
			setId((String) newValue);
			return;
		case PtnetPackage.PETRI_NET__TYPE:
			setType((PNType) newValue);
			return;
		case PtnetPackage.PETRI_NET__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends Page>) newValue);
			return;
		case PtnetPackage.PETRI_NET__NAME:
			setName((Name) newValue);
			return;
		case PtnetPackage.PETRI_NET__TOOLSPECIFICS:
			getToolspecifics().clear();
			getToolspecifics().addAll((Collection<? extends ToolInfo>) newValue);
			return;
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			setContainerPetriNetDoc((PetriNetDoc) newValue);
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
		case PtnetPackage.PETRI_NET__ID:
			setId(ID_EDEFAULT);
			return;
		case PtnetPackage.PETRI_NET__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case PtnetPackage.PETRI_NET__PAGES:
			getPages().clear();
			return;
		case PtnetPackage.PETRI_NET__NAME:
			setName((Name) null);
			return;
		case PtnetPackage.PETRI_NET__TOOLSPECIFICS:
			getToolspecifics().clear();
			return;
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			setContainerPetriNetDoc((PetriNetDoc) null);
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
		case PtnetPackage.PETRI_NET__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case PtnetPackage.PETRI_NET__TYPE:
			return type != TYPE_EDEFAULT;
		case PtnetPackage.PETRI_NET__PAGES:
			return pages != null && !pages.isEmpty();
		case PtnetPackage.PETRI_NET__NAME:
			return name != null;
		case PtnetPackage.PETRI_NET__TOOLSPECIFICS:
			return toolspecifics != null && !toolspecifics.isEmpty();
		case PtnetPackage.PETRI_NET__CONTAINER_PETRI_NET_DOC:
			return getContainerPetriNetDoc() != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 1
		//idref 0
		//attributes 1
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
		sb.append("<net");
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

		if (getType() != null) {
			sb.append(" type");
			sb.append("=\"");
			sb.append(getType());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getPages() != null) {

			java.util.List<fr.lip6.move.pnml.ptnet.Page> items = getPages();
			for (Iterator<Page> iterator = items.iterator(); iterator.hasNext();) {
				Page item = iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		if (getName() != null) {

			String top = getName().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getToolspecifics() != null) {

			java.util.List<fr.lip6.move.pnml.ptnet.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

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
			sb.append("</net>");
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
		//0
		//1
		//3
		@SuppressWarnings("unused")
		PtnetFactory fact = PtnetFactory.eINSTANCE;

		//processing id

		if (locRoot.getAttributeValue(new QName("id")) != null) {
			this.setId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))));
			ModelRepository.getInstance().getCurrentIdRepository()
					.checkId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))).toString(), this);
		}

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("type")) != null) {
			this.setType(PNType.get(locRoot.getAttributeValue(new QName("type"))));
		}

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("page")) {
				Page item;
				item = PtnetFactory.eINSTANCE.createPage();
				item.fromPNML(type, idr);

				item.setContainerPetriNet(this);

				continue;
			}//end if

			if (type.getLocalName().equals("name")) {
				Name item;
				item = PtnetFactory.eINSTANCE.createName();
				item.fromPNML(type, idr);

				item.setContainerNamePetriNet(this);

				continue;
			}//end if

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = PtnetFactory.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerPetriNet(this);

				continue;
			}//end if

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 1
		//idref 0
		//attributes 1
		//sons 3

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
		sb.append("<net");
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

		if (getType() != null) {
			sb.append(" type");
			sb.append("=\"");
			sb.append(getType());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getPages() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.ptnet.Page> items = getPages();
			for (Iterator<Page> iterator = items.iterator(); iterator.hasNext();) {
				Page item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

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
			java.util.List<fr.lip6.move.pnml.ptnet.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</net>");
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

		if (getPages() != null) {
			java.util.List<fr.lip6.move.pnml.ptnet.Page> items = getPages();
			for (Iterator<Page> iterator = items.iterator(); iterator.hasNext();) {
				Page item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getName() != null) {
			retour &= getName().validateOCL(diagnostics);
		}

		if (getToolspecifics() != null) {
			java.util.List<fr.lip6.move.pnml.ptnet.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //PetriNetImpl
