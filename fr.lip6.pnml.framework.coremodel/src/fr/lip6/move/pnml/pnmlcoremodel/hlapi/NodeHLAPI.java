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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6/MoVe)
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
 * $Id ggiffo, Wed Feb 10 14:59:10 CET 2016$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import java.util.List;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;

public interface NodeHLAPI extends HLAPIClass,PnObjectHLAPI{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public String getId();
	
	/**
	 *
	 */
	public Name getName();
	
	/**
	 *
	 */
	public List<ToolInfo> getToolspecifics();
	
	/**
	 *
	 */
	public Page getContainerPage();
	
	/**
	 *
	 */
	public List<Arc> getInArcs();
	
	/**
	 *
	 */
	public List<Arc> getOutArcs();
	
	/**
	 *
	 */
	public NodeGraphics getNodegraphics();
	

	//getters giving HLAPI object
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public NameHLAPI getNameHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<ToolInfoHLAPI> getToolspecificsHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public PageHLAPI getContainerPageHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<ArcHLAPI> getInArcsHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<ArcHLAPI> getOutArcsHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public NodeGraphicsHLAPI getNodegraphicsHLAPI();
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Id
	 */
	public void setIdHLAPI(
	java.lang.String elem) throws InvalidIDException ,VoidRepositoryException;
	
	/**
	 * set Name
	 */
	public void setNameHLAPI(
	NameHLAPI elem);
	
	/**
	 * set Nodegraphics
	 */
	public void setNodegraphicsHLAPI(
	NodeGraphicsHLAPI elem);
	
	/**
	 * set ContainerPage
	 */
	public void setContainerPageHLAPI(
	PageHLAPI elem);
	

	
	
	
	
	
	
	


	//setters/remover for lists.
	
	public void addToolspecificsHLAPI(ToolInfoHLAPI unit);
	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit);
	

	//equals method
	public boolean equals(Object item);

}