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
 * $Id ggiffo, Thu Feb 11 16:29:58 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.integers.hlapi;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.hlpn.integers.NumberConstant;
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

public interface HLPNNumberHLAPI extends HLAPIClass,SortHLAPI{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public MultisetSort getMulti();
	
	/**
	 *
	 */
	public NamedSort getContainerNamedSort();
	
	/**
	 *
	 */
	public VariableDecl getContainerVariableDecl();
	
	/**
	 *
	 */
	public ProductSort getContainerProductSort();
	
	/**
	 *
	 */
	public Type getContainerType();
	
	/**
	 *
	 */
	public All getContainerAll();
	
	/**
	 *
	 */
	public Empty getContainerEmpty();
	
	/**
	 *
	 */
	public Partition getContainerPartition();
	
	/**
	 *
	 */
	public HLPNList getContainerList();
	
	/**
	 *
	 */
	public EmptyList getContainerEmptyList();
	
	/**
	 *
	 */
	public MakeList getContainerMakeList();
	
	/**
	 *
	 */
	public NumberConstant getContainerNumberConstant();
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public MultisetSortHLAPI getMultiHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public NamedSortHLAPI getContainerNamedSortHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public VariableDeclHLAPI getContainerVariableDeclHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public ProductSortHLAPI getContainerProductSortHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public TypeHLAPI getContainerTypeHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public AllHLAPI getContainerAllHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public EmptyHLAPI getContainerEmptyHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public PartitionHLAPI getContainerPartitionHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public HLPNListHLAPI getContainerListHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public EmptyListHLAPI getContainerEmptyListHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public MakeListHLAPI getContainerMakeListHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public NumberConstantHLAPI getContainerNumberConstantHLAPI();
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Multi
	 */
	public void setMultiHLAPI(
	MultisetSortHLAPI elem);
	
	/**
	 * set ContainerNamedSort
	 */
	public void setContainerNamedSortHLAPI(
	NamedSortHLAPI elem);
	
	/**
	 * set ContainerVariableDecl
	 */
	public void setContainerVariableDeclHLAPI(
	VariableDeclHLAPI elem);
	
	/**
	 * set ContainerProductSort
	 */
	public void setContainerProductSortHLAPI(
	ProductSortHLAPI elem);
	
	/**
	 * set ContainerType
	 */
	public void setContainerTypeHLAPI(
	TypeHLAPI elem);
	
	/**
	 * set ContainerAll
	 */
	public void setContainerAllHLAPI(
	AllHLAPI elem);
	
	/**
	 * set ContainerEmpty
	 */
	public void setContainerEmptyHLAPI(
	EmptyHLAPI elem);
	
	/**
	 * set ContainerPartition
	 */
	public void setContainerPartitionHLAPI(
	PartitionHLAPI elem);
	
	/**
	 * set ContainerList
	 */
	public void setContainerListHLAPI(
	HLPNListHLAPI elem);
	
	/**
	 * set ContainerEmptyList
	 */
	public void setContainerEmptyListHLAPI(
	EmptyListHLAPI elem);
	
	/**
	 * set ContainerMakeList
	 */
	public void setContainerMakeListHLAPI(
	MakeListHLAPI elem);
	
	/**
	 * set ContainerNumberConstant
	 */
	public void setContainerNumberConstantHLAPI(
	NumberConstantHLAPI elem);
	

	
	
	
	
	
	
	
	
	
	
	
	
	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}