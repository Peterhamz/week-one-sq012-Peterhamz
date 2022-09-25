package org.example.models;

public class Customer extends Person{
    public Customer() {

    }

    public Customer(String firstName, String lastName, String phoneNumber, String address, String gender) {
        super(firstName, lastName, phoneNumber, address, gender);
    }
}
