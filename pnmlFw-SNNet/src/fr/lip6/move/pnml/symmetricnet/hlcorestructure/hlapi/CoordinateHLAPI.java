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
 * $Id ggiffo, Wed Feb 10 14:59:11 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;

public interface CoordinateHLAPI extends HLAPIClass{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public Integer getX();
	
	/**
	 *
	 */
	public Integer getY();
	

	//getters giving HLAPI object
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set X
	 */
	public void setXHLAPI(
	java.lang.Integer elem);
	
	/**
	 * set Y
	 */
	public void setYHLAPI(
	java.lang.Integer elem);
	

	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}