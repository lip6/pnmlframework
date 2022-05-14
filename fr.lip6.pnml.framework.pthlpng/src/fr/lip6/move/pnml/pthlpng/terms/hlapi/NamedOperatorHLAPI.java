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
 *
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.terms.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.terms.Declarations;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.TermsFactory;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

public class NamedOperatorHLAPI implements HLAPIClass, TermsDeclarationHLAPI, OperatorDeclHLAPI {

	/**
	 * The contained LLAPI element.
	 */
	private NamedOperator item;

	/**
	 * this constructor allows you to set all 'settable' values excepted container.
	 */

	public NamedOperatorHLAPI(java.lang.String id

			, java.lang.String name

			, TermHLAPI def) throws InvalidIDException, VoidRepositoryException {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createNamedOperator();
		}

		if (id != null) {

			item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
		}

		if (name != null) {

			item.setName(name);
		}

		if (def != null)
			item.setDef((Term) def.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public NamedOperatorHLAPI(java.lang.String id

			, java.lang.String name

			, TermHLAPI def

			, DeclarationsHLAPI containerDeclarations) throws InvalidIDException, VoidRepositoryException {// BEGIN
																											// CONSTRUCTOR
																											// BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createNamedOperator();
		}

		if (id != null) {

			item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
		}

		if (name != null) {

			item.setName(name);
		}

		if (def != null)
			item.setDef((Term) def.getContainedItem());

		if (containerDeclarations != null)
			item.setContainerDeclarations((Declarations) containerDeclarations.getContainedItem());

	}

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public NamedOperatorHLAPI(NamedOperator lowLevelAPI) {
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public NamedOperator getContainedItem() {
		return item;
	}

	// getters giving LLAPI object

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getId() {
		return item.getId();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getName() {
		return item.getName();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Declarations getContainerDeclarations() {
		return item.getContainerDeclarations();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Term getDef() {
		return item.getDef();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<VariableDecl> getParameters() {
		return item.getParameters();
	}

	// getters giving HLAPI object

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public DeclarationsHLAPI getContainerDeclarationsHLAPI() {
		if (item.getContainerDeclarations() == null)
			return null;
		return new DeclarationsHLAPI(item.getContainerDeclarations());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public TermHLAPI getDefHLAPI() {
		if (item.getDef() == null)
			return null;
		Term object = item.getDef();

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.Variable) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI((fr.lip6.move.pnml.pthlpng.terms.Tuple) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.UserOperator) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.EqualityImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.Equality) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.InequalityImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.Inequality) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BooleanConstantImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.OrImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Or) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.AndImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.And) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.ImplyImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.Imply) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.NotImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.Not) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotConstantImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(
					(fr.lip6.move.pnml.pthlpng.dots.DotConstant) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NumberConstantImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.NumberConstant) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.AdditionImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Addition) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.SubtractionImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Subtraction) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.MultiplicationImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Multiplication) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.DivisionImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Division) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.ModuloImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Modulo) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.GreaterThan) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanOrEqualImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.LessThan) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanOrEqualImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.Cardinality) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ContainsImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.Contains) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityOfImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AddImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.Add) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AllImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.All) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.EmptyImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.Empty) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.NumberOfImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.NumberOf) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.SubtractImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.Subtract) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ScalarProductImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI(
					(fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.GreaterThanImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI(
					(fr.lip6.move.pnml.pthlpng.partitions.GreaterThan) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionElementOfImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI(
					(fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.LessThanImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI(
					(fr.lip6.move.pnml.pthlpng.partitions.LessThan) object);
		}

		return null;
	}

	/**
	 * This accessor automatically encapsulate all elements of the selected sublist.
	 * WARNING : this can creates a lot of new object in memory.
	 */

	public java.util.List<VariableDeclHLAPI> getParametersHLAPI() {
		java.util.List<VariableDeclHLAPI> retour = new ArrayList<VariableDeclHLAPI>();
		for (VariableDecl elemnt : getParameters()) {
			retour.add(new VariableDeclHLAPI(elemnt));
		}
		return retour;
	}

	// Special getter for list of generics object, return only one object type.

	// setters (including container setter if aviable)

	/**
	 * set Id
	 */
	public void setIdHLAPI(

			java.lang.String elem) throws InvalidIDException, VoidRepositoryException {

		if (elem != null) {

			try {
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().changeId(this, elem));
			} catch (OtherException e) {
				ModelRepository.getInstance().getCurrentIdRepository().checkId(elem, this);
			}
		}

	}

	/**
	 * set Name
	 */
	public void setNameHLAPI(

			java.lang.String elem) {

		if (elem != null) {

			item.setName(elem);
		}

	}

	/**
	 * set Def
	 */
	public void setDefHLAPI(

			TermHLAPI elem) {

		if (elem != null)
			item.setDef((Term) elem.getContainedItem());

	}

	/**
	 * set ContainerDeclarations
	 */
	public void setContainerDeclarationsHLAPI(

			DeclarationsHLAPI elem) {

		if (elem != null)
			item.setContainerDeclarations((Declarations) elem.getContainedItem());

	}

	// setters/remover for lists.

	public void addParametersHLAPI(VariableDeclHLAPI unit) {

		item.getParameters().add((VariableDecl) unit.getContainedItem());
	}

	public void removeParametersHLAPI(VariableDeclHLAPI unit) {
		item.getParameters().remove((VariableDecl) unit.getContainedItem());
	}

	// equals method
	public boolean equals(NamedOperatorHLAPI item) {
		return item.getContainedItem().equals(getContainedItem());
	}

	// PNML

	/**
	 * Returns the PNML xml tree for this object.
	 */
	public String toPNML() {
		return item.toPNML();
	}

	/**
	 * Writes the PNML XML tree of this object into file channel.
	 */
	public void toPNML(FileChannel fc) {
		item.toPNML(fc);
	}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	public void fromPNML(OMElement subRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException {
		item.fromPNML(subRoot, idr);
	}

	public boolean validateOCL(DiagnosticChain diagnostics) {
		return item.validateOCL(diagnostics);
	}

}