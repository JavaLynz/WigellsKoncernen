package org.example.secondaryManufacturing;

import org.example.clothes.Garment;
import org.example.clothes.Pants;
import org.example.clothes.TShirt;

public class TshirtNeckCommand implements ManufacturingCommand{

    private TShirt tShirtIn;
    private TshirtNeck neck;

    public TshirtNeckCommand(TshirtNeck neck) {
        this.neck = neck;
    }
    @Override
    public Garment garmentManufacturingProcess(Garment garmentIn) {

        System.out.println("TShirt has been sewn with requested neck type: " + neck);
        tShirtIn = (TShirt) garmentIn;
        tShirtIn.setNeck(neck);


        return tShirtIn;

    }


}
