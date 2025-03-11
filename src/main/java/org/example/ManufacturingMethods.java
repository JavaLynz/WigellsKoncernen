package org.example;

import org.example.clothes.Garment;
import org.example.clothes.Pants;
import org.example.clothes.Skirt;
import org.example.clothes.TShirt;
import org.example.initialManufacturing.*;
import org.example.secondaryManufacturing.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ManufacturingMethods {

    private final GarmentProcessor garmentProcessor = new GarmentProcessor();
    Order order;
    Receipt receipt;
    Customer customer;
    ArrayList<Customer> customers = new ArrayList<>();
    CEO ceo = new CEO();

    public void newCustomer() {
        customer = new Customer();
        customer.customerSetDetails(customers);
        customers.add(customer);
        order = new Order();
        order.addPropertyChangeListener(ceo);
        String orderName = customer.getName() + "sOrder";
        order.setOrderName(orderName);
    }

    public GarmentSize setGarmentSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket storlek behöver du?");
        System.out.println("Tryck 1 för S, 2 för M och 3 för L");
        int sizechoice = scanner.nextInt();
        GarmentSize size;
        switch (sizechoice) {
            case 1:
                size = GarmentSize.small;
                System.out.println("Du har beställt en small plagg");
                break;
            case 2:
                size = GarmentSize.medium;
                System.out.println("Du har beställt en medium plagg");
                break;
            case 3:
                size = GarmentSize.large;
                System.out.println("Du har beställt en large plagg");
                break;
            default:
                throw new IllegalArgumentException("Storlek måste vara 1, 2 eller 3");
        }
        return size;
    }

    public GarmentMaterial setGarmentMaterial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket tygg vill du ha?");
        System.out.println("Tryck 1 för cotton, 2 för wool och 3 för denim");
        int materialchoice = scanner.nextInt();
        GarmentMaterial material;
        switch (materialchoice) {
            case 1:
                material = GarmentMaterial.cotton;
                System.out.println("Du har beställt en plagg av cotton");
                break;
            case 2:
                material = GarmentMaterial.wool;
                System.out.println("Du har beställt en plagg av wool");
                break;
            case 3:
                material = GarmentMaterial.denim;
                System.out.println("Du har beställt en plagg av denim");
                break;
            default:
                throw new IllegalArgumentException("Tygg val måste vara 1, 2 eller 3");
        }
        return material;
    }

    public GarmentColor setGarmentColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket farg vill du ha?");
        System.out.println("Tryck 1 för green, 2 för black och 3 för blue");
        int colorchoice = scanner.nextInt();
        GarmentColor color;
        switch (colorchoice) {
            case 1:
                color = GarmentColor.green;
                System.out.println("Du har beställt en grön plagg");
                break;
            case 2:
                color = GarmentColor.black;
                System.out.println("Du har beställt en svart plagg");
                break;
            case 3:
                color = GarmentColor.blue;
                System.out.println("Du har beställt en blå plagg");
                break;
            default:
                throw new IllegalArgumentException("Farg val måste vara 1, 2 eller 3");
        }
        return color;
    }

    public PantsFit setPantsFit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket slags fit vill du ha?");
        System.out.println("Tryck 1 för standard, 2 för slim");
        int fitchoice = scanner.nextInt();
        PantsFit fit;
        switch (fitchoice) {
            case 1:
                fit = PantsFit.Standard;
                System.out.println("Du har beställt standard fit pants");
                break;
            case 2:
                fit = PantsFit.Slim;
                System.out.println("Du har beställt slim fit pants");
                break;
            default:
                throw new IllegalArgumentException("Fit val måste vara 1 eller 2");
        }
        return fit;
    }

    public PantsLength setPantsLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket slags length vill du ha?");
        System.out.println("Tryck 1 för standard, 2 för tall");
        int lengthchoice = scanner.nextInt();
        PantsLength length;
        switch (lengthchoice) {
            case 1:
                length = PantsLength.standard;
                System.out.println("Du har beställt standard length pants");
                break;
            case 2:
                length = PantsLength.tall;
                System.out.println("Du har beställt tall length pants");
                break;
            default:
                throw new IllegalArgumentException("Length val måste vara 1 eller 2");
        }
        return length;
    }

    public TshirtNeck setTshirtNeck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket slags neck vill du ha?");
        System.out.println("Tryck 1 för v-neck, 2 för crew neck");
        int neckchoice = scanner.nextInt();
        TshirtNeck neck;
        switch (neckchoice) {
            case 1:
                neck = TshirtNeck.v;
                System.out.println("Du har beställt en v-neck t shirt");
                break;
            case 2:
                neck = TshirtNeck.crew;
                System.out.println("Du har beställt en crew-neck t shirt");
                break;
            default:
                throw new IllegalArgumentException("Din val måste vara 1 eller 2");
        }
        return neck;
    }

    public TshirtSleeves setTshirtSleeves() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket slags sleeves vill du ha?");
        System.out.println("Tryck 1 för long-sleeves, 2 för short-sleeves");
        int sleevechoice = scanner.nextInt();
        TshirtSleeves sleeves;
        switch (sleevechoice) {
            case 1:
                sleeves = TshirtSleeves.longsleeve;
                System.out.println("Du har beställt en long-sleeved t shirt");
                break;
            case 2:
                sleeves = TshirtSleeves.shortsleeve;
                System.out.println("Du har beställt en short-sleeved t shirt");
                break;
            default:
                throw new IllegalArgumentException("Din val måste vara 1 eller 2");
        }
        return sleeves;
    }

    public SkirtWaistline setSkirtWaistline() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket slags waistline vill du ha?");
        System.out.println("Tryck 1 för regular, 2 för elastic");
        int waistlineChoice = scanner.nextInt();
        SkirtWaistline waistline;
        switch (waistlineChoice) {
            case 1:
                waistline = SkirtWaistline.regular;
                System.out.println("Du har beställt en regular waistline");
                break;
            case 2:
                waistline = SkirtWaistline.elastic;
                System.out.println("Du har beställt en regular waistline");
                break;
            default:
                throw new IllegalArgumentException("Din val måste vara 1 eller 2");
        }
        return waistline;
    }

    public SkirtPattern setSkirtPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket slags pattern vill du ha?");
        System.out.println("Tryck 1 för pencil, 2 för A-Line");
        int patternChoice = scanner.nextInt();
        SkirtPattern pattern;
        switch (patternChoice) {
            case 1:
                pattern = SkirtPattern.Pencil;
                System.out.println("Du har beställt en Pencil Skirt Pattern");
                break;
            case 2:
                pattern = SkirtPattern.ALine;
                System.out.println("Du har beställt en A-Line Pattern Skirt");
                break;
            default:
                throw new IllegalArgumentException("Din val måste vara 1 eller 2");
        }
        return pattern;
    }

    public Pants manufacturePants() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        order.setOrderOpened(true);
        GarmentSize pantsSize = this.setGarmentSize();
        GarmentMaterial pantsMaterial = this.setGarmentMaterial();
        GarmentColor pantsColor = this.setGarmentColor();
        Pants pants = pantsBuilder
                .chooseSize(pantsSize)
                .chooseMaterial(pantsMaterial)
                .chooseColor(pantsColor)
                .build();
        PantsFit fit = this.setPantsFit();
        PantsLength length = this.setPantsLength();
        garmentProcessor.addCommand(new PantsFitCommand(fit));
        garmentProcessor.addCommand(new PantsLengthCommand(length));
        garmentProcessor.execute(pants);
        System.out.println("Confirming pants have been ordered and manufactured to these specifications: " + pants.toString());
        return pants;
    }

    public TShirt manufactureTShirt() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        order.setOrderOpened(true);
        GarmentSize tShirtSize = this.setGarmentSize();
        GarmentMaterial tShirtMaterial = this.setGarmentMaterial();
        GarmentColor tShirtColor = this.setGarmentColor();
        TShirt tShirt = tShirtBuilder
                .chooseSize(tShirtSize)
                .chooseMaterial(tShirtMaterial)
                .chooseColor(tShirtColor)
                .build();
        TshirtNeck neck = this.setTshirtNeck();
        TshirtSleeves sleeves = this.setTshirtSleeves();
        garmentProcessor.addCommand(new TshirtNeckCommand(neck));
        garmentProcessor.addCommand(new TshirtSleevesCommand(sleeves));
        garmentProcessor.execute(tShirt);
        System.out.println("Confirming t-shirt has been ordered and manufactured to these specifications: " + tShirt.toString());
        return tShirt;
    }

    public Skirt manufactureSkirt() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        order.setOrderOpened(true);
        GarmentSize skirtSize = this.setGarmentSize();
        GarmentMaterial skirtMaterial = this.setGarmentMaterial();
        GarmentColor skirtColor = this.setGarmentColor();
        Skirt skirt = skirtBuilder
                .chooseSize(skirtSize)
                .chooseMaterial(skirtMaterial)
                .chooseColor(skirtColor)
                .build();
        SkirtWaistline waistline = this.setSkirtWaistline();
        SkirtPattern pattern = this.setSkirtPattern();
        garmentProcessor.addCommand(new SkirtWaistlineCommand(waistline));
        garmentProcessor.addCommand(new SkirtPatternCommand(pattern));
        garmentProcessor.execute(skirt);
        System.out.println("Confirming skirt has been ordered and manufactured to these specifications: " + skirt.toString());
        return skirt;
    }

    public void orderComplete(Garment garmentOrdered) {
        order.setOrderCompleted(true);
        order.addItem(garmentOrdered);
    }

    public void printReceipt() {
        System.out.println("Tack att du handlade hos Wigell Koncernen.");
        System.out.println("Ditt kvitto kommer: ");
        receipt = new Receipt(order);
        receipt.print();
    }

}
