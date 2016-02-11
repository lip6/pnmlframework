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
package fr.lip6.move.pnml.hlpn.terms.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Empty;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.TermsFactory;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;


public class MultisetSortHLAPI implements HLAPIClass,SortHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private MultisetSort item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, MultisetSortHLAPI multi
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(multi!=null)
			item.setMulti((MultisetSort)multi.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, NamedSortHLAPI containerNamedSort
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerNamedSort!=null)
			item.setContainerNamedSort((NamedSort)containerNamedSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, VariableDeclHLAPI containerVariableDecl
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerVariableDecl!=null)
			item.setContainerVariableDecl((VariableDecl)containerVariableDecl.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, ProductSortHLAPI containerProductSort
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerProductSort!=null)
			item.setContainerProductSort((ProductSort)containerProductSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, TypeHLAPI containerType
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerType!=null)
			item.setContainerType((Type)containerType.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, AllHLAPI containerAll
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerAll!=null)
			item.setContainerAll((All)containerAll.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, EmptyHLAPI containerEmpty
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerEmpty!=null)
			item.setContainerEmpty((Empty)containerEmpty.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, PartitionHLAPI containerPartition
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerPartition!=null)
			item.setContainerPartition((Partition)containerPartition.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, HLPNListHLAPI containerList
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerList!=null)
			item.setContainerList((HLPNList)containerList.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, EmptyListHLAPI containerEmptyList
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerEmptyList!=null)
			item.setContainerEmptyList((EmptyList)containerEmptyList.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public MultisetSortHLAPI(
		 SortHLAPI basis
	
		, MakeListHLAPI containerMakeList
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createMultisetSort();}
	
 		
 		if(basis!=null)
			item.setBasis((Sort)basis.getContainedItem());
		
	
 		
 		if(containerMakeList!=null)
			item.setContainerMakeList((MakeList)containerMakeList.getContainedItem());
		
	
	}



	
	
	
	
	
	
	
	
	
	
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public MultisetSortHLAPI(MultisetSort lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public MultisetSort getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public MultisetSort getMulti(){
		return item.getMulti();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedSort getContainerNamedSort(){
		return item.getContainerNamedSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public VariableDecl getContainerVariableDecl(){
		return item.getContainerVariableDecl();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public ProductSort getContainerProductSort(){
		return item.getContainerProductSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Type getContainerType(){
		return item.getContainerType();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public All getContainerAll(){
		return item.getContainerAll();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Empty getContainerEmpty(){
		return item.getContainerEmpty();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Partition getContainerPartition(){
		return item.getContainerPartition();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLPNList getContainerList(){
		return item.getContainerList();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public EmptyList getContainerEmptyList(){
		return item.getContainerEmptyList();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public MakeList getContainerMakeList(){
		return item.getContainerMakeList();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getBasis(){
		return item.getBasis();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public MultisetSortHLAPI getMultiHLAPI(){
			if(item.getMulti() == null) return null;
			return new MultisetSortHLAPI(item.getMulti());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NamedSortHLAPI getContainerNamedSortHLAPI(){
			if(item.getContainerNamedSort() == null) return null;
			return new NamedSortHLAPI(item.getContainerNamedSort());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public VariableDeclHLAPI getContainerVariableDeclHLAPI(){
			if(item.getContainerVariableDecl() == null) return null;
			return new VariableDeclHLAPI(item.getContainerVariableDecl());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ProductSortHLAPI getContainerProductSortHLAPI(){
			if(item.getContainerProductSort() == null) return null;
			return new ProductSortHLAPI(item.getContainerProductSort());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public TypeHLAPI getContainerTypeHLAPI(){
			if(item.getContainerType() == null) return null;
			return new TypeHLAPI(item.getContainerType());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public AllHLAPI getContainerAllHLAPI(){
			if(item.getContainerAll() == null) return null;
			return new AllHLAPI(item.getContainerAll());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public EmptyHLAPI getContainerEmptyHLAPI(){
			if(item.getContainerEmpty() == null) return null;
			return new EmptyHLAPI(item.getContainerEmpty());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PartitionHLAPI getContainerPartitionHLAPI(){
			if(item.getContainerPartition() == null) return null;
			return new PartitionHLAPI(item.getContainerPartition());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public HLPNListHLAPI getContainerListHLAPI(){
			if(item.getContainerList() == null) return null;
			return new HLPNListHLAPI(item.getContainerList());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public EmptyListHLAPI getContainerEmptyListHLAPI(){
			if(item.getContainerEmptyList() == null) return null;
			return new EmptyListHLAPI(item.getContainerEmptyList());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public MakeListHLAPI getContainerMakeListHLAPI(){
			if(item.getContainerMakeList() == null) return null;
			return new MakeListHLAPI(item.getContainerMakeList());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public SortHLAPI getBasisHLAPI(){
			if(item.getBasis() == null) return null;
			Sort object = item.getBasis();
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.MultisetSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI((fr.lip6.move.pnml.hlpn.terms.MultisetSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI((fr.lip6.move.pnml.hlpn.terms.ProductSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI((fr.lip6.move.pnml.hlpn.terms.UserSort)object);
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
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.HLPNStringImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI((fr.lip6.move.pnml.hlpn.strings.HLPNString)object);
			}
			
			return null;
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Basis
	 */
	public void setBasisHLAPI(
	
	SortHLAPI elem){
	
	
 		if(elem!=null)
			item.setBasis((Sort)elem.getContainedItem());
	
	}
	
	/**
	 * set Multi
	 */
	public void setMultiHLAPI(
	
	MultisetSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setMulti((MultisetSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerNamedSort
	 */
	public void setContainerNamedSortHLAPI(
	
	NamedSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamedSort((NamedSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerVariableDecl
	 */
	public void setContainerVariableDeclHLAPI(
	
	VariableDeclHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerVariableDecl((VariableDecl)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerProductSort
	 */
	public void setContainerProductSortHLAPI(
	
	ProductSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerProductSort((ProductSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerType
	 */
	public void setContainerTypeHLAPI(
	
	TypeHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerType((Type)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerAll
	 */
	public void setContainerAllHLAPI(
	
	AllHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerAll((All)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerEmpty
	 */
	public void setContainerEmptyHLAPI(
	
	EmptyHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerEmpty((Empty)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPartition
	 */
	public void setContainerPartitionHLAPI(
	
	PartitionHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPartition((Partition)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerList
	 */
	public void setContainerListHLAPI(
	
	HLPNListHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerList((HLPNList)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerEmptyList
	 */
	public void setContainerEmptyListHLAPI(
	
	EmptyListHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerEmptyList((EmptyList)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerMakeList
	 */
	public void setContainerMakeListHLAPI(
	
	MakeListHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerMakeList((MakeList)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(MultisetSortHLAPI item){
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