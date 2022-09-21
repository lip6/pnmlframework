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
 * $Id ggiffo, Thu Feb 11 16:29:03 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;
public class NamedSortHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private SortHLAPI itemsortdef;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "NamedSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"NamedSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "NamedSortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			itemname = "unid";
			
			
				
			itemsortdef = new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(
				new TermsFactoryImpl().createMultisetSort()
			);
				
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "NamedSortHLAPI"}, dependsOnMethods={"NamedSortHLAPI_LLAPI"})
	public void NamedSortHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	NamedSortHLAPI totest = new NamedSortHLAPI(
		itemid
		,	
		itemname
		,	
		itemsortdef
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	
	
	assert totest.getSortdef().equals(itemsortdef.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "NamedSortHLAPI"}, dependsOnMethods={"NamedSortHLAPI_LLAPI"})
	public void NamedSortHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	NamedSortHLAPI totest = new NamedSortHLAPI(
		itemid
		,	
		itemname
		,	
		itemsortdef
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	
		
			assert totest.getSortdef().equals(itemsortdef.getContainedItem());
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "NamedSortHLAPI"})
	public void NamedSortHLAPI_LLAPI(){
	   NamedSort llapi = new TermsFactoryImpl().createNamedSort();
	   fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI hlapi = new NamedSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NamedSortHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			NamedSortHLAPI elem = new NamedSortHLAPI(new TermsFactoryImpl().createNamedSort());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NamedSortHLAPI"})
		public void getSortdefHLAPITest(){
			NamedSortHLAPI elem = new NamedSortHLAPI(new TermsFactoryImpl().createNamedSort());

			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getSortdefHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getSortdefHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getSortdefHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getSortdefHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getSortdefHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getSortdefHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getSortdefHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getSortdefHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getSortdefHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getSortdefHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getSortdef());
			
				elem.setSortdefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getSortdefHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getSortdef());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "NamedSortHLAPI"})
	public void equalsTest(){
		NamedSort a = new TermsFactoryImpl().createNamedSort();
		NamedSort b = new TermsFactoryImpl().createNamedSort();
		NamedSortHLAPI aprime = new NamedSortHLAPI(a);
		NamedSortHLAPI asecond = new NamedSortHLAPI(a);
		NamedSortHLAPI bprime = new NamedSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public NamedSortHLAPI clone(){
	//	return new NamedSortHLAPI(this);
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
