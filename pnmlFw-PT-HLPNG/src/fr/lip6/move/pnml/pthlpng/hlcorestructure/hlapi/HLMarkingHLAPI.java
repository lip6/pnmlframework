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
 * $Id ggiffo, Tue Dec 23 11:30:49 CET 2014$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

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
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Place;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.TermHLAPI;


public class HLMarkingHLAPI implements HLAPIClass,LabelHLAPI,AnnotationHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private HLMarking item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public HLMarkingHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, TermHLAPI structure
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createHLMarking();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(structure!=null)
			item.setStructure((Term)structure.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public HLMarkingHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, TermHLAPI structure
	
		, PlaceHLAPI containerPlace
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createHLMarking();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(structure!=null)
			item.setStructure((Term)structure.getContainedItem());
		
	
 		
 		if(containerPlace!=null)
			item.setContainerPlace((Place)containerPlace.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public HLMarkingHLAPI(
		 PlaceHLAPI containerPlace
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createHLMarking();}
	
 		
 		if(containerPlace!=null)
			item.setContainerPlace((Place)containerPlace.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public HLMarkingHLAPI(HLMarking lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public HLMarking getContainedItem(){
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
	public Term getStructure(){
		return item.getStructure();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Place getContainerPlace(){
		return item.getContainerPlace();
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
		
		
		public TermHLAPI getStructureHLAPI(){
			if(item.getStructure() == null) return null;
			Term object = item.getStructure();
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.EqualityImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Equality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.InequalityImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Inequality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BooleanConstantImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI((fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.OrImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Or)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.AndImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI((fr.lip6.move.pnml.pthlpng.booleans.And)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.ImplyImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Imply)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.NotImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Not)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotConstantImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI((fr.lip6.move.pnml.pthlpng.dots.DotConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Cardinality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ContainsImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Contains)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityOfImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI((fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AddImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Add)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AllImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI((fr.lip6.move.pnml.pthlpng.multisets.All)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.EmptyImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Empty)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.NumberOfImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI((fr.lip6.move.pnml.pthlpng.multisets.NumberOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.SubtractImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Subtract)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ScalarProductImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI((fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.pthlpng.partitions.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionElementOfImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI((fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI((fr.lip6.move.pnml.pthlpng.partitions.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI((fr.lip6.move.pnml.pthlpng.terms.Variable)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI((fr.lip6.move.pnml.pthlpng.terms.Tuple)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI((fr.lip6.move.pnml.pthlpng.terms.UserOperator)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PlaceHLAPI getContainerPlaceHLAPI(){
			if(item.getContainerPlace() == null) return null;
			return new PlaceHLAPI(item.getContainerPlace());
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
	
	TermHLAPI elem){
	
	
 		if(elem!=null)
			item.setStructure((Term)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPlace
	 */
	public void setContainerPlaceHLAPI(
	
	PlaceHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPlace((Place)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addToolspecificsHLAPI(ToolInfoHLAPI unit){
	
		item.getToolspecifics().add((ToolInfo)unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit){
		item.getToolspecifics().remove((ToolInfo)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(HLMarkingHLAPI item){
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