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
 * $Id ggiffo, Wed Feb 10 14:59:10 CET 2016$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import fr.lip6.move.pnml.pnmlcoremodel.Annotation;
import fr.lip6.move.pnml.pnmlcoremodel.AnnotationGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.AnyObject;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.ArcGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2Color;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontFamily;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontSize;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontStyle;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontWeight;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Font;
import fr.lip6.move.pnml.pnmlcoremodel.FontAlign;
import fr.lip6.move.pnml.pnmlcoremodel.FontDecoration;
import fr.lip6.move.pnml.pnmlcoremodel.Gradient;
import fr.lip6.move.pnml.pnmlcoremodel.Label;
import fr.lip6.move.pnml.pnmlcoremodel.Line;
import fr.lip6.move.pnml.pnmlcoremodel.LineShape;
import fr.lip6.move.pnml.pnmlcoremodel.LineStyle;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Offset;
import fr.lip6.move.pnml.pnmlcoremodel.PNType;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;
import fr.lip6.move.pnml.pnmlcoremodel.PnObject;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;

import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pnmlcoremodel.*;
import fr.lip6.move.pnml.pnmlcoremodel.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class FontHLAPITest {

	
	private FontAlignHLAPI itemalign;
		
	private FontDecorationHLAPI itemdecoration;
		
	private CSS2FontFamilyHLAPI itemfamily;
		
	private BigDecimal itemrotation;
		
	private CSS2FontSizeHLAPI itemsize;
		
	private CSS2FontStyleHLAPI itemstyle;
		
	private CSS2FontWeightHLAPI itemweight;
		
	
	private AnnotationGraphicsHLAPI itemcontainerAnnotationGraphics;
	


	@AfterTest(groups = { "FontHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FontHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "FontHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
		itemalign = FontAlignHLAPI.get(0);
		
		itemdecoration = FontDecorationHLAPI.get(0);
		
		itemfamily = CSS2FontFamilyHLAPI.get(0);
		
			itemrotation = new BigDecimal("0");
			
		itemsize = CSS2FontSizeHLAPI.get(0);
		
		itemstyle = CSS2FontStyleHLAPI.get(0);
		
		itemweight = CSS2FontWeightHLAPI.get(0);
		

	
		
		itemcontainerAnnotationGraphics = new AnnotationGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createAnnotationGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FontHLAPI"}, dependsOnMethods={"FontHLAPI_LLAPI"})
	public void FontHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FontHLAPI totest = new FontHLAPI(
		itemalign
		,	
		itemdecoration
		,	
		itemfamily
		,	
		itemrotation
		,	
		itemsize
		,	
		itemstyle
		,	
		itemweight
	);
	
	
	
	
	
	
	
	
	assert totest.getRotation().equals(itemrotation);
	
	
	
	
	
	
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FontHLAPI"}, dependsOnMethods={"FontHLAPI_LLAPI"})
	public void FontHLAPI_2_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FontHLAPI totest = new FontHLAPI(
		itemalign
		,	
		itemdecoration
		,	
		itemfamily
		,	
		itemrotation
		,	
		itemsize
		,	
		itemstyle
		,	
		itemweight
	,	
		itemcontainerAnnotationGraphics
	);
	
	
		
	
		
	
		
	
			assert totest.getRotation().equals(itemrotation);
		
	
	
		
	
		
	
		
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "FontHLAPI"}, dependsOnMethods={"FontHLAPI_LLAPI"})
	public void FontHLAPI_4_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FontHLAPI totest = new FontHLAPI(
	  itemcontainerAnnotationGraphics
	);

	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FontHLAPI"})
	public void FontHLAPI_LLAPI(){
	   Font llapi = new PnmlcoremodelFactoryImpl().createFont();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.FontHLAPI hlapi = new FontHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	
	
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FontHLAPI"})
		public void getContainerAnnotationGraphicsHLAPITest(){
			FontHLAPI elem = new FontHLAPI(new PnmlcoremodelFactoryImpl().createFont());

			
				elem.setContainerAnnotationGraphicsHLAPI(itemcontainerAnnotationGraphics);
				AnnotationGraphicsHLAPI totest = elem.getContainerAnnotationGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAnnotationGraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "FontHLAPI"})
	public void equalsTest(){
		Font a = new PnmlcoremodelFactoryImpl().createFont();
		Font b = new PnmlcoremodelFactoryImpl().createFont();
		FontHLAPI aprime = new FontHLAPI(a);
		FontHLAPI asecond = new FontHLAPI(a);
		FontHLAPI bprime = new FontHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FontHLAPI clone(){
	//	return new FontHLAPI(this);
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
