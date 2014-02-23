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
    
    private final int INDENT_WIDTH = 2;

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
     * @return the value
     */
    public String getValue() {
        return getType();
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.setType(value);
    }

    /**
     * @return the properties
     */
    public List<DfmProperty> getProperties() {
        return properties;
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
    
    private String indent(int howMany) {
        if ( howMany > 0 )
            return String.format("%1$" + howMany + "s", " ");
        else
            return "";
    }
    
    
    private String toString(int indentationSize) {
        StringBuilder sb = new StringBuilder();
        int indentNoOfChars = indentationSize * INDENT_WIDTH;
        int childrenIndentNoOfChars = indentNoOfChars + INDENT_WIDTH;
        
        sb.append(indent(indentNoOfChars))
                .append("object ")
                .append(getName())
                .append(": ")
                .append(getType())
                .append("\n");
        for (int i=0; i < properties.size(); i++) {
            sb.append(indent(childrenIndentNoOfChars))
                    .append(properties.get(i))
                    .append("\n");
        }
        for (int i=0; i < children.size(); i++) {
            
            sb.append(children.get(i).toString(indentationSize+1))
                    .append("\n");
        }
        sb.append(indent(indentNoOfChars))
                .append("end");
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return toString(0);
    }

}
