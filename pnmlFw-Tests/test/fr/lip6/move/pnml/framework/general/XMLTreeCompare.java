package fr.lip6.move.pnml.framework.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.slf4j.Logger;

import fr.lip6.move.pnml.framework.utils.logging.LogMaster;

public class XMLTreeCompare {

    private Logger logos;

    // used to avoid case when two pairs of values give the same results when
    // concatenated : like 123 456 and 12 3456 which give
    public static String separator = "<>";

    public XMLTreeCompare() {
        logos = LogMaster.getLogger("XML tree Comparison");
    }

    @SuppressWarnings("rawtypes")
	public int hashTree(OMElement elem) {

        StringBuffer sb = new StringBuffer();
        HashMap<String, String> alist = new HashMap<String, String>();
        HashMap<Integer, OMElement> olist = new HashMap<Integer, OMElement>();
        List<String> orderedAttList;
        List<Integer> orderedObjectList;

        // textual elements
        sb.append(elem.getLocalName());
        sb.append(elem.getText().trim());

        // attributes
        for (Iterator iterator = elem.getAllAttributes(); iterator.hasNext();) {
            OMAttribute type = (OMAttribute) iterator.next();
            alist.put(type.getLocalName(), type.getAttributeValue());
        }

        orderedAttList = new ArrayList<String>(alist.keySet());
        Collections.sort(orderedAttList);

        for (Iterator iterator = orderedAttList.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            sb.append(string);
            sb.append(separator);
            sb.append(alist.get(string));
            sb.append(separator);
        }

        // now childs
        for (Iterator iterator = elem.getChildElements(); iterator.hasNext();) {
            OMElement type = (OMElement) iterator.next();
            olist.put(hashTree(type), type);
        }

        orderedObjectList = new ArrayList<Integer>(olist.keySet());
        Collections.sort(orderedObjectList);

        for (Iterator iterator = orderedObjectList.iterator(); iterator
                .hasNext();) {
            Integer integer = (Integer) iterator.next();
            sb.append(integer);
            sb.append(separator);
        }

        if (logos.isDebugEnabled())
            logos.debug(sb.toString());

        return sb.toString().hashCode();
    }
}
