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
package fr.lip6.move.pnml.pthlpng.hlcorestructure.impl;

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
import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Place;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.util.HlcorestructureValidator;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.TermsPackage;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HL Marking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HLMarkingImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HLMarkingImpl#getContainerPlace <em>Container Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLMarkingImpl extends HLCoreAnnotationImpl implements HLMarking {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Term structure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLMarkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.HL_MARKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(Term newStructure, NotificationChain msgs) {
		Term oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.HL_MARKING__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(Term newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this, TermsPackage.TERM__CONTAINER_HL_MARKING,
						Term.class, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this, TermsPackage.TERM__CONTAINER_HL_MARKING,
						Term.class, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.HL_MARKING__STRUCTURE,
					newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place getContainerPlace() {
		if (eContainerFeatureID() != HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE)
			return null;
		return (Place) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPlace(Place newContainerPlace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPlace,
				HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPlace(Place newContainerPlace) {
		if (newContainerPlace != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE && newContainerPlace != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPlace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPlace != null)
				msgs = ((InternalEObject) newContainerPlace).eInverseAdd(this,
						HlcorestructurePackage.PLACE__HLINITIAL_MARKING, Place.class, msgs);
			msgs = basicSetContainerPlace(newContainerPlace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE,
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
		case HlcorestructurePackage.HL_MARKING__STRUCTURE:
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- HlcorestructurePackage.HL_MARKING__STRUCTURE, null, msgs);
			return basicSetStructure((Term) otherEnd, msgs);
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
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
		case HlcorestructurePackage.HL_MARKING__STRUCTURE:
			return basicSetStructure(null, msgs);
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
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
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PLACE__HLINITIAL_MARKING,
					Place.class, msgs);
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
		case HlcorestructurePackage.HL_MARKING__STRUCTURE:
			return getStructure();
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
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
		case HlcorestructurePackage.HL_MARKING__STRUCTURE:
			setStructure((Term) newValue);
			return;
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
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
		case HlcorestructurePackage.HL_MARKING__STRUCTURE:
			setStructure((Term) null);
			return;
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
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
		case HlcorestructurePackage.HL_MARKING__STRUCTURE:
			return structure != null;
		case HlcorestructurePackage.HL_MARKING__CONTAINER_PLACE:
			return getContainerPlace() != null;
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
		sb.append("<hlinitialMarking");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getToolspecifics() != null) {

			java.util.List<fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo> items = getToolspecifics();
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
			sb.append("</hlinitialMarking>");
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

			if (type.getLocalName().equals("structure")) {

				fr.lip6.move.pnml.pthlpng.terms.Term item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("equality")) {
						item = new BooleansFactoryImpl().createEquality();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("inequality")) {
						item = new BooleansFactoryImpl().createInequality();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("booleanconstantt")) {
						item = new BooleansFactoryImpl().createBooleanConstant();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("or")) {
						item = new BooleansFactoryImpl().createOr();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("and")) {
						item = new BooleansFactoryImpl().createAnd();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("imply")) {
						item = new BooleansFactoryImpl().createImply();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("not")) {
						item = new BooleansFactoryImpl().createNot();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("dotconstant")) {
						item = new DotsFactoryImpl().createDotConstant();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinality")) {
						item = new MultisetsFactoryImpl().createCardinality();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("contains")) {
						item = new MultisetsFactoryImpl().createContains();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinalityof")) {
						item = new MultisetsFactoryImpl().createCardinalityOf();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("add")) {
						item = new MultisetsFactoryImpl().createAdd();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("all")) {
						item = new MultisetsFactoryImpl().createAll();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("empty")) {
						item = new MultisetsFactoryImpl().createEmpty();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("numberof")) {
						item = new MultisetsFactoryImpl().createNumberOf();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("subtract")) {
						item = new MultisetsFactoryImpl().createSubtract();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("scalarproduct")) {
						item = new MultisetsFactoryImpl().createScalarProduct();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("gtp")) {
						item = new PartitionsFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("partitionelementof")) {
						item = new PartitionsFactoryImpl().createPartitionElementOf();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("ltp")) {
						item = new PartitionsFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("variable")) {
						item = new TermsFactoryImpl().createVariable();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("tuple")) {
						item = new TermsFactoryImpl().createTuple();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

						continue;
					}

					if (subType.getLocalName().equals("useroperator")) {
						item = new TermsFactoryImpl().createUserOperator();
						item.fromPNML(subType, idr);

						item.setContainerHLMarking(this);

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
		sb.append("<hlinitialMarking");
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
			java.util.List<fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo> items = getToolspecifics();
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
		sb.append("</hlinitialMarking>");
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
			java.util.List<fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo> items = getToolspecifics();
			for (Iterator<ToolInfo> iterator = items.iterator(); iterator.hasNext();) {
				ToolInfo item = iterator.next();
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
} //HLMarkingImpl
