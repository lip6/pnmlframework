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

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.terms.Declarations;

public interface SortDeclHLAPI extends HLAPIClass,TermsDeclarationHLAPI{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public String getId();
	
	/**
	 *
	 */
	public String getName();
	
	/**
	 *
	 */
	public Declarations getContainerDeclarations();
	

	//getters giving HLAPI object
	
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public DeclarationsHLAPI getContainerDeclarationsHLAPI();
		
	
	

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
	java.lang.String elem);
	
	/**
	 * set ContainerDeclarations
	 */
	public void setContainerDeclarationsHLAPI(
	DeclarationsHLAPI elem);
	

	
	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}