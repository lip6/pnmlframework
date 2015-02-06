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
package fr.lip6.move.pnml.framework.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;

import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.logging.LogMaster;

/**
 * This class is used at pnml file import for linking object through idRef.
 * 
 * @author Guillaume Giffo
 * 
 */
public class IdRefLinker {

    /**
     * the list of objects and unsolved idRef arrays.
     */
    private final Map<Object, String[]> idRefElements; // NOPMD by ggiffo on
    // 6/12/08 4:18 PM

    /**
     * 
     */
    private final Logger log; // NOPMD by ggiffo on 6/12/08 4:18 PM

    /**
     * the default constructor.
     */
    public IdRefLinker() {
        log = LogMaster.getLogger("IdrefLinker");
        idRefElements = new HashMap<Object, String[]>();
    }

    /**
     * Each object with one or more id ref will register itself and the
     * referenced ids. Those ids will come in an order given by the code
     * generation.
     * 
     * @param object
     *            the object
     * @param ids
     *            all idref to solve
     */
    public final void addIdRef(Object object, String[] ids) {
        idRefElements.put(object, ids);
    }

    /**
     * This method must be called after completing lists additions. This
     * algorithm is short but not so simple.
     * 
     * For each Object with reference(s) to solve
     * <ul>
     * <li>Get those idref</li>
     * <li>For each, retrives Objects registered with the id</li>
     * <li>Call on the object the method idRefHang(ArrayList&lt;Object$gt;)</li>
     * </ul>
     * This method will call all "idref" setters for the object.
     * 
     * @throws VoidRepositoryException
     *             if the repository is not correctly set
     * @throws InvalidIDException
     *             if an id is not found.
     * @see fr.lip6.move.pnml.framework.utils.IdRepository
     */
    public final void linkAll() throws VoidRepositoryException,
            InvalidIDException {
        log.info(String.valueOf(idRefElements.keySet().size()));
        log.info(ModelRepository.getInstance().getCurrentIdRepository().getAllId().toString());
        for (Object object : idRefElements.keySet()) {
            final Object type = (Object) object;
            final ArrayList<Object> lobj = new ArrayList<Object>(); // NOPMD by
            // ggiffo on
            // 6/24/08
            // 1:21 PM
            /*
             * get idref to solve for this object
             */
            final String[] idref = idRefElements.get(type);

            /*
             * get the matching object for each idref to solve and create a list
             * of them
             */
            for (int i = 0; i < idref.length; i++) {
                lobj.add(ModelRepository.getInstance().getCurrentIdRepository()
                        .getObject(idref[i]));
            }
            Method method;

            try {
                /*
                 * give this list to the final "hanger"
                 */
                method = type.getClass().getMethod("idRefHang",
                        new Class[] { lobj.getClass() }); // NOPMD by ggiffo
                // on 6/24/08 1:21
                // PM
                method.invoke(type, lobj);
            } catch (NoSuchMethodException e) {
                log.error("no idRefHang on :" + type.getClass().toString(), e);
            } catch (IllegalArgumentException e) {
                log.error("Error: ", e);
            } catch (IllegalAccessException e) {
                log.error("Error: ", e);
            } catch (InvocationTargetException e) {
                log.error("Error: ", e);
            }

        }

    }

    /**
     * Clears the object contents.
     */
    public final void reset() {
        idRefElements.clear();
    }

    /**
     * 
     * @return the size of the idref list
     */
    public final int idRefElementsSize() {
        return idRefElements.size();
    }

}
