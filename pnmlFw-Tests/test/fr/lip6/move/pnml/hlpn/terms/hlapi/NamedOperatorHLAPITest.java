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
 * $Id ggiffo, Thu Jan 02 00:08:30 CET 2014$
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
import fr.lip6.move.pnml.hlpn.terms.SortDecl;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsDeclaration;
import fr.lip6.move.pnml.hlpn.terms.Tuple;
import fr.lip6.move.pnml.hlpn.terms.UserSort;
import fr.lip6.move.pnml.hlpn.terms.Variable;
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
public class NamedOperatorHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private TermHLAPI itemdef;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "NamedOperatorHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"NamedOperatorHLAPI(terms)");
	}


	@BeforeMethod(groups = { "NamedOperatorHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			itemname = new String("unid");
			
			
				
			itemdef = new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI(
				new TermsFactoryImpl().createVariable()
			);
				
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"}, dependsOnMethods={"NamedOperatorHLAPI_LLAPI"})
	public void NamedOperatorHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	NamedOperatorHLAPI totest = new NamedOperatorHLAPI(
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
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"}, dependsOnMethods={"NamedOperatorHLAPI_LLAPI"})
	public void NamedOperatorHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	NamedOperatorHLAPI totest = new NamedOperatorHLAPI(
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
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void NamedOperatorHLAPI_LLAPI(){
	   NamedOperator llapi = new TermsFactoryImpl().createNamedOperator();
	   fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI hlapi = new NamedOperatorHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
		public void getDefHLAPITest(){
			NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());

			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI(new TermsFactoryImpl().createVariable()));
				TermHLAPI totest_terms_Variable = elem.getDefHLAPI();
				assert totest_terms_Variable.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				TermHLAPI totest_terms_Tuple = elem.getDefHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				TermHLAPI totest_terms_UserOperator = elem.getDefHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				TermHLAPI totest_booleans_Equality = elem.getDefHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				TermHLAPI totest_booleans_Inequality = elem.getDefHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				TermHLAPI totest_booleans_BooleanConstant = elem.getDefHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				TermHLAPI totest_booleans_Or = elem.getDefHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				TermHLAPI totest_booleans_And = elem.getDefHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				TermHLAPI totest_booleans_Imply = elem.getDefHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				TermHLAPI totest_booleans_Not = elem.getDefHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI(new CyclicEnumerationsFactoryImpl().createSuccessor()));
				TermHLAPI totest_cyclicEnumerations_Successor = elem.getDefHLAPI();
				assert totest_cyclicEnumerations_Successor.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI(new CyclicEnumerationsFactoryImpl().createPredecessor()));
				TermHLAPI totest_cyclicEnumerations_Predecessor = elem.getDefHLAPI();
				assert totest_cyclicEnumerations_Predecessor.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				TermHLAPI totest_dots_DotConstant = elem.getDefHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()));
				TermHLAPI totest_finiteIntRanges_FiniteIntRangeConstant = elem.getDefHLAPI();
				assert totest_finiteIntRanges_FiniteIntRangeConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI(new FiniteIntRangesFactoryImpl().createLessThan()));
				TermHLAPI totest_finiteIntRanges_LessThan = elem.getDefHLAPI();
				assert totest_finiteIntRanges_LessThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThan()));
				TermHLAPI totest_finiteIntRanges_GreaterThan = elem.getDefHLAPI();
				assert totest_finiteIntRanges_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_finiteIntRanges_LessThanOrEqual = elem.getDefHLAPI();
				assert totest_finiteIntRanges_LessThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_finiteIntRanges_GreaterThanOrEqual = elem.getDefHLAPI();
				assert totest_finiteIntRanges_GreaterThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant()));
				TermHLAPI totest_integers_NumberConstant = elem.getDefHLAPI();
				assert totest_integers_NumberConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI(new IntegersFactoryImpl().createAddition()));
				TermHLAPI totest_integers_Addition = elem.getDefHLAPI();
				assert totest_integers_Addition.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI(new IntegersFactoryImpl().createSubtraction()));
				TermHLAPI totest_integers_Subtraction = elem.getDefHLAPI();
				assert totest_integers_Subtraction.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI(new IntegersFactoryImpl().createMultiplication()));
				TermHLAPI totest_integers_Multiplication = elem.getDefHLAPI();
				assert totest_integers_Multiplication.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI(new IntegersFactoryImpl().createDivision()));
				TermHLAPI totest_integers_Division = elem.getDefHLAPI();
				assert totest_integers_Division.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI(new IntegersFactoryImpl().createModulo()));
				TermHLAPI totest_integers_Modulo = elem.getDefHLAPI();
				assert totest_integers_Modulo.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI(new IntegersFactoryImpl().createGreaterThan()));
				TermHLAPI totest_integers_GreaterThan = elem.getDefHLAPI();
				assert totest_integers_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI(new IntegersFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_integers_GreaterThanOrEqual = elem.getDefHLAPI();
				assert totest_integers_GreaterThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI(new IntegersFactoryImpl().createLessThan()));
				TermHLAPI totest_integers_LessThan = elem.getDefHLAPI();
				assert totest_integers_LessThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI(new IntegersFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_integers_LessThanOrEqual = elem.getDefHLAPI();
				assert totest_integers_LessThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI(new ListsFactoryImpl().createEmptyList()));
				TermHLAPI totest_lists_EmptyList = elem.getDefHLAPI();
				assert totest_lists_EmptyList.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI(new ListsFactoryImpl().createAppend()));
				TermHLAPI totest_lists_Append = elem.getDefHLAPI();
				assert totest_lists_Append.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI(new ListsFactoryImpl().createConcatenation()));
				TermHLAPI totest_lists_Concatenation = elem.getDefHLAPI();
				assert totest_lists_Concatenation.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI(new ListsFactoryImpl().createLength()));
				TermHLAPI totest_lists_Length = elem.getDefHLAPI();
				assert totest_lists_Length.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI(new ListsFactoryImpl().createMakeList()));
				TermHLAPI totest_lists_MakeList = elem.getDefHLAPI();
				assert totest_lists_MakeList.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI(new ListsFactoryImpl().createMemberAtIndex()));
				TermHLAPI totest_lists_MemberAtIndex = elem.getDefHLAPI();
				assert totest_lists_MemberAtIndex.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI(new ListsFactoryImpl().createSublist()));
				TermHLAPI totest_lists_Sublist = elem.getDefHLAPI();
				assert totest_lists_Sublist.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				TermHLAPI totest_multisets_Cardinality = elem.getDefHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				TermHLAPI totest_multisets_Contains = elem.getDefHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				TermHLAPI totest_multisets_CardinalityOf = elem.getDefHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				TermHLAPI totest_multisets_Add = elem.getDefHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				TermHLAPI totest_multisets_All = elem.getDefHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				TermHLAPI totest_multisets_Empty = elem.getDefHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				TermHLAPI totest_multisets_NumberOf = elem.getDefHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				TermHLAPI totest_multisets_Subtract = elem.getDefHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				TermHLAPI totest_multisets_ScalarProduct = elem.getDefHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				TermHLAPI totest_partitions_GreaterThan = elem.getDefHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				TermHLAPI totest_partitions_PartitionElementOf = elem.getDefHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				TermHLAPI totest_partitions_LessThan = elem.getDefHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI(new StringsFactoryImpl().createStringConstant()));
				TermHLAPI totest_strings_StringConstant = elem.getDefHLAPI();
				assert totest_strings_StringConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI(new StringsFactoryImpl().createAppend()));
				TermHLAPI totest_strings_Append = elem.getDefHLAPI();
				assert totest_strings_Append.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI(new StringsFactoryImpl().createConcatenation()));
				TermHLAPI totest_strings_Concatenation = elem.getDefHLAPI();
				assert totest_strings_Concatenation.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI(new StringsFactoryImpl().createGreaterThan()));
				TermHLAPI totest_strings_GreaterThan = elem.getDefHLAPI();
				assert totest_strings_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI(new StringsFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_strings_GreaterThanOrEqual = elem.getDefHLAPI();
				assert totest_strings_GreaterThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI(new StringsFactoryImpl().createLessThan()));
				TermHLAPI totest_strings_LessThan = elem.getDefHLAPI();
				assert totest_strings_LessThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI(new StringsFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_strings_LessThanOrEqual = elem.getDefHLAPI();
				assert totest_strings_LessThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI(new StringsFactoryImpl().createLength()));
				TermHLAPI totest_strings_Length = elem.getDefHLAPI();
				assert totest_strings_Length.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI(new StringsFactoryImpl().createSubstring()));
				TermHLAPI totest_strings_Substring = elem.getDefHLAPI();
				assert totest_strings_Substring.getContainedItem().equals(elem.getDef());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
		public void getParametersHLAPITest(){
			NamedOperator llapi = new TermsFactoryImpl().createNamedOperator();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getParameters().add(new TermsFactoryImpl().createVariableDecl());
			

			NamedOperatorHLAPI elem = new NamedOperatorHLAPI(llapi);
			List<VariableDeclHLAPI> totest = elem.getParametersHLAPI();

			assert totest.size() == howmany;

			for (VariableDeclHLAPI unit : totest) {
             assert llapi.getParameters().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void addParametersHLAPITest(){
		NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addParametersHLAPI(new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl()));
			

		assert elem.getContainedItem().getParameters().size() == howmany;
	}

	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void removeParametersTest(){
		NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			VariableDeclHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addParametersHLAPI(new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl()));
			


		
		sav = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
		

		elem.addParametersHLAPI(sav);
		assert elem.getContainedItem().getParameters().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addParametersHLAPI(new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl()));
			


		elem.removeParametersHLAPI(sav);

		assert elem.getContainedItem().getParameters().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void equalsTest(){
		NamedOperator a = new TermsFactoryImpl().createNamedOperator();
		NamedOperator b = new TermsFactoryImpl().createNamedOperator();
		NamedOperatorHLAPI aprime = new NamedOperatorHLAPI(a);
		NamedOperatorHLAPI asecond = new NamedOperatorHLAPI(a);
		NamedOperatorHLAPI bprime = new NamedOperatorHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public NamedOperatorHLAPI clone(){
	//	return new NamedOperatorHLAPI(this);
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
