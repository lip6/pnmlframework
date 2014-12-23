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
package fr.lip6.move.pnml.pthlpng.dots.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.pthlpng.dots.Dot;
import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
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
public class DotHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	


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
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DotHLAPI"})
	public void DotHLAPI_LLAPI(){
	   Dot llapi = new DotsFactoryImpl().createDot();
	   fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI hlapi = new DotHLAPI(llapi);
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
