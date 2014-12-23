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
package fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi;

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
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class TypeHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private String itemtext;
		
	private SortHLAPI itemstructure;
		
	
	private PlaceHLAPI itemcontainerPlace;
	


	@AfterTest(groups = { "TypeHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"TypeHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "TypeHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = new String("unid");
			
			
				
			itemstructure = new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(
				new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
				
			
		

	
		
		itemcontainerPlace = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "TypeHLAPI"}, dependsOnMethods={"TypeHLAPI_LLAPI"})
	public void TypeHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	TypeHLAPI totest = new TypeHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	);
	
	
	
	assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
	
	
	
	assert totest.getText().equals(itemtext);
	
	
	
	
	assert totest.getStructure().equals(itemstructure.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "TypeHLAPI"}, dependsOnMethods={"TypeHLAPI_LLAPI"})
	public void TypeHLAPI_2_containerPlace(){//BEGIN CONSTRUCTOR BODY

	TypeHLAPI totest = new TypeHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	,	
		itemcontainerPlace
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	
		
			assert totest.getStructure().equals(itemstructure.getContainedItem());
		
	
	assert totest.getContainerPlace().equals(itemcontainerPlace.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "TypeHLAPI"}, dependsOnMethods={"TypeHLAPI_LLAPI"})
	public void TypeHLAPI_4_containerPlace(){//BEGIN CONSTRUCTOR BODY

	TypeHLAPI totest = new TypeHLAPI(
	  itemcontainerPlace
	);

	
	assert totest.getContainerPlace().equals(itemcontainerPlace.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "TypeHLAPI"})
	public void TypeHLAPI_LLAPI(){
	   Type llapi = new HlcorestructureFactoryImpl().createType();
	   fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TypeHLAPI hlapi = new TypeHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TypeHLAPI"})
		public void getToolspecificsHLAPITest(){
			Type llapi = new HlcorestructureFactoryImpl().createType();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			TypeHLAPI elem = new TypeHLAPI(llapi);
			List<ToolInfoHLAPI> totest = elem.getToolspecificsHLAPI();

			assert totest.size() == howmany;

			for (ToolInfoHLAPI unit : totest) {
             assert llapi.getToolspecifics().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "TypeHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			TypeHLAPI elem = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "TypeHLAPI"})
		public void getStructureHLAPITest(){
			TypeHLAPI elem = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());

			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
				SortHLAPI totest_arbitrarydeclarations_AnySort = elem.getStructureHLAPI();
				assert totest_arbitrarydeclarations_AnySort.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getStructureHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getStructureHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getStructureHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getStructureHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getStructureHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getStructureHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getStructureHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getStructureHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(new ListsFactoryImpl().createHLPNList()));
				SortHLAPI totest_lists_HLPNList = elem.getStructureHLAPI();
				assert totest_lists_HLPNList.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(new StringsFactoryImpl().createHLPNString()));
				SortHLAPI totest_strings_HLPNString = elem.getStructureHLAPI();
				assert totest_strings_HLPNString.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getStructureHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getStructureHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getStructureHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getStructure());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "TypeHLAPI"})
		public void getContainerPlaceHLAPITest(){
			TypeHLAPI elem = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());

			
				elem.setContainerPlaceHLAPI(itemcontainerPlace);
				PlaceHLAPI totest = elem.getContainerPlaceHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPlace());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "TypeHLAPI"})
	public void addToolspecificsHLAPITest(){
		TypeHLAPI elem = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "TypeHLAPI"})
	public void removeToolspecificsTest(){
		TypeHLAPI elem = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			ToolInfoHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			


		
		sav = new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo());
		

		elem.addToolspecificsHLAPI(sav);
		assert elem.getContainedItem().getToolspecifics().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			


		elem.removeToolspecificsHLAPI(sav);

		assert elem.getContainedItem().getToolspecifics().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "TypeHLAPI"})
	public void equalsTest(){
		Type a = new HlcorestructureFactoryImpl().createType();
		Type b = new HlcorestructureFactoryImpl().createType();
		TypeHLAPI aprime = new TypeHLAPI(a);
		TypeHLAPI asecond = new TypeHLAPI(a);
		TypeHLAPI bprime = new TypeHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public TypeHLAPI clone(){
	//	return new TypeHLAPI(this);
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
