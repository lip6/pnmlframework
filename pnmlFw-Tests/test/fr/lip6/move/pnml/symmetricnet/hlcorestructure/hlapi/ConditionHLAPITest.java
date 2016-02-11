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
 * $Id ggiffo, Thu Feb 11 16:29:02 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

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

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;

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
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class ConditionHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private String itemtext;
		
	private TermHLAPI itemstructure;
		
	
	private TransitionHLAPI itemcontainerTransition;
	


	@AfterTest(groups = { "ConditionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ConditionHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "ConditionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = new String("unid");
			
			
				
			itemstructure = new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(
				new BooleansFactoryImpl().createEquality()
			);
				
			
		

	
		
		itemcontainerTransition = new TransitionHLAPI(new HlcorestructureFactoryImpl().createTransition());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ConditionHLAPI"}, dependsOnMethods={"ConditionHLAPI_LLAPI"})
	public void ConditionHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ConditionHLAPI totest = new ConditionHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	);
	
	
	
	assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
	
	
	
	assert totest.getText().equals(itemtext);
	
	
	
	
	assert totest.getStructure().equals(itemstructure.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ConditionHLAPI"}, dependsOnMethods={"ConditionHLAPI_LLAPI"})
	public void ConditionHLAPI_2_containerTransition(){//BEGIN CONSTRUCTOR BODY

	ConditionHLAPI totest = new ConditionHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	,	
		itemcontainerTransition
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	
		
			assert totest.getStructure().equals(itemstructure.getContainedItem());
		
	
	assert totest.getContainerTransition().equals(itemcontainerTransition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ConditionHLAPI"}, dependsOnMethods={"ConditionHLAPI_LLAPI"})
	public void ConditionHLAPI_4_containerTransition(){//BEGIN CONSTRUCTOR BODY

	ConditionHLAPI totest = new ConditionHLAPI(
	  itemcontainerTransition
	);

	
	assert totest.getContainerTransition().equals(itemcontainerTransition.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ConditionHLAPI"})
	public void ConditionHLAPI_LLAPI(){
	   Condition llapi = new HlcorestructureFactoryImpl().createCondition();
	   fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ConditionHLAPI hlapi = new ConditionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ConditionHLAPI"})
		public void getToolspecificsHLAPITest(){
			Condition llapi = new HlcorestructureFactoryImpl().createCondition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			ConditionHLAPI elem = new ConditionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "ConditionHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			ConditionHLAPI elem = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ConditionHLAPI"})
		public void getStructureHLAPITest(){
			ConditionHLAPI elem = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());

			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				TermHLAPI totest_booleans_Equality = elem.getStructureHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				TermHLAPI totest_booleans_Inequality = elem.getStructureHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				TermHLAPI totest_booleans_BooleanConstant = elem.getStructureHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				TermHLAPI totest_booleans_Or = elem.getStructureHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				TermHLAPI totest_booleans_And = elem.getStructureHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				TermHLAPI totest_booleans_Imply = elem.getStructureHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				TermHLAPI totest_booleans_Not = elem.getStructureHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI(new CyclicEnumerationsFactoryImpl().createSuccessor()));
				TermHLAPI totest_cyclicEnumerations_Successor = elem.getStructureHLAPI();
				assert totest_cyclicEnumerations_Successor.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI(new CyclicEnumerationsFactoryImpl().createPredecessor()));
				TermHLAPI totest_cyclicEnumerations_Predecessor = elem.getStructureHLAPI();
				assert totest_cyclicEnumerations_Predecessor.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				TermHLAPI totest_dots_DotConstant = elem.getStructureHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()));
				TermHLAPI totest_finiteIntRanges_FiniteIntRangeConstant = elem.getStructureHLAPI();
				assert totest_finiteIntRanges_FiniteIntRangeConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI(new FiniteIntRangesFactoryImpl().createLessThan()));
				TermHLAPI totest_finiteIntRanges_LessThan = elem.getStructureHLAPI();
				assert totest_finiteIntRanges_LessThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThan()));
				TermHLAPI totest_finiteIntRanges_GreaterThan = elem.getStructureHLAPI();
				assert totest_finiteIntRanges_GreaterThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_finiteIntRanges_LessThanOrEqual = elem.getStructureHLAPI();
				assert totest_finiteIntRanges_LessThanOrEqual.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_finiteIntRanges_GreaterThanOrEqual = elem.getStructureHLAPI();
				assert totest_finiteIntRanges_GreaterThanOrEqual.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant()));
				TermHLAPI totest_integers_NumberConstant = elem.getStructureHLAPI();
				assert totest_integers_NumberConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI(new IntegersFactoryImpl().createAddition()));
				TermHLAPI totest_integers_Addition = elem.getStructureHLAPI();
				assert totest_integers_Addition.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI(new IntegersFactoryImpl().createSubtraction()));
				TermHLAPI totest_integers_Subtraction = elem.getStructureHLAPI();
				assert totest_integers_Subtraction.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI(new IntegersFactoryImpl().createMultiplication()));
				TermHLAPI totest_integers_Multiplication = elem.getStructureHLAPI();
				assert totest_integers_Multiplication.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI(new IntegersFactoryImpl().createDivision()));
				TermHLAPI totest_integers_Division = elem.getStructureHLAPI();
				assert totest_integers_Division.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI(new IntegersFactoryImpl().createModulo()));
				TermHLAPI totest_integers_Modulo = elem.getStructureHLAPI();
				assert totest_integers_Modulo.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI(new IntegersFactoryImpl().createGreaterThan()));
				TermHLAPI totest_integers_GreaterThan = elem.getStructureHLAPI();
				assert totest_integers_GreaterThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI(new IntegersFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_integers_GreaterThanOrEqual = elem.getStructureHLAPI();
				assert totest_integers_GreaterThanOrEqual.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI(new IntegersFactoryImpl().createLessThan()));
				TermHLAPI totest_integers_LessThan = elem.getStructureHLAPI();
				assert totest_integers_LessThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI(new IntegersFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_integers_LessThanOrEqual = elem.getStructureHLAPI();
				assert totest_integers_LessThanOrEqual.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				TermHLAPI totest_multisets_Cardinality = elem.getStructureHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				TermHLAPI totest_multisets_Contains = elem.getStructureHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				TermHLAPI totest_multisets_CardinalityOf = elem.getStructureHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				TermHLAPI totest_multisets_Add = elem.getStructureHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				TermHLAPI totest_multisets_All = elem.getStructureHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				TermHLAPI totest_multisets_Empty = elem.getStructureHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				TermHLAPI totest_multisets_NumberOf = elem.getStructureHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				TermHLAPI totest_multisets_Subtract = elem.getStructureHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				TermHLAPI totest_multisets_ScalarProduct = elem.getStructureHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				TermHLAPI totest_partitions_GreaterThan = elem.getStructureHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				TermHLAPI totest_partitions_PartitionElementOf = elem.getStructureHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				TermHLAPI totest_partitions_LessThan = elem.getStructureHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI(new TermsFactoryImpl().createVariable()));
				TermHLAPI totest_terms_Variable = elem.getStructureHLAPI();
				assert totest_terms_Variable.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				TermHLAPI totest_terms_Tuple = elem.getStructureHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				TermHLAPI totest_terms_UserOperator = elem.getStructureHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getStructure());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ConditionHLAPI"})
		public void getContainerTransitionHLAPITest(){
			ConditionHLAPI elem = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());

			
				elem.setContainerTransitionHLAPI(itemcontainerTransition);
				TransitionHLAPI totest = elem.getContainerTransitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerTransition());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ConditionHLAPI"})
	public void addToolspecificsHLAPITest(){
		ConditionHLAPI elem = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "ConditionHLAPI"})
	public void removeToolspecificsTest(){
		ConditionHLAPI elem = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());
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
	

	@Test(groups = { "hlapi", "ConditionHLAPI"})
	public void equalsTest(){
		Condition a = new HlcorestructureFactoryImpl().createCondition();
		Condition b = new HlcorestructureFactoryImpl().createCondition();
		ConditionHLAPI aprime = new ConditionHLAPI(a);
		ConditionHLAPI asecond = new ConditionHLAPI(a);
		ConditionHLAPI bprime = new ConditionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ConditionHLAPI clone(){
	//	return new ConditionHLAPI(this);
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
