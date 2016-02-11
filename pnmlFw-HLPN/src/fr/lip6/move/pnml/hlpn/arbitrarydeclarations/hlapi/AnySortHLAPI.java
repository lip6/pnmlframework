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
 * $Id ggiffo, Thu Feb 11 16:29:57 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsFactory;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.AnyObjectHLAPI;
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
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;
import fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI;


public class AnySortHLAPI implements HLAPIClass,SortHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private AnySort item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, MultisetSortHLAPI multi
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(multi!=null)
			item.setMulti((MultisetSort)multi.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, NamedSortHLAPI containerNamedSort
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerNamedSort!=null)
			item.setContainerNamedSort((NamedSort)containerNamedSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, VariableDeclHLAPI containerVariableDecl
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerVariableDecl!=null)
			item.setContainerVariableDecl((VariableDecl)containerVariableDecl.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, ProductSortHLAPI containerProductSort
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerProductSort!=null)
			item.setContainerProductSort((ProductSort)containerProductSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, TypeHLAPI containerType
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerType!=null)
			item.setContainerType((Type)containerType.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, AllHLAPI containerAll
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerAll!=null)
			item.setContainerAll((All)containerAll.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, EmptyHLAPI containerEmpty
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerEmpty!=null)
			item.setContainerEmpty((Empty)containerEmpty.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, PartitionHLAPI containerPartition
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerPartition!=null)
			item.setContainerPartition((Partition)containerPartition.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, HLPNListHLAPI containerList
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerList!=null)
			item.setContainerList((HLPNList)containerList.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, EmptyListHLAPI containerEmptyList
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerEmptyList!=null)
			item.setContainerEmptyList((EmptyList)containerEmptyList.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnySortHLAPI(
		 AnyObjectHLAPI anySortModel
	
		, MakeListHLAPI containerMakeList
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(anySortModel!=null)
			item.setAnySortModel((AnyObject)anySortModel.getContainedItem());
		
	
 		
 		if(containerMakeList!=null)
			item.setContainerMakeList((MakeList)containerMakeList.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 MultisetSortHLAPI multi
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(multi!=null)
			item.setMulti((MultisetSort)multi.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 NamedSortHLAPI containerNamedSort
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerNamedSort!=null)
			item.setContainerNamedSort((NamedSort)containerNamedSort.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 VariableDeclHLAPI containerVariableDecl
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerVariableDecl!=null)
			item.setContainerVariableDecl((VariableDecl)containerVariableDecl.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 ProductSortHLAPI containerProductSort
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerProductSort!=null)
			item.setContainerProductSort((ProductSort)containerProductSort.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 TypeHLAPI containerType
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerType!=null)
			item.setContainerType((Type)containerType.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 AllHLAPI containerAll
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerAll!=null)
			item.setContainerAll((All)containerAll.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 EmptyHLAPI containerEmpty
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerEmpty!=null)
			item.setContainerEmpty((Empty)containerEmpty.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 PartitionHLAPI containerPartition
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerPartition!=null)
			item.setContainerPartition((Partition)containerPartition.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 HLPNListHLAPI containerList
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerList!=null)
			item.setContainerList((HLPNList)containerList.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 EmptyListHLAPI containerEmptyList
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerEmptyList!=null)
			item.setContainerEmptyList((EmptyList)containerEmptyList.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnySortHLAPI(
		 MakeListHLAPI containerMakeList
	){//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnySort();}
	
 		
 		if(containerMakeList!=null)
			item.setContainerMakeList((MakeList)containerMakeList.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public AnySortHLAPI(AnySort lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public AnySort getContainedItem(){
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
	public AnyObject getAnySortModel(){
		return item.getAnySortModel();
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
		
		

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set AnySortModel
	 */
	public void setAnySortModelHLAPI(
	
	AnyObjectHLAPI elem){
	
	
 		if(elem!=null)
			item.setAnySortModel((AnyObject)elem.getContainedItem());
	
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
	public boolean equals(AnySortHLAPI item){
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