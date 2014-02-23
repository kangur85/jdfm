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

public class DfmItem {
    private ArrayList<DfmProperty> properties = new ArrayList();
    
    public void addProperty(DfmProperty property) {
        properties.add(property);
    }

    /**
     * @return the properties
     */
    public ArrayList<DfmProperty> getProperties() {
        return properties;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(ArrayList<DfmProperty> properties) {
        this.properties = properties;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("item\n");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(TextUtils.indent(properties.get(i).toString(), true));
            if (i < properties.size()-1) {
                sb.append("\n");
            }
        }
        sb.append("\nend");
        return sb.toString();
    }
}
