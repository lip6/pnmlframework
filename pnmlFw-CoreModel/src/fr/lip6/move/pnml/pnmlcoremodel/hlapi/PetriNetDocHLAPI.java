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

import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pnmlcoremodel.*;
import fr.lip6.move.pnml.pnmlcoremodel.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;


public class PetriNetDocHLAPI implements HLAPIRootClass{

	/**
	 * The contained LLAPI element.
	 */
	private PetriNetDoc item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public PetriNetDocHLAPI(){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPetriNetDoc();}
	
	}




	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public PetriNetDocHLAPI(PetriNetDoc lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public PetriNetDoc getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<PetriNet> getNets(){
		return item.getNets();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getXmlns(){
		return item.getXmlns();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<PetriNetHLAPI> getNetsHLAPI(){
			java.util.List<PetriNetHLAPI> retour = new ArrayList<PetriNetHLAPI>();
			for (PetriNet elemnt : getNets()) {
				retour.add(new PetriNetHLAPI(elemnt));
			}
			return retour;
		}
	
	
	
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters (including container setter if aviable)
	
	

	//setters/remover for lists.
	
	
	public void addNetsHLAPI(PetriNetHLAPI unit){
	
		item.getNets().add((PetriNet)unit.getContainedItem());
	}

	public void removeNetsHLAPI(PetriNetHLAPI unit){
		item.getNets().remove((PetriNet)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(PetriNetDocHLAPI item){
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