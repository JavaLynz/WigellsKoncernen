package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String mail;


    public Customer(){}

    public void customerSetDetails(ArrayList<Customer> customers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange ditt namn: ");
        this.name = scanner.nextLine();
        System.out.println("Ange ditt adress: ");
        this.address = scanner.nextLine();
        System.out.println("Ange ditt mail: ");
        while (true) {
            System.out.println("Ange ditt mail: ");
            String inputEmail = scanner.nextLine();

            // Check if email contains '@' character
            if (inputEmail.contains("@")) {
                this.mail = inputEmail;  // Set the valid email
                break;  // Exit the loop once the email is valid
            } else {
                System.out.println("Fel format, måste innehåll @. Försök igen.");
            }
        }
        this.id = customers.size() + 1;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", mail=" + mail + "]";
    }
}
