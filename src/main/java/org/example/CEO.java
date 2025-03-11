package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CEO implements PropertyChangeListener {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public CEO(){}



    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if("orderOpened".equals(evt.getPropertyName())){
            System.out.println("(FROM OBSERVER) Till CEO: En ny beställning har kommit in: plagg tillverkas");
        }
        if ("orderCompleted".equals(evt.getPropertyName())){
            System.out.println("(FROM OBSERVER) Till CEO: plagg klar");
        }

    }
}
