package org.example.clothes;

import org.example.initialManufacturing.GarmentColor;
import org.example.initialManufacturing.GarmentMaterial;
import org.example.initialManufacturing.GarmentSize;
import org.example.secondaryManufacturing.PantsFit;
import org.example.secondaryManufacturing.PantsLength;

public class Pants extends Garment{
    private PantsFit fit;
    private PantsLength length;
    private int price = 500;


    public Pants(){}


    public void setId(int id){
        this.id = id;
    }

    public String name(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public GarmentSize getSize(){
        return size;
    }

    public void setSize(GarmentSize size){
        this.size = size;
    }

    public GarmentColor getColor(){
        return color;
    }

    public void setColor(GarmentColor color){
        this.color = color;
    }

    public GarmentMaterial getMaterial(){
        return material;
    }

    public void setMaterial(GarmentMaterial material){
        this.material = material;
    }

    public PantsFit getFit() {
        return fit;
    }

    public void setFit(PantsFit fit) {
        this.fit = fit;
    }

    public PantsLength getLength() {
        return length;
    }

    public void setLength(PantsLength length) {
        this.length = length;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pants: Size= " + size + ", Material= " + material + ", Color= " + color + ", Fit= " + fit + ", Length= " + length;
    }
}
