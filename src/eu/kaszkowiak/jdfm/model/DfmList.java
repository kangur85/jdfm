/*
 * The MIT License
 *
 * Copyright 2014 Krzysztof Kaszkowiak.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package eu.kaszkowiak.jdfm.model;

import eu.kaszkowiak.jdfm.utils.TextUtils;
import java.util.LinkedList;

/**
 *
 * @author Krzysztof
 */
public class DfmList {
   private LinkedList<String> elems = new LinkedList();

    public LinkedList<String> getElems() {
        return elems;
    }

    public void setElems(LinkedList<String> elems) {
        this.elems = elems;
    }
   
   public void addElem(String elem) {
       elems.add(elem);
   }
   
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder("(\n");
       for (int i = 0; i < elems.size(); i++) {
           sb.append(TextUtils.indent(elems.get(i), true));
           if (i < elems.size()-1) {
               sb.append("\n");
           }
       }
       sb.append(")");
       return sb.toString();
   }
}
