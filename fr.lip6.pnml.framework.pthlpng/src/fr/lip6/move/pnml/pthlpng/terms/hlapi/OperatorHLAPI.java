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

import java.util.List;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
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
import fr.lip6.move.pnml.pthlpng.terms.Term;

public interface OperatorHLAPI extends HLAPIClass, TermHLAPI {

	// getters giving LLAPI object

	/**
	 *
	 */
	public Sort getSort();

	/**
	 *
	 */
	public Operator getContainerOperator();

	/**
	 *
	 */
	public NamedOperator getContainerNamedOperator();

	/**
	 *
	 */
	public HLMarking getContainerHLMarking();

	/**
	 *
	 */
	public Condition getContainerCondition();

	/**
	 *
	 */
	public HLAnnotation getContainerHLAnnotation();

	/**
	 *
	 */
	public PartitionElement getContainerPartitionElement();

	/**
	 *
	 */
	public List<Term> getSubterm();

	/**
	 *
	 */
	public Sort getOutput();

	/**
	 *
	 */
	public List<Sort> getInput();

	// getters giving HLAPI object

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public SortHLAPI getSortHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public OperatorHLAPI getContainerOperatorHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public NamedOperatorHLAPI getContainerNamedOperatorHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public HLMarkingHLAPI getContainerHLMarkingHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public ConditionHLAPI getContainerConditionHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public HLAnnotationHLAPI getContainerHLAnnotationHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public PartitionElementHLAPI getContainerPartitionElementHLAPI();

	/**
	 * This accessor automaticaly encapsulate all elements of the selected sublist.
	 * WARNING : this can creates a lot of new object in memory.
	 */

	public java.util.List<TermHLAPI> getSubtermHLAPI();

	/**
	 * This accessor automaticaly encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 */

	public SortHLAPI getOutputHLAPI();

	/**
	 * This accessor automaticaly encapsulate all elements of the selected sublist.
	 * WARNING : this can creates a lot of new object in memory.
	 */

	public java.util.List<SortHLAPI> getInputHLAPI();

	// setters (including container setter if aviable)

	/**
	 * set Sort
	 */
	public void setSortHLAPI(SortHLAPI elem);

	/**
	 * set Output
	 */
	public void setOutputHLAPI(SortHLAPI elem);

	/**
	 * set ContainerOperator
	 */
	public void setContainerOperatorHLAPI(OperatorHLAPI elem);

	/**
	 * set ContainerNamedOperator
	 */
	public void setContainerNamedOperatorHLAPI(NamedOperatorHLAPI elem);

	/**
	 * set ContainerHLMarking
	 */
	public void setContainerHLMarkingHLAPI(HLMarkingHLAPI elem);

	/**
	 * set ContainerCondition
	 */
	public void setContainerConditionHLAPI(ConditionHLAPI elem);

	/**
	 * set ContainerHLAnnotation
	 */
	public void setContainerHLAnnotationHLAPI(HLAnnotationHLAPI elem);

	/**
	 * set ContainerPartitionElement
	 */
	public void setContainerPartitionElementHLAPI(PartitionElementHLAPI elem);

	/**
	 * This accessor return a list of encapsulated subelement, only of VariableHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI> getSubterm_terms_VariableHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of TupleHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI> getSubterm_terms_TupleHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * UserOperatorHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI> getSubterm_terms_UserOperatorHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of EqualityHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI> getSubterm_booleans_EqualityHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * InequalityHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI> getSubterm_booleans_InequalityHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * BooleanConstantHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI> getSubterm_booleans_BooleanConstantHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of OrHLAPI kind.
	 * WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI> getSubterm_booleans_OrHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of AndHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI> getSubterm_booleans_AndHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of ImplyHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI> getSubterm_booleans_ImplyHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of NotHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI> getSubterm_booleans_NotHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * DotConstantHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI> getSubterm_dots_DotConstantHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * NumberConstantHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI> getSubterm_integers_NumberConstantHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of AdditionHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI> getSubterm_integers_AdditionHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * SubtractionHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI> getSubterm_integers_SubtractionHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * MultiplicationHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI> getSubterm_integers_MultiplicationHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of DivisionHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI> getSubterm_integers_DivisionHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of ModuloHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI> getSubterm_integers_ModuloHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * GreaterThanHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI> getSubterm_integers_GreaterThanHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * GreaterThanOrEqualHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI> getSubterm_integers_GreaterThanOrEqualHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI> getSubterm_integers_LessThanHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * LessThanOrEqualHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI> getSubterm_integers_LessThanOrEqualHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * CardinalityHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI> getSubterm_multisets_CardinalityHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of ContainsHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI> getSubterm_multisets_ContainsHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * CardinalityOfHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI> getSubterm_multisets_CardinalityOfHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of AddHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI> getSubterm_multisets_AddHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of AllHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI> getSubterm_multisets_AllHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of EmptyHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI> getSubterm_multisets_EmptyHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of NumberOfHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI> getSubterm_multisets_NumberOfHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of SubtractHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI> getSubterm_multisets_SubtractHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * ScalarProductHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI> getSubterm_multisets_ScalarProductHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * GreaterThanHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI> getSubterm_partitions_GreaterThanHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * PartitionElementOfHLAPI kind. WARNING : this method can creates a lot of new
	 * object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI> getSubterm_partitions_PartitionElementOfHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI> getSubterm_partitions_LessThanHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * MultisetSortHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI> getInput_terms_MultisetSortHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * ProductSortHLAPI kind. WARNING : this method can creates a lot of new object
	 * in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI> getInput_terms_ProductSortHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of UserSortHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI> getInput_terms_UserSortHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of BoolHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI> getInput_booleans_BoolHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of DotHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI> getInput_dots_DotHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of NaturalHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI> getInput_integers_NaturalHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of PositiveHLAPI
	 * kind. WARNING : this method can creates a lot of new object in memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI> getInput_integers_PositiveHLAPI();

	/**
	 * This accessor return a list of encapsulated subelement, only of
	 * HLIntegerHLAPI kind. WARNING : this method can creates a lot of new object in
	 * memory.
	 */
	public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI> getInput_integers_HLIntegerHLAPI();

	// setters/remover for lists.

	public void addSubtermHLAPI(TermHLAPI unit);

	public void removeSubtermHLAPI(TermHLAPI unit);

	// equals method
	public boolean equals(Object item);

}