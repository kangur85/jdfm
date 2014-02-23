/*
 * The MIT License
 *
 * Copyright 2013 Krzysztof Kaszkowiak.
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
import java.util.List;

/**
 *
 * @author Krzysztof
 */
public class DfmObject {
    
    private String name;
    private String type;
    private ArrayList<DfmProperty> properties;
    private ArrayList<DfmObject> children;

    public ArrayList<DfmProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<DfmProperty> properties) {
        this.properties = properties;
    }

    public DfmObject() {
        properties = new ArrayList();
        children = new ArrayList();
    }
    
    public DfmObject(String name, String value) {
        properties = new ArrayList();
        children = new ArrayList();
        this.name = name;
        this.type = value;
    }
    
    public void addProperty(DfmProperty property) {
        properties.add(property);
    }
    
    public void addChild(DfmObject object) {
        children.add(object);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the children
     */
    public ArrayList<DfmObject> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(ArrayList<DfmObject> children) {
        this.children = children;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("object ");

        sb.append(getName())
                .append(": ")
                .append(getType())
                .append("\n");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(TextUtils.indent(properties.get(i).toString(), true))
              .append("\n");
        }
        
        for (int i = 0; i < children.size(); i++) {
            sb.append(TextUtils.indent(children.get(i).toString(), true))
              .append("\n");
        }
        
        sb.append("end");
        
        return sb.toString();
    }
}
