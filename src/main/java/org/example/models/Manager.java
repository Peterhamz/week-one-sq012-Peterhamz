package org.example.models;


import org.example.enums.Gender;
import org.example.interfaces.HeirCashierInterface;

public class Manager extends Staff implements HeirCashierInterface {


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

    @Override
    public String hierCashier(Applicant applicant) {
        if (applicant.getGender() == Gender.FEMALE && applicant.getIsExperienced().equals("TRUE")) {

            return "Hello " + applicant.getLastName() + ", " + "You have been successfully employed for the position of a Cashier. Welcome onboard!";

        } else
            System.out.println("Hello "  + applicant.getLastName() + ", " + "we are sorry to inform you that you didn't " +
                    "meet the criteria for this position. Please try again later.");


        return "Hello "  + applicant.getLastName() + ", " + "we are sorry to inform you that you didn't " +
                "meet the criteria for this position. Please try again later.";
    }

}
