package org.example;

import org.example.clothes.Garment;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String orderName;
    private List<Garment> itemsOrdered;
    private PropertyChangeSupport propertyChangeSupport;
    private boolean orderCompleted;
    private boolean orderOpened;

    public Order() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        itemsOrdered = new ArrayList<>();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void setOrderCompleted(boolean orderCompleted) {
        boolean oldOrderCompleted = this.orderCompleted;
        this.orderCompleted = orderCompleted;
        this.propertyChangeSupport.firePropertyChange("orderCompleted", oldOrderCompleted, orderCompleted);
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }

    public void setOrderOpened(boolean orderOpened) {
        boolean oldOrderOpened = this.orderOpened;
        this.orderOpened = orderOpened;
        this.propertyChangeSupport.firePropertyChange("orderOpened", oldOrderOpened, orderOpened);
    }

    public boolean isOrderOpened() {
        return orderOpened;
    }

    public void addItem(Garment garment) {
        itemsOrdered.add(garment);
    }

    public List<Garment> getItemsOrdered(){
        return itemsOrdered;
    }

    public void setItemsOrdered(List<Garment> itemsOrdered){
        this.itemsOrdered = itemsOrdered;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
