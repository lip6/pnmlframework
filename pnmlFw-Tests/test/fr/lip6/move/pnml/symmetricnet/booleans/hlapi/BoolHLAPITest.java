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
package fr.lip6.move.pnml.symmetricnet.booleans.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;
public class BoolHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	


	@AfterTest(groups = { "BoolHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"BoolHLAPI(booleans)");
	}


	@BeforeMethod(groups = { "BoolHLAPI", "hlapi" })
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
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	BoolHLAPI totest = new BoolHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerProductSort
	);
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"}, dependsOnMethods={"BoolHLAPI_LLAPI"})
	public void BoolHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	BoolHLAPI totest = new BoolHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "BoolHLAPI"})
	public void BoolHLAPI_LLAPI(){
	   Bool llapi = new BooleansFactoryImpl().createBool();
	   fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI hlapi = new BoolHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getMultiHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerProductSortHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerTypeHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerAllHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerEmptyHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "BoolHLAPI"})
		public void getContainerPartitionHLAPITest(){
			BoolHLAPI elem = new BoolHLAPI(new BooleansFactoryImpl().createBool());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "BoolHLAPI"})
	public void equalsTest(){
		Bool a = new BooleansFactoryImpl().createBool();
		Bool b = new BooleansFactoryImpl().createBool();
		BoolHLAPI aprime = new BoolHLAPI(a);
		BoolHLAPI asecond = new BoolHLAPI(a);
		BoolHLAPI bprime = new BoolHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public BoolHLAPI clone(){
	//	return new BoolHLAPI(this);
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
