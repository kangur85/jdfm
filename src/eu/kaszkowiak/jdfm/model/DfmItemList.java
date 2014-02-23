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
import java.util.ArrayList;

/**
 *
 * @author Krzysztof
 */
public class DfmItemList {
    
    ArrayList<DfmItem> items = new ArrayList();

    public ArrayList<DfmItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<DfmItem> items) {
        this.items = items;
    }
    
    public void add(DfmItem item) {
        items.add(item);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        
        for (int i=0; i < items.size(); i++) {
            if (i == 0) {
                sb.append("\n");
            }
            sb.append(TextUtils.indent(items.get(i).toString(), true));
            if (i < items.size()-1) {
                sb.append("\n");
            }
        }
        sb.append(">");
        return sb.toString();
    }
    
}
