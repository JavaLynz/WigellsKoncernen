package org.example;

import org.example.clothes.Pants;
import org.example.clothes.Skirt;
import org.example.clothes.TShirt;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomerOrderTest {

    CustomerOrder customerOrder;
    ManufacturingMethods mockedMethods = mock(ManufacturingMethods.class);



    @BeforeEach
    void setUp(){
    customerOrder = new CustomerOrder(mockedMethods);
    }

    private void setInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }


    @Test
    void testCustomerOrdersPants() {
        setInput("1\n");
        Pants mockedPants = mock(Pants.class);

        when(mockedMethods.manufacturePants()).thenReturn(mockedPants);

        customerOrder.customerOrder();

        verify(mockedMethods).manufacturePants();
        assertEquals(mockedPants,mockedMethods.manufacturePants());
        verify(mockedMethods).orderComplete(mockedPants);
        verify(mockedMethods).printReceipt();
    }

    @Test
    void testCustomerOrdersTShirt(){
        setInput("2\n");
        TShirt mockedTShirt = mock(TShirt.class);

        when(mockedMethods.manufactureTShirt()).thenReturn(mockedTShirt);


        customerOrder.customerOrder();

        verify(mockedMethods).manufactureTShirt();
        assertEquals(mockedTShirt,mockedMethods.manufactureTShirt());
        verify(mockedMethods).orderComplete(mockedTShirt);
        verify(mockedMethods).printReceipt();

    }

    @Test
    void testCustomerOrdersSkirt(){
        setInput("3\n");
        Skirt mockedSkirt = mock(Skirt.class);

        when(mockedMethods.manufactureSkirt()).thenReturn(mockedSkirt);

        customerOrder.customerOrder();

        verify(mockedMethods).manufactureSkirt();
        assertEquals(mockedSkirt,mockedMethods.manufactureSkirt());
        verify(mockedMethods).orderComplete(mockedSkirt);
        verify(mockedMethods).printReceipt();

    }

    @Test
    public void testCustomerOrderInvalidInputType() {
        setInput("abc\n1\n");

        Pants mockedPants = mock(Pants.class);
        when(mockedMethods.manufacturePants()).thenReturn(mockedPants);

        customerOrder.customerOrder();

        verify(mockedMethods).manufacturePants();
        verify(mockedMethods).orderComplete(mockedPants);
        verify(mockedMethods).printReceipt();
    }

    @Test
    public void testCustomerOrderInvalidChoice() {
        setInput("4\n1\n");

        Pants mockedPants = mock(Pants.class);
        when(mockedMethods.manufacturePants()).thenReturn(mockedPants);

        customerOrder.customerOrder();

        verify(mockedMethods).manufacturePants();
        verify(mockedMethods).orderComplete(mockedPants);
        verify(mockedMethods).printReceipt();
    }
}