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
package fr.lip6.move.pnml.symmetricnet.partitions.hlapi;

import fr.lip6.move.pnml.symmetricnet.booleans.And;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant;
import fr.lip6.move.pnml.symmetricnet.booleans.Equality;
import fr.lip6.move.pnml.symmetricnet.booleans.Imply;
import fr.lip6.move.pnml.symmetricnet.booleans.Inequality;
import fr.lip6.move.pnml.symmetricnet.booleans.Not;
import fr.lip6.move.pnml.symmetricnet.booleans.Or;

import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.dots.Dot;
import fr.lip6.move.pnml.symmetricnet.dots.DotConstant;

import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Gradient;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineShape;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PNType;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.integers.Addition;
import fr.lip6.move.pnml.symmetricnet.integers.Division;
import fr.lip6.move.pnml.symmetricnet.integers.HLInteger;
import fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber;
import fr.lip6.move.pnml.symmetricnet.integers.Modulo;
import fr.lip6.move.pnml.symmetricnet.integers.Multiplication;
import fr.lip6.move.pnml.symmetricnet.integers.Natural;
import fr.lip6.move.pnml.symmetricnet.integers.NumberConstant;
import fr.lip6.move.pnml.symmetricnet.integers.Positive;
import fr.lip6.move.pnml.symmetricnet.integers.Subtraction;

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.Add;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Cardinality;
import fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf;
import fr.lip6.move.pnml.symmetricnet.multisets.Contains;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.NumberOf;
import fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct;
import fr.lip6.move.pnml.symmetricnet.multisets.Subtract;

import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;

import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.booleans.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.dots.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.integers.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.symmetricnet.partitions.*;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class PartitionElementHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	
	private PartitionHLAPI itemrefpartition;
	


	@AfterTest(groups = { "PartitionElementHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PartitionElementHLAPI(partitions)");
	}


	@BeforeMethod(groups = { "PartitionElementHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			itemname = new String("unid");
			

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
		
		itemrefpartition = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"}, dependsOnMethods={"PartitionElementHLAPI_LLAPI"})
	public void PartitionElementHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PartitionElementHLAPI totest = new PartitionElementHLAPI(
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
	@Test(groups = { "hlapi", "PartitionElementHLAPI"}, dependsOnMethods={"PartitionElementHLAPI_LLAPI"})
	public void PartitionElementHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PartitionElementHLAPI totest = new PartitionElementHLAPI(
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
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"}, dependsOnMethods={"PartitionElementHLAPI_LLAPI"})
	public void PartitionElementHLAPI_2_refpartition() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PartitionElementHLAPI totest = new PartitionElementHLAPI(
		itemid
		,	
		itemname
	,	
		itemrefpartition
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	assert totest.getRefpartition().equals(itemrefpartition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void PartitionElementHLAPI_LLAPI(){
	   PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
	   fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI hlapi = new PartitionElementHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getRefpartitionHLAPITest(){
			PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());

			
				elem.setRefpartitionHLAPI(itemrefpartition);
				PartitionHLAPI totest = elem.getRefpartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getRefpartition());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstantsHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany = 40;
			

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<TermHLAPI> totest = elem.getPartitionelementconstantsHLAPI();

			assert totest.size() == howmany;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_partitions_GreaterThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new PartitionsFactoryImpl().createGreaterThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI> totest = elem.getPartitionelementconstants_partitions_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_partitions_PartitionElementOfHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new PartitionsFactoryImpl().createPartitionElementOf());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI> totest = elem.getPartitionelementconstants_partitions_PartitionElementOfHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_partitions_LessThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new PartitionsFactoryImpl().createLessThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI> totest = elem.getPartitionelementconstants_partitions_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_EqualityHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createEquality());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI> totest = elem.getPartitionelementconstants_booleans_EqualityHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_InequalityHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createInequality());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI> totest = elem.getPartitionelementconstants_booleans_InequalityHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_BooleanConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createBooleanConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI> totest = elem.getPartitionelementconstants_booleans_BooleanConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_OrHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createOr());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI> totest = elem.getPartitionelementconstants_booleans_OrHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_AndHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createAnd());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI> totest = elem.getPartitionelementconstants_booleans_AndHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_ImplyHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createImply());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI> totest = elem.getPartitionelementconstants_booleans_ImplyHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_NotHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createNot());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI> totest = elem.getPartitionelementconstants_booleans_NotHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_cyclicEnumerations_SuccessorHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new CyclicEnumerationsFactoryImpl().createSuccessor());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI> totest = elem.getPartitionelementconstants_cyclicEnumerations_SuccessorHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_cyclicEnumerations_PredecessorHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new CyclicEnumerationsFactoryImpl().createPredecessor());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI> totest = elem.getPartitionelementconstants_cyclicEnumerations_PredecessorHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_dots_DotConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new DotsFactoryImpl().createDotConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI> totest = elem.getPartitionelementconstants_dots_DotConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_finiteIntRanges_FiniteIntRangeConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> totest = elem.getPartitionelementconstants_finiteIntRanges_FiniteIntRangeConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_finiteIntRanges_LessThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new FiniteIntRangesFactoryImpl().createLessThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI> totest = elem.getPartitionelementconstants_finiteIntRanges_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_finiteIntRanges_GreaterThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new FiniteIntRangesFactoryImpl().createGreaterThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI> totest = elem.getPartitionelementconstants_finiteIntRanges_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_finiteIntRanges_LessThanOrEqualHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new FiniteIntRangesFactoryImpl().createLessThanOrEqual());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> totest = elem.getPartitionelementconstants_finiteIntRanges_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_finiteIntRanges_GreaterThanOrEqualHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getPartitionelementconstants_finiteIntRanges_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_NumberConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createNumberConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI> totest = elem.getPartitionelementconstants_integers_NumberConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_AdditionHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createAddition());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI> totest = elem.getPartitionelementconstants_integers_AdditionHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_SubtractionHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createSubtraction());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI> totest = elem.getPartitionelementconstants_integers_SubtractionHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_MultiplicationHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createMultiplication());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI> totest = elem.getPartitionelementconstants_integers_MultiplicationHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_DivisionHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createDivision());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI> totest = elem.getPartitionelementconstants_integers_DivisionHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_ModuloHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createModulo());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI> totest = elem.getPartitionelementconstants_integers_ModuloHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_GreaterThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createGreaterThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI> totest = elem.getPartitionelementconstants_integers_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_GreaterThanOrEqualHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createGreaterThanOrEqual());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getPartitionelementconstants_integers_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_LessThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createLessThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI> totest = elem.getPartitionelementconstants_integers_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_LessThanOrEqualHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createLessThanOrEqual());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI> totest = elem.getPartitionelementconstants_integers_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_CardinalityHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createCardinality());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI> totest = elem.getPartitionelementconstants_multisets_CardinalityHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_ContainsHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createContains());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI> totest = elem.getPartitionelementconstants_multisets_ContainsHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_CardinalityOfHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createCardinalityOf());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI> totest = elem.getPartitionelementconstants_multisets_CardinalityOfHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_AddHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createAdd());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI> totest = elem.getPartitionelementconstants_multisets_AddHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_AllHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createAll());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI> totest = elem.getPartitionelementconstants_multisets_AllHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_EmptyHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createEmpty());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI> totest = elem.getPartitionelementconstants_multisets_EmptyHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_NumberOfHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createNumberOf());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI> totest = elem.getPartitionelementconstants_multisets_NumberOfHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_SubtractHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createSubtract());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI> totest = elem.getPartitionelementconstants_multisets_SubtractHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_ScalarProductHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createScalarProduct());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI> totest = elem.getPartitionelementconstants_multisets_ScalarProductHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_terms_VariableHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new TermsFactoryImpl().createVariable());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI> totest = elem.getPartitionelementconstants_terms_VariableHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_terms_TupleHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new TermsFactoryImpl().createTuple());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI> totest = elem.getPartitionelementconstants_terms_TupleHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_terms_UserOperatorHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new TermsFactoryImpl().createUserOperator());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI> totest = elem.getPartitionelementconstants_terms_UserOperatorHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void addPartitionelementconstantsHLAPITest(){
		PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPartitionelementconstantsHLAPI(
				new GreaterThanHLAPI(
					new PartitionsFactoryImpl().createGreaterThan()
				)
			);
			

		assert elem.getContainedItem().getPartitionelementconstants().size() == howmany;
	}

	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void removePartitionelementconstantsTest(){
		PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			GreaterThanHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addPartitionelementconstantsHLAPI(
				new GreaterThanHLAPI(
				  new PartitionsFactoryImpl().createGreaterThan()
				)
			);
			


		
		sav =
			new GreaterThanHLAPI(
			  new PartitionsFactoryImpl().createGreaterThan()
			);
		

		elem.addPartitionelementconstantsHLAPI(sav);
		assert elem.getContainedItem().getPartitionelementconstants().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPartitionelementconstantsHLAPI(
				new GreaterThanHLAPI(
				  new PartitionsFactoryImpl().createGreaterThan()
				)
			);
			


		elem.removePartitionelementconstantsHLAPI(sav);

		assert elem.getContainedItem().getPartitionelementconstants().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void equalsTest(){
		PartitionElement a = new PartitionsFactoryImpl().createPartitionElement();
		PartitionElement b = new PartitionsFactoryImpl().createPartitionElement();
		PartitionElementHLAPI aprime = new PartitionElementHLAPI(a);
		PartitionElementHLAPI asecond = new PartitionElementHLAPI(a);
		PartitionElementHLAPI bprime = new PartitionElementHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PartitionElementHLAPI clone(){
	//	return new PartitionElementHLAPI(this);
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
