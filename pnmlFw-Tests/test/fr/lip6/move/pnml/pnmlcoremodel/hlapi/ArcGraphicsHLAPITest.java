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
 * $Id ggiffo, Wed Feb 10 14:59:10 CET 2016$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import fr.lip6.move.pnml.pnmlcoremodel.Annotation;
import fr.lip6.move.pnml.pnmlcoremodel.AnnotationGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.AnyObject;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.ArcGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2Color;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Font;
import fr.lip6.move.pnml.pnmlcoremodel.Gradient;
import fr.lip6.move.pnml.pnmlcoremodel.Label;
import fr.lip6.move.pnml.pnmlcoremodel.Line;
import fr.lip6.move.pnml.pnmlcoremodel.LineShape;
import fr.lip6.move.pnml.pnmlcoremodel.LineStyle;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Offset;
import fr.lip6.move.pnml.pnmlcoremodel.PNType;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;
import fr.lip6.move.pnml.pnmlcoremodel.PnObject;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;

import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pnmlcoremodel.*;
import fr.lip6.move.pnml.pnmlcoremodel.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class ArcGraphicsHLAPITest {

	
	private LineHLAPI itemline;
		
	
	private ArcHLAPI itemcontainerArc;
	


	@AfterTest(groups = { "ArcGraphicsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArcGraphicsHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "ArcGraphicsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//PnmlcoremodelFactoryImpl
			itemline = new LineHLAPI(new PnmlcoremodelFactoryImpl().createLine());
			
		

	
		
		itemcontainerArc = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"}, dependsOnMethods={"ArcGraphicsHLAPI_LLAPI"})
	public void ArcGraphicsHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ArcGraphicsHLAPI totest = new ArcGraphicsHLAPI(
		itemline
	);
	
	
	
	assert totest.getLine().equals(itemline.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"}, dependsOnMethods={"ArcGraphicsHLAPI_LLAPI"})
	public void ArcGraphicsHLAPI_2_containerArc(){//BEGIN CONSTRUCTOR BODY

	ArcGraphicsHLAPI totest = new ArcGraphicsHLAPI(
		itemline
	,	
		itemcontainerArc
	);
	
	
		
			assert totest.getLine().equals(itemline.getContainedItem());
		
	
	assert totest.getContainerArc().equals(itemcontainerArc.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ArcGraphicsHLAPI"}, dependsOnMethods={"ArcGraphicsHLAPI_LLAPI"})
	public void ArcGraphicsHLAPI_4_containerArc(){//BEGIN CONSTRUCTOR BODY

	ArcGraphicsHLAPI totest = new ArcGraphicsHLAPI(
	  itemcontainerArc
	);

	
	assert totest.getContainerArc().equals(itemcontainerArc.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void ArcGraphicsHLAPI_LLAPI(){
	   ArcGraphics llapi = new PnmlcoremodelFactoryImpl().createArcGraphics();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcGraphicsHLAPI hlapi = new ArcGraphicsHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
		public void getPositionsHLAPITest(){
			ArcGraphics llapi = new PnmlcoremodelFactoryImpl().createArcGraphics();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPositions().add(new PnmlcoremodelFactoryImpl().createPosition());
			

			ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(llapi);
			List<PositionHLAPI> totest = elem.getPositionsHLAPI();

			assert totest.size() == howmany;

			for (PositionHLAPI unit : totest) {
             assert llapi.getPositions().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
		public void getLineHLAPITest(){
			ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());

			
				elem.setLineHLAPI(itemline);
				LineHLAPI totest = elem.getLineHLAPI();
				assert totest.getContainedItem().equals(elem.getLine());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
		public void getContainerArcHLAPITest(){
			ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());

			
				elem.setContainerArcHLAPI(itemcontainerArc);
				ArcHLAPI totest = elem.getContainerArcHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerArc());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void addPositionsHLAPITest(){
		ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPositionsHLAPI(new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition()));
			

		assert elem.getContainedItem().getPositions().size() == howmany;
	}

	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void removePositionsTest(){
		ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PositionHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addPositionsHLAPI(new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition()));
			


		
		sav = new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition());
		

		elem.addPositionsHLAPI(sav);
		assert elem.getContainedItem().getPositions().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPositionsHLAPI(new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition()));
			


		elem.removePositionsHLAPI(sav);

		assert elem.getContainedItem().getPositions().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void equalsTest(){
		ArcGraphics a = new PnmlcoremodelFactoryImpl().createArcGraphics();
		ArcGraphics b = new PnmlcoremodelFactoryImpl().createArcGraphics();
		ArcGraphicsHLAPI aprime = new ArcGraphicsHLAPI(a);
		ArcGraphicsHLAPI asecond = new ArcGraphicsHLAPI(a);
		ArcGraphicsHLAPI bprime = new ArcGraphicsHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ArcGraphicsHLAPI clone(){
	//	return new ArcGraphicsHLAPI(this);
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
