/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.kaszkowiak.jdfm.model;

/**
 *
 * @author Krzysztof
 */
public class DfmProperty {
    private String name;
    private String value;
    
    public DfmProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }
    
    public DfmProperty() {}

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
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        if (this.value == null) 
            this.value = value;
        else
            this.value = this.value + value;
    }
    
    @Override
    public String toString() {
        return getName() + " = " + getValue();
    }
}
