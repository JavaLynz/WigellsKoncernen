package org.example.initialManufacturing;

import org.example.clothes.*;

public class TShirtBuilder extends GarmentBuilder {

    TShirt tshirt = new TShirt();


    @Override
    public TShirtBuilder chooseSize(GarmentSize size) {
        tshirt.setSize(size);
        return this;
    }

    @Override
    public TShirtBuilder chooseMaterial(GarmentMaterial material) {
        tshirt.setMaterial(material);
        return this;
    }

    @Override
    public TShirtBuilder chooseColor(GarmentColor color) {
        tshirt.setColor(color);
        return this;
    }

    @Override
    public TShirt build() {
        return tshirt;
    }

}
