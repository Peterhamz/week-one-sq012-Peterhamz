package org.example.models;

import org.example.enums.Gender;

public class Staff extends Person {

private int id;

    public Staff() {
    }

    public Staff(int id) {
        this.id = id;
    }



    public Staff(int id, String firstName, String lastName, String phoneNumber, String address, Gender gender) {
        super(firstName, lastName, phoneNumber, address, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id + '\'' +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                '}';

    }
}
