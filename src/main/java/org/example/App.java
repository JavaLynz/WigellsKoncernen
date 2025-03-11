package org.example;

public class App 
{
    public static void main( String[] args ) {


        ManufacturingMethods methods = new ManufacturingMethods();
        CustomerOrder customerOrder = new CustomerOrder(methods);


        System.out.println( "Hej och välkommen till Wigells Koncernen!" );

        methods.newCustomer();

        customerOrder.customerOrder();




    }
}
