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
package fr.lip6.move.pnml.pthlpng.terms.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;
public class MultisetSortHLAPITest {

	
	private SortHLAPI itembasis;
		
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	


	@AfterTest(groups = { "MultisetSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"MultisetSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "MultisetSortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itembasis = new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
				new TermsFactoryImpl().createMultisetSort()
			);
				
			
		

	
		
		itemmulti = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());
		
	
		
		itemcontainerNamedSort = new NamedSortHLAPI(new TermsFactoryImpl().createNamedSort());
		
	
		
		itemcontainerVariableDecl = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
		
	
		
		itemcontainerProductSort = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		
	
		
		itemcontainerType = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
		
	
		
		itemcontainerAll = new AllHLAPI(new MultisetsFactoryImpl().createAll());
		
	
		
		itemcontainerEmpty = new EmptyHLAPI(new MultisetsFactoryImpl().createEmpty());
		
	
		
		itemcontainerPartition = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	);
	
	
	
	assert totest.getBasis().equals(itembasis.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
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
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerPartition
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"})
	public void MultisetSortHLAPI_LLAPI(){
	   MultisetSort llapi = new TermsFactoryImpl().createMultisetSort();
	   fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI hlapi = new MultisetSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getMultiHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerTypeHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerAllHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getBasisHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getBasisHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getBasisHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getBasisHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getBasisHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getBasisHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getBasis());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "MultisetSortHLAPI"})
	public void equalsTest(){
		MultisetSort a = new TermsFactoryImpl().createMultisetSort();
		MultisetSort b = new TermsFactoryImpl().createMultisetSort();
		MultisetSortHLAPI aprime = new MultisetSortHLAPI(a);
		MultisetSortHLAPI asecond = new MultisetSortHLAPI(a);
		MultisetSortHLAPI bprime = new MultisetSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public MultisetSortHLAPI clone(){
	//	return new MultisetSortHLAPI(this);
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
