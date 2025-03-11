package org.example.initialManufacturing;

import org.example.clothes.Garment;

public abstract class GarmentBuilder {
    protected Garment garment;

    public void createNewGarment(){
        garment = new Garment(){};
    }

    public Garment getGarment(){
        return garment;
    }

    public abstract GarmentBuilder chooseSize(GarmentSize size);
    public abstract GarmentBuilder chooseMaterial(GarmentMaterial material);
    public abstract GarmentBuilder chooseColor(GarmentColor color);
    public abstract Garment build();
}
