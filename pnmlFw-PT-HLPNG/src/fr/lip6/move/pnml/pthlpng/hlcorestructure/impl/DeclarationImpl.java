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
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructurePackage;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Page;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.util.HlcorestructureValidator;
import fr.lip6.move.pnml.pthlpng.terms.Declarations;
import fr.lip6.move.pnml.pthlpng.terms.TermsPackage;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Declaration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.DeclarationImpl#getStructure
 * <em>Structure</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.DeclarationImpl#getContainerDeclarationPetriNet
 * <em>Container Declaration Petri Net</em>}</li>
 * <li>{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.DeclarationImpl#getContainerDeclarationPage
 * <em>Container Declaration Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends HLCoreAnnotationImpl implements Declaration {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Declarations structure;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlcorestructurePackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Declarations getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStructure(Declarations newStructure, NotificationChain msgs) {
		Declarations oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.DECLARATION__STRUCTURE, oldStructure, newStructure);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStructure(Declarations newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this,
						TermsPackage.DECLARATIONS__CONTAINER_DECLARATION, Declarations.class, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this,
						TermsPackage.DECLARATIONS__CONTAINER_DECLARATION, Declarations.class, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlcorestructurePackage.DECLARATION__STRUCTURE,
					newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PetriNet getContainerDeclarationPetriNet() {
		if (eContainerFeatureID() != HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET)
			return null;
		return (PetriNet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainerDeclarationPetriNet(PetriNet newContainerDeclarationPetriNet,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerDeclarationPetriNet,
				HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setContainerDeclarationPetriNet(PetriNet newContainerDeclarationPetriNet) {
		if (newContainerDeclarationPetriNet != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET
						&& newContainerDeclarationPetriNet != null)) {
			if (EcoreUtil.isAncestor(this, newContainerDeclarationPetriNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerDeclarationPetriNet != null)
				msgs = ((InternalEObject) newContainerDeclarationPetriNet).eInverseAdd(this,
						HlcorestructurePackage.PETRI_NET__DECLARATION, PetriNet.class, msgs);
			msgs = basicSetContainerDeclarationPetriNet(newContainerDeclarationPetriNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET,
					newContainerDeclarationPetriNet, newContainerDeclarationPetriNet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Page getContainerDeclarationPage() {
		if (eContainerFeatureID() != HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE)
			return null;
		return (Page) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainerDeclarationPage(Page newContainerDeclarationPage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerDeclarationPage,
				HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setContainerDeclarationPage(Page newContainerDeclarationPage) {
		if (newContainerDeclarationPage != eInternalContainer()
				|| (eContainerFeatureID() != HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE
						&& newContainerDeclarationPage != null)) {
			if (EcoreUtil.isAncestor(this, newContainerDeclarationPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerDeclarationPage != null)
				msgs = ((InternalEObject) newContainerDeclarationPage).eInverseAdd(this,
						HlcorestructurePackage.PAGE__DECLARATION, Page.class, msgs);
			msgs = basicSetContainerDeclarationPage(newContainerDeclarationPage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE, newContainerDeclarationPage,
					newContainerDeclarationPage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.DECLARATION__STRUCTURE:
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlcorestructurePackage.DECLARATION__STRUCTURE, null, msgs);
			return basicSetStructure((Declarations) otherEnd, msgs);
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerDeclarationPetriNet((PetriNet) otherEnd, msgs);
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerDeclarationPage((Page) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlcorestructurePackage.DECLARATION__STRUCTURE:
			return basicSetStructure(null, msgs);
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			return basicSetContainerDeclarationPetriNet(null, msgs);
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			return basicSetContainerDeclarationPage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PETRI_NET__DECLARATION,
					PetriNet.class, msgs);
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			return eInternalContainer().eInverseRemove(this, HlcorestructurePackage.PAGE__DECLARATION, Page.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HlcorestructurePackage.DECLARATION__STRUCTURE:
			return getStructure();
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			return getContainerDeclarationPetriNet();
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			return getContainerDeclarationPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HlcorestructurePackage.DECLARATION__STRUCTURE:
			setStructure((Declarations) newValue);
			return;
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			setContainerDeclarationPetriNet((PetriNet) newValue);
			return;
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			setContainerDeclarationPage((Page) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HlcorestructurePackage.DECLARATION__STRUCTURE:
			setStructure((Declarations) null);
			return;
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			setContainerDeclarationPetriNet((PetriNet) null);
			return;
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			setContainerDeclarationPage((Page) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HlcorestructurePackage.DECLARATION__STRUCTURE:
			return structure != null;
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PETRI_NET:
			return getContainerDeclarationPetriNet() != null;
		case HlcorestructurePackage.DECLARATION__CONTAINER_DECLARATION_PAGE:
			return getContainerDeclarationPage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		// id 0
		// idref 0
		// attributes 0
		// sons 4

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
		sb.append("<declaration");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		// begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		// sons, follow processing

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
			sb.append("</declaration>");
			sb.append(retline);
		} else {
			sb.delete(sb.lastIndexOf(">"), sb.length());
			sb.append("/>");
		}

		return sb.toString();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException {
		// 0
		// 0
		// 0
		// 4
		@SuppressWarnings("unused")
		HlcorestructureFactory fact = HlcorestructureFactory.eINSTANCE;

		// processing id

		// processing idref

		// processing attributes

		// processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("toolspecific")) {
				ToolInfo item;
				item = HlcorestructureFactory.eINSTANCE.createToolInfo();
				item.fromPNML(type, idr);

				item.setContainerLabel(this);

				continue;
			} // end if

			if (type.getLocalName().equals("graphics")) {
				AnnotationGraphics item;
				item = HlcorestructureFactory.eINSTANCE.createAnnotationGraphics();
				item.fromPNML(type, idr);

				item.setContainerAnnotation(this);

				continue;
			} // end if

			if (type.getLocalName().equals("text")) {
				this.setText(new java.lang.String(type.getText()));
			}

			if (type.getLocalName().equals("structure")) {

				fr.lip6.move.pnml.pthlpng.terms.Declarations item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("declarations")) {
						item = new TermsFactoryImpl().createDeclarations();
						item.fromPNML(subType, idr);

						item.setContainerDeclaration(this);

						continue;
					}

				}
			}

			// tag!=null

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		// id 0
		// idref 0
		// attributes 0
		// sons 4

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
		sb.append("<declaration");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		// begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		// sons, follow processing

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
		sb.append("</declaration>");
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
} // DeclarationImpl
