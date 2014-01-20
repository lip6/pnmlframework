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
package fr.lip6.move.pnml.framework.utils.exception;

/**
 * @author ggiffo
 * 
 */
public class AssociatedPluginNotFound extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -839249291726364728L;

    /**
     * 
     */
    public AssociatedPluginNotFound() {
        super();
    }

    /**
     * @param arg0 .
     */
    public AssociatedPluginNotFound(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0 .
     */
    public AssociatedPluginNotFound(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0 .
     * @param arg1 .
     */
    public AssociatedPluginNotFound(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}
