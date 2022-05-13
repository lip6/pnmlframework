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

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ConditionHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLAnnotationHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLMarkingHLAPI;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.TermsFactory;
import fr.lip6.move.pnml.pthlpng.terms.Variable;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

public class VariableHLAPI implements HLAPIClass, TermHLAPI {

	/**
	 * The contained LLAPI element.
	 */
	private Variable item;

	/**
	 * this constructor allows you to set all 'settable' values excepted container.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl

			, OperatorHLAPI containerOperator) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerOperator != null)
			item.setContainerOperator((Operator) containerOperator.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl

			, NamedOperatorHLAPI containerNamedOperator) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerNamedOperator != null)
			item.setContainerNamedOperator((NamedOperator) containerNamedOperator.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl

			, HLMarkingHLAPI containerHLMarking) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerHLMarking != null)
			item.setContainerHLMarking((HLMarking) containerHLMarking.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl

			, ConditionHLAPI containerCondition) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerCondition != null)
			item.setContainerCondition((Condition) containerCondition.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl

			, HLAnnotationHLAPI containerHLAnnotation) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerHLAnnotation != null)
			item.setContainerHLAnnotation((HLAnnotation) containerHLAnnotation.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public VariableHLAPI(SortHLAPI sort

			, VariableDeclHLAPI variableDecl

			, PartitionElementHLAPI containerPartitionElement) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (sort != null)
			item.setSort((Sort) sort.getContainedItem());

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerPartitionElement != null)
			item.setContainerPartitionElement((PartitionElement) containerPartitionElement.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (not container if any)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl

			, OperatorHLAPI containerOperator) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerOperator != null)
			item.setContainerOperator((Operator) containerOperator.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl

			, NamedOperatorHLAPI containerNamedOperator) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerNamedOperator != null)
			item.setContainerNamedOperator((NamedOperator) containerNamedOperator.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl

			, HLMarkingHLAPI containerHLMarking) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerHLMarking != null)
			item.setContainerHLMarking((HLMarking) containerHLMarking.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl

			, ConditionHLAPI containerCondition) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerCondition != null)
			item.setContainerCondition((Condition) containerCondition.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl

			, HLAnnotationHLAPI containerHLAnnotation) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerHLAnnotation != null)
			item.setContainerHLAnnotation((HLAnnotation) containerHLAnnotation.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public VariableHLAPI(VariableDeclHLAPI variableDecl

			, PartitionElementHLAPI containerPartitionElement) {// BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createVariable();
		}

		if (variableDecl != null)
			item.setVariableDecl((VariableDecl) variableDecl.getContainedItem());

		if (containerPartitionElement != null)
			item.setContainerPartitionElement((PartitionElement) containerPartitionElement.getContainedItem());

	}

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public VariableHLAPI(Variable lowLevelAPI) {
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Variable getContainedItem() {
		return item;
	}

	// getters giving LLAPI object

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getSort() {
		return item.getSort();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Operator getContainerOperator() {
		return item.getContainerOperator();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedOperator getContainerNamedOperator() {
		return item.getContainerNamedOperator();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLMarking getContainerHLMarking() {
		return item.getContainerHLMarking();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Condition getContainerCondition() {
		return item.getContainerCondition();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLAnnotation getContainerHLAnnotation() {
		return item.getContainerHLAnnotation();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PartitionElement getContainerPartitionElement() {
		return item.getContainerPartitionElement();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public VariableDecl getVariableDecl() {
		return item.getVariableDecl();
	}

	// getters giving HLAPI object

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public SortHLAPI getSortHLAPI() {
		if (item.getSort() == null)
			return null;
		Sort object = item.getSort();

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.MultisetSort) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.ProductSort) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.UserSort) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BoolImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.Bool) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.pthlpng.dots.Dot) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NaturalImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Natural) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.PositiveImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Positive) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.HLIntegerImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.HLInteger) object);
		}

		return null;
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public OperatorHLAPI getContainerOperatorHLAPI() {
		if (item.getContainerOperator() == null)
			return null;
		Operator object = item.getContainerOperator();

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
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public NamedOperatorHLAPI getContainerNamedOperatorHLAPI() {
		if (item.getContainerNamedOperator() == null)
			return null;
		return new NamedOperatorHLAPI(item.getContainerNamedOperator());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public HLMarkingHLAPI getContainerHLMarkingHLAPI() {
		if (item.getContainerHLMarking() == null)
			return null;
		return new HLMarkingHLAPI(item.getContainerHLMarking());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public ConditionHLAPI getContainerConditionHLAPI() {
		if (item.getContainerCondition() == null)
			return null;
		return new ConditionHLAPI(item.getContainerCondition());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public HLAnnotationHLAPI getContainerHLAnnotationHLAPI() {
		if (item.getContainerHLAnnotation() == null)
			return null;
		return new HLAnnotationHLAPI(item.getContainerHLAnnotation());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public PartitionElementHLAPI getContainerPartitionElementHLAPI() {
		if (item.getContainerPartitionElement() == null)
			return null;
		return new PartitionElementHLAPI(item.getContainerPartitionElement());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public VariableDeclHLAPI getVariableDeclHLAPI() {
		if (item.getVariableDecl() == null)
			return null;
		return new VariableDeclHLAPI(item.getVariableDecl());
	}

	// Special getter for list of generics object, return only one object type.

	// setters (including container setter if aviable)

	/**
	 * set Sort
	 */
	public void setSortHLAPI(

			SortHLAPI elem) {

		if (elem != null)
			item.setSort((Sort) elem.getContainedItem());

	}

	/**
	 * set VariableDecl
	 */
	public void setVariableDeclHLAPI(

			VariableDeclHLAPI elem) {

		if (elem != null)
			item.setVariableDecl((VariableDecl) elem.getContainedItem());

	}

	/**
	 * set ContainerOperator
	 */
	public void setContainerOperatorHLAPI(

			OperatorHLAPI elem) {

		if (elem != null)
			item.setContainerOperator((Operator) elem.getContainedItem());

	}

	/**
	 * set ContainerNamedOperator
	 */
	public void setContainerNamedOperatorHLAPI(

			NamedOperatorHLAPI elem) {

		if (elem != null)
			item.setContainerNamedOperator((NamedOperator) elem.getContainedItem());

	}

	/**
	 * set ContainerHLMarking
	 */
	public void setContainerHLMarkingHLAPI(

			HLMarkingHLAPI elem) {

		if (elem != null)
			item.setContainerHLMarking((HLMarking) elem.getContainedItem());

	}

	/**
	 * set ContainerCondition
	 */
	public void setContainerConditionHLAPI(

			ConditionHLAPI elem) {

		if (elem != null)
			item.setContainerCondition((Condition) elem.getContainedItem());

	}

	/**
	 * set ContainerHLAnnotation
	 */
	public void setContainerHLAnnotationHLAPI(

			HLAnnotationHLAPI elem) {

		if (elem != null)
			item.setContainerHLAnnotation((HLAnnotation) elem.getContainedItem());

	}

	/**
	 * set ContainerPartitionElement
	 */
	public void setContainerPartitionElementHLAPI(

			PartitionElementHLAPI elem) {

		if (elem != null)
			item.setContainerPartitionElement((PartitionElement) elem.getContainedItem());

	}

	// setters/remover for lists.

	// equals method
	public boolean equals(VariableHLAPI item) {
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