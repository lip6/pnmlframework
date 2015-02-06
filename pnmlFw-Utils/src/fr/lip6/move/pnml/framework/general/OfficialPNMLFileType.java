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
package fr.lip6.move.pnml.framework.general;

/**
 * This implementation of PNMLFileType contains data for official types.
 * 
 * @author Guillaume Giffo
 * 
 */

public enum OfficialPNMLFileType implements PNMLFileType {

	/**
     *
     */
	COREMODEL(
			"coremodel",
			"fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI",
			"fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc",// NOPMD
			// by
			// ggiffo
			// on
			// 8/6/08
			// 1:30
			// PM
			"http://www.pnml.org/version-2009/grammar/pnmlcoremodel",
			"http://www.pnml.org/version-2009/grammar/pnmlcoremodel.rng", null),
	/**
     *
     */
	PTNET("place/transition net",
			"fr.lip6.move.pnml.ptnet.hlapi.PetriNetDocHLAPI",
			"fr.lip6.move.pnml.ptnet.PetriNetDoc",
			"http://www.pnml.org/version-2009/grammar/ptnet",
			"http://www.pnml.org/version-2009/grammar/ptnet.pntd",
			"fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI"),
	/**
     *
     */
	SYMMETRICNET(
			"symmetric nets",
			"fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PetriNetDocHLAPI",
			"fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc",
			"http://www.pnml.org/version-2009/grammar/symmetricnet",
			"http://www.pnml.org/version-2009/grammar/symmetricnet.pntd",
			"fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI"),
	/**
     *
     */
	HLPN("High level Petri net",
			"fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PetriNetDocHLAPI",
			"fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc",
			"http://www.pnml.org/version-2009/grammar/highlevelnet",
			"http://www.pnml.org/version-2009/grammar/highlevelnet.pntd",
			"fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI"),
	/**
    *
    */
	PTHLPNG("Place/Tansition in High level Petri net notation",
			"fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PetriNetDocHLAPI",
			"fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNetDoc",
			"http://www.pnml.org/version-2009/grammar/pt-hlpng",
			"http://www.pnml.org/version-2009/grammar/pt-hlpng.pntd",
			"fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetDocHLAPI");

	/**
     *
     */
	private static final OfficialPNMLFileType[] VALUES_ARRAY = new OfficialPNMLFileType[] {
			COREMODEL, PTNET, SYMMETRICNET, HLPN, PTHLPNG, };

	/**
     *
     */
	private String typeName;

	/**
     *
     */
	private String className;

	/**
    *
    */
	private String nativeClassName;

	/**
     *
     */
	private String namespace;

	/**
     *
     */
	private String rngUrl;

	/**
     *
     */
	private String fallbackclass;

	/**
	 * @param theTypeName
	 *            the string of the type name
	 * @param theClassName
	 *            the string of the class name.
	 * @param theNamespace
	 *            the string of the namespace.
	 * @param theRngUrl
	 *            the url to the associated rng file.
	 * @param thefallbackclass
	 *            the name of the fallback class
	 */
	private OfficialPNMLFileType(String theTypeName, String theClassName,
			String theNativeClassName, String theNamespace, String theRngUrl,
			String thefallbackclass) {
		typeName = theTypeName;
		className = theClassName;
		nativeClassName = theNativeClassName;
		namespace = theNamespace;
		rngUrl = theRngUrl;
		fallbackclass = thefallbackclass;
	}

	/**
	 * 
	 * @param namespace
	 *            the namespace.
	 * @return The item corresponding to the name space.
	 */
	public static final OfficialPNMLFileType getByNamespace(String namespace) {
		OfficialPNMLFileType result = null;
		OfficialPNMLFileType tempo;
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			tempo = VALUES_ARRAY[i];
			if (tempo.getNamespace().equals(namespace)) {
				result = tempo;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * @param classname
	 *            the class canonical name
	 * @return The item corresponding to the high-level API class canonical
	 *         name.
	 */
	public static final OfficialPNMLFileType getByClassName(String classname) {
		OfficialPNMLFileType result = null;
		OfficialPNMLFileType tempo;
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			tempo = VALUES_ARRAY[i];
			if (tempo.getClassName().equals(classname)) {
				result = tempo;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * @param nativeclassname
	 *            the class canonical name
	 * @return The item corresponding to the native class canonical name (native
	 *         means EMF-generated, i.e. extends EObject).
	 */
	public static final OfficialPNMLFileType getByNativeClassName(
			String nativeclassname) {
		OfficialPNMLFileType result = null;
		OfficialPNMLFileType tempo;
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			tempo = VALUES_ARRAY[i];
			if (tempo.getNativeClassName().equals(nativeclassname)) {
				result = tempo;
				break;
			}
		}
		return result;
	}

	/**
	 * @return the type name
	 */
	public final String getTypeName() {
		return typeName;
	}

	/**
	 * @return the high-level API class canonical name corresponding to this PN
	 *         type
	 */
	public final String getClassName() {
		return className;
	}

	/**
	 * @return the native class canonical name corresponding to this PN type
	 *         (native means EMF-generated, i.e. extends EObject)
	 */
	public final String getNativeClassName() {
		return nativeClassName;
	}

	/**
	 * @return the namespace
	 */
	public final String getNamespace() {
		return namespace;
	}

	/**
	 * @return the rng file Url
	 */
	public final String getRngUrl() {
		return rngUrl;
	}

	/**
	 * @return the name of the fall back class
	 */
	public final String getFallBackClassName() {
		return fallbackclass;
	}

}
