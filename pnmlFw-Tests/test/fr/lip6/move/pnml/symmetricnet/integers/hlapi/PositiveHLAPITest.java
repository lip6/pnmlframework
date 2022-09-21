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
package fr.lip6.move.pnml.symmetricnet.integers.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.integers.Positive;
import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;
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
public class PositiveHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	
	private NumberConstantHLAPI itemcontainerNumberConstant;
	


	@AfterTest(groups = { "PositiveHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PositiveHLAPI(integers)");
	}


	@BeforeMethod(groups = { "PositiveHLAPI", "hlapi" })
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
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PositiveHLAPI totest = new PositiveHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerProductSort
	);
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositiveHLAPI"}, dependsOnMethods={"PositiveHLAPI_LLAPI"})
	public void PositiveHLAPI_2_containerNumberConstant(){//BEGIN CONSTRUCTOR BODY

	PositiveHLAPI totest = new PositiveHLAPI(
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
	@Test(groups = { "hlapi", "PositiveHLAPI"})
	public void PositiveHLAPI_LLAPI(){
	   Positive llapi = new IntegersFactoryImpl().createPositive();
	   fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI hlapi = new PositiveHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getMultiHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerProductSortHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerTypeHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerAllHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerEmptyHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerPartitionHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositiveHLAPI"})
		public void getContainerNumberConstantHLAPITest(){
			PositiveHLAPI elem = new PositiveHLAPI(new IntegersFactoryImpl().createPositive());

			
				elem.setContainerNumberConstantHLAPI(itemcontainerNumberConstant);
				NumberConstantHLAPI totest = elem.getContainerNumberConstantHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNumberConstant());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "PositiveHLAPI"})
	public void equalsTest(){
		Positive a = new IntegersFactoryImpl().createPositive();
		Positive b = new IntegersFactoryImpl().createPositive();
		PositiveHLAPI aprime = new PositiveHLAPI(a);
		PositiveHLAPI asecond = new PositiveHLAPI(a);
		PositiveHLAPI bprime = new PositiveHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PositiveHLAPI clone(){
	//	return new PositiveHLAPI(this);
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
