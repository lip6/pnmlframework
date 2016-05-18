/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
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
 * $Id ggiffo, Thu Feb 11 16:29:02 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.DeclarationsHLAPI;


public class DeclarationHLAPI implements HLAPIClass,LabelHLAPI,AnnotationHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Declaration item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public DeclarationHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, DeclarationsHLAPI structure
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclaration();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(structure!=null)
			item.setStructure((Declarations)structure.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public DeclarationHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, DeclarationsHLAPI structure
	
		, PetriNetHLAPI containerDeclarationPetriNet
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclaration();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(structure!=null)
			item.setStructure((Declarations)structure.getContainedItem());
		
	
 		
 		if(containerDeclarationPetriNet!=null)
			item.setContainerDeclarationPetriNet((PetriNet)containerDeclarationPetriNet.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public DeclarationHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, DeclarationsHLAPI structure
	
		, PageHLAPI containerDeclarationPage
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclaration();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(structure!=null)
			item.setStructure((Declarations)structure.getContainedItem());
		
	
 		
 		if(containerDeclarationPage!=null)
			item.setContainerDeclarationPage((Page)containerDeclarationPage.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public DeclarationHLAPI(
		 PetriNetHLAPI containerDeclarationPetriNet
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclaration();}
	
 		
 		if(containerDeclarationPetriNet!=null)
			item.setContainerDeclarationPetriNet((PetriNet)containerDeclarationPetriNet.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public DeclarationHLAPI(
		 PageHLAPI containerDeclarationPage
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclaration();}
	
 		
 		if(containerDeclarationPage!=null)
			item.setContainerDeclarationPage((Page)containerDeclarationPage.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public DeclarationHLAPI(Declaration lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Declaration getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<ToolInfo> getToolspecifics(){
		return item.getToolspecifics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public AnnotationGraphics getAnnotationgraphics(){
		return item.getAnnotationgraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getText(){
		return item.getText();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Declarations getStructure(){
		return item.getStructure();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PetriNet getContainerDeclarationPetriNet(){
		return item.getContainerDeclarationPetriNet();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Page getContainerDeclarationPage(){
		return item.getContainerDeclarationPage();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<ToolInfoHLAPI> getToolspecificsHLAPI(){
			java.util.List<ToolInfoHLAPI> retour = new ArrayList<ToolInfoHLAPI>();
			for (ToolInfo elemnt : getToolspecifics()) {
				retour.add(new ToolInfoHLAPI(elemnt));
			}
			return retour;
		}
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public AnnotationGraphicsHLAPI getAnnotationgraphicsHLAPI(){
			if(item.getAnnotationgraphics() == null) return null;
			return new AnnotationGraphicsHLAPI(item.getAnnotationgraphics());
		}
		
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public DeclarationsHLAPI getStructureHLAPI(){
			if(item.getStructure() == null) return null;
			return new DeclarationsHLAPI(item.getStructure());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PetriNetHLAPI getContainerDeclarationPetriNetHLAPI(){
			if(item.getContainerDeclarationPetriNet() == null) return null;
			return new PetriNetHLAPI(item.getContainerDeclarationPetriNet());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PageHLAPI getContainerDeclarationPageHLAPI(){
			if(item.getContainerDeclarationPage() == null) return null;
			return new PageHLAPI(item.getContainerDeclarationPage());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Annotationgraphics
	 */
	public void setAnnotationgraphicsHLAPI(
	
	AnnotationGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setAnnotationgraphics((AnnotationGraphics)elem.getContainedItem());
	
	}
	
	/**
	 * set Text
	 */
	public void setTextHLAPI(
	
	java.lang.String elem){
	
	
		if(elem!=null){
		
			item.setText(elem);
		}
	
	}
	
	/**
	 * set Structure
	 */
	public void setStructureHLAPI(
	
	DeclarationsHLAPI elem){
	
	
 		if(elem!=null)
			item.setStructure((Declarations)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerDeclarationPetriNet
	 */
	public void setContainerDeclarationPetriNetHLAPI(
	
	PetriNetHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerDeclarationPetriNet((PetriNet)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerDeclarationPage
	 */
	public void setContainerDeclarationPageHLAPI(
	
	PageHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerDeclarationPage((Page)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addToolspecificsHLAPI(ToolInfoHLAPI unit){
	
		item.getToolspecifics().add((ToolInfo)unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit){
		item.getToolspecifics().remove((ToolInfo)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(DeclarationHLAPI item){
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