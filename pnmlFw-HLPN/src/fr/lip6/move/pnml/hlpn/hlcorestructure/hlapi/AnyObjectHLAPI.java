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
package fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;

public interface AnyObjectHLAPI extends HLAPIClass{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public ToolInfo getContainerToolInfo();
	
	/**
	 *
	 */
	public Unparsed getContainerUnparsed();
	
	/**
	 *
	 */
	public AnySort getContainerAnySort();
	
	/**
	 *
	 */
	public ArbitrarySort getContainerArbitrarySort();
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public ToolInfoHLAPI getContainerToolInfoHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public UnparsedHLAPI getContainerUnparsedHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public AnySortHLAPI getContainerAnySortHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public ArbitrarySortHLAPI getContainerArbitrarySortHLAPI();
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set ContainerAnySort
	 */
	public void setContainerAnySortHLAPI(
	AnySortHLAPI elem);
	
	/**
	 * set ContainerArbitrarySort
	 */
	public void setContainerArbitrarySortHLAPI(
	ArbitrarySortHLAPI elem);
	
	/**
	 * set ContainerUnparsed
	 */
	public void setContainerUnparsedHLAPI(
	UnparsedHLAPI elem);
	

	
	
	
	
	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}