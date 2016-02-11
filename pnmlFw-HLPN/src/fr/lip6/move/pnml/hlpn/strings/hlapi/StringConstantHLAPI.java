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
 * $Id ggiffo, Thu Feb 11 16:29:59 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.strings.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ConditionHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.HLAnnotationHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.HLMarkingHLAPI;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI;
import fr.lip6.move.pnml.hlpn.strings.StringConstant;
import fr.lip6.move.pnml.hlpn.strings.StringsFactory;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.OperatorHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.TermHLAPI;


public class StringConstantHLAPI implements HLAPIClass,TermHLAPI,OperatorHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private StringConstant item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	
		, OperatorHLAPI containerOperator
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
 		
 		if(containerOperator!=null)
			item.setContainerOperator((Operator)containerOperator.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	
		, NamedOperatorHLAPI containerNamedOperator
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	
		, HLMarkingHLAPI containerHLMarking
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
 		
 		if(containerHLMarking!=null)
			item.setContainerHLMarking((HLMarking)containerHLMarking.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	
		, ConditionHLAPI containerCondition
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
 		
 		if(containerCondition!=null)
			item.setContainerCondition((Condition)containerCondition.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	
		, HLAnnotationHLAPI containerHLAnnotation
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
 		
 		if(containerHLAnnotation!=null)
			item.setContainerHLAnnotation((HLAnnotation)containerHLAnnotation.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public StringConstantHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, java.lang.String value
	
		, PartitionElementHLAPI containerPartitionElement
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
			if(value!=null){
			
				item.setValue(value);
			}
		
	
 		
 		if(containerPartitionElement!=null)
			item.setContainerPartitionElement((PartitionElement)containerPartitionElement.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public StringConstantHLAPI(
		 OperatorHLAPI containerOperator
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(containerOperator!=null)
			item.setContainerOperator((Operator)containerOperator.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public StringConstantHLAPI(
		 NamedOperatorHLAPI containerNamedOperator
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public StringConstantHLAPI(
		 HLMarkingHLAPI containerHLMarking
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(containerHLMarking!=null)
			item.setContainerHLMarking((HLMarking)containerHLMarking.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public StringConstantHLAPI(
		 ConditionHLAPI containerCondition
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(containerCondition!=null)
			item.setContainerCondition((Condition)containerCondition.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public StringConstantHLAPI(
		 HLAnnotationHLAPI containerHLAnnotation
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(containerHLAnnotation!=null)
			item.setContainerHLAnnotation((HLAnnotation)containerHLAnnotation.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public StringConstantHLAPI(
		 PartitionElementHLAPI containerPartitionElement
	){//BEGIN CONSTRUCTOR BODY
		StringsFactory fact = StringsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createStringConstant();}
	
 		
 		if(containerPartitionElement!=null)
			item.setContainerPartitionElement((PartitionElement)containerPartitionElement.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public StringConstantHLAPI(StringConstant lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public StringConstant getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getSort(){
		return item.getSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Operator getContainerOperator(){
		return item.getContainerOperator();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedOperator getContainerNamedOperator(){
		return item.getContainerNamedOperator();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLMarking getContainerHLMarking(){
		return item.getContainerHLMarking();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Condition getContainerCondition(){
		return item.getContainerCondition();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLAnnotation getContainerHLAnnotation(){
		return item.getContainerHLAnnotation();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PartitionElement getContainerPartitionElement(){
		return item.getContainerPartitionElement();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Term> getSubterm(){
		return item.getSubterm();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getOutput(){
		return item.getOutput();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Sort> getInput(){
		return item.getInput();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getValue(){
		return item.getValue();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public SortHLAPI getSortHLAPI(){
			if(item.getSort() == null) return null;
			Sort object = item.getSort();
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.HLPNStringImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI((fr.lip6.move.pnml.hlpn.strings.HLPNString)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI((fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BoolImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI((fr.lip6.move.pnml.hlpn.booleans.Bool)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotImpl.class)){
				return new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.hlpn.dots.Dot)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI((fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NaturalImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI((fr.lip6.move.pnml.hlpn.integers.Natural)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.PositiveImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI((fr.lip6.move.pnml.hlpn.integers.Positive)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.HLIntegerImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI((fr.lip6.move.pnml.hlpn.integers.HLInteger)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI((fr.lip6.move.pnml.hlpn.lists.HLPNList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.MultisetSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI((fr.lip6.move.pnml.hlpn.terms.MultisetSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI((fr.lip6.move.pnml.hlpn.terms.ProductSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI((fr.lip6.move.pnml.hlpn.terms.UserSort)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public OperatorHLAPI getContainerOperatorHLAPI(){
			if(item.getContainerOperator() == null) return null;
			Operator object = item.getContainerOperator();
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI((fr.lip6.move.pnml.hlpn.strings.StringConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.AppendImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI((fr.lip6.move.pnml.hlpn.strings.Append)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.ConcatenationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI((fr.lip6.move.pnml.hlpn.strings.Concatenation)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.strings.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.strings.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.strings.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.strings.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LengthImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI((fr.lip6.move.pnml.hlpn.strings.Length)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.SubstringImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI((fr.lip6.move.pnml.hlpn.strings.Substring)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.EqualityImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI((fr.lip6.move.pnml.hlpn.booleans.Equality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.InequalityImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI((fr.lip6.move.pnml.hlpn.booleans.Inequality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BooleanConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI((fr.lip6.move.pnml.hlpn.booleans.BooleanConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.OrImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI((fr.lip6.move.pnml.hlpn.booleans.Or)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.AndImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI((fr.lip6.move.pnml.hlpn.booleans.And)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.ImplyImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI((fr.lip6.move.pnml.hlpn.booleans.Imply)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.NotImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI((fr.lip6.move.pnml.hlpn.booleans.Not)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI((fr.lip6.move.pnml.hlpn.dots.DotConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NumberConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI((fr.lip6.move.pnml.hlpn.integers.NumberConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.AdditionImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI((fr.lip6.move.pnml.hlpn.integers.Addition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.SubtractionImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI((fr.lip6.move.pnml.hlpn.integers.Subtraction)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.MultiplicationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI((fr.lip6.move.pnml.hlpn.integers.Multiplication)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.DivisionImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI((fr.lip6.move.pnml.hlpn.integers.Division)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.ModuloImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI((fr.lip6.move.pnml.hlpn.integers.Modulo)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.integers.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.integers.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI((fr.lip6.move.pnml.hlpn.lists.EmptyList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI((fr.lip6.move.pnml.hlpn.lists.Append)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI((fr.lip6.move.pnml.hlpn.lists.Concatenation)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI((fr.lip6.move.pnml.hlpn.lists.Length)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI((fr.lip6.move.pnml.hlpn.lists.MakeList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI((fr.lip6.move.pnml.hlpn.lists.MemberAtIndex)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI((fr.lip6.move.pnml.hlpn.lists.Sublist)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI((fr.lip6.move.pnml.hlpn.multisets.Cardinality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ContainsImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI((fr.lip6.move.pnml.hlpn.multisets.Contains)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityOfImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI((fr.lip6.move.pnml.hlpn.multisets.CardinalityOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AddImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI((fr.lip6.move.pnml.hlpn.multisets.Add)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AllImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI((fr.lip6.move.pnml.hlpn.multisets.All)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.EmptyImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI((fr.lip6.move.pnml.hlpn.multisets.Empty)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.NumberOfImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI((fr.lip6.move.pnml.hlpn.multisets.NumberOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.SubtractImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI((fr.lip6.move.pnml.hlpn.multisets.Subtract)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ScalarProductImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI((fr.lip6.move.pnml.hlpn.multisets.ScalarProduct)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.partitions.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementOfImpl.class)){
				return new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI((fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.partitions.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.TupleImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI((fr.lip6.move.pnml.hlpn.terms.Tuple)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserOperatorImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI((fr.lip6.move.pnml.hlpn.terms.UserOperator)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NamedOperatorHLAPI getContainerNamedOperatorHLAPI(){
			if(item.getContainerNamedOperator() == null) return null;
			return new NamedOperatorHLAPI(item.getContainerNamedOperator());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public HLMarkingHLAPI getContainerHLMarkingHLAPI(){
			if(item.getContainerHLMarking() == null) return null;
			return new HLMarkingHLAPI(item.getContainerHLMarking());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ConditionHLAPI getContainerConditionHLAPI(){
			if(item.getContainerCondition() == null) return null;
			return new ConditionHLAPI(item.getContainerCondition());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public HLAnnotationHLAPI getContainerHLAnnotationHLAPI(){
			if(item.getContainerHLAnnotation() == null) return null;
			return new HLAnnotationHLAPI(item.getContainerHLAnnotation());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PartitionElementHLAPI getContainerPartitionElementHLAPI(){
			if(item.getContainerPartitionElement() == null) return null;
			return new PartitionElementHLAPI(item.getContainerPartitionElement());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<TermHLAPI> getSubtermHLAPI(){
			java.util.List<TermHLAPI> retour = new ArrayList<TermHLAPI>();
			for (Term elemnt : getSubterm()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.StringConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Append)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Concatenation)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Length)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.SubstringImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Substring)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Equality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Inequality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.BooleanConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Or)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.And)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Imply)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Not)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.dots.DotConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.NumberConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Addition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Subtraction)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Multiplication)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Division)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Modulo)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.EmptyList)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Append)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Concatenation)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Length)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MakeList)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MemberAtIndex)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Sublist)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Cardinality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Contains)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.CardinalityOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Add)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.All)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Empty)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.NumberOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Subtract)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.ScalarProduct)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Variable)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Tuple)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.UserOperator)elemnt
						));
					continue;
				}
				
			}
			return retour;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public SortHLAPI getOutputHLAPI(){
			if(item.getOutput() == null) return null;
			Sort object = item.getOutput();
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.HLPNStringImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI((fr.lip6.move.pnml.hlpn.strings.HLPNString)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI((fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BoolImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI((fr.lip6.move.pnml.hlpn.booleans.Bool)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotImpl.class)){
				return new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.hlpn.dots.Dot)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI((fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NaturalImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI((fr.lip6.move.pnml.hlpn.integers.Natural)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.PositiveImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI((fr.lip6.move.pnml.hlpn.integers.Positive)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.HLIntegerImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI((fr.lip6.move.pnml.hlpn.integers.HLInteger)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI((fr.lip6.move.pnml.hlpn.lists.HLPNList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.MultisetSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI((fr.lip6.move.pnml.hlpn.terms.MultisetSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI((fr.lip6.move.pnml.hlpn.terms.ProductSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI((fr.lip6.move.pnml.hlpn.terms.UserSort)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<SortHLAPI> getInputHLAPI(){
			java.util.List<SortHLAPI> retour = new ArrayList<SortHLAPI>();
			for (Sort elemnt : getInput()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.HLPNStringImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.HLPNString)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BoolImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Bool)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(
						(fr.lip6.move.pnml.hlpn.dots.Dot)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NaturalImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Natural)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.PositiveImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Positive)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.HLIntegerImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.HLInteger)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.HLPNList)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.MultisetSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.MultisetSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.ProductSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.UserSort)elemnt
						));
					continue;
				}
				
			}
			return retour;
		}
		
	
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of StringConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI> getSubterm_strings_StringConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.StringConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AppendHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI> getSubterm_strings_AppendHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Append)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ConcatenationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI> getSubterm_strings_ConcatenationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Concatenation)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI> getSubterm_strings_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI> getSubterm_strings_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI> getSubterm_strings_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI> getSubterm_strings_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LengthHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI> getSubterm_strings_LengthHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Length)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubstringHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI> getSubterm_strings_SubstringHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.SubstringImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Substring)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EqualityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI> getSubterm_booleans_EqualityHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Equality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of InequalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI> getSubterm_booleans_InequalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Inequality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BooleanConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI> getSubterm_booleans_BooleanConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.BooleanConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of OrHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI> getSubterm_booleans_OrHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Or)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AndHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI> getSubterm_booleans_AndHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.And)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ImplyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI> getSubterm_booleans_ImplyHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Imply)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI> getSubterm_booleans_NotHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Not)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SuccessorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI> getSubterm_cyclicEnumerations_SuccessorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PredecessorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI> getSubterm_cyclicEnumerations_PredecessorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI> getSubterm_dots_DotConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.dots.DotConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteIntRangeConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> getSubterm_finiteIntRanges_FiniteIntRangeConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI> getSubterm_finiteIntRanges_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI> getSubterm_finiteIntRanges_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> getSubterm_finiteIntRanges_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> getSubterm_finiteIntRanges_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI> getSubterm_integers_NumberConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.NumberConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AdditionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI> getSubterm_integers_AdditionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Addition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI> getSubterm_integers_SubtractionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Subtraction)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultiplicationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI> getSubterm_integers_MultiplicationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Multiplication)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DivisionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI> getSubterm_integers_DivisionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Division)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ModuloHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI> getSubterm_integers_ModuloHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Modulo)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI> getSubterm_integers_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI> getSubterm_integers_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI> getSubterm_integers_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI> getSubterm_integers_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EmptyListHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI> getSubterm_lists_EmptyListHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.EmptyList)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AppendHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI> getSubterm_lists_AppendHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Append)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ConcatenationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI> getSubterm_lists_ConcatenationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Concatenation)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LengthHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI> getSubterm_lists_LengthHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Length)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MakeListHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI> getSubterm_lists_MakeListHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MakeList)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MemberAtIndexHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI> getSubterm_lists_MemberAtIndexHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MemberAtIndex)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SublistHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI> getSubterm_lists_SublistHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Sublist)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI> getSubterm_multisets_CardinalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Cardinality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ContainsHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI> getSubterm_multisets_ContainsHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Contains)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI> getSubterm_multisets_CardinalityOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.CardinalityOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AddHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI> getSubterm_multisets_AddHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Add)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AllHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI> getSubterm_multisets_AllHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.All)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EmptyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI> getSubterm_multisets_EmptyHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Empty)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI> getSubterm_multisets_NumberOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.NumberOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI> getSubterm_multisets_SubtractHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Subtract)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ScalarProductHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI> getSubterm_multisets_ScalarProductHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.ScalarProduct)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI> getSubterm_partitions_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionElementOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI> getSubterm_partitions_PartitionElementOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI> getSubterm_partitions_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of VariableHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI> getSubterm_terms_VariableHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Variable)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of TupleHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI> getSubterm_terms_TupleHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Tuple)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI> getSubterm_terms_UserOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.UserOperator)elemnt
						));
				}
			}
			return retour;
		}
		
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of HLPNStringHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI> getInput_strings_HLPNStringHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.HLPNStringImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.HLPNString)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AnySortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI> getInput_arbitrarydeclarations_AnySortHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BoolHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI> getInput_booleans_BoolHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BoolImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Bool)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CyclicEnumerationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> getInput_cyclicEnumerations_CyclicEnumerationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI> getInput_dots_DotHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(
						(fr.lip6.move.pnml.hlpn.dots.Dot)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteEnumerationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> getInput_finiteEnumerations_FiniteEnumerationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteIntRangeHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> getInput_finiteIntRanges_FiniteIntRangeHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NaturalHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI> getInput_integers_NaturalHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NaturalImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Natural)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PositiveHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI> getInput_integers_PositiveHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.PositiveImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Positive)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of HLIntegerHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI> getInput_integers_HLIntegerHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.HLIntegerImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.HLInteger)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of HLPNListHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI> getInput_lists_HLPNListHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.HLPNList)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultisetSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI> getInput_terms_MultisetSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.MultisetSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.MultisetSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ProductSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI> getInput_terms_ProductSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.ProductSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI> getInput_terms_UserSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.UserSort)elemnt
						));
				}
			}
			return retour;
		}
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Sort
	 */
	public void setSortHLAPI(
	
	SortHLAPI elem){
	
	
 		if(elem!=null)
			item.setSort((Sort)elem.getContainedItem());
	
	}
	
	/**
	 * set Output
	 */
	public void setOutputHLAPI(
	
	SortHLAPI elem){
	
	
 		if(elem!=null)
			item.setOutput((Sort)elem.getContainedItem());
	
	}
	
	/**
	 * set Value
	 */
	public void setValueHLAPI(
	
	java.lang.String elem){
	
	
		if(elem!=null){
		
			item.setValue(elem);
		}
	
	}
	
	/**
	 * set ContainerOperator
	 */
	public void setContainerOperatorHLAPI(
	
	OperatorHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerOperator((Operator)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerNamedOperator
	 */
	public void setContainerNamedOperatorHLAPI(
	
	NamedOperatorHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamedOperator((NamedOperator)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerHLMarking
	 */
	public void setContainerHLMarkingHLAPI(
	
	HLMarkingHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerHLMarking((HLMarking)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerCondition
	 */
	public void setContainerConditionHLAPI(
	
	ConditionHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerCondition((Condition)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerHLAnnotation
	 */
	public void setContainerHLAnnotationHLAPI(
	
	HLAnnotationHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerHLAnnotation((HLAnnotation)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPartitionElement
	 */
	public void setContainerPartitionElementHLAPI(
	
	PartitionElementHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPartitionElement((PartitionElement)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addSubtermHLAPI(TermHLAPI unit){
	
		item.getSubterm().add((Term)unit.getContainedItem());
	}

	public void removeSubtermHLAPI(TermHLAPI unit){
		item.getSubterm().remove((Term)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(StringConstantHLAPI item){
		return item.getContainedItem().equals(getContainedItem());
	}

	//PNML
	
	/**
	 * Returns the PNML xml tree for this object.
	 */
	public String toPNML(){
		return item.toPNML();
	}
	
	/**
	 * Writes the PNML XML tree of this object into file channel.
	 */
	public void toPNML(FileChannel fc){
		 item.toPNML(fc);
	}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{
		item.fromPNML(subRoot,idr);
	}
	

	public boolean validateOCL(DiagnosticChain diagnostics){
		return item.validateOCL(diagnostics);
	}

}