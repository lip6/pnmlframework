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
package fr.lip6.move.pnml.hlpn.hlcorestructure.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
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
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Place;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.hlcorestructure.util.HlcorestructureValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl#getHlinitialMarking <em>Hlinitial Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends PlaceNodeImpl implements Place {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getHlinitialMarking() <em>Hlinitial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHlinitialMarking()
	 * @generated
	 * @ordered
	 */
	protected HLMarking hlinitialMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.PLACE__TYPE, oldType, newType);
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
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, HlcorestructurePackage.TYPE__CONTAINER_PLACE,
						Type.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, HlcorestructurePackage.TYPE__CONTAINER_PLACE,
						Type.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.PLACE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLMarking getHlinitialMarking() {
		return hlinitialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHlinitialMarking(HLMarking newHlinitialMarking, NotificationChain msgs) {
		HLMarking oldHlinitialMarking = hlinitialMarking;
		hlinitialMarking = newHlinitialMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.PLACE__HLINITIAL_MARKING, oldHlinitialMarking, newHlinitialMarking);
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
	public void setHlinitialMarking(HLMarking newHlinitialMarking) {
		if (newHlinitialMarking != hlinitialMarking) {
			NotificationChain msgs = null;
			if (hlinitialMarking != null)
				msgs = ((InternalEObject) hlinitialMarking).eInverseRemove(this,
						HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE, HLMarking.class, msgs);
			if (newHlinitialMarking != null)
				msgs = ((InternalEObject) newHlinitialMarking).eInverseAdd(this,
						HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE, HLMarking.class, msgs);
			msgs = basicSetHlinitialMarking(newHlinitialMarking, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.PLACE__HLINITIAL_MARKING,
					newHlinitialMarking, newHlinitialMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.PLACE__TYPE:
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- HlcorestructurePackage.PLACE__TYPE, null, msgs);
			return basicSetType((Type) otherEnd, msgs);
		case HlcorestructurePackage.PLACE__HLINITIAL_MARKING:
			if (hlinitialMarking != null)
				msgs = ((InternalEObject) hlinitialMarking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- HlcorestructurePackage.PLACE__HLINITIAL_MARKING, null, msgs);
			return basicSetHlinitialMarking((HLMarking) otherEnd, msgs);
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
		case HlcorestructurePackage.PLACE__TYPE:
			return basicSetType(null, msgs);
		case HlcorestructurePackage.PLACE__HLINITIAL_MARKING:
			return basicSetHlinitialMarking(null, msgs);
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
		case HlcorestructurePackage.PLACE__TYPE:
			return getType();
		case HlcorestructurePackage.PLACE__HLINITIAL_MARKING:
			return getHlinitialMarking();
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
		case HlcorestructurePackage.PLACE__TYPE:
			setType((Type) newValue);
			return;
		case HlcorestructurePackage.PLACE__HLINITIAL_MARKING:
			setHlinitialMarking((HLMarking) newValue);
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
		case HlcorestructurePackage.PLACE__TYPE:
			setType((Type) null);
			return;
		case HlcorestructurePackage.PLACE__HLINITIAL_MARKING:
			setHlinitialMarking((HLMarking) null);
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
		case HlcorestructurePackage.PLACE__TYPE:
			return type != null;
		case HlcorestructurePackage.PLACE__HLINITIAL_MARKING:
			return hlinitialMarking != null;
		}
		return super.eIsSet(featureID);
	}

	//TODO this element (InArcs) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (OutArcs) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (referencingPlaces) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
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
		sb.append("<place");
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

			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

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

		if (getType() != null) {

			String top = getType().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getHlinitialMarking() != null) {

			String top = getHlinitialMarking().toPNML();
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
			sb.append("</place>");
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
		//0
		//5
		@SuppressWarnings("unused")
		HlcorestructureFactory fact = HlcorestructureFactory.eINSTANCE;

		//processing id

		if (locRoot.getAttributeValue(new QName("id")) != null) {
			this.setId(locRoot.getAttributeValue(new QName("id")));
			ModelRepository.getInstance().getCurrentIdRepository()
					.checkId(locRoot.getAttributeValue(new QName("id")).toString(), this);
		}

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("name")) {
				Name item;
				item = HlcorestructureFactory.eINSTANCE.createName();
				item.fromPNML(type, idr);

				item.setContainerNamePnObject(this);

				continue;
			}//end if

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = HlcorestructureFactory.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerPnObject(this);

				continue;
			}//end if

			if (type.getLocalName().equals("graphics")) {
				NodeGraphics item;
				item = HlcorestructureFactory.eINSTANCE.createNodeGraphics();
				item.fromPNML(type, idr);

				item.setContainerNode(this);

				continue;
			}//end if

			if (type.getLocalName().equals("type")) {
				Type item;
				item = HlcorestructureFactory.eINSTANCE.createType();
				item.fromPNML(type, idr);

				item.setContainerPlace(this);

				continue;
			}//end if

			if (type.getLocalName().equals("hlinitialMarking")) {
				HLMarking item;
				item = HlcorestructureFactory.eINSTANCE.createHLMarking();
				item.fromPNML(type, idr);

				item.setContainerPlace(this);

				continue;
			}//end if

		}

	}

	//TODO this element (InArcs) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (OutArcs) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (referencingPlaces) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 1
		//idref 0
		//attributes 0
		//sons 5

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
		sb.append("<place");
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
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();

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

		if (getType() != null) {

			String top = getType().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		if (getHlinitialMarking() != null) {

			String top = getHlinitialMarking().toPNML();
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
		sb.append("</place>");
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

		if (getName() != null) {
			retour &= getName().validateOCL(diagnostics);
		}

		if (getToolspecifics() != null) {
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getNodegraphics() != null) {
			retour &= getNodegraphics().validateOCL(diagnostics);
		}

		if (getType() != null) {
			retour &= getType().validateOCL(diagnostics);
		}

		if (getHlinitialMarking() != null) {
			retour &= getHlinitialMarking().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //PlaceImpl
