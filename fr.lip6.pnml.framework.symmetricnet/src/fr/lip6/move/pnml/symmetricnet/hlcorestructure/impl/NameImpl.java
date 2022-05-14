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
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl;

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
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.util.HlcorestructureValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.NameImpl#getText <em>Text</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.NameImpl#getContainerNamePetriNet <em>Container Name Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.NameImpl#getContainerNamePnObject <em>Container Name Pn Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameImpl extends AnnotationImpl implements Name {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.NAME__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getContainerNamePetriNet() {
		if (eContainerFeatureID() != HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET)
			return null;
		return (PetriNet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNamePetriNet(PetriNet newContainerNamePetriNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNamePetriNet,
				HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNamePetriNet(PetriNet newContainerNamePetriNet) {
		if (newContainerNamePetriNet != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET && newContainerNamePetriNet != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNamePetriNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNamePetriNet != null)
				msgs = ((InternalEObject) newContainerNamePetriNet).eInverseAdd(this,
						HlcorestructurePackage.PETRI_NET__NAME, PetriNet.class, msgs);
			msgs = basicSetContainerNamePetriNet(newContainerNamePetriNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET, newContainerNamePetriNet,
					newContainerNamePetriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PnObject getContainerNamePnObject() {
		if (eContainerFeatureID() != HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT)
			return null;
		return (PnObject) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNamePnObject(PnObject newContainerNamePnObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerNamePnObject,
				HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNamePnObject(PnObject newContainerNamePnObject) {
		if (newContainerNamePnObject != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT && newContainerNamePnObject != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNamePnObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNamePnObject != null)
				msgs = ((InternalEObject) newContainerNamePnObject).eInverseAdd(this,
						HlcorestructurePackage.PN_OBJECT__NAME, PnObject.class, msgs);
			msgs = basicSetContainerNamePnObject(newContainerNamePnObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT, newContainerNamePnObject,
					newContainerNamePnObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNamePetriNet((PetriNet) otherEnd, msgs);
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerNamePnObject((PnObject) otherEnd, msgs);
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
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			return basicSetContainerNamePetriNet(null, msgs);
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			return basicSetContainerNamePnObject(null, msgs);
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
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PETRI_NET__NAME, PetriNet.class,
					msgs);
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PN_OBJECT__NAME, PnObject.class,
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
		case HlcorestructurePackage.NAME__TEXT:
			return getText();
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			return getContainerNamePetriNet();
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			return getContainerNamePnObject();
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
		case HlcorestructurePackage.NAME__TEXT:
			setText((String) newValue);
			return;
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			setContainerNamePetriNet((PetriNet) newValue);
			return;
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			setContainerNamePnObject((PnObject) newValue);
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
		case HlcorestructurePackage.NAME__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			setContainerNamePetriNet((PetriNet) null);
			return;
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			setContainerNamePnObject((PnObject) null);
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
		case HlcorestructurePackage.NAME__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PETRI_NET:
			return getContainerNamePetriNet() != null;
		case HlcorestructurePackage.NAME__CONTAINER_NAME_PN_OBJECT:
			return getContainerNamePnObject() != null;
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
		result.append(" (text: ");
		result.append(text);
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
		sb.append("<name");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getToolspecifics() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		if (getAnnotationgraphics() != null) {

			String top = getAnnotationgraphics().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getText() != null) {

			sb.append(headline);
			sb.append("<");
			sb.append("text");
			sb.append(">");
			sb.append(getText().toString());
			sb.append("</");
			sb.append("text");
			sb.append(">");
			sb.append(retline);

			haveSons = true;

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</name>");
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
		//3
		@SuppressWarnings("unused")
		HlcorestructureFactory fact = HlcorestructureFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = HlcorestructureFactory.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerLabel(this);

				continue;
			}//end if

			if (type.getLocalName().equals("graphics")) {
				AnnotationGraphics item;
				item = HlcorestructureFactory.eINSTANCE.createAnnotationGraphics();
				item.fromPNML(type, idr);

				item.setContainerAnnotation(this);

				continue;
			}//end if

			if (type.getLocalName().equals("text")) {
				this.setText(new java.lang.String(type.getText()));
			}

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
		sb.append("<name");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

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
				ToolInfo item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		if (getAnnotationgraphics() != null) {

			String top = getAnnotationgraphics().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getText() != null) {

			sb.append(headline);
			sb.append("<");
			sb.append("text");
			sb.append(">");
			sb.append(getText().toString());
			sb.append("</");
			sb.append("text");
			sb.append(">");
			sb.append(retline);

			haveSons = true;

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</name>");
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

		HlcorestructureValidator val = new HlcorestructureValidator();
		boolean retour = true;

		if (getToolspecifics() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getAnnotationgraphics() != null) {
			retour &= getAnnotationgraphics().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //NameImpl
