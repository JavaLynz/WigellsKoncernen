package org.example;

import org.example.clothes.Pants;
import org.example.clothes.Skirt;
import org.example.clothes.TShirt;

import java.util.Scanner;

public class CustomerOrder {
    ManufacturingMethods methods;


    public CustomerOrder(ManufacturingMethods methods) {
        this.methods = methods;
    }

    public void customerOrder() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 1 || choice > 3) {

            System.out.println("Vilken plagg ska du beställa: 1 - Pants, 2 - T Shirt, 3 - Skirt. Ange nummer av ditt val.");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice <1 || choice > 3) {
                    System.out.println("Felaktigt val. Vänligen ange ett nummer mellan 1 och 3");
                }
            } else {
                System.out.println("Felaktig inmatning. Vänligen ange ett heltal mellan 1 och 3");
                scanner.next();
            }


            switch (choice) {
                case 1:

                    Pants pants = methods.manufacturePants();
                    methods.orderComplete(pants);
                    methods.printReceipt();

                    break;
                case 2:

                    TShirt tShirt = methods.manufactureTShirt();
                    methods.orderComplete(tShirt);
                    methods.printReceipt();

                    break;
                case 3:

                    Skirt skirt = methods.manufactureSkirt();
                    methods.orderComplete(skirt);
                    methods.printReceipt();

            }
        }
    }
}
