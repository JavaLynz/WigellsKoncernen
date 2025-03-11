package org.example.initialManufacturing;

import org.example.clothes.*;

public class SkirtBuilder extends GarmentBuilder {

    Skirt skirt = new Skirt();


    @Override
    public SkirtBuilder chooseSize(GarmentSize size) {
        skirt.setSize(size);
        return this;
    }

    @Override
    public SkirtBuilder chooseMaterial(GarmentMaterial material) {
        skirt.setMaterial(material);
        return this;
    }

    @Override
    public SkirtBuilder chooseColor(GarmentColor color) {
        skirt.setColor(color);
        return this;
    }

    @Override
    public Skirt build() {
        return skirt;
    }


}
