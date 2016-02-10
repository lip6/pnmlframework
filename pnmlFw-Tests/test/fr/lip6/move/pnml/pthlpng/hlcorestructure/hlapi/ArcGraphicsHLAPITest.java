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
 * $Id ggiffo, Wed Feb 10 14:59:15 CET 2016$
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
public class ArcGraphicsHLAPITest {

	
	private LineHLAPI itemline;
		
	
	private ArcHLAPI itemcontainerArc;
	


	@AfterTest(groups = { "ArcGraphicsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArcGraphicsHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "ArcGraphicsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemline = new LineHLAPI(new HlcorestructureFactoryImpl().createLine());
			
		

	
		
		itemcontainerArc = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());
		
	
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
	   ArcGraphics llapi = new HlcorestructureFactoryImpl().createArcGraphics();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ArcGraphicsHLAPI hlapi = new ArcGraphicsHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
		public void getPositionsHLAPITest(){
			ArcGraphics llapi = new HlcorestructureFactoryImpl().createArcGraphics();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPositions().add(new HlcorestructureFactoryImpl().createPosition());
			

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
			ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new HlcorestructureFactoryImpl().createArcGraphics());

			
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
			ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new HlcorestructureFactoryImpl().createArcGraphics());

			
				elem.setContainerArcHLAPI(itemcontainerArc);
				ArcHLAPI totest = elem.getContainerArcHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerArc());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void addPositionsHLAPITest(){
		ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new HlcorestructureFactoryImpl().createArcGraphics());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPositionsHLAPI(new PositionHLAPI(new HlcorestructureFactoryImpl().createPosition()));
			

		assert elem.getContainedItem().getPositions().size() == howmany;
	}

	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void removePositionsTest(){
		ArcGraphicsHLAPI elem = new ArcGraphicsHLAPI(new HlcorestructureFactoryImpl().createArcGraphics());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PositionHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addPositionsHLAPI(new PositionHLAPI(new HlcorestructureFactoryImpl().createPosition()));
			


		
		sav = new PositionHLAPI(new HlcorestructureFactoryImpl().createPosition());
		

		elem.addPositionsHLAPI(sav);
		assert elem.getContainedItem().getPositions().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPositionsHLAPI(new PositionHLAPI(new HlcorestructureFactoryImpl().createPosition()));
			


		elem.removePositionsHLAPI(sav);

		assert elem.getContainedItem().getPositions().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ArcGraphicsHLAPI"})
	public void equalsTest(){
		ArcGraphics a = new HlcorestructureFactoryImpl().createArcGraphics();
		ArcGraphics b = new HlcorestructureFactoryImpl().createArcGraphics();
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
