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
package fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesFactory;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
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
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI;


public class FiniteIntRangeHLAPI implements HLAPIClass,SortHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private FiniteIntRange item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, MultisetSortHLAPI multi
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(multi!=null)
			item.setMulti((MultisetSort)multi.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, NamedSortHLAPI containerNamedSort
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerNamedSort!=null)
			item.setContainerNamedSort((NamedSort)containerNamedSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, VariableDeclHLAPI containerVariableDecl
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerVariableDecl!=null)
			item.setContainerVariableDecl((VariableDecl)containerVariableDecl.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, ProductSortHLAPI containerProductSort
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerProductSort!=null)
			item.setContainerProductSort((ProductSort)containerProductSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, TypeHLAPI containerType
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerType!=null)
			item.setContainerType((Type)containerType.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, AllHLAPI containerAll
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerAll!=null)
			item.setContainerAll((All)containerAll.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, EmptyHLAPI containerEmpty
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerEmpty!=null)
			item.setContainerEmpty((Empty)containerEmpty.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, PartitionHLAPI containerPartition
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerPartition!=null)
			item.setContainerPartition((Partition)containerPartition.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FiniteIntRangeHLAPI(
		 java.lang.Long start
	
		, java.lang.Long end
	
		, FiniteIntRangeConstantHLAPI containerFiniteIntRangeConstant
	){//BEGIN CONSTRUCTOR BODY
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFiniteIntRange();}
	
 		
			if(start!=null){
			
				item.setStart(start);
			}
		
	
 		
			if(end!=null){
			
				item.setEnd(end);
			}
		
	
 		
 		if(containerFiniteIntRangeConstant!=null)
			item.setContainerFiniteIntRangeConstant((FiniteIntRangeConstant)containerFiniteIntRangeConstant.getContainedItem());
		
	
	}



	
	
	
	
	
	
	
	
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public FiniteIntRangeHLAPI(FiniteIntRange lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public FiniteIntRange getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public MultisetSort getMulti(){
		return item.getMulti();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedSort getContainerNamedSort(){
		return item.getContainerNamedSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public VariableDecl getContainerVariableDecl(){
		return item.getContainerVariableDecl();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public ProductSort getContainerProductSort(){
		return item.getContainerProductSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Type getContainerType(){
		return item.getContainerType();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public All getContainerAll(){
		return item.getContainerAll();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Empty getContainerEmpty(){
		return item.getContainerEmpty();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Partition getContainerPartition(){
		return item.getContainerPartition();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Long getStart(){
		return item.getStart();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Long getEnd(){
		return item.getEnd();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public FiniteIntRangeConstant getContainerFiniteIntRangeConstant(){
		return item.getContainerFiniteIntRangeConstant();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public MultisetSortHLAPI getMultiHLAPI(){
			if(item.getMulti() == null) return null;
			return new MultisetSortHLAPI(item.getMulti());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NamedSortHLAPI getContainerNamedSortHLAPI(){
			if(item.getContainerNamedSort() == null) return null;
			return new NamedSortHLAPI(item.getContainerNamedSort());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public VariableDeclHLAPI getContainerVariableDeclHLAPI(){
			if(item.getContainerVariableDecl() == null) return null;
			return new VariableDeclHLAPI(item.getContainerVariableDecl());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ProductSortHLAPI getContainerProductSortHLAPI(){
			if(item.getContainerProductSort() == null) return null;
			return new ProductSortHLAPI(item.getContainerProductSort());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public TypeHLAPI getContainerTypeHLAPI(){
			if(item.getContainerType() == null) return null;
			return new TypeHLAPI(item.getContainerType());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public AllHLAPI getContainerAllHLAPI(){
			if(item.getContainerAll() == null) return null;
			return new AllHLAPI(item.getContainerAll());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public EmptyHLAPI getContainerEmptyHLAPI(){
			if(item.getContainerEmpty() == null) return null;
			return new EmptyHLAPI(item.getContainerEmpty());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PartitionHLAPI getContainerPartitionHLAPI(){
			if(item.getContainerPartition() == null) return null;
			return new PartitionHLAPI(item.getContainerPartition());
		}
		
	
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public FiniteIntRangeConstantHLAPI getContainerFiniteIntRangeConstantHLAPI(){
			if(item.getContainerFiniteIntRangeConstant() == null) return null;
			return new FiniteIntRangeConstantHLAPI(item.getContainerFiniteIntRangeConstant());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Start
	 */
	public void setStartHLAPI(
	
	java.lang.Long elem){
	
	
		if(elem!=null){
		
			item.setStart(elem);
		}
	
	}
	
	/**
	 * set End
	 */
	public void setEndHLAPI(
	
	java.lang.Long elem){
	
	
		if(elem!=null){
		
			item.setEnd(elem);
		}
	
	}
	
	/**
	 * set Multi
	 */
	public void setMultiHLAPI(
	
	MultisetSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setMulti((MultisetSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerNamedSort
	 */
	public void setContainerNamedSortHLAPI(
	
	NamedSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamedSort((NamedSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerVariableDecl
	 */
	public void setContainerVariableDeclHLAPI(
	
	VariableDeclHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerVariableDecl((VariableDecl)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerProductSort
	 */
	public void setContainerProductSortHLAPI(
	
	ProductSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerProductSort((ProductSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerType
	 */
	public void setContainerTypeHLAPI(
	
	TypeHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerType((Type)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerAll
	 */
	public void setContainerAllHLAPI(
	
	AllHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerAll((All)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerEmpty
	 */
	public void setContainerEmptyHLAPI(
	
	EmptyHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerEmpty((Empty)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPartition
	 */
	public void setContainerPartitionHLAPI(
	
	PartitionHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPartition((Partition)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerFiniteIntRangeConstant
	 */
	public void setContainerFiniteIntRangeConstantHLAPI(
	
	FiniteIntRangeConstantHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerFiniteIntRangeConstant((FiniteIntRangeConstant)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(FiniteIntRangeHLAPI item){
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