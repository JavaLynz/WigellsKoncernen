package org.example.secondaryManufacturing;

import org.example.clothes.Garment;
import org.example.clothes.Pants;

public class PantsFitCommand implements ManufacturingCommand {

    private PantsFit fit;
    private Pants pantsIn;

    public PantsFitCommand(PantsFit fit) {
        this.fit = fit;

    }

    public PantsFit getFit() {
        return fit;
    }

    public void setFit(PantsFit fit) {
        this.fit = fit;
    }

    @Override
    public Garment garmentManufacturingProcess(Garment garmentIn) {

        System.out.println("Pants have been sewn to requested fit: " + fit);
        pantsIn = (Pants) garmentIn;
        pantsIn.setFit(fit);


        return pantsIn;
    }
}
