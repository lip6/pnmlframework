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
 * $Id ggiffo, Wed Feb 10 14:59:12 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.*;
import fr.lip6.move.pnml.hlpn.booleans.hlapi.*;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.dots.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.hlpn.integers.hlapi.*;
import fr.lip6.move.pnml.hlpn.lists.hlapi.*;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.*;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.*;
import fr.lip6.move.pnml.hlpn.strings.hlapi.*;
import fr.lip6.move.pnml.hlpn.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.*;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class ArbitrarySortHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "ArbitrarySortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArbitrarySortHLAPI(arbitrarydeclarations)");
	}


	@BeforeMethod(groups = { "ArbitrarySortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			itemname = new String("unid");
			

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ArbitrarySortHLAPI"}, dependsOnMethods={"ArbitrarySortHLAPI_LLAPI"})
	public void ArbitrarySortHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ArbitrarySortHLAPI totest = new ArbitrarySortHLAPI(
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
	@Test(groups = { "hlapi", "ArbitrarySortHLAPI"}, dependsOnMethods={"ArbitrarySortHLAPI_LLAPI"})
	public void ArbitrarySortHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArbitrarySortHLAPI totest = new ArbitrarySortHLAPI(
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
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ArbitrarySortHLAPI"})
	public void ArbitrarySortHLAPI_LLAPI(){
	   ArbitrarySort llapi = new ArbitrarydeclarationsFactoryImpl().createArbitrarySort();
	   fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI hlapi = new ArbitrarySortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArbitrarySortHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			ArbitrarySortHLAPI elem = new ArbitrarySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createArbitrarySort());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "ArbitrarySortHLAPI"})
	public void equalsTest(){
		ArbitrarySort a = new ArbitrarydeclarationsFactoryImpl().createArbitrarySort();
		ArbitrarySort b = new ArbitrarydeclarationsFactoryImpl().createArbitrarySort();
		ArbitrarySortHLAPI aprime = new ArbitrarySortHLAPI(a);
		ArbitrarySortHLAPI asecond = new ArbitrarySortHLAPI(a);
		ArbitrarySortHLAPI bprime = new ArbitrarySortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ArbitrarySortHLAPI clone(){
	//	return new ArbitrarySortHLAPI(this);
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
