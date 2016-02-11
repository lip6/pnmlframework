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
package fr.lip6.move.pnml.pthlpng.partitions.hlapi;

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
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Dimension;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Fill;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Font;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.FontDecoration;
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
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Place;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PnObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Position;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Transition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.pthlpng.integers.Addition;
import fr.lip6.move.pnml.pthlpng.integers.Division;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThan;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual;
import fr.lip6.move.pnml.pthlpng.integers.HLInteger;
import fr.lip6.move.pnml.pthlpng.integers.HLPNNumber;
import fr.lip6.move.pnml.pthlpng.integers.LessThan;
import fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual;
import fr.lip6.move.pnml.pthlpng.integers.Modulo;
import fr.lip6.move.pnml.pthlpng.integers.Multiplication;
import fr.lip6.move.pnml.pthlpng.integers.Natural;
import fr.lip6.move.pnml.pthlpng.integers.NumberConstant;
import fr.lip6.move.pnml.pthlpng.integers.Positive;
import fr.lip6.move.pnml.pthlpng.integers.Subtraction;

import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.pthlpng.multisets.Add;
import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Cardinality;
import fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf;
import fr.lip6.move.pnml.pthlpng.multisets.Contains;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;
import fr.lip6.move.pnml.pthlpng.multisets.NumberOf;
import fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct;
import fr.lip6.move.pnml.pthlpng.multisets.Subtract;

import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;

import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.terms.Declarations;
import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

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
import fr.lip6.move.pnml.pthlpng.partitions.*;
import fr.lip6.move.pnml.pthlpng.partitions.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class PartitionHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private SortHLAPI itemdef;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "PartitionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PartitionHLAPI(partitions)");
	}


	@BeforeMethod(groups = { "PartitionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			itemname = new String("unid");
			
			
				
			itemdef = new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(
				new BooleansFactoryImpl().createBool()
			);
				
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PartitionHLAPI"}, dependsOnMethods={"PartitionHLAPI_LLAPI"})
	public void PartitionHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PartitionHLAPI totest = new PartitionHLAPI(
		itemid
		,	
		itemname
		,	
		itemdef
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	
	
	assert totest.getDef().equals(itemdef.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PartitionHLAPI"}, dependsOnMethods={"PartitionHLAPI_LLAPI"})
	public void PartitionHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PartitionHLAPI totest = new PartitionHLAPI(
		itemid
		,	
		itemname
		,	
		itemdef
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	
		
			assert totest.getDef().equals(itemdef.getContainedItem());
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void PartitionHLAPI_LLAPI(){
	   Partition llapi = new PartitionsFactoryImpl().createPartition();
	   fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionHLAPI hlapi = new PartitionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionHLAPI"})
		public void getDefHLAPITest(){
			PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());

			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getDefHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getDefHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getDefHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getDefHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getDefHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getDefHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getDefHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getDefHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getDef());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PartitionHLAPI"})
		public void getPartitionelementsHLAPITest(){
			Partition llapi = new PartitionsFactoryImpl().createPartition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelements().add(new PartitionsFactoryImpl().createPartitionElement());
			

			PartitionHLAPI elem = new PartitionHLAPI(llapi);
			List<PartitionElementHLAPI> totest = elem.getPartitionelementsHLAPI();

			assert totest.size() == howmany;

			for (PartitionElementHLAPI unit : totest) {
             assert llapi.getPartitionelements().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void addPartitionelementsHLAPITest(){
		PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPartitionelementsHLAPI(new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
			

		assert elem.getContainedItem().getPartitionelements().size() == howmany;
	}

	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void removePartitionelementsTest(){
		PartitionHLAPI elem = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PartitionElementHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addPartitionelementsHLAPI(new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
			


		
		sav = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		

		elem.addPartitionelementsHLAPI(sav);
		assert elem.getContainedItem().getPartitionelements().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPartitionelementsHLAPI(new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
			


		elem.removePartitionelementsHLAPI(sav);

		assert elem.getContainedItem().getPartitionelements().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PartitionHLAPI"})
	public void equalsTest(){
		Partition a = new PartitionsFactoryImpl().createPartition();
		Partition b = new PartitionsFactoryImpl().createPartition();
		PartitionHLAPI aprime = new PartitionHLAPI(a);
		PartitionHLAPI asecond = new PartitionHLAPI(a);
		PartitionHLAPI bprime = new PartitionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PartitionHLAPI clone(){
	//	return new PartitionHLAPI(this);
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
