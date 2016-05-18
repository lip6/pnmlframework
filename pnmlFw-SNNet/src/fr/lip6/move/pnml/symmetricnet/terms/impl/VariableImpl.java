/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.symmetricnet.terms.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
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
import fr.lip6.move.pnml.symmetricnet.terms.TermsFactory;
import fr.lip6.move.pnml.symmetricnet.terms.TermsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.Variable;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.impl.VariableImpl#getVariableDecl <em>Variable Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends TermImpl implements Variable {
	/**
	 * The cached value of the '{@link #getVariableDecl() <em>Variable Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDecl()
	 * @generated
	 * @ordered
	 */
	protected VariableDecl variableDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDecl getVariableDecl() {
		if (variableDecl != null && variableDecl.eIsProxy()) {
			InternalEObject oldVariableDecl = (InternalEObject) variableDecl;
			variableDecl = (VariableDecl) eResolveProxy(oldVariableDecl);
			if (variableDecl != oldVariableDecl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.VARIABLE__VARIABLE_DECL,
							oldVariableDecl, variableDecl));
			}
		}
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl basicGetVariableDecl() {
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableDecl(VariableDecl newVariableDecl) {
		VariableDecl oldVariableDecl = variableDecl;
		variableDecl = newVariableDecl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE__VARIABLE_DECL,
					oldVariableDecl, variableDecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TermsPackage.VARIABLE__VARIABLE_DECL:
			if (resolve)
				return getVariableDecl();
			return basicGetVariableDecl();
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
		case TermsPackage.VARIABLE__VARIABLE_DECL:
			setVariableDecl((VariableDecl) newValue);
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
		case TermsPackage.VARIABLE__VARIABLE_DECL:
			setVariableDecl((VariableDecl) null);
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
		case TermsPackage.VARIABLE__VARIABLE_DECL:
			return variableDecl != null;
		}
		return super.eIsSet(featureID);
	}

	//TODO this element (sort) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 0
		//idref 1
		//attributes 0
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
		sb.append("<variable");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getVariableDecl() != null) {
			sb.append(" refvariable");
			sb.append("=\"");
			sb.append(getVariableDecl().getId());
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
		//1
		//0
		//0
		@SuppressWarnings("unused")
		TermsFactory fact = TermsFactory.eINSTANCE;

		//processing id

		//processing idref

		List<String> ids = new ArrayList<String>();
		String[] tmp = {};

		if (locRoot.getAttributeValue(new QName("refvariable")) != null) {
			ids.add(locRoot.getAttributeValue(new QName("refvariable")).toString());
		}
		idr.addIdRef(this, ids.toArray(tmp));

		//processing attributes

		//processing sons

	}

	public void idRefHang(ArrayList<Object> oList) {

		this.setVariableDecl((fr.lip6.move.pnml.symmetricnet.terms.VariableDecl) oList.get(0));

	}

	//TODO this element (sort) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 1
		//attributes 0
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
		sb.append("<variable");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getVariableDecl() != null) {
			sb.append(" refvariable");
			sb.append("=\"");
			sb.append(getVariableDecl().getId());
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

		TermsValidator val = new TermsValidator();
		boolean retour = true;

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //VariableImpl
