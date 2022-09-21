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
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.integers.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.pthlpng.integers.HLInteger;
import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.NamedSortHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableDeclHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;
public class HLIntegerHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	
	private NumberConstantHLAPI itemcontainerNumberConstant;
	


	@AfterTest(groups = { "HLIntegerHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"HLIntegerHLAPI(integers)");
	}


	@BeforeMethod(groups = { "HLIntegerHLAPI", "hlapi" })
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
		
	
		
		itemcontainerNumberConstant = new NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	HLIntegerHLAPI totest = new HLIntegerHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerProductSort
	);
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"}, dependsOnMethods={"HLIntegerHLAPI_LLAPI"})
	public void HLIntegerHLAPI_2_containerNumberConstant(){//BEGIN CONSTRUCTOR BODY

	HLIntegerHLAPI totest = new HLIntegerHLAPI(
		itemcontainerNumberConstant
	);
	
	assert totest.getContainerNumberConstant().equals(itemcontainerNumberConstant.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "HLIntegerHLAPI"})
	public void HLIntegerHLAPI_LLAPI(){
	   HLInteger llapi = new IntegersFactoryImpl().createHLInteger();
	   fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI hlapi = new HLIntegerHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getMultiHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerProductSortHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerTypeHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerAllHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerEmptyHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerPartitionHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLIntegerHLAPI"})
		public void getContainerNumberConstantHLAPITest(){
			HLIntegerHLAPI elem = new HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger());

			
				elem.setContainerNumberConstantHLAPI(itemcontainerNumberConstant);
				NumberConstantHLAPI totest = elem.getContainerNumberConstantHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNumberConstant());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "HLIntegerHLAPI"})
	public void equalsTest(){
		HLInteger a = new IntegersFactoryImpl().createHLInteger();
		HLInteger b = new IntegersFactoryImpl().createHLInteger();
		HLIntegerHLAPI aprime = new HLIntegerHLAPI(a);
		HLIntegerHLAPI asecond = new HLIntegerHLAPI(a);
		HLIntegerHLAPI bprime = new HLIntegerHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public HLIntegerHLAPI clone(){
	//	return new HLIntegerHLAPI(this);
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
