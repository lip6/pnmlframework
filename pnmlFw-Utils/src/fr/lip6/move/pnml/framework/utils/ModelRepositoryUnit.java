/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
 *
 */
package fr.lip6.move.pnml.framework.utils;

import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;

/**
 * An instance of registered model in model Repository.
 * 
 * @author Guillaume Giffo
 * 
 */
public final class ModelRepositoryUnit {

	/**
	 * This is the associated id repository, for id checking.
	 */
	private final IdRepository idrep;

	/**
	 * This is the associated PetriNetDoc of the document.
	 */
	private HLAPIRootClass petriNetDoc;

	/**
	 * This is the associated states for pretty printing XML doc.
	 */
	private boolean prettyPrint;

	/**
	 * This contains data for pretty printing.
	 */
	private final PrettyPrintData ppd;
	
	/**
	 * This is the associated (underlying) PetriNetDoc as EMF's EObject
	 */
	private EObject petriNetDocEObject;

	/**
	 * Default constructor.
	 * 
	 * @param theIdrep
	 *            the id repository
	 * @param thePetriNetDoc
	 *            the PetriNetDoc, root of the document
	 */
	public ModelRepositoryUnit(IdRepository theIdrep,
			HLAPIRootClass thePetriNetDoc) {
		this.idrep = theIdrep;
		this.petriNetDoc = thePetriNetDoc;
		if (thePetriNetDoc != null) {
			this.petriNetDocEObject = (EObject) thePetriNetDoc.getContainedItem();
		}
		this.ppd = new PrettyPrintData();
	}

	/**
	 * Constructor to enable storage of PetriNetDocs as EMF's EObjects.
	 * 
	 * @param petriNetDoc2
	 *            the PetriNetDoc as EObject, root of the PNML document
	 * @param idrep
	 *            the id repository
	 */
	public ModelRepositoryUnit(EObject petriNetDoc, IdRepository idrep) {
		this.idrep = idrep;
		this.petriNetDocEObject = petriNetDoc;
		this.petriNetDoc = null;
		this.ppd = new PrettyPrintData();
	}

	/**
	 * @return the idrep
	 */
	public final IdRepository getIdrep() {
		return idrep;
	}

	/**
	 * @param thePetriNetDoc
	 *            the petriNetDoc to set (as the generic HLAPIRootClass type)
	 */
	public final void setPetriNetDoc(HLAPIRootClass thePetriNetDoc) {
		this.petriNetDoc = thePetriNetDoc;
		this.petriNetDocEObject = (EObject) thePetriNetDoc.getContainedItem();
	}

	/**
	 * @param thePetriNetDoc
	 *            the petriNetDoc to set (as EMF's EObject)
	 */
	public final void setPetriNetDocEObject(EObject thePetriNetDoc) {
		this.petriNetDocEObject = thePetriNetDoc;
	}

	/**
	 * @return the contained petriNetDoc as the generic HLAPIRootClass class
	 */
	public final HLAPIRootClass getPetriNetDoc() {
		return petriNetDoc;
	}

	/**
	 * @return the contained petriNetDoc as EMF's EObject
	 */
	public final EObject getPetriNetDocEObject() {
		return petriNetDocEObject;
	}

	/**
	 * @return the prettyPrint
	 */
	public final boolean isPrettyPrint() {
		return prettyPrint;
	}

	/**
	 * @param prettyPrintStatus
	 *            the prettyPrint to set
	 */
	public final void setPrettyPrint(boolean prettyPrintStatus) {
		this.prettyPrint = prettyPrintStatus;
	}

	/**
	 * 
	 * @return A PrettyPrintData object
	 */
	public final PrettyPrintData getPrettyPrinter() {
		return this.ppd;
	}

}
