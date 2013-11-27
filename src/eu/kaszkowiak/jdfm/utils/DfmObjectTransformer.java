/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.kaszkowiak.jdfm.utils;

import eu.kaszkowiak.jdfm.model.DfmObject;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Krzysztof
 */
public class DfmObjectTransformer {
    
    public static ArrayList<DfmObject> dfmObjectToArrayList(DfmObject obj) {
        ArrayList<DfmObject> res = new ArrayList();
        Iterator<DfmObject> it = obj.getChildren().iterator();
        while ( it.hasNext() ) {
            res.addAll(dfmObjectToArrayList(it.next()));
        }
        return res;
    }
}
