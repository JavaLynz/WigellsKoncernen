package org.example.clothes;

import org.example.initialManufacturing.GarmentColor;
import org.example.initialManufacturing.GarmentMaterial;
import org.example.initialManufacturing.GarmentSize;
import org.example.secondaryManufacturing.TshirtNeck;
import org.example.secondaryManufacturing.TshirtSleeves;

public class TShirt extends Garment {
    private TshirtSleeves sleeves;
    private TshirtNeck neck;
    private int price = 300;

    public TShirt() {}

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

    public TshirtSleeves getSleeves() {
        return sleeves;
    }

    public void setSleeves(TshirtSleeves sleeves) {
        this.sleeves = sleeves;
    }

    public TshirtNeck getNeck() {
        return neck;
    }

    public void setNeck(TshirtNeck neck) {
        this.neck = neck;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "TShirt: Size= " + size + ", Material= " + material + ", Color= " + color + ", Sleeves= " + sleeves + ", Neck= " + neck;
    }
}
