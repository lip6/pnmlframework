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
 * $Id ggiffo, Wed Feb 10 14:59:11 CET 2016$
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

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc;
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
public class PetriNetDocHLAPITest {

	
	


	@AfterTest(groups = { "PetriNetDocHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PetriNetDocHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "PetriNetDocHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	

	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PetriNetDocHLAPI"}, dependsOnMethods={"PetriNetDocHLAPI_LLAPI"})
	public void PetriNetDocHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PetriNetDocHLAPI totest = new PetriNetDocHLAPI();
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PetriNetDocHLAPI"})
	public void PetriNetDocHLAPI_LLAPI(){
	   PetriNetDoc llapi = new HlcorestructureFactoryImpl().createPetriNetDoc();
	   fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI hlapi = new PetriNetDocHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PetriNetDocHLAPI"})
		public void getNetsHLAPITest(){
			PetriNetDoc llapi = new HlcorestructureFactoryImpl().createPetriNetDoc();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getNets().add(new HlcorestructureFactoryImpl().createPetriNet());
			

			PetriNetDocHLAPI elem = new PetriNetDocHLAPI(llapi);
			List<PetriNetHLAPI> totest = elem.getNetsHLAPI();

			assert totest.size() == howmany;

			for (PetriNetHLAPI unit : totest) {
             assert llapi.getNets().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PetriNetDocHLAPI"})
	public void addNetsHLAPITest(){
		PetriNetDocHLAPI elem = new PetriNetDocHLAPI(new HlcorestructureFactoryImpl().createPetriNetDoc());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addNetsHLAPI(new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet()));
			

		assert elem.getContainedItem().getNets().size() == howmany;
	}

	@Test(groups = { "hlapi", "PetriNetDocHLAPI"})
	public void removeNetsTest(){
		PetriNetDocHLAPI elem = new PetriNetDocHLAPI(new HlcorestructureFactoryImpl().createPetriNetDoc());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PetriNetHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addNetsHLAPI(new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet()));
			


		
		sav = new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet());
		

		elem.addNetsHLAPI(sav);
		assert elem.getContainedItem().getNets().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addNetsHLAPI(new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet()));
			


		elem.removeNetsHLAPI(sav);

		assert elem.getContainedItem().getNets().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PetriNetDocHLAPI"})
	public void equalsTest(){
		PetriNetDoc a = new HlcorestructureFactoryImpl().createPetriNetDoc();
		PetriNetDoc b = new HlcorestructureFactoryImpl().createPetriNetDoc();
		PetriNetDocHLAPI aprime = new PetriNetDocHLAPI(a);
		PetriNetDocHLAPI asecond = new PetriNetDocHLAPI(a);
		PetriNetDocHLAPI bprime = new PetriNetDocHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PetriNetDocHLAPI clone(){
	//	return new PetriNetDocHLAPI(this);
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
