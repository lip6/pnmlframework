/**
 *  Copyright 2009-2015 Universite Paris Ouest and Sorbonne Universites,
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
package fr.lip6.move.pnml.validation.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.validation.CheckPnmlFile;
import fr.lip6.move.pnml.validation.PnmlNormalizer;

/**
 * Implements the {@link PnmlNormalizer} interface.
 * 
 * @author lom
 *
 */
public final class PnmlNormalizerImpl implements PnmlNormalizer {

	private static final String NL = System.lineSeparator();

	private static final String TAB = "\t";

	private CheckPnmlFile pchecker;

	private Logger log;

	private List<List<Object>> parArcs;

	public PnmlNormalizerImpl(CheckPnmlFile checker) {
		this.pchecker = checker;
		this.log = LogMaster.getLogger(PnmlNormalizerImpl.class.getCanonicalName());
	}

	@Override
	public boolean checkCanMergeParallelArcs(CheckPnmlFile checker) {
		boolean res = false;
		assignCheckerToThis(checker);
		HLAPIRootClass pdoc = checker.getPnmlDocHLAPIRootClass();
		if (pdoc == null) {
			log.error("You have not load any PNML Document through the PNML Checker."
					+ " Please load first a PNML Document through the PNML Checker");

		} else {
			res = collectParallelArcs(pdoc);
		}
		return res;
	}

	private boolean collectParallelArcs(HLAPIRootClass pdoc) {
		boolean res = false;
		if (parArcs == null)
			parArcs = new ArrayList<>();
		else
			parArcs.clear();
		List<Object> localCol;
		if (this.pchecker.isPTNetDocument()) {
			PetriNetDocHLAPI pnDoc = (PetriNetDocHLAPI) pdoc;
			for (PetriNet pn : pnDoc.getNets()) {
				for (Page pg : pn.getPages()) {
					fr.lip6.move.pnml.ptnet.Arc[] arcs = (Arc[]) pg.getObjects().parallelStream()
							.filter(pno -> pno.getClass().getCanonicalName().contains("Arc")).toArray();
					if (arcs != null && arcs.length != 0) {
						for (int i = 0; i < arcs.length - 1; i++) {
							localCol = new ArrayList<>();
							localCol.add(arcs[i]);
							for (int j = i + 1; j < arcs.length; j++) {
								if (arcs[i].getSource().getId().equals(arcs[j].getSource().getId())
										&& arcs[i].getTarget().getId().equals(arcs[j].getTarget().getId())) {
									localCol.add(arcs[j]);
								}
								if (localCol.size() > 1) {
									parArcs.add(localCol);
								} else {
									localCol.clear();
									localCol = null;
								}

							}
						}

					}
				}
			}

		} else {
			log.error("Only P/T Nets are currently supported in searching for parallel arcs.");
		}
		if (parArcs.size() > 0) {
			res = true;
		}
		return res;
	}

	@Override
	public String reportParallelArcs(CheckPnmlFile checker) {
		assignCheckerToThis(checker);
		StringBuilder sb = new StringBuilder();
		if (parArcs == null) {
			checkCanMergeParallelArcs(checker);
		}
		int i = 1;
		if (parArcs != null && parArcs.size() > 0) {
			if (this.pchecker.isPTNetDocument()) {
				sb.append("The following " + parArcs.size() + " sets of arcs have been found:" + NL);
				for (List<Object> lo : parArcs) {
					sb.append("Set " + i++ + NL);
					for (Object o : lo) {
						fr.lip6.move.pnml.ptnet.Arc arc = (fr.lip6.move.pnml.ptnet.Arc) o;
						sb.append(TAB).append(arc.getId()).append(": ").append(arc.getSource().getId()).append(" -> ")
								.append(arc.getTarget().getId()).append(NL);
					}
					sb.append(NL);
				}
			} else {
				log.error("Only P/T Nets are currently supported in searching for parallel arcs.");
			}

		} else {
			sb.append("There is no parallel arcs to report in this net.");
		}
		return sb.toString();
	}

	@Override
	public HLAPIRootClass mergeParallelArcs(CheckPnmlFile checker) {
		assignCheckerToThis(checker);
		return null;
	}

	private void assignCheckerToThis(CheckPnmlFile checker) {
		if (!checker.getCheckerID().equals(pchecker.getCheckerID())) {
			this.pchecker = checker;
		}
	}

}
