/**
 *  Copyright 2009 Sorbonne Universités, Université Pierre & Marie Curie - CNRS UMR 7606 (LIP6/MoVe)
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Initial contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation.stats.impl;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PageHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetHLAPI;
import fr.lip6.move.pnml.validation.CheckPnmlFile;
import fr.lip6.move.pnml.validation.stats.PnmlDocStatistics;

/**
 * High-level P/T Petri Net stats.
 * @author lom
 */
public class PTHLPNStats implements PnmlDocStatistics {

	/**
	 * Document checker from which to retrieve the PN model.
	 */
	private CheckPnmlFile checkpf;
	/**
	 * PN doc root class.
	 */
	private PetriNetDocHLAPI pnmldoc;
	/**
	 * Number of nets.
	 */
	private int numNets = -1;
	/**
	 * Number of arcs.
	 */
	private int numArcs = -1;
	/**
	 * Number of places.
	 */
	private int numPlaces = -1;
	/**
	 * Number of transitions.
	 */
	private int numTransitions = -1;
	/**
	 * Number of ref places.
	 */
	private int numRefPlaces = -1;
	/**
	 * Number of ref transitions.
	 */
	private int numRefTransitions = -1;
	/**
	 * Default model name.
	 */
	private String modelName = "Unknown";

	/**
	 * Constructor.
	 * @param cpf the checker which is instantiating this class.
	 */
	public PTHLPNStats(CheckPnmlFile cpf) {
		loadPnmlDocument(cpf.getPnmlDocHLAPIRootClass(), cpf);
		computeStats();
	}

	/**
	 * Returns the numbers of arcs in the PN document, all PN models included.
	 * @return the numbers of arcs
	 */

	public final int getNumOfArcs() {
		return numArcs;
	}

	/**
	 * Returns the numbers of nets in the PN document.
	 * @return the numbers of nets
	 */
	public final int getNumOfNets() {
		return numNets;
	}

	/**
	 * Returns the numbers of places in the PN document, all PN models included.
	 * @return the numbers of places
	 */
	public final int getNumOfPlaces() {
		return numPlaces;
	}

	/**
	 * Returns the numbers of transitions in the PN document, all PN models
	 * included.
	 * @return the numbers of transitions
	 */
	public final int getNumOfTransitions() {
		return numTransitions;
	}

	/**
	 * Returns the numbers of ref places in the PN document, all PN models
	 * included.
	 * @return the numbers of ref places
	 */
	public final int getNumOfRefPlaces() {
		return this.numRefPlaces;
	}

	/**
	 * Returns the numbers of ref transitions in the PN document, all PN models
	 * included.
	 * @return the numbers of ref transitions
	 */
	public final int getNumOfRefTransitions() {
		return numRefTransitions;
	}

	/**
	 * Loads a new PN doc from a checker.
	 * @param pnmlDoc the PN doc
	 * @param cpf the checker
	 */
	public final void loadPnmlDoc(HLAPIRootClass pnmlDoc, CheckPnmlFile cpf) {
		loadPnmlDocument(pnmlDoc, cpf);

	}

	/**
	 * Loads, reset the stats and compute new stats on a new PN doc from a
	 * checker.
	 * @param pnmlDoc the PN doc
	 * @param cpf the checker
	 */
	private void loadPnmlDocument(HLAPIRootClass pnmlDoc, CheckPnmlFile cpf) {
		this.checkpf = cpf;
		this.pnmldoc = (PetriNetDocHLAPI) this.checkpf.getPnmlDocHLAPIRootClass();
		resetAllStats();
		computeStats();
	}

	/**
	 * Resets current stats.
	 */
	private void resetAllStats() {
		numNets = 0;
		numArcs = 0;
		numPlaces = 0;
		numTransitions = 0;
		numRefPlaces = 0;
		numRefTransitions = 0;
	}

	/**
	 * Compute stats.
	 */
	private void computeStats() {
		numNets = pnmldoc.getNets().size();
		for (PetriNetHLAPI ptn : pnmldoc.getNetsHLAPI()) {
			if (ptn.getName() != null) {
				if (this.modelName.equalsIgnoreCase("unknown")) {
					this.modelName = ptn.getName().getText();
				}
			}
			for (PageHLAPI page : ptn.getPagesHLAPI()) {
				processPages(page);
			}
		}
	}

	/**
	 * Process the stats of a page.
	 * @param page the page to process
	 */
	private void processPages(PageHLAPI page) {
		for (PageHLAPI innerPages : page.getObjects_hlcorestructure_PageHLAPI()) {
			processPages(innerPages);
		}
		numPlaces += page.getObjects_hlcorestructure_PlaceHLAPI().size();
		numTransitions += page.getObjects_hlcorestructure_TransitionHLAPI().size();
		numArcs += page.getObjects_hlcorestructure_ArcHLAPI().size();
		numRefPlaces += page.getObjects_hlcorestructure_RefPlaceHLAPI().size();
		numRefTransitions += page.getObjects_hlcorestructure_RefTransitionHLAPI().size();
	}

	/**
	 * Returns the current model name.
	 * @return the current model name.
	 */
	public final String getModelName() {
		return modelName;
	}
}
