package org.example.secondaryManufacturing;

import org.example.clothes.Garment;
import org.example.clothes.Skirt;
import org.example.clothes.TShirt;

public class SkirtPatternCommand implements ManufacturingCommand{

    private SkirtPattern pattern;
    private Skirt skirtIn;

    public SkirtPatternCommand(SkirtPattern pattern) {
        this.pattern = pattern;
    }


    @Override
    public Garment garmentManufacturingProcess(Garment garmentIn) {

        System.out.println("Skirt has been sewn to requested pattern: " + pattern);
        skirtIn = (Skirt) garmentIn;
        skirtIn.setPattern(pattern);


        return skirtIn;
    }
}
