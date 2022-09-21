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
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

import fr.lip6.move.pnml.pthlpng.booleans.And;
import fr.lip6.move.pnml.pthlpng.booleans.Bool;
import fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant;
import fr.lip6.move.pnml.pthlpng.booleans.Equality;
import fr.lip6.move.pnml.pthlpng.booleans.Imply;
import fr.lip6.move.pnml.pthlpng.booleans.Inequality;
import fr.lip6.move.pnml.pthlpng.booleans.Not;
import fr.lip6.move.pnml.pthlpng.booleans.Or;

import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.pthlpng.dots.Dot;
import fr.lip6.move.pnml.pthlpng.dots.DotConstant;

import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.Annotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Arc;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Dimension;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Fill;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Font;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Gradient;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Label;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Line;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.LineShape;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Name;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Node;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Offset;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PNType;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Page;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PnObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Position;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;

import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;

import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pthlpng.booleans.hlapi.*;
import fr.lip6.move.pnml.pthlpng.dots.hlapi.*;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.pthlpng.integers.hlapi.*;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.*;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.*;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.*;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class ArcHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeHLAPI itemsource;
		
	private NodeHLAPI itemtarget;
		
	private ArcGraphicsHLAPI itemarcgraphics;
		
	private HLAnnotationHLAPI itemhlinscription;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "ArcHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArcHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "ArcHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//HlcorestructureFactoryImpl
			itemname = new NameHLAPI(new HlcorestructureFactoryImpl().createName());
			
		
			
				
			itemsource = new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(
				new HlcorestructureFactoryImpl().createPlace()
			);
				
			
		
			
				
			itemtarget = new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(
				new HlcorestructureFactoryImpl().createPlace()
			);
				
			
		
			
			//HlcorestructureFactoryImpl
			itemarcgraphics = new ArcGraphicsHLAPI(new HlcorestructureFactoryImpl().createArcGraphics());
			
		
			
			//HlcorestructureFactoryImpl
			itemhlinscription = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemname
		,	
		itemsource
		,	
		itemtarget
		,	
		itemarcgraphics
		,	
		itemhlinscription
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getSource().equals(itemsource.getContainedItem());
	
	
	
	
	assert totest.getTarget().equals(itemtarget.getContainedItem());
	
	
	
	
	assert totest.getArcgraphics().equals(itemarcgraphics.getContainedItem());
	
	
	
	
	assert totest.getHlinscription().equals(itemhlinscription.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemname
		,	
		itemsource
		,	
		itemtarget
		,	
		itemarcgraphics
		,	
		itemhlinscription
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	
		
			assert totest.getArcgraphics().equals(itemarcgraphics.getContainedItem());
		
	
	
		
			assert totest.getHlinscription().equals(itemhlinscription.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemsource
		,	
		itemtarget
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemsource
		,	
		itemtarget
	,	
	  itemcontainerPage
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void ArcHLAPI_LLAPI(){
	   Arc llapi = new HlcorestructureFactoryImpl().createArc();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ArcHLAPI hlapi = new ArcHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getNameHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getToolspecificsHLAPITest(){
			Arc llapi = new HlcorestructureFactoryImpl().createArc();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			ArcHLAPI elem = new ArcHLAPI(llapi);
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
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getContainerPageHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getSourceHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());

			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace()));
				NodeHLAPI totest_hlcorestructure_Place = elem.getSourceHLAPI();
				assert totest_hlcorestructure_Place.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefTransitionHLAPI(new HlcorestructureFactoryImpl().createRefTransition()));
				NodeHLAPI totest_hlcorestructure_RefTransition = elem.getSourceHLAPI();
				assert totest_hlcorestructure_RefTransition.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TransitionHLAPI(new HlcorestructureFactoryImpl().createTransition()));
				NodeHLAPI totest_hlcorestructure_Transition = elem.getSourceHLAPI();
				assert totest_hlcorestructure_Transition.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace()));
				NodeHLAPI totest_hlcorestructure_RefPlace = elem.getSourceHLAPI();
				assert totest_hlcorestructure_RefPlace.getContainedItem().equals(elem.getSource());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getTargetHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());

			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace()));
				NodeHLAPI totest_hlcorestructure_Place = elem.getTargetHLAPI();
				assert totest_hlcorestructure_Place.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefTransitionHLAPI(new HlcorestructureFactoryImpl().createRefTransition()));
				NodeHLAPI totest_hlcorestructure_RefTransition = elem.getTargetHLAPI();
				assert totest_hlcorestructure_RefTransition.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TransitionHLAPI(new HlcorestructureFactoryImpl().createTransition()));
				NodeHLAPI totest_hlcorestructure_Transition = elem.getTargetHLAPI();
				assert totest_hlcorestructure_Transition.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace()));
				NodeHLAPI totest_hlcorestructure_RefPlace = elem.getTargetHLAPI();
				assert totest_hlcorestructure_RefPlace.getContainedItem().equals(elem.getTarget());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getArcgraphicsHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());

			
				elem.setArcgraphicsHLAPI(itemarcgraphics);
				ArcGraphicsHLAPI totest = elem.getArcgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getArcgraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getHlinscriptionHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());

			
				elem.setHlinscriptionHLAPI(itemhlinscription);
				HLAnnotationHLAPI totest = elem.getHlinscriptionHLAPI();
				assert totest.getContainedItem().equals(elem.getHlinscription());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void addToolspecificsHLAPITest(){
		ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void removeToolspecificsTest(){
		ArcHLAPI elem = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());
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
	

	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void equalsTest(){
		Arc a = new HlcorestructureFactoryImpl().createArc();
		Arc b = new HlcorestructureFactoryImpl().createArc();
		ArcHLAPI aprime = new ArcHLAPI(a);
		ArcHLAPI asecond = new ArcHLAPI(a);
		ArcHLAPI bprime = new ArcHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ArcHLAPI clone(){
	//	return new ArcHLAPI(this);
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
