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
 * $Id ggiffo, Thu Feb 11 16:29:58 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;


public class DimensionHLAPI implements HLAPIClass,CoordinateHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Dimension item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public DimensionHLAPI(
		 java.lang.Integer x
	
		, java.lang.Integer y
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDimension();}
	
 		
			if(x!=null){
			
				item.setX(x);
			}
		
	
 		
			if(y!=null){
			
				item.setY(y);
			}
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public DimensionHLAPI(
		 java.lang.Integer x
	
		, java.lang.Integer y
	
		, NodeGraphicsHLAPI containerDNodeGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDimension();}
	
 		
			if(x!=null){
			
				item.setX(x);
			}
		
	
 		
			if(y!=null){
			
				item.setY(y);
			}
		
	
 		
 		if(containerDNodeGraphics!=null)
			item.setContainerDNodeGraphics((NodeGraphics)containerDNodeGraphics.getContainedItem());
		
	
	}



	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public DimensionHLAPI(Dimension lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Dimension getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Integer getX(){
		return item.getX();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Integer getY(){
		return item.getY();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NodeGraphics getContainerDNodeGraphics(){
		return item.getContainerDNodeGraphics();
	}
	

	//getters giving HLAPI object
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NodeGraphicsHLAPI getContainerDNodeGraphicsHLAPI(){
			if(item.getContainerDNodeGraphics() == null) return null;
			return new NodeGraphicsHLAPI(item.getContainerDNodeGraphics());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set X
	 */
	public void setXHLAPI(
	
	java.lang.Integer elem){
	
	
		if(elem!=null){
		
			item.setX(elem);
		}
	
	}
	
	/**
	 * set Y
	 */
	public void setYHLAPI(
	
	java.lang.Integer elem){
	
	
		if(elem!=null){
		
			item.setY(elem);
		}
	
	}
	
	/**
	 * set ContainerDNodeGraphics
	 */
	public void setContainerDNodeGraphicsHLAPI(
	
	NodeGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerDNodeGraphics((NodeGraphics)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(DimensionHLAPI item){
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