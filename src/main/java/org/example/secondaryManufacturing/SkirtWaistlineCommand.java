package org.example.secondaryManufacturing;

import org.example.clothes.Garment;
import org.example.clothes.Skirt;
import org.example.clothes.TShirt;

public class SkirtWaistlineCommand implements ManufacturingCommand{
    private SkirtWaistline waistline;
    private Skirt skirtIn;

    public SkirtWaistlineCommand(SkirtWaistline waistline) {
        this.waistline = waistline;
    }


    @Override
    public Garment garmentManufacturingProcess(Garment garmentIn) {

        System.out.println("Skirt has been sewn with requested waistline: " + waistline);
        skirtIn = (Skirt) garmentIn;
        skirtIn.setWaistline(waistline);


        return skirtIn;
    }
}
