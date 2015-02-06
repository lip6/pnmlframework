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
 * This interface gives methods for accessing PNML file Type.
 *
 * @author ggiffo
 *
 */
public interface PNMLFileRepository {
    /**
     *
     * @param namespace
     *            the namespace
     * @return null if a corresponding pnmlfiletype has not been found.
     */
    PNMLFileType getByNamespace(String namespace);

    /**
     *
     * @param classname
     *            the canonical class name
     * @return null if a corresponding pnmlfiletype has not been found.
     */
    PNMLFileType getByClassName(String classname);
}
