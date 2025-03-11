package org.example.clothes;

import org.example.initialManufacturing.GarmentColor;
import org.example.initialManufacturing.GarmentMaterial;
import org.example.initialManufacturing.GarmentSize;

public abstract class Garment {
    protected int id;
    protected String name;
    protected GarmentSize size;
    protected GarmentColor color;
    protected GarmentMaterial material;
    protected int price;

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

    public GarmentSize getSize() {
        return size;
    }

    public void setSize(GarmentSize size) {
        this.size = size;
    }

    public GarmentColor getColor() {
        return color;
    }

    public void setColor(GarmentColor color) {
        this.color = color;
    }

    public GarmentMaterial getMaterial() {
        return material;
    }

    public void setMaterial(GarmentMaterial material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
