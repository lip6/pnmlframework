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
package fr.lip6.move.pnml.hlpn.hlcorestructure.impl;

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
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Place;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.hlcorestructure.util.HlcorestructureValidator;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TypeImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TypeImpl#getContainerPlace <em>Container Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends HLCoreAnnotationImpl implements Type {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Sort structure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(Sort newStructure, NotificationChain msgs) {
		Sort oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.TYPE__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(Sort newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this, TermsPackage.SORT__CONTAINER_TYPE,
						Sort.class, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this, TermsPackage.SORT__CONTAINER_TYPE,
						Sort.class, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.TYPE__STRUCTURE, newStructure,
					newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getContainerPlace() {
		if (eContainerFeatureID() != HlcorestructurePackage.TYPE__CONTAINER_PLACE)
			return null;
		return (Place) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPlace(Place newContainerPlace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPlace, HlcorestructurePackage.TYPE__CONTAINER_PLACE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerPlace(Place newContainerPlace) {
		if (newContainerPlace != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.TYPE__CONTAINER_PLACE && newContainerPlace != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPlace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPlace != null)
				msgs = ((InternalEObject) newContainerPlace).eInverseAdd(this, HlcorestructurePackage.PLACE__TYPE,
						Place.class, msgs);
			msgs = basicSetContainerPlace(newContainerPlace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.TYPE__CONTAINER_PLACE,
					newContainerPlace, newContainerPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.TYPE__STRUCTURE:
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- HlcorestructurePackage.TYPE__STRUCTURE, null, msgs);
			return basicSetStructure((Sort) otherEnd, msgs);
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPlace((Place) otherEnd, msgs);
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
		case HlcorestructurePackage.TYPE__STRUCTURE:
			return basicSetStructure(null, msgs);
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			return basicSetContainerPlace(null, msgs);
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
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PLACE__TYPE, Place.class, msgs);
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
		case HlcorestructurePackage.TYPE__STRUCTURE:
			return getStructure();
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			return getContainerPlace();
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
		case HlcorestructurePackage.TYPE__STRUCTURE:
			setStructure((Sort) newValue);
			return;
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			setContainerPlace((Place) newValue);
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
		case HlcorestructurePackage.TYPE__STRUCTURE:
			setStructure((Sort) null);
			return;
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			setContainerPlace((Place) null);
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
		case HlcorestructurePackage.TYPE__STRUCTURE:
			return structure != null;
		case HlcorestructurePackage.TYPE__CONTAINER_PLACE:
			return getContainerPlace() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the string containing the pnml output
	 */
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
		sb.append("<type");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getToolspecifics() != null) {

			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = (ToolInfo) iterator.next();

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

		if (getStructure() != null) {

			String top = getStructure().toPNML();
			if (!top.equals("")) {

				sb.append(headline);
				sb.append("<");
				sb.append("structure");
				sb.append(">");
				sb.append(top);
				sb.append("</");
				sb.append("structure");
				sb.append(">");
				sb.append(retline);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</type>");
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
		//0
		//0
		//0
		//4
		@SuppressWarnings("unused")
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerLabel(this);

				continue;
			}//end if

			if (type.getLocalName().equals("graphics")) {
				AnnotationGraphics item;
				item = HlcorestructureFactoryImpl.eINSTANCE.createAnnotationGraphics();
				item.fromPNML(type, idr);

				item.setContainerAnnotation(this);

				continue;
			}//end if

			if (type.getLocalName().equals("text")) {
				this.setText(new java.lang.String(type.getText()));
			}

			if (type.getLocalName().equals("structure")) {

				fr.lip6.move.pnml.hlpn.terms.Sort item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("anysort")) {
						item = new ArbitrarydeclarationsFactoryImpl().createAnySort();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("null")) {
						item = new BooleansFactoryImpl().createBool();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("cyclicenumeration")) {
						item = new CyclicEnumerationsFactoryImpl().createCyclicEnumeration();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("dot")) {
						item = new DotsFactoryImpl().createDot();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("finiteenumeration")) {
						item = new FiniteEnumerationsFactoryImpl().createFiniteEnumeration();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("finiteintrange")) {
						item = new FiniteIntRangesFactoryImpl().createFiniteIntRange();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("natural")) {
						item = new IntegersFactoryImpl().createNatural();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("positive")) {
						item = new IntegersFactoryImpl().createPositive();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("integer")) {
						item = new IntegersFactoryImpl().createHLInteger();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("list")) {
						item = new ListsFactoryImpl().createHLPNList();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("string")) {
						item = new StringsFactoryImpl().createHLPNString();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("multisetsort")) {
						item = new TermsFactoryImpl().createMultisetSort();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("productsort")) {
						item = new TermsFactoryImpl().createProductSort();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

					if (subType.getLocalName().equals("usersort")) {
						item = new TermsFactoryImpl().createUserSort();
						item.fromPNML(subType, idr);

						item.setContainerType(this);

						continue;
					}

				}
			}

			//tag!=null

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
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
		sb.append("<type");
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
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = (ToolInfo) iterator.next();

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

		if (getStructure() != null) {

			String top = getStructure().toPNML();
			if (!top.equals("")) {

				sb.append(headline);
				sb.append("<");
				sb.append("structure");
				sb.append(">");
				sb.append(top);
				sb.append("</");
				sb.append("structure");
				sb.append(">");
				sb.append(retline);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</type>");
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

		if (getToolspecifics() != null) {
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = (ToolInfo) iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		if (getAnnotationgraphics() != null) {
			retour &= getAnnotationgraphics().validateOCL(diagnostics);
		}

		if (getStructure() != null) {
			retour &= getStructure().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //TypeImpl
