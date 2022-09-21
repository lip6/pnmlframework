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
package fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class FiniteIntRangeHLAPITest {

	
	private Long itemstart;
		
	private Long itemend;
		
	
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
	
	private FiniteIntRangeConstantHLAPI itemcontainerFiniteIntRangeConstant;
	


	@AfterTest(groups = { "FiniteIntRangeHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FiniteIntRangeHLAPI(finiteIntRanges)");
	}


	@BeforeMethod(groups = { "FiniteIntRangeHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemstart = new Long("0");
			
			itemend = new Long("0");
			

	
		
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
		
	
		
		itemcontainerFiniteIntRangeConstant = new FiniteIntRangeConstantHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	);
	
	
	assert totest.getStart().equals(itemstart);
	
	
	
	assert totest.getEnd().equals(itemend);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemmulti
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerNamedSort
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerVariableDecl
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerProductSort
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerType
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerAll
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerEmpty
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerPartition
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerList
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerEmptyList
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerMakeList
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"}, dependsOnMethods={"FiniteIntRangeHLAPI_LLAPI"})
	public void FiniteIntRangeHLAPI_2_containerFiniteIntRangeConstant(){//BEGIN CONSTRUCTOR BODY

	FiniteIntRangeHLAPI totest = new FiniteIntRangeHLAPI(
		itemstart
		,	
		itemend
	,	
		itemcontainerFiniteIntRangeConstant
	);
	
	
			assert totest.getStart().equals(itemstart);
		
	
	
			assert totest.getEnd().equals(itemend);
		
	
	assert totest.getContainerFiniteIntRangeConstant().equals(itemcontainerFiniteIntRangeConstant.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
	public void FiniteIntRangeHLAPI_LLAPI(){
	   FiniteIntRange llapi = new FiniteIntRangesFactoryImpl().createFiniteIntRange();
	   fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI hlapi = new FiniteIntRangeHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getMultiHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerProductSortHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerTypeHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerAllHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerEmptyHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerPartitionHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerListHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerMakeListHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
		public void getContainerFiniteIntRangeConstantHLAPITest(){
			FiniteIntRangeHLAPI elem = new FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange());

			
				elem.setContainerFiniteIntRangeConstantHLAPI(itemcontainerFiniteIntRangeConstant);
				FiniteIntRangeConstantHLAPI totest = elem.getContainerFiniteIntRangeConstantHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerFiniteIntRangeConstant());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "FiniteIntRangeHLAPI"})
	public void equalsTest(){
		FiniteIntRange a = new FiniteIntRangesFactoryImpl().createFiniteIntRange();
		FiniteIntRange b = new FiniteIntRangesFactoryImpl().createFiniteIntRange();
		FiniteIntRangeHLAPI aprime = new FiniteIntRangeHLAPI(a);
		FiniteIntRangeHLAPI asecond = new FiniteIntRangeHLAPI(a);
		FiniteIntRangeHLAPI bprime = new FiniteIntRangeHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FiniteIntRangeHLAPI clone(){
	//	return new FiniteIntRangeHLAPI(this);
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
