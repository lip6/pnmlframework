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
 * $Id ggiffo, Wed Feb 10 14:59:13 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi;

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

import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.MakeList;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Empty;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

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
import fr.lip6.move.pnml.hlpn.finiteEnumerations.*;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class FiniteEnumerationHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	
	private HLPNListHLAPI itemcontainerList;
	
	private EmptyListHLAPI itemcontainerEmptyList;
	
	private MakeListHLAPI itemcontainerMakeList;
	


	@AfterTest(groups = { "FiniteEnumerationHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FiniteEnumerationHLAPI(finiteEnumerations)");
	}


	@BeforeMethod(groups = { "FiniteEnumerationHLAPI", "hlapi" })
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
		
	
		
		itemcontainerList = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());
		
	
		
		itemcontainerEmptyList = new EmptyListHLAPI(new ListsFactoryImpl().createEmptyList());
		
	
		
		itemcontainerMakeList = new MakeListHLAPI(new ListsFactoryImpl().createMakeList());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerProductSort
	);
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerList
	);
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerEmptyList
	);
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"}, dependsOnMethods={"FiniteEnumerationHLAPI_LLAPI"})
	public void FiniteEnumerationHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	FiniteEnumerationHLAPI totest = new FiniteEnumerationHLAPI(
		itemcontainerMakeList
	);
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
	public void FiniteEnumerationHLAPI_LLAPI(){
	   FiniteEnumeration llapi = new FiniteEnumerationsFactoryImpl().createFiniteEnumeration();
	   fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI hlapi = new FiniteEnumerationHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getMultiHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerProductSortHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerTypeHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerAllHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerEmptyHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerPartitionHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerListHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getContainerMakeListHLAPITest(){
			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
		public void getElementsHLAPITest(){
			FiniteEnumeration llapi = new FiniteEnumerationsFactoryImpl().createFiniteEnumeration();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElements().add(new FiniteEnumerationsFactoryImpl().createFEConstant());
			

			FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(llapi);
			List<FEConstantHLAPI> totest = elem.getElementsHLAPI();

			assert totest.size() == howmany;

			for (FEConstantHLAPI unit : totest) {
             assert llapi.getElements().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
	public void addElementsHLAPITest(){
		FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addElementsHLAPI(new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant()));
			

		assert elem.getContainedItem().getElements().size() == howmany;
	}

	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
	public void removeElementsTest(){
		FiniteEnumerationHLAPI elem = new FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			FEConstantHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addElementsHLAPI(new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant()));
			


		
		sav = new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant());
		

		elem.addElementsHLAPI(sav);
		assert elem.getContainedItem().getElements().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addElementsHLAPI(new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant()));
			


		elem.removeElementsHLAPI(sav);

		assert elem.getContainedItem().getElements().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "FiniteEnumerationHLAPI"})
	public void equalsTest(){
		FiniteEnumeration a = new FiniteEnumerationsFactoryImpl().createFiniteEnumeration();
		FiniteEnumeration b = new FiniteEnumerationsFactoryImpl().createFiniteEnumeration();
		FiniteEnumerationHLAPI aprime = new FiniteEnumerationHLAPI(a);
		FiniteEnumerationHLAPI asecond = new FiniteEnumerationHLAPI(a);
		FiniteEnumerationHLAPI bprime = new FiniteEnumerationHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FiniteEnumerationHLAPI clone(){
	//	return new FiniteEnumerationHLAPI(this);
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
