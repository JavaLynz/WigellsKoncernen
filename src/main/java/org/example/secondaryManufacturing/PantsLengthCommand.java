package org.example.secondaryManufacturing;

import org.example.clothes.Garment;
import org.example.clothes.Pants;

public class PantsLengthCommand implements ManufacturingCommand{

    PantsLength length;


    public PantsLengthCommand(PantsLength length) {
        this.length = length;
    }

    public PantsLength getLength() {
        return length;
    }

    public void setLength(PantsLength length) {
        this.length = length;
    }

    @Override
    public Garment garmentManufacturingProcess(Garment garmentIn) {

        System.out.println("Pants have been sewn to requested length: " + length);
        ((Pants) garmentIn).setLength(length);
        return garmentIn;
    }
}
