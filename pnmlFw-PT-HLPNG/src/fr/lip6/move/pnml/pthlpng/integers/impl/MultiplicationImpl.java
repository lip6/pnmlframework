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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
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
package fr.lip6.move.pnml.pthlpng.integers.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

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
import fr.lip6.move.pnml.pthlpng.integers.IntegersFactory;
import fr.lip6.move.pnml.pthlpng.integers.IntegersPackage;
import fr.lip6.move.pnml.pthlpng.integers.Multiplication;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Multiplication</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MultiplicationImpl extends IntegerOperatorImpl implements Multiplication {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MultiplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegersPackage.Literals.MULTIPLICATION;
	}

	// TODO this element (sort) seems not to have any ToPNML associated tag.
	// This is maybe a mistake ?

	// TODO this element (output) seems not to have any ToPNML associated tag.
	// This is maybe a mistake ?

	// TODO this element (input) seems not to have any ToPNML associated tag.
	// This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		// id 0
		// idref 0
		// attributes 0
		// sons 1

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
		sb.append("<mult");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		// begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		// sons, follow processing

		if (getSubterm() != null) {

			java.util.List<fr.lip6.move.pnml.pthlpng.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("subterm");
				sb.append(">");
				sb.append(item.toPNML());
				sb.append(headline);
				sb.append("</");
				sb.append("subterm");
				sb.append(">");

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</mult>");
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
		// 1
		@SuppressWarnings("unused")
		IntegersFactory fact = IntegersFactory.eINSTANCE;

		// processing id

		// processing idref

		// processing attributes

		// processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("subterm")) {

				Term item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("numberconstant")) {
						item = new IntegersFactoryImpl().createNumberConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("addition")) {
						item = new IntegersFactoryImpl().createAddition();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("subtraction")) {
						item = new IntegersFactoryImpl().createSubtraction();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("mult")) {
						item = new IntegersFactoryImpl().createMultiplication();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("div")) {
						item = new IntegersFactoryImpl().createDivision();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("mod")) {
						item = new IntegersFactoryImpl().createModulo();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gt")) {
						item = new IntegersFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("geq")) {
						item = new IntegersFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lt")) {
						item = new IntegersFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("leq")) {
						item = new IntegersFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("equality")) {
						item = new BooleansFactoryImpl().createEquality();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("inequality")) {
						item = new BooleansFactoryImpl().createInequality();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("booleanconstantt")) {
						item = new BooleansFactoryImpl().createBooleanConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("or")) {
						item = new BooleansFactoryImpl().createOr();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("and")) {
						item = new BooleansFactoryImpl().createAnd();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("imply")) {
						item = new BooleansFactoryImpl().createImply();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("not")) {
						item = new BooleansFactoryImpl().createNot();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("dotconstant")) {
						item = new DotsFactoryImpl().createDotConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinality")) {
						item = new MultisetsFactoryImpl().createCardinality();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("contains")) {
						item = new MultisetsFactoryImpl().createContains();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinalityof")) {
						item = new MultisetsFactoryImpl().createCardinalityOf();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("add")) {
						item = new MultisetsFactoryImpl().createAdd();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("all")) {
						item = new MultisetsFactoryImpl().createAll();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("empty")) {
						item = new MultisetsFactoryImpl().createEmpty();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("numberof")) {
						item = new MultisetsFactoryImpl().createNumberOf();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("subtract")) {
						item = new MultisetsFactoryImpl().createSubtract();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("scalarproduct")) {
						item = new MultisetsFactoryImpl().createScalarProduct();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gtp")) {
						item = new PartitionsFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("partitionelementof")) {
						item = new PartitionsFactoryImpl().createPartitionElementOf();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("ltp")) {
						item = new PartitionsFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("variable")) {
						item = new TermsFactoryImpl().createVariable();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("tuple")) {
						item = new TermsFactoryImpl().createTuple();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("useroperator")) {
						item = new TermsFactoryImpl().createUserOperator();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

				}
			}

			// tag!=null

		}

	}

	// TODO this element (sort) seems not to have any ToPNML associated tag.
	// This is maybe a mistake ?

	// TODO this element (output) seems not to have any ToPNML associated tag.
	// This is maybe a mistake ?

	// TODO this element (input) seems not to have any ToPNML associated tag.
	// This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		// id 0
		// idref 0
		// attributes 0
		// sons 1

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
		sb.append("<mult");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		// begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		// sons, follow processing

		if (getSubterm() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("subterm");
				sb.append(">");
				try {
					writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
				} catch (IOException io) {
					io.printStackTrace();
					// fail fast
					return;
				}
				sb.delete(0, sb.length());
				item.toPNML(fc);
				sb.append(headline);
				sb.append("</");
				sb.append("subterm");
				sb.append(">");

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</mult>");
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

		TermsValidator val = new TermsValidator();
		boolean retour = true;

		if (getSubterm() != null) {
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} // MultiplicationImpl
