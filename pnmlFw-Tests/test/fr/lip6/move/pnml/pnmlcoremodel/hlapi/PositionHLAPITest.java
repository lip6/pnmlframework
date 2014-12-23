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
 * $Id ggiffo, Tue Dec 23 11:30:46 CET 2014$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;
public class PositionHLAPITest {

	
	private Integer itemx;
		
	private Integer itemy;
		
	
	private NodeGraphicsHLAPI itemcontainerPNodeGraphics;
	
	private ArcGraphicsHLAPI itemcontainerArcGraphics;
	


	@AfterTest(groups = { "PositionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PositionHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "PositionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemx = new Integer("0");
			
			itemy = new Integer("0");
			

	
		
		itemcontainerPNodeGraphics = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());
		
	
		
		itemcontainerArcGraphics = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PositionHLAPI"}, dependsOnMethods={"PositionHLAPI_LLAPI"})
	public void PositionHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PositionHLAPI totest = new PositionHLAPI(
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
	@Test(groups = { "hlapi", "PositionHLAPI"}, dependsOnMethods={"PositionHLAPI_LLAPI"})
	public void PositionHLAPI_2_containerPNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	PositionHLAPI totest = new PositionHLAPI(
		itemx
		,	
		itemy
	,	
		itemcontainerPNodeGraphics
	);
	
	
			assert totest.getX().equals(itemx);
		
	
	
			assert totest.getY().equals(itemy);
		
	
	assert totest.getContainerPNodeGraphics().equals(itemcontainerPNodeGraphics.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PositionHLAPI"}, dependsOnMethods={"PositionHLAPI_LLAPI"})
	public void PositionHLAPI_2_containerArcGraphics(){//BEGIN CONSTRUCTOR BODY

	PositionHLAPI totest = new PositionHLAPI(
		itemx
		,	
		itemy
	,	
		itemcontainerArcGraphics
	);
	
	
			assert totest.getX().equals(itemx);
		
	
	
			assert totest.getY().equals(itemy);
		
	
	assert totest.getContainerArcGraphics().equals(itemcontainerArcGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PositionHLAPI"})
	public void PositionHLAPI_LLAPI(){
	   Position llapi = new PnmlcoremodelFactoryImpl().createPosition();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.PositionHLAPI hlapi = new PositionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositionHLAPI"})
		public void getContainerPNodeGraphicsHLAPITest(){
			PositionHLAPI elem = new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition());

			
				elem.setContainerPNodeGraphicsHLAPI(itemcontainerPNodeGraphics);
				NodeGraphicsHLAPI totest = elem.getContainerPNodeGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPNodeGraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PositionHLAPI"})
		public void getContainerArcGraphicsHLAPITest(){
			PositionHLAPI elem = new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition());

			
				elem.setContainerArcGraphicsHLAPI(itemcontainerArcGraphics);
				ArcGraphicsHLAPI totest = elem.getContainerArcGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerArcGraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "PositionHLAPI"})
	public void equalsTest(){
		Position a = new PnmlcoremodelFactoryImpl().createPosition();
		Position b = new PnmlcoremodelFactoryImpl().createPosition();
		PositionHLAPI aprime = new PositionHLAPI(a);
		PositionHLAPI asecond = new PositionHLAPI(a);
		PositionHLAPI bprime = new PositionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PositionHLAPI clone(){
	//	return new PositionHLAPI(this);
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
