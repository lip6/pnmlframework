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
package fr.lip6.move.pnml.validation.util.impl;

import org.slf4j.Logger;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI;
import fr.lip6.move.pnml.ptnet.hlapi.PetriNetHLAPI;
import fr.lip6.move.pnml.validation.CheckPnmlFile;
import fr.lip6.move.pnml.validation.PNMLValidationUtils;

public final class PNMLValidationUtilsImpl implements PNMLValidationUtils {
	private CheckPnmlFile pchecker;

	private Logger log;

	public PNMLValidationUtilsImpl(CheckPnmlFile checker) {
		this.pchecker = checker;
		this.log = LogMaster.getLogger(PNMLValidationUtilsImpl.class.getCanonicalName());
	}

	@Override
	public HLAPIRootClass removeGraphics(CheckPnmlFile checker) {
		assignCheckerToThis(checker);
		boolean res = false;
		HLAPIRootClass pdoc = checker.getPnmlDocHLAPIRootClass();
		if (pdoc == null) {
			log.error("You have not loaded any PNML Document through the PNML Checker."
					+ " Please load first a PNML Document through the PNML Checker");
		} else {
			res = removeGraphicsFromPNML(pdoc);
			if (res) {
				log.info("All graphical information was purged from the submitted PNML Document.");
			} else {
				log.warn("No graphical information was found in the submitted PNML Document.");
			}
		}

		return pdoc;
	}

	private boolean removeGraphicsFromPNML(HLAPIRootClass pdoc) {
		boolean res = false;
		if (pchecker.isPTNetDocument()) {
			PetriNetDocHLAPI pnDoc = (PetriNetDocHLAPI) pdoc;
			for (PetriNetHLAPI pn : pnDoc.getNetsHLAPI()) {
				log.info("Looking for graphical information in net " + pn.getId());
				if (pn.getName() != null && pn.getName().getAnnotationgraphics() != null) {
					pn.getName().getAnnotationgraphics().setContainerAnnotation(null);
					pn.getName().setAnnotationgraphics(null);
					res = true;
				}
				for (PageHLAPI pg : pn.getPagesHLAPI()) {
					if (pg.getNodegraphics() != null) {
						pg.getNodegraphics().setContainerPage(null);
						pg.setNodegraphicsHLAPI(null);
						res = true;
					}
					if (pg.getName() != null && pg.getName().getAnnotationgraphics() != null) {
						pg.getName().getAnnotationgraphics().setContainerAnnotation(null);
						pg.getName().setAnnotationgraphics(null);
						res = true;
					}
					for (PnObject pno : pg.getObjects()) {
						if (pno.getName() != null && pno.getName().getAnnotationgraphics() != null) {
							pno.getName().getAnnotationgraphics().setContainerAnnotation(null);
							pno.getName().setAnnotationgraphics(null);
							res = true;
						}
						if (pno instanceof fr.lip6.move.pnml.ptnet.Node) {
							fr.lip6.move.pnml.ptnet.Node node = (fr.lip6.move.pnml.ptnet.Node) pno;
							if (node.getNodegraphics() != null) {
								node.getNodegraphics().setContainerNode(null);
								node.setNodegraphics(null);
								res = true;
							}
							if (pno instanceof fr.lip6.move.pnml.ptnet.Place) {
								fr.lip6.move.pnml.ptnet.Place place = (fr.lip6.move.pnml.ptnet.Place)pno;
								if (place.getInitialMarking() != null && place.getInitialMarking().getAnnotationgraphics() != null) {
									place.getInitialMarking().getAnnotationgraphics().setContainerAnnotation(null);
									place.getInitialMarking().setAnnotationgraphics(null);
									res = true;
								}
							}
						} else if (pno instanceof fr.lip6.move.pnml.ptnet.Arc) {
							fr.lip6.move.pnml.ptnet.Arc arc = (fr.lip6.move.pnml.ptnet.Arc) pno;
							if (arc.getArcgraphics() != null) {
								arc.getArcgraphics().setContainerArc(null);
								arc.setArcgraphics(null);
								res = true;
							}
							if (arc.getInscription() != null && arc.getInscription().getAnnotationgraphics() != null) {
								arc.getInscription().getAnnotationgraphics().setContainerAnnotation(null);
								arc.getInscription().setAnnotationgraphics(null);
								res = true;
							}
						} else {
							log.error("The graphical information removal feature currently supports Nodes (types of Place and Transitions), Arcs, and their subtypes only. "
									+ "Contact the developer if you want to have other types of net object included.");
						}
					}
				}
			}
		} else {
			log.error("The graphical information removal feature currently supports P/T nets only, where it is the most useful. "
					+ "Even with graphical information, High-level Petri nets usually has a small file size (a few KB).");
		}
		return res;
	}

	private void assignCheckerToThis(CheckPnmlFile checker) {
		if (!checker.getCheckerID().equals(pchecker.getCheckerID())) {
			this.pchecker = checker;
		}
	}

}
