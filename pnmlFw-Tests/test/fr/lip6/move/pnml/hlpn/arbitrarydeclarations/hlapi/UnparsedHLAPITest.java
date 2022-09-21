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
 * $Id ggiffo, Thu Feb 11 16:29:57 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.AnyObjectHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class UnparsedHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private AnyObjectHLAPI itemunparsedModel;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "UnparsedHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"UnparsedHLAPI(arbitrarydeclarations)");
	}


	@BeforeMethod(groups = { "UnparsedHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			itemname = "unid";
			
			
				
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "UnparsedHLAPI"}, dependsOnMethods={"UnparsedHLAPI_LLAPI"})
	public void UnparsedHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	UnparsedHLAPI totest = new UnparsedHLAPI(
		itemid
		,	
		itemname
		,	
		itemunparsedModel
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UnparsedHLAPI"}, dependsOnMethods={"UnparsedHLAPI_LLAPI"})
	public void UnparsedHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	UnparsedHLAPI totest = new UnparsedHLAPI(
		itemid
		,	
		itemname
		,	
		itemunparsedModel
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	
		
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "UnparsedHLAPI"}, dependsOnMethods={"UnparsedHLAPI_LLAPI"})
	public void UnparsedHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	UnparsedHLAPI totest = new UnparsedHLAPI(
		itemid
		,	
		itemname
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UnparsedHLAPI"}, dependsOnMethods={"UnparsedHLAPI_LLAPI"})
	public void UnparsedHLAPI_4_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	UnparsedHLAPI totest = new UnparsedHLAPI(
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
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "UnparsedHLAPI"})
	public void UnparsedHLAPI_LLAPI(){
	   Unparsed llapi = new ArbitrarydeclarationsFactoryImpl().createUnparsed();
	   fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI hlapi = new UnparsedHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UnparsedHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			UnparsedHLAPI elem = new UnparsedHLAPI(new ArbitrarydeclarationsFactoryImpl().createUnparsed());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "UnparsedHLAPI"})
	public void equalsTest(){
		Unparsed a = new ArbitrarydeclarationsFactoryImpl().createUnparsed();
		Unparsed b = new ArbitrarydeclarationsFactoryImpl().createUnparsed();
		UnparsedHLAPI aprime = new UnparsedHLAPI(a);
		UnparsedHLAPI asecond = new UnparsedHLAPI(a);
		UnparsedHLAPI bprime = new UnparsedHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public UnparsedHLAPI clone(){
	//	return new UnparsedHLAPI(this);
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
