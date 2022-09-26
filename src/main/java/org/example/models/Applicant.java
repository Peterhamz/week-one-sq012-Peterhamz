package org.example.models;

import org.example.enums.Gender;

public class Applicant extends Person{

    private String isExperienced;

    public Applicant() {
    }

    public String getIsExperienced() {
        return isExperienced;
    }

    public void setIsExperienced(String isExperienced) {
        this.isExperienced = isExperienced;
    }

    public Applicant(String isExperienced) {
        this.isExperienced = isExperienced;
    }

    public Applicant(String firstName, String lastName, String phoneNumber, Address address, Gender gender, String isExperienced) {
        super(firstName, lastName, phoneNumber, String.valueOf(address), gender);
        this.isExperienced = isExperienced;
    }

    public Applicant(Address addresses, String isExperienced) {
        super(addresses);
        this.isExperienced = isExperienced;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "isExperienced='" + isExperienced + '\'' +
                '}' + super.toString();
    }
}
