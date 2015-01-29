/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR
 * 							7606 (LIP6)
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
 *    L.M. Hillah - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation.stats;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.validation.CheckPnmlFile;

/**
 * Simple interface to get statistics from PNML documents. Each Petri net type
 * must implement this interface to preserve namespaces.
 * 
 * @author lom
 * 
 */
public interface PnmlDocStatistics {
	/**
	 * Tells the current instance of this interface to load a new PNML document
	 * on which to compute statistics.
	 * 
	 * @param pnmlDoc
	 *            the PNML document to load
	 * @param cpf
	 *            the {@link CheckPnmlFile} class which is requesting this
	 *            service
	 */
	void loadPnmlDoc(HLAPIRootClass pnmlDoc, CheckPnmlFile cpf);

	/**
	 * How many Petri nets are there in the current document?
	 * 
	 * @return the number of Petri nets in the current PNML document; -1 if
	 *         there is no valid PNML document loaded, or no stat has been
	 *         computed yet.
	 */
	int getNumOfNets();

	/**
	 * How many places in total are there in the current document?
	 * 
	 * @return the number of places in the current PNML document, for all
	 *         included Petri nets; -1 if there is no valid PNML document
	 *         loaded, or no stat has been computed yet.
	 */
	int getNumOfPlaces();

	/**
	 * How many reference places in total are there in the current document?
	 * 
	 * @return the number of reference places in the current PNML document, for
	 *         all included Petri nets; -1 if there is no valid PNML document
	 *         loaded, or no stat has been computed yet.
	 */
	int getNumOfRefPlaces();

	/**
	 * How many transitions in total are there in the current document?
	 * 
	 * @return the number of transitions in the current PNML document, for all
	 *         included Petri nets; -1 if there is no valid PNML document
	 *         loaded, or no stat has been computed yet.
	 */
	int getNumOfTransitions();

	/**
	 * How many reference transitions in total are there in the current
	 * document?
	 * 
	 * @return the number of reference transitions in the current PNML document,
	 *         for all included Petri nets; -1 if there is no valid PNML
	 *         document loaded, or no stat has been computed yet.
	 */
	int getNumOfRefTransitions();

	/**
	 * How many arcs in total are there in the current document?
	 * 
	 * @return the number of arcs in the current PNML document, for all included
	 *         Petri net; -1 if there is no valid PNML document loaded, or no
	 *         stat has been computed yet.
	 */
	int getNumOfArcs();

	/**
	 * Returns the name of the first net in the document that has a name.
	 * 
	 * @return the name of the first net in the document that has one.
	 */
	String getModelName();
}
