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
package fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;
public class FEConstantHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	
	private FiniteEnumerationHLAPI itemsort;
	


	@AfterTest(groups = { "FEConstantHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FEConstantHLAPI(finiteEnumerations)");
	}


	@BeforeMethod(groups = { "FEConstantHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			itemname = "unid";
			

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
		
		itemsort = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FEConstantHLAPI"}, dependsOnMethods={"FEConstantHLAPI_LLAPI"})
	public void FEConstantHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FEConstantHLAPI totest = new FEConstantHLAPI(
		itemid
		,	
		itemname
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FEConstantHLAPI"}, dependsOnMethods={"FEConstantHLAPI_LLAPI"})
	public void FEConstantHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	FEConstantHLAPI totest = new FEConstantHLAPI(
		itemid
		,	
		itemname
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FEConstantHLAPI"}, dependsOnMethods={"FEConstantHLAPI_LLAPI"})
	public void FEConstantHLAPI_2_sort() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	FEConstantHLAPI totest = new FEConstantHLAPI(
		itemid
		,	
		itemname
	,	
		itemsort
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	assert totest.getSort().equals(itemsort.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FEConstantHLAPI"})
	public void FEConstantHLAPI_LLAPI(){
	   FEConstant llapi = new FiniteEnumerationsFactoryImpl().createFEConstant();
	   fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI hlapi = new FEConstantHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FEConstantHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			FEConstantHLAPI elem = new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FEConstantHLAPI"})
		public void getSortHLAPITest(){
			FEConstantHLAPI elem = new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant());

			
				elem.setSortHLAPI(itemsort);
				FiniteEnumerationHLAPI totest = elem.getSortHLAPI();
				assert totest.getContainedItem().equals(elem.getSort());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "FEConstantHLAPI"})
	public void equalsTest(){
		FEConstant a = new FiniteEnumerationsFactoryImpl().createFEConstant();
		FEConstant b = new FiniteEnumerationsFactoryImpl().createFEConstant();
		FEConstantHLAPI aprime = new FEConstantHLAPI(a);
		FEConstantHLAPI asecond = new FEConstantHLAPI(a);
		FEConstantHLAPI bprime = new FEConstantHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FEConstantHLAPI clone(){
	//	return new FEConstantHLAPI(this);
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
