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

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
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
import fr.lip6.move.pnml.hlpn.terms.UserSort;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class UserSortHLAPITest {

	
	private SortDeclHLAPI itemdeclaration;
		
	
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
	


	@AfterTest(groups = { "UserSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"UserSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "UserSortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itemdeclaration = new fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI(
				new TermsFactoryImpl().createNamedSort()
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
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	);
	
	
	
	assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemmulti
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerNamedSort
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerVariableDecl
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerProductSort
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerType
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerAll
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerEmpty
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerPartition
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerList
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerEmptyList
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"}, dependsOnMethods={"UserSortHLAPI_LLAPI"})
	public void UserSortHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	UserSortHLAPI totest = new UserSortHLAPI(
		itemdeclaration
	,	
		itemcontainerMakeList
	);
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "UserSortHLAPI"})
	public void UserSortHLAPI_LLAPI(){
	   UserSort llapi = new TermsFactoryImpl().createUserSort();
	   fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI hlapi = new UserSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getMultiHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerTypeHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerAllHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerListHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getContainerMakeListHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserSortHLAPI"})
		public void getDeclarationHLAPITest(){
			UserSortHLAPI elem = new UserSortHLAPI(new TermsFactoryImpl().createUserSort());

			
				elem.setDeclarationHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI(new TermsFactoryImpl().createNamedSort()));
				SortDeclHLAPI totest_terms_NamedSort = elem.getDeclarationHLAPI();
				assert totest_terms_NamedSort.getContainedItem().equals(elem.getDeclaration());
			
				elem.setDeclarationHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()));
				SortDeclHLAPI totest_arbitrarydeclarations_ArbitrarySort = elem.getDeclarationHLAPI();
				assert totest_arbitrarydeclarations_ArbitrarySort.getContainedItem().equals(elem.getDeclaration());
			
				elem.setDeclarationHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI(new PartitionsFactoryImpl().createPartition()));
				SortDeclHLAPI totest_partitions_Partition = elem.getDeclarationHLAPI();
				assert totest_partitions_Partition.getContainedItem().equals(elem.getDeclaration());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "UserSortHLAPI"})
	public void equalsTest(){
		UserSort a = new TermsFactoryImpl().createUserSort();
		UserSort b = new TermsFactoryImpl().createUserSort();
		UserSortHLAPI aprime = new UserSortHLAPI(a);
		UserSortHLAPI asecond = new UserSortHLAPI(a);
		UserSortHLAPI bprime = new UserSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public UserSortHLAPI clone(){
	//	return new UserSortHLAPI(this);
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
