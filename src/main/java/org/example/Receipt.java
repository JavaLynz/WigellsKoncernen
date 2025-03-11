package org.example;

import org.example.clothes.Garment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Receipt {
    private Order order;
    private int id;
    private String name;
    LocalDate date = LocalDate.now();
    Garment itemOrdered;
    int moms;



    public Receipt(Order order) {
        this.order = order;
    }

    public void print(){
        itemOrdered = order.getItemsOrdered().get(0);
        moms = (int)(itemOrdered.getPrice() * 0.25);

        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
        System.out.println("************************* -- Wigell Koncernen -- ******************************");
        System.out.println("************************ -- Org.nr:776070-8978 -- *****************************");
        System.out.println("************************** -- A6, Box 230 34 -- *******************************");
        System.out.println("***************************** -- JÖNKÖPING -- *********************************");
        System.out.println("************************ -- Telefon: 036-785510 -- ****************************");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("  Säljare:34538                                     "+ date.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                                                               ");
        System.out.println("Plagg beställt: " + itemOrdered.toString());
        System.out.println("Pris: "  + itemOrdered.getPrice() + "Kr");
        System.out.println("                                                                               ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                                           TOTAL: " + itemOrdered.getPrice() + "Kr");
        System.out.println("                                                           VARAV MOMS: " + moms + "Kr");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                                                               ");
        System.out.println(" ÖPPET KÖP - BYTESRÄTT 30 DAGAR FRÅN KÖPTILLFÄLLET MOT UPPVISANDE AV KVITTO.   ");
        System.out.println("                              VÄLKOMMEN ÅTER!                                  ");
        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
