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
					pn.getName().setAnnotationgraphics(null);
				}
				for (PageHLAPI pg : pn.getPagesHLAPI()) {
					if (pg.getNodegraphics() != null) {
						pg.setNodegraphicsHLAPI(null);
					}
					if (pg.getName() != null && pg.getName().getAnnotationgraphics() != null) {
						pg.getName().setAnnotationgraphics(null);
					}
					for (PnObject pno : pg.getObjects()) {
						if (pno.getName() != null && pno.getName().getAnnotationgraphics() != null) {
							pno.getName().setAnnotationgraphics(null);
						}
						if (pno.getClass().isInstance(fr.lip6.move.pnml.ptnet.Node.class)) {
							fr.lip6.move.pnml.ptnet.Node node = (fr.lip6.move.pnml.ptnet.Node) pno;
							if (node.getNodegraphics() != null) {
								node.setNodegraphics(null);
							}
						} else if (pno.getClass().isInstance(fr.lip6.move.pnml.ptnet.Arc.class)) {
							fr.lip6.move.pnml.ptnet.Arc arc = (fr.lip6.move.pnml.ptnet.Arc) pno;
							if (arc.getArcgraphics() != null) {
								arc.setArcgraphics(null);
							}
							if (arc.getInscription() != null && arc.getInscription().getAnnotationgraphics() != null) {
								arc.getInscription().setAnnotationgraphics(null);
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
