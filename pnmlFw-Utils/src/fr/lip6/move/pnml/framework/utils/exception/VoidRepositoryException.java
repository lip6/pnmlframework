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
package fr.lip6.move.pnml.framework.utils.exception;

/**
 * @author ggiffo
 * 
 */
public class VoidRepositoryException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 2239038361797650247L;

    /**
     * 
     */
    public VoidRepositoryException() {
        super();
    }

    /**
     * @param arg0 .
     */
    public VoidRepositoryException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0 .
     */
    public VoidRepositoryException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0 .
     * @param arg1 .
     */
    public VoidRepositoryException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}
