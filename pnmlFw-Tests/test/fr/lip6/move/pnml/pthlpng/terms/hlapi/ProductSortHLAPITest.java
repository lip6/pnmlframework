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
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.TermsDeclaration;
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
public class ProductSortHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	


	@AfterTest(groups = { "ProductSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ProductSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "ProductSortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	

	
		
		itemmulti = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());
		
	
		
		itemcontainerNamedSort = new NamedSortHLAPI(new TermsFactoryImpl().createNamedSort());
		
	
		
		itemcontainerVariableDecl = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
		
	
		
		itemcontainerProductSort = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		
	
		
		itemcontainerType = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
		
	
		
		itemcontainerAll = new AllHLAPI(new MultisetsFactoryImpl().createAll());
		
	
		
		itemcontainerEmpty = new EmptyHLAPI(new MultisetsFactoryImpl().createEmpty());
		
	
		
		itemcontainerPartition = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ProductSortHLAPI totest = new ProductSortHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void ProductSortHLAPI_LLAPI(){
	   ProductSort llapi = new TermsFactoryImpl().createProductSort();
	   fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI hlapi = new ProductSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getMultiHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerTypeHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerAllHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany = 5;
			

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<SortHLAPI> totest = elem.getElementSortHLAPI();

			assert totest.size() == howmany;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_MultisetSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createMultisetSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI> totest = elem.getElementSort_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_ProductSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createProductSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI> totest = elem.getElementSort_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_UserSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createUserSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI> totest = elem.getElementSort_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_booleans_BoolHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new BooleansFactoryImpl().createBool());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI> totest = elem.getElementSort_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_dots_DotHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new DotsFactoryImpl().createDot());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			howmany += 5;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI> totest = elem.getElementSort_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void addElementSortHLAPITest(){
		ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
					new TermsFactoryImpl().createMultisetSort()
				)
			);
			

		assert elem.getContainedItem().getElementSort().size() == howmany;
	}

	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void removeElementSortTest(){
		ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			MultisetSortHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
				  new TermsFactoryImpl().createMultisetSort()
				)
			);
			


		
		sav =
			new MultisetSortHLAPI(
			  new TermsFactoryImpl().createMultisetSort()
			);
		

		elem.addElementSortHLAPI(sav);
		assert elem.getContainedItem().getElementSort().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
				  new TermsFactoryImpl().createMultisetSort()
				)
			);
			


		elem.removeElementSortHLAPI(sav);

		assert elem.getContainedItem().getElementSort().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void equalsTest(){
		ProductSort a = new TermsFactoryImpl().createProductSort();
		ProductSort b = new TermsFactoryImpl().createProductSort();
		ProductSortHLAPI aprime = new ProductSortHLAPI(a);
		ProductSortHLAPI asecond = new ProductSortHLAPI(a);
		ProductSortHLAPI bprime = new ProductSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ProductSortHLAPI clone(){
	//	return new ProductSortHLAPI(this);
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
