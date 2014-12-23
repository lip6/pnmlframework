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
package fr.lip6.move.pnml.hlpn.partitions.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class PartitionHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private SortHLAPI itemdef;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "PartitionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PartitionHLAPI(partitions)");
	}


	@BeforeMethod(groups = { "PartitionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			itemname = new String("unid");
			
			
				
			itemdef = new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(
				new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
				
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PartitionHLAPI"}, dependsOnMethods={"PartitionHLAPI_LLAPI"})
	public void PartitionHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PartitionHLAPI totest = new PartitionHLAPI(
		itemid
		,	
		itemname
		,	
		itemdef
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	
	
	assert totest.getDef().equals(itemdef.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PartitionHLAPI"}, dependsOnMethods={"PartitionHLAPI_LLAPI"})
	public void PartitionHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PartitionHLAPI totest = new PartitionHLAPI(
		itemid
		,	
		itemname
		,	
		itemdef
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	
		
			assert totest.getDef().equals(itemdef.getContainedItem());
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void PartitionHLAPI_LLAPI(){
	   Partition llapi = new PartitionsFactoryImpl().createPartition();
	   fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI hlapi = new PartitionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionHLAPI"})
		public void getDefHLAPITest(){
			PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());

			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
				SortHLAPI totest_arbitrarydeclarations_AnySort = elem.getDefHLAPI();
				assert totest_arbitrarydeclarations_AnySort.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getDefHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getDefHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getDefHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getDefHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getDefHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getDefHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getDefHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getDefHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(new ListsFactoryImpl().createHLPNList()));
				SortHLAPI totest_lists_HLPNList = elem.getDefHLAPI();
				assert totest_lists_HLPNList.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(new StringsFactoryImpl().createHLPNString()));
				SortHLAPI totest_strings_HLPNString = elem.getDefHLAPI();
				assert totest_strings_HLPNString.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getDefHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getDefHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getDefHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getDef());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PartitionHLAPI"})
		public void getPartitionelementsHLAPITest(){
			Partition llapi = new PartitionsFactoryImpl().createPartition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelements().add(new PartitionsFactoryImpl().createPartitionElement());
			

			PartitionHLAPI elem = new PartitionHLAPI(llapi);
			List<PartitionElementHLAPI> totest = elem.getPartitionelementsHLAPI();

			assert totest.size() == howmany;

			for (PartitionElementHLAPI unit : totest) {
             assert llapi.getPartitionelements().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void addPartitionelementsHLAPITest(){
		PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPartitionelementsHLAPI(new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
			

		assert elem.getContainedItem().getPartitionelements().size() == howmany;
	}

	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void removePartitionelementsTest(){
		PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PartitionElementHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addPartitionelementsHLAPI(new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
			


		
		sav = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		

		elem.addPartitionelementsHLAPI(sav);
		assert elem.getContainedItem().getPartitionelements().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPartitionelementsHLAPI(new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
			


		elem.removePartitionelementsHLAPI(sav);

		assert elem.getContainedItem().getPartitionelements().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void equalsTest(){
		Partition a = new PartitionsFactoryImpl().createPartition();
		Partition b = new PartitionsFactoryImpl().createPartition();
		PartitionHLAPI aprime = new PartitionHLAPI(a);
		PartitionHLAPI asecond = new PartitionHLAPI(a);
		PartitionHLAPI bprime = new PartitionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PartitionHLAPI clone(){
	//	return new PartitionHLAPI(this);
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
