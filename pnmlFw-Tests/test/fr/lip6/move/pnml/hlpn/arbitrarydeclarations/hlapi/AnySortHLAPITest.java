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
 * $Id ggiffo, Tue Dec 23 11:30:48 CET 2014$
 */
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.AnyObjectHLAPI;
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
public class AnySortHLAPITest {

	
	private AnyObjectHLAPI itemanySortModel;
		
	
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
	


	@AfterTest(groups = { "AnySortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"AnySortHLAPI(arbitrarydeclarations)");
	}


	@BeforeMethod(groups = { "AnySortHLAPI", "hlapi" })
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
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	);
	
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemmulti
	);
	
	
		
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerNamedSort
	);
	
	
		
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerVariableDecl
	);
	
	
		
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerProductSort
	);
	
	
		
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerType
	);
	
	
		
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerAll
	);
	
	
		
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerEmpty
	);
	
	
		
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerPartition
	);
	
	
		
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerList
	);
	
	
		
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerEmptyList
	);
	
	
		
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
		itemanySortModel
	,	
		itemcontainerMakeList
	);
	
	
		
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_multi(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemmulti
	);

	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerNamedSort
	);

	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerVariableDecl
	);

	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerProductSort
	);

	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerType(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerType
	);

	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerAll(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerAll
	);

	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerEmpty
	);

	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerPartition(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerPartition
	);

	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerList(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerList
	);

	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerEmptyList
	);

	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnySortHLAPI"}, dependsOnMethods={"AnySortHLAPI_LLAPI"})
	public void AnySortHLAPI_4_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	AnySortHLAPI totest = new AnySortHLAPI(
	  itemcontainerMakeList
	);

	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "AnySortHLAPI"})
	public void AnySortHLAPI_LLAPI(){
	   AnySort llapi = new ArbitrarydeclarationsFactoryImpl().createAnySort();
	   fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI hlapi = new AnySortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getMultiHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerTypeHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerAllHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerListHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnySortHLAPI"})
		public void getContainerMakeListHLAPITest(){
			AnySortHLAPI elem = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "AnySortHLAPI"})
	public void equalsTest(){
		AnySort a = new ArbitrarydeclarationsFactoryImpl().createAnySort();
		AnySort b = new ArbitrarydeclarationsFactoryImpl().createAnySort();
		AnySortHLAPI aprime = new AnySortHLAPI(a);
		AnySortHLAPI asecond = new AnySortHLAPI(a);
		AnySortHLAPI bprime = new AnySortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public AnySortHLAPI clone(){
	//	return new AnySortHLAPI(this);
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
