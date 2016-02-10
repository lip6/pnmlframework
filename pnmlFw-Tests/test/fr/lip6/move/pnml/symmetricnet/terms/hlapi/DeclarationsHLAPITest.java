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
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

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
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration;
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
import fr.lip6.move.pnml.symmetricnet.terms.*;
import fr.lip6.move.pnml.symmetricnet.terms.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class DeclarationsHLAPITest {

	
	
	private DeclarationHLAPI itemcontainerDeclaration;
	


	@AfterTest(groups = { "DeclarationsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"DeclarationsHLAPI(terms)");
	}


	@BeforeMethod(groups = { "DeclarationsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	

	
		
		itemcontainerDeclaration = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "DeclarationsHLAPI"}, dependsOnMethods={"DeclarationsHLAPI_LLAPI"})
	public void DeclarationsHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	DeclarationsHLAPI totest = new DeclarationsHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DeclarationsHLAPI"}, dependsOnMethods={"DeclarationsHLAPI_LLAPI"})
	public void DeclarationsHLAPI_2_containerDeclaration(){//BEGIN CONSTRUCTOR BODY

	DeclarationsHLAPI totest = new DeclarationsHLAPI(
		itemcontainerDeclaration
	);
	
	assert totest.getContainerDeclaration().equals(itemcontainerDeclaration.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void DeclarationsHLAPI_LLAPI(){
	   Declarations llapi = new TermsFactoryImpl().createDeclarations();
	   fr.lip6.move.pnml.symmetricnet.terms.hlapi.DeclarationsHLAPI hlapi = new DeclarationsHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclarationHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany = 6;
			

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<TermsDeclarationHLAPI> totest = elem.getDeclarationHLAPI();

			assert totest.size() == howmany;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getContainerDeclarationHLAPITest(){
			DeclarationsHLAPI elem = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());

			
				elem.setContainerDeclarationHLAPI(itemcontainerDeclaration);
				DeclarationHLAPI totest = elem.getContainerDeclarationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclaration());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_terms_VariableDeclHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new TermsFactoryImpl().createVariableDecl());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI> totest = elem.getDeclaration_terms_VariableDeclHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_terms_NamedSortHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new TermsFactoryImpl().createNamedSort());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI> totest = elem.getDeclaration_terms_NamedSortHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_terms_NamedOperatorHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new TermsFactoryImpl().createNamedOperator());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI> totest = elem.getDeclaration_terms_NamedOperatorHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_finiteEnumerations_FEConstantHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new FiniteEnumerationsFactoryImpl().createFEConstant());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI> totest = elem.getDeclaration_finiteEnumerations_FEConstantHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_partitions_PartitionHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new PartitionsFactoryImpl().createPartition());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI> totest = elem.getDeclaration_partitions_PartitionHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_partitions_PartitionElementHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new PartitionsFactoryImpl().createPartitionElement());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI> totest = elem.getDeclaration_partitions_PartitionElementHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void addDeclarationHLAPITest(){
		DeclarationsHLAPI elem = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addDeclarationHLAPI(
				new VariableDeclHLAPI(
					new TermsFactoryImpl().createVariableDecl()
				)
			);
			

		assert elem.getContainedItem().getDeclaration().size() == howmany;
	}

	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void removeDeclarationTest(){
		DeclarationsHLAPI elem = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			VariableDeclHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addDeclarationHLAPI(
				new VariableDeclHLAPI(
				  new TermsFactoryImpl().createVariableDecl()
				)
			);
			


		
		sav =
			new VariableDeclHLAPI(
			  new TermsFactoryImpl().createVariableDecl()
			);
		

		elem.addDeclarationHLAPI(sav);
		assert elem.getContainedItem().getDeclaration().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addDeclarationHLAPI(
				new VariableDeclHLAPI(
				  new TermsFactoryImpl().createVariableDecl()
				)
			);
			


		elem.removeDeclarationHLAPI(sav);

		assert elem.getContainedItem().getDeclaration().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void equalsTest(){
		Declarations a = new TermsFactoryImpl().createDeclarations();
		Declarations b = new TermsFactoryImpl().createDeclarations();
		DeclarationsHLAPI aprime = new DeclarationsHLAPI(a);
		DeclarationsHLAPI asecond = new DeclarationsHLAPI(a);
		DeclarationsHLAPI bprime = new DeclarationsHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public DeclarationsHLAPI clone(){
	//	return new DeclarationsHLAPI(this);
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
