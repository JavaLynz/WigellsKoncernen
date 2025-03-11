package org.example.clothes;

import org.example.initialManufacturing.GarmentColor;
import org.example.initialManufacturing.GarmentMaterial;
import org.example.initialManufacturing.GarmentSize;
import org.example.secondaryManufacturing.SkirtPattern;
import org.example.secondaryManufacturing.SkirtWaistline;

public class Skirt extends Garment{

    private SkirtWaistline waistline;
    private SkirtPattern pattern;
    private int price = 350;

    public Skirt() {}

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

    public SkirtWaistline getWaistline() {
        return waistline;
    }

    public void setWaistline(SkirtWaistline waistline) {
        this.waistline = waistline;
    }

    public SkirtPattern getPattern() {
        return pattern;
    }

    public void setPattern(SkirtPattern pattern) {
        this.pattern = pattern;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Skirt: Size= " + size + ", Material= " + material + ", Color= " + color + ", Waistline= " + waistline + ", Pattern= " + pattern;
    }
}
