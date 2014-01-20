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
/**
 *
 */
package fr.lip6.move.pnml.framework.general;

/**
 * This interface gives needed elements for a File type descriptor.
 *
 * @author ggiffo
 *
 */
public interface PNMLFileType {

    /**
     * @return the library type name
     */
    String getTypeName();

    /**
     * @return the className
     */
    String getClassName();

    /**
     * @return the namespace
     */
    String getNamespace();

    /**
     * @return the rng file Url
     */
    String getRngUrl();

    /**
     *
     * @return the classname of the fall back class, null if no FB class
     */
    String getFallBackClassName();
}