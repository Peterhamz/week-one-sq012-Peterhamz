package org.example.models;


import org.example.enums.Gender;

public class Manager extends Staff{


    public Manager() {
    }

    public Manager(int id) {
        super(id);
    }

    public Manager(int id, String firstName, String lastName, String phoneNumber, String address, Gender gender) {
        super(id, firstName, lastName, phoneNumber, address, gender);
    }

    @Override
    public String toString() {
        return "Manager{}" + super.toString();
    }

}
