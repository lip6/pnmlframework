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
 * $Id ggiffo, Thu Feb 11 16:29:03 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ConditionHLAPI;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.HLAnnotationHLAPI;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.HLMarkingHLAPI;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;

public interface TermHLAPI extends HLAPIClass{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public Sort getSort();
	
	/**
	 *
	 */
	public Operator getContainerOperator();
	
	/**
	 *
	 */
	public NamedOperator getContainerNamedOperator();
	
	/**
	 *
	 */
	public HLMarking getContainerHLMarking();
	
	/**
	 *
	 */
	public Condition getContainerCondition();
	
	/**
	 *
	 */
	public HLAnnotation getContainerHLAnnotation();
	
	/**
	 *
	 */
	public PartitionElement getContainerPartitionElement();
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		
		public SortHLAPI getSortHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		
		public OperatorHLAPI getContainerOperatorHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public NamedOperatorHLAPI getContainerNamedOperatorHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public HLMarkingHLAPI getContainerHLMarkingHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public ConditionHLAPI getContainerConditionHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public HLAnnotationHLAPI getContainerHLAnnotationHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public PartitionElementHLAPI getContainerPartitionElementHLAPI();
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Sort
	 */
	public void setSortHLAPI(
	SortHLAPI elem);
	
	/**
	 * set ContainerOperator
	 */
	public void setContainerOperatorHLAPI(
	OperatorHLAPI elem);
	
	/**
	 * set ContainerNamedOperator
	 */
	public void setContainerNamedOperatorHLAPI(
	NamedOperatorHLAPI elem);
	
	/**
	 * set ContainerHLMarking
	 */
	public void setContainerHLMarkingHLAPI(
	HLMarkingHLAPI elem);
	
	/**
	 * set ContainerCondition
	 */
	public void setContainerConditionHLAPI(
	ConditionHLAPI elem);
	
	/**
	 * set ContainerHLAnnotation
	 */
	public void setContainerHLAnnotationHLAPI(
	HLAnnotationHLAPI elem);
	
	/**
	 * set ContainerPartitionElement
	 */
	public void setContainerPartitionElementHLAPI(
	PartitionElementHLAPI elem);
	

	
	
	
	
	
	
	
	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}