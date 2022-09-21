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
 * $Id ggiffo, Wed Feb 10 15:00:49 CET 2016$
 */
package fr.lip6.move.pnml.ptnet.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.ptnet.Dimension;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;
public class DimensionHLAPITest {

	
	private Integer itemx;
		
	private Integer itemy;
		
	
	private NodeGraphicsHLAPI itemcontainerDNodeGraphics;
	


	@AfterTest(groups = { "DimensionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"DimensionHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "DimensionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemx = new Integer("0");
			
			itemy = new Integer("0");
			

	
		
		itemcontainerDNodeGraphics = new NodeGraphicsHLAPI(new PtnetFactoryImpl().createNodeGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "DimensionHLAPI"}, dependsOnMethods={"DimensionHLAPI_LLAPI"})
	public void DimensionHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	DimensionHLAPI totest = new DimensionHLAPI(
		itemx
		,	
		itemy
	);
	
	
	assert totest.getX().equals(itemx);
	
	
	
	assert totest.getY().equals(itemy);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DimensionHLAPI"}, dependsOnMethods={"DimensionHLAPI_LLAPI"})
	public void DimensionHLAPI_2_containerDNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	DimensionHLAPI totest = new DimensionHLAPI(
		itemx
		,	
		itemy
	,	
		itemcontainerDNodeGraphics
	);
	
	
			assert totest.getX().equals(itemx);
		
	
	
			assert totest.getY().equals(itemy);
		
	
	assert totest.getContainerDNodeGraphics().equals(itemcontainerDNodeGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DimensionHLAPI"})
	public void DimensionHLAPI_LLAPI(){
	   Dimension llapi = new PtnetFactoryImpl().createDimension();
	   fr.lip6.move.pnml.ptnet.hlapi.DimensionHLAPI hlapi = new DimensionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DimensionHLAPI"})
		public void getContainerDNodeGraphicsHLAPITest(){
			DimensionHLAPI elem = new DimensionHLAPI(new PtnetFactoryImpl().createDimension());

			
				elem.setContainerDNodeGraphicsHLAPI(itemcontainerDNodeGraphics);
				NodeGraphicsHLAPI totest = elem.getContainerDNodeGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDNodeGraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "DimensionHLAPI"})
	public void equalsTest(){
		Dimension a = new PtnetFactoryImpl().createDimension();
		Dimension b = new PtnetFactoryImpl().createDimension();
		DimensionHLAPI aprime = new DimensionHLAPI(a);
		DimensionHLAPI asecond = new DimensionHLAPI(a);
		DimensionHLAPI bprime = new DimensionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public DimensionHLAPI clone(){
	//	return new DimensionHLAPI(this);
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
