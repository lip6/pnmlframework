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
package fr.lip6.move.pnml.hlpn.lists.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class HLPNListHLAPITest {

	
	private SortHLAPI itembasis;
		
	
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
	


	@AfterTest(groups = { "HLPNListHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"HLPNListHLAPI(lists)");
	}


	@BeforeMethod(groups = { "HLPNListHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itembasis = new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(
				new ListsFactoryImpl().createHLPNList()
			);
				
			
		

	
		
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
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	);
	
	
	
	assert totest.getBasis().equals(itembasis.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemmulti
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerNamedSort
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerVariableDecl
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerProductSort
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerType
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerAll
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerEmpty
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerPartition
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerList
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerEmptyList
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"}, dependsOnMethods={"HLPNListHLAPI_LLAPI"})
	public void HLPNListHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	HLPNListHLAPI totest = new HLPNListHLAPI(
		itembasis
	,	
		itemcontainerMakeList
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "HLPNListHLAPI"})
	public void HLPNListHLAPI_LLAPI(){
	   HLPNList llapi = new ListsFactoryImpl().createHLPNList();
	   fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI hlapi = new HLPNListHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getMultiHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerProductSortHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerTypeHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerAllHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerEmptyHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerPartitionHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerListHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getContainerMakeListHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLPNListHLAPI"})
		public void getBasisHLAPITest(){
			HLPNListHLAPI elem = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());

			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(new ListsFactoryImpl().createHLPNList()));
				SortHLAPI totest_lists_HLPNList = elem.getBasisHLAPI();
				assert totest_lists_HLPNList.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
				SortHLAPI totest_arbitrarydeclarations_AnySort = elem.getBasisHLAPI();
				assert totest_arbitrarydeclarations_AnySort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getBasisHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getBasisHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getBasisHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getBasisHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getBasisHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getBasisHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getBasisHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getBasisHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(new StringsFactoryImpl().createHLPNString()));
				SortHLAPI totest_strings_HLPNString = elem.getBasisHLAPI();
				assert totest_strings_HLPNString.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getBasisHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getBasisHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getBasisHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getBasis());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "HLPNListHLAPI"})
	public void equalsTest(){
		HLPNList a = new ListsFactoryImpl().createHLPNList();
		HLPNList b = new ListsFactoryImpl().createHLPNList();
		HLPNListHLAPI aprime = new HLPNListHLAPI(a);
		HLPNListHLAPI asecond = new HLPNListHLAPI(a);
		HLPNListHLAPI bprime = new HLPNListHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public HLPNListHLAPI clone(){
	//	return new HLPNListHLAPI(this);
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
