/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
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
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Place;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.SortHLAPI;

public class TypeHLAPI implements HLAPIClass, LabelHLAPI, AnnotationHLAPI {

	/**
	 * The contained LLAPI element.
	 */
	private Type item;

	/**
	 * this constructor allows you to set all 'settable' values excepted container.
	 */

	public TypeHLAPI(AnnotationGraphicsHLAPI annotationgraphics

			, java.lang.String text

			, SortHLAPI structure) {// BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createType();
		}

		if (annotationgraphics != null)
			item.setAnnotationgraphics((AnnotationGraphics) annotationgraphics.getContainedItem());

		if (text != null) {

			item.setText(text);
		}

		if (structure != null)
			item.setStructure((Sort) structure.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public TypeHLAPI(AnnotationGraphicsHLAPI annotationgraphics

			, java.lang.String text

			, SortHLAPI structure

			, PlaceHLAPI containerPlace) {// BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createType();
		}

		if (annotationgraphics != null)
			item.setAnnotationgraphics((AnnotationGraphics) annotationgraphics.getContainedItem());

		if (text != null) {

			item.setText(text);
		}

		if (structure != null)
			item.setStructure((Sort) structure.getContainedItem());

		if (containerPlace != null)
			item.setContainerPlace((Place) containerPlace.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public TypeHLAPI(PlaceHLAPI containerPlace) {// BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createType();
		}

		if (containerPlace != null)
			item.setContainerPlace((Place) containerPlace.getContainedItem());

	}

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public TypeHLAPI(Type lowLevelAPI) {
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Type getContainedItem() {
		return item;
	}

	// getters giving LLAPI object

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<ToolInfo> getToolspecifics() {
		return item.getToolspecifics();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public AnnotationGraphics getAnnotationgraphics() {
		return item.getAnnotationgraphics();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getText() {
		return item.getText();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getStructure() {
		return item.getStructure();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Place getContainerPlace() {
		return item.getContainerPlace();
	}

	// getters giving HLAPI object

	/**
	 * This accessor automatically encapsulate all elements of the selected sublist.
	 * WARNING : this can creates a lot of new object in memory.
	 */

	public java.util.List<ToolInfoHLAPI> getToolspecificsHLAPI() {
		java.util.List<ToolInfoHLAPI> retour = new ArrayList<ToolInfoHLAPI>();
		for (ToolInfo elemnt : getToolspecifics()) {
			retour.add(new ToolInfoHLAPI(elemnt));
		}
		return retour;
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public AnnotationGraphicsHLAPI getAnnotationgraphicsHLAPI() {
		if (item.getAnnotationgraphics() == null)
			return null;
		return new AnnotationGraphicsHLAPI(item.getAnnotationgraphics());
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public SortHLAPI getStructureHLAPI() {
		if (item.getStructure() == null)
			return null;
		Sort object = item.getStructure();

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BoolImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(
					(fr.lip6.move.pnml.pthlpng.booleans.Bool) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.pthlpng.dots.Dot) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NaturalImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Natural) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.PositiveImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.Positive) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.HLIntegerImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI(
					(fr.lip6.move.pnml.pthlpng.integers.HLInteger) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.MultisetSort) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.ProductSort) object);
		}

		if (object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl.class)) {
			return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(
					(fr.lip6.move.pnml.pthlpng.terms.UserSort) object);
		}

		return null;
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public PlaceHLAPI getContainerPlaceHLAPI() {
		if (item.getContainerPlace() == null)
			return null;
		return new PlaceHLAPI(item.getContainerPlace());
	}

	// Special getter for list of generics object, return only one object type.

	// setters (including container setter if aviable)

	/**
	 * set Annotationgraphics
	 */
	public void setAnnotationgraphicsHLAPI(

			AnnotationGraphicsHLAPI elem) {

		if (elem != null)
			item.setAnnotationgraphics((AnnotationGraphics) elem.getContainedItem());

	}

	/**
	 * set Text
	 */
	public void setTextHLAPI(

			java.lang.String elem) {

		if (elem != null) {

			item.setText(elem);
		}

	}

	/**
	 * set Structure
	 */
	public void setStructureHLAPI(

			SortHLAPI elem) {

		if (elem != null)
			item.setStructure((Sort) elem.getContainedItem());

	}

	/**
	 * set ContainerPlace
	 */
	public void setContainerPlaceHLAPI(

			PlaceHLAPI elem) {

		if (elem != null)
			item.setContainerPlace((Place) elem.getContainedItem());

	}

	// setters/remover for lists.

	public void addToolspecificsHLAPI(ToolInfoHLAPI unit) {

		item.getToolspecifics().add((ToolInfo) unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit) {
		item.getToolspecifics().remove((ToolInfo) unit.getContainedItem());
	}

	// equals method
	public boolean equals(TypeHLAPI item) {
		return item.getContainedItem().equals(getContainedItem());
	}

	// PNML

	/**
	 * Returns the PNML xml tree for this object.
	 */
	public String toPNML() {
		return item.toPNML();
	}

	/**
	 * Writes the PNML XML tree of this object into file channel.
	 */
	public void toPNML(FileChannel fc) {
		item.toPNML(fc);
	}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	public void fromPNML(OMElement subRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException {
		item.fromPNML(subRoot, idr);
	}

	public boolean validateOCL(DiagnosticChain diagnostics) {
		return item.validateOCL(diagnostics);
	}

}