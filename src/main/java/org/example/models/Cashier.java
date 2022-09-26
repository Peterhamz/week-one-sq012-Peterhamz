package org.example.models;

import org.example.enums.Gender;

public class Cashier extends Staff{


    public Cashier() {
    }

    public Cashier(int id) {
        super(id);
    }

    public Cashier(int id, String firstName, String lastName, String phoneNumber, String address, Gender gender) {
        super(id, firstName, lastName, phoneNumber, address, gender);
    }

    @Override
    public String toString() {
        return "Cashier{}" + super.toString();
    }
}
