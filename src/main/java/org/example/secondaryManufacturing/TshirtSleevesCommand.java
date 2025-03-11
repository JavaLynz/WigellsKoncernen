package org.example.secondaryManufacturing;

import org.example.clothes.Garment;
import org.example.clothes.TShirt;

public class TshirtSleevesCommand implements ManufacturingCommand{

    private TShirt tShirtIn;
    private TshirtSleeves sleeves;

    public TshirtSleevesCommand(TshirtSleeves sleeves) {
        this.sleeves = sleeves;
    }

    @Override
    public Garment garmentManufacturingProcess(Garment garmentIn) {

        System.out.println("TShirt has been sewn with requested sleeve type: " + sleeves);
        tShirtIn = (TShirt) garmentIn;
        tShirtIn.setSleeves(sleeves);


        return tShirtIn;
    }
}
