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

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import java.util.List;

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
public class ArbitraryOperatorHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private AnySortHLAPI itemoutput;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "ArbitraryOperatorHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArbitraryOperatorHLAPI(arbitrarydeclarations)");
	}


	@BeforeMethod(groups = { "ArbitraryOperatorHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			itemname = new String("unid");
			
			
			//ArbitrarydeclarationsFactoryImpl
			itemoutput = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"}, dependsOnMethods={"ArbitraryOperatorHLAPI_LLAPI"})
	public void ArbitraryOperatorHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ArbitraryOperatorHLAPI totest = new ArbitraryOperatorHLAPI(
		itemid
		,	
		itemname
		,	
		itemoutput
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	
	
	assert totest.getOutput().equals(itemoutput.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"}, dependsOnMethods={"ArbitraryOperatorHLAPI_LLAPI"})
	public void ArbitraryOperatorHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArbitraryOperatorHLAPI totest = new ArbitraryOperatorHLAPI(
		itemid
		,	
		itemname
		,	
		itemoutput
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
	public void ArbitraryOperatorHLAPI_LLAPI(){
	   ArbitraryOperator llapi = new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator();
	   fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI hlapi = new ArbitraryOperatorHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			ArbitraryOperatorHLAPI elem = new ArbitraryOperatorHLAPI(new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
		public void getInputHLAPITest(){
			ArbitraryOperator llapi = new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new ArbitrarydeclarationsFactoryImpl().createAnySort());
			

			ArbitraryOperatorHLAPI elem = new ArbitraryOperatorHLAPI(llapi);
			List<AnySortHLAPI> totest = elem.getInputHLAPI();

			assert totest.size() == howmany;

			for (AnySortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
		public void getOutputHLAPITest(){
			ArbitraryOperatorHLAPI elem = new ArbitraryOperatorHLAPI(new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator());

			
				elem.setOutputHLAPI(itemoutput);
				AnySortHLAPI totest = elem.getOutputHLAPI();
				assert totest.getContainedItem().equals(elem.getOutput());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
	public void addInputHLAPITest(){
		ArbitraryOperatorHLAPI elem = new ArbitraryOperatorHLAPI(new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addInputHLAPI(new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
			

		assert elem.getContainedItem().getInput().size() == howmany;
	}

	@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
	public void removeInputTest(){
		ArbitraryOperatorHLAPI elem = new ArbitraryOperatorHLAPI(new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			AnySortHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addInputHLAPI(new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
			


		
		sav = new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort());
		

		elem.addInputHLAPI(sav);
		assert elem.getContainedItem().getInput().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addInputHLAPI(new AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
			


		elem.removeInputHLAPI(sav);

		assert elem.getContainedItem().getInput().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ArbitraryOperatorHLAPI"})
	public void equalsTest(){
		ArbitraryOperator a = new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator();
		ArbitraryOperator b = new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator();
		ArbitraryOperatorHLAPI aprime = new ArbitraryOperatorHLAPI(a);
		ArbitraryOperatorHLAPI asecond = new ArbitraryOperatorHLAPI(a);
		ArbitraryOperatorHLAPI bprime = new ArbitraryOperatorHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ArbitraryOperatorHLAPI clone(){
	//	return new ArbitraryOperatorHLAPI(this);
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
