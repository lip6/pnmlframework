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
 * $Id ggiffo, Tue Dec 23 11:30:46 CET 2014$
 */
package fr.lip6.move.pnml.ptnet.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;


public class PositionHLAPI implements HLAPIClass,CoordinateHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Position item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public PositionHLAPI(
		 java.lang.Integer x
	
		, java.lang.Integer y
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPosition();}
	
 		
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
	
	public PositionHLAPI(
		 java.lang.Integer x
	
		, java.lang.Integer y
	
		, ArcGraphicsHLAPI containerArcGraphics
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPosition();}
	
 		
			if(x!=null){
			
				item.setX(x);
			}
		
	
 		
			if(y!=null){
			
				item.setY(y);
			}
		
	
 		
 		if(containerArcGraphics!=null)
			item.setContainerArcGraphics((ArcGraphics)containerArcGraphics.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public PositionHLAPI(
		 java.lang.Integer x
	
		, java.lang.Integer y
	
		, NodeGraphicsHLAPI containerPNodeGraphics
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPosition();}
	
 		
			if(x!=null){
			
				item.setX(x);
			}
		
	
 		
			if(y!=null){
			
				item.setY(y);
			}
		
	
 		
 		if(containerPNodeGraphics!=null)
			item.setContainerPNodeGraphics((NodeGraphics)containerPNodeGraphics.getContainedItem());
		
	
	}



	
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public PositionHLAPI(Position lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Position getContainedItem(){
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
	public ArcGraphics getContainerArcGraphics(){
		return item.getContainerArcGraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NodeGraphics getContainerPNodeGraphics(){
		return item.getContainerPNodeGraphics();
	}
	

	//getters giving HLAPI object
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ArcGraphicsHLAPI getContainerArcGraphicsHLAPI(){
			if(item.getContainerArcGraphics() == null) return null;
			return new ArcGraphicsHLAPI(item.getContainerArcGraphics());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NodeGraphicsHLAPI getContainerPNodeGraphicsHLAPI(){
			if(item.getContainerPNodeGraphics() == null) return null;
			return new NodeGraphicsHLAPI(item.getContainerPNodeGraphics());
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
	 * set ContainerArcGraphics
	 */
	public void setContainerArcGraphicsHLAPI(
	
	ArcGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerArcGraphics((ArcGraphics)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPNodeGraphics
	 */
	public void setContainerPNodeGraphicsHLAPI(
	
	NodeGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPNodeGraphics((NodeGraphics)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(PositionHLAPI item){
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