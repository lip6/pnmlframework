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
 * $Id ggiffo, Thu Feb 11 16:29:03 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;

public interface SortHLAPI extends HLAPIClass{

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
	

	
	
	
	
	
	
	
	
	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}