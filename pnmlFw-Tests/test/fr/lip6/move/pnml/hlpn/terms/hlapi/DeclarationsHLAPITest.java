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
 * $Id ggiffo, Thu Feb 11 16:29:59 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.terms.hlapi;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.booleans.And;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.BooleanConstant;
import fr.lip6.move.pnml.hlpn.booleans.Equality;
import fr.lip6.move.pnml.hlpn.booleans.Imply;
import fr.lip6.move.pnml.hlpn.booleans.Inequality;
import fr.lip6.move.pnml.hlpn.booleans.Not;
import fr.lip6.move.pnml.hlpn.booleans.Or;

import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.dots.Dot;
import fr.lip6.move.pnml.hlpn.dots.DotConstant;

import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Arc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Font;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Offset;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Place;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Position;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Transition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.Addition;
import fr.lip6.move.pnml.hlpn.integers.Division;
import fr.lip6.move.pnml.hlpn.integers.HLInteger;
import fr.lip6.move.pnml.hlpn.integers.HLPNNumber;
import fr.lip6.move.pnml.hlpn.integers.Modulo;
import fr.lip6.move.pnml.hlpn.integers.Multiplication;
import fr.lip6.move.pnml.hlpn.integers.Natural;
import fr.lip6.move.pnml.hlpn.integers.NumberConstant;
import fr.lip6.move.pnml.hlpn.integers.Positive;
import fr.lip6.move.pnml.hlpn.integers.Subtraction;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.Append;
import fr.lip6.move.pnml.hlpn.lists.Concatenation;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.Length;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.MemberAtIndex;
import fr.lip6.move.pnml.hlpn.lists.Sublist;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.Add;
import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Cardinality;
import fr.lip6.move.pnml.hlpn.multisets.CardinalityOf;
import fr.lip6.move.pnml.hlpn.multisets.Contains;
import fr.lip6.move.pnml.hlpn.multisets.Empty;
import fr.lip6.move.pnml.hlpn.multisets.NumberOf;
import fr.lip6.move.pnml.hlpn.multisets.ScalarProduct;
import fr.lip6.move.pnml.hlpn.multisets.Subtract;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.HLPNString;
import fr.lip6.move.pnml.hlpn.strings.StringConstant;
import fr.lip6.move.pnml.hlpn.strings.Substring;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsDeclaration;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

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
import fr.lip6.move.pnml.hlpn.terms.*;
import fr.lip6.move.pnml.hlpn.terms.impl.*;
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
	   fr.lip6.move.pnml.hlpn.terms.hlapi.DeclarationsHLAPI hlapi = new DeclarationsHLAPI(llapi);
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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany = 9;
			

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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI> totest = elem.getDeclaration_terms_VariableDeclHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI> totest = elem.getDeclaration_terms_NamedSortHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI> totest = elem.getDeclaration_terms_NamedOperatorHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
		public void getDeclaration_arbitrarydeclarations_ArbitrarySortHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new ArbitrarydeclarationsFactoryImpl().createArbitrarySort());
			
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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI> totest = elem.getDeclaration_arbitrarydeclarations_ArbitrarySortHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
		public void getDeclaration_arbitrarydeclarations_ArbitraryOperatorHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator());
			
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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI> totest = elem.getDeclaration_arbitrarydeclarations_ArbitraryOperatorHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
		public void getDeclaration_arbitrarydeclarations_UnparsedHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new ArbitrarydeclarationsFactoryImpl().createUnparsed());
			
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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI> totest = elem.getDeclaration_arbitrarydeclarations_UnparsedHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FEConstantHLAPI> totest = elem.getDeclaration_finiteEnumerations_FEConstantHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI> totest = elem.getDeclaration_partitions_PartitionHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
			   new ArbitrarydeclarationsFactoryImpl().createArbitrarySort()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createArbitraryOperator()
			);
			
			llapi.getDeclaration().add(
			   new ArbitrarydeclarationsFactoryImpl().createUnparsed()
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
			
			howmany += 9;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI> totest = elem.getDeclaration_partitions_PartitionElementHLAPI();

			assert totest.size() == howmany + 1 - 9;

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
