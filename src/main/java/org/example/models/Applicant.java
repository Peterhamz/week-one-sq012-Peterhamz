package org.example.models;

import org.example.enums.Gender;

public class Applicant extends Person{
    public Applicant() {

    }

    public Applicant(String firstName, String lastName, String phoneNumber, String address, Gender gender) {
        super(firstName, lastName, phoneNumber, address, gender);
    }

    @Override
    public String toString() {
        return "Applicant{}" + super.toString();
    }
}
