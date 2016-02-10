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
 * $Id ggiffo, Wed Feb 10 14:59:13 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.dots.hlapi;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.booleans.And;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.BooleanConstant;
import fr.lip6.move.pnml.hlpn.booleans.Equality;
import fr.lip6.move.pnml.hlpn.booleans.Imply;
import fr.lip6.move.pnml.hlpn.booleans.Inequality;
import fr.lip6.move.pnml.hlpn.booleans.Not;
import fr.lip6.move.pnml.hlpn.booleans.Or;

import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.dots.Dot;

import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.MakeList;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Empty;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.*;
import fr.lip6.move.pnml.hlpn.booleans.hlapi.*;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.dots.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.hlpn.integers.hlapi.*;
import fr.lip6.move.pnml.hlpn.lists.hlapi.*;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.*;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.*;
import fr.lip6.move.pnml.hlpn.strings.hlapi.*;
import fr.lip6.move.pnml.hlpn.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.hlpn.dots.*;
import fr.lip6.move.pnml.hlpn.dots.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class DotHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	
	private HLPNListHLAPI itemcontainerList;
	
	private EmptyListHLAPI itemcontainerEmptyList;
	
	private MakeListHLAPI itemcontainerMakeList;
	


	@AfterTest(groups = { "DotHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"DotHLAPI(dots)");
	}


	@BeforeMethod(groups = { "DotHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	

	
		
		itemmulti = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());
		
	
		
		itemcontainerNamedSort = new NamedSortHLAPI(new TermsFactoryImpl().createNamedSort());
		
	
		
		itemcontainerVariableDecl = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
		
	
		
		itemcontainerProductSort = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		
	
		
		itemcontainerType = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
		
	
		
		itemcontainerAll = new AllHLAPI(new MultisetsFactoryImpl().createAll());
		
	
		
		itemcontainerEmpty = new EmptyHLAPI(new MultisetsFactoryImpl().createEmpty());
		
	
		
		itemcontainerPartition = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		
	
		
		itemcontainerList = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());
		
	
		
		itemcontainerEmptyList = new EmptyListHLAPI(new ListsFactoryImpl().createEmptyList());
		
	
		
		itemcontainerMakeList = new MakeListHLAPI(new ListsFactoryImpl().createMakeList());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	DotHLAPI totest = new DotHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerProductSort
	);
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerList
	);
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerEmptyList
	);
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"}, dependsOnMethods={"DotHLAPI_LLAPI"})
	public void DotHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	DotHLAPI totest = new DotHLAPI(
		itemcontainerMakeList
	);
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"})
	public void DotHLAPI_LLAPI(){
	   Dot llapi = new DotsFactoryImpl().createDot();
	   fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI hlapi = new DotHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getMultiHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerProductSortHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerTypeHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerAllHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerEmptyHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerPartitionHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerListHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotHLAPI"})
		public void getContainerMakeListHLAPITest(){
			DotHLAPI elem = new DotHLAPI(new DotsFactoryImpl().createDot());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "DotHLAPI"})
	public void equalsTest(){
		Dot a = new DotsFactoryImpl().createDot();
		Dot b = new DotsFactoryImpl().createDot();
		DotHLAPI aprime = new DotHLAPI(a);
		DotHLAPI asecond = new DotHLAPI(a);
		DotHLAPI bprime = new DotHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public DotHLAPI clone(){
	//	return new DotHLAPI(this);
	//}

	//PNML
	
	/**
	 * return the PNML xml tree for this object.
	 */
	//public String toPNML(){
		//return item.toPNML();
	//}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	//public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{
		//item.fromPNML(subRoot,idr);
	//}
	
}
