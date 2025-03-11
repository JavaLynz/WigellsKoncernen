package org.example.secondaryManufacturing;

import org.example.clothes.Garment;

import java.util.ArrayList;
import java.util.List;

public class GarmentProcessor {

    private List<ManufacturingCommand> pipeline = new ArrayList<>();

    public void addCommand(ManufacturingCommand command) {
        pipeline.add(command);
    }

    public Garment execute(Garment garmentIn) {
        Garment garmentOut = garmentIn;
        for (ManufacturingCommand command : pipeline) {
            command.garmentManufacturingProcess(garmentOut);
        }
        return garmentOut;
    }
}

