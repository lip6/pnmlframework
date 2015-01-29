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
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI;
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

	private List<List<ArcHLAPI>> ptParArcs;

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
			log.error("You have not loaded any PNML Document through the PNML Checker."
					+ " Please load first a PNML Document through the PNML Checker");

		} else {
			res = collectParallelArcs(pdoc);
		}
		return res;
	}

	private boolean collectParallelArcs(HLAPIRootClass pdoc) {
		boolean res = false;
		if (ptParArcs == null)
			ptParArcs = new ArrayList<>();
		else
			ptParArcs.clear();
		if (this.pchecker.isPTNetDocument()) {
			res = findParallelArcsInPT(pdoc);
		}
		return res;
	}

	private boolean findParallelArcsInPT(HLAPIRootClass pdoc) {
		boolean found = false;
		List<ArcHLAPI> localCol;
		ArcHLAPI a1, a2;
		PetriNetDocHLAPI pnDoc = (PetriNetDocHLAPI) pdoc;
		for (PetriNetHLAPI pn : pnDoc.getNetsHLAPI()) {
			log.info("Looking for parallel arcs in net " + pn.getId());
			for (PageHLAPI pg : pn.getPagesHLAPI()) {
				List<ArcHLAPI> arcs = pg.getObjects_ArcHLAPI();
				if (arcs != null && arcs.size() > 0) {
					Iterator<ArcHLAPI> iter1 = arcs.listIterator();
					Iterator<ArcHLAPI> iter2;
					while (iter1.hasNext()) {
						a1 = iter1.next();
						localCol = new ArrayList<>();
						localCol.add(a1);
						iter1.remove();
						iter1 = null;
						iter2 = arcs.listIterator();
						while (iter2.hasNext()) {
							a2 = iter2.next();
							if (a1.getSource().getId().equals(a2.getSource().getId())
									&& a1.getTarget().getId().equals(a2.getTarget().getId())) {
								localCol.add(a2);
								iter2.remove();
							}
						}
						if (localCol.size() > 1) {
							ptParArcs.add(localCol);
						} else {
							localCol.clear();
							localCol = null;
						}
						iter2 = null;
						iter1 = arcs.listIterator();
					}
				}
			}
		}
		if (ptParArcs.size() > 0) {
			found = true;
		}
		return found;
	}

	@Override
	public String reportParallelArcs(CheckPnmlFile checker) {
		assignCheckerToThis(checker);
		StringBuilder sb = new StringBuilder();
		// TODO upgrade expression when SN are supported.
		if (ptParArcs == null) {
			checkCanMergeParallelArcs(checker);
		}
		int i = 1;
		if (this.pchecker.isPTNetDocument()) {
			if (ptParArcs != null && ptParArcs.size() > 0) {
				sb.append("The following " + ptParArcs.size() + " sets of parallel arcs have been found:" + NL);
				for (List<ArcHLAPI> la : ptParArcs) {
					sb.append("Set " + i++ + NL);
					for (ArcHLAPI o : la) {
						sb.append(TAB).append(o.getId()).append(": ").append(o.getSource().getId()).append(" -> ")
								.append(o.getTarget().getId()).append(NL);
					}
					sb.append(NL);
				}
			} else {
				sb.append("There are no parallel arcs to report in this net.");
			}
		} else {
			sb.append("Only P/T Nets are currently supported in searching for parallel arcs.");
		}
		return sb.toString();
	}

	@Override
	public HLAPIRootClass mergeParallelArcs(CheckPnmlFile checker) {
		assignCheckerToThis(checker);
		// TODO upgrade expression when SN are supported.
		if (ptParArcs == null) {
			checkCanMergeParallelArcs(checker);
		}
		StringBuilder sb = new StringBuilder();
		int i = 1, insc;
		if (this.pchecker.isPTNetDocument()) {
			if (ptParArcs != null && ptParArcs.size() > 0) {
				ArcHLAPI a1, a2;
				Page pg;
				for (List<ArcHLAPI> la : ptParArcs) {
					sb.append("Set " + i++ + NL);
					a1 = la.get(0);
					sb.append(TAB).append(a1.getId()).append(": ").append(a1.getSource().getId()).append(" -> ")
					.append(a1.getTarget().getId()).append(NL);
					insc = a1.getInscription().getText();
					for (int j = 1; j < la.size(); j++) {
						a2 = la.get(j);
						sb.append(TAB).append(a2.getId()).append(": ").append(a2.getSource().getId()).append(" -> ")
								.append(a2.getTarget().getId()).append(NL);
						insc += a2.getInscription().getText();
						pg = a2.getContainerPage();
						a2.getContainedItem().setSource(null);
						a2.getContainedItem().setTarget(null);
						pg.getObjects().remove(a2.getContainedItem());
					}
					a1.getInscription().setText(insc);
				}
				log.info("I merged the following " + ptParArcs.size() + " sets of parallel arcs:" + NL);
				System.out.println(sb.toString());
				log.info("For each merge, the first arc in the set was kept as the resulting arc.");
			} else {
				log.warn("There are no parallel arcs to merge in this net.");
			}
		} else {
			log.error("Only P/T Nets are currently supported in merging parallel arcs.");
		}
		return this.pchecker.getPnmlDocHLAPIRootClass();
	}

	private void assignCheckerToThis(CheckPnmlFile checker) {
		if (!checker.getCheckerID().equals(pchecker.getCheckerID())) {
			this.pchecker = checker;
		}
	}

}
