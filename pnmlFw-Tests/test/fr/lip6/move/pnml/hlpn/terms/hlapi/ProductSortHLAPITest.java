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
 * $Id ggiffo, Thu Feb 11 16:29:59 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.terms.hlapi;

import java.util.List;

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
import fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class ProductSortHLAPITest {

	
	
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
	


	@AfterTest(groups = { "ProductSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ProductSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "ProductSortHLAPI", "hlapi" })
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
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ProductSortHLAPI totest = new ProductSortHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerList
	);
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerEmptyList
	);
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
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
	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void ProductSortHLAPI_LLAPI(){
	   ProductSort llapi = new TermsFactoryImpl().createProductSort();
	   fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI hlapi = new ProductSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getMultiHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerTypeHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerAllHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerListHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerMakeListHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany = 14;
			

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<SortHLAPI> totest = elem.getElementSortHLAPI();

			assert totest.size() == howmany;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_MultisetSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createMultisetSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI> totest = elem.getElementSort_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_ProductSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createProductSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI> totest = elem.getElementSort_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_UserSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createUserSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI> totest = elem.getElementSort_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_arbitrarydeclarations_AnySortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new ArbitrarydeclarationsFactoryImpl().createAnySort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI> totest = elem.getElementSort_arbitrarydeclarations_AnySortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_booleans_BoolHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new BooleansFactoryImpl().createBool());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI> totest = elem.getElementSort_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_cyclicEnumerations_CyclicEnumerationHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> totest = elem.getElementSort_cyclicEnumerations_CyclicEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_dots_DotHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new DotsFactoryImpl().createDot());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI> totest = elem.getElementSort_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_finiteEnumerations_FiniteEnumerationHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> totest = elem.getElementSort_finiteEnumerations_FiniteEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_finiteIntRanges_FiniteIntRangeHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new FiniteIntRangesFactoryImpl().createFiniteIntRange());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> totest = elem.getElementSort_finiteIntRanges_FiniteIntRangeHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_integers_NaturalHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new IntegersFactoryImpl().createNatural());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI> totest = elem.getElementSort_integers_NaturalHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_integers_PositiveHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new IntegersFactoryImpl().createPositive());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI> totest = elem.getElementSort_integers_PositiveHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_integers_HLIntegerHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new IntegersFactoryImpl().createHLInteger());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI> totest = elem.getElementSort_integers_HLIntegerHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_lists_HLPNListHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new ListsFactoryImpl().createHLPNList());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI> totest = elem.getElementSort_lists_HLPNListHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_strings_HLPNStringHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new StringsFactoryImpl().createHLPNString());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI> totest = elem.getElementSort_strings_HLPNStringHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void addElementSortHLAPITest(){
		ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
					new TermsFactoryImpl().createMultisetSort()
				)
			);
			

		assert elem.getContainedItem().getElementSort().size() == howmany;
	}

	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void removeElementSortTest(){
		ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			MultisetSortHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
				  new TermsFactoryImpl().createMultisetSort()
				)
			);
			


		
		sav =
			new MultisetSortHLAPI(
			  new TermsFactoryImpl().createMultisetSort()
			);
		

		elem.addElementSortHLAPI(sav);
		assert elem.getContainedItem().getElementSort().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
				  new TermsFactoryImpl().createMultisetSort()
				)
			);
			


		elem.removeElementSortHLAPI(sav);

		assert elem.getContainedItem().getElementSort().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void equalsTest(){
		ProductSort a = new TermsFactoryImpl().createProductSort();
		ProductSort b = new TermsFactoryImpl().createProductSort();
		ProductSortHLAPI aprime = new ProductSortHLAPI(a);
		ProductSortHLAPI asecond = new ProductSortHLAPI(a);
		ProductSortHLAPI bprime = new ProductSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ProductSortHLAPI clone(){
	//	return new ProductSortHLAPI(this);
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
