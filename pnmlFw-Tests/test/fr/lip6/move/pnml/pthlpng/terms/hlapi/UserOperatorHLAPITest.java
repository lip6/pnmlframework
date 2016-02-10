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
package fr.lip6.move.pnml.pthlpng.terms.hlapi;

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

import fr.lip6.move.pnml.pthlpng.partitions.GreaterThan;
import fr.lip6.move.pnml.pthlpng.partitions.LessThan;
import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf;

import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.terms.Declarations;
import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.OperatorDecl;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.SortDecl;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration;
import fr.lip6.move.pnml.pthlpng.terms.Tuple;
import fr.lip6.move.pnml.pthlpng.terms.UserOperator;
import fr.lip6.move.pnml.pthlpng.terms.UserSort;
import fr.lip6.move.pnml.pthlpng.terms.Variable;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

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
import fr.lip6.move.pnml.pthlpng.terms.*;
import fr.lip6.move.pnml.pthlpng.terms.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class UserOperatorHLAPITest {

	
	private SortHLAPI itemsort;
		
	private SortHLAPI itemoutput;
		
	private OperatorDeclHLAPI itemdeclaration;
		
	
	private OperatorHLAPI itemcontainerOperator;
	
	private NamedOperatorHLAPI itemcontainerNamedOperator;
	
	private HLMarkingHLAPI itemcontainerHLMarking;
	
	private ConditionHLAPI itemcontainerCondition;
	
	private HLAnnotationHLAPI itemcontainerHLAnnotation;
	
	private PartitionElementHLAPI itemcontainerPartitionElement;
	


	@AfterTest(groups = { "UserOperatorHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"UserOperatorHLAPI(terms)");
	}


	@BeforeMethod(groups = { "UserOperatorHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itemsort = new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
				new TermsFactoryImpl().createMultisetSort()
			);
				
			
		
			
				
			itemoutput = new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
				new TermsFactoryImpl().createMultisetSort()
			);
				
			
		
			
				
			itemdeclaration = new fr.lip6.move.pnml.pthlpng.terms.hlapi.NamedOperatorHLAPI(
				new TermsFactoryImpl().createNamedOperator()
			);
				
			
		

	
		
			
			
		itemcontainerOperator = new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI(
		   new TermsFactoryImpl().createTuple()
		);
			
		
	
		
		itemcontainerNamedOperator = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());
		
	
		
		itemcontainerHLMarking = new HLMarkingHLAPI(new HlcorestructureFactoryImpl().createHLMarking());
		
	
		
		itemcontainerCondition = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());
		
	
		
		itemcontainerHLAnnotation = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());
		
	
		
		itemcontainerPartitionElement = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	);
	
	
	
	assert totest.getSort().equals(itemsort.getContainedItem());
	
	
	
	
	assert totest.getOutput().equals(itemoutput.getContainedItem());
	
	
	
	
	assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_2_containerOperator(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	,	
		itemcontainerOperator
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_2_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	,	
		itemcontainerNamedOperator
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_2_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	,	
		itemcontainerHLMarking
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_2_containerCondition(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	,	
		itemcontainerCondition
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_2_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	,	
		itemcontainerHLAnnotation
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_2_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemsort
		,	
		itemoutput
		,	
		itemdeclaration
	,	
		itemcontainerPartitionElement
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_3(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_4_containerOperator(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	,	
	  itemcontainerOperator
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_4_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	,	
	  itemcontainerNamedOperator
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_4_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	,	
	  itemcontainerHLMarking
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_4_containerCondition(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	,	
	  itemcontainerCondition
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_4_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	,	
	  itemcontainerHLAnnotation
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "UserOperatorHLAPI"}, dependsOnMethods={"UserOperatorHLAPI_LLAPI"})
	public void UserOperatorHLAPI_4_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	UserOperatorHLAPI totest = new UserOperatorHLAPI(
		itemdeclaration
	,	
	  itemcontainerPartitionElement
	);

	
	
		
			assert totest.getDeclaration().equals(itemdeclaration.getContainedItem());
		
	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "UserOperatorHLAPI"})
	public void UserOperatorHLAPI_LLAPI(){
	   UserOperator llapi = new TermsFactoryImpl().createUserOperator();
	   fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI hlapi = new UserOperatorHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSortHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getSortHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getSortHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getSortHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getSortHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getSortHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getContainerOperatorHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				OperatorHLAPI totest_terms_Tuple = elem.getContainerOperatorHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				OperatorHLAPI totest_terms_UserOperator = elem.getContainerOperatorHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				OperatorHLAPI totest_booleans_Equality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				OperatorHLAPI totest_booleans_Inequality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				OperatorHLAPI totest_booleans_BooleanConstant = elem.getContainerOperatorHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				OperatorHLAPI totest_booleans_Or = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				OperatorHLAPI totest_booleans_And = elem.getContainerOperatorHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				OperatorHLAPI totest_booleans_Imply = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				OperatorHLAPI totest_booleans_Not = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				OperatorHLAPI totest_dots_DotConstant = elem.getContainerOperatorHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				OperatorHLAPI totest_multisets_Cardinality = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				OperatorHLAPI totest_multisets_Contains = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				OperatorHLAPI totest_multisets_CardinalityOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				OperatorHLAPI totest_multisets_Add = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				OperatorHLAPI totest_multisets_All = elem.getContainerOperatorHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				OperatorHLAPI totest_multisets_Empty = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				OperatorHLAPI totest_multisets_NumberOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				OperatorHLAPI totest_multisets_Subtract = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				OperatorHLAPI totest_multisets_ScalarProduct = elem.getContainerOperatorHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_partitions_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				OperatorHLAPI totest_partitions_PartitionElementOf = elem.getContainerOperatorHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				OperatorHLAPI totest_partitions_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getContainerNamedOperatorHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setContainerNamedOperatorHLAPI(itemcontainerNamedOperator);
				NamedOperatorHLAPI totest = elem.getContainerNamedOperatorHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getContainerHLMarkingHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setContainerHLMarkingHLAPI(itemcontainerHLMarking);
				HLMarkingHLAPI totest = elem.getContainerHLMarkingHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLMarking());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getContainerConditionHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setContainerConditionHLAPI(itemcontainerCondition);
				ConditionHLAPI totest = elem.getContainerConditionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerCondition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getContainerHLAnnotationHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setContainerHLAnnotationHLAPI(itemcontainerHLAnnotation);
				HLAnnotationHLAPI totest = elem.getContainerHLAnnotationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLAnnotation());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getContainerPartitionElementHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setContainerPartitionElementHLAPI(itemcontainerPartitionElement);
				PartitionElementHLAPI totest = elem.getContainerPartitionElementHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartitionElement());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubtermHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany = 23;
			

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<TermHLAPI> totest = elem.getSubtermHLAPI();

			assert totest.size() == howmany;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getOutputHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getOutputHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getOutputHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getOutputHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getOutputHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getOutputHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getOutput());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getInputHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany = 5;
			

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<SortHLAPI> totest = elem.getInputHLAPI();

			assert totest.size() == howmany;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getDeclarationHLAPITest(){
			UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());

			
				elem.setDeclarationHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator()));
				OperatorDeclHLAPI totest_terms_NamedOperator = elem.getDeclarationHLAPI();
				assert totest_terms_NamedOperator.getContainedItem().equals(elem.getDeclaration());
			
				elem.setDeclarationHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement()));
				OperatorDeclHLAPI totest_partitions_PartitionElement = elem.getDeclarationHLAPI();
				assert totest_partitions_PartitionElement.getContainedItem().equals(elem.getDeclaration());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_terms_VariableHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createVariable());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI> totest = elem.getSubterm_terms_VariableHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_terms_TupleHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createTuple());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI> totest = elem.getSubterm_terms_TupleHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_terms_UserOperatorHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createUserOperator());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI> totest = elem.getSubterm_terms_UserOperatorHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_EqualityHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createEquality());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI> totest = elem.getSubterm_booleans_EqualityHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_InequalityHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createInequality());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI> totest = elem.getSubterm_booleans_InequalityHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_BooleanConstantHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createBooleanConstant());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI> totest = elem.getSubterm_booleans_BooleanConstantHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_OrHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createOr());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI> totest = elem.getSubterm_booleans_OrHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_AndHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createAnd());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI> totest = elem.getSubterm_booleans_AndHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_ImplyHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createImply());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI> totest = elem.getSubterm_booleans_ImplyHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_booleans_NotHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createNot());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI> totest = elem.getSubterm_booleans_NotHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_dots_DotConstantHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new DotsFactoryImpl().createDotConstant());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI> totest = elem.getSubterm_dots_DotConstantHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_CardinalityHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinality());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI> totest = elem.getSubterm_multisets_CardinalityHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_ContainsHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createContains());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI> totest = elem.getSubterm_multisets_ContainsHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_CardinalityOfHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinalityOf());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI> totest = elem.getSubterm_multisets_CardinalityOfHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_AddHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAdd());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI> totest = elem.getSubterm_multisets_AddHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_AllHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAll());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI> totest = elem.getSubterm_multisets_AllHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_EmptyHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createEmpty());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI> totest = elem.getSubterm_multisets_EmptyHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_NumberOfHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createNumberOf());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI> totest = elem.getSubterm_multisets_NumberOfHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_SubtractHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createSubtract());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI> totest = elem.getSubterm_multisets_SubtractHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_multisets_ScalarProductHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createScalarProduct());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI> totest = elem.getSubterm_multisets_ScalarProductHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_partitions_GreaterThanHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createGreaterThan());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_partitions_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_partitions_PartitionElementOfHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createPartitionElementOf());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI> totest = elem.getSubterm_partitions_PartitionElementOfHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getSubterm_partitions_LessThanHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createLessThan());
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			howmany += 23;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI> totest = elem.getSubterm_partitions_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getInput_terms_MultisetSortHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createMultisetSort());
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI> totest = elem.getInput_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getInput_terms_ProductSortHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createProductSort());
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI> totest = elem.getInput_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getInput_terms_UserSortHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createUserSort());
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI> totest = elem.getInput_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getInput_booleans_BoolHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new BooleansFactoryImpl().createBool());
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI> totest = elem.getInput_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "UserOperatorHLAPI"})
		public void getInput_dots_DotHLAPITest(){
			UserOperator llapi = new TermsFactoryImpl().createUserOperator();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new DotsFactoryImpl().createDot());
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			UserOperatorHLAPI elem = new UserOperatorHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI> totest = elem.getInput_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "UserOperatorHLAPI"})
	public void addSubtermHLAPITest(){
		UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addSubtermHLAPI(
				new VariableHLAPI(
					new TermsFactoryImpl().createVariable()
				)
			);
			

		assert elem.getContainedItem().getSubterm().size() == howmany;
	}

	@Test(groups = { "hlapi", "UserOperatorHLAPI"})
	public void removeSubtermTest(){
		UserOperatorHLAPI elem = new UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			VariableHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addSubtermHLAPI(
				new VariableHLAPI(
				  new TermsFactoryImpl().createVariable()
				)
			);
			


		
		sav =
			new VariableHLAPI(
			  new TermsFactoryImpl().createVariable()
			);
		

		elem.addSubtermHLAPI(sav);
		assert elem.getContainedItem().getSubterm().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addSubtermHLAPI(
				new VariableHLAPI(
				  new TermsFactoryImpl().createVariable()
				)
			);
			


		elem.removeSubtermHLAPI(sav);

		assert elem.getContainedItem().getSubterm().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "UserOperatorHLAPI"})
	public void equalsTest(){
		UserOperator a = new TermsFactoryImpl().createUserOperator();
		UserOperator b = new TermsFactoryImpl().createUserOperator();
		UserOperatorHLAPI aprime = new UserOperatorHLAPI(a);
		UserOperatorHLAPI asecond = new UserOperatorHLAPI(a);
		UserOperatorHLAPI bprime = new UserOperatorHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public UserOperatorHLAPI clone(){
	//	return new UserOperatorHLAPI(this);
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
