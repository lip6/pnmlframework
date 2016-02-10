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
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontFamily;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontSize;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontStyle;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontWeight;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Font;
import fr.lip6.move.pnml.pnmlcoremodel.FontAlign;
import fr.lip6.move.pnml.pnmlcoremodel.FontDecoration;
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
import fr.lip6.move.pnml.pnmlcoremodel.Place;
import fr.lip6.move.pnml.pnmlcoremodel.PnObject;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.RefPlace;
import fr.lip6.move.pnml.pnmlcoremodel.RefTransition;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;
import fr.lip6.move.pnml.pnmlcoremodel.Transition;
import fr.lip6.move.pnml.pnmlcoremodel.TransitionNode;

import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;

import java.math.BigDecimal;

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
public class TransitionHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeGraphicsHLAPI itemnodegraphics;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "TransitionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"TransitionHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "TransitionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			
			//PnmlcoremodelFactoryImpl
			itemname = new NameHLAPI(new PnmlcoremodelFactoryImpl().createName());
			
		
			
			//PnmlcoremodelFactoryImpl
			itemnodegraphics = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	TransitionHLAPI totest = new TransitionHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	TransitionHLAPI totest = new TransitionHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	TransitionHLAPI totest = new TransitionHLAPI(
		itemid
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	TransitionHLAPI totest = new TransitionHLAPI(
		itemid
	,	
	  itemcontainerPage
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void TransitionHLAPI_LLAPI(){
	   Transition llapi = new PnmlcoremodelFactoryImpl().createTransition();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI hlapi = new TransitionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getNameHLAPITest(){
			TransitionHLAPI elem = new TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getToolspecificsHLAPITest(){
			Transition llapi = new PnmlcoremodelFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PnmlcoremodelFactoryImpl().createToolInfo());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getContainerPageHLAPITest(){
			TransitionHLAPI elem = new TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getInArcsHLAPITest(){
			Transition llapi = new PnmlcoremodelFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInArcs().add(new PnmlcoremodelFactoryImpl().createArc());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
			List<ArcHLAPI> totest = elem.getInArcsHLAPI();

			assert totest.size() == howmany;

			for (ArcHLAPI unit : totest) {
             assert llapi.getInArcs().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getOutArcsHLAPITest(){
			Transition llapi = new PnmlcoremodelFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getOutArcs().add(new PnmlcoremodelFactoryImpl().createArc());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
			List<ArcHLAPI> totest = elem.getOutArcsHLAPI();

			assert totest.size() == howmany;

			for (ArcHLAPI unit : totest) {
             assert llapi.getOutArcs().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getNodegraphicsHLAPITest(){
			TransitionHLAPI elem = new TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getReferencingTransitionsHLAPITest(){
			Transition llapi = new PnmlcoremodelFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getReferencingTransitions().add(new PnmlcoremodelFactoryImpl().createRefTransition());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
			List<RefTransitionHLAPI> totest = elem.getReferencingTransitionsHLAPI();

			assert totest.size() == howmany;

			for (RefTransitionHLAPI unit : totest) {
             assert llapi.getReferencingTransitions().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void addToolspecificsHLAPITest(){
		TransitionHLAPI elem = new TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void removeToolspecificsTest(){
		TransitionHLAPI elem = new TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			ToolInfoHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			


		
		sav = new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo());
		

		elem.addToolspecificsHLAPI(sav);
		assert elem.getContainedItem().getToolspecifics().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			


		elem.removeToolspecificsHLAPI(sav);

		assert elem.getContainedItem().getToolspecifics().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void equalsTest(){
		Transition a = new PnmlcoremodelFactoryImpl().createTransition();
		Transition b = new PnmlcoremodelFactoryImpl().createTransition();
		TransitionHLAPI aprime = new TransitionHLAPI(a);
		TransitionHLAPI asecond = new TransitionHLAPI(a);
		TransitionHLAPI bprime = new TransitionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public TransitionHLAPI clone(){
	//	return new TransitionHLAPI(this);
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
