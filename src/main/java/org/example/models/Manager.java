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
    public boolean hierCashier(Applicant applicant) {
        if (applicant.getGender() == Gender.FEMALE && applicant.getIsExperienced().equals("TRUE")) {

            System.out.println("Hello " +applicant.getFirstName() + ", ");

            System.out.print("You have been successfully employed for the position of a Cashier. Welcome onboard!");
        }
            else {
            System.out.println("Hello "  + applicant.getFirstName() + ", " + "we are sorry to inform you that you didn't " +
                    "meet the criteria for this position. Please try again later.");
        }

        return false;
    }
}
