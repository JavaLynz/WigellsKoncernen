package org.example.initialManufacturing;

import org.example.clothes.*;

public class PantsBuilder extends GarmentBuilder {
    Pants pants = new Pants();


    @Override
    public PantsBuilder chooseSize(GarmentSize size) {
        pants.setSize(size);
        return this;
    }

    @Override
    public PantsBuilder chooseMaterial(GarmentMaterial material) {
        pants.setMaterial(material);
        return this;
    }

    @Override
    public PantsBuilder chooseColor(GarmentColor color) {
        pants.setColor(color);
        return this;
    }

    @Override
    public Pants build() {
        return pants;
    }
}
