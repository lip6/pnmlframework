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
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Name;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PNType;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Page;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;

public class PetriNetHLAPI implements HLAPIClass {

	/**
	 * The contained LLAPI element.
	 */
	private PetriNet item;

	/**
	 * this constructor allows you to set all 'settable' values excepted container.
	 */

	public PetriNetHLAPI(java.lang.String id

			, PNTypeHLAPI type

			, NameHLAPI name) throws InvalidIDException, VoidRepositoryException {// BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createPetriNet();
		}

		if (id != null) {

			item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
		}

		if (type != null)
			item.setType((PNType) type.getContainedItem());

		if (name != null)
			item.setName((Name) name.getContainedItem());

	}

	/**
	 * this constructor allows you to set all 'settable' values, including container
	 * if any.
	 */

	public PetriNetHLAPI(java.lang.String id

			, PNTypeHLAPI type

			, NameHLAPI name

			, PetriNetDocHLAPI containerPetriNetDoc) throws InvalidIDException, VoidRepositoryException {// BEGIN
																											// CONSTRUCTOR
																											// BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createPetriNet();
		}

		if (id != null) {

			item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
		}

		if (type != null)
			item.setType((PNType) type.getContainedItem());

		if (name != null)
			item.setName((Name) name.getContainedItem());

		if (containerPetriNetDoc != null)
			item.setContainerPetriNetDoc((PetriNetDoc) containerPetriNetDoc.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (not container if any)
	 */
	public PetriNetHLAPI(java.lang.String id

			, PNTypeHLAPI type) throws InvalidIDException, VoidRepositoryException {// BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createPetriNet();
		}

		if (id != null) {

			item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
		}

		if (type != null)
			item.setType((PNType) type.getContainedItem());

	}

	/**
	 * This constructor give access to required stuff only (and container)
	 */
	public PetriNetHLAPI(java.lang.String id

			, PNTypeHLAPI type

			, PetriNetDocHLAPI containerPetriNetDoc) throws InvalidIDException, VoidRepositoryException {// BEGIN
																											// CONSTRUCTOR
																											// BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized (fact) {
			item = fact.createPetriNet();
		}

		if (id != null) {

			item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
		}

		if (type != null)
			item.setType((PNType) type.getContainedItem());

		if (containerPetriNetDoc != null)
			item.setContainerPetriNetDoc((PetriNetDoc) containerPetriNetDoc.getContainedItem());

	}

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public PetriNetHLAPI(PetriNet lowLevelAPI) {
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public PetriNet getContainedItem() {
		return item;
	}

	// getters giving LLAPI object

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getId() {
		return item.getId();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PNType getType() {
		return item.getType();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Page> getPages() {
		return item.getPages();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Name getName() {
		return item.getName();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<ToolInfo> getToolspecifics() {
		return item.getToolspecifics();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PetriNetDoc getContainerPetriNetDoc() {
		return item.getContainerPetriNetDoc();
	}

	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Declaration> getDeclaration() {
		return item.getDeclaration();
	}

	// getters giving HLAPI object

	/**
	 * This accessor automatically encapsulate all elements of the selected sublist.
	 * WARNING : this can creates a lot of new object in memory.
	 */

	public java.util.List<PageHLAPI> getPagesHLAPI() {
		java.util.List<PageHLAPI> retour = new ArrayList<PageHLAPI>();
		for (Page elemnt : getPages()) {
			retour.add(new PageHLAPI(elemnt));
		}
		return retour;
	}

	/**
	 * This accessor automatically encapsulate an element of the current object.
	 * WARNING : this creates a new object in memory.
	 * 
	 * @return : null if the element is null
	 */

	public NameHLAPI getNameHLAPI() {
		if (item.getName() == null)
			return null;
		return new NameHLAPI(item.getName());
	}

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

	public PetriNetDocHLAPI getContainerPetriNetDocHLAPI() {
		if (item.getContainerPetriNetDoc() == null)
			return null;
		return new PetriNetDocHLAPI(item.getContainerPetriNetDoc());
	}

	/**
	 * This accessor automatically encapsulate all elements of the selected sublist.
	 * WARNING : this can creates a lot of new object in memory.
	 */

	public java.util.List<DeclarationHLAPI> getDeclarationHLAPI() {
		java.util.List<DeclarationHLAPI> retour = new ArrayList<DeclarationHLAPI>();
		for (Declaration elemnt : getDeclaration()) {
			retour.add(new DeclarationHLAPI(elemnt));
		}
		return retour;
	}

	// Special getter for list of generics object, return only one object type.

	// setters (including container setter if aviable)

	/**
	 * set Id
	 */
	public void setIdHLAPI(

			java.lang.String elem) throws InvalidIDException, VoidRepositoryException {

		if (elem != null) {

			try {
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().changeId(this, elem));
			} catch (OtherException e) {
				ModelRepository.getInstance().getCurrentIdRepository().checkId(elem, this);
			}
		}

	}

	/**
	 * set Type
	 */
	public void setTypeHLAPI(

			fr.lip6.move.pnml.pthlpng.hlcorestructure.PNType elem) {

		if (elem != null) {

			item.setType(elem);
		}

	}

	/**
	 * set Name
	 */
	public void setNameHLAPI(

			NameHLAPI elem) {

		if (elem != null)
			item.setName((Name) elem.getContainedItem());

	}

	/**
	 * set ContainerPetriNetDoc
	 */
	public void setContainerPetriNetDocHLAPI(

			PetriNetDocHLAPI elem) {

		if (elem != null)
			item.setContainerPetriNetDoc((PetriNetDoc) elem.getContainedItem());

	}

	// setters/remover for lists.

	public void addPagesHLAPI(PageHLAPI unit) {

		item.getPages().add((Page) unit.getContainedItem());
	}

	public void removePagesHLAPI(PageHLAPI unit) {
		item.getPages().remove((Page) unit.getContainedItem());
	}

	public void addToolspecificsHLAPI(ToolInfoHLAPI unit) {

		item.getToolspecifics().add((ToolInfo) unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit) {
		item.getToolspecifics().remove((ToolInfo) unit.getContainedItem());
	}

	public void addDeclarationHLAPI(DeclarationHLAPI unit) {

		item.getDeclaration().add((Declaration) unit.getContainedItem());
	}

	public void removeDeclarationHLAPI(DeclarationHLAPI unit) {
		item.getDeclaration().remove((Declaration) unit.getContainedItem());
	}

	// equals method
	public boolean equals(PetriNetHLAPI item) {
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